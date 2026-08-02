package com.vk.catalog.mvi.block.impl.filtersbottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.lm50;
import xsna.ms9;

/* compiled from: FiltersBottomSheetView.kt */
/* loaded from: classes16.dex */
public final class FilterBottomSheetState implements lm50, Parcelable {
    public static final Parcelable.Creator<FilterBottomSheetState> CREATOR = new a();
    public final List<CatalogFilterOptionDo> b;

    /* compiled from: FiltersBottomSheetView.kt */
    public static final class a implements Parcelable.Creator<FilterBottomSheetState> {
        @Override // android.os.Parcelable.Creator
        public final FilterBottomSheetState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(FilterBottomSheetState.class, parcel, arrayList, i, 1);
            }
            return new FilterBottomSheetState(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FilterBottomSheetState[] newArray(int i) {
            return new FilterBottomSheetState[i];
        }
    }

    public FilterBottomSheetState(List<CatalogFilterOptionDo> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterBottomSheetState) && epx.f(this.b, ((FilterBottomSheetState) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("FilterBottomSheetState(filterOptions="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
