package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BaseObjectNameDto.kt */
/* loaded from: classes14.dex */
public final class BaseObjectNameDto implements Parcelable {
    public static final Parcelable.Creator<BaseObjectNameDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    /* compiled from: BaseObjectNameDto.kt */
    public static final class a implements Parcelable.Creator<BaseObjectNameDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseObjectNameDto createFromParcel(Parcel parcel) {
            return new BaseObjectNameDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseObjectNameDto[] newArray(int i) {
            return new BaseObjectNameDto[i];
        }
    }

    public BaseObjectNameDto(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseObjectNameDto) && epx.f(this.name, ((BaseObjectNameDto) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("BaseObjectNameDto(name="), this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
    }
}
