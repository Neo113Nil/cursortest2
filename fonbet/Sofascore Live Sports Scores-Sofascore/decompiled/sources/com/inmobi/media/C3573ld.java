package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3573ld extends W6 {
    public final C3870x f;
    public final InMobiJsonResponse g;
    public final AbstractC3768t1 h;
    public final Uc i;
    public final Nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3573ld(C3870x c3870x, InMobiJsonResponse inMobiJsonResponse, AbstractC3768t1 abstractC3768t1, Uc uc, Nc nc) {
        super(c3870x, abstractC3768t1, uc, nc);
        c3870x.getClass();
        inMobiJsonResponse.getClass();
        abstractC3768t1.getClass();
        uc.getClass();
        nc.getClass();
        this.f = c3870x;
        this.g = inMobiJsonResponse;
        this.h = abstractC3768t1;
        this.i = uc;
        this.j = nc;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        InterfaceC3880x9 l2 = l();
        if (l2 != null) {
            ((C3906y9) l2).a("AUM-FetchedState", "Initialize Called");
        }
        this.c.getClass();
        C3870x c3870x = this.a;
        C3586m0 c3586m0 = c3870x.a.f;
        G g = c3870x.b;
        c3586m0.getClass();
        g.getClass();
        xw3.L(c3586m0.a, null, null, new C3483i0(g, c3586m0, null), 3);
        X4.a(k(), new V6(this, null));
    }
}
