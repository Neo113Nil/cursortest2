package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001aE\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0010\u001aï\u0001\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u00152\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u00152\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u001e2\b\b\u0002\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020#2\b\b\u0002\u0010*\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010,\u001a-\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020#2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u00100\u001a\u00020\u000bH\u0003¢\u0006\u0004\b1\u00102\u001a;\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00032\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u00152\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015H\u0003¢\u0006\u0002\u00106\u001a[\u00107\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u00108\u001a\r\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u00152\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:0\n2\u001d\u0010;\u001a\u0019\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120<¢\u0006\u0002\b\u0015H\u0003¢\u0006\u0002\u0010=\u001a\u001c\u0010B\u001a\u00020C2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030E2\u0006\u0010F\u001a\u00020GH\u0000\"\u0010\u0010>\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u0010\u0010@\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u0010\u0010A\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010?¨\u0006H²\u0006\n\u0010I\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"BackdropScaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "initialValue", "Landroidx/compose/material/BackdropValue;", "density", "Landroidx/compose/ui/unit/Density;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "rememberBackdropScaffoldState", "confirmStateChange", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "BackdropScaffold", "", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "snackbarHost", "gesturesEnabled", "peekHeight", "Landroidx/compose/ui/unit/Dp;", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "BackdropScaffold-0hNv9B8", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;Lkotlin/jvm/functions/Function3;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLandroidx/compose/runtime/Composer;III)V", "Scrim", "color", "onDismiss", ViewProps.VISIBLE, "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "BackLayerTransition", TypedValues.AttributesType.S_TARGET, "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropStack", "backLayer", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "AnimationSlideOffset", "F", "VelocityThreshold", "PositionalThreshold", "ConsumeSwipeNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "material", "alpha", "animationProgress"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m8798constructorimpl(20);
    private static final float VelocityThreshold = Dp.m8798constructorimpl(125);
    private static final float PositionalThreshold = Dp.m8798constructorimpl(56);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackLayerTransition$lambda$34(BackdropValue backdropValue, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        BackLayerTransition(backdropValue, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BackdropScaffoldState$lambda$0(BackdropValue backdropValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackdropScaffold_0hNv9B8$lambda$13(Function2 function2, Function2 function22, Function2 function23, Modifier modifier, BackdropScaffoldState backdropScaffoldState, Function3 function3, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, Shape shape, float f3, long j3, long j4, long j5, int i, int i2, int i3, Composer composer, int i4) {
        m2201BackdropScaffold0hNv9B8(function2, function22, function23, modifier, backdropScaffoldState, function3, z, f, f2, z2, z3, j, j2, shape, f3, j3, j4, j5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackdropStack$lambda$41(Modifier modifier, Function2 function2, Function1 function1, Function4 function4, int i, Composer composer, int i2) {
        BackdropStack(modifier, function2, function1, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_3J_VO9M$lambda$18(long j, Function0 function0, boolean z, int i, Composer composer, int i2) {
        m2202Scrim3JVO9M(j, function0, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberBackdropScaffoldState$lambda$3$lambda$2(BackdropValue backdropValue) {
        return true;
    }

    public static /* synthetic */ BackdropScaffoldState BackdropScaffoldState$default(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean BackdropScaffoldState$lambda$0;
                    BackdropScaffoldState$lambda$0 = BackdropScaffoldKt.BackdropScaffoldState$lambda$0((BackdropValue) obj2);
                    return Boolean.valueOf(BackdropScaffoldState$lambda$0);
                }
            };
        }
        if ((i & 16) != 0) {
            snackbarHostState = new SnackbarHostState();
        }
        return BackdropScaffoldState(backdropValue, density, animationSpec, function1, snackbarHostState);
    }

    public static final BackdropScaffoldState BackdropScaffoldState(BackdropValue backdropValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
        BackdropScaffoldState backdropScaffoldState = new BackdropScaffoldState(backdropValue, animationSpec, function1, snackbarHostState);
        backdropScaffoldState.setDensity$material(density);
        return backdropScaffoldState;
    }

    public static final BackdropScaffoldState rememberBackdropScaffoldState(final BackdropValue backdropValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -862178912, "C(rememberBackdropScaffoldState)N(initialValue,animationSpec,confirmStateChange,snackbarHostState)255@10390L8,256@10443L32,258@10535L7,270@10922L267,259@10554L635:BackdropScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 374760584, "CC(remember):BackdropScaffold.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberBackdropScaffoldState$lambda$3$lambda$2;
                        rememberBackdropScaffoldState$lambda$3$lambda$2 = BackdropScaffoldKt.rememberBackdropScaffoldState$lambda$3$lambda$2((BackdropValue) obj);
                        return Boolean.valueOf(rememberBackdropScaffoldState$lambda$3$lambda$2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        final Function1<? super BackdropValue, Boolean> function12 = function1;
        if ((i2 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 374762304, "CC(remember):BackdropScaffold.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue2);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        final SnackbarHostState snackbarHostState2 = snackbarHostState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        Object[] objArr = {animationSpec2, function12, snackbarHostState2};
        Saver<BackdropScaffoldState, ?> Saver = BackdropScaffoldState.INSTANCE.Saver(animationSpec2, function12, snackbarHostState2, density);
        ComposerKt.sourceInformationMarkerStart(composer, 374777867, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean z = true;
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(backdropValue.ordinal())) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec2) | ((((i & 896) ^ 384) > 256 && composer.changed(function12)) || (i & 384) == 256);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(snackbarHostState2)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z2 = changed | z;
        Object rememberedValue3 = composer.rememberedValue();
        if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BackdropScaffoldState BackdropScaffoldState;
                    BackdropScaffoldState = BackdropScaffoldKt.BackdropScaffoldState(BackdropValue.this, density, animationSpec2, function12, snackbarHostState2);
                    return BackdropScaffoldState;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue3 = obj;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m5461rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return backdropScaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f6  */
    /* renamed from: BackdropScaffold-0hNv9B8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2201BackdropScaffold0hNv9B8(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Modifier modifier, BackdropScaffoldState backdropScaffoldState, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, Shape shape, float f3, long j3, long j4, long j5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        boolean z4;
        float f4;
        float f5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final BackdropScaffoldState backdropScaffoldState2;
        final float f6;
        final float f7;
        final boolean z5;
        final Shape shape2;
        final float f8;
        final long j6;
        final long j7;
        final long j8;
        final Modifier modifier3;
        Composer composer2;
        final boolean z6;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        final boolean z7;
        final long j9;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        int i13;
        BackdropScaffoldState backdropScaffoldState3;
        float f9;
        float f10;
        final boolean z8;
        int i14;
        BackdropScaffoldState backdropScaffoldState4;
        long j11;
        long j12;
        Modifier modifier4;
        Shape shape3;
        float f11;
        Shape shape4;
        long j13;
        long j14;
        int i15;
        final BackdropScaffoldState backdropScaffoldState5;
        final float f12;
        final long j15;
        final long j16;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final Modifier modifier5;
        long j17;
        final long j18;
        int i16;
        final Shape shape5;
        final boolean z9;
        final boolean z10;
        int i17;
        long j19;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(-1364899063);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackdropScaffold)N(appBar,backLayerContent,frontLayerContent,modifier,scaffoldState,snackbarHost,gesturesEnabled,peekHeight:c#ui.unit.Dp,headerHeight:c#ui.unit.Dp,persistentAppBar,stickyFrontLayer,backLayerBackgroundColor:c#ui.graphics.Color,backLayerContentColor:c#ui.graphics.Color,frontLayerShape,frontLayerElevation:c#ui.unit.Dp,frontLayerBackgroundColor:c#ui.graphics.Color,frontLayerContentColor:c#ui.graphics.Color,frontLayerScrimColor:c#ui.graphics.Color)365@16886L7,366@16909L35,366@16898L46,368@16987L7,369@17061L7,372@17135L384,386@17590L100,393@17848L4098,393@17768L4178:BackdropScaffold.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        int i23 = i3 & 8;
        if (i23 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            int i24 = 8192;
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0 && startRestartGroup.changed(backdropScaffoldState)) {
                    i22 = 16384;
                    i4 |= i22;
                }
                i22 = 8192;
                i4 |= i22;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function32 = function3;
            } else {
                function32 = function3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z4 = z;
            } else {
                z4 = z;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                }
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    f4 = f;
                    if (startRestartGroup.changed(f4)) {
                        i21 = 8388608;
                        i4 |= i21;
                    }
                } else {
                    f4 = f;
                }
                i21 = 4194304;
                i4 |= i21;
            } else {
                f4 = f;
            }
            if ((i & 100663296) != 0) {
                if ((i3 & 256) == 0) {
                    f5 = f2;
                    if (startRestartGroup.changed(f5)) {
                        i20 = 67108864;
                        i4 |= i20;
                    }
                } else {
                    f5 = f2;
                }
                i20 = 33554432;
                i4 |= i20;
            } else {
                f5 = f2;
            }
            i7 = i3 & 512;
            if (i7 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i8 = i7;
                i4 |= startRestartGroup.changed(z2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i11 = i2 | 6;
                    i10 = i9;
                } else if ((i2 & 6) == 0) {
                    i10 = i9;
                    i11 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i10 = i9;
                    i11 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0) {
                        i12 = i23;
                        if (startRestartGroup.changed(j)) {
                            i19 = 32;
                            i11 |= i19;
                        }
                    } else {
                        i12 = i23;
                    }
                    i19 = 16;
                    i11 |= i19;
                } else {
                    i12 = i23;
                }
                if ((i2 & 384) == 0) {
                    i11 |= ((i3 & 4096) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8192) == 0 && startRestartGroup.changed(shape)) {
                        i18 = 2048;
                        i11 |= i18;
                    }
                    i18 = 1024;
                    i11 |= i18;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16384) == 0 && startRestartGroup.changed(f3)) {
                        i24 = 16384;
                    }
                    i11 |= i24;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i11 |= ((i3 & 32768) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i11 |= ((i3 & 65536) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    i11 |= ((i3 & 131072) == 0 && startRestartGroup.changed(j5)) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 4793491) != 4793490, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "349@15888L40,356@16297L6,357@16348L41,358@16445L15,360@16591L6,361@16643L42,362@16746L20");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 2048) != 0) {
                            i11 &= -113;
                        }
                        int i25 = i11;
                        if ((i3 & 4096) != 0) {
                            i25 &= -897;
                        }
                        if ((i3 & 8192) != 0) {
                            i25 &= -7169;
                        }
                        if ((i3 & 16384) != 0) {
                            i25 &= -57345;
                        }
                        if ((32768 & i3) != 0) {
                            i25 &= -458753;
                        }
                        if ((i3 & 65536) != 0) {
                            i25 &= -3670017;
                        }
                        if ((i3 & 131072) != 0) {
                            i25 &= -29360129;
                        }
                        z9 = z3;
                        j17 = j2;
                        shape5 = shape;
                        f12 = f3;
                        j16 = j3;
                        j18 = j4;
                        j15 = j5;
                        i16 = i25;
                        i17 = i4;
                        f9 = f4;
                        f10 = f5;
                        z10 = z4;
                        function34 = function32;
                        backdropScaffoldState5 = backdropScaffoldState;
                        z8 = z2;
                        modifier5 = modifier2;
                        j11 = j;
                    } else {
                        Modifier.Companion companion = i12 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 16) != 0) {
                            i13 = -29360129;
                            backdropScaffoldState3 = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, startRestartGroup, 6, 14);
                            i4 &= -57345;
                        } else {
                            i13 = -29360129;
                            backdropScaffoldState3 = backdropScaffoldState;
                        }
                        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> lambda$2057676608$material = i5 != 0 ? ComposableSingletons$BackdropScaffoldKt.INSTANCE.getLambda$2057676608$material() : function32;
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i3 & 128) != 0) {
                            f9 = BackdropScaffoldDefaults.INSTANCE.m2194getPeekHeightD9Ej5fM();
                            i4 &= i13;
                        } else {
                            f9 = f;
                        }
                        if ((i3 & 256) != 0) {
                            f10 = BackdropScaffoldDefaults.INSTANCE.m2193getHeaderHeightD9Ej5fM();
                            i4 &= -234881025;
                        } else {
                            f10 = f2;
                        }
                        z8 = i8 != 0 ? true : z2;
                        boolean z11 = i10 != 0 ? true : z3;
                        if ((i3 & 2048) != 0) {
                            i11 &= -113;
                            i14 = i4;
                            backdropScaffoldState4 = backdropScaffoldState3;
                            j11 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2273getPrimary0d7_KjU();
                        } else {
                            i14 = i4;
                            backdropScaffoldState4 = backdropScaffoldState3;
                            j11 = j;
                        }
                        int i26 = i11;
                        if ((i3 & 4096) != 0) {
                            j12 = ColorsKt.m2291contentColorForek8zF_U(j11, startRestartGroup, (i26 >> 3) & 14);
                            i26 &= -897;
                        } else {
                            j12 = j2;
                        }
                        if ((i3 & 8192) != 0) {
                            modifier4 = companion;
                            shape3 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(startRestartGroup, 0);
                            i26 &= -7169;
                        } else {
                            modifier4 = companion;
                            shape3 = shape;
                        }
                        if ((i3 & 16384) != 0) {
                            f11 = BackdropScaffoldDefaults.INSTANCE.m2192getFrontLayerElevationD9Ej5fM();
                            i26 &= -57345;
                        } else {
                            f11 = f3;
                        }
                        float f13 = f11;
                        if ((i3 & 32768) != 0) {
                            shape4 = shape3;
                            i26 &= -458753;
                            j13 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2277getSurface0d7_KjU();
                        } else {
                            shape4 = shape3;
                            j13 = j3;
                        }
                        if ((i3 & 65536) != 0) {
                            j14 = ColorsKt.m2291contentColorForek8zF_U(j13, startRestartGroup, (i26 >> 15) & 14);
                            i15 = (-3670017) & i26;
                        } else {
                            j14 = j4;
                            i15 = i26;
                        }
                        if ((i3 & 131072) != 0) {
                            f12 = f13;
                            j16 = j13;
                            function34 = lambda$2057676608$material;
                            j15 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(startRestartGroup, 0);
                            modifier5 = modifier4;
                            j17 = j12;
                            j18 = j14;
                            shape5 = shape4;
                            i16 = i15 & i13;
                            z9 = z11;
                            z10 = z4;
                            backdropScaffoldState5 = backdropScaffoldState4;
                        } else {
                            int i27 = i15;
                            backdropScaffoldState5 = backdropScaffoldState4;
                            f12 = f13;
                            j15 = j5;
                            j16 = j13;
                            function34 = lambda$2057676608$material;
                            modifier5 = modifier4;
                            j17 = j12;
                            j18 = j14;
                            i16 = i27;
                            shape5 = shape4;
                            z9 = z11;
                            z10 = z4;
                        }
                        i17 = i14;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        j19 = j17;
                        ComposerKt.traceEventStart(-1364899063, i17, i16, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:363)");
                    } else {
                        j19 = j17;
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density = (Density) consume;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1702932596, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean changed = ((((57344 & i17) ^ 24576) > 16384 && startRestartGroup.changed(backdropScaffoldState5)) || (i17 & 24576) == 16384) | startRestartGroup.changed(density);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit BackdropScaffold_0hNv9B8$lambda$8$lambda$7;
                                BackdropScaffold_0hNv9B8$lambda$8$lambda$7 = BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$8$lambda$7(BackdropScaffoldState.this, density);
                                return BackdropScaffold_0hNv9B8$lambda$8$lambda$7;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float mo744toPx0680j_4 = ((Density) consume2).mo744toPx0680j_4(f9);
                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(localDensity3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float mo744toPx0680j_42 = ((Density) consume3).mo744toPx0680j_4(f10);
                    final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                    final ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(998762775, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i28) {
                            ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                            if (!composer3.shouldExecute((i28 & 3) != 2, i28 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(998762775, i28, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:373)");
                            }
                            if (z8) {
                                composer3.startReplaceGroup(-1391557043);
                                ComposerKt.sourceInformation(composer3, "374@17189L94");
                                Function2<Composer, Integer, Unit> function24 = function2;
                                Function2<Composer, Integer, Unit> function25 = function22;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, -541208306, "C375@17218L8,376@17247L18:BackdropScaffold.kt#jmzs0o");
                                function24.invoke(composer3, 0);
                                function25.invoke(composer3, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1391423619);
                                ComposerKt.sourceInformation(composer3, "379@17321L174");
                                BackdropScaffoldKt.BackLayerTransition(backdropScaffoldState5.getAnchoredDraggableState$material().getTargetValue(), function2, function22, composer3, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1702910739, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean changed2 = startRestartGroup.changed(mo744toPx0680j_42);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Constraints BackdropScaffold_0hNv9B8$lambda$12$lambda$11;
                                BackdropScaffold_0hNv9B8$lambda$12$lambda$11 = BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$12$lambda$11(mo744toPx0680j_42, (Constraints) obj);
                                return BackdropScaffold_0hNv9B8$lambda$12$lambda$11;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final Function1 function1 = (Function1) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final AnchoredDraggableState<BackdropValue> anchoredDraggableState$material = backdropScaffoldState6.getAnchoredDraggableState$material();
                    final float f14 = f9;
                    final float f15 = f10;
                    ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1243386547, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: BackdropScaffold.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function4<Constraints, Float, Composer, Integer, Unit> {
                            final /* synthetic */ long $frontLayerBackgroundColor;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
                            final /* synthetic */ long $frontLayerContentColor;
                            final /* synthetic */ float $frontLayerElevation;
                            final /* synthetic */ long $frontLayerScrimColor;
                            final /* synthetic */ Shape $frontLayerShape;
                            final /* synthetic */ boolean $gesturesEnabled;
                            final /* synthetic */ float $headerHeight;
                            final /* synthetic */ float $headerHeightPx;
                            final /* synthetic */ float $peekHeight;
                            final /* synthetic */ float $peekHeightPx;
                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                            final /* synthetic */ CoroutineScope $scope;
                            final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
                            final /* synthetic */ AnchoredDraggableState<BackdropValue> $state;
                            final /* synthetic */ boolean $stickyFrontLayer;

                            /* compiled from: BackdropScaffold.kt */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[BackdropValue.values().length];
                                    try {
                                        iArr[BackdropValue.Concealed.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BackdropValue.Revealed.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(float f, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, AnchoredDraggableState<BackdropValue> anchoredDraggableState, CoroutineScope coroutineScope, Shape shape, long j, long j2, float f2, float f3, float f4, float f5, Function2<? super Composer, ? super Integer, Unit> function2, long j3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
                                this.$headerHeightPx = f;
                                this.$stickyFrontLayer = z;
                                this.$gesturesEnabled = z2;
                                this.$scaffoldState = backdropScaffoldState;
                                this.$state = anchoredDraggableState;
                                this.$scope = coroutineScope;
                                this.$frontLayerShape = shape;
                                this.$frontLayerBackgroundColor = j;
                                this.$frontLayerContentColor = j2;
                                this.$frontLayerElevation = f2;
                                this.$headerHeight = f3;
                                this.$peekHeightPx = f4;
                                this.$peekHeight = f5;
                                this.$frontLayerContent = function2;
                                this.$frontLayerScrimColor = j3;
                                this.$snackbarHost = function3;
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f, Composer composer, Integer num) {
                                m2205invokejYbf7pk(constraints.getValue(), f.floatValue(), composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m2205invokejYbf7pk(long j, float f, Composer composer, int i) {
                                int i2;
                                Modifier.Companion companion;
                                float m8798constructorimpl;
                                ComposerKt.sourceInformation(composer, "CN(constraints:c#ui.unit.Constraints,backLayerHeight)437@19852L735,458@20799L576,411@18496L2879,474@21418L512:BackdropScaffold.kt#jmzs0o");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(j) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i & 48) == 0) {
                                    i2 |= composer.changed(f) ? 32 : 16;
                                }
                                if (!composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-323178911, i2, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:398)");
                                }
                                final Ref.FloatRef floatRef = new Ref.FloatRef();
                                floatRef.element = Constraints.m8750getMaxHeightimpl(j) - this.$headerHeightPx;
                                if (this.$stickyFrontLayer) {
                                    floatRef.element = Math.min(floatRef.element, f);
                                }
                                if (this.$gesturesEnabled) {
                                    companion = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, this.$scaffoldState.getNestedScrollConnection(), null, 2, null);
                                } else {
                                    companion = Modifier.INSTANCE;
                                }
                                AnchoredDraggableState<BackdropValue> anchoredDraggableState = this.$state;
                                Orientation orientation = Orientation.Vertical;
                                final float f2 = this.$peekHeightPx;
                                final BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(companion, anchoredDraggableState, orientation, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00aa: INVOKE (r1v6 'anchoredDraggable$default' androidx.compose.ui.Modifier) = 
                                      (wrap:androidx.compose.ui.Modifier:0x0092: INVOKE 
                                      (r1v4 'companion' androidx.compose.ui.Modifier)
                                      (r3v1 'anchoredDraggableState' androidx.compose.material.AnchoredDraggableState<androidx.compose.material.BackdropValue>)
                                      (r5v3 'orientation' androidx.compose.foundation.gestures.Orientation)
                                      (wrap:kotlin.jvm.functions.Function2:0x008f: CONSTRUCTOR 
                                      (r7v0 'f2' float A[DONT_INLINE])
                                      (r8v0 'backdropScaffoldState' androidx.compose.material.BackdropScaffoldState A[DONT_INLINE])
                                      (r2v5 'floatRef' kotlin.jvm.internal.Ref$FloatRef A[DONT_INLINE])
                                     A[MD:(float, androidx.compose.material.BackdropScaffoldState, kotlin.jvm.internal.Ref$FloatRef):void (m), WRAPPED] call: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda0.<init>(float, androidx.compose.material.BackdropScaffoldState, kotlin.jvm.internal.Ref$FloatRef):void type: CONSTRUCTOR)
                                     STATIC call: androidx.compose.material.AnchoredDraggableKt.draggableAnchors(androidx.compose.ui.Modifier, androidx.compose.material.AnchoredDraggableState, androidx.compose.foundation.gestures.Orientation, kotlin.jvm.functions.Function2):androidx.compose.ui.Modifier A[MD:<T>:(androidx.compose.ui.Modifier, androidx.compose.material.AnchoredDraggableState<T>, androidx.compose.foundation.gestures.Orientation, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.Constraints, ? extends kotlin.Pair<? extends androidx.compose.material.DraggableAnchors<T>, ? extends T>>):androidx.compose.ui.Modifier (m), WRAPPED])
                                      (wrap:androidx.compose.material.AnchoredDraggableState<androidx.compose.material.BackdropValue>:0x0096: IGET (r25v0 'this' androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:434) androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1.$state androidx.compose.material.AnchoredDraggableState)
                                      (wrap:androidx.compose.foundation.gestures.Orientation:0x0098: SGET  A[WRAPPED] (LINE:435) androidx.compose.foundation.gestures.Orientation.Vertical androidx.compose.foundation.gestures.Orientation)
                                      (wrap:boolean:0x009a: IGET (r25v0 'this' androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:436) androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1.$gesturesEnabled boolean)
                                      false
                                      (null androidx.compose.foundation.interaction.MutableInteractionSource)
                                      false
                                      (56 int)
                                      (null java.lang.Object)
                                     STATIC call: androidx.compose.material.AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.ui.Modifier, androidx.compose.material.AnchoredDraggableState, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, boolean, int, java.lang.Object):androidx.compose.ui.Modifier A[DECLARE_VAR, MD:(androidx.compose.ui.Modifier, androidx.compose.material.AnchoredDraggableState, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, boolean, int, java.lang.Object):androidx.compose.ui.Modifier (m)] (LINE:433) in method: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1.invoke-jYbf7pk(long, float, androidx.compose.runtime.Composer, int):void, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
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
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 19 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 566
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.m2205invokejYbf7pk(long, float, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Pair invoke_jYbf7pk$lambda$1(final float f, BackdropScaffoldState backdropScaffoldState, final Ref.FloatRef floatRef, IntSize intSize, Constraints constraints) {
                                BackdropValue backdropValue;
                                final float m8973unboximpl = (int) (intSize.m8973unboximpl() & 4294967295L);
                                final float m8973unboximpl2 = ((int) (intSize.m8973unboximpl() & 4294967295L)) - f;
                                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: INVOKE (r4v1 'DraggableAnchors' androidx.compose.material.DraggableAnchors) = 
                                      (wrap:kotlin.jvm.functions.Function1:0x0016: CONSTRUCTOR 
                                      (r8v2 'm8973unboximpl' float A[DONT_INLINE])
                                      (r4v0 'f' float A[DONT_INLINE])
                                      (r7v3 'm8973unboximpl2' float A[DONT_INLINE])
                                      (r6v0 'floatRef' kotlin.jvm.internal.Ref$FloatRef A[DONT_INLINE])
                                     A[MD:(float, float, float, kotlin.jvm.internal.Ref$FloatRef):void (m), WRAPPED] (LINE:417) call: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda2.<init>(float, float, float, kotlin.jvm.internal.Ref$FloatRef):void type: CONSTRUCTOR)
                                     STATIC call: androidx.compose.material.AnchoredDraggableKt.DraggableAnchors(kotlin.jvm.functions.Function1):androidx.compose.material.DraggableAnchors A[DECLARE_VAR, MD:<T>:(kotlin.jvm.functions.Function1<? super androidx.compose.material.DraggableAnchorsConfig<T>, kotlin.Unit>):androidx.compose.material.DraggableAnchors<T> (m)] (LINE:417) in method: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1.invoke_jYbf7pk$lambda$1(float, androidx.compose.material.BackdropScaffoldState, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints):kotlin.Pair, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda2, state: NOT_LOADED
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
                                    	... 15 more
                                    */
                                /*
                                    long r0 = r7.m8973unboximpl()
                                    r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                                    long r0 = r0 & r2
                                    int r8 = (int) r0
                                    float r8 = (float) r8
                                    long r0 = r7.m8973unboximpl()
                                    long r0 = r0 & r2
                                    int r7 = (int) r0
                                    float r7 = (float) r7
                                    float r7 = r7 - r4
                                    androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda2 r0 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda2
                                    r0.<init>(r8, r4, r7, r6)
                                    androidx.compose.material.DraggableAnchors r4 = androidx.compose.material.AnchoredDraggableKt.DraggableAnchors(r0)
                                    androidx.compose.material.BackdropValue r5 = r5.getTargetValue()
                                    int[] r6 = androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                                    int r5 = r5.ordinal()
                                    r5 = r6[r5]
                                    r6 = 1
                                    if (r5 == r6) goto L43
                                    r6 = 2
                                    if (r5 != r6) goto L3d
                                    androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Revealed
                                    boolean r5 = r4.hasAnchorFor(r5)
                                    if (r5 == 0) goto L3a
                                    androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Revealed
                                    goto L45
                                L3a:
                                    androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
                                    goto L45
                                L3d:
                                    kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                                    r4.<init>()
                                    throw r4
                                L43:
                                    androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
                                L45:
                                    kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
                                    return r4
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.invoke_jYbf7pk$lambda$1(float, androidx.compose.material.BackdropScaffoldState, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints):kotlin.Pair");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke_jYbf7pk$lambda$1$lambda$0(float f, float f2, float f3, Ref.FloatRef floatRef, DraggableAnchorsConfig draggableAnchorsConfig) {
                                if (f == 0.0f || f == f2) {
                                    draggableAnchorsConfig.at(BackdropValue.Concealed, f3);
                                } else {
                                    draggableAnchorsConfig.at(BackdropValue.Concealed, f2);
                                    draggableAnchorsConfig.at(BackdropValue.Revealed, floatRef.element);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke_jYbf7pk$lambda$5$lambda$4(final BackdropScaffoldState backdropScaffoldState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                if (backdropScaffoldState.isConcealed()) {
                                    SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE 
                                          (r5v0 'semanticsPropertyReceiver' androidx.compose.ui.semantics.SemanticsPropertyReceiver)
                                          (null java.lang.String)
                                          (wrap:kotlin.jvm.functions.Function0:0x000a: CONSTRUCTOR 
                                          (r3v0 'backdropScaffoldState' androidx.compose.material.BackdropScaffoldState A[DONT_INLINE])
                                          (r4v0 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                                         A[MD:(androidx.compose.material.BackdropScaffoldState, kotlinx.coroutines.CoroutineScope):void (m), WRAPPED] (LINE:440) call: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda3.<init>(androidx.compose.material.BackdropScaffoldState, kotlinx.coroutines.CoroutineScope):void type: CONSTRUCTOR)
                                          (1 int)
                                          (null java.lang.Object)
                                         STATIC call: androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver, java.lang.String, kotlin.jvm.functions.Function0, int, java.lang.Object):void A[MD:(androidx.compose.ui.semantics.SemanticsPropertyReceiver, java.lang.String, kotlin.jvm.functions.Function0, int, java.lang.Object):void (m)] (LINE:440) in method: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1.invoke_jYbf7pk$lambda$5$lambda$4(androidx.compose.material.BackdropScaffoldState, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.semantics.SemanticsPropertyReceiver):kotlin.Unit, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda3, state: NOT_LOADED
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
                                        	... 21 more
                                        */
                                    /*
                                        boolean r0 = r3.isConcealed()
                                        r1 = 1
                                        r2 = 0
                                        if (r0 == 0) goto L11
                                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda3 r0 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda3
                                        r0.<init>(r3, r4)
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse$default(r5, r2, r0, r1, r2)
                                        goto L19
                                    L11:
                                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda4 r0 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$$ExternalSyntheticLambda4
                                        r0.<init>(r3, r4)
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.expand$default(r5, r2, r0, r1, r2)
                                    L19:
                                        kotlin.Unit r3 = kotlin.Unit.INSTANCE
                                        return r3
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.invoke_jYbf7pk$lambda$5$lambda$4(androidx.compose.material.BackdropScaffoldState, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.semantics.SemanticsPropertyReceiver):kotlin.Unit");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final boolean invoke_jYbf7pk$lambda$5$lambda$4$lambda$2(BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
                                    if (!backdropScaffoldState.getConfirmValueChange().invoke(BackdropValue.Revealed).booleanValue()) {
                                        return true;
                                    }
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1(backdropScaffoldState, null), 3, null);
                                    return true;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final boolean invoke_jYbf7pk$lambda$5$lambda$4$lambda$3(BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
                                    if (!backdropScaffoldState.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
                                        return true;
                                    }
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1(backdropScaffoldState, null), 3, null);
                                    return true;
                                }

                                /* compiled from: BackdropScaffold.kt */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3, reason: invalid class name */
                                static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
                                    final /* synthetic */ long $frontLayerScrimColor;
                                    final /* synthetic */ boolean $gesturesEnabled;
                                    final /* synthetic */ float $peekHeight;
                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                    final /* synthetic */ CoroutineScope $scope;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass3(float f, Function2<? super Composer, ? super Integer, Unit> function2, long j, boolean z, BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
                                        this.$peekHeight = f;
                                        this.$frontLayerContent = function2;
                                        this.$frontLayerScrimColor = j;
                                        this.$gesturesEnabled = z;
                                        this.$scaffoldState = backdropScaffoldState;
                                        this.$scope = coroutineScope;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        ComposerKt.sourceInformation(composer, "C459@20817L544:BackdropScaffold.kt#jmzs0o");
                                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(356452509, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:459)");
                                        }
                                        Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, this.$peekHeight, 7, null);
                                        Function2<Composer, Integer, Unit> function2 = this.$frontLayerContent;
                                        long j = this.$frontLayerScrimColor;
                                        final boolean z = this.$gesturesEnabled;
                                        final BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                        final CoroutineScope coroutineScope = this.$scope;
                                        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1161paddingqDBjuR0$default);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer m5333constructorimpl = Updater.m5333constructorimpl(composer);
                                        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer, -1810730913, "C460@20882L19,463@21019L228,461@20922L421:BackdropScaffold.kt#jmzs0o");
                                        function2.invoke(composer, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer, -1443879845, "CC(remember):BackdropScaffold.kt#9igjgp");
                                        boolean changed = composer.changed(z) | composer.changed(backdropScaffoldState) | composer.changedInstance(coroutineScope);
                                        Object rememberedValue = composer.rememberedValue();
                                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011c: CONSTRUCTOR (r2v11 'rememberedValue' java.lang.Object) = 
                                                  (r3v2 'z' boolean A[DONT_INLINE])
                                                  (r9v1 'backdropScaffoldState' androidx.compose.material.BackdropScaffoldState A[DONT_INLINE])
                                                  (r10v1 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                                                 A[MD:(boolean, androidx.compose.material.BackdropScaffoldState, kotlinx.coroutines.CoroutineScope):void (m)] (LINE:464) call: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$$ExternalSyntheticLambda0.<init>(boolean, androidx.compose.material.BackdropScaffoldState, kotlinx.coroutines.CoroutineScope):void type: CONSTRUCTOR in method: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.3.invoke(androidx.compose.runtime.Composer, int):void, file: classes.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 344
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.AnonymousClass1.AnonymousClass3.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(boolean z, BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
                                            if (z && backdropScaffoldState.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1(backdropScaffoldState, null), 3, null);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }

                                public final void invoke(Composer composer3, int i28) {
                                    ComposerKt.sourceInformation(composer3, "C394@17870L24,395@17983L3957,395@17903L4037:BackdropScaffold.kt#jmzs0o");
                                    if (!composer3.shouldExecute((i28 & 3) != 2, i28 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1243386547, i28, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:394)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                                    ComposerKt.sourceInformationMarkerStart(composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
                                    Object rememberedValue3 = composer3.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3);
                                        composer3.updateRememberedValue(rememberedValue3);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    BackdropScaffoldKt.BackdropStack(SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null), rememberComposableLambda, function1, ComposableLambdaKt.rememberComposableLambda(-323178911, true, new AnonymousClass1(mo744toPx0680j_42, z9, z10, backdropScaffoldState6, anchoredDraggableState$material, (CoroutineScope) rememberedValue3, shape5, j16, j18, f12, f15, mo744toPx0680j_4, f14, function23, j15, function34), composer3, 54), composer3, 3120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54);
                            int i28 = i16 << 3;
                            SurfaceKt.m2489SurfaceFjzlyU(null, null, j11, j19, null, 0.0f, rememberComposableLambda2, startRestartGroup, (i28 & 7168) | (i28 & 896) | 1572864, 51);
                            long j20 = j19;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            j10 = j20;
                            j9 = j11;
                            composer2 = startRestartGroup;
                            z7 = z8;
                            z5 = z9;
                            z6 = z10;
                            backdropScaffoldState2 = backdropScaffoldState6;
                            shape2 = shape5;
                            j6 = j16;
                            j7 = j18;
                            f8 = f12;
                            f7 = f15;
                            f6 = f14;
                            j8 = j15;
                            function33 = function34;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            backdropScaffoldState2 = backdropScaffoldState;
                            f6 = f;
                            f7 = f2;
                            z5 = z3;
                            shape2 = shape;
                            f8 = f3;
                            j6 = j3;
                            j7 = j4;
                            j8 = j5;
                            modifier3 = modifier2;
                            composer2 = startRestartGroup;
                            z6 = z4;
                            function33 = function32;
                            z7 = z2;
                            j9 = j;
                            j10 = j2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BackdropScaffold_0hNv9B8$lambda$13;
                                    BackdropScaffold_0hNv9B8$lambda$13 = BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$13(Function2.this, function22, function23, modifier3, backdropScaffoldState2, function33, z6, f6, f7, z7, z5, j9, j10, shape2, f8, j6, j7, j8, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BackdropScaffold_0hNv9B8$lambda$13;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    i9 = i3 & 1024;
                    if (i9 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 4793491) != 4793490, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                int i242 = 8192;
                if ((i & 24576) == 0) {
                }
                i5 = i3 & 32;
                if (i5 == 0) {
                }
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) != 0) {
                }
                i7 = i3 & 512;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3 & 1024;
                if (i9 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 4793491) != 4793490, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit BackdropScaffold_0hNv9B8$lambda$8$lambda$7(BackdropScaffoldState backdropScaffoldState, Density density) {
                backdropScaffoldState.setDensity$material(density);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Constraints BackdropScaffold_0hNv9B8$lambda$12$lambda$11(float f, Constraints constraints) {
                return Constraints.m8738boximpl(ConstraintsKt.m8771offsetNN6EwU$default(Constraints.m8741copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(f), 1, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
            public static final void m2202Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
                int i2;
                Modifier.Companion companion;
                Composer startRestartGroup = composer.startRestartGroup(-92141505);
                ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)N(color:c#ui.graphics.Color,onDismiss,visible):BackdropScaffold.kt#jmzs0o");
                if ((i & 6) == 0) {
                    i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= startRestartGroup.changed(z) ? 256 : 128;
                }
                if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-92141505, i2, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:493)");
                    }
                    if (j != 16) {
                        startRestartGroup.startReplaceGroup(-503346240);
                        ComposerKt.sourceInformation(startRestartGroup, "496@22099L87,503@22447L62,503@22394L115");
                        int i3 = i2;
                        final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                        if (z) {
                            startRestartGroup.startReplaceGroup(-503180638);
                            ComposerKt.sourceInformation(startRestartGroup, "499@22288L37");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Unit unit = Unit.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1646337764, "CC(remember):BackdropScaffold.kt#9igjgp");
                            boolean z2 = (i3 & 112) == 32;
                            BackdropScaffoldKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            companion = SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (PointerInputEventHandler) rememberedValue);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-503080229);
                            startRestartGroup.endReplaceGroup();
                            companion = Modifier.INSTANCE;
                        }
                        Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1646342877, "CC(remember):BackdropScaffold.kt#9igjgp");
                        boolean changed = startRestartGroup.changed(animateFloatAsState) | ((i3 & 14) == 4);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit Scrim_3J_VO9M$lambda$17$lambda$16;
                                    Scrim_3J_VO9M$lambda$17$lambda$16 = BackdropScaffoldKt.Scrim_3J_VO9M$lambda$17$lambda$16(j, animateFloatAsState, (DrawScope) obj);
                                    return Scrim_3J_VO9M$lambda$17$lambda$16;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CanvasKt.Canvas(then, (Function1) rememberedValue2, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-502912829);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Scrim_3J_VO9M$lambda$18;
                            Scrim_3J_VO9M$lambda$18 = BackdropScaffoldKt.Scrim_3J_VO9M$lambda$18(j, function0, z, i, (Composer) obj, ((Integer) obj2).intValue());
                            return Scrim_3J_VO9M$lambda$18;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Scrim_3J_VO9M$lambda$17$lambda$16(long j, State state, DrawScope drawScope) {
                DrawScope.m6612drawRectnJ9OG0$default(drawScope, j, 0L, 0L, Scrim_3J_VO9M$lambda$14(state), null, null, 0, 118, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
                int i2;
                Composer startRestartGroup = composer.startRestartGroup(2129748230);
                ComposerKt.sourceInformation(startRestartGroup, "C(BackLayerTransition)N(target,appBar,content)523@23139L133,527@23322L7,529@23368L1451:BackdropScaffold.kt#jmzs0o");
                if ((i & 6) == 0) {
                    i2 = (startRestartGroup.changed(backdropValue.ordinal()) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                }
                int i3 = i2;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2129748230, i3, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:519)");
                    }
                    final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float mo744toPx0680j_4 = ((Density) consume).mo744toPx0680j_4(AnimationSlideOffset);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -287273344, "C531@23415L351,538@23798L218,530@23382L677,548@24163L353,555@24548L221,546@24068L745:BackdropScaffold.kt#jmzs0o");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237659083, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(animateFloatAsState);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function3() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                MeasureResult BackLayerTransition$lambda$33$lambda$23$lambda$22;
                                BackLayerTransition$lambda$33$lambda$23$lambda$22 = BackdropScaffoldKt.BackLayerTransition$lambda$33$lambda$23$lambda$22(State.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                                return BackLayerTransition$lambda$33$lambda$23$lambda$22;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier layout = LayoutModifierKt.layout(companion2, (Function3) rememberedValue);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237671206, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean changed2 = startRestartGroup.changed(animateFloatAsState) | startRestartGroup.changed(mo744toPx0680j_4);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BackLayerTransition$lambda$33$lambda$25$lambda$24;
                                BackLayerTransition$lambda$33$lambda$25$lambda$24 = BackdropScaffoldKt.BackLayerTransition$lambda$33$lambda$25$lambda$24(mo744toPx0680j_4, animateFloatAsState, (GraphicsLayerScope) obj);
                                return BackLayerTransition$lambda$33$lambda$25$lambda$24;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(layout, (Function1) rememberedValue2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 327736681, "C544@24041L8:BackdropScaffold.kt#jmzs0o");
                    function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237683021, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean changed3 = startRestartGroup.changed(animateFloatAsState);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function3() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                MeasureResult BackLayerTransition$lambda$33$lambda$29$lambda$28;
                                BackLayerTransition$lambda$33$lambda$29$lambda$28 = BackdropScaffoldKt.BackLayerTransition$lambda$33$lambda$29$lambda$28(State.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                                return BackLayerTransition$lambda$33$lambda$29$lambda$28;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier layout2 = LayoutModifierKt.layout(companion3, (Function3) rememberedValue3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237695209, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean changed4 = startRestartGroup.changed(animateFloatAsState) | startRestartGroup.changed(mo744toPx0680j_4);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BackLayerTransition$lambda$33$lambda$31$lambda$30;
                                BackLayerTransition$lambda$33$lambda$31$lambda$30 = BackdropScaffoldKt.BackLayerTransition$lambda$33$lambda$31$lambda$30(mo744toPx0680j_4, animateFloatAsState, (GraphicsLayerScope) obj);
                                return BackLayerTransition$lambda$33$lambda$31$lambda$30;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(layout2, (Function1) rememberedValue4);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m5333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m5333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -786845391, "C561@24794L9:BackdropScaffold.kt#jmzs0o");
                    function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BackLayerTransition$lambda$34;
                            BackLayerTransition$lambda$34 = BackdropScaffoldKt.BackLayerTransition$lambda$34(BackdropValue.this, function2, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                            return BackLayerTransition$lambda$34;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final MeasureResult BackLayerTransition$lambda$33$lambda$23$lambda$22(State state, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                final float BackLayerTransition$lambda$19 = BackLayerTransition$lambda$19(state) - 1;
                if (BackLayerTransition$lambda$19 < 0.0f) {
                    BackLayerTransition$lambda$19 = 0.0f;
                }
                if (BackLayerTransition$lambda$19 > 1.0f) {
                    BackLayerTransition$lambda$19 = 1.0f;
                }
                final Placeable mo7457measureBRTryo0 = measurable.mo7457measureBRTryo0(constraints.getValue());
                return MeasureScope.layout$default(measureScope, mo7457measureBRTryo0.getWidth(), mo7457measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BackLayerTransition$lambda$33$lambda$23$lambda$22$lambda$21;
                        BackLayerTransition$lambda$33$lambda$23$lambda$22$lambda$21 = BackdropScaffoldKt.BackLayerTransition$lambda$33$lambda$23$lambda$22$lambda$21(Placeable.this, BackLayerTransition$lambda$19, (Placeable.PlacementScope) obj);
                        return BackLayerTransition$lambda$33$lambda$23$lambda$22$lambda$21;
                    }
                }, 4, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit BackLayerTransition$lambda$33$lambda$23$lambda$22$lambda$21(Placeable placeable, float f, Placeable.PlacementScope placementScope) {
                placementScope.place(placeable, 0, 0, f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit BackLayerTransition$lambda$33$lambda$25$lambda$24(float f, State state, GraphicsLayerScope graphicsLayerScope) {
                float f2 = 1;
                float BackLayerTransition$lambda$19 = BackLayerTransition$lambda$19(state) - f2;
                if (BackLayerTransition$lambda$19 < 0.0f) {
                    BackLayerTransition$lambda$19 = 0.0f;
                }
                if (BackLayerTransition$lambda$19 > 1.0f) {
                    BackLayerTransition$lambda$19 = 1.0f;
                }
                graphicsLayerScope.setAlpha(BackLayerTransition$lambda$19);
                graphicsLayerScope.setTranslationY((f2 - BackLayerTransition$lambda$19) * f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final MeasureResult BackLayerTransition$lambda$33$lambda$29$lambda$28(State state, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                final float BackLayerTransition$lambda$19 = 1 - BackLayerTransition$lambda$19(state);
                if (BackLayerTransition$lambda$19 < 0.0f) {
                    BackLayerTransition$lambda$19 = 0.0f;
                }
                if (BackLayerTransition$lambda$19 > 1.0f) {
                    BackLayerTransition$lambda$19 = 1.0f;
                }
                final Placeable mo7457measureBRTryo0 = measurable.mo7457measureBRTryo0(constraints.getValue());
                return MeasureScope.layout$default(measureScope, mo7457measureBRTryo0.getWidth(), mo7457measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BackLayerTransition$lambda$33$lambda$29$lambda$28$lambda$27;
                        BackLayerTransition$lambda$33$lambda$29$lambda$28$lambda$27 = BackdropScaffoldKt.BackLayerTransition$lambda$33$lambda$29$lambda$28$lambda$27(Placeable.this, BackLayerTransition$lambda$19, (Placeable.PlacementScope) obj);
                        return BackLayerTransition$lambda$33$lambda$29$lambda$28$lambda$27;
                    }
                }, 4, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit BackLayerTransition$lambda$33$lambda$29$lambda$28$lambda$27(Placeable placeable, float f, Placeable.PlacementScope placementScope) {
                placementScope.place(placeable, 0, 0, f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit BackLayerTransition$lambda$33$lambda$31$lambda$30(float f, State state, GraphicsLayerScope graphicsLayerScope) {
                float f2 = 1;
                float BackLayerTransition$lambda$19 = f2 - BackLayerTransition$lambda$19(state);
                if (BackLayerTransition$lambda$19 < 0.0f) {
                    BackLayerTransition$lambda$19 = 0.0f;
                }
                if (BackLayerTransition$lambda$19 > 1.0f) {
                    BackLayerTransition$lambda$19 = 1.0f;
                }
                graphicsLayerScope.setAlpha(BackLayerTransition$lambda$19);
                graphicsLayerScope.setTranslationY((f2 - BackLayerTransition$lambda$19) * f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i) {
                int i2;
                Composer startRestartGroup = composer.startRestartGroup(1490100844);
                ComposerKt.sourceInformation(startRestartGroup, "C(BackdropStack)N(modifier,backLayer,calculateBackLayerConstraints,frontLayer)573@25083L896,573@25056L923:BackdropScaffold.kt#jmzs0o");
                if ((i & 6) == 0) {
                    i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1490100844, i2, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:572)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1762810732, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function2() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                MeasureResult BackdropStack$lambda$40$lambda$39;
                                BackdropStack$lambda$40$lambda$39 = BackdropScaffoldKt.BackdropStack$lambda$40$lambda$39(Function2.this, function1, function4, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                return BackdropStack$lambda$40$lambda$39;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) rememberedValue, startRestartGroup, i2 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BackdropStack$lambda$41;
                            BackdropStack$lambda$41 = BackdropScaffoldKt.BackdropStack$lambda$41(Modifier.this, function2, function1, function4, i, (Composer) obj, ((Integer) obj2).intValue());
                            return BackdropStack$lambda$41;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final MeasureResult BackdropStack$lambda$40$lambda$39(Function2 function2, Function1 function1, final Function4 function4, SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
                final Placeable mo7457measureBRTryo0 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(BackdropLayers.Back, function2))).mo7457measureBRTryo0(((Constraints) function1.invoke(constraints)).getValue());
                final float height = mo7457measureBRTryo0.getHeight();
                List<Measurable> subcompose = subcomposeMeasureScope.subcompose(BackdropLayers.Front, ComposableLambdaKt.composableLambdaInstance(-344317043, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        ComposerKt.sourceInformation(composer, "C582@25422L40:BackdropScaffold.kt#jmzs0o");
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-344317043, i, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:582)");
                        }
                        function4.invoke(constraints, Float.valueOf(height), composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                ArrayList arrayList = new ArrayList(subcompose.size());
                int size = subcompose.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(subcompose.get(i).mo7457measureBRTryo0(constraints.getValue()));
                }
                final ArrayList arrayList2 = arrayList;
                int max = Math.max(Constraints.m8753getMinWidthimpl(constraints.getValue()), mo7457measureBRTryo0.getWidth());
                int max2 = Math.max(Constraints.m8752getMinHeightimpl(constraints.getValue()), mo7457measureBRTryo0.getHeight());
                int size2 = arrayList2.size();
                int i2 = max;
                int i3 = max2;
                for (int i4 = 0; i4 < size2; i4++) {
                    Placeable placeable = (Placeable) arrayList2.get(i4);
                    i2 = Math.max(i2, placeable.getWidth());
                    i3 = Math.max(i3, placeable.getHeight());
                }
                return MeasureScope.layout$default(subcomposeMeasureScope, i2, i3, null, new Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BackdropStack$lambda$40$lambda$39$lambda$38;
                        BackdropStack$lambda$40$lambda$39$lambda$38 = BackdropScaffoldKt.BackdropStack$lambda$40$lambda$39$lambda$38(Placeable.this, arrayList2, (Placeable.PlacementScope) obj);
                        return BackdropStack$lambda$40$lambda$39$lambda$38;
                    }
                }, 4, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit BackdropStack$lambda$40$lambda$39$lambda$38(Placeable placeable, List list, Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i), 0, 0, 0.0f, 4, null);
                }
                return Unit.INSTANCE;
            }

            public static final NestedScrollConnection ConsumeSwipeNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
                return new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1(anchoredDraggableState, orientation);
            }

            private static final float Scrim_3J_VO9M$lambda$14(State<Float> state) {
                return state.getValue().floatValue();
            }

            private static final float BackLayerTransition$lambda$19(State<Float> state) {
                return state.getValue().floatValue();
            }
        }
