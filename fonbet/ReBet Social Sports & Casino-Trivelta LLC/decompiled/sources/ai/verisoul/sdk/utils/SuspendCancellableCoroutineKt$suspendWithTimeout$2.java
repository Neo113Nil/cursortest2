package ai.verisoul.sdk.utils;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.P;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LPh/P;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.utils.SuspendCancellableCoroutineKt$suspendWithTimeout$2", f = "suspendCancellableCoroutine.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nsuspendCancellableCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 suspendCancellableCoroutine.kt\nai/verisoul/sdk/utils/SuspendCancellableCoroutineKt$suspendWithTimeout$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,21:1\n314#2,11:22\n*S KotlinDebug\n*F\n+ 1 suspendCancellableCoroutine.kt\nai/verisoul/sdk/utils/SuspendCancellableCoroutineKt$suspendWithTimeout$2\n*L\n13#1:22,11\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendCancellableCoroutineKt$suspendWithTimeout$2<T> extends SuspendLambda implements Function2<P, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<Function1<? super T, Unit>, Function1<? super Throwable, Unit>, Unit> $block;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendCancellableCoroutineKt$suspendWithTimeout$2(Function2<? super Function1<? super T, Unit>, ? super Function1<? super Throwable, Unit>, Unit> function2, Continuation<? super SuspendCancellableCoroutineKt$suspendWithTimeout$2> continuation) {
        super(2, continuation);
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SuspendCancellableCoroutineKt$suspendWithTimeout$2(this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super T> continuation) {
        return ((SuspendCancellableCoroutineKt$suspendWithTimeout$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Function2<Function1<? super T, Unit>, Function1<? super Throwable, Unit>, Unit> function2 = this.$block;
        this.L$0 = function2;
        this.label = 1;
        final C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(this), 1);
        c1469p.F();
        function2.invoke(new Function1<T, Unit>() { // from class: ai.verisoul.sdk.utils.SuspendCancellableCoroutineKt$suspendWithTimeout$2$1$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                invoke2((SuspendCancellableCoroutineKt$suspendWithTimeout$2$1$1<T>) obj2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                if (InterfaceC1465n.this.isActive()) {
                    InterfaceC1465n.this.resumeWith(Result.m147constructorimpl(t10));
                }
            }
        }, new Function1<Throwable, Unit>() { // from class: ai.verisoul.sdk.utils.SuspendCancellableCoroutineKt$suspendWithTimeout$2$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                if (InterfaceC1465n.this.isActive()) {
                    InterfaceC1465n interfaceC1465n = InterfaceC1465n.this;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(error)));
                }
            }
        });
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return z10 == coroutine_suspended ? coroutine_suspended : z10;
    }
}
