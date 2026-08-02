package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CreateReviewResponse;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SingleEvent;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$sendReview$3$1", f = "ReviewFormViewModel.kt", l = {247, 249, 257}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$sendReview$3$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CreateReviewResponse $createReviewResponse;
    final /* synthetic */ Function2<CreateReviewResponse, d<? super Unit>, Object> $onSuccess;
    int label;
    final /* synthetic */ ReviewFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormViewModel$sendReview$3$1(ReviewFormViewModel reviewFormViewModel, CreateReviewResponse createReviewResponse, Function2<? super CreateReviewResponse, ? super d<? super Unit>, ? extends Object> function2, d<? super ReviewFormViewModel$sendReview$3$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormViewModel;
        this.$createReviewResponse = createReviewResponse;
        this.$onSuccess = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormViewModel$sendReview$3$1(this.this$0, this.$createReviewResponse, this.$onSuccess, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r9.invoke(r1, r8) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        w0 w0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0._singleEvent;
            SingleEvent.UpdateLoader updateLoader = new SingleEvent.UpdateLoader(false);
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        if (this.$createReviewResponse.getValidationAction() != null) {
            w0Var2 = this.this$0._singleEvent;
            CreateReviewResponse.ValidationActionDTO validationAction = this.$createReviewResponse.getValidationAction();
            AtomActionDTO action = validationAction != null ? validationAction.getAction() : null;
            CreateReviewResponse.ValidationActionDTO validationAction2 = this.$createReviewResponse.getValidationAction();
            SingleEvent.ProcessValidationAction processValidationAction = new SingleEvent.ProcessValidationAction(action, validationAction2 != null ? validationAction2.getTracking() : null, ReviewFormViewModel.getCustomTrackingInfo$default(this.this$0, this.$createReviewResponse.getReviewUuid(), null, 2, null));
            this.label = 2;
        } else {
            Function2<CreateReviewResponse, d<? super Unit>, Object> function2 = this.$onSuccess;
            CreateReviewResponse createReviewResponse = this.$createReviewResponse;
            this.label = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormViewModel$sendReview$3$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
