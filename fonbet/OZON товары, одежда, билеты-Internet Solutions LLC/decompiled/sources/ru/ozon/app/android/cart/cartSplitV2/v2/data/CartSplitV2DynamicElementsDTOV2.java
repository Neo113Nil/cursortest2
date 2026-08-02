package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementDTOV2;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "", "", "index", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2;", "dynamicElements", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Ljava/util/List;", "getDynamicElements", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2DynamicElementsDTOV2 {
    public static final int $stable = 8;

    @NotNull
    private final List<DynamicElementDTOV2> dynamicElements;
    private final int index;

    /* JADX WARN: Multi-variable type inference failed */
    public CartSplitV2DynamicElementsDTOV2(int i11, @NotNull List<? extends DynamicElementDTOV2> dynamicElements) {
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        this.index = i11;
        this.dynamicElements = dynamicElements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartSplitV2DynamicElementsDTOV2 copy$default(CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV2, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cartSplitV2DynamicElementsDTOV2.index;
        }
        if ((i12 & 2) != 0) {
            list = cartSplitV2DynamicElementsDTOV2.dynamicElements;
        }
        return cartSplitV2DynamicElementsDTOV2.copy(i11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final List<DynamicElementDTOV2> component2() {
        return this.dynamicElements;
    }

    @NotNull
    public final CartSplitV2DynamicElementsDTOV2 copy(int index, @NotNull List<? extends DynamicElementDTOV2> dynamicElements) {
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        return new CartSplitV2DynamicElementsDTOV2(index, dynamicElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2DynamicElementsDTOV2)) {
            return false;
        }
        CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV2 = (CartSplitV2DynamicElementsDTOV2) other;
        return this.index == cartSplitV2DynamicElementsDTOV2.index && Intrinsics.d(this.dynamicElements, cartSplitV2DynamicElementsDTOV2.dynamicElements);
    }

    @NotNull
    public final List<DynamicElementDTOV2> getDynamicElements() {
        return this.dynamicElements;
    }

    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return this.dynamicElements.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2DynamicElementsDTOV2(index=" + this.index + ", dynamicElements=" + this.dynamicElements + ")";
    }
}
