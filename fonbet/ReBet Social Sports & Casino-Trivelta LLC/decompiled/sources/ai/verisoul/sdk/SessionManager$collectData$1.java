package ai.verisoul.sdk;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.SessionManager", f = "SessionManager.kt", i = {0, 1, 1, 2}, l = {205, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC3631g.SDK_ASSET_ICON_PIN_VALUE}, m = "collectData", n = {"this", "this", "sid", "sid"}, s = {"L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes.dex */
public final class SessionManager$collectData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManager$collectData$1(SessionManager sessionManager, Continuation<? super SessionManager$collectData$1> continuation) {
        super(continuation);
        this.this$0 = sessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object collectData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        collectData = this.this$0.collectData(null, null, false, this);
        return collectData;
    }
}
