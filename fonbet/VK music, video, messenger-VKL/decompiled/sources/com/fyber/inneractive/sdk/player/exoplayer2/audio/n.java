package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import xsna.odj;
import xsna.rzl;

/* loaded from: classes12.dex */
public final class n extends Exception {
    public n(int i, int i2, int i3, int i4) {
        super(rzl.a(i3, i4, ", ", ")", odj.a(i, i2, "AudioTrack init failed: ", ", Config(", ", ")));
    }
}
