package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsVO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDTO;", "item", "", "stateId", "", "isFirstFlight", "isLastFlight", "mapFlight", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDTO;Ljava/lang/String;ZZ)Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;", "mapFlightDetails", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;)Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightOptionsMapper implements Function2<ToursFlightOptionsDTO, d, List<? extends ToursFlightOptionsVO>> {
    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsVO mapFlight(ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO.TourFlightDTO r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            r18 = this;
            r0 = r18
            ru.ozon.uni.atoms.data.price.Price r1 = r19.getPrice()
            ru.ozon.uni.atoms.utils.OzonSpannableString r1 = r1.getPrice()
            java.util.List r2 = r19.getAirlineLogoURLs()
            ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO$TourFlightDetailsDTO r3 = r19.getWayThereDetails()
            ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO$TourFlightDetailsDTO r4 = r19.getWayBackDetails()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "-"
            r5.append(r1)
            r5.append(r2)
            r5.append(r1)
            r5.append(r3)
            r5.append(r1)
            r5.append(r4)
            r5.append(r1)
            r1 = r20
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            int r1 = r1.hashCode()
            long r3 = (long) r1
            ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsVO r2 = new ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsVO
            java.util.List r5 = r19.getAirlineLogoURLs()
            java.util.List r6 = r19.getFlightFeatures()
            java.lang.String r7 = r19.getAgencyLogoImageURL()
            ru.ozon.uni.atoms.data.badge.Badge r8 = r19.getWarningBadge()
            ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO$TourFlightDetailsDTO r1 = r19.getWayThereDetails()
            ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsVO$TourFlightDetails r9 = r0.mapFlightDetails(r1)
            ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO$TourFlightDetailsDTO r1 = r19.getWayBackDetails()
            ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsVO$TourFlightDetails r10 = r0.mapFlightDetails(r1)
            ru.ozon.uni.atoms.data.price.Price r11 = r19.getPrice()
            ru.ozon.uni.atoms.data.texts.TextAtom r12 = r19.getPriceDescription()
            ru.ozon.uni.atoms.data.texts.TextAtom r13 = r19.getMarketingText()
            ru.ozon.uni.atoms.data.AtomActionDTO r1 = r19.getSelectAction()
            java.util.Map r14 = r19.getTrackingInfo()
            ru.ozon.uni.atoms.af.AtomAction r14 = ru.ozon.uni.atoms.data.AtomActionMapperKt.toAtomAction(r1, r14)
            java.util.Map r1 = r19.getTrackingInfo()
            r15 = 0
            if (r1 == 0) goto L91
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r20 = r2
            r2 = 2
            WZ.t r15 = ru.ozon.app.android.composer.TrackingInfoMapperKt.toTokenizedEvent$default(r1, r0, r15, r2, r15)
            r2 = r20
        L91:
            r16 = r22
            r17 = r15
            r15 = r21
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsMapper.mapFlight(ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO$TourFlightDTO, java.lang.String, boolean, boolean):ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsVO");
    }

    private final ToursFlightOptionsVO.TourFlightDetails mapFlightDetails(ToursFlightOptionsDTO.TourFlightDetailsDTO item) {
        return new ToursFlightOptionsVO.TourFlightDetails(item.getTime(), item.getCounter(), item.getAirportCodes(), item.getDuration());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursFlightOptionsVO> invoke(@NotNull ToursFlightOptionsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ToursFlightOptionsDTO.TourFlightDTO> flights = state.getFlights();
        ArrayList arrayList = new ArrayList(C7714v.z(flights, 10));
        int i11 = 0;
        for (Object obj : flights) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ToursFlightOptionsDTO.TourFlightDTO tourFlightDTO = (ToursFlightOptionsDTO.TourFlightDTO) obj;
            boolean z11 = true;
            boolean z12 = i11 == 0;
            if (i11 != C7714v.P(state.getFlights())) {
                z11 = false;
            }
            arrayList.add(mapFlight(tourFlightDTO, widgetInfo.d(), z12, z11));
            i11 = i12;
        }
        return arrayList;
    }
}
