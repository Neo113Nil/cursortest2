package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX WARN: Multi-variable type inference failed */
    BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, float f, int i, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, boolean z, Shape shape, float f2, long j, long j2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33) {
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = function2;
        this.$floatingActionButton = function22;
        this.$sheetPeekHeight = f;
        this.$floatingActionButtonPosition = i;
        this.$content = function3;
        this.$sheetGesturesEnabled = z;
        this.$sheetShape = shape;
        this.$sheetElevation = f2;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetContent = function32;
        this.$snackbarHost = function33;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C340@14401L52,341@14481L1220,366@15787L49,369@15968L50,338@14326L1776:BottomSheetScaffold.kt#jmzs0o");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-747577963, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)");
        }
        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        Function2<Composer, Integer, Unit> function2 = this.$topBar;
        final Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
        final float f = this.$sheetPeekHeight;
        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(601061661, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ComposerKt.sourceInformation(composer2, "C340@14403L48:BottomSheetScaffold.kt#jmzs0o");
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(601061661, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
                }
                function3.invoke(PaddingKt.m1154PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54);
        final boolean z = this.$sheetGesturesEnabled;
        final BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
        final float f2 = this.$sheetPeekHeight;
        final Shape shape = this.$sheetShape;
        final float f3 = this.$sheetElevation;
        final long j = this.$sheetBackgroundColor;
        final long j2 = this.$sheetContentColor;
        final Function3<ColumnScope, Composer, Integer, Unit> function32 = this.$sheetContent;
        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1835125948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                Modifier.Companion companion;
                ComposerKt.sourceInformation(composer2, "C353@15111L576:BottomSheetScaffold.kt#jmzs0o");
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1835125948, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:342)");
                }
                if (z) {
                    composer2.startReplaceGroup(-401495582);
                    ComposerKt.sourceInformation(composer2, "345@14641L391");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material = bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material();
                    ComposerKt.sourceInformationMarkerStart(composer2, -1675517117, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                    boolean changed = composer2.changed(anchoredDraggableState$material);
                    BottomSheetScaffoldState bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState2.getBottomSheetState().getAnchoredDraggableState$material(), Orientation.Vertical);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    companion = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) rememberedValue, null, 2, null);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1675503260);
                    composer2.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                BottomSheetScaffoldKt.m2230BottomSheetdAqlCkY(bottomSheetScaffoldState.getBottomSheetState(), z, shape, f3, j, j2, f2, SizeKt.m1200requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f2, 0.0f, 2, null), function32, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54);
        Function2<Composer, Integer, Unit> function22 = this.$floatingActionButton;
        final Function3<SnackbarHostState, Composer, Integer, Unit> function33 = this.$snackbarHost;
        final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.$scaffoldState;
        ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(8287226, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                ComposerKt.sourceInformation(composer2, "C366@15789L45:BottomSheetScaffold.kt#jmzs0o");
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(8287226, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:366)");
                }
                function33.invoke(bottomSheetScaffoldState2.getSnackbarHostState(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54);
        float f4 = this.$sheetPeekHeight;
        ComposerKt.sourceInformationMarkerStart(composer, -1162831097, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean changed = composer.changed(this.$scaffoldState);
        final BottomSheetScaffoldState bottomSheetScaffoldState3 = this.$scaffoldState;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = BottomSheetScaffoldKt$BottomSheetScaffold$1.invoke$lambda$1$lambda$0(BottomSheetScaffoldState.this);
                    return Float.valueOf(invoke$lambda$1$lambda$0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomSheetScaffoldKt.m2232BottomSheetScaffoldLayoutHJHHjMs(function2, rememberComposableLambda, rememberComposableLambda2, function22, rememberComposableLambda3, f4, (Function0) rememberedValue, this.$floatingActionButtonPosition, bottomSheetState, composer, 25008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1$lambda$0(BottomSheetScaffoldState bottomSheetScaffoldState) {
        return bottomSheetScaffoldState.getBottomSheetState().requireOffset();
    }
}
