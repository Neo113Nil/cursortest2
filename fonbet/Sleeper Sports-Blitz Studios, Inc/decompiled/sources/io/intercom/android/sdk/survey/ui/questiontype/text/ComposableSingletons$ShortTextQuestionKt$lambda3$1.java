package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: ShortTextQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$ShortTextQuestionKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ShortTextQuestionKt$lambda3$1 INSTANCE = new ComposableSingletons$ShortTextQuestionKt$lambda3$1();

    ComposableSingletons$ShortTextQuestionKt$lambda3$1() {
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
            ShortTextQuestionKt.ShortTextQuestion(null, new SurveyData.Step.Question.ShortTextQuestionModel(uuid, CollectionsKt.listOf(new Block.Builder().withText("Is this a preview?").withType(BlockType.PARAGRAPH.getSerializedName())), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, null, null, 448, null), new Answer.SingleAnswer("Answer"), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$ShortTextQuestionKt$lambda3$1.invoke$lambda$0((Answer) obj);
                    return invoke$lambda$0;
                }
            }, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), ValidationError.NoValidationError.INSTANCE, null, null, composer, 199680, Opcodes.INSTANCEOF);
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
