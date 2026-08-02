package ru.ozon.app.android.barcode.barcodeProductsList.data;

import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/data/StatusDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "count", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "countDisplay", "Lru/ozon/app/android/barcode/barcodeProductsList/data/CountTextDisplayType;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/barcode/barcodeProductsList/data/CountTextDisplayType;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCount", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getCountDisplay", "()Lru/ozon/app/android/barcode/barcodeProductsList/data/CountTextDisplayType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StatusDTO {
    private final TextDTO count;

    @EnumNullFallback
    private final CountTextDisplayType countDisplay;
    private final PriceDTO price;

    @NotNull
    private final TextDTO title;

    public StatusDTO(@NotNull TextDTO title, TextDTO textDTO, PriceDTO priceDTO, CountTextDisplayType countTextDisplayType) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.count = textDTO;
        this.price = priceDTO;
        this.countDisplay = countTextDisplayType;
    }

    public static /* synthetic */ StatusDTO copy$default(StatusDTO statusDTO, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO, CountTextDisplayType countTextDisplayType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = statusDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = statusDTO.count;
        }
        if ((i11 & 4) != 0) {
            priceDTO = statusDTO.price;
        }
        if ((i11 & 8) != 0) {
            countTextDisplayType = statusDTO.countDisplay;
        }
        return statusDTO.copy(textDTO, textDTO2, priceDTO, countTextDisplayType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getCount() {
        return this.count;
    }

    /* renamed from: component3, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final CountTextDisplayType getCountDisplay() {
        return this.countDisplay;
    }

    @NotNull
    public final StatusDTO copy(@NotNull TextDTO title, TextDTO count, PriceDTO price, CountTextDisplayType countDisplay) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new StatusDTO(title, count, price, countDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusDTO)) {
            return false;
        }
        StatusDTO statusDTO = (StatusDTO) other;
        return Intrinsics.d(this.title, statusDTO.title) && Intrinsics.d(this.count, statusDTO.count) && Intrinsics.d(this.price, statusDTO.price) && this.countDisplay == statusDTO.countDisplay;
    }

    public final TextDTO getCount() {
        return this.count;
    }

    public final CountTextDisplayType getCountDisplay() {
        return this.countDisplay;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.count;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.price;
        int hashCode3 = (hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        CountTextDisplayType countTextDisplayType = this.countDisplay;
        return hashCode3 + (countTextDisplayType != null ? countTextDisplayType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.count;
        PriceDTO priceDTO = this.price;
        CountTextDisplayType countTextDisplayType = this.countDisplay;
        StringBuilder g10 = g.g("StatusDTO(title=", textDTO, ", count=", textDTO2, ", price=");
        g10.append(priceDTO);
        g10.append(", countDisplay=");
        g10.append(countTextDisplayType);
        g10.append(")");
        return g10.toString();
    }
}
