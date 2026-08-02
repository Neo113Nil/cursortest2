package com.vk.api.generated.splashscreens.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SplashscreensColorObjectDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensColorObjectDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensColorObjectDto> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* compiled from: SplashscreensColorObjectDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensColorObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensColorObjectDto createFromParcel(Parcel parcel) {
            return new SplashscreensColorObjectDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensColorObjectDto[] newArray(int i) {
            return new SplashscreensColorObjectDto[i];
        }
    }

    public SplashscreensColorObjectDto(String str, String str2) {
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
        if (!(obj instanceof SplashscreensColorObjectDto)) {
            return false;
        }
        SplashscreensColorObjectDto splashscreensColorObjectDto = (SplashscreensColorObjectDto) obj;
        return epx.f(this.light, splashscreensColorObjectDto.light) && epx.f(this.dark, splashscreensColorObjectDto.dark);
    }

    public final int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplashscreensColorObjectDto(light=");
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
