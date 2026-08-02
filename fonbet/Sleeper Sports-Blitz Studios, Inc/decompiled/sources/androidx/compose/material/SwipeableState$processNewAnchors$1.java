package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: Swipeable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 2, 2}, l = {154, Opcodes.PUTSTATIC, Opcodes.INVOKEVIRTUAL}, m = "processNewAnchors$material", n = {"newAnchors", "targetOffset", "newAnchors", "targetOffset"}, s = {"L$0", "F$0", "L$0", "F$0"})
/* loaded from: classes.dex */
final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, Continuation<? super SwipeableState$processNewAnchors$1> continuation) {
        super(continuation);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$material(null, null, this);
    }
}
