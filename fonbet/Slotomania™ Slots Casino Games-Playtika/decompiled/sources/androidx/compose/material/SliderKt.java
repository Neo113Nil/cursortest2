package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.braze.Constants;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.google.android.exoplayer2.RendererCapabilities;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020'H\u0007¢\u0006\u0002\u0010(\u001ak\u0010)\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010&\u001a\u00020'2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00104\u001a}\u00105\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010%2\b\b\u0002\u00106\u001a\u0002002\b\b\u0002\u0010&\u001a\u00020'H\u0007¢\u0006\u0002\u00107\u001aK\u00108\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u00109\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010&\u001a\u00020'2\u0006\u0010.\u001a\u00020\b2\u0006\u00106\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010:\u001aS\u0010;\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020!2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH\u0003¢\u0006\u0002\u0010>\u001a1\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a \u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\bH\u0002\u001a0\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002\u001a<\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002\u001a.\u0010Q\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002\u001a\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010\"\u001a\u00020#H\u0002\u001aI\u0010U\u001a\u00020\u0012*\u00020V2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010W\u001a\u00020\u00032\u0006\u00106\u001a\u0002002\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020!2\u0006\u0010X\u001a\u00020\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u0010Z\u001a;\u0010[\u001a\u0010\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\b\u0018\u00010\\*\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0082@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010d\u001a\u0098\u0001\u0010e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\b0g2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\b0g2\u0006\u0010 \u001a\u00020!2\u0006\u0010i\u001a\u00020!2\u0006\u0010S\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00120\u00140g2\u001e\u0010k\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120l0gH\u0002\u001aX\u0010m\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010 \u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010\"\u001a\u00020#H\u0002\u001aj\u0010n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010@\u001a\u00020A2\u0006\u00106\u001a\u0002002\u0006\u0010S\u001a\u00020\b2\u0006\u0010i\u001a\u00020!2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\b0g2\u0018\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00140g2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010 \u001a\u00020!H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbPressedElevation", "ThumbRadius", "getThumbRadius", "()F", "ThumbRippleRadius", "TrackHeight", "getTrackHeight", "CorrectValueSideEffect", "", "scaleToOffset", "Lkotlin/Function1;", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "value", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "RangeSlider", "values", "onValueChange", "modifier", "enabled", "", ContainerStep.STEPS, "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", "width", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Slider", "interactionSource", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", SentryThread.JsonKeys.CURRENT, TypedValues.AttributesType.S_TARGET, "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", TypedValues.CycleType.S_WAVE_OFFSET, "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m4440constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m4440constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m4440constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m4440constructorimpl(6);
    private static final float TrackHeight = Dp.m4440constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        SliderColors sliderColors2;
        int i11;
        Function0<Unit> function03;
        boolean z3;
        Composer composer3;
        final Modifier modifier3;
        final boolean z4;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final MutableInteractionSource mutableInteractionSource3;
        final SliderColors sliderColors3;
        final Function0<Unit> function04;
        final int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1962335196);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(7,4,3,1,8,6,5,2)152@7357L39,153@7440L8,156@7533L35,157@7593L59,160@7657L3277:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i14 = 16384;
                            i4 |= i14;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i14 = 8192;
                    i4 |= i14;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        function02 = function0;
                        i4 |= startRestartGroup.changed(function02) ? 1048576 : 524288;
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 29360128) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i2 & 234881024) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(sliderColors)) {
                                i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i4 |= i13;
                            }
                            i13 = 33554432;
                            i4 |= i13;
                        }
                        if ((i4 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i15 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                    closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                }
                                i10 = i6 != 0 ? 0 : i7;
                                Function0<Unit> function05 = i8 != 0 ? null : function02;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i3 & 256) != 0) {
                                    composer2 = startRestartGroup;
                                    i4 &= -234881025;
                                    sliderColors2 = SliderDefaults.INSTANCE.m1495colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                                } else {
                                    composer2 = startRestartGroup;
                                    sliderColors2 = sliderColors;
                                }
                                i11 = i4;
                                function03 = function05;
                                z3 = z2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                sliderColors2 = sliderColors;
                                composer2 = startRestartGroup;
                                i11 = i4;
                                z3 = z2;
                                i10 = i7;
                                function03 = function02;
                            }
                            ClosedFloatingPointRange<Float> closedFloatingPointRange4 = closedFloatingPointRange2;
                            composer2.endDefaults();
                            if (i10 < 0) {
                                throw new IllegalArgumentException("steps should be >= 0".toString());
                            }
                            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composer2, (i11 >> 3) & 14);
                            Integer valueOf = Integer.valueOf(i10);
                            composer2.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                            boolean changed = composer2.changed(valueOf);
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = stepsToTickFractions(i10);
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            List list = (List) rememberedValue2;
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(modifier2);
                            float f2 = ThumbRadius;
                            float f3 = 2;
                            boolean z5 = z3;
                            Composer composer4 = composer2;
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m630requiredSizeInqDBjuR0$default(minimumTouchTargetSize, Dp.m4440constructorimpl(f2 * f3), Dp.m4440constructorimpl(f2 * f3), 0.0f, 0.0f, 12, null), f, list, z5, onValueChange, closedFloatingPointRange4, i10), z5, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composer4, 2085116814, true, new SliderKt$Slider$3(closedFloatingPointRange4, i11, f, mutableInteractionSource4, z5, list, sliderColors2, rememberUpdatedState, function03)), composer4, 3072, 6);
                            composer3 = composer4;
                            modifier3 = modifier2;
                            z4 = z5;
                            closedFloatingPointRange3 = closedFloatingPointRange4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            sliderColors3 = sliderColors2;
                            function04 = function03;
                            i12 = i10;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer3 = startRestartGroup;
                            modifier3 = modifier2;
                            z4 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i12 = i7;
                            function04 = function02;
                            mutableInteractionSource3 = mutableInteractionSource;
                            sliderColors3 = sliderColors;
                        }
                        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i16) {
                                SliderKt.Slider(f, onValueChange, modifier3, z4, closedFloatingPointRange3, i12, function04, mutableInteractionSource3, sliderColors3, composer5, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    function02 = function0;
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if ((i2 & 234881024) == 0) {
                    }
                    if ((i4 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    i11 = i4;
                    function03 = function05;
                    z3 = z2;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange42 = closedFloatingPointRange2;
                    composer2.endDefaults();
                    if (i10 < 0) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                function02 = function0;
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if ((i2 & 234881024) == 0) {
                }
                if ((i4 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                i11 = i4;
                function03 = function05;
                z3 = z2;
                ClosedFloatingPointRange<Float> closedFloatingPointRange422 = closedFloatingPointRange2;
                composer2.endDefaults();
                if (i10 < 0) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            function02 = function0;
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 234881024) == 0) {
            }
            if ((i4 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i11 = i4;
            function03 = function05;
            z3 = z2;
            ClosedFloatingPointRange<Float> closedFloatingPointRange4222 = closedFloatingPointRange2;
            composer2.endDefaults();
            if (i10 < 0) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        function02 = function0;
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        if ((i4 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i11 = i4;
        function03 = function05;
        z3 = z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange42222 = closedFloatingPointRange2;
        composer2.endDefaults();
        if (i10 < 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00cd  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange<Float> values, final Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        SliderColors sliderColors2;
        Composer composer2;
        Composer composer3;
        SliderColors sliderColors3;
        Modifier modifier3;
        boolean z3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i9;
        Function0<Unit> function03;
        int i10;
        Object rememberedValue;
        Object rememberedValue2;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        final boolean z4;
        final int i11;
        final SliderColors sliderColors4;
        final Function0<Unit> function04;
        final Modifier modifier4;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1556183027);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(7,3,2,1,6,5,4)290@13278L8,292@13350L39,293@13447L39,296@13568L35,297@13628L59,301@13693L4911:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(values) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i13 = 8192;
                    i4 |= i13;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i2 & 3670016) == 0) {
                            i4 |= startRestartGroup.changed(function02) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) != 0) {
                        if ((i3 & 128) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i12 = 8388608;
                                i4 |= i12;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i12 = 4194304;
                        i4 |= i12;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    composer2 = startRestartGroup;
                    if ((i4 & 23967451) == 4793490 || !composer2.getSkipping()) {
                        composer2.startDefaults();
                        if ((i2 & 1) != 0 || composer2.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i6 != 0) {
                                i7 = 0;
                            }
                            Function0<Unit> function05 = i8 == 0 ? null : function02;
                            if ((i3 & 128) == 0) {
                                sliderColors2 = SliderDefaults.INSTANCE.m1495colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 6, 1023);
                                composer3 = composer2;
                                i4 &= -29360129;
                            } else {
                                composer3 = composer2;
                            }
                            sliderColors3 = sliderColors2;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i9 = i7;
                            function03 = function05;
                            i10 = i4;
                        } else {
                            composer2.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            sliderColors3 = sliderColors2;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i9 = i7;
                            composer3 = composer2;
                            i10 = i4;
                            function03 = function02;
                        }
                        composer3.endDefaults();
                        composer3.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = composer3.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                        composer3.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                        if (i9 >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composer3, (i10 >> 3) & 14);
                        Integer valueOf = Integer.valueOf(i9);
                        composer3.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                        boolean changed = composer3.changed(valueOf);
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = stepsToTickFractions(i9);
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(modifier3);
                        float f = ThumbRadius;
                        Composer composer4 = composer3;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m630requiredSizeInqDBjuR0$default(minimumTouchTargetSize, Dp.m4440constructorimpl(4 * f), Dp.m4440constructorimpl(f * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer3, 652589923, true, new SliderKt$RangeSlider$2(closedFloatingPointRange3, values, i10, rememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z3, (List) rememberedValue3, i9, sliderColors3, function03)), composer4, 3072, 6);
                        composer2 = composer4;
                        closedFloatingPointRange4 = closedFloatingPointRange3;
                        z4 = z3;
                        i11 = i9;
                        sliderColors4 = sliderColors3;
                        function04 = function03;
                        modifier4 = modifier3;
                    } else {
                        composer2.skipToGroupEnd();
                        function04 = function02;
                        z4 = z2;
                        closedFloatingPointRange4 = closedFloatingPointRange2;
                        sliderColors4 = sliderColors2;
                        modifier4 = modifier2;
                        i11 = i7;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i15) {
                            SliderKt.RangeSlider(values, onValueChange, modifier4, z4, closedFloatingPointRange4, i11, function04, sliderColors4, composer5, i2 | 1, i3);
                        }
                    });
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) != 0) {
                }
                composer2 = startRestartGroup;
                if ((i4 & 23967451) == 4793490) {
                }
                composer2.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                sliderColors3 = sliderColors2;
                modifier3 = modifier2;
                z3 = z2;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i9 = i7;
                function03 = function05;
                i10 = i4;
                composer3.endDefaults();
                composer3.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                rememberedValue = composer3.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composer3.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                composer3.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = composer3.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                composer3.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue2;
                if (i9 >= 0) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) != 0) {
            }
            composer2 = startRestartGroup;
            if ((i4 & 23967451) == 4793490) {
            }
            composer2.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            sliderColors3 = sliderColors2;
            modifier3 = modifier2;
            z3 = z2;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            i9 = i7;
            function03 = function05;
            i10 = i4;
            composer3.endDefaults();
            composer3.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
            rememberedValue = composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composer3.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource32 = (MutableInteractionSource) rememberedValue;
            composer3.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            composer3.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue2;
            if (i9 >= 0) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) != 0) {
        }
        composer2 = startRestartGroup;
        if ((i4 & 23967451) == 4793490) {
        }
        composer2.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        sliderColors3 = sliderColors2;
        modifier3 = modifier2;
        z3 = z2;
        closedFloatingPointRange3 = closedFloatingPointRange2;
        i9 = i7;
        function03 = function05;
        i10 = i4;
        composer3.endDefaults();
        composer3.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
        rememberedValue = composer3.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        composer3.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource322 = (MutableInteractionSource) rememberedValue;
        composer3.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = composer3.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        composer3.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource2222 = (MutableInteractionSource) rememberedValue2;
        if (i9 >= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(final boolean z, final float f, final List<Float> list, final SliderColors sliderColors, final float f2, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderImpl)P(1,4,5!1,6)576@24423L712:Slider.kt#jmzs0o");
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localViewConfiguration);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(231316251);
        ComposerKt.sourceInformation(startRestartGroup, "C*580@24583L7,589@24828L216,599@25053L76:Slider.kt#jmzs0o");
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume4 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2 = (Density) consume4;
        float mo336toPx0680j_4 = density2.mo336toPx0680j_4(TrackHeight);
        float f3 = ThumbRadius;
        float mo336toPx0680j_42 = density2.mo336toPx0680j_4(f3);
        float mo332toDpu2uoSUM = density2.mo332toDpu2uoSUM(f2);
        float m4440constructorimpl = Dp.m4440constructorimpl(f3 * 2);
        float m4440constructorimpl2 = Dp.m4440constructorimpl(mo332toDpu2uoSUM * f);
        int i2 = i >> 6;
        Track(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, mo336toPx0680j_42, mo336toPx0680j_4, startRestartGroup, (i2 & 112) | 265222 | ((i << 6) & 896) | ((i << 9) & 57344));
        m1496SliderThumbPcYyNuk(boxScopeInstance, Modifier.INSTANCE, m4440constructorimpl2, mutableInteractionSource, sliderColors, z, m4440constructorimpl, startRestartGroup, (i2 & 7168) | 1572918 | ((i << 3) & 57344) | ((i << 15) & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                SliderKt.SliderImpl(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final List<Float> list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSliderImpl)P(1,6,5,9!1,10,7!1,4,8)618@25580L35,619@25648L33,620@25686L1488:Slider.kt#jmzs0o");
        final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1517getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
        final String m1518getString4foXLRw2 = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1516getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localViewConfiguration);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(2044256857);
        ComposerKt.sourceInformation(startRestartGroup, "C*624@25846L7,633@26154L267,646@26517L48,644@26431L369,657@26895L46,655@26809L359:Slider.kt#jmzs0o");
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume4 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2 = (Density) consume4;
        float mo336toPx0680j_4 = density2.mo336toPx0680j_4(TrackHeight);
        float f4 = ThumbRadius;
        float mo336toPx0680j_42 = density2.mo336toPx0680j_4(f4);
        float mo332toDpu2uoSUM = density2.mo332toDpu2uoSUM(f3);
        Unit unit = Unit.INSTANCE;
        float m4440constructorimpl = Dp.m4440constructorimpl(f4 * 2);
        float m4440constructorimpl2 = Dp.m4440constructorimpl(mo332toDpu2uoSUM * f);
        float m4440constructorimpl3 = Dp.m4440constructorimpl(mo332toDpu2uoSUM * f2);
        int i3 = i >> 9;
        int i4 = i << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, list, mo336toPx0680j_42, mo336toPx0680j_4, startRestartGroup, (i3 & 112) | 262144 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
        Modifier.Companion companion = Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(m1518getString4foXLRw);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semantics, m1518getString4foXLRw);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i5 = i & 57344;
        int i6 = (i << 15) & 458752;
        m1496SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), true, mutableInteractionSource).then(modifier2), m4440constructorimpl2, mutableInteractionSource, sliderColors, z, m4440constructorimpl, startRestartGroup, (i3 & 7168) | 1572870 | i5 | i6);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = startRestartGroup.changed(m1518getString4foXLRw2);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semantics, m1518getString4foXLRw2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        m1496SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier3), m4440constructorimpl3, mutableInteractionSource2, sliderColors, z, m4440constructorimpl, startRestartGroup, ((i >> 12) & 7168) | 1572870 | i5 | i6);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                SliderKt.RangeSliderImpl(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1496SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f2, Composer composer, final int i) {
        int i2;
        float f3;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderThumb)P(3,4:c#ui.unit.Dp,2!,5:c#ui.unit.Dp)678@27387L1518:Slider.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((2995931 & i2) != 599186 || !startRestartGroup.getSkipping()) {
            Modifier align = boxScope.align(PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null), Alignment.INSTANCE.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-587645648);
            ComposerKt.sourceInformation(startRestartGroup, "C679@27483L46,680@27572L658,680@27538L692,703@28586L59,707@28850L19,698@28392L507:Slider.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i3 = i2 >> 9;
            int i4 = i3 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableInteractionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i4);
            if (!snapshotStateList.isEmpty()) {
                f3 = ThumbPressedElevation;
            } else {
                f3 = ThumbDefaultElevation;
            }
            SpacerKt.Spacer(BackgroundKt.m232backgroundbw27NRU(ShadowKt.m1784shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m636sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, RippleKt.m1610rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z ? f3 : Dp.m4440constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, startRestartGroup, ((i2 >> 15) & 14) | (i3 & 112)).getValue().m2122unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                SliderKt.m1496SliderThumbPcYyNuk(BoxScope.this, modifier, f, mutableInteractionSource, sliderColors, z, f2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f, final float f2, final List<Float> list, final float f3, final float f4, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(2!2,4!1,6)723@29198L35,724@29268L34,725@29338L34,726@29406L33,727@29444L1514:Slider.kt#jmzs0o");
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        final State<Color> trackColor = sliderColors.trackColor(z, false, startRestartGroup, i2);
        final State<Color> trackColor2 = sliderColors.trackColor(z, true, startRestartGroup, i2);
        final State<Color> tickColor = sliderColors.tickColor(z, false, startRestartGroup, i2);
        final State<Color> tickColor2 = sliderColors.tickColor(z, true, startRestartGroup, i2);
        CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SliderKt$Track$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                boolean z2 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long Offset = OffsetKt.Offset(f3, Offset.m1872getYimpl(Canvas.mo2661getCenterF1C5BW0()));
                long Offset2 = OffsetKt.Offset(Size.m1940getWidthimpl(Canvas.mo2662getSizeNHjbRc()) - f3, Offset.m1872getYimpl(Canvas.mo2661getCenterF1C5BW0()));
                long j = Offset2;
                if (!z2) {
                    Offset2 = Offset;
                }
                if (z2) {
                    j = Offset;
                }
                DrawScope.m2649drawLineNGM6Ib0$default(Canvas, trackColor.getValue().m2122unboximpl(), Offset2, j, f4, StrokeCap.INSTANCE.m2466getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                long j2 = j;
                long j3 = Offset2;
                DrawScope.m2649drawLineNGM6Ib0$default(Canvas, trackColor2.getValue().m2122unboximpl(), OffsetKt.Offset(Offset.m1871getXimpl(Offset2) + ((Offset.m1871getXimpl(j) - Offset.m1871getXimpl(Offset2)) * f), Offset.m1872getYimpl(Canvas.mo2661getCenterF1C5BW0())), OffsetKt.Offset(Offset.m1871getXimpl(Offset2) + ((Offset.m1871getXimpl(j) - Offset.m1871getXimpl(Offset2)) * f2), Offset.m1872getYimpl(Canvas.mo2661getCenterF1C5BW0())), f4, StrokeCap.INSTANCE.m2466getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                List<Float> list2 = list;
                float f5 = f2;
                float f6 = f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    float floatValue = ((Number) obj).floatValue();
                    Boolean valueOf = Boolean.valueOf(floatValue > f5 || floatValue < f6);
                    Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = (List) new ArrayList();
                        linkedHashMap.put(valueOf, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                State<Color> state = tickColor;
                State<Color> state2 = tickColor2;
                float f7 = f4;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Offset.m1860boximpl(OffsetKt.Offset(Offset.m1871getXimpl(OffsetKt.m1894lerpWko1d7g(j3, j2, ((Number) it.next()).floatValue())), Offset.m1872getYimpl(Canvas.mo2661getCenterF1C5BW0()))));
                    }
                    long j4 = j3;
                    j2 = j2;
                    DrawScope.m2654drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.INSTANCE.m2418getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2122unboximpl(), f7, StrokeCap.INSTANCE.m2466getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    j3 = j4;
                }
            }
        }, startRestartGroup, i & 14);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$Track$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                SliderKt.Track(Modifier.this, sliderColors, z, f, f2, list, f3, f4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, List<Float> list, float f2, float f3) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next).floatValue()) - f);
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next2).floatValue()) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f4 = (Float) obj;
        return f4 != null ? MathHelpersKt.lerp(f2, f3, f4.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1499awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        Ref.FloatRef floatRef;
        PointerInputChange pointerInputChange;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            if ((sliderKt$awaitSlop$1.label & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label -= Integer.MIN_VALUE;
                SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                Object obj = sliderKt$awaitSlop$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sliderKt$awaitSlop$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2, Float f) {
                            invoke(pointerInputChange2, f.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PointerInputChange pointerInput, float f) {
                            Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
                            pointerInput.consume();
                            Ref.FloatRef.this.element = f;
                        }
                    };
                    sliderKt$awaitSlop$12.L$0 = floatRef2;
                    sliderKt$awaitSlop$12.label = 1;
                    Object m1365awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m1365awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
                    if (m1365awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m1365awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    floatRef = floatRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
                }
                return null;
            }
        }
        sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$122 = sliderKt$awaitSlop$1;
        Object obj2 = sliderKt$awaitSlop$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sliderKt$awaitSlop$122.label;
        if (i2 != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (pointerInputChange == null) {
        }
    }

    private static final List<Float> stepsToTickFractions(int i) {
        if (i == 0) {
            return CollectionsKt.emptyList();
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(i3 / (i + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> scale(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3, float f4) {
        return RangesKt.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CorrectValueSideEffect(final Function1<? super Float, Float> function1, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final ClosedFloatingPointRange<Float> closedFloatingPointRange2, final MutableState<Float> mutableState, final float f, Composer composer, final int i) {
        float f2;
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        ComposerKt.sourceInformation(startRestartGroup, "C(CorrectValueSideEffect)P(!1,3!1,4)822@32812L300,822@32801L311:Slider.kt#jmzs0o");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(function1) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            f2 = f;
            i2 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        if ((i2 & 46811) != 9362 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {closedFloatingPointRange, function1, Float.valueOf(f2), mutableState, closedFloatingPointRange2};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i3 = 0; i3 < 5; i3++) {
                z |= startRestartGroup.changed(objArr[i3]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final float f3 = f2;
                rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        float floatValue = (closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) / 1000;
                        float floatValue2 = function1.invoke(Float.valueOf(f3)).floatValue();
                        if (Math.abs(floatValue2 - mutableState.getValue().floatValue()) <= floatValue || !closedFloatingPointRange2.contains(mutableState.getValue())) {
                            return;
                        }
                        mutableState.setValue(Float.valueOf(floatValue2));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                SliderKt.CorrectValueSideEffect(function1, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, composer2, i | 1);
            }
        });
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, List list, boolean z, Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, list, z, function1, closedFloatingPointRange2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, final List<Float> list, final boolean z, final Function1<? super Float, Unit> function1, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final int i) {
        final float coerceIn = RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (!z) {
                    SemanticsPropertiesKt.disabled(semantics);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
                final int i2 = i;
                final List<Float> list2 = list;
                final float f2 = coerceIn;
                final Function1<Float, Unit> function12 = function1;
                SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f3) {
                        return invoke(f3.floatValue());
                    }

                    public final Boolean invoke(float f3) {
                        boolean z2;
                        Object obj;
                        float coerceIn2 = RangesKt.coerceIn(f3, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        if (i2 > 0) {
                            List<Float> list3 = list2;
                            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = closedFloatingPointRange2;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Float.valueOf(MathHelpersKt.lerp(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), ((Number) it.next()).floatValue())));
                            }
                            Iterator it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (it2.hasNext()) {
                                    float abs = Math.abs(((Number) next).floatValue() - coerceIn2);
                                    do {
                                        Object next2 = it2.next();
                                        float abs2 = Math.abs(((Number) next2).floatValue() - coerceIn2);
                                        if (Float.compare(abs, abs2) > 0) {
                                            next = next2;
                                            abs = abs2;
                                        }
                                    } while (it2.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Float f4 = (Float) obj;
                            if (f4 != null) {
                                coerceIn2 = f4.floatValue();
                            }
                        }
                        if (coerceIn2 == f2) {
                            z2 = false;
                        } else {
                            function12.invoke(Float.valueOf(coerceIn2));
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), f, closedFloatingPointRange, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, f, state3, null)) : modifier;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f, final boolean z, final State<Float> state, final State<? extends Function1<? super Float, Unit>> state2, final MutableState<Float> mutableState, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", DraggableState.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Float.valueOf(f));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1945228890);
                ComposerKt.sourceInformation(composer, "C879@34727L24:Slider.kt#jmzs0o");
                if (z2) {
                    composer.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(composer, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    composer.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f), Boolean.valueOf(z)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(z, f, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                composer.endReplaceableGroup();
                return composed;
            }

            /* compiled from: Slider.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {882}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z, float f, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {887}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00521 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00521(boolean z, float f, MutableState<Float> mutableState, State<Float> state, Continuation<? super C00521> continuation) {
                        super(3, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                        return m1500invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
                    }

                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m1500invoked4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
                        C00521 c00521 = new C00521(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                        c00521.L$0 = pressGestureScope;
                        c00521.J$0 = j;
                        return c00521.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j = this.J$0;
                                this.$pressOffset.setValue(Boxing.boxFloat((this.$isRtl ? this.$maxPx - Offset.m1871getXimpl(j) : Offset.m1871getXimpl(j)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00521 c00521 = new C00521(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final CoroutineScope coroutineScope = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<Function1<Float, Unit>> state = this.$gestureEndAction;
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00521, new Function1<Offset, Unit>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m1501invokek4lQ0M(offset.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1501invokek4lQ0M(long j) {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00531(draggableState, state, null), 3, null);
                            }

                            /* compiled from: Slider.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", i = {}, l = {894}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            static final class C00531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C00531(DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state, Continuation<? super C00531> continuation) {
                                    super(2, continuation);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00531(this.$draggableState, this.$gestureEndAction, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* compiled from: Slider.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00541 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    C00541(Continuation<? super C00541> continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        C00541 c00541 = new C00541(continuation);
                                        c00541.L$0 = obj;
                                        return c00541;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                                        return ((C00541) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$draggableState.drag(MutatePriority.UserInput, new C00541(null), this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke(Boxing.boxFloat(0.0f));
                                    return Unit.INSTANCE;
                                }
                            }
                        }, this, 3, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    static {
        float m4440constructorimpl = Dp.m4440constructorimpl(48);
        SliderHeight = m4440constructorimpl;
        float m4440constructorimpl2 = Dp.m4440constructorimpl(144);
        SliderMinWidth = m4440constructorimpl2;
        DefaultSliderConstraints = SizeKt.m622heightInVpY3zN4$default(SizeKt.m641widthInVpY3zN4$default(Modifier.INSTANCE, m4440constructorimpl2, 0.0f, 2, null), 0.0f, m4440constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }
}
