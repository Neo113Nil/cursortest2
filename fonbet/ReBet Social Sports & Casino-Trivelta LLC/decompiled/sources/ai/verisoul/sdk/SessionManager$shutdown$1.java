package ai.verisoul.sdk;

import Ph.C0;
import Ph.P;
import Ph.X;
import Wh.a;
import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.SessionManager$shutdown$1", f = "SessionManager.kt", i = {0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionManager.kt\nai/verisoul/sdk/SessionManager$shutdown$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,235:1\n120#2,10:236\n*S KotlinDebug\n*F\n+ 1 SessionManager.kt\nai/verisoul/sdk/SessionManager$shutdown$1\n*L\n221#1:236,10\n*E\n"})
/* loaded from: classes.dex */
public final class SessionManager$shutdown$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public SessionManager$shutdown$1(Continuation<? super SessionManager$shutdown$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SessionManager$shutdown$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((SessionManager$shutdown$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar;
        a aVar2;
        X x10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar = SessionManager.generationLock;
            this.L$0 = aVar;
            this.label = 1;
            if (aVar.f(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar2 = aVar;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            x10 = SessionManager.currentSessionGeneration;
            if (x10 != null) {
                C0.a.b(x10, null, 1, null);
            }
            SessionManager.currentSessionGeneration = null;
            Unit unit = Unit.INSTANCE;
            aVar2.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            aVar2.g(null);
            throw th2;
        }
    }
}
