package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import K00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"ru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice", "", "<init>", "()V", "", "getId", "()I", "id", "RegularPrice", "OzonCardPrice", "VATPrice", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$OzonCardPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$RegularPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$VATPrice;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PriceV2VO$TypedPrice {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$OzonCardPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice;", "accentPrice", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "regularPrice", "", "id", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice;", "getAccentPrice", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "getRegularPrice", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "I", "getId", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonCardPrice extends PriceV2VO$TypedPrice {

        @NotNull
        private final PriceV2VO$AccentPrice accentPrice;
        private final int id;

        @NotNull
        private final ExtendedPrice regularPrice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OzonCardPrice(@NotNull PriceV2VO$AccentPrice accentPrice, @NotNull ExtendedPrice regularPrice, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(accentPrice, "accentPrice");
            Intrinsics.checkNotNullParameter(regularPrice, "regularPrice");
            this.accentPrice = accentPrice;
            this.regularPrice = regularPrice;
            this.id = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OzonCardPrice)) {
                return false;
            }
            OzonCardPrice ozonCardPrice = (OzonCardPrice) other;
            return Intrinsics.d(this.accentPrice, ozonCardPrice.accentPrice) && Intrinsics.d(this.regularPrice, ozonCardPrice.regularPrice) && this.id == ozonCardPrice.id;
        }

        @NotNull
        public final PriceV2VO$AccentPrice getAccentPrice() {
            return this.accentPrice;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$TypedPrice
        public int getId() {
            return this.id;
        }

        @NotNull
        public final ExtendedPrice getRegularPrice() {
            return this.regularPrice;
        }

        public int hashCode() {
            return Integer.hashCode(this.id) + ((this.regularPrice.hashCode() + (this.accentPrice.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            PriceV2VO$AccentPrice priceV2VO$AccentPrice = this.accentPrice;
            ExtendedPrice extendedPrice = this.regularPrice;
            int i11 = this.id;
            StringBuilder sb2 = new StringBuilder("OzonCardPrice(accentPrice=");
            sb2.append(priceV2VO$AccentPrice);
            sb2.append(", regularPrice=");
            sb2.append(extendedPrice);
            sb2.append(", id=");
            return b.e(i11, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$RegularPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "price", "", "id", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "getPrice", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "I", "getId", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegularPrice extends PriceV2VO$TypedPrice {
        private final int id;

        @NotNull
        private final ExtendedPrice price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegularPrice(@NotNull ExtendedPrice price, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.id = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegularPrice)) {
                return false;
            }
            RegularPrice regularPrice = (RegularPrice) other;
            return Intrinsics.d(this.price, regularPrice.price) && this.id == regularPrice.id;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$TypedPrice
        public int getId() {
            return this.id;
        }

        @NotNull
        public final ExtendedPrice getPrice() {
            return this.price;
        }

        public int hashCode() {
            return Integer.hashCode(this.id) + (this.price.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "RegularPrice(price=" + this.price + ", id=" + this.id + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$VATPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "priceWithVAT", "priceWithNoVAT", "", "id", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "getPriceWithVAT", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "getPriceWithNoVAT", "I", "getId", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VATPrice extends PriceV2VO$TypedPrice {
        private final int id;
        private final ExtendedPrice priceWithNoVAT;
        private final ExtendedPrice priceWithVAT;

        public VATPrice(ExtendedPrice extendedPrice, ExtendedPrice extendedPrice2, int i11) {
            super(null);
            this.priceWithVAT = extendedPrice;
            this.priceWithNoVAT = extendedPrice2;
            this.id = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VATPrice)) {
                return false;
            }
            VATPrice vATPrice = (VATPrice) other;
            return Intrinsics.d(this.priceWithVAT, vATPrice.priceWithVAT) && Intrinsics.d(this.priceWithNoVAT, vATPrice.priceWithNoVAT) && this.id == vATPrice.id;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$TypedPrice
        public int getId() {
            return this.id;
        }

        public final ExtendedPrice getPriceWithNoVAT() {
            return this.priceWithNoVAT;
        }

        public final ExtendedPrice getPriceWithVAT() {
            return this.priceWithVAT;
        }

        public int hashCode() {
            ExtendedPrice extendedPrice = this.priceWithVAT;
            int hashCode = (extendedPrice == null ? 0 : extendedPrice.hashCode()) * 31;
            ExtendedPrice extendedPrice2 = this.priceWithNoVAT;
            return Integer.hashCode(this.id) + ((hashCode + (extendedPrice2 != null ? extendedPrice2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            ExtendedPrice extendedPrice = this.priceWithVAT;
            ExtendedPrice extendedPrice2 = this.priceWithNoVAT;
            int i11 = this.id;
            StringBuilder sb2 = new StringBuilder("VATPrice(priceWithVAT=");
            sb2.append(extendedPrice);
            sb2.append(", priceWithNoVAT=");
            sb2.append(extendedPrice2);
            sb2.append(", id=");
            return b.e(i11, ")", sb2);
        }
    }

    public /* synthetic */ PriceV2VO$TypedPrice(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getId();

    private PriceV2VO$TypedPrice() {
    }
}
