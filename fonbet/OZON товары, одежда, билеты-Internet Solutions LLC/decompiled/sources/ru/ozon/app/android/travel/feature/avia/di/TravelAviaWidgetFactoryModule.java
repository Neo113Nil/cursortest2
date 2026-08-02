package ru.ozon.app.android.travel.feature.avia.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.AddToFavoritesButtonWidgetKt;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.AddToFavoritesCellWidgetKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.AviaFavoriteListWidgetKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.AviaSearchResultV4WidgetKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.AviaSkeletonLoaderWidgetKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.FlightSeatsLegendV2WidgetKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.FlightSeatsSchemeV2WidgetKt;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/di/TravelAviaWidgetFactoryModule;", "", "<init>", "()V", "Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;", "listTrackingViewMapper", "", "Ln20/i;", "provideWidgets$avia_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;)Ljava/util/Set;", "provideWidgets", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "provideWidgetFactories$avia_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideWidgetFactories", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelAviaWidgetFactoryModule {

    @NotNull
    public static final TravelAviaWidgetFactoryModule INSTANCE = new TravelAviaWidgetFactoryModule();

    private TravelAviaWidgetFactoryModule() {
    }

    @NotNull
    public final Set<i> provideWidgetFactories$avia_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return e0.h(InsuranceCarouselWidgetKt.insuranceCarouselWidget(jsonDeserializer));
    }

    @NotNull
    public final Set<i> provideWidgets$avia_prodGoogleAllVendorsRelease(@NotNull ListTrackingViewMapper listTrackingViewMapper) {
        Intrinsics.checkNotNullParameter(listTrackingViewMapper, "listTrackingViewMapper");
        i[] elements = {FlightSeatsSchemeV2WidgetKt.FlightSeatsSchemeV2Widget(), FlightSeatsLegendV2WidgetKt.FlightSeatsLegendV2Widget(), AviaSearchResultV4WidgetKt.AviaSearchResultV4Widget(), AviaSkeletonLoaderWidgetKt.AviaSkeletonLoaderWidget(listTrackingViewMapper), AviaFavoriteListWidgetKt.AviaFavoriteListWidget(), AddToFavoritesButtonWidgetKt.AddToFavoritesButtonWidget(), AddToFavoritesCellWidgetKt.AddToFavoritesCellWidget()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
