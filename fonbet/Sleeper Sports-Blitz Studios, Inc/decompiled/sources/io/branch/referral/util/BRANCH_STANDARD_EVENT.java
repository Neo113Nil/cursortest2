package io.branch.referral.util;

import com.facebook.appevents.internal.ViewHierarchyConstants;

/* loaded from: classes9.dex */
public enum BRANCH_STANDARD_EVENT {
    ADD_TO_CART(ViewHierarchyConstants.ADD_TO_CART),
    ADD_TO_WISHLIST(ViewHierarchyConstants.ADD_TO_WISHLIST),
    VIEW_CART("VIEW_CART"),
    INITIATE_PURCHASE("INITIATE_PURCHASE"),
    ADD_PAYMENT_INFO(ViewHierarchyConstants.ADD_PAYMENT_INFO),
    PURCHASE(ViewHierarchyConstants.PURCHASE),
    SPEND_CREDITS("SPEND_CREDITS"),
    SEARCH(ViewHierarchyConstants.SEARCH),
    VIEW_ITEM("VIEW_ITEM"),
    VIEW_ITEMS("VIEW_ITEMS"),
    RATE("RATE"),
    SHARE("SHARE"),
    COMPLETE_REGISTRATION(ViewHierarchyConstants.COMPLETE_REGISTRATION),
    COMPLETE_TUTORIAL("COMPLETE_TUTORIAL"),
    ACHIEVE_LEVEL("ACHIEVE_LEVEL"),
    UNLOCK_ACHIEVEMENT("UNLOCK_ACHIEVEMENT"),
    INVITE("INVITE"),
    LOGIN("LOGIN"),
    RESERVE("RESERVE"),
    SUBSCRIBE("SUBSCRIBE"),
    START_TRIAL("START_TRIAL"),
    CLICK_AD("CLICK_AD"),
    VIEW_AD("VIEW_AD");

    private final String name;

    BRANCH_STANDARD_EVENT(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
