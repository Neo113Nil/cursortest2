package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Y3;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseGeoDto.kt */
/* loaded from: classes14.dex */
public final class BaseGeoDto implements Parcelable {
    public static final Parcelable.Creator<BaseGeoDto> CREATOR = new a();

    @pmi0(Y3.f)
    private final BaseGeoCoordinatesDto coordinates;

    @pmi0("place")
    private final BasePlaceDto place;

    @pmi0("showmap")
    private final Integer showmap;

    @pmi0("type")
    private final String type;

    /* compiled from: BaseGeoDto.kt */
    public static final class a implements Parcelable.Creator<BaseGeoDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseGeoDto createFromParcel(Parcel parcel) {
            return new BaseGeoDto((BaseGeoCoordinatesDto) parcel.readParcelable(BaseGeoDto.class.getClassLoader()), parcel.readInt() == 0 ? null : BasePlaceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseGeoDto[] newArray(int i) {
            return new BaseGeoDto[i];
        }
    }

    public BaseGeoDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGeoDto)) {
            return false;
        }
        BaseGeoDto baseGeoDto = (BaseGeoDto) obj;
        return epx.f(this.coordinates, baseGeoDto.coordinates) && epx.f(this.place, baseGeoDto.place) && epx.f(this.showmap, baseGeoDto.showmap) && epx.f(this.type, baseGeoDto.type);
    }

    public final int hashCode() {
        BaseGeoCoordinatesDto baseGeoCoordinatesDto = this.coordinates;
        int hashCode = (baseGeoCoordinatesDto == null ? 0 : baseGeoCoordinatesDto.hashCode()) * 31;
        BasePlaceDto basePlaceDto = this.place;
        int hashCode2 = (hashCode + (basePlaceDto == null ? 0 : basePlaceDto.hashCode())) * 31;
        Integer num = this.showmap;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.type;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseGeoDto(coordinates=");
        sb.append(this.coordinates);
        sb.append(", place=");
        sb.append(this.place);
        sb.append(", showmap=");
        sb.append(this.showmap);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.coordinates, i);
        BasePlaceDto basePlaceDto = this.place;
        if (basePlaceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePlaceDto.writeToParcel(parcel, i);
        }
        Integer num = this.showmap;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.type);
    }

    public BaseGeoDto(BaseGeoCoordinatesDto baseGeoCoordinatesDto, BasePlaceDto basePlaceDto, Integer num, String str) {
        this.coordinates = baseGeoCoordinatesDto;
        this.place = basePlaceDto;
        this.showmap = num;
        this.type = str;
    }

    public /* synthetic */ BaseGeoDto(BaseGeoCoordinatesDto baseGeoCoordinatesDto, BasePlaceDto basePlaceDto, Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseGeoCoordinatesDto, (i & 2) != 0 ? null : basePlaceDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
