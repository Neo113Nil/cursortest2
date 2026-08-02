package com.vk.ecomm.products_multipicker.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: MultipickerProductId.kt */
/* loaded from: classes18.dex */
public final class MultipickerProductId implements Parcelable {
    public static final Parcelable.Creator<MultipickerProductId> CREATOR = new a();
    public final long b;
    public final UserId c;

    /* compiled from: MultipickerProductId.kt */
    public static final class a implements Parcelable.Creator<MultipickerProductId> {
        @Override // android.os.Parcelable.Creator
        public final MultipickerProductId createFromParcel(Parcel parcel) {
            return new MultipickerProductId(parcel.readLong(), (UserId) parcel.readParcelable(MultipickerProductId.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MultipickerProductId[] newArray(int i) {
            return new MultipickerProductId[i];
        }
    }

    public MultipickerProductId(long j, UserId userId) {
        this.b = j;
        this.c = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipickerProductId)) {
            return false;
        }
        MultipickerProductId multipickerProductId = (MultipickerProductId) obj;
        return this.b == multipickerProductId.b && epx.f(this.c, multipickerProductId.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipickerProductId(productId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        return gp.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
