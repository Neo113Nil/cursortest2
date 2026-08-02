package com.vk.superapp.vkpay.checkout.api.dto.model;

import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCheckoutPayMethod.kt */
/* loaded from: classes6.dex */
public final class VkCheckoutPayMethod {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkCheckoutPayMethod[] $VALUES;
    public static final VkCheckoutPayMethod BIND_ID;
    public static final VkCheckoutPayMethod NEW_CARD;
    public static final VkCheckoutPayMethod TOKEN;
    public static final VkCheckoutPayMethod WALLET;
    public static final VkCheckoutPayMethod WALLET_BIND_ID;
    public static final VkCheckoutPayMethod WALLET_NEW_CARD;
    private final String value;

    static {
        VkCheckoutPayMethod vkCheckoutPayMethod = new VkCheckoutPayMethod("WALLET", 0, "wallet");
        WALLET = vkCheckoutPayMethod;
        VkCheckoutPayMethod vkCheckoutPayMethod2 = new VkCheckoutPayMethod("WALLET_BIND_ID", 1, "wallet_bind_id");
        WALLET_BIND_ID = vkCheckoutPayMethod2;
        VkCheckoutPayMethod vkCheckoutPayMethod3 = new VkCheckoutPayMethod("WALLET_NEW_CARD", 2, "wallet_card_data");
        WALLET_NEW_CARD = vkCheckoutPayMethod3;
        VkCheckoutPayMethod vkCheckoutPayMethod4 = new VkCheckoutPayMethod("BIND_ID", 3, DomainCampaignEx.KEY_BIND_ID);
        BIND_ID = vkCheckoutPayMethod4;
        VkCheckoutPayMethod vkCheckoutPayMethod5 = new VkCheckoutPayMethod("NEW_CARD", 4, "card_data");
        NEW_CARD = vkCheckoutPayMethod5;
        VkCheckoutPayMethod vkCheckoutPayMethod6 = new VkCheckoutPayMethod("TOKEN", 5, "token");
        TOKEN = vkCheckoutPayMethod6;
        VkCheckoutPayMethod[] vkCheckoutPayMethodArr = {vkCheckoutPayMethod, vkCheckoutPayMethod2, vkCheckoutPayMethod3, vkCheckoutPayMethod4, vkCheckoutPayMethod5, vkCheckoutPayMethod6};
        $VALUES = vkCheckoutPayMethodArr;
        $ENTRIES = new asp(vkCheckoutPayMethodArr);
    }

    public VkCheckoutPayMethod(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkCheckoutPayMethod valueOf(String str) {
        return (VkCheckoutPayMethod) Enum.valueOf(VkCheckoutPayMethod.class, str);
    }

    public static VkCheckoutPayMethod[] values() {
        return (VkCheckoutPayMethod[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
