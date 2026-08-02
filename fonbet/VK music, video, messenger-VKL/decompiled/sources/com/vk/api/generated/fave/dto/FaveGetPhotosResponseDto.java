package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: FaveGetPhotosResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetPhotosResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveGetPhotosResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: FaveGetPhotosResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetPhotosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetPhotosResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(FaveGetPhotosResponseDto.class, parcel, arrayList, i, 1);
            }
            return new FaveGetPhotosResponseDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetPhotosResponseDto[] newArray(int i) {
            return new FaveGetPhotosResponseDto[i];
        }
    }

    public FaveGetPhotosResponseDto(int i, List<PhotosPhotoDto> list, String str) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetPhotosResponseDto)) {
            return false;
        }
        FaveGetPhotosResponseDto faveGetPhotosResponseDto = (FaveGetPhotosResponseDto) obj;
        return this.count == faveGetPhotosResponseDto.count && epx.f(this.items, faveGetPhotosResponseDto.items) && epx.f(this.nextFrom, faveGetPhotosResponseDto.nextFrom);
    }

    public final int hashCode() {
        return this.nextFrom.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetPhotosResponseDto(count=");
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
}
