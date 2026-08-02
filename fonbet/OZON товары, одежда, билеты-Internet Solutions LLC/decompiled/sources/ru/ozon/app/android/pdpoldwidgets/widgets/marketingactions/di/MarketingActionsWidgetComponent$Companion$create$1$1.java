package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core.MarketingActionsMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsPresenter;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions.ActionsAdapter;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/di/MarketingActionsWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/di/MarketingActionsWidgetComponent;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "getNavigationComponentApi", "()Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/core/MarketingActionsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/core/MarketingActionsMapper;", "mapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;", "presenter$delegate", "getPresenter", "()Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;", "presenter", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;", "actionsAdapter$delegate", "getActionsAdapter", "()Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;", "actionsAdapter", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarketingActionsWidgetComponent$Companion$create$1$1 implements MarketingActionsWidgetComponent {
    private final ContextComponentDependencies contextComponentDependencies;
    private final NavigationComponentApi navigationComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new MarketingActionsWidgetComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: presenter$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j presenter = k.b(new MarketingActionsWidgetComponent$Companion$create$1$1$presenter$2(this));

    /* renamed from: actionsAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionsAdapter = k.b(MarketingActionsWidgetComponent$Companion$create$1$1$actionsAdapter$2.INSTANCE);

    MarketingActionsWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.di.MarketingActionsWidgetComponent
    public ActionsAdapter getActionsAdapter() {
        return (ActionsAdapter) this.actionsAdapter.getValue();
    }

    public final ContextComponentDependencies getContextComponentDependencies() {
        return this.contextComponentDependencies;
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.di.MarketingActionsWidgetComponent
    public MarketingActionsMapper getMapper() {
        return (MarketingActionsMapper) this.mapper.getValue();
    }

    public final NavigationComponentApi getNavigationComponentApi() {
        return this.navigationComponentApi;
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.di.MarketingActionsWidgetComponent
    public MarketingActionsPresenter getPresenter() {
        return (MarketingActionsPresenter) this.presenter.getValue();
    }
}
