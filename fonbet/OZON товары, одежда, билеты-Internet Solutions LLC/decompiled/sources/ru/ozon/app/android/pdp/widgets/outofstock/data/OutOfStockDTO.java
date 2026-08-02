package ru.ozon.app.android.pdp.widgets.outofstock.data;

import Ak.C2436a;
import Fm.C3051a;
import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00017Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010%J\u0080\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0012HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;", "", "sku", "", "deeplink", "", "image", "price", "Lru/ozon/uni/atoms/data/price/Price;", "deliveryInfo", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "sellerInfo", "Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextSmall;", "trackingInfo", "Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO$TrackingInfo;", "params", "", "selectedDeliverySchema", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextSmall;Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO$TrackingInfo;Ljava/util/Map;Ljava/lang/Integer;)V", "getSku", "()J", "getDeeplink", "()Ljava/lang/String;", "getImage", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getDeliveryInfo", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSellerInfo", "()Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextSmall;", "getTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO$TrackingInfo;", "getParams", "()Ljava/util/Map;", "getSelectedDeliverySchema", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextSmall;Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO$TrackingInfo;Ljava/util/Map;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO;", "equals", "", "other", "hashCode", "toString", "TrackingInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OutOfStockDTO {
    public static final int $stable = 8;

    @NotNull
    private final String deeplink;
    private final TextAtom deliveryInfo;
    private final String image;
    private final Map<String, String> params;

    @NotNull
    private final Price price;
    private final Integer selectedDeliverySchema;
    private final CommonText.TextSmall sellerInfo;
    private final long sku;
    private final TrackingInfo trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/data/OutOfStockDTO$TrackingInfo;", "", "widget", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "addToCart", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getWidget", "()Ljava/util/Map;", "getAddToCart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingInfo {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> addToCart;
        private final Map<String, TokenizedTrackingInfo> widget;

        public TrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            this.widget = map;
            this.addToCart = map2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrackingInfo copy$default(TrackingInfo trackingInfo, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = trackingInfo.widget;
            }
            if ((i11 & 2) != 0) {
                map2 = trackingInfo.addToCart;
            }
            return trackingInfo.copy(map, map2);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.widget;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.addToCart;
        }

        @NotNull
        public final TrackingInfo copy(Map<String, TokenizedTrackingInfo> widget, Map<String, TokenizedTrackingInfo> addToCart) {
            return new TrackingInfo(widget, addToCart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingInfo)) {
                return false;
            }
            TrackingInfo trackingInfo = (TrackingInfo) other;
            return Intrinsics.d(this.widget, trackingInfo.widget) && Intrinsics.d(this.addToCart, trackingInfo.addToCart);
        }

        public final Map<String, TokenizedTrackingInfo> getAddToCart() {
            return this.addToCart;
        }

        public final Map<String, TokenizedTrackingInfo> getWidget() {
            return this.widget;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.widget;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.addToCart;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TrackingInfo(widget=" + this.widget + ", addToCart=" + this.addToCart + ")";
        }
    }

    public OutOfStockDTO(long j11, @NotNull String deeplink, String str, @NotNull Price price, TextAtom textAtom, CommonText.TextSmall textSmall, TrackingInfo trackingInfo, Map<String, String> map, Integer num) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(price, "price");
        this.sku = j11;
        this.deeplink = deeplink;
        this.image = str;
        this.price = price;
        this.deliveryInfo = textAtom;
        this.sellerInfo = textSmall;
        this.trackingInfo = trackingInfo;
        this.params = map;
        this.selectedDeliverySchema = num;
    }

    public static /* synthetic */ OutOfStockDTO copy$default(OutOfStockDTO outOfStockDTO, long j11, String str, String str2, Price price, TextAtom textAtom, CommonText.TextSmall textSmall, TrackingInfo trackingInfo, Map map, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = outOfStockDTO.sku;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = outOfStockDTO.deeplink;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = outOfStockDTO.image;
        }
        return outOfStockDTO.copy(j12, str3, str2, (i11 & 8) != 0 ? outOfStockDTO.price : price, (i11 & 16) != 0 ? outOfStockDTO.deliveryInfo : textAtom, (i11 & 32) != 0 ? outOfStockDTO.sellerInfo : textSmall, (i11 & 64) != 0 ? outOfStockDTO.trackingInfo : trackingInfo, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? outOfStockDTO.params : map, (i11 & 256) != 0 ? outOfStockDTO.selectedDeliverySchema : num);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getDeliveryInfo() {
        return this.deliveryInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonText.TextSmall getSellerInfo() {
        return this.sellerInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, String> component8() {
        return this.params;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    @NotNull
    public final OutOfStockDTO copy(long sku, @NotNull String deeplink, String image, @NotNull Price price, TextAtom deliveryInfo, CommonText.TextSmall sellerInfo, TrackingInfo trackingInfo, Map<String, String> params, Integer selectedDeliverySchema) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(price, "price");
        return new OutOfStockDTO(sku, deeplink, image, price, deliveryInfo, sellerInfo, trackingInfo, params, selectedDeliverySchema);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutOfStockDTO)) {
            return false;
        }
        OutOfStockDTO outOfStockDTO = (OutOfStockDTO) other;
        return this.sku == outOfStockDTO.sku && Intrinsics.d(this.deeplink, outOfStockDTO.deeplink) && Intrinsics.d(this.image, outOfStockDTO.image) && Intrinsics.d(this.price, outOfStockDTO.price) && Intrinsics.d(this.deliveryInfo, outOfStockDTO.deliveryInfo) && Intrinsics.d(this.sellerInfo, outOfStockDTO.sellerInfo) && Intrinsics.d(this.trackingInfo, outOfStockDTO.trackingInfo) && Intrinsics.d(this.params, outOfStockDTO.params) && Intrinsics.d(this.selectedDeliverySchema, outOfStockDTO.selectedDeliverySchema);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final TextAtom getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final String getImage() {
        return this.image;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public final Integer getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public final CommonText.TextSmall getSellerInfo() {
        return this.sellerInfo;
    }

    public final long getSku() {
        return this.sku;
    }

    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.sku) * 31, 31, this.deeplink);
        String str = this.image;
        int a12 = C3051a.a(this.price, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
        TextAtom textAtom = this.deliveryInfo;
        int hashCode = (a12 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        CommonText.TextSmall textSmall = this.sellerInfo;
        int hashCode2 = (hashCode + (textSmall == null ? 0 : textSmall.hashCode())) * 31;
        TrackingInfo trackingInfo = this.trackingInfo;
        int hashCode3 = (hashCode2 + (trackingInfo == null ? 0 : trackingInfo.hashCode())) * 31;
        Map<String, String> map = this.params;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.selectedDeliverySchema;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.sku;
        String str = this.deeplink;
        String str2 = this.image;
        Price price = this.price;
        TextAtom textAtom = this.deliveryInfo;
        CommonText.TextSmall textSmall = this.sellerInfo;
        TrackingInfo trackingInfo = this.trackingInfo;
        Map<String, String> map = this.params;
        Integer num = this.selectedDeliverySchema;
        StringBuilder c11 = C2436a.c(j11, "OutOfStockDTO(sku=", ", deeplink=", str);
        c11.append(", image=");
        c11.append(str2);
        c11.append(", price=");
        c11.append(price);
        c11.append(", deliveryInfo=");
        c11.append(textAtom);
        c11.append(", sellerInfo=");
        c11.append(textSmall);
        c11.append(", trackingInfo=");
        c11.append(trackingInfo);
        c11.append(", params=");
        c11.append(map);
        c11.append(", selectedDeliverySchema=");
        c11.append(num);
        c11.append(")");
        return c11.toString();
    }
}
