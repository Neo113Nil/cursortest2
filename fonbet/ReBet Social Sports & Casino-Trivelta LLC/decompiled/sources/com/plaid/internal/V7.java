package com.plaid.internal;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$onSessionHandoff$1", f = "WebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class V7 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7 f39726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f39727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(U7 u72, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f39726b = u72;
        this.f39727c = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new V7(this.f39726b, this.f39727c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new V7(this.f39726b, this.f39727c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39725a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC3759u2 b10 = this.f39726b.b();
            LinkedHashMap linkedHashMap = this.f39727c;
            this.f39725a = 1;
            if (b10.a(linkedHashMap, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
