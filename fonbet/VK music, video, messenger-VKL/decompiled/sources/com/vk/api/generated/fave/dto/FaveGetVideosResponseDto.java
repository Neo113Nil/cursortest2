package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: FaveGetVideosResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetVideosResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveGetVideosResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<VideoVideoDto> items;

    /* compiled from: FaveGetVideosResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetVideosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetVideosResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(FaveGetVideosResponseDto.class, parcel, arrayList, i, 1);
            }
            return new FaveGetVideosResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetVideosResponseDto[] newArray(int i) {
            return new FaveGetVideosResponseDto[i];
        }
    }

    public FaveGetVideosResponseDto(int i, List<VideoVideoDto> list) {
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
        if (!(obj instanceof FaveGetVideosResponseDto)) {
            return false;
        }
        FaveGetVideosResponseDto faveGetVideosResponseDto = (FaveGetVideosResponseDto) obj;
        return this.count == faveGetVideosResponseDto.count && epx.f(this.items, faveGetVideosResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetVideosResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
