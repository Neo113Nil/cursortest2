package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.CacheFile;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.yhk;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidCacheAssets$invoke$2$downloadJob$1", f = "AndroidCacheAssets.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidCacheAssets$invoke$2$downloadJob$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset $asset;
    int label;
    final /* synthetic */ AndroidCacheAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheAssets$invoke$2$downloadJob$1(AndroidCacheAssets androidCacheAssets, CampaignMetadataOuterClass.CampaignAsset campaignAsset, AdObject adObject, rq3<? super AndroidCacheAssets$invoke$2$downloadJob$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidCacheAssets;
        this.$asset = campaignAsset;
        this.$adObject = adObject;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidCacheAssets$invoke$2$downloadJob$1(this.this$0, this.$asset, this.$adObject, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidCacheAssets$invoke$2$downloadJob$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        CacheFile cacheFile;
        AndroidCacheAssets$invoke$2$downloadJob$1 androidCacheAssets$invoke$2$downloadJob$1;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            cacheFile = this.this$0.cacheFile;
            String url = this.$asset.getUrl();
            url.getClass();
            AdObject adObject = this.$adObject;
            int priority = this.$asset.getPriority();
            this.label = 1;
            androidCacheAssets$invoke$2$downloadJob$1 = this;
            obj = CacheFile.DefaultImpls.invoke$default(cacheFile, url, adObject, null, priority, 0, null, androidCacheAssets$invoke$2$downloadJob$1, 48, null);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            androidCacheAssets$invoke$2$downloadJob$1 = this;
        }
        if (!(((CacheResult) obj) instanceof CacheResult.Failure)) {
            return Unit.a;
        }
        yhk.w(androidCacheAssets$invoke$2$downloadJob$1.$asset.getUrl(), "Failed To Load Asset: ");
        return null;
    }
}
