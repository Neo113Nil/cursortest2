package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1663Dk extends UN<C4A> {
    public final /* synthetic */ C1662Dj A00;

    public C1663Dk(C1662Dj c1662Dj) {
        this.A00 = c1662Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        C1689Ek c1689Ek;
        C1689Ek c1689Ek2;
        C1689Ek c1689Ek3;
        String A02;
        c1689Ek = this.A00.A00;
        if (c1689Ek == null) {
            return;
        }
        C1662Dj c1662Dj = this.A00;
        C1662Dj c1662Dj2 = this.A00;
        c1689Ek2 = this.A00.A00;
        int duration = c1689Ek2.getDuration();
        c1689Ek3 = this.A00.A00;
        A02 = c1662Dj2.A02(duration - c1689Ek3.getCurrentPositionInMillis());
        c1662Dj.setText(A02);
    }

    @Override // com.facebook.ads.redexgen.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
