package ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/MultiButtonModel;", "", "widgetId", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "button", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "recShelfAction", "<init>", "(JLru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "getButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRecShelfAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddToCartMultiButtonModel implements MultiButtonModel {
    private final AddToCartButtonDTO button;
    private final AtomActionDTO recShelfAction;
    private final long widgetId;

    public AddToCartMultiButtonModel(long j11, AddToCartButtonDTO addToCartButtonDTO, AtomActionDTO atomActionDTO) {
        this.widgetId = j11;
        this.button = addToCartButtonDTO;
        this.recShelfAction = atomActionDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToCartMultiButtonModel)) {
            return false;
        }
        AddToCartMultiButtonModel addToCartMultiButtonModel = (AddToCartMultiButtonModel) other;
        return this.widgetId == addToCartMultiButtonModel.widgetId && Intrinsics.d(this.button, addToCartMultiButtonModel.button) && Intrinsics.d(this.recShelfAction, addToCartMultiButtonModel.recShelfAction);
    }

    public final AddToCartButtonDTO getButton() {
        return this.button;
    }

    public final AtomActionDTO getRecShelfAction() {
        return this.recShelfAction;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.widgetId) * 31;
        AddToCartButtonDTO addToCartButtonDTO = this.button;
        int hashCode2 = (hashCode + (addToCartButtonDTO == null ? 0 : addToCartButtonDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.recShelfAction;
        return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddToCartMultiButtonModel(widgetId=" + this.widgetId + ", button=" + this.button + ", recShelfAction=" + this.recShelfAction + ")";
    }
}
