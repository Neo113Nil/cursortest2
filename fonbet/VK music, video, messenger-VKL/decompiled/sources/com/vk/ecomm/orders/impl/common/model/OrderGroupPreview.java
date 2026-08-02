package com.vk.ecomm.orders.impl.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;

/* compiled from: OrderSource.kt */
/* loaded from: classes18.dex */
public final class OrderGroupPreview implements Parcelable {
    public static final Parcelable.Creator<OrderGroupPreview> CREATOR = new a();
    public final UserId b;
    public final String c;

    /* compiled from: OrderSource.kt */
    public static final class a implements Parcelable.Creator<OrderGroupPreview> {
        @Override // android.os.Parcelable.Creator
        public final OrderGroupPreview createFromParcel(Parcel parcel) {
            return new OrderGroupPreview((UserId) parcel.readParcelable(OrderGroupPreview.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderGroupPreview[] newArray(int i) {
            return new OrderGroupPreview[i];
        }
    }

    public OrderGroupPreview(UserId userId, String str) {
        this.b = userId;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderGroupPreview)) {
            return false;
        }
        OrderGroupPreview orderGroupPreview = (OrderGroupPreview) obj;
        return epx.f(this.b, orderGroupPreview.b) && epx.f(this.c, orderGroupPreview.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderGroupPreview(id=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}
