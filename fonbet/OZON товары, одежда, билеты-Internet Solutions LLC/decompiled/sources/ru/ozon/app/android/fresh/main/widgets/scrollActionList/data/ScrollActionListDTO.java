package ru.ozon.app.android.fresh.main.widgets.scrollActionList.data;

import B3.p;
import GR.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListDTO;", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "", "paddings", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListDTO$PaddingsDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListDTO$PaddingsDTO;Ljava/util/Map;)V", "getBadges", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListDTO$PaddingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PaddingsDTO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ScrollActionListDTO {
    private final String backgroundColor;

    @NotNull
    private final List<BadgeDTO> badges;

    @NotNull
    private final PaddingsDTO paddings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListDTO$PaddingsDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontal", "bottom", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontal", "getBottom", "getBetween", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {
        private final Paddings between;
        private final Paddings bottom;
        private final Paddings horizontal;
        private final Paddings top;

        public PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.top = paddings;
            this.horizontal = paddings2;
            this.bottom = paddings3;
            this.between = paddings4;
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.horizontal;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.bottom;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.between;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final PaddingsDTO copy(Paddings top, Paddings horizontal, Paddings bottom, Paddings between) {
            return new PaddingsDTO(top, horizontal, bottom, between);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.top == paddingsDTO.top && this.horizontal == paddingsDTO.horizontal && this.bottom == paddingsDTO.bottom && this.between == paddingsDTO.between;
        }

        public final Paddings getBetween() {
            return this.between;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.top;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.horizontal;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.bottom;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.between;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.horizontal;
            return b.e(p.b("PaddingsDTO(top=", paddings, ", horizontal=", paddings2, ", bottom="), this.bottom, ", between=", this.between, ")");
        }
    }

    public ScrollActionListDTO(@NotNull List<BadgeDTO> badges, String str, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.badges = badges;
        this.backgroundColor = str;
        this.paddings = paddings;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScrollActionListDTO copy$default(ScrollActionListDTO scrollActionListDTO, List list, String str, PaddingsDTO paddingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = scrollActionListDTO.badges;
        }
        if ((i11 & 2) != 0) {
            str = scrollActionListDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            paddingsDTO = scrollActionListDTO.paddings;
        }
        if ((i11 & 8) != 0) {
            map = scrollActionListDTO.trackingInfo;
        }
        return scrollActionListDTO.copy(list, str, paddingsDTO, map);
    }

    @NotNull
    public final List<BadgeDTO> component1() {
        return this.badges;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ScrollActionListDTO copy(@NotNull List<BadgeDTO> badges, String backgroundColor, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new ScrollActionListDTO(badges, backgroundColor, paddings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollActionListDTO)) {
            return false;
        }
        ScrollActionListDTO scrollActionListDTO = (ScrollActionListDTO) other;
        return Intrinsics.d(this.badges, scrollActionListDTO.badges) && Intrinsics.d(this.backgroundColor, scrollActionListDTO.backgroundColor) && Intrinsics.d(this.paddings, scrollActionListDTO.paddings) && Intrinsics.d(this.trackingInfo, scrollActionListDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    @NotNull
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.badges.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.paddings.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BadgeDTO> list = this.badges;
        String str = this.backgroundColor;
        PaddingsDTO paddingsDTO = this.paddings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("ScrollActionListDTO(badges=", ", backgroundColor=", str, ", paddings=", list);
        a11.append(paddingsDTO);
        a11.append(", trackingInfo=");
        a11.append(map);
        a11.append(")");
        return a11.toString();
    }
}
