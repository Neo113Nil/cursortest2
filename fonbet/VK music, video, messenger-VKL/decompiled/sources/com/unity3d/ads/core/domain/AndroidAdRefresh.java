package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.eoo;
import xsna.hpj;
import xsna.ksr;
import xsna.lsr;
import xsna.qsl;
import xsna.rl3;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.vvj;
import xsna.zcl;
import xsna.zno;
import xsna.zvj;

/* compiled from: AndroidAdRefresh.kt */
/* loaded from: classes14.dex */
public final class AndroidAdRefresh implements AdRefresh {
    private static final Companion Companion = new Companion(null);
    private static final Set<AdObjectState> NON_UPDATABLE_STATES = rl3.y0(new AdObjectState[]{AdObjectState.SHOWING, AdObjectState.COMPLETED, AdObjectState.EXPIRED});
    private final AdRepository adRepository;
    private final CacheAssets cacheAssets;
    private final Refresh refresh;

    /* compiled from: AndroidAdRefresh.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Set<AdObjectState> getNON_UPDATABLE_STATES() {
            return AndroidAdRefresh.NON_UPDATABLE_STATES;
        }

        private Companion() {
        }
    }

    public AndroidAdRefresh(AdRepository adRepository, CacheAssets cacheAssets, Refresh refresh) {
        this.adRepository = adRepository;
        this.cacheAssets = cacheAssets;
        this.refresh = refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUpdateRefreshData(AdObjectState adObjectState) {
        return !NON_UPDATABLE_STATES.contains(adObjectState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performRefresh(ByteString byteString, spj<? super s3q0> spjVar) {
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
        if (spjVar instanceof AndroidAdRefresh$performRefresh$1) {
            androidAdRefresh$performRefresh$1 = (AndroidAdRefresh$performRefresh$1) spjVar;
            int i2 = androidAdRefresh$performRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidAdRefresh$performRefresh$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidAdRefresh$performRefresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidAdRefresh$performRefresh$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    AdObject ad = this.adRepository.getAd(byteString);
                    if (ad == null) {
                        throw new IllegalStateException(("No adObject for opportunityId: " + byteString).toString());
                    }
                    webViewLessLoadingRequiredData = ad.getWebViewLessLoadingRequiredData();
                    if (webViewLessLoadingRequiredData == null || (adResponse = webViewLessLoadingRequiredData.getAdResponse()) == null) {
                        return s3q0.a;
                    }
                    adDataRefreshToken = adResponse.getAdDataRefreshToken();
                    if (adDataRefreshToken == null) {
                        return s3q0.a;
                    }
                    if (adDataRefreshToken.isEmpty()) {
                        return s3q0.a;
                    }
                    zno.a aVar = zno.c;
                    long e = eoo.e(adResponse.getCampaignMetadata().getAdDataRefreshDelayMs(), DurationUnit.MILLISECONDS);
                    androidAdRefresh$performRefresh$1.L$0 = byteString;
                    androidAdRefresh$performRefresh$1.L$1 = ad;
                    androidAdRefresh$performRefresh$1.L$2 = webViewLessLoadingRequiredData;
                    androidAdRefresh$performRefresh$1.L$3 = adDataRefreshToken;
                    androidAdRefresh$performRefresh$1.label = 1;
                    if (qsl.c(e, androidAdRefresh$performRefresh$1) != coroutineSingletons) {
                        adObject = ad;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        adDataRefreshResponse2 = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) androidAdRefresh$performRefresh$1.L$2;
                        webViewLessLoadingRequiredData3 = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$1;
                        adObject3 = (AdObject) androidAdRefresh$performRefresh$1.L$0;
                        kotlin.a.a(obj);
                        if (((CacheAssetsEvent) obj) instanceof CacheAssetsEvent.Success) {
                            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData4 = adObject3.getWebViewLessLoadingRequiredData();
                            if (webViewLessLoadingRequiredData4 != null) {
                                webViewLessLoadingRequiredData4.setAdRefreshState(AdRefreshState.REUSE_ERROR);
                            }
                        } else if (canUpdateRefreshData(adObject3.getState().getValue())) {
                            webViewLessLoadingRequiredData3.setAdRefreshState(AdRefreshState.REUSE_RELOADED);
                            adObject3.setTrackingToken(adDataRefreshResponse2.getTrackingToken());
                            AdResponseKt.Dsl _create = AdResponseKt.Dsl.Companion._create(webViewLessLoadingRequiredData3.getAdResponse().toBuilder());
                            _create.setAdData(adDataRefreshResponse2.getAdData());
                            _create.setAdDataRefreshToken(adDataRefreshResponse2.getAdDataRefreshToken());
                            _create.setTrackingToken(adDataRefreshResponse2.getTrackingToken());
                            _create.setCampaignMetadata(adDataRefreshResponse2.getCampaignMetadata());
                            webViewLessLoadingRequiredData3.setAdResponse(_create._build());
                        }
                        return s3q0.a;
                    }
                    webViewLessLoadingRequiredData2 = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$1;
                    adObject2 = (AdObject) androidAdRefresh$performRefresh$1.L$0;
                    kotlin.a.a(obj);
                    adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                    if (!adDataRefreshResponse.hasError()) {
                        webViewLessLoadingRequiredData2.setAdRefreshState(adDataRefreshResponse.getError().getErrorCode() == ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL ? AdRefreshState.REUSE_NO_FILL : AdRefreshState.REUSE_ERROR);
                        return s3q0.a;
                    }
                    if (!adDataRefreshResponse.hasCampaignMetadata() || adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList().isEmpty()) {
                        webViewLessLoadingRequiredData2.setAdRefreshState(AdRefreshState.REUSE_NO_FILL);
                        return s3q0.a;
                    }
                    CacheAssets cacheAssets = this.cacheAssets;
                    List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList();
                    androidAdRefresh$performRefresh$1.L$0 = adObject2;
                    androidAdRefresh$performRefresh$1.L$1 = webViewLessLoadingRequiredData2;
                    androidAdRefresh$performRefresh$1.L$2 = adDataRefreshResponse;
                    androidAdRefresh$performRefresh$1.label = 3;
                    Object invoke = cacheAssets.invoke(adObject2, assetsToCacheList, androidAdRefresh$performRefresh$1);
                    if (invoke != coroutineSingletons) {
                        webViewLessLoadingRequiredData3 = webViewLessLoadingRequiredData2;
                        adDataRefreshResponse2 = adDataRefreshResponse;
                        obj = invoke;
                        adObject3 = adObject2;
                        if (((CacheAssetsEvent) obj) instanceof CacheAssetsEvent.Success) {
                        }
                        return s3q0.a;
                    }
                    return coroutineSingletons;
                }
                ByteString byteString2 = (ByteString) androidAdRefresh$performRefresh$1.L$3;
                webViewLessLoadingRequiredData = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$2;
                adObject = (AdObject) androidAdRefresh$performRefresh$1.L$1;
                ByteString byteString3 = (ByteString) androidAdRefresh$performRefresh$1.L$0;
                kotlin.a.a(obj);
                adDataRefreshToken = byteString2;
                byteString = byteString3;
                if (canUpdateRefreshData(adObject.getState().getValue())) {
                    return s3q0.a;
                }
                Refresh refresh = this.refresh;
                androidAdRefresh$performRefresh$1.L$0 = adObject;
                androidAdRefresh$performRefresh$1.L$1 = webViewLessLoadingRequiredData;
                androidAdRefresh$performRefresh$1.L$2 = null;
                androidAdRefresh$performRefresh$1.L$3 = null;
                androidAdRefresh$performRefresh$1.label = 2;
                obj = refresh.invoke(byteString, adDataRefreshToken, androidAdRefresh$performRefresh$1);
                if (obj != coroutineSingletons) {
                    webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
                    adObject2 = adObject;
                    adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                    if (!adDataRefreshResponse.hasError()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        androidAdRefresh$performRefresh$1 = new AndroidAdRefresh$performRefresh$1(this, spjVar);
        Object obj2 = androidAdRefresh$performRefresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidAdRefresh$performRefresh$1.label;
        if (i != 0) {
        }
        if (canUpdateRefreshData(adObject.getState().getValue())) {
        }
    }

    @Override // com.unity3d.ads.core.domain.AdRefresh
    public Object invoke(AdObject adObject, spj<? super s3q0> spjVar) {
        hpj a = zvj.a(adObject.getAdScope().getCoroutineContext().plus(new vvj("Ad_Refresh")));
        final sh50<String> broadcastEventChannel = AdPlayer.Companion.getBroadcastEventChannel();
        final String str = "AD_REFRESH";
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<String>() { // from class: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;
                final /* synthetic */ String receiver$inlined;

                @b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2", f = "AndroidAdRefresh.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar, String str) {
                    this.$this_unsafeFlow = lsrVar;
                    this.receiver$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                if (this.receiver$inlined.equals(obj)) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public Object collect(lsr<? super String> lsrVar, spj spjVar2) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, str), spjVar2);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new AndroidAdRefresh$invoke$3(a, adObject, this, null)), a);
        return s3q0.a;
    }
}
