package ru.ozon.app.android.search.widgets.searchOnboarding.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchOnboarding.presentation.SearchOnboardingViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/search/widgets/searchOnboarding/di/SearchOnboardingComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/searchOnboarding/di/SearchOnboardingComponent;", "Lru/ozon/app/android/search/widgets/searchOnboarding/di/repository/SearchOnboardingRepositoryComponentApi;", "searchOnboardingRepositoryComponentApi", "Lru/ozon/app/android/search/widgets/searchOnboarding/di/repository/SearchOnboardingRepositoryComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchOnboardingComponent$Companion$create$1$1 implements SearchOnboardingComponent {
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new SearchOnboardingComponent$Companion$create$1$1$viewModel$2(this));

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new SearchOnboardingComponent$Companion$create$1$1$tokenizedAnalytics$2(this));

    SearchOnboardingComponent$Companion$create$1$1(C7475g c7475g) {
        this.searchOnboardingRepositoryComponentApi = (SearchOnboardingRepositoryComponentApi) c7475g.getComponent(SearchOnboardingRepositoryComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.search.widgets.searchOnboarding.di.SearchOnboardingComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.searchOnboarding.di.SearchOnboardingComponent
    public SearchOnboardingViewModel getViewModel() {
        return (SearchOnboardingViewModel) this.viewModel.getValue();
    }
}
