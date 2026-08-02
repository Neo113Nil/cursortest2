package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallWallpostAttachmentMarketLinkDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentMarketLinkDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentMarketLinkDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: WallWallpostAttachmentMarketLinkDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentMarketLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentMarketLinkDto createFromParcel(Parcel parcel) {
            return new WallWallpostAttachmentMarketLinkDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentMarketLinkDto[] newArray(int i) {
            return new WallWallpostAttachmentMarketLinkDto[i];
        }
    }

    public WallWallpostAttachmentMarketLinkDto(String str) {
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
        return (obj instanceof WallWallpostAttachmentMarketLinkDto) && epx.f(this.url, ((WallWallpostAttachmentMarketLinkDto) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("WallWallpostAttachmentMarketLinkDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }
}
