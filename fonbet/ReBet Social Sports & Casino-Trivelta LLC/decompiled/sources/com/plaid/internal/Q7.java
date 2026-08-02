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

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$1", f = "WebviewViewModel.kt", i = {}, l = {121, 127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Q7 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7 f39573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7(U7 u72, Continuation<? super Q7> continuation) {
        super(2, continuation);
        this.f39573b = u72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Q7(this.f39573b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new Q7(this.f39573b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        if (r5 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39572a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C6 c62 = this.f39573b.f39674c;
            if (c62 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackUri");
                c62 = null;
            }
            this.f39572a = 1;
            obj = c62.a(this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            return Unit.INSTANCE;
        }
        kotlinx.coroutines.flow.x xVar = this.f39573b.f39684m;
        this.f39572a = 2;
    }
}
