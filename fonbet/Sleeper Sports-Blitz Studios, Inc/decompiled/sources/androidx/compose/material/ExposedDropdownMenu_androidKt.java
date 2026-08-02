package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\"\u0010\r\u001a\u00020\u0007*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0005H\u0002¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0017X\u008a\u008e\u0002"}, d2 = {"ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "expandable", "Lkotlin/Function0;", "menuLabel", "", "updateHeight", "windowBounds", "Landroidx/compose/ui/unit/IntRect;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "verticalMarginInPx", "", "onHeightUpdate", "material", "width", "menuHeight"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuBox$lambda$21(boolean z, Function1 function1, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        ExposedDropdownMenuBox(z, function1, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, final Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Object obj;
        final WindowBoundsCalculator windowBoundsCalculator;
        final int i4;
        MutableIntState mutableIntState;
        Composer startRestartGroup = composer.startRestartGroup(-1337700255);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenuBox)N(expanded,onExpandedChange,modifier,content)95@4064L7,96@4105L32,97@4155L33,98@4211L33,100@4345L37,103@4408L536,116@4970L29,120@5061L414,132@5536L31,133@5597L38,118@5005L727,140@5749L47,140@5738L58,142@5831L273,142@5802L302:ExposedDropdownMenu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1337700255, i3, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:94)");
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density = (Density) consume;
                final WindowBoundsCalculator platformWindowBoundsCalculator = ExposedDropdownMenu_android.platformWindowBoundsCalculator(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334712158, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334710366, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final MutableIntState mutableIntState3 = (MutableIntState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final int mo738roundToPx0680j_4 = density.mo738roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334706074, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Ref();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final Ref ref = (Ref) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int ExposedDropdownMenuBox$lambda$4 = ExposedDropdownMenuBox$lambda$4(mutableIntState3);
                int ExposedDropdownMenuBox$lambda$1 = ExposedDropdownMenuBox$lambda$1(mutableIntState2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334703559, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                boolean changed = startRestartGroup.changed(density) | startRestartGroup.changed(ExposedDropdownMenuBox$lambda$4) | startRestartGroup.changed(ExposedDropdownMenuBox$lambda$1);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public Modifier exposedDropdownSize(Modifier modifier3, boolean z2) {
                            int ExposedDropdownMenuBox$lambda$42;
                            int ExposedDropdownMenuBox$lambda$12;
                            Density density2 = Density.this;
                            MutableIntState mutableIntState4 = mutableIntState3;
                            MutableIntState mutableIntState5 = mutableIntState2;
                            ExposedDropdownMenuBox$lambda$42 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$4(mutableIntState4);
                            Modifier m1197heightInVpY3zN4$default = SizeKt.m1197heightInVpY3zN4$default(modifier3, 0.0f, density2.mo741toDpu2uoSUM(ExposedDropdownMenuBox$lambda$42), 1, null);
                            if (!z2) {
                                return m1197heightInVpY3zN4$default;
                            }
                            ExposedDropdownMenuBox$lambda$12 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$1(mutableIntState5);
                            return SizeKt.m1214width3ABfNKs(m1197heightInVpY3zN4$default, density2.mo741toDpu2uoSUM(ExposedDropdownMenuBox$lambda$12));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334686082, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final FocusRequester focusRequester = (FocusRequester) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334682785, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(ref) | startRestartGroup.changedInstance(platformWindowBoundsCalculator) | startRestartGroup.changed(mo738roundToPx0680j_4);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    obj = new Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit ExposedDropdownMenuBox$lambda$12$lambda$11;
                            ExposedDropdownMenuBox$lambda$12$lambda$11 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$12$lambda$11(Ref.this, platformWindowBoundsCalculator, mo738roundToPx0680j_4, mutableIntState2, mutableIntState3, (LayoutCoordinates) obj2);
                            return ExposedDropdownMenuBox$lambda$12$lambda$11;
                        }
                    };
                    windowBoundsCalculator = platformWindowBoundsCalculator;
                    i4 = mo738roundToPx0680j_4;
                    mutableIntState = mutableIntState3;
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    windowBoundsCalculator = platformWindowBoundsCalculator;
                    mutableIntState = mutableIntState3;
                    obj = rememberedValue6;
                    i4 = mo738roundToPx0680j_4;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (Function1) obj);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334667968, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                int i6 = i3 & 14;
                int i7 = i3;
                boolean z2 = (i6 == 4) | ((i3 & 112) == 32);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ExposedDropdownMenuBox$lambda$14$lambda$13;
                            ExposedDropdownMenuBox$lambda$14$lambda$13 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$14$lambda$13(Function1.this, z);
                            return ExposedDropdownMenuBox$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(expandable(onGloballyPositioned, (Function0) rememberedValue7, Strings_androidKt.m2487getString4foXLRw(Strings.INSTANCE.m2482getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6)), focusRequester);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                Modifier modifier3 = modifier2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, focusRequester2);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                final MutableIntState mutableIntState4 = mutableIntState;
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 527294489, "C137@5717L9:ExposedDropdownMenu.kt#jmzs0o");
                function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1, startRestartGroup, Integer.valueOf((i7 >> 6) & 112));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334661136, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                boolean z3 = i6 == 4;
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ExposedDropdownMenuBox$lambda$17$lambda$16;
                            ExposedDropdownMenuBox$lambda$17$lambda$16 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$17$lambda$16(z, focusRequester);
                            return ExposedDropdownMenuBox$lambda$17$lambda$16;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) rememberedValue8, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1334658286, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(windowBoundsCalculator) | startRestartGroup.changedInstance(ref) | startRestartGroup.changed(i4);
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ExposedDropdownMenuBox$lambda$20$lambda$19;
                            ExposedDropdownMenuBox$lambda$20$lambda$19 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$20$lambda$19(WindowBoundsCalculator.this, ref, i4, mutableIntState4);
                            return ExposedDropdownMenuBox$lambda$20$lambda$19;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ExposedDropdownMenu_android.OnPlatformWindowBoundsChange((Function0) rememberedValue9, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit ExposedDropdownMenuBox$lambda$21;
                        ExposedDropdownMenuBox$lambda$21 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$21(z, function1, modifier4, function3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return ExposedDropdownMenuBox$lambda$21;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuBox$lambda$12$lambda$11(Ref ref, WindowBoundsCalculator windowBoundsCalculator, int i, MutableIntState mutableIntState, final MutableIntState mutableIntState2, LayoutCoordinates layoutCoordinates) {
        mutableIntState.setIntValue((int) (layoutCoordinates.mo7465getSizeYbymL2g() >> 32));
        ref.setValue(layoutCoordinates);
        updateHeight(windowBoundsCalculator.getVisibleWindowBounds(), (LayoutCoordinates) ref.getValue(), i, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ExposedDropdownMenuBox$lambda$12$lambda$11$lambda$10;
                ExposedDropdownMenuBox$lambda$12$lambda$11$lambda$10 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$12$lambda$11$lambda$10(MutableIntState.this, ((Integer) obj).intValue());
                return ExposedDropdownMenuBox$lambda$12$lambda$11$lambda$10;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuBox$lambda$12$lambda$11$lambda$10(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuBox$lambda$14$lambda$13(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuBox$lambda$17$lambda$16(boolean z, FocusRequester focusRequester) {
        if (z) {
            FocusRequester.m5678requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuBox$lambda$20$lambda$19(WindowBoundsCalculator windowBoundsCalculator, Ref ref, int i, final MutableIntState mutableIntState) {
        updateHeight(windowBoundsCalculator.getVisibleWindowBounds(), (LayoutCoordinates) ref.getValue(), i, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ExposedDropdownMenuBox$lambda$20$lambda$19$lambda$18;
                ExposedDropdownMenuBox$lambda$20$lambda$19$lambda$18 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$20$lambda$19$lambda$18(MutableIntState.this, ((Integer) obj).intValue());
                return ExposedDropdownMenuBox$lambda$20$lambda$19$lambda$18;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenuBox$lambda$20$lambda$19$lambda$18(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    private static final Modifier expandable(Modifier modifier, final Function0<Unit> function0, final String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, function0, new PointerInputEventHandler() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1

            /* compiled from: ExposedDropdownMenu.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {450, 451}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
            /* renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $onExpandedChange;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$onExpandedChange = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
                
                    if (r11 == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, PointerEventPass.Initial, this, 1, null) != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (((PointerInputChange) obj) != null) {
                            this.$onExpandedChange.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, PointerEventPass.Initial, this);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(function0, null), continuation);
                return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
            }
        }), false, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit expandable$lambda$23;
                expandable$lambda$23 = ExposedDropdownMenu_androidKt.expandable$lambda$23(str, function0, (SemanticsPropertyReceiver) obj);
                return expandable$lambda$23;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit expandable$lambda$23(String str, final Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean expandable$lambda$23$lambda$22;
                expandable$lambda$23$lambda$22 = ExposedDropdownMenu_androidKt.expandable$lambda$23$lambda$22(Function0.this);
                return Boolean.valueOf(expandable$lambda$23$lambda$22);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean expandable$lambda$23$lambda$22(Function0 function0) {
        function0.invoke();
        return true;
    }

    private static final void updateHeight(IntRect intRect, LayoutCoordinates layoutCoordinates, int i, Function1<? super Integer, Unit> function1) {
        if (layoutCoordinates == null) {
            return;
        }
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - intRect.getTop(), (intRect.getBottom() - intRect.getTop()) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i));
    }
}
