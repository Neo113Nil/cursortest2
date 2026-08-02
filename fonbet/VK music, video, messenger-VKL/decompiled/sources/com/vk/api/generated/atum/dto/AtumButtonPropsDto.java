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

/* compiled from: AtumButtonPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumButtonPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumButtonPropsDto> CREATOR = new a();

    @pmi0("actions")
    private final List<AtumAnyActionDto> actions;

    /* compiled from: AtumButtonPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumButtonPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumButtonPropsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AtumButtonPropsDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AtumButtonPropsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumButtonPropsDto[] newArray(int i) {
            return new AtumButtonPropsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtumButtonPropsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumButtonPropsDto) && epx.f(this.actions, ((AtumButtonPropsDto) obj).actions);
    }

    public final int hashCode() {
        List<AtumAnyActionDto> list = this.actions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AtumButtonPropsDto(actions="), this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AtumAnyActionDto> list = this.actions;
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
    public AtumButtonPropsDto(List<? extends AtumAnyActionDto> list) {
        this.actions = list;
    }

    public /* synthetic */ AtumButtonPropsDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
