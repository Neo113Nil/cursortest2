package com.plaid.internal;

import com.plaid.internal.C3556a6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$storeLinkState$2", f = "HybridLinkStateStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3785x1 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N2 f41182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3794y1 f41183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3785x1(N2 n22, C3794y1 c3794y1, Continuation<? super C3785x1> continuation) {
        super(2, continuation);
        this.f41182a = n22;
        this.f41183b = c3794y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3785x1(this.f41182a, this.f41183b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3785x1(this.f41182a, this.f41183b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C3556a6.a.a(C3556a6.f39823a, "Store LinkState: " + this.f41182a);
        this.f41183b.f41198d = this.f41182a;
        C3794y1.b(this.f41183b, this.f41182a);
        return Unit.INSTANCE;
    }
}
