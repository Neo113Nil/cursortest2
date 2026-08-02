package com.vk.api.generated.gifts.dto;

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

/* compiled from: GiftsGetResponseDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GiftsGiftDto> items;

    /* compiled from: GiftsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(GiftsGiftDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GiftsGetResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGetResponseDto[] newArray(int i) {
            return new GiftsGetResponseDto[i];
        }
    }

    public GiftsGetResponseDto(int i, List<GiftsGiftDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<GiftsGiftDto> d() {
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
        if (!(obj instanceof GiftsGetResponseDto)) {
            return false;
        }
        GiftsGetResponseDto giftsGetResponseDto = (GiftsGetResponseDto) obj;
        return this.count == giftsGetResponseDto.count && epx.f(this.items, giftsGetResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((GiftsGiftDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
