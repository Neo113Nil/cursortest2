package com.vungle.ads.internal.presenter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.InvalidCTAUrl;
import com.vungle.ads.LinkError;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TpatError;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.JsonUtil;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.Utils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

/* compiled from: MRAIDPresenter.kt */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 ª\u00012\u00020\u00012\u00020\u0002:\u0002ª\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J#\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010[0k2\u0006\u0010l\u001a\u00020mH\u0001¢\u0006\u0002\bnJ\b\u0010o\u001a\u00020pH\u0002J\u0012\u0010q\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u00010[H\u0002J\u0010\u0010t\u001a\u00020p2\b\b\u0001\u0010u\u001a\u00020vJ\r\u0010w\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017J\u0006\u0010x\u001a\u00020pJ$\u0010y\u001a\u00020p2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u001e2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010[H\u0002J\u0012\u0010~\u001a\u00020\u001e2\b\u0010\u007f\u001a\u0004\u0018\u00010[H\u0002J\u000b\u0010\u0080\u0001\u001a\u0004\u0018\u00010{H\u0002J\u0016\u0010\u0081\u0001\u001a\u00020p2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010[H\u0002J\u001c\u0010\u0083\u0001\u001a\u00020p2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010[H\u0000¢\u0006\u0003\b\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020p2\u0006\u0010z\u001a\u00020{H\u0002J\u001b\u0010\u0086\u0001\u001a\u00020p2\u0007\u0010\u0087\u0001\u001a\u00020[2\u0007\u0010\u0088\u0001\u001a\u00020\u001eH\u0016J!\u0010\u0089\u0001\u001a\u00020p2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u0007\u0010\u008e\u0001\u001a\u00020pJ\u0013\u0010\u008f\u0001\u001a\u00020p2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001J&\u0010\u0092\u0001\u001a\u00020\u001e2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008b\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0003\u0010\u0094\u0001J\u0007\u0010\u0095\u0001\u001a\u00020pJ\u001c\u0010\u0096\u0001\u001a\u00020\u001e2\u0007\u0010\u0097\u0001\u001a\u00020[2\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0016J\u0011\u0010\u009a\u0001\u001a\u00020p2\u0006\u0010z\u001a\u00020{H\u0002J\t\u0010\u009b\u0001\u001a\u00020pH\u0002J\u0010\u0010\u009c\u0001\u001a\u00020p2\u0007\u0010\u009d\u0001\u001a\u00020\u001eJ\u0012\u0010\u009e\u0001\u001a\u00020p2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010%J\u0019\u0010 \u0001\u001a\u00020p2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0003\b¡\u0001J\u0019\u0010¢\u0001\u001a\u00020p2\b\u0010H\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0003\b£\u0001J\u000f\u0010¤\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0003\b¥\u0001J\u0007\u0010¦\u0001\u001a\u00020pJ\u0007\u0010§\u0001\u001a\u00020pJ\u0012\u0010¨\u0001\u001a\u00020p2\u0007\u0010©\u0001\u001a\u00020[H\u0002R(\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\u001a\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R!\u0010+\u001a\u00020,8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010/R\u000e\u00102\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00103\u001a\u0002048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u0015\u001a\u0004\b6\u00107R$\u00108\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0015\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001d\u0010>\u001a\u0004\u0018\u00010?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\b@\u0010AR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bE\u0010FR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bL\u0010MR\u000e\u0010O\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010P\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00101\u001a\u0004\bR\u0010SR\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00101\u001a\u0004\bW\u0010XR&\u0010Z\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\\\u0010\u0015\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bb\u0010\u0015\u001a\u0004\bc\u0010;\"\u0004\bd\u0010=R\u001b\u0010e\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u00101\u001a\u0004\bg\u0010hR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006«\u0001"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "vungleWebClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "executor", "Ljava/util/concurrent/Executor;", "omTracker", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/ui/VungleWebClient;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/omsdk/OMTracker;Lcom/vungle/ads/internal/platform/Platform;)V", "adStartTime", "", "getAdStartTime$vungle_ads_release$annotations", "()V", "getAdStartTime$vungle_ads_release", "()Ljava/lang/Long;", "setAdStartTime$vungle_ads_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "appStoreDelegate", "Lcom/vungle/ads/internal/presenter/OpenActivityDelegate;", "backEnabled", "", "getBackEnabled$vungle_ads_release$annotations", "getBackEnabled$vungle_ads_release", "()Z", "setBackEnabled$vungle_ads_release", "(Z)V", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "getBus$annotations", "getBus", "()Lcom/vungle/ads/internal/presenter/AdEventListener;", "setBus", "(Lcom/vungle/ads/internal/presenter/AdEventListener;)V", "clickCoordinateTracker", "Lcom/vungle/ads/internal/ClickCoordinateTracker;", "getClickCoordinateTracker$vungle_ads_release$annotations", "getClickCoordinateTracker$vungle_ads_release", "()Lcom/vungle/ads/internal/ClickCoordinateTracker;", "clickCoordinateTracker$delegate", "Lkotlin/Lazy;", "cp0Fired", "isDestroying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroying$vungle_ads_release$annotations", "isDestroying$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "lastUserInteractionTimestamp", "getLastUserInteractionTimestamp$vungle_ads_release$annotations", "getLastUserInteractionTimestamp$vungle_ads_release", "()J", "setLastUserInteractionTimestamp$vungle_ads_release", "(J)V", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider$delegate", "presenterDelegate", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "scheduler", "Lcom/vungle/ads/internal/util/HandlerScheduler;", "getScheduler", "()Lcom/vungle/ads/internal/util/HandlerScheduler;", "scheduler$delegate", "sendReportIncentivized", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "userId", "", "getUserId$vungle_ads_release$annotations", "getUserId$vungle_ads_release", "()Ljava/lang/String;", "setUserId$vungle_ads_release", "(Ljava/lang/String;)V", "videoLength", "getVideoLength$vungle_ads_release$annotations", "getVideoLength$vungle_ads_release", "setVideoLength$vungle_ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient$delegate", "checkInlineInstallIntent", "Lkotlin/Pair;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "checkInlineInstallIntent$vungle_ads_release", "closeView", "", "createDeeplinkCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "deeplinkUrl", "detach", "stopReason", "", "getViewStatus", "handleExit", "handleWebViewException", "reason", "Lcom/vungle/ads/VungleError;", "fatal", "errorMessage", "launchInlineInstall", "url", "loadMraidAd", "logInlineInstallFailure", "message", "logInlineInstallSuccess", "logInlineInstallSuccess$vungle_ads_release", "makeBusError", "onReceivedError", "errorDesc", "didCrash", "onRenderProcessUnresponsive", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onViewConfigurationChanged", "onViewTouched", "event", "Landroid/view/MotionEvent;", "onWebRenderingProcessGone", ViewHierarchyConstants.VIEW_KEY, "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "prepare", "processCommand", f.b.g, "arguments", "Lkotlinx/serialization/json/JsonObject;", "reportErrorAndCloseAd", "sendAdCloseEvent", "setAdVisibility", X3.i.o, "setEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOpenActivityDelegate", "setOpenActivityDelegate$vungle_ads_release", "setPresenterDelegate", "setPresenterDelegate$vungle_ads_release", "shouldBlockAutoRedirect", "shouldBlockAutoRedirect$vungle_ads_release", TtmlNode.START, "stop", "triggerEventMetricForTpat", "key", k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String DETECT_BLACK_SCREEN = "detectBlackScreen";
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    public static final String OPEN = "open";
    private static final String OPEN_APP_STORE = "openAppStore";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String PING_URL = "pingUrl";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    private Long adStartTime;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private OpenActivityDelegate appStoreDelegate;
    private boolean backEnabled;
    private AdEventListener bus;

    /* renamed from: clickCoordinateTracker$delegate, reason: from kotlin metadata */
    private final Lazy clickCoordinateTracker;
    private boolean cp0Fired;
    private Executor executor;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;

    /* renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final Lazy logEntry;
    private final OMTracker omTracker;

    /* renamed from: pathProvider$delegate, reason: from kotlin metadata */
    private final Lazy pathProvider;
    private final Placement placement;
    private final Platform platform;
    private PresenterDelegate presenterDelegate;

    /* renamed from: scheduler$delegate, reason: from kotlin metadata */
    private final Lazy scheduler;
    private final AtomicBoolean sendReportIncentivized;

    /* renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final Lazy signalManager;

    /* renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final Lazy tpatSender;
    private String userId;
    private long videoLength;

    /* renamed from: vungleApiClient$delegate, reason: from kotlin metadata */
    private final Lazy vungleApiClient;
    private final VungleWebClient vungleWebClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = MapsKt.mapOf(TuplesKt.to(Constants.CHECKPOINT_0, Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), TuplesKt.to(Constants.CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    public MRAIDPresenter(MRAIDAdWidget adWidget, AdPayload advertisement, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker omTracker, Platform platform) {
        Intrinsics.checkNotNullParameter(adWidget, "adWidget");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(omTracker, "omTracker");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        this.vungleApiClient = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        });
        ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
        final Context context2 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
        this.pathProvider = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<PathProvider>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context2).getService(PathProvider.class);
            }
        });
        ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
        final Context context3 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "adWidget.context");
        this.signalManager = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<SignalManager>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context3).getService(SignalManager.class);
            }
        });
        ServiceLocator.Companion companion4 = ServiceLocator.INSTANCE;
        final Context context4 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        this.tpatSender = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<TpatSender>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$special$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context4).getService(TpatSender.class);
            }
        });
        this.scheduler = LazyKt.lazy(new Function0<HandlerScheduler>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$scheduler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final HandlerScheduler invoke() {
                return new HandlerScheduler();
            }
        });
        this.logEntry = LazyKt.lazy(new Function0<LogEntry>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logEntry$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LogEntry invoke() {
                AdPayload adPayload;
                adPayload = MRAIDPresenter.this.advertisement;
                return adPayload.getLogEntry();
            }
        });
        this.clickCoordinateTracker = LazyKt.lazy(new Function0<ClickCoordinateTracker>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$clickCoordinateTracker$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ClickCoordinateTracker invoke() {
                MRAIDAdWidget mRAIDAdWidget;
                AdPayload adPayload;
                mRAIDAdWidget = MRAIDPresenter.this.adWidget;
                Context context5 = mRAIDAdWidget.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "adWidget.context");
                adPayload = MRAIDPresenter.this.advertisement;
                return new ClickCoordinateTracker(context5, adPayload);
            }
        });
    }

    /* renamed from: getLastUserInteractionTimestamp$vungle_ads_release, reason: from getter */
    public final long getLastUserInteractionTimestamp() {
        return this.lastUserInteractionTimestamp;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j) {
        this.lastUserInteractionTimestamp = j;
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    /* renamed from: isDestroying$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsDestroying() {
        return this.isDestroying;
    }

    /* renamed from: getAdStartTime$vungle_ads_release, reason: from getter */
    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    public final void setAdStartTime$vungle_ads_release(Long l) {
        this.adStartTime = l;
    }

    /* renamed from: getUserId$vungle_ads_release, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient.getValue();
    }

    private final PathProvider getPathProvider() {
        return (PathProvider) this.pathProvider.getValue();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender.getValue();
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry.getValue();
    }

    /* renamed from: getBackEnabled$vungle_ads_release, reason: from getter */
    public final boolean getBackEnabled() {
        return this.backEnabled;
    }

    public final void setBackEnabled$vungle_ads_release(boolean z) {
        this.backEnabled = z;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker.getValue();
    }

    /* renamed from: getVideoLength$vungle_ads_release, reason: from getter */
    public final long getVideoLength() {
        return this.videoLength;
    }

    public final void setVideoLength$vungle_ads_release(long j) {
        this.videoLength = j;
    }

    /* compiled from: MRAIDPresenter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0016\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002R\u0016\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0016\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0016\u0010\u0011\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0002R\u0016\u0010\u0017\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0002R\u0016\u0010\u0019\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0002R\u0016\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0002R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0002R\u0016\u0010 \u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0002R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0002R(\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(0'8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/presenter/MRAIDPresenter$Companion;", "", "()V", ShareConstants.ACTION, "", "ACTION_WITH_VALUE", "getACTION_WITH_VALUE$vungle_ads_release$annotations", "CLOSE", "getCLOSE$vungle_ads_release$annotations", "CONSENT_ACTION", "getCONSENT_ACTION$vungle_ads_release$annotations", "DETECT_BLACK_SCREEN", "getDETECT_BLACK_SCREEN$vungle_ads_release$annotations", "ERROR", "getERROR$vungle_ads_release$annotations", "GET_AVAILABLE_DISK_SPACE", "getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations", "OPEN", "getOPEN$vungle_ads_release$annotations", "OPEN_APP_STORE", "OPEN_NON_MRAID", "OPEN_PRIVACY", "getOPEN_PRIVACY$vungle_ads_release$annotations", "PING_URL", "getPING_URL$vungle_ads_release$annotations", "SET_ORIENTATION_PROPERTIES", "getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations", "SUCCESSFUL_VIEW", "getSUCCESSFUL_VIEW$vungle_ads_release$annotations", "TAG", "TPAT", "getTPAT$vungle_ads_release$annotations", "UPDATE_SIGNALS", "getUPDATE_SIGNALS$vungle_ads_release$annotations", "USE_CUSTOM_CLOSE", "USE_CUSTOM_PRIVACY", "VIDEO_LENGTH", "getVIDEO_LENGTH$vungle_ads_release$annotations", "eventMap", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getEventMap$vungle_ads_release$annotations", "getEventMap$vungle_ads_release", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getDETECT_BLACK_SCREEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        private Companion() {
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return MRAIDPresenter.eventMap;
        }
    }

    public final void setEventListener(AdEventListener listener) {
        this.bus = listener;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setOpenActivityDelegate$vungle_ads_release(OpenActivityDelegate appStoreDelegate) {
        this.appStoreDelegate = appStoreDelegate;
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void start() {
        Logger.INSTANCE.d(TAG, "start()");
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }

    public final void stop() {
        Logger.INSTANCE.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int stopReason) {
        AdEventListener adEventListener;
        Logger.INSTANCE.d(TAG, "detach()");
        boolean z = (stopReason & 1) != 0;
        boolean z2 = (stopReason & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z && z2 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop(), this.platform.isProblematicMaliDevice());
    }

    public final void setAdVisibility(boolean isViewable) {
        this.vungleWebClient.setAdVisibility(isViewable);
    }

    public final void onViewTouched(MotionEvent event) {
        if (event != null) {
            Logger.INSTANCE.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(event);
        }
    }

    private final void sendAdCloseEvent() {
        Long l = this.adStartTime;
        if (l != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    private final void closeView() {
        if (ThreadUtil.INSTANCE.isMainThread()) {
            this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m10704closeView$lambda3(MRAIDPresenter.this);
                }
            });
        } else {
            sendAdCloseEvent();
        }
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$closeView$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MRAIDAdWidget mRAIDAdWidget;
                mRAIDAdWidget = MRAIDPresenter.this.adWidget;
                mRAIDAdWidget.close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: closeView$lambda-3, reason: not valid java name */
    public static final void m10704closeView$lambda3(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.sendAdCloseEvent();
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    private final PresenterAdOpenCallback createDeeplinkCallback(final String deeplinkUrl) {
        return new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$createDeeplinkCallback$1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean opened) {
                AdPayload adPayload;
                LogEntry logEntry;
                TpatSender tpatSender;
                LogEntry logEntry2;
                if (!opened) {
                    LinkError linkError = new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl);
                    logEntry2 = this.getLogEntry();
                    linkError.setLogEntry$vungle_ads_release(logEntry2).logErrorNoReturnValue$vungle_ads_release();
                }
                adPayload = this.advertisement;
                List tpatUrls$default = AdPayload.getTpatUrls$default(adPayload, Constants.DEEPLINK_CLICK, String.valueOf(opened), null, 4, null);
                if (tpatUrls$default != null) {
                    MRAIDPresenter mRAIDPresenter = this;
                    Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatRequest.Builder tpatKey = new TpatRequest.Builder((String) it.next()).tpatKey(Constants.DEEPLINK_CLICK);
                        logEntry = mRAIDPresenter.getLogEntry();
                        TpatRequest build = tpatKey.withLogEntry(logEntry).build();
                        tpatSender = mRAIDPresenter.getTpatSender();
                        TpatSender.sendTpat$default(tpatSender, build, false, 2, null);
                    }
                }
            }
        };
    }

    public final Pair<Boolean, String> checkInlineInstallIntent$vungle_ads_release(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentName resolveActivity = intent.resolveActivity(this.adWidget.getContext().getPackageManager());
        String packageName = resolveActivity != null ? resolveActivity.getPackageName() : null;
        return new Pair<>(Boolean.valueOf(Intrinsics.areEqual(packageName, "com.android.vending")), packageName);
    }

    private final boolean launchInlineInstall(String url) {
        Pair<Boolean, String> pair;
        ExternalRouter externalRouter = ExternalRouter.INSTANCE;
        Context context = this.adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        Intent intentFromUrl$vungle_ads_release = externalRouter.getIntentFromUrl$vungle_ads_release(context, url);
        if (intentFromUrl$vungle_ads_release == null) {
            logInlineInstallFailure("url: " + url + ", message: intent is null");
            return false;
        }
        Pair<Boolean, String> checkInlineInstallIntent$vungle_ads_release = checkInlineInstallIntent$vungle_ads_release(intentFromUrl$vungle_ads_release);
        boolean booleanValue = checkInlineInstallIntent$vungle_ads_release.component1().booleanValue();
        String component2 = checkInlineInstallIntent$vungle_ads_release.component2();
        if (!booleanValue) {
            logInlineInstallFailure("url: " + url + ", message: resolveInfo " + component2);
            return false;
        }
        OpenActivityDelegate openActivityDelegate = this.appStoreDelegate;
        if (openActivityDelegate == null || (pair = openActivityDelegate.openInlineInstall(intentFromUrl$vungle_ads_release)) == null) {
            pair = new Pair<>(false, null);
        }
        boolean booleanValue2 = pair.component1().booleanValue();
        String component22 = pair.component2();
        if (!booleanValue2) {
            logInlineInstallFailure("url: " + url + ", message: " + component22);
            return false;
        }
        logInlineInstallSuccess$vungle_ads_release("url: " + url);
        return true;
    }

    public static /* synthetic */ void logInlineInstallSuccess$vungle_ads_release$default(MRAIDPresenter mRAIDPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release(str);
    }

    public final void logInlineInstallSuccess$vungle_ads_release(String message) {
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(1L);
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), message);
    }

    static /* synthetic */ void logInlineInstallFailure$default(MRAIDPresenter mRAIDPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mRAIDPresenter.logInlineInstallFailure(str);
    }

    private final void logInlineInstallFailure(String message) {
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$logInlineInstallFailure$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                VungleWebClient vungleWebClient;
                vungleWebClient = MRAIDPresenter.this.vungleWebClient;
                vungleWebClient.notifyPresentAppStoreFailed();
            }
        });
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        singleValueMetric.setValue(2L);
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(singleValueMetric, getLogEntry(), message);
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(message), getLogEntry());
    }

    private final void triggerEventMetricForTpat(String key) {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(key);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        if (r25.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0244, code lost:
    
        if (r25.equals("open") == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025e, code lost:
    
        r0 = r24.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0264, code lost:
    
        if (r0 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0266, code lost:
    
        r8 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x026a, code lost:
    
        r0 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(r26, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0276, code lost:
    
        if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(r0) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0278, code lost:
    
        new com.vungle.ads.InvalidCTAUrl("Invalid CTA Url (" + r0 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x029f, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a1, code lost:
    
        r24.lastUserInteractionTimestamp = 0;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02be, code lost:
    
        r24.lastUserInteractionTimestamp = 0;
        r18 = com.vungle.ads.internal.util.ExternalRouter.INSTANCE;
        r2 = r24.adWidget.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "adWidget.context");
        r0 = r18.launch$vungle_ads_release(r8, r0, r2, getLogEntry(), createDeeplinkCallback(r8));
        r2 = r24.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02e1, code lost:
    
        if (r2 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e3, code lost:
    
        r2.onNext("open", "adClick", r24.placement.getReferenceId());
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ee, code lost:
    
        if (r0 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f0, code lost:
    
        r0 = r24.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02f2, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f4, code lost:
    
        r0.onNext("open", "adLeftApplication", r24.placement.getReferenceId());
        r0 = kotlin.Unit.INSTANCE;
     */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean processCommand(String command, JsonObject arguments) {
        int i;
        Integer intOrNull;
        Object m11180constructorimpl;
        String str;
        boolean z;
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        String str2 = null;
        switch (command.hashCode()) {
            case -1988620632:
                if (command.equals(DETECT_BLACK_SCREEN)) {
                    String contentStringValue = JsonUtil.INSTANCE.getContentStringValue(arguments, "samplingFactor");
                    if (contentStringValue != null && (intOrNull = StringsKt.toIntOrNull(contentStringValue)) != null) {
                        Integer num = intOrNull.intValue() > 0 ? intOrNull : null;
                        if (num != null) {
                            i = num.intValue();
                            this.vungleWebClient.handleBlackScreenDetection(i);
                            break;
                        }
                    }
                    i = 100;
                    this.vungleWebClient.handleBlackScreenDetection(i);
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1912374177:
                if (command.equals(SUCCESSFUL_VIEW)) {
                    AdEventListener adEventListener = this.bus;
                    if (adEventListener != null) {
                        adEventListener.onNext(SUCCESSFUL_VIEW, null, this.placement.getReferenceId());
                        Unit unit = Unit.INSTANCE;
                    }
                    if (this.placement.isRewardedVideo() && ConfigManager.INSTANCE.isReportIncentivizedEnabled() && !this.sendReportIncentivized.getAndSet(true)) {
                        this.executor.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MRAIDPresenter.m10706processCommand$lambda11(MRAIDPresenter.this);
                            }
                        });
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -1422950858:
                if (command.equals("action")) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -735200587:
                if (command.equals(ACTION_WITH_VALUE)) {
                    String contentStringValue2 = JsonUtil.INSTANCE.getContentStringValue(arguments, "event");
                    String contentStringValue3 = JsonUtil.INSTANCE.getContentStringValue(arguments, "value");
                    if (StringsKt.equals("videoLength", contentStringValue2, true)) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            MRAIDPresenter mRAIDPresenter = this;
                            m11180constructorimpl = Result.m11180constructorimpl(contentStringValue3 != null ? Long.valueOf(Long.parseLong(contentStringValue3)) : null);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        }
                        Long l = (Long) (Result.m11186isFailureimpl(m11180constructorimpl) ? null : m11180constructorimpl);
                        this.videoLength = l != null ? l.longValue() : 0L;
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -660787472:
                if (command.equals(CONSENT_ACTION)) {
                    PrivacyManager.INSTANCE.updateGdprConsent((Intrinsics.areEqual(JsonUtil.INSTANCE.getContentStringValue(arguments, "event"), PrivacyConsent.OPT_OUT.getValue()) ? PrivacyConsent.OPT_OUT : PrivacyConsent.OPT_IN).getValue(), "vungle_modal", null);
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -649897046:
                if (command.equals(OPEN_APP_STORE)) {
                    AdPayload.AdUnit adUnit = this.advertisement.adUnit();
                    String deeplinkUrl = adUnit != null ? adUnit.getDeeplinkUrl() : null;
                    String contentStringValue4 = JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                    if (!FileUtility.INSTANCE.isValidUrl(contentStringValue4)) {
                        new InvalidCTAUrl("Invalid InlineInstall Url (" + contentStringValue4 + ')').setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    this.lastUserInteractionTimestamp = System.currentTimeMillis();
                    ExternalRouter externalRouter = ExternalRouter.INSTANCE;
                    Context context = this.adWidget.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
                    boolean launch$vungle_ads_release = externalRouter.launch$vungle_ads_release(deeplinkUrl, null, context, getLogEntry(), createDeeplinkCallback(deeplinkUrl));
                    if (!launch$vungle_ads_release) {
                        launch$vungle_ads_release = launchInlineInstall(contentStringValue4);
                    }
                    if (launch$vungle_ads_release) {
                        AdEventListener adEventListener2 = this.bus;
                        if (adEventListener2 != null) {
                            adEventListener2.onNext("open", "adClick", this.placement.getReferenceId());
                            Unit unit2 = Unit.INSTANCE;
                        }
                        AdEventListener adEventListener3 = this.bus;
                        if (adEventListener3 != null) {
                            adEventListener3.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                            Unit unit3 = Unit.INSTANCE;
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -568000867:
                if (command.equals(PING_URL)) {
                    String contentStringValue5 = JsonUtil.INSTANCE.getContentStringValue(arguments, "requestType");
                    if (contentStringValue5 != null) {
                        str = contentStringValue5.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    } else {
                        str = null;
                    }
                    if (!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"GET", "POST"}), str)) {
                        new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, "Invalid request type: " + str + ". Only 'GET' and 'POST' are supported").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    } else {
                        String contentStringValue6 = JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                        String contentStringValue7 = JsonUtil.INSTANCE.getContentStringValue(arguments, "requestData");
                        boolean parseBoolean = Boolean.parseBoolean(JsonUtil.INSTANCE.getContentStringValue(arguments, "retry"));
                        String contentStringValue8 = JsonUtil.INSTANCE.getContentStringValue(arguments, "headers");
                        if (contentStringValue8 != null) {
                            try {
                                Json.Companion companion3 = Json.INSTANCE;
                                z = true;
                                try {
                                    KSerializer<Object> serializer = SerializersKt.serializer(companion3.getSerializersModule(), Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class))));
                                    Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                                    map = (Map) companion3.decodeFromString(serializer, contentStringValue8);
                                } catch (Exception unused) {
                                    new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, "Failed to decode header: " + contentStringValue8).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                    return z;
                                }
                            } catch (Exception unused2) {
                                z = true;
                            }
                        } else {
                            z = true;
                            map = null;
                        }
                        if (!Utils.INSTANCE.isUrlValid(contentStringValue6)) {
                            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else if (contentStringValue6 != null) {
                            TpatRequest.Builder withLogEntry = new TpatRequest.Builder(contentStringValue6).headers(map).body(contentStringValue7).regularRetry(parseBoolean).tpatKey(PING_URL).withLogEntry(getLogEntry());
                            if (Intrinsics.areEqual(str, "GET")) {
                                withLogEntry.get();
                            } else {
                                withLogEntry.post();
                            }
                            Unit unit4 = Unit.INSTANCE;
                            TpatSender.sendTpat$default(getTpatSender(), withLogEntry.build(), false, 2, null);
                            Unit unit5 = Unit.INSTANCE;
                            Unit unit6 = Unit.INSTANCE;
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -511324706:
                if (command.equals("openPrivacy")) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
                    String contentStringValue9 = JsonUtil.INSTANCE.getContentStringValue(arguments, "url");
                    String str3 = contentStringValue9;
                    if (str3 != null && str3.length() != 0 && FileUtility.INSTANCE.isValidUrl(contentStringValue9)) {
                        ExternalRouter externalRouter2 = ExternalRouter.INSTANCE;
                        Context context2 = this.adWidget.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
                        if (!ExternalRouter.launch$vungle_ads_release$default(externalRouter2, null, contentStringValue9, context2, getLogEntry(), null, 16, null)) {
                            new PrivacyUrlError(contentStringValue9).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                            break;
                        } else {
                            AdEventListener adEventListener4 = this.bus;
                            if (adEventListener4 != null) {
                                adEventListener4.onNext("open", "adLeftApplication", this.placement.getReferenceId());
                                Unit unit7 = Unit.INSTANCE;
                                break;
                            }
                        }
                    } else {
                        String str4 = contentStringValue9;
                        if (str4 == null) {
                            str4 = "nonePrivacyUrl";
                        }
                        new PrivacyUrlError(str4).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case -418575596:
                break;
            case -348095344:
                if (command.equals(USE_CUSTOM_PRIVACY)) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 3417674:
                break;
            case 3566511:
                if (command.equals("tpat")) {
                    String contentStringValue10 = JsonUtil.INSTANCE.getContentStringValue(arguments, "event");
                    String str5 = contentStringValue10;
                    if (str5 != null && str5.length() != 0) {
                        triggerEventMetricForTpat(contentStringValue10);
                        List<String> tpatUrls = Intrinsics.areEqual(contentStringValue10, Constants.CHECKPOINT_0) ? this.advertisement.getTpatUrls(contentStringValue10, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel())) : Intrinsics.areEqual(contentStringValue10, Constants.VIDEO_LENGTH_TPAT) ? AdPayload.getTpatUrls$default(this.advertisement, contentStringValue10, String.valueOf(this.videoLength), null, 4, null) : AdPayload.getTpatUrls$default(this.advertisement, contentStringValue10, null, null, 6, null);
                        if (tpatUrls != null) {
                            Iterator<T> it = tpatUrls.iterator();
                            while (it.hasNext()) {
                                TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(contentStringValue10).withLogEntry(getLogEntry()).build(), false, 2, null);
                            }
                            Unit unit8 = Unit.INSTANCE;
                        }
                        if (Intrinsics.areEqual(contentStringValue10, Constants.CHECKPOINT_0) && !this.cp0Fired) {
                            this.cp0Fired = true;
                            AdEventListener adEventListener5 = this.bus;
                            if (adEventListener5 != null) {
                                adEventListener5.onNext("adViewed", null, this.placement.getReferenceId());
                                Unit unit9 = Unit.INSTANCE;
                            }
                            ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$3
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    MRAIDAdWidget mRAIDAdWidget;
                                    mRAIDAdWidget = MRAIDPresenter.this.adWidget;
                                    mRAIDAdWidget.setVisibility(0);
                                }
                            });
                            break;
                        }
                    } else {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 94756344:
                if (command.equals("close")) {
                    closeView();
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 96784904:
                if (command.equals("error")) {
                    String contentStringValue11 = JsonUtil.INSTANCE.getContentStringValue(arguments, "code");
                    final boolean parseBoolean2 = Boolean.parseBoolean(JsonUtil.INSTANCE.getContentStringValue(arguments, "fatal"));
                    String contentStringValue12 = JsonUtil.INSTANCE.getContentStringValue(arguments, "errorMessage");
                    final String str6 = contentStringValue11 + " : " + contentStringValue12;
                    final MraidTemplateError mraidTemplateError = new MraidTemplateError(parseBoolean2 ? Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR : Sdk.SDKError.Reason.MRAID_ERROR, str6);
                    ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            MRAIDPresenter.this.handleWebViewException(mraidTemplateError, parseBoolean2, str6);
                        }
                    });
                    break;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 133423073:
                if (command.equals("setOrientationProperties")) {
                    String contentStringValue13 = JsonUtil.INSTANCE.getContentStringValue(arguments, "forceOrientation");
                    String str7 = contentStringValue13;
                    if (str7 != null && str7.length() != 0) {
                        Locale ENGLISH = Locale.ENGLISH;
                        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                        String lowerCase = contentStringValue13.toLowerCase(ENGLISH);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (!Intrinsics.areEqual(lowerCase, X3.i.C)) {
                            if (Intrinsics.areEqual(lowerCase, X3.i.D)) {
                                this.adWidget.setOrientation(7);
                                break;
                            }
                        } else {
                            this.adWidget.setOrientation(6);
                            break;
                        }
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 592314818:
                if (command.equals(UPDATE_SIGNALS)) {
                    String contentStringValue14 = JsonUtil.INSTANCE.getContentStringValue(arguments, "signals");
                    String str8 = contentStringValue14;
                    if (str8 != null && str8.length() != 0) {
                        getSignalManager().updateTemplateSignals(contentStringValue14);
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1496446614:
                if (command.equals(GET_AVAILABLE_DISK_SPACE)) {
                    try {
                        Context context3 = this.adWidget.getContext();
                        File noBackupFilesDir = context3.getNoBackupFilesDir();
                        PathProvider pathProvider = getPathProvider();
                        String path = noBackupFilesDir.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "dir.path");
                        final long availableBytes = pathProvider.getAvailableBytes(path);
                        Utils utils = Utils.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        final long webViewDataSize = utils.getWebViewDataSize(context3);
                        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                VungleWebClient vungleWebClient;
                                vungleWebClient = MRAIDPresenter.this.vungleWebClient;
                                vungleWebClient.notifyDiskAvailableSize(availableBytes, webViewDataSize);
                            }
                        });
                        break;
                    } catch (Exception e) {
                        Logger.INSTANCE.e(TAG, "Failed to get available disk space: " + e.getMessage());
                        break;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            case 1614272768:
                if (command.equals(USE_CUSTOM_CLOSE)) {
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
            default:
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, "Unknown MRAID Command: " + command).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                Logger.INSTANCE.w(TAG, "processCommand# Unknown MRAID Command: " + command);
                break;
        }
        return true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m10706processCommand$lambda11(final MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list = null;
        CommonRequestBody.AdSizeParam adSizeParam = null;
        Call<Void> ri = this$0.getVungleApiClient().ri(new CommonRequestBody.RequestParam(list, adSizeParam, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, (CommonRequestBody.CSBParam) null, 67, (DefaultConstructorMarker) null));
        if (ri == null) {
            Logger.INSTANCE.e(TAG, "Invalid ri call.");
            new NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        } else {
            ri.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
                @Override // com.vungle.ads.internal.network.Callback
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI success");
                }

                @Override // com.vungle.ads.internal.network.Callback
                public void onFailure(Call<Void> call, Throwable t) {
                    LogEntry logEntry;
                    Logger.INSTANCE.d("MRAIDPresenter", "send RI Failure");
                    NetworkUnreachable networkUnreachable = new NetworkUnreachable("Error RI API calls: " + (t != null ? t.getLocalizedMessage() : null));
                    logEntry = MRAIDPresenter.this.getLogEntry();
                    networkUnreachable.setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                }
            });
        }
    }

    private final void makeBusError(VungleError reason) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(reason, this.placement.getReferenceId());
        }
    }

    private final void reportErrorAndCloseAd(VungleError reason) {
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(reason);
        closeView();
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String errorDesc, boolean didCrash) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (didCrash) {
            reportErrorAndCloseAd(new WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView view, Boolean didCrash) {
        boolean booleanValue = didCrash != null ? didCrash.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone("didCrash=" + booleanValue), booleanValue, null, 4, null);
        return true;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError reason, boolean fatal, String errorMessage) {
        Logger.INSTANCE.e(TAG, "handleWebViewException: " + reason.getLocalizedMessage() + ", fatal: " + fatal + ", errorMsg: " + errorMessage);
        reason.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (fatal) {
            makeBusError(reason);
            closeView();
        }
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            return new IndexHtmlError(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD, "Fail to load html " + (file != null ? file.getPath() : null));
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file.getPath());
        return null;
    }

    public final void prepare() {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        VungleError loadMraidAd;
        int settings;
        this.isDestroying.set(false);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer valueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            i = 7;
        } else {
            i = (valueOf != null && valueOf.intValue() == 1) ? 6 : 4;
        }
        this.adWidget.setOrientation(i);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (loadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(loadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (str = presenterDelegate2.getAlertTitleText()) == null) {
            str = "";
        }
        PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (str2 = presenterDelegate3.getAlertBodyText()) == null) {
            str2 = "";
        }
        PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (str3 = presenterDelegate4.getAlertContinueButtonText()) == null) {
            str3 = "";
        }
        PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (str4 = presenterDelegate5.getAlertCloseButtonText()) == null) {
            str4 = "";
        }
        this.advertisement.setIncentivizedText(str, str2, str3, str4);
        boolean z = ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && Intrinsics.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus());
        this.vungleWebClient.setConsentStatus(z, ConfigManager.INSTANCE.getGDPRConsentTitle(), ConfigManager.INSTANCE.getGDPRConsentMessage(), ConfigManager.INSTANCE.getGDPRButtonAccept(), ConfigManager.INSTANCE.getGDPRButtonDeny());
        if (z) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new Runnable() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDPresenter.m10705prepare$lambda15(MRAIDPresenter.this);
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(TtmlNode.START, null, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare$lambda-15, reason: not valid java name */
    public static final void m10705prepare$lambda15(MRAIDPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backEnabled = true;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        if (ConfigManager.INSTANCE.allowAutoRedirects()) {
            return false;
        }
        return this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > ConfigManager.INSTANCE.afterClickDuration();
    }
}
