package com.vk.ecomm.products_selection.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: SelectionProductId.kt */
/* loaded from: classes18.dex */
public final class SelectionProductId implements Parcelable {
    public static final Parcelable.Creator<SelectionProductId> CREATOR = new a();
    public final long b;
    public final UserId c;

    /* compiled from: SelectionProductId.kt */
    public static final class a implements Parcelable.Creator<SelectionProductId> {
        @Override // android.os.Parcelable.Creator
        public final SelectionProductId createFromParcel(Parcel parcel) {
            return new SelectionProductId(parcel.readLong(), (UserId) parcel.readParcelable(SelectionProductId.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionProductId[] newArray(int i) {
            return new SelectionProductId[i];
        }
    }

    public SelectionProductId(long j, UserId userId) {
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
        if (!(obj instanceof SelectionProductId)) {
            return false;
        }
        SelectionProductId selectionProductId = (SelectionProductId) obj;
        return this.b == selectionProductId.b && epx.f(this.c, selectionProductId.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionProductId(productId=");
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
