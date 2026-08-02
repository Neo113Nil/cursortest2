package ru.ozon.app.android.composer.widgets.v2.onboarding.deeplink.disableOnBoarding;

import EZ.a;
import EZ.e;
import EZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/deeplink/disableOnBoarding/OnBoardingDisplayDisableNavigationHandler;", "LEZ/a;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/deeplink/disableOnBoarding/OnBoardingDisplayDisableDestination;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "disableOnBoardingRepository", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;)V", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "navigate", "(LEZ/g;LEZ/e;)V", "", "requestCode", "navigateForResult", "(LEZ/g;LEZ/e;I)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnBoardingDisplayDisableNavigationHandler implements a<OnBoardingDisplayDisableDestination> {

    @NotNull
    private final OnBoardingDisplayDisableRepository disableOnBoardingRepository;

    public OnBoardingDisplayDisableNavigationHandler(@NotNull OnBoardingDisplayDisableRepository disableOnBoardingRepository) {
        Intrinsics.checkNotNullParameter(disableOnBoardingRepository, "disableOnBoardingRepository");
        this.disableOnBoardingRepository = disableOnBoardingRepository;
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<OnBoardingDisplayDisableDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        this.disableOnBoardingRepository.disable();
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<OnBoardingDisplayDisableDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        this.disableOnBoardingRepository.disable();
    }
}
