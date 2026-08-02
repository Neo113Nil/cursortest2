package com.vk.api.generated.stories.dto;

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

/* compiled from: StoriesGetUnseenStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetUnseenStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetUnseenStatusResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<StoriesUnseenStatusItemDto> items;

    /* compiled from: StoriesGetUnseenStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetUnseenStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetUnseenStatusResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoriesUnseenStatusItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoriesGetUnseenStatusResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetUnseenStatusResponseDto[] newArray(int i) {
            return new StoriesGetUnseenStatusResponseDto[i];
        }
    }

    public StoriesGetUnseenStatusResponseDto(List<StoriesUnseenStatusItemDto> list) {
        this.items = list;
    }

    public final List<StoriesUnseenStatusItemDto> d() {
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
        return (obj instanceof StoriesGetUnseenStatusResponseDto) && epx.f(this.items, ((StoriesGetUnseenStatusResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StoriesGetUnseenStatusResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoriesUnseenStatusItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
