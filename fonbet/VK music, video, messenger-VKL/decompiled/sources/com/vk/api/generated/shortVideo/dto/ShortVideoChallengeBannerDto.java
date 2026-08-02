package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: ShortVideoChallengeBannerDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChallengeBannerDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChallengeBannerDto> CREATOR = new a();

    @pmi0("button")
    private final ShortVideoChallengeBannerButtonDto button;

    @pmi0("description")
    private final String description;

    @pmi0("image")
    private final BaseImageDto image;

    @pmi0("title")
    private final String title;

    @pmi0("ttl")
    private final int ttl;

    /* compiled from: ShortVideoChallengeBannerDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChallengeBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeBannerDto createFromParcel(Parcel parcel) {
            return new ShortVideoChallengeBannerDto(parcel.readString(), parcel.readString(), parcel.readInt(), (BaseImageDto) parcel.readParcelable(ShortVideoChallengeBannerDto.class.getClassLoader()), ShortVideoChallengeBannerButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChallengeBannerDto[] newArray(int i) {
            return new ShortVideoChallengeBannerDto[i];
        }
    }

    public ShortVideoChallengeBannerDto(String str, String str2, int i, BaseImageDto baseImageDto, ShortVideoChallengeBannerButtonDto shortVideoChallengeBannerButtonDto) {
        this.title = str;
        this.description = str2;
        this.ttl = i;
        this.image = baseImageDto;
        this.button = shortVideoChallengeBannerButtonDto;
    }

    public final ShortVideoChallengeBannerButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeBannerDto)) {
            return false;
        }
        ShortVideoChallengeBannerDto shortVideoChallengeBannerDto = (ShortVideoChallengeBannerDto) obj;
        return epx.f(this.title, shortVideoChallengeBannerDto.title) && epx.f(this.description, shortVideoChallengeBannerDto.description) && this.ttl == shortVideoChallengeBannerDto.ttl && epx.f(this.image, shortVideoChallengeBannerDto.image) && epx.f(this.button, shortVideoChallengeBannerDto.button);
    }

    public final int f() {
        return this.ttl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.button.hashCode() + ((this.image.hashCode() + shy.a(this.ttl, urd0.a(this.title.hashCode() * 31, 31, this.description), 31)) * 31);
    }

    public final String toString() {
        return "ShortVideoChallengeBannerDto(title=" + this.title + ", description=" + this.description + ", ttl=" + this.ttl + ", image=" + this.image + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.ttl);
        parcel.writeParcelable(this.image, i);
        this.button.writeToParcel(parcel, i);
    }
}
