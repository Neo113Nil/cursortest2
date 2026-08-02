package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Ae.w0;
import Sc.o;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormData;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SingleEvent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "intent", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$observeViewIntent$1", f = "ReviewFormViewModel.kt", l = {359}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$observeViewIntent$1 extends j implements Function2<ViewIntent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReviewFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormViewModel$observeViewIntent$1(ReviewFormViewModel reviewFormViewModel, d<? super ReviewFormViewModel$observeViewIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewFormViewModel$observeViewIntent$1 reviewFormViewModel$observeViewIntent$1 = new ReviewFormViewModel$observeViewIntent$1(this.this$0, dVar);
        reviewFormViewModel$observeViewIntent$1.L$0 = obj;
        return reviewFormViewModel$observeViewIntent$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x027d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ViewIntent viewIntent;
        ReviewFormData reviewFormData;
        ReviewFormRepository reviewFormRepository;
        ReviewFormData reviewFormData2;
        ReviewFormRepository reviewFormRepository2;
        ReviewFormData reviewFormData3;
        ReviewFormRepository reviewFormRepository3;
        boolean z11;
        ReviewFormData reviewFormData4;
        ReviewFormRepository reviewFormRepository4;
        ReviewFormData reviewFormData5;
        ReviewFormRepository reviewFormRepository5;
        ReviewFormData reviewFormData6;
        ReviewFormRepository reviewFormRepository6;
        w0 w0Var;
        boolean withSubmit;
        SingleEvent updateClosingTrackingInfo;
        Map closingTrackingInfo;
        ViewIntent viewIntent2;
        String rating;
        Integer w02;
        ReviewFormData reviewFormData7;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            viewIntent = (ViewIntent) this.L$0;
            if (viewIntent instanceof ViewIntent.FormOpened) {
                this.this$0.productId = ((ViewIntent.FormOpened) viewIntent).getProductId();
            } else if (viewIntent instanceof ViewIntent.PointsProgressInitialized) {
                ReviewFormViewModel reviewFormViewModel = this.this$0;
                reviewFormData7 = reviewFormViewModel.formData;
                ViewIntent.PointsProgressInitialized pointsProgressInitialized = (ViewIntent.PointsProgressInitialized) viewIntent;
                reviewFormViewModel.formData = ReviewFormData.copy$default(reviewFormData7, null, null, null, null, null, null, null, null, pointsProgressInitialized.getPointsMap(), null, null, 1791, null);
                this.this$0.updatePoints();
                this.this$0.higherPointsTerms = pointsProgressInitialized.getHigherPointsTerms();
            } else if (viewIntent instanceof ViewIntent.OnBackPressed) {
                reviewFormRepository6 = this.this$0.reviewFormRepository;
                ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData formData = reviewFormRepository6.getFormData();
                int intValue = (formData == null || (rating = formData.getRating()) == null || (w02 = h.w0(rating)) == null) ? 0 : w02.intValue();
                w0Var = this.this$0._singleEvent;
                ViewIntent.OnBackPressed onBackPressed = (ViewIntent.OnBackPressed) viewIntent;
                withSubmit = this.this$0.withSubmit(onBackPressed.getMinRating(), intValue, formData);
                if (withSubmit) {
                    updateClosingTrackingInfo = onBackPressed.getSubmitOnBackConfig() != null ? SingleEvent.SubmitAndCloseReview.INSTANCE : SingleEvent.ShowActionsSheet.INSTANCE;
                } else {
                    AtomAction action = onBackPressed.getAction();
                    closingTrackingInfo = this.this$0.getClosingTrackingInfo();
                    updateClosingTrackingInfo = new SingleEvent.UpdateClosingTrackingInfo(action, closingTrackingInfo);
                }
                this.L$0 = viewIntent;
                this.label = 1;
                if (w0Var.emit(updateClosingTrackingInfo, this) == aVar) {
                    return aVar;
                }
                viewIntent2 = viewIntent;
            } else if (viewIntent instanceof ViewIntent.ReviewHeaderInitialized) {
                ReviewFormViewModel reviewFormViewModel2 = this.this$0;
                reviewFormData6 = reviewFormViewModel2.formData;
                ViewIntent.ReviewHeaderInitialized reviewHeaderInitialized = (ViewIntent.ReviewHeaderInitialized) viewIntent;
                reviewFormViewModel2.formData = ReviewFormData.copy$default(reviewFormData6, null, null, null, null, null, null, null, null, null, null, new ReviewFormData.SubmitCachedReviewData(reviewHeaderInitialized.getAction(), reviewHeaderInitialized.getMinRating(), reviewHeaderInitialized.getWidgetId(), reviewHeaderInitialized.getWidgetToken(), reviewHeaderInitialized.getPageAnalyticsInfo(), reviewHeaderInitialized.getSubmitActionTrackingInfo()), 1023, null);
            } else if (viewIntent instanceof ViewIntent.AnonymousUpdated) {
                ReviewFormViewModel reviewFormViewModel3 = this.this$0;
                reviewFormData5 = reviewFormViewModel3.formData;
                ViewIntent.AnonymousUpdated anonymousUpdated = (ViewIntent.AnonymousUpdated) viewIntent;
                reviewFormViewModel3.formData = ReviewFormData.copy$default(reviewFormData5, null, new Pair(anonymousUpdated.getId(), Boolean.valueOf(anonymousUpdated.getValue())), null, null, null, null, null, null, null, null, null, 2045, null);
                if (anonymousUpdated.getIsUserEvent()) {
                    reviewFormRepository5 = this.this$0.reviewFormRepository;
                    reviewFormRepository5.saveAnonymous(anonymousUpdated.getValue());
                }
            } else if (viewIntent instanceof ViewIntent.CommentUpdated) {
                ReviewFormViewModel reviewFormViewModel4 = this.this$0;
                reviewFormData4 = reviewFormViewModel4.formData;
                ViewIntent.CommentUpdated commentUpdated = (ViewIntent.CommentUpdated) viewIntent;
                reviewFormViewModel4.formData = ReviewFormData.copy$default(reviewFormData4, null, null, new Pair(commentUpdated.getUploadKey(), commentUpdated.getComment()), null, null, null, null, null, null, commentUpdated.getHintStatus(), null, 1531, null);
                reviewFormRepository4 = this.this$0.reviewFormRepository;
                reviewFormRepository4.saveComment(commentUpdated.getComment());
                this.this$0.updatePoints();
            } else if (viewIntent instanceof ViewIntent.RatingUpdated) {
                ViewIntent.RatingUpdated ratingUpdated = (ViewIntent.RatingUpdated) viewIntent;
                if (ratingUpdated.getIsInitial()) {
                    z11 = this.this$0.initialRatingHasBeenSet;
                    if (z11) {
                        return Unit.f71690a;
                    }
                    this.this$0.initialRatingHasBeenSet = true;
                }
                ReviewFormViewModel reviewFormViewModel5 = this.this$0;
                reviewFormData3 = reviewFormViewModel5.formData;
                reviewFormViewModel5.formData = ReviewFormData.copy$default(reviewFormData3, null, null, null, new Pair(ratingUpdated.getUploadKey(), ratingUpdated.getScore()), null, null, null, null, null, null, null, 2039, null);
                reviewFormRepository3 = this.this$0.reviewFormRepository;
                reviewFormRepository3.saveRating(ratingUpdated.getScore());
                this.this$0.updateSubmitAvailability();
                this.this$0.updatePoints();
            } else if (viewIntent instanceof ViewIntent.VariantUpdated) {
                ReviewFormViewModel reviewFormViewModel6 = this.this$0;
                reviewFormData2 = reviewFormViewModel6.formData;
                ViewIntent.VariantUpdated variantUpdated = (ViewIntent.VariantUpdated) viewIntent;
                reviewFormViewModel6.formData = ReviewFormData.copy$default(reviewFormData2, null, null, null, null, null, null, null, new Pair(variantUpdated.getUploadKey(), variantUpdated.getVariantId()), null, null, null, 1919, null);
                reviewFormRepository2 = this.this$0.reviewFormRepository;
                reviewFormRepository2.saveVariant(variantUpdated.getVariantId());
            } else {
                if (!(viewIntent instanceof ViewIntent.QuestionsUpdated)) {
                    throw new o();
                }
                ReviewFormViewModel reviewFormViewModel7 = this.this$0;
                reviewFormData = reviewFormViewModel7.formData;
                ViewIntent.QuestionsUpdated questionsUpdated = (ViewIntent.QuestionsUpdated) viewIntent;
                reviewFormViewModel7.formData = ReviewFormData.copy$default(reviewFormData, null, null, null, null, null, null, new Pair(questionsUpdated.getUploadKey(), questionsUpdated.getQuestions()), null, null, null, null, 1983, null);
                reviewFormRepository = this.this$0.reviewFormRepository;
                reviewFormRepository.saveContextQuestions(questionsUpdated.getQuestions());
            }
            if (viewIntent instanceof ViewIntent.ContentUpdateEvent) {
                this.this$0.updateSubmitCachedReviewAction();
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        viewIntent2 = (ViewIntent) this.L$0;
        s.b(obj);
        viewIntent = viewIntent2;
        if (viewIntent instanceof ViewIntent.ContentUpdateEvent) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ViewIntent viewIntent, d<? super Unit> dVar) {
        return ((ReviewFormViewModel$observeViewIntent$1) create(viewIntent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
