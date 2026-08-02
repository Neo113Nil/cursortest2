package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BadgesGetOwnerInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class BadgesGetOwnerInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<BadgesGetOwnerInfoResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("owner_info")
    private final BadgesOwnerInfoDto ownerInfo;

    @pmi0("users")
    private final List<UsersUserFullDto> users;

    /* compiled from: BadgesGetOwnerInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<BadgesGetOwnerInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesGetOwnerInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            BadgesOwnerInfoDto createFromParcel = parcel.readInt() == 0 ? null : BadgesOwnerInfoDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(BadgesGetOwnerInfoResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new BadgesGetOwnerInfoResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesGetOwnerInfoResponseDto[] newArray(int i) {
            return new BadgesGetOwnerInfoResponseDto[i];
        }
    }

    public BadgesGetOwnerInfoResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesGetOwnerInfoResponseDto)) {
            return false;
        }
        BadgesGetOwnerInfoResponseDto badgesGetOwnerInfoResponseDto = (BadgesGetOwnerInfoResponseDto) obj;
        return epx.f(this.ownerInfo, badgesGetOwnerInfoResponseDto.ownerInfo) && epx.f(this.badges, badgesGetOwnerInfoResponseDto.badges) && epx.f(this.users, badgesGetOwnerInfoResponseDto.users);
    }

    public final int hashCode() {
        BadgesOwnerInfoDto badgesOwnerInfoDto = this.ownerInfo;
        int hashCode = (badgesOwnerInfoDto == null ? 0 : badgesOwnerInfoDto.hashCode()) * 31;
        List<BadgesBadgeDto> list = this.badges;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.users;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesGetOwnerInfoResponseDto(ownerInfo=");
        sb.append(this.ownerInfo);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", users=");
        return ms9.a(')', sb, this.users);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BadgesOwnerInfoDto badgesOwnerInfoDto = this.ownerInfo;
        if (badgesOwnerInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesOwnerInfoDto.writeToParcel(parcel, i);
        }
        List<BadgesBadgeDto> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BadgesBadgeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersUserFullDto> list2 = this.users;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public BadgesGetOwnerInfoResponseDto(BadgesOwnerInfoDto badgesOwnerInfoDto, List<BadgesBadgeDto> list, List<UsersUserFullDto> list2) {
        this.ownerInfo = badgesOwnerInfoDto;
        this.badges = list;
        this.users = list2;
    }

    public /* synthetic */ BadgesGetOwnerInfoResponseDto(BadgesOwnerInfoDto badgesOwnerInfoDto, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : badgesOwnerInfoDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
