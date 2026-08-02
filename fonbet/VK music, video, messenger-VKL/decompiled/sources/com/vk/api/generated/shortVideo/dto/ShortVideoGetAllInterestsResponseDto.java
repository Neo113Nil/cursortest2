package com.vk.api.generated.shortVideo.dto;

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

/* compiled from: ShortVideoGetAllInterestsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetAllInterestsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetAllInterestsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoInterestDto> items;

    /* compiled from: ShortVideoGetAllInterestsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetAllInterestsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetAllInterestsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoInterestDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetAllInterestsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetAllInterestsResponseDto[] newArray(int i) {
            return new ShortVideoGetAllInterestsResponseDto[i];
        }
    }

    public ShortVideoGetAllInterestsResponseDto(List<ShortVideoInterestDto> list) {
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
        return (obj instanceof ShortVideoGetAllInterestsResponseDto) && epx.f(this.items, ((ShortVideoGetAllInterestsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoGetAllInterestsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ShortVideoInterestDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
