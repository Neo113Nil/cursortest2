package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: AppsAppInstallRightDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppInstallRightDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppInstallRightDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("header")
    private final String header;

    @pmi0("mask")
    private final int mask;

    @pmi0("name")
    private final String name;

    /* compiled from: AppsAppInstallRightDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppInstallRightDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppInstallRightDto createFromParcel(Parcel parcel) {
            return new AppsAppInstallRightDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppInstallRightDto[] newArray(int i) {
            return new AppsAppInstallRightDto[i];
        }
    }

    public AppsAppInstallRightDto(String str, String str2, String str3, int i) {
        this.name = str;
        this.header = str2;
        this.description = str3;
        this.mask = i;
    }

    public final String d() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.mask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppInstallRightDto)) {
            return false;
        }
        AppsAppInstallRightDto appsAppInstallRightDto = (AppsAppInstallRightDto) obj;
        return epx.f(this.name, appsAppInstallRightDto.name) && epx.f(this.header, appsAppInstallRightDto.header) && epx.f(this.description, appsAppInstallRightDto.description) && this.mask == appsAppInstallRightDto.mask;
    }

    public final String f() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        return Integer.hashCode(this.mask) + urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.header), 31, this.description);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppInstallRightDto(name=");
        sb.append(this.name);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", mask=");
        return vu5.b(sb, this.mask, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.header);
        parcel.writeString(this.description);
        parcel.writeInt(this.mask);
    }
}
