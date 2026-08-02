package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.analytics.CalendarAnalytics;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.data.CalendarMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.data.CalendarFullMapper;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/di/CalendarComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/di/CalendarComponent;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerAnalyticsComponentApi;", "retainAnalyticsApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerAnalyticsComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "kotlin.jvm.PlatformType", "completableApi$delegate", "LSc/j;", "getCompletableApi", "()Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "completableApi", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/data/CalendarMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/data/CalendarMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/analytics/CalendarAnalytics;", "getCalendarAnalytics", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/analytics/CalendarAnalytics;", "calendarAnalytics", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel;", "getCalendarViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel;", "calendarViewModel", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "getSharedViewModel", "()Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "sharedViewModel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarComponent$Companion$create$1$1 implements CalendarComponent {
    private final AnalyticsComponentApi analyticsApi;
    private final ContextComponentDependencies contextApi;
    private final NetworkComponentApi networkApi;
    private final RetainComposerAnalyticsComponentApi retainAnalyticsApi;

    /* renamed from: completableApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j completableApi = k.b(new CalendarComponent$Companion$create$1$1$completableApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CalendarComponent$Companion$create$1$1$mapper$2.INSTANCE);

    CalendarComponent$Companion$create$1$1(C7475g c7475g) {
        this.analyticsApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.retainAnalyticsApi = (RetainComposerAnalyticsComponentApi) c7475g.getComponent(RetainComposerAnalyticsComponentApi.class);
        this.networkApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.contextApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    private final TravelCommonCompletableApi getCompletableApi() {
        return (TravelCommonCompletableApi) this.completableApi.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.di.CalendarComponent
    public CalendarAnalytics getCalendarAnalytics() {
        return new CalendarAnalytics(this.analyticsApi.getAnalyticsDataLayer(), this.analyticsApi.getPluginsManager(), this.retainAnalyticsApi.getAnalyticsScreenStorage());
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.di.CalendarComponent
    public CalendarViewModel getCalendarViewModel() {
        TravelCommonCompletableApi completableApi = getCompletableApi();
        Intrinsics.checkNotNullExpressionValue(completableApi, "<get-completableApi>(...)");
        return new CalendarViewModel(completableApi, new CalendarFullMapper(this.contextApi.getContext()));
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.di.CalendarComponent
    public CalendarMapper getMapper() {
        return (CalendarMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.di.CalendarComponent
    public ModalParentRefreshSharedViewModel getSharedViewModel() {
        return new ModalParentRefreshSharedViewModel();
    }
}
