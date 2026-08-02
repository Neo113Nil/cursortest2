package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.data.ReviewsFilterOnBoardingDisplayRepository;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/onboarding/ReviewsFilterOnboardingViewModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingRepository", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterOnBoardingDisplayRepository;", "displayOnPageRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "disableOnBoardingRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewsFilter/data/ReviewsFilterOnBoardingDisplayRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterOnboardingViewModel extends BaseOnBoardingViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsFilterOnboardingViewModel(@NotNull ReviewsFilterOnBoardingDisplayRepository onBoardingRepository, @NotNull OnBoardingDisplayOnPageRepository displayOnPageRepository, @NotNull OnBoardingDisplayDisableRepository disableOnBoardingRepository) {
        super(onBoardingRepository, displayOnPageRepository, disableOnBoardingRepository);
        Intrinsics.checkNotNullParameter(onBoardingRepository, "onBoardingRepository");
        Intrinsics.checkNotNullParameter(displayOnPageRepository, "displayOnPageRepository");
        Intrinsics.checkNotNullParameter(disableOnBoardingRepository, "disableOnBoardingRepository");
    }
}
