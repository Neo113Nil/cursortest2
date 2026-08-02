package ai.verisoul.sdk;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.SessionManager", f = "SessionManager.kt", i = {0, 0, 1, 2, 4}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 151, EnumC3631g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 192}, m = "getSessionId", n = {"this", "$this$withLock_u24default$iv", "this", "$this$getSessionId_u24lambda_u247", "sid"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionManager$getSessionId$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManager$getSessionId$1(SessionManager sessionManager, Continuation<? super SessionManager$getSessionId$1> continuation) {
        super(continuation);
        this.this$0 = sessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSessionId(this);
    }
}
