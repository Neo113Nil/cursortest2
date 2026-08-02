package ru.ozon.app.android.travel.feature.general.common.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.full.EmptyStateV2FullNoFiltersWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.full.EmptyStateV2FullWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.overlay.EmptyStateV2OverlayNoFiltersWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.overlay.EmptyStateV2OverlayWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.wrap.EmptyStateV2WrapNoFiltersWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.wrap.EmptyStateV2WrapWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.mapper.EmptyStateV3FullWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.mapper.EmptyStateV3WrapWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer.FiltersFooterStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.data.InvisibleRefresherConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.overlay.MilesForBuyersModalInfoButtonsOverlayMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.data.NotificationInformerV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.presentation.NotificationInformerV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data.OverlayButtonsV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.data.RoundedNavBarConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.presentation.RoundedNavBarViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.data.ScrollAnchorConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation.ScrollAnchorViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.data.ServicePackageCarouselConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.data.ShortcutsControllerConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.presentation.ShortcutsControllerNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.data.TravelSortingV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation.TravelSortingV2ViewMapper;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

/* loaded from: classes7.dex */
public final class TravelGeneralWidgetV2Module_ProvideWidgetsV2$common_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgetsV2$common_prodGoogleAllVendorsRelease(TravelGeneralWidgetV2Module travelGeneralWidgetV2Module, NotificationInformerV2Config notificationInformerV2Config, NotificationInformerV2ViewMapper notificationInformerV2ViewMapper, MilesForBuyersModalInfoConfig milesForBuyersModalInfoConfig, MilesForBuyersModalInfoViewMapper milesForBuyersModalInfoViewMapper, MilesForBuyersModalInfoButtonsOverlayMapper milesForBuyersModalInfoButtonsOverlayMapper, MilesForBuyersConfig milesForBuyersConfig, MilesForBuyersViewMapper milesForBuyersViewMapper, ServicePackageCarouselConfig servicePackageCarouselConfig, ServicePackageCarouselViewMapper servicePackageCarouselViewMapper, EmptyStateV2Config emptyStateV2Config, EmptyStateV2OverlayWidgetViewMapper emptyStateV2OverlayWidgetViewMapper, EmptyStateV2WrapWidgetViewMapper emptyStateV2WrapWidgetViewMapper, EmptyStateV2WrapNoFiltersWidgetViewMapper emptyStateV2WrapNoFiltersWidgetViewMapper, EmptyStateV2OverlayNoFiltersWidgetViewMapper emptyStateV2OverlayNoFiltersWidgetViewMapper, EmptyStateV2FullNoFiltersWidgetViewMapper emptyStateV2FullNoFiltersWidgetViewMapper, EmptyStateV2FullWidgetViewMapper emptyStateV2FullWidgetViewMapper, FiltersConfig filtersConfig, FiltersHeaderStickyViewMapper filtersHeaderStickyViewMapper, FiltersSectionViewMapper filtersSectionViewMapper, FiltersFooterStickyViewMapper filtersFooterStickyViewMapper, OverlayButtonsV2Config overlayButtonsV2Config, OverlayButtonsV2ViewMapper overlayButtonsV2ViewMapper, InvisibleRefresherConfig invisibleRefresherConfig, InvisibleRefresherOverlayViewMapper invisibleRefresherOverlayViewMapper, EmptyStateV3Config emptyStateV3Config, EmptyStateV3FullWidgetViewMapper emptyStateV3FullWidgetViewMapper, EmptyStateV3WrapWidgetViewMapper emptyStateV3WrapWidgetViewMapper, TravelSortingV2Config travelSortingV2Config, TravelSortingV2ViewMapper travelSortingV2ViewMapper, RoundedNavBarConfig roundedNavBarConfig, RoundedNavBarViewMapper roundedNavBarViewMapper, ShortcutsControllerConfig shortcutsControllerConfig, ShortcutsControllerNoUiViewMapper shortcutsControllerNoUiViewMapper, ScrollAnchorConfig scrollAnchorConfig, ScrollAnchorViewMapper scrollAnchorViewMapper, ListTrackingViewMapper listTrackingViewMapper) {
        Set<Widget2> provideWidgetsV2$common_prodGoogleAllVendorsRelease = travelGeneralWidgetV2Module.provideWidgetsV2$common_prodGoogleAllVendorsRelease(notificationInformerV2Config, notificationInformerV2ViewMapper, milesForBuyersModalInfoConfig, milesForBuyersModalInfoViewMapper, milesForBuyersModalInfoButtonsOverlayMapper, milesForBuyersConfig, milesForBuyersViewMapper, servicePackageCarouselConfig, servicePackageCarouselViewMapper, emptyStateV2Config, emptyStateV2OverlayWidgetViewMapper, emptyStateV2WrapWidgetViewMapper, emptyStateV2WrapNoFiltersWidgetViewMapper, emptyStateV2OverlayNoFiltersWidgetViewMapper, emptyStateV2FullNoFiltersWidgetViewMapper, emptyStateV2FullWidgetViewMapper, filtersConfig, filtersHeaderStickyViewMapper, filtersSectionViewMapper, filtersFooterStickyViewMapper, overlayButtonsV2Config, overlayButtonsV2ViewMapper, invisibleRefresherConfig, invisibleRefresherOverlayViewMapper, emptyStateV3Config, emptyStateV3FullWidgetViewMapper, emptyStateV3WrapWidgetViewMapper, travelSortingV2Config, travelSortingV2ViewMapper, roundedNavBarConfig, roundedNavBarViewMapper, shortcutsControllerConfig, shortcutsControllerNoUiViewMapper, scrollAnchorConfig, scrollAnchorViewMapper, listTrackingViewMapper);
        j.d(provideWidgetsV2$common_prodGoogleAllVendorsRelease);
        return provideWidgetsV2$common_prodGoogleAllVendorsRelease;
    }
}
