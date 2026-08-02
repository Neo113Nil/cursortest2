package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;

/* compiled from: SuperAppUniversalWidgetTypeTableRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeTableRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeTableRootStyleDto> CREATOR = new a();

    @pmi0("columns")
    private final List<SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto> columns;

    @pmi0("sizes")
    private final List<Integer> sizes;

    /* compiled from: SuperAppUniversalWidgetTypeTableRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeTableRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeTableRootStyleDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = pm0.b(parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new SuperAppUniversalWidgetTypeTableRootStyleDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeTableRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeTableRootStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeTableRootStyleDto(List<Integer> list, List<SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto> list2) {
        this.sizes = list;
        this.columns = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeTableRootStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeTableRootStyleDto superAppUniversalWidgetTypeTableRootStyleDto = (SuperAppUniversalWidgetTypeTableRootStyleDto) obj;
        return epx.f(this.sizes, superAppUniversalWidgetTypeTableRootStyleDto.sizes) && epx.f(this.columns, superAppUniversalWidgetTypeTableRootStyleDto.columns);
    }

    public final int hashCode() {
        return this.columns.hashCode() + (this.sizes.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeTableRootStyleDto(sizes=");
        sb.append(this.sizes);
        sb.append(", columns=");
        return ms9.a(')', sb, this.columns);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sizes);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        Iterator a3 = ao.a(parcel, this.columns);
        while (a3.hasNext()) {
            ((SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
