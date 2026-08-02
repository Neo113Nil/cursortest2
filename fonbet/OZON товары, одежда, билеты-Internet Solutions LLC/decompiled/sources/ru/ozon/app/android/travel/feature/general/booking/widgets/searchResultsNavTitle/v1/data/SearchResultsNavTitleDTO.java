package ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.data;

import B90.C2619v;
import HY.a;
import T7.P;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/searchResultsNavTitle/v1/data/SearchResultsNavTitleDTO;", "", "departure", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "arrival", "symbolBetween", "subtitle", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getDeparture", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getArrival", "getSymbolBetween", "getSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchResultsNavTitleDTO {

    @NotNull
    private final TextAtom arrival;

    @NotNull
    private final TextAtom departure;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom symbolBetween;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SearchResultsNavTitleDTO(@NotNull TextAtom departure, @NotNull TextAtom arrival, @NotNull TextAtom symbolBetween, @NotNull TextAtom subtitle, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        Intrinsics.checkNotNullParameter(symbolBetween, "symbolBetween");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.departure = departure;
        this.arrival = arrival;
        this.symbolBetween = symbolBetween;
        this.subtitle = subtitle;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SearchResultsNavTitleDTO copy$default(SearchResultsNavTitleDTO searchResultsNavTitleDTO, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = searchResultsNavTitleDTO.departure;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = searchResultsNavTitleDTO.arrival;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = searchResultsNavTitleDTO.symbolBetween;
        }
        if ((i11 & 8) != 0) {
            textAtom4 = searchResultsNavTitleDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            map = searchResultsNavTitleDTO.trackingInfo;
        }
        Map map2 = map;
        TextAtom textAtom5 = textAtom3;
        return searchResultsNavTitleDTO.copy(textAtom, textAtom2, textAtom5, textAtom4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getDeparture() {
        return this.departure;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getArrival() {
        return this.arrival;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getSymbolBetween() {
        return this.symbolBetween;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final SearchResultsNavTitleDTO copy(@NotNull TextAtom departure, @NotNull TextAtom arrival, @NotNull TextAtom symbolBetween, @NotNull TextAtom subtitle, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        Intrinsics.checkNotNullParameter(symbolBetween, "symbolBetween");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new SearchResultsNavTitleDTO(departure, arrival, symbolBetween, subtitle, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultsNavTitleDTO)) {
            return false;
        }
        SearchResultsNavTitleDTO searchResultsNavTitleDTO = (SearchResultsNavTitleDTO) other;
        return Intrinsics.d(this.departure, searchResultsNavTitleDTO.departure) && Intrinsics.d(this.arrival, searchResultsNavTitleDTO.arrival) && Intrinsics.d(this.symbolBetween, searchResultsNavTitleDTO.symbolBetween) && Intrinsics.d(this.subtitle, searchResultsNavTitleDTO.subtitle) && Intrinsics.d(this.trackingInfo, searchResultsNavTitleDTO.trackingInfo);
    }

    @NotNull
    public final TextAtom getArrival() {
        return this.arrival;
    }

    @NotNull
    public final TextAtom getDeparture() {
        return this.departure;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getSymbolBetween() {
        return this.symbolBetween;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(C2619v.b(this.departure.hashCode() * 31, 31, this.arrival), 31, this.symbolBetween), 31, this.subtitle);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.departure;
        TextAtom textAtom2 = this.arrival;
        TextAtom textAtom3 = this.symbolBetween;
        TextAtom textAtom4 = this.subtitle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("SearchResultsNavTitleDTO(departure=", textAtom, ", arrival=", textAtom2, ", symbolBetween=");
        C4636t5.c(", subtitle=", ", trackingInfo=", a11, textAtom3, textAtom4);
        return P.f(a11, map, ")");
    }
}
