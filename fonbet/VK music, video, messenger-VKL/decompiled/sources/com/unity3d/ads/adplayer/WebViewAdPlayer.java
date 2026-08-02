package com.unity3d.ads.adplayer;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
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
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.b6l;
import xsna.baj0;
import xsna.dtv0;
import xsna.epx;
import xsna.fvq0;
import xsna.ghn0;
import xsna.gzs;
import xsna.har;
import xsna.icn0;
import xsna.iyx;
import xsna.izs;
import xsna.ksr;
import xsna.kyq0;
import xsna.lsr;
import xsna.m3m;
import xsna.myc0;
import xsna.ovj;
import xsna.pn00;
import xsna.rl3;
import xsna.rmu0;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.thl;
import xsna.utk0;
import xsna.vqe0;
import xsna.vtk0;
import xsna.vvj;
import xsna.wzs;
import xsna.xh50;
import xsna.yvj;
import xsna.ztr;
import xsna.zvj;

/* compiled from: WebViewAdPlayer.kt */
/* loaded from: classes14.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final ovj dispatcher;
    private final xh50<Boolean> isCompletedManually;
    private final ksr<String> onBroadcastEvents;
    private final ksr<LoadEvent> onLoadEvent;
    private final ksr<OfferwallShowEvent.Show> onOfferwallEvent;
    private final baj0<ShowEvent> onShowEvent;
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final izs<StorageEventInfo, s3q0> storageEventCallback;
    private final WebViewContainer webViewContainer;

    /* compiled from: WebViewAdPlayer.kt */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wzs<String, spj<? super s3q0>, Object> {
        public AnonymousClass2(Object obj) {
            super(2, obj, sh50.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // xsna.wzs
        public final Object invoke(String str, spj<? super s3q0> spjVar) {
            return ((sh50) this.receiver).emit(str, spjVar);
        }
    }

    /* compiled from: WebViewAdPlayer.kt */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements wzs<String, spj<? super s3q0>, Object> {
        public AnonymousClass3(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // xsna.wzs
        public final Object invoke(String str, spj<? super s3q0> spjVar) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, spjVar);
        }
    }

    public WebViewAdPlayer(WebViewBridge webViewBridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, ovj ovjVar, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, yvj yvjVar) {
        this.bridge = webViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = ovjVar;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        utk0 a = vtk0.a(Boolean.FALSE);
        this.isCompletedManually = a;
        kyq0 kyq0Var = new kyq0(this, 16);
        this.storageEventCallback = kyq0Var;
        this.scope = zvj.g(zvj.g(yvjVar, ovjVar), new vvj("WebViewAdPlayer"));
        final baj0<Invocation> onInvocation = webViewBridge.getOnInvocation();
        final ksr<Invocation> ksrVar = new ksr<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
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
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                if (rl3.G(new String[]{ExposedFunctionLocation.SHOW_OFFERWALL_AD}, ((Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
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
            public Object collect(lsr<? super Invocation> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        this.onOfferwallEvent = new ksr<OfferwallShowEvent.Show>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
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
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                if (!epx.f(invocation.getLocation(), ExposedFunctionLocation.SHOW_OFFERWALL_AD)) {
                                    throw new IllegalStateException(("Unexpected location: " + invocation.getLocation()).toString());
                                }
                                OfferwallShowEvent.Show show = OfferwallShowEvent.Show.INSTANCE;
                                anonymousClass1.label = 1;
                                if (lsrVar.emit(show, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
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
            public Object collect(lsr<? super OfferwallShowEvent.Show> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        final baj0<Invocation> onInvocation2 = webViewBridge.getOnInvocation();
        final ksr<Invocation> ksrVar2 = new ksr<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
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
                    String[] strArr;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                strArr = WebViewAdPlayerKt.SHOW_EVENTS;
                                if (rl3.G(strArr, ((Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
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
            public Object collect(lsr<? super Invocation> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        this.onShowEvent = rsr.t(new ztr(new ksr<ShowEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00e6 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ShowEvent showEvent;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                String location = invocation.getLocation();
                                switch (location.hashCode()) {
                                    case -1250843874:
                                        if (location.equals(ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT)) {
                                            showEvent = ShowEvent.CancelTimeout.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (lsrVar.emit(showEvent, anonymousClass1) == obj3) {
                                                return obj3;
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -928612193:
                                        if (location.equals(ExposedFunctionLocation.COMPLETED)) {
                                            Object L = rl3.L(invocation.getParameters());
                                            String str = L instanceof String ? (String) L : null;
                                            showEvent = new ShowEvent.Completed(epx.f(str, "COMPLETED") ? ShowStatus.COMPLETED : epx.f(str, "SKIPPED") ? ShowStatus.SKIPPED : ShowStatus.ERROR, null, null, 6, null);
                                            anonymousClass1.label = 1;
                                            if (lsrVar.emit(showEvent, anonymousClass1) == obj3) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -707523043:
                                        if (location.equals(ExposedFunctionLocation.LEFT_APPLICATION)) {
                                            showEvent = ShowEvent.LeftApplication.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (lsrVar.emit(showEvent, anonymousClass1) == obj3) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -497639557:
                                        if (location.equals(ExposedFunctionLocation.CLICKED)) {
                                            showEvent = ShowEvent.Clicked.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (lsrVar.emit(showEvent, anonymousClass1) == obj3) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case -92323172:
                                        if (location.equals(ExposedFunctionLocation.RECEIVED_REWARD)) {
                                            showEvent = ShowEvent.ReceivedReward.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (lsrVar.emit(showEvent, anonymousClass1) == obj3) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case 1039618005:
                                        if (location.equals(ExposedFunctionLocation.STARTED)) {
                                            showEvent = ShowEvent.Started.INSTANCE;
                                            anonymousClass1.label = 1;
                                            if (lsrVar.emit(showEvent, anonymousClass1) == obj3) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    case 1306610281:
                                        if (location.equals(ExposedFunctionLocation.FAILED)) {
                                            JSONObject jSONObject = (JSONObject) rl3.L(invocation.getParameters());
                                            showEvent = new ShowEvent.Error(jSONObject.optString("message"), jSONObject.optInt("code"), "adviewer");
                                            anonymousClass1.label = 1;
                                            if (lsrVar.emit(showEvent, anonymousClass1) == obj3) {
                                            }
                                        }
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                    default:
                                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                                }
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.a(obj2);
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public Object collect(lsr<? super ShowEvent> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, a, new WebViewAdPlayer$onShowEvent$3(null)), getScope(), 10);
        final baj0<Invocation> onInvocation3 = webViewBridge.getOnInvocation();
        final ksr<Invocation> ksrVar3 = new ksr<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
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
                    String[] strArr;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                strArr = WebViewAdPlayerKt.LOAD_EVENTS;
                                if (rl3.G(strArr, ((Invocation) obj).getLocation())) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
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
            public Object collect(lsr<? super Invocation> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        this.onLoadEvent = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(rsr.t(new ksr<LoadEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
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
                    LoadEvent loadEvent;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                Invocation invocation = (Invocation) obj;
                                if (epx.f(invocation.getLocation(), ExposedFunctionLocation.LOAD_ERROR)) {
                                    JSONObject jSONObject = (JSONObject) rl3.L(invocation.getParameters());
                                    loadEvent = new LoadEvent.Error(jSONObject.optString("message"), jSONObject.optInt("code"));
                                } else {
                                    loadEvent = LoadEvent.Completed.INSTANCE;
                                }
                                anonymousClass1.label = 1;
                                if (lsrVar.emit(loadEvent, anonymousClass1) == obj3) {
                                    return obj3;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public Object collect(lsr<? super LoadEvent> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, getScope(), 1));
        final baj0<Invocation> onInvocation4 = webViewBridge.getOnInvocation();
        final ksr<Invocation> ksrVar4 = new ksr<Invocation>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
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
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                if (epx.f(((Invocation) obj).getLocation(), ExposedFunctionLocation.BROADCAST_EVENT)) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
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
            public Object collect(lsr<? super Invocation> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        ksr<String> ksrVar5 = new ksr<String>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
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
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                String obj3 = rl3.L(((Invocation) obj).getParameters()).toString();
                                anonymousClass1.label = 1;
                                if (lsrVar.emit(obj3, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
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
            public Object collect(lsr<? super String> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        this.onBroadcastEvents = ksrVar5;
        Storage.Companion.addStorageEventCallback(kyq0Var);
        iyx.f(yvjVar.getCoroutineContext()).E(new fvq0(this, 24));
        AdPlayer.Companion companion = AdPlayer.Companion;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(ksrVar5, new AnonymousClass2(companion.getBroadcastEventChannel())), getScope());
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(companion.getBroadcastEventChannel(), new AnonymousClass3(this)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 _init_$lambda$9(WebViewAdPlayer webViewAdPlayer, Throwable th) {
        Storage.Companion.removeStorageEventCallback(webViewAdPlayer.storageEventCallback);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent onAllowedPiiChange$lambda$22(byte[] bArr) {
        return new OnAllowedPiiChangeEvent(Base64.encodeToString(bArr, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent onBroadcastEvent$lambda$21(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new OnBroadcastEvent(jSONObject.getString(SignalingProtocol.KEY_EVENT_TYPE), jSONObject.optString("data"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendActivityDestroyed$lambda$17() {
        return new OnActivityDestroyedEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (r4.sendEvent(r1, r2) == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendEvent(gzs<? extends WebViewEvent> gzsVar, spj<? super s3q0> spjVar) {
        WebViewAdPlayer$sendEvent$1 webViewAdPlayer$sendEvent$1;
        int i;
        gzs<? extends WebViewEvent> gzsVar2;
        LoadEvent loadEvent;
        if (spjVar instanceof WebViewAdPlayer$sendEvent$1) {
            webViewAdPlayer$sendEvent$1 = (WebViewAdPlayer$sendEvent$1) spjVar;
            int i2 = webViewAdPlayer$sendEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$sendEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewAdPlayer$sendEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewAdPlayer$sendEvent$1.label;
                if (i != 0) {
                    a.a(obj);
                    ksr<LoadEvent> onLoadEvent = getOnLoadEvent();
                    gzsVar2 = gzsVar;
                    webViewAdPlayer$sendEvent$1.L$0 = gzsVar2;
                    webViewAdPlayer$sendEvent$1.label = 1;
                    obj = rsr.u(onLoadEvent, webViewAdPlayer$sendEvent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    gzsVar2 = (gzs) webViewAdPlayer$sendEvent$1.L$0;
                    a.a(obj);
                }
                loadEvent = (LoadEvent) obj;
                if (!(loadEvent instanceof LoadEvent.Error)) {
                    LoadEvent.Error error = (LoadEvent.Error) loadEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "bridge_send_event_failed", (Double) null, pn00.k(new Pair("reason", "adviewer"), new Pair("reason_debug", error.getMessage()), new Pair("reason_code", String.valueOf(error.getErrorCode()))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                    return s3q0.a;
                }
                WebViewEvent invoke = gzsVar2.invoke();
                WebViewBridge webViewBridge = this.bridge;
                webViewAdPlayer$sendEvent$1.L$0 = null;
                webViewAdPlayer$sendEvent$1.label = 2;
            }
        }
        webViewAdPlayer$sendEvent$1 = new WebViewAdPlayer$sendEvent$1(this, spjVar);
        Object obj2 = webViewAdPlayer$sendEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
        return new OnPrivacyFsmChangeEvent(Base64.encodeToString(bArr, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewEvent sendUserConsentChange$lambda$19(byte[] bArr) {
        return new OnUserConsentChangeEvent(Base64.encodeToString(bArr, 2));
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
    public static final s3q0 storageEventCallback$lambda$0(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo) {
        myc0.h(webViewAdPlayer.getScope(), null, null, new WebViewAdPlayer$storageEventCallback$1$1(webViewAdPlayer, storageEventInfo, null), 3);
        return s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(spj<? super s3q0> spjVar) {
        return AdPlayer.DefaultImpls.destroy(this, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public ksr<LoadEvent> getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public ksr<OfferwallShowEvent.Show> getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public yvj getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new ghn0(bArr, 23), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new har(str, 1), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0170, code lost:
    
        if (r12.bridge.request(com.ironsource.X3.i.K, "show", new java.lang.Object[]{r8}, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestShow(Map<String, ? extends Object> map, spj<? super s3q0> spjVar) {
        WebViewAdPlayer$requestShow$1 webViewAdPlayer$requestShow$1;
        CoroutineSingletons coroutineSingletons;
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
        if (spjVar instanceof WebViewAdPlayer$requestShow$1) {
            webViewAdPlayer$requestShow$1 = (WebViewAdPlayer$requestShow$1) spjVar;
            int i2 = webViewAdPlayer$requestShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewAdPlayer$requestShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewAdPlayer$requestShow$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewAdPlayer$requestShow$1.label;
                if (i != 0) {
                    a.a(obj);
                    DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
                    jSONObject = new JSONObject();
                    jSONObject.put(X3.i.n, this.deviceInfoRepository.getOrientation());
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
                    if (obj != coroutineSingletons) {
                        map2 = map;
                        jSONObject2 = jSONObject;
                        jSONObject3 = jSONObject2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    jSONObject2 = (JSONObject) webViewAdPlayer$requestShow$1.L$4;
                    String str3 = (String) webViewAdPlayer$requestShow$1.L$3;
                    JSONObject jSONObject7 = (JSONObject) webViewAdPlayer$requestShow$1.L$2;
                    jSONObject3 = (JSONObject) webViewAdPlayer$requestShow$1.L$1;
                    map2 = (Map) webViewAdPlayer$requestShow$1.L$0;
                    a.a(obj);
                    str = str3;
                    jSONObject = jSONObject7;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    jSONObject6 = (JSONObject) webViewAdPlayer$requestShow$1.L$4;
                    str2 = (String) webViewAdPlayer$requestShow$1.L$3;
                    jSONObject4 = (JSONObject) webViewAdPlayer$requestShow$1.L$2;
                    jSONObject5 = (JSONObject) webViewAdPlayer$requestShow$1.L$1;
                    map3 = (Map) webViewAdPlayer$requestShow$1.L$0;
                    a.a(obj);
                    jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                    jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(this.deviceInfoRepository.getAllowedPii().getValue().toByteString(), false, 1, null));
                    if (map3 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, ? extends Object> entry : map3.entrySet()) {
                            if (!epx.f(entry.getKey(), "objectId")) {
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
                if (privacyFsm != coroutineSingletons) {
                    jSONObject4 = jSONObject;
                    jSONObject5 = jSONObject3;
                    map3 = map2;
                    str2 = "privacyFsm";
                    obj = privacyFsm;
                    jSONObject6 = jSONObject4;
                    jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null));
                    jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(this.deviceInfoRepository.getAllowedPii().getValue().toByteString(), false, 1, null));
                    if (map3 != null) {
                    }
                    webViewAdPlayer$requestShow$1.L$0 = null;
                    webViewAdPlayer$requestShow$1.L$1 = null;
                    webViewAdPlayer$requestShow$1.L$2 = null;
                    webViewAdPlayer$requestShow$1.L$3 = null;
                    webViewAdPlayer$requestShow$1.L$4 = null;
                    webViewAdPlayer$requestShow$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        webViewAdPlayer$requestShow$1 = new WebViewAdPlayer$requestShow$1(this, spjVar);
        Object obj2 = webViewAdPlayer$requestShow$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
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
        if (privacyFsm != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new vqe0(19), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new m3m(z, 1), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new thl(z, 1), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new icn0(offerwallEvent, 24), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new rmu0(bArr, 3), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new dtv0(bArr, 5), spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(final boolean z, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new gzs() { // from class: xsna.eix0
            @Override // xsna.gzs
            public final Object invoke() {
                WebViewEvent sendVisibilityChange$lambda$15;
                sendVisibilityChange$lambda$15 = WebViewAdPlayer.sendVisibilityChange$lambda$15(z);
                return sendVisibilityChange$lambda$15;
            }
        }, spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(final double d, spj<? super s3q0> spjVar) {
        Object sendEvent = sendEvent(new gzs() { // from class: xsna.fix0
            @Override // xsna.gzs
            public final Object invoke() {
                WebViewEvent sendVolumeChange$lambda$18;
                sendVolumeChange$lambda$18 = WebViewAdPlayer.sendVolumeChange$lambda$18(d);
                return sendVolumeChange$lambda$18;
            }
        }, spjVar);
        return sendEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendEvent : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public baj0<ShowEvent> getOnShowEvent() {
        return this.onShowEvent;
    }
}
