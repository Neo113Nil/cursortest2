package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosGetAllResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetAllResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetAllResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    @pmi0("more")
    private final BaseBoolIntDto more;

    /* compiled from: PhotosGetAllResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetAllResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetAllResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(PhotosGetAllResponseDto.class, parcel, arrayList, i, 1);
            }
            return new PhotosGetAllResponseDto(readInt, arrayList, (BaseBoolIntDto) parcel.readParcelable(PhotosGetAllResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetAllResponseDto[] newArray(int i) {
            return new PhotosGetAllResponseDto[i];
        }
    }

    public PhotosGetAllResponseDto(int i, List<PhotosPhotoDto> list, BaseBoolIntDto baseBoolIntDto) {
        this.count = i;
        this.items = list;
        this.more = baseBoolIntDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetAllResponseDto)) {
            return false;
        }
        PhotosGetAllResponseDto photosGetAllResponseDto = (PhotosGetAllResponseDto) obj;
        return this.count == photosGetAllResponseDto.count && epx.f(this.items, photosGetAllResponseDto.items) && this.more == photosGetAllResponseDto.more;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        BaseBoolIntDto baseBoolIntDto = this.more;
        return a2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode());
    }

    public final String toString() {
        return "PhotosGetAllResponseDto(count=" + this.count + ", items=" + this.items + ", more=" + this.more + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.more, i);
    }

    public /* synthetic */ PhotosGetAllResponseDto(int i, List list, BaseBoolIntDto baseBoolIntDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : baseBoolIntDto);
    }
}
