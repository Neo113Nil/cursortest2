package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCommunityReviewFriendsDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityReviewFriendsDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityReviewFriendsDto> CREATOR = new a();

    @pmi0("collection")
    private final List<MarketCommunityReviewFriendDto> collection;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: MarketCommunityReviewFriendsDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityReviewFriendsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewFriendsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(MarketCommunityReviewFriendDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketCommunityReviewFriendsDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewFriendsDto[] newArray(int i) {
            return new MarketCommunityReviewFriendsDto[i];
        }
    }

    public MarketCommunityReviewFriendsDto(int i, List<MarketCommunityReviewFriendDto> list) {
        this.totalCount = i;
        this.collection = list;
    }

    public final List<MarketCommunityReviewFriendDto> d() {
        return this.collection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.totalCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityReviewFriendsDto)) {
            return false;
        }
        MarketCommunityReviewFriendsDto marketCommunityReviewFriendsDto = (MarketCommunityReviewFriendsDto) obj;
        return this.totalCount == marketCommunityReviewFriendsDto.totalCount && epx.f(this.collection, marketCommunityReviewFriendsDto.collection);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.totalCount) * 31;
        List<MarketCommunityReviewFriendDto> list = this.collection;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCommunityReviewFriendsDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", collection=");
        return ms9.a(')', sb, this.collection);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        List<MarketCommunityReviewFriendDto> list = this.collection;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketCommunityReviewFriendDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCommunityReviewFriendsDto(int i, List list, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list);
    }
}
