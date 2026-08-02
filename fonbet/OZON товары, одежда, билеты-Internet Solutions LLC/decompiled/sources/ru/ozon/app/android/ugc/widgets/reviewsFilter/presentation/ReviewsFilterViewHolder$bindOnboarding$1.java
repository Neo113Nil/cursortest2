package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewsFilterViewHolder$bindOnboarding$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ReviewsFilterVO $item;
    final /* synthetic */ ReviewsFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewsFilterViewHolder$bindOnboarding$1(ReviewsFilterViewHolder reviewsFilterViewHolder, ReviewsFilterVO reviewsFilterVO) {
        super(0);
        this.this$0 = reviewsFilterViewHolder;
        this.$item = reviewsFilterVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        OnBoardingDelegate onBoardingDelegate2;
        onBoardingDelegate = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate == null) {
            this.this$0.initDelegate(this.$item.getOnboarding());
        }
        onBoardingDelegate2 = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate2 != null) {
            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, this.this$0, new OnBoardingCutConfig(null, null, null, null, Integer.valueOf(-Dimens.INSTANCE.getDP_8()), null, Float.valueOf(ReviewsFilterViewHolder.INSTANCE.getONBOARDING_CORNER_RADIUS()), false, 47, null), null, 4, null);
        }
    }
}
