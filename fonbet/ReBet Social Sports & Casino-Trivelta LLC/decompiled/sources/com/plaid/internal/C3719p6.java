package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1483w0;
import android.webkit.JavascriptInterface;
import com.plaid.internal.AbstractC3743s4;
import com.plaid.internal.C3549a;
import com.plaid.internal.C3556a6;
import com.plaid.internal.F6;
import com.plaid.internal.Y6;
import ei.AbstractC4212b;
import ei.C4214d;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.AbstractC5323h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.p6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3719p6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3609d4 f40963a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC4212b f40964b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.y f40965c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.L f40966d;

    /* renamed from: com.plaid.internal.p6$a */
    public static final class a extends Lambda implements Function1<C4214d, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40967a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C4214d c4214d) {
            C4214d Json = c4214d;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.e(true);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.core.webview.PreloadWebViewJSInterface$postMessage$1", f = "PreloadWebViewJSInterface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.p6$b */
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3719p6.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return C3719p6.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C3719p6.this.f40965c.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    public C3719p6(@NotNull C3609d4 mutablePlaidWebViewMessageInterceptor) {
        Intrinsics.checkNotNullParameter(mutablePlaidWebViewMessageInterceptor, "mutablePlaidWebViewMessageInterceptor");
        this.f40963a = mutablePlaidWebViewMessageInterceptor;
        this.f40964b = ei.v.b(null, a.f40967a, 1, null);
        kotlinx.coroutines.flow.y a10 = kotlinx.coroutines.flow.N.a(Boolean.FALSE);
        this.f40965c = a10;
        this.f40966d = AbstractC5323h.b(a10);
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            AbstractC4212b abstractC4212b = this.f40964b;
            C3549a.b.a();
            C3549a c3549a = (C3549a) abstractC4212b.d(C3549a.C0549a.f39814a, message);
            String a10 = c3549a.a();
            if (Intrinsics.areEqual(a10, "ready")) {
                C3556a6.a.a(C3556a6.f39823a, "JS received Link is ready");
                F6.a.b(MapsKt.emptyMap(), "JSBridge - received ready");
                AbstractC1459k.d(C1483w0.f9135a, null, null, new b(null), 3, null);
                return;
            }
            if (!Intrinsics.areEqual(a10, "open-webview")) {
                Y6.a.a("JS sent unknown action: " + c3549a.a());
                F6.a.a(MapsKt.mapOf(TuplesKt.to("action", c3549a.a())), "JSBridge - received unknown action");
                return;
            }
            AbstractC3743s4 a11 = AbstractC3743s4.a.a(message);
            C3556a6.a.a(C3556a6.f39823a, "JS received open webview message : " + a11);
            F6.a.b(MapsKt.emptyMap(), "JSBridge - received open-webview");
            this.f40963a.a(a11);
        } catch (Exception e10) {
            Y6.a.a(e10, "Error parsing message: " + message);
            Pair pair = TuplesKt.to("message", message);
            String message2 = e10.getMessage();
            if (message2 == null) {
                message2 = "unknown";
            }
            F6.a.a(MapsKt.mapOf(pair, TuplesKt.to("error", message2)), "JSBridge - error parsing message");
        }
    }
}
