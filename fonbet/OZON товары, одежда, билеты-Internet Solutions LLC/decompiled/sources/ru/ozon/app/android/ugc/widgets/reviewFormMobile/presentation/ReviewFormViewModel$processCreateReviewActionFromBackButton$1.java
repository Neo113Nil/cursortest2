package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CreateReviewResponse;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewActionFromBackButton$1", f = "ReviewFormViewModel.kt", l = {199}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$processCreateReviewActionFromBackButton$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ Function1<Map<String, ? extends Object>, Unit> $onSuccess;
    final /* synthetic */ String $rating;
    int label;
    final /* synthetic */ ReviewFormViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewActionFromBackButton$1$1", f = "ReviewFormViewModel.kt", l = {209}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewActionFromBackButton$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CreateReviewResponse, d<? super Unit>, Object> {
        final /* synthetic */ AtomAction.ComposerAction $action;
        final /* synthetic */ Function1<Map<String, ? extends Object>, Unit> $onSuccess;
        final /* synthetic */ String $rating;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReviewFormViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ReviewFormViewModel reviewFormViewModel, String str, AtomAction.ComposerAction composerAction, Function1<? super Map<String, ? extends Object>, Unit> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = reviewFormViewModel;
            this.$rating = str;
            this.$action = composerAction;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$rating, this.$action, this.$onSuccess, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object handleSuccess;
            Map<String, ? extends Object> customTrackingInfo;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                CreateReviewResponse createReviewResponse = (CreateReviewResponse) this.L$0;
                this.this$0.updateRatingService(createReviewResponse, this.$rating);
                String reviewUuid = createReviewResponse.getReviewUuid();
                if (reviewUuid != null) {
                    Function1<Map<String, ? extends Object>, Unit> function1 = this.$onSuccess;
                    customTrackingInfo = this.this$0.getCustomTrackingInfo(reviewUuid, SubmitReason.REVIEW_BACK);
                    function1.invoke(customTrackingInfo);
                }
                ReviewFormViewModel reviewFormViewModel = this.this$0;
                Map<String, TokenizedTrackingInfo> trackingInfo = this.$action.getTrackingInfo();
                SubmitReason submitReason = SubmitReason.REVIEW_BACK;
                this.label = 1;
                handleSuccess = reviewFormViewModel.handleSuccess(createReviewResponse, trackingInfo, submitReason, this);
                if (handleSuccess == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateReviewResponse createReviewResponse, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(createReviewResponse, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "throwable", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewActionFromBackButton$1$2", f = "ReviewFormViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$processCreateReviewActionFromBackButton$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReviewFormViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReviewFormViewModel reviewFormViewModel, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = reviewFormViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            UgcRatingService ugcRatingService;
            String str;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Throwable th2 = (Throwable) this.L$0;
            ugcRatingService = this.this$0.ugcRatingService;
            str = this.this$0.productId;
            ugcRatingService.markFailedRatingService(str);
            Lm0.a.f17149a.e(th2);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th2, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(th2, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormViewModel$processCreateReviewActionFromBackButton$1(ReviewFormViewModel reviewFormViewModel, AtomAction.ComposerAction composerAction, String str, Function1<? super Map<String, ? extends Object>, Unit> function1, d<? super ReviewFormViewModel$processCreateReviewActionFromBackButton$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormViewModel;
        this.$action = composerAction;
        this.$rating = str;
        this.$onSuccess = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormViewModel$processCreateReviewActionFromBackButton$1(this.this$0, this.$action, this.$rating, this.$onSuccess, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Request actionV2Request;
        Object sendReview;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ReviewFormViewModel reviewFormViewModel = this.this$0;
            actionV2Request = reviewFormViewModel.toActionV2Request(this.$action);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$rating, this.$action, this.$onSuccess, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            sendReview = reviewFormViewModel.sendReview(actionV2Request, anonymousClass1, anonymousClass2, false, this);
            if (sendReview == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormViewModel$processCreateReviewActionFromBackButton$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
