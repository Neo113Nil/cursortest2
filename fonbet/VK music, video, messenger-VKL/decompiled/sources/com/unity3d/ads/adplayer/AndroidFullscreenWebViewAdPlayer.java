package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.X3;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
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
import defpackage.j;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.json.JSONObject;
import xsna.b6l;
import xsna.baj0;
import xsna.bpn0;
import xsna.epx;
import xsna.eyx;
import xsna.iyx;
import xsna.ksr;
import xsna.lsr;
import xsna.lyd;
import xsna.myc0;
import xsna.o7i;
import xsna.p7i;
import xsna.r570;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.u8;
import xsna.xwm0;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
/* loaded from: classes14.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final sh50<DisplayMessage> displayMessages = lyd.b(0, 0, null, 7);
    private final AdRepository adRepository;
    private final Context context;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;
    private final Lazy adObject$delegate = new bpn0(new j(this, 7));
    private final AtomicBoolean wasDestroyed = new AtomicBoolean(false);

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final sh50<DisplayMessage> getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String str, AndroidWebViewContainer androidWebViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdObject adObject_delegate$lambda$1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        Object failure;
        try {
            failure = androidFullscreenWebViewAdPlayer.adRepository.getAd(ProtobufExtensionsKt.toByteString(UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId)));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (AdObject) failure;
    }

    private final eyx displayEventsRouter(DisplayMessage displayMessage) {
        return myc0.h(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3);
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent getIntent(Context context, AndroidShowOptions androidShowOptions, int i) {
        Intent intent = new Intent(context, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(i);
        intent.putExtra(X3.i.n, this.orientationRepository.getResumedActivityOrientation().getValue().intValue());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, spj<? super s3q0> spjVar) {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            Object sendUserConsentChange = this.webViewAdPlayer.sendUserConsentChange(((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray(), spjVar);
            return sendUserConsentChange == CoroutineSingletons.COROUTINE_SUSPENDED ? sendUserConsentChange : s3q0.a;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            throw new NoWhenBranchMatchedException();
        }
        Object sendPrivacyFsmChange = this.webViewAdPlayer.sendPrivacyFsmChange(((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray(), spjVar);
        return sendPrivacyFsmChange == CoroutineSingletons.COROUTINE_SUSPENDED ? sendPrivacyFsmChange : s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, spj<? super s3q0> spjVar) {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), spjVar);
            return sendMuteChange == CoroutineSingletons.COROUTINE_SUSPENDED ? sendMuteChange : s3q0.a;
        }
        if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            throw new NoWhenBranchMatchedException();
        }
        Object sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), spjVar);
        return sendVolumeChange == CoroutineSingletons.COROUTINE_SUSPENDED ? sendVolumeChange : s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, spj spjVar) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 show$lambda$7(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Throwable th) {
        if (th != null) {
            myc0.h(zvj.a(androidFullscreenWebViewAdPlayer.getScope().getCoroutineContext().plus(r570.b)), null, null, new AndroidFullscreenWebViewAdPlayer$show$10$1(androidFullscreenWebViewAdPlayer, null), 3);
        }
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r8, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r9.destroy(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (xsna.qsl.b(1000, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r9.emit(r2, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(spj<? super s3q0> spjVar) {
        AndroidFullscreenWebViewAdPlayer$destroy$1 androidFullscreenWebViewAdPlayer$destroy$1;
        int i;
        if (spjVar instanceof AndroidFullscreenWebViewAdPlayer$destroy$1) {
            androidFullscreenWebViewAdPlayer$destroy$1 = (AndroidFullscreenWebViewAdPlayer$destroy$1) spjVar;
            int i2 = androidFullscreenWebViewAdPlayer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidFullscreenWebViewAdPlayer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidFullscreenWebViewAdPlayer$destroy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidFullscreenWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    a.a(obj);
                    if (this.wasDestroyed.getAndSet(true)) {
                        return s3q0.a;
                    }
                    this.webViewAdPlayer.dispatchShowCompleted();
                    sh50<DisplayMessage> sh50Var = displayMessages;
                    DisplayMessage.DisplayFinishRequest displayFinishRequest = new DisplayMessage.DisplayFinishRequest(this.opportunityId);
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 1;
                } else if (i == 1) {
                    a.a(obj);
                } else if (i == 2) {
                    a.a(obj);
                    AndroidWebViewContainer webViewContainer = getWebViewContainer();
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    a.a(obj);
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 4;
                }
                if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
                    androidFullscreenWebViewAdPlayer$destroy$1.label = 2;
                }
                AndroidWebViewContainer webViewContainer2 = getWebViewContainer();
                androidFullscreenWebViewAdPlayer$destroy$1.label = 3;
            }
        }
        androidFullscreenWebViewAdPlayer$destroy$1 = new AndroidFullscreenWebViewAdPlayer$destroy$1(this, spjVar);
        Object obj2 = androidFullscreenWebViewAdPlayer$destroy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
    public ksr<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public ksr<OfferwallShowEvent> getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public ksr<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public yvj getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.requestShow(map, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendFocusChange(z, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendMuteChange(z, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendVolumeChange(d, spjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.content.Context] */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
        o7i a = p7i.a();
        final xwm0 xwm0Var = new xwm0(displayMessages, new AndroidFullscreenWebViewAdPlayer$show$1(a, null));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                @b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = lsrVar;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
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
                    String str;
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
                                String opportunityId = ((DisplayMessage) obj).getOpportunityId();
                                str = this.this$0.opportunityId;
                                if (epx.f(opportunityId, str)) {
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
            public Object collect(lsr<? super DisplayMessage> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, this), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$3(this)), getScope());
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$4(this)), getScope());
        final baj0<ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
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
                                ShowEvent showEvent = (ShowEvent) obj;
                                if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
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
            public Object collect(lsr<? super ShowEvent> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$6(this, null)), getScope());
        final baj0<ShowEvent> onShowEvent2 = this.webViewAdPlayer.getOnShowEvent();
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1, reason: invalid class name */
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
                                if (((ShowEvent) obj) instanceof ShowEvent.Started) {
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
            public Object collect(lsr<? super ShowEvent> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new AndroidFullscreenWebViewAdPlayer$show$8(this, null)), getScope());
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$9(this)), getScope());
        iyx.f(getScope().getCoroutineContext()).E(new u8(this, 5));
        AdObject adObject = getAdObject();
        WeakReference<Activity> activity = adObject != null ? adObject.getActivity() : null;
        ?? r4 = activity != null ? activity.get() : 0;
        boolean z = r4 != 0;
        if (z) {
            ClientProperties.setActivity(r4);
        }
        if (activity != null && !z) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_activity_not_available", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, (ByteString) null, 110, (Object) null);
        }
        if (isOfferwallAd) {
            myc0.h(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$12(a, this, showOptions, null), 3);
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
        if (!z2) {
            r4 = this.context;
        }
        Context context = r4;
        myc0.h(getScope(), null, null, new AndroidFullscreenWebViewAdPlayer$show$11(a, context, getIntent(context, androidShowOptions, intValue), intValue, 268500992, this, showOptions, null), 3);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
