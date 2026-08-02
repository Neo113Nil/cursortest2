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

/* compiled from: MarketOrderSellerDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderSellerDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderSellerDto> CREATOR = new a();

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketOrderSellerDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderSellerDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderSellerDto createFromParcel(Parcel parcel) {
            return new MarketOrderSellerDto(parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(MarketOrderSellerDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderSellerDto[] newArray(int i) {
            return new MarketOrderSellerDto[i];
        }
    }

    public MarketOrderSellerDto(String str, String str2, UserId userId, Integer num) {
        this.title = str;
        this.name = str2;
        this.groupId = userId;
        this.contactId = num;
    }

    public final Integer d() {
        return this.contactId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.groupId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderSellerDto)) {
            return false;
        }
        MarketOrderSellerDto marketOrderSellerDto = (MarketOrderSellerDto) obj;
        return epx.f(this.title, marketOrderSellerDto.title) && epx.f(this.name, marketOrderSellerDto.name) && epx.f(this.groupId, marketOrderSellerDto.groupId) && epx.f(this.contactId, marketOrderSellerDto.contactId);
    }

    public final String f() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.name);
        UserId userId = this.groupId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.contactId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderSellerDto(title=");
        sb.append(this.title);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", contactId=");
        return uqi.b(sb, this.contactId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.groupId, i);
        Integer num = this.contactId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarketOrderSellerDto(String str, String str2, UserId userId, Integer num, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : num);
    }
}
