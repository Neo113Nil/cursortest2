package ai.verisoul.sdk.data.local.preferences;

import L0.c;
import L0.f;
import ai.verisoul.sdk.helpers.session.SessionData;
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
@DebugMetadata(c = "ai.verisoul.sdk.data.local.preferences.PreferencesHelperImpl$saveSession$2", f = "PreferencesHelperImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PreferencesHelperImpl$saveSession$2 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
    final /* synthetic */ SessionData $sessionData;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesHelperImpl$saveSession$2(SessionData sessionData, Continuation<? super PreferencesHelperImpl$saveSession$2> continuation) {
        super(2, continuation);
        this.$sessionData = sessionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PreferencesHelperImpl$saveSession$2 preferencesHelperImpl$saveSession$2 = new PreferencesHelperImpl$saveSession$2(this.$sessionData, continuation);
        preferencesHelperImpl$saveSession$2.L$0 = obj;
        return preferencesHelperImpl$saveSession$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull c cVar, @Nullable Continuation<? super Unit> continuation) {
        return ((PreferencesHelperImpl$saveSession$2) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        cVar.k(aVar, this.$sessionData.toJson());
        return Unit.INSTANCE;
    }
}
