package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.AddToComparisonViewModel;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core.AddToComparisonButtonMapper;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/di/AddToComparisonWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/di/AddToComparisonWidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "comparisonRepository$delegate", "LSc/j;", "getComparisonRepository", "()Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "comparisonRepository", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/core/AddToComparisonButtonMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/core/AddToComparisonButtonMapper;", "mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;", "getViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;", "viewModel", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "getRefreshViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "refreshViewModel", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToComparisonWidgetComponent$Companion$create$1$1 implements AddToComparisonWidgetComponent {
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: comparisonRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j comparisonRepository = k.b(new AddToComparisonWidgetComponent$Companion$create$1$1$comparisonRepository$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(AddToComparisonWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(AddToComparisonWidgetComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    AddToComparisonWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    public final ComparisonRepository getComparisonRepository() {
        return (ComparisonRepository) this.comparisonRepository.getValue();
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di.AddToComparisonWidgetComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di.AddToComparisonWidgetComponent
    public AddToComparisonButtonMapper getMapper() {
        return (AddToComparisonButtonMapper) this.mapper.getValue();
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return this.networkComponentApi;
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di.AddToComparisonWidgetComponent
    public ComparisonRefreshViewModel getRefreshViewModel() {
        return new ComparisonRefreshViewModel();
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di.AddToComparisonWidgetComponent
    public AddToComparisonViewModel getViewModel() {
        return new AddToComparisonViewModel(getComparisonRepository());
    }
}
