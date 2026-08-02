package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoClickableStickerAreaDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoClickableStickerAreaDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoClickableStickerAreaDto> CREATOR = new a();

    @pmi0("x")
    private final int x;

    @pmi0("y")
    private final int y;

    /* compiled from: ShortVideoClickableStickerAreaDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoClickableStickerAreaDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoClickableStickerAreaDto createFromParcel(Parcel parcel) {
            return new ShortVideoClickableStickerAreaDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoClickableStickerAreaDto[] newArray(int i) {
            return new ShortVideoClickableStickerAreaDto[i];
        }
    }

    public ShortVideoClickableStickerAreaDto(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public final int d() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoClickableStickerAreaDto)) {
            return false;
        }
        ShortVideoClickableStickerAreaDto shortVideoClickableStickerAreaDto = (ShortVideoClickableStickerAreaDto) obj;
        return this.x == shortVideoClickableStickerAreaDto.x && this.y == shortVideoClickableStickerAreaDto.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoClickableStickerAreaDto(x=");
        sb.append(this.x);
        sb.append(", y=");
        return vu5.b(sb, this.y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
    }
}
