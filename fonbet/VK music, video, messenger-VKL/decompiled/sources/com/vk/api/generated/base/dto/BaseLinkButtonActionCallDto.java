package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BaseLinkButtonActionCallDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionCallDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonActionCallDto> CREATOR = new a();

    @pmi0("phone")
    private final String phone;

    /* compiled from: BaseLinkButtonActionCallDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionCallDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionCallDto createFromParcel(Parcel parcel) {
            return new BaseLinkButtonActionCallDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionCallDto[] newArray(int i) {
            return new BaseLinkButtonActionCallDto[i];
        }
    }

    public BaseLinkButtonActionCallDto(String str) {
        this.phone = str;
    }

    public final String d() {
        return this.phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseLinkButtonActionCallDto) && epx.f(this.phone, ((BaseLinkButtonActionCallDto) obj).phone);
    }

    public final int hashCode() {
        return this.phone.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("BaseLinkButtonActionCallDto(phone="), this.phone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.phone);
    }
}
