package com.vungle.ads;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerAd$finishAd$1 extends xka implements Function0<Unit> {
    public final /* synthetic */ BannerAd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$finishAd$1(BannerAd bannerAd) {
        super(0);
        this.a = bannerAd;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m765invoke() {
        BannerView bannerView;
        bannerView = this.a.t;
        if (bannerView != null) {
            bannerView.finishAdInternal(true);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m765invoke();
        return Unit.a;
    }
}
