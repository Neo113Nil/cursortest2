package com.vk.ecomm.cart.impl.cart.ui.dialog;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CartCommunityMenuAction.kt */
/* loaded from: classes18.dex */
public final class CartCommunityMenuAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CartCommunityMenuAction[] $VALUES;
    public static final CartCommunityMenuAction DeleteAll;
    public static final CartCommunityMenuAction Subscribe;
    public static final CartCommunityMenuAction WriteToSeller;

    static {
        CartCommunityMenuAction cartCommunityMenuAction = new CartCommunityMenuAction("Subscribe", 0);
        Subscribe = cartCommunityMenuAction;
        CartCommunityMenuAction cartCommunityMenuAction2 = new CartCommunityMenuAction("WriteToSeller", 1);
        WriteToSeller = cartCommunityMenuAction2;
        CartCommunityMenuAction cartCommunityMenuAction3 = new CartCommunityMenuAction("DeleteAll", 2);
        DeleteAll = cartCommunityMenuAction3;
        CartCommunityMenuAction[] cartCommunityMenuActionArr = {cartCommunityMenuAction, cartCommunityMenuAction2, cartCommunityMenuAction3};
        $VALUES = cartCommunityMenuActionArr;
        $ENTRIES = new asp(cartCommunityMenuActionArr);
    }

    public CartCommunityMenuAction() {
        throw null;
    }

    public static zrp<CartCommunityMenuAction> h() {
        return $ENTRIES;
    }

    public static CartCommunityMenuAction valueOf(String str) {
        return (CartCommunityMenuAction) Enum.valueOf(CartCommunityMenuAction.class, str);
    }

    public static CartCommunityMenuAction[] values() {
        return (CartCommunityMenuAction[]) $VALUES.clone();
    }
}
