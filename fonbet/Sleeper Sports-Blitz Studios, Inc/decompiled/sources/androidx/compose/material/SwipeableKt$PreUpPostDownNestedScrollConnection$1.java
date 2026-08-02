package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0003*\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0015*\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"androidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPreScroll", "Landroidx/compose/ui/geometry/Offset;", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPostScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toOffset", "", "(F)J", "toFloat", "(J)F", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ SwipeableState<T> $this_PreUpPostDownNestedScrollConnection;

    SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState<T> swipeableState) {
        this.$this_PreUpPostDownNestedScrollConnection = swipeableState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo1243onPreScrollOzD1aCk(long available, int source) {
        float f = toFloat(available);
        if (f < 0.0f && NestedScrollSource.m7210equalsimpl0(source, NestedScrollSource.INSTANCE.m7222getUserInputWNlRxjI())) {
            return toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(f));
        }
        return Offset.INSTANCE.m5787getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo892onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (NestedScrollSource.m7210equalsimpl0(source, NestedScrollSource.INSTANCE.m7222getUserInputWNlRxjI())) {
            return toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(toFloat(available)));
        }
        return Offset.INSTANCE.m5787getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1242onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        int i;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) continuation;
            if ((swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label -= Integer.MIN_VALUE;
                Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    float m9036getXimpl = Velocity.m9036getXimpl(j);
                    float m9037getYimpl = Velocity.m9037getYimpl(j);
                    float f = toFloat(Offset.m5763constructorimpl((Float.floatToRawIntBits(m9036getXimpl) << 32) | (Float.floatToRawIntBits(m9037getYimpl) & 4294967295L)));
                    if (f < 0.0f && this.$this_PreUpPostDownNestedScrollConnection.getOffset().getValue().floatValue() > this.$this_PreUpPostDownNestedScrollConnection.getMinBound()) {
                        SwipeableState<T> swipeableState = this.$this_PreUpPostDownNestedScrollConnection;
                        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J$0 = j;
                        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label = 1;
                        if (swipeableState.performFling(f, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        j = Velocity.INSTANCE.m9047getZero9UxMQ8M();
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m9027boximpl(j);
            }
        }
        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, continuation);
        Object obj2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label;
        if (i != 0) {
        }
        return Velocity.m9027boximpl(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo891onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        int i;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) continuation;
            if ((swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label -= Integer.MIN_VALUE;
                Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SwipeableState<T> swipeableState = this.$this_PreUpPostDownNestedScrollConnection;
                    float m9036getXimpl = Velocity.m9036getXimpl(j2);
                    float m9037getYimpl = Velocity.m9037getYimpl(j2);
                    float f = toFloat(Offset.m5763constructorimpl((Float.floatToRawIntBits(m9036getXimpl) << 32) | (Float.floatToRawIntBits(m9037getYimpl) & 4294967295L)));
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                    swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label = 1;
                    if (swipeableState.performFling(f, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m9027boximpl(j2);
            }
        }
        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, continuation);
        Object obj2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label;
        if (i != 0) {
        }
        return Velocity.m9027boximpl(j2);
    }

    private final long toOffset(float f) {
        return Offset.m5763constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    private final float toFloat(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
