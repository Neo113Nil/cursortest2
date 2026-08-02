package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: StoriesGetSubscriptionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetSubscriptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetSubscriptionsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("owner_ids")
    private final List<UserId> ownerIds;

    /* compiled from: StoriesGetSubscriptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetSubscriptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetSubscriptionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(StoriesGetSubscriptionsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new StoriesGetSubscriptionsResponseDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetSubscriptionsResponseDto[] newArray(int i) {
            return new StoriesGetSubscriptionsResponseDto[i];
        }
    }

    public StoriesGetSubscriptionsResponseDto(int i, String str, List<UserId> list) {
        this.count = i;
        this.nextFrom = str;
        this.ownerIds = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetSubscriptionsResponseDto)) {
            return false;
        }
        StoriesGetSubscriptionsResponseDto storiesGetSubscriptionsResponseDto = (StoriesGetSubscriptionsResponseDto) obj;
        return this.count == storiesGetSubscriptionsResponseDto.count && epx.f(this.nextFrom, storiesGetSubscriptionsResponseDto.nextFrom) && epx.f(this.ownerIds, storiesGetSubscriptionsResponseDto.ownerIds);
    }

    public final int hashCode() {
        return this.ownerIds.hashCode() + urd0.a(Integer.hashCode(this.count) * 31, 31, this.nextFrom);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetSubscriptionsResponseDto(count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", ownerIds=");
        return ms9.a(')', sb, this.ownerIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeString(this.nextFrom);
        Iterator a2 = ao.a(parcel, this.ownerIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
