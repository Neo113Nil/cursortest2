package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3651od extends Z6 {
    public final C3665p1 o;
    public final AbstractC3768t1 p;
    public final Uc q;
    public final Nc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3651od(C3665p1 c3665p1, AbstractC3768t1 abstractC3768t1, Nc nc, Uc uc) {
        super(c3665p1, abstractC3768t1, nc, uc);
        c3665p1.getClass();
        abstractC3768t1.getClass();
        uc.getClass();
        nc.getClass();
        this.o = c3665p1;
        this.p = abstractC3768t1;
        this.q = uc;
        this.r = nc;
    }

    @Override // com.inmobi.media.Z6
    public final void a(AdResponse adResponse) {
        adResponse.getClass();
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            adResponse.getClass();
            c3906y9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + AbstractC3907ya.a(adResponse, AdResponse.class));
        }
        T0.a(this.o, adResponse, new C3599md(this), new C3625nd(this));
    }
}
