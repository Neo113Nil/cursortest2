package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: PhotosGetNewTagsResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetNewTagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetNewTagsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoXtrTagInfoDto> items;

    /* compiled from: PhotosGetNewTagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetNewTagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetNewTagsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PhotosPhotoXtrTagInfoDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PhotosGetNewTagsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetNewTagsResponseDto[] newArray(int i) {
            return new PhotosGetNewTagsResponseDto[i];
        }
    }

    public PhotosGetNewTagsResponseDto(int i, List<PhotosPhotoXtrTagInfoDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetNewTagsResponseDto)) {
            return false;
        }
        PhotosGetNewTagsResponseDto photosGetNewTagsResponseDto = (PhotosGetNewTagsResponseDto) obj;
        return this.count == photosGetNewTagsResponseDto.count && epx.f(this.items, photosGetNewTagsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetNewTagsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((PhotosPhotoXtrTagInfoDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
