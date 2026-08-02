package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;

/* compiled from: CatalogSectionDo.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionDo implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionDo> CREATOR = new a();
    public final String b;
    public final List<CatalogBlockState> c;
    public final CatalogExtraDo d;

    /* compiled from: CatalogSectionDo.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionDo createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CatalogSectionDo.class, parcel, arrayList, i, 1);
            }
            return new CatalogSectionDo(readString, arrayList, (CatalogExtraDo) parcel.readParcelable(CatalogSectionDo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionDo[] newArray(int i) {
            return new CatalogSectionDo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogSectionDo(String str, List<? extends CatalogBlockState> list, CatalogExtraDo catalogExtraDo) {
        this.b = str;
        this.c = list;
        this.d = catalogExtraDo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.d, i);
    }
}
