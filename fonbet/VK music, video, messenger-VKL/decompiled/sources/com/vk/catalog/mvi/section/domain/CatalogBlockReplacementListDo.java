package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.zcl;

/* compiled from: CatalogBlockReplacementListDo.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockReplacementListDo implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockReplacementListDo> CREATOR = new a();
    public final List<CatalogBlockReplacementDo> b;
    public final CatalogExtraDo c;

    /* compiled from: CatalogBlockReplacementListDo.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockReplacementListDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementListDo createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CatalogBlockReplacementDo.CREATOR, parcel, arrayList, i, 1);
            }
            return new CatalogBlockReplacementListDo(arrayList, (CatalogExtraDo) parcel.readParcelable(CatalogBlockReplacementListDo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementListDo[] newArray(int i) {
            return new CatalogBlockReplacementListDo[i];
        }
    }

    public CatalogBlockReplacementListDo() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((CatalogBlockReplacementDo) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
    }

    public CatalogBlockReplacementListDo(List<CatalogBlockReplacementDo> list, CatalogExtraDo catalogExtraDo) {
        this.b = list;
        this.c = catalogExtraDo;
    }

    public CatalogBlockReplacementListDo(List list, CatalogExtraDo catalogExtraDo, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? new CatalogExtraDo(null, null, null, 7, null) : catalogExtraDo);
    }
}
