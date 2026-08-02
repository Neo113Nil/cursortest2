package com.vk.superapp.vkpay.checkout.api.dto.response;

import java.util.Locale;
import org.json.JSONObject;
import xsna.asp;
import xsna.zrp;

/* compiled from: VkCheckoutResponse.kt */
/* loaded from: classes6.dex */
public abstract class VkCheckoutResponse {
    public final VkCheckoutResponseStatus a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCheckoutResponse.kt */
    public static final class VkCheckoutResponseStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkCheckoutResponseStatus[] $VALUES;
        public static final VkCheckoutResponseStatus ERR_ALREADY_RECOVER_PWD;
        public static final VkCheckoutResponseStatus ERR_ARGUMENTS;
        public static final VkCheckoutResponseStatus ERR_AUTH_DATA_EXPIRED;
        public static final VkCheckoutResponseStatus ERR_AUTH_DATA_MALFORMED;
        public static final VkCheckoutResponseStatus ERR_AUTH_DATA_SIGN;
        public static final VkCheckoutResponseStatus ERR_CARD_DATA;
        public static final VkCheckoutResponseStatus ERR_DUPLICATE;
        public static final VkCheckoutResponseStatus ERR_EMPTY_AUTH_DATA;
        public static final VkCheckoutResponseStatus ERR_EMPTY_BIND_ID;
        public static final VkCheckoutResponseStatus ERR_EMPTY_CARD_DATA;
        public static final VkCheckoutResponseStatus ERR_EMPTY_CHARGE_AMOUNT;
        public static final VkCheckoutResponseStatus ERR_EMPTY_MERCHANT_ID;
        public static final VkCheckoutResponseStatus ERR_LIMIT_PAYER;
        public static final VkCheckoutResponseStatus ERR_MERCHANT_SIGN;
        public static final VkCheckoutResponseStatus ERR_NO_MONEY;
        public static final VkCheckoutResponseStatus ERR_PARSE_REQUEST;
        public static final VkCheckoutResponseStatus ERR_PAYER_PWD_BANNED;
        public static final VkCheckoutResponseStatus ERR_PWD_BANNED;
        public static final VkCheckoutResponseStatus ERR_SYSTEM;
        public static final VkCheckoutResponseStatus ERR_UNKNOWN_MERCHANT_ID;
        public static final VkCheckoutResponseStatus ERR_UNKNOWN_METHOD;
        public static final VkCheckoutResponseStatus ERR_USER_BANNED;
        public static final VkCheckoutResponseStatus ERR_WALLET_ALREADY_EXISTS;
        public static final VkCheckoutResponseStatus ERR_WRONG_CHARGE_AMOUNT;
        public static final VkCheckoutResponseStatus ERR_WRONG_PASSWORD;
        public static final VkCheckoutResponseStatus ERR_WRONG_PIN;
        public static final VkCheckoutResponseStatus OK;

        static {
            VkCheckoutResponseStatus vkCheckoutResponseStatus = new VkCheckoutResponseStatus("OK", 0);
            OK = vkCheckoutResponseStatus;
            VkCheckoutResponseStatus vkCheckoutResponseStatus2 = new VkCheckoutResponseStatus("ERR_SYSTEM", 1);
            ERR_SYSTEM = vkCheckoutResponseStatus2;
            VkCheckoutResponseStatus vkCheckoutResponseStatus3 = new VkCheckoutResponseStatus("ERR_PARSE_REQUEST", 2);
            ERR_PARSE_REQUEST = vkCheckoutResponseStatus3;
            VkCheckoutResponseStatus vkCheckoutResponseStatus4 = new VkCheckoutResponseStatus("ERR_EMPTY_AUTH_DATA", 3);
            ERR_EMPTY_AUTH_DATA = vkCheckoutResponseStatus4;
            VkCheckoutResponseStatus vkCheckoutResponseStatus5 = new VkCheckoutResponseStatus("ERR_AUTH_DATA_SIGN", 4);
            ERR_AUTH_DATA_SIGN = vkCheckoutResponseStatus5;
            VkCheckoutResponseStatus vkCheckoutResponseStatus6 = new VkCheckoutResponseStatus("ERR_WRONG_PIN", 5);
            ERR_WRONG_PIN = vkCheckoutResponseStatus6;
            VkCheckoutResponseStatus vkCheckoutResponseStatus7 = new VkCheckoutResponseStatus("ERR_WRONG_PASSWORD", 6);
            ERR_WRONG_PASSWORD = vkCheckoutResponseStatus7;
            VkCheckoutResponseStatus vkCheckoutResponseStatus8 = new VkCheckoutResponseStatus("ERR_PWD_BANNED", 7);
            ERR_PWD_BANNED = vkCheckoutResponseStatus8;
            VkCheckoutResponseStatus vkCheckoutResponseStatus9 = new VkCheckoutResponseStatus("ERR_PAYER_PWD_BANNED", 8);
            ERR_PAYER_PWD_BANNED = vkCheckoutResponseStatus9;
            VkCheckoutResponseStatus vkCheckoutResponseStatus10 = new VkCheckoutResponseStatus("ERR_USER_BANNED", 9);
            ERR_USER_BANNED = vkCheckoutResponseStatus10;
            VkCheckoutResponseStatus vkCheckoutResponseStatus11 = new VkCheckoutResponseStatus("ERR_ARGUMENTS", 10);
            ERR_ARGUMENTS = vkCheckoutResponseStatus11;
            VkCheckoutResponseStatus vkCheckoutResponseStatus12 = new VkCheckoutResponseStatus("ERR_MERCHANT_SIGN", 11);
            ERR_MERCHANT_SIGN = vkCheckoutResponseStatus12;
            VkCheckoutResponseStatus vkCheckoutResponseStatus13 = new VkCheckoutResponseStatus("ERR_EMPTY_CARD_DATA", 12);
            ERR_EMPTY_CARD_DATA = vkCheckoutResponseStatus13;
            VkCheckoutResponseStatus vkCheckoutResponseStatus14 = new VkCheckoutResponseStatus("ERR_EMPTY_CHARGE_AMOUNT", 13);
            ERR_EMPTY_CHARGE_AMOUNT = vkCheckoutResponseStatus14;
            VkCheckoutResponseStatus vkCheckoutResponseStatus15 = new VkCheckoutResponseStatus("ERR_WRONG_CHARGE_AMOUNT", 14);
            ERR_WRONG_CHARGE_AMOUNT = vkCheckoutResponseStatus15;
            VkCheckoutResponseStatus vkCheckoutResponseStatus16 = new VkCheckoutResponseStatus("ERR_EMPTY_MERCHANT_ID", 15);
            ERR_EMPTY_MERCHANT_ID = vkCheckoutResponseStatus16;
            VkCheckoutResponseStatus vkCheckoutResponseStatus17 = new VkCheckoutResponseStatus("ERR_DUPLICATE", 16);
            ERR_DUPLICATE = vkCheckoutResponseStatus17;
            VkCheckoutResponseStatus vkCheckoutResponseStatus18 = new VkCheckoutResponseStatus("ERR_UNKNOWN_METHOD", 17);
            ERR_UNKNOWN_METHOD = vkCheckoutResponseStatus18;
            VkCheckoutResponseStatus vkCheckoutResponseStatus19 = new VkCheckoutResponseStatus("ERR_UNKNOWN_MERCHANT_ID", 18);
            ERR_UNKNOWN_MERCHANT_ID = vkCheckoutResponseStatus19;
            VkCheckoutResponseStatus vkCheckoutResponseStatus20 = new VkCheckoutResponseStatus("ERR_EMPTY_BIND_ID", 19);
            ERR_EMPTY_BIND_ID = vkCheckoutResponseStatus20;
            VkCheckoutResponseStatus vkCheckoutResponseStatus21 = new VkCheckoutResponseStatus("ERR_LIMIT_PAYER", 20);
            ERR_LIMIT_PAYER = vkCheckoutResponseStatus21;
            VkCheckoutResponseStatus vkCheckoutResponseStatus22 = new VkCheckoutResponseStatus("ERR_NO_MONEY", 21);
            ERR_NO_MONEY = vkCheckoutResponseStatus22;
            VkCheckoutResponseStatus vkCheckoutResponseStatus23 = new VkCheckoutResponseStatus("ERR_CARD_DATA", 22);
            ERR_CARD_DATA = vkCheckoutResponseStatus23;
            VkCheckoutResponseStatus vkCheckoutResponseStatus24 = new VkCheckoutResponseStatus("ERR_AUTH_DATA_MALFORMED", 23);
            ERR_AUTH_DATA_MALFORMED = vkCheckoutResponseStatus24;
            VkCheckoutResponseStatus vkCheckoutResponseStatus25 = new VkCheckoutResponseStatus("ERR_WALLET_ALREADY_EXISTS", 24);
            ERR_WALLET_ALREADY_EXISTS = vkCheckoutResponseStatus25;
            VkCheckoutResponseStatus vkCheckoutResponseStatus26 = new VkCheckoutResponseStatus("ERR_ALREADY_RECOVER_PWD", 25);
            ERR_ALREADY_RECOVER_PWD = vkCheckoutResponseStatus26;
            VkCheckoutResponseStatus vkCheckoutResponseStatus27 = new VkCheckoutResponseStatus("ERR_AUTH_DATA_EXPIRED", 26);
            ERR_AUTH_DATA_EXPIRED = vkCheckoutResponseStatus27;
            VkCheckoutResponseStatus[] vkCheckoutResponseStatusArr = {vkCheckoutResponseStatus, vkCheckoutResponseStatus2, vkCheckoutResponseStatus3, vkCheckoutResponseStatus4, vkCheckoutResponseStatus5, vkCheckoutResponseStatus6, vkCheckoutResponseStatus7, vkCheckoutResponseStatus8, vkCheckoutResponseStatus9, vkCheckoutResponseStatus10, vkCheckoutResponseStatus11, vkCheckoutResponseStatus12, vkCheckoutResponseStatus13, vkCheckoutResponseStatus14, vkCheckoutResponseStatus15, vkCheckoutResponseStatus16, vkCheckoutResponseStatus17, vkCheckoutResponseStatus18, vkCheckoutResponseStatus19, vkCheckoutResponseStatus20, vkCheckoutResponseStatus21, vkCheckoutResponseStatus22, vkCheckoutResponseStatus23, vkCheckoutResponseStatus24, vkCheckoutResponseStatus25, vkCheckoutResponseStatus26, vkCheckoutResponseStatus27};
            $VALUES = vkCheckoutResponseStatusArr;
            $ENTRIES = new asp(vkCheckoutResponseStatusArr);
        }

        public VkCheckoutResponseStatus() {
            throw null;
        }

        public static VkCheckoutResponseStatus valueOf(String str) {
            return (VkCheckoutResponseStatus) Enum.valueOf(VkCheckoutResponseStatus.class, str);
        }

        public static VkCheckoutResponseStatus[] values() {
            return (VkCheckoutResponseStatus[]) $VALUES.clone();
        }
    }

    public VkCheckoutResponse(JSONObject jSONObject) {
        Object obj;
        String optString = jSONObject.optString("errcode");
        Object obj2 = VkCheckoutResponseStatus.ERR_SYSTEM;
        if (optString != null) {
            try {
                obj = Enum.valueOf(VkCheckoutResponseStatus.class, optString.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            if (obj != null) {
                obj2 = obj;
            }
        }
        this.a = (VkCheckoutResponseStatus) obj2;
    }
}
