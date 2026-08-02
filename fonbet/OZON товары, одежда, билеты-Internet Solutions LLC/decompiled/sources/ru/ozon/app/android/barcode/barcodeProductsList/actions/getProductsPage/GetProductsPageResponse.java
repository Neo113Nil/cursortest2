package ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.barcodeProductsList.data.ProductDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/GetProductsPageResponse;", "", "products", "", "Lru/ozon/app/android/barcode/barcodeProductsList/data/ProductDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getProducts", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetProductsPageResponse {

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final List<ProductDTO> products;

    public GetProductsPageResponse(@NotNull List<ProductDTO> products, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(button, "button");
        this.products = products;
        this.button = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetProductsPageResponse copy$default(GetProductsPageResponse getProductsPageResponse, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = getProductsPageResponse.products;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = getProductsPageResponse.button;
        }
        return getProductsPageResponse.copy(list, buttonV3DTO);
    }

    @NotNull
    public final List<ProductDTO> component1() {
        return this.products;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final GetProductsPageResponse copy(@NotNull List<ProductDTO> products, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(button, "button");
        return new GetProductsPageResponse(products, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProductsPageResponse)) {
            return false;
        }
        GetProductsPageResponse getProductsPageResponse = (GetProductsPageResponse) other;
        return Intrinsics.d(this.products, getProductsPageResponse.products) && Intrinsics.d(this.button, getProductsPageResponse.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<ProductDTO> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.products.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "GetProductsPageResponse(products=" + this.products + ", button=" + this.button + ")";
    }
}
