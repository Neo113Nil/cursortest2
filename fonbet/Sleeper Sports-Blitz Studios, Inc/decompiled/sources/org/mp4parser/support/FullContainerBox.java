package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import org.mp4parser.Box;
import org.mp4parser.BoxParser;
import org.mp4parser.FullBox;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {
    private static Logger LOG = LoggerFactory.getLogger((Class<?>) FullContainerBox.class);
    private int flags;
    private int version;

    public FullContainerBox(String str) {
        super(str);
    }

    @Override // org.mp4parser.FullBox
    public int getVersion() {
        return this.version;
    }

    @Override // org.mp4parser.FullBox
    public void setVersion(int i) {
        this.version = i;
    }

    @Override // org.mp4parser.FullBox
    public int getFlags() {
        return this.flags;
    }

    @Override // org.mp4parser.FullBox
    public void setFlags(int i) {
        this.flags = i;
    }

    @Override // org.mp4parser.BasicContainer, org.mp4parser.Container
    public <T extends Box> List<T> getBoxes(Class<T> cls) {
        return getBoxes(cls, false);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        readableByteChannel.read(allocate);
        parseVersionAndFlags((ByteBuffer) allocate.rewind());
        super.parse(readableByteChannel, byteBuffer, j, boxParser);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // org.mp4parser.BasicContainer
    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "[childBoxes]";
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

    @Override // org.mp4parser.support.AbstractContainerBox
    protected ByteBuffer getHeader() {
        ByteBuffer wrap;
        if (this.largeBox || getSize() >= 4294967296L) {
            byte[] bArr = new byte[20];
            bArr[3] = 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            IsoTypeWriter.writeUInt64(wrap, getSize());
            writeVersionAndFlags(wrap);
        } else {
            byte[] bArr2 = new byte[12];
            bArr2[4] = this.type.getBytes()[0];
            bArr2[5] = this.type.getBytes()[1];
            bArr2[6] = this.type.getBytes()[2];
            bArr2[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr2);
            IsoTypeWriter.writeUInt32(wrap, getSize());
            wrap.position(8);
            writeVersionAndFlags(wrap);
        }
        wrap.rewind();
        return wrap;
    }
}
