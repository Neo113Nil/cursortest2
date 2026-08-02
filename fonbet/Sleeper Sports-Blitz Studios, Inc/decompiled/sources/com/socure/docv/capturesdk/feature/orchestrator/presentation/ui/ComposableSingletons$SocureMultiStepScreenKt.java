package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.socure.docv.capturesdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SocureMultiStepScreen.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$SocureMultiStepScreenKt {
    public static final ComposableSingletons$SocureMultiStepScreenKt INSTANCE = new ComposableSingletons$SocureMultiStepScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f59lambda1 = ComposableLambdaKt.composableLambdaInstance(1597181072, false, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.ComposableSingletons$SocureMultiStepScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1597181072, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.ComposableSingletons$SocureMultiStepScreenKt.lambda-1.<anonymous> (SocureMultiStepScreen.kt:97)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f60lambda2 = ComposableLambdaKt.composableLambdaInstance(1005323198, false, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.ComposableSingletons$SocureMultiStepScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1005323198, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.ComposableSingletons$SocureMultiStepScreenKt.lambda-2.<anonymous> (SocureMultiStepScreen.kt:104)");
                }
                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_socure_close, composer, 0), "Close", (Modifier) null, 0L, composer, 56, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$capturesdk_productionRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11543getLambda1$capturesdk_productionRelease() {
        return f59lambda1;
    }

    /* renamed from: getLambda-2$capturesdk_productionRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11544getLambda2$capturesdk_productionRelease() {
        return f60lambda2;
    }
}
