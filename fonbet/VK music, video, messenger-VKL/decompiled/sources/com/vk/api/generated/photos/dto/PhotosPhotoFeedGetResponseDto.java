package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosPhotoFeedGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosPhotoFeedGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosPhotoFeedGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: PhotosPhotoFeedGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosPhotoFeedGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoFeedGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(PhotosPhotoFeedGetResponseDto.class, parcel, arrayList, i, 1);
            }
            return new PhotosPhotoFeedGetResponseDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoFeedGetResponseDto[] newArray(int i) {
            return new PhotosPhotoFeedGetResponseDto[i];
        }
    }

    public PhotosPhotoFeedGetResponseDto(int i, List<PhotosPhotoDto> list, String str) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
    }

    public final List<PhotosPhotoDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoFeedGetResponseDto)) {
            return false;
        }
        PhotosPhotoFeedGetResponseDto photosPhotoFeedGetResponseDto = (PhotosPhotoFeedGetResponseDto) obj;
        return this.count == photosPhotoFeedGetResponseDto.count && epx.f(this.items, photosPhotoFeedGetResponseDto.items) && epx.f(this.nextFrom, photosPhotoFeedGetResponseDto.nextFrom);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosPhotoFeedGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ PhotosPhotoFeedGetResponseDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
