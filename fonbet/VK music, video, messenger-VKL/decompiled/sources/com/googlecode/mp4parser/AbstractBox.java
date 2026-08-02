package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.bq90;
import xsna.etx;
import xsna.ga8;
import xsna.pa8;
import xsna.q100;
import xsna.skd;
import xsna.up2;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes13.dex */
public abstract class AbstractBox implements ga8 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static q100 LOG = q100.a(AbstractBox.class);
    private ByteBuffer content;
    xuk dataSource;
    private ByteBuffer deadBytes = null;
    boolean isParsed = true;
    long offset;
    private yej parent;
    protected String type;
    private byte[] userType;

    public AbstractBox(String str) {
        this.type = str;
    }

    private void getHeader(ByteBuffer byteBuffer) {
        if (isSmallBox()) {
            byteBuffer.putInt((int) getSize());
            byteBuffer.put(etx.c(getType()));
        } else {
            byteBuffer.putInt((int) 1);
            byteBuffer.put(etx.c(getType()));
            byteBuffer.putLong(getSize());
        }
        if ("uuid".equals(getType())) {
            byteBuffer.put(getUserType());
        }
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

    private boolean verify(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(up2.p(getContentSize() + (this.deadBytes != null ? r2.limit() : 0)));
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
            System.err.print(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + allocate.remaining());
            LOG.c(String.valueOf(getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + allocate.remaining());
            return false;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 1;
        int limit2 = allocate.limit() - 1;
        while (limit >= position) {
            byte b = byteBuffer.get(limit);
            byte b2 = allocate.get(limit2);
            if (b != b2) {
                LOG.c(String.format("%s: buffers differ at %d: %2X/%2X", getType(), Integer.valueOf(limit), Byte.valueOf(b), Byte.valueOf(b2)));
                byte[] bArr = new byte[byteBuffer.remaining()];
                byte[] bArr2 = new byte[allocate.remaining()];
                byteBuffer.get(bArr);
                allocate.get(bArr2);
                System.err.println("original      : ".concat(skd.c(4, bArr)));
                System.err.println("reconstructed : ".concat(skd.c(4, bArr2)));
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    public abstract void _parseDetails(ByteBuffer byteBuffer);

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        if (!this.isParsed) {
            ByteBuffer allocate = ByteBuffer.allocate((isSmallBox() ? 8 : 16) + ("uuid".equals(getType()) ? 16 : 0));
            getHeader(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(up2.p(getSize()));
        getHeader(allocate2);
        getContent(allocate2);
        ByteBuffer byteBuffer = this.deadBytes;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate2.put(this.deadBytes);
            }
        }
        writableByteChannel.write((ByteBuffer) allocate2.rewind());
    }

    public abstract void getContent(ByteBuffer byteBuffer);

    public abstract long getContentSize();

    public long getOffset() {
        return this.offset;
    }

    @Override // xsna.ga8
    public yej getParent() {
        return this.parent;
    }

    public String getPath() {
        return bq90.a(this, "");
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long limit;
        if (this.isParsed) {
            limit = getContentSize();
        } else {
            ByteBuffer byteBuffer = this.content;
            limit = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        return limit + (limit >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(getType()) ? 16 : 0) + (this.deadBytes != null ? r0.limit() : 0);
    }

    @Override // xsna.ga8
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        this.offset = xukVar.position() - byteBuffer.remaining();
        this.dataSource = xukVar;
        this.content = ByteBuffer.allocate(up2.p(j));
        while (this.content.remaining() > 0) {
            xukVar.read(this.content);
        }
        this.content.position(0);
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        try {
            LOG.b("parsing details of " + getType());
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
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.ga8
    public void setParent(yej yejVar) {
        this.parent = yejVar;
    }

    public AbstractBox(String str, byte[] bArr) {
        this.type = str;
        this.userType = bArr;
    }
}
