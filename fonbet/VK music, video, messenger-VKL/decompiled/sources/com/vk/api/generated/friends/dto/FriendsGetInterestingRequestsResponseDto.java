package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: FriendsGetInterestingRequestsResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetInterestingRequestsResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetInterestingRequestsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("count_unread")
    private final Integer countUnread;

    @pmi0("items")
    private final List<FriendsInterestingRequestDto> items;

    @pmi0("last_viewed")
    private final Integer lastViewed;

    /* compiled from: FriendsGetInterestingRequestsResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetInterestingRequestsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetInterestingRequestsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(FriendsInterestingRequestDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new FriendsGetInterestingRequestsResponseDto(readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetInterestingRequestsResponseDto[] newArray(int i) {
            return new FriendsGetInterestingRequestsResponseDto[i];
        }
    }

    public FriendsGetInterestingRequestsResponseDto(int i, List<FriendsInterestingRequestDto> list, Integer num, Integer num2) {
        this.count = i;
        this.items = list;
        this.countUnread = num;
        this.lastViewed = num2;
    }

    public final List<FriendsInterestingRequestDto> d() {
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
        if (!(obj instanceof FriendsGetInterestingRequestsResponseDto)) {
            return false;
        }
        FriendsGetInterestingRequestsResponseDto friendsGetInterestingRequestsResponseDto = (FriendsGetInterestingRequestsResponseDto) obj;
        return this.count == friendsGetInterestingRequestsResponseDto.count && epx.f(this.items, friendsGetInterestingRequestsResponseDto.items) && epx.f(this.countUnread, friendsGetInterestingRequestsResponseDto.countUnread) && epx.f(this.lastViewed, friendsGetInterestingRequestsResponseDto.lastViewed);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.countUnread;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastViewed;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsGetInterestingRequestsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", countUnread=");
        sb.append(this.countUnread);
        sb.append(", lastViewed=");
        return uqi.b(sb, this.lastViewed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((FriendsInterestingRequestDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.countUnread;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.lastViewed;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ FriendsGetInterestingRequestsResponseDto(int i, List list, Integer num, Integer num2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }
}
