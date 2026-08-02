package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public v(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        if (iArr.length != jArr2.length) {
            ilg.c();
            throw null;
        }
        if (jArr.length != jArr2.length) {
            ilg.c();
            throw null;
        }
        if (iArr2.length != jArr2.length) {
            ilg.c();
            throw null;
        }
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = jArr.length;
    }
}
