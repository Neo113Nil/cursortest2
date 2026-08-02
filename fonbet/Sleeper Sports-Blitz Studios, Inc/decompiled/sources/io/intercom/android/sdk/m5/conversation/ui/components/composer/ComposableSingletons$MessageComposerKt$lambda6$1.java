package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MessageComposer.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-6$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$MessageComposerKt$lambda6$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MessageComposerKt$lambda6$1 INSTANCE = new ComposableSingletons$MessageComposerKt$lambda6$1();

    ComposableSingletons$MessageComposerKt$lambda6$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
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
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1782289977);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Float.valueOf(0.5f));
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-6$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$1;
                    invoke$lambda$4$lambda$1 = ComposableSingletons$MessageComposerKt$lambda6$1.invoke$lambda$4$lambda$1((String) obj);
                    return invoke$lambda$4$lambda$1;
                }
            }, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, 28, null), null, null, null, null, null, null, VoiceTranscriptionState.Recording.INSTANCE, (MutableStateFlow) rememberedValue, null, null, null, composer, 805306928, 8, 14841);
            MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-6$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$2;
                    invoke$lambda$4$lambda$2 = ComposableSingletons$MessageComposerKt$lambda6$1.invoke$lambda$4$lambda$2((String) obj);
                    return invoke$lambda$4$lambda$2;
                }
            }, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, 28, null), null, null, null, null, null, null, VoiceTranscriptionState.Processing.INSTANCE, null, null, null, null, composer, 805306928, 0, 15865);
            MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-6$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = ComposableSingletons$MessageComposerKt$lambda6$1.invoke$lambda$4$lambda$3((String) obj);
                    return invoke$lambda$4$lambda$3;
                }
            }, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, 28, null), null, null, null, null, null, null, new VoiceTranscriptionState.Error(new VoiceTranscriptionError.TranscriptionFailed(null, 1, null)), null, null, null, null, composer, 1073742384, 0, 15865);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
