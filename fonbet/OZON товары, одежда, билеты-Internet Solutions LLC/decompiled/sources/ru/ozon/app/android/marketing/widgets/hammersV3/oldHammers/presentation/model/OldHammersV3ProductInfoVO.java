package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.model;

import Bi.b;
import HY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO;", "", "<init>", "()V", "PlaceholderVO", "HammerPriceVO", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$HammerPriceVO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$PlaceholderVO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OldHammersV3ProductInfoVO {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$HammerPriceVO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "discount", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "price", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "stockBar", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/atoms/data/stock/StockBar;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getDiscount", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HammerPriceVO extends OldHammersV3ProductInfoVO {
        private final PriceDTO discount;
        private final PriceDTO price;
        private final StockBar stockBar;
        private final TextAtom text;

        public HammerPriceVO(PriceDTO priceDTO, TextAtom textAtom, PriceDTO priceDTO2, StockBar stockBar) {
            super(null);
            this.discount = priceDTO;
            this.text = textAtom;
            this.price = priceDTO2;
            this.stockBar = stockBar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HammerPriceVO)) {
                return false;
            }
            HammerPriceVO hammerPriceVO = (HammerPriceVO) other;
            return Intrinsics.d(this.discount, hammerPriceVO.discount) && Intrinsics.d(this.text, hammerPriceVO.text) && Intrinsics.d(this.price, hammerPriceVO.price) && Intrinsics.d(this.stockBar, hammerPriceVO.stockBar);
        }

        public final PriceDTO getDiscount() {
            return this.discount;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final StockBar getStockBar() {
            return this.stockBar;
        }

        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            PriceDTO priceDTO = this.discount;
            int hashCode = (priceDTO == null ? 0 : priceDTO.hashCode()) * 31;
            TextAtom textAtom = this.text;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            PriceDTO priceDTO2 = this.price;
            int hashCode3 = (hashCode2 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31;
            StockBar stockBar = this.stockBar;
            return hashCode3 + (stockBar != null ? stockBar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HammerPriceVO(discount=" + this.discount + ", text=" + this.text + ", price=" + this.price + ", stockBar=" + this.stockBar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO$PlaceholderVO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3ProductInfoVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "discountPlaceholder", "text", "pricePlaceholder", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDiscountPlaceholder", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "getPricePlaceholder", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlaceholderVO extends OldHammersV3ProductInfoVO {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom discountPlaceholder;
        private final TextAtom pricePlaceholder;
        private final TextAtom text;

        public PlaceholderVO(TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3) {
            super(null);
            this.discountPlaceholder = textAtom;
            this.text = textAtom2;
            this.pricePlaceholder = textAtom3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaceholderVO)) {
                return false;
            }
            PlaceholderVO placeholderVO = (PlaceholderVO) other;
            return Intrinsics.d(this.discountPlaceholder, placeholderVO.discountPlaceholder) && Intrinsics.d(this.text, placeholderVO.text) && Intrinsics.d(this.pricePlaceholder, placeholderVO.pricePlaceholder);
        }

        public final TextAtom getDiscountPlaceholder() {
            return this.discountPlaceholder;
        }

        public final TextAtom getPricePlaceholder() {
            return this.pricePlaceholder;
        }

        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            TextAtom textAtom = this.discountPlaceholder;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            TextAtom textAtom2 = this.text;
            int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            TextAtom textAtom3 = this.pricePlaceholder;
            return hashCode2 + (textAtom3 != null ? textAtom3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.discountPlaceholder;
            TextAtom textAtom2 = this.text;
            return b.g(a.a("PlaceholderVO(discountPlaceholder=", textAtom, ", text=", textAtom2, ", pricePlaceholder="), this.pricePlaceholder, ")");
        }
    }

    public /* synthetic */ OldHammersV3ProductInfoVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OldHammersV3ProductInfoVO() {
    }
}
