package com.vk.api.generated.topshelf.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: TopshelfTopshelfLogoImageDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfLogoImageDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfLogoImageDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: TopshelfTopshelfLogoImageDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfLogoImageDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfLogoImageDto createFromParcel(Parcel parcel) {
            return new TopshelfTopshelfLogoImageDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfLogoImageDto[] newArray(int i) {
            return new TopshelfTopshelfLogoImageDto[i];
        }
    }

    public TopshelfTopshelfLogoImageDto(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TopshelfTopshelfLogoImageDto) && epx.f(this.url, ((TopshelfTopshelfLogoImageDto) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TopshelfTopshelfLogoImageDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }
}
