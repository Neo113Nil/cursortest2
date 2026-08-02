package ai.verisoul.sdk.helpers.sensor;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl", f = "GatherUserEventsHelperImpl.kt", i = {0}, l = {EnumC3631g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m = "uploadData", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl$uploadData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GatherUserEventsHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatherUserEventsHelperImpl$uploadData$1(GatherUserEventsHelperImpl gatherUserEventsHelperImpl, Continuation<? super GatherUserEventsHelperImpl$uploadData$1> continuation) {
        super(continuation);
        this.this$0 = gatherUserEventsHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object uploadData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        uploadData = this.this$0.uploadData(null, this);
        return uploadData;
    }
}
