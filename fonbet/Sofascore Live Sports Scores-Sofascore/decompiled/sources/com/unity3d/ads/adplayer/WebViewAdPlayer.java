package com.unity3d.ads.adplayer;

import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.ironsource.C4018c8;
import com.ironsource.U3;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.au3;
import defpackage.b1d;
import defpackage.b98;
import defpackage.bea;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.g0l;
import defpackage.gdi;
import defpackage.gu3;
import defpackage.il4;
import defpackage.kif;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.mh9;
import defpackage.ndk;
import defpackage.o40;
import defpackage.ot8;
import defpackage.p0l;
import defpackage.ph0;
import defpackage.pvd;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.sw9;
import defpackage.tub;
import defpackage.un0;
import defpackage.v98;
import defpackage.weh;
import defpackage.wj0;
import defpackage.xdh;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yf4;
import defpackage.z88;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0017\u001a\u00020\u00162\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b$\u0010\"J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b'\u0010(J\u0018\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b+\u0010,J\u0018\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-H\u0096@¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-H\u0096@¢\u0006\u0004\b1\u00100J\u0018\u00102\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-H\u0096@¢\u0006\u0004\b4\u00100J\u001e\u00108\u001a\u00020\u00162\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0082@¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00160E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010P\u001a\u0004\b[\u0010RR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00130M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010P¨\u0006]"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "bridge", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lau3;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lku3;", "adPlayerScope", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lau3;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/adplayer/WebViewContainer;Lku3;)V", "", "", "", "unityAdsShowOptions", "", "requestShow", "(Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "event", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lrq3;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLrq3;)Ljava/lang/Object;", C4018c8.k, "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "(Lrq3;)Ljava/lang/Object;", "", "volume", "sendVolumeChange", "(DLrq3;)Ljava/lang/Object;", "", U3.i.X, "sendUserConsentChange", "([BLrq3;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onBroadcastEvent", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "onAllowedPiiChange", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "getEvent", "sendEvent", "(Lkotlin/jvm/functions/Function0;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lau3;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lf1d;", "isCompletedManually", "Lf1d;", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "storageEventCallback", "Lkotlin/jvm/functions/Function1;", "scope", "Lku3;", "getScope", "()Lku3;", "Lz88;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "onOfferwallEvent", "Lz88;", "getOnOfferwallEvent", "()Lz88;", "Lxdh;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "onShowEvent", "Lxdh;", "getOnShowEvent", "()Lxdh;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "onLoadEvent", "getOnLoadEvent", "onBroadcastEvents", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewAdPlayer implements AdPlayer {

    @NotNull
    private final WebViewBridge bridge;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final au3 dispatcher;

    @NotNull
    private final f1d isCompletedManually;

    @NotNull
    private final z88 onBroadcastEvents;

    @NotNull
    private final z88 onLoadEvent;

    @NotNull
    private final z88 onOfferwallEvent;

    @NotNull
    private final xdh onShowEvent;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final Function1<StorageEventInfo, Unit> storageEventCallback;

    @NotNull
    private final WebViewContainer webViewContainer;

    public WebViewAdPlayer(@NotNull WebViewBridge webViewBridge, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull au3 au3Var, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull WebViewContainer webViewContainer, @NotNull ku3 ku3Var) {
        webViewBridge.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        au3Var.getClass();
        sendDiagnosticEvent.getClass();
        webViewContainer.getClass();
        ku3Var.getClass();
        this.bridge = webViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = au3Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        fdi a = gdi.a(Boolean.FALSE);
        this.isCompletedManually = a;
        final int i = 1;
        Function1<StorageEventInfo, Unit> function1 = new Function1(this) { // from class: q0l
            public final /* synthetic */ WebViewAdPlayer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$9;
                Unit storageEventCallback$lambda$0;
                int i2 = i;
                WebViewAdPlayer webViewAdPlayer = this.b;
                switch (i2) {
                    case 0:
                        _init_$lambda$9 = WebViewAdPlayer._init_$lambda$9(webViewAdPlayer, (Throwable) obj);
                        return _init_$lambda$9;
                    default:
                        storageEventCallback$lambda$0 = WebViewAdPlayer.storageEventCallback$lambda$0(webViewAdPlayer, (StorageEventInfo) obj);
                        return storageEventCallback$lambda$0;
                }
            }
        };
        this.storageEventCallback = function1;
        this.scope = s9a.F(s9a.F(ku3Var, au3Var), new gu3("WebViewAdPlayer"));
        final xdh onInvocation = webViewBridge.getOnInvocation();
        final z88 z88Var = new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (ph0.v(new String[]{ExposedFunctionLocation.SHOW_OFFERWALL_AD}, ((Invocation) obj).getLocation())) {
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
        };
        this.onOfferwallEvent = new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
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
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
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
                                Invocation invocation = (Invocation) obj;
                                if (!Intrinsics.c(invocation.getLocation(), ExposedFunctionLocation.SHOW_OFFERWALL_AD)) {
                                    pvd.z(invocation.getLocation(), "Unexpected location: ");
                                    return null;
                                }
                                OfferwallShowEvent.Show show = OfferwallShowEvent.Show.INSTANCE;
                                anonymousClass1.label = 1;
                                if (b98Var.emit(show, anonymousClass1) == lu3Var) {
                                    return lu3Var;
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
        };
        final xdh onInvocation2 = webViewBridge.getOnInvocation();
        final z88 z88Var2 = new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
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
                    String[] strArr;
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
                                strArr = WebViewAdPlayerKt.SHOW_EVENTS;
                                if (ph0.v(strArr, ((Invocation) obj).getLocation())) {
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
        };
        yf4 yf4Var = new yf4(new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
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

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00eb A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // defpackage.b98
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, rq3 rq3Var) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Object obj2;
                    if (rq3Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) rq3Var;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            lu3 lu3Var = lu3.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                y6a.M(obj3);
                                b98 b98Var = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                String location = invocation.getLocation();
                                switch (location.hashCode()) {
                                    case -1250843874:
                                        if (location.equals(ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT)) {
                                            obj2 = ShowEvent.CancelTimeout.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                                return lu3Var;
                                            }
                                        }
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                    case -928612193:
                                        if (location.equals(ExposedFunctionLocation.COMPLETED)) {
                                            Object z = ph0.z(invocation.getParameters());
                                            String str = z instanceof String ? (String) z : null;
                                            obj2 = new ShowEvent.Completed(Intrinsics.c(str, "COMPLETED") ? ShowStatus.COMPLETED : Intrinsics.c(str, "SKIPPED") ? ShowStatus.SKIPPED : ShowStatus.ERROR, null, null, 6, null);
                                            anonymousClass1.label = 1;
                                            if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                            }
                                        }
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                    case -707523043:
                                        if (location.equals(ExposedFunctionLocation.LEFT_APPLICATION)) {
                                            obj2 = ShowEvent.LeftApplication.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                            }
                                        }
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                    case -497639557:
                                        if (location.equals(ExposedFunctionLocation.CLICKED)) {
                                            obj2 = ShowEvent.Clicked.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                            }
                                        }
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                    case -92323172:
                                        if (location.equals(ExposedFunctionLocation.RECEIVED_REWARD)) {
                                            obj2 = ShowEvent.ReceivedReward.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                            }
                                        }
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                    case 1039618005:
                                        if (location.equals(ExposedFunctionLocation.STARTED)) {
                                            obj2 = ShowEvent.Started.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                            }
                                        }
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                    case 1306610281:
                                        if (location.equals(ExposedFunctionLocation.FAILED)) {
                                            Object z2 = ph0.z(invocation.getParameters());
                                            z2.getClass();
                                            JSONObject jSONObject = (JSONObject) z2;
                                            int optInt = jSONObject.optInt("code");
                                            String optString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                                            optString.getClass();
                                            obj2 = new ShowEvent.Error(optString, optInt, "adviewer");
                                            anonymousClass1.label = 1;
                                            if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                            }
                                        }
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                    default:
                                        sw9.i(invocation.getLocation(), "Unexpected location: ");
                                        return null;
                                }
                            }
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj3);
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(rq3Var);
                    Object obj32 = anonymousClass1.result;
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
        }, a, new WebViewAdPlayer$onShowEvent$3(null), i);
        ku3 scope = getScope();
        kif kifVar = weh.a;
        this.onShowEvent = un0.H(yf4Var, scope, kifVar, 10);
        final xdh onInvocation3 = webViewBridge.getOnInvocation();
        final z88 z88Var3 = new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
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
                    String[] strArr;
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
                                strArr = WebViewAdPlayerKt.LOAD_EVENTS;
                                if (ph0.v(strArr, ((Invocation) obj).getLocation())) {
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
        };
        this.onLoadEvent = new wj0(un0.H(new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
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
                    Object obj2;
                    if (rq3Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) rq3Var;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            lu3 lu3Var = lu3.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                y6a.M(obj3);
                                b98 b98Var = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                if (Intrinsics.c(invocation.getLocation(), ExposedFunctionLocation.LOAD_ERROR)) {
                                    Object z = ph0.z(invocation.getParameters());
                                    z.getClass();
                                    JSONObject jSONObject = (JSONObject) z;
                                    int optInt = jSONObject.optInt("code");
                                    String optString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                                    optString.getClass();
                                    obj2 = new LoadEvent.Error(optString, optInt);
                                } else {
                                    obj2 = LoadEvent.Completed.INSTANCE;
                                }
                                anonymousClass1.label = 1;
                                if (b98Var.emit(obj2, anonymousClass1) == lu3Var) {
                                    return lu3Var;
                                }
                            } else {
                                if (i != 1) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj3);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(rq3Var);
                    Object obj32 = anonymousClass1.result;
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
        }, getScope(), kifVar, 1), 2);
        final xdh onInvocation4 = webViewBridge.getOnInvocation();
        final z88 z88Var4 = new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
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
                                if (Intrinsics.c(((Invocation) obj).getLocation(), ExposedFunctionLocation.BROADCAST_EVENT)) {
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
        };
        z88 z88Var5 = new z88() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
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
                                String obj3 = ph0.z(((Invocation) obj).getParameters()).toString();
                                anonymousClass1.label = 1;
                                if (b98Var.emit(obj3, anonymousClass1) == lu3Var) {
                                    return lu3Var;
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
        };
        this.onBroadcastEvents = z88Var5;
        Storage.INSTANCE.addStorageEventCallback(function1);
        final int i2 = 0;
        bea.x(ku3Var.getCoroutineContext()).n(new Function1(this) { // from class: q0l
            public final /* synthetic */ WebViewAdPlayer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$9;
                Unit storageEventCallback$lambda$0;
                int i22 = i2;
                WebViewAdPlayer webViewAdPlayer = this.b;
                switch (i22) {
                    case 0:
                        _init_$lambda$9 = WebViewAdPlayer._init_$lambda$9(webViewAdPlayer, (Throwable) obj);
                        return _init_$lambda$9;
                    default:
                        storageEventCallback$lambda$0 = WebViewAdPlayer.storageEventCallback$lambda$0(webViewAdPlayer, (StorageEventInfo) obj);
                        return storageEventCallback$lambda$0;
                }
            }
        });
        AdPlayer.Companion companion = AdPlayer.INSTANCE;
        int i3 = 3;
        fcp.m0(new v98(z88Var5, new AnonymousClass2(companion.getBroadcastEventChannel()), i3), getScope());
        fcp.m0(new v98(companion.getBroadcastEventChannel(), new AnonymousClass3(this), i3), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$9(WebViewAdPlayer webViewAdPlayer, Throwable th) {
        Storage.INSTANCE.removeStorageEventCallback(webViewAdPlayer.storageEventCallback);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent onAllowedPiiChange$lambda$22(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        encodeToString.getClass();
        return new OnAllowedPiiChangeEvent(encodeToString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent onBroadcastEvent$lambda$21(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("eventType");
        String optString = jSONObject.optString("data");
        string.getClass();
        return new OnBroadcastEvent(string, optString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendActivityDestroyed$lambda$17() {
        return new OnActivityDestroyedEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r0.sendEvent(r1, r2) == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendEvent(Function0<? extends WebViewEvent> function0, rq3<? super Unit> rq3Var) {
        WebViewAdPlayer$sendEvent$1 webViewAdPlayer$sendEvent$1;
        int i;
        Function0<? extends WebViewEvent> function02;
        LoadEvent loadEvent;
        if (rq3Var instanceof WebViewAdPlayer$sendEvent$1) {
            webViewAdPlayer$sendEvent$1 = (WebViewAdPlayer$sendEvent$1) rq3Var;
            int i2 = webViewAdPlayer$sendEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$sendEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewAdPlayer$sendEvent$1.result;
                lu3 lu3Var = lu3.a;
                i = webViewAdPlayer$sendEvent$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    z88 onLoadEvent = getOnLoadEvent();
                    function02 = function0;
                    webViewAdPlayer$sendEvent$1.L$0 = function02;
                    webViewAdPlayer$sendEvent$1.label = 1;
                    obj = rd0.S(onLoadEvent, webViewAdPlayer$sendEvent$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function02 = (Function0) webViewAdPlayer$sendEvent$1.L$0;
                    y6a.M(obj);
                }
                loadEvent = (LoadEvent) obj;
                if (!(loadEvent instanceof LoadEvent.Error)) {
                    LoadEvent.Error error = (LoadEvent.Error) loadEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "bridge_send_event_failed", (Double) null, tub.h(new Pair("reason", "adviewer"), new Pair("reason_debug", error.getMessage()), new Pair("reason_code", String.valueOf(error.getErrorCode()))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                    return Unit.a;
                }
                WebViewEvent webViewEvent = (WebViewEvent) function02.invoke();
                WebViewBridge webViewBridge = this.bridge;
                webViewAdPlayer$sendEvent$1.L$0 = null;
                webViewAdPlayer$sendEvent$1.label = 2;
            }
        }
        webViewAdPlayer$sendEvent$1 = new WebViewAdPlayer$sendEvent$1(this, rq3Var);
        Object obj2 = webViewAdPlayer$sendEvent$1.result;
        lu3 lu3Var2 = lu3.a;
        i = webViewAdPlayer$sendEvent$1.label;
        if (i != 0) {
        }
        loadEvent = (LoadEvent) obj2;
        if (!(loadEvent instanceof LoadEvent.Error)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendFocusChange$lambda$16(boolean z) {
        return new OnFocusChangeEvent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendMuteChange$lambda$14(boolean z) {
        return new OnMuteChangeEvent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendOfferwallEvent$lambda$13(OfferwallEvent offerwallEvent) {
        return new OnOfferwallEvent(offerwallEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendPrivacyFsmChange$lambda$20(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        encodeToString.getClass();
        return new OnPrivacyFsmChangeEvent(encodeToString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendUserConsentChange$lambda$19(byte[] bArr) {
        String encodeToString = Base64.encodeToString(bArr, 2);
        encodeToString.getClass();
        return new OnUserConsentChangeEvent(encodeToString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendVisibilityChange$lambda$15(boolean z) {
        return new OnVisibilityChangeEvent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendVolumeChange$lambda$18(double d) {
        return new OnVolumeChangeEvent(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit storageEventCallback$lambda$0(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo) {
        storageEventInfo.getClass();
        xw3.L(webViewAdPlayer.getScope(), null, null, new WebViewAdPlayer$storageEventCallback$1$1(webViewAdPlayer, storageEventInfo, null), 3);
        return Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object destroy(@NotNull rq3<? super Unit> rq3Var) {
        return AdPlayer.DefaultImpls.destroy(this, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        f1d f1dVar = this.isCompletedManually;
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, bool);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public ku3 getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new p0l(bArr, 2), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new o40(str, 3), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        if (r12.bridge.request(com.ironsource.U3.i.K, "show", new java.lang.Object[]{r8}, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull rq3<? super Unit> rq3Var) {
        WebViewAdPlayer$requestShow$1 webViewAdPlayer$requestShow$1;
        lu3 lu3Var;
        int i;
        JSONObject jSONObject;
        String str;
        Map<String, ? extends Object> map2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Object privacyFsm;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        Map<String, ? extends Object> map3;
        String str2;
        JSONObject jSONObject6;
        if (rq3Var instanceof WebViewAdPlayer$requestShow$1) {
            webViewAdPlayer$requestShow$1 = (WebViewAdPlayer$requestShow$1) rq3Var;
            int i2 = webViewAdPlayer$requestShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$requestShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewAdPlayer$requestShow$1.result;
                lu3Var = lu3.a;
                i = webViewAdPlayer$requestShow$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
                    jSONObject = new JSONObject();
                    jSONObject.put(U3.i.n, this.deviceInfoRepository.getOrientation());
                    jSONObject.put("connectionType", this.deviceInfoRepository.getConnectionTypeStr());
                    jSONObject.put("isMuted", this.deviceInfoRepository.getRingerMode() != 2);
                    jSONObject.put("volume", dynamicDeviceInfo.getAndroid().getVolume());
                    SessionRepository sessionRepository = this.sessionRepository;
                    webViewAdPlayer$requestShow$1.L$0 = map;
                    webViewAdPlayer$requestShow$1.L$1 = jSONObject;
                    webViewAdPlayer$requestShow$1.L$2 = jSONObject;
                    str = "privacy";
                    webViewAdPlayer$requestShow$1.L$3 = "privacy";
                    webViewAdPlayer$requestShow$1.L$4 = jSONObject;
                    webViewAdPlayer$requestShow$1.label = 1;
                    obj = sessionRepository.getPrivacy(webViewAdPlayer$requestShow$1);
                    if (obj != lu3Var) {
                        map2 = map;
                        jSONObject2 = jSONObject;
                        jSONObject3 = jSONObject2;
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    jSONObject2 = (JSONObject) webViewAdPlayer$requestShow$1.L$4;
                    String str3 = (String) webViewAdPlayer$requestShow$1.L$3;
                    JSONObject jSONObject7 = (JSONObject) webViewAdPlayer$requestShow$1.L$2;
                    jSONObject3 = (JSONObject) webViewAdPlayer$requestShow$1.L$1;
                    map2 = (Map) webViewAdPlayer$requestShow$1.L$0;
                    y6a.M(obj);
                    str = str3;
                    jSONObject = jSONObject7;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jSONObject6 = (JSONObject) webViewAdPlayer$requestShow$1.L$4;
                    str2 = (String) webViewAdPlayer$requestShow$1.L$3;
                    jSONObject4 = (JSONObject) webViewAdPlayer$requestShow$1.L$2;
                    jSONObject5 = (JSONObject) webViewAdPlayer$requestShow$1.L$1;
                    map3 = (Map) webViewAdPlayer$requestShow$1.L$0;
                    y6a.M(obj);
                    jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                    ByteString byteString = ((AllowedPiiOuterClass.AllowedPii) ((fdi) this.deviceInfoRepository.getAllowedPii()).getValue()).toByteString();
                    byteString.getClass();
                    jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
                    if (map3 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, ? extends Object> entry : map3.entrySet()) {
                            if (!Intrinsics.c(entry.getKey(), "objectId")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            jSONObject4.put("showOptions", new JSONObject(linkedHashMap));
                        }
                    }
                    webViewAdPlayer$requestShow$1.L$0 = null;
                    webViewAdPlayer$requestShow$1.L$1 = null;
                    webViewAdPlayer$requestShow$1.L$2 = null;
                    webViewAdPlayer$requestShow$1.L$3 = null;
                    webViewAdPlayer$requestShow$1.L$4 = null;
                    webViewAdPlayer$requestShow$1.label = 3;
                }
                jSONObject2.put(str, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                SessionRepository sessionRepository2 = this.sessionRepository;
                webViewAdPlayer$requestShow$1.L$0 = map2;
                webViewAdPlayer$requestShow$1.L$1 = jSONObject3;
                webViewAdPlayer$requestShow$1.L$2 = jSONObject;
                webViewAdPlayer$requestShow$1.L$3 = "privacyFsm";
                webViewAdPlayer$requestShow$1.L$4 = jSONObject;
                webViewAdPlayer$requestShow$1.label = 2;
                privacyFsm = sessionRepository2.getPrivacyFsm(webViewAdPlayer$requestShow$1);
                if (privacyFsm != lu3Var) {
                    jSONObject4 = jSONObject;
                    jSONObject5 = jSONObject3;
                    map3 = map2;
                    str2 = "privacyFsm";
                    obj = privacyFsm;
                    jSONObject6 = jSONObject4;
                    jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                    ByteString byteString2 = ((AllowedPiiOuterClass.AllowedPii) ((fdi) this.deviceInfoRepository.getAllowedPii()).getValue()).toByteString();
                    byteString2.getClass();
                    jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
                    if (map3 != null) {
                    }
                    webViewAdPlayer$requestShow$1.L$0 = null;
                    webViewAdPlayer$requestShow$1.L$1 = null;
                    webViewAdPlayer$requestShow$1.L$2 = null;
                    webViewAdPlayer$requestShow$1.L$3 = null;
                    webViewAdPlayer$requestShow$1.L$4 = null;
                    webViewAdPlayer$requestShow$1.label = 3;
                }
                return lu3Var;
            }
        }
        webViewAdPlayer$requestShow$1 = new WebViewAdPlayer$requestShow$1(this, rq3Var);
        Object obj2 = webViewAdPlayer$requestShow$1.result;
        lu3Var = lu3.a;
        i = webViewAdPlayer$requestShow$1.label;
        if (i != 0) {
        }
        jSONObject2.put(str, ProtobufExtensionsKt.toBase64$default((ByteString) obj2, false, 1, null));
        SessionRepository sessionRepository22 = this.sessionRepository;
        webViewAdPlayer$requestShow$1.L$0 = map2;
        webViewAdPlayer$requestShow$1.L$1 = jSONObject3;
        webViewAdPlayer$requestShow$1.L$2 = jSONObject;
        webViewAdPlayer$requestShow$1.L$3 = "privacyFsm";
        webViewAdPlayer$requestShow$1.L$4 = jSONObject;
        webViewAdPlayer$requestShow$1.label = 2;
        privacyFsm = sessionRepository22.getPrivacyFsm(webViewAdPlayer$requestShow$1);
        if (privacyFsm != lu3Var) {
        }
        return lu3Var;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new g0l(7), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new mh9(z, 1), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new mh9(z, 3), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new ndk(offerwallEvent, 3), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new p0l(bArr, 1), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new p0l(bArr, 0), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new mh9(z, 2), rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(final double d, @NotNull rq3<? super Unit> rq3Var) {
        Object sendEvent = sendEvent(new Function0() { // from class: r0l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewEvent sendVolumeChange$lambda$18;
                sendVolumeChange$lambda$18 = WebViewAdPlayer.sendVolumeChange$lambda$18(d);
                return sendVolumeChange$lambda$18;
            }
        }, rq3Var);
        return sendEvent == lu3.a ? sendEvent : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public xdh getOnShowEvent() {
        return this.onShowEvent;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends ot8 implements Function2<String, rq3<? super Unit>, Object> {
        public AnonymousClass2(Object obj) {
            super(2, 0, b1d.class, obj, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, rq3<? super Unit> rq3Var) {
            return ((b1d) this.receiver).emit(str, rq3Var);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends ot8 implements Function2<String, rq3<? super Unit>, Object> {
        public AnonymousClass3(Object obj) {
            super(2, 0, WebViewAdPlayer.class, obj, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, rq3<? super Unit> rq3Var) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, rq3Var);
        }
    }
}
