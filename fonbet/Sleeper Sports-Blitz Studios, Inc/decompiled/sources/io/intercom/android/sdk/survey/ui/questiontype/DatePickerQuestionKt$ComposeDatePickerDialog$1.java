package io.intercom.android.sdk.survey.ui.questiontype;

import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DatePickerQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class DatePickerQuestionKt$ComposeDatePickerDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Answer $answer;
    final /* synthetic */ DatePickerState $datePickerState;
    final /* synthetic */ Function1<Answer, Unit> $onAnswer;
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: Multi-variable type inference failed */
    DatePickerQuestionKt$ComposeDatePickerDialog$1(DatePickerState datePickerState, Answer answer, Function1<? super Answer, Unit> function1, Function0<Unit> function0) {
        this.$datePickerState = datePickerState;
        this.$answer = answer;
        this.$onAnswer = function1;
        this.$onDismiss = function0;
    }

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
        composer.startReplaceGroup(313001213);
        boolean changed = composer.changed(this.$datePickerState) | composer.changed(this.$answer) | composer.changed(this.$onAnswer) | composer.changed(this.$onDismiss);
        final DatePickerState datePickerState = this.$datePickerState;
        final Answer answer = this.$answer;
        final Function1<Answer, Unit> function1 = this.$onAnswer;
        final Function0<Unit> function0 = this.$onDismiss;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = DatePickerQuestionKt$ComposeDatePickerDialog$1.invoke$lambda$1$lambda$0(DatePickerState.this, answer, function1, function0);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m12708getLambda2$intercom_sdk_base_release(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(DatePickerState datePickerState, Answer answer, Function1 onAnswer, Function0 onDismiss) {
        List utcTime;
        Answer.DateTimeAnswer dateTimeAnswer;
        Intrinsics.checkNotNullParameter(datePickerState, "$datePickerState");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        Long selectedDateMillis = datePickerState.getSelectedDateMillis();
        if (selectedDateMillis != null) {
            if (answer instanceof Answer.DateTimeAnswer) {
                dateTimeAnswer = Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, selectedDateMillis.longValue(), 0, 0, 6, null);
            } else {
                long currentTimeMillis = Injector.get().getTimeProvider().currentTimeMillis();
                utcTime = DatePickerQuestionKt.getUtcTime(TimeFormatter.getHour(currentTimeMillis), TimeFormatter.getMinute(currentTimeMillis));
                dateTimeAnswer = new Answer.DateTimeAnswer(selectedDateMillis.longValue(), Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)));
            }
            onAnswer.invoke(dateTimeAnswer);
        } else {
            onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }
}
