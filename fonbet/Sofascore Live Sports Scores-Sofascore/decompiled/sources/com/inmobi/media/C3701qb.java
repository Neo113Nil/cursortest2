package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3701qb extends AbstractC3666p2 {
    public final short d;
    public final InMobiAdRequestStatus e;
    public final Uc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701qb(short s, InMobiAdRequestStatus inMobiAdRequestStatus, C3665p1 c3665p1, Uc uc, Nc nc) {
        super(null, c3665p1, nc);
        inMobiAdRequestStatus.getClass();
        c3665p1.getClass();
        uc.getClass();
        nc.getClass();
        this.d = s;
        this.e = inMobiAdRequestStatus;
        this.f = uc;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 c = this.b.c();
        if (c != null) {
            short s = this.d;
            ((C3906y9) c).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s) + " " + this.e.getStatusCode() + " " + this.e.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }
        X4.a(this.b.a(), new C3675pb(this, null));
        C3586m0 b = this.b.b();
        xw3.L(b.a, null, null, new C3431g0(b, this.d, null), 3);
        AbstractC3768t1 abstractC3768t1 = this.a;
        if (abstractC3768t1 != null) {
            abstractC3768t1.a();
        }
        j();
    }
}
