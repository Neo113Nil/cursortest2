package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsAppPlaceholderInfoActionButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppPlaceholderInfoActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppPlaceholderInfoActionButtonDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: AppsAppPlaceholderInfoActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppPlaceholderInfoActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppPlaceholderInfoActionButtonDto createFromParcel(Parcel parcel) {
            return new AppsAppPlaceholderInfoActionButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppPlaceholderInfoActionButtonDto[] newArray(int i) {
            return new AppsAppPlaceholderInfoActionButtonDto[i];
        }
    }

    public AppsAppPlaceholderInfoActionButtonDto(String str, String str2) {
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
        if (!(obj instanceof AppsAppPlaceholderInfoActionButtonDto)) {
            return false;
        }
        AppsAppPlaceholderInfoActionButtonDto appsAppPlaceholderInfoActionButtonDto = (AppsAppPlaceholderInfoActionButtonDto) obj;
        return epx.f(this.title, appsAppPlaceholderInfoActionButtonDto.title) && epx.f(this.url, appsAppPlaceholderInfoActionButtonDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppPlaceholderInfoActionButtonDto(title=");
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
