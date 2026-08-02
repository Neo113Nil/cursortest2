package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/data/HammersV3HammerPriceDTO;", "", "discount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "stockBar", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/atoms/data/stock/StockBar;)V", "getDiscount", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HammersV3HammerPriceDTO {
    public static final int $stable = 8;
    private final PriceDTO discount;
    private final PriceDTO price;
    private final StockBar stockBar;
    private final TextAtom text;

    public HammersV3HammerPriceDTO(PriceDTO priceDTO, TextAtom textAtom, PriceDTO priceDTO2, StockBar stockBar) {
        this.discount = priceDTO;
        this.text = textAtom;
        this.price = priceDTO2;
        this.stockBar = stockBar;
    }

    public static /* synthetic */ HammersV3HammerPriceDTO copy$default(HammersV3HammerPriceDTO hammersV3HammerPriceDTO, PriceDTO priceDTO, TextAtom textAtom, PriceDTO priceDTO2, StockBar stockBar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceDTO = hammersV3HammerPriceDTO.discount;
        }
        if ((i11 & 2) != 0) {
            textAtom = hammersV3HammerPriceDTO.text;
        }
        if ((i11 & 4) != 0) {
            priceDTO2 = hammersV3HammerPriceDTO.price;
        }
        if ((i11 & 8) != 0) {
            stockBar = hammersV3HammerPriceDTO.stockBar;
        }
        return hammersV3HammerPriceDTO.copy(priceDTO, textAtom, priceDTO2, stockBar);
    }

    /* renamed from: component1, reason: from getter */
    public final PriceDTO getDiscount() {
        return this.discount;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final StockBar getStockBar() {
        return this.stockBar;
    }

    @NotNull
    public final HammersV3HammerPriceDTO copy(PriceDTO discount, TextAtom text, PriceDTO price, StockBar stockBar) {
        return new HammersV3HammerPriceDTO(discount, text, price, stockBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammersV3HammerPriceDTO)) {
            return false;
        }
        HammersV3HammerPriceDTO hammersV3HammerPriceDTO = (HammersV3HammerPriceDTO) other;
        return Intrinsics.d(this.discount, hammersV3HammerPriceDTO.discount) && Intrinsics.d(this.text, hammersV3HammerPriceDTO.text) && Intrinsics.d(this.price, hammersV3HammerPriceDTO.price) && Intrinsics.d(this.stockBar, hammersV3HammerPriceDTO.stockBar);
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
        return "HammersV3HammerPriceDTO(discount=" + this.discount + ", text=" + this.text + ", price=" + this.price + ", stockBar=" + this.stockBar + ")";
    }
}
