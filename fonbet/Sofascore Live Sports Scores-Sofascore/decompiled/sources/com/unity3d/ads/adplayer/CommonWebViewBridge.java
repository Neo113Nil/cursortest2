package com.unity3d.ads.adplayer;

import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.au3;
import defpackage.b1d;
import defpackage.b98;
import defpackage.beh;
import defpackage.eed;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.gu3;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.qx9;
import defpackage.rm5;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.t98;
import defpackage.tub;
import defpackage.un0;
import defpackage.v98;
import defpackage.w2g;
import defpackage.xdh;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y9h;
import defpackage.z88;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J:\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0096@¢\u0006\u0004\b'\u0010 J'\u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0017\u00102\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R8\u0010:\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c090807068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR4\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0D8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lau3;", "dispatcher", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lku3;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lau3;Lcom/unity3d/ads/adplayer/WebViewContainer;Lku3;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "", "execute", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/Invocation;", "invocation", "", "callbackId", "handleInvocationResult", "(Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "status", "", "", "params", "respond", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "event", "sendEvent", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lrq3;)Ljava/lang/Object;", "className", "method", "request", "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PglCryptUtils.KEY_MESSAGE, "handleInvocation", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "scope", "Lku3;", "getScope", "()Lku3;", "Lf1d;", "", "Lkotlin/Pair;", "Lpa3;", "callbacks", "Lf1d;", "Lb1d;", "_onInvocation", "Lb1d;", "Lxdh;", "onInvocation", "Lxdh;", "getOnInvocation", "()Lxdh;", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "exposedFunctions", "Ljava/util/Map;", "getExposedFunctions", "()Ljava/util/Map;", "setExposedFunctions", "(Ljava/util/Map;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonWebViewBridge implements WebViewBridge {

    @NotNull
    private final b1d _onInvocation;

    @NotNull
    private final f1d callbacks;

    @NotNull
    private Map<String, ? extends Function0<? extends ExposedFunction>> exposedFunctions;

    @NotNull
    private final Logger logger;

    @NotNull
    private final xdh onInvocation;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final WebViewContainer webViewContainer;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        int label;

        public AnonymousClass1(rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return CommonWebViewBridge.this.new AnonymousClass1(rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == lu3Var) {
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

    public CommonWebViewBridge(@NotNull au3 au3Var, @NotNull WebViewContainer webViewContainer, @NotNull ku3 ku3Var, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger) {
        au3Var.getClass();
        webViewContainer.getClass();
        ku3Var.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        ad2 F = s9a.F(s9a.F(ku3Var, au3Var), new gu3("CommonWebViewBridge"));
        this.scope = F;
        this.callbacks = gdi.a(rm5.a);
        aeh b = beh.b(0, 64, null, 5);
        this._onInvocation = b;
        this.onInvocation = un0.t(b);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.exposedFunctions = lm5Var;
        xw3.L(F, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, rq3<? super Unit> rq3Var) {
        Object evaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, rq3Var);
        return evaluateJavascript == lu3.a ? evaluateJavascript : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|94|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01aa, code lost:
    
        if (respond(r12, "ERROR", new java.lang.Object[]{r0}, r1) == r2) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        r13 = defpackage.w2g.b;
        r12 = new defpackage.u2g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x004a, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:28:0x0058, B:29:0x0127, B:31:0x012f, B:34:0x0140, B:36:0x014a), top: B:27:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6 A[Catch: all -> 0x0049, TryCatch #2 {all -> 0x0049, blocks: (B:25:0x0044, B:51:0x006b, B:52:0x00f2, B:54:0x00f6, B:57:0x0107, B:59:0x010b, B:62:0x0156, B:66:0x0079, B:67:0x00a1, B:70:0x0080, B:72:0x0090, B:75:0x00a4, B:77:0x00b4, B:79:0x00bc, B:81:0x00ca, B:84:0x00e0, B:87:0x0168, B:88:0x0186), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107 A[Catch: all -> 0x0049, TryCatch #2 {all -> 0x0049, blocks: (B:25:0x0044, B:51:0x006b, B:52:0x00f2, B:54:0x00f6, B:57:0x0107, B:59:0x010b, B:62:0x0156, B:66:0x0079, B:67:0x00a1, B:70:0x0080, B:72:0x0090, B:75:0x00a4, B:77:0x00b4, B:79:0x00bc, B:81:0x00ca, B:84:0x00e0, B:87:0x0168, B:88:0x0186), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleInvocationResult(Invocation invocation, String str, rq3<? super Unit> rq3Var) {
        CommonWebViewBridge$handleInvocationResult$1 commonWebViewBridge$handleInvocationResult$1;
        Throwable th;
        String message;
        ExposedFunction exposedFunction;
        Invocation invocation2;
        Object obj;
        Object obj2;
        if (rq3Var instanceof CommonWebViewBridge$handleInvocationResult$1) {
            commonWebViewBridge$handleInvocationResult$1 = (CommonWebViewBridge$handleInvocationResult$1) rq3Var;
            int i = commonWebViewBridge$handleInvocationResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonWebViewBridge$handleInvocationResult$1.label = i - Integer.MIN_VALUE;
                Object obj3 = commonWebViewBridge$handleInvocationResult$1.result;
                Object obj4 = lu3.a;
                switch (commonWebViewBridge$handleInvocationResult$1.label) {
                    case 0:
                        y6a.M(obj3);
                        ExposedFunctionLocation exposedFunctionLocation = ExposedFunctionLocation.INSTANCE;
                        if (exposedFunctionLocation.getEVENT_LOCATIONS().contains(invocation.getLocation())) {
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.label = 1;
                            if (respond(str, Payload.RESPONSE_OK, new Object[0], commonWebViewBridge$handleInvocationResult$1) == obj4) {
                            }
                            return Unit.a;
                        }
                        Function0<ExposedFunction> function0 = getExposedFunctions().get(invocation.getLocation());
                        if (function0 == null || (exposedFunction = (ExposedFunction) function0.invoke()) == null) {
                            throw new IllegalStateException(("Invocation(" + invocation.getLocation() + ") is not handled").toString());
                        }
                        if (exposedFunctionLocation.getNON_CANCELLABLE_LOCATIONS().contains(invocation.getLocation())) {
                            eed eedVar = eed.b;
                            CommonWebViewBridge$handleInvocationResult$result$1 commonWebViewBridge$handleInvocationResult$result$1 = new CommonWebViewBridge$handleInvocationResult$result$1(exposedFunction, invocation, null);
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.label = 2;
                            obj3 = xw3.R(eedVar, commonWebViewBridge$handleInvocationResult$result$1, commonWebViewBridge$handleInvocationResult$1);
                            if (obj3 == obj4) {
                            }
                            if (obj3 instanceof WebViewEvent) {
                                commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                                commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                                commonWebViewBridge$handleInvocationResult$1.label = 4;
                                if (sendEvent((WebViewEvent) obj3, commonWebViewBridge$handleInvocationResult$1) == obj4) {
                                }
                                return Unit.a;
                            }
                            if (!(obj3 instanceof Pair)) {
                                commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                                commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                                commonWebViewBridge$handleInvocationResult$1.label = 6;
                                if (respond(str, Payload.RESPONSE_OK, new Object[]{obj3}, commonWebViewBridge$handleInvocationResult$1) == obj4) {
                                }
                                return Unit.a;
                            }
                            Object[] objArr = {((Pair) obj3).a};
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.L$2 = obj3;
                            commonWebViewBridge$handleInvocationResult$1.label = 5;
                            if (respond(str, Payload.RESPONSE_OK, objArr, commonWebViewBridge$handleInvocationResult$1) != obj4) {
                                invocation2 = invocation;
                                obj = obj3;
                                obj2 = ((Pair) obj).b;
                                if (obj2 instanceof z88) {
                                    final z88 z88Var = (z88) obj2;
                                    try {
                                        fcp.m0(new t98(new v98(new z88() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1

                                            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                            /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                            public static final class AnonymousClass2<T> implements b98 {
                                                final /* synthetic */ b98 $this_unsafeFlow;

                                                @il4(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", l = {50}, m = "emit")
                                                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                                /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                                                if (obj instanceof WebViewEvent) {
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
                                                Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var2);
                                                return collect == lu3.a ? collect : Unit.a;
                                            }
                                        }, new CommonWebViewBridge$handleInvocationResult$2(this), 3), new CommonWebViewBridge$handleInvocationResult$3(this, invocation2, null), 1), this.scope);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        invocation = invocation2;
                                        message = th.getMessage();
                                        if (message == null) {
                                            message = th.getClass().getSimpleName();
                                        }
                                        p2g p2gVar = w2g.b;
                                        commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                                        commonWebViewBridge$handleInvocationResult$1.L$1 = null;
                                        commonWebViewBridge$handleInvocationResult$1.L$2 = null;
                                        commonWebViewBridge$handleInvocationResult$1.label = 7;
                                        break;
                                    }
                                }
                                return Unit.a;
                            }
                        } else {
                            Object[] parameters = invocation.getParameters();
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = str;
                            commonWebViewBridge$handleInvocationResult$1.label = 3;
                            obj3 = exposedFunction.invoke(parameters, commonWebViewBridge$handleInvocationResult$1);
                            if (obj3 == obj4) {
                            }
                            if (obj3 instanceof WebViewEvent) {
                            }
                        }
                        return obj4;
                    case 1:
                        y6a.M(obj3);
                        return Unit.a;
                    case 2:
                    case 3:
                        str = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        invocation = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        y6a.M(obj3);
                        if (obj3 instanceof WebViewEvent) {
                        }
                        break;
                    case 4:
                    case 6:
                        y6a.M(obj3);
                        return Unit.a;
                    case 5:
                        obj = commonWebViewBridge$handleInvocationResult$1.L$2;
                        str = (String) commonWebViewBridge$handleInvocationResult$1.L$1;
                        invocation2 = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        try {
                            y6a.M(obj3);
                            obj2 = ((Pair) obj).b;
                            if (obj2 instanceof z88) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            invocation = invocation2;
                            message = th.getMessage();
                            if (message == null) {
                            }
                            p2g p2gVar2 = w2g.b;
                            commonWebViewBridge$handleInvocationResult$1.L$0 = invocation;
                            commonWebViewBridge$handleInvocationResult$1.L$1 = null;
                            commonWebViewBridge$handleInvocationResult$1.L$2 = null;
                            commonWebViewBridge$handleInvocationResult$1.label = 7;
                            break;
                        }
                        return Unit.a;
                    case 7:
                        invocation = (Invocation) commonWebViewBridge$handleInvocationResult$1.L$0;
                        y6a.M(obj3);
                        Object u2gVar = Unit.a;
                        p2g p2gVar3 = w2g.b;
                        Throwable a = w2g.a(u2gVar);
                        if (a != null) {
                            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                            String message2 = a.getMessage();
                            if (message2 == null) {
                                message2 = a.getClass().getSimpleName();
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, tub.h(new Pair("reason_debug", message2), new Pair("webview_invocation", invocation.getLocation())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                        }
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        commonWebViewBridge$handleInvocationResult$1 = new CommonWebViewBridge$handleInvocationResult$1(this, rq3Var);
        Object obj32 = commonWebViewBridge$handleInvocationResult$1.result;
        Object obj42 = lu3.a;
        switch (commonWebViewBridge$handleInvocationResult$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, rq3<? super Unit> rq3Var) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object execute = execute(HandlerType.CALLBACK, new JSONArray((Collection) a.c(jSONArray)), rq3Var);
        return execute == lu3.a ? execute : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @NotNull
    public Map<String, Function0<ExposedFunction>> getExposedFunctions() {
        return this.exposedFunctions;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @NotNull
    public xdh getOnInvocation() {
        return this.onInvocation;
    }

    @NotNull
    public final ku3 getScope() {
        return this.scope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r5.equals(com.appsflyer.sdk_base.referrer.Payload.RESPONSE_OK) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        ((defpackage.qa3) r4).V(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r5.equals("success") == false) goto L35;
     */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleCallback(@NotNull String callbackId, @NotNull String callbackStatus, @NotNull String rawParameters) {
        Object obj;
        fdi fdiVar;
        Object value;
        callbackId.getClass();
        callbackStatus.getClass();
        rawParameters.getClass();
        Object[] typedArray = JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters));
        Iterator it = ((Iterable) ((fdi) this.callbacks).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.c((String) ((Pair) obj).a, callbackId)) {
                    break;
                }
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        pa3 pa3Var = (pa3) pair.b;
        int hashCode = callbackStatus.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 2524) {
                if (hashCode == 66247144 ? callbackStatus.equals("ERROR") : hashCode == 96784904 && callbackStatus.equals("error")) {
                    Object obj2 = typedArray[0];
                    obj2.getClass();
                    ((qa3) pa3Var).j0(new Exception((String) obj2));
                }
            }
        }
        f1d f1dVar = this.callbacks;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, y9h.d((Set) value, pair)));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(@NotNull String message) {
        message.getClass();
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    this.logger.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    xw3.L(this.scope, null, null, new CommonWebViewBridge$handleInvocation$7(str4, jSONArray3, this, str3, null), 3);
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: ".concat(message), e);
            }
        } catch (Throwable th) {
            this.logger.error("Error handling invocation from webview (" + message + ')', th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, tub.h(new Pair("reason_debug", message2), new Pair("webview_invocation", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: ".concat(message), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object request(@NotNull String str, @NotNull String str2, @NotNull Object[] objArr, @NotNull rq3<? super Object[]> rq3Var) {
        CommonWebViewBridge$request$1 commonWebViewBridge$request$1;
        int i;
        fdi fdiVar;
        Object value;
        pa3 pa3Var;
        if (rq3Var instanceof CommonWebViewBridge$request$1) {
            commonWebViewBridge$request$1 = (CommonWebViewBridge$request$1) rq3Var;
            int i2 = commonWebViewBridge$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonWebViewBridge$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonWebViewBridge$request$1.result;
                Object obj2 = lu3.a;
                i = commonWebViewBridge$request$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    qa3 c = qx9.c();
                    Object valueOf = String.valueOf(c.hashCode());
                    f1d f1dVar = this.callbacks;
                    do {
                        fdiVar = (fdi) f1dVar;
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, y9h.g((Set) value, new Pair(valueOf, c))));
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str);
                    jSONArray.put(str2);
                    jSONArray.put(valueOf);
                    for (Object obj3 : objArr) {
                        jSONArray.put(obj3);
                    }
                    HandlerType handlerType = HandlerType.INVOCATION;
                    commonWebViewBridge$request$1.L$0 = c;
                    commonWebViewBridge$request$1.label = 1;
                    if (execute(handlerType, jSONArray, commonWebViewBridge$request$1) != obj2) {
                        pa3Var = c;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pa3Var = (pa3) commonWebViewBridge$request$1.L$0;
                y6a.M(obj);
                commonWebViewBridge$request$1.L$0 = null;
                commonWebViewBridge$request$1.label = 2;
                Object w = ((qa3) pa3Var).w(commonWebViewBridge$request$1);
                lu3 lu3Var = lu3.a;
                return w != obj2 ? obj2 : w;
            }
        }
        commonWebViewBridge$request$1 = new CommonWebViewBridge$request$1(this, rq3Var);
        Object obj4 = commonWebViewBridge$request$1.result;
        Object obj22 = lu3.a;
        i = commonWebViewBridge$request$1.label;
        if (i != 0) {
        }
        commonWebViewBridge$request$1.L$0 = null;
        commonWebViewBridge$request$1.label = 2;
        Object w2 = ((qa3) pa3Var).w(commonWebViewBridge$request$1);
        lu3 lu3Var2 = lu3.a;
        if (w2 != obj22) {
        }
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    @Nullable
    public Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull rq3<? super Unit> rq3Var) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object execute = execute(HandlerType.EVENT, jSONArray, rq3Var);
        return execute == lu3.a ? execute : Unit.a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void setExposedFunctions(@NotNull Map<String, ? extends Function0<? extends ExposedFunction>> map) {
        map.getClass();
        this.exposedFunctions = map;
    }
}
