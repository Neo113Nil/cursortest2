package ru.ozon.app.android.composer.widgets.v2.onboarding.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "getDefaultOnBoardingDisplayOnPageRepository", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "getEmptyOnBoardingDisplayOnPageRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "getDefaultOnBoardingDisplayRepository", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "getEmptyOnBoardingDisplayRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "getDefaultOnBoardingDisplayDisableRepository", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnBoardingComponentApi extends InterfaceC6958a {
    @NotNull
    OnBoardingDisplayDisableRepository getDefaultOnBoardingDisplayDisableRepository();

    @NotNull
    OnBoardingDisplayOnPageRepository getDefaultOnBoardingDisplayOnPageRepository();

    @NotNull
    OnBoardingDisplayRepository getDefaultOnBoardingDisplayRepository();

    @NotNull
    OnBoardingDisplayOnPageRepository getEmptyOnBoardingDisplayOnPageRepository();

    @NotNull
    OnBoardingDisplayRepository getEmptyOnBoardingDisplayRepository();
}
