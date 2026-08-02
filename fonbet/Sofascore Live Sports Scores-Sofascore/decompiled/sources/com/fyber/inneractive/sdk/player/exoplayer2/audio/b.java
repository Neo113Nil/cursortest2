package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(int i, int i2, int i3) {
        super(r4.toString());
        StringBuilder s = lnb.s(i, i2, "Unhandled format: ", " Hz, ", " channels in encoding ");
        s.append(i3);
    }
}
