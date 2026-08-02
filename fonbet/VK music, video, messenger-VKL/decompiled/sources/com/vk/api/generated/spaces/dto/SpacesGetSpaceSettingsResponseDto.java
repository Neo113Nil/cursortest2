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

/* compiled from: SpacesGetSpaceSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesGetSpaceSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesGetSpaceSettingsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<SpacesSettingsDto> items;

    /* compiled from: SpacesGetSpaceSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesGetSpaceSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesGetSpaceSettingsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SpacesSettingsDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SpacesGetSpaceSettingsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesGetSpaceSettingsResponseDto[] newArray(int i) {
            return new SpacesGetSpaceSettingsResponseDto[i];
        }
    }

    public SpacesGetSpaceSettingsResponseDto(List<SpacesSettingsDto> list) {
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
        return (obj instanceof SpacesGetSpaceSettingsResponseDto) && epx.f(this.items, ((SpacesGetSpaceSettingsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("SpacesGetSpaceSettingsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SpacesSettingsDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
