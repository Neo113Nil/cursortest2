package com.vk.catalog.mvi.block;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: CatalogBlockEntity.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockReorderState$ReorderData$Album implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockReorderState$ReorderData$Album> CREATOR = new a();
    public final long b;
    public final int c;

    /* compiled from: CatalogBlockEntity.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockReorderState$ReorderData$Album> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReorderState$ReorderData$Album createFromParcel(Parcel parcel) {
            return new CatalogBlockReorderState$ReorderData$Album(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReorderState$ReorderData$Album[] newArray(int i) {
            return new CatalogBlockReorderState$ReorderData$Album[i];
        }
    }

    public CatalogBlockReorderState$ReorderData$Album(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlockReorderState$ReorderData$Album)) {
            return false;
        }
        CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album = (CatalogBlockReorderState$ReorderData$Album) obj;
        return this.b == catalogBlockReorderState$ReorderData$Album.b && this.c == catalogBlockReorderState$ReorderData$Album.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album(hostingBlockOwnerId=");
        sb.append(this.b);
        sb.append(", albumId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
