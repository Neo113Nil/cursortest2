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
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u000b\u001aõ\u0001\u0010\f\u001a\u00020\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001ah\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t¢\u0006\u0002\b)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0#2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0002\b\t¢\u0006\u0002\b)H\u0003ø\u0001\u0000¢\u0006\u0002\u0010/\u001a3\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u00103\u001a\u00020\u0014H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aE\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020.092\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140#2\b\b\u0002\u0010;\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "BackLayerTransition", "", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropStack", "backLayer", "Landroidx/compose/ui/UiComposable;", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "snackbarHostState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m4440constructorimpl(20);

    @ExperimentalMaterialApi
    public static final BackdropScaffoldState rememberBackdropScaffoldState(final BackdropValue initialValue, final AnimationSpec<Float> animationSpec, final Function1<? super BackdropValue, Boolean> function1, final SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        ComposerKt.sourceInformation(composer, "C(rememberBackdropScaffoldState)P(2)171@6447L32,173@6518L538:BackdropScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BackdropValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m1729rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver) BackdropScaffoldState.INSTANCE.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0) new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BackdropScaffoldState invoke() {
                return new BackdropScaffoldState(BackdropValue.this, animationSpec, function1, snackbarHostState);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ab, code lost:
    
        if (r11.changed(r12) != false) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025b  */
    @ExperimentalMaterialApi
    /* renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1241BackdropScaffoldBZszfkY(final Function2<? super Composer, ? super Integer, Unit> appBar, final Function2<? super Composer, ? super Integer, Unit> backLayerContent, final Function2<? super Composer, ? super Integer, Unit> frontLayerContent, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, Shape shape, float f3, long j3, long j4, long j5, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion;
        int i5;
        boolean z4;
        int i6;
        float f4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Shape shape2;
        int i15;
        int i16;
        int i17;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32;
        int i18;
        int i19;
        Composer composer2;
        int i20;
        final BackdropScaffoldState backdropScaffoldState2;
        float m1239getPeekHeightD9Ej5fM;
        float m1238getHeaderHeightD9Ej5fM;
        boolean z5;
        long j6;
        long j7;
        long j8;
        Shape shape3;
        float f5;
        Shape shape4;
        long j9;
        long j10;
        long j11;
        long j12;
        final float f6;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        final boolean z6;
        Modifier modifier2;
        int i21;
        int i22;
        final boolean z7;
        final long j13;
        boolean changed;
        Object rememberedValue;
        Composer composer3;
        final Modifier modifier3;
        final float f7;
        final float f8;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final boolean z8;
        final Shape shape5;
        final long j14;
        final boolean z9;
        final BackdropScaffoldState backdropScaffoldState3;
        final long j15;
        final float f9;
        final long j16;
        final long j17;
        final long j18;
        ScopeUpdateScope endRestartGroup;
        int i23;
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(backLayerContent, "backLayerContent");
        Intrinsics.checkNotNullParameter(frontLayerContent, "frontLayerContent");
        Composer startRestartGroup = composer.startRestartGroup(1397420093);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackdropScaffold)P(!1,2,5,12,15,10,13:c#ui.unit.Dp,11:c#ui.unit.Dp,14,17,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color)260@11766L40,266@12093L6,267@12144L41,268@12241L15,270@12387L6,271@12439L42,272@12542L20,*275@12690L7,276@12764L7,288@13147L100,293@13271L3282:BackdropScaffold.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(appBar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(backLayerContent) ? 32 : 16;
        }
        int i24 = 256;
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(frontLayerContent) ? 256 : 128;
        }
        int i25 = i3 & 8;
        if (i25 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            companion = modifier;
            i4 |= startRestartGroup.changed(companion) ? 2048 : 1024;
            int i26 = 8192;
            if ((i & 57344) == 0) {
                i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(backdropScaffoldState)) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z4 = z;
            } else {
                z4 = z;
                if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                f4 = f;
            } else {
                f4 = f;
                if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 29360128) == 0) {
                i8 = i7;
                i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i10 = i9;
                    i4 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i12 = i11;
                        i4 |= startRestartGroup.changed(z3) ? 536870912 : 268435456;
                        if ((i2 & 14) == 0) {
                            if ((i3 & 1024) == 0) {
                                i13 = i25;
                                if (startRestartGroup.changed(j)) {
                                    i23 = 4;
                                    i14 = i2 | i23;
                                }
                            } else {
                                i13 = i25;
                            }
                            i23 = 2;
                            i14 = i2 | i23;
                        } else {
                            i13 = i25;
                            i14 = i2;
                        }
                        if ((i2 & 112) == 0) {
                            i14 |= ((i3 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                        }
                        if ((i2 & 896) == 0) {
                            if ((i3 & 4096) == 0) {
                                shape2 = shape;
                            } else {
                                shape2 = shape;
                            }
                            i24 = 128;
                            i14 |= i24;
                        } else {
                            shape2 = shape;
                        }
                        int i27 = i14;
                        i15 = i3 & 8192;
                        if (i15 != 0) {
                            i27 |= 3072;
                        } else if ((i2 & 7168) == 0) {
                            i27 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                            if ((i2 & 57344) != 0) {
                                if ((i3 & 16384) == 0) {
                                    i16 = i15;
                                    if (startRestartGroup.changed(j3)) {
                                        i26 = 16384;
                                    }
                                } else {
                                    i16 = i15;
                                }
                                i27 |= i26;
                            } else {
                                i16 = i15;
                            }
                            if ((i2 & 458752) == 0) {
                                i27 |= ((i3 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                            }
                            if ((i2 & 3670016) == 0) {
                                i27 |= ((i3 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                            }
                            i17 = i3 & 131072;
                            if (i17 == 0) {
                                i27 |= 12582912;
                                function32 = function3;
                            } else {
                                function32 = function3;
                                if ((i2 & 29360128) == 0) {
                                    i27 |= startRestartGroup.changed(function32) ? 8388608 : 4194304;
                                }
                            }
                            i18 = i27;
                            if ((1533916891 & i4) == 306783378 || (i18 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i13 != 0) {
                                        companion = Modifier.INSTANCE;
                                    }
                                    Modifier modifier4 = companion;
                                    if ((i3 & 16) == 0) {
                                        i19 = i16;
                                        i20 = 6;
                                        backdropScaffoldState2 = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, startRestartGroup, 6, 14);
                                        composer2 = startRestartGroup;
                                        i4 &= -57345;
                                    } else {
                                        i19 = i16;
                                        composer2 = startRestartGroup;
                                        i20 = 6;
                                        backdropScaffoldState2 = backdropScaffoldState;
                                    }
                                    if (i5 != 0) {
                                        z4 = true;
                                    }
                                    m1239getPeekHeightD9Ej5fM = i6 == 0 ? BackdropScaffoldDefaults.INSTANCE.m1239getPeekHeightD9Ej5fM() : f4;
                                    m1238getHeaderHeightD9Ej5fM = i8 == 0 ? BackdropScaffoldDefaults.INSTANCE.m1238getHeaderHeightD9Ej5fM() : f2;
                                    z5 = i10 == 0 ? true : z2;
                                    boolean z10 = i12 == 0 ? true : z3;
                                    if ((i3 & 1024) == 0) {
                                        i18 &= -15;
                                        j6 = MaterialTheme.INSTANCE.getColors(composer2, i20).m1324getPrimary0d7_KjU();
                                    } else {
                                        j6 = j;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        j7 = ColorsKt.m1342contentColorForek8zF_U(j6, composer2, i18 & 14);
                                        i18 &= -113;
                                    } else {
                                        j7 = j2;
                                    }
                                    int i28 = i18;
                                    if ((i3 & 4096) == 0) {
                                        j8 = j6;
                                        shape3 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composer2, 6);
                                        i28 &= -897;
                                    } else {
                                        j8 = j6;
                                        shape3 = shape;
                                    }
                                    float m1237getFrontLayerElevationD9Ej5fM = i19 == 0 ? BackdropScaffoldDefaults.INSTANCE.m1237getFrontLayerElevationD9Ej5fM() : f3;
                                    if ((i3 & 16384) == 0) {
                                        f5 = m1237getFrontLayerElevationD9Ej5fM;
                                        i28 &= -57345;
                                        shape4 = shape3;
                                        j9 = MaterialTheme.INSTANCE.getColors(composer2, 6).m1328getSurface0d7_KjU();
                                    } else {
                                        f5 = m1237getFrontLayerElevationD9Ej5fM;
                                        shape4 = shape3;
                                        j9 = j3;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        j10 = ColorsKt.m1342contentColorForek8zF_U(j9, composer2, (i28 >> 12) & 14);
                                        i28 &= -458753;
                                    } else {
                                        j10 = j4;
                                    }
                                    if ((i3 & 65536) == 0) {
                                        j11 = j9;
                                        j12 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composer2, 6);
                                        i28 = (-3670017) & i28;
                                    } else {
                                        j11 = j9;
                                        j12 = j5;
                                    }
                                    if (i17 == 0) {
                                        f6 = f5;
                                        function33 = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m1348getLambda1$material_release();
                                    } else {
                                        f6 = f5;
                                        function33 = function3;
                                    }
                                    z6 = z10;
                                    modifier2 = modifier4;
                                    shape2 = shape4;
                                    long j19 = j10;
                                    i21 = i4;
                                    i22 = i28;
                                    z7 = z4;
                                    j13 = j19;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 1024) != 0) {
                                        i18 &= -15;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i18 &= -113;
                                    }
                                    int i29 = i18;
                                    if ((i3 & 4096) != 0) {
                                        i29 &= -897;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        i29 &= -57345;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        i29 &= -458753;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        i29 &= -3670017;
                                    }
                                    m1238getHeaderHeightD9Ej5fM = f2;
                                    z6 = z3;
                                    j8 = j;
                                    j7 = j2;
                                    j11 = j3;
                                    j12 = j5;
                                    function33 = function3;
                                    i22 = i29;
                                    i21 = i4;
                                    modifier2 = companion;
                                    composer2 = startRestartGroup;
                                    z7 = z4;
                                    m1239getPeekHeightD9Ej5fM = f4;
                                    backdropScaffoldState2 = backdropScaffoldState;
                                    z5 = z2;
                                    f6 = f3;
                                    j13 = j4;
                                }
                                composer2.endDefaults();
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                final Modifier modifier5 = modifier2;
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = composer2.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                final float mo336toPx0680j_4 = ((Density) consume).mo336toPx0680j_4(m1239getPeekHeightD9Ej5fM);
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = composer2.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                final float mo336toPx0680j_42 = ((Density) consume2).mo336toPx0680j_4(m1238getHeaderHeightD9Ej5fM);
                                final BackdropScaffoldState backdropScaffoldState4 = backdropScaffoldState2;
                                final boolean z11 = z5;
                                final int i30 = i21;
                                final float f10 = m1239getPeekHeightD9Ej5fM;
                                final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i31) {
                                        ComposerKt.sourceInformation(composer4, "C:BackdropScaffold.kt#jmzs0o");
                                        if ((i31 & 11) != 2 || !composer4.getSkipping()) {
                                            if (z11) {
                                                composer4.startReplaceableGroup(-1017265331);
                                                ComposerKt.sourceInformation(composer4, "280@12876L82");
                                                Function2<Composer, Integer, Unit> function2 = appBar;
                                                int i32 = i30;
                                                Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                                composer4.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer4.consume(localDensity3);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Density density = (Density) consume3;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer4.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer4.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composer4.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                                Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-1163856341);
                                                ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(-18835878);
                                                ComposerKt.sourceInformation(composer4, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                                function2.invoke(composer4, Integer.valueOf(i32 & 14));
                                                function22.invoke(composer4, Integer.valueOf((i32 >> 3) & 14));
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.startReplaceableGroup(-1017265219);
                                            ComposerKt.sourceInformation(composer4, "285@12988L72");
                                            BackdropValue targetValue = backdropScaffoldState4.getTargetValue();
                                            Function2<Composer, Integer, Unit> function23 = appBar;
                                            Function2<Composer, Integer, Unit> function24 = backLayerContent;
                                            int i33 = i30;
                                            BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer4, ((i33 << 3) & 896) | ((i33 << 3) & 112));
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                Float valueOf = Float.valueOf(mo336toPx0680j_42);
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                                changed = composer2.changed(valueOf);
                                rememberedValue = composer2.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                            return Constraints.m4384boximpl(m1248invokeZezNO4M(constraints.getValue()));
                                        }

                                        /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                                        public final long m1248invokeZezNO4M(long j20) {
                                            return ConstraintsKt.m4413offsetNN6EwU$default(Constraints.m4387copyZbe2FdA$default(j20, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo336toPx0680j_42), 1, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                final Function1 function1 = (Function1) rememberedValue;
                                Composer composer4 = composer2;
                                final long j20 = j11;
                                final long j21 = j12;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35 = function33;
                                final int i31 = i22;
                                final float f11 = m1238getHeaderHeightD9Ej5fM;
                                final Shape shape6 = shape2;
                                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer4, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                                    public final void invoke(Composer composer5, int i32) {
                                        ComposerKt.sourceInformation(composer5, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                                        if ((i32 & 11) != 2 || !composer5.getSkipping()) {
                                            composer5.startReplaceableGroup(773894976);
                                            ComposerKt.sourceInformation(composer5, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                            composer5.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue2 = composer5.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer5));
                                                composer5.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                            }
                                            composer5.endReplaceableGroup();
                                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                            composer5.endReplaceableGroup();
                                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                                            Function2<Composer, Integer, Unit> function2 = composableLambda;
                                            Function1<Constraints, Constraints> function12 = function1;
                                            final float f12 = mo336toPx0680j_42;
                                            final boolean z12 = z6;
                                            final boolean z13 = z7;
                                            final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState2;
                                            final float f13 = mo336toPx0680j_4;
                                            final int i33 = i30;
                                            final Shape shape7 = shape6;
                                            final long j22 = j20;
                                            final long j23 = j13;
                                            final float f14 = f6;
                                            final int i34 = i31;
                                            final float f15 = f11;
                                            final float f16 = f10;
                                            final Function2<Composer, Integer, Unit> function22 = frontLayerContent;
                                            final long j24 = j21;
                                            final Function3<SnackbarHostState, Composer, Integer, Unit> function36 = function35;
                                            BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function12, ComposableLambdaKt.composableLambda(composer5, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f17, Composer composer6, Integer num) {
                                                    m1246invokejYbf7pk(constraints.getValue(), f17.floatValue(), composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                                public final void m1246invokejYbf7pk(long j25, float f17, Composer composer6, int i35) {
                                                    int i36;
                                                    Modifier.Companion companion2;
                                                    Modifier m1530swipeablepPrIpRY;
                                                    float m4440constructorimpl;
                                                    ComposerKt.sourceInformation(composer6, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                                    if ((i35 & 14) == 0) {
                                                        i36 = i35 | (composer6.changed(j25) ? 4 : 2);
                                                    } else {
                                                        i36 = i35;
                                                    }
                                                    if ((i35 & 112) == 0) {
                                                        i36 |= composer6.changed(f17) ? 32 : 16;
                                                    }
                                                    if ((i36 & 731) != 146 || !composer6.getSkipping()) {
                                                        float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j25);
                                                        float f18 = m4395getMaxHeightimpl - f12;
                                                        if (z12) {
                                                            f18 = Math.min(f18, f17);
                                                        }
                                                        float f19 = f18;
                                                        if (z13) {
                                                            companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState5.getNestedScrollConnection(), null, 2, null);
                                                        } else {
                                                            companion2 = Modifier.INSTANCE;
                                                        }
                                                        m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState5, r17, Orientation.Vertical, (r26 & 8) != 0 ? true : z13, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final FixedThreshold invoke(T t, T t2) {
                                                                return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                            }
                                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f13), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f19), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                                        final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m1530swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                                if (BackdropScaffoldState.this.isConcealed()) {
                                                                    final BackdropScaffoldState backdropScaffoldState7 = BackdropScaffoldState.this;
                                                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00371(BackdropScaffoldState.this, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                        static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            C00371(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00371> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new C00371(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                                    }, 1, null);
                                                                } else {
                                                                    final BackdropScaffoldState backdropScaffoldState8 = BackdropScaffoldState.this;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope2;
                                                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                                    }, 1, null);
                                                                }
                                                            }
                                                        }, 1, null);
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                                        composer6.startReplaceableGroup(1157296644);
                                                        ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                                                        boolean changed2 = composer6.changed(backdropScaffoldState7);
                                                        Object rememberedValue3 = composer6.rememberedValue();
                                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                                    return IntOffset.m4559boximpl(m1247invokeBjo55l4(density));
                                                                }

                                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                                public final long m1247invokeBjo55l4(Density offset) {
                                                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                                    return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                                }
                                                            };
                                                            composer6.updateRememberedValue(rememberedValue3);
                                                        }
                                                        composer6.endReplaceableGroup();
                                                        Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                                        Shape shape8 = shape7;
                                                        long j26 = j22;
                                                        long j27 = j23;
                                                        float f20 = f14;
                                                        final float f21 = f16;
                                                        final Function2<Composer, Integer, Unit> function23 = function22;
                                                        final int i37 = i33;
                                                        final long j28 = j24;
                                                        final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState5;
                                                        final int i38 = i34;
                                                        final boolean z14 = z13;
                                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer6, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                invoke(composer7, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer7, int i39) {
                                                                ComposerKt.sourceInformation(composer7, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                                if ((i39 & 11) != 2 || !composer7.getSkipping()) {
                                                                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                                                    Function2<Composer, Integer, Unit> function24 = function23;
                                                                    int i40 = i37;
                                                                    long j29 = j28;
                                                                    final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                                    int i41 = i38;
                                                                    final boolean z15 = z14;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                    composer7.startReplaceableGroup(733328855);
                                                                    ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                                    composer7.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume3 = composer7.consume(localDensity3);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    Density density = (Density) consume3;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume4 = composer7.consume(localLayoutDirection);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume5 = composer7.consume(localViewConfiguration);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer7.startReusableNode();
                                                                    if (composer7.getInserting()) {
                                                                        composer7.createNode(constructor);
                                                                    } else {
                                                                        composer7.useNode();
                                                                    }
                                                                    composer7.disableReusing();
                                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer7.enableReusing();
                                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                                    composer7.startReplaceableGroup(2058660585);
                                                                    composer7.startReplaceableGroup(-2137368960);
                                                                    ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    composer7.startReplaceableGroup(-1889954677);
                                                                    ComposerKt.sourceInformation(composer7, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                                    function24.invoke(composer7, Integer.valueOf((i40 >> 6) & 14));
                                                                    BackdropScaffoldKt.m1242Scrim3JVO9M(j29, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                            if (z15 && backdropScaffoldState9.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState9, null), 3, null);
                                                                            }
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                                    }, backdropScaffoldState9.getTargetValue() == BackdropValue.Revealed, composer7, (i41 >> 18) & 14);
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endNode();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    return;
                                                                }
                                                                composer7.skipToGroupEnd();
                                                            }
                                                        });
                                                        int i39 = i34;
                                                        SurfaceKt.m1520SurfaceFjzlyU(then, shape8, j26, j27, null, f20, composableLambda3, composer6, ((i39 << 6) & 458752) | ((i39 >> 3) & 112) | 1572864 | ((i39 >> 6) & 896) | ((i39 >> 6) & 7168), 16);
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        if (backdropScaffoldState5.isRevealed() && f19 == m4395getMaxHeightimpl - f12) {
                                                            m4440constructorimpl = f15;
                                                        } else {
                                                            m4440constructorimpl = Dp.m4440constructorimpl(0);
                                                        }
                                                        Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4440constructorimpl, 7, null);
                                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                        Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                                        BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState5;
                                                        int i40 = i34;
                                                        composer6.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer6, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                                        composer6.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume3 = composer6.consume(localDensity3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        Density density = (Density) consume3;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer6.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume5 = composer6.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                        if (!(composer6.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        composer6.disableReusing();
                                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer6);
                                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer6.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                                        composer6.startReplaceableGroup(2058660585);
                                                        composer6.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer6, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer6.startReplaceableGroup(1815906203);
                                                        ComposerKt.sourceInformation(composer6, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                                        function37.invoke(backdropScaffoldState9.getSnackbarHostState(), composer6, Integer.valueOf((i40 >> 18) & 112));
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endNode();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer6.skipToGroupEnd();
                                                }
                                            }), composer5, 3120);
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                });
                                int i32 = i31 << 6;
                                SurfaceKt.m1520SurfaceFjzlyU(null, null, j8, j7, null, 0.0f, composableLambda2, composer4, (i32 & 7168) | (i32 & 896) | 1572864, 51);
                                composer3 = composer4;
                                modifier3 = modifier5;
                                f7 = f6;
                                f8 = f11;
                                function34 = function35;
                                z8 = z11;
                                shape5 = shape6;
                                j14 = j21;
                                z9 = z6;
                                backdropScaffoldState3 = backdropScaffoldState2;
                                j15 = j13;
                                f9 = f10;
                                j16 = j7;
                                j17 = j20;
                                j18 = j8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                backdropScaffoldState3 = backdropScaffoldState;
                                z8 = z2;
                                z9 = z3;
                                f7 = f3;
                                j17 = j3;
                                j15 = j4;
                                j14 = j5;
                                modifier3 = companion;
                                function34 = function32;
                                composer3 = startRestartGroup;
                                z7 = z4;
                                f9 = f4;
                                f8 = f2;
                                j16 = j2;
                                shape5 = shape2;
                                j18 = j;
                            }
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

                                public final void invoke(Composer composer5, int i33) {
                                    BackdropScaffoldKt.m1241BackdropScaffoldBZszfkY(appBar, backLayerContent, frontLayerContent, modifier3, backdropScaffoldState3, z7, f9, f8, z8, z9, j18, j16, shape5, f7, j17, j15, j14, function34, composer5, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        if ((i2 & 57344) != 0) {
                        }
                        if ((i2 & 458752) == 0) {
                        }
                        if ((i2 & 3670016) == 0) {
                        }
                        i17 = i3 & 131072;
                        if (i17 == 0) {
                        }
                        i18 = i27;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i13 != 0) {
                        }
                        Modifier modifier42 = companion;
                        if ((i3 & 16) == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i282 = i18;
                        if ((i3 & 4096) == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if (i17 == 0) {
                        }
                        z6 = z10;
                        modifier2 = modifier42;
                        shape2 = shape4;
                        long j192 = j10;
                        i21 = i4;
                        i22 = i282;
                        z7 = z4;
                        j13 = j192;
                        composer2.endDefaults();
                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                        final Modifier modifier52 = modifier2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localDensity3);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        final float mo336toPx0680j_43 = ((Density) consume3).mo336toPx0680j_4(m1239getPeekHeightD9Ej5fM);
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22 = composer2.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        final float mo336toPx0680j_422 = ((Density) consume22).mo336toPx0680j_4(m1238getHeaderHeightD9Ej5fM);
                        final BackdropScaffoldState backdropScaffoldState42 = backdropScaffoldState2;
                        final boolean z112 = z5;
                        final int i302 = i21;
                        final float f102 = m1239getPeekHeightD9Ej5fM;
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda3 = ComposableLambdaKt.composableLambda(composer2, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer42, Integer num) {
                                invoke(composer42, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer42, int i312) {
                                ComposerKt.sourceInformation(composer42, "C:BackdropScaffold.kt#jmzs0o");
                                if ((i312 & 11) != 2 || !composer42.getSkipping()) {
                                    if (z112) {
                                        composer42.startReplaceableGroup(-1017265331);
                                        ComposerKt.sourceInformation(composer42, "280@12876L82");
                                        Function2<Composer, Integer, Unit> function2 = appBar;
                                        int i322 = i302;
                                        Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                        composer42.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer42, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer42, 0);
                                        composer42.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer42, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer42, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume32 = composer42.consume(localDensity32);
                                        ComposerKt.sourceInformationMarkerEnd(composer42);
                                        Density density = (Density) consume32;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer42, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer42.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer42);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer42, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer42.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer42);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                        if (!(composer42.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer42.startReusableNode();
                                        if (composer42.getInserting()) {
                                            composer42.createNode(constructor);
                                        } else {
                                            composer42.useNode();
                                        }
                                        composer42.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer42);
                                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer42.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer42)), composer42, 0);
                                        composer42.startReplaceableGroup(2058660585);
                                        composer42.startReplaceableGroup(-1163856341);
                                        ComposerKt.sourceInformation(composer42, "C79@3994L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        composer42.startReplaceableGroup(-18835878);
                                        ComposerKt.sourceInformation(composer42, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                        function2.invoke(composer42, Integer.valueOf(i322 & 14));
                                        function22.invoke(composer42, Integer.valueOf((i322 >> 3) & 14));
                                        composer42.endReplaceableGroup();
                                        composer42.endReplaceableGroup();
                                        composer42.endReplaceableGroup();
                                        composer42.endNode();
                                        composer42.endReplaceableGroup();
                                        composer42.endReplaceableGroup();
                                        composer42.endReplaceableGroup();
                                        return;
                                    }
                                    composer42.startReplaceableGroup(-1017265219);
                                    ComposerKt.sourceInformation(composer42, "285@12988L72");
                                    BackdropValue targetValue = backdropScaffoldState42.getTargetValue();
                                    Function2<Composer, Integer, Unit> function23 = appBar;
                                    Function2<Composer, Integer, Unit> function24 = backLayerContent;
                                    int i33 = i302;
                                    BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer42, ((i33 << 3) & 896) | ((i33 << 3) & 112));
                                    composer42.endReplaceableGroup();
                                    return;
                                }
                                composer42.skipToGroupEnd();
                            }
                        });
                        Float valueOf2 = Float.valueOf(mo336toPx0680j_422);
                        composer2.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                        changed = composer2.changed(valueOf2);
                        rememberedValue = composer2.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                return Constraints.m4384boximpl(m1248invokeZezNO4M(constraints.getValue()));
                            }

                            /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                            public final long m1248invokeZezNO4M(long j202) {
                                return ConstraintsKt.m4413offsetNN6EwU$default(Constraints.m4387copyZbe2FdA$default(j202, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo336toPx0680j_422), 1, null);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                        composer2.endReplaceableGroup();
                        final Function1<? super Constraints, Constraints> function12 = (Function1) rememberedValue;
                        Composer composer42 = composer2;
                        final long j202 = j11;
                        final long j212 = j12;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function352 = function33;
                        final int i312 = i22;
                        final float f112 = m1238getHeaderHeightD9Ej5fM;
                        final Shape shape62 = shape2;
                        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer42, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                            public final void invoke(Composer composer5, int i322) {
                                ComposerKt.sourceInformation(composer5, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                                if ((i322 & 11) != 2 || !composer5.getSkipping()) {
                                    composer5.startReplaceableGroup(773894976);
                                    ComposerKt.sourceInformation(composer5, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                    composer5.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue2 = composer5.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer5));
                                        composer5.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                    }
                                    composer5.endReplaceableGroup();
                                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                    composer5.endReplaceableGroup();
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                                    Function2<Composer, Integer, Unit> function2 = composableLambda3;
                                    Function1<Constraints, Constraints> function122 = function12;
                                    final float f12 = mo336toPx0680j_422;
                                    final boolean z12 = z6;
                                    final boolean z13 = z7;
                                    final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState2;
                                    final float f13 = mo336toPx0680j_43;
                                    final int i33 = i302;
                                    final Shape shape7 = shape62;
                                    final long j22 = j202;
                                    final long j23 = j13;
                                    final float f14 = f6;
                                    final int i34 = i312;
                                    final float f15 = f112;
                                    final float f16 = f102;
                                    final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                                    final long j24 = j212;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function352;
                                    BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function122, ComposableLambdaKt.composableLambda(composer5, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f17, Composer composer6, Integer num) {
                                            m1246invokejYbf7pk(constraints.getValue(), f17.floatValue(), composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                        public final void m1246invokejYbf7pk(long j25, float f17, Composer composer6, int i35) {
                                            int i36;
                                            Modifier.Companion companion2;
                                            Modifier m1530swipeablepPrIpRY;
                                            float m4440constructorimpl;
                                            ComposerKt.sourceInformation(composer6, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                            if ((i35 & 14) == 0) {
                                                i36 = i35 | (composer6.changed(j25) ? 4 : 2);
                                            } else {
                                                i36 = i35;
                                            }
                                            if ((i35 & 112) == 0) {
                                                i36 |= composer6.changed(f17) ? 32 : 16;
                                            }
                                            if ((i36 & 731) != 146 || !composer6.getSkipping()) {
                                                float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j25);
                                                float f18 = m4395getMaxHeightimpl - f12;
                                                if (z12) {
                                                    f18 = Math.min(f18, f17);
                                                }
                                                float f19 = f18;
                                                if (z13) {
                                                    companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState5.getNestedScrollConnection(), null, 2, null);
                                                } else {
                                                    companion2 = Modifier.INSTANCE;
                                                }
                                                m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState5, r17, Orientation.Vertical, (r26 & 8) != 0 ? true : z13, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final FixedThreshold invoke(T t, T t2) {
                                                        return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                    }
                                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f13), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f19), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                                final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                                final CoroutineScope coroutineScope2 = coroutineScope;
                                                Modifier semantics$default = SemanticsModifierKt.semantics$default(m1530swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                        if (BackdropScaffoldState.this.isConcealed()) {
                                                            final BackdropScaffoldState backdropScaffoldState7 = BackdropScaffoldState.this;
                                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00371(BackdropScaffoldState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C00371(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00371> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new C00371(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                            }, 1, null);
                                                        } else {
                                                            final BackdropScaffoldState backdropScaffoldState8 = BackdropScaffoldState.this;
                                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                            }, 1, null);
                                                        }
                                                    }
                                                }, 1, null);
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                                composer6.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed2 = composer6.changed(backdropScaffoldState7);
                                                Object rememberedValue3 = composer6.rememberedValue();
                                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                            return IntOffset.m4559boximpl(m1247invokeBjo55l4(density));
                                                        }

                                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                        public final long m1247invokeBjo55l4(Density offset) {
                                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(rememberedValue3);
                                                }
                                                composer6.endReplaceableGroup();
                                                Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                                Shape shape8 = shape7;
                                                long j26 = j22;
                                                long j27 = j23;
                                                float f20 = f14;
                                                final float f21 = f16;
                                                final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                                final int i37 = i33;
                                                final long j28 = j24;
                                                final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState5;
                                                final int i38 = i34;
                                                final boolean z14 = z13;
                                                final CoroutineScope coroutineScope3 = coroutineScope;
                                                ComposableLambda composableLambda32 = ComposableLambdaKt.composableLambda(composer6, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                        invoke(composer7, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer7, int i39) {
                                                        ComposerKt.sourceInformation(composer7, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                        if ((i39 & 11) != 2 || !composer7.getSkipping()) {
                                                            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                                            Function2<Composer, Integer, Unit> function24 = function23;
                                                            int i40 = i37;
                                                            long j29 = j28;
                                                            final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                            int i41 = i38;
                                                            final boolean z15 = z14;
                                                            final CoroutineScope coroutineScope4 = coroutineScope3;
                                                            composer7.startReplaceableGroup(733328855);
                                                            ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                            composer7.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume32 = composer7.consume(localDensity32);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            Density density = (Density) consume32;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume4 = composer7.consume(localLayoutDirection);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume5 = composer7.consume(localViewConfiguration);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                            if (!(composer7.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer7.startReusableNode();
                                                            if (composer7.getInserting()) {
                                                                composer7.createNode(constructor);
                                                            } else {
                                                                composer7.useNode();
                                                            }
                                                            composer7.disableReusing();
                                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer7.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                            composer7.startReplaceableGroup(2058660585);
                                                            composer7.startReplaceableGroup(-2137368960);
                                                            ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer7.startReplaceableGroup(-1889954677);
                                                            ComposerKt.sourceInformation(composer7, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                            function24.invoke(composer7, Integer.valueOf((i40 >> 6) & 14));
                                                            BackdropScaffoldKt.m1242Scrim3JVO9M(j29, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                    if (z15 && backdropScaffoldState9.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState9, null), 3, null);
                                                                    }
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                            }, backdropScaffoldState9.getTargetValue() == BackdropValue.Revealed, composer7, (i41 >> 18) & 14);
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endNode();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            return;
                                                        }
                                                        composer7.skipToGroupEnd();
                                                    }
                                                });
                                                int i39 = i34;
                                                SurfaceKt.m1520SurfaceFjzlyU(then, shape8, j26, j27, null, f20, composableLambda32, composer6, ((i39 << 6) & 458752) | ((i39 >> 3) & 112) | 1572864 | ((i39 >> 6) & 896) | ((i39 >> 6) & 7168), 16);
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                if (backdropScaffoldState5.isRevealed() && f19 == m4395getMaxHeightimpl - f12) {
                                                    m4440constructorimpl = f15;
                                                } else {
                                                    m4440constructorimpl = Dp.m4440constructorimpl(0);
                                                }
                                                Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4440constructorimpl, 7, null);
                                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                                BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState5;
                                                int i40 = i34;
                                                composer6.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer6, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                                composer6.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume32 = composer6.consume(localDensity32);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                Density density = (Density) consume32;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer6.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer6.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                composer6.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer6);
                                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer6.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                                composer6.startReplaceableGroup(2058660585);
                                                composer6.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer6, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer6.startReplaceableGroup(1815906203);
                                                ComposerKt.sourceInformation(composer6, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                                function37.invoke(backdropScaffoldState9.getSnackbarHostState(), composer6, Integer.valueOf((i40 >> 18) & 112));
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endNode();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }), composer5, 3120);
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        });
                        int i322 = i312 << 6;
                        SurfaceKt.m1520SurfaceFjzlyU(null, null, j8, j7, null, 0.0f, composableLambda22, composer42, (i322 & 7168) | (i322 & 896) | 1572864, 51);
                        composer3 = composer42;
                        modifier3 = modifier52;
                        f7 = f6;
                        f8 = f112;
                        function34 = function352;
                        z8 = z112;
                        shape5 = shape62;
                        j14 = j212;
                        z9 = z6;
                        backdropScaffoldState3 = backdropScaffoldState2;
                        j15 = j13;
                        f9 = f102;
                        j16 = j7;
                        j17 = j202;
                        j18 = j8;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i12 = i11;
                    if ((i2 & 14) == 0) {
                    }
                    if ((i2 & 112) == 0) {
                    }
                    if ((i2 & 896) == 0) {
                    }
                    int i272 = i14;
                    i15 = i3 & 8192;
                    if (i15 != 0) {
                    }
                    if ((i2 & 57344) != 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    if ((i2 & 3670016) == 0) {
                    }
                    i17 = i3 & 131072;
                    if (i17 == 0) {
                    }
                    i18 = i272;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    Modifier modifier422 = companion;
                    if ((i3 & 16) == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i2822 = i18;
                    if ((i3 & 4096) == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if (i17 == 0) {
                    }
                    z6 = z10;
                    modifier2 = modifier422;
                    shape2 = shape4;
                    long j1922 = j10;
                    i21 = i4;
                    i22 = i2822;
                    z7 = z4;
                    j13 = j1922;
                    composer2.endDefaults();
                    ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                    final Modifier modifier522 = modifier2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume32 = composer2.consume(localDensity32);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final float mo336toPx0680j_432 = ((Density) consume32).mo336toPx0680j_4(m1239getPeekHeightD9Ej5fM);
                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222 = composer2.consume(localDensity222);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final float mo336toPx0680j_4222 = ((Density) consume222).mo336toPx0680j_4(m1238getHeaderHeightD9Ej5fM);
                    final BackdropScaffoldState backdropScaffoldState422 = backdropScaffoldState2;
                    final boolean z1122 = z5;
                    final int i3022 = i21;
                    final float f1022 = m1239getPeekHeightD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda32 = ComposableLambdaKt.composableLambda(composer2, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer422, Integer num) {
                            invoke(composer422, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer422, int i3122) {
                            ComposerKt.sourceInformation(composer422, "C:BackdropScaffold.kt#jmzs0o");
                            if ((i3122 & 11) != 2 || !composer422.getSkipping()) {
                                if (z1122) {
                                    composer422.startReplaceableGroup(-1017265331);
                                    ComposerKt.sourceInformation(composer422, "280@12876L82");
                                    Function2<Composer, Integer, Unit> function2 = appBar;
                                    int i3222 = i3022;
                                    Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                    composer422.startReplaceableGroup(-483455358);
                                    ComposerKt.sourceInformation(composer422, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer422, 0);
                                    composer422.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer422, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer422, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume322 = composer422.consume(localDensity322);
                                    ComposerKt.sourceInformationMarkerEnd(composer422);
                                    Density density = (Density) consume322;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer422, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer422.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer422);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer422, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer422.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer422);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                    if (!(composer422.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer422.startReusableNode();
                                    if (composer422.getInserting()) {
                                        composer422.createNode(constructor);
                                    } else {
                                        composer422.useNode();
                                    }
                                    composer422.disableReusing();
                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer422);
                                    Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer422.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer422)), composer422, 0);
                                    composer422.startReplaceableGroup(2058660585);
                                    composer422.startReplaceableGroup(-1163856341);
                                    ComposerKt.sourceInformation(composer422, "C79@3994L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer422.startReplaceableGroup(-18835878);
                                    ComposerKt.sourceInformation(composer422, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                    function2.invoke(composer422, Integer.valueOf(i3222 & 14));
                                    function22.invoke(composer422, Integer.valueOf((i3222 >> 3) & 14));
                                    composer422.endReplaceableGroup();
                                    composer422.endReplaceableGroup();
                                    composer422.endReplaceableGroup();
                                    composer422.endNode();
                                    composer422.endReplaceableGroup();
                                    composer422.endReplaceableGroup();
                                    composer422.endReplaceableGroup();
                                    return;
                                }
                                composer422.startReplaceableGroup(-1017265219);
                                ComposerKt.sourceInformation(composer422, "285@12988L72");
                                BackdropValue targetValue = backdropScaffoldState422.getTargetValue();
                                Function2<Composer, Integer, Unit> function23 = appBar;
                                Function2<Composer, Integer, Unit> function24 = backLayerContent;
                                int i33 = i3022;
                                BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer422, ((i33 << 3) & 896) | ((i33 << 3) & 112));
                                composer422.endReplaceableGroup();
                                return;
                            }
                            composer422.skipToGroupEnd();
                        }
                    });
                    Float valueOf22 = Float.valueOf(mo336toPx0680j_4222);
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = composer2.changed(valueOf22);
                    rememberedValue = composer2.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                            return Constraints.m4384boximpl(m1248invokeZezNO4M(constraints.getValue()));
                        }

                        /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                        public final long m1248invokeZezNO4M(long j2022) {
                            return ConstraintsKt.m4413offsetNN6EwU$default(Constraints.m4387copyZbe2FdA$default(j2022, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo336toPx0680j_4222), 1, null);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                    composer2.endReplaceableGroup();
                    final Function1<? super Constraints, Constraints> function122 = (Function1) rememberedValue;
                    Composer composer422 = composer2;
                    final long j2022 = j11;
                    final long j2122 = j12;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3522 = function33;
                    final int i3122 = i22;
                    final float f1122 = m1238getHeaderHeightD9Ej5fM;
                    final Shape shape622 = shape2;
                    ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer422, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                        public final void invoke(Composer composer5, int i3222) {
                            ComposerKt.sourceInformation(composer5, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                            if ((i3222 & 11) != 2 || !composer5.getSkipping()) {
                                composer5.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(composer5, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                composer5.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue2 = composer5.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer5));
                                    composer5.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                }
                                composer5.endReplaceableGroup();
                                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                                composer5.endReplaceableGroup();
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                                Function2<Composer, Integer, Unit> function2 = composableLambda32;
                                Function1<Constraints, Constraints> function1222 = function122;
                                final float f12 = mo336toPx0680j_4222;
                                final boolean z12 = z6;
                                final boolean z13 = z7;
                                final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState2;
                                final float f13 = mo336toPx0680j_432;
                                final int i33 = i3022;
                                final Shape shape7 = shape622;
                                final long j22 = j2022;
                                final long j23 = j13;
                                final float f14 = f6;
                                final int i34 = i3122;
                                final float f15 = f1122;
                                final float f16 = f1022;
                                final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                                final long j24 = j2122;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function3522;
                                BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function1222, ComposableLambdaKt.composableLambda(composer5, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f17, Composer composer6, Integer num) {
                                        m1246invokejYbf7pk(constraints.getValue(), f17.floatValue(), composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                    public final void m1246invokejYbf7pk(long j25, float f17, Composer composer6, int i35) {
                                        int i36;
                                        Modifier.Companion companion2;
                                        Modifier m1530swipeablepPrIpRY;
                                        float m4440constructorimpl;
                                        ComposerKt.sourceInformation(composer6, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                        if ((i35 & 14) == 0) {
                                            i36 = i35 | (composer6.changed(j25) ? 4 : 2);
                                        } else {
                                            i36 = i35;
                                        }
                                        if ((i35 & 112) == 0) {
                                            i36 |= composer6.changed(f17) ? 32 : 16;
                                        }
                                        if ((i36 & 731) != 146 || !composer6.getSkipping()) {
                                            float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j25);
                                            float f18 = m4395getMaxHeightimpl - f12;
                                            if (z12) {
                                                f18 = Math.min(f18, f17);
                                            }
                                            float f19 = f18;
                                            if (z13) {
                                                companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState5.getNestedScrollConnection(), null, 2, null);
                                            } else {
                                                companion2 = Modifier.INSTANCE;
                                            }
                                            m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState5, r17, Orientation.Vertical, (r26 & 8) != 0 ? true : z13, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final FixedThreshold invoke(T t, T t2) {
                                                    return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                }
                                            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f13), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f19), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                            final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                            Modifier semantics$default = SemanticsModifierKt.semantics$default(m1530swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                    if (BackdropScaffoldState.this.isConcealed()) {
                                                        final BackdropScaffoldState backdropScaffoldState7 = BackdropScaffoldState.this;
                                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00371(BackdropScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                C00371(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00371> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new C00371(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                        }, 1, null);
                                                    } else {
                                                        final BackdropScaffoldState backdropScaffoldState8 = BackdropScaffoldState.this;
                                                        final CoroutineScope coroutineScope4 = coroutineScope2;
                                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                                }
                                                                return true;
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                        }, 1, null);
                                                    }
                                                }
                                            }, 1, null);
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                            composer6.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed2 = composer6.changed(backdropScaffoldState7);
                                            Object rememberedValue3 = composer6.rememberedValue();
                                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                        return IntOffset.m4559boximpl(m1247invokeBjo55l4(density));
                                                    }

                                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                    public final long m1247invokeBjo55l4(Density offset) {
                                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                        return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                    }
                                                };
                                                composer6.updateRememberedValue(rememberedValue3);
                                            }
                                            composer6.endReplaceableGroup();
                                            Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                            Shape shape8 = shape7;
                                            long j26 = j22;
                                            long j27 = j23;
                                            float f20 = f14;
                                            final float f21 = f16;
                                            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                            final int i37 = i33;
                                            final long j28 = j24;
                                            final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState5;
                                            final int i38 = i34;
                                            final boolean z14 = z13;
                                            final CoroutineScope coroutineScope3 = coroutineScope;
                                            ComposableLambda composableLambda322 = ComposableLambdaKt.composableLambda(composer6, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                    invoke(composer7, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer7, int i39) {
                                                    ComposerKt.sourceInformation(composer7, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                    if ((i39 & 11) != 2 || !composer7.getSkipping()) {
                                                        Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                                        Function2<Composer, Integer, Unit> function24 = function23;
                                                        int i40 = i37;
                                                        long j29 = j28;
                                                        final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                        int i41 = i38;
                                                        final boolean z15 = z14;
                                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                                        composer7.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                        composer7.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume322 = composer7.consume(localDensity322);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        Density density = (Density) consume322;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer7.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume5 = composer7.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                        if (!(composer7.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        composer7.disableReusing();
                                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer7.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                        composer7.startReplaceableGroup(2058660585);
                                                        composer7.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer7.startReplaceableGroup(-1889954677);
                                                        ComposerKt.sourceInformation(composer7, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                        function24.invoke(composer7, Integer.valueOf((i40 >> 6) & 14));
                                                        BackdropScaffoldKt.m1242Scrim3JVO9M(j29, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                if (z15 && backdropScaffoldState9.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState9, null), 3, null);
                                                                }
                                                            }

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                        }, backdropScaffoldState9.getTargetValue() == BackdropValue.Revealed, composer7, (i41 >> 18) & 14);
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endNode();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer7.skipToGroupEnd();
                                                }
                                            });
                                            int i39 = i34;
                                            SurfaceKt.m1520SurfaceFjzlyU(then, shape8, j26, j27, null, f20, composableLambda322, composer6, ((i39 << 6) & 458752) | ((i39 >> 3) & 112) | 1572864 | ((i39 >> 6) & 896) | ((i39 >> 6) & 7168), 16);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            if (backdropScaffoldState5.isRevealed() && f19 == m4395getMaxHeightimpl - f12) {
                                                m4440constructorimpl = f15;
                                            } else {
                                                m4440constructorimpl = Dp.m4440constructorimpl(0);
                                            }
                                            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4440constructorimpl, 7, null);
                                            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                            Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                            BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState5;
                                            int i40 = i34;
                                            composer6.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer6, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                            composer6.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume322 = composer6.consume(localDensity322);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            Density density = (Density) consume322;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer6.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer6.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            composer6.disableReusing();
                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer6);
                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer6.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            composer6.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer6, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer6.startReplaceableGroup(1815906203);
                                            ComposerKt.sourceInformation(composer6, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                            function37.invoke(backdropScaffoldState9.getSnackbarHostState(), composer6, Integer.valueOf((i40 >> 18) & 112));
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), composer5, 3120);
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    });
                    int i3222 = i3122 << 6;
                    SurfaceKt.m1520SurfaceFjzlyU(null, null, j8, j7, null, 0.0f, composableLambda222, composer422, (i3222 & 7168) | (i3222 & 896) | 1572864, 51);
                    composer3 = composer422;
                    modifier3 = modifier522;
                    f7 = f6;
                    f8 = f1122;
                    function34 = function3522;
                    z8 = z1122;
                    shape5 = shape622;
                    j14 = j2122;
                    z9 = z6;
                    backdropScaffoldState3 = backdropScaffoldState2;
                    j15 = j13;
                    f9 = f1022;
                    j16 = j7;
                    j17 = j2022;
                    j18 = j8;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i2 & 14) == 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i2722 = i14;
                i15 = i3 & 8192;
                if (i15 != 0) {
                }
                if ((i2 & 57344) != 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                if ((i2 & 3670016) == 0) {
                }
                i17 = i3 & 131072;
                if (i17 == 0) {
                }
                i18 = i2722;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 != 0) {
                }
                Modifier modifier4222 = companion;
                if ((i3 & 16) == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i28222 = i18;
                if ((i3 & 4096) == 0) {
                }
                if (i19 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if (i17 == 0) {
                }
                z6 = z10;
                modifier2 = modifier4222;
                shape2 = shape4;
                long j19222 = j10;
                i21 = i4;
                i22 = i28222;
                z7 = z4;
                j13 = j19222;
                composer2.endDefaults();
                ProvidableCompositionLocal<Density> localDensity322 = CompositionLocalsKt.getLocalDensity();
                final Modifier modifier5222 = modifier2;
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume322 = composer2.consume(localDensity322);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final float mo336toPx0680j_4322 = ((Density) consume322).mo336toPx0680j_4(m1239getPeekHeightD9Ej5fM);
                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2222 = composer2.consume(localDensity2222);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                final float mo336toPx0680j_42222 = ((Density) consume2222).mo336toPx0680j_4(m1238getHeaderHeightD9Ej5fM);
                final BackdropScaffoldState backdropScaffoldState4222 = backdropScaffoldState2;
                final boolean z11222 = z5;
                final int i30222 = i21;
                final float f10222 = m1239getPeekHeightD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda322 = ComposableLambdaKt.composableLambda(composer2, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4222, Integer num) {
                        invoke(composer4222, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4222, int i31222) {
                        ComposerKt.sourceInformation(composer4222, "C:BackdropScaffold.kt#jmzs0o");
                        if ((i31222 & 11) != 2 || !composer4222.getSkipping()) {
                            if (z11222) {
                                composer4222.startReplaceableGroup(-1017265331);
                                ComposerKt.sourceInformation(composer4222, "280@12876L82");
                                Function2<Composer, Integer, Unit> function2 = appBar;
                                int i32222 = i30222;
                                Function2<Composer, Integer, Unit> function22 = backLayerContent;
                                composer4222.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer4222, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4222, 0);
                                composer4222.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer4222, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer4222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3222 = composer4222.consume(localDensity3222);
                                ComposerKt.sourceInformationMarkerEnd(composer4222);
                                Density density = (Density) consume3222;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer4222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer4222.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer4222);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer4222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer4222.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer4222);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                                if (!(composer4222.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4222.startReusableNode();
                                if (composer4222.getInserting()) {
                                    composer4222.createNode(constructor);
                                } else {
                                    composer4222.useNode();
                                }
                                composer4222.disableReusing();
                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4222);
                                Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer4222.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4222)), composer4222, 0);
                                composer4222.startReplaceableGroup(2058660585);
                                composer4222.startReplaceableGroup(-1163856341);
                                ComposerKt.sourceInformation(composer4222, "C79@3994L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4222.startReplaceableGroup(-18835878);
                                ComposerKt.sourceInformation(composer4222, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                                function2.invoke(composer4222, Integer.valueOf(i32222 & 14));
                                function22.invoke(composer4222, Integer.valueOf((i32222 >> 3) & 14));
                                composer4222.endReplaceableGroup();
                                composer4222.endReplaceableGroup();
                                composer4222.endReplaceableGroup();
                                composer4222.endNode();
                                composer4222.endReplaceableGroup();
                                composer4222.endReplaceableGroup();
                                composer4222.endReplaceableGroup();
                                return;
                            }
                            composer4222.startReplaceableGroup(-1017265219);
                            ComposerKt.sourceInformation(composer4222, "285@12988L72");
                            BackdropValue targetValue = backdropScaffoldState4222.getTargetValue();
                            Function2<Composer, Integer, Unit> function23 = appBar;
                            Function2<Composer, Integer, Unit> function24 = backLayerContent;
                            int i33 = i30222;
                            BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer4222, ((i33 << 3) & 896) | ((i33 << 3) & 112));
                            composer4222.endReplaceableGroup();
                            return;
                        }
                        composer4222.skipToGroupEnd();
                    }
                });
                Float valueOf222 = Float.valueOf(mo336toPx0680j_42222);
                composer2.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                changed = composer2.changed(valueOf222);
                rememberedValue = composer2.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                        return Constraints.m4384boximpl(m1248invokeZezNO4M(constraints.getValue()));
                    }

                    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                    public final long m1248invokeZezNO4M(long j20222) {
                        return ConstraintsKt.m4413offsetNN6EwU$default(Constraints.m4387copyZbe2FdA$default(j20222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo336toPx0680j_42222), 1, null);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
                composer2.endReplaceableGroup();
                final Function1<? super Constraints, Constraints> function1222 = (Function1) rememberedValue;
                Composer composer4222 = composer2;
                final long j20222 = j11;
                final long j21222 = j12;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35222 = function33;
                final int i31222 = i22;
                final float f11222 = m1238getHeaderHeightD9Ej5fM;
                final Shape shape6222 = shape2;
                ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer4222, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                    public final void invoke(Composer composer5, int i32222) {
                        ComposerKt.sourceInformation(composer5, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                        if ((i32222 & 11) != 2 || !composer5.getSkipping()) {
                            composer5.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(composer5, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            composer5.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                            Object rememberedValue2 = composer5.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer5));
                                composer5.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                            }
                            composer5.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                            composer5.endReplaceableGroup();
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function2 = composableLambda322;
                            Function1<Constraints, Constraints> function12222 = function1222;
                            final float f12 = mo336toPx0680j_42222;
                            final boolean z12 = z6;
                            final boolean z13 = z7;
                            final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState2;
                            final float f13 = mo336toPx0680j_4322;
                            final int i33 = i30222;
                            final Shape shape7 = shape6222;
                            final long j22 = j20222;
                            final long j23 = j13;
                            final float f14 = f6;
                            final int i34 = i31222;
                            final float f15 = f11222;
                            final float f16 = f10222;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                            final long j24 = j21222;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function35222;
                            BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function12222, ComposableLambdaKt.composableLambda(composer5, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f17, Composer composer6, Integer num) {
                                    m1246invokejYbf7pk(constraints.getValue(), f17.floatValue(), composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                public final void m1246invokejYbf7pk(long j25, float f17, Composer composer6, int i35) {
                                    int i36;
                                    Modifier.Companion companion2;
                                    Modifier m1530swipeablepPrIpRY;
                                    float m4440constructorimpl;
                                    ComposerKt.sourceInformation(composer6, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                    if ((i35 & 14) == 0) {
                                        i36 = i35 | (composer6.changed(j25) ? 4 : 2);
                                    } else {
                                        i36 = i35;
                                    }
                                    if ((i35 & 112) == 0) {
                                        i36 |= composer6.changed(f17) ? 32 : 16;
                                    }
                                    if ((i36 & 731) != 146 || !composer6.getSkipping()) {
                                        float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j25);
                                        float f18 = m4395getMaxHeightimpl - f12;
                                        if (z12) {
                                            f18 = Math.min(f18, f17);
                                        }
                                        float f19 = f18;
                                        if (z13) {
                                            companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState5.getNestedScrollConnection(), null, 2, null);
                                        } else {
                                            companion2 = Modifier.INSTANCE;
                                        }
                                        m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState5, r17, Orientation.Vertical, (r26 & 8) != 0 ? true : z13, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final FixedThreshold invoke(T t, T t2) {
                                                return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                            }
                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f13), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f19), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                        final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m1530swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                if (BackdropScaffoldState.this.isConcealed()) {
                                                    final BackdropScaffoldState backdropScaffoldState7 = BackdropScaffoldState.this;
                                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00371(BackdropScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            C00371(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00371> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new C00371(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                    }, 1, null);
                                                } else {
                                                    final BackdropScaffoldState backdropScaffoldState8 = BackdropScaffoldState.this;
                                                    final CoroutineScope coroutineScope4 = coroutineScope2;
                                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                    }, 1, null);
                                                }
                                            }
                                        }, 1, null);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                        composer6.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                                        boolean changed2 = composer6.changed(backdropScaffoldState7);
                                        Object rememberedValue3 = composer6.rememberedValue();
                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                    return IntOffset.m4559boximpl(m1247invokeBjo55l4(density));
                                                }

                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                public final long m1247invokeBjo55l4(Density offset) {
                                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                    return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                                }
                                            };
                                            composer6.updateRememberedValue(rememberedValue3);
                                        }
                                        composer6.endReplaceableGroup();
                                        Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                        Shape shape8 = shape7;
                                        long j26 = j22;
                                        long j27 = j23;
                                        float f20 = f14;
                                        final float f21 = f16;
                                        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                        final int i37 = i33;
                                        final long j28 = j24;
                                        final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState5;
                                        final int i38 = i34;
                                        final boolean z14 = z13;
                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                        ComposableLambda composableLambda3222 = ComposableLambdaKt.composableLambda(composer6, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                invoke(composer7, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer7, int i39) {
                                                ComposerKt.sourceInformation(composer7, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                                if ((i39 & 11) != 2 || !composer7.getSkipping()) {
                                                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                                    Function2<Composer, Integer, Unit> function24 = function23;
                                                    int i40 = i37;
                                                    long j29 = j28;
                                                    final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                    int i41 = i38;
                                                    final boolean z15 = z14;
                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                    composer7.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                    composer7.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3222 = composer7.consume(localDensity3222);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    Density density = (Density) consume3222;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume4 = composer7.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume5 = composer7.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer7.startReusableNode();
                                                    if (composer7.getInserting()) {
                                                        composer7.createNode(constructor);
                                                    } else {
                                                        composer7.useNode();
                                                    }
                                                    composer7.disableReusing();
                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer7.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                    composer7.startReplaceableGroup(2058660585);
                                                    composer7.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer7.startReplaceableGroup(-1889954677);
                                                    ComposerKt.sourceInformation(composer7, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                    function24.invoke(composer7, Integer.valueOf((i40 >> 6) & 14));
                                                    BackdropScaffoldKt.m1242Scrim3JVO9M(j29, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                            if (z15 && backdropScaffoldState9.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState9, null), 3, null);
                                                            }
                                                        }

                                                        /* compiled from: BackdropScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                    }, backdropScaffoldState9.getTargetValue() == BackdropValue.Revealed, composer7, (i41 >> 18) & 14);
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endNode();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    return;
                                                }
                                                composer7.skipToGroupEnd();
                                            }
                                        });
                                        int i39 = i34;
                                        SurfaceKt.m1520SurfaceFjzlyU(then, shape8, j26, j27, null, f20, composableLambda3222, composer6, ((i39 << 6) & 458752) | ((i39 >> 3) & 112) | 1572864 | ((i39 >> 6) & 896) | ((i39 >> 6) & 7168), 16);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        if (backdropScaffoldState5.isRevealed() && f19 == m4395getMaxHeightimpl - f12) {
                                            m4440constructorimpl = f15;
                                        } else {
                                            m4440constructorimpl = Dp.m4440constructorimpl(0);
                                        }
                                        Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4440constructorimpl, 7, null);
                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                        Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                        BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState5;
                                        int i40 = i34;
                                        composer6.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer6, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                        composer6.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3222 = composer6.consume(localDensity3222);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        Density density = (Density) consume3222;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer6.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer6.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                        if (!(composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        composer6.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer6);
                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer6.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                        composer6.startReplaceableGroup(2058660585);
                                        composer6.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer6, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer6.startReplaceableGroup(1815906203);
                                        ComposerKt.sourceInformation(composer6, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                        function37.invoke(backdropScaffoldState9.getSnackbarHostState(), composer6, Integer.valueOf((i40 >> 18) & 112));
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                        composer6.endNode();
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                        return;
                                    }
                                    composer6.skipToGroupEnd();
                                }
                            }), composer5, 3120);
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                });
                int i32222 = i31222 << 6;
                SurfaceKt.m1520SurfaceFjzlyU(null, null, j8, j7, null, 0.0f, composableLambda2222, composer4222, (i32222 & 7168) | (i32222 & 896) | 1572864, 51);
                composer3 = composer4222;
                modifier3 = modifier5222;
                f7 = f6;
                f8 = f11222;
                function34 = function35222;
                z8 = z11222;
                shape5 = shape6222;
                j14 = j21222;
                z9 = z6;
                backdropScaffoldState3 = backdropScaffoldState2;
                j15 = j13;
                f9 = f10222;
                j16 = j7;
                j17 = j20222;
                j18 = j8;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i2 & 14) == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i27222 = i14;
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            if ((i2 & 57344) != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i17 = i3 & 131072;
            if (i17 == 0) {
            }
            i18 = i27222;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 != 0) {
            }
            Modifier modifier42222 = companion;
            if ((i3 & 16) == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i282222 = i18;
            if ((i3 & 4096) == 0) {
            }
            if (i19 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if (i17 == 0) {
            }
            z6 = z10;
            modifier2 = modifier42222;
            shape2 = shape4;
            long j192222 = j10;
            i21 = i4;
            i22 = i282222;
            z7 = z4;
            j13 = j192222;
            composer2.endDefaults();
            ProvidableCompositionLocal<Density> localDensity3222 = CompositionLocalsKt.getLocalDensity();
            final Modifier modifier52222 = modifier2;
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3222 = composer2.consume(localDensity3222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            final float mo336toPx0680j_43222 = ((Density) consume3222).mo336toPx0680j_4(m1239getPeekHeightD9Ej5fM);
            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22222 = composer2.consume(localDensity22222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            final float mo336toPx0680j_422222 = ((Density) consume22222).mo336toPx0680j_4(m1238getHeaderHeightD9Ej5fM);
            final BackdropScaffoldState backdropScaffoldState42222 = backdropScaffoldState2;
            final boolean z112222 = z5;
            final int i302222 = i21;
            final float f102222 = m1239getPeekHeightD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda3222 = ComposableLambdaKt.composableLambda(composer2, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer42222, Integer num) {
                    invoke(composer42222, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer42222, int i312222) {
                    ComposerKt.sourceInformation(composer42222, "C:BackdropScaffold.kt#jmzs0o");
                    if ((i312222 & 11) != 2 || !composer42222.getSkipping()) {
                        if (z112222) {
                            composer42222.startReplaceableGroup(-1017265331);
                            ComposerKt.sourceInformation(composer42222, "280@12876L82");
                            Function2<Composer, Integer, Unit> function2 = appBar;
                            int i322222 = i302222;
                            Function2<Composer, Integer, Unit> function22 = backLayerContent;
                            composer42222.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer42222, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer42222, 0);
                            composer42222.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer42222, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer42222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume32222 = composer42222.consume(localDensity32222);
                            ComposerKt.sourceInformationMarkerEnd(composer42222);
                            Density density = (Density) consume32222;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer42222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer42222.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer42222);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer42222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer42222.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer42222);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                            if (!(composer42222.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer42222.startReusableNode();
                            if (composer42222.getInserting()) {
                                composer42222.createNode(constructor);
                            } else {
                                composer42222.useNode();
                            }
                            composer42222.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer42222);
                            Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer42222.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer42222)), composer42222, 0);
                            composer42222.startReplaceableGroup(2058660585);
                            composer42222.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer42222, "C79@3994L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer42222.startReplaceableGroup(-18835878);
                            ComposerKt.sourceInformation(composer42222, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                            function2.invoke(composer42222, Integer.valueOf(i322222 & 14));
                            function22.invoke(composer42222, Integer.valueOf((i322222 >> 3) & 14));
                            composer42222.endReplaceableGroup();
                            composer42222.endReplaceableGroup();
                            composer42222.endReplaceableGroup();
                            composer42222.endNode();
                            composer42222.endReplaceableGroup();
                            composer42222.endReplaceableGroup();
                            composer42222.endReplaceableGroup();
                            return;
                        }
                        composer42222.startReplaceableGroup(-1017265219);
                        ComposerKt.sourceInformation(composer42222, "285@12988L72");
                        BackdropValue targetValue = backdropScaffoldState42222.getTargetValue();
                        Function2<Composer, Integer, Unit> function23 = appBar;
                        Function2<Composer, Integer, Unit> function24 = backLayerContent;
                        int i33 = i302222;
                        BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer42222, ((i33 << 3) & 896) | ((i33 << 3) & 112));
                        composer42222.endReplaceableGroup();
                        return;
                    }
                    composer42222.skipToGroupEnd();
                }
            });
            Float valueOf2222 = Float.valueOf(mo336toPx0680j_422222);
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
            changed = composer2.changed(valueOf2222);
            rememberedValue = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                    return Constraints.m4384boximpl(m1248invokeZezNO4M(constraints.getValue()));
                }

                /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                public final long m1248invokeZezNO4M(long j202222) {
                    return ConstraintsKt.m4413offsetNN6EwU$default(Constraints.m4387copyZbe2FdA$default(j202222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo336toPx0680j_422222), 1, null);
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceableGroup();
            final Function1<? super Constraints, Constraints> function12222 = (Function1) rememberedValue;
            Composer composer42222 = composer2;
            final long j202222 = j11;
            final long j212222 = j12;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function352222 = function33;
            final int i312222 = i22;
            final float f112222 = m1238getHeaderHeightD9Ej5fM;
            final Shape shape62222 = shape2;
            ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(composer42222, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

                public final void invoke(Composer composer5, int i322222) {
                    ComposerKt.sourceInformation(composer5, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                    if ((i322222 & 11) != 2 || !composer5.getSkipping()) {
                        composer5.startReplaceableGroup(773894976);
                        ComposerKt.sourceInformation(composer5, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        composer5.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                        Object rememberedValue2 = composer5.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer5));
                            composer5.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer5.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                        composer5.endReplaceableGroup();
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = composableLambda3222;
                        Function1<Constraints, Constraints> function122222 = function12222;
                        final float f12 = mo336toPx0680j_422222;
                        final boolean z12 = z6;
                        final boolean z13 = z7;
                        final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState2;
                        final float f13 = mo336toPx0680j_43222;
                        final int i33 = i302222;
                        final Shape shape7 = shape62222;
                        final long j22 = j202222;
                        final long j23 = j13;
                        final float f14 = f6;
                        final int i34 = i312222;
                        final float f15 = f112222;
                        final float f16 = f102222;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                        final long j24 = j212222;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function352222;
                        BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function122222, ComposableLambdaKt.composableLambda(composer5, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f17, Composer composer6, Integer num) {
                                m1246invokejYbf7pk(constraints.getValue(), f17.floatValue(), composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                            public final void m1246invokejYbf7pk(long j25, float f17, Composer composer6, int i35) {
                                int i36;
                                Modifier.Companion companion2;
                                Modifier m1530swipeablepPrIpRY;
                                float m4440constructorimpl;
                                ComposerKt.sourceInformation(composer6, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                                if ((i35 & 14) == 0) {
                                    i36 = i35 | (composer6.changed(j25) ? 4 : 2);
                                } else {
                                    i36 = i35;
                                }
                                if ((i35 & 112) == 0) {
                                    i36 |= composer6.changed(f17) ? 32 : 16;
                                }
                                if ((i36 & 731) != 146 || !composer6.getSkipping()) {
                                    float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j25);
                                    float f18 = m4395getMaxHeightimpl - f12;
                                    if (z12) {
                                        f18 = Math.min(f18, f17);
                                    }
                                    float f19 = f18;
                                    if (z13) {
                                        companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState5.getNestedScrollConnection(), null, 2, null);
                                    } else {
                                        companion2 = Modifier.INSTANCE;
                                    }
                                    m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState5, r17, Orientation.Vertical, (r26 & 8) != 0 ? true : z13, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final FixedThreshold invoke(T t, T t2) {
                                            return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                        }
                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f13), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f19), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                    final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(m1530swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                            if (BackdropScaffoldState.this.isConcealed()) {
                                                final BackdropScaffoldState backdropScaffoldState7 = BackdropScaffoldState.this;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00371(BackdropScaffoldState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C00371(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00371> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C00371(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                }, 1, null);
                                            } else {
                                                final BackdropScaffoldState backdropScaffoldState8 = BackdropScaffoldState.this;
                                                final CoroutineScope coroutineScope4 = coroutineScope2;
                                                SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                }, 1, null);
                                            }
                                        }
                                    }, 1, null);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                    composer6.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed2 = composer6.changed(backdropScaffoldState7);
                                    Object rememberedValue3 = composer6.rememberedValue();
                                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                return IntOffset.m4559boximpl(m1247invokeBjo55l4(density));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m1247invokeBjo55l4(Density offset) {
                                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                            }
                                        };
                                        composer6.updateRememberedValue(rememberedValue3);
                                    }
                                    composer6.endReplaceableGroup();
                                    Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                    Shape shape8 = shape7;
                                    long j26 = j22;
                                    long j27 = j23;
                                    float f20 = f14;
                                    final float f21 = f16;
                                    final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                    final int i37 = i33;
                                    final long j28 = j24;
                                    final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState5;
                                    final int i38 = i34;
                                    final boolean z14 = z13;
                                    final CoroutineScope coroutineScope3 = coroutineScope;
                                    ComposableLambda composableLambda32222 = ComposableLambdaKt.composableLambda(composer6, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                            invoke(composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer7, int i39) {
                                            ComposerKt.sourceInformation(composer7, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                            if ((i39 & 11) != 2 || !composer7.getSkipping()) {
                                                Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                                Function2<Composer, Integer, Unit> function24 = function23;
                                                int i40 = i37;
                                                long j29 = j28;
                                                final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                int i41 = i38;
                                                final boolean z15 = z14;
                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                composer7.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                composer7.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume32222 = composer7.consume(localDensity32222);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                Density density = (Density) consume32222;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer7.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer7.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                if (!(composer7.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer7.startReusableNode();
                                                if (composer7.getInserting()) {
                                                    composer7.createNode(constructor);
                                                } else {
                                                    composer7.useNode();
                                                }
                                                composer7.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer7.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                composer7.startReplaceableGroup(2058660585);
                                                composer7.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer7.startReplaceableGroup(-1889954677);
                                                ComposerKt.sourceInformation(composer7, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                                function24.invoke(composer7, Integer.valueOf((i40 >> 6) & 14));
                                                BackdropScaffoldKt.m1242Scrim3JVO9M(j29, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                        if (z15 && backdropScaffoldState9.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState9, null), 3, null);
                                                        }
                                                    }

                                                    /* compiled from: BackdropScaffold.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$scaffoldState = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$scaffoldState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                }, backdropScaffoldState9.getTargetValue() == BackdropValue.Revealed, composer7, (i41 >> 18) & 14);
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                composer7.endNode();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                return;
                                            }
                                            composer7.skipToGroupEnd();
                                        }
                                    });
                                    int i39 = i34;
                                    SurfaceKt.m1520SurfaceFjzlyU(then, shape8, j26, j27, null, f20, composableLambda32222, composer6, ((i39 << 6) & 458752) | ((i39 >> 3) & 112) | 1572864 | ((i39 >> 6) & 896) | ((i39 >> 6) & 7168), 16);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    if (backdropScaffoldState5.isRevealed() && f19 == m4395getMaxHeightimpl - f12) {
                                        m4440constructorimpl = f15;
                                    } else {
                                        m4440constructorimpl = Dp.m4440constructorimpl(0);
                                    }
                                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4440constructorimpl, 7, null);
                                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                    Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                    BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState5;
                                    int i40 = i34;
                                    composer6.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer6, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                    composer6.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume32222 = composer6.consume(localDensity32222);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    Density density = (Density) consume32222;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer6.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer6.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                    if (!(composer6.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer6.startReusableNode();
                                    if (composer6.getInserting()) {
                                        composer6.createNode(constructor);
                                    } else {
                                        composer6.useNode();
                                    }
                                    composer6.disableReusing();
                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer6);
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer6.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                    composer6.startReplaceableGroup(2058660585);
                                    composer6.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer6, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer6.startReplaceableGroup(1815906203);
                                    ComposerKt.sourceInformation(composer6, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                    function37.invoke(backdropScaffoldState9.getSnackbarHostState(), composer6, Integer.valueOf((i40 >> 18) & 112));
                                    composer6.endReplaceableGroup();
                                    composer6.endReplaceableGroup();
                                    composer6.endReplaceableGroup();
                                    composer6.endNode();
                                    composer6.endReplaceableGroup();
                                    composer6.endReplaceableGroup();
                                    return;
                                }
                                composer6.skipToGroupEnd();
                            }
                        }), composer5, 3120);
                        return;
                    }
                    composer5.skipToGroupEnd();
                }
            });
            int i322222 = i312222 << 6;
            SurfaceKt.m1520SurfaceFjzlyU(null, null, j8, j7, null, 0.0f, composableLambda22222, composer42222, (i322222 & 7168) | (i322222 & 896) | 1572864, 51);
            composer3 = composer42222;
            modifier3 = modifier52222;
            f7 = f6;
            f8 = f112222;
            function34 = function352222;
            z8 = z112222;
            shape5 = shape62222;
            j14 = j212222;
            z9 = z6;
            backdropScaffoldState3 = backdropScaffoldState2;
            j15 = j13;
            f9 = f102222;
            j16 = j7;
            j17 = j202222;
            j18 = j8;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        int i262 = 8192;
        if ((i & 57344) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i2 & 14) == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i272222 = i14;
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        if ((i2 & 57344) != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i17 = i3 & 131072;
        if (i17 == 0) {
        }
        i18 = i272222;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 != 0) {
        }
        Modifier modifier422222 = companion;
        if ((i3 & 16) == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i2822222 = i18;
        if ((i3 & 4096) == 0) {
        }
        if (i19 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if (i17 == 0) {
        }
        z6 = z10;
        modifier2 = modifier422222;
        shape2 = shape4;
        long j1922222 = j10;
        i21 = i4;
        i22 = i2822222;
        z7 = z4;
        j13 = j1922222;
        composer2.endDefaults();
        ProvidableCompositionLocal<Density> localDensity32222 = CompositionLocalsKt.getLocalDensity();
        final Modifier modifier522222 = modifier2;
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32222 = composer2.consume(localDensity32222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        final float mo336toPx0680j_432222 = ((Density) consume32222).mo336toPx0680j_4(m1239getPeekHeightD9Ej5fM);
        ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222222 = composer2.consume(localDensity222222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        final float mo336toPx0680j_4222222 = ((Density) consume222222).mo336toPx0680j_4(m1238getHeaderHeightD9Ej5fM);
        final BackdropScaffoldState backdropScaffoldState422222 = backdropScaffoldState2;
        final boolean z1122222 = z5;
        final int i3022222 = i21;
        final float f1022222 = m1239getPeekHeightD9Ej5fM;
        final Function2<? super Composer, ? super Integer, Unit> composableLambda32222 = ComposableLambdaKt.composableLambda(composer2, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer422222, Integer num) {
                invoke(composer422222, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer422222, int i3122222) {
                ComposerKt.sourceInformation(composer422222, "C:BackdropScaffold.kt#jmzs0o");
                if ((i3122222 & 11) != 2 || !composer422222.getSkipping()) {
                    if (z1122222) {
                        composer422222.startReplaceableGroup(-1017265331);
                        ComposerKt.sourceInformation(composer422222, "280@12876L82");
                        Function2<Composer, Integer, Unit> function2 = appBar;
                        int i3222222 = i3022222;
                        Function2<Composer, Integer, Unit> function22 = backLayerContent;
                        composer422222.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer422222, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer422222, 0);
                        composer422222.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer422222, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity322222 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer422222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume322222 = composer422222.consume(localDensity322222);
                        ComposerKt.sourceInformationMarkerEnd(composer422222);
                        Density density = (Density) consume322222;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer422222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer422222.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer422222);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer422222, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer422222.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer422222);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
                        if (!(composer422222.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer422222.startReusableNode();
                        if (composer422222.getInserting()) {
                            composer422222.createNode(constructor);
                        } else {
                            composer422222.useNode();
                        }
                        composer422222.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer422222);
                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer422222.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer422222)), composer422222, 0);
                        composer422222.startReplaceableGroup(2058660585);
                        composer422222.startReplaceableGroup(-1163856341);
                        ComposerKt.sourceInformation(composer422222, "C79@3994L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer422222.startReplaceableGroup(-18835878);
                        ComposerKt.sourceInformation(composer422222, "C281@12901L8,282@12926L18:BackdropScaffold.kt#jmzs0o");
                        function2.invoke(composer422222, Integer.valueOf(i3222222 & 14));
                        function22.invoke(composer422222, Integer.valueOf((i3222222 >> 3) & 14));
                        composer422222.endReplaceableGroup();
                        composer422222.endReplaceableGroup();
                        composer422222.endReplaceableGroup();
                        composer422222.endNode();
                        composer422222.endReplaceableGroup();
                        composer422222.endReplaceableGroup();
                        composer422222.endReplaceableGroup();
                        return;
                    }
                    composer422222.startReplaceableGroup(-1017265219);
                    ComposerKt.sourceInformation(composer422222, "285@12988L72");
                    BackdropValue targetValue = backdropScaffoldState422222.getTargetValue();
                    Function2<Composer, Integer, Unit> function23 = appBar;
                    Function2<Composer, Integer, Unit> function24 = backLayerContent;
                    int i33 = i3022222;
                    BackdropScaffoldKt.BackLayerTransition(targetValue, function23, function24, composer422222, ((i33 << 3) & 896) | ((i33 << 3) & 112));
                    composer422222.endReplaceableGroup();
                    return;
                }
                composer422222.skipToGroupEnd();
            }
        });
        Float valueOf22222 = Float.valueOf(mo336toPx0680j_4222222);
        composer2.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
        changed = composer2.changed(valueOf22222);
        rememberedValue = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                return Constraints.m4384boximpl(m1248invokeZezNO4M(constraints.getValue()));
            }

            /* renamed from: invoke-ZezNO4M, reason: not valid java name */
            public final long m1248invokeZezNO4M(long j2022222) {
                return ConstraintsKt.m4413offsetNN6EwU$default(Constraints.m4387copyZbe2FdA$default(j2022222, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(mo336toPx0680j_4222222), 1, null);
            }
        };
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceableGroup();
        final Function1<? super Constraints, Constraints> function122222 = (Function1) rememberedValue;
        Composer composer422222 = composer2;
        final long j2022222 = j11;
        final long j2122222 = j12;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3522222 = function33;
        final int i3122222 = i22;
        final float f1122222 = m1238getHeaderHeightD9Ej5fM;
        final Shape shape622222 = shape2;
        ComposableLambda composableLambda222222 = ComposableLambdaKt.composableLambda(composer422222, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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

            public final void invoke(Composer composer5, int i3222222) {
                ComposerKt.sourceInformation(composer5, "C297@13395L24,298@13428L3119:BackdropScaffold.kt#jmzs0o");
                if ((i3222222 & 11) != 2 || !composer5.getSkipping()) {
                    composer5.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(composer5, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    composer5.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                    Object rememberedValue2 = composer5.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer5));
                        composer5.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composer5.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    composer5.endReplaceableGroup();
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.this, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = composableLambda32222;
                    Function1<Constraints, Constraints> function1222222 = function122222;
                    final float f12 = mo336toPx0680j_4222222;
                    final boolean z12 = z6;
                    final boolean z13 = z7;
                    final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState2;
                    final float f13 = mo336toPx0680j_432222;
                    final int i33 = i3022222;
                    final Shape shape7 = shape622222;
                    final long j22 = j2022222;
                    final long j23 = j13;
                    final float f14 = f6;
                    final int i34 = i3122222;
                    final float f15 = f1122222;
                    final float f16 = f1022222;
                    final Function2<? super Composer, ? super Integer, Unit> function22 = frontLayerContent;
                    final long j24 = j2122222;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36 = function3522222;
                    BackdropScaffoldKt.BackdropStack(fillMaxSize$default, function2, function1222222, ComposableLambdaKt.composableLambda(composer5, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f17, Composer composer6, Integer num) {
                            m1246invokejYbf7pk(constraints.getValue(), f17.floatValue(), composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                        public final void m1246invokejYbf7pk(long j25, float f17, Composer composer6, int i35) {
                            int i36;
                            Modifier.Companion companion2;
                            Modifier m1530swipeablepPrIpRY;
                            float m4440constructorimpl;
                            ComposerKt.sourceInformation(composer6, "CP(1:c#ui.unit.Constraints)344@15194L57,342@15132L942,366@16117L420:BackdropScaffold.kt#jmzs0o");
                            if ((i35 & 14) == 0) {
                                i36 = i35 | (composer6.changed(j25) ? 4 : 2);
                            } else {
                                i36 = i35;
                            }
                            if ((i35 & 112) == 0) {
                                i36 |= composer6.changed(f17) ? 32 : 16;
                            }
                            if ((i36 & 731) != 146 || !composer6.getSkipping()) {
                                float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j25);
                                float f18 = m4395getMaxHeightimpl - f12;
                                if (z12) {
                                    f18 = Math.min(f18, f17);
                                }
                                float f19 = f18;
                                if (z13) {
                                    companion2 = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState5.getNestedScrollConnection(), null, 2, null);
                                } else {
                                    companion2 = Modifier.INSTANCE;
                                }
                                m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE.then(companion2), backdropScaffoldState5, r17, Orientation.Vertical, (r26 & 8) != 0 ? true : z13, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                    }
                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(f13), BackdropValue.Concealed), TuplesKt.to(Float.valueOf(f19), BackdropValue.Revealed)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(m1530swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                        if (BackdropScaffoldState.this.isConcealed()) {
                                            final BackdropScaffoldState backdropScaffoldState7 = BackdropScaffoldState.this;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00371(BackdropScaffoldState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00371(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00371> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new C00371(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                            }, 1, null);
                                        } else {
                                            final BackdropScaffoldState backdropScaffoldState8 = BackdropScaffoldState.this;
                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                            SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (BackdropScaffoldState.this.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(BackdropScaffoldState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                            }, 1, null);
                                        }
                                    }
                                }, 1, null);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                composer6.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer6, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean changed2 = composer6.changed(backdropScaffoldState7);
                                Object rememberedValue3 = composer6.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                            return IntOffset.m4559boximpl(m1247invokeBjo55l4(density));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m1247invokeBjo55l4(Density offset) {
                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            return IntOffsetKt.IntOffset(0, MathKt.roundToInt(BackdropScaffoldState.this.getOffset().getValue().floatValue()));
                                        }
                                    };
                                    composer6.updateRememberedValue(rememberedValue3);
                                }
                                composer6.endReplaceableGroup();
                                Modifier then = OffsetKt.offset(companion3, (Function1) rememberedValue3).then(semantics$default);
                                Shape shape8 = shape7;
                                long j26 = j22;
                                long j27 = j23;
                                float f20 = f14;
                                final float f21 = f16;
                                final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                                final int i37 = i33;
                                final long j28 = j24;
                                final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState5;
                                final int i38 = i34;
                                final boolean z14 = z13;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                ComposableLambda composableLambda322222 = ComposableLambdaKt.composableLambda(composer6, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                        invoke(composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer7, int i39) {
                                        ComposerKt.sourceInformation(composer7, "C351@15517L543:BackdropScaffold.kt#jmzs0o");
                                        if ((i39 & 11) != 2 || !composer7.getSkipping()) {
                                            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                            Function2<Composer, Integer, Unit> function24 = function23;
                                            int i40 = i37;
                                            long j29 = j28;
                                            final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                            int i41 = i38;
                                            final boolean z15 = z14;
                                            final CoroutineScope coroutineScope4 = coroutineScope3;
                                            composer7.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                            composer7.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity322222 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume322222 = composer7.consume(localDensity322222);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            Density density = (Density) consume322222;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer7.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer7.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                            if (!(composer7.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor);
                                            } else {
                                                composer7.useNode();
                                            }
                                            composer7.disableReusing();
                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer7.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                            composer7.startReplaceableGroup(2058660585);
                                            composer7.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer7.startReplaceableGroup(-1889954677);
                                            ComposerKt.sourceInformation(composer7, "C352@15582L19,353@15622L420:BackdropScaffold.kt#jmzs0o");
                                            function24.invoke(composer7, Integer.valueOf((i40 >> 6) & 14));
                                            BackdropScaffoldKt.m1242Scrim3JVO9M(j29, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                    if (z15 && backdropScaffoldState9.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState9, null), 3, null);
                                                    }
                                                }

                                                /* compiled from: BackdropScaffold.kt */
                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$scaffoldState = backdropScaffoldState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                            }, backdropScaffoldState9.getTargetValue() == BackdropValue.Revealed, composer7, (i41 >> 18) & 14);
                                            composer7.endReplaceableGroup();
                                            composer7.endReplaceableGroup();
                                            composer7.endReplaceableGroup();
                                            composer7.endNode();
                                            composer7.endReplaceableGroup();
                                            composer7.endReplaceableGroup();
                                            return;
                                        }
                                        composer7.skipToGroupEnd();
                                    }
                                });
                                int i39 = i34;
                                SurfaceKt.m1520SurfaceFjzlyU(then, shape8, j26, j27, null, f20, composableLambda322222, composer6, ((i39 << 6) & 458752) | ((i39 >> 3) & 112) | 1572864 | ((i39 >> 6) & 896) | ((i39 >> 6) & 7168), 16);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                if (backdropScaffoldState5.isRevealed() && f19 == m4395getMaxHeightimpl - f12) {
                                    m4440constructorimpl = f15;
                                } else {
                                    m4440constructorimpl = Dp.m4440constructorimpl(0);
                                }
                                Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, m4440constructorimpl, 7, null);
                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                Function3<SnackbarHostState, Composer, Integer, Unit> function37 = function36;
                                BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState5;
                                int i40 = i34;
                                composer6.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer6, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                composer6.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity322222 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume322222 = composer6.consume(localDensity322222);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                Density density = (Density) consume322222;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer6.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer6.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                if (!(composer6.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor);
                                } else {
                                    composer6.useNode();
                                }
                                composer6.disableReusing();
                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer6);
                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer6.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                composer6.startReplaceableGroup(2058660585);
                                composer6.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer6, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer6.startReplaceableGroup(1815906203);
                                ComposerKt.sourceInformation(composer6, "C375@16478L45:BackdropScaffold.kt#jmzs0o");
                                function37.invoke(backdropScaffoldState9.getSnackbarHostState(), composer6, Integer.valueOf((i40 >> 18) & 112));
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                                composer6.endNode();
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                                return;
                            }
                            composer6.skipToGroupEnd();
                        }
                    }), composer5, 3120);
                    return;
                }
                composer5.skipToGroupEnd();
            }
        });
        int i3222222 = i3122222 << 6;
        SurfaceKt.m1520SurfaceFjzlyU(null, null, j8, j7, null, 0.0f, composableLambda222222, composer422222, (i3222222 & 7168) | (i3222222 & 896) | 1572864, 51);
        composer3 = composer422222;
        modifier3 = modifier522222;
        f7 = f6;
        f8 = f1122222;
        function34 = function3522222;
        z8 = z1122222;
        shape5 = shape622222;
        j14 = j2122222;
        z9 = z6;
        backdropScaffoldState3 = backdropScaffoldState2;
        j15 = j13;
        f9 = f1022222;
        j16 = j7;
        j17 = j2022222;
        j18 = j8;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1242Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-92141505);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)388@16708L121,401@17118L62,397@17009L171:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (j != Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            startRestartGroup.startReplaceableGroup(1010547004);
            ComposerKt.sourceInformation(startRestartGroup, "393@16915L37");
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                BackdropScaffoldKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                companion = SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
            } else {
                companion = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
            Color m2102boximpl = Color.m2102boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m2102boximpl) | startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
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
                        float m1243Scrim_3J_VO9M$lambda4;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m1243Scrim_3J_VO9M$lambda4 = BackdropScaffoldKt.m1243Scrim_3J_VO9M$lambda4(animateFloatAsState);
                        DrawScope.m2657drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m1243Scrim_3J_VO9M$lambda4, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue2, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
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
                BackdropScaffoldKt.m1242Scrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Modifier m2275graphicsLayerpANQ8Wg;
        Modifier m2275graphicsLayerpANQ8Wg2;
        Composer startRestartGroup = composer.startRestartGroup(-950970976);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackLayerTransition)P(2)421@17840L112,*424@18002L7,429@18176L486:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(backdropValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float mo336toPx0680j_4 = ((Density) consume).mo336toPx0680j_4(AnimationSlideOffset);
            float f = 1;
            float coerceIn = RangesKt.coerceIn(m1240BackLayerTransition$lambda7(animateFloatAsState) - f, 0.0f, 1.0f);
            float coerceIn2 = RangesKt.coerceIn(f - m1240BackLayerTransition$lambda7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            int i3 = i2;
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume3;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
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
            startRestartGroup.startReplaceableGroup(2065804710);
            ComposerKt.sourceInformation(startRestartGroup, "C430@18190L226,438@18425L231:BackdropScaffold.kt#jmzs0o");
            m2275graphicsLayerpANQ8Wg = GraphicsLayerModifierKt.m2275graphicsLayerpANQ8Wg(ZIndexModifierKt.zIndex(Modifier.INSTANCE, coerceIn), (r38 & 1) != 0 ? 1.0f : 0.0f, (r38 & 2) != 0 ? 1.0f : 0.0f, (r38 & 4) == 0 ? coerceIn : 1.0f, (r38 & 8) != 0 ? 0.0f : 0.0f, (r38 & 16) != 0 ? 0.0f : (f - coerceIn) * mo336toPx0680j_4, (r38 & 32) != 0 ? 0.0f : 0.0f, (r38 & 64) != 0 ? 0.0f : 0.0f, (r38 & 128) != 0 ? 0.0f : 0.0f, (r38 & 256) == 0 ? 0.0f : 0.0f, (r38 & 512) != 0 ? 8.0f : 0.0f, (r38 & 1024) != 0 ? TransformOrigin.INSTANCE.m2503getCenterSzJe1aQ() : 0L, (r38 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : null, (r38 & 4096) != 0 ? false : false, (r38 & 8192) != 0 ? null : null, (r38 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r38 & 32768) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume5;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(localViewConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m2275graphicsLayerpANQ8Wg);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1057690836);
            ComposerKt.sourceInformation(startRestartGroup, "C436@18398L8:BackdropScaffold.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            m2275graphicsLayerpANQ8Wg2 = GraphicsLayerModifierKt.m2275graphicsLayerpANQ8Wg(ZIndexModifierKt.zIndex(Modifier.INSTANCE, coerceIn2), (r38 & 1) != 0 ? 1.0f : 0.0f, (r38 & 2) != 0 ? 1.0f : 0.0f, (r38 & 4) == 0 ? coerceIn2 : 1.0f, (r38 & 8) != 0 ? 0.0f : 0.0f, (r38 & 16) != 0 ? 0.0f : (f - coerceIn2) * (-mo336toPx0680j_4), (r38 & 32) != 0 ? 0.0f : 0.0f, (r38 & 64) != 0 ? 0.0f : 0.0f, (r38 & 128) != 0 ? 0.0f : 0.0f, (r38 & 256) == 0 ? 0.0f : 0.0f, (r38 & 512) != 0 ? 8.0f : 0.0f, (r38 & 1024) != 0 ? TransformOrigin.INSTANCE.m2503getCenterSzJe1aQ() : 0L, (r38 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : null, (r38 & 4096) != 0 ? false : false, (r38 & 8192) != 0 ? null : null, (r38 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r38 & 32768) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(localDensity4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume8;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(localLayoutDirection3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume9;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume10 = startRestartGroup.consume(localViewConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m2275graphicsLayerpANQ8Wg2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-676544093);
            ComposerKt.sourceInformation(startRestartGroup, "C444@18637L9:BackdropScaffold.kt#jmzs0o");
            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$2
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
                BackdropScaffoldKt.BackLayerTransition(BackdropValue.this, function2, function22, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i) {
        final int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1248995194);
        ComposerKt.sourceInformation(startRestartGroup, "C(BackdropStack)P(3)457@18967L890,457@18940L917:BackdropScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function4) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(function2) | startRestartGroup.changed(function1) | startRestartGroup.changed(function4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1249invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1249invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, final long j) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final Placeable mo3383measureBRTryo0 = ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose(BackdropLayers.Back, function2))).mo3383measureBRTryo0(function1.invoke(Constraints.m4384boximpl(j)).getValue());
                        final float height = mo3383measureBRTryo0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final Function4<Constraints, Float, Composer, Integer, Unit> function42 = function4;
                        final int i3 = i2;
                        List<Measurable> subcompose = SubcomposeLayout.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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
                                ComposerKt.sourceInformation(composer2, "C466@19305L40:BackdropScaffold.kt#jmzs0o");
                                if ((i4 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function42.invoke(Constraints.m4384boximpl(j), Float.valueOf(height), composer2, Integer.valueOf((i3 >> 3) & 896));
                                }
                            }
                        }));
                        ArrayList arrayList = new ArrayList(subcompose.size());
                        int size = subcompose.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(subcompose.get(i4).mo3383measureBRTryo0(j));
                        }
                        final ArrayList arrayList2 = arrayList;
                        int max = Math.max(Constraints.m4398getMinWidthimpl(j), mo3383measureBRTryo0.getWidth());
                        int max2 = Math.max(Constraints.m4397getMinHeightimpl(j), mo3383measureBRTryo0.getHeight());
                        int size2 = arrayList2.size();
                        int i5 = max;
                        int i6 = max2;
                        for (int i7 = 0; i7 < size2; i7++) {
                            Placeable placeable = (Placeable) arrayList2.get(i7);
                            i5 = Math.max(i5, placeable.getWidth());
                            i6 = Math.max(i6, placeable.getHeight());
                        }
                        return MeasureScope.layout$default(SubcomposeLayout, i5, i6, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
                                List<Placeable> list = arrayList2;
                                int size3 = list.size();
                                for (int i8 = 0; i8 < size3; i8++) {
                                    Placeable.PlacementScope.placeRelative$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) rememberedValue, startRestartGroup, i2 & 14, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$2
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

            public final void invoke(Composer composer2, int i3) {
                BackdropScaffoldKt.BackdropStack(Modifier.this, function2, function1, function4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-4, reason: not valid java name */
    public static final float m1243Scrim_3J_VO9M$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: BackLayerTransition$lambda-7, reason: not valid java name */
    private static final float m1240BackLayerTransition$lambda7(State<Float> state) {
        return state.getValue().floatValue();
    }
}
