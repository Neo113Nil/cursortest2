package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$SoundWaveVisualizationKt {
    public static final ComposableSingletons$SoundWaveVisualizationKt INSTANCE = new ComposableSingletons$SoundWaveVisualizationKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f197lambda1 = ComposableLambdaKt.composableLambdaInstance(1716228299, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$SoundWaveVisualizationKt$lambda-1$1
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
            composer.startReplaceGroup(362674078);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Float.valueOf(0.7f));
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            SoundWaveVisualizationKt.m12316SoundWaveVisualizationFNF3uiM((MutableStateFlow) rememberedValue, PaddingKt.m1157padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(16)), 0L, composer, 56, 4);
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f198lambda2 = ComposableLambdaKt.composableLambdaInstance(1827066684, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$SoundWaveVisualizationKt$lambda-2$1
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
            composer.startReplaceGroup(1870237536);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Float.valueOf(0.02f));
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            SoundWaveVisualizationKt.m12316SoundWaveVisualizationFNF3uiM((MutableStateFlow) rememberedValue, PaddingKt.m1157padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(16)), 0L, composer, 56, 4);
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f199lambda3 = ComposableLambdaKt.composableLambdaInstance(-1607955159, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$SoundWaveVisualizationKt$lambda-3$1
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
            composer.startReplaceGroup(-917166560);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Float.valueOf(0.7f));
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue;
            composer.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Rtl), ComposableLambdaKt.rememberComposableLambda(-328642071, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$SoundWaveVisualizationKt$lambda-3$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        SoundWaveVisualizationKt.m12316SoundWaveVisualizationFNF3uiM(mutableStateFlow, PaddingKt.m1157padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(16)), 0L, composer2, 56, 4);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12283getLambda1$intercom_sdk_base_release() {
        return f197lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12284getLambda2$intercom_sdk_base_release() {
        return f198lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12285getLambda3$intercom_sdk_base_release() {
        return f199lambda3;
    }
}
