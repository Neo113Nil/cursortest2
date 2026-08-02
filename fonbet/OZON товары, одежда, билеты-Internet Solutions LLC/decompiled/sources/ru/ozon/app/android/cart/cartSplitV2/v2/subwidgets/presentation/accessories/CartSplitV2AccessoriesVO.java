package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "getAccessoriesAction", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getGetAccessoriesAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2AccessoriesVO implements c {
    public static final int $stable = AtomAction.$stable;

    @NotNull
    private final AtomAction getAccessoriesAction;
    private final long id;

    public CartSplitV2AccessoriesVO(long j11, @NotNull AtomAction getAccessoriesAction) {
        Intrinsics.checkNotNullParameter(getAccessoriesAction, "getAccessoriesAction");
        this.id = j11;
        this.getAccessoriesAction = getAccessoriesAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2AccessoriesVO)) {
            return false;
        }
        CartSplitV2AccessoriesVO cartSplitV2AccessoriesVO = (CartSplitV2AccessoriesVO) other;
        return this.id == cartSplitV2AccessoriesVO.id && Intrinsics.d(this.getAccessoriesAction, cartSplitV2AccessoriesVO.getAccessoriesAction);
    }

    @NotNull
    public final AtomAction getGetAccessoriesAction() {
        return this.getAccessoriesAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.getAccessoriesAction.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "CartSplitV2AccessoriesVO(id=" + this.id + ", getAccessoriesAction=" + this.getAccessoriesAction + ")";
    }
}
