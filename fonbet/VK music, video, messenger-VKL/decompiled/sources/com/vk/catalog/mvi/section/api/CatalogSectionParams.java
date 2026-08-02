package com.vk.catalog.mvi.section.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: CatalogSectionParams.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionParams implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionParams> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final CatalogPerformanceMetrics g;

    /* compiled from: CatalogSectionParams.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionParams> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String readString = parcel.readString();
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new CatalogSectionParams(readString, z5, z3, z4, z, null, 32, null);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionParams[] newArray(int i) {
            return new CatalogSectionParams[i];
        }
    }

    public CatalogSectionParams(String str, boolean z, boolean z2, boolean z3, boolean z4, CatalogPerformanceMetrics catalogPerformanceMetrics) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = catalogPerformanceMetrics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionParams)) {
            return false;
        }
        CatalogSectionParams catalogSectionParams = (CatalogSectionParams) obj;
        return epx.f(this.b, catalogSectionParams.b) && this.c == catalogSectionParams.c && this.d == catalogSectionParams.d && this.e == catalogSectionParams.e && this.f == catalogSectionParams.f && epx.f(this.g, catalogSectionParams.g);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        CatalogPerformanceMetrics catalogPerformanceMetrics = this.g;
        return b + (catalogPerformanceMetrics == null ? 0 : catalogPerformanceMetrics.hashCode());
    }

    public final String toString() {
        return "CatalogSectionParams(sectionId=" + this.b + ", refreshOnInit=" + this.c + ", isPTREnabled=" + this.d + ", isReorderEnabled=" + this.e + ", isGridLayout=" + this.f + ", metrics=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ CatalogSectionParams(String str, boolean z, boolean z2, boolean z3, boolean z4, CatalogPerformanceMetrics catalogPerformanceMetrics, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? null : catalogPerformanceMetrics);
    }
}
