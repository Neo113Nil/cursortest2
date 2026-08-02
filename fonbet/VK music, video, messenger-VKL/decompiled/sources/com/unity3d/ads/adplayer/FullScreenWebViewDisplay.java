package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.unity3d.ads.R;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.json.JSONObject;
import xsna.b6l;
import xsna.bpn0;
import xsna.cb0;
import xsna.d37;
import xsna.epx;
import xsna.fpf0;
import xsna.g5z;
import xsna.gzs;
import xsna.hb0;
import xsna.ksr;
import xsna.lq9;
import xsna.lsr;
import xsna.m180;
import xsna.mnh0;
import xsna.msy;
import xsna.myc0;
import xsna.oek0;
import xsna.oqx0;
import xsna.pce;
import xsna.ppx0;
import xsna.rsr;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.trf;
import xsna.xvs;
import xsna.xwm0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: FullScreenWebViewDisplay.kt */
/* loaded from: classes14.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {
    private final Lazy adObject$delegate;
    private final Lazy dispatchers$delegate;
    private final Lazy navBarMode$delegate;
    private String opportunityId = "";
    private final Lazy sendDiagnosticEvent$delegate;
    private final Lazy sessionRepository$delegate;
    private Map<String, ? extends Object> showOptions;
    private final hb0<Intent> startForResult;

    public FullScreenWebViewDisplay() {
        final String str = "";
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.sendDiagnosticEvent$delegate = msy.a(lazyThreadSafetyMode, new gzs<SendDiagnosticEvent>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // xsna.gzs
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(SendDiagnosticEvent.class));
            }
        });
        this.adObject$delegate = new bpn0(new trf(this, 27));
        this.dispatchers$delegate = msy.a(lazyThreadSafetyMode, new gzs<ISDKDispatchers>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.domain.ISDKDispatchers, java.lang.Object] */
            @Override // xsna.gzs
            public final ISDKDispatchers invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(ISDKDispatchers.class));
            }
        });
        this.sessionRepository$delegate = msy.a(lazyThreadSafetyMode, new gzs<SessionRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.SessionRepository, java.lang.Object] */
            @Override // xsna.gzs
            public final SessionRepository invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(SessionRepository.class));
            }
        });
        this.navBarMode$delegate = new bpn0(new pce(this, 27));
        this.startForResult = registerForActivityResult(new cb0(), new xvs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdObject adObject_delegate$lambda$2(final FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        Object failure;
        final String str = "";
        try {
            failure = adObject_delegate$lambda$2$lambda$0(msy.a(LazyThreadSafetyMode.NONE, new gzs<AdRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject_delegate$lambda$2$$inlined$inject$default$1
                /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
                @Override // xsna.gzs
                public final AdRepository invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str, fpf0.a(AdRepository.class));
                }
            })).getAd(ProtobufExtensionsKt.toByteString(UUID.fromString(fullScreenWebViewDisplay.opportunityId)));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (AdObject) failure;
    }

    private static final AdRepository adObject_delegate$lambda$2$lambda$0(Lazy<? extends AdRepository> lazy) {
        return lazy.getValue();
    }

    private final void applyNavBarMode() {
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_UNSPECIFIED) {
            return;
        }
        ppx0.b(getWindow(), false);
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_HIDDEN) {
            hideSystemNavBar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers$delegate.getValue();
    }

    private final NativeConfigurationOuterClass.FullscreenNavBarMode getNavBarMode() {
        return (NativeConfigurationOuterClass.FullscreenNavBarMode) this.navBarMode$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    private final SessionRepository getSessionRepository() {
        return (SessionRepository) this.sessionRepository$delegate.getValue();
    }

    private final void hideSystemNavBar() {
        Window window = getWindow();
        oek0 oek0Var = new oek0(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        fVar.b(2);
        fVar.g(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(spj<? super s3q0> spjVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        final xwm0 xwm0Var = new xwm0(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, lq9Var, null));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                @b6l(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = lsrVar;
                    this.this$0 = fullScreenWebViewDisplay;
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
            public Object collect(lsr<? super DisplayMessage> lsrVar, spj spjVar2) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, this), spjVar2);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), g5z.a(this));
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        myc0.h(zvj.a(getDispatchers().getMain()), null, null, new FullScreenWebViewDisplay$loadWebView$1(webView, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeConfigurationOuterClass.FullscreenNavBarMode navBarMode_delegate$lambda$3(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.getSessionRepository().getFeatureFlags().getFullscreenNavBarMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 onCreate$lambda$8(m180 m180Var) {
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(String str, Intent intent, boolean z) {
        Object failure;
        try {
            if (z) {
                this.startForResult.a(intent);
            } else {
                intent.setFlags(268435456);
                startActivity(intent);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        myc0.h(g5z.a(this), getDispatchers().getDefault(), null, new FullScreenWebViewDisplay$openUrl$1(str, !(failure instanceof Result.Failure), null), 2);
    }

    public static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, String str, Intent intent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        yvj scope;
        Object failure;
        Map<String, ? extends Object> map;
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_TRANSPARENT) {
            setTheme(R.style.Theme_UnityAds_FullScreen_TransparentNav);
        }
        super.onCreate(bundle);
        applyNavBarMode();
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        AdObject adObject = getAdObject();
        if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null && bundle == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_webview_less_ad_activity_launched", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
        }
        if (epx.f(this.opportunityId, "not_provided")) {
            setResult(0);
            myc0.h(zvj.a(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$1(this, null), 3);
            finish();
            return;
        }
        AdObject adObject2 = getAdObject();
        AdPlayer adPlayer = adObject2 != null ? adObject2.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !zvj.f(scope)) {
            setResult(0);
            myc0.h(zvj.a(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$2(this, null), 3);
            finish();
            return;
        }
        boolean hasExtra = getIntent().hasExtra(X3.i.n);
        Boolean valueOf = Boolean.valueOf(hasExtra);
        if (!hasExtra) {
            valueOf = null;
        }
        if (valueOf != null) {
            setRequestedOrientation(getIntent().getIntExtra(X3.i.n, -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                failure = JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            map = (Map) failure;
        } else {
            map = null;
        }
        this.showOptions = map;
        myc0.h(g5z.a(this), null, null, new FullScreenWebViewDisplay$onCreate$6(this, null), 3);
        mnh0.c(getOnBackPressedDispatcher(), this, new d37(18), 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            myc0.h(zvj.a(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onDestroy$1(this, null), 3);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 4;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        myc0.h(zvj.a(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$1(this, null), 3);
        if (isFinishing()) {
            myc0.h(zvj.a(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$2(this, null), 3);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        myc0.h(zvj.a(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onResume$1(this, null), 3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_HIDDEN) {
            hideSystemNavBar();
        }
        myc0.h(zvj.a(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, z, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$12(ActivityResult activityResult) {
    }
}
