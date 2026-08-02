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

/* compiled from: PhotosGetRecognitionTagsResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetRecognitionTagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetRecognitionTagsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosTagsSuggestionItemDto> items;

    /* compiled from: PhotosGetRecognitionTagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetRecognitionTagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetRecognitionTagsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PhotosTagsSuggestionItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PhotosGetRecognitionTagsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetRecognitionTagsResponseDto[] newArray(int i) {
            return new PhotosGetRecognitionTagsResponseDto[i];
        }
    }

    public PhotosGetRecognitionTagsResponseDto(int i, List<PhotosTagsSuggestionItemDto> list) {
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
        if (!(obj instanceof PhotosGetRecognitionTagsResponseDto)) {
            return false;
        }
        PhotosGetRecognitionTagsResponseDto photosGetRecognitionTagsResponseDto = (PhotosGetRecognitionTagsResponseDto) obj;
        return this.count == photosGetRecognitionTagsResponseDto.count && epx.f(this.items, photosGetRecognitionTagsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetRecognitionTagsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((PhotosTagsSuggestionItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
