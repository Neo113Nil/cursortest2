package ru.ozon.app.android.common.filterWidgets.filtervalues.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesRepository;
import ru.ozon.app.android.common.filterWidgets.filtervalues.mapper.FilterValuesMapper;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010+\u001a\u00060'j\u0002`(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"ru/ozon/app/android/common/filterWidgets/filtervalues/di/FilterValuesComponent$Companion$create$1$1", "Lru/ozon/app/android/common/filterWidgets/filtervalues/di/FilterValuesComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "appLocaleComponentApi", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesRepository;", "filterValuesRepository$delegate", "LSc/j;", "getFilterValuesRepository", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesRepository;", "filterValuesRepository", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;", "getFilterValuesViewModel", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;", "filterValuesViewModel", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "getFilterSharedViewModel", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "filterSharedViewModel", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/common/filterWidgets/filtervalues/mapper/FilterValuesMapper;", "getMapper", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/mapper/FilterValuesMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesComponent$Companion$create$1$1 implements FilterValuesComponent {
    private final AccountComponentApi accountComponentApi;
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
    private final AppLocaleComponentApi appLocaleComponentApi;

    /* renamed from: filterValuesRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j filterValuesRepository = k.b(new FilterValuesComponent$Companion$create$1$1$filterValuesRepository$2(this));
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    FilterValuesComponent$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.appLocaleComponentApi = (AppLocaleComponentApi) c7475g.getComponent(AppLocaleComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    private final FilterValuesRepository getFilterValuesRepository() {
        return (FilterValuesRepository) this.filterValuesRepository.getValue();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesComponent
    public AppType getAppType() {
        return this.androidPlatformComponentDependencies.getAppType();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesComponent
    public FilterSharedViewModel getFilterSharedViewModel() {
        return new FilterSharedViewModel();
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesComponent
    public FilterValuesViewModel getFilterValuesViewModel() {
        return new FilterValuesViewModel(getFilterValuesRepository(), this.accountComponentApi.getCurrencyRepository(), this.appLocaleComponentApi.getAppLocaleRepository());
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesComponent
    public FilterValuesMapper getMapper() {
        return new FilterValuesMapper(getAppType());
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }
}
