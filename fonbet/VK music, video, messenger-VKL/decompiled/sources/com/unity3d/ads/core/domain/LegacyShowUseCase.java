package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.EmbeddableAdPlayer;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.FlowExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.vk.movika.sdk.base.logic.processor.actions.e;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import org.json.JSONObject;
import xsna.b0t;
import xsna.dt;
import xsna.epx;
import xsna.go9;
import xsna.h1z;
import xsna.j3;
import xsna.jvo0;
import xsna.k830;
import xsna.kg;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.u14;
import xsna.uto0;
import xsna.vtk0;
import xsna.xh50;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: LegacyShowUseCase.kt */
/* loaded from: classes14.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final xh50<Boolean> hasStarted;
    private final Logger logger;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final xh50<Boolean> timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    /* compiled from: LegacyShowUseCase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = vtk0.a(bool);
        this.timeoutCancellationRequested = vtk0.a(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(uto0 uto0Var, String str, Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new j3(15, listeners, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 bannerLeftApplication$lambda$4(Listeners listeners, String str) {
        listeners.onLeftApplication(str);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(uto0 uto0Var) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        ByteString opportunityId;
        StringBuilder sb = new StringBuilder("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        sb.append(adObject != null ? adObject.getPlacementId() : null);
        sb.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb.append(uuid);
        return sb.toString();
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object opt;
        String obj;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null || (obj = opt.toString()) == null) {
            return null;
        }
        return UUID.fromString(obj).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2, UnityAdsShowOptions unityAdsShowOptions) {
        LinkedHashMap m = pn00.m(new Pair("operation", OperationType.SHOW.toString()), new Pair("reason", str), new Pair("new_api", String.valueOf((unityAdsShowOptions != null ? unityAdsShowOptions.showConfiguration : null) != null)));
        if (num != null) {
        }
        if (str2 != null) {
            m.put("reason_debug", str2);
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String str) {
        AdObject ad = this.adRepository.getAd(ProtobufExtensionsKt.toByteString(UUID.fromString(str)));
        if (ad != null) {
            return ad;
        }
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.Companion;
        ByteString byteString = ProtobufExtensionsKt.toByteString(UUID.fromString(str));
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(companion, byteString, str2, false, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, spj<? super s3q0> spjVar) {
        OperativeEventErrorDataKt.Dsl _create = OperativeEventErrorDataKt.Dsl.Companion._create(OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder());
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        Object invoke = this.getOperativeEventApi.invoke(OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR, adObject, _create._build().toByteString(), spjVar);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(uto0 uto0Var, String str, Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new u14(12, listeners, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 showClicked$lambda$7(Listeners listeners, String str) {
        listeners.onClick(str);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(uto0 uto0Var, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, UnityAdsShowOptions unityAdsShowOptions) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        MapBuilder mapBuilder = new MapBuilder();
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        String.valueOf((unityAdsShowOptions != null ? unityAdsShowOptions.showConfiguration : null) != null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), mapBuilder.h(), (Map) null, this.adObject, (Integer) null, (ByteString) null, 104, (Object) null);
        this.safeCallbackInvoke.invoke(new h1z(0, str, listeners, showStatus, this));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, uto0 uto0Var, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, UnityAdsShowOptions unityAdsShowOptions, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(uto0Var, str, showStatus, listeners, str2, str3, unityAdsShowOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 showCompleted$lambda$12(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
        listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, legacyShowUseCase.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState()));
        return s3q0.a;
    }

    private final b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> showError(uto0 uto0Var, String str, String str2, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions) {
        return new LegacyShowUseCase$showError$1(this, str2, uto0Var, unityAdsShowOptions, listeners, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 showReceivedReward$lambda$3(Listeners listeners, String str) {
        listeners.onRewarded(str);
        return s3q0.a;
    }

    private final void showStart(String str, UnityAdsShowOptions unityAdsShowOptions) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED, (Double) null, dt.b("new_api", String.valueOf((unityAdsShowOptions != null ? unityAdsShowOptions.showConfiguration : null) != null)), (Map) null, getTmpAdObject(str), (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(uto0 uto0Var, String str, Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new e(10, listeners, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 showStarted$lambda$6(Listeners listeners, String str) {
        listeners.onStart(str);
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        if (r3.invoke("ad_player_scope_not_active", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r9) == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022f, code lost:
    
        if (r3.invoke("already_showing", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r9) == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0260, code lost:
    
        if (r3.invoke("placement_validation", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r9) == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0122, code lost:
    
        if (r3.invoke("not_initialized", r5, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r9) == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013a, code lost:
    
        if (r3.invoke("placement_null", r5, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r9) == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0168, code lost:
    
        if (r3.invoke("no_opportunity_id", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r15, r9) == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018e, code lost:
    
        if (r3.invoke("placement_not_loaded", r5, r6, null, null, r9) == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ba, code lost:
    
        if (r3.invoke("ad_object_not_found", r5, r6, null, null, r9) == r10) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, spj<? super s3q0> spjVar) {
        LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$1;
        LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$12;
        Object opportunityId;
        Object obj;
        ?? r0;
        String str2;
        boolean z;
        int i;
        yvj scope;
        ByteString byteString;
        JSONObject data;
        Object opt;
        String uuid;
        UUID uuid2;
        if (spjVar instanceof LegacyShowUseCase$invoke$1) {
            legacyShowUseCase$invoke$1 = (LegacyShowUseCase$invoke$1) spjVar;
            int i2 = legacyShowUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
                Object obj2 = legacyShowUseCase$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (legacyShowUseCase$invoke$12.label) {
                    case 0:
                        kotlin.a.a(obj2);
                        long b = k830.b();
                        this.placement = str;
                        this.unityAdsShowOptions = unityAdsShowOptions;
                        this.logger.debug("Show for placement " + str + " called");
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                        String str3 = null;
                        if (unityAdsShowOptions != null) {
                            try {
                                opportunityId = getOpportunityId(unityAdsShowOptions);
                            } catch (Throwable th) {
                                obj = new Result.Failure(th);
                            }
                        } else {
                            opportunityId = null;
                        }
                        obj = opportunityId;
                        Throwable a = Result.a(obj);
                        Object obj3 = obj;
                        if (a != null) {
                            ref$BooleanRef.element = true;
                            obj3 = UUID.randomUUID().toString();
                        }
                        String str4 = (String) obj3;
                        if (str4 == null) {
                            if (str != null) {
                                ByteString pollOpportunityIdForPlacement = this.adRepository.pollOpportunityIdForPlacement(str);
                                uuid = (pollOpportunityIdForPlacement == null || (uuid2 = ProtobufExtensionsKt.toUUID(pollOpportunityIdForPlacement)) == null) ? null : uuid2.toString();
                                if (uuid == null) {
                                    ref$BooleanRef2.element = true;
                                    uuid = UUID.randomUUID().toString();
                                }
                            } else {
                                uuid = UUID.randomUUID().toString();
                            }
                            str4 = uuid;
                        }
                        String str5 = str4;
                        showStart(str5, unityAdsShowOptions);
                        jvo0.a aVar = new jvo0.a(b);
                        if (str == null) {
                            str2 = "";
                            r0 = 1;
                        } else {
                            r0 = 1;
                            str2 = str;
                        }
                        b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> showError = showError(aVar, str2, str5, listeners, unityAdsShowOptions);
                        if (GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, r0, null) == InitializationState.INITIALIZED) {
                            if (str != null) {
                                if (!ref$BooleanRef.element) {
                                    if (!ref$BooleanRef2.element) {
                                        ByteString byteString2 = ProtobufExtensionsKt.toByteString(UUID.fromString(str5));
                                        AdObject ad = this.adRepository.getAd(byteString2);
                                        this.adObject = ad;
                                        if (ad != null) {
                                            if (ad.getState().getValue() != AdObjectState.EXPIRED) {
                                                AdPlayer adPlayer = ad.getAdPlayer();
                                                if (adPlayer != null && (scope = adPlayer.getScope()) != null && !zvj.f(scope)) {
                                                    UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                                    legacyShowUseCase$invoke$12.label = 7;
                                                    break;
                                                } else {
                                                    boolean z2 = ad.getAdPlayer() instanceof EmbeddableAdPlayer;
                                                    if (!z2 && isFullscreenAdShowing) {
                                                        UnityAds.UnityAdsShowError unityAdsShowError2 = UnityAds.UnityAdsShowError.ALREADY_SHOWING;
                                                        legacyShowUseCase$invoke$12.label = 8;
                                                        break;
                                                    } else if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !epx.f(ad.getPlacementId(), str)) {
                                                        UnityAds.UnityAdsShowError unityAdsShowError3 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                                        legacyShowUseCase$invoke$12.label = 9;
                                                        break;
                                                    } else {
                                                        z = false;
                                                        long showTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                                                        if (!z2) {
                                                            isFullscreenAdShowing = r0;
                                                        }
                                                        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(FlowExtensionsKt.timeoutAfter$default(this.show.invoke(ad, unityAdsShowOptions), showTimeoutMs, false, new LegacyShowUseCase$invoke$2(this, ad, true, showError, str, null), 2, null), new LegacyShowUseCase$invoke$3(showError, z2, null));
                                                        LegacyShowUseCase$invoke$4 legacyShowUseCase$invoke$4 = new LegacyShowUseCase$invoke$4(this, b, str, listeners, unityAdsShowOptions, ad, showError);
                                                        legacyShowUseCase$invoke$12.I$0 = z2 ? 1 : 0;
                                                        legacyShowUseCase$invoke$12.label = 10;
                                                        if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(legacyShowUseCase$invoke$4, legacyShowUseCase$invoke$12) != coroutineSingletons) {
                                                            i = z2 ? 1 : 0;
                                                            if (i == 0) {
                                                                isFullscreenAdShowing = z;
                                                            }
                                                            return s3q0.a;
                                                        }
                                                    }
                                                }
                                            } else {
                                                UnityAds.UnityAdsShowError unityAdsShowError4 = UnityAds.UnityAdsShowError.EXPIRED;
                                                legacyShowUseCase$invoke$12.L$0 = byteString2;
                                                legacyShowUseCase$invoke$12.label = 6;
                                                if (showError.invoke("ad_object_expired", unityAdsShowError4, MESSAGE_AD_OBJECT_EXPIRED, null, null, legacyShowUseCase$invoke$12) != coroutineSingletons) {
                                                    byteString = byteString2;
                                                    this.adRepository.removeAd(byteString);
                                                    return s3q0.a;
                                                }
                                            }
                                        } else {
                                            UnityAds.UnityAdsShowError unityAdsShowError5 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                            String b2 = go9.b(MESSAGE_NO_AD_OBJECT, str5);
                                            legacyShowUseCase$invoke$12.label = 5;
                                            break;
                                        }
                                    } else {
                                        UnityAds.UnityAdsShowError unityAdsShowError6 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                        String format = String.format(MESSAGE_PLACEMENT_NOT_LOADED, Arrays.copyOf(new Object[]{str}, (int) r0));
                                        legacyShowUseCase$invoke$12.label = 4;
                                        break;
                                    }
                                } else {
                                    if (unityAdsShowOptions != null && (data = unityAdsShowOptions.getData()) != null && (opt = data.opt("objectId")) != null) {
                                        str3 = opt.toString();
                                    }
                                    UnityAds.UnityAdsShowError unityAdsShowError7 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                    legacyShowUseCase$invoke$12.label = 3;
                                    break;
                                }
                            } else {
                                UnityAds.UnityAdsShowError unityAdsShowError8 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                legacyShowUseCase$invoke$12.label = 2;
                                break;
                            }
                        } else {
                            UnityAds.UnityAdsShowError unityAdsShowError9 = UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                            legacyShowUseCase$invoke$12.label = r0;
                            break;
                        }
                        return coroutineSingletons;
                    case 1:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 2:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 3:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 4:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 5:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 6:
                        byteString = (ByteString) legacyShowUseCase$invoke$12.L$0;
                        kotlin.a.a(obj2);
                        this.adRepository.removeAd(byteString);
                        return s3q0.a;
                    case 7:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 8:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 9:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    case 10:
                        i = legacyShowUseCase$invoke$12.I$0;
                        kotlin.a.a(obj2);
                        z = false;
                        if (i == 0) {
                        }
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        legacyShowUseCase$invoke$1 = new LegacyShowUseCase$invoke$1(this, spjVar);
        legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
        Object obj22 = legacyShowUseCase$invoke$12.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (legacyShowUseCase$invoke$12.label) {
        }
    }

    public final void showReceivedReward(uto0 uto0Var, String str, Listeners listeners) {
        this.logger.info("Rewarding ad " + getAdInfoString());
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new kg(15, listeners, str));
    }
}
