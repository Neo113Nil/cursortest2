package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.a;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.json.JSONArray;
import org.json.JSONException;
import xsna.b6l;
import xsna.baj0;
import xsna.caj0;
import xsna.epx;
import xsna.gzs;
import xsna.hpj;
import xsna.izi0;
import xsna.jgp;
import xsna.ksr;
import xsna.lsr;
import xsna.lyd;
import xsna.myc0;
import xsna.n7i;
import xsna.o7i;
import xsna.ovj;
import xsna.p7i;
import xsna.pn00;
import xsna.r570;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.vtk0;
import xsna.vvj;
import xsna.wzs;
import xsna.xh50;
import xsna.yvj;
import xsna.zvj;

/* compiled from: CommonWebViewBridge.kt */
/* loaded from: classes14.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final sh50<Invocation> _onInvocation;
    private final xh50<Set<Pair<String, n7i<Object[]>>>> callbacks;
    private Map<String, ? extends gzs<? extends ExposedFunction>> exposedFunctions;
    private final Logger logger;
    private final baj0<Invocation> onInvocation;
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* compiled from: CommonWebViewBridge.kt */
    @b6l(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public AnonymousClass1(spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return CommonWebViewBridge.this.new AnonymousClass1(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == coroutineSingletons) {
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

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    public CommonWebViewBridge(ovj ovjVar, WebViewContainer webViewContainer, yvj yvjVar, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        hpj g = zvj.g(zvj.g(yvjVar, ovjVar), new vvj("CommonWebViewBridge"));
        this.scope = g;
        this.callbacks = vtk0.a(EmptySet.b);
        caj0 b = lyd.b(0, 64, null, 5);
        this._onInvocation = b;
        this.onInvocation = rsr.e(b);
        this.exposedFunctions = jgp.b;
        myc0.h(g, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, spj<? super s3q0> spjVar) {
        Object evaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, spjVar);
        return evaluateJavascript == CoroutineSingletons.COROUTINE_SUSPENDED ? evaluateJavascript : s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|96|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c2, code lost:
    
        if (respond(r12, "ERROR", new java.lang.Object[]{r0}, r1) == r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c8, code lost:
    
        r12 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x004a, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:28:0x0058, B:29:0x013f, B:31:0x0149, B:34:0x015a, B:36:0x0164), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:25:0x0044, B:52:0x0075, B:53:0x0108, B:55:0x010c, B:58:0x011d, B:60:0x0121, B:63:0x0170, B:68:0x008d, B:69:0x00b6, B:72:0x0094, B:74:0x00a4, B:77:0x00b9, B:79:0x00c9, B:81:0x00d1, B:83:0x00df, B:86:0x00f5, B:89:0x0182, B:90:0x01a0), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:25:0x0044, B:52:0x0075, B:53:0x0108, B:55:0x010c, B:58:0x011d, B:60:0x0121, B:63:0x0170, B:68:0x008d, B:69:0x00b6, B:72:0x0094, B:74:0x00a4, B:77:0x00b9, B:79:0x00c9, B:81:0x00d1, B:83:0x00df, B:86:0x00f5, B:89:0x0182, B:90:0x01a0), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleInvocationResult(Invocation invocation, String str, spj<? super s3q0> spjVar) {
        CommonWebViewBridge$handleInvocationResult$1 commonWebViewBridge$handleInvocationResult$1;
        Throwable th;
        String message;
        ExposedFunction invoke;
        Invocation invocation2;
        Object obj;
        Object j;
        if (spjVar instanceof CommonWebViewBridge$handleInvocationResult$1) {
            commonWebViewBridge$handleInvocationResult$1 = (CommonWebViewBridge$handleInvocationResult$1) spjVar;
            int i = commonWebViewBridge$handleInvocationResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonWebViewBridge$handleInvocationResult$1.label = i - Integer.MIN_VALUE;
                Object obj2 = commonWebViewBridge$handleInvocationResult$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (commonWebViewBridge$handleInvocationResult$1.label) {
                    case 0:
                        a.a(obj2);
                        ExposedFunctionLocation exposedFunctionLocation = ExposedFunctionLocation.INSTANCE;
                        if (exposedFunctionLocation.getEVENT_LOCATIONS().contains(invocation.getLocation())) {
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.label = 1;
                            if (respond(str, "OK", new Object[0], commonWebViewBridge$handleInvocationResult$1) == obj3) {
                            }
                            return s3q0.a;
                        }
                        gzs<ExposedFunction> gzsVar = getExposedFunctions().get(invocation.getLocation());
                        if (gzsVar == null || (invoke = gzsVar.invoke()) == null) {
                            throw new IllegalStateException(("Invocation(" + invocation.getLocation() + ") is not handled").toString());
                        }
                        if (exposedFunctionLocation.getNON_CANCELLABLE_LOCATIONS().contains(invocation.getLocation())) {
                            r570 r570Var = r570.b;
                            CommonWebViewBridge$handleInvocationResult$result$1 commonWebViewBridge$handleInvocationResult$result$1 = new CommonWebViewBridge$handleInvocationResult$result$1(invoke, invocation, null);
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.label = 2;
                            obj2 = myc0.k(r570Var, commonWebViewBridge$handleInvocationResult$result$1, commonWebViewBridge$handleInvocationResult$1);
                            if (obj2 == obj3) {
                            }
                            if (!(obj2 instanceof WebViewEvent)) {
                                commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                                commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                                commonWebViewBridge$handleInvocationResult$1.label = 4;
                                if (sendEvent((WebViewEvent) obj2, commonWebViewBridge$handleInvocationResult$1) == obj3) {
                                }
                                return s3q0.a;
                            }
                            if (!(obj2 instanceof Pair)) {
                                commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                                commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                                commonWebViewBridge$handleInvocationResult$1.label = 6;
                                if (respond(str, "OK", new Object[]{obj2}, commonWebViewBridge$handleInvocationResult$1) == obj3) {
                                }
                                return s3q0.a;
                            }
                            Object[] objArr = {((Pair) obj2).i()};
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.L$2 = obj2;
                            commonWebViewBridge$handleInvocationResult$1.label = 5;
                            if (respond(str, "OK", objArr, commonWebViewBridge$handleInvocationResult$1) != obj3) {
                                invocation2 = invocation;
                                obj = obj2;
                                j = ((Pair) obj).j();
                                if (j instanceof ksr) {
                                    final ksr ksrVar = (ksr) j;
                                    try {
                                        rsr.s(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<Object>() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1

                                            /* compiled from: Emitters.kt */
                                            /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                            public static final class AnonymousClass2<T> implements lsr {
                                                final /* synthetic */ lsr $this_unsafeFlow;

                                                @b6l(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", l = {50}, m = "emit")
                                                /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                                                if (obj instanceof WebViewEvent) {
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
                                            public Object collect(lsr<? super Object> lsrVar, spj spjVar2) {
                                                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar2);
                                                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                                            }
                                        }, new CommonWebViewBridge$handleInvocationResult$2(this)), new CommonWebViewBridge$handleInvocationResult$3(this, invocation2, null)), this.scope);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        invocation = invocation2;
                                        message = th.getMessage();
                                        if (message == null) {
                                            message = th.getClass().getSimpleName();
                                        }
                                        commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                                        commonWebViewBridge$handleInvocationResult$1.L$1 = null;
                                        commonWebViewBridge$handleInvocationResult$1.L$2 = null;
                                        commonWebViewBridge$handleInvocationResult$1.label = 7;
                                        break;
                                    }
                                }
                                return s3q0.a;
                            }
                        } else {
                            Object[] parameters = invocation.getParameters();
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.label = 3;
                            obj2 = invoke.invoke(parameters, commonWebViewBridge$handleInvocationResult$1);
                            if (obj2 == obj3) {
                            }
                            if (!(obj2 instanceof WebViewEvent)) {
                            }
                        }
                        return obj3;
                    case 1:
                        a.a(obj2);
                        return s3q0.a;
                    case 2:
                        str = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        invocation = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        a.a(obj2);
                        if (!(obj2 instanceof WebViewEvent)) {
                        }
                        break;
                    case 3:
                        str = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        invocation = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        a.a(obj2);
                        if (!(obj2 instanceof WebViewEvent)) {
                        }
                        break;
                    case 4:
                        a.a(obj2);
                        return s3q0.a;
                    case 5:
                        obj = commonWebViewBridge$handleInvocationResult$1.L$2;
                        str = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        invocation2 = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        try {
                            a.a(obj2);
                            j = ((Pair) obj).j();
                            if (j instanceof ksr) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            invocation = invocation2;
                            message = th.getMessage();
                            if (message == null) {
                            }
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = null;
                            commonWebViewBridge$handleInvocationResult$1.L$2 = null;
                            commonWebViewBridge$handleInvocationResult$1.label = 7;
                            break;
                        }
                        return s3q0.a;
                    case 6:
                        a.a(obj2);
                        return s3q0.a;
                    case 7:
                        invocation = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        a.a(obj2);
                        Object failure = s3q0.a;
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                            String message2 = a.getMessage();
                            if (message2 == null) {
                                message2 = a.getClass().getSimpleName();
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, pn00.k(new Pair("reason_debug", message2), new Pair("webview_invocation", invocation.getLocation())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                        }
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        commonWebViewBridge$handleInvocationResult$1 = new CommonWebViewBridge$handleInvocationResult$1(this, spjVar);
        Object obj22 = commonWebViewBridge$handleInvocationResult$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (commonWebViewBridge$handleInvocationResult$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, spj<? super s3q0> spjVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object execute = execute(HandlerType.CALLBACK, new JSONArray((Collection) Collections.singletonList(jSONArray)), spjVar);
        return execute == CoroutineSingletons.COROUTINE_SUSPENDED ? execute : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Map<String, gzs<ExposedFunction>> getExposedFunctions() {
        return this.exposedFunctions;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public baj0<Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    public final yvj getScope() {
        return this.scope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r5.equals("OK") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        r4.h(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r5.equals("success") == false) goto L35;
     */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleCallback(String str, String str2, String str3) {
        Object obj;
        Set<Pair<String, n7i<Object[]>>> value;
        Object[] typedArray = JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3));
        Iterator<T> it = this.callbacks.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f((String) ((Pair) obj).d(), str)) {
                    break;
                }
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        n7i n7iVar = (n7i) pair.g();
        int hashCode = str2.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 2524) {
                if (hashCode == 66247144 ? str2.equals("ERROR") : hashCode == 96784904 && str2.equals("error")) {
                    n7iVar.A(new Exception((String) typedArray[0]));
                }
            }
        }
        xh50<Set<Pair<String, n7i<Object[]>>>> xh50Var = this.callbacks;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, izi0.f(value, pair)));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String str) {
        try {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + str).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str3 = obj3 instanceof String ? (String) obj3 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + str).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str4 = obj5 instanceof String ? (String) obj5 : null;
                    if (str4 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + str).toString());
                    }
                    String str5 = str2 + JwtParser.SEPARATOR_CHAR + str3;
                    this.logger.debug("Unity Ads WebView calling for: " + str5 + '(' + jSONArray3 + ')');
                    myc0.h(this.scope, null, null, new CommonWebViewBridge$handleInvocation$7(str5, jSONArray3, this, str4, null), 3);
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: ".concat(str), e);
            }
        } catch (Throwable th) {
            this.logger.error("Error handling invocation from webview (" + str + ')', th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, pn00.k(new Pair("reason_debug", message), new Pair("webview_invocation", str)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: ".concat(str), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object request(String str, String str2, Object[] objArr, spj<? super Object[]> spjVar) {
        CommonWebViewBridge$request$1 commonWebViewBridge$request$1;
        int i;
        Set<Pair<String, n7i<Object[]>>> value;
        n7i n7iVar;
        if (spjVar instanceof CommonWebViewBridge$request$1) {
            commonWebViewBridge$request$1 = (CommonWebViewBridge$request$1) spjVar;
            int i2 = commonWebViewBridge$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonWebViewBridge$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonWebViewBridge$request$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonWebViewBridge$request$1.label;
                if (i != 0) {
                    a.a(obj);
                    o7i a = p7i.a();
                    Object valueOf = String.valueOf(a.hashCode());
                    xh50<Set<Pair<String, n7i<Object[]>>>> xh50Var = this.callbacks;
                    do {
                        value = xh50Var.getValue();
                    } while (!xh50Var.compareAndSet(value, izi0.k(value, new Pair(valueOf, a))));
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str);
                    jSONArray.put(str2);
                    jSONArray.put(valueOf);
                    for (Object obj3 : objArr) {
                        jSONArray.put(obj3);
                    }
                    HandlerType handlerType = HandlerType.INVOCATION;
                    commonWebViewBridge$request$1.L$0 = a;
                    commonWebViewBridge$request$1.label = 1;
                    if (execute(handlerType, jSONArray, commonWebViewBridge$request$1) != obj2) {
                        n7iVar = a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                    return obj;
                }
                n7iVar = (n7i) commonWebViewBridge$request$1.L$0;
                a.a(obj);
                commonWebViewBridge$request$1.L$0 = null;
                commonWebViewBridge$request$1.label = 2;
                Object H = n7iVar.H(commonWebViewBridge$request$1);
                return H != obj2 ? obj2 : H;
            }
        }
        commonWebViewBridge$request$1 = new CommonWebViewBridge$request$1(this, spjVar);
        Object obj4 = commonWebViewBridge$request$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonWebViewBridge$request$1.label;
        if (i != 0) {
        }
        commonWebViewBridge$request$1.L$0 = null;
        commonWebViewBridge$request$1.label = 2;
        Object H2 = n7iVar.H(commonWebViewBridge$request$1);
        if (H2 != obj22) {
        }
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, spj<? super s3q0> spjVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object execute = execute(HandlerType.EVENT, jSONArray, spjVar);
        return execute == CoroutineSingletons.COROUTINE_SUSPENDED ? execute : s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void setExposedFunctions(Map<String, ? extends gzs<? extends ExposedFunction>> map) {
        this.exposedFunctions = map;
    }
}
