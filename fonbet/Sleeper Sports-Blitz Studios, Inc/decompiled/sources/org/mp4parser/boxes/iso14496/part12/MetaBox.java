package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.RewindableReadableByteChannel;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class MetaBox extends AbstractContainerBox {
    public static final String TYPE = "meta";
    private int flags;
    private boolean quickTimeFormat;
    private int version;

    public MetaBox() {
        super("meta");
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public int getFlags() {
        return this.flags;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    protected final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = IsoTypeReader.readUInt8(byteBuffer);
        this.flags = IsoTypeReader.readUInt24(byteBuffer);
        return 4L;
    }

    protected final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer, this.flags);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        RewindableReadableByteChannel rewindableReadableByteChannel = new RewindableReadableByteChannel(readableByteChannel, 20);
        ByteBuffer allocate = ByteBuffer.allocate(20);
        if (rewindableReadableByteChannel.read(allocate) == 20) {
            allocate.position(4);
            String read4cc = IsoTypeReader.read4cc(allocate);
            allocate.position(16);
            String read4cc2 = IsoTypeReader.read4cc(allocate);
            if (HandlerBox.TYPE.equals(read4cc) && "mdta".equals(read4cc2)) {
                this.quickTimeFormat = true;
            }
        }
        rewindableReadableByteChannel.rewind();
        if (!this.quickTimeFormat) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            rewindableReadableByteChannel.read(allocate2);
            parseVersionAndFlags((ByteBuffer) allocate2.rewind());
        }
        initContainer(rewindableReadableByteChannel, j - (this.quickTimeFormat ? 0 : 4), boxParser);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        if (!this.quickTimeFormat) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            writeVersionAndFlags(allocate);
            writableByteChannel.write((ByteBuffer) allocate.rewind());
        }
        writeContainer(writableByteChannel);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long containerSize = getContainerSize() + (this.quickTimeFormat ? 0 : 4);
        return containerSize + ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8);
    }
}
