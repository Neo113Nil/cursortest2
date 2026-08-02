package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallPosterFallbackLinkDto.kt */
/* loaded from: classes15.dex */
public final class WallPosterFallbackLinkDto implements Parcelable {
    public static final Parcelable.Creator<WallPosterFallbackLinkDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    /* compiled from: WallPosterFallbackLinkDto.kt */
    public static final class a implements Parcelable.Creator<WallPosterFallbackLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPosterFallbackLinkDto createFromParcel(Parcel parcel) {
            return new WallPosterFallbackLinkDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPosterFallbackLinkDto[] newArray(int i) {
            return new WallPosterFallbackLinkDto[i];
        }
    }

    public WallPosterFallbackLinkDto(String str) {
        this.link = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallPosterFallbackLinkDto) && epx.f(this.link, ((WallPosterFallbackLinkDto) obj).link);
    }

    public final int hashCode() {
        return this.link.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("WallPosterFallbackLinkDto(link="), this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
    }
}
