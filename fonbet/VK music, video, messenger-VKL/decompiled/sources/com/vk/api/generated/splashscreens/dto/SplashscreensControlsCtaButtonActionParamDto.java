package com.vk.api.generated.splashscreens.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SplashscreensControlsCtaButtonActionParamDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensControlsCtaButtonActionParamDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensControlsCtaButtonActionParamDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final String value;

    /* compiled from: SplashscreensControlsCtaButtonActionParamDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensControlsCtaButtonActionParamDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensControlsCtaButtonActionParamDto createFromParcel(Parcel parcel) {
            return new SplashscreensControlsCtaButtonActionParamDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensControlsCtaButtonActionParamDto[] newArray(int i) {
            return new SplashscreensControlsCtaButtonActionParamDto[i];
        }
    }

    public SplashscreensControlsCtaButtonActionParamDto(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public final String d() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashscreensControlsCtaButtonActionParamDto)) {
            return false;
        }
        SplashscreensControlsCtaButtonActionParamDto splashscreensControlsCtaButtonActionParamDto = (SplashscreensControlsCtaButtonActionParamDto) obj;
        return epx.f(this.name, splashscreensControlsCtaButtonActionParamDto.name) && epx.f(this.value, splashscreensControlsCtaButtonActionParamDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplashscreensControlsCtaButtonActionParamDto(name=");
        sb.append(this.name);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }
}
