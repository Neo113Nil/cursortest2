package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1922Nm A07;
    public final C2652gi A08;
    public C1910Na A01 = C1910Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C2652gi c2652gi, NY ny, C1922Nm c1922Nm) {
        this.A08 = c2652gi;
        this.A06 = ny;
        this.A07 = c1922Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C1910Na c1910Na) {
        this.A01 = c1910Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C2475dq A0F() {
        return new C2475dq(this, null);
    }
}
