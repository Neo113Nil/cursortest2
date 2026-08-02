package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersUserFullProfileCareerDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserFullProfileCareerDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserFullProfileCareerDto> CREATOR = new a();

    @pmi0("city_id")
    private final Integer cityId;

    @pmi0("city_name")
    private final String cityName;

    @pmi0("company")
    private final String company;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final Integer countryId;

    @pmi0("from")
    private final Integer from;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final Integer id;

    @pmi0(X3.i.L)
    private final String position;

    @pmi0("until")
    private final Integer until;

    /* compiled from: UsersUserFullProfileCareerDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserFullProfileCareerDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileCareerDto createFromParcel(Parcel parcel) {
            UserId userId;
            GroupsGroupFullDto groupsGroupFullDto;
            Integer num;
            String str;
            Integer num2;
            Integer num3;
            Integer num4;
            String str2;
            Integer valueOf;
            GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) parcel.readParcelable(UsersUserFullProfileCareerDto.class.getClassLoader());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId2 = (UserId) parcel.readParcelable(UsersUserFullProfileCareerDto.class.getClassLoader());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                Integer num5 = valueOf3;
                userId = userId2;
                groupsGroupFullDto = groupsGroupFullDto2;
                num = valueOf2;
                str = readString;
                num2 = num5;
                valueOf = null;
                num3 = valueOf4;
                num4 = valueOf5;
                str2 = readString3;
            } else {
                Integer num6 = valueOf3;
                userId = userId2;
                groupsGroupFullDto = groupsGroupFullDto2;
                num = valueOf2;
                str = readString;
                num2 = num6;
                num3 = valueOf4;
                num4 = valueOf5;
                str2 = readString3;
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new UsersUserFullProfileCareerDto(groupsGroupFullDto, num, str, readString2, num2, num3, userId, num4, str2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileCareerDto[] newArray(int i) {
            return new UsersUserFullProfileCareerDto[i];
        }
    }

    public UsersUserFullProfileCareerDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final Integer d() {
        return this.cityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.company;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserFullProfileCareerDto)) {
            return false;
        }
        UsersUserFullProfileCareerDto usersUserFullProfileCareerDto = (UsersUserFullProfileCareerDto) obj;
        return epx.f(this.group, usersUserFullProfileCareerDto.group) && epx.f(this.cityId, usersUserFullProfileCareerDto.cityId) && epx.f(this.cityName, usersUserFullProfileCareerDto.cityName) && epx.f(this.company, usersUserFullProfileCareerDto.company) && epx.f(this.countryId, usersUserFullProfileCareerDto.countryId) && epx.f(this.from, usersUserFullProfileCareerDto.from) && epx.f(this.groupId, usersUserFullProfileCareerDto.groupId) && epx.f(this.id, usersUserFullProfileCareerDto.id) && epx.f(this.position, usersUserFullProfileCareerDto.position) && epx.f(this.until, usersUserFullProfileCareerDto.until);
    }

    public final Integer f() {
        return this.countryId;
    }

    public final Integer g() {
        return this.from;
    }

    public final int hashCode() {
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode = (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode()) * 31;
        Integer num = this.cityId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cityName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.company;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.countryId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.from;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode7 = (hashCode6 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num4 = this.id;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.position;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.until;
        return hashCode9 + (num5 != null ? num5.hashCode() : 0);
    }

    public final GroupsGroupFullDto i() {
        return this.group;
    }

    public final String j() {
        return this.position;
    }

    public final Integer k() {
        return this.until;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserFullProfileCareerDto(group=");
        sb.append(this.group);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", cityName=");
        sb.append(this.cityName);
        sb.append(", company=");
        sb.append(this.company);
        sb.append(", countryId=");
        sb.append(this.countryId);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", until=");
        return uqi.b(sb, this.until, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.group, i);
        Integer num = this.cityId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.cityName);
        parcel.writeString(this.company);
        Integer num2 = this.countryId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.from;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.groupId, i);
        Integer num4 = this.id;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.position);
        Integer num5 = this.until;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public UsersUserFullProfileCareerDto(GroupsGroupFullDto groupsGroupFullDto, Integer num, String str, String str2, Integer num2, Integer num3, UserId userId, Integer num4, String str3, Integer num5) {
        this.group = groupsGroupFullDto;
        this.cityId = num;
        this.cityName = str;
        this.company = str2;
        this.countryId = num2;
        this.from = num3;
        this.groupId = userId;
        this.id = num4;
        this.position = str3;
        this.until = num5;
    }

    public /* synthetic */ UsersUserFullProfileCareerDto(GroupsGroupFullDto groupsGroupFullDto, Integer num, String str, String str2, Integer num2, Integer num3, UserId userId, Integer num4, String str3, Integer num5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : groupsGroupFullDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : userId, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : num5);
    }
}
