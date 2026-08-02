package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();
    private static Function3<SnackbarData, Composer, Integer, Unit> lambda$1890101041 = ComposableLambdaKt.composableLambdaInstance(1890101041, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda$1890101041$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SnackbarData snackbarData, Composer composer, int i) {
            int i2;
            ComposerKt.sourceInformation(composer, "CN(it)154@6547L12:SnackbarHost.kt#jmzs0o");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(snackbarData) : composer.changedInstance(snackbarData) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1890101041, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda$1890101041.<anonymous> (SnackbarHost.kt:154)");
            }
            SnackbarKt.m2470SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, 0L, 0.0f, composer, i2 & 14, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<SnackbarData, Composer, Integer, Unit> getLambda$1890101041$material() {
        return lambda$1890101041;
    }
}
