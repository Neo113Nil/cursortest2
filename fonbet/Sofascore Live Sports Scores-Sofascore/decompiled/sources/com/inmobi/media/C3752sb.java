package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.xw3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3752sb extends AbstractC3666p2 {
    public final Map d;
    public final InMobiAdRequestStatus e;
    public final Uc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3752sb(Map map, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC3768t1 abstractC3768t1, E8 e8, Uc uc, Nc nc) {
        super(abstractC3768t1, e8, nc);
        map.getClass();
        inMobiAdRequestStatus.getClass();
        e8.getClass();
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
            ((C3906y9) c).b("AUM-LoadFailedState", "Initialize Called " + this.d + " " + this.e.getStatusCode() + " " + this.e.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }
        X4.a(this.b.a(), new C3726rb(this, null));
        C3586m0 b = this.b.b();
        Map map = this.d;
        b.getClass();
        map.getClass();
        xw3.L(b.a, null, null, new C3457h0(b, map, null), 3);
        AbstractC3768t1 abstractC3768t1 = this.a;
        if (abstractC3768t1 != null) {
            abstractC3768t1.a();
        }
        j();
    }
}
