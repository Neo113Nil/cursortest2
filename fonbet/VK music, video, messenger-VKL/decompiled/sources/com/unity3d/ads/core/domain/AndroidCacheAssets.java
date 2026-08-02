package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.asl;
import xsna.eyx;
import xsna.fto0;
import xsna.hpj;
import xsna.myc0;
import xsna.spj;
import xsna.vhn0;
import xsna.vvj;
import xsna.yvj;
import xsna.zvj;

/* compiled from: AndroidCacheAssets.kt */
/* loaded from: classes14.dex */
public final class AndroidCacheAssets implements CacheAssets {
    private final CacheFile cacheFile;
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidCacheAssets(yvj yvjVar, CacheFile cacheFile, SendDiagnosticEvent sendDiagnosticEvent) {
        this.scope = yvjVar;
        this.cacheFile = cacheFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.unity3d.ads.core.domain.CacheAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(AdObject adObject, List<CampaignMetadataOuterClass.CampaignAsset> list, spj<? super CacheAssetsEvent> spjVar) {
        AndroidCacheAssets$invoke$1 androidCacheAssets$invoke$1;
        int i;
        CacheAssetsEvent.Failure failure;
        try {
            if (spjVar instanceof AndroidCacheAssets$invoke$1) {
                androidCacheAssets$invoke$1 = (AndroidCacheAssets$invoke$1) spjVar;
                int i2 = androidCacheAssets$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidCacheAssets$invoke$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidCacheAssets$invoke$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = androidCacheAssets$invoke$1.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ArrayList arrayList = new ArrayList();
                        hpj a = zvj.a(androidCacheAssets$invoke$1.getContext().plus(new vvj("AssetDownloading")).plus(new vhn0((eyx) this.scope.getCoroutineContext().get(eyx.a.b))));
                        for (CampaignMetadataOuterClass.CampaignAsset campaignAsset : list) {
                            asl b = myc0.b(a, null, null, new AndroidCacheAssets$invoke$2$downloadJob$1(this, campaignAsset, adObject, null), 3);
                            if (campaignAsset.getRequired()) {
                                arrayList.add(b);
                            }
                        }
                        androidCacheAssets$invoke$1.label = 1;
                        if (fto0.e(arrayList, androidCacheAssets$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return CacheAssetsEvent.Success.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return CacheAssetsEvent.Success.INSTANCE;
        } catch (TimeoutCancellationException e) {
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
        androidCacheAssets$invoke$1 = new AndroidCacheAssets$invoke$1(this, spjVar);
        Object obj2 = androidCacheAssets$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidCacheAssets$invoke$1.label;
    }
}
