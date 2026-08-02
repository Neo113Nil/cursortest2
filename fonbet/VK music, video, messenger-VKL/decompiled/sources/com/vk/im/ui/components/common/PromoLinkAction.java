package com.vk.im.ui.components.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoLinkAction.kt */
/* loaded from: classes2.dex */
public final class PromoLinkAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PromoLinkAction[] $VALUES;
    public static final PromoLinkAction HIDE_PROMO_LINK;

    static {
        PromoLinkAction promoLinkAction = new PromoLinkAction("HIDE_PROMO_LINK", 0);
        HIDE_PROMO_LINK = promoLinkAction;
        PromoLinkAction[] promoLinkActionArr = {promoLinkAction};
        $VALUES = promoLinkActionArr;
        $ENTRIES = new asp(promoLinkActionArr);
    }

    public PromoLinkAction() {
        throw null;
    }

    public static PromoLinkAction valueOf(String str) {
        return (PromoLinkAction) Enum.valueOf(PromoLinkAction.class, str);
    }

    public static PromoLinkAction[] values() {
        return (PromoLinkAction[]) $VALUES.clone();
    }
}
