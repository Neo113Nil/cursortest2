package ru.ozon.android.messenger.blocks.courierheader.data;

import K1.G;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/android/messenger/blocks/courierheader/data/CourierHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "items", "", "Lru/ozon/android/messenger/blocks/courierheader/data/CourierHeaderDTO$Item;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CourierHeaderDTO {
    public static final int $stable = 8;
    private final List<Item> items;
    private final TextDTO title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JW\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/android/messenger/blocks/courierheader/data/CourierHeaderDTO$Item;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "elems", "", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getElems", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final BadgeDTO badge;
        private final List<ProductMediaDTO> elems;
        private final TextDTO title;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public Item(TextDTO textDTO, List<ProductMediaDTO> list, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Map<String, MessengerTrackingInfo> map) {
            this.title = textDTO;
            this.elems = list;
            this.action = atomActionDTO;
            this.badge = badgeDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Item copy$default(Item item, TextDTO textDTO, List list, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = item.title;
            }
            if ((i11 & 2) != 0) {
                list = item.elems;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = item.action;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = item.badge;
            }
            if ((i11 & 16) != 0) {
                map = item.trackingInfo;
            }
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return item.copy(textDTO, list, atomActionDTO2, badgeDTO, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        public final List<ProductMediaDTO> component2() {
            return this.elems;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final Map<String, MessengerTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final Item copy(TextDTO title, List<ProductMediaDTO> elems, AtomActionDTO action, BadgeDTO badge, Map<String, MessengerTrackingInfo> trackingInfo) {
            return new Item(title, elems, action, badge, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.title, item.title) && Intrinsics.d(this.elems, item.elems) && Intrinsics.d(this.action, item.action) && Intrinsics.d(this.badge, item.badge) && Intrinsics.d(this.trackingInfo, item.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final List<ProductMediaDTO> getElems() {
            return this.elems;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            List<ProductMediaDTO> list = this.elems;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<ProductMediaDTO> list = this.elems;
            AtomActionDTO atomActionDTO = this.action;
            BadgeDTO badgeDTO = this.badge;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            StringBuilder e11 = G.e("Item(title=", textDTO, ", elems=", list, ", action=");
            e11.append(atomActionDTO);
            e11.append(", badge=");
            e11.append(badgeDTO);
            e11.append(", trackingInfo=");
            return P.f(e11, map, ")");
        }
    }

    public CourierHeaderDTO(TextDTO textDTO, List<Item> list, Map<String, MessengerTrackingInfo> map) {
        this.title = textDTO;
        this.items = list;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourierHeaderDTO copy$default(CourierHeaderDTO courierHeaderDTO, TextDTO textDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = courierHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = courierHeaderDTO.items;
        }
        if ((i11 & 4) != 0) {
            map = courierHeaderDTO.trackingInfo;
        }
        return courierHeaderDTO.copy(textDTO, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final List<Item> component2() {
        return this.items;
    }

    public final Map<String, MessengerTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final CourierHeaderDTO copy(TextDTO title, List<Item> items, Map<String, MessengerTrackingInfo> trackingInfo) {
        return new CourierHeaderDTO(title, items, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourierHeaderDTO)) {
            return false;
        }
        CourierHeaderDTO courierHeaderDTO = (CourierHeaderDTO) other;
        return Intrinsics.d(this.title, courierHeaderDTO.title) && Intrinsics.d(this.items, courierHeaderDTO.items) && Intrinsics.d(this.trackingInfo, courierHeaderDTO.trackingInfo);
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        List<Item> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<Item> list = this.items;
        return P.f(G.e("CourierHeaderDTO(title=", textDTO, ", items=", list, ", trackingInfo="), this.trackingInfo, ")");
    }

    public /* synthetic */ CourierHeaderDTO(TextDTO textDTO, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, list, (i11 & 4) != 0 ? null : map);
    }
}
