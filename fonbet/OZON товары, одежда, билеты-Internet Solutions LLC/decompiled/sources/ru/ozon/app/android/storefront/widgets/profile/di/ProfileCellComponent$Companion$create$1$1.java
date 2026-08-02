package ru.ozon.app.android.storefront.widgets.profile.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.SharedPreferences;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\u00060\u0015j\u0002`\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/storefront/widgets/profile/di/ProfileCellComponent$Companion$create$1$1", "Lru/ozon/app/android/storefront/widgets/profile/di/ProfileCellComponent;", "Landroid/content/SharedPreferences;", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "onboardingComponent", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "getOnboardingComponent", "()Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "commonOnboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onBoardingViewModel$delegate", "LSc/j;", "getOnBoardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onBoardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "getOnBoardingRepository", "()Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onBoardingRepository", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileCellComponent$Companion$create$1$1 implements ProfileCellComponent {
    private final OnBoardingComponentApi commonOnboardingComponentApi;

    /* renamed from: onBoardingViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingViewModel = k.b(new ProfileCellComponent$Companion$create$1$1$onBoardingViewModel$2(this));
    private final OnboardingComponentApi onboardingComponent;
    private final SharedPreferences sharedPrefs;
    private final l tokenizedAnalytics;

    ProfileCellComponent$Companion$create$1$1(C7475g c7475g) {
        this.sharedPrefs = ((StorageComponentApi) c7475g.getComponent(StorageComponentApi.class)).getSharedPreferences();
        this.onboardingComponent = (OnboardingComponentApi) c7475g.getComponent(OnboardingComponentApi.class);
        this.commonOnboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.tokenizedAnalytics = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.storefront.widgets.profile.di.ProfileCellComponent
    public CommonOnboardingRepository getOnBoardingRepository() {
        return this.onboardingComponent.getOnboardingRepository();
    }

    @Override // ru.ozon.app.android.storefront.widgets.profile.di.ProfileCellComponent
    public BaseOnBoardingViewModel.Default getOnBoardingViewModel() {
        return (BaseOnBoardingViewModel.Default) this.onBoardingViewModel.getValue();
    }

    public final SharedPreferences getSharedPrefs() {
        return this.sharedPrefs;
    }

    @Override // ru.ozon.app.android.storefront.widgets.profile.di.ProfileCellComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }
}
