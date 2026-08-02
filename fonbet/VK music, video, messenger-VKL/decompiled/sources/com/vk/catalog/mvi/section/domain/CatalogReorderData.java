package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CatalogReorderData.kt */
/* loaded from: classes16.dex */
public final class CatalogReorderData implements Parcelable {
    public static final Parcelable.Creator<CatalogReorderData> CREATOR = new a();
    public final String b;
    public final int c;
    public final String d;
    public final int e;

    /* compiled from: CatalogReorderData.kt */
    public static final class a implements Parcelable.Creator<CatalogReorderData> {
        @Override // android.os.Parcelable.Creator
        public final CatalogReorderData createFromParcel(Parcel parcel) {
            return new CatalogReorderData(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogReorderData[] newArray(int i) {
            return new CatalogReorderData[i];
        }
    }

    public CatalogReorderData(String str, int i, String str2, int i2) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogReorderData)) {
            return false;
        }
        CatalogReorderData catalogReorderData = (CatalogReorderData) obj;
        return epx.f(this.b, catalogReorderData.b) && this.c == catalogReorderData.c && epx.f(this.d, catalogReorderData.d) && this.e == catalogReorderData.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogReorderData(fromBlockId=");
        sb.append(this.b);
        sb.append(", fromIndex=");
        sb.append(this.c);
        sb.append(", toBlockId=");
        sb.append(this.d);
        sb.append(", toIndex=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
