package com.vk.api.generated.spaces.dto;

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

/* compiled from: SpacesGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesGetResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<SpacesSpaceDto> items;

    /* compiled from: SpacesGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SpacesSpaceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SpacesGetResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesGetResponseDto[] newArray(int i) {
            return new SpacesGetResponseDto[i];
        }
    }

    public SpacesGetResponseDto(List<SpacesSpaceDto> list) {
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
        return (obj instanceof SpacesGetResponseDto) && epx.f(this.items, ((SpacesGetResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("SpacesGetResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SpacesSpaceDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
