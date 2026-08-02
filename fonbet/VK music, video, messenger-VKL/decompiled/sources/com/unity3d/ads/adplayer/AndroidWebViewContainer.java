package com.unity3d.ads.adplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.json.JSONArray;
import xsna.b0u0;
import xsna.b6l;
import xsna.bay;
import xsna.bqx0;
import xsna.h4x;
import xsna.hpj;
import xsna.iut0;
import xsna.ksr;
import xsna.lsr;
import xsna.myc0;
import xsna.odj;
import xsna.ovj;
import xsna.qe2;
import xsna.r570;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.ttk0;
import xsna.u080;
import xsna.ui50;
import xsna.utk0;
import xsna.vtk0;
import xsna.vvj;
import xsna.wzs;
import xsna.xh50;
import xsna.xqm0;
import xsna.yok0;
import xsna.yvj;
import xsna.zcl;
import xsna.zrl;
import xsna.zvj;

/* compiled from: AndroidWebViewContainer.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes14.dex */
public final class AndroidWebViewContainer implements WebViewContainer {
    private static final String JS_CLOSING_PARENTHESES = ")";
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";
    private static final String JS_OPENING_PARENTHESES = "(";
    private static final String JS_SEMICOLON = ";";
    private final xh50<InputEvent> _lastInputEvent;
    private final AdObject adObject;
    private final Context context;
    private final ttk0<InputEvent> lastInputEvent;
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;
    public static final Companion Companion = new Companion(null);
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(4096);
    private static final ui50 SHARED_STRING_MUTEX = bay.a();

    /* compiled from: AndroidWebViewContainer.kt */
    @b6l(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
        int label;

        public AnonymousClass2(spj<? super AnonymousClass2> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return AndroidWebViewContainer.this.new AnonymousClass2(spjVar);
        }

        @Override // xsna.wzs
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
            return invoke(bool.booleanValue(), spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
            }
            return s3q0.a;
        }

        public final Object invoke(boolean z, spj<? super s3q0> spjVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* compiled from: AndroidWebViewContainer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }

        public final ui50 getSHARED_STRING_MUTEX() {
            return AndroidWebViewContainer.SHARED_STRING_MUTEX;
        }

        private Companion() {
        }

        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }
    }

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, ovj ovjVar, ovj ovjVar2, yvj yvjVar, Context context, AdObject adObject, SendDiagnosticEvent sendDiagnosticEvent) {
        this.webView = webView;
        this.webViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        this.adObject = adObject;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        hpj g = zvj.g(zvj.g(yvjVar, ovjVar), new vvj("AndroidWebViewContainer"));
        this.scope = g;
        utk0 a = vtk0.a(null);
        this._lastInputEvent = a;
        this.lastInputEvent = rsr.f(a);
        final ttk0<Boolean> isRenderProcessGone = androidWebViewClient.isRenderProcessGone();
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<Boolean>() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((Boolean) obj).booleanValue()) {
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
            public Object collect(lsr<? super Boolean> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new AnonymousClass2(null)), zvj.g(g, ovjVar2));
        webView.setOnTouchListener(new qe2(this, 0));
        applySafeAreaInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer androidWebViewContainer, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        androidWebViewContainer._lastInputEvent.setValue(motionEvent);
        return false;
    }

    private final void applySafeAreaInsets() {
        WebView webView = this.webView;
        u080 u080Var = new u080() { // from class: xsna.re2
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                bqx0 applySafeAreaInsets$lambda$6;
                applySafeAreaInsets$lambda$6 = AndroidWebViewContainer.applySafeAreaInsets$lambda$6(AndroidWebViewContainer.this, view, bqx0Var);
                return applySafeAreaInsets$lambda$6;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(webView, u080Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bqx0 applySafeAreaInsets$lambda$6(AndroidWebViewContainer androidWebViewContainer, View view, bqx0 bqx0Var) {
        Object failure;
        bqx0.q qVar = bqx0Var.a;
        h4x i = qVar.i(519);
        h4x i2 = qVar.i(128);
        try {
            failure = Float.valueOf(androidWebViewContainer.context.getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object valueOf = Float.valueOf(1.0f);
        if (failure instanceof Result.Failure) {
            failure = valueOf;
        }
        float floatValue = ((Number) failure).floatValue();
        int applySafeAreaInsets$lambda$6$toPx = applySafeAreaInsets$lambda$6$toPx(Math.max(i.a, i2.a), floatValue);
        int applySafeAreaInsets$lambda$6$toPx2 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.b, i2.b), floatValue);
        int applySafeAreaInsets$lambda$6$toPx3 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.c, i2.c), floatValue);
        int applySafeAreaInsets$lambda$6$toPx4 = applySafeAreaInsets$lambda$6$toPx(Math.max(i.d, i2.d), floatValue);
        StringBuilder a = odj.a(applySafeAreaInsets$lambda$6$toPx, applySafeAreaInsets$lambda$6$toPx3, "\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", "px');\n                    root.style.setProperty('--safe-area-inset-right', '", "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        a.append(applySafeAreaInsets$lambda$6$toPx2);
        a.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        a.append(applySafeAreaInsets$lambda$6$toPx4);
        a.append("px');\n                })();\n            ");
        myc0.h(androidWebViewContainer.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(androidWebViewContainer, xqm0.g(a.toString()), null), 3);
        return bqx0Var;
    }

    private static final int applySafeAreaInsets$lambda$6$toPx(int i, float f) {
        return (int) (i / f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onRenderProcessGone(spj<? super s3q0> spjVar) {
        AndroidWebViewContainer$onRenderProcessGone$1 androidWebViewContainer$onRenderProcessGone$1;
        int i;
        if (spjVar instanceof AndroidWebViewContainer$onRenderProcessGone$1) {
            androidWebViewContainer$onRenderProcessGone$1 = (AndroidWebViewContainer$onRenderProcessGone$1) spjVar;
            int i2 = androidWebViewContainer$onRenderProcessGone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$onRenderProcessGone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$onRenderProcessGone$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidWebViewContainer$onRenderProcessGone$1.label;
                if (i != 0) {
                    a.a(obj);
                    androidWebViewContainer$onRenderProcessGone$1.label = 1;
                    if (destroy(androidWebViewContainer$onRenderProcessGone$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                this.sendWebViewClientErrorDiagnostics.invoke(Collections.singletonList(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)), this.adObject);
                return s3q0.a;
            }
        }
        androidWebViewContainer$onRenderProcessGone$1 = new AndroidWebViewContainer$onRenderProcessGone$1(this, spjVar);
        Object obj3 = androidWebViewContainer$onRenderProcessGone$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidWebViewContainer$onRenderProcessGone$1.label;
        if (i != 0) {
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_TERMINATED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
        this.sendWebViewClientErrorDiagnostics.invoke(Collections.singletonList(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)), this.adObject);
        return s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addJavascriptInterface(WebViewBridge webViewBridge, String str, spj<? super s3q0> spjVar) {
        AndroidWebViewContainer$addJavascriptInterface$1 androidWebViewContainer$addJavascriptInterface$1;
        int i;
        if (spjVar instanceof AndroidWebViewContainer$addJavascriptInterface$1) {
            androidWebViewContainer$addJavascriptInterface$1 = (AndroidWebViewContainer$addJavascriptInterface$1) spjVar;
            int i2 = androidWebViewContainer$addJavascriptInterface$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$addJavascriptInterface$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$addJavascriptInterface$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidWebViewContainer$addJavascriptInterface$1.label;
                if (i != 0) {
                    a.a(obj);
                    d coroutineContext = this.scope.getCoroutineContext();
                    AndroidWebViewContainer$addJavascriptInterface$2 androidWebViewContainer$addJavascriptInterface$2 = new AndroidWebViewContainer$addJavascriptInterface$2(this, str, webViewBridge, null);
                    androidWebViewContainer$addJavascriptInterface$1.label = 1;
                    if (myc0.k(coroutineContext, androidWebViewContainer$addJavascriptInterface$2, androidWebViewContainer$addJavascriptInterface$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return s3q0.a;
            }
        }
        androidWebViewContainer$addJavascriptInterface$1 = new AndroidWebViewContainer$addJavascriptInterface$1(this, spjVar);
        Object obj2 = androidWebViewContainer$addJavascriptInterface$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidWebViewContainer$addJavascriptInterface$1.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(spj<? super s3q0> spjVar) {
        AndroidWebViewContainer$destroy$1 androidWebViewContainer$destroy$1;
        int i;
        if (spjVar instanceof AndroidWebViewContainer$destroy$1) {
            androidWebViewContainer$destroy$1 = (AndroidWebViewContainer$destroy$1) spjVar;
            int i2 = androidWebViewContainer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$destroy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidWebViewContainer$destroy$1.label;
                if (i != 0) {
                    a.a(obj);
                    d plus = this.scope.getCoroutineContext().plus(r570.b);
                    AndroidWebViewContainer$destroy$2 androidWebViewContainer$destroy$2 = new AndroidWebViewContainer$destroy$2(this, null);
                    androidWebViewContainer$destroy$1.label = 1;
                    if (myc0.k(plus, androidWebViewContainer$destroy$2, androidWebViewContainer$destroy$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                zvj.c(this.scope, null);
                return s3q0.a;
            }
        }
        androidWebViewContainer$destroy$1 = new AndroidWebViewContainer$destroy$1(this, spjVar);
        Object obj2 = androidWebViewContainer$destroy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidWebViewContainer$destroy$1.label;
        if (i != 0) {
        }
        zvj.c(this.scope, null);
        return s3q0.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(3:17|18|19))(3:30|31|(2:33|23)(1:34))|20|21|22|23))|37|6|7|(0)(0)|20|21|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        if (r10.y(r1) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r12.b(r1) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, spj<? super s3q0> spjVar) {
        AndroidWebViewContainer$evaluateJavascript$1 androidWebViewContainer$evaluateJavascript$1;
        int i;
        String jSONArray2;
        ui50 ui50Var;
        String sb;
        try {
            if (spjVar instanceof AndroidWebViewContainer$evaluateJavascript$1) {
                androidWebViewContainer$evaluateJavascript$1 = (AndroidWebViewContainer$evaluateJavascript$1) spjVar;
                int i2 = androidWebViewContainer$evaluateJavascript$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidWebViewContainer$evaluateJavascript$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidWebViewContainer$evaluateJavascript$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = androidWebViewContainer$evaluateJavascript$1.label;
                    if (i != 0) {
                        a.a(obj);
                        jSONArray2 = jSONArray.toString();
                        int length = handlerType.getJsPath().length() + 32 + jSONArray2.length() + 2;
                        if (length > SHARED_STRING_BUILDER.capacity()) {
                            StringBuilder sb2 = new StringBuilder(length);
                            sb2.append(JS_INSTRUCTION);
                            sb2.append(handlerType.getJsPath());
                            sb2.append(JS_OPENING_PARENTHESES);
                            sb2.append(jSONArray2);
                            sb2.append(");");
                            sb = sb2.toString();
                            yok0 h = myc0.h(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3);
                            androidWebViewContainer$evaluateJavascript$1.L$0 = null;
                            androidWebViewContainer$evaluateJavascript$1.L$1 = null;
                            androidWebViewContainer$evaluateJavascript$1.L$2 = null;
                            androidWebViewContainer$evaluateJavascript$1.label = 2;
                        } else {
                            ui50Var = SHARED_STRING_MUTEX;
                            androidWebViewContainer$evaluateJavascript$1.L$0 = handlerType;
                            androidWebViewContainer$evaluateJavascript$1.L$1 = jSONArray2;
                            androidWebViewContainer$evaluateJavascript$1.L$2 = ui50Var;
                            androidWebViewContainer$evaluateJavascript$1.label = 1;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.a(obj);
                            return s3q0.a;
                        }
                        ui50 ui50Var2 = (ui50) androidWebViewContainer$evaluateJavascript$1.L$2;
                        jSONArray2 = (String) androidWebViewContainer$evaluateJavascript$1.L$1;
                        HandlerType handlerType2 = (HandlerType) androidWebViewContainer$evaluateJavascript$1.L$0;
                        a.a(obj);
                        ui50Var = ui50Var2;
                        handlerType = handlerType2;
                    }
                    StringBuilder sb3 = SHARED_STRING_BUILDER;
                    sb3.setLength(0);
                    sb3.append(JS_INSTRUCTION);
                    sb3.append(handlerType.getJsPath());
                    sb3.append(JS_OPENING_PARENTHESES);
                    sb3.append(jSONArray2);
                    sb3.append(JS_CLOSING_PARENTHESES);
                    sb3.append(JS_SEMICOLON);
                    sb = sb3.toString();
                    yok0 h2 = myc0.h(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3);
                    androidWebViewContainer$evaluateJavascript$1.L$0 = null;
                    androidWebViewContainer$evaluateJavascript$1.L$1 = null;
                    androidWebViewContainer$evaluateJavascript$1.L$2 = null;
                    androidWebViewContainer$evaluateJavascript$1.label = 2;
                }
            }
            StringBuilder sb32 = SHARED_STRING_BUILDER;
            sb32.setLength(0);
            sb32.append(JS_INSTRUCTION);
            sb32.append(handlerType.getJsPath());
            sb32.append(JS_OPENING_PARENTHESES);
            sb32.append(jSONArray2);
            sb32.append(JS_CLOSING_PARENTHESES);
            sb32.append(JS_SEMICOLON);
            sb = sb32.toString();
            yok0 h22 = myc0.h(this.scope, null, null, new AndroidWebViewContainer$evaluateJavascript$2(this, sb, null), 3);
            androidWebViewContainer$evaluateJavascript$1.L$0 = null;
            androidWebViewContainer$evaluateJavascript$1.L$1 = null;
            androidWebViewContainer$evaluateJavascript$1.L$2 = null;
            androidWebViewContainer$evaluateJavascript$1.label = 2;
        } finally {
            ui50Var.c(null);
        }
        androidWebViewContainer$evaluateJavascript$1 = new AndroidWebViewContainer$evaluateJavascript$1(this, spjVar);
        Object obj2 = androidWebViewContainer$evaluateJavascript$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidWebViewContainer$evaluateJavascript$1.label;
        if (i != 0) {
        }
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public ttk0<InputEvent> getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final yvj getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final xh50<InputEvent> get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (destroy(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (xsna.myc0.k(r9, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadUrl(String str, spj<? super s3q0> spjVar) {
        AndroidWebViewContainer$loadUrl$1 androidWebViewContainer$loadUrl$1;
        int i;
        List<WebViewClientError> list;
        if (spjVar instanceof AndroidWebViewContainer$loadUrl$1) {
            androidWebViewContainer$loadUrl$1 = (AndroidWebViewContainer$loadUrl$1) spjVar;
            int i2 = androidWebViewContainer$loadUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewContainer$loadUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewContainer$loadUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidWebViewContainer$loadUrl$1.label;
                if (i != 0) {
                    a.a(obj);
                    d coroutineContext = this.scope.getCoroutineContext();
                    AndroidWebViewContainer$loadUrl$2 androidWebViewContainer$loadUrl$2 = new AndroidWebViewContainer$loadUrl$2(this, str, null);
                    androidWebViewContainer$loadUrl$1.label = 1;
                } else if (i == 1) {
                    a.a(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = (List) androidWebViewContainer$loadUrl$1.L$0;
                        a.a(obj);
                        this.sendWebViewClientErrorDiagnostics.invoke(list, this.adObject);
                        throw new LoadWebViewError(list);
                    }
                    a.a(obj);
                    list = (List) obj;
                    if (list.isEmpty()) {
                        return s3q0.a;
                    }
                    androidWebViewContainer$loadUrl$1.L$0 = list;
                    androidWebViewContainer$loadUrl$1.label = 3;
                }
                zrl<List<WebViewClientError>> onLoadFinished = this.webViewClient.getOnLoadFinished();
                androidWebViewContainer$loadUrl$1.label = 2;
                obj = onLoadFinished.H(androidWebViewContainer$loadUrl$1);
            }
        }
        androidWebViewContainer$loadUrl$1 = new AndroidWebViewContainer$loadUrl$1(this, spjVar);
        Object obj3 = androidWebViewContainer$loadUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidWebViewContainer$loadUrl$1.label;
        if (i != 0) {
        }
        zrl<List<WebViewClientError>> onLoadFinished2 = this.webViewClient.getOnLoadFinished();
        androidWebViewContainer$loadUrl$1.label = 2;
        obj3 = onLoadFinished2.H(androidWebViewContainer$loadUrl$1);
    }
}
