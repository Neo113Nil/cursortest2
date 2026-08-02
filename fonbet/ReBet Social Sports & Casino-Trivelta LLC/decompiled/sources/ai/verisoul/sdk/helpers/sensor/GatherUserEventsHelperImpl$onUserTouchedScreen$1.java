package ai.verisoul.sdk.helpers.sensor;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl", f = "GatherUserEventsHelperImpl.kt", i = {0, 0, 0}, l = {93, 102}, m = "onUserTouchedScreen", n = {"this", "motionEvent", "sessionId"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl$onUserTouchedScreen$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GatherUserEventsHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatherUserEventsHelperImpl$onUserTouchedScreen$1(GatherUserEventsHelperImpl gatherUserEventsHelperImpl, Continuation<? super GatherUserEventsHelperImpl$onUserTouchedScreen$1> continuation) {
        super(continuation);
        this.this$0 = gatherUserEventsHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onUserTouchedScreen(null, null, this);
    }
}
