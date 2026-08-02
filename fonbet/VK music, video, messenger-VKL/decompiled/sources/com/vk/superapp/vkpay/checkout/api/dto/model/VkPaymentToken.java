package com.vk.superapp.vkpay.checkout.api.dto.model;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: VkPaymentToken.kt */
/* loaded from: classes6.dex */
public final class VkPaymentToken {
    public final String a;
    public final TokenType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPaymentToken.kt */
    public static final class TokenType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TokenType[] $VALUES;
        public static final TokenType GOOGLE_PAY;
        public static final TokenType SAMSUNG;
        private final String value;

        static {
            TokenType tokenType = new TokenType("GOOGLE_PAY", 0, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
            GOOGLE_PAY = tokenType;
            TokenType tokenType2 = new TokenType("SAMSUNG", 1, "samsung");
            SAMSUNG = tokenType2;
            TokenType[] tokenTypeArr = {tokenType, tokenType2};
            $VALUES = tokenTypeArr;
            $ENTRIES = new asp(tokenTypeArr);
        }

        public TokenType(String str, int i, String str2) {
            this.value = str2;
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public VkPaymentToken(String str, TokenType tokenType) {
        this.a = str;
        this.b = tokenType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPaymentToken)) {
            return false;
        }
        VkPaymentToken vkPaymentToken = (VkPaymentToken) obj;
        return epx.f(this.a, vkPaymentToken.a) && this.b == vkPaymentToken.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VkPaymentToken(token=" + this.a + ", tokenType=" + this.b + ')';
    }
}
