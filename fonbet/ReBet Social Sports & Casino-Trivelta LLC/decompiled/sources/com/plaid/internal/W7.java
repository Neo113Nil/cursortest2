package com.plaid.internal;

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

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$trackWebviewFallbackOpen$1", f = "WebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class W7 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7 f39754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7(U7 u72, Continuation<? super W7> continuation) {
        super(2, continuation);
        this.f39754b = u72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new W7(this.f39754b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new W7(this.f39754b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39753a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            I7 i72 = this.f39754b.f39678g;
            if (i72 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webviewFallbackAnalytics");
                i72 = null;
            }
            this.f39753a = 1;
            if (i72.c(this) == coroutine_suspended) {
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
