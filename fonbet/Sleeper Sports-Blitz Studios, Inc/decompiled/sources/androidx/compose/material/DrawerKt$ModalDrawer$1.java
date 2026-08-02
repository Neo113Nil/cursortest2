package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Drawer.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerKt$ModalDrawer$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX WARN: Multi-variable type inference failed */
    DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z, CoroutineScope coroutineScope, long j, Shape shape, long j2, long j3, float f, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z;
        this.$scope = coroutineScope;
        this.$scrimColor = j;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$content = function2;
        this.$drawerContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i2;
        float f;
        ComposerKt.sourceInformation(composer, "C472@18435L7,473@18462L274,473@18451L285,482@18779L7,483@18818L2653:Drawer.kt#jmzs0o");
        if ((i & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i2 = i | (composer.changed(boxWithConstraintsScope2) ? 4 : 2);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1549911011, i2, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:464)");
        }
        long mo1043getConstraintsmsEJaDk = boxWithConstraintsScope2.mo1043getConstraintsmsEJaDk();
        if (!Constraints.m8747getHasBoundedWidthimpl(mo1043getConstraintsmsEJaDk)) {
            throw new IllegalStateException("Drawer shouldn't have infinite width");
        }
        final float f2 = -Constraints.m8751getMaxWidthimpl(mo1043getConstraintsmsEJaDk);
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 889183407, "CC(remember):Drawer.kt#9igjgp");
        boolean changed = composer.changed(this.$drawerState) | composer.changed(density) | composer.changed(f2);
        final DrawerState drawerState = this.$drawerState;
        Object rememberedValue = composer.rememberedValue();
        final float f3 = 0.0f;
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = DrawerKt$ModalDrawer$1.invoke$lambda$2$lambda$1(DrawerState.this, density, f2, f3);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.SideEffect((Function0) rememberedValue, composer, 0);
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(Modifier.INSTANCE, this.$drawerState.getAnchoredDraggableState$material(), Orientation.Horizontal, this.$gesturesEnabled, consume2 == LayoutDirection.Rtl, null, false, 48, null);
        final DrawerState drawerState2 = this.$drawerState;
        final boolean z = this.$gesturesEnabled;
        final CoroutineScope coroutineScope = this.$scope;
        long j = this.$scrimColor;
        Shape shape = this.$drawerShape;
        long j2 = this.$drawerBackgroundColor;
        long j3 = this.$drawerContentColor;
        float f4 = this.$drawerElevation;
        Function2<Composer, Integer, Unit> function2 = this.$content;
        final Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, anchoredDraggable$default);
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
        ComposerKt.sourceInformationMarkerStart(composer, -215522521, "C491@19100L17,494@19206L358,504@19593L70,492@19130L584,507@19748L33,510@19868L7,518@20348L58,520@20499L679,539@21374L87,508@19794L1667:Drawer.kt#jmzs0o");
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer);
        Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1269670255, "C491@19106L9:Drawer.kt#jmzs0o");
        function2.invoke(composer, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean isOpen = drawerState2.isOpen();
        ComposerKt.sourceInformationMarkerStart(composer, -561140279, "CC(remember):Drawer.kt#9igjgp");
        boolean changed2 = composer.changed(z) | composer.changed(drawerState2) | composer.changedInstance(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$5$lambda$4;
                    invoke$lambda$14$lambda$5$lambda$4 = DrawerKt$ModalDrawer$1.invoke$lambda$14$lambda$5$lambda$4(z, drawerState2, coroutineScope);
                    return invoke$lambda$14$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function0 = (Function0) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -561128183, "CC(remember):Drawer.kt#9igjgp");
        boolean changed3 = composer.changed(f2) | composer.changed(drawerState2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            final float f5 = 0.0f;
            rememberedValue3 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float invoke$lambda$14$lambda$7$lambda$6;
                    invoke$lambda$14$lambda$7$lambda$6 = DrawerKt$ModalDrawer$1.invoke$lambda$14$lambda$7$lambda$6(f2, f5, drawerState2);
                    return Float.valueOf(invoke$lambda$14$lambda$7$lambda$6);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DrawerKt.m2321ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue3, j, composer, 0);
        final String m2487getString4foXLRw = Strings_androidKt.m2487getString4foXLRw(Strings.INSTANCE.m2483getNavigationMenuUdPEhr4(), composer, 6);
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density2 = (Density) consume3;
        Modifier m1212sizeInqDBjuR0 = SizeKt.m1212sizeInqDBjuR0(Modifier.INSTANCE, density2.mo741toDpu2uoSUM(Constraints.m8753getMinWidthimpl(mo1043getConstraintsmsEJaDk)), density2.mo741toDpu2uoSUM(Constraints.m8752getMinHeightimpl(mo1043getConstraintsmsEJaDk)), density2.mo741toDpu2uoSUM(Constraints.m8751getMaxWidthimpl(mo1043getConstraintsmsEJaDk)), density2.mo741toDpu2uoSUM(Constraints.m8750getMaxHeightimpl(mo1043getConstraintsmsEJaDk)));
        ComposerKt.sourceInformationMarkerStart(composer, -561104035, "CC(remember):Drawer.kt#9igjgp");
        boolean changed4 = composer.changed(drawerState2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    IntOffset invoke$lambda$14$lambda$10$lambda$9;
                    invoke$lambda$14$lambda$10$lambda$9 = DrawerKt$ModalDrawer$1.invoke$lambda$14$lambda$10$lambda$9(DrawerState.this, (Density) obj);
                    return invoke$lambda$14$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier offset = OffsetKt.offset(m1212sizeInqDBjuR0, (Function1) rememberedValue4);
        f = DrawerKt.EndDrawerPadding;
        Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(offset, 0.0f, 0.0f, f, 0.0f, 11, null);
        ComposerKt.sourceInformationMarkerStart(composer, -561098582, "CC(remember):Drawer.kt#9igjgp");
        boolean changed5 = composer.changed(m2487getString4foXLRw) | composer.changed(drawerState2) | composer.changedInstance(coroutineScope);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$14$lambda$13$lambda$12;
                    invoke$lambda$14$lambda$13$lambda$12 = DrawerKt$ModalDrawer$1.invoke$lambda$14$lambda$13$lambda$12(m2487getString4foXLRw, drawerState2, coroutineScope, (SemanticsPropertyReceiver) obj);
                    return invoke$lambda$14$lambda$13$lambda$12;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SurfaceKt.m2489SurfaceFjzlyU(SemanticsModifierKt.semantics$default(m1161paddingqDBjuR0$default, false, (Function1) rememberedValue5, 1, null), shape, j2, j3, null, f4, ComposableLambdaKt.rememberComposableLambda(1265707871, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                ComposerKt.sourceInformation(composer2, "C540@21392L55:Drawer.kt#jmzs0o");
                if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1265707871, i3, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:540)");
                }
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer2);
                Updater.m5340setimpl(m5333constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m5333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m5333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
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
        }, composer, 54), composer, 1572864, 16);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(DrawerState drawerState, Density density, final float f, final float f2) {
        drawerState.setDensity$material(density);
        AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material(), AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$2$lambda$1$lambda$0;
                invoke$lambda$2$lambda$1$lambda$0 = DrawerKt$ModalDrawer$1.invoke$lambda$2$lambda$1$lambda$0(f, f2, (DraggableAnchorsConfig) obj);
                return invoke$lambda$2$lambda$1$lambda$0;
            }
        }), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(float f, float f2, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(DrawerValue.Closed, f);
        draggableAnchorsConfig.at(DrawerValue.Open, f2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$5$lambda$4(boolean z, DrawerState drawerState, CoroutineScope coroutineScope) {
        if (z && drawerState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(DrawerValue.Closed).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DrawerKt$ModalDrawer$1$2$2$1$1(drawerState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$14$lambda$7$lambda$6(float f, float f2, DrawerState drawerState) {
        float calculateFraction;
        calculateFraction = DrawerKt.calculateFraction(f, f2, drawerState.requireOffset$material());
        return calculateFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$14$lambda$10$lambda$9(DrawerState drawerState, Density density) {
        return IntOffset.m8917boximpl(IntOffset.m8920constructorimpl((MathKt.roundToInt(drawerState.requireOffset$material()) << 32) | (0 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12(String str, final DrawerState drawerState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean invoke$lambda$14$lambda$13$lambda$12$lambda$11;
                    invoke$lambda$14$lambda$13$lambda$12$lambda$11 = DrawerKt$ModalDrawer$1.invoke$lambda$14$lambda$13$lambda$12$lambda$11(DrawerState.this, coroutineScope);
                    return Boolean.valueOf(invoke$lambda$14$lambda$13$lambda$12$lambda$11);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$14$lambda$13$lambda$12$lambda$11(DrawerState drawerState, CoroutineScope coroutineScope) {
        if (!drawerState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(DrawerValue.Closed).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DrawerKt$ModalDrawer$1$2$6$1$1$1(drawerState, null), 3, null);
        return true;
    }
}
