package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import xsna.odj;

/* loaded from: classes12.dex */
public final class b extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(int i, int i2, int i3) {
        super(r4.toString());
        StringBuilder a = odj.a(i, i2, "Unhandled format: ", " Hz, ", " channels in encoding ");
        a.append(i3);
    }
}
