package ru.ozon.app.android.marketing.widgets.sellerCarousel.data;

import AZ.c;
import Ak.C2436a;
import B4.V;
import G.g;
import Kk.C3532b;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.rating.RatingBadgeAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO;", "", "items", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SellerDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SellerDTO> items;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001:\u0001AB\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003Jª\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0007HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\u0010\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006B"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "productsCount", "", "subtitle", "logoImage", "deeplink", "items", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;", "isFavorite", "", "isPremium", "premiumIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "ratingBadge", "Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;Ljava/util/Map;)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "getProductsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubtitle", "getLogoImage", "getDeeplink", "getItems", "()Ljava/util/List;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPremiumIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingBadge", "()Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;Ljava/util/Map;)Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;", "equals", "other", "hashCode", "toString", "ProductDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SellerDTO {
        public static final int $stable = 8;

        @NotNull
        private final String deeplink;
        private final long id;
        private final boolean isFavorite;
        private final Boolean isPremium;
        private final List<ProductDTO> items;
        private final String logoImage;
        private final IconDTO premiumIcon;
        private final Integer productsCount;
        private final RatingBadgeAtom ratingBadge;
        private final String subtitle;
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u008a\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\fHÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010#R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;", "", "sku", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "price", "Ljava/math/BigDecimal;", "finalPrice", "priceString", "discount", "", "deeplink", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Map;)V", "getSku", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTitle", "()Ljava/lang/String;", "getImage", "getPrice", "()Ljava/math/BigDecimal;", "getFinalPrice", "getPriceString", "getDiscount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeeplink", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Map;)Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;", "equals", "other", "hashCode", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductDTO {
            public static final int $stable = 8;

            @NotNull
            private final String deeplink;
            private final Integer discount;
            private final BigDecimal finalPrice;

            @NotNull
            private final String image;
            private final boolean isAdult;
            private final BigDecimal price;
            private final String priceString;
            private final Long sku;

            @NotNull
            private final String title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public ProductDTO(Long l11, @NotNull String title, @NotNull String image, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Integer num, @NotNull String deeplink, boolean z11, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.sku = l11;
                this.title = title;
                this.image = image;
                this.price = bigDecimal;
                this.finalPrice = bigDecimal2;
                this.priceString = str;
                this.discount = num;
                this.deeplink = deeplink;
                this.isAdult = z11;
                this.trackingInfo = map;
            }

            public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, Long l11, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, Integer num, String str4, boolean z11, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    l11 = productDTO.sku;
                }
                if ((i11 & 2) != 0) {
                    str = productDTO.title;
                }
                if ((i11 & 4) != 0) {
                    str2 = productDTO.image;
                }
                if ((i11 & 8) != 0) {
                    bigDecimal = productDTO.price;
                }
                if ((i11 & 16) != 0) {
                    bigDecimal2 = productDTO.finalPrice;
                }
                if ((i11 & 32) != 0) {
                    str3 = productDTO.priceString;
                }
                if ((i11 & 64) != 0) {
                    num = productDTO.discount;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    str4 = productDTO.deeplink;
                }
                if ((i11 & 256) != 0) {
                    z11 = productDTO.isAdult;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    map = productDTO.trackingInfo;
                }
                boolean z12 = z11;
                Map map2 = map;
                Integer num2 = num;
                String str5 = str4;
                BigDecimal bigDecimal3 = bigDecimal2;
                String str6 = str3;
                return productDTO.copy(l11, str, str2, bigDecimal, bigDecimal3, str6, num2, str5, z12, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final Long getSku() {
                return this.sku;
            }

            public final Map<String, TokenizedTrackingInfo> component10() {
                return this.trackingInfo;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getPrice() {
                return this.price;
            }

            /* renamed from: component5, reason: from getter */
            public final BigDecimal getFinalPrice() {
                return this.finalPrice;
            }

            /* renamed from: component6, reason: from getter */
            public final String getPriceString() {
                return this.priceString;
            }

            /* renamed from: component7, reason: from getter */
            public final Integer getDiscount() {
                return this.discount;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: component9, reason: from getter */
            public final boolean getIsAdult() {
                return this.isAdult;
            }

            @NotNull
            public final ProductDTO copy(Long sku, @NotNull String title, @NotNull String image, BigDecimal price, BigDecimal finalPrice, String priceString, Integer discount, @NotNull String deeplink, boolean isAdult, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new ProductDTO(sku, title, image, price, finalPrice, priceString, discount, deeplink, isAdult, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProductDTO)) {
                    return false;
                }
                ProductDTO productDTO = (ProductDTO) other;
                return Intrinsics.d(this.sku, productDTO.sku) && Intrinsics.d(this.title, productDTO.title) && Intrinsics.d(this.image, productDTO.image) && Intrinsics.d(this.price, productDTO.price) && Intrinsics.d(this.finalPrice, productDTO.finalPrice) && Intrinsics.d(this.priceString, productDTO.priceString) && Intrinsics.d(this.discount, productDTO.discount) && Intrinsics.d(this.deeplink, productDTO.deeplink) && this.isAdult == productDTO.isAdult && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final Integer getDiscount() {
                return this.discount;
            }

            public final BigDecimal getFinalPrice() {
                return this.finalPrice;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final BigDecimal getPrice() {
                return this.price;
            }

            public final String getPriceString() {
                return this.priceString;
            }

            public final Long getSku() {
                return this.sku;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                Long l11 = this.sku;
                int a11 = g.a(g.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.title), 31, this.image);
                BigDecimal bigDecimal = this.price;
                int hashCode = (a11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
                BigDecimal bigDecimal2 = this.finalPrice;
                int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
                String str = this.priceString;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.discount;
                int a12 = C3532b.a(g.a((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.deeplink), 31, this.isAdult);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return a12 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isAdult() {
                return this.isAdult;
            }

            @NotNull
            public String toString() {
                Long l11 = this.sku;
                String str = this.title;
                String str2 = this.image;
                BigDecimal bigDecimal = this.price;
                BigDecimal bigDecimal2 = this.finalPrice;
                String str3 = this.priceString;
                Integer num = this.discount;
                String str4 = this.deeplink;
                boolean z11 = this.isAdult;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("ProductDTO(sku=");
                sb2.append(l11);
                sb2.append(", title=");
                sb2.append(str);
                sb2.append(", image=");
                sb2.append(str2);
                sb2.append(", price=");
                sb2.append(bigDecimal);
                sb2.append(", finalPrice=");
                sb2.append(bigDecimal2);
                sb2.append(", priceString=");
                sb2.append(str3);
                sb2.append(", discount=");
                V.f(num, ", deeplink=", str4, ", isAdult=", sb2);
                sb2.append(z11);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public SellerDTO(long j11, String str, Integer num, String str2, String str3, @NotNull String deeplink, List<ProductDTO> list, boolean z11, Boolean bool, IconDTO iconDTO, RatingBadgeAtom ratingBadgeAtom, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.id = j11;
            this.title = str;
            this.productsCount = num;
            this.subtitle = str2;
            this.logoImage = str3;
            this.deeplink = deeplink;
            this.items = list;
            this.isFavorite = z11;
            this.isPremium = bool;
            this.premiumIcon = iconDTO;
            this.ratingBadge = ratingBadgeAtom;
            this.trackingInfo = map;
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final IconDTO getPremiumIcon() {
            return this.premiumIcon;
        }

        /* renamed from: component11, reason: from getter */
        public final RatingBadgeAtom getRatingBadge() {
            return this.ratingBadge;
        }

        public final Map<String, TokenizedTrackingInfo> component12() {
            return this.trackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getProductsCount() {
            return this.productsCount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLogoImage() {
            return this.logoImage;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final List<ProductDTO> component7() {
            return this.items;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        /* renamed from: component9, reason: from getter */
        public final Boolean getIsPremium() {
            return this.isPremium;
        }

        @NotNull
        public final SellerDTO copy(long id2, String title, Integer productsCount, String subtitle, String logoImage, @NotNull String deeplink, List<ProductDTO> items, boolean isFavorite, Boolean isPremium, IconDTO premiumIcon, RatingBadgeAtom ratingBadge, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new SellerDTO(id2, title, productsCount, subtitle, logoImage, deeplink, items, isFavorite, isPremium, premiumIcon, ratingBadge, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerDTO)) {
                return false;
            }
            SellerDTO sellerDTO = (SellerDTO) other;
            return this.id == sellerDTO.id && Intrinsics.d(this.title, sellerDTO.title) && Intrinsics.d(this.productsCount, sellerDTO.productsCount) && Intrinsics.d(this.subtitle, sellerDTO.subtitle) && Intrinsics.d(this.logoImage, sellerDTO.logoImage) && Intrinsics.d(this.deeplink, sellerDTO.deeplink) && Intrinsics.d(this.items, sellerDTO.items) && this.isFavorite == sellerDTO.isFavorite && Intrinsics.d(this.isPremium, sellerDTO.isPremium) && Intrinsics.d(this.premiumIcon, sellerDTO.premiumIcon) && Intrinsics.d(this.ratingBadge, sellerDTO.ratingBadge) && Intrinsics.d(this.trackingInfo, sellerDTO.trackingInfo);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final long getId() {
            return this.id;
        }

        public final List<ProductDTO> getItems() {
            return this.items;
        }

        public final String getLogoImage() {
            return this.logoImage;
        }

        public final IconDTO getPremiumIcon() {
            return this.premiumIcon;
        }

        public final Integer getProductsCount() {
            return this.productsCount;
        }

        public final RatingBadgeAtom getRatingBadge() {
            return this.ratingBadge;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.productsCount;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.logoImage;
            int a11 = g.a((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.deeplink);
            List<ProductDTO> list = this.items;
            int a12 = C3532b.a((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isFavorite);
            Boolean bool = this.isPremium;
            int hashCode5 = (a12 + (bool == null ? 0 : bool.hashCode())) * 31;
            IconDTO iconDTO = this.premiumIcon;
            int hashCode6 = (hashCode5 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            RatingBadgeAtom ratingBadgeAtom = this.ratingBadge;
            int hashCode7 = (hashCode6 + (ratingBadgeAtom == null ? 0 : ratingBadgeAtom.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isFavorite() {
            return this.isFavorite;
        }

        public final Boolean isPremium() {
            return this.isPremium;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.title;
            Integer num = this.productsCount;
            String str2 = this.subtitle;
            String str3 = this.logoImage;
            String str4 = this.deeplink;
            List<ProductDTO> list = this.items;
            boolean z11 = this.isFavorite;
            Boolean bool = this.isPremium;
            IconDTO iconDTO = this.premiumIcon;
            RatingBadgeAtom ratingBadgeAtom = this.ratingBadge;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = C2436a.c(j11, "SellerDTO(id=", ", title=", str);
            c11.append(", productsCount=");
            c11.append(num);
            c11.append(", subtitle=");
            c11.append(str2);
            a.h(c11, ", logoImage=", str3, ", deeplink=", str4);
            c.c(c11, ", items=", list, ", isFavorite=", z11);
            c11.append(", isPremium=");
            c11.append(bool);
            c11.append(", premiumIcon=");
            c11.append(iconDTO);
            c11.append(", ratingBadge=");
            c11.append(ratingBadgeAtom);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(")");
            return c11.toString();
        }
    }

    public SellerListDTO(@NotNull List<SellerDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SellerListDTO copy$default(SellerListDTO sellerListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sellerListDTO.items;
        }
        return sellerListDTO.copy(list);
    }

    @NotNull
    public final List<SellerDTO> component1() {
        return this.items;
    }

    @NotNull
    public final SellerListDTO copy(@NotNull List<SellerDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new SellerListDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SellerListDTO) && Intrinsics.d(this.items, ((SellerListDTO) other).items);
    }

    @NotNull
    public final List<SellerDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("SellerListDTO(items=", ")", this.items);
    }
}
