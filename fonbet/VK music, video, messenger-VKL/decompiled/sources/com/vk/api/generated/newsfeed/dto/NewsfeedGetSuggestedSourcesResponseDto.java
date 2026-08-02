package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: NewsfeedGetSuggestedSourcesResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetSuggestedSourcesResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetSuggestedSourcesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersSubscriptionsItemDto> items;

    /* compiled from: NewsfeedGetSuggestedSourcesResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetSuggestedSourcesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetSuggestedSourcesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(NewsfeedGetSuggestedSourcesResponseDto.class, parcel, arrayList, i, 1);
            }
            return new NewsfeedGetSuggestedSourcesResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetSuggestedSourcesResponseDto[] newArray(int i) {
            return new NewsfeedGetSuggestedSourcesResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetSuggestedSourcesResponseDto(int i, List<? extends UsersSubscriptionsItemDto> list) {
        this.count = i;
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
        if (!(obj instanceof NewsfeedGetSuggestedSourcesResponseDto)) {
            return false;
        }
        NewsfeedGetSuggestedSourcesResponseDto newsfeedGetSuggestedSourcesResponseDto = (NewsfeedGetSuggestedSourcesResponseDto) obj;
        return this.count == newsfeedGetSuggestedSourcesResponseDto.count && epx.f(this.items, newsfeedGetSuggestedSourcesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetSuggestedSourcesResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
