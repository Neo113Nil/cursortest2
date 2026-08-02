package ru.ozon.app.android.travel.feature.tours.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.presentation.OrderToursChangeFormButtonViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.data.OrderToursChangeFormConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3Config;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.config.TouristCountSelectorV3ConfigViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.footer.TouristCountSelectorV3FooterViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.data.ToursBookInformerConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.presentation.ToursBookInformerViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.data.ToursFlightDetailsConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation.ToursFlightDetailsViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.timer.ToursFlightOptionsTimerViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.data.ToursHotelInfoCardConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation.ToursHotelInfoCardViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data.ToursLoaderConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.ToursMealViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyBottom.ToursMealStickyBottomViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop.ToursMealStickyTopViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.loading.ToursSearchResultLoadingOverlayViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.data.ToursSummaryConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation.ToursSummaryViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation.header.ToursSummaryHeaderViewMapper;

/* loaded from: classes7.dex */
public final class TravelToursWidgetV2Module_Companion_ProvideWidgets$tours_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$tours_prodGoogleAllVendorsRelease(TouristCountSelectorConfig touristCountSelectorConfig, TouristCountSelectorViewMapper touristCountSelectorViewMapper, TouristCountSelectorV3Config touristCountSelectorV3Config, TouristCountSelectorV3ConfigViewMapper touristCountSelectorV3ConfigViewMapper, TouristCountSelectorV3RoomViewMapper touristCountSelectorV3RoomViewMapper, TouristCountSelectorV3FooterViewMapper touristCountSelectorV3FooterViewMapper, ToursFlightDetailsConfig toursFlightDetailsConfig, ToursFlightDetailsViewMapper toursFlightDetailsViewMapper, ToursLoaderConfig toursLoaderConfig, ToursLoaderViewMapper toursLoaderViewMapper, ToursSearchResultConfig toursSearchResultConfig, ToursSearchResultViewMapper toursSearchResultViewMapper, ToursSearchResultLoadingOverlayViewMapper toursSearchResultLoadingOverlayViewMapper, ToursHotelInfoCardConfig toursHotelInfoCardConfig, ToursHotelInfoCardViewMapper toursHotelInfoCardViewMapper, ToursSummaryConfig toursSummaryConfig, ToursSummaryHeaderViewMapper toursSummaryHeaderViewMapper, ToursSummaryViewMapper toursSummaryViewMapper, ToursFlightOptionsConfig toursFlightOptionsConfig, ToursFlightOptionsViewMapper toursFlightOptionsViewMapper, ToursFlightOptionsTimerViewMapper toursFlightOptionsTimerViewMapper, ToursMealConfig toursMealConfig, ToursMealStickyTopViewMapper toursMealStickyTopViewMapper, ToursMealViewMapper toursMealViewMapper, ToursMealStickyBottomViewMapper toursMealStickyBottomViewMapper, ToursBookInformerConfig toursBookInformerConfig, ToursBookInformerViewMapper toursBookInformerViewMapper, OrderToursChangeFormConfig orderToursChangeFormConfig, OrderToursChangeFormViewMapper orderToursChangeFormViewMapper, OrderToursChangeFormButtonViewMapper orderToursChangeFormButtonViewMapper) {
        Set<Widget2> provideWidgets$tours_prodGoogleAllVendorsRelease = TravelToursWidgetV2Module.INSTANCE.provideWidgets$tours_prodGoogleAllVendorsRelease(touristCountSelectorConfig, touristCountSelectorViewMapper, touristCountSelectorV3Config, touristCountSelectorV3ConfigViewMapper, touristCountSelectorV3RoomViewMapper, touristCountSelectorV3FooterViewMapper, toursFlightDetailsConfig, toursFlightDetailsViewMapper, toursLoaderConfig, toursLoaderViewMapper, toursSearchResultConfig, toursSearchResultViewMapper, toursSearchResultLoadingOverlayViewMapper, toursHotelInfoCardConfig, toursHotelInfoCardViewMapper, toursSummaryConfig, toursSummaryHeaderViewMapper, toursSummaryViewMapper, toursFlightOptionsConfig, toursFlightOptionsViewMapper, toursFlightOptionsTimerViewMapper, toursMealConfig, toursMealStickyTopViewMapper, toursMealViewMapper, toursMealStickyBottomViewMapper, toursBookInformerConfig, toursBookInformerViewMapper, orderToursChangeFormConfig, orderToursChangeFormViewMapper, orderToursChangeFormButtonViewMapper);
        j.d(provideWidgets$tours_prodGoogleAllVendorsRelease);
        return provideWidgets$tours_prodGoogleAllVendorsRelease;
    }
}
