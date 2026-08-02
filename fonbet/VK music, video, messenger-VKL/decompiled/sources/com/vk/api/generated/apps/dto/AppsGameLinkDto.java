package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsGameLinkDto.kt */
/* loaded from: classes14.dex */
public final class AppsGameLinkDto implements Parcelable {
    public static final Parcelable.Creator<AppsGameLinkDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("url")
    private final String url;

    /* compiled from: AppsGameLinkDto.kt */
    public static final class a implements Parcelable.Creator<AppsGameLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGameLinkDto createFromParcel(Parcel parcel) {
            return new AppsGameLinkDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGameLinkDto[] newArray(int i) {
            return new AppsGameLinkDto[i];
        }
    }

    public AppsGameLinkDto(String str, String str2) {
        this.name = str;
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
        if (!(obj instanceof AppsGameLinkDto)) {
            return false;
        }
        AppsGameLinkDto appsGameLinkDto = (AppsGameLinkDto) obj;
        return epx.f(this.name, appsGameLinkDto.name) && epx.f(this.url, appsGameLinkDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGameLinkDto(name=");
        sb.append(this.name);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
    }
}
