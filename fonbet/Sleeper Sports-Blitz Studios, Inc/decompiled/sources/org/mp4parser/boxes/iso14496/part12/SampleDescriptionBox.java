package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import org.mp4parser.BoxParser;
import org.mp4parser.FullBox;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class SampleDescriptionBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "stsd";
    private int flags;
    private int version;

    public SampleDescriptionBox() {
        super(TYPE);
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

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        readableByteChannel.read(allocate);
        allocate.rewind();
        this.version = IsoTypeReader.readUInt8(allocate);
        this.flags = IsoTypeReader.readUInt24(allocate);
        initContainer(readableByteChannel, j - 8, boxParser);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt8(allocate, this.version);
        IsoTypeWriter.writeUInt24(allocate, this.flags);
        IsoTypeWriter.writeUInt32(allocate, getBoxes().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public AbstractSampleEntry getSampleEntry() {
        Iterator it = getBoxes(AbstractSampleEntry.class).iterator();
        if (it.hasNext()) {
            return (AbstractSampleEntry) it.next();
        }
        return null;
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long containerSize = getContainerSize();
        return 8 + containerSize + ((this.largeBox || containerSize + 16 >= 4294967296L) ? 16 : 8);
    }
}
