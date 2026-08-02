package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a?\u0010!\u001a\u00020\u0014*\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010\u001c\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a1\u0010'\u001a\u00020\u0014*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\t\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\n\u0010\u000b\"\u0013\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u000f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0010\u0010\u000b\"\u0019\u0010\u0011\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    /* JADX WARN: Removed duplicated region for block: B:101:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        SwitchColors switchColors2;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Modifier modifier3;
        boolean z5;
        MutableInteractionSource mutableInteractionSource4;
        SwitchColors switchColors3;
        int i7;
        String str;
        MutableInteractionSource mutableInteractionSource5;
        Modifier.Companion companion;
        Modifier m1530swipeablepPrIpRY;
        final MutableInteractionSource mutableInteractionSource6;
        final Modifier modifier4;
        final boolean z6;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(25866825);
        ComposerKt.sourceInformation(startRestartGroup, "C(Switch)P(!1,5,4,2,3)94@4383L39,95@4466L8,*98@4538L7,99@4599L72,100@4709L7,115@5150L1024:Switch.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 14) == 0) {
            z3 = z;
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            if (startRestartGroup.changed(switchColors2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            switchColors2 = switchColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion2 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z7 = i4 == 0 ? true : z4;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                SwitchColors m1532colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1532colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                                startRestartGroup = startRestartGroup;
                                i6 = i3 & (-458753);
                                modifier3 = companion2;
                                z5 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColors3 = m1532colorsSQMK_m0;
                                startRestartGroup.endDefaults();
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float mo336toPx0680j_4 = ((Density) consume).mo336toPx0680j_4(ThumbPathLength);
                                SwipeableState rememberSwipeableStateFor = SwipeableKt.rememberSwipeableStateFor(Boolean.valueOf(z3), function1 != null ? new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                                    public final void invoke(boolean z8) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }
                                } : function1, AnimationSpec, startRestartGroup, (i6 & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                boolean z8 = consume2 != LayoutDirection.Rtl;
                                if (function1 == null) {
                                    i7 = 2;
                                    str = "C:CompositionLocal.kt#9igjgp";
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    companion = ToggleableKt.m830toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource5, null, z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), function1);
                                } else {
                                    i7 = 2;
                                    str = "C:CompositionLocal.kt#9igjgp";
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    companion = Modifier.INSTANCE;
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                if (function1 != null) {
                                    companion3 = TouchTargetKt.minimumTouchTargetSize(companion3);
                                }
                                Modifier then = modifier3.then(companion3).then(companion);
                                Pair[] pairArr = new Pair[i7];
                                pairArr[0] = TuplesKt.to(Float.valueOf(0.0f), false);
                                pairArr[1] = TuplesKt.to(Float.valueOf(mo336toPx0680j_4), true);
                                m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(then, rememberSwipeableStateFor, r17, Orientation.Horizontal, (r26 & 8) != 0 ? true : (z5 || function1 == null) ? false : true, (r26 & 16) != 0 ? false : z8, (r26 & 32) != 0 ? null : mutableInteractionSource5, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final FixedThreshold invoke(T t, T t2) {
                                        return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                    }
                                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt$Switch$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                                        return invoke(bool.booleanValue(), bool2.booleanValue());
                                    }

                                    public final ThresholdConfig invoke(boolean z9, boolean z10) {
                                        return new FractionalThreshold(0.5f);
                                    }
                                }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(pairArr).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                Modifier m628requiredSizeVpY3zN4 = SizeKt.m628requiredSizeVpY3zN4(PaddingKt.m585padding3ABfNKs(SizeKt.wrapContentSize$default(m1530swipeablepPrIpRY, Alignment.INSTANCE.getCenter(), false, i7, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                                startRestartGroup.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                                Object consume3 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density = (Density) consume3;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                                Object consume4 = startRestartGroup.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                                Object consume5 = startRestartGroup.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m628requiredSizeVpY3zN4);
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
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
                                startRestartGroup.startReplaceableGroup(1571176015);
                                ComposerKt.sourceInformation(startRestartGroup, "C135@5958L210:Switch.kt#jmzs0o");
                                int i10 = i6 << 3;
                                boolean z9 = z5;
                                Modifier modifier5 = modifier3;
                                Composer composer2 = startRestartGroup;
                                SwitchColors switchColors4 = switchColors3;
                                SwitchImpl(boxScopeInstance, z, z9, switchColors4, rememberSwipeableStateFor.getOffset(), mutableInteractionSource5, composer2, (i10 & 112) | 6 | ((i6 >> 3) & 896) | ((i6 >> 6) & 7168) | (i10 & 458752));
                                switchColors2 = switchColors4;
                                startRestartGroup = composer2;
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource6 = mutableInteractionSource5;
                                modifier4 = modifier5;
                                z6 = z9;
                            } else {
                                i6 = i3;
                                modifier3 = companion2;
                                z5 = z7;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        switchColors3 = switchColors2;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume6 = startRestartGroup.consume(localDensity3);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float mo336toPx0680j_42 = ((Density) consume6).mo336toPx0680j_4(ThumbPathLength);
                        SwipeableState rememberSwipeableStateFor2 = SwipeableKt.rememberSwipeableStateFor(Boolean.valueOf(z3), function1 != null ? new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z82) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }
                        } : function1, AnimationSpec, startRestartGroup, (i6 & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localLayoutDirection3);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (consume22 != LayoutDirection.Rtl) {
                        }
                        if (function1 == null) {
                        }
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        if (function1 != null) {
                        }
                        Modifier then2 = modifier3.then(companion32).then(companion);
                        Pair[] pairArr2 = new Pair[i7];
                        pairArr2[0] = TuplesKt.to(Float.valueOf(0.0f), false);
                        pairArr2[1] = TuplesKt.to(Float.valueOf(mo336toPx0680j_42), true);
                        m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(then2, rememberSwipeableStateFor2, r17, Orientation.Horizontal, (r26 & 8) != 0 ? true : (z5 || function1 == null) ? false : true, (r26 & 16) != 0 ? false : z8, (r26 & 32) != 0 ? null : mutableInteractionSource5, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function2
                            public final FixedThreshold invoke(T t, T t2) {
                                return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                            }
                        } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt$Switch$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                                return invoke(bool.booleanValue(), bool2.booleanValue());
                            }

                            public final ThresholdConfig invoke(boolean z92, boolean z10) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(pairArr2).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                        Modifier m628requiredSizeVpY3zN42 = SizeKt.m628requiredSizeVpY3zN4(PaddingKt.m585padding3ABfNKs(SizeKt.wrapContentSize$default(m1530swipeablepPrIpRY, Alignment.INSTANCE.getCenter(), false, i7, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        startRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                        Object consume32 = startRestartGroup.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density2 = (Density) consume32;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                        Object consume42 = startRestartGroup.consume(localLayoutDirection22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection2 = (LayoutDirection) consume42;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str);
                        Object consume52 = startRestartGroup.consume(localViewConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume52;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m628requiredSizeVpY3zN42);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        startRestartGroup.startReplaceableGroup(1571176015);
                        ComposerKt.sourceInformation(startRestartGroup, "C135@5958L210:Switch.kt#jmzs0o");
                        int i102 = i6 << 3;
                        boolean z92 = z5;
                        Modifier modifier52 = modifier3;
                        Composer composer22 = startRestartGroup;
                        SwitchColors switchColors42 = switchColors3;
                        SwitchImpl(boxScopeInstance2, z, z92, switchColors42, rememberSwipeableStateFor2.getOffset(), mutableInteractionSource5, composer22, (i102 & 112) | 6 | ((i6 >> 3) & 896) | ((i6 >> 6) & 7168) | (i102 & 458752));
                        switchColors2 = switchColors42;
                        startRestartGroup = composer22;
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        mutableInteractionSource6 = mutableInteractionSource5;
                        modifier4 = modifier52;
                        z6 = z92;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z6 = z4;
                        mutableInteractionSource6 = mutableInteractionSource2;
                    }
                    final SwitchColors switchColors5 = switchColors2;
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$4
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
                            SwitchKt.Switch(z, function1, modifier4, z6, mutableInteractionSource6, switchColors5, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
            z4 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final State<Float> state, final InteractionSource interactionSource, Composer composer, final int i) {
        int i2;
        float f;
        String str;
        long m1534SwitchImpl$lambda7;
        Composer startRestartGroup = composer.startRestartGroup(-1834839253);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchImpl)P(!1,2!1,4)181@7257L46,183@7343L614,183@7309L648,202@8160L28,203@8248L81,203@8193L136,206@8359L28,207@8437L7,*208@8496L7,210@8585L6,218@8838L47,221@8995L59,215@8751L479:Switch.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i3 = (i2 >> 15) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i3);
            if (!snapshotStateList.isEmpty()) {
                f = ThumbPressedElevation;
            } else {
                f = ThumbDefaultElevation;
            }
            float f2 = f;
            int i4 = ((i2 >> 3) & 896) | ((i2 >> 6) & 14) | (i2 & 112);
            final State<Color> trackColor = switchColors.trackColor(z2, z, startRestartGroup, i4);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
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
                        long m1533SwitchImpl$lambda5;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        m1533SwitchImpl$lambda5 = SwitchKt.m1533SwitchImpl$lambda5(trackColor);
                        SwitchKt.m1537drawTrackRPmYEkk(Canvas, m1533SwitchImpl$lambda5, Canvas.mo336toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo336toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors.thumbColor(z2, z, startRestartGroup, i4);
            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localElevationOverlay);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ElevationOverlay elevationOverlay = (ElevationOverlay) consume;
            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localAbsoluteElevation);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m4440constructorimpl = Dp.m4440constructorimpl(((Dp) consume2).m4454unboximpl() + f2);
            startRestartGroup.startReplaceableGroup(-539245361);
            ComposerKt.sourceInformation(startRestartGroup, "211@8660L36");
            if (Color.m2113equalsimpl0(m1534SwitchImpl$lambda7(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU()) && elevationOverlay != null) {
                str = "C(remember)P(1):Composables.kt#9igjgp";
                m1534SwitchImpl$lambda7 = elevationOverlay.mo1358apply7g2Lkgo(m1534SwitchImpl$lambda7(thumbColor), m4440constructorimpl, startRestartGroup, 0);
            } else {
                str = "C(remember)P(1):Composables.kt#9igjgp";
                m1534SwitchImpl$lambda7 = m1534SwitchImpl$lambda7(thumbColor);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier align = boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, str);
            boolean changed3 = startRestartGroup.changed(state);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m4559boximpl(m1538invokeBjo55l4(density));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1538invokeBjo55l4(Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(state.getValue().floatValue()), 0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m232backgroundbw27NRU(ShadowKt.m1784shadows4CzXII$default(SizeKt.m626requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue4), interactionSource, RippleKt.m1610rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), ThumbDiameter), f2, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), m1534SwitchImpl$lambda7, RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
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
                SwitchKt.SwitchImpl(BoxScope.this, z, z2, switchColors, state, interactionSource, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1537drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        DrawScope.m2649drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, Offset.m1872getYimpl(drawScope.mo2661getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, Offset.m1872getYimpl(drawScope.mo2661getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m2466getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchImpl$lambda-5, reason: not valid java name */
    public static final long m1533SwitchImpl$lambda5(State<Color> state) {
        return state.getValue().m2122unboximpl();
    }

    /* renamed from: SwitchImpl$lambda-7, reason: not valid java name */
    private static final long m1534SwitchImpl$lambda7(State<Color> state) {
        return state.getValue().m2122unboximpl();
    }

    static {
        float m4440constructorimpl = Dp.m4440constructorimpl(34);
        TrackWidth = m4440constructorimpl;
        TrackStrokeWidth = Dp.m4440constructorimpl(14);
        float m4440constructorimpl2 = Dp.m4440constructorimpl(20);
        ThumbDiameter = m4440constructorimpl2;
        ThumbRippleRadius = Dp.m4440constructorimpl(24);
        DefaultSwitchPadding = Dp.m4440constructorimpl(2);
        SwitchWidth = m4440constructorimpl;
        SwitchHeight = m4440constructorimpl2;
        ThumbPathLength = Dp.m4440constructorimpl(m4440constructorimpl - m4440constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m4440constructorimpl(1);
        ThumbPressedElevation = Dp.m4440constructorimpl(6);
    }
}
