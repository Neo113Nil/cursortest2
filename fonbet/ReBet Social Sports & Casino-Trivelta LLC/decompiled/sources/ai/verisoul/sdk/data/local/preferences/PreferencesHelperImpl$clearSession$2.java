package ai.verisoul.sdk.data.local.preferences;

import L0.c;
import L0.f;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/c;", "preferences", "", "<anonymous>", "(LL0/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.data.local.preferences.PreferencesHelperImpl$clearSession$2", f = "PreferencesHelperImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PreferencesHelperImpl$clearSession$2 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public PreferencesHelperImpl$clearSession$2(Continuation<? super PreferencesHelperImpl$clearSession$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PreferencesHelperImpl$clearSession$2 preferencesHelperImpl$clearSession$2 = new PreferencesHelperImpl$clearSession$2(continuation);
        preferencesHelperImpl$clearSession$2.L$0 = obj;
        return preferencesHelperImpl$clearSession$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull c cVar, @Nullable Continuation<? super Unit> continuation) {
        return ((PreferencesHelperImpl$clearSession$2) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        f.a aVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        c cVar = (c) this.L$0;
        aVar = PreferencesHelperImpl.SESSION_KEY;
        cVar.j(aVar);
        return Unit.INSTANCE;
    }
}
