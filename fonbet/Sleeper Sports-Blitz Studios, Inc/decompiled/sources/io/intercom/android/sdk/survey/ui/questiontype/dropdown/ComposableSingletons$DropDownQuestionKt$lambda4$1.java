package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DropDownQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$DropDownQuestionKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$DropDownQuestionKt$lambda4$1 INSTANCE = new ComposableSingletons$DropDownQuestionKt$lambda4$1();

    ComposableSingletons$DropDownQuestionKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            dropDownQuestionModel = DropDownQuestionKt.dropDownQuestionModel;
            DropDownQuestionKt.DropDownQuestion(null, dropDownQuestionModel, new Answer.SingleAnswer("Option A"), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$DropDownQuestionKt$lambda4$1.invoke$lambda$0((Answer) obj);
                    return invoke$lambda$0;
                }
            }, SurveyUiColors.m12620copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), 0L, 0L, Color.INSTANCE.m6066getBlue0d7_KjU(), 0L, null, 27, null), null, composer, 3136, 33);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
