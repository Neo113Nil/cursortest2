package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.ot8;
import defpackage.tub;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3936zd extends ot8 implements Function1 {
    public C3936zd(Ad ad) {
        super(1, 0, Ad.class, ad, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short shortValue = ((Number) obj).shortValue();
        Ad ad = (Ad) this.receiver;
        ad.getClass();
        ad.a(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(shortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return Unit.a;
    }
}
