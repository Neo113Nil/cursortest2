package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C0965Nm A07;
    public final C1695gi A08;
    public C0953Na A01 = C0953Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C1695gi c1695gi, NY ny, C0965Nm c0965Nm) {
        this.A08 = c1695gi;
        this.A06 = ny;
        this.A07 = c0965Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C0953Na c0953Na) {
        this.A01 = c0953Na;
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

    public final C1518dq A0F() {
        return new C1518dq(this, null);
    }
}
