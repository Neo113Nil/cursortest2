package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: AppsAuthorGroupInfoPhotoDto.kt */
/* loaded from: classes14.dex */
public final class AppsAuthorGroupInfoPhotoDto implements Parcelable {
    public static final Parcelable.Creator<AppsAuthorGroupInfoPhotoDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: AppsAuthorGroupInfoPhotoDto.kt */
    public static final class a implements Parcelable.Creator<AppsAuthorGroupInfoPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAuthorGroupInfoPhotoDto createFromParcel(Parcel parcel) {
            return new AppsAuthorGroupInfoPhotoDto(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAuthorGroupInfoPhotoDto[] newArray(int i) {
            return new AppsAuthorGroupInfoPhotoDto[i];
        }
    }

    public AppsAuthorGroupInfoPhotoDto(String str, int i, int i2) {
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
        if (!(obj instanceof AppsAuthorGroupInfoPhotoDto)) {
            return false;
        }
        AppsAuthorGroupInfoPhotoDto appsAuthorGroupInfoPhotoDto = (AppsAuthorGroupInfoPhotoDto) obj;
        return epx.f(this.url, appsAuthorGroupInfoPhotoDto.url) && this.width == appsAuthorGroupInfoPhotoDto.width && this.height == appsAuthorGroupInfoPhotoDto.height;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + shy.a(this.width, this.url.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAuthorGroupInfoPhotoDto(url=");
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
