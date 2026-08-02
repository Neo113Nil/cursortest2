package com.vk.superapp.vkpay.checkout.data.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCardBind;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.dhr0;
import xsna.e370;
import xsna.gfx0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreditCard.kt */
/* loaded from: classes6.dex */
public final class CreditCard {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CreditCard[] $VALUES;
    public static final CreditCard AMERICAN_EXPRESS;
    public static final a Companion;
    public static final CreditCard DINERS;
    public static final CreditCard DISCOVER;
    public static final CreditCard JCB;
    public static final CreditCard MASTERCARD;
    public static final CreditCard MIR;
    public static final CreditCard UNION;
    public static final CreditCard UNKNOWN;
    public static final CreditCard VISA;
    private final int darkIconRes;
    private final int lightIconRes;

    /* compiled from: CreditCard.kt */
    public static final class a {

        /* compiled from: CreditCard.kt */
        /* renamed from: com.vk.superapp.vkpay.checkout.data.model.CreditCard$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1920a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkCardBind.CardType.values().length];
                try {
                    iArr[VkCardBind.CardType.VISA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VkCardBind.CardType.MASTERCARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VkCardBind.CardType.DINERS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VkCardBind.CardType.UNION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VkCardBind.CardType.DISCOVER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[VkCardBind.CardType.JCB.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[VkCardBind.CardType.AMERICAN_EXPRESS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[VkCardBind.CardType.MIR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[VkCardBind.CardType.UNKNOWN.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        CreditCard creditCard = new CreditCard("MASTERCARD", 0, R.drawable.vk_icon_logo_mastercard_color_28, R.drawable.vk_icon_logo_mastercard_dark_28);
        MASTERCARD = creditCard;
        CreditCard creditCard2 = new CreditCard("VISA", 1, R.drawable.vk_icon_logo_visa_color_28, R.drawable.vk_icon_logo_visa_dark_28);
        VISA = creditCard2;
        CreditCard creditCard3 = new CreditCard("MIR", 2, R.drawable.vk_icon_logo_mir_color_28, R.drawable.vk_icon_logo_mir_dark_28);
        MIR = creditCard3;
        CreditCard creditCard4 = new CreditCard("JCB", 3, R.drawable.vk_icon_vk_pay_checkout_ic_jcb, R.drawable.vk_pay_checkout_ic_jcb_dark);
        JCB = creditCard4;
        CreditCard creditCard5 = new CreditCard("AMERICAN_EXPRESS", 4, R.drawable.vk_icon_logo_american_express_color_28, R.drawable.vk_icon_logo_american_express_dark_28);
        AMERICAN_EXPRESS = creditCard5;
        CreditCard creditCard6 = new CreditCard("DINERS", 5, R.drawable.vk_icon_logo_diners_club_color_28, R.drawable.vk_icon_logo_diners_club_dark_28);
        DINERS = creditCard6;
        CreditCard creditCard7 = new CreditCard("UNION", 6, R.drawable.vk_icon_logo_unionpay_color_28, R.drawable.vk_icon_logo_unionpay_dark_28);
        UNION = creditCard7;
        CreditCard creditCard8 = new CreditCard("DISCOVER", 7, R.drawable.vk_pay_checkout_ic_discover, R.drawable.vk_icon_logo_discover_dark_28);
        DISCOVER = creditCard8;
        CreditCard creditCard9 = new CreditCard(GrsBaseInfo.CountryCodeSource.UNKNOWN, 8, R.drawable.vk_icon_payment_card_outline_28, R.drawable.vk_icon_payment_card_outline_28);
        UNKNOWN = creditCard9;
        CreditCard[] creditCardArr = {creditCard, creditCard2, creditCard3, creditCard4, creditCard5, creditCard6, creditCard7, creditCard8, creditCard9};
        $VALUES = creditCardArr;
        $ENTRIES = new asp(creditCardArr);
        Companion = new a();
    }

    public CreditCard(String str, int i, int i2, int i3) {
        this.lightIconRes = i2;
        this.darkIconRes = i3;
    }

    public static CreditCard valueOf(String str) {
        return (CreditCard) Enum.valueOf(CreditCard.class, str);
    }

    public static CreditCard[] values() {
        return (CreditCard[]) $VALUES.clone();
    }

    public final int h() {
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        return dhr0.M() ? this.darkIconRes : this.lightIconRes;
    }
}
