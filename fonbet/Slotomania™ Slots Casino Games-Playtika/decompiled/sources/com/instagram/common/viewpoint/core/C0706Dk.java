package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0706Dk extends UN<C4A> {
    public final /* synthetic */ C0705Dj A00;

    public C0706Dk(C0705Dj c0705Dj) {
        this.A00 = c0705Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        C0732Ek c0732Ek;
        C0732Ek c0732Ek2;
        C0732Ek c0732Ek3;
        String A02;
        c0732Ek = this.A00.A00;
        if (c0732Ek == null) {
            return;
        }
        C0705Dj c0705Dj = this.A00;
        C0705Dj c0705Dj2 = this.A00;
        c0732Ek2 = this.A00.A00;
        int duration = c0732Ek2.getDuration();
        c0732Ek3 = this.A00.A00;
        A02 = c0705Dj2.A02(duration - c0732Ek3.getCurrentPositionInMillis());
        c0705Dj.setText(A02);
    }

    @Override // com.instagram.common.viewpoint.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
