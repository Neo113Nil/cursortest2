package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0984Of implements Serializable {
    public C0983Oe A00;
    public C0983Oe A01;

    public C0984Of() {
        this(0.5d, 0.5d);
    }

    public C0984Of(double d) {
        this(d, 0.5d);
    }

    public C0984Of(double d, double d2) {
        this.A00 = new C0983Oe(d);
        this.A01 = new C0983Oe(d2);
        A02();
    }

    public final C0983Oe A00() {
        return this.A00;
    }

    public final C0983Oe A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d, double d2) {
        this.A00.A09(d, d2);
    }

    public final void A05(double d, double d2) {
        this.A01.A09(d, d2);
    }
}
