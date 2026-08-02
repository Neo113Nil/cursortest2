package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: DonutPaidDurationDto.kt */
/* loaded from: classes14.dex */
public final class DonutPaidDurationDto implements Parcelable {
    public static final Parcelable.Creator<DonutPaidDurationDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: DonutPaidDurationDto.kt */
    public static final class a implements Parcelable.Creator<DonutPaidDurationDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutPaidDurationDto createFromParcel(Parcel parcel) {
            return new DonutPaidDurationDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutPaidDurationDto[] newArray(int i) {
            return new DonutPaidDurationDto[i];
        }
    }

    public DonutPaidDurationDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutPaidDurationDto)) {
            return false;
        }
        DonutPaidDurationDto donutPaidDurationDto = (DonutPaidDurationDto) obj;
        return this.id == donutPaidDurationDto.id && epx.f(this.name, donutPaidDurationDto.name);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutPaidDurationDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }
}
