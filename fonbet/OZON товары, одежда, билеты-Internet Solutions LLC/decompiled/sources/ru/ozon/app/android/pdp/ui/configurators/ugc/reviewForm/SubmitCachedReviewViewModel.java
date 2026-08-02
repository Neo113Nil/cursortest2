package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.RateItemsDelegate;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitCachedReviewViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "", "processSubmitCachedReview", "()V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/SubmitActionPendingData;", "_onSubmitTrackingObserver", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "getOnSubmitTrackingObserver", "()Landroidx/lifecycle/P;", "onSubmitTrackingObserver", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubmitCachedReviewViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<SubmitActionPendingData> _onSubmitTrackingObserver;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    public SubmitCachedReviewViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.actionV2Repository = actionV2Repository;
        this.reviewFormRepository = reviewFormRepository;
        this._onSubmitTrackingObserver = new SingleLiveEvent<>();
    }

    @NotNull
    public final P<SubmitActionPendingData> getOnSubmitTrackingObserver() {
        return this._onSubmitTrackingObserver;
    }

    public final void processSubmitCachedReview() {
        String productId;
        Long y02;
        SubmitActionPendingData submitAction = this.reviewFormRepository.getSubmitAction();
        if (submitAction == null || (productId = submitAction.getProductId()) == null || (y02 = h.y0(productId)) == null) {
            return;
        }
        RateItemsDelegate.INSTANCE.onReviewSuccess(y02, false);
        C10727i.c(x0.a(this), null, null, new SubmitCachedReviewViewModel$processSubmitCachedReview$1(this, submitAction, null), 3);
    }
}
