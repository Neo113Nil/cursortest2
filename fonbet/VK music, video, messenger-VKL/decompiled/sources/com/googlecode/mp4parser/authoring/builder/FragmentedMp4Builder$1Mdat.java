package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.mdat.MediaDataBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.etx;
import xsna.ga8;
import xsna.les;
import xsna.pa8;
import xsna.uep0;
import xsna.up2;
import xsna.xuk;
import xsna.yej;

/* loaded from: classes13.dex */
class FragmentedMp4Builder$1Mdat implements ga8 {
    yej parent;
    long size_ = -1;
    final /* synthetic */ les this$0;
    private final /* synthetic */ long val$endSample;
    private final /* synthetic */ long val$startSample;
    private final /* synthetic */ uep0 val$track;

    public FragmentedMp4Builder$1Mdat(les lesVar, long j, long j2, uep0 uep0Var) {
        this.val$startSample = j;
        this.val$endSample = j2;
        this.val$track = uep0Var;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(up2.p(getSize()));
        allocate.put(etx.c(getType()));
        allocate.rewind();
        writableByteChannel.write(allocate);
        throw null;
    }

    public long getOffset() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    @Override // xsna.ga8
    public yej getParent() {
        return this.parent;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long j = this.size_;
        if (j != -1) {
            return j;
        }
        throw null;
    }

    @Override // xsna.ga8
    public String getType() {
        return MediaDataBox.TYPE;
    }

    @Override // xsna.ga8
    public void setParent(yej yejVar) {
        this.parent = yejVar;
    }

    @Override // xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
    }
}
