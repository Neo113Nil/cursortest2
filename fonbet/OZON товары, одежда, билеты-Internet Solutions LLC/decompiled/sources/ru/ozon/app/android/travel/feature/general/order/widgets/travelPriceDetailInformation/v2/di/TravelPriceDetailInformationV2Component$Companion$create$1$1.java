package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2Mapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2StickyMapper;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObservable;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObservableImpl;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObserver;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationIsVisibleViewModel;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationV2IsVisibleViewModel;

@Metadata(d1 = {"\u0000}\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR!\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010$R!\u0010)\u001a\b\u0012\u0004\u0012\u00020&0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010$R\u0018\u0010.\u001a\u00060*j\u0002`+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u0010;\u001a\u000607j\u0002`88VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"ru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/di/TravelPriceDetailInformationV2Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/di/TravelPriceDetailInformationV2Component;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservableImpl;", "widgetVisibilityObservableImpl$delegate", "LSc/j;", "getWidgetVisibilityObservableImpl", "()Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservableImpl;", "widgetVisibilityObservableImpl", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2StickyMapper;", "stickyMapper$delegate", "getStickyMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2StickyMapper;", "stickyMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LPc/a;", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationV2IsVisibleViewModel;", "viewModelV2Provider$delegate", "getViewModelV2Provider", "viewModelV2Provider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;", "getWidgetVisibilityObserver", "()Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObserver;", "widgetVisibilityObserver", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;", "getWidgetVisibilityObservable", "()Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;", "widgetVisibilityObservable", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2Component$Companion$create$1$1 implements TravelPriceDetailInformationV2Component {
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: widgetVisibilityObservableImpl$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j widgetVisibilityObservableImpl = k.b(TravelPriceDetailInformationV2Component$Companion$create$1$1$widgetVisibilityObservableImpl$2.INSTANCE);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TravelPriceDetailInformationV2Component$Companion$create$1$1$mapper$2(this));

    /* renamed from: stickyMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stickyMapper = k.b(TravelPriceDetailInformationV2Component$Companion$create$1$1$stickyMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(TravelPriceDetailInformationV2Component$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelProvider = k.b(TravelPriceDetailInformationV2Component$Companion$create$1$1$viewModelProvider$2.INSTANCE);

    /* renamed from: viewModelV2Provider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelV2Provider = k.b(TravelPriceDetailInformationV2Component$Companion$create$1$1$viewModelV2Provider$2.INSTANCE);

    TravelPriceDetailInformationV2Component$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    private final WidgetVisibilityObservableImpl getWidgetVisibilityObservableImpl() {
        return (WidgetVisibilityObservableImpl) this.widgetVisibilityObservableImpl.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public TravelPriceDetailInformationV2Mapper getMapper() {
        return (TravelPriceDetailInformationV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public TravelPriceDetailInformationV2StickyMapper getStickyMapper() {
        return (TravelPriceDetailInformationV2StickyMapper) this.stickyMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public Pc.a<ButtonWithInformationIsVisibleViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public Pc.a<ButtonWithInformationV2IsVisibleViewModel> getViewModelV2Provider() {
        return (Pc.a) this.viewModelV2Provider.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public WidgetVisibilityObservable getWidgetVisibilityObservable() {
        return getWidgetVisibilityObservableImpl();
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component
    public WidgetVisibilityObserver getWidgetVisibilityObserver() {
        return getWidgetVisibilityObservableImpl();
    }
}
