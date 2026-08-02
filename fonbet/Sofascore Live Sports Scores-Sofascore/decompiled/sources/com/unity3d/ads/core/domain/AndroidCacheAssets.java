package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.ad2;
import defpackage.av4;
import defpackage.fc6;
import defpackage.gu3;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.m6k;
import defpackage.qij;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.smi;
import defpackage.uic;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheAssets;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "Lku3;", "scope", "Lcom/unity3d/ads/core/domain/CacheFile;", "cacheFile", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lku3;Lcom/unity3d/ads/core/domain/CacheFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "assets", "Lcom/unity3d/ads/core/domain/CacheAssetsEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/util/List;Lrq3;)Ljava/lang/Object;", "Lku3;", "Lcom/unity3d/ads/core/domain/CacheFile;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidCacheAssets implements CacheAssets {

    @NotNull
    private final CacheFile cacheFile;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidCacheAssets(@NotNull ku3 ku3Var, @NotNull CacheFile cacheFile, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        ku3Var.getClass();
        cacheFile.getClass();
        sendDiagnosticEvent.getClass();
        this.scope = ku3Var;
        this.cacheFile = cacheFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.unity3d.ads.core.domain.CacheAssets
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull AdObject adObject, @NotNull List<CampaignMetadataOuterClass.CampaignAsset> list, @NotNull rq3<? super CacheAssetsEvent> rq3Var) {
        AndroidCacheAssets$invoke$1 androidCacheAssets$invoke$1;
        int i;
        CacheAssetsEvent.Failure failure;
        try {
            if (rq3Var instanceof AndroidCacheAssets$invoke$1) {
                androidCacheAssets$invoke$1 = (AndroidCacheAssets$invoke$1) rq3Var;
                int i2 = androidCacheAssets$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidCacheAssets$invoke$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidCacheAssets$invoke$1.result;
                    lu3 lu3Var = lu3.a;
                    i = androidCacheAssets$invoke$1.label;
                    if (i != 0) {
                        ArrayList u = fc6.u(obj);
                        ad2 c = s9a.c(androidCacheAssets$invoke$1.getContext().plus(new gu3("AssetDownloading")).plus(new smi((yda) this.scope.getCoroutineContext().get(uic.g))));
                        for (CampaignMetadataOuterClass.CampaignAsset campaignAsset : list) {
                            av4 t = xw3.t(c, null, new AndroidCacheAssets$invoke$2$downloadJob$1(this, campaignAsset, adObject, null), 3);
                            if (campaignAsset.getRequired()) {
                                u.add(t);
                            }
                        }
                        androidCacheAssets$invoke$1.label = 1;
                        if (m6k.u(u, androidCacheAssets$invoke$1) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return CacheAssetsEvent.Success.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return CacheAssetsEvent.Success.INSTANCE;
        } catch (qij e) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_webview_less_asset_cache_timeout", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
            String message = e.getMessage();
            failure = new CacheAssetsEvent.Failure(message != null ? message : "");
            return failure;
        } catch (RuntimeException e2) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_webview_less_asset_cache_fail", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
            String message2 = e2.getMessage();
            failure = new CacheAssetsEvent.Failure(message2 != null ? message2 : "");
            return failure;
        }
        androidCacheAssets$invoke$1 = new AndroidCacheAssets$invoke$1(this, rq3Var);
        Object obj2 = androidCacheAssets$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidCacheAssets$invoke$1.label;
    }
}
