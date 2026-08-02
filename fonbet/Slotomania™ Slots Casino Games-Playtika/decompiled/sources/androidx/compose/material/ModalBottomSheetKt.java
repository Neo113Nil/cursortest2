package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u0003H\u0007¢\u0006\u0002\u0010%\u001aC\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001b2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u0003H\u0007¢\u0006\u0002\u0010'\u001a,\u0010(\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010)\u001a\u00020#2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0+H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"ModalBottomSheetLayout", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-BzaUkTc", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "color", "onDismiss", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "bottomSheetSwipeable", "fullHeight", "sheetHeightState", "Landroidx/compose/runtime/State;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(final ModalBottomSheetValue initialValue, final AnimationSpec<Float> animationSpec, final boolean z, final Function1<? super ModalBottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-409288536);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2!1,3)245@9606L533:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m1729rememberSaveable(new Object[]{initialValue, animationSpec, Boolean.valueOf(z), function1}, (Saver) ModalBottomSheetState.INSTANCE.Saver(animationSpec, z, function1), (String) null, (Function0) new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ModalBottomSheetState invoke() {
                return new ModalBottomSheetState(ModalBottomSheetValue.this, animationSpec, z, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1928569212);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2)275@10738L174:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$3
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, false, function1, composer, (i & 14) | 448 | ((i << 3) & 7168), 0);
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    @ExperimentalMaterialApi
    /* renamed from: ModalBottomSheetLayout-BzaUkTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1437ModalBottomSheetLayoutBzaUkTc(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> sheetContent, Modifier modifier, ModalBottomSheetState modalBottomSheetState, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        int i4;
        float f2;
        long j4;
        final long j5;
        long j6;
        int i5;
        int i6;
        Composer composer2;
        ModalBottomSheetState modalBottomSheetState2;
        CornerBasedShape cornerBasedShape;
        long j7;
        long j8;
        Modifier modifier2;
        final ModalBottomSheetState modalBottomSheetState3;
        final int i7;
        final float f3;
        final long j9;
        Object rememberedValue;
        final long j10;
        Composer composer3;
        final float f4;
        final Modifier modifier3;
        final Shape shape3;
        final ModalBottomSheetState modalBottomSheetState4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1633763156);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetLayout)P(4,1,8,7,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color)316@12777L37,317@12854L6,319@12977L6,320@13024L37,321@13112L10,324@13180L24,325@13209L2723:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(sheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(modalBottomSheetState)) {
                    i9 = 256;
                    i3 |= i9;
                }
                i9 = 128;
                i3 |= i9;
            }
            if ((i & 7168) != 0) {
                shape2 = shape;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(shape2)) ? 2048 : 1024;
            } else {
                shape2 = shape;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                f2 = f;
            } else {
                f2 = f;
                if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                }
            }
            if ((458752 & i) != 0) {
                j4 = j;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
            } else {
                j4 = j;
            }
            if ((3670016 & i) != 0) {
                if ((i2 & 64) == 0) {
                    j5 = j2;
                    if (startRestartGroup.changed(j5)) {
                        i8 = 1048576;
                        i3 |= i8;
                    }
                } else {
                    j5 = j2;
                }
                i8 = 524288;
                i3 |= i8;
            } else {
                j5 = j2;
            }
            if ((i & 29360128) != 0) {
                j6 = j3;
                i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j6)) ? 8388608 : 4194304;
            } else {
                j6 = j3;
            }
            int i11 = i3;
            if ((i2 & 256) == 0) {
                i6 = 100663296;
            } else {
                if ((234881024 & i) != 0) {
                    i5 = i11;
                    if ((i5 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 4) != 0) {
                                modalBottomSheetState2 = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, startRestartGroup, 6, 6);
                                composer2 = startRestartGroup;
                                i5 &= -897;
                            } else {
                                composer2 = startRestartGroup;
                                modalBottomSheetState2 = modalBottomSheetState;
                            }
                            if ((i2 & 8) != 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(composer2, 6).getLarge();
                                i5 &= -7169;
                            } else {
                                cornerBasedShape = shape2;
                            }
                            float m1436getElevationD9Ej5fM = i4 != 0 ? ModalBottomSheetDefaults.INSTANCE.m1436getElevationD9Ej5fM() : f2;
                            if ((i2 & 32) != 0) {
                                j7 = MaterialTheme.INSTANCE.getColors(composer2, 6).m1328getSurface0d7_KjU();
                                i5 &= -458753;
                            } else {
                                j7 = j4;
                            }
                            if ((i2 & 64) != 0) {
                                j8 = ColorsKt.m1342contentColorForek8zF_U(j7, composer2, (i5 >> 15) & 14);
                                i5 &= -3670017;
                            } else {
                                j8 = j2;
                            }
                            if ((i2 & 128) != 0) {
                                f3 = m1436getElevationD9Ej5fM;
                                j5 = j8;
                                j9 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composer2, 6);
                                j4 = j7;
                                modifier2 = companion;
                                modalBottomSheetState3 = modalBottomSheetState2;
                                i7 = i5 & (-29360129);
                            } else {
                                modifier2 = companion;
                                modalBottomSheetState3 = modalBottomSheetState2;
                                j4 = j7;
                                i7 = i5;
                                f3 = m1436getElevationD9Ej5fM;
                                j5 = j8;
                                j9 = j3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            cornerBasedShape = shape2;
                            f3 = f2;
                            j9 = j6;
                            modifier2 = modifier;
                            modalBottomSheetState3 = modalBottomSheetState;
                            i7 = i5;
                            composer2 = startRestartGroup;
                        }
                        composer2.endDefaults();
                        composer2.startReplaceableGroup(773894976);
                        ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        composer2.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        j10 = j4;
                        Composer composer4 = composer2;
                        final Shape shape4 = cornerBasedShape;
                        Modifier modifier4 = modifier2;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.composableLambda(composer4, 1607356310, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer5, Integer num) {
                                invoke(boxWithConstraintsScope, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer5, int i12) {
                                int i13;
                                Modifier bottomSheetSwipeable;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                ComposerKt.sourceInformation(composer5, "C327@13328L41,328@13378L384,344@13922L434,355@14475L89,340@13771L2155:ModalBottomSheet.kt#jmzs0o");
                                if ((i12 & 14) == 0) {
                                    i13 = i12 | (composer5.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i13 = i12;
                                }
                                if ((i13 & 91) != 18 || !composer5.getSkipping()) {
                                    final float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(BoxWithConstraints.mo521getConstraintsmsEJaDk());
                                    composer5.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue2 = composer5.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                        composer5.updateRememberedValue(rememberedValue2);
                                    }
                                    composer5.endReplaceableGroup();
                                    final MutableState mutableState = (MutableState) rememberedValue2;
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    int i14 = i7;
                                    long j11 = j9;
                                    final ModalBottomSheetState modalBottomSheetState5 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    composer5.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = composer5.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    Density density = (Density) consume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer5.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer5.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
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
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer5.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    composer5.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(-402723888);
                                    ComposerKt.sourceInformation(composer5, "C329@13420L9,330@13442L310:ModalBottomSheet.kt#jmzs0o");
                                    function2.invoke(composer5, Integer.valueOf((i14 >> 24) & 14));
                                    ModalBottomSheetKt.m1438Scrim3JVO9M(j11, new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
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
                                            if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                            }
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                                    if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                    }, modalBottomSheetState5.getTargetValue() != ModalBottomSheetValue.Hidden, composer5, (i14 >> 21) & 14);
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                                    Object obj = ModalBottomSheetState.this;
                                    Object valueOf = Float.valueOf(m4395getMaxHeightimpl);
                                    final ModalBottomSheetState modalBottomSheetState6 = ModalBottomSheetState.this;
                                    composer5.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer5, "C(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean changed = composer5.changed(obj) | composer5.changed(valueOf);
                                    Object rememberedValue3 = composer5.rememberedValue();
                                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                                return IntOffset.m4559boximpl(m1442invokeBjo55l4(density2));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m1442invokeBjo55l4(Density offset) {
                                                int roundToInt;
                                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                if (ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                                    roundToInt = MathKt.roundToInt(m4395getMaxHeightimpl);
                                                } else {
                                                    roundToInt = MathKt.roundToInt(ModalBottomSheetState.this.getOffset().getValue().floatValue());
                                                }
                                                return IntOffsetKt.IntOffset(0, roundToInt);
                                            }
                                        };
                                        composer5.updateRememberedValue(rememberedValue3);
                                    }
                                    composer5.endReplaceableGroup();
                                    bottomSheetSwipeable = ModalBottomSheetKt.bottomSheetSwipeable(OffsetKt.offset(nestedScroll$default, (Function1) rememberedValue3), ModalBottomSheetState.this, m4395getMaxHeightimpl, mutableState);
                                    composer5.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed2 = composer5.changed(mutableState);
                                    Object rememberedValue4 = composer5.rememberedValue();
                                    if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                invoke2(layoutCoordinates);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(LayoutCoordinates it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                mutableState.setValue(Float.valueOf(IntSize.m4609getHeightimpl(it.mo3390getSizeYbymL2g())));
                                            }
                                        };
                                        composer5.updateRememberedValue(rememberedValue4);
                                    }
                                    composer5.endReplaceableGroup();
                                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (Function1) rememberedValue4);
                                    final ModalBottomSheetState modalBottomSheetState7 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope3 = coroutineScope;
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                                            if (ModalBottomSheetState.this.isVisible()) {
                                                final ModalBottomSheetState modalBottomSheetState8 = ModalBottomSheetState.this;
                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00471(ModalBottomSheetState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                                    static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C00471(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00471> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = modalBottomSheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C00471(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                                if (ModalBottomSheetState.this.getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                                    final ModalBottomSheetState modalBottomSheetState9 = ModalBottomSheetState.this;
                                                    final CoroutineScope coroutineScope5 = coroutineScope3;
                                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: ModalBottomSheet.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$sheetState = modalBottomSheetState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                                                    if (this.$sheetState.expand$material_release(this) == coroutine_suspended) {
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
                                                } else if (ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                                    final ModalBottomSheetState modalBottomSheetState10 = ModalBottomSheetState.this;
                                                    final CoroutineScope coroutineScope6 = coroutineScope3;
                                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: ModalBottomSheet.kt */
                                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$sheetState = modalBottomSheetState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                                                    if (this.$sheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                                        }
                                    }, 1, null);
                                    Shape shape5 = shape4;
                                    long j12 = j10;
                                    long j13 = j5;
                                    float f5 = f3;
                                    final Function3<ColumnScope, Composer, Integer, Unit> function3 = sheetContent;
                                    final int i15 = i7;
                                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            invoke(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer6, int i16) {
                                            ComposerKt.sourceInformation(composer6, "C388@15886L30:ModalBottomSheet.kt#jmzs0o");
                                            if ((i16 & 11) == 2 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                            int i17 = (i15 << 9) & 7168;
                                            composer6.startReplaceableGroup(-483455358);
                                            ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                            composer6.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer6.consume(localDensity2);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            Density density2 = (Density) consume4;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer6.consume(localLayoutDirection2);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume6 = composer6.consume(localViewConfiguration2);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion2);
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor2);
                                            } else {
                                                composer6.useNode();
                                            }
                                            composer6.disableReusing();
                                            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer6);
                                            Updater.m1649setimpl(m1642constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer6.enableReusing();
                                            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            composer6.startReplaceableGroup(-1163856341);
                                            ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                            function32.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i17 >> 6) & 112) | 6));
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                        }
                                    });
                                    int i16 = i7;
                                    SurfaceKt.m1520SurfaceFjzlyU(semantics$default, shape5, j12, j13, null, f5, composableLambda, composer5, ((i16 >> 6) & 112) | 1572864 | ((i16 >> 9) & 896) | ((i16 >> 9) & 7168) | ((i16 << 3) & 458752), 16);
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }), composer4, ((i7 >> 3) & 14) | 3072, 6);
                        composer3 = composer4;
                        f4 = f3;
                        modifier3 = modifier4;
                        shape3 = shape4;
                        modalBottomSheetState4 = modalBottomSheetState3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j10 = j4;
                        composer3 = startRestartGroup;
                        f4 = f2;
                        j9 = j6;
                        shape3 = shape2;
                        modifier3 = modifier;
                        modalBottomSheetState4 = modalBottomSheetState;
                    }
                    final long j11 = j5;
                    final long j12 = j10;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
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

                        public final void invoke(Composer composer5, int i12) {
                            ModalBottomSheetKt.m1437ModalBottomSheetLayoutBzaUkTc(sheetContent, modifier3, modalBottomSheetState4, shape3, f4, j12, j11, j9, content, composer5, i | 1, i2);
                        }
                    });
                    return;
                }
                i6 = startRestartGroup.changed(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i5 = i11 | i6;
            if ((i5 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            composer2.endDefaults();
            composer2.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            composer2.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
            rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composer2.endReplaceableGroup();
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer2.endReplaceableGroup();
            j10 = j4;
            Composer composer42 = composer2;
            final Shape shape42 = cornerBasedShape;
            Modifier modifier42 = modifier2;
            BoxWithConstraintsKt.BoxWithConstraints(modifier42, null, false, ComposableLambdaKt.composableLambda(composer42, 1607356310, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer5, Integer num) {
                    invoke(boxWithConstraintsScope, composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer5, int i12) {
                    int i13;
                    Modifier bottomSheetSwipeable;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    ComposerKt.sourceInformation(composer5, "C327@13328L41,328@13378L384,344@13922L434,355@14475L89,340@13771L2155:ModalBottomSheet.kt#jmzs0o");
                    if ((i12 & 14) == 0) {
                        i13 = i12 | (composer5.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i13 = i12;
                    }
                    if ((i13 & 91) != 18 || !composer5.getSkipping()) {
                        final float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(BoxWithConstraints.mo521getConstraintsmsEJaDk());
                        composer5.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                        Object rememberedValue2 = composer5.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composer5.updateRememberedValue(rememberedValue2);
                        }
                        composer5.endReplaceableGroup();
                        final MutableState<Float> mutableState = (MutableState) rememberedValue2;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i14 = i7;
                        long j112 = j9;
                        final ModalBottomSheetState modalBottomSheetState5 = ModalBottomSheetState.this;
                        final CoroutineScope coroutineScope22 = coroutineScope2;
                        composer5.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                        composer5.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer5.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        Density density = (Density) consume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer5.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer5.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
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
                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer5.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                        composer5.startReplaceableGroup(2058660585);
                        composer5.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer5.startReplaceableGroup(-402723888);
                        ComposerKt.sourceInformation(composer5, "C329@13420L9,330@13442L310:ModalBottomSheet.kt#jmzs0o");
                        function2.invoke(composer5, Integer.valueOf((i14 >> 24) & 14));
                        ModalBottomSheetKt.m1438Scrim3JVO9M(j112, new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
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
                                if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                }
                            }

                            /* compiled from: ModalBottomSheet.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$sheetState, continuation);
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
                                        if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                        }, modalBottomSheetState5.getTargetValue() != ModalBottomSheetValue.Hidden, composer5, (i14 >> 21) & 14);
                        composer5.endReplaceableGroup();
                        composer5.endReplaceableGroup();
                        composer5.endReplaceableGroup();
                        composer5.endNode();
                        composer5.endReplaceableGroup();
                        composer5.endReplaceableGroup();
                        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                        Object obj = ModalBottomSheetState.this;
                        Object valueOf = Float.valueOf(m4395getMaxHeightimpl);
                        final ModalBottomSheetState modalBottomSheetState6 = ModalBottomSheetState.this;
                        composer5.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer5, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed = composer5.changed(obj) | composer5.changed(valueOf);
                        Object rememberedValue3 = composer5.rememberedValue();
                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                    return IntOffset.m4559boximpl(m1442invokeBjo55l4(density2));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1442invokeBjo55l4(Density offset) {
                                    int roundToInt;
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    if (ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                        roundToInt = MathKt.roundToInt(m4395getMaxHeightimpl);
                                    } else {
                                        roundToInt = MathKt.roundToInt(ModalBottomSheetState.this.getOffset().getValue().floatValue());
                                    }
                                    return IntOffsetKt.IntOffset(0, roundToInt);
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue3);
                        }
                        composer5.endReplaceableGroup();
                        bottomSheetSwipeable = ModalBottomSheetKt.bottomSheetSwipeable(OffsetKt.offset(nestedScroll$default, (Function1) rememberedValue3), ModalBottomSheetState.this, m4395getMaxHeightimpl, mutableState);
                        composer5.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                        boolean changed2 = composer5.changed(mutableState);
                        Object rememberedValue4 = composer5.rememberedValue();
                        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LayoutCoordinates it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(Float.valueOf(IntSize.m4609getHeightimpl(it.mo3390getSizeYbymL2g())));
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue4);
                        }
                        composer5.endReplaceableGroup();
                        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (Function1) rememberedValue4);
                        final ModalBottomSheetState modalBottomSheetState7 = ModalBottomSheetState.this;
                        final CoroutineScope coroutineScope3 = coroutineScope2;
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                                if (ModalBottomSheetState.this.isVisible()) {
                                    final ModalBottomSheetState modalBottomSheetState8 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00471(ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return true;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C00471(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00471> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new C00471(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                    if (ModalBottomSheetState.this.getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState9 = ModalBottomSheetState.this;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                }
                                                return true;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
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
                                                        if (this.$sheetState.expand$material_release(this) == coroutine_suspended) {
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
                                    } else if (ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState10 = ModalBottomSheetState.this;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                }
                                                return true;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
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
                                                        if (this.$sheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                            }
                        }, 1, null);
                        Shape shape5 = shape42;
                        long j122 = j10;
                        long j13 = j5;
                        float f5 = f3;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3 = sheetContent;
                        final int i15 = i7;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i16) {
                                ComposerKt.sourceInformation(composer6, "C388@15886L30:ModalBottomSheet.kt#jmzs0o");
                                if ((i16 & 11) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                int i17 = (i15 << 9) & 7168;
                                composer6.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                composer6.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer6.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                Density density2 = (Density) consume4;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer6.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume6 = composer6.consume(localViewConfiguration2);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion2);
                                if (!(composer6.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor2);
                                } else {
                                    composer6.useNode();
                                }
                                composer6.disableReusing();
                                Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer6);
                                Updater.m1649setimpl(m1642constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer6.enableReusing();
                                materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                                composer6.startReplaceableGroup(2058660585);
                                composer6.startReplaceableGroup(-1163856341);
                                ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                                function32.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i17 >> 6) & 112) | 6));
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                                composer6.endNode();
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                            }
                        });
                        int i16 = i7;
                        SurfaceKt.m1520SurfaceFjzlyU(semantics$default, shape5, j122, j13, null, f5, composableLambda, composer5, ((i16 >> 6) & 112) | 1572864 | ((i16 >> 9) & 896) | ((i16 >> 9) & 7168) | ((i16 << 3) & 458752), 16);
                        return;
                    }
                    composer5.skipToGroupEnd();
                }
            }), composer42, ((i7 >> 3) & 14) | 3072, 6);
            composer3 = composer42;
            f4 = f3;
            modifier3 = modifier42;
            shape3 = shape42;
            modalBottomSheetState4 = modalBottomSheetState3;
            final long j112 = j5;
            final long j122 = j10;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) == 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        int i112 = i3;
        if ((i2 & 256) == 0) {
        }
        i5 = i112 | i6;
        if ((i5 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        composer2.endDefaults();
        composer2.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
        rememberedValue = composer2.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer2.endReplaceableGroup();
        j10 = j4;
        Composer composer422 = composer2;
        final Shape shape422 = cornerBasedShape;
        Modifier modifier422 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(modifier422, null, false, ComposableLambdaKt.composableLambda(composer422, 1607356310, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer5, Integer num) {
                invoke(boxWithConstraintsScope, composer5, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer5, int i12) {
                int i13;
                Modifier bottomSheetSwipeable;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                ComposerKt.sourceInformation(composer5, "C327@13328L41,328@13378L384,344@13922L434,355@14475L89,340@13771L2155:ModalBottomSheet.kt#jmzs0o");
                if ((i12 & 14) == 0) {
                    i13 = i12 | (composer5.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i13 & 91) != 18 || !composer5.getSkipping()) {
                    final float m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(BoxWithConstraints.mo521getConstraintsmsEJaDk());
                    composer5.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer5, "C(remember):Composables.kt#9igjgp");
                    Object rememberedValue2 = composer5.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composer5.updateRememberedValue(rememberedValue2);
                    }
                    composer5.endReplaceableGroup();
                    final MutableState<Float> mutableState = (MutableState) rememberedValue2;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i14 = i7;
                    long j1122 = j9;
                    final ModalBottomSheetState modalBottomSheetState5 = ModalBottomSheetState.this;
                    final CoroutineScope coroutineScope222 = coroutineScope22;
                    composer5.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer5, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer5, 0);
                    composer5.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer5, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer5.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer5.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer5.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
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
                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer5.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer5)), composer5, 0);
                    composer5.startReplaceableGroup(2058660585);
                    composer5.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(composer5, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer5.startReplaceableGroup(-402723888);
                    ComposerKt.sourceInformation(composer5, "C329@13420L9,330@13442L310:ModalBottomSheet.kt#jmzs0o");
                    function2.invoke(composer5, Integer.valueOf((i14 >> 24) & 14));
                    ModalBottomSheetKt.m1438Scrim3JVO9M(j1122, new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
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
                            if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                            }
                        }

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                    if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                    }, modalBottomSheetState5.getTargetValue() != ModalBottomSheetValue.Hidden, composer5, (i14 >> 21) & 14);
                    composer5.endReplaceableGroup();
                    composer5.endReplaceableGroup();
                    composer5.endReplaceableGroup();
                    composer5.endNode();
                    composer5.endReplaceableGroup();
                    composer5.endReplaceableGroup();
                    Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                    Object obj = ModalBottomSheetState.this;
                    Object valueOf = Float.valueOf(m4395getMaxHeightimpl);
                    final ModalBottomSheetState modalBottomSheetState6 = ModalBottomSheetState.this;
                    composer5.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer5, "C(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed = composer5.changed(obj) | composer5.changed(valueOf);
                    Object rememberedValue3 = composer5.rememberedValue();
                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                return IntOffset.m4559boximpl(m1442invokeBjo55l4(density2));
                            }

                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1442invokeBjo55l4(Density offset) {
                                int roundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                if (ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                    roundToInt = MathKt.roundToInt(m4395getMaxHeightimpl);
                                } else {
                                    roundToInt = MathKt.roundToInt(ModalBottomSheetState.this.getOffset().getValue().floatValue());
                                }
                                return IntOffsetKt.IntOffset(0, roundToInt);
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue3);
                    }
                    composer5.endReplaceableGroup();
                    bottomSheetSwipeable = ModalBottomSheetKt.bottomSheetSwipeable(OffsetKt.offset(nestedScroll$default, (Function1) rememberedValue3), ModalBottomSheetState.this, m4395getMaxHeightimpl, mutableState);
                    composer5.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer5, "C(remember)P(1):Composables.kt#9igjgp");
                    boolean changed2 = composer5.changed(mutableState);
                    Object rememberedValue4 = composer5.rememberedValue();
                    if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LayoutCoordinates it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(Float.valueOf(IntSize.m4609getHeightimpl(it.mo3390getSizeYbymL2g())));
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue4);
                    }
                    composer5.endReplaceableGroup();
                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (Function1) rememberedValue4);
                    final ModalBottomSheetState modalBottomSheetState7 = ModalBottomSheetState.this;
                    final CoroutineScope coroutineScope3 = coroutineScope22;
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                            if (ModalBottomSheetState.this.isVisible()) {
                                final ModalBottomSheetState modalBottomSheetState8 = ModalBottomSheetState.this;
                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00471(ModalBottomSheetState.this, null), 3, null);
                                        }
                                        return true;
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C00471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C00471(ModalBottomSheetState modalBottomSheetState, Continuation<? super C00471> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new C00471(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((C00471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                if (ModalBottomSheetState.this.getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                    final ModalBottomSheetState modalBottomSheetState9 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope5 = coroutineScope3;
                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return true;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                                    if (this.$sheetState.expand$material_release(this) == coroutine_suspended) {
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
                                } else if (ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                    final ModalBottomSheetState modalBottomSheetState10 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope6 = coroutineScope3;
                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            if (ModalBottomSheetState.this.getConfirmStateChange$material_release().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return true;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                                    if (this.$sheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                        }
                    }, 1, null);
                    Shape shape5 = shape422;
                    long j1222 = j10;
                    long j13 = j5;
                    float f5 = f3;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3 = sheetContent;
                    final int i15 = i7;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, -1793508390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer6, int i16) {
                            ComposerKt.sourceInformation(composer6, "C388@15886L30:ModalBottomSheet.kt#jmzs0o");
                            if ((i16 & 11) == 2 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                            int i17 = (i15 << 9) & 7168;
                            composer6.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer6, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                            composer6.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer6.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            Density density2 = (Density) consume4;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer6.consume(localLayoutDirection2);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume6 = composer6.consume(localViewConfiguration2);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion2);
                            if (!(composer6.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor2);
                            } else {
                                composer6.useNode();
                            }
                            composer6.disableReusing();
                            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer6);
                            Updater.m1649setimpl(m1642constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer6.enableReusing();
                            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer6)), composer6, 0);
                            composer6.startReplaceableGroup(2058660585);
                            composer6.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer6, "C79@3994L9:Column.kt#2w3rfo");
                            function32.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer6.endReplaceableGroup();
                            composer6.endReplaceableGroup();
                            composer6.endNode();
                            composer6.endReplaceableGroup();
                            composer6.endReplaceableGroup();
                        }
                    });
                    int i16 = i7;
                    SurfaceKt.m1520SurfaceFjzlyU(semantics$default, shape5, j1222, j13, null, f5, composableLambda, composer5, ((i16 >> 6) & 112) | 1572864 | ((i16 >> 9) & 896) | ((i16 >> 9) & 7168) | ((i16 << 3) & 458752), 16);
                    return;
                }
                composer5.skipToGroupEnd();
            }
        }), composer422, ((i7 >> 3) & 14) | 3072, 6);
        composer3 = composer422;
        f4 = f3;
        modifier3 = modifier422;
        shape3 = shape422;
        modalBottomSheetState4 = modalBottomSheetState3;
        final long j1122 = j5;
        final long j1222 = j10;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier bottomSheetSwipeable(Modifier modifier, ModalBottomSheetState modalBottomSheetState, float f, State<Float> state) {
        Modifier.Companion companion;
        Map mapOf;
        Float value = state.getValue();
        if (value == null) {
            companion = Modifier.INSTANCE;
        } else {
            float f2 = f / 2;
            if (value.floatValue() < f2 || modalBottomSheetState.getIsSkipHalfExpanded()) {
                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f), ModalBottomSheetValue.Hidden), TuplesKt.to(Float.valueOf(f - value.floatValue()), ModalBottomSheetValue.Expanded));
            } else {
                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f), ModalBottomSheetValue.Hidden), TuplesKt.to(Float.valueOf(f2), ModalBottomSheetValue.HalfExpanded), TuplesKt.to(Float.valueOf(Math.max(0.0f, f - value.floatValue())), ModalBottomSheetValue.Expanded));
            }
            companion = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, modalBottomSheetState, r8, Orientation.Vertical, (r26 & 8) != 0 ? true : modalBottomSheetState.getCurrentValue() != ModalBottomSheetValue.Hidden, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final FixedThreshold invoke(T t, T t2) {
                    return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                }
            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
        }
        return modifier.then(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1438Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)435@17137L121,439@17284L29,455@17799L62,451@17690L171:ModalBottomSheet.kt#jmzs0o");
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
            final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1512getCloseSheetUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010547488);
            ComposerKt.sourceInformation(startRestartGroup, "442@17421L37,443@17511L121");
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(function0);
                ModalBottomSheetKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m1518getString4foXLRw) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
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
                            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
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
                rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
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
                        float m1439Scrim_3J_VO9M$lambda0;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m1439Scrim_3J_VO9M$lambda0 = ModalBottomSheetKt.m1439Scrim_3J_VO9M$lambda0(animateFloatAsState);
                        DrawScope.m2657drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m1439Scrim_3J_VO9M$lambda0, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
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
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
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
                ModalBottomSheetKt.m1438Scrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-0, reason: not valid java name */
    public static final float m1439Scrim_3J_VO9M$lambda0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
