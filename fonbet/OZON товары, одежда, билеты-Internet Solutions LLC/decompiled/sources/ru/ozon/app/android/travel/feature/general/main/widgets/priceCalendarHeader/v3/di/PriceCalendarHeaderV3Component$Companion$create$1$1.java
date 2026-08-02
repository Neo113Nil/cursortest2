package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data.PriceCalendarHeaderV3Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation.PriceCalendarHeaderV3WidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/di/PriceCalendarHeaderV3Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/di/PriceCalendarHeaderV3Component;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewModel;", "kotlin.jvm.PlatformType", "widgetViewModelProvider$delegate", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "getCalendarViewModel", "()Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarHeaderV3Component$Companion$create$1$1 implements PriceCalendarHeaderV3Component {
    private final AnalyticsComponentApi analyticsComponentApi;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new PriceCalendarHeaderV3Component$Companion$create$1$1$mapper$2(this));

    /* renamed from: widgetViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j widgetViewModelProvider = k.b(new PriceCalendarHeaderV3Component$Companion$create$1$1$widgetViewModelProvider$2(this));

    PriceCalendarHeaderV3Component$Companion$create$1$1(C7475g c7475g) {
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.di.PriceCalendarHeaderV3Component
    public CalendarViewModel getCalendarViewModel() {
        return new CalendarViewModel();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.di.PriceCalendarHeaderV3Component
    public PriceCalendarHeaderV3Mapper getMapper() {
        return (PriceCalendarHeaderV3Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.di.PriceCalendarHeaderV3Component
    public Pc.a<PriceCalendarHeaderV3WidgetViewModel> getWidgetViewModelProvider() {
        return (Pc.a) this.widgetViewModelProvider.getValue();
    }
}
