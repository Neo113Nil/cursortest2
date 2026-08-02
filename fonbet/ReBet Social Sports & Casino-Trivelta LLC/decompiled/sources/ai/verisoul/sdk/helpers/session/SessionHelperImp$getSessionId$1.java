package ai.verisoul.sdk.helpers.session;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.session.SessionHelperImp", f = "SessionHelperImp.kt", i = {}, l = {55}, m = "getSessionId", n = {}, s = {})
/* loaded from: classes.dex */
public final class SessionHelperImp$getSessionId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionHelperImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionHelperImp$getSessionId$1(SessionHelperImp sessionHelperImp, Continuation<? super SessionHelperImp$getSessionId$1> continuation) {
        super(continuation);
        this.this$0 = sessionHelperImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSessionId(this);
    }
}
