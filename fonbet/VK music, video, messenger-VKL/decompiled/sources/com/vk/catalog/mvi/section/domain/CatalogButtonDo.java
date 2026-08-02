package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;

/* compiled from: CatalogButtonDo.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonDo implements Parcelable {
    public static final Parcelable.Creator<CatalogButtonDo> CREATOR = new a();
    public final String b;
    public final CatalogLinkButtonActionDo c;

    /* compiled from: CatalogButtonDo.kt */
    public static final class a implements Parcelable.Creator<CatalogButtonDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogButtonDo createFromParcel(Parcel parcel) {
            return new CatalogButtonDo(parcel.readString(), (CatalogLinkButtonActionDo) parcel.readParcelable(CatalogButtonDo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogButtonDo[] newArray(int i) {
            return new CatalogButtonDo[i];
        }
    }

    public CatalogButtonDo(String str, CatalogLinkButtonActionDo catalogLinkButtonActionDo) {
        this.b = str;
        this.c = catalogLinkButtonActionDo;
    }

    public final CatalogLinkButtonActionDo d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getTitle() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
