package ai.verisoul.sdk;

import Ph.P;
import ai.verisoul.sdk.helpers.webview.VerisoulSessionCallback;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.Core$failCallback$2", f = "Core.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Core$failCallback$2 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ VerisoulSessionCallback $callback;
    final /* synthetic */ Throwable $cause;
    final /* synthetic */ String $message;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Core$failCallback$2(VerisoulSessionCallback verisoulSessionCallback, String str, Throwable th2, Continuation<? super Core$failCallback$2> continuation) {
        super(2, continuation);
        this.$callback = verisoulSessionCallback;
        this.$message = str;
        this.$cause = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Core$failCallback$2(this.$callback, this.$message, this.$cause, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Core$failCallback$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$callback.onFailure(new VerisoulException(VerisoulErrorCodes.SESSION_UNAVAILABLE, this.$message, this.$cause));
        return Unit.INSTANCE;
    }
}
