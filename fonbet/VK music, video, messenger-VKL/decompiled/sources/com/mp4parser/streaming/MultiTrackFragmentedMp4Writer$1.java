package com.mp4parser.streaming;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import xsna.j640;
import xsna.jpm0;

/* loaded from: classes14.dex */
class MultiTrackFragmentedMp4Writer$1 extends WriteOnlyBox {
    final /* synthetic */ j640 this$0;
    private final /* synthetic */ jpm0 val$streamingTrack;

    public MultiTrackFragmentedMp4Writer$1(j640 j640Var, String str, jpm0 jpm0Var) {
        super(str);
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        new ArrayList();
        throw null;
    }

    @Override // com.mp4parser.streaming.WriteOnlyBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        throw null;
    }
}
