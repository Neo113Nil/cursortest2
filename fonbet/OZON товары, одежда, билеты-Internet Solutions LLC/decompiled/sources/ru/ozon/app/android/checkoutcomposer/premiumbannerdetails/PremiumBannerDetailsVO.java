package ru.ozon.app.android.checkoutcomposer.premiumbannerdetails;

import An.C2439a;
import Bl.b;
import G.g;
import Kk.C3532b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.BulletElements;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "showBackground", "", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff;", "tariffs", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JZLjava/util/List;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getShowBackground", "()Z", "Ljava/util/List;", "getTariffs", "()Ljava/util/List;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Tariff", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PremiumBannerDetailsVO implements c {
    private final long id;
    private final boolean showBackground;

    @NotNull
    private final List<Tariff> tariffs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff;", "", "", "badge", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Prices;", "price", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "benefits", "Lru/ozon/uni/atoms/data/deprecated/Button;", "button", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Header;Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Prices;Lru/ozon/app/android/atoms/data/deprecated/BulletElements;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBadge", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Header;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Header;", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Prices;", "getPrice", "()Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Prices;", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "getBenefits", "()Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "Header", "Prices", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tariff {
        private final String badge;

        @NotNull
        private final BulletElements benefits;

        @NotNull
        private final Button button;

        @NotNull
        private final Header header;

        @NotNull
        private final Prices price;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Header;", "", "", "image", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "info", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Ljava/util/List;", "getInfo", "()Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header {

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

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO$Tariff$Prices;", "", "Lru/ozon/uni/atoms/data/price/Price;", "recurrentPrice", "totalPrice", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/price/Price;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/Price;", "getRecurrentPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getTotalPrice", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public PremiumBannerDetailsVO(long j11, boolean z11, @NotNull List<Tariff> tariffs, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(tariffs, "tariffs");
        this.id = j11;
        this.showBackground = z11;
        this.tariffs = tariffs;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumBannerDetailsVO)) {
            return false;
        }
        PremiumBannerDetailsVO premiumBannerDetailsVO = (PremiumBannerDetailsVO) other;
        return this.id == premiumBannerDetailsVO.id && this.showBackground == premiumBannerDetailsVO.showBackground && Intrinsics.d(this.tariffs, premiumBannerDetailsVO.tariffs) && Intrinsics.d(this.trackingInfo, premiumBannerDetailsVO.trackingInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(C3532b.a(Long.hashCode(this.id) * 31, 31, this.showBackground), 31, this.tariffs);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.showBackground;
        List<Tariff> list = this.tariffs;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = b.c(j11, "PremiumBannerDetailsVO(id=", ", showBackground=", z11);
        c11.append(", tariffs=");
        c11.append(list);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(")");
        return c11.toString();
    }
}
