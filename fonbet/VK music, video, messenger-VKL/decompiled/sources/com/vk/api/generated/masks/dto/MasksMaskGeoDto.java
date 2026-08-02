package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: MasksMaskGeoDto.kt */
/* loaded from: classes15.dex */
public final class MasksMaskGeoDto implements Parcelable {
    public static final Parcelable.Creator<MasksMaskGeoDto> CREATOR = new a();

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    @pmi0("radius")
    private final Integer radius;

    /* compiled from: MasksMaskGeoDto.kt */
    public static final class a implements Parcelable.Creator<MasksMaskGeoDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksMaskGeoDto createFromParcel(Parcel parcel) {
            return new MasksMaskGeoDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MasksMaskGeoDto[] newArray(int i) {
            return new MasksMaskGeoDto[i];
        }
    }

    public MasksMaskGeoDto() {
        this(null, null, null, 7, null);
    }

    public final Float d() {
        return this.latitude;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.longitude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksMaskGeoDto)) {
            return false;
        }
        MasksMaskGeoDto masksMaskGeoDto = (MasksMaskGeoDto) obj;
        return epx.f(this.radius, masksMaskGeoDto.radius) && epx.f(this.latitude, masksMaskGeoDto.latitude) && epx.f(this.longitude, masksMaskGeoDto.longitude);
    }

    public final Integer f() {
        return this.radius;
    }

    public final int hashCode() {
        Integer num = this.radius;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.latitude;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.longitude;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksMaskGeoDto(radius=");
        sb.append(this.radius);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        return so.b(sb, this.longitude, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.radius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Float f = this.latitude;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.longitude;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
    }

    public MasksMaskGeoDto(Integer num, Float f, Float f2) {
        this.radius = num;
        this.latitude = f;
        this.longitude = f2;
    }

    public /* synthetic */ MasksMaskGeoDto(Integer num, Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2);
    }
}
