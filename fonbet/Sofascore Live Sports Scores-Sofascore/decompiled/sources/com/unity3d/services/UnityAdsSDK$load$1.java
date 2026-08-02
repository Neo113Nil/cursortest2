package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.banners.UnityBannerSize;
import defpackage.a70;
import defpackage.duf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class UnityAdsSDK$load$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ UnityBannerSize $bannerSize;
    final /* synthetic */ joa $context$delegate;
    final /* synthetic */ InternalLoadListener $listener;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ ku3 $loadScope;
    final /* synthetic */ String $placementId;
    int label;
    final /* synthetic */ UnityAdsSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$load$1(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, ku3 ku3Var, joa joaVar, rq3<? super UnityAdsSDK$load$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = unityAdsSDK;
        this.$placementId = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$listener = internalLoadListener;
        this.$bannerSize = unityBannerSize;
        this.$loadScope = ku3Var;
        this.$context$delegate = joaVar;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new UnityAdsSDK$load$1(this.this$0, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((UnityAdsSDK$load$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Context load$lambda$8;
        UnityAdsSDK$load$1 unityAdsSDK$load$1;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) this.this$0.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(LegacyLoadUseCase.class));
            load$lambda$8 = UnityAdsSDK.load$lambda$8(this.$context$delegate);
            String str = this.$placementId;
            UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
            InternalLoadListener internalLoadListener = this.$listener;
            UnityBannerSize unityBannerSize = this.$bannerSize;
            this.label = 1;
            unityAdsSDK$load$1 = this;
            if (legacyLoadUseCase.invoke(load$lambda$8, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, unityAdsSDK$load$1) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            unityAdsSDK$load$1 = this;
        }
        s9a.o(unityAdsSDK$load$1.$loadScope, null);
        return Unit.a;
    }
}
