package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ShortVideoChallengeBannerButtonDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeBannerButtonDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeBannerButtonDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: ShortVideoChallengeBannerButtonDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeBannerButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeBannerButtonDto createFromParcel(Parcel parcel) {
            return new ShortVideoChallengeBannerButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeBannerButtonDto[] newArray(int i) {
            return new ShortVideoChallengeBannerButtonDto[i];
        }
    }

    public ShortVideoChallengeBannerButtonDto(String str, String str2) {
        this.title = str;
        this.url = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeBannerButtonDto)) {
            return false;
        }
        ShortVideoChallengeBannerButtonDto shortVideoChallengeBannerButtonDto = (ShortVideoChallengeBannerButtonDto) obj;
        return epx.f(this.title, shortVideoChallengeBannerButtonDto.title) && epx.f(this.url, shortVideoChallengeBannerButtonDto.url);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoChallengeBannerButtonDto(title=");
        sb.append(this.title);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }
}
