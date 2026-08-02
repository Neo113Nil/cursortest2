package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Swipeable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {}, l = {310}, m = "emit", n = {}, s = {})
/* loaded from: classes.dex */
final class SwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState$snapTo$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2<? super T> swipeableState$snapTo$2, Continuation<? super SwipeableState$snapTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (Continuation<? super Unit>) this);
    }
}
