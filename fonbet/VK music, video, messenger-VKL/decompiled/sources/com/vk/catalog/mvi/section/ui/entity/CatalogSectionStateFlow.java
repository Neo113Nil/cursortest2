package com.vk.catalog.mvi.section.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bea;
import xsna.mm50;
import xsna.uic;
import xsna.utk0;
import xsna.vtk0;
import xsna.xm00;
import xsna.yda;

/* compiled from: CatalogSectionState.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionStateFlow implements Parcelable, uic {
    public static final a CREATOR = new a();
    public final utk0 b;
    public mm50<CatalogSectionState, yda, bea> c;
    public xm00 d;

    /* compiled from: CatalogSectionState.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionStateFlow> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionStateFlow createFromParcel(Parcel parcel) {
            return new CatalogSectionStateFlow((CatalogSectionState) parcel.readParcelable(CatalogSectionState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionStateFlow[] newArray(int i) {
            return new CatalogSectionStateFlow[i];
        }
    }

    public CatalogSectionStateFlow(CatalogSectionState catalogSectionState) {
        this.b = vtk0.a(catalogSectionState);
    }

    @Override // xsna.uic
    public final void clear() {
        mm50<CatalogSectionState, yda, bea> mm50Var = this.c;
        if (mm50Var != null) {
            mm50Var.clear();
        }
        this.c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b.getValue(), i);
    }
}
