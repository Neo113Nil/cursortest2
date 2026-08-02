package com.vk.superapp.vkpay.checkout.api.dto.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VkTransactionInfo.kt */
/* loaded from: classes6.dex */
public final class VkTransactionInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<VkTransactionInfo> CREATOR = new a();
    public final int b;
    public final String c;
    public final Currency d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTransactionInfo.kt */
    public static final class Currency {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Currency[] $VALUES;
        public static final Currency EUR;
        public static final Currency RUB;
        public static final Currency USD;
        private final String sign;

        static {
            Currency currency = new Currency("RUB", 0, "₽");
            RUB = currency;
            Currency currency2 = new Currency("EUR", 1, "€");
            EUR = currency2;
            Currency currency3 = new Currency("USD", 2, "$");
            USD = currency3;
            Currency[] currencyArr = {currency, currency2, currency3};
            $VALUES = currencyArr;
            $ENTRIES = new asp(currencyArr);
        }

        public Currency(String str, int i, String str2) {
            this.sign = str2;
        }

        public static Currency valueOf(String str) {
            return (Currency) Enum.valueOf(Currency.class, str);
        }

        public static Currency[] values() {
            return (Currency[]) $VALUES.clone();
        }

        public final String h() {
            return this.sign;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkTransactionInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkTransactionInfo a(Serializer serializer) {
            return new VkTransactionInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkTransactionInfo[i];
        }
    }

    public VkTransactionInfo(int i, String str, Currency currency) {
        this.b = i;
        this.c = str;
        this.d = currency;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d.h());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkTransactionInfo)) {
            return false;
        }
        VkTransactionInfo vkTransactionInfo = (VkTransactionInfo) obj;
        return this.b == vkTransactionInfo.b && epx.f(this.c, vkTransactionInfo.c) && this.d == vkTransactionInfo.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return "VkTransactionInfo(amount=" + this.b + ", orderId=" + this.c + ", currency=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public VkTransactionInfo(Serializer serializer) {
        this(serializer.u(), serializer.H(), Currency.valueOf(serializer.H()));
    }
}
