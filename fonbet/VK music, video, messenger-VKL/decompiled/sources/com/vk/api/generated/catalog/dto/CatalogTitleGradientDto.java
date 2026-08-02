package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CatalogTitleGradientDto.kt */
/* loaded from: classes14.dex */
public final class CatalogTitleGradientDto implements Parcelable {
    public static final Parcelable.Creator<CatalogTitleGradientDto> CREATOR = new a();

    @pmi0("angle")
    private final Integer angle;

    @pmi0("center_color")
    private final String centerColor;

    @pmi0("end_color")
    private final String endColor;

    @pmi0("start_color")
    private final String startColor;

    /* compiled from: CatalogTitleGradientDto.kt */
    public static final class a implements Parcelable.Creator<CatalogTitleGradientDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogTitleGradientDto createFromParcel(Parcel parcel) {
            return new CatalogTitleGradientDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogTitleGradientDto[] newArray(int i) {
            return new CatalogTitleGradientDto[i];
        }
    }

    public CatalogTitleGradientDto() {
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
        if (!(obj instanceof CatalogTitleGradientDto)) {
            return false;
        }
        CatalogTitleGradientDto catalogTitleGradientDto = (CatalogTitleGradientDto) obj;
        return epx.f(this.startColor, catalogTitleGradientDto.startColor) && epx.f(this.centerColor, catalogTitleGradientDto.centerColor) && epx.f(this.endColor, catalogTitleGradientDto.endColor) && epx.f(this.angle, catalogTitleGradientDto.angle);
    }

    public final int hashCode() {
        String str = this.startColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.centerColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.angle;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogTitleGradientDto(startColor=");
        sb.append(this.startColor);
        sb.append(", centerColor=");
        sb.append(this.centerColor);
        sb.append(", endColor=");
        sb.append(this.endColor);
        sb.append(", angle=");
        return uqi.b(sb, this.angle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.startColor);
        parcel.writeString(this.centerColor);
        parcel.writeString(this.endColor);
        Integer num = this.angle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public CatalogTitleGradientDto(String str, String str2, String str3, Integer num) {
        this.startColor = str;
        this.centerColor = str2;
        this.endColor = str3;
        this.angle = num;
    }

    public /* synthetic */ CatalogTitleGradientDto(String str, String str2, String str3, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}
