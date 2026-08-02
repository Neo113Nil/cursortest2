package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCommunityReviewFriendDto.kt */
/* loaded from: classes15.dex */
public final class MarketCommunityReviewFriendDto implements Parcelable {
    public static final Parcelable.Creator<MarketCommunityReviewFriendDto> CREATOR = new a();

    @pmi0("first_name")
    private final String firstName;

    @pmi0("id")
    private final UserId id;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("review_id")
    private final Integer reviewId;

    @pmi0("review_mark")
    private final Integer reviewMark;

    /* compiled from: MarketCommunityReviewFriendDto.kt */
    public static final class a implements Parcelable.Creator<MarketCommunityReviewFriendDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewFriendDto createFromParcel(Parcel parcel) {
            return new MarketCommunityReviewFriendDto((UserId) parcel.readParcelable(MarketCommunityReviewFriendDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCommunityReviewFriendDto[] newArray(int i) {
            return new MarketCommunityReviewFriendDto[i];
        }
    }

    public MarketCommunityReviewFriendDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2) {
        this.id = userId;
        this.firstName = str;
        this.lastName = str2;
        this.photo50 = str3;
        this.photo100 = str4;
        this.photo200 = str5;
        this.photoBase = str6;
        this.reviewId = num;
        this.reviewMark = num2;
    }

    public final String d() {
        return this.firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCommunityReviewFriendDto)) {
            return false;
        }
        MarketCommunityReviewFriendDto marketCommunityReviewFriendDto = (MarketCommunityReviewFriendDto) obj;
        return epx.f(this.id, marketCommunityReviewFriendDto.id) && epx.f(this.firstName, marketCommunityReviewFriendDto.firstName) && epx.f(this.lastName, marketCommunityReviewFriendDto.lastName) && epx.f(this.photo50, marketCommunityReviewFriendDto.photo50) && epx.f(this.photo100, marketCommunityReviewFriendDto.photo100) && epx.f(this.photo200, marketCommunityReviewFriendDto.photo200) && epx.f(this.photoBase, marketCommunityReviewFriendDto.photoBase) && epx.f(this.reviewId, marketCommunityReviewFriendDto.reviewId) && epx.f(this.reviewMark, marketCommunityReviewFriendDto.reviewMark);
    }

    public final String f() {
        return this.lastName;
    }

    public final String g() {
        return this.photo100;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.firstName), 31, this.lastName);
        String str = this.photo50;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo100;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBase;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.reviewId;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reviewMark;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String i() {
        return this.photo200;
    }

    public final String j() {
        return this.photo50;
    }

    public final String k() {
        return this.photoBase;
    }

    public final Integer l() {
        return this.reviewId;
    }

    public final Integer n() {
        return this.reviewMark;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCommunityReviewFriendDto(id=");
        sb.append(this.id);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", reviewId=");
        sb.append(this.reviewId);
        sb.append(", reviewMark=");
        return uqi.b(sb, this.reviewMark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
        Integer num = this.reviewId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.reviewMark;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ MarketCommunityReviewFriendDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, int i, zcl zclVar) {
        this(userId, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2);
    }
}
