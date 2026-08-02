package com.vk.catalog.mvi.section.screen.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.section.api.CatalogSearchStatInfo;
import xsna.epx;
import xsna.urd0;

/* compiled from: CatalogSectionScreenArguments.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionScreenArguments implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionScreenArguments> CREATOR = new a();
    public final String b;
    public final String c;
    public final CatalogSearchStatInfo d;

    /* compiled from: CatalogSectionScreenArguments.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionScreenArguments> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionScreenArguments createFromParcel(Parcel parcel) {
            return new CatalogSectionScreenArguments(parcel.readString(), parcel.readString(), (CatalogSearchStatInfo) parcel.readParcelable(CatalogSectionScreenArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionScreenArguments[] newArray(int i) {
            return new CatalogSectionScreenArguments[i];
        }
    }

    public CatalogSectionScreenArguments(String str, String str2, CatalogSearchStatInfo catalogSearchStatInfo) {
        this.b = str;
        this.c = str2;
        this.d = catalogSearchStatInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionScreenArguments)) {
            return false;
        }
        CatalogSectionScreenArguments catalogSectionScreenArguments = (CatalogSectionScreenArguments) obj;
        return epx.f(this.b, catalogSectionScreenArguments.b) && epx.f(this.c, catalogSectionScreenArguments.c) && epx.f(this.d, catalogSectionScreenArguments.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        CatalogSearchStatInfo catalogSearchStatInfo = this.d;
        return a2 + (catalogSearchStatInfo == null ? 0 : catalogSearchStatInfo.hashCode());
    }

    public final String toString() {
        return "CatalogSectionScreenArguments(title=" + this.b + ", sectionId=" + this.c + ", searchStatInfo=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
