package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data;

import G.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/SteppedThermometerDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "ranges", "", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Range;", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Spacers;", "progressLineColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Spacers;Ljava/lang/String;Ljava/util/Map;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getRanges", "()Ljava/util/List;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Spacers;", "getProgressLineColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SteppedThermometerDTO {
    public static final int $stable = 8;

    @NotNull
    private final CellDTO cell;
    private final String progressLineColor;

    @NotNull
    private final List<Range> ranges;
    private final Spacers spacers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SteppedThermometerDTO(@NotNull CellDTO cell, @NotNull List<Range> ranges, Spacers spacers, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        this.cell = cell;
        this.ranges = ranges;
        this.spacers = spacers;
        this.progressLineColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SteppedThermometerDTO copy$default(SteppedThermometerDTO steppedThermometerDTO, CellDTO cellDTO, List list, Spacers spacers, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = steppedThermometerDTO.cell;
        }
        if ((i11 & 2) != 0) {
            list = steppedThermometerDTO.ranges;
        }
        if ((i11 & 4) != 0) {
            spacers = steppedThermometerDTO.spacers;
        }
        if ((i11 & 8) != 0) {
            str = steppedThermometerDTO.progressLineColor;
        }
        if ((i11 & 16) != 0) {
            map = steppedThermometerDTO.trackingInfo;
        }
        Map map2 = map;
        Spacers spacers2 = spacers;
        return steppedThermometerDTO.copy(cellDTO, list, spacers2, str, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final List<Range> component2() {
        return this.ranges;
    }

    /* renamed from: component3, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProgressLineColor() {
        return this.progressLineColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final SteppedThermometerDTO copy(@NotNull CellDTO cell, @NotNull List<Range> ranges, Spacers spacers, String progressLineColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        return new SteppedThermometerDTO(cell, ranges, spacers, progressLineColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SteppedThermometerDTO)) {
            return false;
        }
        SteppedThermometerDTO steppedThermometerDTO = (SteppedThermometerDTO) other;
        return Intrinsics.d(this.cell, steppedThermometerDTO.cell) && Intrinsics.d(this.ranges, steppedThermometerDTO.ranges) && Intrinsics.d(this.spacers, steppedThermometerDTO.spacers) && Intrinsics.d(this.progressLineColor, steppedThermometerDTO.progressLineColor) && Intrinsics.d(this.trackingInfo, steppedThermometerDTO.trackingInfo);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final String getProgressLineColor() {
        return this.progressLineColor;
    }

    @NotNull
    public final List<Range> getRanges() {
        return this.ranges;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.cell.hashCode() * 31, 31, this.ranges);
        Spacers spacers = this.spacers;
        int hashCode = (b11 + (spacers == null ? 0 : spacers.hashCode())) * 31;
        String str = this.progressLineColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        List<Range> list = this.ranges;
        Spacers spacers = this.spacers;
        String str = this.progressLineColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SteppedThermometerDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", ranges=");
        sb2.append(list);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", progressLineColor=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
