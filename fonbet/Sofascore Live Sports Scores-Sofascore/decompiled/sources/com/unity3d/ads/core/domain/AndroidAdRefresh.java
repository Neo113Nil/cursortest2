package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import defpackage.a70;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.b98;
import defpackage.be5;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gu3;
import defpackage.i3c;
import defpackage.il4;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.v98;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.y6a;
import defpackage.z88;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh;", "Lcom/unity3d/ads/core/domain/AdRefresh;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/CacheAssets;", "cacheAssets", "Lcom/unity3d/ads/core/domain/Refresh;", ToolBar.REFRESH, "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/CacheAssets;Lcom/unity3d/ads/core/domain/Refresh;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "performRefresh", "(Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "", "canUpdateRefreshData", "(Lcom/unity3d/ads/core/data/model/AdObjectState;)Z", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "Lcom/unity3d/ads/core/domain/Refresh;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAdRefresh implements AdRefresh {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<AdObjectState> NON_UPDATABLE_STATES = ph0.a0(new AdObjectState[]{AdObjectState.SHOWING, AdObjectState.COMPLETED, AdObjectState.EXPIRED});

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheAssets cacheAssets;

    @NotNull
    private final Refresh refresh;

    public AndroidAdRefresh(@NotNull AdRepository adRepository, @NotNull CacheAssets cacheAssets, @NotNull Refresh refresh) {
        adRepository.getClass();
        cacheAssets.getClass();
        refresh.getClass();
        this.adRepository = adRepository;
        this.cacheAssets = cacheAssets;
        this.refresh = refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUpdateRefreshData(AdObjectState state) {
        return !NON_UPDATABLE_STATES.contains(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performRefresh(ByteString byteString, rq3<? super Unit> rq3Var) {
        AndroidAdRefresh$performRefresh$1 androidAdRefresh$performRefresh$1;
        int i;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        AdResponseOuterClass.AdResponse adResponse;
        ByteString adDataRefreshToken;
        AdObject adObject;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        AdObject adObject2;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData3;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse2;
        AdObject adObject3;
        if (rq3Var instanceof AndroidAdRefresh$performRefresh$1) {
            androidAdRefresh$performRefresh$1 = (AndroidAdRefresh$performRefresh$1) rq3Var;
            int i2 = androidAdRefresh$performRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidAdRefresh$performRefresh$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidAdRefresh$performRefresh$1.result;
                lu3 lu3Var = lu3.a;
                i = androidAdRefresh$performRefresh$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    AdObject ad = this.adRepository.getAd(byteString);
                    if (ad == null) {
                        i3c.i(byteString, "No adObject for opportunityId: ");
                        return null;
                    }
                    webViewLessLoadingRequiredData = ad.getWebViewLessLoadingRequiredData();
                    if (webViewLessLoadingRequiredData == null || (adResponse = webViewLessLoadingRequiredData.getAdResponse()) == null) {
                        return Unit.a;
                    }
                    adDataRefreshToken = adResponse.getAdDataRefreshToken();
                    if (adDataRefreshToken == null) {
                        return Unit.a;
                    }
                    if (adDataRefreshToken.isEmpty()) {
                        return Unit.a;
                    }
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(adResponse.getCampaignMetadata().getAdDataRefreshDelayMs(), be5.MILLISECONDS);
                    androidAdRefresh$performRefresh$1.L$0 = byteString;
                    androidAdRefresh$performRefresh$1.L$1 = ad;
                    androidAdRefresh$performRefresh$1.L$2 = webViewLessLoadingRequiredData;
                    androidAdRefresh$performRefresh$1.L$3 = adDataRefreshToken;
                    androidAdRefresh$performRefresh$1.label = 1;
                    if (n4o.z(R, androidAdRefresh$performRefresh$1) != lu3Var) {
                        adObject = ad;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        webViewLessLoadingRequiredData2 = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$1;
                        adObject2 = (AdObject) androidAdRefresh$performRefresh$1.L$0;
                        y6a.M(obj);
                        adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                        if (!adDataRefreshResponse.hasError()) {
                            webViewLessLoadingRequiredData2.setAdRefreshState(adDataRefreshResponse.getError().getErrorCode() == ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL ? AdRefreshState.REUSE_NO_FILL : AdRefreshState.REUSE_ERROR);
                            return Unit.a;
                        }
                        if (!adDataRefreshResponse.hasCampaignMetadata() || adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList().isEmpty()) {
                            webViewLessLoadingRequiredData2.setAdRefreshState(AdRefreshState.REUSE_NO_FILL);
                            return Unit.a;
                        }
                        CacheAssets cacheAssets = this.cacheAssets;
                        List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList();
                        assetsToCacheList.getClass();
                        androidAdRefresh$performRefresh$1.L$0 = adObject2;
                        androidAdRefresh$performRefresh$1.L$1 = webViewLessLoadingRequiredData2;
                        androidAdRefresh$performRefresh$1.L$2 = adDataRefreshResponse;
                        androidAdRefresh$performRefresh$1.label = 3;
                        Object invoke = cacheAssets.invoke(adObject2, assetsToCacheList, androidAdRefresh$performRefresh$1);
                        if (invoke != lu3Var) {
                            webViewLessLoadingRequiredData3 = webViewLessLoadingRequiredData2;
                            adDataRefreshResponse2 = adDataRefreshResponse;
                            obj = invoke;
                            adObject3 = adObject2;
                            if (((CacheAssetsEvent) obj) instanceof CacheAssetsEvent.Success) {
                            }
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    adDataRefreshResponse2 = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) androidAdRefresh$performRefresh$1.L$2;
                    webViewLessLoadingRequiredData3 = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$1;
                    adObject3 = (AdObject) androidAdRefresh$performRefresh$1.L$0;
                    y6a.M(obj);
                    if (((CacheAssetsEvent) obj) instanceof CacheAssetsEvent.Success) {
                        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData4 = adObject3.getWebViewLessLoadingRequiredData();
                        if (webViewLessLoadingRequiredData4 != null) {
                            webViewLessLoadingRequiredData4.setAdRefreshState(AdRefreshState.REUSE_ERROR);
                        }
                    } else if (canUpdateRefreshData((AdObjectState) ((fdi) adObject3.getState()).getValue())) {
                        webViewLessLoadingRequiredData3.setAdRefreshState(AdRefreshState.REUSE_RELOADED);
                        ByteString trackingToken = adDataRefreshResponse2.getTrackingToken();
                        trackingToken.getClass();
                        adObject3.setTrackingToken(trackingToken);
                        AdResponseOuterClass.AdResponse adResponse2 = webViewLessLoadingRequiredData3.getAdResponse();
                        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.INSTANCE;
                        AdResponseOuterClass.AdResponse.Builder builder = adResponse2.toBuilder();
                        builder.getClass();
                        AdResponseKt.Dsl _create = companion._create(builder);
                        ByteString adData = adDataRefreshResponse2.getAdData();
                        adData.getClass();
                        _create.setAdData(adData);
                        ByteString adDataRefreshToken2 = adDataRefreshResponse2.getAdDataRefreshToken();
                        adDataRefreshToken2.getClass();
                        _create.setAdDataRefreshToken(adDataRefreshToken2);
                        ByteString trackingToken2 = adDataRefreshResponse2.getTrackingToken();
                        trackingToken2.getClass();
                        _create.setTrackingToken(trackingToken2);
                        CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = adDataRefreshResponse2.getCampaignMetadata();
                        campaignMetadata.getClass();
                        _create.setCampaignMetadata(campaignMetadata);
                        webViewLessLoadingRequiredData3.setAdResponse(_create._build());
                    }
                    return Unit.a;
                }
                ByteString byteString2 = (ByteString) androidAdRefresh$performRefresh$1.L$3;
                webViewLessLoadingRequiredData = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$2;
                adObject = (AdObject) androidAdRefresh$performRefresh$1.L$1;
                ByteString byteString3 = (ByteString) androidAdRefresh$performRefresh$1.L$0;
                y6a.M(obj);
                adDataRefreshToken = byteString2;
                byteString = byteString3;
                if (canUpdateRefreshData((AdObjectState) ((fdi) adObject.getState()).getValue())) {
                    return Unit.a;
                }
                Refresh refresh = this.refresh;
                androidAdRefresh$performRefresh$1.L$0 = adObject;
                androidAdRefresh$performRefresh$1.L$1 = webViewLessLoadingRequiredData;
                androidAdRefresh$performRefresh$1.L$2 = null;
                androidAdRefresh$performRefresh$1.L$3 = null;
                androidAdRefresh$performRefresh$1.label = 2;
                obj = refresh.invoke(byteString, adDataRefreshToken, androidAdRefresh$performRefresh$1);
                if (obj != lu3Var) {
                    webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
                    adObject2 = adObject;
                    adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                    if (!adDataRefreshResponse.hasError()) {
                    }
                }
                return lu3Var;
            }
        }
        androidAdRefresh$performRefresh$1 = new AndroidAdRefresh$performRefresh$1(this, rq3Var);
        Object obj2 = androidAdRefresh$performRefresh$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidAdRefresh$performRefresh$1.label;
        if (i != 0) {
        }
        if (canUpdateRefreshData((AdObjectState) ((fdi) adObject.getState()).getValue())) {
        }
    }

    @Override // com.unity3d.ads.core.domain.AdRefresh
    @Nullable
    public Object invoke(@NotNull AdObject adObject, @NotNull rq3<? super Unit> rq3Var) {
        ad2 c = s9a.c(adObject.getAdScope().getCoroutineContext().plus(new gu3("Ad_Refresh")));
        final b1d broadcastEventChannel = AdPlayer.INSTANCE.getBroadcastEventChannel();
        final String str = "AD_REFRESH";
        fcp.m0(new v98(new z88() { // from class: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;
                final /* synthetic */ String receiver$inlined;

                @il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2", f = "AndroidAdRefresh.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(rq3 rq3Var) {
                        super(rq3Var);
                    }

                    @Override // defpackage.h21
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(b98 b98Var, String str) {
                    this.$this_unsafeFlow = b98Var;
                    this.receiver$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.b98
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, rq3 rq3Var) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (rq3Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) rq3Var;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            lu3 lu3Var = lu3.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                y6a.M(obj2);
                                b98 b98Var = this.$this_unsafeFlow;
                                if (this.receiver$inlined.equals(obj)) {
                                    anonymousClass1.label = 1;
                                    if (b98Var.emit(obj, anonymousClass1) == lu3Var) {
                                        return lu3Var;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(rq3Var);
                    Object obj22 = anonymousClass1.result;
                    lu3 lu3Var2 = lu3.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.z88
            public Object collect(b98 b98Var, rq3 rq3Var2) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var, str), rq3Var2);
                return collect == lu3.a ? collect : Unit.a;
            }
        }, new AndroidAdRefresh$invoke$3(c, adObject, this, null), 3), c);
        return Unit.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh$Companion;", "", "<init>", "()V", "NON_UPDATABLE_STATES", "", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "getNON_UPDATABLE_STATES", "()Ljava/util/Set;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<AdObjectState> getNON_UPDATABLE_STATES() {
            return AndroidAdRefresh.NON_UPDATABLE_STATES;
        }

        private Companion() {
        }
    }
}
