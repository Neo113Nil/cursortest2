package com.ironsource;

import xsna.zcl;

/* loaded from: classes13.dex */
public final class Wc {
    private final long a;
    private final H3 b;

    public Wc(long j, H3 h3) {
        this.a = j;
        this.b = h3;
    }

    public final long a() {
        return this.a;
    }

    public final H3 b() {
        return this.b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.a + " unit=" + this.b + ")";
    }

    public /* synthetic */ Wc(long j, H3 h3, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? H3.Second : h3);
    }
}
