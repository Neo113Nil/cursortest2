package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BaseOwnerCoverCropParamsDto.kt */
/* loaded from: classes14.dex */
public final class BaseOwnerCoverCropParamsDto implements Parcelable {
    public static final Parcelable.Creator<BaseOwnerCoverCropParamsDto> CREATOR = new a();

    @pmi0("height")
    private final Integer height;

    @pmi0("width")
    private final Integer width;

    @pmi0("x")
    private final Integer x;

    @pmi0("y")
    private final Integer y;

    /* compiled from: BaseOwnerCoverCropParamsDto.kt */
    public static final class a implements Parcelable.Creator<BaseOwnerCoverCropParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseOwnerCoverCropParamsDto createFromParcel(Parcel parcel) {
            return new BaseOwnerCoverCropParamsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseOwnerCoverCropParamsDto[] newArray(int i) {
            return new BaseOwnerCoverCropParamsDto[i];
        }
    }

    public BaseOwnerCoverCropParamsDto() {
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
        if (!(obj instanceof BaseOwnerCoverCropParamsDto)) {
            return false;
        }
        BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto = (BaseOwnerCoverCropParamsDto) obj;
        return epx.f(this.x, baseOwnerCoverCropParamsDto.x) && epx.f(this.y, baseOwnerCoverCropParamsDto.y) && epx.f(this.width, baseOwnerCoverCropParamsDto.width) && epx.f(this.height, baseOwnerCoverCropParamsDto.height);
    }

    public final int hashCode() {
        Integer num = this.x;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.y;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.width;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.height;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseOwnerCoverCropParamsDto(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return uqi.b(sb, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.x;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.y;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.width;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.height;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public BaseOwnerCoverCropParamsDto(Integer num, Integer num2, Integer num3, Integer num4) {
        this.x = num;
        this.y = num2;
        this.width = num3;
        this.height = num4;
    }

    public /* synthetic */ BaseOwnerCoverCropParamsDto(Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
