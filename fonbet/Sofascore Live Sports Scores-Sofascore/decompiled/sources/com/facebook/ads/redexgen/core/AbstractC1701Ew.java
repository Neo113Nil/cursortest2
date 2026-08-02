package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1701Ew {
    public InterfaceC1700Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C1702Ex A0b(InterfaceC15317p[] interfaceC15317pArr, C3042nW c3042nW, C3060no c3060no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC14363y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC1700Ev interfaceC1700Ev, F6 f6) {
        this.A00 = interfaceC1700Ev;
        this.A01 = f6;
    }
}
