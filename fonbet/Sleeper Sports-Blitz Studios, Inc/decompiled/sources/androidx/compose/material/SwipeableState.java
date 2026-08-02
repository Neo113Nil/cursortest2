package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 w*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001wBD\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010=\u001a\u00020>2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,H\u0000¢\u0006\u0002\b@J8\u0010A\u001a\u00020>2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,H\u0080@¢\u0006\u0004\bC\u0010DJ\u0016\u0010\\\u001a\u00020>2\u0006\u0010]\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010^J$\u0010_\u001a\u00020>2\u0006\u0010]\u001a\u00020\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0002\u0010aJ\u0016\u0010n\u001a\u00020>2\u0006\u0010b\u001a\u00028\u0000H\u0087@¢\u0006\u0002\u0010oJ&\u0010p\u001a\u00020>2\u0006\u0010b\u001a\u00028\u00002\u000e\b\u0002\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087@¢\u0006\u0002\u0010rJ\u0016\u0010s\u001a\u00020>2\u0006\u0010t\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010^J\u000e\u0010u\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060+X\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,04X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109RO\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060E2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060E8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u001a\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010L\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bM\u00107\"\u0004\bN\u00109R/\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010\u0013\u001a\u0004\u0018\u00010Q8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010\u001a\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020YX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001a\u0010b\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010d\u001a\u0004\be\u0010\u0016R \u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000g8FX\u0087\u0004¢\u0006\f\u0012\u0004\bh\u0010d\u001a\u0004\bi\u0010jR\u001a\u0010k\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\bl\u0010d\u001a\u0004\bm\u00107¨\u0006x"}, d2 = {"Landroidx/compose/material/SwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "getAnimationSpec$material", "()Landroidx/compose/animation/core/AnimationSpec;", "getConfirmStateChange$material", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "isAnimationRunning$delegate", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", ViewProps.OVERFLOW, "getOverflow", "offsetState", "Landroidx/compose/runtime/MutableFloatState;", "overflowState", "absoluteOffset", "animationTarget", "Landroidx/compose/runtime/MutableState;", "", "anchors", "getAnchors$material", "()Ljava/util/Map;", "setAnchors$material", "(Ljava/util/Map;)V", "anchors$delegate", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "minBound", "getMinBound$material", "()F", "setMinBound$material", "(F)V", "maxBound", "getMaxBound$material", "setMaxBound$material", "ensureInit", "", "newAnchors", "ensureInit$material", "processNewAnchors", "oldAnchors", "processNewAnchors$material", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "thresholds", "getThresholds$material", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material", "(Lkotlin/jvm/functions/Function2;)V", "thresholds$delegate", "velocityThreshold", "getVelocityThreshold$material", "setVelocityThreshold$material", "velocityThreshold$delegate", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/material/ResistanceConfig;", "resistance", "getResistance$material", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance$delegate", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material", "()Landroidx/compose/foundation/gestures/DraggableState;", "snapInternalToOffset", TypedValues.AttributesType.S_TARGET, "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateInternalToOffset", "spec", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "getTargetValue$annotations", "()V", "getTargetValue", "progress", "Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "direction", "getDirection$annotations", "getDirection", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "anim", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performFling", "velocity", "performDrag", "delta", "Companion", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MutableFloatState absoluteOffset;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final MutableState anchors;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final Function1<T, Boolean> confirmStateChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final MutableState currentValue;
    private final DraggableState draggableState;

    /* renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    private final MutableState isAnimationRunning;
    private final Flow<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableFloatState offsetState;
    private final MutableFloatState overflowState;

    /* renamed from: resistance$delegate, reason: from kotlin metadata */
    private final MutableState resistance;

    /* renamed from: thresholds$delegate, reason: from kotlin metadata */
    private final MutableState thresholds;

    /* renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    private final MutableFloatState velocityThreshold;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    public static /* synthetic */ void getDirection$annotations() {
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float thresholds_delegate$lambda$7(float f, float f2) {
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
        this.animationSpec = animationSpec;
        this.confirmStateChange = function1;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.isAnimationRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.offsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map anchors$material;
                anchors$material = SwipeableState.this.getAnchors$material();
                return anchors$material;
            }
        });
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!((Map) obj).isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function2() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                float thresholds_delegate$lambda$7;
                thresholds_delegate$lambda$7 = SwipeableState.thresholds_delegate$lambda$7(((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return Float.valueOf(thresholds_delegate$lambda$7);
            }
        }, null, 2, null);
        this.velocityThreshold = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.resistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new Function1() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit draggableState$lambda$8;
                draggableState$lambda$8 = SwipeableState.draggableState$lambda$8(SwipeableState.this, ((Float) obj).floatValue());
                return draggableState$lambda$8;
            }
        });
    }

    public /* synthetic */ SwipeableState(Object obj, SpringSpec<Float> springSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? new Function1() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean _init_$lambda$0;
                _init_$lambda$0 = SwipeableState._init_$lambda$0(obj2);
                return Boolean.valueOf(_init_$lambda$0);
            }
        } : function1);
    }

    public final AnimationSpec<Float> getAnimationSpec$material() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmStateChange$material() {
        return this.confirmStateChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z));
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final Map<Float, T> getAnchors$material() {
        return (Map) this.anchors.getValue();
    }

    public final void setAnchors$material(Map<Float, ? extends T> map) {
        this.anchors.setValue(map);
    }

    /* renamed from: getMinBound$material, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    public final void setMinBound$material(float f) {
        this.minBound = f;
    }

    /* renamed from: getMaxBound$material, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    public final void setMaxBound$material(float f) {
        this.maxBound = f;
    }

    public final void ensureInit$material(Map<Float, ? extends T> newAnchors) {
        Float offset;
        if (getAnchors$material().isEmpty()) {
            offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setFloatValue(offset.floatValue());
            this.absoluteOffset.setFloatValue(offset.floatValue());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(6:21|22|23|14|15|16))(3:25|26|27))(3:28|(2:30|(1:32)(2:35|36))(4:37|(3:39|(2:41|(1:43)(3:46|(2:48|(2:50|(3:51|(1:53)|54)))|58))(4:59|(1:61)|62|(1:64)(3:65|(2:67|(2:69|(3:70|(1:72)|73)))|77))|44)|15|16)|34)))|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (snapInternalToOffset(r10, r0) == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c5, code lost:
    
        if (r12 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fa, code lost:
    
        r0.L$0 = r11;
        r0.F$0 = r10;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0204, code lost:
    
        if (snapInternalToOffset(r10, r0) != r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v24, types: [float] */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v68, types: [float] */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processNewAnchors$material(Map<Float, ? extends T> map, Map<Float, ? extends T> map2, Continuation<? super Unit> continuation) {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        int i;
        Float offset;
        float f;
        Float offset2;
        Float offset3;
        try {
            if (continuation instanceof SwipeableState$processNewAnchors$1) {
                swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) continuation;
                if ((swipeableState$processNewAnchors$1.label & Integer.MIN_VALUE) != 0) {
                    swipeableState$processNewAnchors$1.label -= Integer.MIN_VALUE;
                    Object obj = swipeableState$processNewAnchors$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = swipeableState$processNewAnchors$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 2) {
                            boolean z = (Map<Float, ? extends T>) swipeableState$processNewAnchors$1.F$0;
                            map2 = (Map) swipeableState$processNewAnchors$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            map = z;
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map = (Map<Float, ? extends T>) swipeableState$processNewAnchors$1.F$0;
                        map2 = (Map) swipeableState$processNewAnchors$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    if (map.isEmpty()) {
                        Float minOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(minOrNull);
                        this.minBound = minOrNull.floatValue();
                        Float maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                        Intrinsics.checkNotNull(maxOrNull);
                        this.maxBound = maxOrNull.floatValue();
                        offset3 = SwipeableKt.getOffset(map2, getCurrentValue());
                        if (offset3 == null) {
                            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                        }
                        float floatValue = offset3.floatValue();
                        swipeableState$processNewAnchors$1.label = 1;
                    } else {
                        if (!Intrinsics.areEqual(map2, map)) {
                            this.minBound = Float.NEGATIVE_INFINITY;
                            this.maxBound = Float.POSITIVE_INFINITY;
                            Float value = this.animationTarget.getValue();
                            Object obj2 = null;
                            if (value != null) {
                                offset2 = SwipeableKt.getOffset(map2, map.get(value));
                                if (offset2 != null) {
                                    f = offset2.floatValue();
                                } else {
                                    Iterator<T> it = map2.keySet().iterator();
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (it.hasNext()) {
                                            float abs = Math.abs(((Number) obj2).floatValue() - value.floatValue());
                                            do {
                                                Object next = it.next();
                                                float abs2 = Math.abs(((Number) next).floatValue() - value.floatValue());
                                                if (Float.compare(abs, abs2) > 0) {
                                                    obj2 = next;
                                                    abs = abs2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj2);
                                    f = ((Number) obj2).floatValue();
                                }
                            } else {
                                Object obj3 = map.get(getOffset().getValue());
                                if (Intrinsics.areEqual(obj3, getCurrentValue())) {
                                    obj3 = getCurrentValue();
                                }
                                offset = SwipeableKt.getOffset(map2, obj3);
                                if (offset != null) {
                                    f = offset.floatValue();
                                } else {
                                    Iterator<T> it2 = map2.keySet().iterator();
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        if (it2.hasNext()) {
                                            float abs3 = Math.abs(((Number) obj2).floatValue() - getOffset().getValue().floatValue());
                                            do {
                                                Object next2 = it2.next();
                                                float abs4 = Math.abs(((Number) next2).floatValue() - getOffset().getValue().floatValue());
                                                if (Float.compare(abs3, abs4) > 0) {
                                                    obj2 = next2;
                                                    abs3 = abs4;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj2);
                                    f = ((Number) obj2).floatValue();
                                }
                            }
                            AnimationSpec<Float> animationSpec = this.animationSpec;
                            swipeableState$processNewAnchors$1.L$0 = map2;
                            swipeableState$processNewAnchors$1.F$0 = f;
                            swipeableState$processNewAnchors$1.label = 2;
                            Object animateInternalToOffset = animateInternalToOffset(f, animationSpec, swipeableState$processNewAnchors$1);
                            map = f;
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            if (i == 0) {
            }
        } finally {
            setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(map)));
            Float minOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
            Intrinsics.checkNotNull(minOrNull2);
            this.minBound = minOrNull2.floatValue();
            Float maxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
            Intrinsics.checkNotNull(maxOrNull2);
            this.maxBound = maxOrNull2.floatValue();
        }
        swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, continuation);
        Object obj4 = swipeableState$processNewAnchors$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$processNewAnchors$1.label;
    }

    public final Function2<Float, Float, Float> getThresholds$material() {
        return (Function2) this.thresholds.getValue();
    }

    public final void setThresholds$material(Function2<? super Float, ? super Float, Float> function2) {
        this.thresholds.setValue(function2);
    }

    public final float getVelocityThreshold$material() {
        return this.velocityThreshold.getFloatValue();
    }

    public final void setVelocityThreshold$material(float f) {
        this.velocityThreshold.setFloatValue(f);
    }

    public final ResistanceConfig getResistance$material() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final void setResistance$material(ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    /* renamed from: getDraggableState$material, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draggableState$lambda$8(SwipeableState swipeableState, float f) {
        float floatValue = swipeableState.absoluteOffset.getFloatValue() + f;
        float coerceIn = RangesKt.coerceIn(floatValue, swipeableState.minBound, swipeableState.maxBound);
        float f2 = floatValue - coerceIn;
        ResistanceConfig resistance$material = swipeableState.getResistance$material();
        swipeableState.offsetState.setFloatValue(coerceIn + (resistance$material != null ? resistance$material.computeResistance(f2) : 0.0f));
        swipeableState.overflowState.setFloatValue(f2);
        swipeableState.absoluteOffset.setFloatValue(floatValue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    public final T getTargetValue() {
        Float offset;
        float computeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue = getOffset().getValue().floatValue();
            offset = SwipeableKt.getOffset(getAnchors$material(), getCurrentValue());
            computeTarget = SwipeableKt.computeTarget(floatValue, offset != null ? offset.floatValue() : getOffset().getValue().floatValue(), getAnchors$material().keySet(), getThresholds$material(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material().get(Float.valueOf(computeTarget));
        return t == null ? getCurrentValue() : t;
    }

    public final SwipeProgress<T> getProgress() {
        List findBounds;
        Object currentValue;
        Object obj;
        float f;
        Pair pair;
        findBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material().keySet());
        int size = findBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
            f = 1.0f;
        } else if (size == 1) {
            Object value = MapsKt.getValue(getAnchors$material(), findBounds.get(0));
            currentValue = MapsKt.getValue(getAnchors$material(), findBounds.get(0));
            f = 1.0f;
            obj = value;
        } else {
            if (getDirection() > 0.0f) {
                pair = TuplesKt.to(findBounds.get(0), findBounds.get(1));
            } else {
                pair = TuplesKt.to(findBounds.get(1), findBounds.get(0));
            }
            float floatValue = ((Number) pair.component1()).floatValue();
            float floatValue2 = ((Number) pair.component2()).floatValue();
            obj = MapsKt.getValue(getAnchors$material(), Float.valueOf(floatValue));
            currentValue = MapsKt.getValue(getAnchors$material(), Float.valueOf(floatValue2));
            f = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        }
        return new SwipeProgress<>(obj, currentValue, f);
    }

    public final float getDirection() {
        Float offset;
        offset = SwipeableKt.getOffset(getAnchors$material(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
    }

    public final Object snapTo(T t, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$2(t, this), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, continuation);
    }

    public final Object animateTo(T t, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(t, this, animationSpec), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final Object performFling(final float f, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new FlowCollector(this) { // from class: androidx.compose.material.SwipeableState$performFling$2
            final /* synthetic */ SwipeableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Map) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                Intrinsics.checkNotNull(offset);
                float floatValue = offset.floatValue();
                computeTarget = SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.this$0.getThresholds$material(), f, this.this$0.getVelocityThreshold$material());
                T t = map.get(Boxing.boxFloat(computeTarget));
                if (t != null && this.this$0.getConfirmStateChange$material().invoke(t).booleanValue()) {
                    Object animateTo$default = SwipeableState.animateTo$default(this.this$0, t, null, continuation2, 2, null);
                    return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
                }
                SwipeableState<T> swipeableState = this.this$0;
                animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material(), continuation2);
                return animateInternalToOffset == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateInternalToOffset : Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final float performDrag(float delta) {
        float coerceIn = RangesKt.coerceIn(this.absoluteOffset.getFloatValue() + delta, this.minBound, this.maxBound) - this.absoluteOffset.getFloatValue();
        if (Math.abs(coerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> confirmStateChange) {
            return SaverKt.Saver(new Function2() { // from class: androidx.compose.material.SwipeableState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object Saver$lambda$0;
                    Saver$lambda$0 = SwipeableState.Companion.Saver$lambda$0((SaverScope) obj, (SwipeableState) obj2);
                    return Saver$lambda$0;
                }
            }, new Function1() { // from class: androidx.compose.material.SwipeableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SwipeableState Saver$lambda$1;
                    Saver$lambda$1 = SwipeableState.Companion.Saver$lambda$1(AnimationSpec.this, confirmStateChange, obj);
                    return Saver$lambda$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$0(SaverScope saverScope, SwipeableState swipeableState) {
            return swipeableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeableState Saver$lambda$1(AnimationSpec animationSpec, Function1 function1, Object obj) {
            return new SwipeableState(obj, animationSpec, function1);
        }
    }
}
