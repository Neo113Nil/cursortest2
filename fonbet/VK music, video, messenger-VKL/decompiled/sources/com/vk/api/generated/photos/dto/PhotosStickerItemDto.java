package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosStickerItemDto.kt */
/* loaded from: classes15.dex */
public final class PhotosStickerItemDto implements Parcelable {
    public static final Parcelable.Creator<PhotosStickerItemDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("sizes")
    private final PhotosStickerItemSizesDto sizes;

    /* compiled from: PhotosStickerItemDto.kt */
    public static final class a implements Parcelable.Creator<PhotosStickerItemDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosStickerItemDto createFromParcel(Parcel parcel) {
            return new PhotosStickerItemDto(parcel.readString(), parcel.readInt() == 0 ? null : PhotosStickerItemSizesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosStickerItemDto[] newArray(int i) {
            return new PhotosStickerItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotosStickerItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosStickerItemDto)) {
            return false;
        }
        PhotosStickerItemDto photosStickerItemDto = (PhotosStickerItemDto) obj;
        return epx.f(this.id, photosStickerItemDto.id) && epx.f(this.sizes, photosStickerItemDto.sizes);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PhotosStickerItemSizesDto photosStickerItemSizesDto = this.sizes;
        return hashCode + (photosStickerItemSizesDto != null ? photosStickerItemSizesDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosStickerItemDto(id=" + this.id + ", sizes=" + this.sizes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        PhotosStickerItemSizesDto photosStickerItemSizesDto = this.sizes;
        if (photosStickerItemSizesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosStickerItemSizesDto.writeToParcel(parcel, i);
        }
    }

    public PhotosStickerItemDto(String str, PhotosStickerItemSizesDto photosStickerItemSizesDto) {
        this.id = str;
        this.sizes = photosStickerItemSizesDto;
    }

    public /* synthetic */ PhotosStickerItemDto(String str, PhotosStickerItemSizesDto photosStickerItemSizesDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : photosStickerItemSizesDto);
    }
}
