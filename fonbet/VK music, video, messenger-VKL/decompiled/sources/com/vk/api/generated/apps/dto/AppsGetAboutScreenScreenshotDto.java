package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: AppsGetAboutScreenScreenshotDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAboutScreenScreenshotDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAboutScreenScreenshotDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: AppsGetAboutScreenScreenshotDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAboutScreenScreenshotDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenScreenshotDto createFromParcel(Parcel parcel) {
            return new AppsGetAboutScreenScreenshotDto(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenScreenshotDto[] newArray(int i) {
            return new AppsGetAboutScreenScreenshotDto[i];
        }
    }

    public AppsGetAboutScreenScreenshotDto(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAboutScreenScreenshotDto)) {
            return false;
        }
        AppsGetAboutScreenScreenshotDto appsGetAboutScreenScreenshotDto = (AppsGetAboutScreenScreenshotDto) obj;
        return epx.f(this.url, appsGetAboutScreenScreenshotDto.url) && this.width == appsGetAboutScreenScreenshotDto.width && this.height == appsGetAboutScreenScreenshotDto.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + shy.a(this.width, this.url.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetAboutScreenScreenshotDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return vu5.b(sb, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
