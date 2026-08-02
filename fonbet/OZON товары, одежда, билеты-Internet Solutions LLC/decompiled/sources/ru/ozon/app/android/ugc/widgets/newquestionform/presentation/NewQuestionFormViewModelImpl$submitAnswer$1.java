package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ActionName;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.AddAnswerRequest;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.AddQuestionOrAnswerResponse;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.Action;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormViewModelImpl$submitAnswer$1", f = "NewQuestionFormViewModel.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NewQuestionFormViewModelImpl$submitAnswer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AddAnswerRequest $request;
    int label;
    final /* synthetic */ NewQuestionFormViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewQuestionFormViewModelImpl$submitAnswer$1(NewQuestionFormViewModelImpl newQuestionFormViewModelImpl, AddAnswerRequest addAnswerRequest, d<? super NewQuestionFormViewModelImpl$submitAnswer$1> dVar) {
        super(2, dVar);
        this.this$0 = newQuestionFormViewModelImpl;
        this.$request = addAnswerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NewQuestionFormViewModelImpl$submitAnswer$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.getActionLiveData().setValue(Action.ShowProgress.INSTANCE);
            actionV2Repository = this.this$0.repository;
            ActionV2Request actionV2Request = new ActionV2Request(this.$request, ActionName.CREATE_ANSWER.getAction(), false, 4, null);
            this.label = 1;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, AddQuestionOrAnswerResponse.class, this);
            if (mo479requestActionResult0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
        }
        r.Companion companion = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
            mo479requestActionResult0E7RQCE = (AddQuestionOrAnswerResponse) ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
        }
        Throwable b11 = r.b(mo479requestActionResult0E7RQCE);
        if (b11 != null) {
            mo479requestActionResult0E7RQCE = s.a(b11);
        } else if (mo479requestActionResult0E7RQCE == null) {
            mo479requestActionResult0E7RQCE = s.a(new IllegalStateException("Result value is null"));
        }
        NewQuestionFormViewModelImpl newQuestionFormViewModelImpl = this.this$0;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
            newQuestionFormViewModelImpl.onSuccess((AddQuestionOrAnswerResponse) mo479requestActionResult0E7RQCE);
        }
        NewQuestionFormViewModelImpl newQuestionFormViewModelImpl2 = this.this$0;
        Throwable b12 = r.b(mo479requestActionResult0E7RQCE);
        if (b12 != null) {
            newQuestionFormViewModelImpl2.onError(b12);
        }
        this.this$0.getActionLiveData().setValue(Action.HideProgress.INSTANCE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NewQuestionFormViewModelImpl$submitAnswer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
