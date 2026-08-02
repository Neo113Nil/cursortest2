package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AppsLaunchScreenAppUsersTopUserDto.kt */
/* loaded from: classes14.dex */
public final class AppsLaunchScreenAppUsersTopUserDto implements Parcelable {
    public static final Parcelable.Creator<AppsLaunchScreenAppUsersTopUserDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final String photo;

    /* compiled from: AppsLaunchScreenAppUsersTopUserDto.kt */
    public static final class a implements Parcelable.Creator<AppsLaunchScreenAppUsersTopUserDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenAppUsersTopUserDto createFromParcel(Parcel parcel) {
            return new AppsLaunchScreenAppUsersTopUserDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenAppUsersTopUserDto[] newArray(int i) {
            return new AppsLaunchScreenAppUsersTopUserDto[i];
        }
    }

    public AppsLaunchScreenAppUsersTopUserDto(String str, String str2, String str3) {
        this.name = str;
        this.photo = str2;
        this.link = str3;
    }

    public final String d() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLaunchScreenAppUsersTopUserDto)) {
            return false;
        }
        AppsLaunchScreenAppUsersTopUserDto appsLaunchScreenAppUsersTopUserDto = (AppsLaunchScreenAppUsersTopUserDto) obj;
        return epx.f(this.name, appsLaunchScreenAppUsersTopUserDto.name) && epx.f(this.photo, appsLaunchScreenAppUsersTopUserDto.photo) && epx.f(this.link, appsLaunchScreenAppUsersTopUserDto.link);
    }

    public final String f() {
        return this.photo;
    }

    public final int hashCode() {
        return this.link.hashCode() + urd0.a(this.name.hashCode() * 31, 31, this.photo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsLaunchScreenAppUsersTopUserDto(name=");
        sb.append(this.name);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", link=");
        return ho8.a(sb, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.photo);
        parcel.writeString(this.link);
    }
}
