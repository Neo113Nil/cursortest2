package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Pd extends AbstractC3856wb {
    public final C3870x f;
    public final AbstractC3768t1 g;
    public final Uc h;
    public final Nc i;
    public final Sc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pd(C3870x c3870x, InMobiJsonResponse inMobiJsonResponse, AbstractC3768t1 abstractC3768t1, Uc uc, Nc nc) {
        super(c3870x, abstractC3768t1, uc, nc);
        c3870x.getClass();
        inMobiJsonResponse.getClass();
        abstractC3768t1.getClass();
        uc.getClass();
        nc.getClass();
        this.f = c3870x;
        this.g = abstractC3768t1;
        this.h = uc;
        this.i = nc;
        this.j = new Sc(new Rc(c3870x, inMobiJsonResponse, nc));
    }

    public final void a(C3678pe c3678pe) {
        c3678pe.getClass();
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + c3678pe);
        }
        this.i.a(new Cd(c3678pe, this.f, this.j, this.g, this.h, this.i), this);
    }
}
