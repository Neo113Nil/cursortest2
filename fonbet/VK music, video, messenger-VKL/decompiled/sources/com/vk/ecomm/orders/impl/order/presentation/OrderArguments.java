package com.vk.ecomm.orders.impl.order.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: OrderArguments.kt */
/* loaded from: classes18.dex */
public final class OrderArguments implements Parcelable {
    public static final Parcelable.Creator<OrderArguments> CREATOR = new a();
    public final UserId b;
    public final int c;
    public final String d;

    /* compiled from: OrderArguments.kt */
    public static final class a implements Parcelable.Creator<OrderArguments> {
        @Override // android.os.Parcelable.Creator
        public final OrderArguments createFromParcel(Parcel parcel) {
            return new OrderArguments((UserId) parcel.readParcelable(OrderArguments.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderArguments[] newArray(int i) {
            return new OrderArguments[i];
        }
    }

    public OrderArguments(UserId userId, int i, String str) {
        this.b = userId;
        this.c = i;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderArguments)) {
            return false;
        }
        OrderArguments orderArguments = (OrderArguments) obj;
        return epx.f(this.b, orderArguments.b) && this.c == orderArguments.c && epx.f(this.d, orderArguments.d);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderArguments(userId=");
        sb.append(this.b);
        sb.append(", orderId=");
        sb.append(this.c);
        sb.append(", displayedOrderId=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}
