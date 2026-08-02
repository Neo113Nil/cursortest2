package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ShortVideoFloatingAdModalInfoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoFloatingAdModalInfoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoFloatingAdModalInfoDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("description")
    private final String description;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: ShortVideoFloatingAdModalInfoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoFloatingAdModalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoFloatingAdModalInfoDto createFromParcel(Parcel parcel) {
            return new ShortVideoFloatingAdModalInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoFloatingAdModalInfoDto[] newArray(int i) {
            return new ShortVideoFloatingAdModalInfoDto[i];
        }
    }

    public ShortVideoFloatingAdModalInfoDto(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.photoBase = str4;
        this.buttonText = str5;
    }

    public final String d() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photoBase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoFloatingAdModalInfoDto)) {
            return false;
        }
        ShortVideoFloatingAdModalInfoDto shortVideoFloatingAdModalInfoDto = (ShortVideoFloatingAdModalInfoDto) obj;
        return epx.f(this.title, shortVideoFloatingAdModalInfoDto.title) && epx.f(this.description, shortVideoFloatingAdModalInfoDto.description) && epx.f(this.url, shortVideoFloatingAdModalInfoDto.url) && epx.f(this.photoBase, shortVideoFloatingAdModalInfoDto.photoBase) && epx.f(this.buttonText, shortVideoFloatingAdModalInfoDto.buttonText);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.url), 31, this.photoBase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoFloatingAdModalInfoDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.buttonText);
    }
}
