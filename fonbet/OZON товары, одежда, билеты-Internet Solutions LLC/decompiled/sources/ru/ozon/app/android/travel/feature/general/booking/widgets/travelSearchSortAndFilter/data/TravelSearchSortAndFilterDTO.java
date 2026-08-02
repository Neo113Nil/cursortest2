package ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelButtonWithIcon.TravelButtonWithIconDTO;
import ru.ozon.app.android.travel.molecules.dto.travelFiltersButton.TravelFiltersButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.travelSorting.TravelSortingDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/data/TravelSearchSortAndFilterDTO;", "", "sorting", "Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;", "priceCalendarText", "Lru/ozon/app/android/travel/molecules/dto/travelButtonWithIcon/TravelButtonWithIconDTO;", "travelFiltersButton", "Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;Lru/ozon/app/android/travel/molecules/dto/travelButtonWithIcon/TravelButtonWithIconDTO;Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;Ljava/util/Map;)V", "getSorting", "()Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;", "getPriceCalendarText", "()Lru/ozon/app/android/travel/molecules/dto/travelButtonWithIcon/TravelButtonWithIconDTO;", "getTravelFiltersButton", "()Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelSearchSortAndFilterDTO {
    private final TravelButtonWithIconDTO priceCalendarText;
    private final TravelSortingDTO sorting;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final TravelFiltersButtonDTO travelFiltersButton;

    public TravelSearchSortAndFilterDTO(TravelSortingDTO travelSortingDTO, TravelButtonWithIconDTO travelButtonWithIconDTO, TravelFiltersButtonDTO travelFiltersButtonDTO, Map<String, TokenizedTrackingInfo> map) {
        this.sorting = travelSortingDTO;
        this.priceCalendarText = travelButtonWithIconDTO;
        this.travelFiltersButton = travelFiltersButtonDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelSearchSortAndFilterDTO copy$default(TravelSearchSortAndFilterDTO travelSearchSortAndFilterDTO, TravelSortingDTO travelSortingDTO, TravelButtonWithIconDTO travelButtonWithIconDTO, TravelFiltersButtonDTO travelFiltersButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            travelSortingDTO = travelSearchSortAndFilterDTO.sorting;
        }
        if ((i11 & 2) != 0) {
            travelButtonWithIconDTO = travelSearchSortAndFilterDTO.priceCalendarText;
        }
        if ((i11 & 4) != 0) {
            travelFiltersButtonDTO = travelSearchSortAndFilterDTO.travelFiltersButton;
        }
        if ((i11 & 8) != 0) {
            map = travelSearchSortAndFilterDTO.trackingInfo;
        }
        return travelSearchSortAndFilterDTO.copy(travelSortingDTO, travelButtonWithIconDTO, travelFiltersButtonDTO, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TravelSortingDTO getSorting() {
        return this.sorting;
    }

    /* renamed from: component2, reason: from getter */
    public final TravelButtonWithIconDTO getPriceCalendarText() {
        return this.priceCalendarText;
    }

    /* renamed from: component3, reason: from getter */
    public final TravelFiltersButtonDTO getTravelFiltersButton() {
        return this.travelFiltersButton;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelSearchSortAndFilterDTO copy(TravelSortingDTO sorting, TravelButtonWithIconDTO priceCalendarText, TravelFiltersButtonDTO travelFiltersButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new TravelSearchSortAndFilterDTO(sorting, priceCalendarText, travelFiltersButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSearchSortAndFilterDTO)) {
            return false;
        }
        TravelSearchSortAndFilterDTO travelSearchSortAndFilterDTO = (TravelSearchSortAndFilterDTO) other;
        return Intrinsics.d(this.sorting, travelSearchSortAndFilterDTO.sorting) && Intrinsics.d(this.priceCalendarText, travelSearchSortAndFilterDTO.priceCalendarText) && Intrinsics.d(this.travelFiltersButton, travelSearchSortAndFilterDTO.travelFiltersButton) && Intrinsics.d(this.trackingInfo, travelSearchSortAndFilterDTO.trackingInfo);
    }

    public final TravelButtonWithIconDTO getPriceCalendarText() {
        return this.priceCalendarText;
    }

    public final TravelSortingDTO getSorting() {
        return this.sorting;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final TravelFiltersButtonDTO getTravelFiltersButton() {
        return this.travelFiltersButton;
    }

    public int hashCode() {
        TravelSortingDTO travelSortingDTO = this.sorting;
        int hashCode = (travelSortingDTO == null ? 0 : travelSortingDTO.hashCode()) * 31;
        TravelButtonWithIconDTO travelButtonWithIconDTO = this.priceCalendarText;
        int hashCode2 = (hashCode + (travelButtonWithIconDTO == null ? 0 : travelButtonWithIconDTO.hashCode())) * 31;
        TravelFiltersButtonDTO travelFiltersButtonDTO = this.travelFiltersButton;
        int hashCode3 = (hashCode2 + (travelFiltersButtonDTO == null ? 0 : travelFiltersButtonDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelSearchSortAndFilterDTO(sorting=" + this.sorting + ", priceCalendarText=" + this.priceCalendarText + ", travelFiltersButton=" + this.travelFiltersButton + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
