package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StoriesSearchGifResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesSearchGifResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesSearchGifResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<StoriesGifItemDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: StoriesSearchGifResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesSearchGifResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesSearchGifResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoriesGifItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoriesSearchGifResponseDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesSearchGifResponseDto[] newArray(int i) {
            return new StoriesSearchGifResponseDto[i];
        }
    }

    public StoriesSearchGifResponseDto(List<StoriesGifItemDto> list, String str) {
        this.items = list;
        this.nextFrom = str;
    }

    public final List<StoriesGifItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesSearchGifResponseDto)) {
            return false;
        }
        StoriesSearchGifResponseDto storiesSearchGifResponseDto = (StoriesSearchGifResponseDto) obj;
        return epx.f(this.items, storiesSearchGifResponseDto.items) && epx.f(this.nextFrom, storiesSearchGifResponseDto.nextFrom);
    }

    public final int hashCode() {
        return this.nextFrom.hashCode() + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesSearchGifResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoriesGifItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
    }
}
