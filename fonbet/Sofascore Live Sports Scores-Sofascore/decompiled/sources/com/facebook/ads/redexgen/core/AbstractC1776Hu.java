package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1776Hu {
    public final InterfaceC1759Hd A00;

    public abstract boolean A0B(C14594v c14594v) throws C3K;

    public abstract boolean A0C(C14594v c14594v, long j) throws C3K;

    public AbstractC1776Hu(InterfaceC1759Hd interfaceC1759Hd) {
        this.A00 = interfaceC1759Hd;
    }

    public final boolean A00(C14594v c14594v, long j) throws C3K {
        return A0B(c14594v) && A0C(c14594v, j);
    }
}
