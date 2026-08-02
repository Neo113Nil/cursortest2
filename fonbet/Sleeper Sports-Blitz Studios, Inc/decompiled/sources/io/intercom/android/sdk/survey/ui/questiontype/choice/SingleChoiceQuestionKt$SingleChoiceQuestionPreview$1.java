package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleChoiceQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SurveyUiColors $surveyUiColors;

    SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1(SurveyUiColors surveyUiColors) {
        this.$surveyUiColors = surveyUiColors;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            SingleChoiceQuestionKt.SingleChoiceQuestion(null, new SurveyData.Step.Question.SingleChoiceQuestionModel(uuid, CollectionsKt.listOf(new Block.Builder().withText("Question title")), true, CollectionsKt.listOf((Object[]) new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}), false), new Answer.SingleAnswer("Option 2"), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1.invoke$lambda$0((Answer) obj);
                    return invoke$lambda$0;
                }
            }, this.$surveyUiColors, null, composer, 3136, 33);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
