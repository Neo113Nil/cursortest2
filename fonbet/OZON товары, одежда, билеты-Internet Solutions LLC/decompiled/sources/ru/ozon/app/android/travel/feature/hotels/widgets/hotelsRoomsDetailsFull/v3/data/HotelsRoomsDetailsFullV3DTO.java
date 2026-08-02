package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.data;

import G.g;
import Hj.C3143a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.iconWithText.v3.IconWithTextV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jc\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/data/HotelsRoomsDetailsFullV3DTO;", "", "images", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "subtitle", "infoCards", "Lru/ozon/app/android/travel/molecules/dto/iconWithText/v3/IconWithTextV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;)V", "getImages", "()Ljava/util/List;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubtitle", "getInfoCards", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsRoomsDetailsFullV3DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<String> images;

    @NotNull
    private final List<IconWithTextV3DTO> infoCards;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final BadgeDTO titleBadge;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HotelsRoomsDetailsFullV3DTO(@NotNull List<String> images, @NotNull TextDTO title, BadgeDTO badgeDTO, TextDTO textDTO, @NotNull List<IconWithTextV3DTO> infoCards, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoCards, "infoCards");
        this.images = images;
        this.title = title;
        this.titleBadge = badgeDTO;
        this.subtitle = textDTO;
        this.infoCards = infoCards;
        this.trackingInfo = map;
    }

    public static /* synthetic */ HotelsRoomsDetailsFullV3DTO copy$default(HotelsRoomsDetailsFullV3DTO hotelsRoomsDetailsFullV3DTO, List list, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsRoomsDetailsFullV3DTO.images;
        }
        if ((i11 & 2) != 0) {
            textDTO = hotelsRoomsDetailsFullV3DTO.title;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = hotelsRoomsDetailsFullV3DTO.titleBadge;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = hotelsRoomsDetailsFullV3DTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            list2 = hotelsRoomsDetailsFullV3DTO.infoCards;
        }
        if ((i11 & 32) != 0) {
            map = hotelsRoomsDetailsFullV3DTO.trackingInfo;
        }
        List list3 = list2;
        Map map2 = map;
        return hotelsRoomsDetailsFullV3DTO.copy(list, textDTO, badgeDTO, textDTO2, list3, map2);
    }

    @NotNull
    public final List<String> component1() {
        return this.images;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getTitleBadge() {
        return this.titleBadge;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<IconWithTextV3DTO> component5() {
        return this.infoCards;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsRoomsDetailsFullV3DTO copy(@NotNull List<String> images, @NotNull TextDTO title, BadgeDTO titleBadge, TextDTO subtitle, @NotNull List<IconWithTextV3DTO> infoCards, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoCards, "infoCards");
        return new HotelsRoomsDetailsFullV3DTO(images, title, titleBadge, subtitle, infoCards, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsRoomsDetailsFullV3DTO)) {
            return false;
        }
        HotelsRoomsDetailsFullV3DTO hotelsRoomsDetailsFullV3DTO = (HotelsRoomsDetailsFullV3DTO) other;
        return Intrinsics.d(this.images, hotelsRoomsDetailsFullV3DTO.images) && Intrinsics.d(this.title, hotelsRoomsDetailsFullV3DTO.title) && Intrinsics.d(this.titleBadge, hotelsRoomsDetailsFullV3DTO.titleBadge) && Intrinsics.d(this.subtitle, hotelsRoomsDetailsFullV3DTO.subtitle) && Intrinsics.d(this.infoCards, hotelsRoomsDetailsFullV3DTO.infoCards) && Intrinsics.d(this.trackingInfo, hotelsRoomsDetailsFullV3DTO.trackingInfo);
    }

    @NotNull
    public final List<String> getImages() {
        return this.images;
    }

    @NotNull
    public final List<IconWithTextV3DTO> getInfoCards() {
        return this.infoCards;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final BadgeDTO getTitleBadge() {
        return this.titleBadge;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.title, this.images.hashCode() * 31, 31);
        BadgeDTO badgeDTO = this.titleBadge;
        int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.infoCards);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<String> list = this.images;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.titleBadge;
        TextDTO textDTO2 = this.subtitle;
        List<IconWithTextV3DTO> list2 = this.infoCards;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HotelsRoomsDetailsFullV3DTO(images=");
        sb2.append(list);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", titleBadge=");
        sb2.append(badgeDTO);
        sb2.append(", subtitle=");
        sb2.append(textDTO2);
        sb2.append(", infoCards=");
        return C3143a.h(sb2, list2, ", trackingInfo=", map, ")");
    }

    public HotelsRoomsDetailsFullV3DTO(List list, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, List list2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, textDTO, badgeDTO, textDTO2, (i11 & 16) != 0 ? K.f71697a : list2, map);
    }
}
