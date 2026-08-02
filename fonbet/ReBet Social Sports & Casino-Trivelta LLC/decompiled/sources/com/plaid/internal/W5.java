package com.plaid.internal;

import com.plaid.internal.F6;
import com.plaid.internal.Y6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1$2$1", f = "PlaidWebview.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class W5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P5 f39742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(P5 p52, String str, Continuation<? super W5> continuation) {
        super(2, continuation);
        this.f39742a = p52;
        this.f39743b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new W5(this.f39742a, this.f39743b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new W5(this.f39742a, this.f39743b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f39742a.a().get()) {
            Y6.a.a("Webview is destroyed, cannot submit data");
            return Unit.INSTANCE;
        }
        this.f39742a.loadUrl("javascript:window.SdkJsBridge.send('" + this.f39743b + "')");
        F6.a.b(MapsKt.emptyMap(), "JSBridge - sent submit");
        return Unit.INSTANCE;
    }
}
