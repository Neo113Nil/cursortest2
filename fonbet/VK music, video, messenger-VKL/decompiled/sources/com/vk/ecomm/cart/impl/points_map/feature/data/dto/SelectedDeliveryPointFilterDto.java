package com.vk.ecomm.cart.impl.points_map.feature.data.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;

/* compiled from: SelectedDeliveryPointFilterDto.kt */
/* loaded from: classes18.dex */
public final class SelectedDeliveryPointFilterDto implements Parcelable {
    public static final Parcelable.Creator<SelectedDeliveryPointFilterDto> CREATOR = new a();

    @pmi0("field")
    private final String field;

    @pmi0("values")
    private final List<Integer> values;

    /* compiled from: SelectedDeliveryPointFilterDto.kt */
    public static final class a implements Parcelable.Creator<SelectedDeliveryPointFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final SelectedDeliveryPointFilterDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new SelectedDeliveryPointFilterDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedDeliveryPointFilterDto[] newArray(int i) {
            return new SelectedDeliveryPointFilterDto[i];
        }
    }

    public SelectedDeliveryPointFilterDto(String str, List<Integer> list) {
        this.field = str;
        this.values = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedDeliveryPointFilterDto)) {
            return false;
        }
        SelectedDeliveryPointFilterDto selectedDeliveryPointFilterDto = (SelectedDeliveryPointFilterDto) obj;
        return epx.f(this.field, selectedDeliveryPointFilterDto.field) && epx.f(this.values, selectedDeliveryPointFilterDto.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + (this.field.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedDeliveryPointFilterDto(field=");
        sb.append(this.field);
        sb.append(", values=");
        return ms9.a(')', sb, this.values);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field);
        Iterator a2 = ao.a(parcel, this.values);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
