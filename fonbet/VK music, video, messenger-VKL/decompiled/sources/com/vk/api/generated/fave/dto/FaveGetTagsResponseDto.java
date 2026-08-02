package com.vk.api.generated.fave.dto;

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

/* compiled from: FaveGetTagsResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetTagsResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveGetTagsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<FaveTagDto> items;

    /* compiled from: FaveGetTagsResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetTagsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetTagsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(FaveTagDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new FaveGetTagsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetTagsResponseDto[] newArray(int i) {
            return new FaveGetTagsResponseDto[i];
        }
    }

    public FaveGetTagsResponseDto(int i, List<FaveTagDto> list) {
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
        if (!(obj instanceof FaveGetTagsResponseDto)) {
            return false;
        }
        FaveGetTagsResponseDto faveGetTagsResponseDto = (FaveGetTagsResponseDto) obj;
        return this.count == faveGetTagsResponseDto.count && epx.f(this.items, faveGetTagsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetTagsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((FaveTagDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
