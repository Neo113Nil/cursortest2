package com.vk.api.generated.newsfeed.dto;

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

/* compiled from: NewsfeedGetDzenBlockResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetDzenBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetDzenBlockResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<NewsfeedDzenBlockItemDto> items;

    /* compiled from: NewsfeedGetDzenBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetDzenBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDzenBlockResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NewsfeedDzenBlockItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NewsfeedGetDzenBlockResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDzenBlockResponseDto[] newArray(int i) {
            return new NewsfeedGetDzenBlockResponseDto[i];
        }
    }

    public NewsfeedGetDzenBlockResponseDto(List<NewsfeedDzenBlockItemDto> list) {
        this.items = list;
    }

    public final List<NewsfeedDzenBlockItemDto> d() {
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
        return (obj instanceof NewsfeedGetDzenBlockResponseDto) && epx.f(this.items, ((NewsfeedGetDzenBlockResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("NewsfeedGetDzenBlockResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NewsfeedDzenBlockItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
