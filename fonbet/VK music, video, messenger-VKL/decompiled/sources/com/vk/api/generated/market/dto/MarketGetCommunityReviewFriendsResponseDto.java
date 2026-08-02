package com.vk.api.generated.market.dto;

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
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketGetCommunityReviewFriendsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCommunityReviewFriendsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCommunityReviewFriendsResponseDto> CREATOR = new a();

    @pmi0("collection")
    private final List<MarketCommunityReviewFriendDto> collection;

    @pmi0("has_next")
    private final Boolean hasNext;

    @pmi0("next_offset")
    private final Integer nextOffset;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: MarketGetCommunityReviewFriendsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCommunityReviewFriendsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewFriendsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketCommunityReviewFriendDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketGetCommunityReviewFriendsResponseDto(readInt, arrayList, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCommunityReviewFriendsResponseDto[] newArray(int i) {
            return new MarketGetCommunityReviewFriendsResponseDto[i];
        }
    }

    public MarketGetCommunityReviewFriendsResponseDto(int i, List<MarketCommunityReviewFriendDto> list, Boolean bool, Integer num) {
        this.totalCount = i;
        this.collection = list;
        this.hasNext = bool;
        this.nextOffset = num;
    }

    public final List<MarketCommunityReviewFriendDto> d() {
        return this.collection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.hasNext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCommunityReviewFriendsResponseDto)) {
            return false;
        }
        MarketGetCommunityReviewFriendsResponseDto marketGetCommunityReviewFriendsResponseDto = (MarketGetCommunityReviewFriendsResponseDto) obj;
        return this.totalCount == marketGetCommunityReviewFriendsResponseDto.totalCount && epx.f(this.collection, marketGetCommunityReviewFriendsResponseDto.collection) && epx.f(this.hasNext, marketGetCommunityReviewFriendsResponseDto.hasNext) && epx.f(this.nextOffset, marketGetCommunityReviewFriendsResponseDto.nextOffset);
    }

    public final Integer f() {
        return this.nextOffset;
    }

    public final int g() {
        return this.totalCount;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.totalCount) * 31, 31, this.collection);
        Boolean bool = this.hasNext;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextOffset;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetCommunityReviewFriendsResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", collection=");
        sb.append(this.collection);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(", nextOffset=");
        return uqi.b(sb, this.nextOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        Iterator a2 = ao.a(parcel, this.collection);
        while (a2.hasNext()) {
            ((MarketCommunityReviewFriendDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.hasNext;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.nextOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarketGetCommunityReviewFriendsResponseDto(int i, List list, Boolean bool, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : num);
    }
}
