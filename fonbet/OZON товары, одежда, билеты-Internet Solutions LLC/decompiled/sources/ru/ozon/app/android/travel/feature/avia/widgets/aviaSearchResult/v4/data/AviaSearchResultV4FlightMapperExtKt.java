package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u001a*\u0010\t\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0015H\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u001f"}, d2 = {"prefetchImages", "", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "context", "Landroid/content/Context;", "imagePrefetcher", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "toVO", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO;", "onboardingApp", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "isLoading", "", "mapTripRoute", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;", "mapTransfer", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute$Transfer;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute$Transfer;", "generateUniqueId", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "stateId", "", "mapAdditionalInfo", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$AdditionalInfo;", "dto", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$AdditionalInfoDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4FlightMapperExtKt {
    public static final int generateUniqueId(@NotNull AtomActionDTO atomActionDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(atomActionDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        int hashCode = stateId.hashCode() * 31;
        String link = atomActionDTO.getLink();
        int hashCode2 = (hashCode + (link != null ? link.hashCode() : 0)) * 31;
        Map<String, String> params = atomActionDTO.getParams();
        return hashCode2 + (params != null ? params.hashCode() : 0);
    }

    public static /* synthetic */ int generateUniqueId$default(AtomActionDTO atomActionDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return generateUniqueId(atomActionDTO, str);
    }

    private static final AviaSearchResultV4FlightVO.AdditionalInfo mapAdditionalInfo(AviaSearchResultV4DTO.Flight.AdditionalInfoDTO additionalInfoDTO, Context context) {
        return new AviaSearchResultV4FlightVO.AdditionalInfo(additionalInfoDTO.getText(), additionalInfoDTO.getBadge(), UiExtKt.toPx(additionalInfoDTO.getOffsetX(), context));
    }

    private static final AviaSearchResultV4FlightVO.TripRoute.Transfer mapTransfer(AviaSearchResultV4DTO.Flight.TripRoute.Transfer transfer) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(transfer.getCity());
        if (transfer.getIcons() != null) {
            arrayList.addAll(transfer.getIcons());
        }
        return new AviaSearchResultV4FlightVO.TripRoute.Transfer(transfer.getCity().getText().hashCode(), arrayList);
    }

    private static final AviaSearchResultV4FlightVO.TripRoute mapTripRoute(AviaSearchResultV4DTO.Flight.TripRoute tripRoute) {
        TextDTO tripTime = tripRoute.getTripTime();
        TextDTO tripDuration = tripRoute.getTripDuration();
        TextDTO routeInfo = tripRoute.getRouteInfo();
        TextDTO timeDifference = tripRoute.getTimeDifference();
        List<AviaSearchResultV4DTO.Flight.TripRoute.Transfer> transfers = tripRoute.getTransfers();
        ArrayList arrayList = new ArrayList(C7714v.z(transfers, 10));
        Iterator<T> it = transfers.iterator();
        while (it.hasNext()) {
            arrayList.add(mapTransfer((AviaSearchResultV4DTO.Flight.TripRoute.Transfer) it.next()));
        }
        return new AviaSearchResultV4FlightVO.TripRoute(tripTime, tripDuration, routeInfo, timeDifference, arrayList);
    }

    public static final void prefetchImages(@NotNull List<AviaSearchResultV4DTO.Flight> list, @NotNull Context context, @NotNull ImagePrefetcher<IconDTO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<IconDTO> airlineIcons = ((AviaSearchResultV4DTO.Flight) it.next()).getAirlineIcons();
            if (airlineIcons != null) {
                arrayList.add(airlineIcons);
            }
        }
        ArrayList N11 = C7714v.N(arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = N11.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((IconDTO) next).getBackgroundImage())) {
                arrayList2.add(next);
            }
        }
        imagePrefetcher.prefetch(context, arrayList2);
    }

    @NotNull
    public static final AviaSearchResultV4FlightVO toVO(@NotNull AviaSearchResultV4DTO.Flight flight, @NotNull Context context, OnBoardingDTO onBoardingDTO, boolean z11) {
        int i11;
        Intrinsics.checkNotNullParameter(flight, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (z11) {
            Integer flightId = flight.getFlightId();
            i11 = flightId != null ? flightId.intValue() : generateUniqueId$default(flight.getCardClickAction(), null, 1, null);
        } else {
            i11 = 0;
        }
        List<BadgeDTO> badges = flight.getBadges();
        List<BadgeDTO> badges2 = flight.getBadges();
        boolean z12 = !(badges2 == null || badges2.isEmpty());
        PriceDTO price = flight.getPrice();
        BadgeDTO premiumBadge = flight.getPremiumBadge();
        TextDTO luggageText = flight.getLuggageText();
        List<IconDTO> airlineIcons = flight.getAirlineIcons();
        TextDTO airlinesText = flight.getAirlinesText();
        AviaSearchResultV4FlightVO.TripRoute mapTripRoute = mapTripRoute(flight.getWayThereDetails());
        AviaSearchResultV4DTO.Flight.TripRoute wayBackDetails = flight.getWayBackDetails();
        AviaSearchResultV4FlightVO.TripRoute mapTripRoute2 = wayBackDetails != null ? mapTripRoute(wayBackDetails) : null;
        String borderColor = flight.getBorderColor();
        String backgroundColor = flight.getBackgroundColor();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(flight.getCardClickAction(), flight.getTrackingInfo());
        OnBoardingDTO onBoardingDTO2 = flight.getCanShowOnboarding() ? onBoardingDTO : null;
        AviaSearchResultV4DTO.Flight.AdditionalInfoDTO additionalInfo = flight.getAdditionalInfo();
        return new AviaSearchResultV4FlightVO(i11, badges, z12, price, premiumBadge, luggageText, airlineIcons, airlinesText, mapTripRoute, mapTripRoute2, borderColor, backgroundColor, atomAction, onBoardingDTO2, additionalInfo != null ? mapAdditionalInfo(additionalInfo, context) : null, flight.getTrackingInfo());
    }

    public static /* synthetic */ AviaSearchResultV4FlightVO toVO$default(AviaSearchResultV4DTO.Flight flight, Context context, OnBoardingDTO onBoardingDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            onBoardingDTO = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return toVO(flight, context, onBoardingDTO, z11);
    }
}
