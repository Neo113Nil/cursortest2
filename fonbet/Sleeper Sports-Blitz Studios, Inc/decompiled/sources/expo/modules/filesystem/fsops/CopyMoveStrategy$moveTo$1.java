package expo.modules.filesystem.fsops;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CopyMoveStrategy.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.fsops.CopyMoveStrategy", f = "CopyMoveStrategy.kt", i = {0}, l = {40}, m = "moveTo$suspendImpl", n = {"$this$moveTo_u24lambda_u241"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class CopyMoveStrategy$moveTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CopyMoveStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CopyMoveStrategy$moveTo$1(CopyMoveStrategy copyMoveStrategy, Continuation<? super CopyMoveStrategy$moveTo$1> continuation) {
        super(continuation);
        this.this$0 = copyMoveStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CopyMoveStrategy.moveTo$suspendImpl(this.this$0, null, this);
    }
}
