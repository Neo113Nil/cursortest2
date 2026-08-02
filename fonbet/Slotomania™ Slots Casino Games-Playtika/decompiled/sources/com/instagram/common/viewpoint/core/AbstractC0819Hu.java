package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0819Hu {
    public final InterfaceC0802Hd A00;

    public abstract boolean A0B(C05024v c05024v) throws C3K;

    public abstract boolean A0C(C05024v c05024v, long j) throws C3K;

    public AbstractC0819Hu(InterfaceC0802Hd interfaceC0802Hd) {
        this.A00 = interfaceC0802Hd;
    }

    public final boolean A00(C05024v c05024v, long j) throws C3K {
        return A0B(c05024v) && A0C(c05024v, j);
    }
}
