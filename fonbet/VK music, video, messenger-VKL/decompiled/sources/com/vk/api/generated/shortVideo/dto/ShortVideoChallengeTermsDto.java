package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ShortVideoChallengeTermsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeTermsDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeTermsDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: ShortVideoChallengeTermsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeTermsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeTermsDto createFromParcel(Parcel parcel) {
            return new ShortVideoChallengeTermsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeTermsDto[] newArray(int i) {
            return new ShortVideoChallengeTermsDto[i];
        }
    }

    public ShortVideoChallengeTermsDto(String str, String str2) {
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
        if (!(obj instanceof ShortVideoChallengeTermsDto)) {
            return false;
        }
        ShortVideoChallengeTermsDto shortVideoChallengeTermsDto = (ShortVideoChallengeTermsDto) obj;
        return epx.f(this.title, shortVideoChallengeTermsDto.title) && epx.f(this.url, shortVideoChallengeTermsDto.url);
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
        StringBuilder sb = new StringBuilder("ShortVideoChallengeTermsDto(title=");
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
