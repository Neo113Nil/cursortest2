package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerUpdated$1$2", f = "CreateTicketViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class CreateTicketViewModel$onAnswerUpdated$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$onAnswerUpdated$1$2(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, Continuation<? super CreateTicketViewModel$onAnswerUpdated$1$2> continuation) {
        super(2, continuation);
        this.$content = content;
        this.this$0 = createTicketViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTicketViewModel$onAnswerUpdated$1$2(this.$content, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTicketViewModel$onAnswerUpdated$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean isUnsupportedFileType;
        boolean canRetryFileLimitExceededError;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<QuestionState> questions = this.$content.getQuestions();
        ArrayList<QuestionState> arrayList = new ArrayList();
        for (Object obj2 : questions) {
            if (((QuestionState) obj2).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(obj2);
            }
        }
        CreateTicketViewModel createTicketViewModel = this.this$0;
        for (QuestionState questionState : arrayList) {
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            Intrinsics.checkNotNull(questionModel, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.UploadFileQuestionModel");
            SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = (SurveyData.Step.Question.UploadFileQuestionModel) questionModel;
            Answer answer = questionState.getAnswer();
            if (answer instanceof Answer.MediaAnswer) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                int i = 0;
                for (Object obj3 : mediaAnswer.getMediaItems()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj3;
                    if (i < uploadFileQuestionModel.getMaxSelection()) {
                        isUnsupportedFileType = createTicketViewModel.isUnsupportedFileType(mediaItem.getData(), uploadFileQuestionModel.getSupportedFileType());
                        if (isUnsupportedFileType) {
                            mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.UnsupportedFileType(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null)))));
                        } else if (!Intrinsics.areEqual(mediaItem.getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.None.INSTANCE)) {
                            canRetryFileLimitExceededError = createTicketViewModel.canRetryFileLimitExceededError(mediaItem, i, uploadFileQuestionModel.getMaxSelection());
                            if (canRetryFileLimitExceededError) {
                                mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                            }
                        } else {
                            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                        }
                    } else {
                        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(CollectionsKt.listOf((Object[]) new StringProvider.StringRes[]{new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null), new StringProvider.StringRes(R.string.intercom_upload_max_files_allowed, CollectionsKt.listOf(TuplesKt.to("limit", String.valueOf(uploadFileQuestionModel.getMaxSelection()))))}))));
                    }
                    i = i2;
                }
                createTicketViewModel.compressAndUploadFileAttachments(mediaAnswer.getMediaItems());
                questionState.validate();
            }
        }
        this.this$0.updateCtaState();
        return Unit.INSTANCE;
    }
}
