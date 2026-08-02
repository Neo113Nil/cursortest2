package com.mp4parser.streaming;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import xsna.kwj0;

/* loaded from: classes14.dex */
class SingleTrackFragmentedMp4Writer$1 extends WriteOnlyBox {
    final /* synthetic */ kwj0 this$0;

    public SingleTrackFragmentedMp4Writer$1(kwj0 kwj0Var, String str) {
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
