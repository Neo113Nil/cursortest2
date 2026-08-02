package io.intercom.android.sdk.tickets.create.reducers;

import io.intercom.android.sdk.blocks.lib.models.FormField;
import io.intercom.android.sdk.blocks.lib.models.ListOption;
import io.intercom.android.sdk.blocks.lib.models.Options;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConditionalAttributesReducer.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"reduceAttributeList", "", "Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "updatedQuestionId", "", "currentTicketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "currentUiState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConditionalAttributesReducerKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<TicketAttributeRequest> reduceAttributeList(String updatedQuestionId, TicketTypeV2 ticketTypeV2, CreateTicketViewModel.CreateTicketFormUiState currentUiState) {
        Object obj;
        Answer answer;
        QuestionState questionState;
        String answer2;
        List<ListOption> listOptions;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(updatedQuestionId, "updatedQuestionId");
        Intrinsics.checkNotNullParameter(currentUiState, "currentUiState");
        if (ticketTypeV2 != null) {
            Iterator<T> it = ticketTypeV2.getFormFields().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((FormField) obj).getId(), updatedQuestionId)) {
                    break;
                }
            }
            FormField formField = (FormField) obj;
            if (formField == null) {
                return CollectionsKt.emptyList();
            }
            if (formField.isControllingAttribute()) {
                List createListBuilder = CollectionsKt.createListBuilder();
                for (FormField formField2 : ticketTypeV2.getFormFields()) {
                    String id = formField2.getId();
                    if (currentUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content) {
                        Iterator<T> it2 = ((CreateTicketViewModel.CreateTicketFormUiState.Content) currentUiState).getQuestions().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (Intrinsics.areEqual(((QuestionState) obj3).getQuestionModel().getId(), id)) {
                                break;
                            }
                        }
                        questionState = (QuestionState) obj3;
                        answer = questionState != null ? questionState.getAnswer() : null;
                    } else {
                        answer = null;
                        questionState = null;
                    }
                    if (answer != null) {
                        if (!(answer instanceof Answer.DateTimeAnswer) && !(answer instanceof Answer.MediaAnswer) && !(answer instanceof Answer.MultipleAnswer) && !Intrinsics.areEqual(answer, Answer.NoAnswer.InitialNoAnswer.INSTANCE) && !Intrinsics.areEqual(answer, Answer.NoAnswer.ResetNoAnswer.INSTANCE)) {
                            if (!(answer instanceof Answer.SingleAnswer)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if ((questionState != null ? questionState.getQuestionModel() : null) instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                Options options = formField2.getOptions();
                                if (options != null && (listOptions = options.getListOptions()) != null) {
                                    Iterator<T> it3 = listOptions.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it3.next();
                                        if (Intrinsics.areEqual(((ListOption) obj2).getLabel(), ((Answer.SingleAnswer) answer).getAnswer())) {
                                            break;
                                        }
                                    }
                                    ListOption listOption = (ListOption) obj2;
                                    if (listOption != null) {
                                        answer2 = listOption.getId();
                                    }
                                }
                            } else {
                                answer2 = ((Answer.SingleAnswer) answer).getAnswer();
                            }
                            if (answer2 == null) {
                                createListBuilder.add(new TicketAttributeRequest(id, answer2));
                            }
                        }
                        answer2 = null;
                        if (answer2 == null) {
                        }
                    }
                }
                return CollectionsKt.build(createListBuilder);
            }
        }
        return CollectionsKt.emptyList();
    }
}
