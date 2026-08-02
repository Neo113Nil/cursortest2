package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3StickyMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component$Companion$create$1$1;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3EventCollector;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEventEmitter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEventFlow;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.payload.HotelsBookTotalV3PayloadManager;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3AsyncWidgetViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel;
import ru.ozon.app.android.travel.usecase.RequestTravelCommonActionV2UseCase;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\u009d\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0018\u0010B\u001a\u00060>j\u0002`?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0018\u0010G\u001a\u00060Cj\u0002`D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"ru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventFlow;", "uiEventFlow$delegate", "LSc/j;", "getUiEventFlow", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventFlow;", "uiEventFlow", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3StickyMapper;", "stickyMapper$delegate", "getStickyMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3StickyMapper;", "stickyMapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3PayloadManager;", "payloadManager$delegate", "getPayloadManager", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3PayloadManager;", "payloadManager", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventEmitter;", "getUiEventsEmitter", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3UiEventEmitter;", "uiEventsEmitter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "getUiEventsCollector", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/events/HotelsBookTotalV3EventCollector;", "uiEventsCollector", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3AsyncWidgetViewModel;", "getAsyncViewModelProvider", "()LPc/a;", "asyncViewModelProvider", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3ViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "getStickyViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel;", "stickyViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3Component$Companion$create$1$1 implements HotelsBookTotalV3Component {
    private final ActionComponentApi actionComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: uiEventFlow$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j uiEventFlow = k.b(HotelsBookTotalV3Component$Companion$create$1$1$uiEventFlow$2.INSTANCE);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(HotelsBookTotalV3Component$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: stickyMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stickyMapper = k.b(HotelsBookTotalV3Component$Companion$create$1$1$stickyMapper$2.INSTANCE);

    /* renamed from: payloadManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j payloadManager = k.b(HotelsBookTotalV3Component$Companion$create$1$1$payloadManager$2.INSTANCE);

    HotelsBookTotalV3Component$Companion$create$1$1(C7475g c7475g) {
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HotelsBookTotalV3AsyncWidgetViewModel _get_asyncViewModelProvider_$lambda$0(HotelsBookTotalV3Component$Companion$create$1$1 hotelsBookTotalV3Component$Companion$create$1$1) {
        return new HotelsBookTotalV3AsyncWidgetViewModel(hotelsBookTotalV3Component$Companion$create$1$1.composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository(), hotelsBookTotalV3Component$Companion$create$1$1.getMapper(), hotelsBookTotalV3Component$Companion$create$1$1.coroutineDispatchersComponentApi.getDispatcherProvider(), hotelsBookTotalV3Component$Companion$create$1$1.analyticsComponentApi.getPerformanceTrackerDelegate());
    }

    private final HotelsBookTotalV3UiEventFlow getUiEventFlow() {
        return (HotelsBookTotalV3UiEventFlow) this.uiEventFlow.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public a<HotelsBookTotalV3AsyncWidgetViewModel> getAsyncViewModelProvider() {
        return new a() { // from class: EN.b
            @Override // Pc.a
            public final Object get() {
                HotelsBookTotalV3AsyncWidgetViewModel _get_asyncViewModelProvider_$lambda$0;
                _get_asyncViewModelProvider_$lambda$0 = HotelsBookTotalV3Component$Companion$create$1$1._get_asyncViewModelProvider_$lambda$0(HotelsBookTotalV3Component$Companion$create$1$1.this);
                return _get_asyncViewModelProvider_$lambda$0;
            }
        };
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public HotelsBookTotalV3Mapper getMapper() {
        return (HotelsBookTotalV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public HotelsBookTotalV3PayloadManager getPayloadManager() {
        return (HotelsBookTotalV3PayloadManager) this.payloadManager.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public HotelsBookTotalV3StickyMapper getStickyMapper() {
        return (HotelsBookTotalV3StickyMapper) this.stickyMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public HotelsBookTotalV3StickyViewModel getStickyViewModel() {
        return new HotelsBookTotalV3StickyViewModel();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public HotelsBookTotalV3EventCollector getUiEventsCollector() {
        return getUiEventFlow();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public HotelsBookTotalV3UiEventEmitter getUiEventsEmitter() {
        return getUiEventFlow();
    }

    @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component
    public HotelsBookTotalV3ViewModel getViewModel() {
        return new HotelsBookTotalV3ViewModel(new RequestTravelCommonActionV2UseCase(this.actionComponentApi.getActionRepository()), this.coroutineDispatchersComponentApi.getDispatcherProvider());
    }
}
