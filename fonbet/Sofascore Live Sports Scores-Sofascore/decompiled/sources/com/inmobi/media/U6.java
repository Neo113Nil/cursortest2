package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.xw3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class U6 extends AbstractC3666p2 {
    public final Map d;
    public final InMobiAdRequestStatus e;
    public final Uc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(Map map, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC3768t1 abstractC3768t1, C3665p1 c3665p1, Uc uc, Nc nc) {
        super(abstractC3768t1, c3665p1, nc);
        map.getClass();
        inMobiAdRequestStatus.getClass();
        abstractC3768t1.getClass();
        c3665p1.getClass();
        uc.getClass();
        nc.getClass();
        this.d = map;
        this.e = inMobiAdRequestStatus;
        this.f = uc;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 c = this.b.c();
        if (c != null) {
            ((C3906y9) c).b("AUM-FetchFailedState", "Initialized Called : " + this.d + " " + this.e.getStatusCode() + " " + this.e.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }
        X4.a(this.b.a(), new T6(this, null));
        C3586m0 b = this.b.b();
        Map map = this.d;
        b.getClass();
        map.getClass();
        xw3.L(b.a, null, null, new C3508j0(b, map, null), 3);
        AbstractC3768t1 abstractC3768t1 = this.a;
        if (abstractC3768t1 != null) {
            abstractC3768t1.a();
        }
        j();
    }
}
