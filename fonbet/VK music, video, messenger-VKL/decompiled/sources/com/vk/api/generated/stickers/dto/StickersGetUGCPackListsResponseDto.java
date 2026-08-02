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

/* compiled from: StickersGetUGCPackListsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersGetUGCPackListsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersGetUGCPackListsResponseDto> CREATOR = new a();

    @pmi0("lists")
    private final List<StickersUgcPacksListDto> lists;

    /* compiled from: StickersGetUGCPackListsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersGetUGCPackListsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersGetUGCPackListsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StickersUgcPacksListDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersGetUGCPackListsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersGetUGCPackListsResponseDto[] newArray(int i) {
            return new StickersGetUGCPackListsResponseDto[i];
        }
    }

    public StickersGetUGCPackListsResponseDto(List<StickersUgcPacksListDto> list) {
        this.lists = list;
    }

    public final List<StickersUgcPacksListDto> d() {
        return this.lists;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersGetUGCPackListsResponseDto) && epx.f(this.lists, ((StickersGetUGCPackListsResponseDto) obj).lists);
    }

    public final int hashCode() {
        return this.lists.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StickersGetUGCPackListsResponseDto(lists="), this.lists);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.lists);
        while (a2.hasNext()) {
            ((StickersUgcPacksListDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
