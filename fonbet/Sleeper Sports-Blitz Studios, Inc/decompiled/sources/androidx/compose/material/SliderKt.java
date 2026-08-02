package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.C;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.rnlineargradient.LinearGradientManager;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
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
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
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
import kotlinx.coroutines.CoroutineScopeKt;
import org.objectweb.asm.Opcodes;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001aj\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u00182\u0014\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f0\u0018H\u0002\u001a\u007f\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u001b\u001aK\u0010\u001c\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010!\u001ak\u0010\"\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010)\u001aC\u0010*\u001a\u00020\u0001*\u00020+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b/\u00100\u001aS\u00101\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00104\u001a.\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0002\u001a2\u00109\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u0003\u0018\u00010:*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0082@¢\u0006\u0004\bA\u0010B\u001a\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a0\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003H\u0002\u001a<\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010H\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003H\u0002\u001a \u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003H\u0002\u001aS\u0010O\u001a\u00020\u00012\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030S2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010T\u001a\\\u0010U\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001aj\u0010V\u001a\u00020\u0007*\u00020\u00072\u0006\u0010W\u001a\u00020X2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0018\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u00182\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030S2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a.\u0010\\\u001a\u00020\u00012\u0006\u0010W\u001a\u00020X2\u0006\u00106\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010_\u001a\u0098\u0001\u0010`\u001a\u00020\u0007*\u00020\u00072\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00108\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00050\u00182\u001e\u0010c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010d0\u0018H\u0002\"\u0016\u0010e\u001a\u00020-X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bf\u0010g\"\u0010\u0010i\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0010\u0010j\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0010\u0010k\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0016\u0010l\u001a\u00020-X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bm\u0010g\"\u0010\u0010n\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0010\u0010o\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u000e\u0010p\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Slider", "", "value", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", ContainerStep.STEPS, "", "onValueChangeFinished", "Lkotlin/Function0;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/SliderColors;", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "slideOnKeyEvents", "isRtl", "onValueChangeState", "Landroidx/compose/runtime/State;", "onValueChangeFinishedState", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "tickFractions", "", "width", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/Dp;", "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "snapValueToTick", SentryThread.JsonKeys.CURRENT, "minPx", "maxPx", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stepsToTickFractions", "scale", "a1", "b1", "x1", "a2", "b2", "x", "calcFraction", "a", "b", "pos", "CorrectValueSideEffect", "scaleToOffset", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "sliderTapModifier", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "rawOffset", "gestureEndAction", "pressOffset", "animateToTarget", TypedValues.AttributesType.S_TARGET, "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "rawOffsetEnd", "onDrag", "Lkotlin/Function2;", "ThumbRadius", "getThumbRadius", "()F", "F", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m8798constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m8798constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m8798constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m8798constructorimpl(6);
    private static final float TrackHeight = Dp.m8798constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CorrectValueSideEffect$lambda$36(Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, MutableState mutableState, float f, int i, Composer composer, int i2) {
        CorrectValueSideEffect(function1, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSlider$lambda$9(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange2, int i, Function0 function0, SliderColors sliderColors, int i2, int i3, Composer composer, int i4) {
        RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange2, i, function0, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$19(boolean z, float f, float f2, List list, SliderColors sliderColors, float f3, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, int i, int i2, Composer composer, int i3) {
        RangeSliderImpl(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$3(float f, Function1 function1, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange, int i, Function0 function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, int i2, int i3, Composer composer, int i4) {
        Slider(f, function1, modifier, z, closedFloatingPointRange, i, function0, mutableInteractionSource, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderImpl$lambda$12(boolean z, float f, List list, SliderColors sliderColors, float f2, MutableInteractionSource mutableInteractionSource, Modifier modifier, int i, Composer composer, int i2) {
        SliderImpl(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderThumb_PcYyNuk$lambda$23(BoxScope boxScope, Modifier modifier, float f, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, float f2, int i, Composer composer, int i2) {
        m2457SliderThumbPcYyNuk(boxScope, modifier, f, mutableInteractionSource, sliderColors, z, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track$lambda$29(Modifier modifier, SliderColors sliderColors, boolean z, float f, float f2, List list, float f3, float f4, int i, Composer composer, int i2) {
        Track(modifier, sliderColors, z, f, f2, list, f3, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f4 == 0.0f ? 0.0f : (f3 - f) / f4;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
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
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z3;
        final Function0<Unit> function03;
        final int i10;
        final SliderColors sliderColors2;
        ScopeUpdateScope endRestartGroup;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i11;
        boolean z4;
        Composer composer3;
        int i12;
        SliderColors sliderColors3;
        boolean z5;
        MutableInteractionSource mutableInteractionSource3;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1962335196);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)N(value,onValueChange,modifier,enabled,valueRange,steps,onValueChangeFinished,interactionSource,colors)168@8088L35,169@8161L43,170@8229L47,190@8882L7,194@9014L3201,172@8282L3933:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
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
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i2 & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(sliderColors)) {
                            i13 = 67108864;
                            i4 |= i13;
                        }
                        i13 = 33554432;
                        i4 |= i13;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "163@7873L8");
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRange3 = RangesKt.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                            }
                            i11 = i6 != 0 ? 0 : i7;
                            Function0<Unit> function04 = i8 != 0 ? null : function02;
                            mutableInteractionSource2 = i9 == 0 ? mutableInteractionSource : null;
                            if ((i3 & 256) != 0) {
                                z4 = true;
                                i12 = 131072;
                                composer3 = startRestartGroup;
                                i4 &= -234881025;
                                z5 = z2;
                                sliderColors3 = SliderDefaults.INSTANCE.m2453colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                function02 = function04;
                                closedFloatingPointRange2 = closedFloatingPointRange3;
                            } else {
                                z4 = true;
                                composer3 = startRestartGroup;
                                i12 = 131072;
                                sliderColors3 = sliderColors;
                                closedFloatingPointRange2 = closedFloatingPointRange3;
                                z5 = z2;
                                function02 = function04;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            mutableInteractionSource2 = mutableInteractionSource;
                            sliderColors3 = sliderColors;
                            z5 = z2;
                            z4 = true;
                            i11 = i7;
                            composer3 = startRestartGroup;
                            i12 = 131072;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1962335196, i4, -1, "androidx.compose.material.Slider (Slider.kt:164)");
                        }
                        if (mutableInteractionSource2 == null) {
                            composer3.startReplaceGroup(-1127477833);
                            ComposerKt.sourceInformation(composer3, "166@7968L39");
                            ComposerKt.sourceInformationMarkerStart(composer3, -313464917, "CC(remember):Slider.kt#9igjgp");
                            Object rememberedValue = composer3.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-313465568);
                            composer3.endReplaceGroup();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i11 < 0) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer3, (i4 >> 3) & 14);
                        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function02, composer3, (i4 >> 18) & 14);
                        ComposerKt.sourceInformationMarkerStart(composer3, -313456557, "CC(remember):Slider.kt#9igjgp");
                        boolean z6 = (458752 & i4) == i12 ? z4 : false;
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (z6 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = stepsToTickFractions(i11);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        List list = (List) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                        float f2 = ThumbRadius;
                        float f3 = 2;
                        Function0<Unit> function05 = function02;
                        boolean z7 = z5;
                        Modifier focusable = FocusableKt.focusable(sliderSemantics(SizeKt.m1205requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, Dp.m8798constructorimpl(f2 * f3), Dp.m8798constructorimpl(f2 * f3), 0.0f, 0.0f, 12, null), f, z7, function1, function05, closedFloatingPointRange2, i11), z7, mutableInteractionSource3);
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        int i16 = i11;
                        ClosedFloatingPointRange<Float> closedFloatingPointRange4 = closedFloatingPointRange2;
                        i10 = i16;
                        Composer composer4 = composer3;
                        closedFloatingPointRange2 = closedFloatingPointRange4;
                        BoxWithConstraintsKt.BoxWithConstraints(slideOnKeyEvents(focusable, z7, i16, closedFloatingPointRange4, f, consume == LayoutDirection.Rtl ? z4 : false, rememberUpdatedState, rememberUpdatedState2), null, false, ComposableLambdaKt.rememberComposableLambda(2085116814, z4, new SliderKt$Slider$2(closedFloatingPointRange4, f, list, function05, mutableInteractionSource3, z7, sliderColors3, rememberUpdatedState), composer4, 54), composer4, 3072, 6);
                        composer2 = composer4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function03 = function05;
                        z3 = z7;
                        sliderColors2 = sliderColors3;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z3 = z2;
                        function03 = function02;
                        i10 = i7;
                        sliderColors2 = sliderColors;
                    }
                    final ClosedFloatingPointRange<Float> closedFloatingPointRange5 = closedFloatingPointRange2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Slider$lambda$3;
                                Slider$lambda$3 = SliderKt.Slider$lambda$3(f, function1, modifier3, z3, closedFloatingPointRange5, i10, function03, mutableInteractionSource2, sliderColors2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return Slider$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                }
                final ClosedFloatingPointRange closedFloatingPointRange52 = closedFloatingPointRange2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
            }
            final ClosedFloatingPointRange closedFloatingPointRange522 = closedFloatingPointRange2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
        }
        final ClosedFloatingPointRange closedFloatingPointRange5222 = closedFloatingPointRange2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Modifier slideOnKeyEvents(Modifier modifier, final boolean z, final int i, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final float f, final boolean z2, final State<? extends Function1<? super Float, Unit>> state, final State<? extends Function0<Unit>> state2) {
        if (i < 0) {
            throw new IllegalArgumentException("steps should be >= 0".toString());
        }
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material.SliderKt$slideOnKeyEvents$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m2461invokeZmokQxo(keyEvent.m7174unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m2461invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z3 = false;
                if (!z) {
                    return false;
                }
                int m7186getTypeZmokQxo = KeyEvent_androidKt.m7186getTypeZmokQxo(keyEvent);
                if (KeyEventType.m7178equalsimpl0(m7186getTypeZmokQxo, KeyEventType.INSTANCE.m7182getKeyDownCS__XNY())) {
                    float abs = Math.abs(closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue());
                    int i2 = i;
                    float f2 = abs / (i2 > 0 ? i2 + 1 : 100);
                    long m7185getKeyZmokQxo = KeyEvent_androidKt.m7185getKeyZmokQxo(keyEvent);
                    if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m6955getDirectionUpEK5gGoQ())) {
                        state.getValue().invoke(RangesKt.coerceIn(Float.valueOf(f + f2), closedFloatingPointRange));
                    } else if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m6950getDirectionDownEK5gGoQ())) {
                        state.getValue().invoke(RangesKt.coerceIn(Float.valueOf(f - f2), closedFloatingPointRange));
                    } else {
                        if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m6954getDirectionRightEK5gGoQ())) {
                            state.getValue().invoke(RangesKt.coerceIn(Float.valueOf(f + ((z2 ? -1 : 1) * f2)), closedFloatingPointRange));
                        } else if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m6953getDirectionLeftEK5gGoQ())) {
                            state.getValue().invoke(RangesKt.coerceIn(Float.valueOf(f - ((z2 ? -1 : 1) * f2)), closedFloatingPointRange));
                        } else if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m7029getMoveHomeEK5gGoQ())) {
                            state.getValue().invoke(closedFloatingPointRange.getStart());
                        } else if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m7028getMoveEndEK5gGoQ())) {
                            state.getValue().invoke(closedFloatingPointRange.getEndInclusive());
                        } else if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m7066getPageUpEK5gGoQ())) {
                            state.getValue().invoke(RangesKt.coerceIn(Float.valueOf(f - (RangesKt.coerceIn(r2 / 10, 1, 10) * f2)), closedFloatingPointRange));
                        } else {
                            if (Key.m6877equalsimpl0(m7185getKeyZmokQxo, Key.INSTANCE.m7065getPageDownEK5gGoQ())) {
                                state.getValue().invoke(RangesKt.coerceIn(Float.valueOf(f + (RangesKt.coerceIn(r2 / 10, 1, 10) * f2)), closedFloatingPointRange));
                            }
                            return Boolean.valueOf(z3);
                        }
                    }
                    z3 = true;
                    return Boolean.valueOf(z3);
                }
                if (KeyEventType.m7178equalsimpl0(m7186getTypeZmokQxo, KeyEventType.INSTANCE.m7183getKeyUpCS__XNY())) {
                    long m7185getKeyZmokQxo2 = KeyEvent_androidKt.m7185getKeyZmokQxo(keyEvent);
                    if (Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m6955getDirectionUpEK5gGoQ()) || Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m6950getDirectionDownEK5gGoQ()) || Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m6954getDirectionRightEK5gGoQ()) || Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m6953getDirectionLeftEK5gGoQ()) || Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m7029getMoveHomeEK5gGoQ()) || Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m7028getMoveEndEK5gGoQ()) || Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m7066getPageUpEK5gGoQ()) || Key.m6877equalsimpl0(m7185getKeyZmokQxo2, Key.INSTANCE.m7065getPageDownEK5gGoQ())) {
                        Function0<Unit> value = state2.getValue();
                        if (value != null) {
                            value.invoke();
                        }
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange<Float> closedFloatingPointRange, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, Function0<Unit> function0, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        SliderColors sliderColors2;
        Composer composer2;
        final Function0<Unit> function03;
        final Modifier modifier3;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        final int i9;
        final SliderColors sliderColors3;
        final boolean z2;
        ScopeUpdateScope endRestartGroup;
        ClosedFloatingPointRange<Float> closedFloatingPointRange5;
        boolean z3;
        Composer composer3;
        int i10;
        boolean z4;
        SliderColors sliderColors4;
        Function0<Unit> function04;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1556183027);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)N(value,onValueChange,modifier,enabled,valueRange,steps,onValueChangeFinished,colors)405@18059L39,406@18156L39,409@18277L35,410@18337L47,417@18596L5354,412@18390L5560:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        if (startRestartGroup.changed(closedFloatingPointRange3)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                    }
                    i13 = 8192;
                    i4 |= i13;
                } else {
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i7 = i;
                } else {
                    i7 = i;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 12582912) == 0) {
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
                if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "403@17986L8");
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        boolean z5 = i5 != 0 ? true : z;
                        if ((i3 & 16) != 0) {
                            closedFloatingPointRange5 = RangesKt.rangeTo(0.0f, 1.0f);
                            i4 &= -57345;
                        } else {
                            closedFloatingPointRange5 = closedFloatingPointRange3;
                        }
                        int i15 = i6 != 0 ? 0 : i7;
                        if (i8 != 0) {
                            function02 = null;
                        }
                        if ((i3 & 128) != 0) {
                            i10 = 131072;
                            composer3 = startRestartGroup;
                            i4 &= -29360129;
                            z4 = z5;
                            z3 = true;
                            function04 = function02;
                            sliderColors4 = SliderDefaults.INSTANCE.m2453colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                        } else {
                            z3 = true;
                            composer3 = startRestartGroup;
                            i10 = 131072;
                            z4 = z5;
                            sliderColors4 = sliderColors2;
                            function04 = function02;
                        }
                        i11 = i15;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        z4 = z;
                        sliderColors4 = sliderColors2;
                        z3 = true;
                        closedFloatingPointRange5 = closedFloatingPointRange3;
                        i11 = i7;
                        composer3 = startRestartGroup;
                        function04 = function02;
                        i10 = 131072;
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i4, -1, "androidx.compose.material.RangeSlider (Slider.kt:404)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer3, -843254348, "CC(remember):Slider.kt#9igjgp");
                    Object rememberedValue = composer3.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, -843251244, "CC(remember):Slider.kt#9igjgp");
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (i11 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer3, (i4 >> 3) & 14);
                    ComposerKt.sourceInformationMarkerStart(composer3, -843245444, "CC(remember):Slider.kt#9igjgp");
                    boolean z6 = (458752 & i4) == i10 ? z3 : false;
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (z6 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = stepsToTickFractions(i11);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    List list = (List) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f = ThumbRadius;
                    Modifier m1205requiredSizeInqDBjuR0$default = SizeKt.m1205requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, Dp.m8798constructorimpl(4 * f), Dp.m8798constructorimpl(f * 2), 0.0f, 0.0f, 12, null);
                    Composer composer4 = composer3;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange6 = closedFloatingPointRange5;
                    BoxWithConstraintsKt.BoxWithConstraints(m1205requiredSizeInqDBjuR0$default, null, false, ComposableLambdaKt.rememberComposableLambda(652589923, z3, new SliderKt$RangeSlider$2(closedFloatingPointRange6, closedFloatingPointRange, list, function04, rememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z4, i11, sliderColors4), composer4, 54), composer4, 3072, 6);
                    composer2 = composer4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    closedFloatingPointRange4 = closedFloatingPointRange6;
                    function03 = function04;
                    z2 = z4;
                    i9 = i11;
                    sliderColors3 = sliderColors4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function03 = function02;
                    modifier3 = modifier2;
                    closedFloatingPointRange4 = closedFloatingPointRange3;
                    i9 = i7;
                    sliderColors3 = sliderColors2;
                    z2 = z;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit RangeSlider$lambda$9;
                            RangeSlider$lambda$9 = SliderKt.RangeSlider$lambda$9(ClosedFloatingPointRange.this, function1, modifier3, z2, closedFloatingPointRange4, i9, function03, sliderColors3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return RangeSlider$lambda$9;
                        }
                    });
                    return;
                }
                return;
            }
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(final boolean z, final float f, final List<Float> list, final SliderColors sliderColors, final float f2, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i) {
        int i2;
        List<Float> list2;
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderImpl)N(enabled,positionFraction,tickFractions,colors,width,interactionSource,modifier)684@29780L713:Slider.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            list2 = list;
            i2 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1679682785, i3, -1, "androidx.compose.material.SliderImpl (Slider.kt:683)");
            }
            Modifier then = modifier.then(DefaultSliderConstraints);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2014920892, "C688@29940L7,697@30185L217,707@30411L76:Slider.kt#jmzs0o");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            float mo744toPx0680j_4 = density.mo744toPx0680j_4(TrackHeight);
            float f3 = ThumbRadius;
            float mo744toPx0680j_42 = density.mo744toPx0680j_4(f3);
            float mo740toDpu2uoSUM = density.mo740toDpu2uoSUM(f2);
            float m8798constructorimpl = Dp.m8798constructorimpl(f3 * 2);
            float m8798constructorimpl2 = Dp.m8798constructorimpl(mo740toDpu2uoSUM * f);
            int i4 = i3 >> 6;
            int i5 = i3 << 9;
            Track(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), sliderColors, z, 0.0f, f, list2, mo744toPx0680j_42, mo744toPx0680j_4, startRestartGroup, (i4 & 112) | 3078 | ((i3 << 6) & 896) | (i5 & 57344) | (i5 & Opcodes.ASM7));
            m2457SliderThumbPcYyNuk(boxScopeInstance, Modifier.INSTANCE, m8798constructorimpl2, mutableInteractionSource, sliderColors, z, m8798constructorimpl, startRestartGroup, (i4 & 7168) | 1572918 | ((i3 << 3) & 57344) | ((i3 << 15) & Opcodes.ASM7));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SliderImpl$lambda$12;
                    SliderImpl$lambda$12 = SliderKt.SliderImpl$lambda$12(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SliderImpl$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final List<Float> list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, Modifier modifier3, Composer composer, final int i, final int i2) {
        int i3;
        List<Float> list2;
        SliderColors sliderColors2;
        int i4;
        final Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSliderImpl)N(enabled,positionFractionStart,positionFractionEnd,tickFractions,colors,width,startInteractionSource,endInteractionSource,modifier,startThumbSemantics,endThumbSemantics)726@30939L35,727@31007L33,728@31045L1529:Slider.kt#jmzs0o");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            list2 = list;
            i3 |= startRestartGroup.changedInstance(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i & 24576) == 0) {
            sliderColors2 = sliderColors;
            i3 |= startRestartGroup.changed(sliderColors2) ? 16384 : 8192;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(modifier2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(modifier3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            modifier4 = modifier3;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-278895713, i3, i4, "androidx.compose.material.RangeSliderImpl (Slider.kt:724)");
            }
            final String m2487getString4foXLRw = Strings_androidKt.m2487getString4foXLRw(Strings.INSTANCE.m2485getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
            final String m2487getString4foXLRw2 = Strings_androidKt.m2487getString4foXLRw(Strings.INSTANCE.m2484getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
            Modifier then = modifier.then(DefaultSliderConstraints);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2114792334, "C732@31205L7,741@31513L268,753@31860L84,752@31791L389,765@32258L82,764@32189L379:Slider.kt#jmzs0o");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            float mo744toPx0680j_4 = density.mo744toPx0680j_4(TrackHeight);
            float f4 = ThumbRadius;
            float mo744toPx0680j_42 = density.mo744toPx0680j_4(f4);
            float mo740toDpu2uoSUM = density.mo740toDpu2uoSUM(f3);
            float m8798constructorimpl = Dp.m8798constructorimpl(f4 * 2);
            float m8798constructorimpl2 = Dp.m8798constructorimpl(mo740toDpu2uoSUM * f);
            float m8798constructorimpl3 = Dp.m8798constructorimpl(mo740toDpu2uoSUM * f2);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), 0.0f, 1, null);
            int i5 = i3 >> 9;
            int i6 = i3 << 6;
            int i7 = i3;
            Track(fillMaxSize$default, sliderColors2, z, f, f2, list2, mo744toPx0680j_42, mo744toPx0680j_4, startRestartGroup, (i6 & Opcodes.ASM7) | (i6 & 896) | (i5 & 112) | (i6 & 7168) | (i6 & 57344));
            startRestartGroup = startRestartGroup;
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1730810029, "CC(remember):Slider.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m2487getString4foXLRw);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$18$lambda$15$lambda$14;
                        RangeSliderImpl$lambda$18$lambda$15$lambda$14 = SliderKt.RangeSliderImpl$lambda$18$lambda$15$lambda$14(m2487getString4foXLRw, (SemanticsPropertyReceiver) obj);
                        return RangeSliderImpl$lambda$18$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier then2 = FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), true, mutableInteractionSource).then(modifier2);
            int i8 = i7 & 57344;
            int i9 = (i7 << 15) & Opcodes.ASM7;
            m2457SliderThumbPcYyNuk(boxScopeInstance, then2, m8798constructorimpl2, mutableInteractionSource, sliderColors, z, m8798constructorimpl, startRestartGroup, (i5 & 7168) | 1572870 | i8 | i9);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1730822763, "CC(remember):Slider.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m2487getString4foXLRw2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RangeSliderImpl$lambda$18$lambda$17$lambda$16;
                        RangeSliderImpl$lambda$18$lambda$17$lambda$16 = SliderKt.RangeSliderImpl$lambda$18$lambda$17$lambda$16(m2487getString4foXLRw2, (SemanticsPropertyReceiver) obj);
                        return RangeSliderImpl$lambda$18$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier4 = modifier3;
            m2457SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier4), m8798constructorimpl3, mutableInteractionSource2, sliderColors, z, m8798constructorimpl, startRestartGroup, ((i7 >> 12) & 7168) | 1572870 | i8 | i9);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RangeSliderImpl$lambda$19;
                    RangeSliderImpl$lambda$19 = SliderKt.RangeSliderImpl$lambda$19(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return RangeSliderImpl$lambda$19;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$18$lambda$15$lambda$14(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RangeSliderImpl$lambda$18$lambda$17$lambda$16(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    private static final void m2457SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderThumb)N(modifier,offset:c#ui.unit.Dp,interactionSource,colors,enabled,thumbSize:c#ui.unit.Dp)788@32788L1539:Slider.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i2, -1, "androidx.compose.material.SliderThumb (Slider.kt:787)");
            }
            Modifier align = boxScope.align(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null), Alignment.INSTANCE.getCenterStart());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, align);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -264746013, "C789@32884L46,790@32973L658,790@32939L692,818@34272L19,809@33821L500:Slider.kt#jmzs0o");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2086750978, "CC(remember):Slider.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2086747518, "CC(remember):Slider.kt#9igjgp");
            boolean z2 = (i2 & 7168) == 2048;
            SliderKt$SliderThumb$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2 >> 9;
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i3 & 14);
            float f3 = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            Modifier hoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1211sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, RippleKt.m2441rippleH2RKhps$default(false, ThumbRippleRadius, 0L, 4, null)), mutableInteractionSource, false, 2, null);
            if (!z) {
                f3 = Dp.m8798constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m581backgroundbw27NRU(ShadowKt.m5618shadows4CzXII$default(hoverable$default, f3, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, startRestartGroup, ((i2 >> 15) & 14) | (i3 & 112)).getValue().m6049unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SliderThumb_PcYyNuk$lambda$23;
                    SliderThumb_PcYyNuk$lambda$23 = SliderKt.SliderThumb_PcYyNuk$lambda$23(BoxScope.this, modifier, f, mutableInteractionSource, sliderColors, z, f2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SliderThumb_PcYyNuk$lambda$23;
                }
            });
        }
    }

    private static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f, final float f2, final List<Float> list, final float f3, final float f4, Composer composer, final int i) {
        int i2;
        float f5;
        float f6;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)N(modifier,colors,enabled,positionFractionStart,positionFractionEnd,tickFractions,thumbPx,trackStrokeWidth)834@34621L35,835@34691L34,836@34761L34,837@34829L33,838@34884L1463,838@34867L1480:Slider.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f5 = f2;
            i2 |= startRestartGroup.changed(f5) ? 16384 : 8192;
        } else {
            f5 = f2;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            f6 = f3;
            i2 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
        } else {
            f6 = f3;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i2 & 4793491) != 4793490, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1833126050, i2, -1, "androidx.compose.material.Track (Slider.kt:833)");
            }
            int i4 = ((i2 >> 6) & 14) | 48 | ((i2 << 3) & 896);
            final State<Color> trackColor = sliderColors.trackColor(z, false, startRestartGroup, i4);
            final State<Color> trackColor2 = sliderColors.trackColor(z, true, startRestartGroup, i4);
            final State<Color> tickColor = sliderColors.tickColor(z, false, startRestartGroup, i4);
            final State<Color> tickColor2 = sliderColors.tickColor(z, true, startRestartGroup, i4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 697561849, "CC(remember):Slider.kt#9igjgp");
            boolean changed = ((29360128 & i2) == 8388608) | ((3670016 & i2) == 1048576) | startRestartGroup.changed(trackColor) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | startRestartGroup.changed(trackColor2) | startRestartGroup.changedInstance(list) | startRestartGroup.changed(tickColor) | startRestartGroup.changed(tickColor2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = i2;
                final float f7 = f6;
                final float f8 = f5;
                Object obj = new Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit Track$lambda$28$lambda$27;
                        Track$lambda$28$lambda$27 = SliderKt.Track$lambda$28$lambda$27(f7, trackColor, f4, f8, f, trackColor2, list, tickColor, tickColor2, (DrawScope) obj2);
                        return Track$lambda$28$lambda$27;
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
                rememberedValue = obj;
            } else {
                i3 = i2;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(modifier, (Function1) rememberedValue, startRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit Track$lambda$29;
                    Track$lambda$29 = SliderKt.Track$lambda$29(Modifier.this, sliderColors, z, f, f2, list, f3, f4, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return Track$lambda$29;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Track$lambda$28$lambda$27(float f, State state, float f2, float f3, float f4, State state2, List list, State state3, State state4, DrawScope drawScope) {
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long j = 4294967295L;
        long m5763constructorimpl = Offset.m5763constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo6617getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6618getSizeNHjbRc() >> 32)) - f;
        long m5763constructorimpl2 = Offset.m5763constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo6617getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        long j2 = z ? m5763constructorimpl2 : m5763constructorimpl;
        long j3 = z ? m5763constructorimpl : m5763constructorimpl2;
        DrawScope.m6604drawLineNGM6Ib0$default(drawScope, ((Color) state.getValue()).m6049unboximpl(), j2, j3, f2, StrokeCap.INSTANCE.m6410getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        long j4 = j3;
        int i = (int) (j2 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) + ((Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat(i)) * f3);
        DrawScope.m6604drawLineNGM6Ib0$default(drawScope, ((Color) state2.getValue()).m6049unboximpl(), Offset.m5763constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i) + ((Float.intBitsToFloat(r5) - Float.intBitsToFloat(i)) * f4)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo6617getCenterF1C5BW0() & 4294967295L))) & 4294967295L)), Offset.m5763constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo6617getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32)), f2, StrokeCap.INSTANCE.m6410getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            float floatValue = ((Number) obj).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f3 || floatValue < f4);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            int i2 = 0;
            while (i2 < size) {
                float intBitsToFloat3 = Float.intBitsToFloat((int) (OffsetKt.m5794lerpWko1d7g(j2, j4, ((Number) list2.get(i2)).floatValue()) >> 32));
                long j5 = j;
                arrayList.add(Offset.m5760boximpl(Offset.m5763constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo6617getCenterF1C5BW0() & j5))) & j5) | (Float.floatToRawIntBits(intBitsToFloat3) << 32))));
                i2++;
                arrayList = arrayList;
                j = j5;
            }
            long j6 = j;
            DrawScope.m6609drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m6357getPointsr_lszbg(), ((Color) (booleanValue ? state3 : state4).getValue()).m6049unboximpl(), f2, StrokeCap.INSTANCE.m6410getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j = j6;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2459awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
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
                    Function2 function2 = new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit awaitSlop_8vUncbI$lambda$32;
                            awaitSlop_8vUncbI$lambda$32 = SliderKt.awaitSlop_8vUncbI$lambda$32(Ref.FloatRef.this, (PointerInputChange) obj2, ((Float) obj3).floatValue());
                            return awaitSlop_8vUncbI$lambda$32;
                        }
                    };
                    sliderKt$awaitSlop$12.L$0 = floatRef2;
                    sliderKt$awaitSlop$12.label = 1;
                    Object m2308awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m2308awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
                    if (m2308awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m2308awaitHorizontalPointerSlopOrCancellationgDDlDlE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit awaitSlop_8vUncbI$lambda$32(Ref.FloatRef floatRef, PointerInputChange pointerInputChange, float f) {
        pointerInputChange.consume();
        floatRef.element = f;
        return Unit.INSTANCE;
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
    public static final void CorrectValueSideEffect(final Function1<? super Float, Float> function1, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final ClosedFloatingPointRange<Float> closedFloatingPointRange2, final MutableState<Float> mutableState, final float f, Composer composer, final int i) {
        int i2;
        float f2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        ComposerKt.sourceInformation(startRestartGroup, "C(CorrectValueSideEffect)N(scaleToOffset,valueRange,trackRange,valueState,value)928@38204L300,928@38193L311:Slider.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f2 = f;
            i2 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i2, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:927)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1986508012, "CC(remember):Slider.kt#9igjgp");
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                final float f3 = f2;
                Function0 function0 = new Function0() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CorrectValueSideEffect$lambda$35$lambda$34;
                        CorrectValueSideEffect$lambda$35$lambda$34 = SliderKt.CorrectValueSideEffect$lambda$35$lambda$34(ClosedFloatingPointRange.this, function1, f3, mutableState, closedFloatingPointRange2);
                        return CorrectValueSideEffect$lambda$35$lambda$34;
                    }
                };
                startRestartGroup.updateRememberedValue(function0);
                rememberedValue = function0;
            } else {
                i3 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CorrectValueSideEffect$lambda$36;
                    CorrectValueSideEffect$lambda$36 = SliderKt.CorrectValueSideEffect$lambda$36(Function1.this, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CorrectValueSideEffect$lambda$36;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit CorrectValueSideEffect$lambda$35$lambda$34(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, float f, MutableState mutableState, ClosedFloatingPointRange closedFloatingPointRange2) {
        float floatValue = (((Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange.getStart()).floatValue()) / 1000;
        float floatValue2 = ((Number) function1.invoke(Float.valueOf(f))).floatValue();
        if (Math.abs(floatValue2 - ((Number) mutableState.getValue()).floatValue()) > floatValue && closedFloatingPointRange2.contains((Comparable) mutableState.getValue())) {
            mutableState.setValue(Float.valueOf(floatValue2));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, Function1 function1, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, z, function1, function02, closedFloatingPointRange2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, final boolean z, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final int i) {
        final float coerceIn = RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sliderSemantics$lambda$38;
                sliderSemantics$lambda$38 = SliderKt.sliderSemantics$lambda$38(z, closedFloatingPointRange, i, coerceIn, function1, function0, (SemanticsPropertyReceiver) obj);
                return sliderSemantics$lambda$38;
            }
        }, 1, null), f, closedFloatingPointRange, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sliderSemantics$lambda$38(boolean z, final ClosedFloatingPointRange closedFloatingPointRange, final int i, final float f, final Function1 function1, final Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!z) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean sliderSemantics$lambda$38$lambda$37;
                sliderSemantics$lambda$38$lambda$37 = SliderKt.sliderSemantics$lambda$38$lambda$37(ClosedFloatingPointRange.this, i, f, function1, function0, ((Float) obj).floatValue());
                return Boolean.valueOf(sliderSemantics$lambda$38$lambda$37);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean sliderSemantics$lambda$38$lambda$37(ClosedFloatingPointRange closedFloatingPointRange, int i, float f, Function1 function1, Function0 function0, float f2) {
        int i2;
        float coerceIn = RangesKt.coerceIn(f2, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
        if (i > 0 && (i2 = i + 1) >= 0) {
            float f3 = coerceIn;
            float f4 = f3;
            int i3 = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i3 / i2);
                float f5 = lerp - coerceIn;
                if (Math.abs(f5) <= f3) {
                    f3 = Math.abs(f5);
                    f4 = lerp;
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
            coerceIn = f4;
        }
        if (coerceIn == f) {
            return false;
        }
        function1.invoke(Float.valueOf(coerceIn));
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final State<Float> state, final State<Float> state2, boolean z, final boolean z2, final float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, final State<? extends Function1<? super Boolean, Unit>> state3, final State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), closedFloatingPointRange}, new PointerInputEventHandler() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object coroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, z2, f, new RangeSliderLogic(MutableInteractionSource.this, mutableInteractionSource2, state, state2, state4), state, state3, state2, state4, null), continuation);
                return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
            }

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1081}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(PointerInputScope pointerInputScope, boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$this_pointerInput = pointerInputScope;
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1082, 1093, 1115}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
                /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00281 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CoroutineScope $$this$coroutineScope;
                    final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    final /* synthetic */ State<Float> $rawOffsetEnd;
                    final /* synthetic */ State<Float> $rawOffsetStart;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C00281(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C00281> continuation) {
                        super(2, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$rawOffsetStart = state;
                        this.$$this$coroutineScope = coroutineScope;
                        this.$gestureEndAction = state2;
                        this.$rawOffsetEnd = state3;
                        this.$onDrag = state4;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C00281 c00281 = new C00281(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                        c00281.L$0 = obj;
                        return c00281;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((C00281) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x0196 A[Catch: CancellationException -> 0x01a8, TryCatch #0 {CancellationException -> 0x01a8, blocks: (B:8:0x001e, B:10:0x018e, B:12:0x0196, B:16:0x019e), top: B:7:0x001e }] */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x019e A[Catch: CancellationException -> 0x01a8, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01a8, blocks: (B:8:0x001e, B:10:0x018e, B:12:0x0196, B:16:0x019e), top: B:7:0x001e }] */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Object awaitFirstDown$default;
                        AwaitPointerEventScope awaitPointerEventScope;
                        PointerInputChange pointerInputChange;
                        char c;
                        Object m2459awaitSlop8vUncbI;
                        Ref.FloatRef floatRef;
                        DragInteraction.Start start;
                        final Ref.BooleanRef booleanRef;
                        Pair pair;
                        Ref.BooleanRef booleanRef2;
                        DragInteraction.Start start2;
                        Object m813horizontalDragjO51t88;
                        DragInteraction.Cancel cancel;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                            this.L$0 = awaitPointerEventScope2;
                            this.label = 1;
                            awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
                            if (awaitFirstDown$default != coroutine_suspended) {
                                awaitPointerEventScope = awaitPointerEventScope2;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                booleanRef2 = (Ref.BooleanRef) this.L$1;
                                start2 = (DragInteraction.Start) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    m813horizontalDragjO51t88 = obj;
                                    if (!((Boolean) m813horizontalDragjO51t88).booleanValue()) {
                                        cancel = new DragInteraction.Stop(start2);
                                    } else {
                                        cancel = new DragInteraction.Cancel(start2);
                                    }
                                } catch (CancellationException unused) {
                                    cancel = new DragInteraction.Cancel(start2);
                                    this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                                this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            booleanRef = (Ref.BooleanRef) this.L$4;
                            Ref.FloatRef floatRef2 = (Ref.FloatRef) this.L$3;
                            start = (DragInteraction.Start) this.L$2;
                            pointerInputChange = (PointerInputChange) this.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            c = ' ';
                            floatRef = floatRef2;
                            m2459awaitSlop8vUncbI = obj;
                            pair = (Pair) m2459awaitSlop8vUncbI;
                            if (pair != null) {
                                State<Float> state = this.$rawOffsetEnd;
                                State<Float> state2 = this.$rawOffsetStart;
                                boolean z = this.$isRtl;
                                float m2311pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m2311pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange.getType());
                                if (Math.abs(state.getValue().floatValue() - floatRef.element) < m2311pointerSlopE8SPZFQ && Math.abs(state2.getValue().floatValue() - floatRef.element) < m2311pointerSlopE8SPZFQ) {
                                    float floatValue = ((Number) pair.getSecond()).floatValue();
                                    booleanRef.element = !z ? floatValue >= 0.0f : floatValue < 0.0f;
                                    floatRef.element += Float.intBitsToFloat((int) (PointerEventKt.positionChange((PointerInputChange) pair.getFirst()) >> c));
                                }
                            }
                            this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                            try {
                                long id = pointerInputChange.getId();
                                final State<Function2<Boolean, Float, Unit>> state3 = this.$onDrag;
                                final boolean z2 = this.$isRtl;
                                this.L$0 = start;
                                this.L$1 = booleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                m813horizontalDragjO51t88 = DragGestureDetectorKt.m813horizontalDragjO51t88(awaitPointerEventScope, id, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0185: INVOKE (r3v1 'm813horizontalDragjO51t88' java.lang.Object) = 
                                      (r11v3 'awaitPointerEventScope' androidx.compose.ui.input.pointer.AwaitPointerEventScope)
                                      (r4v5 'id' long)
                                      (wrap:kotlin.jvm.functions.Function1:0x0173: CONSTRUCTOR 
                                      (r6v1 'state3' androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> A[DONT_INLINE])
                                      (r2v6 'booleanRef' kotlin.jvm.internal.Ref$BooleanRef A[DONT_INLINE])
                                      (r8v3 'z2' boolean A[DONT_INLINE])
                                     A[Catch: CancellationException -> 0x01a6, MD:(androidx.compose.runtime.State, kotlin.jvm.internal.Ref$BooleanRef, boolean):void (m), WRAPPED] call: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.State, kotlin.jvm.internal.Ref$BooleanRef, boolean):void type: CONSTRUCTOR)
                                      (r17v0 'this' androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1 A[IMMUTABLE_TYPE, THIS])
                                     STATIC call: androidx.compose.foundation.gestures.DragGestureDetectorKt.horizontalDrag-jO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object A[Catch: CancellationException -> 0x01a6, MD:(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>, kotlin.coroutines.Continuation<? super java.lang.Boolean>):java.lang.Object (m), TRY_LEAVE] in method: androidx.compose.material.SliderKt.rangeSliderPressDragModifier.1.1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 37 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 470
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00281.invokeSuspend(java.lang.Object):java.lang.Object");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invokeSuspend$lambda$1(State state, Ref.BooleanRef booleanRef, boolean z, PointerInputChange pointerInputChange) {
                                float intBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) >> 32));
                                Function2 function2 = (Function2) state.getValue();
                                Boolean valueOf = Boolean.valueOf(booleanRef.element);
                                if (z) {
                                    intBitsToFloat = -intBitsToFloat;
                                }
                                function2.invoke(valueOf, Float.valueOf(intBitsToFloat));
                                return Unit.INSTANCE;
                            }

                            /* compiled from: Slider.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1133}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Ref.BooleanRef $draggingStart;
                                final /* synthetic */ DragInteraction $finishInteraction;
                                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                    this.$rangeSliderLogic = rangeSliderLogic;
                                    this.$draggingStart = booleanRef;
                                    this.$finishInteraction = dragInteraction;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element).emit(this.$finishInteraction, this) == coroutine_suspended) {
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
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                                this.label = 1;
                                if (ForEachGestureKt.awaitEachGesture(this.$this_pointerInput, new C00281(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
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
                }) : modifier;
            }

            public static final float getThumbRadius() {
                return ThumbRadius;
            }

            public static final float getTrackHeight() {
                return TrackHeight;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float snapValueToTick(float f, List<Float> list, float f2, float f3) {
                Float f4;
                if (list.isEmpty()) {
                    f4 = null;
                } else {
                    Float f5 = list.get(0);
                    float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f5.floatValue()) - f);
                    int lastIndex = CollectionsKt.getLastIndex(list);
                    int i = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            Float f6 = list.get(i);
                            float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f6.floatValue()) - f);
                            if (Float.compare(abs, abs2) > 0) {
                                f5 = f6;
                                abs = abs2;
                            }
                            if (i == lastIndex) {
                                break;
                            }
                            i++;
                        }
                    }
                    f4 = f5;
                }
                Float f7 = f4;
                return f7 != null ? MathHelpersKt.lerp(f2, f3, f7.floatValue()) : f;
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
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                        return invoke(modifier2, composer, num.intValue());
                    }

                    public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                        composer.startReplaceGroup(1945228890);
                        ComposerKt.sourceInformation(composer, "C:Slider.kt#jmzs0o");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1945228890, i, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1000)");
                        }
                        if (!z2) {
                            composer.startReplaceGroup(-1678708124);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-1679801122);
                            ComposerKt.sourceInformation(composer, "1001@40932L24,1002@41035L983");
                            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(composer, 683737348, "CC(remember):Effects.kt#9igjgp");
                            Object rememberedValue = composer.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                                composer.updateRememberedValue(rememberedValue);
                            }
                            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            Object[] objArr = {draggableState, mutableInteractionSource, Float.valueOf(f), Boolean.valueOf(z)};
                            ComposerKt.sourceInformationMarkerStart(composer, 1054195633, "CC(remember):Slider.kt#9igjgp");
                            boolean changed = composer.changed(z) | composer.changed(f) | composer.changed(mutableState) | composer.changed(state) | composer.changedInstance(coroutineScope) | composer.changedInstance(draggableState) | composer.changed(state2);
                            boolean z3 = z;
                            float f2 = f;
                            MutableState<Float> mutableState2 = mutableState;
                            State<Float> state3 = state;
                            DraggableState draggableState2 = draggableState;
                            State<Function1<Float, Unit>> state4 = state2;
                            Object rememberedValue2 = composer.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (PointerInputEventHandler) new SliderKt$sliderTapModifier$2$1$1(z3, f2, mutableState2, state3, coroutineScope, draggableState2, state4);
                                composer.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, objArr, (PointerInputEventHandler) rememberedValue2);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        return modifier2;
                    }
                });
            }

            static {
                float m8798constructorimpl = Dp.m8798constructorimpl(48);
                SliderHeight = m8798constructorimpl;
                float m8798constructorimpl2 = Dp.m8798constructorimpl(144);
                SliderMinWidth = m8798constructorimpl2;
                DefaultSliderConstraints = SizeKt.m1197heightInVpY3zN4$default(SizeKt.m1216widthInVpY3zN4$default(Modifier.INSTANCE, m8798constructorimpl2, 0.0f, 2, null), 0.0f, m8798constructorimpl, 1, null);
                SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
            }
        }
