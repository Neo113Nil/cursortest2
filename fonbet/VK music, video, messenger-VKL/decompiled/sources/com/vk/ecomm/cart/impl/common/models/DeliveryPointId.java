package com.vk.ecomm.cart.impl.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;

/* compiled from: DeliveryPointId.kt */
/* loaded from: classes18.dex */
public final class DeliveryPointId implements Parcelable {
    public static final Parcelable.Creator<DeliveryPointId> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;

    /* compiled from: DeliveryPointId.kt */
    public static final class a implements Parcelable.Creator<DeliveryPointId> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryPointId createFromParcel(Parcel parcel) {
            return new DeliveryPointId(parcel.readInt(), (UserId) parcel.readParcelable(DeliveryPointId.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryPointId[] newArray(int i) {
            return new DeliveryPointId[i];
        }
    }

    public DeliveryPointId(int i, UserId userId, String str) {
        this.b = i;
        this.c = userId;
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
        if (!(obj instanceof DeliveryPointId)) {
            return false;
        }
        DeliveryPointId deliveryPointId = (DeliveryPointId) obj;
        return this.b == deliveryPointId.b && epx.f(this.c, deliveryPointId.c) && epx.f(this.d, deliveryPointId.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        UserId userId = this.c;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPointId(id=");
        sb.append(this.b);
        sb.append(", groupId=");
        sb.append(this.c);
        sb.append(", externalId=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
