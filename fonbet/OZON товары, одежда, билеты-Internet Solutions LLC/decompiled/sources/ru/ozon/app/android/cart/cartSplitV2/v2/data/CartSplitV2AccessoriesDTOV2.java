package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2AccessoriesDTOV2;", "", "", "index", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAccessoriesAction", "<init>", "(ILru/ozon/uni/atoms/data/AtomActionDTO;)V", "component1", "()I", "component2", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "copy", "(ILru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2AccessoriesDTOV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getGetAccessoriesAction", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2AccessoriesDTOV2 {
    public static final int $stable = 0;

    @NotNull
    private final AtomActionDTO getAccessoriesAction;
    private final int index;

    public CartSplitV2AccessoriesDTOV2(int i11, @NotNull AtomActionDTO getAccessoriesAction) {
        Intrinsics.checkNotNullParameter(getAccessoriesAction, "getAccessoriesAction");
        this.index = i11;
        this.getAccessoriesAction = getAccessoriesAction;
    }

    public static /* synthetic */ CartSplitV2AccessoriesDTOV2 copy$default(CartSplitV2AccessoriesDTOV2 cartSplitV2AccessoriesDTOV2, int i11, AtomActionDTO atomActionDTO, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cartSplitV2AccessoriesDTOV2.index;
        }
        if ((i12 & 2) != 0) {
            atomActionDTO = cartSplitV2AccessoriesDTOV2.getAccessoriesAction;
        }
        return cartSplitV2AccessoriesDTOV2.copy(i11, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getGetAccessoriesAction() {
        return this.getAccessoriesAction;
    }

    @NotNull
    public final CartSplitV2AccessoriesDTOV2 copy(int index, @NotNull AtomActionDTO getAccessoriesAction) {
        Intrinsics.checkNotNullParameter(getAccessoriesAction, "getAccessoriesAction");
        return new CartSplitV2AccessoriesDTOV2(index, getAccessoriesAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2AccessoriesDTOV2)) {
            return false;
        }
        CartSplitV2AccessoriesDTOV2 cartSplitV2AccessoriesDTOV2 = (CartSplitV2AccessoriesDTOV2) other;
        return this.index == cartSplitV2AccessoriesDTOV2.index && Intrinsics.d(this.getAccessoriesAction, cartSplitV2AccessoriesDTOV2.getAccessoriesAction);
    }

    @NotNull
    public final AtomActionDTO getGetAccessoriesAction() {
        return this.getAccessoriesAction;
    }

    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return this.getAccessoriesAction.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2AccessoriesDTOV2(index=" + this.index + ", getAccessoriesAction=" + this.getAccessoriesAction + ")";
    }
}
