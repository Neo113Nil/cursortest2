package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Swipeable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableState$snapTo$2<T> implements FlowCollector {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ SwipeableState<T> this$0;

    SwipeableState$snapTo$2(T t, SwipeableState<T> swipeableState) {
        this.$targetValue = t;
        this.this$0 = swipeableState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((Map) obj, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation) {
        SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        int i;
        Float offset;
        Object snapInternalToOffset;
        if (continuation instanceof SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (SwipeableState$snapTo$2$emit$1) continuation;
            if ((swipeableState$snapTo$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.label -= Integer.MIN_VALUE;
                Object obj = swipeableState$snapTo$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableState$snapTo$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    offset = SwipeableKt.getOffset(map, this.$targetValue);
                    if (offset == null) {
                        throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
                    }
                    SwipeableState<T> swipeableState = this.this$0;
                    float floatValue = offset.floatValue();
                    swipeableState$snapTo$2$emit$1.label = 1;
                    snapInternalToOffset = swipeableState.snapInternalToOffset(floatValue, swipeableState$snapTo$2$emit$1);
                    if (snapInternalToOffset == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.setCurrentValue(this.$targetValue);
                return Unit.INSTANCE;
            }
        }
        swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, continuation);
        Object obj2 = swipeableState$snapTo$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$snapTo$2$emit$1.label;
        if (i != 0) {
        }
        this.this$0.setCurrentValue(this.$targetValue);
        return Unit.INSTANCE;
    }
}
