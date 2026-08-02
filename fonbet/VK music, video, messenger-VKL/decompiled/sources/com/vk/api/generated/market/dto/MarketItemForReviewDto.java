package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: MarketItemForReviewDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemForReviewDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemForReviewDto> CREATOR = new a();

    @pmi0("community_id")
    private final UserId communityId;

    @pmi0("item_id")
    private final long itemId;

    @pmi0("order_id")
    private final int orderId;

    @pmi0("owner_info")
    private final MarketItemOwnerInfoDto ownerInfo;

    @pmi0("thumb")
    private final List<BaseImageDto> thumb;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketItemForReviewDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemForReviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemForReviewDto createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(MarketItemForReviewDto.class.getClassLoader());
            int readInt = parcel.readInt();
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketItemForReviewDto.class, parcel, arrayList, i, 1);
            }
            return new MarketItemForReviewDto(userId, readInt, readLong, readString, arrayList, MarketItemOwnerInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemForReviewDto[] newArray(int i) {
            return new MarketItemForReviewDto[i];
        }
    }

    public MarketItemForReviewDto(UserId userId, int i, long j, String str, List<BaseImageDto> list, MarketItemOwnerInfoDto marketItemOwnerInfoDto) {
        this.communityId = userId;
        this.orderId = i;
        this.itemId = j;
        this.title = str;
        this.thumb = list;
        this.ownerInfo = marketItemOwnerInfoDto;
    }

    public final UserId d() {
        return this.communityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemForReviewDto)) {
            return false;
        }
        MarketItemForReviewDto marketItemForReviewDto = (MarketItemForReviewDto) obj;
        return epx.f(this.communityId, marketItemForReviewDto.communityId) && this.orderId == marketItemForReviewDto.orderId && this.itemId == marketItemForReviewDto.itemId && epx.f(this.title, marketItemForReviewDto.title) && epx.f(this.thumb, marketItemForReviewDto.thumb) && epx.f(this.ownerInfo, marketItemForReviewDto.ownerInfo);
    }

    public final int f() {
        return this.orderId;
    }

    public final MarketItemOwnerInfoDto g() {
        return this.ownerInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.ownerInfo.hashCode() + fw3.a(urd0.a(bh10.a(shy.a(this.orderId, Long.hashCode(this.communityId.b) * 31, 31), 31, this.itemId), 31, this.title), 31, this.thumb);
    }

    public final List<BaseImageDto> i() {
        return this.thumb;
    }

    public final String toString() {
        return "MarketItemForReviewDto(communityId=" + this.communityId + ", orderId=" + this.orderId + ", itemId=" + this.itemId + ", title=" + this.title + ", thumb=" + this.thumb + ", ownerInfo=" + this.ownerInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.communityId, i);
        parcel.writeInt(this.orderId);
        parcel.writeLong(this.itemId);
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.thumb);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        this.ownerInfo.writeToParcel(parcel, i);
    }
}
