package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aá\u0002\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012 \b\u0002\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aÈ\u0001\u0010+\u001a\u00020\u00042\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2&\u0010,\u001a\"\u0012\u0013\u0012\u00110(¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2&\u00100\u001a\"\u0012\u0013\u0012\u001101¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u000207H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a+\u0010:\u001a\u00020\r2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u0002072\b\b\u0002\u0010>\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010?\u001a;\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020B2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u0002050D2\u0014\b\u0002\u0010E\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¢\u0006\u0002\u0010F\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffoldLayout", "body", "Lkotlin/ParameterName;", "name", "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "Landroidx/compose/runtime/State;", "", "sheetState", "Landroidx/compose/material/BottomSheetState;", "BottomSheetScaffoldLayout-KCBPh4w", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILandroidx/compose/runtime/State;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "rememberBottomSheetScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m4440constructorimpl(16);

    @ExperimentalMaterialApi
    public static final BottomSheetState rememberBottomSheetState(final BottomSheetValue initialValue, final AnimationSpec<Float> animationSpec, final Function1<? super BottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetState)P(2)163@5857L371:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m1729rememberSaveable(new Object[]{animationSpec}, (Saver) BottomSheetState.INSTANCE.Saver(animationSpec, function1), (String) null, (Function0) new Function0<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BottomSheetState invoke() {
                return new BottomSheetState(BottomSheetValue.this, animationSpec, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomSheetState;
    }

    @ExperimentalMaterialApi
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(DrawerState drawerState, BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Composer composer2;
        composer.startReplaceableGroup(-1353009744);
        ComposerKt.sourceInformation(composer, "C(rememberBottomSheetScaffoldState)P(1)203@7102L39,204@7184L35,205@7264L32,207@7338L248:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            composer2 = composer;
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i2 & 4) != 0) {
            composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        composer2.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer2, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer2.changed(drawerState) | composer2.changed(bottomSheetState) | composer2.changed(snackbarHostState);
        Object rememberedValue2 = composer2.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer2.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        composer2.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0269  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    @ExperimentalMaterialApi
    /* renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1265BottomSheetScaffoldbGncdBI(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z, Shape shape, float f, long j, long j2, float f2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape2, float f3, long j3, long j4, long j5, long j6, long j7, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        final BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i7;
        int i8;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i10;
        int i11;
        int i12;
        final Shape shape3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        long j8;
        int i24;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int m1412getEnd5ygKITE;
        boolean z3;
        CornerBasedShape cornerBasedShape;
        Modifier modifier3;
        int i25;
        int i26;
        long j9;
        long j10;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        boolean z4;
        long j11;
        CornerBasedShape cornerBasedShape2;
        float f4;
        long j12;
        float f5;
        long j13;
        long j14;
        int i27;
        long j15;
        int i28;
        int i29;
        long j16;
        int i30;
        Shape shape4;
        long j17;
        long j18;
        long j19;
        int i31;
        float f6;
        float f7;
        float f8;
        Object rememberedValue;
        float mo336toPx0680j_4;
        Object rememberedValue2;
        final float f9;
        MutableState mutableState;
        final float f10;
        final MutableState mutableState2;
        ?? r3;
        Modifier.Companion companion;
        final long j20;
        final float f11;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36;
        final boolean z5;
        final long j21;
        Composer composer2;
        final float f12;
        final Shape shape5;
        final float f13;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final long j22;
        final long j23;
        final long j24;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final int i32;
        final boolean z6;
        final BottomSheetScaffoldState bottomSheetScaffoldState3;
        final long j25;
        final long j26;
        ScopeUpdateScope endRestartGroup;
        int i33;
        int i34;
        int i35;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(46422755);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)P(15,12,13,22,21,10,11:c#material.FabPosition,18,20,17:c#ui.unit.Dp,14:c#ui.graphics.Color,16:c#ui.graphics.Color,19:c#ui.unit.Dp,4,7,9,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,0:c#ui.graphics.Color,2:c#ui.graphics.Color)269@11027L34,275@11396L6,277@11527L6,278@11574L37,282@11831L6,284@11946L6,285@11994L38,286@12079L10,287@12134L6,288@12179L32,291@12282L24,*292@12348L7,293@12413L41,374@16003L713:BottomSheetScaffold.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i6 = (startRestartGroup.changed(sheetContent) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i36 = i5 & 2;
        if (i36 != 0) {
            i6 |= 48;
        } else if ((i2 & 112) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i5 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i35 = 256;
                        i6 |= i35;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i35 = 128;
                i6 |= i35;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i6 |= startRestartGroup.changed(function2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                    function33 = function3;
                } else {
                    function33 = function3;
                    if ((i2 & 57344) == 0) {
                        i6 |= startRestartGroup.changed(function33) ? 16384 : 8192;
                    }
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function23 = function22;
                } else {
                    function23 = function22;
                    if ((i2 & 458752) == 0) {
                        i6 |= startRestartGroup.changed(function23) ? 131072 : 65536;
                    }
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i12 = i11;
                    i6 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                    if ((i2 & 234881024) != 0) {
                        if ((i5 & 256) == 0) {
                            shape3 = shape;
                            if (startRestartGroup.changed(shape3)) {
                                i34 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i6 |= i34;
                            }
                        } else {
                            shape3 = shape;
                        }
                        i34 = 33554432;
                        i6 |= i34;
                    } else {
                        shape3 = shape;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= C.ENCODING_PCM_32BIT;
                    } else if ((i2 & 1879048192) == 0) {
                        i14 = i13;
                        i6 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
                        if ((i3 & 14) == 0) {
                            if ((i5 & 1024) == 0) {
                                i15 = i36;
                                if (startRestartGroup.changed(j)) {
                                    i33 = 4;
                                    i16 = i3 | i33;
                                }
                            } else {
                                i15 = i36;
                            }
                            i33 = 2;
                            i16 = i3 | i33;
                        } else {
                            i15 = i36;
                            i16 = i3;
                        }
                        if ((i3 & 112) == 0) {
                            i16 |= ((i5 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                        }
                        int i37 = i16;
                        i17 = i5 & 4096;
                        if (i17 != 0) {
                            i37 |= RendererCapabilities.MODE_SUPPORT_MASK;
                        } else if ((i3 & 896) == 0) {
                            i37 |= startRestartGroup.changed(f2) ? 256 : 128;
                            i18 = i5 & 8192;
                            if (i18 == 0) {
                                i19 = i37 | 3072;
                            } else {
                                int i38 = i37;
                                if ((i3 & 7168) == 0) {
                                    i19 = i38 | (startRestartGroup.changed(function32) ? 2048 : 1024);
                                } else {
                                    i19 = i38;
                                }
                            }
                            i20 = i5 & 16384;
                            if (i20 == 0) {
                                i19 |= 24576;
                            } else if ((i3 & 57344) == 0) {
                                i21 = i20;
                                i19 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                                if ((i3 & 458752) == 0) {
                                    i19 |= ((i5 & 32768) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                                }
                                i22 = i5 & 65536;
                                if (i22 != 0) {
                                    i19 |= 1572864;
                                } else if ((i3 & 3670016) == 0) {
                                    i19 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                                }
                                if ((i3 & 29360128) == 0) {
                                    i19 |= ((i5 & 131072) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                                }
                                if ((i3 & 234881024) == 0) {
                                    i19 |= ((i5 & 262144) == 0 && startRestartGroup.changed(j4)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                if ((i3 & 1879048192) == 0) {
                                    i19 |= ((i5 & 524288) == 0 && startRestartGroup.changed(j5)) ? 536870912 : 268435456;
                                }
                                if ((i4 & 14) == 0) {
                                    i23 = i4 | (((i5 & 1048576) == 0 && startRestartGroup.changed(j6)) ? 4 : 2);
                                } else {
                                    i23 = i4;
                                }
                                if ((i4 & 112) == 0) {
                                    j8 = j7;
                                    i23 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(j8)) ? 32 : 16;
                                } else {
                                    j8 = j7;
                                }
                                int i39 = i19;
                                int i40 = i23;
                                if ((i5 & 4194304) != 0) {
                                    i24 = i40 | RendererCapabilities.MODE_SUPPORT_MASK;
                                } else if ((i4 & 896) == 0) {
                                    i24 = i40 | (startRestartGroup.changed(content) ? 256 : 128);
                                } else {
                                    i24 = i40;
                                }
                                if ((i6 & 1533916891) == 306783378 || (i39 & 1533916891) != 306783378 || (i24 & 731) != 146 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion2 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                        if ((i5 & 4) != 0) {
                                            i6 &= -897;
                                            bottomSheetScaffoldState2 = rememberBottomSheetScaffoldState(null, null, null, startRestartGroup, 0, 7);
                                        }
                                        function24 = i7 != 0 ? null : function2;
                                        if (i8 != 0) {
                                            function33 = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1349getLambda1$material_release();
                                        }
                                        if (i9 != 0) {
                                            function23 = null;
                                        }
                                        m1412getEnd5ygKITE = i10 != 0 ? FabPosition.INSTANCE.m1412getEnd5ygKITE() : i;
                                        z3 = i12 != 0 ? true : z;
                                        if ((i5 & 256) != 0) {
                                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                            i6 &= -234881025;
                                        } else {
                                            cornerBasedShape = shape;
                                        }
                                        float m1263getSheetElevationD9Ej5fM = i14 != 0 ? BottomSheetScaffoldDefaults.INSTANCE.m1263getSheetElevationD9Ej5fM() : f;
                                        if ((i5 & 1024) != 0) {
                                            modifier3 = companion2;
                                            i25 = i39 & (-15);
                                            i26 = i24;
                                            j9 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                        } else {
                                            modifier3 = companion2;
                                            i25 = i39;
                                            i26 = i24;
                                            j9 = j;
                                        }
                                        int i41 = i26;
                                        if ((i5 & 2048) != 0) {
                                            j10 = ColorsKt.m1342contentColorForek8zF_U(j9, startRestartGroup, i25 & 14);
                                            i25 &= -113;
                                        } else {
                                            j10 = j2;
                                        }
                                        float m1264getSheetPeekHeightD9Ej5fM = i17 != 0 ? BottomSheetScaffoldDefaults.INSTANCE.m1264getSheetPeekHeightD9Ej5fM() : f2;
                                        function34 = i18 != 0 ? null : function32;
                                        z4 = i21 != 0 ? true : z2;
                                        j11 = j9;
                                        if ((i5 & 32768) != 0) {
                                            cornerBasedShape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                            i25 &= -458753;
                                        } else {
                                            cornerBasedShape2 = shape2;
                                        }
                                        float m1369getElevationD9Ej5fM = i22 != 0 ? DrawerDefaults.INSTANCE.m1369getElevationD9Ej5fM() : f3;
                                        Shape shape6 = cornerBasedShape2;
                                        if ((i5 & 131072) != 0) {
                                            f4 = m1369getElevationD9Ej5fM;
                                            j12 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                            i25 &= -29360129;
                                        } else {
                                            f4 = m1369getElevationD9Ej5fM;
                                            j12 = j3;
                                        }
                                        if ((i5 & 262144) != 0) {
                                            f5 = m1264getSheetPeekHeightD9Ej5fM;
                                            j13 = ColorsKt.m1342contentColorForek8zF_U(j12, startRestartGroup, (i25 >> 21) & 14);
                                            i25 &= -234881025;
                                        } else {
                                            f5 = m1264getSheetPeekHeightD9Ej5fM;
                                            j13 = j4;
                                        }
                                        if ((i5 & 524288) != 0) {
                                            j14 = j12;
                                            i27 = 6;
                                            j15 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                            i28 = i25 & (-1879048193);
                                        } else {
                                            j14 = j12;
                                            i27 = 6;
                                            j15 = j5;
                                            i28 = i25;
                                        }
                                        long j27 = j15;
                                        if ((i5 & 1048576) != 0) {
                                            j16 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i27).m1317getBackground0d7_KjU();
                                            i29 = i41 & (-15);
                                        } else {
                                            i29 = i41;
                                            j16 = j6;
                                        }
                                        if ((i5 & 2097152) != 0) {
                                            int i42 = i29;
                                            long m1342contentColorForek8zF_U = ColorsKt.m1342contentColorForek8zF_U(j16, startRestartGroup, i42 & 14);
                                            j19 = j16;
                                            i30 = i42 & (-113);
                                            i31 = i6;
                                            f6 = m1263getSheetElevationD9Ej5fM;
                                            j18 = m1342contentColorForek8zF_U;
                                            modifier2 = modifier3;
                                            shape4 = shape6;
                                            f7 = f4;
                                            f8 = f5;
                                            j17 = j27;
                                        } else {
                                            i30 = i29;
                                            shape4 = shape6;
                                            j17 = j27;
                                            j18 = j7;
                                            j19 = j16;
                                            i31 = i6;
                                            f6 = m1263getSheetElevationD9Ej5fM;
                                            modifier2 = modifier3;
                                            f7 = f4;
                                            f8 = f5;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 4) != 0) {
                                            i6 &= -897;
                                        }
                                        if ((i5 & 256) != 0) {
                                            i6 &= -234881025;
                                        }
                                        int i43 = (i5 & 1024) != 0 ? i39 & (-15) : i39;
                                        if ((i5 & 2048) != 0) {
                                            i43 &= -113;
                                        }
                                        if ((32768 & i5) != 0) {
                                            i43 &= -458753;
                                        }
                                        if ((i5 & 131072) != 0) {
                                            i43 &= -29360129;
                                        }
                                        if ((262144 & i5) != 0) {
                                            i43 &= -234881025;
                                        }
                                        if ((i5 & 524288) != 0) {
                                            i43 &= -1879048193;
                                        }
                                        if ((i5 & 1048576) != 0) {
                                            i24 &= -15;
                                        }
                                        if ((2097152 & i5) != 0) {
                                            i24 &= -113;
                                        }
                                        j11 = j;
                                        j10 = j2;
                                        function34 = function32;
                                        z4 = z2;
                                        shape4 = shape2;
                                        j14 = j3;
                                        j13 = j4;
                                        j17 = j5;
                                        j19 = j6;
                                        i28 = i43;
                                        i30 = i24;
                                        i31 = i6;
                                        j18 = j8;
                                        cornerBasedShape = shape3;
                                        function24 = function2;
                                        m1412getEnd5ygKITE = i;
                                        z3 = z;
                                        f6 = f;
                                        f8 = f2;
                                        f7 = f3;
                                    }
                                    startRestartGroup.endDefaults();
                                    final float f14 = f6;
                                    startRestartGroup.startReplaceableGroup(773894976);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    final Shape shape7 = shape4;
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                    startRestartGroup.endReplaceableGroup();
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    mo336toPx0680j_4 = ((Density) consume).mo336toPx0680j_4(f8);
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        f9 = f8;
                                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    } else {
                                        f9 = f8;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableState = (MutableState) rememberedValue2;
                                    if (!Intrinsics.areEqual(mo336toPx0680j_4, m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                                        f10 = mo336toPx0680j_4;
                                        mutableState2 = mutableState;
                                        r3 = 1;
                                        companion = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1
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
                                                if (BottomSheetScaffoldState.this.getBottomSheetState().isCollapsed()) {
                                                    final BottomSheetScaffoldState bottomSheetScaffoldState4 = BottomSheetScaffoldState.this;
                                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00381(BottomSheetScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BottomSheetScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        static final class C00381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            C00381(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super C00381> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = bottomSheetScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new C00381(this.$scaffoldState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((C00381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$scaffoldState.getBottomSheetState().expand(this) == coroutine_suspended) {
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
                                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = BottomSheetScaffoldState.this;
                                                    final CoroutineScope coroutineScope3 = coroutineScope;
                                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(BottomSheetScaffoldState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: BottomSheetScaffold.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$scaffoldState = bottomSheetScaffoldState;
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
                                                                    if (this.$scaffoldState.getBottomSheetState().collapse(this) == coroutine_suspended) {
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
                                    } else {
                                        f10 = mo336toPx0680j_4;
                                        mutableState2 = mutableState;
                                        r3 = 1;
                                        companion = Modifier.INSTANCE;
                                    }
                                    final Modifier modifier5 = companion;
                                    final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
                                    final int i44 = m1412getEnd5ygKITE;
                                    final boolean z7 = z3;
                                    final Shape shape8 = cornerBasedShape;
                                    final Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function37 = function33;
                                    final int i45 = i28;
                                    final long j28 = j10;
                                    final long j29 = j11;
                                    final int i46 = i30;
                                    final int i47 = i31;
                                    final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i48) {
                                            ComposerKt.sourceInformation(composer3, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i48 & 11) != 2 || !composer3.getSkipping()) {
                                                State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                                BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                                Function2<Composer, Integer, Unit> function29 = function27;
                                                Function3<PaddingValues, Composer, Integer, Unit> function38 = content;
                                                final float f15 = f10;
                                                final BottomSheetScaffoldState bottomSheetScaffoldState5 = BottomSheetScaffoldState.this;
                                                final boolean z8 = z7;
                                                final Modifier modifier6 = modifier5;
                                                final float f16 = f9;
                                                final MutableState<Float> mutableState3 = mutableState2;
                                                final Shape shape9 = shape8;
                                                final long j30 = j29;
                                                final long j31 = j28;
                                                final float f17 = f14;
                                                final int i49 = i47;
                                                final int i50 = i45;
                                                final Function3<ColumnScope, Composer, Integer, Unit> function39 = sheetContent;
                                                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer3, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer4, Integer num2) {
                                                        invoke(num.intValue(), composer4, num2.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(int i51, Composer composer4, int i52) {
                                                        int i53;
                                                        Float m1267BottomSheetScaffold_bGncdBI$lambda4;
                                                        Float m1267BottomSheetScaffold_bGncdBI$lambda42;
                                                        Map mapOf;
                                                        Modifier.Companion m1530swipeablepPrIpRY;
                                                        ComposerKt.sourceInformation(composer4, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                        if ((i52 & 14) == 0) {
                                                            i53 = i52 | (composer4.changed(i51) ? 4 : 2);
                                                        } else {
                                                            i53 = i52;
                                                        }
                                                        if ((i53 & 91) != 18 || !composer4.getSkipping()) {
                                                            m1267BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                            if (m1267BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                                m1530swipeablepPrIpRY = Modifier.INSTANCE;
                                                            } else {
                                                                if (MathKt.roundToInt(m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f15)) {
                                                                    float f18 = i51;
                                                                    m1267BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                                    Intrinsics.checkNotNull(m1267BottomSheetScaffold_bGncdBI$lambda42);
                                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f18 - m1267BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f18 - f15), BottomSheetValue.Collapsed));
                                                                } else {
                                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i51 - m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                                }
                                                                m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState5.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z8, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final FixedThreshold invoke(T t, T t2) {
                                                                        return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                                    }
                                                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                                            }
                                                            Modifier m625requiredHeightInVpY3zN4$default = SizeKt.m625requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState5.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1530swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f16, 0.0f, 2, null);
                                                            final MutableState<Float> mutableState4 = mutableState3;
                                                            composer4.startReplaceableGroup(1157296644);
                                                            ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                            boolean changed = composer4.changed(mutableState4);
                                                            Object rememberedValue3 = composer4.rememberedValue();
                                                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                                        m1272invokeozmzZPI(intSize.getPackedValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                    public final void m1272invokeozmzZPI(long j32) {
                                                                        mutableState4.setValue(Float.valueOf(IntSize.m4609getHeightimpl(j32)));
                                                                    }
                                                                };
                                                                composer4.updateRememberedValue(rememberedValue3);
                                                            }
                                                            composer4.endReplaceableGroup();
                                                            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m625requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                            Shape shape10 = shape9;
                                                            long j32 = j30;
                                                            long j33 = j31;
                                                            float f19 = f17;
                                                            final Function3<ColumnScope, Composer, Integer, Unit> function310 = function39;
                                                            final int i54 = i49;
                                                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
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

                                                                public final void invoke(Composer composer5, int i55) {
                                                                    ComposerKt.sourceInformation(composer5, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                                    if ((i55 & 11) == 2 && composer5.getSkipping()) {
                                                                        composer5.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    Function3<ColumnScope, Composer, Integer, Unit> function311 = function310;
                                                                    int i56 = (i54 << 9) & 7168;
                                                                    composer5.startReplaceableGroup(-483455358);
                                                                    ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                                    composer5.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume2 = composer5.consume(localDensity2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    Density density = (Density) consume2;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume3 = composer5.consume(localLayoutDirection);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume4 = composer5.consume(localViewConfiguration);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    composer5.disableReusing();
                                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer5);
                                                                    Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer5.enableReusing();
                                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                                                    composer5.startReplaceableGroup(2058660585);
                                                                    composer5.startReplaceableGroup(-1163856341);
                                                                    ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                                    function311.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i56 >> 6) & 112) | 6));
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endNode();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                }
                                                            });
                                                            int i55 = i49;
                                                            int i56 = i50;
                                                            SurfaceKt.m1520SurfaceFjzlyU(onSizeChanged, shape10, j32, j33, null, f19, composableLambda3, composer4, ((i55 >> 12) & 458752) | ((i55 >> 21) & 112) | 1572864 | ((i56 << 6) & 896) | ((i56 << 6) & 7168), 16);
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                });
                                                Function2<Composer, Integer, Unit> function210 = function28;
                                                final Function3<SnackbarHostState, Composer, Integer, Unit> function310 = function37;
                                                final BottomSheetScaffoldState bottomSheetScaffoldState6 = BottomSheetScaffoldState.this;
                                                final int i51 = i47;
                                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                                    public final void invoke(Composer composer4, int i52) {
                                                        ComposerKt.sourceInformation(composer4, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                        if ((i52 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                        } else {
                                                            function310.invoke(bottomSheetScaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i51 >> 9) & 112));
                                                        }
                                                    }
                                                });
                                                float f18 = f9;
                                                int i52 = i44;
                                                int i53 = i47;
                                                BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function29, function38, composableLambda2, function210, composableLambda3, f18, i52, offset, bottomSheetState, composer3, ((i53 >> 9) & 14) | 24960 | ((i46 >> 3) & 112) | ((i53 >> 6) & 7168) | ((i45 << 9) & 458752) | (i53 & 3670016));
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    });
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, r3, null);
                                    final float f15 = f7;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState2;
                                    final int i48 = i28;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = function34;
                                    final boolean z8 = z4;
                                    final long j30 = j17;
                                    final long j31 = j13;
                                    final long j32 = j14;
                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i49) {
                                            ComposerKt.sourceInformation(composer3, "C:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i49 & 11) != 2 || !composer3.getSkipping()) {
                                                if (function38 == null) {
                                                    composer3.startReplaceableGroup(-249544858);
                                                    ComposerKt.sourceInformation(composer3, "381@16183L7");
                                                    composableLambda.invoke(composer3, 6);
                                                    composer3.endReplaceableGroup();
                                                    return;
                                                }
                                                composer3.startReplaceableGroup(-249544821);
                                                ComposerKt.sourceInformation(composer3, "383@16220L480");
                                                Function3<ColumnScope, Composer, Integer, Unit> function39 = function38;
                                                DrawerState drawerState = bottomSheetScaffoldState5.getDrawerState();
                                                boolean z9 = z8;
                                                Shape shape9 = shape7;
                                                float f16 = f15;
                                                long j33 = j32;
                                                long j34 = j31;
                                                long j35 = j30;
                                                Function2<Composer, Integer, Unit> function29 = composableLambda;
                                                int i50 = i48;
                                                DrawerKt.m1373ModalDrawerGs3lGvM(function39, null, drawerState, z9, shape9, f16, j33, j34, j35, function29, composer3, ((i50 >> 3) & 7168) | ((i50 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i50 >> 3) & 57344) | ((i50 >> 3) & 458752) | ((i50 >> 3) & 3670016) | ((i50 >> 3) & 29360128) | ((i50 >> 3) & 234881024), 2);
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    });
                                    int i49 = i46 << 6;
                                    long j33 = j19;
                                    long j34 = j18;
                                    SurfaceKt.m1520SurfaceFjzlyU(fillMaxSize$default, null, j33, j34, null, 0.0f, composableLambda2, startRestartGroup, (i49 & 7168) | (i49 & 896) | 1572864, 50);
                                    j20 = j33;
                                    f11 = f14;
                                    function35 = function37;
                                    function36 = function34;
                                    z5 = z4;
                                    j21 = j13;
                                    composer2 = startRestartGroup;
                                    f12 = f9;
                                    shape5 = shape7;
                                    f13 = f7;
                                    modifier4 = modifier2;
                                    function25 = function23;
                                    j22 = j17;
                                    j23 = j14;
                                    j24 = j34;
                                    function26 = function24;
                                    i32 = m1412getEnd5ygKITE;
                                    z6 = z3;
                                    shape3 = cornerBasedShape;
                                    bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                    j25 = j10;
                                    j26 = j11;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    function26 = function2;
                                    function36 = function32;
                                    z5 = z2;
                                    shape5 = shape2;
                                    f13 = f3;
                                    j23 = j3;
                                    j21 = j4;
                                    j22 = j5;
                                    j20 = j6;
                                    j24 = j8;
                                    composer2 = startRestartGroup;
                                    modifier4 = modifier2;
                                    function25 = function23;
                                    bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                    function35 = function33;
                                    i32 = i;
                                    z6 = z;
                                    f11 = f;
                                    j26 = j;
                                    j25 = j2;
                                    f12 = f2;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i50) {
                                        BottomSheetScaffoldKt.m1265BottomSheetScaffoldbGncdBI(sheetContent, modifier4, bottomSheetScaffoldState3, function26, function35, function25, i32, z6, shape3, f11, j26, j25, f12, function36, z5, shape5, f13, j23, j21, j22, j20, j24, content, composer3, i2 | 1, i3, i4, i5);
                                    }
                                });
                                return;
                            }
                            i21 = i20;
                            if ((i3 & 458752) == 0) {
                            }
                            i22 = i5 & 65536;
                            if (i22 != 0) {
                            }
                            if ((i3 & 29360128) == 0) {
                            }
                            if ((i3 & 234881024) == 0) {
                            }
                            if ((i3 & 1879048192) == 0) {
                            }
                            if ((i4 & 14) == 0) {
                            }
                            if ((i4 & 112) == 0) {
                            }
                            int i392 = i19;
                            int i402 = i23;
                            if ((i5 & 4194304) != 0) {
                            }
                            if ((i6 & 1533916891) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if ((i5 & 256) != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if ((i5 & 1024) != 0) {
                            }
                            int i412 = i26;
                            if ((i5 & 2048) != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            j11 = j9;
                            if ((i5 & 32768) != 0) {
                            }
                            if (i22 != 0) {
                            }
                            Shape shape62 = cornerBasedShape2;
                            if ((i5 & 131072) != 0) {
                            }
                            if ((i5 & 262144) != 0) {
                            }
                            if ((i5 & 524288) != 0) {
                            }
                            long j272 = j15;
                            if ((i5 & 1048576) != 0) {
                            }
                            if ((i5 & 2097152) != 0) {
                            }
                            startRestartGroup.endDefaults();
                            final float f142 = f6;
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            final Shape shape72 = shape4;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            mo336toPx0680j_4 = ((Density) consume2).mo336toPx0680j_4(f8);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) rememberedValue2;
                            if (!Intrinsics.areEqual(mo336toPx0680j_4, m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                            }
                            final Modifier modifier52 = companion;
                            final Function2<? super Composer, ? super Integer, Unit> function272 = function24;
                            final int i442 = m1412getEnd5ygKITE;
                            final boolean z72 = z3;
                            final Shape shape82 = cornerBasedShape;
                            final Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                            final BottomSheetScaffoldState bottomSheetScaffoldState42 = bottomSheetScaffoldState2;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function372 = function33;
                            final int i452 = i28;
                            final long j282 = j10;
                            final long j292 = j11;
                            final int i462 = i30;
                            final int i472 = i31;
                            final Function2<? super Composer, ? super Integer, Unit> composableLambda3 = ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i482) {
                                    ComposerKt.sourceInformation(composer3, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i482 & 11) != 2 || !composer3.getSkipping()) {
                                        State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                        BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                        Function2<Composer, Integer, Unit> function29 = function272;
                                        Function3<PaddingValues, Composer, Integer, Unit> function382 = content;
                                        final float f152 = f10;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                        final boolean z82 = z72;
                                        final Modifier modifier6 = modifier52;
                                        final float f16 = f9;
                                        final MutableState<Float> mutableState3 = mutableState2;
                                        final Shape shape9 = shape82;
                                        final long j302 = j292;
                                        final long j312 = j282;
                                        final float f17 = f142;
                                        final int i492 = i472;
                                        final int i50 = i452;
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = sheetContent;
                                        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer3, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer4, Integer num2) {
                                                invoke(num.intValue(), composer4, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(int i51, Composer composer4, int i52) {
                                                int i53;
                                                Float m1267BottomSheetScaffold_bGncdBI$lambda4;
                                                Float m1267BottomSheetScaffold_bGncdBI$lambda42;
                                                Map mapOf;
                                                Modifier.Companion m1530swipeablepPrIpRY;
                                                ComposerKt.sourceInformation(composer4, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i52 & 14) == 0) {
                                                    i53 = i52 | (composer4.changed(i51) ? 4 : 2);
                                                } else {
                                                    i53 = i52;
                                                }
                                                if ((i53 & 91) != 18 || !composer4.getSkipping()) {
                                                    m1267BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                    if (m1267BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                        m1530swipeablepPrIpRY = Modifier.INSTANCE;
                                                    } else {
                                                        if (MathKt.roundToInt(m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f152)) {
                                                            float f18 = i51;
                                                            m1267BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                            Intrinsics.checkNotNull(m1267BottomSheetScaffold_bGncdBI$lambda42);
                                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f18 - m1267BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f18 - f152), BottomSheetValue.Collapsed));
                                                        } else {
                                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i51 - m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                        }
                                                        m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState52.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z82, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final FixedThreshold invoke(T t, T t2) {
                                                                return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                            }
                                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                                    }
                                                    Modifier m625requiredHeightInVpY3zN4$default = SizeKt.m625requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState52.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1530swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f16, 0.0f, 2, null);
                                                    final MutableState<Float> mutableState4 = mutableState3;
                                                    composer4.startReplaceableGroup(1157296644);
                                                    ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                    boolean changed = composer4.changed(mutableState4);
                                                    Object rememberedValue3 = composer4.rememberedValue();
                                                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                                m1272invokeozmzZPI(intSize.getPackedValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                            public final void m1272invokeozmzZPI(long j322) {
                                                                mutableState4.setValue(Float.valueOf(IntSize.m4609getHeightimpl(j322)));
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(rememberedValue3);
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m625requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                    Shape shape10 = shape9;
                                                    long j322 = j302;
                                                    long j332 = j312;
                                                    float f19 = f17;
                                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function310 = function39;
                                                    final int i54 = i492;
                                                    ComposableLambda composableLambda32 = ComposableLambdaKt.composableLambda(composer4, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
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

                                                        public final void invoke(Composer composer5, int i55) {
                                                            ComposerKt.sourceInformation(composer5, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                            if ((i55 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            Function3<ColumnScope, Composer, Integer, Unit> function311 = function310;
                                                            int i56 = (i54 << 9) & 7168;
                                                            composer5.startReplaceableGroup(-483455358);
                                                            ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume22 = composer5.consume(localDensity22);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            Density density = (Density) consume22;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume3 = composer5.consume(localLayoutDirection);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume4 = composer5.consume(localViewConfiguration);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            composer5.disableReusing();
                                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer5);
                                                            Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-1163856341);
                                                            ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                            function311.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i56 >> 6) & 112) | 6));
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                        }
                                                    });
                                                    int i55 = i492;
                                                    int i56 = i50;
                                                    SurfaceKt.m1520SurfaceFjzlyU(onSizeChanged, shape10, j322, j332, null, f19, composableLambda32, composer4, ((i55 >> 12) & 458752) | ((i55 >> 21) & 112) | 1572864 | ((i56 << 6) & 896) | ((i56 << 6) & 7168), 16);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        });
                                        Function2<Composer, Integer, Unit> function210 = function282;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function372;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState6 = BottomSheetScaffoldState.this;
                                        final int i51 = i472;
                                        ComposableLambda composableLambda32 = ComposableLambdaKt.composableLambda(composer3, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                            public final void invoke(Composer composer4, int i52) {
                                                ComposerKt.sourceInformation(composer4, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i52 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    function310.invoke(bottomSheetScaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i51 >> 9) & 112));
                                                }
                                            }
                                        });
                                        float f18 = f9;
                                        int i52 = i442;
                                        int i53 = i472;
                                        BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function29, function382, composableLambda22, function210, composableLambda32, f18, i52, offset, bottomSheetState, composer3, ((i53 >> 9) & 14) | 24960 | ((i462 >> 3) & 112) | ((i53 >> 6) & 7168) | ((i452 << 9) & 458752) | (i53 & 3670016));
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, r3, null);
                            final float f152 = f7;
                            final BottomSheetScaffoldState bottomSheetScaffoldState52 = bottomSheetScaffoldState2;
                            final int i482 = i28;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function382 = function34;
                            final boolean z82 = z4;
                            final long j302 = j17;
                            final long j312 = j13;
                            final long j322 = j14;
                            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i492) {
                                    ComposerKt.sourceInformation(composer3, "C:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i492 & 11) != 2 || !composer3.getSkipping()) {
                                        if (function382 == null) {
                                            composer3.startReplaceableGroup(-249544858);
                                            ComposerKt.sourceInformation(composer3, "381@16183L7");
                                            composableLambda3.invoke(composer3, 6);
                                            composer3.endReplaceableGroup();
                                            return;
                                        }
                                        composer3.startReplaceableGroup(-249544821);
                                        ComposerKt.sourceInformation(composer3, "383@16220L480");
                                        Function3<ColumnScope, Composer, Integer, Unit> function39 = function382;
                                        DrawerState drawerState = bottomSheetScaffoldState52.getDrawerState();
                                        boolean z9 = z82;
                                        Shape shape9 = shape72;
                                        float f16 = f152;
                                        long j332 = j322;
                                        long j342 = j312;
                                        long j35 = j302;
                                        Function2<Composer, Integer, Unit> function29 = composableLambda3;
                                        int i50 = i482;
                                        DrawerKt.m1373ModalDrawerGs3lGvM(function39, null, drawerState, z9, shape9, f16, j332, j342, j35, function29, composer3, ((i50 >> 3) & 7168) | ((i50 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i50 >> 3) & 57344) | ((i50 >> 3) & 458752) | ((i50 >> 3) & 3670016) | ((i50 >> 3) & 29360128) | ((i50 >> 3) & 234881024), 2);
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            int i492 = i462 << 6;
                            long j332 = j19;
                            long j342 = j18;
                            SurfaceKt.m1520SurfaceFjzlyU(fillMaxSize$default2, null, j332, j342, null, 0.0f, composableLambda22, startRestartGroup, (i492 & 7168) | (i492 & 896) | 1572864, 50);
                            j20 = j332;
                            f11 = f142;
                            function35 = function372;
                            function36 = function34;
                            z5 = z4;
                            j21 = j13;
                            composer2 = startRestartGroup;
                            f12 = f9;
                            shape5 = shape72;
                            f13 = f7;
                            modifier4 = modifier2;
                            function25 = function23;
                            j22 = j17;
                            j23 = j14;
                            j24 = j342;
                            function26 = function24;
                            i32 = m1412getEnd5ygKITE;
                            z6 = z3;
                            shape3 = cornerBasedShape;
                            bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                            j25 = j10;
                            j26 = j11;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i18 = i5 & 8192;
                        if (i18 == 0) {
                        }
                        i20 = i5 & 16384;
                        if (i20 == 0) {
                        }
                        i21 = i20;
                        if ((i3 & 458752) == 0) {
                        }
                        i22 = i5 & 65536;
                        if (i22 != 0) {
                        }
                        if ((i3 & 29360128) == 0) {
                        }
                        if ((i3 & 234881024) == 0) {
                        }
                        if ((i3 & 1879048192) == 0) {
                        }
                        if ((i4 & 14) == 0) {
                        }
                        if ((i4 & 112) == 0) {
                        }
                        int i3922 = i19;
                        int i4022 = i23;
                        if ((i5 & 4194304) != 0) {
                        }
                        if ((i6 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if ((i5 & 4) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if ((i5 & 256) != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if ((i5 & 1024) != 0) {
                        }
                        int i4122 = i26;
                        if ((i5 & 2048) != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        j11 = j9;
                        if ((i5 & 32768) != 0) {
                        }
                        if (i22 != 0) {
                        }
                        Shape shape622 = cornerBasedShape2;
                        if ((i5 & 131072) != 0) {
                        }
                        if ((i5 & 262144) != 0) {
                        }
                        if ((i5 & 524288) != 0) {
                        }
                        long j2722 = j15;
                        if ((i5 & 1048576) != 0) {
                        }
                        if ((i5 & 2097152) != 0) {
                        }
                        startRestartGroup.endDefaults();
                        final float f1422 = f6;
                        startRestartGroup.startReplaceableGroup(773894976);
                        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        final Shape shape722 = shape4;
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        mo336toPx0680j_4 = ((Density) consume22).mo336toPx0680j_4(f8);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) rememberedValue2;
                        if (!Intrinsics.areEqual(mo336toPx0680j_4, m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                        }
                        final Modifier modifier522 = companion;
                        final Function2<? super Composer, ? super Integer, Unit> function2722 = function24;
                        final int i4422 = m1412getEnd5ygKITE;
                        final boolean z722 = z3;
                        final Shape shape822 = cornerBasedShape;
                        final Function2<? super Composer, ? super Integer, Unit> function2822 = function23;
                        final BottomSheetScaffoldState bottomSheetScaffoldState422 = bottomSheetScaffoldState2;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3722 = function33;
                        final int i4522 = i28;
                        final long j2822 = j10;
                        final long j2922 = j11;
                        final int i4622 = i30;
                        final int i4722 = i31;
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda32 = ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4822) {
                                ComposerKt.sourceInformation(composer3, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                                if ((i4822 & 11) != 2 || !composer3.getSkipping()) {
                                    State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                    Function2<Composer, Integer, Unit> function29 = function2722;
                                    Function3<PaddingValues, Composer, Integer, Unit> function3822 = content;
                                    final float f1522 = f10;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState522 = BottomSheetScaffoldState.this;
                                    final boolean z822 = z722;
                                    final Modifier modifier6 = modifier522;
                                    final float f16 = f9;
                                    final MutableState<Float> mutableState3 = mutableState2;
                                    final Shape shape9 = shape822;
                                    final long j3022 = j2922;
                                    final long j3122 = j2822;
                                    final float f17 = f1422;
                                    final int i4922 = i4722;
                                    final int i50 = i4522;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = sheetContent;
                                    ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer3, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer4, Integer num2) {
                                            invoke(num.intValue(), composer4, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int i51, Composer composer4, int i52) {
                                            int i53;
                                            Float m1267BottomSheetScaffold_bGncdBI$lambda4;
                                            Float m1267BottomSheetScaffold_bGncdBI$lambda42;
                                            Map mapOf;
                                            Modifier.Companion m1530swipeablepPrIpRY;
                                            ComposerKt.sourceInformation(composer4, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i52 & 14) == 0) {
                                                i53 = i52 | (composer4.changed(i51) ? 4 : 2);
                                            } else {
                                                i53 = i52;
                                            }
                                            if ((i53 & 91) != 18 || !composer4.getSkipping()) {
                                                m1267BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                if (m1267BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                    m1530swipeablepPrIpRY = Modifier.INSTANCE;
                                                } else {
                                                    if (MathKt.roundToInt(m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f1522)) {
                                                        float f18 = i51;
                                                        m1267BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                        Intrinsics.checkNotNull(m1267BottomSheetScaffold_bGncdBI$lambda42);
                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f18 - m1267BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f18 - f1522), BottomSheetValue.Collapsed));
                                                    } else {
                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i51 - m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                    }
                                                    m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState522.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z822, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final FixedThreshold invoke(T t, T t2) {
                                                            return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                        }
                                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                                }
                                                Modifier m625requiredHeightInVpY3zN4$default = SizeKt.m625requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState522.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1530swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f16, 0.0f, 2, null);
                                                final MutableState<Float> mutableState4 = mutableState3;
                                                composer4.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed = composer4.changed(mutableState4);
                                                Object rememberedValue3 = composer4.rememberedValue();
                                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                            m1272invokeozmzZPI(intSize.getPackedValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                        public final void m1272invokeozmzZPI(long j3222) {
                                                            mutableState4.setValue(Float.valueOf(IntSize.m4609getHeightimpl(j3222)));
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue3);
                                                }
                                                composer4.endReplaceableGroup();
                                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m625requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                Shape shape10 = shape9;
                                                long j3222 = j3022;
                                                long j3322 = j3122;
                                                float f19 = f17;
                                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function310 = function39;
                                                final int i54 = i4922;
                                                ComposableLambda composableLambda322 = ComposableLambdaKt.composableLambda(composer4, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
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

                                                    public final void invoke(Composer composer5, int i55) {
                                                        ComposerKt.sourceInformation(composer5, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                        if ((i55 & 11) == 2 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        Function3<ColumnScope, Composer, Integer, Unit> function311 = function310;
                                                        int i56 = (i54 << 9) & 7168;
                                                        composer5.startReplaceableGroup(-483455358);
                                                        ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume222 = composer5.consume(localDensity222);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        Density density = (Density) consume222;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume3 = composer5.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer5.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer5);
                                                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-1163856341);
                                                        ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                        function311.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i56 >> 6) & 112) | 6));
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                    }
                                                });
                                                int i55 = i4922;
                                                int i56 = i50;
                                                SurfaceKt.m1520SurfaceFjzlyU(onSizeChanged, shape10, j3222, j3322, null, f19, composableLambda322, composer4, ((i55 >> 12) & 458752) | ((i55 >> 21) & 112) | 1572864 | ((i56 << 6) & 896) | ((i56 << 6) & 7168), 16);
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function210 = function2822;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function3722;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState6 = BottomSheetScaffoldState.this;
                                    final int i51 = i4722;
                                    ComposableLambda composableLambda322 = ComposableLambdaKt.composableLambda(composer3, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                        public final void invoke(Composer composer4, int i52) {
                                            ComposerKt.sourceInformation(composer4, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i52 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                function310.invoke(bottomSheetScaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i51 >> 9) & 112));
                                            }
                                        }
                                    });
                                    float f18 = f9;
                                    int i52 = i4422;
                                    int i53 = i4722;
                                    BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function29, function3822, composableLambda222, function210, composableLambda322, f18, i52, offset, bottomSheetState, composer3, ((i53 >> 9) & 14) | 24960 | ((i4622 >> 3) & 112) | ((i53 >> 6) & 7168) | ((i4522 << 9) & 458752) | (i53 & 3670016));
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier2, 0.0f, r3, null);
                        final float f1522 = f7;
                        final BottomSheetScaffoldState bottomSheetScaffoldState522 = bottomSheetScaffoldState2;
                        final int i4822 = i28;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3822 = function34;
                        final boolean z822 = z4;
                        final long j3022 = j17;
                        final long j3122 = j13;
                        final long j3222 = j14;
                        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4922) {
                                ComposerKt.sourceInformation(composer3, "C:BottomSheetScaffold.kt#jmzs0o");
                                if ((i4922 & 11) != 2 || !composer3.getSkipping()) {
                                    if (function3822 == null) {
                                        composer3.startReplaceableGroup(-249544858);
                                        ComposerKt.sourceInformation(composer3, "381@16183L7");
                                        composableLambda32.invoke(composer3, 6);
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.startReplaceableGroup(-249544821);
                                    ComposerKt.sourceInformation(composer3, "383@16220L480");
                                    Function3<ColumnScope, Composer, Integer, Unit> function39 = function3822;
                                    DrawerState drawerState = bottomSheetScaffoldState522.getDrawerState();
                                    boolean z9 = z822;
                                    Shape shape9 = shape722;
                                    float f16 = f1522;
                                    long j3322 = j3222;
                                    long j3422 = j3122;
                                    long j35 = j3022;
                                    Function2<Composer, Integer, Unit> function29 = composableLambda32;
                                    int i50 = i4822;
                                    DrawerKt.m1373ModalDrawerGs3lGvM(function39, null, drawerState, z9, shape9, f16, j3322, j3422, j35, function29, composer3, ((i50 >> 3) & 7168) | ((i50 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i50 >> 3) & 57344) | ((i50 >> 3) & 458752) | ((i50 >> 3) & 3670016) | ((i50 >> 3) & 29360128) | ((i50 >> 3) & 234881024), 2);
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        int i4922 = i4622 << 6;
                        long j3322 = j19;
                        long j3422 = j18;
                        SurfaceKt.m1520SurfaceFjzlyU(fillMaxSize$default22, null, j3322, j3422, null, 0.0f, composableLambda222, startRestartGroup, (i4922 & 7168) | (i4922 & 896) | 1572864, 50);
                        j20 = j3322;
                        f11 = f1422;
                        function35 = function3722;
                        function36 = function34;
                        z5 = z4;
                        j21 = j13;
                        composer2 = startRestartGroup;
                        f12 = f9;
                        shape5 = shape722;
                        f13 = f7;
                        modifier4 = modifier2;
                        function25 = function23;
                        j22 = j17;
                        j23 = j14;
                        j24 = j3422;
                        function26 = function24;
                        i32 = m1412getEnd5ygKITE;
                        z6 = z3;
                        shape3 = cornerBasedShape;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                        j25 = j10;
                        j26 = j11;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i14 = i13;
                    if ((i3 & 14) == 0) {
                    }
                    if ((i3 & 112) == 0) {
                    }
                    int i372 = i16;
                    i17 = i5 & 4096;
                    if (i17 != 0) {
                    }
                    i18 = i5 & 8192;
                    if (i18 == 0) {
                    }
                    i20 = i5 & 16384;
                    if (i20 == 0) {
                    }
                    i21 = i20;
                    if ((i3 & 458752) == 0) {
                    }
                    i22 = i5 & 65536;
                    if (i22 != 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i3 & 1879048192) == 0) {
                    }
                    if ((i4 & 14) == 0) {
                    }
                    if ((i4 & 112) == 0) {
                    }
                    int i39222 = i19;
                    int i40222 = i23;
                    if ((i5 & 4194304) != 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if ((i5 & 4) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i5 & 256) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i5 & 1024) != 0) {
                    }
                    int i41222 = i26;
                    if ((i5 & 2048) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    j11 = j9;
                    if ((i5 & 32768) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    Shape shape6222 = cornerBasedShape2;
                    if ((i5 & 131072) != 0) {
                    }
                    if ((i5 & 262144) != 0) {
                    }
                    if ((i5 & 524288) != 0) {
                    }
                    long j27222 = j15;
                    if ((i5 & 1048576) != 0) {
                    }
                    if ((i5 & 2097152) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    final float f14222 = f6;
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    final Shape shape7222 = shape4;
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localDensity222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    mo336toPx0680j_4 = ((Density) consume222).mo336toPx0680j_4(f8);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) rememberedValue2;
                    if (!Intrinsics.areEqual(mo336toPx0680j_4, m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                    }
                    final Modifier modifier5222 = companion;
                    final Function2<? super Composer, ? super Integer, Unit> function27222 = function24;
                    final int i44222 = m1412getEnd5ygKITE;
                    final boolean z7222 = z3;
                    final Shape shape8222 = cornerBasedShape;
                    final Function2<? super Composer, ? super Integer, Unit> function28222 = function23;
                    final BottomSheetScaffoldState bottomSheetScaffoldState4222 = bottomSheetScaffoldState2;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function37222 = function33;
                    final int i45222 = i28;
                    final long j28222 = j10;
                    final long j29222 = j11;
                    final int i46222 = i30;
                    final int i47222 = i31;
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda322 = ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i48222) {
                            ComposerKt.sourceInformation(composer3, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                            if ((i48222 & 11) != 2 || !composer3.getSkipping()) {
                                State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                Function2<Composer, Integer, Unit> function29 = function27222;
                                Function3<PaddingValues, Composer, Integer, Unit> function38222 = content;
                                final float f15222 = f10;
                                final BottomSheetScaffoldState bottomSheetScaffoldState5222 = BottomSheetScaffoldState.this;
                                final boolean z8222 = z7222;
                                final Modifier modifier6 = modifier5222;
                                final float f16 = f9;
                                final MutableState<Float> mutableState3 = mutableState2;
                                final Shape shape9 = shape8222;
                                final long j30222 = j29222;
                                final long j31222 = j28222;
                                final float f17 = f14222;
                                final int i49222 = i47222;
                                final int i50 = i45222;
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = sheetContent;
                                ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer3, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer4, Integer num2) {
                                        invoke(num.intValue(), composer4, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int i51, Composer composer4, int i52) {
                                        int i53;
                                        Float m1267BottomSheetScaffold_bGncdBI$lambda4;
                                        Float m1267BottomSheetScaffold_bGncdBI$lambda42;
                                        Map mapOf;
                                        Modifier.Companion m1530swipeablepPrIpRY;
                                        ComposerKt.sourceInformation(composer4, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i52 & 14) == 0) {
                                            i53 = i52 | (composer4.changed(i51) ? 4 : 2);
                                        } else {
                                            i53 = i52;
                                        }
                                        if ((i53 & 91) != 18 || !composer4.getSkipping()) {
                                            m1267BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                            if (m1267BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                m1530swipeablepPrIpRY = Modifier.INSTANCE;
                                            } else {
                                                if (MathKt.roundToInt(m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f15222)) {
                                                    float f18 = i51;
                                                    m1267BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                    Intrinsics.checkNotNull(m1267BottomSheetScaffold_bGncdBI$lambda42);
                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f18 - m1267BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f18 - f15222), BottomSheetValue.Collapsed));
                                                } else {
                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i51 - m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                }
                                                m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState5222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z8222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final FixedThreshold invoke(T t, T t2) {
                                                        return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                    }
                                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                            }
                                            Modifier m625requiredHeightInVpY3zN4$default = SizeKt.m625requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState5222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1530swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f16, 0.0f, 2, null);
                                            final MutableState<Float> mutableState4 = mutableState3;
                                            composer4.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed = composer4.changed(mutableState4);
                                            Object rememberedValue3 = composer4.rememberedValue();
                                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                        m1272invokeozmzZPI(intSize.getPackedValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                    public final void m1272invokeozmzZPI(long j32222) {
                                                        mutableState4.setValue(Float.valueOf(IntSize.m4609getHeightimpl(j32222)));
                                                    }
                                                };
                                                composer4.updateRememberedValue(rememberedValue3);
                                            }
                                            composer4.endReplaceableGroup();
                                            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m625requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                            Shape shape10 = shape9;
                                            long j32222 = j30222;
                                            long j33222 = j31222;
                                            float f19 = f17;
                                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function310 = function39;
                                            final int i54 = i49222;
                                            ComposableLambda composableLambda3222 = ComposableLambdaKt.composableLambda(composer4, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
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

                                                public final void invoke(Composer composer5, int i55) {
                                                    ComposerKt.sourceInformation(composer5, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                    if ((i55 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    Function3<ColumnScope, Composer, Integer, Unit> function311 = function310;
                                                    int i56 = (i54 << 9) & 7168;
                                                    composer5.startReplaceableGroup(-483455358);
                                                    ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume2222 = composer5.consume(localDensity2222);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    Density density = (Density) consume2222;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3 = composer5.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume4 = composer5.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer5);
                                                    Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-1163856341);
                                                    ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                    function311.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i56 >> 6) & 112) | 6));
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                }
                                            });
                                            int i55 = i49222;
                                            int i56 = i50;
                                            SurfaceKt.m1520SurfaceFjzlyU(onSizeChanged, shape10, j32222, j33222, null, f19, composableLambda3222, composer4, ((i55 >> 12) & 458752) | ((i55 >> 21) & 112) | 1572864 | ((i56 << 6) & 896) | ((i56 << 6) & 7168), 16);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                Function2<Composer, Integer, Unit> function210 = function28222;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function37222;
                                final BottomSheetScaffoldState bottomSheetScaffoldState6 = BottomSheetScaffoldState.this;
                                final int i51 = i47222;
                                ComposableLambda composableLambda3222 = ComposableLambdaKt.composableLambda(composer3, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                    public final void invoke(Composer composer4, int i52) {
                                        ComposerKt.sourceInformation(composer4, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i52 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            function310.invoke(bottomSheetScaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i51 >> 9) & 112));
                                        }
                                    }
                                });
                                float f18 = f9;
                                int i52 = i44222;
                                int i53 = i47222;
                                BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function29, function38222, composableLambda2222, function210, composableLambda3222, f18, i52, offset, bottomSheetState, composer3, ((i53 >> 9) & 14) | 24960 | ((i46222 >> 3) & 112) | ((i53 >> 6) & 7168) | ((i45222 << 9) & 458752) | (i53 & 3670016));
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier2, 0.0f, r3, null);
                    final float f15222 = f7;
                    final BottomSheetScaffoldState bottomSheetScaffoldState5222 = bottomSheetScaffoldState2;
                    final int i48222 = i28;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38222 = function34;
                    final boolean z8222 = z4;
                    final long j30222 = j17;
                    final long j31222 = j13;
                    final long j32222 = j14;
                    ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i49222) {
                            ComposerKt.sourceInformation(composer3, "C:BottomSheetScaffold.kt#jmzs0o");
                            if ((i49222 & 11) != 2 || !composer3.getSkipping()) {
                                if (function38222 == null) {
                                    composer3.startReplaceableGroup(-249544858);
                                    ComposerKt.sourceInformation(composer3, "381@16183L7");
                                    composableLambda322.invoke(composer3, 6);
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.startReplaceableGroup(-249544821);
                                ComposerKt.sourceInformation(composer3, "383@16220L480");
                                Function3<ColumnScope, Composer, Integer, Unit> function39 = function38222;
                                DrawerState drawerState = bottomSheetScaffoldState5222.getDrawerState();
                                boolean z9 = z8222;
                                Shape shape9 = shape7222;
                                float f16 = f15222;
                                long j33222 = j32222;
                                long j34222 = j31222;
                                long j35 = j30222;
                                Function2<Composer, Integer, Unit> function29 = composableLambda322;
                                int i50 = i48222;
                                DrawerKt.m1373ModalDrawerGs3lGvM(function39, null, drawerState, z9, shape9, f16, j33222, j34222, j35, function29, composer3, ((i50 >> 3) & 7168) | ((i50 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i50 >> 3) & 57344) | ((i50 >> 3) & 458752) | ((i50 >> 3) & 3670016) | ((i50 >> 3) & 29360128) | ((i50 >> 3) & 234881024), 2);
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    int i49222 = i46222 << 6;
                    long j33222 = j19;
                    long j34222 = j18;
                    SurfaceKt.m1520SurfaceFjzlyU(fillMaxSize$default222, null, j33222, j34222, null, 0.0f, composableLambda2222, startRestartGroup, (i49222 & 7168) | (i49222 & 896) | 1572864, 50);
                    j20 = j33222;
                    f11 = f14222;
                    function35 = function37222;
                    function36 = function34;
                    z5 = z4;
                    j21 = j13;
                    composer2 = startRestartGroup;
                    f12 = f9;
                    shape5 = shape7222;
                    f13 = f7;
                    modifier4 = modifier2;
                    function25 = function23;
                    j22 = j17;
                    j23 = j14;
                    j24 = j34222;
                    function26 = function24;
                    i32 = m1412getEnd5ygKITE;
                    z6 = z3;
                    shape3 = cornerBasedShape;
                    bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                    j25 = j10;
                    j26 = j11;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i12 = i11;
                if ((i2 & 234881024) != 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i3 & 14) == 0) {
                }
                if ((i3 & 112) == 0) {
                }
                int i3722 = i16;
                i17 = i5 & 4096;
                if (i17 != 0) {
                }
                i18 = i5 & 8192;
                if (i18 == 0) {
                }
                i20 = i5 & 16384;
                if (i20 == 0) {
                }
                i21 = i20;
                if ((i3 & 458752) == 0) {
                }
                i22 = i5 & 65536;
                if (i22 != 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i3 & 1879048192) == 0) {
                }
                if ((i4 & 14) == 0) {
                }
                if ((i4 & 112) == 0) {
                }
                int i392222 = i19;
                int i402222 = i23;
                if ((i5 & 4194304) != 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if ((i5 & 4) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 256) != 0) {
                }
                if (i14 != 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                int i412222 = i26;
                if ((i5 & 2048) != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                j11 = j9;
                if ((i5 & 32768) != 0) {
                }
                if (i22 != 0) {
                }
                Shape shape62222 = cornerBasedShape2;
                if ((i5 & 131072) != 0) {
                }
                if ((i5 & 262144) != 0) {
                }
                if ((i5 & 524288) != 0) {
                }
                long j272222 = j15;
                if ((i5 & 1048576) != 0) {
                }
                if ((i5 & 2097152) != 0) {
                }
                startRestartGroup.endDefaults();
                final float f142222 = f6;
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                final Shape shape72222 = shape4;
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localDensity2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                mo336toPx0680j_4 = ((Density) consume2222).mo336toPx0680j_4(f8);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) rememberedValue2;
                if (!Intrinsics.areEqual(mo336toPx0680j_4, m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                }
                final Modifier modifier52222 = companion;
                final Function2<? super Composer, ? super Integer, Unit> function272222 = function24;
                final int i442222 = m1412getEnd5ygKITE;
                final boolean z72222 = z3;
                final Shape shape82222 = cornerBasedShape;
                final Function2<? super Composer, ? super Integer, Unit> function282222 = function23;
                final BottomSheetScaffoldState bottomSheetScaffoldState42222 = bottomSheetScaffoldState2;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function372222 = function33;
                final int i452222 = i28;
                final long j282222 = j10;
                final long j292222 = j11;
                final int i462222 = i30;
                final int i472222 = i31;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda3222 = ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i482222) {
                        ComposerKt.sourceInformation(composer3, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                        if ((i482222 & 11) != 2 || !composer3.getSkipping()) {
                            State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                            BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                            Function2<Composer, Integer, Unit> function29 = function272222;
                            Function3<PaddingValues, Composer, Integer, Unit> function382222 = content;
                            final float f152222 = f10;
                            final BottomSheetScaffoldState bottomSheetScaffoldState52222 = BottomSheetScaffoldState.this;
                            final boolean z82222 = z72222;
                            final Modifier modifier6 = modifier52222;
                            final float f16 = f9;
                            final MutableState<Float> mutableState3 = mutableState2;
                            final Shape shape9 = shape82222;
                            final long j302222 = j292222;
                            final long j312222 = j282222;
                            final float f17 = f142222;
                            final int i492222 = i472222;
                            final int i50 = i452222;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = sheetContent;
                            ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(composer3, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer4, Integer num2) {
                                    invoke(num.intValue(), composer4, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i51, Composer composer4, int i52) {
                                    int i53;
                                    Float m1267BottomSheetScaffold_bGncdBI$lambda4;
                                    Float m1267BottomSheetScaffold_bGncdBI$lambda42;
                                    Map mapOf;
                                    Modifier.Companion m1530swipeablepPrIpRY;
                                    ComposerKt.sourceInformation(composer4, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i52 & 14) == 0) {
                                        i53 = i52 | (composer4.changed(i51) ? 4 : 2);
                                    } else {
                                        i53 = i52;
                                    }
                                    if ((i53 & 91) != 18 || !composer4.getSkipping()) {
                                        m1267BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                        if (m1267BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                            m1530swipeablepPrIpRY = Modifier.INSTANCE;
                                        } else {
                                            if (MathKt.roundToInt(m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f152222)) {
                                                float f18 = i51;
                                                m1267BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                                Intrinsics.checkNotNull(m1267BottomSheetScaffold_bGncdBI$lambda42);
                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f18 - m1267BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f18 - f152222), BottomSheetValue.Collapsed));
                                            } else {
                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i51 - m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                            }
                                            m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState52222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z82222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final FixedThreshold invoke(T t, T t2) {
                                                    return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                }
                                            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                        }
                                        Modifier m625requiredHeightInVpY3zN4$default = SizeKt.m625requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState52222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1530swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f16, 0.0f, 2, null);
                                        final MutableState<Float> mutableState4 = mutableState3;
                                        composer4.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                        boolean changed = composer4.changed(mutableState4);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                    m1272invokeozmzZPI(intSize.getPackedValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                public final void m1272invokeozmzZPI(long j322222) {
                                                    mutableState4.setValue(Float.valueOf(IntSize.m4609getHeightimpl(j322222)));
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue3);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m625requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                        Shape shape10 = shape9;
                                        long j322222 = j302222;
                                        long j332222 = j312222;
                                        float f19 = f17;
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function310 = function39;
                                        final int i54 = i492222;
                                        ComposableLambda composableLambda32222 = ComposableLambdaKt.composableLambda(composer4, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
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

                                            public final void invoke(Composer composer5, int i55) {
                                                ComposerKt.sourceInformation(composer5, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                                if ((i55 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                Function3<ColumnScope, Composer, Integer, Unit> function311 = function310;
                                                int i56 = (i54 << 9) & 7168;
                                                composer5.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                composer5.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume22222 = composer5.consume(localDensity22222);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                Density density = (Density) consume22222;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer5.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer5.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer5);
                                                Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-1163856341);
                                                ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                                function311.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i56 >> 6) & 112) | 6));
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                            }
                                        });
                                        int i55 = i492222;
                                        int i56 = i50;
                                        SurfaceKt.m1520SurfaceFjzlyU(onSizeChanged, shape10, j322222, j332222, null, f19, composableLambda32222, composer4, ((i55 >> 12) & 458752) | ((i55 >> 21) & 112) | 1572864 | ((i56 << 6) & 896) | ((i56 << 6) & 7168), 16);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                            Function2<Composer, Integer, Unit> function210 = function282222;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function372222;
                            final BottomSheetScaffoldState bottomSheetScaffoldState6 = BottomSheetScaffoldState.this;
                            final int i51 = i472222;
                            ComposableLambda composableLambda32222 = ComposableLambdaKt.composableLambda(composer3, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                                public final void invoke(Composer composer4, int i52) {
                                    ComposerKt.sourceInformation(composer4, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i52 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        function310.invoke(bottomSheetScaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i51 >> 9) & 112));
                                    }
                                }
                            });
                            float f18 = f9;
                            int i52 = i442222;
                            int i53 = i472222;
                            BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function29, function382222, composableLambda22222, function210, composableLambda32222, f18, i52, offset, bottomSheetState, composer3, ((i53 >> 9) & 14) | 24960 | ((i462222 >> 3) & 112) | ((i53 >> 6) & 7168) | ((i452222 << 9) & 458752) | (i53 & 3670016));
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(modifier2, 0.0f, r3, null);
                final float f152222 = f7;
                final BottomSheetScaffoldState bottomSheetScaffoldState52222 = bottomSheetScaffoldState2;
                final int i482222 = i28;
                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function382222 = function34;
                final boolean z82222 = z4;
                final long j302222 = j17;
                final long j312222 = j13;
                final long j322222 = j14;
                ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i492222) {
                        ComposerKt.sourceInformation(composer3, "C:BottomSheetScaffold.kt#jmzs0o");
                        if ((i492222 & 11) != 2 || !composer3.getSkipping()) {
                            if (function382222 == null) {
                                composer3.startReplaceableGroup(-249544858);
                                ComposerKt.sourceInformation(composer3, "381@16183L7");
                                composableLambda3222.invoke(composer3, 6);
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.startReplaceableGroup(-249544821);
                            ComposerKt.sourceInformation(composer3, "383@16220L480");
                            Function3<ColumnScope, Composer, Integer, Unit> function39 = function382222;
                            DrawerState drawerState = bottomSheetScaffoldState52222.getDrawerState();
                            boolean z9 = z82222;
                            Shape shape9 = shape72222;
                            float f16 = f152222;
                            long j332222 = j322222;
                            long j342222 = j312222;
                            long j35 = j302222;
                            Function2<Composer, Integer, Unit> function29 = composableLambda3222;
                            int i50 = i482222;
                            DrawerKt.m1373ModalDrawerGs3lGvM(function39, null, drawerState, z9, shape9, f16, j332222, j342222, j35, function29, composer3, ((i50 >> 3) & 7168) | ((i50 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i50 >> 3) & 57344) | ((i50 >> 3) & 458752) | ((i50 >> 3) & 3670016) | ((i50 >> 3) & 29360128) | ((i50 >> 3) & 234881024), 2);
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                int i492222 = i462222 << 6;
                long j332222 = j19;
                long j342222 = j18;
                SurfaceKt.m1520SurfaceFjzlyU(fillMaxSize$default2222, null, j332222, j342222, null, 0.0f, composableLambda22222, startRestartGroup, (i492222 & 7168) | (i492222 & 896) | 1572864, 50);
                j20 = j332222;
                f11 = f142222;
                function35 = function372222;
                function36 = function34;
                z5 = z4;
                j21 = j13;
                composer2 = startRestartGroup;
                f12 = f9;
                shape5 = shape72222;
                f13 = f7;
                modifier4 = modifier2;
                function25 = function23;
                j22 = j17;
                j23 = j14;
                j24 = j342222;
                function26 = function24;
                i32 = m1412getEnd5ygKITE;
                z6 = z3;
                shape3 = cornerBasedShape;
                bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                j25 = j10;
                j26 = j11;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 234881024) != 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i3 & 14) == 0) {
            }
            if ((i3 & 112) == 0) {
            }
            int i37222 = i16;
            i17 = i5 & 4096;
            if (i17 != 0) {
            }
            i18 = i5 & 8192;
            if (i18 == 0) {
            }
            i20 = i5 & 16384;
            if (i20 == 0) {
            }
            i21 = i20;
            if ((i3 & 458752) == 0) {
            }
            i22 = i5 & 65536;
            if (i22 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            if ((i4 & 14) == 0) {
            }
            if ((i4 & 112) == 0) {
            }
            int i3922222 = i19;
            int i4022222 = i23;
            if ((i5 & 4194304) != 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if ((i5 & 4) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 256) != 0) {
            }
            if (i14 != 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            int i4122222 = i26;
            if ((i5 & 2048) != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            j11 = j9;
            if ((i5 & 32768) != 0) {
            }
            if (i22 != 0) {
            }
            Shape shape622222 = cornerBasedShape2;
            if ((i5 & 131072) != 0) {
            }
            if ((i5 & 262144) != 0) {
            }
            if ((i5 & 524288) != 0) {
            }
            long j2722222 = j15;
            if ((i5 & 1048576) != 0) {
            }
            if ((i5 & 2097152) != 0) {
            }
            startRestartGroup.endDefaults();
            final float f1422222 = f6;
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            final Shape shape722222 = shape4;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localDensity22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            mo336toPx0680j_4 = ((Density) consume22222).mo336toPx0680j_4(f8);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) rememberedValue2;
            if (!Intrinsics.areEqual(mo336toPx0680j_4, m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
            }
            final Modifier modifier522222 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function2722222 = function24;
            final int i4422222 = m1412getEnd5ygKITE;
            final boolean z722222 = z3;
            final Shape shape822222 = cornerBasedShape;
            final Function2<? super Composer, ? super Integer, Unit> function2822222 = function23;
            final BottomSheetScaffoldState bottomSheetScaffoldState422222 = bottomSheetScaffoldState2;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3722222 = function33;
            final int i4522222 = i28;
            final long j2822222 = j10;
            final long j2922222 = j11;
            final int i4622222 = i30;
            final int i4722222 = i31;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda32222 = ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4822222) {
                    ComposerKt.sourceInformation(composer3, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                    if ((i4822222 & 11) != 2 || !composer3.getSkipping()) {
                        State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                        BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                        Function2<Composer, Integer, Unit> function29 = function2722222;
                        Function3<PaddingValues, Composer, Integer, Unit> function3822222 = content;
                        final float f1522222 = f10;
                        final BottomSheetScaffoldState bottomSheetScaffoldState522222 = BottomSheetScaffoldState.this;
                        final boolean z822222 = z722222;
                        final Modifier modifier6 = modifier522222;
                        final float f16 = f9;
                        final MutableState<Float> mutableState3 = mutableState2;
                        final Shape shape9 = shape822222;
                        final long j3022222 = j2922222;
                        final long j3122222 = j2822222;
                        final float f17 = f1422222;
                        final int i4922222 = i4722222;
                        final int i50 = i4522222;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = sheetContent;
                        ComposableLambda composableLambda222222 = ComposableLambdaKt.composableLambda(composer3, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer4, Integer num2) {
                                invoke(num.intValue(), composer4, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i51, Composer composer4, int i52) {
                                int i53;
                                Float m1267BottomSheetScaffold_bGncdBI$lambda4;
                                Float m1267BottomSheetScaffold_bGncdBI$lambda42;
                                Map mapOf;
                                Modifier.Companion m1530swipeablepPrIpRY;
                                ComposerKt.sourceInformation(composer4, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                                if ((i52 & 14) == 0) {
                                    i53 = i52 | (composer4.changed(i51) ? 4 : 2);
                                } else {
                                    i53 = i52;
                                }
                                if ((i53 & 91) != 18 || !composer4.getSkipping()) {
                                    m1267BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                    if (m1267BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                        m1530swipeablepPrIpRY = Modifier.INSTANCE;
                                    } else {
                                        if (MathKt.roundToInt(m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f1522222)) {
                                            float f18 = i51;
                                            m1267BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                            Intrinsics.checkNotNull(m1267BottomSheetScaffold_bGncdBI$lambda42);
                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f18 - m1267BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f18 - f1522222), BottomSheetValue.Collapsed));
                                        } else {
                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i51 - m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                        }
                                        m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState522222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z822222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final FixedThreshold invoke(T t, T t2) {
                                                return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                            }
                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                    }
                                    Modifier m625requiredHeightInVpY3zN4$default = SizeKt.m625requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState522222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1530swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f16, 0.0f, 2, null);
                                    final MutableState<Float> mutableState4 = mutableState3;
                                    composer4.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = composer4.changed(mutableState4);
                                    Object rememberedValue3 = composer4.rememberedValue();
                                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                                m1272invokeozmzZPI(intSize.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                            public final void m1272invokeozmzZPI(long j3222222) {
                                                mutableState4.setValue(Float.valueOf(IntSize.m4609getHeightimpl(j3222222)));
                                            }
                                        };
                                        composer4.updateRememberedValue(rememberedValue3);
                                    }
                                    composer4.endReplaceableGroup();
                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m625requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                    Shape shape10 = shape9;
                                    long j3222222 = j3022222;
                                    long j3322222 = j3122222;
                                    float f19 = f17;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function310 = function39;
                                    final int i54 = i4922222;
                                    ComposableLambda composableLambda322222 = ComposableLambdaKt.composableLambda(composer4, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
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

                                        public final void invoke(Composer composer5, int i55) {
                                            ComposerKt.sourceInformation(composer5, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i55 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            Function3<ColumnScope, Composer, Integer, Unit> function311 = function310;
                                            int i56 = (i54 << 9) & 7168;
                                            composer5.startReplaceableGroup(-483455358);
                                            ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                            composer5.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume222222 = composer5.consume(localDensity222222);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            Density density = (Density) consume222222;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer5.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer5.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer5);
                                            Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-1163856341);
                                            ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                            function311.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i56 >> 6) & 112) | 6));
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                        }
                                    });
                                    int i55 = i4922222;
                                    int i56 = i50;
                                    SurfaceKt.m1520SurfaceFjzlyU(onSizeChanged, shape10, j3222222, j3322222, null, f19, composableLambda322222, composer4, ((i55 >> 12) & 458752) | ((i55 >> 21) & 112) | 1572864 | ((i56 << 6) & 896) | ((i56 << 6) & 7168), 16);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        Function2<Composer, Integer, Unit> function210 = function2822222;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function3722222;
                        final BottomSheetScaffoldState bottomSheetScaffoldState6 = BottomSheetScaffoldState.this;
                        final int i51 = i4722222;
                        ComposableLambda composableLambda322222 = ComposableLambdaKt.composableLambda(composer3, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                            public final void invoke(Composer composer4, int i52) {
                                ComposerKt.sourceInformation(composer4, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                                if ((i52 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                } else {
                                    function310.invoke(bottomSheetScaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i51 >> 9) & 112));
                                }
                            }
                        });
                        float f18 = f9;
                        int i52 = i4422222;
                        int i53 = i4722222;
                        BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function29, function3822222, composableLambda222222, function210, composableLambda322222, f18, i52, offset, bottomSheetState, composer3, ((i53 >> 9) & 14) | 24960 | ((i4622222 >> 3) & 112) | ((i53 >> 6) & 7168) | ((i4522222 << 9) & 458752) | (i53 & 3670016));
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(modifier2, 0.0f, r3, null);
            final float f1522222 = f7;
            final BottomSheetScaffoldState bottomSheetScaffoldState522222 = bottomSheetScaffoldState2;
            final int i4822222 = i28;
            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3822222 = function34;
            final boolean z822222 = z4;
            final long j3022222 = j17;
            final long j3122222 = j13;
            final long j3222222 = j14;
            ComposableLambda composableLambda222222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4922222) {
                    ComposerKt.sourceInformation(composer3, "C:BottomSheetScaffold.kt#jmzs0o");
                    if ((i4922222 & 11) != 2 || !composer3.getSkipping()) {
                        if (function3822222 == null) {
                            composer3.startReplaceableGroup(-249544858);
                            ComposerKt.sourceInformation(composer3, "381@16183L7");
                            composableLambda32222.invoke(composer3, 6);
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.startReplaceableGroup(-249544821);
                        ComposerKt.sourceInformation(composer3, "383@16220L480");
                        Function3<ColumnScope, Composer, Integer, Unit> function39 = function3822222;
                        DrawerState drawerState = bottomSheetScaffoldState522222.getDrawerState();
                        boolean z9 = z822222;
                        Shape shape9 = shape722222;
                        float f16 = f1522222;
                        long j3322222 = j3222222;
                        long j3422222 = j3122222;
                        long j35 = j3022222;
                        Function2<Composer, Integer, Unit> function29 = composableLambda32222;
                        int i50 = i4822222;
                        DrawerKt.m1373ModalDrawerGs3lGvM(function39, null, drawerState, z9, shape9, f16, j3322222, j3422222, j35, function29, composer3, ((i50 >> 3) & 7168) | ((i50 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i50 >> 3) & 57344) | ((i50 >> 3) & 458752) | ((i50 >> 3) & 3670016) | ((i50 >> 3) & 29360128) | ((i50 >> 3) & 234881024), 2);
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            int i4922222 = i4622222 << 6;
            long j3322222 = j19;
            long j3422222 = j18;
            SurfaceKt.m1520SurfaceFjzlyU(fillMaxSize$default22222, null, j3322222, j3422222, null, 0.0f, composableLambda222222, startRestartGroup, (i4922222 & 7168) | (i4922222 & 896) | 1572864, 50);
            j20 = j3322222;
            f11 = f1422222;
            function35 = function3722222;
            function36 = function34;
            z5 = z4;
            j21 = j13;
            composer2 = startRestartGroup;
            f12 = f9;
            shape5 = shape722222;
            f13 = f7;
            modifier4 = modifier2;
            function25 = function23;
            j22 = j17;
            j23 = j14;
            j24 = j3422222;
            function26 = function24;
            i32 = m1412getEnd5ygKITE;
            z6 = z3;
            shape3 = cornerBasedShape;
            bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
            j25 = j10;
            j26 = j11;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 234881024) != 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i3 & 14) == 0) {
        }
        if ((i3 & 112) == 0) {
        }
        int i372222 = i16;
        i17 = i5 & 4096;
        if (i17 != 0) {
        }
        i18 = i5 & 8192;
        if (i18 == 0) {
        }
        i20 = i5 & 16384;
        if (i20 == 0) {
        }
        i21 = i20;
        if ((i3 & 458752) == 0) {
        }
        i22 = i5 & 65536;
        if (i22 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        if ((i4 & 14) == 0) {
        }
        if ((i4 & 112) == 0) {
        }
        int i39222222 = i19;
        int i40222222 = i23;
        if ((i5 & 4194304) != 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if ((i5 & 4) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 256) != 0) {
        }
        if (i14 != 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        int i41222222 = i26;
        if ((i5 & 2048) != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        j11 = j9;
        if ((i5 & 32768) != 0) {
        }
        if (i22 != 0) {
        }
        Shape shape6222222 = cornerBasedShape2;
        if ((i5 & 131072) != 0) {
        }
        if ((i5 & 262144) != 0) {
        }
        if ((i5 & 524288) != 0) {
        }
        long j27222222 = j15;
        if ((i5 & 1048576) != 0) {
        }
        if ((i5 & 2097152) != 0) {
        }
        startRestartGroup.endDefaults();
        final float f14222222 = f6;
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        final Shape shape7222222 = shape4;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope222222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localDensity222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        mo336toPx0680j_4 = ((Density) consume222222).mo336toPx0680j_4(f8);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableState = (MutableState) rememberedValue2;
        if (!Intrinsics.areEqual(mo336toPx0680j_4, m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
        }
        final Modifier modifier5222222 = companion;
        final Function2<? super Composer, ? super Integer, Unit> function27222222 = function24;
        final int i44222222 = m1412getEnd5ygKITE;
        final boolean z7222222 = z3;
        final Shape shape8222222 = cornerBasedShape;
        final Function2<? super Composer, ? super Integer, Unit> function28222222 = function23;
        final BottomSheetScaffoldState bottomSheetScaffoldState4222222 = bottomSheetScaffoldState2;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function37222222 = function33;
        final int i45222222 = i28;
        final long j28222222 = j10;
        final long j29222222 = j11;
        final int i46222222 = i30;
        final int i47222222 = i31;
        final Function2<? super Composer, ? super Integer, Unit> composableLambda322222 = ComposableLambdaKt.composableLambda(startRestartGroup, 893101063, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i48222222) {
                ComposerKt.sourceInformation(composer3, "C316@13233L2758:BottomSheetScaffold.kt#jmzs0o");
                if ((i48222222 & 11) != 2 || !composer3.getSkipping()) {
                    State<Float> offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                    Function2<Composer, Integer, Unit> function29 = function27222222;
                    Function3<PaddingValues, Composer, Integer, Unit> function38222222 = content;
                    final float f15222222 = f10;
                    final BottomSheetScaffoldState bottomSheetScaffoldState5222222 = BottomSheetScaffoldState.this;
                    final boolean z8222222 = z7222222;
                    final Modifier modifier6 = modifier5222222;
                    final float f16 = f9;
                    final MutableState<Float> mutableState3 = mutableState2;
                    final Shape shape9 = shape8222222;
                    final long j30222222 = j29222222;
                    final long j31222222 = j28222222;
                    final float f17 = f14222222;
                    final int i49222222 = i47222222;
                    final int i50 = i45222222;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = sheetContent;
                    ComposableLambda composableLambda2222222 = ComposableLambdaKt.composableLambda(composer3, -1378534681, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer4, Integer num2) {
                            invoke(num.intValue(), composer4, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i51, Composer composer4, int i52) {
                            int i53;
                            Float m1267BottomSheetScaffold_bGncdBI$lambda4;
                            Float m1267BottomSheetScaffold_bGncdBI$lambda42;
                            Map mapOf;
                            Modifier.Companion m1530swipeablepPrIpRY;
                            ComposerKt.sourceInformation(composer4, "C354@15208L95,347@14851L711:BottomSheetScaffold.kt#jmzs0o");
                            if ((i52 & 14) == 0) {
                                i53 = i52 | (composer4.changed(i51) ? 4 : 2);
                            } else {
                                i53 = i52;
                            }
                            if ((i53 & 91) != 18 || !composer4.getSkipping()) {
                                m1267BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                if (m1267BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                    m1530swipeablepPrIpRY = Modifier.INSTANCE;
                                } else {
                                    if (MathKt.roundToInt(m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f15222222)) {
                                        float f18 = i51;
                                        m1267BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m1267BottomSheetScaffold_bGncdBI$lambda4(mutableState3);
                                        Intrinsics.checkNotNull(m1267BottomSheetScaffold_bGncdBI$lambda42);
                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f18 - m1267BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f18 - f15222222), BottomSheetValue.Collapsed));
                                    } else {
                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i51 - m1267BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                    }
                                    m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState5222222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z8222222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final FixedThreshold invoke(T t, T t2) {
                                            return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                        }
                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                }
                                Modifier m625requiredHeightInVpY3zN4$default = SizeKt.m625requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState5222222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m1530swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f16, 0.0f, 2, null);
                                final MutableState<Float> mutableState4 = mutableState3;
                                composer4.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean changed = composer4.changed(mutableState4);
                                Object rememberedValue3 = composer4.rememberedValue();
                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                            m1272invokeozmzZPI(intSize.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                        public final void m1272invokeozmzZPI(long j32222222) {
                                            mutableState4.setValue(Float.valueOf(IntSize.m4609getHeightimpl(j32222222)));
                                        }
                                    };
                                    composer4.updateRememberedValue(rememberedValue3);
                                }
                                composer4.endReplaceableGroup();
                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m625requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                Shape shape10 = shape9;
                                long j32222222 = j30222222;
                                long j33222222 = j31222222;
                                float f19 = f17;
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function310 = function39;
                                final int i54 = i49222222;
                                ComposableLambda composableLambda3222222 = ComposableLambdaKt.composableLambda(composer4, -698903261, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
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

                                    public final void invoke(Composer composer5, int i55) {
                                        ComposerKt.sourceInformation(composer5, "C361@15529L30:BottomSheetScaffold.kt#jmzs0o");
                                        if ((i55 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        Function3<ColumnScope, Composer, Integer, Unit> function311 = function310;
                                        int i56 = (i54 << 9) & 7168;
                                        composer5.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer5, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                        composer5.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity2222222 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2222222 = composer5.consume(localDensity2222222);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        Density density = (Density) consume2222222;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer5.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer5.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        composer5.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer5);
                                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer5.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        composer5.startReplaceableGroup(-1163856341);
                                        ComposerKt.sourceInformation(composer5, "C79@3994L9:Column.kt#2w3rfo");
                                        function311.invoke(ColumnScopeInstance.INSTANCE, composer5, Integer.valueOf(((i56 >> 6) & 112) | 6));
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                    }
                                });
                                int i55 = i49222222;
                                int i56 = i50;
                                SurfaceKt.m1520SurfaceFjzlyU(onSizeChanged, shape10, j32222222, j33222222, null, f19, composableLambda3222222, composer4, ((i55 >> 12) & 458752) | ((i55 >> 21) & 112) | 1572864 | ((i56 << 6) & 896) | ((i56 << 6) & 7168), 16);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    });
                    Function2<Composer, Integer, Unit> function210 = function28222222;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function37222222;
                    final BottomSheetScaffoldState bottomSheetScaffoldState6 = BottomSheetScaffoldState.this;
                    final int i51 = i47222222;
                    ComposableLambda composableLambda3222222 = ComposableLambdaKt.composableLambda(composer3, -486138068, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
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

                        public final void invoke(Composer composer4, int i52) {
                            ComposerKt.sourceInformation(composer4, "C365@15680L45:BottomSheetScaffold.kt#jmzs0o");
                            if ((i52 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                            } else {
                                function310.invoke(bottomSheetScaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i51 >> 9) & 112));
                            }
                        }
                    });
                    float f18 = f9;
                    int i52 = i44222222;
                    int i53 = i47222222;
                    BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function29, function38222222, composableLambda2222222, function210, composableLambda3222222, f18, i52, offset, bottomSheetState, composer3, ((i53 >> 9) & 14) | 24960 | ((i46222222 >> 3) & 112) | ((i53 >> 6) & 7168) | ((i45222222 << 9) & 458752) | (i53 & 3670016));
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(modifier2, 0.0f, r3, null);
        final float f15222222 = f7;
        final BottomSheetScaffoldState bottomSheetScaffoldState5222222 = bottomSheetScaffoldState2;
        final int i48222222 = i28;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38222222 = function34;
        final boolean z8222222 = z4;
        final long j30222222 = j17;
        final long j31222222 = j13;
        final long j32222222 = j14;
        ComposableLambda composableLambda2222222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1273816607, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i49222222) {
                ComposerKt.sourceInformation(composer3, "C:BottomSheetScaffold.kt#jmzs0o");
                if ((i49222222 & 11) != 2 || !composer3.getSkipping()) {
                    if (function38222222 == null) {
                        composer3.startReplaceableGroup(-249544858);
                        ComposerKt.sourceInformation(composer3, "381@16183L7");
                        composableLambda322222.invoke(composer3, 6);
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.startReplaceableGroup(-249544821);
                    ComposerKt.sourceInformation(composer3, "383@16220L480");
                    Function3<ColumnScope, Composer, Integer, Unit> function39 = function38222222;
                    DrawerState drawerState = bottomSheetScaffoldState5222222.getDrawerState();
                    boolean z9 = z8222222;
                    Shape shape9 = shape7222222;
                    float f16 = f15222222;
                    long j33222222 = j32222222;
                    long j34222222 = j31222222;
                    long j35 = j30222222;
                    Function2<Composer, Integer, Unit> function29 = composableLambda322222;
                    int i50 = i48222222;
                    DrawerKt.m1373ModalDrawerGs3lGvM(function39, null, drawerState, z9, shape9, f16, j33222222, j34222222, j35, function29, composer3, ((i50 >> 3) & 7168) | ((i50 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i50 >> 3) & 57344) | ((i50 >> 3) & 458752) | ((i50 >> 3) & 3670016) | ((i50 >> 3) & 29360128) | ((i50 >> 3) & 234881024), 2);
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        int i49222222 = i46222222 << 6;
        long j33222222 = j19;
        long j34222222 = j18;
        SurfaceKt.m1520SurfaceFjzlyU(fillMaxSize$default222222, null, j33222222, j34222222, null, 0.0f, composableLambda2222222, startRestartGroup, (i49222222 & 7168) | (i49222222 & 896) | 1572864, 50);
        j20 = j33222222;
        f11 = f14222222;
        function35 = function37222222;
        function36 = function34;
        z5 = z4;
        j21 = j13;
        composer2 = startRestartGroup;
        f12 = f9;
        shape5 = shape7222222;
        f13 = f7;
        modifier4 = modifier2;
        function25 = function23;
        j22 = j17;
        j23 = j14;
        j24 = j34222222;
        function26 = function24;
        i32 = m1412getEnd5ygKITE;
        z6 = z3;
        shape3 = cornerBasedShape;
        bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
        j25 = j10;
        j26 = j11;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffold_bGncdBI$lambda-4, reason: not valid java name */
    public static final Float m1267BottomSheetScaffold_bGncdBI$lambda4(MutableState<Float> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m1266BottomSheetScaffoldLayoutKCBPh4w(final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final float f, final int i, final State<Float> state, final BottomSheetState bottomSheetState, Composer composer, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(499725572);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)P(8!3,7,5:c#ui.unit.Dp,3:c#material.FabPosition)429@17635L2479,429@17618L2496:BottomSheetScaffold.kt#jmzs0o");
        int i3 = (i2 & 14) == 0 ? (startRestartGroup.changed(function2) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changed(function32) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= startRestartGroup.changed(state) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= startRestartGroup.changed(bottomSheetState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        final int i4 = i3;
        if ((i4 & 191739611) != 38347922 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {function32, state, function2, function3, Dp.m4438boximpl(f), function22, FabPosition.m1404boximpl(i), function23, bottomSheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i5 = 0; i5 < 9; i5++) {
                z |= startRestartGroup.changed(objArr[i5]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    /* compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BottomSheetValue.values().length];
                            iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                            iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1273invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1273invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
                        Placeable placeable;
                        float f2;
                        int i6;
                        int i7;
                        int height;
                        float f3;
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j);
                        final int m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j);
                        long m4387copyZbe2FdA$default = Constraints.m4387copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final Function3<Integer, Composer, Integer, Unit> function33 = function32;
                        final int i8 = i4;
                        final Placeable mo3383measureBRTryo0 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(520491296, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1
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

                            public final void invoke(Composer composer2, int i9) {
                                ComposerKt.sourceInformation(composer2, "C435@17917L25:BottomSheetScaffold.kt#jmzs0o");
                                if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function33.invoke(Integer.valueOf(m4395getMaxHeightimpl), composer2, Integer.valueOf((i8 >> 3) & 112));
                                }
                            }
                        })).get(0).mo3383measureBRTryo0(m4387copyZbe2FdA$default);
                        final int roundToInt = MathKt.roundToInt(state.getValue().floatValue());
                        final Function2<Composer, Integer, Unit> function24 = function2;
                        if (function24 != null) {
                            final int i9 = i4;
                            placeable = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(1988456983, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1
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

                                public final void invoke(Composer composer2, int i10) {
                                    ComposerKt.sourceInformation(composer2, "C440@18148L8:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        function24.invoke(composer2, Integer.valueOf(i9 & 14));
                                    }
                                }
                            })).get(0).mo3383measureBRTryo0(m4387copyZbe2FdA$default);
                        } else {
                            placeable = null;
                        }
                        int height2 = placeable != null ? placeable.getHeight() : 0;
                        long m4387copyZbe2FdA$default2 = Constraints.m4387copyZbe2FdA$default(m4387copyZbe2FdA$default, 0, 0, 0, m4395getMaxHeightimpl - height2, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function3;
                        final float f4 = f;
                        final int i10 = i4;
                        final Placeable mo3383measureBRTryo02 = SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(1466287989, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1
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

                            public final void invoke(Composer composer2, int i11) {
                                ComposerKt.sourceInformation(composer2, "C447@18454L45:BottomSheetScaffold.kt#jmzs0o");
                                if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    function34.invoke(PaddingKt.m582PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f4, 7, null), composer2, Integer.valueOf(i10 & 112));
                                }
                            }
                        })).get(0).mo3383measureBRTryo0(m4387copyZbe2FdA$default2);
                        Function2<Composer, Integer, Unit> function25 = function22;
                        final Placeable mo3383measureBRTryo03 = function25 != null ? SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Fab, function25).get(0).mo3383measureBRTryo0(m4387copyZbe2FdA$default) : null;
                        int width = mo3383measureBRTryo03 != null ? mo3383measureBRTryo03.getWidth() : 0;
                        int height3 = mo3383measureBRTryo03 != null ? mo3383measureBRTryo03.getHeight() : 0;
                        if (FabPosition.m1407equalsimpl0(i, FabPosition.INSTANCE.m1411getCenter5ygKITE())) {
                            i6 = (m4396getMaxWidthimpl - width) / 2;
                        } else {
                            f2 = BottomSheetScaffoldKt.FabSpacing;
                            i6 = (m4396getMaxWidthimpl - width) - SubcomposeLayout.mo330roundToPx0680j_4(f2);
                        }
                        final int i11 = i6;
                        int i12 = height3 / 2;
                        if (SubcomposeLayout.mo336toPx0680j_4(f) < i12) {
                            f3 = BottomSheetScaffoldKt.FabSpacing;
                            i7 = (roundToInt - height3) - SubcomposeLayout.mo330roundToPx0680j_4(f3);
                        } else {
                            i7 = roundToInt - i12;
                        }
                        final int i13 = i7;
                        final Placeable mo3383measureBRTryo04 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, function23).get(0).mo3383measureBRTryo0(m4387copyZbe2FdA$default);
                        final int width2 = (m4396getMaxWidthimpl - mo3383measureBRTryo04.getWidth()) / 2;
                        int i14 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getCurrentValue().ordinal()];
                        if (i14 == 1) {
                            height = i13 - mo3383measureBRTryo04.getHeight();
                        } else {
                            if (i14 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            height = m4395getMaxHeightimpl - mo3383measureBRTryo04.getHeight();
                        }
                        final int i15 = height;
                        final Placeable placeable2 = placeable;
                        final int i16 = height2;
                        return MeasureScope.layout$default(SubcomposeLayout, m4396getMaxWidthimpl, m4395getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, i16, 0.0f, 4, null);
                                Placeable placeable3 = placeable2;
                                if (placeable3 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable3, 0, 0, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, roundToInt, 0.0f, 4, null);
                                Placeable placeable4 = mo3383measureBRTryo03;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable4, i11, i13, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo04, width2, i15, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, startRestartGroup, 0, 1);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
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

            public final void invoke(Composer composer2, int i6) {
                BottomSheetScaffoldKt.m1266BottomSheetScaffoldLayoutKCBPh4w(function2, function3, function32, function22, function23, f, i, state, bottomSheetState, composer2, i2 | 1);
            }
        });
    }
}
