package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.xq;

/* compiled from: BaseGradientPointDto.kt */
/* loaded from: classes14.dex */
public final class BaseGradientPointDto implements Parcelable {
    public static final Parcelable.Creator<BaseGradientPointDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0(X3.i.L)
    private final float position;

    /* compiled from: BaseGradientPointDto.kt */
    public static final class a implements Parcelable.Creator<BaseGradientPointDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseGradientPointDto createFromParcel(Parcel parcel) {
            return new BaseGradientPointDto(parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseGradientPointDto[] newArray(int i) {
            return new BaseGradientPointDto[i];
        }
    }

    public BaseGradientPointDto(String str, float f) {
        this.color = str;
        this.position = f;
    }

    public final String d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGradientPointDto)) {
            return false;
        }
        BaseGradientPointDto baseGradientPointDto = (BaseGradientPointDto) obj;
        return epx.f(this.color, baseGradientPointDto.color) && Float.compare(this.position, baseGradientPointDto.position) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.position) + (this.color.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseGradientPointDto(color=");
        sb.append(this.color);
        sb.append(", position=");
        return xq.c(')', this.position, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        parcel.writeFloat(this.position);
    }
}
