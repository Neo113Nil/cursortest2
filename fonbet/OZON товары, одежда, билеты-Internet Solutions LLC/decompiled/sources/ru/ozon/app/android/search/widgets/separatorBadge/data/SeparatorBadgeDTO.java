package ru.ozon.app.android.search.widgets.separatorBadge.data;

import B90.C2618u;
import GR.b;
import Lh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001+BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "", "horizontalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "separator", "Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;Ljava/util/Map;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "getBottomPadding", "getSeparator", "()Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SeparatorSettingsDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SeparatorBadgeDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final Paddings horizontalPadding;
    private final SeparatorSettingsDTO separator;

    @NotNull
    private final Paddings topPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;", "", "color", "", "height", "", "<init>", "(Ljava/lang/String;I)V", "getColor", "()Ljava/lang/String;", "getHeight", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorSettingsDTO {
        public static final int $stable = 0;

        @NotNull
        private final String color;
        private final int height;

        public SeparatorSettingsDTO(@NotNull String color, int i11) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            this.height = i11;
        }

        public static /* synthetic */ SeparatorSettingsDTO copy$default(SeparatorSettingsDTO separatorSettingsDTO, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = separatorSettingsDTO.color;
            }
            if ((i12 & 2) != 0) {
                i11 = separatorSettingsDTO.height;
            }
            return separatorSettingsDTO.copy(str, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final SeparatorSettingsDTO copy(@NotNull String color, int height) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new SeparatorSettingsDTO(color, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorSettingsDTO)) {
                return false;
            }
            SeparatorSettingsDTO separatorSettingsDTO = (SeparatorSettingsDTO) other;
            return Intrinsics.d(this.color, separatorSettingsDTO.color) && this.height == separatorSettingsDTO.height;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final int getHeight() {
            return this.height;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (this.color.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.height, "SeparatorSettingsDTO(color=", this.color, ", height=", ")");
        }
    }

    public SeparatorBadgeDTO(@NotNull BadgeDTO badge, String str, @NotNull Paddings horizontalPadding, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, SeparatorSettingsDTO separatorSettingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.badge = badge;
        this.backgroundColor = str;
        this.horizontalPadding = horizontalPadding;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.separator = separatorSettingsDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SeparatorBadgeDTO copy$default(SeparatorBadgeDTO separatorBadgeDTO, BadgeDTO badgeDTO, String str, Paddings paddings, Paddings paddings2, Paddings paddings3, SeparatorSettingsDTO separatorSettingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeDTO = separatorBadgeDTO.badge;
        }
        if ((i11 & 2) != 0) {
            str = separatorBadgeDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            paddings = separatorBadgeDTO.horizontalPadding;
        }
        if ((i11 & 8) != 0) {
            paddings2 = separatorBadgeDTO.topPadding;
        }
        if ((i11 & 16) != 0) {
            paddings3 = separatorBadgeDTO.bottomPadding;
        }
        if ((i11 & 32) != 0) {
            separatorSettingsDTO = separatorBadgeDTO.separator;
        }
        if ((i11 & 64) != 0) {
            map = separatorBadgeDTO.trackingInfo;
        }
        SeparatorSettingsDTO separatorSettingsDTO2 = separatorSettingsDTO;
        Map map2 = map;
        Paddings paddings4 = paddings3;
        Paddings paddings5 = paddings;
        return separatorBadgeDTO.copy(badgeDTO, str, paddings5, paddings2, paddings4, separatorSettingsDTO2, map2);
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
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component6, reason: from getter */
    public final SeparatorSettingsDTO getSeparator() {
        return this.separator;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final SeparatorBadgeDTO copy(@NotNull BadgeDTO badge, String backgroundColor, @NotNull Paddings horizontalPadding, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, SeparatorSettingsDTO separator, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        return new SeparatorBadgeDTO(badge, backgroundColor, horizontalPadding, topPadding, bottomPadding, separator, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorBadgeDTO)) {
            return false;
        }
        SeparatorBadgeDTO separatorBadgeDTO = (SeparatorBadgeDTO) other;
        return Intrinsics.d(this.badge, separatorBadgeDTO.badge) && Intrinsics.d(this.backgroundColor, separatorBadgeDTO.backgroundColor) && this.horizontalPadding == separatorBadgeDTO.horizontalPadding && this.topPadding == separatorBadgeDTO.topPadding && this.bottomPadding == separatorBadgeDTO.bottomPadding && Intrinsics.d(this.separator, separatorBadgeDTO.separator) && Intrinsics.d(this.trackingInfo, separatorBadgeDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final SeparatorSettingsDTO getSeparator() {
        return this.separator;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.badge.hashCode() * 31;
        String str = this.backgroundColor;
        int b11 = b.b(this.bottomPadding, b.b(this.topPadding, b.b(this.horizontalPadding, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        SeparatorSettingsDTO separatorSettingsDTO = this.separator;
        int hashCode2 = (b11 + (separatorSettingsDTO == null ? 0 : separatorSettingsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BadgeDTO badgeDTO = this.badge;
        String str = this.backgroundColor;
        Paddings paddings = this.horizontalPadding;
        Paddings paddings2 = this.topPadding;
        Paddings paddings3 = this.bottomPadding;
        SeparatorSettingsDTO separatorSettingsDTO = this.separator;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SeparatorBadgeDTO(badge=");
        sb2.append(badgeDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", horizontalPadding=");
        a.e(sb2, paddings, ", topPadding=", paddings2, ", bottomPadding=");
        sb2.append(paddings3);
        sb2.append(", separator=");
        sb2.append(separatorSettingsDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ SeparatorBadgeDTO(BadgeDTO badgeDTO, String str, Paddings paddings, Paddings paddings2, Paddings paddings3, SeparatorSettingsDTO separatorSettingsDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(badgeDTO, str, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 8) != 0 ? Paddings.NONE : paddings2, (i11 & 16) != 0 ? Paddings.NONE : paddings3, separatorSettingsDTO, map);
    }
}
