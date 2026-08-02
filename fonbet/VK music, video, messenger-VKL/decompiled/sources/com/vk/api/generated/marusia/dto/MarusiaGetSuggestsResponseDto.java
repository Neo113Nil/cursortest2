package com.vk.api.generated.marusia.dto;

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

/* compiled from: MarusiaGetSuggestsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetSuggestsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetSuggestsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MarusiaSuggestDto> items;

    /* compiled from: MarusiaGetSuggestsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetSuggestsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetSuggestsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarusiaSuggestDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarusiaGetSuggestsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetSuggestsResponseDto[] newArray(int i) {
            return new MarusiaGetSuggestsResponseDto[i];
        }
    }

    public MarusiaGetSuggestsResponseDto(List<MarusiaSuggestDto> list) {
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
        return (obj instanceof MarusiaGetSuggestsResponseDto) && epx.f(this.items, ((MarusiaGetSuggestsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarusiaGetSuggestsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarusiaSuggestDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
