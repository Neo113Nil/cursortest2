package com.instagram.common.viewpoint.core;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1650fz {
    public C1654g3 A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C1650fz A00(C1654g3 c1654g3) {
        this.A00 = c1654g3;
        return this;
    }

    public final C1650fz A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C1650fz A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C1650fz A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C1650fz A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C1651g0 A05() {
        return new C1651g0(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
