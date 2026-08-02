package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import defpackage.ot8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3910yd extends ot8 implements Function2 {
    public C3910yd(Ad ad) {
        super(2, 0, Ad.class, ad, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3870x c3870x = (C3870x) obj;
        InMobiJsonResponse inMobiJsonResponse = (InMobiJsonResponse) obj2;
        c3870x.getClass();
        inMobiJsonResponse.getClass();
        Ad ad = (Ad) this.receiver;
        C3906y9 c3906y9 = ad.e;
        if (c3906y9 != null) {
            c3906y9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        ad.r.a(new C3573ld(c3870x, inMobiJsonResponse, ad.p, ad.q, ad.r), ad);
        return Unit.a;
    }
}
