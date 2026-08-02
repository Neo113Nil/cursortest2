package ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.data;

import B90.C2619v;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.travelSorting.TravelSortingDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/data/ToursSortingDTO;", "", "sorting", "Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;", "totalCount", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getSorting", "()Lru/ozon/app/android/travel/molecules/dto/travelSorting/TravelSortingDTO;", "getTotalCount", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToursSortingDTO {
    public static final int $stable = 8;

    @NotNull
    private final TravelSortingDTO sorting;

    @NotNull
    private final TextAtom totalCount;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ToursSortingDTO(@NotNull TravelSortingDTO sorting, @NotNull TextAtom totalCount, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Intrinsics.checkNotNullParameter(totalCount, "totalCount");
        this.sorting = sorting;
        this.totalCount = totalCount;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToursSortingDTO copy$default(ToursSortingDTO toursSortingDTO, TravelSortingDTO travelSortingDTO, TextAtom textAtom, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            travelSortingDTO = toursSortingDTO.sorting;
        }
        if ((i11 & 2) != 0) {
            textAtom = toursSortingDTO.totalCount;
        }
        if ((i11 & 4) != 0) {
            map = toursSortingDTO.trackingInfo;
        }
        return toursSortingDTO.copy(travelSortingDTO, textAtom, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TravelSortingDTO getSorting() {
        return this.sorting;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTotalCount() {
        return this.totalCount;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final ToursSortingDTO copy(@NotNull TravelSortingDTO sorting, @NotNull TextAtom totalCount, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Intrinsics.checkNotNullParameter(totalCount, "totalCount");
        return new ToursSortingDTO(sorting, totalCount, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursSortingDTO)) {
            return false;
        }
        ToursSortingDTO toursSortingDTO = (ToursSortingDTO) other;
        return Intrinsics.d(this.sorting, toursSortingDTO.sorting) && Intrinsics.d(this.totalCount, toursSortingDTO.totalCount) && Intrinsics.d(this.trackingInfo, toursSortingDTO.trackingInfo);
    }

    @NotNull
    public final TravelSortingDTO getSorting() {
        return this.sorting;
    }

    @NotNull
    public final TextAtom getTotalCount() {
        return this.totalCount;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.sorting.hashCode() * 31, 31, this.totalCount);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TravelSortingDTO travelSortingDTO = this.sorting;
        TextAtom textAtom = this.totalCount;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ToursSortingDTO(sorting=");
        sb2.append(travelSortingDTO);
        sb2.append(", totalCount=");
        sb2.append(textAtom);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
