package ru.ozon.app.android.ugc.widgets.reviewFiltersButton.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFiltersButton/data/ReviewFiltersButtonDTO;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/Map;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFiltersButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewFiltersButtonDTO(@NotNull IconButtonV3DTO iconButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.iconButton = iconButton;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewFiltersButtonDTO copy$default(ReviewFiltersButtonDTO reviewFiltersButtonDTO, IconButtonV3DTO iconButtonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = reviewFiltersButtonDTO.iconButton;
        }
        if ((i11 & 2) != 0) {
            map = reviewFiltersButtonDTO.trackingInfo;
        }
        return reviewFiltersButtonDTO.copy(iconButtonV3DTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewFiltersButtonDTO copy(@NotNull IconButtonV3DTO iconButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new ReviewFiltersButtonDTO(iconButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFiltersButtonDTO)) {
            return false;
        }
        ReviewFiltersButtonDTO reviewFiltersButtonDTO = (ReviewFiltersButtonDTO) other;
        return Intrinsics.d(this.iconButton, reviewFiltersButtonDTO.iconButton) && Intrinsics.d(this.trackingInfo, reviewFiltersButtonDTO.trackingInfo);
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.iconButton.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "ReviewFiltersButtonDTO(iconButton=" + this.iconButton + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
