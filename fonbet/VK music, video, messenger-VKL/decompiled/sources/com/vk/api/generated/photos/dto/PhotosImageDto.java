package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: PhotosImageDto.kt */
/* loaded from: classes15.dex */
public final class PhotosImageDto implements Parcelable {
    public static final Parcelable.Creator<PhotosImageDto> CREATOR = new a();

    @pmi0("height")
    private final Integer height;

    @pmi0("type")
    private final PhotosImageTypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    /* compiled from: PhotosImageDto.kt */
    public static final class a implements Parcelable.Creator<PhotosImageDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosImageDto createFromParcel(Parcel parcel) {
            return new PhotosImageDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : PhotosImageTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosImageDto[] newArray(int i) {
            return new PhotosImageDto[i];
        }
    }

    public PhotosImageDto() {
        this(null, null, null, null, 15, null);
    }

    public final Integer d() {
        return this.height;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotosImageTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosImageDto)) {
            return false;
        }
        PhotosImageDto photosImageDto = (PhotosImageDto) obj;
        return epx.f(this.height, photosImageDto.height) && this.type == photosImageDto.type && epx.f(this.url, photosImageDto.url) && epx.f(this.width, photosImageDto.width);
    }

    public final Integer f() {
        return this.width;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        Integer num = this.height;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        PhotosImageTypeDto photosImageTypeDto = this.type;
        int hashCode2 = (hashCode + (photosImageTypeDto == null ? 0 : photosImageTypeDto.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.width;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosImageDto(height=");
        sb.append(this.height);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", width=");
        return uqi.b(sb, this.width, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        PhotosImageTypeDto photosImageTypeDto = this.type;
        if (photosImageTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosImageTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public PhotosImageDto(Integer num, PhotosImageTypeDto photosImageTypeDto, String str, Integer num2) {
        this.height = num;
        this.type = photosImageTypeDto;
        this.url = str;
        this.width = num2;
    }

    public /* synthetic */ PhotosImageDto(Integer num, PhotosImageTypeDto photosImageTypeDto, String str, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : photosImageTypeDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2);
    }
}
