package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;", "controls", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "swipeInfo", "<init>", "(JLru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;", "getControls", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "getSwipeInfo", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "isLockedForProduct", "Z", "()Z", "setLockedForProduct", "(Z)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2ControlsVO implements c {

    @NotNull
    private final ControlsVO controls;
    private final long id;
    private boolean isLockedForProduct;
    private final SwipeInfoVO swipeInfo;

    public CartSplitV2ControlsVO(long j11, @NotNull ControlsVO controls, SwipeInfoVO swipeInfoVO) {
        Intrinsics.checkNotNullParameter(controls, "controls");
        this.id = j11;
        this.controls = controls;
        this.swipeInfo = swipeInfoVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2ControlsVO)) {
            return false;
        }
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) other;
        return this.id == cartSplitV2ControlsVO.id && Intrinsics.d(this.controls, cartSplitV2ControlsVO.controls) && Intrinsics.d(this.swipeInfo, cartSplitV2ControlsVO.swipeInfo);
    }

    @NotNull
    public final ControlsVO getControls() {
        return this.controls;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SwipeInfoVO getSwipeInfo() {
        return this.swipeInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.controls.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        SwipeInfoVO swipeInfoVO = this.swipeInfo;
        return hashCode + (swipeInfoVO == null ? 0 : swipeInfoVO.hashCode());
    }

    /* renamed from: isLockedForProduct, reason: from getter */
    public final boolean getIsLockedForProduct() {
        return this.isLockedForProduct;
    }

    public final void setLockedForProduct(boolean z11) {
        this.isLockedForProduct = z11;
    }

    @NotNull
    public String toString() {
        return "CartSplitV2ControlsVO(id=" + this.id + ", controls=" + this.controls + ", swipeInfo=" + this.swipeInfo + ")";
    }
}
