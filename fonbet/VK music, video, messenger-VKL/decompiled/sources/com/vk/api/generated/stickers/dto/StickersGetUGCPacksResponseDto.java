package com.vk.api.generated.stickers.dto;

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

/* compiled from: StickersGetUGCPacksResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersGetUGCPacksResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersGetUGCPacksResponseDto> CREATOR = new a();

    @pmi0("packs")
    private final List<StickersUgcPackDto> packs;

    /* compiled from: StickersGetUGCPacksResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersGetUGCPacksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersGetUGCPacksResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StickersUgcPackDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersGetUGCPacksResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersGetUGCPacksResponseDto[] newArray(int i) {
            return new StickersGetUGCPacksResponseDto[i];
        }
    }

    public StickersGetUGCPacksResponseDto(List<StickersUgcPackDto> list) {
        this.packs = list;
    }

    public final List<StickersUgcPackDto> d() {
        return this.packs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersGetUGCPacksResponseDto) && epx.f(this.packs, ((StickersGetUGCPacksResponseDto) obj).packs);
    }

    public final int hashCode() {
        return this.packs.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StickersGetUGCPacksResponseDto(packs="), this.packs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.packs);
        while (a2.hasNext()) {
            ((StickersUgcPackDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
