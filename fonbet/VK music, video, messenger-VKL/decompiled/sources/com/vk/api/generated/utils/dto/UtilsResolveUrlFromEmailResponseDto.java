package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: UtilsResolveUrlFromEmailResponseDto.kt */
/* loaded from: classes15.dex */
public final class UtilsResolveUrlFromEmailResponseDto implements Parcelable {
    public static final Parcelable.Creator<UtilsResolveUrlFromEmailResponseDto> CREATOR = new a();

    @pmi0("navigate_url")
    private final String navigateUrl;

    /* compiled from: UtilsResolveUrlFromEmailResponseDto.kt */
    public static final class a implements Parcelable.Creator<UtilsResolveUrlFromEmailResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsResolveUrlFromEmailResponseDto createFromParcel(Parcel parcel) {
            return new UtilsResolveUrlFromEmailResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsResolveUrlFromEmailResponseDto[] newArray(int i) {
            return new UtilsResolveUrlFromEmailResponseDto[i];
        }
    }

    public UtilsResolveUrlFromEmailResponseDto(String str) {
        this.navigateUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UtilsResolveUrlFromEmailResponseDto) && epx.f(this.navigateUrl, ((UtilsResolveUrlFromEmailResponseDto) obj).navigateUrl);
    }

    public final int hashCode() {
        return this.navigateUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("UtilsResolveUrlFromEmailResponseDto(navigateUrl="), this.navigateUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.navigateUrl);
    }
}
