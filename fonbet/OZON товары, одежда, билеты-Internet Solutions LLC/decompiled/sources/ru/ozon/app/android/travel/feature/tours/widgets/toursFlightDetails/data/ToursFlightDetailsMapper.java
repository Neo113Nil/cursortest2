package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.data;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.data.ToursFlightDetailsDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation.ToursFlightDetailsVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight;", "flight", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;", "mapFlight", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight;)Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightDetailsMapper implements Function2<ToursFlightDetailsDTO, d, List<? extends ToursFlightDetailsVO>> {
    private final ToursFlightDetailsVO.FlightVO mapFlight(ToursFlightDetailsDTO.Flight flight) {
        OzonSpannableString text = flight.getAirlineName().getText();
        OzonSpannableString text2 = flight.getDeparture().getDate().getText();
        OzonSpannableString text3 = flight.getDeparture().getTime().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        sb2.append((Object) text3);
        long hashCode = sb2.toString().hashCode();
        TextAtom airlineName = flight.getAirlineName();
        TextAtom subtitle = flight.getSubtitle();
        String logoImageURL = flight.getLogoImageURL();
        List<Badge> badges = flight.getBadges();
        List<Badge> badges2 = flight.getBadges();
        return new ToursFlightDetailsVO.FlightVO(hashCode, airlineName, subtitle, logoImageURL, badges, !(badges2 == null || badges2.isEmpty()), flight.getDeparture(), flight.getArrival());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursFlightDetailsVO> invoke(@NotNull ToursFlightDetailsDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Object obj;
        t tVar;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ToursFlightDetailsDTO.Route> routes = state.getRoutes();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj2 : routes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ToursFlightDetailsDTO.Route route = (ToursFlightDetailsDTO.Route) obj2;
            ArrayList arrayList3 = new ArrayList();
            int i13 = 0;
            for (Object obj3 : route.getRouteStages()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                if (obj3 instanceof ToursFlightDetailsDTO.Flight) {
                    ToursFlightDetailsVO.FlightVO mapFlight = mapFlight((ToursFlightDetailsDTO.Flight) obj3);
                    ArrayList arrayList4 = arrayList3;
                    long hashCode = (mapFlight.getId() + widgetInfo.d()).hashCode();
                    ToursFlightDetailsVO.Header header = i13 == 0 ? new ToursFlightDetailsVO.Header(route.getTitle(), route.getTime()) : null;
                    boolean z11 = i11 == 0 && i13 == 0;
                    boolean z12 = i11 == C7714v.P(state.getRoutes()) && i13 == C7714v.P(route.getRouteStages());
                    boolean z13 = i11 != 0 && i13 == 0;
                    TextAtom caption = z12 ? state.getCaption() : null;
                    DisclaimerAtom disclaimer = z11 ? state.getDisclaimer() : null;
                    Object Q11 = C7714v.Q(i14, route.getRouteStages());
                    ToursFlightDetailsDTO.Transfer transfer = Q11 instanceof ToursFlightDetailsDTO.Transfer ? (ToursFlightDetailsDTO.Transfer) Q11 : null;
                    if (!z11 || (trackingInfo = state.getTrackingInfo()) == null) {
                        obj = null;
                        tVar = null;
                    } else {
                        tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
                        obj = null;
                    }
                    arrayList = arrayList4;
                    arrayList.add(new ToursFlightDetailsVO(hashCode, header, mapFlight, transfer, caption, z11, z12, z13, disclaimer, tVar));
                } else {
                    arrayList = arrayList3;
                }
                arrayList3 = arrayList;
                i13 = i14;
            }
            C7714v.p(arrayList3, arrayList2);
            i11 = i12;
        }
        return arrayList2;
    }
}
