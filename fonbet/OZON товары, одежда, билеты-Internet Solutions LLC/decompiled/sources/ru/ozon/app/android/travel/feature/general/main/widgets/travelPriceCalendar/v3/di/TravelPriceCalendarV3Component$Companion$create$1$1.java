package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data.TravelPriceCalendarV3Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.analytics.TravelPriceCalendarV3AnalyticsViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.dynamic.TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010*\u001a\u00060&j\u0002`'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010/\u001a\u00060+j\u0002`,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/di/TravelPriceCalendarV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/di/TravelPriceCalendarV3Component;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;", "kotlin.jvm.PlatformType", "dynamicBehaviorWidgetViewModelProvider$delegate", "getDynamicBehaviorWidgetViewModelProvider", "()LPc/a;", "dynamicBehaviorWidgetViewModelProvider", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "getCalendarViewModel", "()Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModel", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;", "getAnalyticsViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;", "analyticsViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceCalendarV3Component$Companion$create$1$1 implements TravelPriceCalendarV3Component {
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TravelPriceCalendarV3Component$Companion$create$1$1$mapper$2(this));

    /* renamed from: dynamicBehaviorWidgetViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j dynamicBehaviorWidgetViewModelProvider = k.b(new TravelPriceCalendarV3Component$Companion$create$1$1$dynamicBehaviorWidgetViewModelProvider$2(this));

    TravelPriceCalendarV3Component$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component
    public TravelPriceCalendarV3AnalyticsViewModel getAnalyticsViewModel() {
        return new TravelPriceCalendarV3AnalyticsViewModel(this.retainComposerComponentApi.getTokenizedAnalytics());
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component
    public CalendarViewModel getCalendarViewModel() {
        return new CalendarViewModel();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component
    public Pc.a<TravelPriceCalendarV3DynamicBehaviorWidgetViewModel> getDynamicBehaviorWidgetViewModelProvider() {
        return (Pc.a) this.dynamicBehaviorWidgetViewModelProvider.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component
    public TravelPriceCalendarV3Mapper getMapper() {
        return (TravelPriceCalendarV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
