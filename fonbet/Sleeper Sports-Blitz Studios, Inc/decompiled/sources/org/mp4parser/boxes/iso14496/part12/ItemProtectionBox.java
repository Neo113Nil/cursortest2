package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.FullBox;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class ItemProtectionBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "ipro";
    private int flags;
    private int version;

    public ItemProtectionBox() {
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

    public SchemeInformationBox getItemProtectionScheme() {
        if (getBoxes(SchemeInformationBox.class).isEmpty()) {
            return null;
        }
        return (SchemeInformationBox) getBoxes(SchemeInformationBox.class).get(0);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        readableByteChannel.read(allocate);
        allocate.rewind();
        this.version = IsoTypeReader.readUInt8(allocate);
        this.flags = IsoTypeReader.readUInt24(allocate);
        initContainer(readableByteChannel, j - 6, boxParser);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(6);
        IsoTypeWriter.writeUInt8(allocate, this.version);
        IsoTypeWriter.writeUInt24(allocate, this.flags);
        IsoTypeWriter.writeUInt16(allocate, getBoxes().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        long containerSize = getContainerSize() + 6;
        return containerSize + ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8);
    }
}
