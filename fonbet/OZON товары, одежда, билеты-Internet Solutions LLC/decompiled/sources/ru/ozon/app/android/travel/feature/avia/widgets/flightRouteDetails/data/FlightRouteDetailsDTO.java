package ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.data;

import B0.C2454a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsDTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsDTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "flights", "", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO;", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "marginBetweenFlights", "", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;ILjava/util/Map;Ljava/util/Map;)V", "getFlights", "()Ljava/util/List;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getMarginBetweenFlights", "()I", "getViewTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightRouteDetailsDTO implements TrackingInfoHolder {
    public static final int $stable = 8;
    private final DisclaimerAtom annotation;

    @NotNull
    private final List<FlightDetailsDTO> flights;
    private final int marginBetweenFlights;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    public FlightRouteDetailsDTO(@NotNull List<FlightDetailsDTO> flights, DisclaimerAtom disclaimerAtom, int i11, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(flights, "flights");
        this.flights = flights;
        this.annotation = disclaimerAtom;
        this.marginBetweenFlights = i11;
        this.viewTrackingInfo = map;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ FlightRouteDetailsDTO copy$default(FlightRouteDetailsDTO flightRouteDetailsDTO, List list, DisclaimerAtom disclaimerAtom, int i11, Map map, Map map2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = flightRouteDetailsDTO.flights;
        }
        if ((i12 & 2) != 0) {
            disclaimerAtom = flightRouteDetailsDTO.annotation;
        }
        if ((i12 & 4) != 0) {
            i11 = flightRouteDetailsDTO.marginBetweenFlights;
        }
        if ((i12 & 8) != 0) {
            map = flightRouteDetailsDTO.viewTrackingInfo;
        }
        if ((i12 & 16) != 0) {
            map2 = flightRouteDetailsDTO.trackingInfo;
        }
        Map map3 = map2;
        int i13 = i11;
        return flightRouteDetailsDTO.copy(list, disclaimerAtom, i13, map, map3);
    }

    @NotNull
    public final List<FlightDetailsDTO> component1() {
        return this.flights;
    }

    /* renamed from: component2, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMarginBetweenFlights() {
        return this.marginBetweenFlights;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.viewTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final FlightRouteDetailsDTO copy(@NotNull List<FlightDetailsDTO> flights, DisclaimerAtom annotation, int marginBetweenFlights, Map<String, TokenizedTrackingInfo> viewTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(flights, "flights");
        return new FlightRouteDetailsDTO(flights, annotation, marginBetweenFlights, viewTrackingInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightRouteDetailsDTO)) {
            return false;
        }
        FlightRouteDetailsDTO flightRouteDetailsDTO = (FlightRouteDetailsDTO) other;
        return Intrinsics.d(this.flights, flightRouteDetailsDTO.flights) && Intrinsics.d(this.annotation, flightRouteDetailsDTO.annotation) && this.marginBetweenFlights == flightRouteDetailsDTO.marginBetweenFlights && Intrinsics.d(this.viewTrackingInfo, flightRouteDetailsDTO.viewTrackingInfo) && Intrinsics.d(this.trackingInfo, flightRouteDetailsDTO.trackingInfo);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final List<FlightDetailsDTO> getFlights() {
        return this.flights;
    }

    public final int getMarginBetweenFlights() {
        return this.marginBetweenFlights;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        int hashCode = this.flights.hashCode() * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int a11 = C2454a.a(this.marginBetweenFlights, (hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<FlightDetailsDTO> list = this.flights;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int i11 = this.marginBetweenFlights;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FlightRouteDetailsDTO(flights=");
        sb2.append(list);
        sb2.append(", annotation=");
        sb2.append(disclaimerAtom);
        sb2.append(", marginBetweenFlights=");
        sb2.append(i11);
        sb2.append(", viewTrackingInfo=");
        sb2.append(map);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map2, ")");
    }

    public /* synthetic */ FlightRouteDetailsDTO(List list, DisclaimerAtom disclaimerAtom, int i11, Map map, Map map2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, disclaimerAtom, (i12 & 4) != 0 ? 0 : i11, map, (i12 & 16) != 0 ? map : map2);
    }
}
