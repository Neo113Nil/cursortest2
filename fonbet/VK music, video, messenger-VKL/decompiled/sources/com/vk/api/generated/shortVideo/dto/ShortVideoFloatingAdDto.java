package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ShortVideoFloatingAdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoFloatingAdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoFloatingAdDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("max_height")
    private final int maxHeight;

    @pmi0("max_width")
    private final int maxWidth;

    @pmi0(X3.i.I0)
    private final ShortVideoFloatingAdMediaDto media;

    @pmi0("modal_info")
    private final ShortVideoFloatingAdModalInfoDto modalInfo;

    @pmi0(X3.i.L)
    private final ShortVideoFloatingAdPositionDto position;

    /* compiled from: ShortVideoFloatingAdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoFloatingAdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoFloatingAdDto createFromParcel(Parcel parcel) {
            return new ShortVideoFloatingAdDto(parcel.readString(), parcel.readInt(), parcel.readInt(), ShortVideoFloatingAdPositionDto.CREATOR.createFromParcel(parcel), (ShortVideoFloatingAdMediaDto) parcel.readParcelable(ShortVideoFloatingAdDto.class.getClassLoader()), ShortVideoFloatingAdModalInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoFloatingAdDto[] newArray(int i) {
            return new ShortVideoFloatingAdDto[i];
        }
    }

    public ShortVideoFloatingAdDto(String str, int i, int i2, ShortVideoFloatingAdPositionDto shortVideoFloatingAdPositionDto, ShortVideoFloatingAdMediaDto shortVideoFloatingAdMediaDto, ShortVideoFloatingAdModalInfoDto shortVideoFloatingAdModalInfoDto) {
        this.id = str;
        this.maxWidth = i;
        this.maxHeight = i2;
        this.position = shortVideoFloatingAdPositionDto;
        this.media = shortVideoFloatingAdMediaDto;
        this.modalInfo = shortVideoFloatingAdModalInfoDto;
    }

    public final ShortVideoFloatingAdMediaDto d() {
        return this.media;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ShortVideoFloatingAdModalInfoDto e() {
        return this.modalInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoFloatingAdDto)) {
            return false;
        }
        ShortVideoFloatingAdDto shortVideoFloatingAdDto = (ShortVideoFloatingAdDto) obj;
        return epx.f(this.id, shortVideoFloatingAdDto.id) && this.maxWidth == shortVideoFloatingAdDto.maxWidth && this.maxHeight == shortVideoFloatingAdDto.maxHeight && epx.f(this.position, shortVideoFloatingAdDto.position) && epx.f(this.media, shortVideoFloatingAdDto.media) && epx.f(this.modalInfo, shortVideoFloatingAdDto.modalInfo);
    }

    public final ShortVideoFloatingAdPositionDto f() {
        return this.position;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.modalInfo.hashCode() + ((this.media.hashCode() + ((this.position.hashCode() + shy.a(this.maxHeight, shy.a(this.maxWidth, this.id.hashCode() * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShortVideoFloatingAdDto(id=" + this.id + ", maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ", position=" + this.position + ", media=" + this.media + ", modalInfo=" + this.modalInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.maxWidth);
        parcel.writeInt(this.maxHeight);
        this.position.writeToParcel(parcel, i);
        parcel.writeParcelable(this.media, i);
        this.modalInfo.writeToParcel(parcel, i);
    }
}
