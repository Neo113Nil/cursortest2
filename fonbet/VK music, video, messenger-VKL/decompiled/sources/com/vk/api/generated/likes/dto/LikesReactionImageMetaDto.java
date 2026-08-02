package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: LikesReactionImageMetaDto.kt */
/* loaded from: classes14.dex */
public final class LikesReactionImageMetaDto implements Parcelable {
    public static final Parcelable.Creator<LikesReactionImageMetaDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: LikesReactionImageMetaDto.kt */
    public static final class a implements Parcelable.Creator<LikesReactionImageMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesReactionImageMetaDto createFromParcel(Parcel parcel) {
            return new LikesReactionImageMetaDto(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LikesReactionImageMetaDto[] newArray(int i) {
            return new LikesReactionImageMetaDto[i];
        }
    }

    public LikesReactionImageMetaDto(String str, int i, int i2) {
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
        if (!(obj instanceof LikesReactionImageMetaDto)) {
            return false;
        }
        LikesReactionImageMetaDto likesReactionImageMetaDto = (LikesReactionImageMetaDto) obj;
        return epx.f(this.url, likesReactionImageMetaDto.url) && this.width == likesReactionImageMetaDto.width && this.height == likesReactionImageMetaDto.height;
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
        StringBuilder sb = new StringBuilder("LikesReactionImageMetaDto(url=");
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
