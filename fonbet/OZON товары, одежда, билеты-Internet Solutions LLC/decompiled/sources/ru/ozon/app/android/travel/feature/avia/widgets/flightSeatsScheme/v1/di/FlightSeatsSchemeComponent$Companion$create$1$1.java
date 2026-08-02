package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeItemsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.LegendMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.total.FlightSeatsSchemeTotalMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeAsyncViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\u0099\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u00106R!\u0010=\u001a\b\u0012\u0004\u0012\u000209088VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0016\u001a\u0004\b;\u0010<R!\u0010A\u001a\b\u0012\u0004\u0012\u00020>088VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0016\u001a\u0004\b@\u0010<R\u0018\u0010F\u001a\u00060Bj\u0002`C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/di/FlightSeatsSchemeComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/di/FlightSeatsSchemeComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/LegendMapper;", "legendMapper$delegate", "LSc/j;", "getLegendMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/LegendMapper;", "legendMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;", "orderDetailsMapper$delegate", "getOrderDetailsMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsMapper;", "orderDetailsMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "blockMapper$delegate", "getBlockMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockMapper;", "blockMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeItemsMapper;", "itemsMapper$delegate", "getItemsMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeItemsMapper;", "itemsMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "passengersBlockMapper$delegate", "getPassengersBlockMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "passengersBlockMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeMapper;", "flightSeatsSchemeMapper$delegate", "getFlightSeatsSchemeMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeMapper;", "flightSeatsSchemeMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/total/FlightSeatsSchemeTotalMapper;", "flightSeatsSchemeTotalMapper$delegate", "getFlightSeatsSchemeTotalMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/total/FlightSeatsSchemeTotalMapper;", "flightSeatsSchemeTotalMapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeViewModel;", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncViewModel;", "asyncWidgetViewModelProvider$delegate", "getAsyncWidgetViewModelProvider", "asyncWidgetViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeComponent$Companion$create$1$1 implements FlightSeatsSchemeComponent {
    private final ActionComponentApi actionComponentApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: legendMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j legendMapper = k.b(new FlightSeatsSchemeComponent$Companion$create$1$1$legendMapper$2(this));

    /* renamed from: orderDetailsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderDetailsMapper = k.b(FlightSeatsSchemeComponent$Companion$create$1$1$orderDetailsMapper$2.INSTANCE);

    /* renamed from: blockMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j blockMapper = k.b(new FlightSeatsSchemeComponent$Companion$create$1$1$blockMapper$2(this));

    /* renamed from: itemsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j itemsMapper = k.b(new FlightSeatsSchemeComponent$Companion$create$1$1$itemsMapper$2(this));

    /* renamed from: passengersBlockMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j passengersBlockMapper = k.b(new FlightSeatsSchemeComponent$Companion$create$1$1$passengersBlockMapper$2(this));

    /* renamed from: flightSeatsSchemeMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j flightSeatsSchemeMapper = k.b(new FlightSeatsSchemeComponent$Companion$create$1$1$flightSeatsSchemeMapper$2(this));

    /* renamed from: flightSeatsSchemeTotalMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j flightSeatsSchemeTotalMapper = k.b(FlightSeatsSchemeComponent$Companion$create$1$1$flightSeatsSchemeTotalMapper$2.INSTANCE);

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelProvider = k.b(new FlightSeatsSchemeComponent$Companion$create$1$1$viewModelProvider$2(this));

    /* renamed from: asyncWidgetViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j asyncWidgetViewModelProvider = k.b(new FlightSeatsSchemeComponent$Companion$create$1$1$asyncWidgetViewModelProvider$2(this));

    FlightSeatsSchemeComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemeBlockMapper getBlockMapper() {
        return (FlightSeatsSchemeBlockMapper) this.blockMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemeItemsMapper getItemsMapper() {
        return (FlightSeatsSchemeItemsMapper) this.itemsMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegendMapper getLegendMapper() {
        return (LegendMapper) this.legendMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemeOrderDetailsMapper getOrderDetailsMapper() {
        return (FlightSeatsSchemeOrderDetailsMapper) this.orderDetailsMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlightSeatsSchemePassengersBlockMapper getPassengersBlockMapper() {
        return (FlightSeatsSchemePassengersBlockMapper) this.passengersBlockMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent
    public Pc.a<FlightSeatsSchemeAsyncViewModel> getAsyncWidgetViewModelProvider() {
        return (Pc.a) this.asyncWidgetViewModelProvider.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent
    public FlightSeatsSchemeMapper getFlightSeatsSchemeMapper() {
        return (FlightSeatsSchemeMapper) this.flightSeatsSchemeMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent
    public FlightSeatsSchemeTotalMapper getFlightSeatsSchemeTotalMapper() {
        return (FlightSeatsSchemeTotalMapper) this.flightSeatsSchemeTotalMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent
    public Pc.a<FlightSeatsSchemeViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
