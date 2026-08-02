package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import defpackage.a70;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public e0(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? mz1.i(i, "/") : "";
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        a70.r("generateNewId() must be called before retrieving ids.");
    }
}
