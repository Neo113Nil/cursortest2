package com.plaid.internal;

import com.plaid.internal.C3556a6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$getCurrentLinkState$2", f = "HybridLinkStateStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3776w1 extends SuspendLambda implements Function2<Ph.P, Continuation<? super N2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3794y1 f41158a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3776w1(C3794y1 c3794y1, Continuation<? super C3776w1> continuation) {
        super(2, continuation);
        this.f41158a = c3794y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3776w1(this.f41158a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super N2> continuation) {
        return new C3776w1(this.f41158a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        N2 n22;
        N2 n23;
        N2 n24;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n22 = this.f41158a.f41198d;
        if (n22 == null) {
            C3556a6.a.a(C3556a6.f39823a, "Initializing statestore");
            C3794y1 c3794y1 = this.f41158a;
            c3794y1.f41198d = C3794y1.b(c3794y1);
        }
        C3556a6.a aVar = C3556a6.f39823a;
        n23 = this.f41158a.f41198d;
        C3556a6.a.a(aVar, "Get current LinkState: " + n23);
        n24 = this.f41158a.f41198d;
        Intrinsics.checkNotNull(n24);
        return n24;
    }
}
