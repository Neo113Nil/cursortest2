package ru.ozon.app.android.checkoutcomposer.premiumbannerdetails;

import An.C2439a;
import G.g;
import H3.c;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.BulletElements;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO;", "", "showBackground", "", "tariffs", "", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLjava/util/List;Ljava/util/Map;)V", "getShowBackground", "()Z", "getTariffs", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Tariff", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PremiumBannerDetailsDTO {
    public static final int $stable = 8;
    private final boolean showBackground;

    @NotNull
    private final List<Tariff> tariffs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003$%&B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff;", "", "badge", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Header;", "price", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Prices;", "benefits", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "button", "Lru/ozon/uni/atoms/data/deprecated/Button;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Header;Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Prices;Lru/ozon/app/android/atoms/data/deprecated/BulletElements;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "getBadge", "()Ljava/lang/String;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Header;", "getPrice", "()Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Prices;", "getBenefits", "()Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Header", "Prices", "Benefits", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Tariff {
        public static final int $stable = 8;
        private final String badge;

        @NotNull
        private final BulletElements benefits;

        @NotNull
        private final Button button;

        @NotNull
        private final Header header;

        @NotNull
        private final Prices price;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Benefits;", "", "items", "", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Benefits$Item;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Item", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Benefits {
            public static final int $stable = 8;

            @NotNull
            private final List<Item> items;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Benefits$Item;", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Item {
                public static final int $stable = OzonSpannableString.$stable;

                @NotNull
                private final OzonSpannableString text;

                public Item(@NotNull OzonSpannableString text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public static /* synthetic */ Item copy$default(Item item, OzonSpannableString ozonSpannableString, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        ozonSpannableString = item.text;
                    }
                    return item.copy(ozonSpannableString);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final OzonSpannableString getText() {
                    return this.text;
                }

                @NotNull
                public final Item copy(@NotNull OzonSpannableString text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Item(text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Item) && Intrinsics.d(this.text, ((Item) other).text);
                }

                @NotNull
                public final OzonSpannableString getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Item(text=" + ((Object) this.text) + ")";
                }
            }

            public Benefits(@NotNull List<Item> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                this.items = items;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Benefits copy$default(Benefits benefits, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = benefits.items;
                }
                return benefits.copy(list);
            }

            @NotNull
            public final List<Item> component1() {
                return this.items;
            }

            @NotNull
            public final Benefits copy(@NotNull List<Item> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                return new Benefits(items);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Benefits) && Intrinsics.d(this.items, ((Benefits) other).items);
            }

            @NotNull
            public final List<Item> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("Benefits(items=", ")", this.items);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Header;", "", "image", "", "info", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getImage", "()Ljava/lang/String;", "getInfo", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header {
            public static final int $stable = 8;

            @NotNull
            private final String image;

            @NotNull
            private final List<AtomDTO> info;

            /* JADX WARN: Multi-variable type inference failed */
            public Header(@NotNull String image, @NotNull List<? extends AtomDTO> info) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(info, "info");
                this.image = image;
                this.info = info;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Header copy$default(Header header, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = header.image;
                }
                if ((i11 & 2) != 0) {
                    list = header.info;
                }
                return header.copy(str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final List<AtomDTO> component2() {
                return this.info;
            }

            @NotNull
            public final Header copy(@NotNull String image, @NotNull List<? extends AtomDTO> info) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(info, "info");
                return new Header(image, info);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.d(this.image, header.image) && Intrinsics.d(this.info, header.info);
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final List<AtomDTO> getInfo() {
                return this.info;
            }

            public int hashCode() {
                return this.info.hashCode() + (this.image.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("Header(image=", this.image, ", info=", ")", this.info);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Prices;", "", "recurrentPrice", "Lru/ozon/uni/atoms/data/price/Price;", "totalPrice", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/price/Price;)V", "getRecurrentPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getTotalPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Prices {
            public static final int $stable = Price.$stable;

            @NotNull
            private final Price recurrentPrice;

            @NotNull
            private final Price totalPrice;

            public Prices(@NotNull Price recurrentPrice, @NotNull Price totalPrice) {
                Intrinsics.checkNotNullParameter(recurrentPrice, "recurrentPrice");
                Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
                this.recurrentPrice = recurrentPrice;
                this.totalPrice = totalPrice;
            }

            public static /* synthetic */ Prices copy$default(Prices prices, Price price, Price price2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    price = prices.recurrentPrice;
                }
                if ((i11 & 2) != 0) {
                    price2 = prices.totalPrice;
                }
                return prices.copy(price, price2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Price getRecurrentPrice() {
                return this.recurrentPrice;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Price getTotalPrice() {
                return this.totalPrice;
            }

            @NotNull
            public final Prices copy(@NotNull Price recurrentPrice, @NotNull Price totalPrice) {
                Intrinsics.checkNotNullParameter(recurrentPrice, "recurrentPrice");
                Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
                return new Prices(recurrentPrice, totalPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Prices)) {
                    return false;
                }
                Prices prices = (Prices) other;
                return Intrinsics.d(this.recurrentPrice, prices.recurrentPrice) && Intrinsics.d(this.totalPrice, prices.totalPrice);
            }

            @NotNull
            public final Price getRecurrentPrice() {
                return this.recurrentPrice;
            }

            @NotNull
            public final Price getTotalPrice() {
                return this.totalPrice;
            }

            public int hashCode() {
                return this.totalPrice.hashCode() + (this.recurrentPrice.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Prices(recurrentPrice=" + this.recurrentPrice + ", totalPrice=" + this.totalPrice + ")";
            }
        }

        public Tariff(String str, @NotNull Header header, @NotNull Prices price, @NotNull BulletElements benefits, @NotNull Button button) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(button, "button");
            this.badge = str;
            this.header = header;
            this.price = price;
            this.benefits = benefits;
            this.button = button;
        }

        public static /* synthetic */ Tariff copy$default(Tariff tariff, String str, Header header, Prices prices, BulletElements bulletElements, Button button, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tariff.badge;
            }
            if ((i11 & 2) != 0) {
                header = tariff.header;
            }
            if ((i11 & 4) != 0) {
                prices = tariff.price;
            }
            if ((i11 & 8) != 0) {
                bulletElements = tariff.benefits;
            }
            if ((i11 & 16) != 0) {
                button = tariff.button;
            }
            Button button2 = button;
            Prices prices2 = prices;
            return tariff.copy(str, header, prices2, bulletElements, button2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Prices getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final BulletElements getBenefits() {
            return this.benefits;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @NotNull
        public final Tariff copy(String badge, @NotNull Header header, @NotNull Prices price, @NotNull BulletElements benefits, @NotNull Button button) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(button, "button");
            return new Tariff(badge, header, price, benefits, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tariff)) {
                return false;
            }
            Tariff tariff = (Tariff) other;
            return Intrinsics.d(this.badge, tariff.badge) && Intrinsics.d(this.header, tariff.header) && Intrinsics.d(this.price, tariff.price) && Intrinsics.d(this.benefits, tariff.benefits) && Intrinsics.d(this.button, tariff.button);
        }

        public final String getBadge() {
            return this.badge;
        }

        @NotNull
        public final BulletElements getBenefits() {
            return this.benefits;
        }

        @NotNull
        public final Button getButton() {
            return this.button;
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        public final Prices getPrice() {
            return this.price;
        }

        public int hashCode() {
            String str = this.badge;
            return this.button.hashCode() + ((this.benefits.hashCode() + ((this.price.hashCode() + ((this.header.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Tariff(badge=" + this.badge + ", header=" + this.header + ", price=" + this.price + ", benefits=" + this.benefits + ", button=" + this.button + ")";
        }
    }

    public PremiumBannerDetailsDTO(boolean z11, @NotNull List<Tariff> tariffs, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        this.showBackground = z11;
        this.tariffs = tariffs;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PremiumBannerDetailsDTO copy$default(PremiumBannerDetailsDTO premiumBannerDetailsDTO, boolean z11, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = premiumBannerDetailsDTO.showBackground;
        }
        if ((i11 & 2) != 0) {
            list = premiumBannerDetailsDTO.tariffs;
        }
        if ((i11 & 4) != 0) {
            map = premiumBannerDetailsDTO.trackingInfo;
        }
        return premiumBannerDetailsDTO.copy(z11, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowBackground() {
        return this.showBackground;
    }

    @NotNull
    public final List<Tariff> component2() {
        return this.tariffs;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final PremiumBannerDetailsDTO copy(boolean showBackground, @NotNull List<Tariff> tariffs, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        return new PremiumBannerDetailsDTO(showBackground, tariffs, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumBannerDetailsDTO)) {
            return false;
        }
        PremiumBannerDetailsDTO premiumBannerDetailsDTO = (PremiumBannerDetailsDTO) other;
        return this.showBackground == premiumBannerDetailsDTO.showBackground && Intrinsics.d(this.tariffs, premiumBannerDetailsDTO.tariffs) && Intrinsics.d(this.trackingInfo, premiumBannerDetailsDTO.trackingInfo);
    }

    public final boolean getShowBackground() {
        return this.showBackground;
    }

    @NotNull
    public final List<Tariff> getTariffs() {
        return this.tariffs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(Boolean.hashCode(this.showBackground) * 31, 31, this.tariffs);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        boolean z11 = this.showBackground;
        List<Tariff> list = this.tariffs;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PremiumBannerDetailsDTO(showBackground=");
        sb2.append(z11);
        sb2.append(", tariffs=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
