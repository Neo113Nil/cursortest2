package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di;

import AI.c;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data.TravelPriceCalendarV3Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.analytics.TravelPriceCalendarV3AnalyticsViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.dynamic.TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001e2\u00060\u0001j\u0002`\u0002:\u0001\u001eR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001d\u001a\u00060\u0019j\u0002`\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/di/TravelPriceCalendarV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/data/TravelPriceCalendarV3Mapper;", "mapper", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "getCalendarViewModel", "()Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModel", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;", "getAnalyticsViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;", "analyticsViewModel", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;", "getDynamicBehaviorWidgetViewModelProvider", "()LPc/a;", "dynamicBehaviorWidgetViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TravelPriceCalendarV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/di/TravelPriceCalendarV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/di/TravelPriceCalendarV3Component;", "create", "(Lk20/g;)Lk20/e;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TravelPriceCalendarV3Component create$lambda$0(C7475g c7475g) {
            return new TravelPriceCalendarV3Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<TravelPriceCalendarV3Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TravelPriceCalendarV3Component.class), new c(storage, 4));
        }
    }

    @NotNull
    TravelPriceCalendarV3AnalyticsViewModel getAnalyticsViewModel();

    @NotNull
    CalendarViewModel getCalendarViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    Pc.a<TravelPriceCalendarV3DynamicBehaviorWidgetViewModel> getDynamicBehaviorWidgetViewModelProvider();

    @NotNull
    TravelPriceCalendarV3Mapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
