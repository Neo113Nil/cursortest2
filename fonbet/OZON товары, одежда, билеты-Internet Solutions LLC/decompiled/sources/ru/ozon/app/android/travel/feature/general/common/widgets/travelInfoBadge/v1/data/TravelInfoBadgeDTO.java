package ru.ozon.app.android.travel.feature.general.common.widgets.travelInfoBadge.v1.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelInfoBadge/v1/data/TravelInfoBadgeDTO;", "", "infoBadge", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;Ljava/util/Map;)V", "getInfoBadge", "()Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelInfoBadgeDTO {
    public static final int $stable = 8;

    @NotNull
    private final InfoBadgeDTO infoBadge;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TravelInfoBadgeDTO(@NotNull InfoBadgeDTO infoBadge, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(infoBadge, "infoBadge");
        this.infoBadge = infoBadge;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelInfoBadgeDTO copy$default(TravelInfoBadgeDTO travelInfoBadgeDTO, InfoBadgeDTO infoBadgeDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            infoBadgeDTO = travelInfoBadgeDTO.infoBadge;
        }
        if ((i11 & 2) != 0) {
            map = travelInfoBadgeDTO.trackingInfo;
        }
        return travelInfoBadgeDTO.copy(infoBadgeDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InfoBadgeDTO getInfoBadge() {
        return this.infoBadge;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelInfoBadgeDTO copy(@NotNull InfoBadgeDTO infoBadge, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(infoBadge, "infoBadge");
        return new TravelInfoBadgeDTO(infoBadge, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelInfoBadgeDTO)) {
            return false;
        }
        TravelInfoBadgeDTO travelInfoBadgeDTO = (TravelInfoBadgeDTO) other;
        return Intrinsics.d(this.infoBadge, travelInfoBadgeDTO.infoBadge) && Intrinsics.d(this.trackingInfo, travelInfoBadgeDTO.trackingInfo);
    }

    @NotNull
    public final InfoBadgeDTO getInfoBadge() {
        return this.infoBadge;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.infoBadge.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "TravelInfoBadgeDTO(infoBadge=" + this.infoBadge + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
