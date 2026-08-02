package ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.data;

import Ef0.c;
import Ep.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/data/SeparatorBadgeDTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "", "horizontalPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "bottomPadding", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/Map;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopPadding", "getBottomPadding", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SeparatorBadgeDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;

    @NotNull
    private final CommonCellSettings.LayoutPadding bottomPadding;

    @NotNull
    private final CommonCellSettings.LayoutPadding horizontalPadding;

    @NotNull
    private final CommonCellSettings.LayoutPadding topPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SeparatorBadgeDTO(@NotNull BadgeDTO badge, String str, @NotNull CommonCellSettings.LayoutPadding horizontalPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding bottomPadding, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.badge = badge;
        this.backgroundColor = str;
        this.horizontalPadding = horizontalPadding;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SeparatorBadgeDTO copy$default(SeparatorBadgeDTO separatorBadgeDTO, BadgeDTO badgeDTO, String str, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeDTO = separatorBadgeDTO.badge;
        }
        if ((i11 & 2) != 0) {
            str = separatorBadgeDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            layoutPadding = separatorBadgeDTO.horizontalPadding;
        }
        if ((i11 & 8) != 0) {
            layoutPadding2 = separatorBadgeDTO.topPadding;
        }
        if ((i11 & 16) != 0) {
            layoutPadding3 = separatorBadgeDTO.bottomPadding;
        }
        if ((i11 & 32) != 0) {
            map = separatorBadgeDTO.trackingInfo;
        }
        CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding3;
        Map map2 = map;
        return separatorBadgeDTO.copy(badgeDTO, str, layoutPadding, layoutPadding2, layoutPadding4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final SeparatorBadgeDTO copy(@NotNull BadgeDTO badge, String backgroundColor, @NotNull CommonCellSettings.LayoutPadding horizontalPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding bottomPadding, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        return new SeparatorBadgeDTO(badge, backgroundColor, horizontalPadding, topPadding, bottomPadding, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorBadgeDTO)) {
            return false;
        }
        SeparatorBadgeDTO separatorBadgeDTO = (SeparatorBadgeDTO) other;
        return Intrinsics.d(this.badge, separatorBadgeDTO.badge) && Intrinsics.d(this.backgroundColor, separatorBadgeDTO.backgroundColor) && this.horizontalPadding == separatorBadgeDTO.horizontalPadding && this.topPadding == separatorBadgeDTO.topPadding && this.bottomPadding == separatorBadgeDTO.bottomPadding && Intrinsics.d(this.trackingInfo, separatorBadgeDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.badge.hashCode() * 31;
        String str = this.backgroundColor;
        int a11 = c.a(this.bottomPadding, c.a(this.topPadding, c.a(this.horizontalPadding, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.topPadding;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.bottomPadding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SeparatorBadgeDTO(badge=");
        sb2.append(badgeDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", horizontalPadding=");
        a.f(sb2, layoutPadding, ", topPadding=", layoutPadding2, ", bottomPadding=");
        sb2.append(layoutPadding3);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ SeparatorBadgeDTO(BadgeDTO badgeDTO, String str, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(badgeDTO, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.PADDING_500 : layoutPadding, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & 32) != 0 ? null : map);
    }
}
