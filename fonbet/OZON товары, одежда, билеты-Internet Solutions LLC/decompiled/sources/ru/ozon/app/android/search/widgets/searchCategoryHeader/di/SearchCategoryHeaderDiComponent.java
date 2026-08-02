package ru.ozon.app.android.search.widgets.searchCategoryHeader.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderMapper;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\tJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/di/SearchCategoryHeaderDiComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/data/SearchCategoryHeaderMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/searchCategoryHeader/data/SearchCategoryHeaderMapper;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "getOnboardingRepository", "()Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "Factory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchCategoryHeaderDiComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/di/SearchCategoryHeaderDiComponent$Factory;", "", "create", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/di/SearchCategoryHeaderDiComponent;", "onboardingComponentApi", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public interface Factory {
        @NotNull
        SearchCategoryHeaderDiComponent create(@NotNull OnboardingComponentApi onboardingComponentApi);
    }

    @NotNull
    SearchCategoryHeaderMapper getMapper();

    @NotNull
    CommonOnboardingRepository getOnboardingRepository();
}
