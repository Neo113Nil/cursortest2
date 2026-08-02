package com.vk.superapp.vkpay.checkout.api.dto.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VkCardBind.kt */
/* loaded from: classes6.dex */
public final class VkCardBind {
    public final String a;
    public final String b;
    public final String c;
    public final CardType d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCardBind.kt */
    public static final class CardType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CardType[] $VALUES;
        public static final CardType AMERICAN_EXPRESS;
        public static final a Companion;
        public static final CardType DINERS;
        public static final CardType DISCOVER;
        public static final CardType JCB;
        public static final CardType MASTERCARD;
        public static final CardType MIR;
        public static final CardType UNION;
        public static final CardType UNKNOWN;
        public static final CardType VISA;

        /* compiled from: VkCardBind.kt */
        public static final class a {
        }

        static {
            CardType cardType = new CardType("VISA", 0);
            VISA = cardType;
            CardType cardType2 = new CardType("MASTERCARD", 1);
            MASTERCARD = cardType2;
            CardType cardType3 = new CardType("MIR", 2);
            MIR = cardType3;
            CardType cardType4 = new CardType("JCB", 3);
            JCB = cardType4;
            CardType cardType5 = new CardType("AMERICAN_EXPRESS", 4);
            AMERICAN_EXPRESS = cardType5;
            CardType cardType6 = new CardType("DINERS", 5);
            DINERS = cardType6;
            CardType cardType7 = new CardType("UNION", 6);
            UNION = cardType7;
            CardType cardType8 = new CardType("DISCOVER", 7);
            DISCOVER = cardType8;
            CardType cardType9 = new CardType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 8);
            UNKNOWN = cardType9;
            CardType[] cardTypeArr = {cardType, cardType2, cardType3, cardType4, cardType5, cardType6, cardType7, cardType8, cardType9};
            $VALUES = cardTypeArr;
            $ENTRIES = new asp(cardTypeArr);
            Companion = new a();
        }

        public CardType() {
            throw null;
        }

        public static CardType valueOf(String str) {
            return (CardType) Enum.valueOf(CardType.class, str);
        }

        public static CardType[] values() {
            return (CardType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public VkCardBind(JSONObject jSONObject) {
        CardType cardType;
        String optString = jSONObject.optString(DomainCampaignEx.KEY_BIND_ID);
        String optString2 = jSONObject.optString("card_mask");
        String optString3 = jSONObject.optString("exp_date");
        CardType.a aVar = CardType.Companion;
        String optString4 = jSONObject.optString("card_type");
        aVar.getClass();
        switch (optString4.hashCode()) {
            case -602196168:
                if (optString4.equals("union_pay")) {
                    cardType = CardType.UNION;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            case 105033:
                if (optString4.equals("jcb")) {
                    cardType = CardType.JCB;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            case 108118:
                if (optString4.equals("mir")) {
                    cardType = CardType.MIR;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            case 3619905:
                if (optString4.equals("visa")) {
                    cardType = CardType.VISA;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            case 273184745:
                if (optString4.equals("discover")) {
                    cardType = CardType.DISCOVER;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            case 1220622029:
                if (optString4.equals("master_card")) {
                    cardType = CardType.MASTERCARD;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            case 1302231633:
                if (optString4.equals("american_express")) {
                    cardType = CardType.AMERICAN_EXPRESS;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            case 1692446584:
                if (optString4.equals("diners_club")) {
                    cardType = CardType.DINERS;
                    break;
                }
                cardType = CardType.UNKNOWN;
                break;
            default:
                cardType = CardType.UNKNOWN;
                break;
        }
        this.a = optString;
        this.b = optString2;
        this.c = optString3;
        this.d = cardType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkCardBind)) {
            return false;
        }
        VkCardBind vkCardBind = (VkCardBind) obj;
        return epx.f(this.a, vkCardBind.a) && epx.f(this.b, vkCardBind.b) && epx.f(this.c, vkCardBind.c) && this.d == vkCardBind.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "VkCardBind(bindId=" + this.a + ", cardMask=" + this.b + ", expirationDate=" + this.c + ", cardType=" + this.d + ')';
    }
}
