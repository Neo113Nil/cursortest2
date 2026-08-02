package ru.ozon.app.android.ugc.core.widgets.stickyCell.data;

import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "shownKey", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "strokeColor", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getShownKey", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "getStrokeColor", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StickyCellDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final CornerRadius cornerRadius;
    private final String shownKey;
    private final String strokeColor;
    private final Map<String, TokenizedTrackingInfo> tracking;

    public StickyCellDTO(@NotNull CellDTO cell, String str, CornerRadius cornerRadius, String str2, String str3, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.shownKey = str;
        this.cornerRadius = cornerRadius;
        this.backgroundColor = str2;
        this.strokeColor = str3;
        this.tracking = map;
    }

    public static /* synthetic */ StickyCellDTO copy$default(StickyCellDTO stickyCellDTO, CellDTO cellDTO, String str, CornerRadius cornerRadius, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = stickyCellDTO.cell;
        }
        if ((i11 & 2) != 0) {
            str = stickyCellDTO.shownKey;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = stickyCellDTO.cornerRadius;
        }
        if ((i11 & 8) != 0) {
            str2 = stickyCellDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            str3 = stickyCellDTO.strokeColor;
        }
        if ((i11 & 32) != 0) {
            map = stickyCellDTO.tracking;
        }
        String str4 = str3;
        Map map2 = map;
        return stickyCellDTO.copy(cellDTO, str, cornerRadius, str2, str4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShownKey() {
        return this.shownKey;
    }

    /* renamed from: component3, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.tracking;
    }

    @NotNull
    public final StickyCellDTO copy(@NotNull CellDTO cell, String shownKey, CornerRadius cornerRadius, String backgroundColor, String strokeColor, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new StickyCellDTO(cell, shownKey, cornerRadius, backgroundColor, strokeColor, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyCellDTO)) {
            return false;
        }
        StickyCellDTO stickyCellDTO = (StickyCellDTO) other;
        return Intrinsics.d(this.cell, stickyCellDTO.cell) && Intrinsics.d(this.shownKey, stickyCellDTO.shownKey) && this.cornerRadius == stickyCellDTO.cornerRadius && Intrinsics.d(this.backgroundColor, stickyCellDTO.backgroundColor) && Intrinsics.d(this.strokeColor, stickyCellDTO.strokeColor) && Intrinsics.d(this.tracking, stickyCellDTO.tracking);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getShownKey() {
        return this.shownKey;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        String str = this.shownKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode3 = (hashCode2 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.strokeColor;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        String str = this.shownKey;
        CornerRadius cornerRadius = this.cornerRadius;
        String str2 = this.backgroundColor;
        String str3 = this.strokeColor;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("StickyCellDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", shownKey=");
        sb2.append(str);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", backgroundColor=");
        sb2.append(str2);
        sb2.append(", strokeColor=");
        return C4070a.a(sb2, str3, ", tracking=", map, ")");
    }
}
