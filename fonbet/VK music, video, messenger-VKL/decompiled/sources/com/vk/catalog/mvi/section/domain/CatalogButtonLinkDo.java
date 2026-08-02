package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;

/* compiled from: CatalogButtonLinkDo.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonLinkDo implements Parcelable {
    public static final Parcelable.Creator<CatalogButtonLinkDo> CREATOR = new a();
    public final CatalogLinkButtonActionDo b;

    /* compiled from: CatalogButtonLinkDo.kt */
    public static final class a implements Parcelable.Creator<CatalogButtonLinkDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogButtonLinkDo createFromParcel(Parcel parcel) {
            return new CatalogButtonLinkDo((CatalogLinkButtonActionDo) parcel.readParcelable(CatalogButtonLinkDo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogButtonLinkDo[] newArray(int i) {
            return new CatalogButtonLinkDo[i];
        }
    }

    public CatalogButtonLinkDo(CatalogLinkButtonActionDo catalogLinkButtonActionDo) {
        this.b = catalogLinkButtonActionDo;
    }

    public final CatalogLinkButtonActionDo d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
