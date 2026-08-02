package com.vk.catalog.mvi.section.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.CatalogBlockState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.zcl;

/* compiled from: CatalogBlockReplacementDo.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockReplacementDo implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockReplacementDo> CREATOR = new a();
    public final List<String> b;
    public final List<CatalogBlockState> c;

    /* compiled from: CatalogBlockReplacementDo.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockReplacementDo> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementDo createFromParcel(Parcel parcel) {
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CatalogBlockReplacementDo.class, parcel, arrayList, i, 1);
            }
            return new CatalogBlockReplacementDo(createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockReplacementDo[] newArray(int i) {
            return new CatalogBlockReplacementDo[i];
        }
    }

    public CatalogBlockReplacementDo() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogBlockReplacementDo(List<String> list, List<? extends CatalogBlockState> list2) {
        this.b = list;
        this.c = list2;
    }

    public CatalogBlockReplacementDo(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EmptyList.b : list2);
    }
}
