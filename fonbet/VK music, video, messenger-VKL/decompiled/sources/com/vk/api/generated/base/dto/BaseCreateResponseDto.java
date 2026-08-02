package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: BaseCreateResponseDto.kt */
/* loaded from: classes14.dex */
public final class BaseCreateResponseDto implements Parcelable {
    public static final Parcelable.Creator<BaseCreateResponseDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    /* compiled from: BaseCreateResponseDto.kt */
    public static final class a implements Parcelable.Creator<BaseCreateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCreateResponseDto createFromParcel(Parcel parcel) {
            return new BaseCreateResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCreateResponseDto[] newArray(int i) {
            return new BaseCreateResponseDto[i];
        }
    }

    public BaseCreateResponseDto(int i) {
        this.id = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseCreateResponseDto) && this.id == ((BaseCreateResponseDto) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.id);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("BaseCreateResponseDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
    }
}
