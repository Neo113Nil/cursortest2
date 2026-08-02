package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.IsoFile;
import org.mp4parser.ParsableBox;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public abstract class AbstractBox implements ParsableBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Logger LOG = LoggerFactory.getLogger((Class<?>) AbstractBox.class);
    protected ByteBuffer content;
    private ByteBuffer deadBytes = null;
    boolean isParsed = true;
    protected String type;
    private byte[] userType;

    protected abstract void _parseDetails(ByteBuffer byteBuffer);

    protected abstract void getContent(ByteBuffer byteBuffer);

    protected abstract long getContentSize();

    protected AbstractBox(String str) {
        this.type = str;
    }

    protected AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
    }

    @Override // org.mp4parser.ParsableBox
    @DoNotParseDetail
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        this.content = ByteBuffer.allocate(CastUtils.l2i(j));
        while (true) {
            if (this.content.position() >= j) {
                break;
            } else if (readableByteChannel.read(this.content) == -1) {
                LOG.error("{} might have been truncated by file end. bytesRead={} contentSize={}", this, Integer.valueOf(this.content.position()), Long.valueOf(j));
                break;
            }
        }
        this.content.position(0);
        this.isParsed = false;
    }

    @Override // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        if (this.isParsed) {
            ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(getSize()));
            getHeader(allocate);
            getContent(allocate);
            ByteBuffer byteBuffer = this.deadBytes;
            if (byteBuffer != null) {
                byteBuffer.rewind();
                while (this.deadBytes.remaining() > 0) {
                    allocate.put(this.deadBytes);
                }
            }
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            return;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
        getHeader(allocate2);
        writableByteChannel.write((ByteBuffer) allocate2.rewind());
        writableByteChannel.write((ByteBuffer) this.content.position(0));
    }

    public final synchronized void parseDetails() {
        LOG.debug("parsing details of {}", getType());
        ByteBuffer byteBuffer = this.content;
        if (byteBuffer != null) {
            this.isParsed = true;
            byteBuffer.rewind();
            _parseDetails(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.deadBytes = byteBuffer.slice();
            }
            this.content = null;
        }
    }

    @Override // org.mp4parser.Box
    public long getSize() {
        long contentSize = this.isParsed ? getContentSize() : this.content.limit();
        return contentSize + (contentSize >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(getType()) ? 16 : 0) + (this.deadBytes != null ? r2.limit() : 0);
    }

    @Override // org.mp4parser.Box
    @DoNotParseDetail
    public String getType() {
        return this.type;
    }

    @DoNotParseDetail
    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    private boolean verify(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(getContentSize() + (this.deadBytes != null ? r2.limit() : 0)));
        getContent(allocate);
        ByteBuffer byteBuffer2 = this.deadBytes;
        if (byteBuffer2 != null) {
            byteBuffer2.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        allocate.rewind();
        if (byteBuffer.remaining() != allocate.remaining()) {
            LOG.error("{}: remaining differs {}  vs. {}", getType(), Integer.valueOf(byteBuffer.remaining()), Integer.valueOf(allocate.remaining()));
            return false;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 1;
        int limit2 = allocate.limit() - 1;
        while (limit >= position) {
            byte b = byteBuffer.get(limit);
            byte b2 = allocate.get(limit2);
            if (b != b2) {
                LOG.error("{}: buffers differ at {}: {}/{}", getType(), Integer.valueOf(limit), Byte.valueOf(b), Byte.valueOf(b2));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[allocate.remaining()];
                byteBuffer.get(bArr);
                allocate.get(bArr2);
                LOG.error("original      : {}", Hex.encodeHex(bArr, 4));
                LOG.error("reconstructed : {}", Hex.encodeHex(bArr2, 4));
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    private boolean isSmallBox() {
        int i = "uuid".equals(getType()) ? 24 : 8;
        if (!this.isParsed) {
            return ((long) (this.content.limit() + i)) < 4294967296L;
        }
        long contentSize = getContentSize();
        ByteBuffer byteBuffer = this.deadBytes;
        return (contentSize + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            IsoTypeWriter.writeUInt32(byteBuffer, getSize());
            byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, 1L);
            byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
            IsoTypeWriter.writeUInt64(byteBuffer, getSize());
        }
        if ("uuid".equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }
}
