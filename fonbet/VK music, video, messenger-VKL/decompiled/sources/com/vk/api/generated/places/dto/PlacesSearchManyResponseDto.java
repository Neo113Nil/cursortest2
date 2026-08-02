package com.vk.api.generated.places.dto;

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

/* compiled from: PlacesSearchManyResponseDto.kt */
/* loaded from: classes15.dex */
public final class PlacesSearchManyResponseDto implements Parcelable {
    public static final Parcelable.Creator<PlacesSearchManyResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PlacesPlaceWithDistanceDto> items;

    /* compiled from: PlacesSearchManyResponseDto.kt */
    public static final class a implements Parcelable.Creator<PlacesSearchManyResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesSearchManyResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PlacesPlaceWithDistanceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlacesSearchManyResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesSearchManyResponseDto[] newArray(int i) {
            return new PlacesSearchManyResponseDto[i];
        }
    }

    public PlacesSearchManyResponseDto(int i, List<PlacesPlaceWithDistanceDto> list) {
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
        if (!(obj instanceof PlacesSearchManyResponseDto)) {
            return false;
        }
        PlacesSearchManyResponseDto placesSearchManyResponseDto = (PlacesSearchManyResponseDto) obj;
        return this.count == placesSearchManyResponseDto.count && epx.f(this.items, placesSearchManyResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesSearchManyResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((PlacesPlaceWithDistanceDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
