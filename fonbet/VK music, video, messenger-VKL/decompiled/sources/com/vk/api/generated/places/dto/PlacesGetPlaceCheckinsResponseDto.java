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

/* compiled from: PlacesGetPlaceCheckinsResponseDto.kt */
/* loaded from: classes15.dex */
public final class PlacesGetPlaceCheckinsResponseDto implements Parcelable {
    public static final Parcelable.Creator<PlacesGetPlaceCheckinsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PlacesCheckinDto> items;

    /* compiled from: PlacesGetPlaceCheckinsResponseDto.kt */
    public static final class a implements Parcelable.Creator<PlacesGetPlaceCheckinsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesGetPlaceCheckinsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(PlacesCheckinDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlacesGetPlaceCheckinsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesGetPlaceCheckinsResponseDto[] newArray(int i) {
            return new PlacesGetPlaceCheckinsResponseDto[i];
        }
    }

    public PlacesGetPlaceCheckinsResponseDto(int i, List<PlacesCheckinDto> list) {
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
        if (!(obj instanceof PlacesGetPlaceCheckinsResponseDto)) {
            return false;
        }
        PlacesGetPlaceCheckinsResponseDto placesGetPlaceCheckinsResponseDto = (PlacesGetPlaceCheckinsResponseDto) obj;
        return this.count == placesGetPlaceCheckinsResponseDto.count && epx.f(this.items, placesGetPlaceCheckinsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesGetPlaceCheckinsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((PlacesCheckinDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
