package ai.verisoul.sdk;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.SessionManager", f = "SessionManager.kt", i = {0, 0, 0, 0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m = "generateTokenInternal", n = {"projectId", "env", "$this$withLock_u24default$iv", "isReinitialization"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes.dex */
public final class SessionManager$generateTokenInternal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManager$generateTokenInternal$1(SessionManager sessionManager, Continuation<? super SessionManager$generateTokenInternal$1> continuation) {
        super(continuation);
        this.this$0 = sessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object generateTokenInternal;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        generateTokenInternal = this.this$0.generateTokenInternal(null, null, false, this);
        return generateTokenInternal;
    }
}
