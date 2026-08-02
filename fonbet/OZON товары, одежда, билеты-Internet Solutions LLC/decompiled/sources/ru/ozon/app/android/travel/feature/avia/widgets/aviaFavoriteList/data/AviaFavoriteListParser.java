package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.data;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.data.AviaFavoriteListDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListFlightVI;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListHeaderVI;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListItemVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListParser;", "", "<init>", "()V", "parse", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListItemVI;", "dto", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO;", "stateId", "", "parseFavoriteItems", "items", "mapTripRoute", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO;", "mapTransfer", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI$TransferVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO$TransferDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListParser {
    private final AviaFavoriteListFlightVI.TripRouteVI.TransferVI mapTransfer(AviaFavoriteListDTO.FlightDTO.TripRouteDTO.TransferDTO item) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(item.getCity());
        List<IconDTO> icons = item.getIcons();
        if (icons != null) {
            arrayList.addAll(icons);
        }
        return new AviaFavoriteListFlightVI.TripRouteVI.TransferVI(item.getCity().getText().hashCode(), arrayList);
    }

    private final AviaFavoriteListFlightVI.TripRouteVI mapTripRoute(AviaFavoriteListDTO.FlightDTO.TripRouteDTO item) {
        TextDTO tripTime = item.getTripTime();
        TextDTO tripDuration = item.getTripDuration();
        TextDTO routeInfo = item.getRouteInfo();
        TextDTO timeDifference = item.getTimeDifference();
        List<AviaFavoriteListDTO.FlightDTO.TripRouteDTO.TransferDTO> transfers = item.getTransfers();
        ArrayList arrayList = new ArrayList(C7714v.z(transfers, 10));
        Iterator<T> it = transfers.iterator();
        while (it.hasNext()) {
            arrayList.add(mapTransfer((AviaFavoriteListDTO.FlightDTO.TripRouteDTO.TransferDTO) it.next()));
        }
        return new AviaFavoriteListFlightVI.TripRouteVI(tripTime, tripDuration, routeInfo, timeDifference, arrayList);
    }

    @NotNull
    public final List<AviaFavoriteListItemVI> parse(@NotNull AviaFavoriteListDTO dto, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return parseFavoriteItems(dto.getSegments(), stateId);
    }

    @NotNull
    public final List<AviaFavoriteListItemVI> parseFavoriteItems(@NotNull List<? extends Object> items, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        if (items.isEmpty()) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        int hashCode = stateId.hashCode();
        for (Object obj : items) {
            if (obj instanceof AviaFavoriteListDTO.HeaderDTO) {
                AviaFavoriteListDTO.HeaderDTO headerDTO = (AviaFavoriteListDTO.HeaderDTO) obj;
                arrayList.add(new AviaFavoriteListHeaderVI((hashCode * 31) + Integer.hashCode(headerDTO.getHeaderId()), headerDTO.getTitle(), headerDTO.getSubtitle()));
            } else if (obj instanceof AviaFavoriteListDTO.FlightDTO) {
                AviaFavoriteListDTO.FlightDTO flightDTO = (AviaFavoriteListDTO.FlightDTO) obj;
                long hashCode2 = (hashCode * 31) + Integer.hashCode(flightDTO.getFlightId());
                PriceDTO price = flightDTO.getPrice();
                BadgeDTO badge = flightDTO.getBadge();
                TextDTO flightInfo = flightDTO.getFlightInfo();
                TextDTO luggageText = flightDTO.getLuggageText();
                List<IconDTO> airlineIcons = flightDTO.getAirlineIcons();
                TextDTO airlinesText = flightDTO.getAirlinesText();
                FavoriteProductModel model = FavoriteProductModelKt.toModel(flightDTO.getFavoriteButton());
                AviaFavoriteListDTO.FlightDTO.TripRouteDTO wayThereDetails = flightDTO.getWayThereDetails();
                AviaFavoriteListFlightVI.TripRouteVI mapTripRoute = wayThereDetails != null ? mapTripRoute(wayThereDetails) : null;
                AviaFavoriteListDTO.FlightDTO.TripRouteDTO wayBackDetails = flightDTO.getWayBackDetails();
                AviaFavoriteListFlightVI.TripRouteVI mapTripRoute2 = wayBackDetails != null ? mapTripRoute(wayBackDetails) : null;
                String backgroundColor = flightDTO.getBackgroundColor();
                CommonControlSettings common = flightDTO.getCommon();
                AtomAction atomAction = common != null ? common.toAtomAction() : null;
                ButtonV3DTO button = flightDTO.getButton();
                Map<String, TokenizedTrackingInfo> trackingInfo = flightDTO.getTrackingInfo();
                arrayList.add(new AviaFavoriteListFlightVI(hashCode2, price, badge, flightInfo, luggageText, airlineIcons, airlinesText, model, mapTripRoute, mapTripRoute2, backgroundColor, atomAction, button, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode2), null) : null));
            }
        }
        return arrayList;
    }
}
