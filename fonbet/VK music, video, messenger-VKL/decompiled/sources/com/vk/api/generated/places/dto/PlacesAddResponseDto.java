package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: PlacesAddResponseDto.kt */
/* loaded from: classes15.dex */
public final class PlacesAddResponseDto implements Parcelable {
    public static final Parcelable.Creator<PlacesAddResponseDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    /* compiled from: PlacesAddResponseDto.kt */
    public static final class a implements Parcelable.Creator<PlacesAddResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesAddResponseDto createFromParcel(Parcel parcel) {
            return new PlacesAddResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesAddResponseDto[] newArray(int i) {
            return new PlacesAddResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlacesAddResponseDto() {
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
        return (obj instanceof PlacesAddResponseDto) && epx.f(this.id, ((PlacesAddResponseDto) obj).id);
    }

    public final int hashCode() {
        Integer num = this.id;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("PlacesAddResponseDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public PlacesAddResponseDto(Integer num) {
        this.id = num;
    }

    public /* synthetic */ PlacesAddResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
