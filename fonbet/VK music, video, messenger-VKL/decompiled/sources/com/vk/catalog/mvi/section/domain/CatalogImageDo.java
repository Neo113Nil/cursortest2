package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CatalogImageDo.kt */
/* loaded from: classes16.dex */
public final class CatalogImageDo implements Parcelable {
    public static final Parcelable.Creator<CatalogImageDo> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;

    /* compiled from: CatalogImageDo.kt */
    public static final class a implements Parcelable.Creator<CatalogImageDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogImageDo createFromParcel(Parcel parcel) {
            return new CatalogImageDo(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogImageDo[] newArray(int i) {
            return new CatalogImageDo[i];
        }
    }

    public CatalogImageDo(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getUrl() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
