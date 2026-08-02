package com.vk.api.generated.splashscreens.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SplashscreensSlideMediaDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensSlideMediaDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensSlideMediaDto> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* compiled from: SplashscreensSlideMediaDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensSlideMediaDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensSlideMediaDto createFromParcel(Parcel parcel) {
            return new SplashscreensSlideMediaDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensSlideMediaDto[] newArray(int i) {
            return new SplashscreensSlideMediaDto[i];
        }
    }

    public SplashscreensSlideMediaDto(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public final String d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashscreensSlideMediaDto)) {
            return false;
        }
        SplashscreensSlideMediaDto splashscreensSlideMediaDto = (SplashscreensSlideMediaDto) obj;
        return epx.f(this.light, splashscreensSlideMediaDto.light) && epx.f(this.dark, splashscreensSlideMediaDto.dark);
    }

    public final int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplashscreensSlideMediaDto(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return ho8.a(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }
}
