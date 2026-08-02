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
import androidx.compose.foundation.interaction.InteractionSourceKt;
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
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001aa\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0002\u0010(\u001a \u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0000ø\u0001\u0000¢\u0006\u0002\u0010-\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0006\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\f\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\r\u0010\b\"\u000e\u0010\u000e\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"DropdownMenuItemDefaultMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "DropdownMenuItemDefaultMinHeight", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "()F", "InTransitionDuration", "", "MenuElevation", "MenuVerticalMargin", "getMenuVerticalMargin", "OutTransitionDuration", "DropdownMenuContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItemContent", "onClick", "Lkotlin/Function0;", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateTransformOrigin", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MenuKt {
    private static final float DropdownMenuItemDefaultMinHeight;
    private static final float DropdownMenuVerticalPadding;
    public static final int InTransitionDuration = 120;
    private static final float MenuElevation;
    private static final float MenuVerticalMargin;
    public static final int OutTransitionDuration = 75;
    private static final float DropdownMenuItemHorizontalPadding = Dp.m4440constructorimpl(16);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m4440constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m4440constructorimpl(280);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuContent(final MutableTransitionState<Boolean> expandedStates, final MutableState<TransformOrigin> transformOriginState, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        final Modifier.Companion companion;
        boolean changed;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(transformOriginState, "transformOriginState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1164283597);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuContent)P(1,3,2)68@2881L48,70@2959L666,96@3655L477,116@4185L153,115@4137L501:Menu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(expandedStates) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(transformOriginState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                Transition updateTransition = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | (i3 & 14), 0);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$scale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer2, int i5) {
                        TweenSpec tween$default;
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceableGroup(365249092);
                        if (animateFloat.isTransitioningTo(false, true)) {
                            tween$default = AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                        } else {
                            tween$default = AnimationSpecKt.tween$default(1, 74, null, 4, null);
                        }
                        composer2.endReplaceableGroup();
                        return tween$default;
                    }
                };
                startRestartGroup.startReplaceableGroup(1399891485);
                ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                startRestartGroup.startReplaceableGroup(1847725064);
                ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                boolean booleanValue = ((Boolean) updateTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1958825495);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
                float f = !booleanValue ? 1.0f : 0.8f;
                startRestartGroup.endReplaceableGroup();
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) updateTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1958825495);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                startRestartGroup.endReplaceableGroup();
                final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), menuKt$DropdownMenuContent$scale$2.invoke((MenuKt$DropdownMenuContent$scale$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer2, int i5) {
                        TweenSpec tween$default;
                        Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                        composer2.startReplaceableGroup(782718552);
                        if (animateFloat.isTransitioningTo(false, true)) {
                            tween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
                        } else {
                            tween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
                        }
                        composer2.endReplaceableGroup();
                        return tween$default;
                    }
                };
                startRestartGroup.startReplaceableGroup(1399891485);
                ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                startRestartGroup.startReplaceableGroup(1847725064);
                ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                boolean booleanValue3 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1541356035);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
                float f3 = !booleanValue3 ? 1.0f : 0.0f;
                startRestartGroup.endReplaceableGroup();
                Float valueOf2 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) updateTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceableGroup(-1541356035);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                startRestartGroup.endReplaceableGroup();
                final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), menuKt$DropdownMenuContent$alpha$2.invoke((MenuKt$DropdownMenuContent$alpha$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(createTransitionAnimation) | startRestartGroup.changed(createTransitionAnimation2) | startRestartGroup.changed(transformOriginState);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayer) {
                            float m1431DropdownMenuContent$lambda1;
                            float m1431DropdownMenuContent$lambda12;
                            float m1432DropdownMenuContent$lambda3;
                            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                            m1431DropdownMenuContent$lambda1 = MenuKt.m1431DropdownMenuContent$lambda1(createTransitionAnimation);
                            graphicsLayer.setScaleX(m1431DropdownMenuContent$lambda1);
                            m1431DropdownMenuContent$lambda12 = MenuKt.m1431DropdownMenuContent$lambda1(createTransitionAnimation);
                            graphicsLayer.setScaleY(m1431DropdownMenuContent$lambda12);
                            m1432DropdownMenuContent$lambda3 = MenuKt.m1432DropdownMenuContent$lambda3(createTransitionAnimation2);
                            graphicsLayer.setAlpha(m1432DropdownMenuContent$lambda3);
                            graphicsLayer.mo2306setTransformOrigin__ExYCQ(transformOriginState.getValue().getPackedValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                CardKt.m1287CardFjzlyU(GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue), null, 0L, 0L, null, MenuElevation, ComposableLambdaKt.composableLambda(startRestartGroup, -242468534, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$2
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

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C128@4569L21,124@4390L242:Menu.kt#jmzs0o");
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m587paddingVpY3zN4$default(Modifier.this, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i6 = i3 & 7168;
                            composer2.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(verticalScroll$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                            Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i6 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 1769472, 30);
                startRestartGroup = startRestartGroup;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$3
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

                public final void invoke(Composer composer2, int i5) {
                    MenuKt.DropdownMenuContent(expandedStates, transformOriginState, companion, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        Transition updateTransition2 = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | (i3 & 14), 0);
        MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$22 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$scale$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }

            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer2, int i5) {
                TweenSpec tween$default;
                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                composer2.startReplaceableGroup(365249092);
                if (animateFloat.isTransitioningTo(false, true)) {
                    tween$default = AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                } else {
                    tween$default = AnimationSpecKt.tween$default(1, 74, null, 4, null);
                }
                composer2.endReplaceableGroup();
                return tween$default;
            }
        };
        startRestartGroup.startReplaceableGroup(1399891485);
        ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        startRestartGroup.startReplaceableGroup(1847725064);
        ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
        boolean booleanValue5 = ((Boolean) updateTransition2.getCurrentState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1958825495);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
        if (!booleanValue5) {
        }
        startRestartGroup.endReplaceableGroup();
        Float valueOf3 = Float.valueOf(f);
        boolean booleanValue22 = ((Boolean) updateTransition2.getTargetState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1958825495);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
        if (booleanValue22) {
        }
        startRestartGroup.endReplaceableGroup();
        final State<Float> createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf3, Float.valueOf(f2), menuKt$DropdownMenuContent$scale$22.invoke((MenuKt$DropdownMenuContent$scale$2) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3, "FloatAnimation", startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$22 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }

            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer2, int i5) {
                TweenSpec tween$default;
                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                composer2.startReplaceableGroup(782718552);
                if (animateFloat.isTransitioningTo(false, true)) {
                    tween$default = AnimationSpecKt.tween$default(30, 0, null, 6, null);
                } else {
                    tween$default = AnimationSpecKt.tween$default(75, 0, null, 6, null);
                }
                composer2.endReplaceableGroup();
                return tween$default;
            }
        };
        startRestartGroup.startReplaceableGroup(1399891485);
        ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        startRestartGroup.startReplaceableGroup(1847725064);
        ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
        boolean booleanValue32 = ((Boolean) updateTransition2.getCurrentState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1541356035);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
        if (!booleanValue32) {
        }
        startRestartGroup.endReplaceableGroup();
        Float valueOf22 = Float.valueOf(f3);
        boolean booleanValue42 = ((Boolean) updateTransition2.getTargetState()).booleanValue();
        startRestartGroup.startReplaceableGroup(-1541356035);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#jmzs0o");
        if (booleanValue42) {
        }
        startRestartGroup.endReplaceableGroup();
        final State<Float> createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf22, Float.valueOf(f4), menuKt$DropdownMenuContent$alpha$22.invoke((MenuKt$DropdownMenuContent$alpha$2) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion22 = Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(createTransitionAnimation3) | startRestartGroup.changed(createTransitionAnimation22) | startRestartGroup.changed(transformOriginState);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayer) {
                float m1431DropdownMenuContent$lambda1;
                float m1431DropdownMenuContent$lambda12;
                float m1432DropdownMenuContent$lambda3;
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                m1431DropdownMenuContent$lambda1 = MenuKt.m1431DropdownMenuContent$lambda1(createTransitionAnimation3);
                graphicsLayer.setScaleX(m1431DropdownMenuContent$lambda1);
                m1431DropdownMenuContent$lambda12 = MenuKt.m1431DropdownMenuContent$lambda1(createTransitionAnimation3);
                graphicsLayer.setScaleY(m1431DropdownMenuContent$lambda12);
                m1432DropdownMenuContent$lambda3 = MenuKt.m1432DropdownMenuContent$lambda3(createTransitionAnimation22);
                graphicsLayer.setAlpha(m1432DropdownMenuContent$lambda3);
                graphicsLayer.mo2306setTransformOrigin__ExYCQ(transformOriginState.getValue().getPackedValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        CardKt.m1287CardFjzlyU(GraphicsLayerModifierKt.graphicsLayer(companion22, (Function1) rememberedValue), null, 0L, 0L, null, MenuElevation, ComposableLambdaKt.composableLambda(startRestartGroup, -242468534, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$2
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

            public final void invoke(Composer composer2, int i5) {
                ComposerKt.sourceInformation(composer2, "C128@4569L21,124@4390L242:Menu.kt#jmzs0o");
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier verticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m587paddingVpY3zN4$default(Modifier.this, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                    int i6 = i3 & 7168;
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(verticalScroll$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                    Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i6 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 1769472, 30);
        startRestartGroup = startRestartGroup;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItemContent(final Function0<Unit> onClick, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        final int i8;
        Composer composer2;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(87134531);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItemContent)P(5,4,2,1,3)140@4912L39,150@5295L20,144@5084L996:Menu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            if ((458752 & i) == 0) {
                                i7 = startRestartGroup.changed(content) ? 131072 : 65536;
                            }
                            i8 = i3;
                            if ((374491 & i8) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i4 == 0 ? true : z2;
                                if (i5 != 0) {
                                    paddingValues2 = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                }
                                if (i6 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                }
                                PaddingValues paddingValues4 = paddingValues2;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                composer2 = startRestartGroup;
                                final boolean z5 = z4;
                                Modifier modifier4 = companion;
                                Modifier padding = PaddingKt.padding(SizeKt.m638sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m265clickableO2vRcR0$default(companion, mutableInteractionSource4, RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z5, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues4);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                composer2.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = composer2.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density = (Density) consume;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = composer2.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer2.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-678309503);
                                ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(1664959143);
                                ComposerKt.sourceInformation(composer2, "C162@5796L10,163@5815L259:Menu.kt#jmzs0o");
                                final int i10 = 6;
                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composer2, 1190489496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
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

                                    public final void invoke(Composer composer3, int i11) {
                                        float disabled;
                                        ComposerKt.sourceInformation(composer3, "C165@5957L107:Menu.kt#jmzs0o");
                                        if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                            if (z5) {
                                                composer3.startReplaceableGroup(-1945695285);
                                                ComposerKt.sourceInformation(composer3, "164@5913L4");
                                                disabled = ContentAlpha.INSTANCE.getHigh(composer3, 6);
                                            } else {
                                                composer3.startReplaceableGroup(-1945695262);
                                                ComposerKt.sourceInformation(composer3, "164@5936L8");
                                                disabled = ContentAlpha.INSTANCE.getDisabled(composer3, 6);
                                            }
                                            composer3.endReplaceableGroup();
                                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                                            final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                            final RowScope rowScope = rowScopeInstance;
                                            final int i12 = i10;
                                            final int i13 = i8;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1705995688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
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

                                                public final void invoke(Composer composer4, int i14) {
                                                    ComposerKt.sourceInformation(composer4, "C166@6041L9:Menu.kt#jmzs0o");
                                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                    } else {
                                                        function3.invoke(rowScope, composer4, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                                    }
                                                }
                                            }), composer3, 56);
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 48);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                z3 = z5;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                modifier3 = modifier4;
                                paddingValues3 = paddingValues4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                composer2 = startRestartGroup;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$3
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

                                public final void invoke(Composer composer3, int i11) {
                                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, paddingValues3, mutableInteractionSource3, content, composer3, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        i8 = i3;
                        if ((374491 & i8) == 74898) {
                        }
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        PaddingValues paddingValues42 = paddingValues2;
                        MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        composer2 = startRestartGroup;
                        final boolean z52 = z4;
                        Modifier modifier42 = companion;
                        Modifier padding2 = PaddingKt.padding(SizeKt.m638sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m265clickableO2vRcR0$default(companion, mutableInteractionSource42, RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z52, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues42);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density2 = (Density) consume4;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22 = composer2.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume32 = composer2.consume(localViewConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(padding2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        composer2.disableReusing();
                        Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                        Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                        final RowScope rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1664959143);
                        ComposerKt.sourceInformation(composer2, "C162@5796L10,163@5815L259:Menu.kt#jmzs0o");
                        final int i102 = 6;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composer2, 1190489496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
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

                            public final void invoke(Composer composer3, int i11) {
                                float disabled;
                                ComposerKt.sourceInformation(composer3, "C165@5957L107:Menu.kt#jmzs0o");
                                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                    if (z52) {
                                        composer3.startReplaceableGroup(-1945695285);
                                        ComposerKt.sourceInformation(composer3, "164@5913L4");
                                        disabled = ContentAlpha.INSTANCE.getHigh(composer3, 6);
                                    } else {
                                        composer3.startReplaceableGroup(-1945695262);
                                        ComposerKt.sourceInformation(composer3, "164@5936L8");
                                        disabled = ContentAlpha.INSTANCE.getDisabled(composer3, 6);
                                    }
                                    composer3.endReplaceableGroup();
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                    final RowScope rowScope = rowScopeInstance2;
                                    final int i12 = i102;
                                    final int i13 = i8;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1705995688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
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

                                        public final void invoke(Composer composer4, int i14) {
                                            ComposerKt.sourceInformation(composer4, "C166@6041L9:Menu.kt#jmzs0o");
                                            if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                function3.invoke(rowScope, composer4, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                            }
                                        }
                                    }), composer3, 56);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        z3 = z52;
                        mutableInteractionSource3 = mutableInteractionSource42;
                        modifier3 = modifier42;
                        paddingValues3 = paddingValues42;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    i8 = i3;
                    if ((374491 & i8) == 74898) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    PaddingValues paddingValues422 = paddingValues2;
                    MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    composer2 = startRestartGroup;
                    final boolean z522 = z4;
                    Modifier modifier422 = companion;
                    Modifier padding22 = PaddingKt.padding(SizeKt.m638sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m265clickableO2vRcR0$default(companion, mutableInteractionSource422, RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z522, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues422);
                    Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume42 = composer2.consume(localDensity22);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density22 = (Density) consume42;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222 = composer2.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22 = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume322 = composer2.consume(localViewConfiguration22);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(padding22);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    composer2.disableReusing();
                    Composer m1642constructorimpl22 = Updater.m1642constructorimpl(composer2);
                    Updater.m1649setimpl(m1642constructorimpl22, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl22, density22, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl22, layoutDirection22, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl22, viewConfiguration22, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                    final RowScope rowScopeInstance22 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1664959143);
                    ComposerKt.sourceInformation(composer2, "C162@5796L10,163@5815L259:Menu.kt#jmzs0o");
                    final int i1022 = 6;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composer2, 1190489496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
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

                        public final void invoke(Composer composer3, int i11) {
                            float disabled;
                            ComposerKt.sourceInformation(composer3, "C165@5957L107:Menu.kt#jmzs0o");
                            if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                if (z522) {
                                    composer3.startReplaceableGroup(-1945695285);
                                    ComposerKt.sourceInformation(composer3, "164@5913L4");
                                    disabled = ContentAlpha.INSTANCE.getHigh(composer3, 6);
                                } else {
                                    composer3.startReplaceableGroup(-1945695262);
                                    ComposerKt.sourceInformation(composer3, "164@5936L8");
                                    disabled = ContentAlpha.INSTANCE.getDisabled(composer3, 6);
                                }
                                composer3.endReplaceableGroup();
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                final RowScope rowScope = rowScopeInstance22;
                                final int i12 = i1022;
                                final int i13 = i8;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1705995688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
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

                                    public final void invoke(Composer composer4, int i14) {
                                        ComposerKt.sourceInformation(composer4, "C166@6041L9:Menu.kt#jmzs0o");
                                        if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            function3.invoke(rowScope, composer4, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                        }
                                    }
                                }), composer3, 56);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    z3 = z522;
                    mutableInteractionSource3 = mutableInteractionSource422;
                    modifier3 = modifier422;
                    paddingValues3 = paddingValues422;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                i8 = i3;
                if ((374491 & i8) == 74898) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                PaddingValues paddingValues4222 = paddingValues2;
                MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                composer2 = startRestartGroup;
                final boolean z5222 = z4;
                Modifier modifier4222 = companion;
                Modifier padding222 = PaddingKt.padding(SizeKt.m638sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m265clickableO2vRcR0$default(companion, mutableInteractionSource4222, RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z5222, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues4222);
                Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume422 = composer2.consume(localDensity222);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Density density222 = (Density) consume422;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2222 = composer2.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration222 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume3222 = composer2.consume(localViewConfiguration222);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume3222;
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(padding222);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1642constructorimpl222 = Updater.m1642constructorimpl(composer2);
                Updater.m1649setimpl(m1642constructorimpl222, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl222, density222, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl222, layoutDirection222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl222, viewConfiguration222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-678309503);
                ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                final RowScope rowScopeInstance222 = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(1664959143);
                ComposerKt.sourceInformation(composer2, "C162@5796L10,163@5815L259:Menu.kt#jmzs0o");
                final int i10222 = 6;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composer2, 1190489496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
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

                    public final void invoke(Composer composer3, int i11) {
                        float disabled;
                        ComposerKt.sourceInformation(composer3, "C165@5957L107:Menu.kt#jmzs0o");
                        if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                            if (z5222) {
                                composer3.startReplaceableGroup(-1945695285);
                                ComposerKt.sourceInformation(composer3, "164@5913L4");
                                disabled = ContentAlpha.INSTANCE.getHigh(composer3, 6);
                            } else {
                                composer3.startReplaceableGroup(-1945695262);
                                ComposerKt.sourceInformation(composer3, "164@5936L8");
                                disabled = ContentAlpha.INSTANCE.getDisabled(composer3, 6);
                            }
                            composer3.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                            final RowScope rowScope = rowScopeInstance222;
                            final int i12 = i10222;
                            final int i13 = i8;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1705995688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
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

                                public final void invoke(Composer composer4, int i14) {
                                    ComposerKt.sourceInformation(composer4, "C166@6041L9:Menu.kt#jmzs0o");
                                    if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        function3.invoke(rowScope, composer4, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                    }
                                }
                            }), composer3, 56);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 48);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                z3 = z5222;
                mutableInteractionSource3 = mutableInteractionSource4222;
                modifier3 = modifier4222;
                paddingValues3 = paddingValues4222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            i8 = i3;
            if ((374491 & i8) == 74898) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            PaddingValues paddingValues42222 = paddingValues2;
            MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            composer2 = startRestartGroup;
            final boolean z52222 = z4;
            Modifier modifier42222 = companion;
            Modifier padding2222 = PaddingKt.padding(SizeKt.m638sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m265clickableO2vRcR0$default(companion, mutableInteractionSource42222, RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z52222, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues42222);
            Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
            composer2.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4222 = composer2.consume(localDensity2222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density2222 = (Density) consume4222;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22222 = composer2.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection2222 = (LayoutDirection) consume22222;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2222 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume32222 = composer2.consume(localViewConfiguration2222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration2222 = (ViewConfiguration) consume32222;
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(padding2222);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1642constructorimpl2222 = Updater.m1642constructorimpl(composer2);
            Updater.m1649setimpl(m1642constructorimpl2222, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl2222, density2222, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl2222, layoutDirection2222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl2222, viewConfiguration2222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf2222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-678309503);
            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
            final RowScope rowScopeInstance2222 = RowScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(1664959143);
            ComposerKt.sourceInformation(composer2, "C162@5796L10,163@5815L259:Menu.kt#jmzs0o");
            final int i102222 = 6;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composer2, 1190489496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
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

                public final void invoke(Composer composer3, int i11) {
                    float disabled;
                    ComposerKt.sourceInformation(composer3, "C165@5957L107:Menu.kt#jmzs0o");
                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                        if (z52222) {
                            composer3.startReplaceableGroup(-1945695285);
                            ComposerKt.sourceInformation(composer3, "164@5913L4");
                            disabled = ContentAlpha.INSTANCE.getHigh(composer3, 6);
                        } else {
                            composer3.startReplaceableGroup(-1945695262);
                            ComposerKt.sourceInformation(composer3, "164@5936L8");
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer3, 6);
                        }
                        composer3.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                        final RowScope rowScope = rowScopeInstance2222;
                        final int i12 = i102222;
                        final int i13 = i8;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1705995688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
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

                            public final void invoke(Composer composer4, int i14) {
                                ComposerKt.sourceInformation(composer4, "C166@6041L9:Menu.kt#jmzs0o");
                                if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                } else {
                                    function3.invoke(rowScope, composer4, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                                }
                            }
                        }), composer3, 56);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 48);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            z3 = z52222;
            mutableInteractionSource3 = mutableInteractionSource42222;
            modifier3 = modifier42222;
            paddingValues3 = paddingValues42222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        i8 = i3;
        if ((374491 & i8) == 74898) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        PaddingValues paddingValues422222 = paddingValues2;
        MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        composer2 = startRestartGroup;
        final boolean z522222 = z4;
        Modifier modifier422222 = companion;
        Modifier padding22222 = PaddingKt.padding(SizeKt.m638sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m265clickableO2vRcR0$default(companion, mutableInteractionSource422222, RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z522222, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, DropdownMenuItemDefaultMinHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues422222);
        Alignment.Vertical centerVertically22222 = Alignment.INSTANCE.getCenterVertically();
        composer2.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22222, composer2, 48);
        composer2.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42222 = composer2.consume(localDensity22222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Density density22222 = (Density) consume42222;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222222 = composer2.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        LayoutDirection layoutDirection22222 = (LayoutDirection) consume222222;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22222 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume322222 = composer2.consume(localViewConfiguration22222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ViewConfiguration viewConfiguration22222 = (ViewConfiguration) consume322222;
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22222 = LayoutKt.materializerOf(padding22222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1642constructorimpl22222 = Updater.m1642constructorimpl(composer2);
        Updater.m1649setimpl(m1642constructorimpl22222, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl22222, density22222, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1649setimpl(m1642constructorimpl22222, layoutDirection22222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1649setimpl(m1642constructorimpl22222, viewConfiguration22222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf22222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-678309503);
        ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
        final RowScope rowScopeInstance22222 = RowScopeInstance.INSTANCE;
        composer2.startReplaceableGroup(1664959143);
        ComposerKt.sourceInformation(composer2, "C162@5796L10,163@5815L259:Menu.kt#jmzs0o");
        final int i1022222 = 6;
        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composer2, 1190489496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
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

            public final void invoke(Composer composer3, int i11) {
                float disabled;
                ComposerKt.sourceInformation(composer3, "C165@5957L107:Menu.kt#jmzs0o");
                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                    if (z522222) {
                        composer3.startReplaceableGroup(-1945695285);
                        ComposerKt.sourceInformation(composer3, "164@5913L4");
                        disabled = ContentAlpha.INSTANCE.getHigh(composer3, 6);
                    } else {
                        composer3.startReplaceableGroup(-1945695262);
                        ComposerKt.sourceInformation(composer3, "164@5936L8");
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer3, 6);
                    }
                    composer3.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))};
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                    final RowScope rowScope = rowScopeInstance22222;
                    final int i12 = i1022222;
                    final int i13 = i8;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1705995688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1.1
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

                        public final void invoke(Composer composer4, int i14) {
                            ComposerKt.sourceInformation(composer4, "C166@6041L9:Menu.kt#jmzs0o");
                            if ((i14 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                            } else {
                                function3.invoke(rowScope, composer4, Integer.valueOf((i12 & 14) | ((i13 >> 12) & 112)));
                            }
                        }
                    }), composer3, 56);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, 48);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        z3 = z522222;
        mutableInteractionSource3 = mutableInteractionSource422222;
        modifier3 = modifier422222;
        paddingValues3 = paddingValues422222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculateTransformOrigin(IntRect parentBounds, IntRect menuBounds) {
        float max;
        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
        float f = 1.0f;
        if (menuBounds.getLeft() < parentBounds.getRight()) {
            if (menuBounds.getRight() <= parentBounds.getLeft()) {
                max = 1.0f;
            } else if (menuBounds.getWidth() != 0) {
                max = (((Math.max(parentBounds.getLeft(), menuBounds.getLeft()) + Math.min(parentBounds.getRight(), menuBounds.getRight())) / 2) - menuBounds.getLeft()) / menuBounds.getWidth();
            }
            if (menuBounds.getTop() < parentBounds.getBottom()) {
                if (menuBounds.getBottom() > parentBounds.getTop()) {
                    if (menuBounds.getHeight() != 0) {
                        f = (((Math.max(parentBounds.getTop(), menuBounds.getTop()) + Math.min(parentBounds.getBottom(), menuBounds.getBottom())) / 2) - menuBounds.getTop()) / menuBounds.getHeight();
                    }
                }
                return TransformOriginKt.TransformOrigin(max, f);
            }
            f = 0.0f;
            return TransformOriginKt.TransformOrigin(max, f);
        }
        max = 0.0f;
        if (menuBounds.getTop() < parentBounds.getBottom()) {
        }
        f = 0.0f;
        return TransformOriginKt.TransformOrigin(max, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-1, reason: not valid java name */
    public static final float m1431DropdownMenuContent$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DropdownMenuContent$lambda-3, reason: not valid java name */
    public static final float m1432DropdownMenuContent$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = 8;
        MenuElevation = Dp.m4440constructorimpl(f);
        float f2 = 48;
        MenuVerticalMargin = Dp.m4440constructorimpl(f2);
        DropdownMenuVerticalPadding = Dp.m4440constructorimpl(f);
        DropdownMenuItemDefaultMinHeight = Dp.m4440constructorimpl(f2);
    }
}
