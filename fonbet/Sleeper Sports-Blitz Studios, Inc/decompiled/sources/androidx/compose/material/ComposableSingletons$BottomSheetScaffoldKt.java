package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
    private static Function3<SnackbarHostState, Composer, Integer, Unit> lambda$937349512 = ComposableLambdaKt.composableLambdaInstance(937349512, false, new Function3<SnackbarHostState, Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda$937349512$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
            invoke(snackbarHostState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SnackbarHostState snackbarHostState, Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "CN(it)324@13537L16:BottomSheetScaffold.kt#jmzs0o");
            if ((i & 6) == 0) {
                i |= composer.changed(snackbarHostState) ? 4 : 2;
            }
            if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(937349512, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$937349512.<anonymous> (BottomSheetScaffold.kt:324)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-505419337, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3lambda$505419337 = ComposableLambdaKt.composableLambdaInstance(-505419337, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda$-505419337$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C:BottomSheetScaffold.kt#jmzs0o");
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-505419337, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$-505419337.<anonymous> (BottomSheetScaffold.kt:473)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$687232378 = ComposableLambdaKt.composableLambdaInstance(687232378, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda$687232378$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C:BottomSheetScaffold.kt#jmzs0o");
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687232378, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$687232378.<anonymous> (BottomSheetScaffold.kt:476)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-505419337$material, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2296getLambda$505419337$material() {
        return f3lambda$505419337;
    }

    public final Function2<Composer, Integer, Unit> getLambda$687232378$material() {
        return lambda$687232378;
    }

    public final Function3<SnackbarHostState, Composer, Integer, Unit> getLambda$937349512$material() {
        return lambda$937349512;
    }
}
