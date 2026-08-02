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
import com.ironsource.U3;
import com.unity3d.ads.R;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.aal;
import defpackage.b98;
import defpackage.bea;
import defpackage.bka;
import defpackage.ce;
import defpackage.de;
import defpackage.duf;
import defpackage.fcp;
import defpackage.gki;
import defpackage.il4;
import defpackage.is8;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.ol8;
import defpackage.p2g;
import defpackage.pea;
import defpackage.ppd;
import defpackage.rq3;
import defpackage.s6a;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.u2g;
import defpackage.upd;
import defpackage.v98;
import defpackage.w2g;
import defpackage.wca;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y9l;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z88;
import defpackage.z9a;
import defpackage.z9l;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010&R&\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010CR\"\u0010G\u001a\u0010\u0012\f\u0012\n F*\u0004\u0018\u00010\u001b0\u001b0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K²\u0006\f\u0010J\u001a\u00020I8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullScreenWebViewDisplay;", "Landroidx/activity/ComponentActivity;", "Lcom/unity3d/services/core/di/IServiceComponent;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", U3.i.u0, U3.i.t0, "onDestroy", "hasFocus", "onWindowFocusChanged", "(Z)V", "listenToAdPlayerEvents", "(Lrq3;)Ljava/lang/Object;", "", "opportunityId", "Landroid/content/Intent;", "intent", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "openUrl", "(Ljava/lang/String;Landroid/content/Intent;Z)V", "Landroid/webkit/WebView;", "webView", "loadWebView", "(Landroid/webkit/WebView;)V", "applyNavBarMode", "hideSystemNavBar", "Ljava/lang/String;", "", "", "showOptions", "Ljava/util/Map;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent$delegate", "Ljoa;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers$delegate", "getDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository$delegate", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FullscreenNavBarMode;", "navBarMode$delegate", "getNavBarMode", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FullscreenNavBarMode;", "navBarMode", "Lde;", "kotlin.jvm.PlatformType", "startForResult", "Lde;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity implements IServiceComponent {

    /* renamed from: adObject$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa adObject;

    /* renamed from: dispatchers$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa dispatchers;

    /* renamed from: navBarMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa navBarMode;

    @NotNull
    private String opportunityId = "";

    /* renamed from: sendDiagnosticEvent$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa sendDiagnosticEvent;

    /* renamed from: sessionRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa sessionRepository;

    @Nullable
    private Map<String, ? extends Object> showOptions;

    @NotNull
    private final de startForResult;

    public FullScreenWebViewDisplay() {
        final String str = "";
        ysa ysaVar = ysa.c;
        this.sendDiagnosticEvent = ypa.a(ysaVar, new Function0<SendDiagnosticEvent>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(SendDiagnosticEvent.class));
            }
        });
        final int i = 0;
        this.adObject = ypa.b(new Function0(this) { // from class: hs8
            public final /* synthetic */ FullScreenWebViewDisplay b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdObject adObject_delegate$lambda$2;
                NativeConfigurationOuterClass.FullscreenNavBarMode navBarMode_delegate$lambda$3;
                int i2 = i;
                FullScreenWebViewDisplay fullScreenWebViewDisplay = this.b;
                switch (i2) {
                    case 0:
                        adObject_delegate$lambda$2 = FullScreenWebViewDisplay.adObject_delegate$lambda$2(fullScreenWebViewDisplay);
                        return adObject_delegate$lambda$2;
                    default:
                        navBarMode_delegate$lambda$3 = FullScreenWebViewDisplay.navBarMode_delegate$lambda$3(fullScreenWebViewDisplay);
                        return navBarMode_delegate$lambda$3;
                }
            }
        });
        this.dispatchers = ypa.a(ysaVar, new Function0<ISDKDispatchers>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.services.core.domain.ISDKDispatchers, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ISDKDispatchers invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(ISDKDispatchers.class));
            }
        });
        this.sessionRepository = ypa.a(ysaVar, new Function0<SessionRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.data.repository.SessionRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final SessionRepository invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(SessionRepository.class));
            }
        });
        final int i2 = 1;
        this.navBarMode = ypa.b(new Function0(this) { // from class: hs8
            public final /* synthetic */ FullScreenWebViewDisplay b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdObject adObject_delegate$lambda$2;
                NativeConfigurationOuterClass.FullscreenNavBarMode navBarMode_delegate$lambda$3;
                int i22 = i2;
                FullScreenWebViewDisplay fullScreenWebViewDisplay = this.b;
                switch (i22) {
                    case 0:
                        adObject_delegate$lambda$2 = FullScreenWebViewDisplay.adObject_delegate$lambda$2(fullScreenWebViewDisplay);
                        return adObject_delegate$lambda$2;
                    default:
                        navBarMode_delegate$lambda$3 = FullScreenWebViewDisplay.navBarMode_delegate$lambda$3(fullScreenWebViewDisplay);
                        return navBarMode_delegate$lambda$3;
                }
            }
        });
        de registerForActivityResult = registerForActivityResult(new ce(3), new is8(i));
        registerForActivityResult.getClass();
        this.startForResult = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdObject adObject_delegate$lambda$2(final FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        Object u2gVar;
        final String str = "";
        joa a = ypa.a(ysa.c, new Function0<AdRepository>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject_delegate$lambda$2$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final AdRepository invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, duf.a.getOrCreateKotlinClass(AdRepository.class));
            }
        });
        try {
            p2g p2gVar = w2g.b;
            AdRepository adObject_delegate$lambda$2$lambda$0 = adObject_delegate$lambda$2$lambda$0(a);
            UUID fromString = UUID.fromString(fullScreenWebViewDisplay.opportunityId);
            fromString.getClass();
            u2gVar = adObject_delegate$lambda$2$lambda$0.getAd(ProtobufExtensionsKt.toByteString(fromString));
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return (AdObject) u2gVar;
    }

    private static final AdRepository adObject_delegate$lambda$2$lambda$0(joa joaVar) {
        return (AdRepository) joaVar.getValue();
    }

    private final void applyNavBarMode() {
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_UNSPECIFIED) {
            return;
        }
        bea.L(getWindow(), false);
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_HIDDEN) {
            hideSystemNavBar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers.getValue();
    }

    private final NativeConfigurationOuterClass.FullscreenNavBarMode getNavBarMode() {
        Object value = this.navBarMode.getValue();
        value.getClass();
        return (NativeConfigurationOuterClass.FullscreenNavBarMode) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent.getValue();
    }

    private final SessionRepository getSessionRepository() {
        return (SessionRepository) this.sessionRepository.getValue();
    }

    private final void hideSystemNavBar() {
        Window window = getWindow();
        bka bkaVar = new bka(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        aalVar.x(2);
        aalVar.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenToAdPlayerEvents(rq3<? super Unit> rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        final gki gkiVar = new gki(AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, lj2Var, null));
        fcp.m0(new v98(new z88() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                @il4(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$10$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(b98 b98Var, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = b98Var;
                    this.this$0 = fullScreenWebViewDisplay;
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
            public Object collect(b98 b98Var, rq3 rq3Var2) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var, this), rq3Var2);
                return collect == lu3.a ? collect : Unit.a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null), 3), wca.x(getLifecycle()));
        Object q = lj2Var.q();
        return q == lu3.a ? q : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        xw3.L(s9a.c(getDispatchers().getMain()), null, null, new FullScreenWebViewDisplay$loadWebView$1(webView, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeConfigurationOuterClass.FullscreenNavBarMode navBarMode_delegate$lambda$3(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        return fullScreenWebViewDisplay.getSessionRepository().getFeatureFlags().getFullscreenNavBarMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(ppd ppdVar) {
        ppdVar.getClass();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrl(String opportunityId, Intent intent, boolean useActivityForResult) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            if (useActivityForResult) {
                this.startForResult.a(intent, null);
            } else {
                intent.setFlags(268435456);
                startActivity(intent);
            }
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        xw3.L(wca.x(getLifecycle()), getDispatchers().getDefault(), null, new FullScreenWebViewDisplay$openUrl$1(opportunityId, !(u2gVar instanceof u2g), null), 2);
    }

    public static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, String str, Intent intent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ku3 scope;
        Object u2gVar;
        Map<String, ? extends Object> map;
        if (getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_TRANSPARENT) {
            setTheme(R.style.Theme_UnityAds_FullScreen_TransparentNav);
        }
        super.onCreate(savedInstanceState);
        applyNavBarMode();
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        AdObject adObject = getAdObject();
        if ((adObject != null ? adObject.getWebViewLessLoadingRequiredData() : null) != null && savedInstanceState == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(getSendDiagnosticEvent(), "native_webview_less_ad_activity_launched", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
        }
        if (Intrinsics.c(this.opportunityId, "not_provided")) {
            setResult(0);
            xw3.L(s9a.c(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$1(this, null), 3);
            finish();
            return;
        }
        AdObject adObject2 = getAdObject();
        AdPlayer adPlayer = adObject2 != null ? adObject2.getAdPlayer() : null;
        if (adPlayer == null || (scope = adPlayer.getScope()) == null || !s9a.w(scope)) {
            setResult(0);
            xw3.L(s9a.c(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onCreate$2(this, null), 3);
            finish();
            return;
        }
        boolean hasExtra = getIntent().hasExtra(U3.i.n);
        Boolean valueOf = Boolean.valueOf(hasExtra);
        if (!hasExtra) {
            valueOf = null;
        }
        if (valueOf != null) {
            setRequestedOrientation(getIntent().getIntExtra(U3.i.n, -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        if (stringExtra2 != null) {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2));
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            map = (Map) u2gVar;
        } else {
            map = null;
        }
        this.showOptions = map;
        xw3.L(wca.x(getLifecycle()), null, null, new FullScreenWebViewDisplay$onCreate$6(this, null), 3);
        upd onBackPressedDispatcher = getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        s6a.o(onBackPressedDispatcher, this, new ol8(9));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            xw3.L(s9a.c(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onDestroy$1(this, null), 3);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        return keyCode == 4;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        xw3.L(s9a.c(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$1(this, null), 3);
        if (isFinishing()) {
            xw3.L(s9a.c(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onPause$2(this, null), 3);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        xw3.L(s9a.c(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onResume$1(this, null), 3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && getNavBarMode() == NativeConfigurationOuterClass.FullscreenNavBarMode.FULLSCREEN_NAV_BAR_MODE_HIDDEN) {
            hideSystemNavBar();
        }
        xw3.L(s9a.c(getDispatchers().getDefault()), null, null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, hasFocus, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$12(ActivityResult activityResult) {
    }
}
