package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: NewsfeedGetUserTopicsResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetUserTopicsResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetUserTopicsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<NewsfeedUserTopicDto> items;

    /* compiled from: NewsfeedGetUserTopicsResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetUserTopicsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetUserTopicsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NewsfeedUserTopicDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NewsfeedGetUserTopicsResponseDto(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetUserTopicsResponseDto[] newArray(int i) {
            return new NewsfeedGetUserTopicsResponseDto[i];
        }
    }

    public NewsfeedGetUserTopicsResponseDto(List<NewsfeedUserTopicDto> list, int i) {
        this.items = list;
        this.count = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetUserTopicsResponseDto)) {
            return false;
        }
        NewsfeedGetUserTopicsResponseDto newsfeedGetUserTopicsResponseDto = (NewsfeedGetUserTopicsResponseDto) obj;
        return epx.f(this.items, newsfeedGetUserTopicsResponseDto.items) && this.count == newsfeedGetUserTopicsResponseDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetUserTopicsResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NewsfeedUserTopicDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
    }
}
