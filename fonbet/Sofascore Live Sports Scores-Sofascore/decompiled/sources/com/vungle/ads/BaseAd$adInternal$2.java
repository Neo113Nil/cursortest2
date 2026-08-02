package com.vungle.ads;

import com.vungle.ads.internal.s;
import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vungle/ads/internal/s;", "invoke", "()Lcom/vungle/ads/internal/s;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class BaseAd$adInternal$2 extends xka implements Function0<s> {
    public final /* synthetic */ BaseAd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAd$adInternal$2(BaseAd baseAd) {
        super(0);
        this.a = baseAd;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final s invoke() {
        BaseAd baseAd = this.a;
        s constructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
        constructAdInternal$vungle_ads_release.m = this.a.getLogEntry();
        return constructAdInternal$vungle_ads_release;
    }
}
