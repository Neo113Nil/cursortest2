package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: WallPosterConstantsDto.kt */
/* loaded from: classes15.dex */
public final class WallPosterConstantsDto implements Parcelable {
    public static final Parcelable.Creator<WallPosterConstantsDto> CREATOR = new a();

    @pmi0("font_size_ratio_range_1")
    private final Float fontSizeRatioRange1;

    @pmi0("font_size_ratio_range_2")
    private final Float fontSizeRatioRange2;

    @pmi0("line_height_ratio_range_1")
    private final Float lineHeightRatioRange1;

    @pmi0("line_height_ratio_range_2")
    private final Float lineHeightRatioRange2;

    @pmi0("max_symbols")
    private final Integer maxSymbols;

    @pmi0("range_threshold")
    private final Integer rangeThreshold;

    @pmi0("upload_gen_timeout")
    private final Integer uploadGenTimeout;

    /* compiled from: WallPosterConstantsDto.kt */
    public static final class a implements Parcelable.Creator<WallPosterConstantsDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPosterConstantsDto createFromParcel(Parcel parcel) {
            return new WallPosterConstantsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPosterConstantsDto[] newArray(int i) {
            return new WallPosterConstantsDto[i];
        }
    }

    public WallPosterConstantsDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Float d() {
        return this.fontSizeRatioRange1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.fontSizeRatioRange2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPosterConstantsDto)) {
            return false;
        }
        WallPosterConstantsDto wallPosterConstantsDto = (WallPosterConstantsDto) obj;
        return epx.f(this.maxSymbols, wallPosterConstantsDto.maxSymbols) && epx.f(this.rangeThreshold, wallPosterConstantsDto.rangeThreshold) && epx.f(this.fontSizeRatioRange1, wallPosterConstantsDto.fontSizeRatioRange1) && epx.f(this.lineHeightRatioRange1, wallPosterConstantsDto.lineHeightRatioRange1) && epx.f(this.fontSizeRatioRange2, wallPosterConstantsDto.fontSizeRatioRange2) && epx.f(this.lineHeightRatioRange2, wallPosterConstantsDto.lineHeightRatioRange2) && epx.f(this.uploadGenTimeout, wallPosterConstantsDto.uploadGenTimeout);
    }

    public final Float f() {
        return this.lineHeightRatioRange1;
    }

    public final Float g() {
        return this.lineHeightRatioRange2;
    }

    public final int hashCode() {
        Integer num = this.maxSymbols;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.rangeThreshold;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.fontSizeRatioRange1;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.lineHeightRatioRange1;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.fontSizeRatioRange2;
        int hashCode5 = (hashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.lineHeightRatioRange2;
        int hashCode6 = (hashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num3 = this.uploadGenTimeout;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final Integer i() {
        return this.maxSymbols;
    }

    public final Integer j() {
        return this.rangeThreshold;
    }

    public final Integer k() {
        return this.uploadGenTimeout;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPosterConstantsDto(maxSymbols=");
        sb.append(this.maxSymbols);
        sb.append(", rangeThreshold=");
        sb.append(this.rangeThreshold);
        sb.append(", fontSizeRatioRange1=");
        sb.append(this.fontSizeRatioRange1);
        sb.append(", lineHeightRatioRange1=");
        sb.append(this.lineHeightRatioRange1);
        sb.append(", fontSizeRatioRange2=");
        sb.append(this.fontSizeRatioRange2);
        sb.append(", lineHeightRatioRange2=");
        sb.append(this.lineHeightRatioRange2);
        sb.append(", uploadGenTimeout=");
        return uqi.b(sb, this.uploadGenTimeout, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.maxSymbols;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.rangeThreshold;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Float f = this.fontSizeRatioRange1;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.lineHeightRatioRange1;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.fontSizeRatioRange2;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        Float f4 = this.lineHeightRatioRange2;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f4);
        }
        Integer num3 = this.uploadGenTimeout;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public WallPosterConstantsDto(Integer num, Integer num2, Float f, Float f2, Float f3, Float f4, Integer num3) {
        this.maxSymbols = num;
        this.rangeThreshold = num2;
        this.fontSizeRatioRange1 = f;
        this.lineHeightRatioRange1 = f2;
        this.fontSizeRatioRange2 = f3;
        this.lineHeightRatioRange2 = f4;
        this.uploadGenTimeout = num3;
    }

    public /* synthetic */ WallPosterConstantsDto(Integer num, Integer num2, Float f, Float f2, Float f3, Float f4, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : f3, (i & 32) != 0 ? null : f4, (i & 64) != 0 ? null : num3);
    }
}
