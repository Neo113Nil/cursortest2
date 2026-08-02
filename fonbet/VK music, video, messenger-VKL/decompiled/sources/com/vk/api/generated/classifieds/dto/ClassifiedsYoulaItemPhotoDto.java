package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaItemPhotoDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemPhotoDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemPhotoDto> CREATOR = new a();

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("url")
    private final String url;

    /* compiled from: ClassifiedsYoulaItemPhotoDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemPhotoDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaItemPhotoDto(parcel.readInt() == 0 ? null : PhotosPhotoDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemPhotoDto[] newArray(int i) {
            return new ClassifiedsYoulaItemPhotoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClassifiedsYoulaItemPhotoDto() {
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
        if (!(obj instanceof ClassifiedsYoulaItemPhotoDto)) {
            return false;
        }
        ClassifiedsYoulaItemPhotoDto classifiedsYoulaItemPhotoDto = (ClassifiedsYoulaItemPhotoDto) obj;
        return epx.f(this.photo, classifiedsYoulaItemPhotoDto.photo) && epx.f(this.url, classifiedsYoulaItemPhotoDto.url);
    }

    public final int hashCode() {
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode = (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode()) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemPhotoDto(photo=");
        sb.append(this.photo);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhotosPhotoDto photosPhotoDto = this.photo;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
    }

    public ClassifiedsYoulaItemPhotoDto(PhotosPhotoDto photosPhotoDto, String str) {
        this.photo = photosPhotoDto;
        this.url = str;
    }

    public /* synthetic */ ClassifiedsYoulaItemPhotoDto(PhotosPhotoDto photosPhotoDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : photosPhotoDto, (i & 2) != 0 ? null : str);
    }
}
