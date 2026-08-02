package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmojiQuestion.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"EmojiQuestion", "", "options", "", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", "(Ljava/util/List;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EmojiQuestionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiQuestion$lambda$4(List options, Answer answer, Function1 onAnswer, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        EmojiQuestion(options, answer, onAnswer, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EmojiQuestion(final List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption> options, final Answer answer, final Function1<? super Answer, Unit> onAnswer, Composer composer, final int i) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Composer startRestartGroup = composer.startRestartGroup(1738433356);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.Horizontal m1021spacedByD5KLDUw = Arrangement.Absolute.INSTANCE.m1021spacedByD5KLDUw(Dp.m8798constructorimpl(12), Alignment.INSTANCE.getCenterHorizontally());
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1021spacedByD5KLDUw, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
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
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1487440982);
        for (final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption emojiRatingOption : options) {
            boolean z2 = (answer instanceof Answer.SingleAnswer) && Intrinsics.areEqual(((Answer.SingleAnswer) answer).getAnswer(), String.valueOf(emojiRatingOption.getValue()));
            String emojiUrl = emojiRatingOption.getEmojiUrl();
            boolean z3 = z2;
            String unicode = emojiRatingOption.getUnicode();
            if ((answer instanceof Answer.NoAnswer) || z3) {
                str = emojiUrl;
                z = true;
            } else {
                str = emojiUrl;
                z = false;
            }
            Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(z3 ? 34 : 32));
            startRestartGroup.startReplaceGroup(1945180755);
            boolean changed = ((((i & 896) ^ 384) > 256 && startRestartGroup.changed(onAnswer)) || (i & 384) == 256) | startRestartGroup.changed(emojiRatingOption);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiQuestionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0;
                        EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0 = EmojiQuestionKt.EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(Function1.this, emojiRatingOption);
                        return EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            EmojiRatingKt.EmojiRating(str, unicode, z, ClickableKt.m623clickableoSLSa3U$default(m1209size3ABfNKs, false, null, null, null, (Function0) rememberedValue, 15, null), startRestartGroup, 0, 0);
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmojiQuestion$lambda$4;
                    EmojiQuestion$lambda$4 = EmojiQuestionKt.EmojiQuestion$lambda$4(options, answer, onAnswer, i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmojiQuestion$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(Function1 onAnswer, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption option) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(option, "$option");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(option.getValue())));
        return Unit.INSTANCE;
    }
}
