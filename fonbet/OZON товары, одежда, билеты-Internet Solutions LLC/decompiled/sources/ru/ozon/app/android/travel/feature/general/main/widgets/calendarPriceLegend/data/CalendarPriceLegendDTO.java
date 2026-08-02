package ru.ozon.app.android.travel.feature.general.main.widgets.calendarPriceLegend.data;

import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendarPriceLegend/data/CalendarPriceLegendDTO;", "", "priceTitles", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getPriceTitles", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarPriceLegendDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TextDTO> priceTitles;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CalendarPriceLegendDTO(@NotNull List<TextDTO> priceTitles, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(priceTitles, "priceTitles");
        this.priceTitles = priceTitles;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarPriceLegendDTO copy$default(CalendarPriceLegendDTO calendarPriceLegendDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = calendarPriceLegendDTO.priceTitles;
        }
        if ((i11 & 2) != 0) {
            map = calendarPriceLegendDTO.trackingInfo;
        }
        return calendarPriceLegendDTO.copy(list, map);
    }

    @NotNull
    public final List<TextDTO> component1() {
        return this.priceTitles;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final CalendarPriceLegendDTO copy(@NotNull List<TextDTO> priceTitles, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(priceTitles, "priceTitles");
        return new CalendarPriceLegendDTO(priceTitles, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarPriceLegendDTO)) {
            return false;
        }
        CalendarPriceLegendDTO calendarPriceLegendDTO = (CalendarPriceLegendDTO) other;
        return Intrinsics.d(this.priceTitles, calendarPriceLegendDTO.priceTitles) && Intrinsics.d(this.trackingInfo, calendarPriceLegendDTO.trackingInfo);
    }

    @NotNull
    public final List<TextDTO> getPriceTitles() {
        return this.priceTitles;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.priceTitles.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("CalendarPriceLegendDTO(priceTitles=", ", trackingInfo=", ")", this.priceTitles, this.trackingInfo);
    }
}
