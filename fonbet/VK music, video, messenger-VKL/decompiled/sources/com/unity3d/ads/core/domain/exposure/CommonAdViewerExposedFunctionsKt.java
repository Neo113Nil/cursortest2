package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.drm0;
import xsna.eoo;
import xsna.gzg0;
import xsna.pn00;
import xsna.rl3;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.tya;
import xsna.xh50;
import xsna.zno;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt {
    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterClick$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return AndroidAttribution.this.registerClick((String) objArr[0], adObject, spjVar);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterView$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return AndroidAttribution.this.registerView((String) objArr[0], adObject, spjVar);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$clearStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
                Storage.clear((String) objArr[0], new ContinuationFromCallback(gzg0Var));
                Object a = gzg0Var.a();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return a;
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$deleteStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
                Storage.delete((String) objArr[0], (String) objArr[1], new ContinuationFromCallback(gzg0Var));
                Object a = gzg0Var.a();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return a;
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject, SessionRepository sessionRepository) {
        return new CommonAdViewerExposedFunctionsKt$download$1(sessionRepository, cacheFile, adObject);
    }

    public static final ExposedFunction downloadWithProgress(final CacheFile cacheFile, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                JSONObject jSONObject = (JSONObject) objArr[0];
                String string = jSONObject.getString("url");
                JSONArray jSONArray = (JSONArray) rl3.S(2, objArr);
                int optInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                Object S = rl3.S(1, objArr);
                Number number = S instanceof Number ? (Number) S : null;
                if (number == null) {
                    throw new IllegalStateException("intervalMs is required");
                }
                int intValue = number.intValue();
                String uuid = UUID.randomUUID().toString();
                return new Pair(pn00.k(new Pair("url", string), new Pair("downloadId", uuid)), new tya(new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(CacheFile.this, string, adObject, jSONArray, optInt, intValue, uuid, null), EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND));
            }
        };
    }

    /* renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m73getAdContextyLuu4LI(AndroidGetAdPlayerContext androidGetAdPlayerContext, String str, String str2, String str3, IsOMActivated isOMActivated, AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(str, str2, str3, androidGetAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return Base64.encodeToString(DeviceInfoRepository.this.getAllowedPii().getValue().toByteArray(), 2);
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getConnectionType$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return DeviceInfoRepository.this.getDynamicDeviceInfo().getConnectionType();
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return new Double(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return new Double(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getExtra(final SessionRepository sessionRepository, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getExtra$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                InitializationConfigurationInternal initializationConfiguration;
                Map<String, String> extras;
                LoadConfiguration loadConfiguration;
                Map<String, String> extras2;
                ShowConfiguration showConfiguration;
                Map<String, String> extras3;
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                int hashCode = str.hashCode();
                if (hashCode == 3237136) {
                    if (!str.equals("init") || (initializationConfiguration = SessionRepository.this.getInitializationConfiguration()) == null || (extras = initializationConfiguration.getExtras()) == null) {
                        return null;
                    }
                    return extras.get(str2);
                }
                if (hashCode == 3327206) {
                    if (!str.equals("load") || (loadConfiguration = adObject.getLoadConfiguration()) == null || (extras2 = loadConfiguration.getExtras()) == null) {
                        return null;
                    }
                    return extras2.get(str2);
                }
                if (hashCode == 3529469 && str.equals("show") && (showConfiguration = adObject.getShowConfiguration()) != null && (extras3 = showConfiguration.getExtras()) != null) {
                    return extras3.get(str2);
                }
                return null;
                return null;
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getKeysStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
                Storage.getKeys((String) objArr[0], (String) objArr[1], (Boolean) objArr[2], new ContinuationFromCallback(gzg0Var));
                Object a = gzg0Var.a();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return a;
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        return new CommonAdViewerExposedFunctionsKt$getPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        return new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenHeight$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return new Integer(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenWidth$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return new Integer(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getSessionToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return ProtobufExtensionsKt.toBase64$default(SessionRepository.this.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
                Storage.get((String) objArr[0], (String) objArr[1], new ContinuationFromCallback(gzg0Var));
                Object a = gzg0Var.a();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementStarts$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                SessionRepository.this.incrementTokenStartsCount();
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementWins$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                if (AdObject.this.getWebViewLessLoadingRequiredData() == null) {
                    sessionRepository.incrementTokenWinsCount();
                }
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenReset$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                SessionRepository.this.resetTokenCounters();
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                SessionRepository.this.incrementBannerImpressionCount();
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isAttributionAvailable$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return AndroidAttribution.this.isAvailable(spjVar);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIsFileCache) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isFileCached$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return GetIsFileCache.this.invoke((String) objArr[0], spjVar);
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isOfferwallAdReady$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                return GetIsOfferwallAdReady.this.invoke(((JSONObject) objArr[0]).optString("placementName"), spjVar);
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                CampaignRepository.this.setShowTimestamp(adObject.getOpportunityId());
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$omFinishSession$1(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        return new CommonAdViewerExposedFunctionsKt$omGetData$1(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$omImpression$1(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$omStartSession$1(androidOmInteraction, adObject);
    }

    public static final ExposedFunction openUrl(final AdObject adObject, final HandleOpenUrl handleOpenUrl) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                String str = (String) objArr[0];
                Object S = rl3.S(1, objArr);
                JSONObject jSONObject = S instanceof JSONObject ? (JSONObject) S : null;
                String optString = jSONObject != null ? jSONObject.optString("packageName") : null;
                String optString2 = jSONObject != null ? jSONObject.optString("action", CommonConstant.ACTION.HWID_SCHEME_URL) : null;
                JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS) : null;
                boolean optBoolean = jSONObject != null ? jSONObject.optBoolean(HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT) : false;
                Map<String, ? extends Object> map = null;
                HandleOpenUrl handleOpenUrl2 = HandleOpenUrl.this;
                AdObject adObject2 = adObject;
                if (optJSONObject != null) {
                    map = JSONObjectExtensionsKt.toBuiltInMap(optJSONObject);
                }
                return handleOpenUrl2.invoke(adObject2, str, optString, optString2, map, optBoolean, spjVar);
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$readStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
                Storage.read((String) objArr[0], new ContinuationFromCallback(gzg0Var));
                Object a = gzg0Var.a();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return a;
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$refreshAdData$1(refresh, adObject);
    }

    public static final ExposedFunction request(RequestType requestType, ExecuteAdViewerRequest executeAdViewerRequest) {
        return new CommonAdViewerExposedFunctionsKt$request$1(executeAdViewerRequest, requestType);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                String obj;
                String str = (String) objArr[0];
                JSONObject jSONObject = (JSONObject) objArr[1];
                MapBuilder mapBuilder = new MapBuilder();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    mapBuilder.put(next, jSONObject.getString(next));
                }
                MapBuilder h = mapBuilder.h();
                Object S = rl3.S(2, objArr);
                SendDiagnosticEvent.DefaultImpls.invoke$default(SendDiagnosticEvent.this, str, (S == null || (obj = S.toString()) == null) ? null : new Double(Double.parseDouble(obj)), h, (Map) null, adObject, (Integer) null, (ByteString) null, 104, (Object) null);
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        return new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                AllowedPiiOuterClass.AllowedPii value;
                final AllowedPiiKt.Dsl _create;
                JSONObject jSONObject = (JSONObject) objArr[0];
                xh50<AllowedPiiOuterClass.AllowedPii> allowedPii = DeviceInfoRepository.this.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    _create = AllowedPiiKt.Dsl.Companion._create(value.toBuilder());
                    Object opt = jSONObject.opt("idfa");
                    Boolean bool = opt instanceof Boolean ? (Boolean) opt : null;
                    if (bool != null) {
                        new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                            public void set(Object obj) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj).booleanValue());
                            }
                        }.set(bool);
                    }
                    Object opt2 = jSONObject.opt("idfv");
                    Boolean bool2 = opt2 instanceof Boolean ? (Boolean) opt2 : null;
                    if (bool2 != null) {
                        new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                            public void set(Object obj) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj).booleanValue());
                            }
                        }.set(bool2);
                    }
                    Object opt3 = jSONObject.opt("appset_id");
                    Boolean bool3 = opt3 instanceof Boolean ? (Boolean) opt3 : null;
                    if (bool3 != null) {
                        new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                            public void set(Object obj) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj).booleanValue());
                            }
                        }.set(bool3);
                    }
                } while (!allowedPii.compareAndSet(value, _create._build()));
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOpportunityTTL$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                int intValue = ((Integer) objArr[0]).intValue();
                xh50<zno> ttl = AdObject.this.getTtl();
                zno.a aVar = zno.c;
                ttl.setValue(new zno(eoo.e(intValue, DurationUnit.SECONDS)));
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        return new CommonAdViewerExposedFunctionsKt$setOrientation$1(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        return new CommonAdViewerExposedFunctionsKt$setPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        return new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
                Storage.set((String) objArr[0], (String) objArr[1], objArr[2], new ContinuationFromCallback(gzg0Var));
                Object a = gzg0Var.a();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return a;
            }
        };
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showOfferwallAd$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateCampaignState$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
            
                if (r0 != null) goto L25;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                CampaignStateOuterClass.Campaign _build;
                Object O = rl3.O(objArr);
                JSONObject jSONObject = O instanceof JSONObject ? (JSONObject) O : null;
                if (jSONObject == null) {
                    throw new IllegalArgumentException("Update campaign state requires a JSONObject");
                }
                String optString = jSONObject.optString("data");
                if (optString == null || drm0.N(optString)) {
                    throw new IllegalArgumentException("Update campaign state requires a data string");
                }
                int optInt = jSONObject.optInt("dataVersion");
                if (optInt == 0) {
                    throw new IllegalArgumentException("Update campaign state requires a dataVersion integer");
                }
                ByteString opportunityId = AdObject.this.getOpportunityId();
                String placementId = AdObject.this.getPlacementId();
                ByteString fromBase64$default = ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null);
                if (fromBase64$default.isEmpty()) {
                    throw new IllegalArgumentException("Update campaign state requires a non-empty data byte string");
                }
                CampaignStateOuterClass.Campaign campaign = campaignRepository.getCampaign(opportunityId);
                if (campaign != null) {
                    CampaignKt.Dsl _create = CampaignKt.Dsl.Companion._create(campaign.toBuilder());
                    _create.setData(fromBase64$default);
                    _create.setDataVersion(optInt);
                    _build = _create._build();
                }
                CampaignKt.Dsl _create2 = CampaignKt.Dsl.Companion._create(CampaignStateOuterClass.Campaign.newBuilder());
                _create2.setData(fromBase64$default);
                _create2.setDataVersion(optInt);
                _create2.setPlacementId(placementId);
                _create2.setImpressionOpportunityId(opportunityId);
                _build = _create2._build();
                campaignRepository.setCampaign(opportunityId, _build);
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateTrackingToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<? super s3q0>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
                String optString = ((JSONObject) objArr[0]).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (optString != null && optString.length() != 0) {
                    AdObject.this.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null));
                }
                return s3q0.a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$writeStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
                return invoke2(objArr, (spj<Object>) spjVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
                gzg0 gzg0Var = new gzg0(s7s0.c(spjVar));
                Storage.write((String) objArr[0], new ContinuationFromCallback(gzg0Var));
                Object a = gzg0Var.a();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return a;
            }
        };
    }
}
