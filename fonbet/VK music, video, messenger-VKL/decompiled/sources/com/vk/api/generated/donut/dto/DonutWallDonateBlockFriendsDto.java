package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutWallDonateBlockFriendsDto.kt */
/* loaded from: classes14.dex */
public final class DonutWallDonateBlockFriendsDto implements Parcelable {
    public static final Parcelable.Creator<DonutWallDonateBlockFriendsDto> CREATOR = new a();

    @pmi0("footer_text")
    private final String footerText;

    @pmi0("friends_ids")
    private final List<UserId> friendsIds;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: DonutWallDonateBlockFriendsDto.kt */
    public static final class a implements Parcelable.Creator<DonutWallDonateBlockFriendsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutWallDonateBlockFriendsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(DonutWallDonateBlockFriendsDto.class, parcel, arrayList, i, 1);
            }
            return new DonutWallDonateBlockFriendsDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutWallDonateBlockFriendsDto[] newArray(int i) {
            return new DonutWallDonateBlockFriendsDto[i];
        }
    }

    public DonutWallDonateBlockFriendsDto(int i, List<UserId> list, String str) {
        this.totalCount = i;
        this.friendsIds = list;
        this.footerText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutWallDonateBlockFriendsDto)) {
            return false;
        }
        DonutWallDonateBlockFriendsDto donutWallDonateBlockFriendsDto = (DonutWallDonateBlockFriendsDto) obj;
        return this.totalCount == donutWallDonateBlockFriendsDto.totalCount && epx.f(this.friendsIds, donutWallDonateBlockFriendsDto.friendsIds) && epx.f(this.footerText, donutWallDonateBlockFriendsDto.footerText);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.totalCount) * 31, 31, this.friendsIds);
        String str = this.footerText;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutWallDonateBlockFriendsDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", friendsIds=");
        sb.append(this.friendsIds);
        sb.append(", footerText=");
        return ho8.a(sb, this.footerText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        Iterator a2 = ao.a(parcel, this.friendsIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.footerText);
    }

    public /* synthetic */ DonutWallDonateBlockFriendsDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
