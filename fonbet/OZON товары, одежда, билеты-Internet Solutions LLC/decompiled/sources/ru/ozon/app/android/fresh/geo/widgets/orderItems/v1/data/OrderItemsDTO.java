package ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.data;

import B90.C2619v;
import G.g;
import Ih.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/data/OrderItemsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "items", "", "Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/data/OrderItemsDTO$Item;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderItemsDTO {

    @NotNull
    private final List<Item> items;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/data/OrderItemsDTO$Item;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "totalPrice", "priceDetails", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "image", "", "favoriteProduct", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/Map;)V", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTotalPrice", "getPriceDetails", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getImage", "()Ljava/lang/String;", "getFavoriteProduct", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {

        @NotNull
        private final AtomActionDTO action;
        private final Badge badge;

        @NotNull
        private final FavoriteProductMolecule favoriteProduct;

        @NotNull
        private final String image;

        @NotNull
        private final TextAtom name;
        private final TextAtom priceDetails;

        @NotNull
        private final TextAtom totalPrice;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Item(@NotNull TextAtom name, @NotNull TextAtom totalPrice, TextAtom textAtom, @NotNull AtomActionDTO action, @NotNull String image, @NotNull FavoriteProductMolecule favoriteProduct, Badge badge, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
            this.name = name;
            this.totalPrice = totalPrice;
            this.priceDetails = textAtom;
            this.action = action;
            this.image = image;
            this.favoriteProduct = favoriteProduct;
            this.badge = badge;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Item copy$default(Item item, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, AtomActionDTO atomActionDTO, String str, FavoriteProductMolecule favoriteProductMolecule, Badge badge, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = item.name;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = item.totalPrice;
            }
            if ((i11 & 4) != 0) {
                textAtom3 = item.priceDetails;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = item.action;
            }
            if ((i11 & 16) != 0) {
                str = item.image;
            }
            if ((i11 & 32) != 0) {
                favoriteProductMolecule = item.favoriteProduct;
            }
            if ((i11 & 64) != 0) {
                badge = item.badge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = item.trackingInfo;
            }
            Badge badge2 = badge;
            Map map2 = map;
            String str2 = str;
            FavoriteProductMolecule favoriteProductMolecule2 = favoriteProductMolecule;
            return item.copy(textAtom, textAtom2, textAtom3, atomActionDTO, str2, favoriteProductMolecule2, badge2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getPriceDetails() {
            return this.priceDetails;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final FavoriteProductMolecule getFavoriteProduct() {
            return this.favoriteProduct;
        }

        /* renamed from: component7, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final Item copy(@NotNull TextAtom name, @NotNull TextAtom totalPrice, TextAtom priceDetails, @NotNull AtomActionDTO action, @NotNull String image, @NotNull FavoriteProductMolecule favoriteProduct, Badge badge, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
            return new Item(name, totalPrice, priceDetails, action, image, favoriteProduct, badge, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.name, item.name) && Intrinsics.d(this.totalPrice, item.totalPrice) && Intrinsics.d(this.priceDetails, item.priceDetails) && Intrinsics.d(this.action, item.action) && Intrinsics.d(this.image, item.image) && Intrinsics.d(this.favoriteProduct, item.favoriteProduct) && Intrinsics.d(this.badge, item.badge) && Intrinsics.d(this.trackingInfo, item.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final FavoriteProductMolecule getFavoriteProduct() {
            return this.favoriteProduct;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        public final TextAtom getPriceDetails() {
            return this.priceDetails;
        }

        @NotNull
        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.name.hashCode() * 31, 31, this.totalPrice);
            TextAtom textAtom = this.priceDetails;
            int hashCode = (this.favoriteProduct.hashCode() + g.a(a.b(this.action, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31, this.image)) * 31;
            Badge badge = this.badge;
            int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.name;
            TextAtom textAtom2 = this.totalPrice;
            TextAtom textAtom3 = this.priceDetails;
            AtomActionDTO atomActionDTO = this.action;
            String str = this.image;
            FavoriteProductMolecule favoriteProductMolecule = this.favoriteProduct;
            Badge badge = this.badge;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = HY.a.a("Item(name=", textAtom, ", totalPrice=", textAtom2, ", priceDetails=");
            a11.append(textAtom3);
            a11.append(", action=");
            a11.append(atomActionDTO);
            a11.append(", image=");
            a11.append(str);
            a11.append(", favoriteProduct=");
            a11.append(favoriteProductMolecule);
            a11.append(", badge=");
            a11.append(badge);
            a11.append(", trackingInfo=");
            a11.append(map);
            a11.append(")");
            return a11.toString();
        }
    }

    public OrderItemsDTO(@NotNull TextAtom title, @NotNull List<Item> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.items = items;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderItemsDTO copy$default(OrderItemsDTO orderItemsDTO, TextAtom textAtom, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = orderItemsDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = orderItemsDTO.items;
        }
        if ((i11 & 4) != 0) {
            map = orderItemsDTO.trackingInfo;
        }
        return orderItemsDTO.copy(textAtom, list, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Item> component2() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderItemsDTO copy(@NotNull TextAtom title, @NotNull List<Item> items, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new OrderItemsDTO(title, items, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderItemsDTO)) {
            return false;
        }
        OrderItemsDTO orderItemsDTO = (OrderItemsDTO) other;
        return Intrinsics.d(this.title, orderItemsDTO.title) && Intrinsics.d(this.items, orderItemsDTO.items) && Intrinsics.d(this.trackingInfo, orderItemsDTO.trackingInfo);
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.items);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        List<Item> list = this.items;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("OrderItemsDTO(title=");
        sb2.append(textAtom);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
