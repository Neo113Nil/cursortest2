package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.zcl;

/* compiled from: CatalogBlockDo.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockDo implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockDo> CREATOR = new a();
    public final List<CatalogBlockState> b;
    public final CatalogExtraDo c;

    /* compiled from: CatalogBlockDo.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockDo createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CatalogBlockDo.class, parcel, arrayList, i, 1);
            }
            return new CatalogBlockDo(arrayList, (CatalogExtraDo) parcel.readParcelable(CatalogBlockDo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockDo[] newArray(int i) {
            return new CatalogBlockDo[i];
        }
    }

    public CatalogBlockDo() {
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
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.c, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogBlockDo(List<? extends CatalogBlockState> list, CatalogExtraDo catalogExtraDo) {
        this.b = list;
        this.c = catalogExtraDo;
    }

    public CatalogBlockDo(List list, CatalogExtraDo catalogExtraDo, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? new CatalogExtraDo(null, null, null, 7, null) : catalogExtraDo);
    }
}
