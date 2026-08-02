package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.tools.CastUtils;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry {
    public static final String TYPE = "ovc1";
    private byte[] vc1Content;

    public Ovc1VisualSampleEntryImpl() {
        super(TYPE);
        this.vc1Content = new byte[0];
    }

    public byte[] getVc1Content() {
        return this.vc1Content;
    }

    public void setVc1Content(byte[] bArr) {
        this.vc1Content = bArr;
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(j));
        readableByteChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        byte[] bArr = new byte[allocate.remaining()];
        this.vc1Content = bArr;
        allocate.get(bArr);
    }

    @Override // org.mp4parser.boxes.sampleentry.AbstractSampleEntry, org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writableByteChannel.write(ByteBuffer.wrap(this.vc1Content));
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        int i = 16;
        if (!this.largeBox && this.vc1Content.length + 16 < 4294967296L) {
            i = 8;
        }
        return i + this.vc1Content.length + 8;
    }
}
