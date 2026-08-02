package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001ac\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u001b\u001a\u001d\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0002\u0010/\"\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0016\u0010\u001f\u001a\u00020\u001dX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010!\"\u0010\u0010\"\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0016\u0010#\u001a\u00020\u001dX\u0080\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b$\u0010!\"\u0010\u0010%\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010&\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010'\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u000e\u0010(\u001a\u00020)X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020)X\u0080T¢\u0006\u0002\n\u0000¨\u00060²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"DropdownMenuContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItemContent", ViewProps.ON_CLICK, "Lkotlin/Function0;", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MenuElevation", "Landroidx/compose/ui/unit/Dp;", "F", "MenuVerticalMargin", "getMenuVerticalMargin", "()F", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMinHeight", "InTransitionDuration", "", "OutTransitionDuration", "calculateTransformOrigin", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material", "scale", "", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuVerticalPadding;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = Dp.m8798constructorimpl(16);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m8798constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m8798constructorimpl(280);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuContent$lambda$6(MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        DropdownMenuContent(mutableTransitionState, mutableState, scrollState, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItemContent$lambda$8(Function0 function0, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        DropdownMenuItemContent(function0, modifier, z, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuContent(final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, final ScrollState scrollState, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1077393800);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuContent)N(expandedStates,transformOriginState,scrollState,modifier,content)156@7382L50,159@7470L622,180@8130L549,201@8744L173,208@8960L277,199@8684L553:Menu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(scrollState) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1077393800, i3, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:154)");
                }
                Transition rememberTransition = TransitionKt.rememberTransition(mutableTransitionState, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | (i3 & 14), 0);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$scale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i6) {
                        TweenSpec tween$default;
                        composer2.startReplaceGroup(445475263);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(445475263, i6, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:161)");
                        }
                        if (segment.isTransitioningTo(false, true)) {
                            tween$default = AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                        } else {
                            tween$default = AnimationSpecKt.tween$default(1, 74, null, 4, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tween$default;
                    }
                };
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                boolean booleanValue = ((Boolean) rememberTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceGroup(-1833869404);
                ComposerKt.sourceInformation(startRestartGroup, "CN(it):Menu.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1833869404, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:170)");
                }
                float f = booleanValue ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceGroup();
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) rememberTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceGroup(-1833869404);
                ComposerKt.sourceInformation(startRestartGroup, "CN(it):Menu.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1833869404, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:170)");
                }
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceGroup();
                Float valueOf2 = Float.valueOf(f2);
                FiniteAnimationSpec<Float> invoke = menuKt$DropdownMenuContent$scale$2.invoke((MenuKt$DropdownMenuContent$scale$2) rememberTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0);
                final Modifier modifier4 = modifier2;
                int i6 = i3;
                final State createTransitionAnimation = TransitionKt.createTransitionAnimation(rememberTransition, valueOf, valueOf2, invoke, vectorConverter, "FloatAnimation", startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i7) {
                        TweenSpec tween$default;
                        composer2.startReplaceGroup(701003475);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(701003475, i7, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:182)");
                        }
                        if (segment.isTransitioningTo(false, true)) {
                            tween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
                        } else {
                            tween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tween$default;
                    }
                };
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                boolean booleanValue3 = ((Boolean) rememberTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceGroup(-1578341192);
                ComposerKt.sourceInformation(startRestartGroup, "CN(it):Menu.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    i4 = -1;
                    ComposerKt.traceEventStart(-1578341192, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:191)");
                } else {
                    i4 = -1;
                }
                float f3 = booleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceGroup();
                Float valueOf3 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) rememberTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceGroup(-1578341192);
                ComposerKt.sourceInformation(startRestartGroup, "CN(it):Menu.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1578341192, 0, i4, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:191)");
                }
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceGroup();
                final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(rememberTransition, valueOf3, Float.valueOf(f4), menuKt$DropdownMenuContent$alpha$2.invoke((MenuKt$DropdownMenuContent$alpha$2) rememberTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 288377749, "CC(remember):Menu.kt#9igjgp");
                boolean changed = startRestartGroup.changed(createTransitionAnimation) | startRestartGroup.changed(createTransitionAnimation2) | ((i6 & 112) == 32);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material.MenuKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit DropdownMenuContent$lambda$5$lambda$4;
                            DropdownMenuContent$lambda$5$lambda$4 = MenuKt.DropdownMenuContent$lambda$5$lambda$4(MutableState.this, createTransitionAnimation, createTransitionAnimation2, (GraphicsLayerScope) obj);
                            return DropdownMenuContent$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CardKt.m2249CardFjzlyU(GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue), null, 0L, 0L, null, MenuElevation, ComposableLambdaKt.rememberComposableLambda(-707086267, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        ComposerKt.sourceInformation(composer2, "C209@8970L261:Menu.kt#jmzs0o");
                        if (!composer2.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-707086267, i7, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:209)");
                        }
                        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m1159paddingVpY3zN4$default(Modifier.this, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), scrollState, false, null, false, 14, null);
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m5333constructorimpl = Updater.m5333constructorimpl(composer2);
                        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 1769472, 30);
                startRestartGroup = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.MenuKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuContent$lambda$6;
                        DropdownMenuContent$lambda$6 = MenuKt.DropdownMenuContent$lambda$6(MutableTransitionState.this, mutableState, scrollState, modifier3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuContent$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuContent$lambda$5$lambda$4(MutableState mutableState, State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(DropdownMenuContent$lambda$1(state));
        graphicsLayerScope.setScaleY(DropdownMenuContent$lambda$1(state));
        graphicsLayerScope.setAlpha(DropdownMenuContent$lambda$3(state2));
        graphicsLayerScope.mo6241setTransformOrigin__ExYCQ(((TransformOrigin) mutableState.getValue()).getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItemContent(final Function0<Unit> function0, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        final boolean z2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-674391690);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItemContent)N(onClick,modifier,enabled,contentPadding,interactionSource,content)230@9650L1031:Menu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            z2 = z;
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            paddingValues3 = paddingValues2;
                        } else {
                            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            final boolean z3 = i4 != 0 ? true : z;
                            paddingValues3 = i5 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues2;
                            MutableInteractionSource mutableInteractionSource3 = i6 != 0 ? null : mutableInteractionSource;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-674391690, i3, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:228)");
                            }
                            Modifier padding = PaddingKt.padding(SizeKt.m1213sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m619clickableO2vRcR0$default(modifier4, mutableInteractionSource3, RippleKt.m2441rippleH2RKhps$default(true, 0.0f, 0L, 6, null), z3, null, null, function02, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues3);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
                            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -575380304, "C249@10425L10,250@10483L192,250@10444L231:Menu.kt#jmzs0o");
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.rememberComposableLambda(-77738101, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i8) {
                                    float disabled;
                                    ComposerKt.sourceInformation(composer2, "C252@10652L13,252@10586L79:Menu.kt#jmzs0o");
                                    if (!composer2.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-77738101, i8, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:251)");
                                    }
                                    if (z3) {
                                        composer2.startReplaceGroup(-1691869137);
                                        ComposerKt.sourceInformation(composer2, "251@10542L4");
                                        disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                                    } else {
                                        composer2.startReplaceGroup(-1691868397);
                                        ComposerKt.sourceInformation(composer2, "251@10565L8");
                                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                                    }
                                    composer2.endReplaceGroup();
                                    ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled));
                                    final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    final RowScope rowScope = rowScopeInstance;
                                    CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-308149173, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i9) {
                                            ComposerKt.sourceInformation(composer3, "C252@10654L9:Menu.kt#jmzs0o");
                                            if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-308149173, i9, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:252)");
                                            }
                                            function32.invoke(rowScope, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z2 = z3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.MenuKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DropdownMenuItemContent$lambda$8;
                                    DropdownMenuItemContent$lambda$8 = MenuKt.DropdownMenuItemContent$lambda$8(Function0.this, modifier3, z2, paddingValues3, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return DropdownMenuItemContent$lambda$8;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculateTransformOrigin(IntRect intRect, IntRect intRect2) {
        float max;
        float f = 1.0f;
        if (intRect2.getLeft() < intRect.getRight()) {
            if (intRect2.getRight() <= intRect.getLeft()) {
                max = 1.0f;
            } else if (intRect2.getWidth() != 0) {
                max = (((Math.max(intRect.getLeft(), intRect2.getLeft()) + Math.min(intRect.getRight(), intRect2.getRight())) / 2) - intRect2.getLeft()) / intRect2.getWidth();
            }
            if (intRect2.getTop() < intRect.getBottom()) {
                if (intRect2.getBottom() > intRect.getTop()) {
                    if (intRect2.getHeight() != 0) {
                        f = (((Math.max(intRect.getTop(), intRect2.getTop()) + Math.min(intRect.getBottom(), intRect2.getBottom())) / 2) - intRect2.getTop()) / intRect2.getHeight();
                    }
                }
                return TransformOriginKt.TransformOrigin(max, f);
            }
            f = 0.0f;
            return TransformOriginKt.TransformOrigin(max, f);
        }
        max = 0.0f;
        if (intRect2.getTop() < intRect.getBottom()) {
        }
        f = 0.0f;
        return TransformOriginKt.TransformOrigin(max, f);
    }

    private static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = 8;
        MenuElevation = Dp.m8798constructorimpl(f);
        float f2 = 48;
        MenuVerticalMargin = Dp.m8798constructorimpl(f2);
        DropdownMenuVerticalPadding = Dp.m8798constructorimpl(f);
        DropdownMenuItemDefaultMinHeight = Dp.m8798constructorimpl(f2);
    }
}
