package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.support.AbstractContainerBox;

/* loaded from: classes10.dex */
public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex;

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public abstract void getBox(WritableByteChannel writableByteChannel) throws IOException;

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.ParsableBox
    public abstract void parse(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, long j, BoxParser boxParser) throws IOException;

    protected AbstractSampleEntry(String str) {
        super(str);
        this.dataReferenceIndex = 1;
    }

    @Override // org.mp4parser.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    @Override // org.mp4parser.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i) {
        this.dataReferenceIndex = i;
    }
}
