package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.braze.Constants;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Metadata;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0096\u0001\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0006\u0010#\u001a\u00020\u0014H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0096\u0001\u0010&\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020'2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001aA\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010!\u001a\u00020\u0019H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a \u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002H\u0002\u001a+\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00140\u000bH\u0007¢\u0006\u0002\u00108\u001a+\u00109\u001a\u00020'2\u0006\u00105\u001a\u00020:2\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00140\u000bH\u0007¢\u0006\u0002\u0010;\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomDrawerOpenFraction", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "EndDrawerPadding", "BottomDrawer", "", "drawerContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "Landroidx/compose/material/BottomDrawerState;", "gesturesEnabled", "", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "scrimColor", "content", "Lkotlin/Function0;", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawerScrim", "color", "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ModalDrawer", "Landroidx/compose/material/DrawerState;", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "pos", "rememberBottomDrawerState", "initialValue", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "rememberDrawerState", "Landroidx/compose/material/DrawerValue;", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float EndDrawerPadding = Dp.m4440constructorimpl(56);
    private static final float DrawerVelocityThreshold = Dp.m4440constructorimpl(400);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    public static final DrawerState rememberDrawerState(final DrawerValue initialValue, final Function1<? super DrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1435874229);
        ComposerKt.sourceInformation(composer, "C(rememberDrawerState)P(1)320@10387L125:Drawer.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(DrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m1729rememberSaveable(new Object[0], (Saver) DrawerState.INSTANCE.Saver(function1), (String) null, (Function0) new Function0<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DrawerState invoke() {
                return new DrawerState(DrawerValue.this, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return drawerState;
    }

    @ExperimentalMaterialApi
    public static final BottomDrawerState rememberBottomDrawerState(final BottomDrawerValue initialValue, final Function1<? super BottomDrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-598115156);
        ComposerKt.sourceInformation(composer, "C(rememberBottomDrawerState)P(1)337@10933L137:Drawer.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            function1 = new Function1<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BottomDrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m1729rememberSaveable(new Object[0], (Saver) BottomDrawerState.Companion.Saver(function1), (String) null, (Function0) new Function0<BottomDrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BottomDrawerState invoke() {
                return new BottomDrawerState(BottomDrawerValue.this, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /* renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1373ModalDrawerGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> drawerContent, Modifier modifier, DrawerState drawerState, boolean z, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        DrawerState drawerState3;
        final CornerBasedShape cornerBasedShape;
        long j4;
        long j5;
        final int i10;
        Modifier modifier3;
        final float f3;
        final long j6;
        long scrimColor;
        Object rememberedValue;
        Composer composer2;
        final long j7;
        final Shape shape3;
        final float f4;
        final long j8;
        final DrawerState drawerState4;
        final boolean z3;
        final Modifier modifier4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1305806945);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalDrawer)P(2,8,6,7,5,4:c#ui.unit.Dp,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9:c#ui.graphics.Color)376@12880L39,378@12997L6,380@13112L6,381@13160L38,382@13239L10,385@13307L24,386@13336L3205:Drawer.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(drawerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i15 = 256;
                        i3 |= i15;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i15 = 128;
                i3 |= i15;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i14 = 16384;
                            i3 |= i14;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i14 = 8192;
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            i6 = i16;
                            if (startRestartGroup.changed(j)) {
                                i13 = 1048576;
                                i3 |= i13;
                            }
                        } else {
                            i6 = i16;
                        }
                        i13 = 524288;
                        i3 |= i13;
                    } else {
                        i6 = i16;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0) {
                            i11 = i3;
                            if (startRestartGroup.changed(j2)) {
                                i12 = 8388608;
                                i7 = i11 | i12;
                            }
                        } else {
                            i11 = i3;
                        }
                        i12 = 4194304;
                        i7 = i11 | i12;
                    } else {
                        i7 = i3;
                    }
                    if ((234881024 & i) == 0) {
                        i7 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i8 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i7) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    i9 = -29360129;
                                    drawerState3 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                                    i7 &= -897;
                                } else {
                                    i9 = -29360129;
                                    drawerState3 = drawerState2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                    i7 &= -57345;
                                } else {
                                    cornerBasedShape = shape2;
                                }
                                float m1369getElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m1369getElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                    i7 &= -3670017;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 128) != 0) {
                                    j5 = ColorsKt.m1342contentColorForek8zF_U(j4, startRestartGroup, (i7 >> 18) & 14);
                                    i7 &= i9;
                                } else {
                                    j5 = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    Modifier modifier5 = companion;
                                    i10 = i7 & (-234881025);
                                    modifier3 = modifier5;
                                    f3 = m1369getElevationD9Ej5fM;
                                    j6 = j4;
                                    startRestartGroup.endDefaults();
                                    startRestartGroup.startReplaceableGroup(773894976);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                    startRestartGroup.endReplaceableGroup();
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                                    composer2 = startRestartGroup;
                                    final boolean z4 = z2;
                                    j7 = j5;
                                    Modifier modifier6 = modifier3;
                                    final DrawerState drawerState5 = drawerState3;
                                    final long j9 = scrimColor;
                                    BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default, null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i17) {
                                            int i18;
                                            float f5;
                                            Modifier m1530swipeablepPrIpRY;
                                            float f6;
                                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                            ComposerKt.sourceInformation(composer3, "C397@13855L7,398@13894L2641:Drawer.kt#jmzs0o");
                                            if ((i17 & 14) == 0) {
                                                i18 = i17 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                            } else {
                                                i18 = i17;
                                            }
                                            if ((i18 & 91) != 18 || !composer3.getSkipping()) {
                                                long mo521getConstraintsmsEJaDk = BoxWithConstraints.mo521getConstraintsmsEJaDk();
                                                if (!Constraints.m4392getHasBoundedWidthimpl(mo521getConstraintsmsEJaDk)) {
                                                    throw new IllegalStateException("Drawer shouldn't have infinite width");
                                                }
                                                final float f7 = -Constraints.m4396getMaxWidthimpl(mo521getConstraintsmsEJaDk);
                                                final float f8 = 0.0f;
                                                Map mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f7), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                boolean z5 = consume == LayoutDirection.Rtl;
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                SwipeableState<DrawerValue> swipeableState$material_release = DrawerState.this.getSwipeableState$material_release();
                                                Orientation orientation = Orientation.Horizontal;
                                                f5 = DrawerKt.DrawerVelocityThreshold;
                                                m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(companion2, swipeableState$material_release, mapOf, orientation, (r26 & 8) != 0 ? true : z4, (r26 & 16) != 0 ? false : z5, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final FixedThreshold invoke(T t, T t2) {
                                                        return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                    }
                                                } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
                                                        Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
                                                        Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
                                                        return new FractionalThreshold(0.5f);
                                                    }
                                                }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : f5);
                                                final DrawerState drawerState6 = DrawerState.this;
                                                final int i19 = i10;
                                                long j10 = j9;
                                                Shape shape4 = cornerBasedShape;
                                                long j11 = j6;
                                                long j12 = j7;
                                                float f9 = f3;
                                                Function2<Composer, Integer, Unit> function2 = content;
                                                final boolean z6 = z4;
                                                final CoroutineScope coroutineScope2 = coroutineScope;
                                                final Function3<ColumnScope, Composer, Integer, Unit> function3 = drawerContent;
                                                composer3.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer3.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) consume2;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer3.consume(localLayoutDirection2);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1530swipeablepPrIpRY);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(-1263168067);
                                                ComposerKt.sourceInformation(composer3, "C410@14358L45,423@14805L103,413@14416L542,428@14992L33,*430@15092L7,439@15556L55,429@15038L1487:Drawer.kt#jmzs0o");
                                                composer3.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer3.consume(localDensity2);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density2 = (Density) consume5;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume6 = composer3.consume(localLayoutDirection3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume7 = composer3.consume(localViewConfiguration2);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor2);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer3);
                                                Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(32495683);
                                                ComposerKt.sourceInformation(composer3, "C411@14380L9:Drawer.kt#jmzs0o");
                                                function2.invoke(composer3, Integer.valueOf((i19 >> 27) & 14));
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                boolean isOpen = drawerState6.isOpen();
                                                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
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
                                                        if (z6 && drawerState6.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(drawerState6, null), 3, null);
                                                        }
                                                    }

                                                    /* compiled from: Drawer.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ DrawerState $drawerState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$drawerState, continuation);
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
                                                                if (this.$drawerState.close(this) == coroutine_suspended) {
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
                                                };
                                                Object valueOf = Float.valueOf(f7);
                                                Object valueOf2 = Float.valueOf(0.0f);
                                                composer3.startReplaceableGroup(1618982084);
                                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                                boolean changed = composer3.changed(valueOf) | composer3.changed(valueOf2) | composer3.changed(drawerState6);
                                                Object rememberedValue2 = composer3.rememberedValue();
                                                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue2 = (Function0) new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Float invoke() {
                                                            float calculateFraction;
                                                            calculateFraction = DrawerKt.calculateFraction(f7, f8, drawerState6.getOffset().getValue().floatValue());
                                                            return Float.valueOf(calculateFraction);
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(rememberedValue2);
                                                }
                                                composer3.endReplaceableGroup();
                                                DrawerKt.m1374ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue2, j10, composer3, (i19 >> 15) & 7168);
                                                final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1515getNavigationMenuUdPEhr4(), composer3, 6);
                                                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume8 = composer3.consume(localDensity3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density3 = (Density) consume8;
                                                Modifier m637sizeInqDBjuR0 = SizeKt.m637sizeInqDBjuR0(Modifier.INSTANCE, density3.mo333toDpu2uoSUM(Constraints.m4398getMinWidthimpl(mo521getConstraintsmsEJaDk)), density3.mo333toDpu2uoSUM(Constraints.m4397getMinHeightimpl(mo521getConstraintsmsEJaDk)), density3.mo333toDpu2uoSUM(Constraints.m4396getMaxWidthimpl(mo521getConstraintsmsEJaDk)), density3.mo333toDpu2uoSUM(Constraints.m4395getMaxHeightimpl(mo521getConstraintsmsEJaDk)));
                                                composer3.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed2 = composer3.changed(drawerState6);
                                                Object rememberedValue3 = composer3.rememberedValue();
                                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                                            return IntOffset.m4559boximpl(m1383invokeBjo55l4(density4));
                                                        }

                                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                        public final long m1383invokeBjo55l4(Density offset) {
                                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                            return IntOffsetKt.IntOffset(MathKt.roundToInt(DrawerState.this.getOffset().getValue().floatValue()), 0);
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(rememberedValue3);
                                                }
                                                composer3.endReplaceableGroup();
                                                Modifier offset = OffsetKt.offset(m637sizeInqDBjuR0, (Function1) rememberedValue3);
                                                f6 = DrawerKt.EndDrawerPadding;
                                                int i20 = i19 >> 12;
                                                SurfaceKt.m1520SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m589paddingqDBjuR0$default(offset, 0.0f, 0.0f, f6, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                                                        SemanticsPropertiesKt.setPaneTitle(semantics, m1518getString4foXLRw);
                                                        if (drawerState6.isOpen()) {
                                                            final DrawerState drawerState7 = drawerState6;
                                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                                            SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (DrawerState.this.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00431(DrawerState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: Drawer.kt */
                                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {450}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                                                static final class C00431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ DrawerState $drawerState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C00431(DrawerState drawerState, Continuation<? super C00431> continuation) {
                                                                        super(2, continuation);
                                                                        this.$drawerState = drawerState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new C00431(this.$drawerState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((C00431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$drawerState.close(this) == coroutine_suspended) {
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
                                                }, 1, null), shape4, j11, j12, null, f9, ComposableLambdaKt.composableLambda(composer3, -1941234439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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

                                                    public final void invoke(Composer composer4, int i21) {
                                                        ComposerKt.sourceInformation(composer4, "C459@16456L55:Drawer.kt#jmzs0o");
                                                        if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                        int i22 = ((i19 << 9) & 7168) | 6;
                                                        composer4.startReplaceableGroup(-483455358);
                                                        ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume9 = composer4.consume(localDensity4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        Density density4 = (Density) consume9;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume10 = composer4.consume(localLayoutDirection4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume10;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume11 = composer4.consume(localViewConfiguration3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume11;
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(fillMaxSize$default2);
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor3);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        composer4.disableReusing();
                                                        Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer4);
                                                        Updater.m1649setimpl(m1642constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl3, density4, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-1163856341);
                                                        ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                                                        function32.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                    }
                                                }), composer3, ((i19 >> 9) & 112) | 1572864 | (i20 & 896) | (i20 & 7168) | (458752 & i19), 16);
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 3072, 6);
                                    shape3 = cornerBasedShape;
                                    f4 = f3;
                                    j8 = j9;
                                    drawerState4 = drawerState5;
                                    z3 = z4;
                                    modifier4 = modifier6;
                                } else {
                                    Modifier modifier7 = companion;
                                    i10 = i7;
                                    modifier3 = modifier7;
                                    f3 = m1369getElevationD9Ej5fM;
                                    j6 = j4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i7 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i7 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i7 &= -234881025;
                                }
                                j5 = j2;
                                i10 = i7;
                                modifier3 = modifier2;
                                drawerState3 = drawerState2;
                                cornerBasedShape = shape2;
                                f3 = f2;
                                j6 = j;
                            }
                            scrimColor = j3;
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            composer2 = startRestartGroup;
                            final boolean z42 = z2;
                            j7 = j5;
                            Modifier modifier62 = modifier3;
                            final DrawerState drawerState52 = drawerState3;
                            final long j92 = scrimColor;
                            BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default2, null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i17) {
                                    int i18;
                                    float f5;
                                    Modifier m1530swipeablepPrIpRY;
                                    float f6;
                                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                    ComposerKt.sourceInformation(composer3, "C397@13855L7,398@13894L2641:Drawer.kt#jmzs0o");
                                    if ((i17 & 14) == 0) {
                                        i18 = i17 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                    } else {
                                        i18 = i17;
                                    }
                                    if ((i18 & 91) != 18 || !composer3.getSkipping()) {
                                        long mo521getConstraintsmsEJaDk = BoxWithConstraints.mo521getConstraintsmsEJaDk();
                                        if (!Constraints.m4392getHasBoundedWidthimpl(mo521getConstraintsmsEJaDk)) {
                                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                                        }
                                        final float f7 = -Constraints.m4396getMaxWidthimpl(mo521getConstraintsmsEJaDk);
                                        final float f8 = 0.0f;
                                        Map mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f7), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        boolean z5 = consume == LayoutDirection.Rtl;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        SwipeableState<DrawerValue> swipeableState$material_release = DrawerState.this.getSwipeableState$material_release();
                                        Orientation orientation = Orientation.Horizontal;
                                        f5 = DrawerKt.DrawerVelocityThreshold;
                                        m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(companion2, swipeableState$material_release, mapOf, orientation, (r26 & 8) != 0 ? true : z42, (r26 & 16) != 0 ? false : z5, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final FixedThreshold invoke(T t, T t2) {
                                                return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                            }
                                        } : new Function2<DrawerValue, DrawerValue, ThresholdConfig>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
                                                Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
                                                Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
                                                return new FractionalThreshold(0.5f);
                                            }
                                        }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : f5);
                                        final DrawerState drawerState6 = DrawerState.this;
                                        final int i19 = i10;
                                        long j10 = j92;
                                        Shape shape4 = cornerBasedShape;
                                        long j11 = j6;
                                        long j12 = j7;
                                        float f9 = f3;
                                        Function2<Composer, Integer, Unit> function2 = content;
                                        final boolean z6 = z42;
                                        final CoroutineScope coroutineScope22 = coroutineScope2;
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3 = drawerContent;
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume2;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localLayoutDirection2);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1530swipeablepPrIpRY);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-1263168067);
                                        ComposerKt.sourceInformation(composer3, "C410@14358L45,423@14805L103,413@14416L542,428@14992L33,*430@15092L7,439@15556L55,429@15038L1487:Drawer.kt#jmzs0o");
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer3.consume(localDensity2);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density2 = (Density) consume5;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume6 = composer3.consume(localLayoutDirection3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume7 = composer3.consume(localViewConfiguration2);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer3);
                                        Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(32495683);
                                        ComposerKt.sourceInformation(composer3, "C411@14380L9:Drawer.kt#jmzs0o");
                                        function2.invoke(composer3, Integer.valueOf((i19 >> 27) & 14));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        boolean isOpen = drawerState6.isOpen();
                                        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
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
                                                if (z6 && drawerState6.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(drawerState6, null), 3, null);
                                                }
                                            }

                                            /* compiled from: Drawer.kt */
                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$drawerState, continuation);
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
                                                        if (this.$drawerState.close(this) == coroutine_suspended) {
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
                                        };
                                        Object valueOf = Float.valueOf(f7);
                                        Object valueOf2 = Float.valueOf(0.0f);
                                        composer3.startReplaceableGroup(1618982084);
                                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                        boolean changed = composer3.changed(valueOf) | composer3.changed(valueOf2) | composer3.changed(drawerState6);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = (Function0) new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Float invoke() {
                                                    float calculateFraction;
                                                    calculateFraction = DrawerKt.calculateFraction(f7, f8, drawerState6.getOffset().getValue().floatValue());
                                                    return Float.valueOf(calculateFraction);
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue2);
                                        }
                                        composer3.endReplaceableGroup();
                                        DrawerKt.m1374ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue2, j10, composer3, (i19 >> 15) & 7168);
                                        final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1515getNavigationMenuUdPEhr4(), composer3, 6);
                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume8 = composer3.consume(localDensity3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density3 = (Density) consume8;
                                        Modifier m637sizeInqDBjuR0 = SizeKt.m637sizeInqDBjuR0(Modifier.INSTANCE, density3.mo333toDpu2uoSUM(Constraints.m4398getMinWidthimpl(mo521getConstraintsmsEJaDk)), density3.mo333toDpu2uoSUM(Constraints.m4397getMinHeightimpl(mo521getConstraintsmsEJaDk)), density3.mo333toDpu2uoSUM(Constraints.m4396getMaxWidthimpl(mo521getConstraintsmsEJaDk)), density3.mo333toDpu2uoSUM(Constraints.m4395getMaxHeightimpl(mo521getConstraintsmsEJaDk)));
                                        composer3.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                        boolean changed2 = composer3.changed(drawerState6);
                                        Object rememberedValue3 = composer3.rememberedValue();
                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density4) {
                                                    return IntOffset.m4559boximpl(m1383invokeBjo55l4(density4));
                                                }

                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                public final long m1383invokeBjo55l4(Density offset) {
                                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(DrawerState.this.getOffset().getValue().floatValue()), 0);
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue3);
                                        }
                                        composer3.endReplaceableGroup();
                                        Modifier offset = OffsetKt.offset(m637sizeInqDBjuR0, (Function1) rememberedValue3);
                                        f6 = DrawerKt.EndDrawerPadding;
                                        int i20 = i19 >> 12;
                                        SurfaceKt.m1520SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m589paddingqDBjuR0$default(offset, 0.0f, 0.0f, f6, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                                                SemanticsPropertiesKt.setPaneTitle(semantics, m1518getString4foXLRw);
                                                if (drawerState6.isOpen()) {
                                                    final DrawerState drawerState7 = drawerState6;
                                                    final CoroutineScope coroutineScope3 = coroutineScope22;
                                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (DrawerState.this.getSwipeableState$material_release().getConfirmStateChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00431(DrawerState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: Drawer.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", i = {}, l = {450}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                                        static final class C00431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ DrawerState $drawerState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            C00431(DrawerState drawerState, Continuation<? super C00431> continuation) {
                                                                super(2, continuation);
                                                                this.$drawerState = drawerState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new C00431(this.$drawerState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((C00431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$drawerState.close(this) == coroutine_suspended) {
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
                                        }, 1, null), shape4, j11, j12, null, f9, ComposableLambdaKt.composableLambda(composer3, -1941234439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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

                                            public final void invoke(Composer composer4, int i21) {
                                                ComposerKt.sourceInformation(composer4, "C459@16456L55:Drawer.kt#jmzs0o");
                                                if ((i21 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                int i22 = ((i19 << 9) & 7168) | 6;
                                                composer4.startReplaceableGroup(-483455358);
                                                ComposerKt.sourceInformation(composer4, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume9 = composer4.consume(localDensity4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Density density4 = (Density) consume9;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume10 = composer4.consume(localLayoutDirection4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                LayoutDirection layoutDirection3 = (LayoutDirection) consume10;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume11 = composer4.consume(localViewConfiguration3);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume11;
                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(fillMaxSize$default22);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composer4.disableReusing();
                                                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer4);
                                                Updater.m1649setimpl(m1642constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl3, density4, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-1163856341);
                                                ComposerKt.sourceInformation(composer4, "C79@3994L9:Column.kt#2w3rfo");
                                                function32.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                            }
                                        }), composer3, ((i19 >> 9) & 112) | 1572864 | (i20 & 896) | (i20 & 7168) | (458752 & i19), 16);
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 3072, 6);
                            shape3 = cornerBasedShape;
                            f4 = f3;
                            j8 = j92;
                            drawerState4 = drawerState52;
                            z3 = z42;
                            modifier4 = modifier62;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            j8 = j3;
                            composer2 = startRestartGroup;
                            modifier4 = modifier2;
                            drawerState4 = drawerState2;
                            z3 = z2;
                            shape3 = shape2;
                            f4 = f2;
                            j6 = j;
                            j7 = j2;
                        }
                        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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

                            public final void invoke(Composer composer3, int i17) {
                                DrawerKt.m1373ModalDrawerGs3lGvM(drawerContent, modifier4, drawerState4, z3, shape3, f4, j6, j7, j8, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i7 |= i8;
                    if ((1533916891 & i7) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                }
                f2 = f;
                if ((3670016 & i) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((234881024 & i) == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i7 |= i8;
                if ((1533916891 & i7) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((3670016 & i) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((234881024 & i) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i7 |= i8;
            if ((1533916891 & i7) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((234881024 & i) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i7 |= i8;
        if ((1533916891 & i7) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3  */
    @ExperimentalMaterialApi
    /* renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1370BottomDrawerGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> drawerContent, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BottomDrawerState bottomDrawerState2;
        int i4;
        boolean z2;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        int i7;
        long j4;
        int i8;
        BottomDrawerState bottomDrawerState3;
        CornerBasedShape cornerBasedShape;
        long j5;
        long j6;
        int i9;
        Modifier modifier3;
        float f3;
        long j7;
        Object rememberedValue;
        Composer composer2;
        final boolean z3;
        final BottomDrawerState bottomDrawerState4;
        final Modifier modifier4;
        long j8;
        final Shape shape3;
        final long j9;
        final long j10;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(625649286);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomDrawer)P(2,8,6,7,5,4:c#ui.unit.Dp,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9:c#ui.graphics.Color)499@18420L51,501@18549L6,503@18664L6,504@18712L38,505@18791L10,508@18859L24,510@18889L3335:Drawer.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(drawerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    bottomDrawerState2 = bottomDrawerState;
                    if (startRestartGroup.changed(bottomDrawerState2)) {
                        i14 = 256;
                        i3 |= i14;
                    }
                } else {
                    bottomDrawerState2 = bottomDrawerState;
                }
                i14 = 128;
                i3 |= i14;
            } else {
                bottomDrawerState2 = bottomDrawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i13 = 8192;
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            i6 = i15;
                            if (startRestartGroup.changed(j)) {
                                i12 = 1048576;
                                i3 |= i12;
                            }
                        } else {
                            i6 = i15;
                        }
                        i12 = 524288;
                        i3 |= i12;
                    } else {
                        i6 = i15;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0) {
                            i10 = i3;
                            if (startRestartGroup.changed(j2)) {
                                i11 = 8388608;
                                i7 = i10 | i11;
                            }
                        } else {
                            i10 = i3;
                        }
                        i11 = 4194304;
                        i7 = i10 | i11;
                    } else {
                        i7 = i3;
                    }
                    if ((234881024 & i) != 0) {
                        j4 = j3;
                        i7 |= ((i2 & 256) == 0 && startRestartGroup.changed(j4)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    } else {
                        j4 = j3;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i8 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i7) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    bottomDrawerState3 = rememberBottomDrawerState(BottomDrawerValue.Closed, null, startRestartGroup, 6, 2);
                                    i7 &= -897;
                                } else {
                                    bottomDrawerState3 = bottomDrawerState2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                    i7 &= -57345;
                                } else {
                                    cornerBasedShape = shape2;
                                }
                                float m1369getElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m1369getElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                    i7 &= -3670017;
                                } else {
                                    j5 = j;
                                }
                                if ((i2 & 128) != 0) {
                                    j6 = ColorsKt.m1342contentColorForek8zF_U(j5, startRestartGroup, (i7 >> 18) & 14);
                                    i7 &= -29360129;
                                } else {
                                    j6 = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    j4 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    i7 &= -234881025;
                                }
                                Modifier modifier5 = companion;
                                i9 = i7;
                                modifier3 = modifier5;
                                f3 = m1369getElevationD9Ej5fM;
                                j7 = j5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i7 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i7 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i7 &= -234881025;
                                }
                                j6 = j2;
                                i9 = i7;
                                modifier3 = modifier2;
                                bottomDrawerState3 = bottomDrawerState2;
                                cornerBasedShape = shape2;
                                f3 = f2;
                                j7 = j;
                            }
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            long j11 = j6;
                            Modifier modifier6 = modifier3;
                            boolean z4 = z2;
                            composer2 = startRestartGroup;
                            BottomDrawerState bottomDrawerState5 = bottomDrawerState3;
                            long j12 = j4;
                            BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default, null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z4, bottomDrawerState5, content, i9, j12, cornerBasedShape, j7, j11, f3, coroutineScope, drawerContent)), composer2, 3072, 6);
                            z3 = z4;
                            bottomDrawerState4 = bottomDrawerState5;
                            modifier4 = modifier6;
                            j8 = j12;
                            shape3 = cornerBasedShape;
                            j9 = j7;
                            j10 = j11;
                            f4 = f3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            j8 = j4;
                            shape3 = shape2;
                            composer2 = startRestartGroup;
                            modifier4 = modifier2;
                            bottomDrawerState4 = bottomDrawerState2;
                            z3 = z2;
                            f4 = f2;
                            j9 = j;
                            j10 = j2;
                        }
                        final long j13 = j8;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
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

                            public final void invoke(Composer composer3, int i16) {
                                DrawerKt.m1370BottomDrawerGs3lGvM(drawerContent, modifier4, bottomDrawerState4, z3, shape3, f4, j9, j10, j13, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i7 |= i8;
                    if ((1533916891 & i7) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    Modifier modifier52 = companion;
                    i9 = i7;
                    modifier3 = modifier52;
                    f3 = m1369getElevationD9Ej5fM;
                    j7 = j5;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    long j112 = j6;
                    Modifier modifier62 = modifier3;
                    boolean z42 = z2;
                    composer2 = startRestartGroup;
                    BottomDrawerState bottomDrawerState52 = bottomDrawerState3;
                    long j122 = j4;
                    BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default2, null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z42, bottomDrawerState52, content, i9, j122, cornerBasedShape, j7, j112, f3, coroutineScope2, drawerContent)), composer2, 3072, 6);
                    z3 = z42;
                    bottomDrawerState4 = bottomDrawerState52;
                    modifier4 = modifier62;
                    j8 = j122;
                    shape3 = cornerBasedShape;
                    j9 = j7;
                    j10 = j112;
                    f4 = f3;
                    final long j132 = j8;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f2 = f;
                if ((3670016 & i) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((234881024 & i) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i7 |= i8;
                if ((1533916891 & i7) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                Modifier modifier522 = companion;
                i9 = i7;
                modifier3 = modifier522;
                f3 = m1369getElevationD9Ej5fM;
                j7 = j5;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                long j1122 = j6;
                Modifier modifier622 = modifier3;
                boolean z422 = z2;
                composer2 = startRestartGroup;
                BottomDrawerState bottomDrawerState522 = bottomDrawerState3;
                long j1222 = j4;
                BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default22, null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z422, bottomDrawerState522, content, i9, j1222, cornerBasedShape, j7, j1122, f3, coroutineScope22, drawerContent)), composer2, 3072, 6);
                z3 = z422;
                bottomDrawerState4 = bottomDrawerState522;
                modifier4 = modifier622;
                j8 = j1222;
                shape3 = cornerBasedShape;
                j9 = j7;
                j10 = j1122;
                f4 = f3;
                final long j1322 = j8;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((3670016 & i) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((234881024 & i) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i7 |= i8;
            if ((1533916891 & i7) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            Modifier modifier5222 = companion;
            i9 = i7;
            modifier3 = modifier5222;
            f3 = m1369getElevationD9Ej5fM;
            j7 = j5;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            long j11222 = j6;
            Modifier modifier6222 = modifier3;
            boolean z4222 = z2;
            composer2 = startRestartGroup;
            BottomDrawerState bottomDrawerState5222 = bottomDrawerState3;
            long j12222 = j4;
            BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default222, null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z4222, bottomDrawerState5222, content, i9, j12222, cornerBasedShape, j7, j11222, f3, coroutineScope222, drawerContent)), composer2, 3072, 6);
            z3 = z4222;
            bottomDrawerState4 = bottomDrawerState5222;
            modifier4 = modifier6222;
            j8 = j12222;
            shape3 = cornerBasedShape;
            j9 = j7;
            j10 = j11222;
            f4 = f3;
            final long j13222 = j8;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i7 |= i8;
        if ((1533916891 & i7) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        Modifier modifier52222 = companion;
        i9 = i7;
        modifier3 = modifier52222;
        f3 = m1369getElevationD9Ej5fM;
        j7 = j5;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        long j112222 = j6;
        Modifier modifier62222 = modifier3;
        boolean z42222 = z2;
        composer2 = startRestartGroup;
        BottomDrawerState bottomDrawerState52222 = bottomDrawerState3;
        long j122222 = j4;
        BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default2222, null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z42222, bottomDrawerState52222, content, i9, j122222, cornerBasedShape, j7, j112222, f3, coroutineScope2222, drawerContent)), composer2, 3072, 6);
        z3 = z42222;
        bottomDrawerState4 = bottomDrawerState52222;
        modifier4 = modifier62222;
        j8 = j122222;
        shape3 = cornerBasedShape;
        j9 = j7;
        j10 = j112222;
        f4 = f3;
        final long j132222 = j8;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m1371BottomDrawerScrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomDrawerScrim)P(0:c#ui.graphics.Color)625@22930L121,629@23078L30,647@23631L62,643@23522L171:Drawer.kt#jmzs0o");
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
            final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1511getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1298949409);
            ComposerKt.sourceInformation(startRestartGroup, "632@23216L73,635@23342L122");
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                DrawerKt$BottomDrawerScrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m1518getString4foXLRw) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
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
                            final Function0<Unit> function02 = function0;
                            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    function02.invoke();
                                    return true;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                companion = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
            Color m2102boximpl = Color.m2102boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(m2102boximpl) | startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
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
                        float m1372BottomDrawerScrim_3J_VO9M$lambda0;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m1372BottomDrawerScrim_3J_VO9M$lambda0 = DrawerKt.m1372BottomDrawerScrim_3J_VO9M$lambda0(animateFloatAsState);
                        DrawScope.m2657drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m1372BottomDrawerScrim_3J_VO9M$lambda0, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$2
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
                DrawerKt.m1371BottomDrawerScrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m1374ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function02, final long j, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)660@23848L30,676@24292L51,672@24201L142:Drawer.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function02) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1511getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010554047);
            ComposerKt.sourceInformation(startRestartGroup, "663@23967L35,664@24051L108");
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                DrawerKt$Scrim$dismissDrawer$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m1518getString4foXLRw) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
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
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return true;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                companion = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
            Color m2102boximpl = Color.m2102boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(m2102boximpl) | startRestartGroup.changed(function02);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
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
                        DrawScope.m2657drawRectnJ9OG0$default(Canvas, j, 0L, 0L, function02.invoke().floatValue(), null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
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
                DrawerKt.m1374ScrimBx497Mc(z, function0, function02, j, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomDrawerScrim_3J_VO9M$lambda-0, reason: not valid java name */
    public static final float m1372BottomDrawerScrim_3J_VO9M$lambda0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
