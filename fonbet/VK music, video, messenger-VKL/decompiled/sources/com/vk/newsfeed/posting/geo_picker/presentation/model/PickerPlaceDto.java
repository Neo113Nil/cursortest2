package com.vk.newsfeed.posting.geo_picker.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: PickerPlaceDto.kt */
/* loaded from: classes4.dex */
public final class PickerPlaceDto implements Parcelable {
    public static final Parcelable.Creator<PickerPlaceDto> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: PickerPlaceDto.kt */
    public static final class a implements Parcelable.Creator<PickerPlaceDto> {
        @Override // android.os.Parcelable.Creator
        public final PickerPlaceDto createFromParcel(Parcel parcel) {
            return new PickerPlaceDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PickerPlaceDto[] newArray(int i) {
            return new PickerPlaceDto[i];
        }
    }

    public PickerPlaceDto(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickerPlaceDto)) {
            return false;
        }
        PickerPlaceDto pickerPlaceDto = (PickerPlaceDto) obj;
        return this.b == pickerPlaceDto.b && epx.f(this.c, pickerPlaceDto.c) && epx.f(this.d, pickerPlaceDto.d) && epx.f(this.e, pickerPlaceDto.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerPlaceDto(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", address=");
        sb.append(this.d);
        sb.append(", categoryTitle=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
