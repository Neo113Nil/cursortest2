package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.AddAnswerRequest;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.AddQuestionOrAnswerResponse;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.AddQuestionRequest;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.Action;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;
import z00.g;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "it", "", "text", "", "submitAnswer", "(JLjava/lang/String;)V", "", "submitQuestion", "(ZLjava/lang/String;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/question/AddQuestionOrAnswerResponse;", "response", "onSuccess", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/question/AddQuestionOrAnswerResponse;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "vo", "bind", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;)V", "isAnonymous", "submit", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "minLength", "I", "productId", "J", "questionId", "Ljava/lang/Long;", "widgetId", "invalidLengthError", "Ljava/lang/String;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/Action;", "actionLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewQuestionFormViewModelImpl extends w0 implements NewQuestionFormViewModel {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;
    private String invalidLengthError;
    private int minLength;
    private long productId;
    private Long questionId;

    @NotNull
    private final ActionV2Repository repository;
    private Long widgetId;

    public NewQuestionFormViewModelImpl(@NotNull ActionV2Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.questionId = 0L;
        this.actionLiveData = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable error) {
        getActionLiveData().setValue(g.c(error) ? Action.NetworkError.INSTANCE : Action.UnknownError.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess(AddQuestionOrAnswerResponse response) {
        getActionLiveData().setValue(response.getSuccess() ? Action.Success.INSTANCE : Action.UnknownError.INSTANCE);
    }

    private final void submitAnswer(long it, String text) {
        C10727i.c(x0.a(this), null, null, new NewQuestionFormViewModelImpl$submitAnswer$1(this, new AddAnswerRequest(it, text), null), 3);
    }

    private final void submitQuestion(boolean it, String text) {
        C10727i.c(x0.a(this), null, null, new NewQuestionFormViewModelImpl$submitQuestion$1(this, new AddQuestionRequest(this.productId, it, text), null), 3);
    }

    public void bind(@NotNull NewQuestionFormVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.productId = vo.getProductId();
        this.questionId = vo.getQuestionId();
        this.minLength = vo.getInputMinLength();
        this.widgetId = Long.valueOf(vo.getId());
        this.invalidLengthError = vo.getInvalidLengthError();
        getActionLiveData().setValue(new Action.Item(vo));
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormViewModel
    public void submit(@NotNull String text, Boolean isAnonymous) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (h.z0(text).toString().length() < this.minLength) {
            SingleLiveEvent<Action> actionLiveData = getActionLiveData();
            String str = this.invalidLengthError;
            if (str != null) {
                actionLiveData.setValue(new Action.InputError(str));
                return;
            } else {
                Intrinsics.n("invalidLengthError");
                throw null;
            }
        }
        Long l11 = this.questionId;
        if (l11 != null) {
            submitAnswer(l11.longValue(), text);
        } else if (isAnonymous != null) {
            submitQuestion(isAnonymous.booleanValue(), text);
        }
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormViewModel
    @NotNull
    public SingleLiveEvent<Action> getActionLiveData() {
        return this.actionLiveData;
    }
}
