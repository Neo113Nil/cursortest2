package ru.ozon.app.android.barcode.barcodeProductsList.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/data/ItemDTO;", "", "status", "Lru/ozon/app/android/barcode/barcodeProductsList/data/StatusDTO;", "products", "", "Lru/ozon/app/android/barcode/barcodeProductsList/data/ProductDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/app/android/barcode/barcodeProductsList/data/StatusDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getStatus", "()Lru/ozon/app/android/barcode/barcodeProductsList/data/StatusDTO;", "getProducts", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ItemDTO {
    private final ButtonV3DTO button;

    @NotNull
    private final List<ProductDTO> products;

    @NotNull
    private final StatusDTO status;

    public ItemDTO(@NotNull StatusDTO status, @NotNull List<ProductDTO> products, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(products, "products");
        this.status = status;
        this.products = products;
        this.button = buttonV3DTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, StatusDTO statusDTO, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            statusDTO = itemDTO.status;
        }
        if ((i11 & 2) != 0) {
            list = itemDTO.products;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = itemDTO.button;
        }
        return itemDTO.copy(statusDTO, list, buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StatusDTO getStatus() {
        return this.status;
    }

    @NotNull
    public final List<ProductDTO> component2() {
        return this.products;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final ItemDTO copy(@NotNull StatusDTO status, @NotNull List<ProductDTO> products, ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(products, "products");
        return new ItemDTO(status, products, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDTO)) {
            return false;
        }
        ItemDTO itemDTO = (ItemDTO) other;
        return Intrinsics.d(this.status, itemDTO.status) && Intrinsics.d(this.products, itemDTO.products) && Intrinsics.d(this.button, itemDTO.button);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<ProductDTO> getProducts() {
        return this.products;
    }

    @NotNull
    public final StatusDTO getStatus() {
        return this.status;
    }

    public int hashCode() {
        int b11 = g.b(this.status.hashCode() * 31, 31, this.products);
        ButtonV3DTO buttonV3DTO = this.button;
        return b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "ItemDTO(status=" + this.status + ", products=" + this.products + ", button=" + this.button + ")";
    }
}
