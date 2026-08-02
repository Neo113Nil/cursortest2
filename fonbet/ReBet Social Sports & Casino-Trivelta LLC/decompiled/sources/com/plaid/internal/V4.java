package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$storeNoLoadingUi$3", f = "PlaidClientSideOnlyConfigurationStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class V4 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f39715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(W4 w42, boolean z10, Continuation<? super V4> continuation) {
        super(2, continuation);
        this.f39715a = w42;
        this.f39716b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new V4(this.f39715a, this.f39716b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new V4(this.f39715a, this.f39716b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f39715a.f39740a.a("plaid_no_loading_ui", String.valueOf(this.f39716b));
        return Unit.INSTANCE;
    }
}
