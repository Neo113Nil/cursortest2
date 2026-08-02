package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.ad2;
import defpackage.au3;
import defpackage.b98;
import defpackage.bsk;
import defpackage.ddi;
import defpackage.dii;
import defpackage.eed;
import defpackage.f1d;
import defpackage.f6;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.gu3;
import defpackage.h2d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.j2d;
import defpackage.ku3;
import defpackage.l1;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.srk;
import defpackage.u2g;
import defpackage.u4a;
import defpackage.u9l;
import defpackage.un0;
import defpackage.v98;
import defpackage.w2g;
import defpackage.x9l;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z88;
import defpackage.zu4;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 A2\u00020\u0001:\u0001ABO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J \u0010'\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b)\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0017\u00102\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001f\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Landroid/webkit/WebView;", "webView", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "webViewClient", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "sendWebViewClientErrorDiagnostics", "Lau3;", "mainDispatcher", "defaultDispatcher", "Lku3;", "adPlayerScope", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Landroid/webkit/WebView;Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;Lau3;Lau3;Lku3;Landroid/content/Context;Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "", "onRenderProcessGone", "(Lrq3;)Ljava/lang/Object;", "applySafeAreaInsets", "()V", "", "url", "loadUrl", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "evaluateJavascript", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewBridgeInterface", "name", "addJavascriptInterface", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "destroy", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/model/AdObject;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "scope", "Lku3;", "getScope", "()Lku3;", "Lf1d;", "Landroid/view/InputEvent;", "_lastInputEvent", "Lf1d;", "get_lastInputEvent", "()Lf1d;", "Lddi;", "lastInputEvent", "Lddi;", "getLastInputEvent", "()Lddi;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidWebViewContainer implements WebViewContainer {

    @NotNull
    private static final String JS_CLOSING_PARENTHESES = ")";

    @NotNull
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";

    @NotNull
    private static final String JS_OPENING_PARENTHESES = "(";

    @NotNull
    private static final String JS_SEMICOLON = ";";

    @NotNull
    private final f1d _lastInputEvent;

    @NotNull
    private final AdObject adObject;

    @NotNull
    private final Context context;

    @NotNull
    private final ddi lastInputEvent;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    @NotNull
    private final WebView webView;

    @NotNull
    private final AndroidWebViewClient webViewClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(4096);

    @NotNull
    private static final h2d SHARED_STRING_MUTEX = new j2d();

    public AndroidWebViewContainer(@NotNull WebView webView, @NotNull AndroidWebViewClient androidWebViewClient, @NotNull SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, @NotNull au3 au3Var, @NotNull au3 au3Var2, @NotNull ku3 ku3Var, @NotNull Context context, @NotNull AdObject adObject, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        webView.getClass();
        androidWebViewClient.getClass();
        sendWebViewClientErrorDiagnostics.getClass();
        au3Var.getClass();
        au3Var2.getClass();
        ku3Var.getClass();
        context.getClass();
        adObject.getClass();
        sendDiagnosticEvent.getClass();
        this.webView = webView;
        this.webViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        this.adObject = adObject;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        ad2 F = s9a.F(s9a.F(ku3Var, au3Var), new gu3("AndroidWebViewContainer"));
        this.scope = F;
        fdi a = gdi.a(null);
        this._lastInputEvent = a;
        this.lastInputEvent = un0.u(a);
        final ddi isRenderProcessGone = androidWebViewClient.getIsRenderProcessGone();
        fcp.m0(new v98(new z88() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((Boolean) obj).booleanValue()) {
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
        }, new AnonymousClass2(null), 3), s9a.F(F, au3Var2));
        webView.setOnTouchListener(new f6(this, 1));
        applySafeAreaInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer androidWebViewContainer, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        fdi fdiVar = (fdi) androidWebViewContainer._lastInputEvent;
        fdiVar.getClass();
        fdiVar.m(null, motionEvent);
        return false;
    }

    private final void applySafeAreaInsets() {
        WebView webView = this.webView;
        l1 l1Var = new l1(this, 4);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(webView, l1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x9l applySafeAreaInsets$lambda$6(AndroidWebViewContainer androidWebViewContainer, View view, x9l x9lVar) {
        Object u2gVar;
        view.getClass();
        x9lVar.getClass();
        u9l u9lVar = x9lVar.a;
        u4a i = u9lVar.i(519);
        i.getClass();
        u4a i2 = u9lVar.i(128);
        i2.getClass();
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Float.valueOf(androidWebViewContainer.context.getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Object valueOf = Float.valueOf(1.0f);
        if (u2gVar instanceof u2g) {
            u2gVar = valueOf;
        }
        float floatValue = ((Number) u2gVar).floatValue();
        int applySafeAreaInsets$lambda$6$toPx = applySafeAreaInsets$lambda$6$toPx(Math.max(i.a, i2.a), floatValue);
        int applySafeAreaInsets$lambda$6$toPx2 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.b, i2.b), floatValue);
        int applySafeAreaInsets$lambda$6$toPx3 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.c, i2.c), floatValue);
        int applySafeAreaInsets$lambda$6$toPx4 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.d, i2.d), floatValue);
        StringBuilder s = lnb.s(applySafeAreaInsets$lambda$6$toPx, applySafeAreaInsets$lambda$6$toPx3, "\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", "px');\n                    root.style.setProperty('--safe-area-inset-right', '", "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        s.append(applySafeAreaInsets$lambda$6$toPx2);
        s.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        s.append(applySafeAreaInsets$lambda$6$toPx4);
        s.append("px');\n                })();\n            ");
        xw3.L(androidWebViewContainer.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(androidWebViewContainer, dii.c(s.toString()), null), 3);
        return x9lVar;
    }

    private static final int applySafeAreaInsets$lambda$6$toPx(int i, float f) {
        return (int) (i / f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onRenderProcessGone(rq3<? super Unit> rq3Var) {
        AndroidWebViewContainer$onRenderProcessGone$1 androidWebViewContainer$onRenderProcessGone$1;
        int i;
        if (rq3Var instanceof AndroidWebViewContainer$onRenderProcessGone$1) {
            androidWebViewContainer$onRenderProcessGone$1 = (AndroidWebViewContainer$onRenderProcessGone$1) rq3Var;
            int i2 = androidWebViewContainer$onRenderProcessGone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$onRenderProcessGone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$onRenderProcessGone$1.result;
                Object obj2 = lu3.a;
                i = androidWebViewContainer$onRenderProcessGone$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    androidWebViewContainer$onRenderProcessGone$1.label = 1;
                    if (destroy(androidWebViewContainer$onRenderProcessGone$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                this.sendWebViewClientErrorDiagnostics.invoke(a.c(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)), this.adObject);
                return Unit.a;
            }
        }
        androidWebViewContainer$onRenderProcessGone$1 = new AndroidWebViewContainer$onRenderProcessGone$1(this, rq3Var);
        Object obj3 = androidWebViewContainer$onRenderProcessGone$1.result;
        Object obj22 = lu3.a;
        i = androidWebViewContainer$onRenderProcessGone$1.label;
        if (i != 0) {
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
        this.sendWebViewClientErrorDiagnostics.invoke(a.c(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)), this.adObject);
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        AndroidWebViewContainer$addJavascriptInterface$1 androidWebViewContainer$addJavascriptInterface$1;
        int i;
        if (rq3Var instanceof AndroidWebViewContainer$addJavascriptInterface$1) {
            androidWebViewContainer$addJavascriptInterface$1 = (AndroidWebViewContainer$addJavascriptInterface$1) rq3Var;
            int i2 = androidWebViewContainer$addJavascriptInterface$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$addJavascriptInterface$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$addJavascriptInterface$1.result;
                lu3 lu3Var = lu3.a;
                i = androidWebViewContainer$addJavascriptInterface$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                    AndroidWebViewContainer$addJavascriptInterface$2 androidWebViewContainer$addJavascriptInterface$2 = new AndroidWebViewContainer$addJavascriptInterface$2(this, str, webViewBridge, null);
                    androidWebViewContainer$addJavascriptInterface$1.label = 1;
                    if (xw3.R(coroutineContext, androidWebViewContainer$addJavascriptInterface$2, androidWebViewContainer$addJavascriptInterface$1) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        androidWebViewContainer$addJavascriptInterface$1 = new AndroidWebViewContainer$addJavascriptInterface$1(this, rq3Var);
        Object obj2 = androidWebViewContainer$addJavascriptInterface$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidWebViewContainer$addJavascriptInterface$1.label;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(@NotNull rq3<? super Unit> rq3Var) {
        AndroidWebViewContainer$destroy$1 androidWebViewContainer$destroy$1;
        int i;
        if (rq3Var instanceof AndroidWebViewContainer$destroy$1) {
            androidWebViewContainer$destroy$1 = (AndroidWebViewContainer$destroy$1) rq3Var;
            int i2 = androidWebViewContainer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$destroy$1.result;
                lu3 lu3Var = lu3.a;
                i = androidWebViewContainer$destroy$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    CoroutineContext plus = this.scope.getCoroutineContext().plus(eed.b);
                    AndroidWebViewContainer$destroy$2 androidWebViewContainer$destroy$2 = new AndroidWebViewContainer$destroy$2(this, null);
                    androidWebViewContainer$destroy$1.label = 1;
                    if (xw3.R(plus, androidWebViewContainer$destroy$2, androidWebViewContainer$destroy$1) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                s9a.o(this.scope, null);
                return Unit.a;
            }
        }
        androidWebViewContainer$destroy$1 = new AndroidWebViewContainer$destroy$1(this, rq3Var);
        Object obj2 = androidWebViewContainer$destroy$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidWebViewContainer$destroy$1.label;
        if (i != 0) {
        }
        s9a.o(this.scope, null);
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(3:17|18|19))(3:30|31|(2:33|23)(1:34))|20|21|22|23))|37|6|7|(0)(0)|20|21|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r9.Z(r1) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r12.e(r1) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object evaluateJavascript(@NotNull HandlerType handlerType, @NotNull JSONArray jSONArray, @NotNull rq3<? super Unit> rq3Var) {
        AndroidWebViewContainer$evaluateJavascript$1 androidWebViewContainer$evaluateJavascript$1;
        int i;
        String jSONArray2;
        h2d h2dVar;
        String sb;
        try {
            if (rq3Var instanceof AndroidWebViewContainer$evaluateJavascript$1) {
                androidWebViewContainer$evaluateJavascript$1 = (AndroidWebViewContainer$evaluateJavascript$1) rq3Var;
                int i2 = androidWebViewContainer$evaluateJavascript$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidWebViewContainer$evaluateJavascript$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidWebViewContainer$evaluateJavascript$1.result;
                    lu3 lu3Var = lu3.a;
                    i = androidWebViewContainer$evaluateJavascript$1.label;
                    if (i != 0) {
                        y6a.M(obj);
                        jSONArray2 = jSONArray.toString();
                        jSONArray2.getClass();
                        int length = handlerType.getJsPath().length() + 32 + jSONArray2.length() + 2;
                        if (length > SHARED_STRING_BUILDER.capacity()) {
                            StringBuilder sb2 = new StringBuilder(length);
                            sb2.append(JS_INSTRUCTION);
                            sb2.append(handlerType.getJsPath());
                            sb2.append(JS_OPENING_PARENTHESES);
                            sb2.append(jSONArray2);
                            sb2.append(");");
                            sb = sb2.toString();
                            g9i L = xw3.L(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3);
                            androidWebViewContainer$evaluateJavascript$1.L$0 = null;
                            androidWebViewContainer$evaluateJavascript$1.L$1 = null;
                            androidWebViewContainer$evaluateJavascript$1.L$2 = null;
                            androidWebViewContainer$evaluateJavascript$1.label = 2;
                        } else {
                            h2dVar = SHARED_STRING_MUTEX;
                            androidWebViewContainer$evaluateJavascript$1.L$0 = handlerType;
                            androidWebViewContainer$evaluateJavascript$1.L$1 = jSONArray2;
                            androidWebViewContainer$evaluateJavascript$1.L$2 = h2dVar;
                            androidWebViewContainer$evaluateJavascript$1.label = 1;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar2 = (h2d) androidWebViewContainer$evaluateJavascript$1.L$2;
                        jSONArray2 = (String) androidWebViewContainer$evaluateJavascript$1.L$1;
                        HandlerType handlerType2 = (HandlerType) androidWebViewContainer$evaluateJavascript$1.L$0;
                        y6a.M(obj);
                        h2dVar = h2dVar2;
                        handlerType = handlerType2;
                    }
                    StringBuilder sb3 = SHARED_STRING_BUILDER;
                    sb3.getClass();
                    sb3.setLength(0);
                    sb3.append(JS_INSTRUCTION);
                    sb3.append(handlerType.getJsPath());
                    sb3.append(JS_OPENING_PARENTHESES);
                    sb3.append(jSONArray2);
                    sb3.append(JS_CLOSING_PARENTHESES);
                    sb3.append(JS_SEMICOLON);
                    sb = sb3.toString();
                    g9i L2 = xw3.L(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3);
                    androidWebViewContainer$evaluateJavascript$1.L$0 = null;
                    androidWebViewContainer$evaluateJavascript$1.L$1 = null;
                    androidWebViewContainer$evaluateJavascript$1.L$2 = null;
                    androidWebViewContainer$evaluateJavascript$1.label = 2;
                }
            }
            StringBuilder sb32 = SHARED_STRING_BUILDER;
            sb32.getClass();
            sb32.setLength(0);
            sb32.append(JS_INSTRUCTION);
            sb32.append(handlerType.getJsPath());
            sb32.append(JS_OPENING_PARENTHESES);
            sb32.append(jSONArray2);
            sb32.append(JS_CLOSING_PARENTHESES);
            sb32.append(JS_SEMICOLON);
            sb = sb32.toString();
            g9i L22 = xw3.L(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3);
            androidWebViewContainer$evaluateJavascript$1.L$0 = null;
            androidWebViewContainer$evaluateJavascript$1.L$1 = null;
            androidWebViewContainer$evaluateJavascript$1.L$2 = null;
            androidWebViewContainer$evaluateJavascript$1.label = 2;
        } finally {
            h2dVar.f(null);
        }
        androidWebViewContainer$evaluateJavascript$1 = new AndroidWebViewContainer$evaluateJavascript$1(this, rq3Var);
        Object obj2 = androidWebViewContainer$evaluateJavascript$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidWebViewContainer$evaluateJavascript$1.label;
        if (i != 0) {
        }
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @NotNull
    public ddi getLastInputEvent() {
        return this.lastInputEvent;
    }

    @NotNull
    public final ku3 getScope() {
        return this.scope;
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    @NotNull
    public final f1d get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (destroy(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (defpackage.xw3.R(r9, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadUrl(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        AndroidWebViewContainer$loadUrl$1 androidWebViewContainer$loadUrl$1;
        int i;
        List<WebViewClientError> list;
        if (rq3Var instanceof AndroidWebViewContainer$loadUrl$1) {
            androidWebViewContainer$loadUrl$1 = (AndroidWebViewContainer$loadUrl$1) rq3Var;
            int i2 = androidWebViewContainer$loadUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$loadUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$loadUrl$1.result;
                Object obj2 = lu3.a;
                i = androidWebViewContainer$loadUrl$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                    AndroidWebViewContainer$loadUrl$2 androidWebViewContainer$loadUrl$2 = new AndroidWebViewContainer$loadUrl$2(this, str, null);
                    androidWebViewContainer$loadUrl$1.label = 1;
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) androidWebViewContainer$loadUrl$1.L$0;
                        y6a.M(obj);
                        this.sendWebViewClientErrorDiagnostics.invoke(list, this.adObject);
                        throw new LoadWebViewError(list);
                    }
                    y6a.M(obj);
                    list = (List) obj;
                    if (list.isEmpty()) {
                        return Unit.a;
                    }
                    androidWebViewContainer$loadUrl$1.L$0 = list;
                    androidWebViewContainer$loadUrl$1.label = 3;
                }
                zu4 onLoadFinished = this.webViewClient.getOnLoadFinished();
                androidWebViewContainer$loadUrl$1.label = 2;
                obj = onLoadFinished.T(androidWebViewContainer$loadUrl$1);
            }
        }
        androidWebViewContainer$loadUrl$1 = new AndroidWebViewContainer$loadUrl$1(this, rq3Var);
        Object obj3 = androidWebViewContainer$loadUrl$1.result;
        Object obj22 = lu3.a;
        i = androidWebViewContainer$loadUrl$1.label;
        if (i != 0) {
        }
        zu4 onLoadFinished2 = this.webViewClient.getOnLoadFinished();
        androidWebViewContainer$loadUrl$1.label = 2;
        obj3 = onLoadFinished2.T(androidWebViewContainer$loadUrl$1);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewContainer$Companion;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "SHARED_STRING_BUILDER", "Ljava/lang/StringBuilder;", "getSHARED_STRING_BUILDER", "()Ljava/lang/StringBuilder;", "getSHARED_STRING_BUILDER$annotations", "Lh2d;", "SHARED_STRING_MUTEX", "Lh2d;", "getSHARED_STRING_MUTEX", "()Lh2d;", "", "JS_INSTRUCTION", "Ljava/lang/String;", "JS_OPENING_PARENTHESES", "JS_CLOSING_PARENTHESES", "JS_SEMICOLON", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }

        @NotNull
        public final h2d getSHARED_STRING_MUTEX() {
            return AndroidWebViewContainer.SHARED_STRING_MUTEX;
        }

        private Companion() {
        }

        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @il4(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    public static final class AnonymousClass2 extends hoi implements Function2<Boolean, rq3<? super Unit>, Object> {
        int label;

        public AnonymousClass2(rq3<? super AnonymousClass2> rq3Var) {
            super(2, rq3Var);
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return AndroidWebViewContainer.this.new AnonymousClass2(rq3Var);
        }

        public final Object invoke(boolean z, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            return Unit.a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (rq3<? super Unit>) obj2);
        }
    }
}
