package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.CacheFile;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidCacheAssets.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidCacheAssets$invoke$2$downloadJob$1", f = "AndroidCacheAssets.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidCacheAssets$invoke$2$downloadJob$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset $asset;
    int label;
    final /* synthetic */ AndroidCacheAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheAssets$invoke$2$downloadJob$1(AndroidCacheAssets androidCacheAssets, CampaignMetadataOuterClass.CampaignAsset campaignAsset, AdObject adObject, spj<? super AndroidCacheAssets$invoke$2$downloadJob$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidCacheAssets;
        this.$asset = campaignAsset;
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidCacheAssets$invoke$2$downloadJob$1(this.this$0, this.$asset, this.$adObject, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CacheFile cacheFile;
        AndroidCacheAssets$invoke$2$downloadJob$1 androidCacheAssets$invoke$2$downloadJob$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            cacheFile = this.this$0.cacheFile;
            String url = this.$asset.getUrl();
            AdObject adObject = this.$adObject;
            int priority = this.$asset.getPriority();
            this.label = 1;
            androidCacheAssets$invoke$2$downloadJob$1 = this;
            obj = CacheFile.DefaultImpls.invoke$default(cacheFile, url, adObject, null, priority, 0, null, androidCacheAssets$invoke$2$downloadJob$1, 48, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            androidCacheAssets$invoke$2$downloadJob$1 = this;
        }
        if (!(((CacheResult) obj) instanceof CacheResult.Failure)) {
            return s3q0.a;
        }
        throw new RuntimeException("Failed To Load Asset: " + androidCacheAssets$invoke$2$downloadJob$1.$asset.getUrl());
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidCacheAssets$invoke$2$downloadJob$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
