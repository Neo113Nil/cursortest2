package ai.verisoul.sdk;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.SessionManager", f = "SessionManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7}, l = {45, 45, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 64, 251, 67, 70, 98}, m = "init", n = {"this", "projectId", "env", "this", "projectId", "env", "this", "projectId", "env", "$this$withLock_u24default$iv", "startTime", "maxDurationMs", "delayMs", "attempts", "this", "projectId", "env", "startTime", "maxDurationMs", "delayMs", "attempts", "this", "projectId", "env", "$this$withLock_u24default$iv", "startTime", "maxDurationMs", "delayMs", "attempts", "this", "projectId", "env", "startTime", "maxDurationMs", "delayMs", "attempts", "this", "projectId", "env", "startTime", "maxDurationMs", "delayMs", "attempts", "this", "projectId", "env", "startTime", "maxDurationMs", "delayMs", "attempts"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0"})
/* loaded from: classes.dex */
public final class SessionManager$init$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManager$init$1(SessionManager sessionManager, Continuation<? super SessionManager$init$1> continuation) {
        super(continuation);
        this.this$0 = sessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.init(null, null, this);
    }
}
