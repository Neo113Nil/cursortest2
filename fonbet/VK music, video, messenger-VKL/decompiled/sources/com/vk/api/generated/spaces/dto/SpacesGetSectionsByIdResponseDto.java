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

/* compiled from: SpacesGetSectionsByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesGetSectionsByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesGetSectionsByIdResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<SpacesSectionDto> items;

    /* compiled from: SpacesGetSectionsByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesGetSectionsByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesGetSectionsByIdResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SpacesSectionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SpacesGetSectionsByIdResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesGetSectionsByIdResponseDto[] newArray(int i) {
            return new SpacesGetSectionsByIdResponseDto[i];
        }
    }

    public SpacesGetSectionsByIdResponseDto(List<SpacesSectionDto> list) {
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
        return (obj instanceof SpacesGetSectionsByIdResponseDto) && epx.f(this.items, ((SpacesGetSectionsByIdResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("SpacesGetSectionsByIdResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SpacesSectionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
