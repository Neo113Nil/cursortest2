package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;", "", "discount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "textTop", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textMiddle", "price", "label", "stockBar", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/atoms/data/stock/StockBar;)V", "getDiscount", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTextTop", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTextMiddle", "getPrice", "getLabel", "getStockBar", "()Lru/ozon/app/android/atoms/data/stock/StockBar;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HammerPriceV3DTO {
    public static final int $stable = 8;
    private final PriceDTO discount;
    private final TextDTO label;
    private final PriceDTO price;
    private final StockBar stockBar;
    private final TextDTO textMiddle;
    private final TextDTO textTop;

    public HammerPriceV3DTO(PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO2, TextDTO textDTO3, StockBar stockBar) {
        this.discount = priceDTO;
        this.textTop = textDTO;
        this.textMiddle = textDTO2;
        this.price = priceDTO2;
        this.label = textDTO3;
        this.stockBar = stockBar;
    }

    public static /* synthetic */ HammerPriceV3DTO copy$default(HammerPriceV3DTO hammerPriceV3DTO, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO2, TextDTO textDTO3, StockBar stockBar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceDTO = hammerPriceV3DTO.discount;
        }
        if ((i11 & 2) != 0) {
            textDTO = hammerPriceV3DTO.textTop;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = hammerPriceV3DTO.textMiddle;
        }
        if ((i11 & 8) != 0) {
            priceDTO2 = hammerPriceV3DTO.price;
        }
        if ((i11 & 16) != 0) {
            textDTO3 = hammerPriceV3DTO.label;
        }
        if ((i11 & 32) != 0) {
            stockBar = hammerPriceV3DTO.stockBar;
        }
        TextDTO textDTO4 = textDTO3;
        StockBar stockBar2 = stockBar;
        return hammerPriceV3DTO.copy(priceDTO, textDTO, textDTO2, priceDTO2, textDTO4, stockBar2);
    }

    /* renamed from: component1, reason: from getter */
    public final PriceDTO getDiscount() {
        return this.discount;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTextTop() {
        return this.textTop;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getTextMiddle() {
        return this.textMiddle;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getLabel() {
        return this.label;
    }

    /* renamed from: component6, reason: from getter */
    public final StockBar getStockBar() {
        return this.stockBar;
    }

    @NotNull
    public final HammerPriceV3DTO copy(PriceDTO discount, TextDTO textTop, TextDTO textMiddle, PriceDTO price, TextDTO label, StockBar stockBar) {
        return new HammerPriceV3DTO(discount, textTop, textMiddle, price, label, stockBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammerPriceV3DTO)) {
            return false;
        }
        HammerPriceV3DTO hammerPriceV3DTO = (HammerPriceV3DTO) other;
        return Intrinsics.d(this.discount, hammerPriceV3DTO.discount) && Intrinsics.d(this.textTop, hammerPriceV3DTO.textTop) && Intrinsics.d(this.textMiddle, hammerPriceV3DTO.textMiddle) && Intrinsics.d(this.price, hammerPriceV3DTO.price) && Intrinsics.d(this.label, hammerPriceV3DTO.label) && Intrinsics.d(this.stockBar, hammerPriceV3DTO.stockBar);
    }

    public final PriceDTO getDiscount() {
        return this.discount;
    }

    public final TextDTO getLabel() {
        return this.label;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final StockBar getStockBar() {
        return this.stockBar;
    }

    public final TextDTO getTextMiddle() {
        return this.textMiddle;
    }

    public final TextDTO getTextTop() {
        return this.textTop;
    }

    public int hashCode() {
        PriceDTO priceDTO = this.discount;
        int hashCode = (priceDTO == null ? 0 : priceDTO.hashCode()) * 31;
        TextDTO textDTO = this.textTop;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.textMiddle;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        PriceDTO priceDTO2 = this.price;
        int hashCode4 = (hashCode3 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31;
        TextDTO textDTO3 = this.label;
        int hashCode5 = (hashCode4 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        StockBar stockBar = this.stockBar;
        return hashCode5 + (stockBar != null ? stockBar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HammerPriceV3DTO(discount=" + this.discount + ", textTop=" + this.textTop + ", textMiddle=" + this.textMiddle + ", price=" + this.price + ", label=" + this.label + ", stockBar=" + this.stockBar + ")";
    }
}
