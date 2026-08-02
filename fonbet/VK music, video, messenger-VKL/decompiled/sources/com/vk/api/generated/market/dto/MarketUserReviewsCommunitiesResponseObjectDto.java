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
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketUserReviewsCommunitiesResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketUserReviewsCommunitiesResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketUserReviewsCommunitiesResponseObjectDto> CREATOR = new a();

    @pmi0("communities_reviews")
    private final List<MarketUserReviewsCommunitiesReviewDto> communitiesReviews;

    @pmi0("count")
    private final int count;

    @pmi0("has_next")
    private final Boolean hasNext;

    @pmi0("last_id")
    private final int lastId;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketUserReviewsCommunitiesResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketUserReviewsCommunitiesResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsCommunitiesResponseObjectDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(MarketUserReviewsCommunitiesReviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketUserReviewsCommunitiesResponseObjectDto(readString, readInt, readInt2, arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketUserReviewsCommunitiesResponseObjectDto[] newArray(int i) {
            return new MarketUserReviewsCommunitiesResponseObjectDto[i];
        }
    }

    public MarketUserReviewsCommunitiesResponseObjectDto(String str, int i, int i2, List<MarketUserReviewsCommunitiesReviewDto> list, Boolean bool) {
        this.title = str;
        this.count = i;
        this.lastId = i2;
        this.communitiesReviews = list;
        this.hasNext = bool;
    }

    public final List<MarketUserReviewsCommunitiesReviewDto> d() {
        return this.communitiesReviews;
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
        if (!(obj instanceof MarketUserReviewsCommunitiesResponseObjectDto)) {
            return false;
        }
        MarketUserReviewsCommunitiesResponseObjectDto marketUserReviewsCommunitiesResponseObjectDto = (MarketUserReviewsCommunitiesResponseObjectDto) obj;
        return epx.f(this.title, marketUserReviewsCommunitiesResponseObjectDto.title) && this.count == marketUserReviewsCommunitiesResponseObjectDto.count && this.lastId == marketUserReviewsCommunitiesResponseObjectDto.lastId && epx.f(this.communitiesReviews, marketUserReviewsCommunitiesResponseObjectDto.communitiesReviews) && epx.f(this.hasNext, marketUserReviewsCommunitiesResponseObjectDto.hasNext);
    }

    public final int f() {
        return this.lastId;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.lastId, shy.a(this.count, this.title.hashCode() * 31, 31), 31), 31, this.communitiesReviews);
        Boolean bool = this.hasNext;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUserReviewsCommunitiesResponseObjectDto(title=");
        sb.append(this.title);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", lastId=");
        sb.append(this.lastId);
        sb.append(", communitiesReviews=");
        sb.append(this.communitiesReviews);
        sb.append(", hasNext=");
        return tn.a(sb, this.hasNext, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
        parcel.writeInt(this.lastId);
        Iterator a2 = ao.a(parcel, this.communitiesReviews);
        while (a2.hasNext()) {
            ((MarketUserReviewsCommunitiesReviewDto) a2.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.hasNext;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketUserReviewsCommunitiesResponseObjectDto(String str, int i, int i2, List list, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, list, (i3 & 16) != 0 ? null : bool);
    }
}
