package com.vk.superapp.vkpay.checkout.api.dto.model;

import java.util.Locale;
import org.json.JSONObject;
import xsna.asp;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: VkPayWallet.kt */
/* loaded from: classes6.dex */
public final class VkPayWallet {
    public final int a;
    public final Status b;
    public final int c;
    public final boolean d;
    public final int e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPayWallet.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status ANONYMOUS;
        public static final a Companion;
        public static final Status SIMPLIFIED;
        public static final Status VERIFIED;
        private final String value;

        /* compiled from: VkPayWallet.kt */
        public static final class a {
        }

        static {
            Status status = new Status("ANONYMOUS", 0, "anonymous");
            ANONYMOUS = status;
            Status status2 = new Status("SIMPLIFIED", 1, "simplified");
            SIMPLIFIED = status2;
            Status status3 = new Status("VERIFIED", 2, "verified");
            VERIFIED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
            Companion = new a();
        }

        public Status(String str, int i, String str2) {
            this.value = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public VkPayWallet(JSONObject jSONObject) {
        Status status;
        int optInt = jSONObject.optInt("balance");
        Status.a aVar = Status.Companion;
        String optString = jSONObject.optString("status");
        aVar.getClass();
        String lowerCase = optString.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode == -2095811475) {
            if (lowerCase.equals("anonymous")) {
                status = Status.ANONYMOUS;
            }
            status = Status.ANONYMOUS;
        } else if (hashCode != -1994383672) {
            if (hashCode == -1427350696 && lowerCase.equals("simplified")) {
                status = Status.SIMPLIFIED;
            }
            status = Status.ANONYMOUS;
        } else {
            if (lowerCase.equals("verified")) {
                status = Status.VERIFIED;
            }
            status = Status.ANONYMOUS;
        }
        int optInt2 = jSONObject.optInt("bonus_balance");
        boolean optBoolean = jSONObject.optBoolean("bonus_mode_spend");
        int optInt3 = jSONObject.optInt("broker_balance");
        this.a = optInt;
        this.b = status;
        this.c = optInt2;
        this.d = optBoolean;
        this.e = optInt3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPayWallet)) {
            return false;
        }
        VkPayWallet vkPayWallet = (VkPayWallet) obj;
        return this.a == vkPayWallet.a && this.b == vkPayWallet.b && this.c == vkPayWallet.c && this.d == vkPayWallet.d && this.e == vkPayWallet.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qoy.b(shy.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkPayWallet(balance=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", bonusBalance=");
        sb.append(this.c);
        sb.append(", bonusModeSpend=");
        sb.append(this.d);
        sb.append(", brokerBalance=");
        return vu5.b(sb, this.e, ')');
    }
}
