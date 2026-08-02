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

/* compiled from: PhotosGetAlbumsResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetAlbumsResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetAlbumsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoAlbumFullDto> items;

    /* compiled from: PhotosGetAlbumsResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetAlbumsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetAlbumsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PhotosPhotoAlbumFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PhotosGetAlbumsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetAlbumsResponseDto[] newArray(int i) {
            return new PhotosGetAlbumsResponseDto[i];
        }
    }

    public PhotosGetAlbumsResponseDto(int i, List<PhotosPhotoAlbumFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<PhotosPhotoAlbumFullDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetAlbumsResponseDto)) {
            return false;
        }
        PhotosGetAlbumsResponseDto photosGetAlbumsResponseDto = (PhotosGetAlbumsResponseDto) obj;
        return this.count == photosGetAlbumsResponseDto.count && epx.f(this.items, photosGetAlbumsResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetAlbumsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((PhotosPhotoAlbumFullDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
