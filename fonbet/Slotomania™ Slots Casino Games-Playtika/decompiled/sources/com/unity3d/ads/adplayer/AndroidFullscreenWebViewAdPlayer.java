package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.C2399e8;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.properties.ClientProperties;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import org.json.JSONObject;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0001tBe\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0011\u00108\u001a\u000209H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:J\t\u0010;\u001a\u000209H\u0096\u0001J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J \u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u0019\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010K\u001a\u0002092\u0006\u0010H\u001a\u00020LH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010MJ\u0019\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020PH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010QJ\u0019\u0010R\u001a\u0002092\u0006\u0010S\u001a\u00020\u0006H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010TJ)\u0010U\u001a\u0002092\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010X\u0018\u00010WH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010YJ\u0011\u0010Z\u001a\u000209H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010:J\u0019\u0010[\u001a\u0002092\u0006\u0010\\\u001a\u00020]H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010^J\u0019\u0010_\u001a\u0002092\u0006\u0010S\u001a\u00020`H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010aJ\u0019\u0010b\u001a\u0002092\u0006\u0010c\u001a\u00020]H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010^J\u0019\u0010d\u001a\u0002092\u0006\u0010S\u001a\u00020eH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010fJ\u0019\u0010g\u001a\u0002092\u0006\u0010O\u001a\u00020PH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010QJ\u0019\u0010h\u001a\u0002092\u0006\u0010S\u001a\u00020iH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010jJ\u0019\u0010k\u001a\u0002092\u0006\u0010O\u001a\u00020PH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010QJ\u0019\u0010l\u001a\u0002092\u0006\u0010m\u001a\u00020]H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010^J\u0019\u0010n\u001a\u0002092\u0006\u0010o\u001a\u00020pH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010qJ\u0010\u0010r\u001a\u0002092\u0006\u0010C\u001a\u00020sH\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020+0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010&R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00100\u001a\u000201X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006u"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "webViewAdPlayer", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "opportunityId", "", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "orientationRepository", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "context", "Landroid/content/Context;", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lkotlin/Lazy;", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "wasDestroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "displayEventsRouter", "Lkotlinx/coroutines/Job;", "displayMessage", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "getIntent", "Landroid/content/Intent;", "providedContext", "showOptions", "Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "intentFlags", "", "handleSessionChange", "change", "Lcom/unity3d/ads/core/data/model/SessionChange;", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleVolumeSettingsChange", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAllowedPiiChange", "value", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", "event", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGmaEvent", "Lcom/unity3d/scar/adapter/common/GMAEvent;", "(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendOfferwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "sendScarBannerEvent", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", "sendVisibilityChange", C2399e8.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "Lcom/unity3d/ads/adplayer/ShowOptions;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MutableSharedFlow<DisplayMessage> displayMessages = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    private final Lazy adObject;
    private final AdRepository adRepository;
    private final Context context;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final AtomicBoolean wasDestroyed;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<OfferwallShowEvent> getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<ScarEvent> getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.onBroadcastEvent(str, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.requestShow(map, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendActivityDestroyed(continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendFocusChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(GMAEvent gMAEvent, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendGmaEvent(gMAEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendMuteChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendVisibilityChange(z, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, Continuation<? super Unit> continuation) {
        return this.webViewAdPlayer.sendVolumeChange(d, continuation);
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context) {
        Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(orientationRepository, "orientationRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject = LazyKt.lazy(new Function0<AdObject>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$adObject$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AdObject invoke() {
                Object m11180constructorimpl;
                AdRepository adRepository2;
                String str;
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    adRepository2 = androidFullscreenWebViewAdPlayer.adRepository;
                    str = androidFullscreenWebViewAdPlayer.opportunityId;
                    UUID fromString = UUID.fromString(str);
                    Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
                    m11180constructorimpl = Result.m11180constructorimpl(adRepository2.getAd(ProtobufExtensionsKt.toByteString(fromString)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                    m11180constructorimpl = null;
                }
                return (AdObject) m11180constructorimpl;
            }
        });
        this.wasDestroyed = new AtomicBoolean(false);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
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
        intent.putExtra("orientation", this.orientationRepository.getResumedActivityOrientation().getValue().intValue());
        return intent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        Activity activity;
        Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean isScarAd = androidShowOptions.isScarAd();
        boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final SharedFlow onSubscription = FlowKt.onSubscription(displayMessages, new AndroidFullscreenWebViewAdPlayer$show$1(CompletableDeferred$default, null));
        FlowKt.launchIn(FlowKt.onEach(new Flow<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    String str;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String opportunityId = ((DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (Intrinsics.areEqual(opportunityId, str)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DisplayMessage> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$3(this)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$4(this)), getScope());
        final SharedFlow<ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        FlowKt.launchIn(FlowKt.onEach(new Flow<ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                ShowEvent showEvent = (ShowEvent) obj;
                                if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ShowEvent> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$6(this, null)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$7(this)), getScope());
        JobKt.getJob(getScope().getCoroutineContext()).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.destroy(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th != null) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidFullscreenWebViewAdPlayer.this.getScope().getCoroutineContext().plus(NonCancellable.INSTANCE)), null, null, new AnonymousClass1(AndroidFullscreenWebViewAdPlayer.this, null), 3, null);
                }
            }
        });
        AdObject adObject = getAdObject();
        WeakReference<Activity> activity2 = adObject != null ? adObject.getActivity() : null;
        Activity activity3 = activity2 != null ? activity2.get() : null;
        boolean z = activity3 != null;
        if (z) {
            ClientProperties.setActivity(activity3);
        }
        if (activity2 != null && !z) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_activity_not_available", null, null, null, getAdObject(), null, 46, null);
        }
        if (isScarAd || isOfferwallAd) {
            if (!isScarAd) {
                BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$11(CompletableDeferred$default, this, showOptions, null), 3, null);
                return;
            }
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$10(CompletableDeferred$default, this, FlowKt.shareIn(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), SharingStarted.INSTANCE.getEagerly(), 10), showOptions, null), 3, null);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
        Integer valueOf = Integer.valueOf(this.sessionRepository.getNativeConfiguration().getOverwriteIntentFlagActivity());
        Integer num = valueOf.intValue() != 0 ? valueOf : null;
        int intValue = num != null ? num.intValue() : 268500992;
        if (z) {
            Intrinsics.checkNotNull(activity3);
            activity = activity3;
        } else {
            activity = this.context;
        }
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$9(CompletableDeferred$default, activity, getIntent(activity, androidShowOptions, intValue), intValue, 268500992, this, showOptions, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, Continuation continuation) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, Continuation<? super Unit> continuation) {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), continuation);
            return sendMuteChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendMuteChange : Unit.INSTANCE;
        }
        if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            return Unit.INSTANCE;
        }
        Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), continuation);
        return sendVolumeChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendVolumeChange : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, Continuation<? super Unit> continuation) {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "change.value.toByteArray()");
            Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, continuation);
            return sendUserConsentChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendUserConsentChange : Unit.INSTANCE;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            return Unit.INSTANCE;
        }
        WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "change.value.toByteArray()");
        Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, continuation);
        return sendPrivacyFsmChange == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendPrivacyFsmChange : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r9.destroy(r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(Continuation<? super Unit> continuation) {
        AndroidFullscreenWebViewAdPlayer$destroy$1 androidFullscreenWebViewAdPlayer$destroy$1;
        int i;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer;
        if (continuation instanceof AndroidFullscreenWebViewAdPlayer$destroy$1) {
            androidFullscreenWebViewAdPlayer$destroy$1 = (AndroidFullscreenWebViewAdPlayer$destroy$1) continuation;
            if ((androidFullscreenWebViewAdPlayer$destroy$1.label & Integer.MIN_VALUE) != 0) {
                androidFullscreenWebViewAdPlayer$destroy$1.label -= Integer.MIN_VALUE;
                Object obj = androidFullscreenWebViewAdPlayer$destroy$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidFullscreenWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.wasDestroyed.getAndSet(true)) {
                        return Unit.INSTANCE;
                    }
                    this.webViewAdPlayer.dispatchShowCompleted();
                    MutableSharedFlow<DisplayMessage> mutableSharedFlow = displayMessages;
                    DisplayMessage.DisplayFinishRequest displayFinishRequest = new DisplayMessage.DisplayFinishRequest(this.opportunityId);
                    androidFullscreenWebViewAdPlayer$destroy$1.L$0 = this;
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 1;
                    if (mutableSharedFlow.emit(displayFinishRequest, androidFullscreenWebViewAdPlayer$destroy$1) != coroutine_suspended) {
                        androidFullscreenWebViewAdPlayer = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) androidFullscreenWebViewAdPlayer$destroy$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) androidFullscreenWebViewAdPlayer$destroy$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    AndroidWebViewContainer webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
                    androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) androidFullscreenWebViewAdPlayer$destroy$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    androidFullscreenWebViewAdPlayer$destroy$1.L$0 = null;
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                }
                if (androidFullscreenWebViewAdPlayer.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(androidFullscreenWebViewAdPlayer.opportunityId))) {
                    androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 2;
                }
                AndroidWebViewContainer webViewContainer2 = androidFullscreenWebViewAdPlayer.getWebViewContainer();
                androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
                androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
            }
        }
        androidFullscreenWebViewAdPlayer$destroy$1 = new AndroidFullscreenWebViewAdPlayer$destroy$1(this, continuation);
        Object obj2 = androidFullscreenWebViewAdPlayer$destroy$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidFullscreenWebViewAdPlayer$destroy$1.label;
        if (i != 0) {
        }
        if (androidFullscreenWebViewAdPlayer.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(androidFullscreenWebViewAdPlayer.opportunityId))) {
        }
        AndroidWebViewContainer webViewContainer22 = androidFullscreenWebViewAdPlayer.getWebViewContainer();
        androidFullscreenWebViewAdPlayer$destroy$1.L$0 = androidFullscreenWebViewAdPlayer;
        androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
    }

    private final Job displayEventsRouter(DisplayMessage displayMessage) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3, null);
        return launch$default;
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "()V", "displayMessages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "getDisplayMessages", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MutableSharedFlow<DisplayMessage> getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }
}
