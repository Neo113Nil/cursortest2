package ai.verisoul.sdk.helpers.integrity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.integrity.AppIntegrityHelperImp", f = "AppIntegrityHelper.kt", i = {0, 0, 0, 0, 1, 1, 2, 2}, l = {80, 92, 99}, m = "postIntegrityToken", n = {"this", "playIntegrityToken", "expectedSessionId", "integrityCheckStartTimestamp", "this", "integrityCheckStartTimestamp", "this", "integrityCheckStartTimestamp"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes.dex */
public final class AppIntegrityHelperImp$postIntegrityToken$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppIntegrityHelperImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntegrityHelperImp$postIntegrityToken$1(AppIntegrityHelperImp appIntegrityHelperImp, Continuation<? super AppIntegrityHelperImp$postIntegrityToken$1> continuation) {
        super(continuation);
        this.this$0 = appIntegrityHelperImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object postIntegrityToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        postIntegrityToken = this.this$0.postIntegrityToken(null, null, 0L, this);
        return postIntegrityToken;
    }
}
