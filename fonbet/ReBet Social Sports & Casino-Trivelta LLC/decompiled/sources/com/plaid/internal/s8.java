package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$getPane$2", f = "WorkflowViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class s8 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Pane$PaneRendering>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f41061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f41062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r8 f41063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(u8 u8Var, r8 r8Var, Continuation<? super s8> continuation) {
        super(2, continuation);
        this.f41062b = u8Var;
        this.f41063c = r8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new s8(this.f41062b, this.f41063c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Pane$PaneRendering> continuation) {
        return new s8(this.f41062b, this.f41063c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f41061a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC3799y6 b10 = this.f41062b.b();
            r8 r8Var = this.f41063c;
            this.f41061a = 1;
            obj = b10.a(r8Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
        if (pane$PaneRendering != null) {
            return pane$PaneRendering;
        }
        r8 r8Var2 = this.f41063c;
        throw new F2("No pane rendering found for " + r8Var2 + ".first: " + r8Var2 + ".second");
    }
}
