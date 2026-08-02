package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0744Ew {
    public InterfaceC0743Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C0745Ex A0b(InterfaceC05747p[] interfaceC05747pArr, C2085nW c2085nW, C2103no c2103no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC04793y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC0743Ev interfaceC0743Ev, F6 f6) {
        this.A00 = interfaceC0743Ev;
        this.A01 = f6;
    }
}
