package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Ge.f;
import Sc.r;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CreateReviewResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.SubmitCachedReviewViewModel$processSubmitCachedReview$1", f = "SubmitCachedReviewViewModel.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SubmitCachedReviewViewModel$processSubmitCachedReview$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ SubmitActionPendingData $submitActionData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SubmitCachedReviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitCachedReviewViewModel$processSubmitCachedReview$1(SubmitCachedReviewViewModel submitCachedReviewViewModel, SubmitActionPendingData submitActionPendingData, d<? super SubmitCachedReviewViewModel$processSubmitCachedReview$1> dVar) {
        super(2, dVar);
        this.this$0 = submitCachedReviewViewModel;
        this.$submitActionData = submitActionPendingData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SubmitCachedReviewViewModel$processSubmitCachedReview$1 submitCachedReviewViewModel$processSubmitCachedReview$1 = new SubmitCachedReviewViewModel$processSubmitCachedReview$1(this.this$0, this.$submitActionData, dVar);
        submitCachedReviewViewModel$processSubmitCachedReview$1.L$0 = obj;
        return submitCachedReviewViewModel$processSubmitCachedReview$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ReviewFormRepository reviewFormRepository;
        ReviewFormRepository reviewFormRepository2;
        String reviewUuid;
        SingleLiveEvent singleLiveEvent;
        ActionV2Repository actionV2Repository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                SubmitCachedReviewViewModel submitCachedReviewViewModel = this.this$0;
                SubmitActionPendingData submitActionPendingData = this.$submitActionData;
                r.Companion companion = r.INSTANCE;
                actionV2Repository = submitCachedReviewViewModel.actionV2Repository;
                y callAction = actionV2Repository.callAction(new ActionV2Request(submitActionPendingData.getParams(), submitActionPendingData.getActionName(), false, 4, null), CreateReviewResponse.class);
                this.label = 1;
                obj = f.b(callAction, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (CreateReviewResponse) ((ActionV2Response) obj).getData();
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        SubmitCachedReviewViewModel submitCachedReviewViewModel2 = this.this$0;
        SubmitActionPendingData submitActionPendingData2 = this.$submitActionData;
        if (!(a11 instanceof r.b)) {
            CreateReviewResponse createReviewResponse = (CreateReviewResponse) a11;
            if (createReviewResponse != null && (reviewUuid = createReviewResponse.getReviewUuid()) != null) {
                singleLiveEvent = submitCachedReviewViewModel2._onSubmitTrackingObserver;
                singleLiveEvent.postValue(submitActionPendingData2.appendReviewUuidToCustomTracking(reviewUuid));
            }
            reviewFormRepository2 = submitCachedReviewViewModel2.reviewFormRepository;
            reviewFormRepository2.updateSubmitAction(null);
        }
        SubmitCachedReviewViewModel submitCachedReviewViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            reviewFormRepository = submitCachedReviewViewModel3.reviewFormRepository;
            reviewFormRepository.updateSubmitAction(null);
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SubmitCachedReviewViewModel$processSubmitCachedReview$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
