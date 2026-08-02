package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CatalogFilterDo.kt */
/* loaded from: classes16.dex */
public final class CatalogFilterOptionDo implements Parcelable {
    public static final Parcelable.Creator<CatalogFilterOptionDo> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final String d;

    /* compiled from: CatalogFilterDo.kt */
    public static final class a implements Parcelable.Creator<CatalogFilterOptionDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogFilterOptionDo createFromParcel(Parcel parcel) {
            return new CatalogFilterOptionDo(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogFilterOptionDo[] newArray(int i) {
            return new CatalogFilterOptionDo[i];
        }
    }

    public CatalogFilterOptionDo(String str, boolean z, String str2) {
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.c;
    }

    public final String getTitle() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
