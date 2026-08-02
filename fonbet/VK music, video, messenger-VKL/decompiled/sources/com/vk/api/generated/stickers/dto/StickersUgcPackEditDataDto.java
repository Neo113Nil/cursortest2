package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: StickersUgcPackEditDataDto.kt */
/* loaded from: classes15.dex */
public final class StickersUgcPackEditDataDto implements Parcelable {
    public static final Parcelable.Creator<StickersUgcPackEditDataDto> CREATOR = new a();

    @pmi0("sticker_image_height")
    private final int stickerImageHeight;

    @pmi0("sticker_image_upload_url")
    private final String stickerImageUploadUrl;

    @pmi0("sticker_image_width")
    private final int stickerImageWidth;

    @pmi0("stickers_limit")
    private final int stickersLimit;

    /* compiled from: StickersUgcPackEditDataDto.kt */
    public static final class a implements Parcelable.Creator<StickersUgcPackEditDataDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersUgcPackEditDataDto createFromParcel(Parcel parcel) {
            return new StickersUgcPackEditDataDto(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersUgcPackEditDataDto[] newArray(int i) {
            return new StickersUgcPackEditDataDto[i];
        }
    }

    public StickersUgcPackEditDataDto(String str, int i, int i2, int i3) {
        this.stickerImageUploadUrl = str;
        this.stickerImageWidth = i;
        this.stickerImageHeight = i2;
        this.stickersLimit = i3;
    }

    public final int d() {
        return this.stickerImageHeight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.stickerImageUploadUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersUgcPackEditDataDto)) {
            return false;
        }
        StickersUgcPackEditDataDto stickersUgcPackEditDataDto = (StickersUgcPackEditDataDto) obj;
        return epx.f(this.stickerImageUploadUrl, stickersUgcPackEditDataDto.stickerImageUploadUrl) && this.stickerImageWidth == stickersUgcPackEditDataDto.stickerImageWidth && this.stickerImageHeight == stickersUgcPackEditDataDto.stickerImageHeight && this.stickersLimit == stickersUgcPackEditDataDto.stickersLimit;
    }

    public final int f() {
        return this.stickerImageWidth;
    }

    public final int g() {
        return this.stickersLimit;
    }

    public final int hashCode() {
        return Integer.hashCode(this.stickersLimit) + shy.a(this.stickerImageHeight, shy.a(this.stickerImageWidth, this.stickerImageUploadUrl.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersUgcPackEditDataDto(stickerImageUploadUrl=");
        sb.append(this.stickerImageUploadUrl);
        sb.append(", stickerImageWidth=");
        sb.append(this.stickerImageWidth);
        sb.append(", stickerImageHeight=");
        sb.append(this.stickerImageHeight);
        sb.append(", stickersLimit=");
        return vu5.b(sb, this.stickersLimit, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stickerImageUploadUrl);
        parcel.writeInt(this.stickerImageWidth);
        parcel.writeInt(this.stickerImageHeight);
        parcel.writeInt(this.stickersLimit);
    }
}
