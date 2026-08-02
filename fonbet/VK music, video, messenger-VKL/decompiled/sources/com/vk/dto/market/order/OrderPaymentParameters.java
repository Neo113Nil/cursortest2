package com.vk.dto.market.order;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: OrderPaymentParameters.kt */
/* loaded from: classes18.dex */
public final class OrderPaymentParameters implements Parcelable {
    public static final Parcelable.Creator<OrderPaymentParameters> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: OrderPaymentParameters.kt */
    public static final class a implements Parcelable.Creator<OrderPaymentParameters> {
        @Override // android.os.Parcelable.Creator
        public final OrderPaymentParameters createFromParcel(Parcel parcel) {
            return new OrderPaymentParameters(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderPaymentParameters[] newArray(int i) {
            return new OrderPaymentParameters[i];
        }
    }

    public OrderPaymentParameters(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPaymentParameters)) {
            return false;
        }
        OrderPaymentParameters orderPaymentParameters = (OrderPaymentParameters) obj;
        return epx.f(this.b, orderPaymentParameters.b) && epx.f(this.c, orderPaymentParameters.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderPaymentParameters(url=");
        sb.append(this.b);
        sb.append(", vkPayParameters=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
