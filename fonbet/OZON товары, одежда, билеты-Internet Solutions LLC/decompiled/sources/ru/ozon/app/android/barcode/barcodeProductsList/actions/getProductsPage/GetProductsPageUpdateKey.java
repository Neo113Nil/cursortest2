package ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage;

import A00.a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.barcodeProductsList.data.ProductDTO;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/GetProductsPageUpdateKey;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "Lru/ozon/app/android/barcode/barcodeProductsList/data/ProductDTO;", "products", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/ActionType;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/ActionType;", "getActionType", "()Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/ActionType;", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetProductsPageUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final ActionType actionType;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final String id;

    @NotNull
    private final List<ProductDTO> products;

    public GetProductsPageUpdateKey(@NotNull String id2, @NotNull ActionType actionType, @NotNull List<ProductDTO> products, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = id2;
        this.actionType = actionType;
        this.products = products;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProductsPageUpdateKey)) {
            return false;
        }
        GetProductsPageUpdateKey getProductsPageUpdateKey = (GetProductsPageUpdateKey) other;
        return Intrinsics.d(this.id, getProductsPageUpdateKey.id) && this.actionType == getProductsPageUpdateKey.actionType && Intrinsics.d(this.products, getProductsPageUpdateKey.products) && Intrinsics.d(this.button, getProductsPageUpdateKey.button);
    }

    @NotNull
    public final ActionType getActionType() {
        return this.actionType;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<ProductDTO> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.button.hashCode() + g.b((this.actionType.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.products);
    }

    @NotNull
    public String toString() {
        return "GetProductsPageUpdateKey(id=" + this.id + ", actionType=" + this.actionType + ", products=" + this.products + ", button=" + this.button + ")";
    }
}
