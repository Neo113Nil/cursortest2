package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u001a\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u001a-\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00142\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\nH\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"SwipeToDismiss", "", "state", "Landroidx/compose/material/DismissState;", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "background", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", "from", "Landroidx/compose/material/DismissValue;", "to", "rememberDismissState", "initialValue", "confirmStateChange", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwipeToDismissKt {
    @ExperimentalMaterialApi
    public static final DismissState rememberDismissState(final DismissValue dismissValue, final Function1<? super DismissValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1753522702);
        ComposerKt.sourceInformation(composer, "C(rememberDismissState)P(1)151@5327L127:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<DismissValue, Boolean>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(DismissValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        DismissState dismissState = (DismissState) RememberSaveableKt.m1729rememberSaveable(new Object[0], (Saver) DismissState.INSTANCE.Saver(function1), (String) null, (Function0) new Function0<DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DismissState invoke() {
                return new DismissState(DismissValue.this, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return dismissState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0066  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismiss(final DismissState state, Modifier modifier, Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> background, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> dismissContent, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function12;
        int i6;
        Set<? extends DismissDirection> set2;
        final int i7;
        Modifier modifier3;
        final Set<? extends DismissDirection> set3;
        final Function1<? super DismissDirection, ? extends ThresholdConfig> function13;
        final Set<? extends DismissDirection> set4;
        final Function1<? super DismissDirection, ? extends ThresholdConfig> function14;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        Composer startRestartGroup = composer.startRestartGroup(634380143);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwipeToDismiss)P(5,4,1,3)178@6527L1407:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(background) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i6 = startRestartGroup.changed(dismissContent) ? 131072 : 65536;
                    }
                    if (i4 == 4 || (374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                set2 = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                                i3 &= -897;
                            } else {
                                set2 = set;
                            }
                            if (i5 == 0) {
                                modifier3 = companion;
                                set3 = set2;
                                function13 = new Function1<DismissDirection, FractionalThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final FractionalThreshold invoke(DismissDirection it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return new FractionalThreshold(0.5f);
                                    }
                                };
                                i7 = i3;
                                startRestartGroup.endDefaults();
                                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i9) {
                                        int i10;
                                        Modifier m1530swipeablepPrIpRY;
                                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                        ComposerKt.sourceInformation(composer2, "C180@6642L7,186@6883L106,193@7214L718:SwipeToDismiss.kt#jmzs0o");
                                        if ((i9 & 14) == 0) {
                                            i10 = i9 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                                        } else {
                                            i10 = i9;
                                        }
                                        if ((i10 & 91) != 18 || !composer2.getSkipping()) {
                                            float m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(BoxWithConstraints.mo521getConstraintsmsEJaDk());
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume = composer2.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            boolean z = consume == LayoutDirection.Rtl;
                                            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(Float.valueOf(0.0f), DismissValue.Default));
                                            if (set3.contains(DismissDirection.StartToEnd)) {
                                                Pair pair = TuplesKt.to(Float.valueOf(m4396getMaxWidthimpl), DismissValue.DismissedToEnd);
                                                mutableMapOf.put(pair.getFirst(), pair.getSecond());
                                            }
                                            if (set3.contains(DismissDirection.EndToStart)) {
                                                Pair pair2 = TuplesKt.to(Float.valueOf(-m4396getMaxWidthimpl), DismissValue.DismissedToStart);
                                                mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                            }
                                            final Function1<DismissDirection, ThresholdConfig> function15 = function13;
                                            composer2.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed = composer2.changed(function15);
                                            Object rememberedValue = composer2.rememberedValue();
                                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = (Function2) new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final ThresholdConfig invoke(DismissValue from, DismissValue to) {
                                                        DismissDirection dismissDirection;
                                                        Intrinsics.checkNotNullParameter(from, "from");
                                                        Intrinsics.checkNotNullParameter(to, "to");
                                                        Function1<DismissDirection, ThresholdConfig> function16 = function15;
                                                        dismissDirection = SwipeToDismissKt.getDismissDirection(from, to);
                                                        Intrinsics.checkNotNull(dismissDirection);
                                                        return function16.invoke(dismissDirection);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue);
                                            }
                                            composer2.endReplaceableGroup();
                                            m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, state, mutableMapOf, Orientation.Horizontal, (r26 & 8) != 0 ? true : state.getCurrentValue() == DismissValue.Default, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final FixedThreshold invoke(T t, T t2) {
                                                    return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                                }
                                            } : (Function2) rememberedValue, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(m4396getMaxWidthimpl, set3.contains(DismissDirection.EndToStart) ? 10.0f : 20.0f, set3.contains(DismissDirection.StartToEnd) ? 10.0f : 20.0f), (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                            Function3<RowScope, Composer, Integer, Unit> function3 = background;
                                            int i11 = i7;
                                            final DismissState dismissState = state;
                                            Function3<RowScope, Composer, Integer, Unit> function32 = dismissContent;
                                            composer2.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                            composer2.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer2.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Density density = (Density) consume2;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer2.consume(localLayoutDirection2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer2.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1530swipeablepPrIpRY);
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
                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(981834387);
                                            ComposerKt.sourceInformation(composer2, "C208@7678L98,214@7867L49,212@7785L141:SwipeToDismiss.kt#jmzs0o");
                                            Modifier matchParentSize = boxScopeInstance.matchParentSize(Modifier.INSTANCE);
                                            int i12 = (i11 >> 3) & 7168;
                                            composer2.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                            composer2.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer2.consume(localDensity2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Density density2 = (Density) consume5;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume6 = composer2.consume(localLayoutDirection3);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume7 = composer2.consume(localViewConfiguration2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(matchParentSize);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            composer2.disableReusing();
                                            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                                            Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                            function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i12 >> 6) & 112) | 6));
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            composer2.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed2 = composer2.changed(dismissState);
                                            Object rememberedValue2 = composer2.rememberedValue();
                                            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                                        return IntOffset.m4559boximpl(m1528invokeBjo55l4(density3));
                                                    }

                                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                    public final long m1528invokeBjo55l4(Density offset) {
                                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(DismissState.this.getOffset().getValue().floatValue()), 0);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue2);
                                            }
                                            composer2.endReplaceableGroup();
                                            Modifier offset = OffsetKt.offset(companion2, (Function1) rememberedValue2);
                                            int i13 = (i11 >> 6) & 7168;
                                            composer2.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                            composer2.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume8 = composer2.consume(localDensity3);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Density density3 = (Density) consume8;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume9 = composer2.consume(localLayoutDirection4);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            LayoutDirection layoutDirection3 = (LayoutDirection) consume9;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume10 = composer2.consume(localViewConfiguration3);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(offset);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor3);
                                            } else {
                                                composer2.useNode();
                                            }
                                            composer2.disableReusing();
                                            Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer2);
                                            Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                            function32.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                                set4 = set3;
                                function14 = function13;
                                modifier4 = modifier3;
                            } else {
                                i7 = i3;
                                modifier3 = companion;
                                set3 = set2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            set3 = set;
                            i7 = i3;
                            modifier3 = modifier2;
                        }
                        function13 = function12;
                        startRestartGroup.endDefaults();
                        BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i9) {
                                int i10;
                                Modifier m1530swipeablepPrIpRY;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                ComposerKt.sourceInformation(composer2, "C180@6642L7,186@6883L106,193@7214L718:SwipeToDismiss.kt#jmzs0o");
                                if ((i9 & 14) == 0) {
                                    i10 = i9 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i10 = i9;
                                }
                                if ((i10 & 91) != 18 || !composer2.getSkipping()) {
                                    float m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(BoxWithConstraints.mo521getConstraintsmsEJaDk());
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    boolean z = consume == LayoutDirection.Rtl;
                                    Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(Float.valueOf(0.0f), DismissValue.Default));
                                    if (set3.contains(DismissDirection.StartToEnd)) {
                                        Pair pair = TuplesKt.to(Float.valueOf(m4396getMaxWidthimpl), DismissValue.DismissedToEnd);
                                        mutableMapOf.put(pair.getFirst(), pair.getSecond());
                                    }
                                    if (set3.contains(DismissDirection.EndToStart)) {
                                        Pair pair2 = TuplesKt.to(Float.valueOf(-m4396getMaxWidthimpl), DismissValue.DismissedToStart);
                                        mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                    }
                                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function15 = function13;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = composer2.changed(function15);
                                    Object rememberedValue = composer2.rememberedValue();
                                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (Function2) new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final ThresholdConfig invoke(DismissValue from, DismissValue to) {
                                                DismissDirection dismissDirection;
                                                Intrinsics.checkNotNullParameter(from, "from");
                                                Intrinsics.checkNotNullParameter(to, "to");
                                                Function1<DismissDirection, ThresholdConfig> function16 = function15;
                                                dismissDirection = SwipeToDismissKt.getDismissDirection(from, to);
                                                Intrinsics.checkNotNull(dismissDirection);
                                                return function16.invoke(dismissDirection);
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue);
                                    }
                                    composer2.endReplaceableGroup();
                                    m1530swipeablepPrIpRY = SwipeableKt.m1530swipeablepPrIpRY(Modifier.INSTANCE, state, mutableMapOf, Orientation.Horizontal, (r26 & 8) != 0 ? true : state.getCurrentValue() == DismissValue.Default, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2<T, T, FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final FixedThreshold invoke(T t, T t2) {
                                            return new FixedThreshold(Dp.m4440constructorimpl(56), null);
                                        }
                                    } : (Function2) rememberedValue, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(m4396getMaxWidthimpl, set3.contains(DismissDirection.EndToStart) ? 10.0f : 20.0f, set3.contains(DismissDirection.StartToEnd) ? 10.0f : 20.0f), (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1529getVelocityThresholdD9Ej5fM() : 0.0f);
                                    Function3<RowScope, Composer, Integer, Unit> function3 = background;
                                    int i11 = i7;
                                    final DismissState dismissState = state;
                                    Function3<RowScope, Composer, Integer, Unit> function32 = dismissContent;
                                    composer2.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume2;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localLayoutDirection2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1530swipeablepPrIpRY);
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
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(981834387);
                                    ComposerKt.sourceInformation(composer2, "C208@7678L98,214@7867L49,212@7785L141:SwipeToDismiss.kt#jmzs0o");
                                    Modifier matchParentSize = boxScopeInstance.matchParentSize(Modifier.INSTANCE);
                                    int i12 = (i11 >> 3) & 7168;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer2.consume(localDensity2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density2 = (Density) consume5;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume6 = composer2.consume(localLayoutDirection3);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) consume6;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume7 = composer2.consume(localViewConfiguration2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(matchParentSize);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                    function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i12 >> 6) & 112) | 6));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer2.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed2 = composer2.changed(dismissState);
                                    Object rememberedValue2 = composer2.rememberedValue();
                                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                                return IntOffset.m4559boximpl(m1528invokeBjo55l4(density3));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m1528invokeBjo55l4(Density offset) {
                                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                return IntOffsetKt.IntOffset(MathKt.roundToInt(DismissState.this.getOffset().getValue().floatValue()), 0);
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier offset = OffsetKt.offset(companion2, (Function1) rememberedValue2);
                                    int i13 = (i11 >> 6) & 7168;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume8 = composer2.consume(localDensity3);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density3 = (Density) consume8;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume9 = composer2.consume(localLayoutDirection4);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) consume9;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume10 = composer2.consume(localViewConfiguration3);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(offset);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor3);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                    function32.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                        set4 = set3;
                        function14 = function13;
                        modifier4 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        set4 = set;
                        modifier4 = modifier2;
                        function14 = function12;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
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
                            SwipeToDismissKt.SwipeToDismiss(DismissState.this, modifier4, set4, function14, background, dismissContent, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i6;
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
            }
            function12 = function1;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == DismissValue.Default) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == DismissValue.Default) {
            return DismissDirection.EndToStart;
        }
        return null;
    }
}
