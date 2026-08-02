package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumContainerViewPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumContainerViewPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumContainerViewPropsDto> CREATOR = new a();

    @pmi0("subviews")
    private final List<AtumAnyViewDto> subviews;

    /* compiled from: AtumContainerViewPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumContainerViewPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumContainerViewPropsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AtumContainerViewPropsDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AtumContainerViewPropsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumContainerViewPropsDto[] newArray(int i) {
            return new AtumContainerViewPropsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtumContainerViewPropsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<AtumAnyViewDto> d() {
        return this.subviews;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumContainerViewPropsDto) && epx.f(this.subviews, ((AtumContainerViewPropsDto) obj).subviews);
    }

    public final int hashCode() {
        List<AtumAnyViewDto> list = this.subviews;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AtumContainerViewPropsDto(subviews="), this.subviews);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AtumAnyViewDto> list = this.subviews;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtumContainerViewPropsDto(List<? extends AtumAnyViewDto> list) {
        this.subviews = list;
    }

    public /* synthetic */ AtumContainerViewPropsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
