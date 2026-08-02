package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AppsSplashScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsSplashScreenDto implements Parcelable {
    public static final Parcelable.Creator<AppsSplashScreenDto> CREATOR = new a();

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("is_animated")
    private final Boolean isAnimated;

    @pmi0("url")
    private final String url;

    /* compiled from: AppsSplashScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsSplashScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSplashScreenDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsSplashScreenDto(valueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSplashScreenDto[] newArray(int i) {
            return new AppsSplashScreenDto[i];
        }
    }

    public AppsSplashScreenDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isAnimated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsSplashScreenDto)) {
            return false;
        }
        AppsSplashScreenDto appsSplashScreenDto = (AppsSplashScreenDto) obj;
        return epx.f(this.isAnimated, appsSplashScreenDto.isAnimated) && epx.f(this.url, appsSplashScreenDto.url) && epx.f(this.backgroundColor, appsSplashScreenDto.backgroundColor);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        Boolean bool = this.isAnimated;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsSplashScreenDto(isAnimated=");
        sb.append(this.isAnimated);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", backgroundColor=");
        return ho8.a(sb, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAnimated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.backgroundColor);
    }

    public AppsSplashScreenDto(Boolean bool, String str, String str2) {
        this.isAnimated = bool;
        this.url = str;
        this.backgroundColor = str2;
    }

    public /* synthetic */ AppsSplashScreenDto(Boolean bool, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
