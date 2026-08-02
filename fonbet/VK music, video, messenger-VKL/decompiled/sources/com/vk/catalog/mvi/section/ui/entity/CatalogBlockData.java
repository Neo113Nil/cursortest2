package com.vk.catalog.mvi.section.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.CatalogBlockState;
import xsna.r2a;
import xsna.s1a;
import xsna.ttk0;
import xsna.uic;
import xsna.utk0;
import xsna.vtk0;
import xsna.xh50;
import xsna.xm00;

/* compiled from: CatalogSectionState.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockData implements Parcelable, uic {
    public static final a CREATOR = new a();
    public final utk0 b;
    public s1a<? super CatalogBlockState> c;
    public xm00 d;

    /* compiled from: CatalogSectionState.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockData> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockData createFromParcel(Parcel parcel) {
            return new CatalogBlockData((CatalogBlockState) parcel.readParcelable(CatalogBlockState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockData[] newArray(int i) {
            return new CatalogBlockData[i];
        }
    }

    public CatalogBlockData(CatalogBlockState catalogBlockState) {
        this.b = vtk0.a(catalogBlockState);
    }

    public final ttk0<r2a> Z() {
        return this.d;
    }

    public final void a0(ttk0<? extends r2a> ttk0Var) {
        this.d = (xm00) ttk0Var;
    }

    @Override // xsna.uic
    public final void clear() {
        s1a<? super CatalogBlockState> s1aVar = this.c;
        if (s1aVar != null) {
            s1aVar.clear();
        }
        this.c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final xh50<CatalogBlockState> e() {
        return this.b;
    }

    public final CatalogBlockState g() {
        return (CatalogBlockState) this.b.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b.getValue(), i);
    }
}
