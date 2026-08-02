package ru.ozon.app.android.travel.feature.general.main.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.data.CalendarConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation.CalendarViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarPriceLegend.data.CalendarPriceLegendConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarPriceLegend.presentation.CalendarPriceLegendViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data.HotTicketsConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.data.MainTabsConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.MainTabsViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.data.MiniAppTitleConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.data.PointsInputWidgetConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation.PointInputNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.data.PriceCalendarFooterV3Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3BottomViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data.PriceCalendarHeaderV3Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation.PriceCalendarHeaderV3OverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data.SearchFormBarConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation.SearchFormBarViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.data.StickyPromoRedirectV2Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation.StickyPromoRedirectV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.data.TopTravelModalConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.data.TravelNotificationModalCheckConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.presentation.TravelNotificationModalCheckNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelPassengersCountSelectorConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data.TravelPriceCalendarV3Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.TravelPriceCalendarV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.data.TravelSearchBarConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderCounter.data.UnpaidOrderCounterConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data.UnpaidOrderListConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListViewMapper;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

/* loaded from: classes7.dex */
public final class TravelGeneralMainWidgetV2Module_Companion_ProvideWidgets$main_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$main_prodGoogleAllVendorsRelease(CalendarConfig calendarConfig, CalendarViewMapper calendarViewMapper, CalendarPriceLegendConfig calendarPriceLegendConfig, CalendarPriceLegendViewMapper calendarPriceLegendViewMapper, MainTabsConfig mainTabsConfig, MainTabsViewMapper mainTabsViewMapper, MiniAppTitleConfig miniAppTitleConfig, MiniAppTitleViewMapper miniAppTitleViewMapper, PointsInputWidgetConfig pointsInputWidgetConfig, PointInputNoUiViewMapper pointInputNoUiViewMapper, PriceCalendarFooterConfig priceCalendarFooterConfig, PriceCalendarFooterViewMapper priceCalendarFooterViewMapper, PriceCalendarFooterV3Config priceCalendarFooterV3Config, PriceCalendarFooterV3BottomViewMapper priceCalendarFooterV3BottomViewMapper, PriceCalendarHeaderV3Config priceCalendarHeaderV3Config, PriceCalendarHeaderV3OverlayViewMapper priceCalendarHeaderV3OverlayViewMapper, SearchFormV4Config searchFormV4Config, SearchFormV4ViewMapper searchFormV4ViewMapper, SearchFormBarConfig searchFormBarConfig, SearchFormBarViewMapper searchFormBarViewMapper, StickyPromoRedirectV2Config stickyPromoRedirectV2Config, StickyPromoRedirectV2ViewMapper stickyPromoRedirectV2ViewMapper, TopTravelModalConfig topTravelModalConfig, TopTravelModalViewMapper topTravelModalViewMapper, TravelPassengersCountSelectorConfig travelPassengersCountSelectorConfig, TravelPassengersCountSelectorViewMapper travelPassengersCountSelectorViewMapper, TravelPriceCalendarV3Config travelPriceCalendarV3Config, TravelPriceCalendarV3ViewMapper travelPriceCalendarV3ViewMapper, TravelSearchBarConfig travelSearchBarConfig, TravelSearchBarViewMapper travelSearchBarViewMapper, UnpaidOrderListConfig unpaidOrderListConfig, UnpaidOrderListViewMapper unpaidOrderListViewMapper, UnpaidOrderCounterConfig unpaidOrderCounterConfig, TravelNotificationModalCheckNoUiViewMapper travelNotificationModalCheckNoUiViewMapper, TravelNotificationModalCheckConfig travelNotificationModalCheckConfig, HotTicketsConfig hotTicketsConfig, HotTicketsViewMapper hotTicketsViewMapper, ListTrackingViewMapper listTrackingViewMapper) {
        Set<Widget2> provideWidgets$main_prodGoogleAllVendorsRelease = TravelGeneralMainWidgetV2Module.INSTANCE.provideWidgets$main_prodGoogleAllVendorsRelease(calendarConfig, calendarViewMapper, calendarPriceLegendConfig, calendarPriceLegendViewMapper, mainTabsConfig, mainTabsViewMapper, miniAppTitleConfig, miniAppTitleViewMapper, pointsInputWidgetConfig, pointInputNoUiViewMapper, priceCalendarFooterConfig, priceCalendarFooterViewMapper, priceCalendarFooterV3Config, priceCalendarFooterV3BottomViewMapper, priceCalendarHeaderV3Config, priceCalendarHeaderV3OverlayViewMapper, searchFormV4Config, searchFormV4ViewMapper, searchFormBarConfig, searchFormBarViewMapper, stickyPromoRedirectV2Config, stickyPromoRedirectV2ViewMapper, topTravelModalConfig, topTravelModalViewMapper, travelPassengersCountSelectorConfig, travelPassengersCountSelectorViewMapper, travelPriceCalendarV3Config, travelPriceCalendarV3ViewMapper, travelSearchBarConfig, travelSearchBarViewMapper, unpaidOrderListConfig, unpaidOrderListViewMapper, unpaidOrderCounterConfig, travelNotificationModalCheckNoUiViewMapper, travelNotificationModalCheckConfig, hotTicketsConfig, hotTicketsViewMapper, listTrackingViewMapper);
        j.d(provideWidgets$main_prodGoogleAllVendorsRelease);
        return provideWidgets$main_prodGoogleAllVendorsRelease;
    }
}
