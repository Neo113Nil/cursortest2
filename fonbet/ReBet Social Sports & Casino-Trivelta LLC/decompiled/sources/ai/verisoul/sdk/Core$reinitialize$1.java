package ai.verisoul.sdk;

import Ph.P;
import kotlin.Metadata;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.Core$reinitialize$1", f = "Core.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Core$reinitialize$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    int label;

    public Core$reinitialize$1(Continuation<? super Core$reinitialize$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Core$reinitialize$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Core$reinitialize$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean acquireDebounce;
        VerisoulEnvironment verisoulEnvironment;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            acquireDebounce = Core.INSTANCE.acquireDebounce();
            if (!acquireDebounce) {
                return Unit.INSTANCE;
            }
            SessionManager sessionManager = SessionManager.INSTANCE;
            String str = Core.projectIdentifier;
            VerisoulEnvironment verisoulEnvironment2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("projectIdentifier");
                str = null;
            }
            verisoulEnvironment = Core.deploymentEnvironment;
            if (verisoulEnvironment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deploymentEnvironment");
            } else {
                verisoulEnvironment2 = verisoulEnvironment;
            }
            this.label = 1;
            if (sessionManager.reinitialize(str, verisoulEnvironment2, this) == coroutine_suspended) {
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
