package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.C4018c8;
import com.ironsource.U3;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.a70;
import defpackage.b1d;
import defpackage.b98;
import defpackage.bea;
import defpackage.beh;
import defpackage.eed;
import defpackage.fcp;
import defpackage.gki;
import defpackage.il4;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.qa3;
import defpackage.qx9;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.u2;
import defpackage.u2g;
import defpackage.v98;
import defpackage.w2g;
import defpackage.xdh;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import defpackage.ypa;
import defpackage.z0;
import defpackage.z88;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0001zB_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010!J(\u0010%\u001a\u00020\u001d2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"H\u0096A¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)H\u0096A¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020)H\u0096A¢\u0006\u0004\b.\u0010,J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020)H\u0096A¢\u0006\u0004\b0\u0010,J\u0010\u00101\u001a\u00020\u001dH\u0096A¢\u0006\u0004\b1\u0010!J\u0018\u00104\u001a\u00020\u001d2\u0006\u00103\u001a\u000202H\u0096A¢\u0006\u0004\b4\u00105J\u0018\u00108\u001a\u00020\u001d2\u0006\u00107\u001a\u000206H\u0096A¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u001d2\u0006\u00107\u001a\u000206H\u0096A¢\u0006\u0004\b:\u00109J\u0018\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u000206H\u0096A¢\u0006\u0004\b;\u00109J\u0018\u0010=\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0005H\u0096A¢\u0006\u0004\b=\u0010>J\u0018\u0010@\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020?H\u0096A¢\u0006\u0004\b@\u0010AJ'\u0010G\u001a\u00020F2\u0006\u0010B\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020C2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ\u0018\u0010K\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020IH\u0082@¢\u0006\u0004\bK\u0010LJ\u0018\u0010N\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020MH\u0082@¢\u0006\u0004\bN\u0010OJ\u0017\u0010S\u001a\u00020R2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bS\u0010TR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010UR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010VR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ZR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010[R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\\R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010]R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010^R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010_R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010`R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010aR\u001d\u0010g\u001a\u0004\u0018\u00010b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020k8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020p0o8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bq\u0010rR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020t0o8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bu\u0010rR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020w0o8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bx\u0010r¨\u0006{"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "webViewAdPlayer", "", "opportunityId", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "orientationRepository", "Landroid/content/Context;", "context", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", "", "show", "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "(Lrq3;)Ljava/lang/Object;", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "", "isMuted", "sendMuteChange", "(ZLrq3;)Ljava/lang/Object;", C4018c8.k, "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "", "volume", "sendVolumeChange", "(DLrq3;)Ljava/lang/Object;", "", U3.i.X, "sendUserConsentChange", "([BLrq3;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onAllowedPiiChange", "event", "onBroadcastEvent", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lrq3;)Ljava/lang/Object;", "providedContext", "Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "", "intentFlags", "Landroid/content/Intent;", "getIntent", "(Landroid/content/Context;Lcom/unity3d/ads/adplayer/AndroidShowOptions;I)Landroid/content/Intent;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "change", "handleVolumeSettingsChange", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "handleSessionChange", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "displayMessage", "Lyda;", "displayEventsRouter", "(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lyda;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Ljava/lang/String;", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Ljoa;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasDestroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lku3;", "getScope", "()Lku3;", "scope", "Lz88;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "()Lz88;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "onLoadEvent", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final b1d displayMessages = beh.b(0, 0, null, 7);

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final String opportunityId;

    @NotNull
    private final OrientationRepository orientationRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final AtomicBoolean wasDestroyed;

    @NotNull
    private final WebViewAdPlayer webViewAdPlayer;

    @NotNull
    private final AndroidWebViewContainer webViewContainer;

    public AndroidFullscreenWebViewAdPlayer(@NotNull WebViewAdPlayer webViewAdPlayer, @NotNull String str, @NotNull AndroidWebViewContainer androidWebViewContainer, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull OfferwallManager offerwallManager, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull AdRepository adRepository, @NotNull OrientationRepository orientationRepository, @NotNull Context context) {
        webViewAdPlayer.getClass();
        str.getClass();
        androidWebViewContainer.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        openMeasurementRepository.getClass();
        offerwallManager.getClass();
        sendDiagnosticEvent.getClass();
        adRepository.getClass();
        orientationRepository.getClass();
        context.getClass();
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject = ypa.b(new z0(this, 9));
        this.wasDestroyed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdObject adObject_delegate$lambda$1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            AdRepository adRepository = androidFullscreenWebViewAdPlayer.adRepository;
            UUID fromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
            fromString.getClass();
            u2gVar = adRepository.getAd(ProtobufExtensionsKt.toByteString(fromString));
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return (AdObject) u2gVar;
    }

    private final yda displayEventsRouter(DisplayMessage displayMessage) {
        return xw3.L(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3);
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent getIntent(Context providedContext, AndroidShowOptions showOptions, int intentFlags) {
        Intent intent = new Intent(providedContext, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = showOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(intentFlags);
        intent.putExtra(U3.i.n, ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, rq3<? super Unit> rq3Var) {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            byteArray.getClass();
            Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, rq3Var);
            return sendUserConsentChange == lu3.a ? sendUserConsentChange : Unit.a;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            zzl.b();
            return null;
        }
        WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        byteArray2.getClass();
        Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, rq3Var);
        return sendPrivacyFsmChange == lu3.a ? sendPrivacyFsmChange : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, rq3<? super Unit> rq3Var) {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), rq3Var);
            return sendMuteChange == lu3.a ? sendMuteChange : Unit.a;
        }
        if (volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) {
            Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), rq3Var);
            return sendVolumeChange == lu3.a ? sendVolumeChange : Unit.a;
        }
        zzl.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, rq3 rq3Var) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$7(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Throwable th) {
        if (th != null) {
            xw3.L(s9a.c(androidFullscreenWebViewAdPlayer.getScope().getCoroutineContext().plus(eed.b)), null, null, new AndroidFullscreenWebViewAdPlayer$show$10$1(androidFullscreenWebViewAdPlayer, null), 3);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r8, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r9.destroy(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (defpackage.n4o.y(1000, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r9.emit(r2, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(@NotNull rq3<? super Unit> rq3Var) {
        AndroidFullscreenWebViewAdPlayer$destroy$1 androidFullscreenWebViewAdPlayer$destroy$1;
        int i;
        if (rq3Var instanceof AndroidFullscreenWebViewAdPlayer$destroy$1) {
            androidFullscreenWebViewAdPlayer$destroy$1 = (AndroidFullscreenWebViewAdPlayer$destroy$1) rq3Var;
            int i2 = androidFullscreenWebViewAdPlayer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidFullscreenWebViewAdPlayer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidFullscreenWebViewAdPlayer$destroy$1.result;
                lu3 lu3Var = lu3.a;
                i = androidFullscreenWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.wasDestroyed.getAndSet(true)) {
                        return Unit.a;
                    }
                    this.webViewAdPlayer.dispatchShowCompleted();
                    b1d b1dVar = displayMessages;
                    DisplayMessage.DisplayFinishRequest displayFinishRequest = new DisplayMessage.DisplayFinishRequest(this.opportunityId);
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 1;
                } else if (i == 1) {
                    y6a.M(obj);
                } else if (i == 2) {
                    y6a.M(obj);
                    AndroidWebViewContainer webViewContainer = getWebViewContainer();
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                }
                if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 2;
                }
                AndroidWebViewContainer webViewContainer2 = getWebViewContainer();
                androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
            }
        }
        androidFullscreenWebViewAdPlayer$destroy$1 = new AndroidFullscreenWebViewAdPlayer$destroy$1(this, rq3Var);
        Object obj2 = androidFullscreenWebViewAdPlayer$destroy$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidFullscreenWebViewAdPlayer$destroy$1.label;
        if (i != 0) {
        }
        if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
        }
        AndroidWebViewContainer webViewContainer22 = getWebViewContainer();
        androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public ku3 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.onBroadcastEvent(str, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.requestShow(map, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendActivityDestroyed(rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendFocusChange(z, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendMuteChange(z, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendVisibilityChange(z, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(double d, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendVolumeChange(d, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull ShowOptions showOptions) {
        Context context;
        showOptions.getClass();
        if (!(showOptions instanceof AndroidShowOptions)) {
            a70.p("Failed requirement.");
            return;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
        qa3 c = qx9.c();
        final gki gkiVar = new gki(displayMessages, new AndroidFullscreenWebViewAdPlayer$show$1(c, null));
        int i = 3;
        fcp.m0(new v98(new z88() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                @il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(b98 b98Var, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = b98Var;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
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
                    String str;
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
                                String opportunityId = ((DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (Intrinsics.c(opportunityId, str)) {
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
            public Object collect(b98 b98Var, rq3 rq3Var) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var, this), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$3(this), i), getScope());
        fcp.m0(new v98(this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$4(this), i), getScope());
        final xdh onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        fcp.m0(new v98(new z88() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(b98 b98Var) {
                    this.$this_unsafeFlow = b98Var;
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
                                ShowEvent showEvent = (ShowEvent) obj;
                                if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
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
            public Object collect(b98 b98Var, rq3 rq3Var) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$6(this, null), i), getScope());
        final xdh onShowEvent2 = this.webViewAdPlayer.getOnShowEvent();
        fcp.m0(new v98(new z88() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1, reason: invalid class name */
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

                public AnonymousClass2(b98 b98Var) {
                    this.$this_unsafeFlow = b98Var;
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
                                if (((ShowEvent) obj) instanceof ShowEvent.Started) {
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
            public Object collect(b98 b98Var, rq3 rq3Var) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$8(this, null), i), getScope());
        fcp.m0(new v98(this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$9(this), i), getScope());
        bea.x(getScope().getCoroutineContext()).n(new u2(this, 9));
        AdObject adObject = getAdObject();
        WeakReference<Activity> activity = adObject != null ? adObject.getActivity() : null;
        Activity activity2 = activity != null ? activity.get() : null;
        boolean z = activity2 != null;
        if (z) {
            ClientProperties.setActivity(activity2);
        }
        if (activity != null && !z) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_activity_not_available", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, (ByteString) null, 110, (Object) null);
        }
        if (isOfferwallAd) {
            xw3.L(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$12(c, this, showOptions, null), 3);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, (ByteString) null, 110, (Object) null);
        int overwriteIntentFlagActivity = this.sessionRepository.getNativeConfiguration().getOverwriteIntentFlagActivity();
        Integer valueOf = Integer.valueOf(overwriteIntentFlagActivity);
        if (overwriteIntentFlagActivity == 0) {
            valueOf = null;
        }
        boolean z2 = z;
        int intValue = valueOf != null ? valueOf.intValue() : 268500992;
        if (z2) {
            activity2.getClass();
            context = activity2;
        } else {
            context = this.context;
        }
        Context context2 = context;
        xw3.L(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$11(c, context2, getIntent(context2, androidShowOptions, intValue), intValue, 268500992, this, showOptions, null), 3);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "<init>", "()V", "Lb1d;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "displayMessages", "Lb1d;", "getDisplayMessages", "()Lb1d;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b1d getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
