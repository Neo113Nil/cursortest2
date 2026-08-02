package ru.ozon.app.android.cart.domain.delegate;

import Sc.o;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.domain.model.CartAtomViewState;
import ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonWithQuantityView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonView;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/domain/delegate/CartAtomEnablingStateDelegate;", "", "<init>", "()V", "computeAddToCartAtom", "Lru/ozon/app/android/cart/domain/model/CartAtomViewState;", "cartState", "Lru/ozon/app/android/cart/common/domain/CartState;", "atom", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;", "productId", "", "isInCart", "", "computeButtonWithQuantityAtom", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "setupAddToCartButtonState", "", "atomView", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "state", "getIsEnabled", "itemInfo", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartAtomEnablingStateDelegate {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getIsEnabled(ButtonV3Atom.AddToCartAtom atom, CartItemInfo itemInfo) {
        boolean z11;
        Integer quantity;
        if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
            ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity = (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atom;
            ButtonV3Atom.AddToCartAtom.Action action = addToCartButtonWithQuantity.getAction();
            if (((action == null || (quantity = action.getQuantity()) == null) ? 0 : quantity.intValue()) > addToCartButtonWithQuantity.getMaxItems()) {
                z11 = false;
                boolean z12 = atom.getAction() == null && z11;
                int quantity2 = itemInfo == null ? itemInfo.getQuantity() : 0;
                if (itemInfo != null) {
                    Long selectedDeliverySchema = itemInfo.getSelectedDeliverySchema();
                    ButtonV3Atom.AddToCartAtom.Action action2 = atom.getAction();
                    if (!Intrinsics.d(selectedDeliverySchema, action2 != null ? action2.getSelectedDeliverySchema() : null) && quantity2 > 0) {
                        return false;
                    }
                }
                return z12;
            }
        }
        z11 = true;
        if (atom.getAction() == null) {
        }
        if (itemInfo == null) {
        }
        if (itemInfo != null) {
        }
        return z12;
    }

    @NotNull
    public final CartAtomViewState computeAddToCartAtom(@NotNull CartState cartState, @NotNull ButtonV3Atom.AddToCartAtom atom, long productId, boolean isInCart) {
        ButtonV3Atom.AddToCartAtom addToCartAtom;
        Intrinsics.checkNotNullParameter(cartState, "cartState");
        Intrinsics.checkNotNullParameter(atom, "atom");
        CartItemInfo cartItemInfo = cartState.getItems().get(Long.valueOf(productId));
        if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButton) {
            addToCartAtom = ButtonV3Atom.AddToCartAtom.AddToCartButton.copy$default((ButtonV3Atom.AddToCartAtom.AddToCartButton) atom, null, isInCart, null, null, null, null, null, null, null, null, null, 2045, null);
        } else if (atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) {
            addToCartAtom = ButtonV3Atom.AddToCartAtom.AddToCartButtonImage.copy$default((ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) atom, isInCart, null, null, null, null, 30, null);
        } else {
            if (!(atom instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity)) {
                throw new o();
            }
            addToCartAtom = null;
        }
        return new CartAtomViewState(addToCartAtom, getIsEnabled(atom, cartItemInfo));
    }

    @NotNull
    public final CartAtomViewState computeButtonWithQuantityAtom(@NotNull CartState cartState, @NotNull ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity atom, long productId) {
        CartItemInfo cartItemInfo;
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity copy;
        Intrinsics.checkNotNullParameter(cartState, "cartState");
        Intrinsics.checkNotNullParameter(atom, "atom");
        CartItemInfo cartItemInfo2 = cartState.getItems().get(Long.valueOf(productId));
        int quantity = cartItemInfo2 != null ? cartItemInfo2.getQuantity() : 0;
        boolean isEnabled = getIsEnabled(atom, cartItemInfo2);
        if (!isEnabled || atom.getCurrentItems() == quantity) {
            cartItemInfo = cartItemInfo2;
            copy = (isEnabled || atom.getCurrentItems() <= 0) ? atom : atom.copy((r32 & 1) != 0 ? atom.maxItems : 0, (r32 & 2) != 0 ? atom.currentItems : 0, (r32 & 4) != 0 ? atom.text : null, (r32 & 8) != 0 ? atom.style : null, (r32 & 16) != 0 ? atom.theme : null, (r32 & 32) != 0 ? atom.mode : null, (r32 & 64) != 0 ? atom.buttonIconId : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? atom.sellerIcon : null, (r32 & 256) != 0 ? atom.qtyTextDisabled : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? atom.buttonSizeMode : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? atom.action : null, (r32 & 2048) != 0 ? atom.context : null, (r32 & 4096) != 0 ? atom.testInfo : null, (r32 & 8192) != 0 ? atom.trackingInfo : null, (r32 & 16384) != 0 ? atom.extend : null);
        } else {
            cartItemInfo = cartItemInfo2;
            copy = atom.copy((r32 & 1) != 0 ? atom.maxItems : 0, (r32 & 2) != 0 ? atom.currentItems : quantity, (r32 & 4) != 0 ? atom.text : null, (r32 & 8) != 0 ? atom.style : null, (r32 & 16) != 0 ? atom.theme : null, (r32 & 32) != 0 ? atom.mode : null, (r32 & 64) != 0 ? atom.buttonIconId : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? atom.sellerIcon : null, (r32 & 256) != 0 ? atom.qtyTextDisabled : false, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? atom.buttonSizeMode : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? atom.action : null, (r32 & 2048) != 0 ? atom.context : null, (r32 & 4096) != 0 ? atom.testInfo : null, (r32 & 8192) != 0 ? atom.trackingInfo : null, (r32 & 16384) != 0 ? atom.extend : null);
        }
        return new CartAtomViewState(copy, getIsEnabled(copy, cartItemInfo));
    }

    public final void setupAddToCartButtonState(SingleAtom atomView, @NotNull CartAtomViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        View first = atomView != null ? ViewGroupExtKt.first(atomView) : null;
        if (first instanceof AddToCartButtonWithQuantityView) {
            ((AddToCartButtonWithQuantityView) first).isEnabledToCart(state.getViewIsEnabled());
        } else if (first instanceof AddToCartButtonView) {
            ((AddToCartButtonView) first).setEnabled(state.getViewIsEnabled());
        }
    }
}
