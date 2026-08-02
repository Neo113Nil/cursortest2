package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: EducationVendorItemDto.kt */
/* loaded from: classes14.dex */
public final class EducationVendorItemDto implements Parcelable {
    public static final Parcelable.Creator<EducationVendorItemDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("title")
    private final String title;

    /* compiled from: EducationVendorItemDto.kt */
    public static final class a implements Parcelable.Creator<EducationVendorItemDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationVendorItemDto createFromParcel(Parcel parcel) {
            return new EducationVendorItemDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationVendorItemDto[] newArray(int i) {
            return new EducationVendorItemDto[i];
        }
    }

    public EducationVendorItemDto(String str, String str2) {
        this.code = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationVendorItemDto)) {
            return false;
        }
        EducationVendorItemDto educationVendorItemDto = (EducationVendorItemDto) obj;
        return epx.f(this.code, educationVendorItemDto.code) && epx.f(this.title, educationVendorItemDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.code.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationVendorItemDto(code=");
        sb.append(this.code);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.title);
    }
}
