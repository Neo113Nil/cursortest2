package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.data;

import B90.C2616s;
import B90.C2619v;
import Bi.b;
import HY.a;
import Hj.C3143a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jk\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "images", "", "", "infoCards", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO$InfoCardDTO;", ResultDTO.CONTENT_TYPE_SERVICES, "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getImages", "()Ljava/util/List;", "getInfoCards", "getServices", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "InfoCardDTO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsRoomsDetailsFullDTO {
    public static final int $stable = 8;
    private final List<String> images;
    private final List<InfoCardDTO> infoCards;
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> services;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/data/HotelsRoomsDetailsFullDTO$InfoCardDTO;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "infoKey", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "infoValue", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getInfoKey", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfoValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoCardDTO {
        public static final int $stable = TextAtom.$stable | Icon.$stable;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom infoKey;

        @NotNull
        private final TextAtom infoValue;

        public InfoCardDTO(@NotNull Icon icon, @NotNull TextAtom infoKey, @NotNull TextAtom infoValue) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(infoKey, "infoKey");
            Intrinsics.checkNotNullParameter(infoValue, "infoValue");
            this.icon = icon;
            this.infoKey = infoKey;
            this.infoValue = infoValue;
        }

        public static /* synthetic */ InfoCardDTO copy$default(InfoCardDTO infoCardDTO, Icon icon, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = infoCardDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = infoCardDTO.infoKey;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = infoCardDTO.infoValue;
            }
            return infoCardDTO.copy(icon, textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getInfoKey() {
            return this.infoKey;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getInfoValue() {
            return this.infoValue;
        }

        @NotNull
        public final InfoCardDTO copy(@NotNull Icon icon, @NotNull TextAtom infoKey, @NotNull TextAtom infoValue) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(infoKey, "infoKey");
            Intrinsics.checkNotNullParameter(infoValue, "infoValue");
            return new InfoCardDTO(icon, infoKey, infoValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoCardDTO)) {
                return false;
            }
            InfoCardDTO infoCardDTO = (InfoCardDTO) other;
            return Intrinsics.d(this.icon, infoCardDTO.icon) && Intrinsics.d(this.infoKey, infoCardDTO.infoKey) && Intrinsics.d(this.infoValue, infoCardDTO.infoValue);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getInfoKey() {
            return this.infoKey;
        }

        @NotNull
        public final TextAtom getInfoValue() {
            return this.infoValue;
        }

        public int hashCode() {
            return this.infoValue.hashCode() + C2619v.b(this.icon.hashCode() * 31, 31, this.infoKey);
        }

        @NotNull
        public String toString() {
            Icon icon = this.icon;
            TextAtom textAtom = this.infoKey;
            TextAtom textAtom2 = this.infoValue;
            StringBuilder sb2 = new StringBuilder("InfoCardDTO(icon=");
            sb2.append(icon);
            sb2.append(", infoKey=");
            sb2.append(textAtom);
            sb2.append(", infoValue=");
            return b.g(sb2, textAtom2, ")");
        }
    }

    public HotelsRoomsDetailsFullDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, List<String> list, List<InfoCardDTO> list2, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list3, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.images = list;
        this.infoCards = list2;
        this.services = list3;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HotelsRoomsDetailsFullDTO copy$default(HotelsRoomsDetailsFullDTO hotelsRoomsDetailsFullDTO, TextAtom textAtom, TextAtom textAtom2, List list, List list2, List list3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = hotelsRoomsDetailsFullDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = hotelsRoomsDetailsFullDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = hotelsRoomsDetailsFullDTO.images;
        }
        if ((i11 & 8) != 0) {
            list2 = hotelsRoomsDetailsFullDTO.infoCards;
        }
        if ((i11 & 16) != 0) {
            list3 = hotelsRoomsDetailsFullDTO.services;
        }
        if ((i11 & 32) != 0) {
            map = hotelsRoomsDetailsFullDTO.trackingInfo;
        }
        List list4 = list3;
        Map map2 = map;
        return hotelsRoomsDetailsFullDTO.copy(textAtom, textAtom2, list, list2, list4, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final List<String> component3() {
        return this.images;
    }

    public final List<InfoCardDTO> component4() {
        return this.infoCards;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> component5() {
        return this.services;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsRoomsDetailsFullDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, List<String> images, List<InfoCardDTO> infoCards, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> services, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new HotelsRoomsDetailsFullDTO(title, subtitle, images, infoCards, services, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsRoomsDetailsFullDTO)) {
            return false;
        }
        HotelsRoomsDetailsFullDTO hotelsRoomsDetailsFullDTO = (HotelsRoomsDetailsFullDTO) other;
        return Intrinsics.d(this.title, hotelsRoomsDetailsFullDTO.title) && Intrinsics.d(this.subtitle, hotelsRoomsDetailsFullDTO.subtitle) && Intrinsics.d(this.images, hotelsRoomsDetailsFullDTO.images) && Intrinsics.d(this.infoCards, hotelsRoomsDetailsFullDTO.infoCards) && Intrinsics.d(this.services, hotelsRoomsDetailsFullDTO.services) && Intrinsics.d(this.trackingInfo, hotelsRoomsDetailsFullDTO.trackingInfo);
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final List<InfoCardDTO> getInfoCards() {
        return this.infoCards;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> getServices() {
        return this.services;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.subtitle);
        List<String> list = this.images;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        List<InfoCardDTO> list2 = this.infoCards;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list3 = this.services;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<String> list = this.images;
        List<InfoCardDTO> list2 = this.infoCards;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list3 = this.services;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("HotelsRoomsDetailsFullDTO(title=", textAtom, ", subtitle=", textAtom2, ", images=");
        C2616s.g(", infoCards=", ", services=", a11, list, list2);
        return C3143a.h(a11, list3, ", trackingInfo=", map, ")");
    }
}
