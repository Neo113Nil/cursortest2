package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.ugc.flags.ReviewFormTransitionFixEnabled;
import ru.ozon.app.android.ugc.widgets.additionalReview.data.AdditionalReviewDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "rating", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AdditionalReviewBinder$bind$1$1$2 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ AdditionalReviewVO $item;
    final /* synthetic */ RatingStarView $this_apply;
    final /* synthetic */ AdditionalReviewBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReviewBinder$bind$1$1$2(RatingStarView ratingStarView, AdditionalReviewVO additionalReviewVO, AdditionalReviewBinder additionalReviewBinder) {
        super(1);
        this.$this_apply = ratingStarView;
        this.$item = additionalReviewVO;
        this.this$0 = additionalReviewBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AdditionalReviewVO additionalReviewVO, int i11, AdditionalReviewBinder additionalReviewBinder) {
        FeatureChecker featureChecker;
        Function1 function1;
        AdditionalReviewDTO.Rating.Star star = additionalReviewVO.getRating().getStars().get(i11 - 1);
        featureChecker = additionalReviewBinder.featureChecker;
        b move = featureChecker.isEnabled(ReviewFormTransitionFixEnabled.INSTANCE) ? new AtomAction.Move(star.getLink(), null, star.getTrackingInfo(), null, 10, null) : new AtomAction.DismissRedirect(null, star.getLink(), star.getTrackingInfo(), null, null, 25, null);
        function1 = additionalReviewBinder.actionHandler;
        function1.invoke(move);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(final int i11) {
        RatingStarView ratingStarView = this.$this_apply;
        final AdditionalReviewVO additionalReviewVO = this.$item;
        final AdditionalReviewBinder additionalReviewBinder = this.this$0;
        ratingStarView.post(new Runnable() { // from class: ru.ozon.app.android.ugc.widgets.additionalReview.presentation.a
            @Override // java.lang.Runnable
            public final void run() {
                AdditionalReviewBinder$bind$1$1$2.invoke$lambda$0(AdditionalReviewVO.this, i11, additionalReviewBinder);
            }
        });
    }
}
