package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: UsersCareerDto.kt */
/* loaded from: classes15.dex */
public final class UsersCareerDto implements Parcelable {
    public static final Parcelable.Creator<UsersCareerDto> CREATOR = new a();

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

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final Integer id;

    @pmi0(X3.i.L)
    private final String position;

    @pmi0("until")
    private final Integer until;

    /* compiled from: UsersCareerDto.kt */
    public static final class a implements Parcelable.Creator<UsersCareerDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersCareerDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            Integer num2;
            Integer num3;
            UserId userId;
            Integer num4;
            String str;
            Integer valueOf2;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            Integer num5 = num;
            String readString2 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? num5 : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? num5 : Integer.valueOf(parcel.readInt());
            UserId userId2 = (UserId) parcel.readParcelable(UsersCareerDto.class.getClassLoader());
            Integer valueOf5 = parcel.readInt() == 0 ? num5 : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = num5;
                num2 = valueOf3;
                num3 = valueOf4;
                userId = userId2;
                num4 = valueOf5;
                str = readString3;
            } else {
                num2 = valueOf3;
                num3 = valueOf4;
                userId = userId2;
                num4 = valueOf5;
                str = readString3;
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new UsersCareerDto(valueOf, readString, readString2, num2, num3, userId, num4, str, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersCareerDto[] newArray(int i) {
            return new UsersCareerDto[i];
        }
    }

    public UsersCareerDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final String d() {
        return this.company;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersCareerDto)) {
            return false;
        }
        UsersCareerDto usersCareerDto = (UsersCareerDto) obj;
        return epx.f(this.cityId, usersCareerDto.cityId) && epx.f(this.cityName, usersCareerDto.cityName) && epx.f(this.company, usersCareerDto.company) && epx.f(this.countryId, usersCareerDto.countryId) && epx.f(this.from, usersCareerDto.from) && epx.f(this.groupId, usersCareerDto.groupId) && epx.f(this.id, usersCareerDto.id) && epx.f(this.position, usersCareerDto.position) && epx.f(this.until, usersCareerDto.until);
    }

    public final int hashCode() {
        Integer num = this.cityId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.cityName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.company;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.countryId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.from;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num4 = this.id;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.position;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.until;
        return hashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersCareerDto(cityId=");
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

    public UsersCareerDto(Integer num, String str, String str2, Integer num2, Integer num3, UserId userId, Integer num4, String str3, Integer num5) {
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

    public /* synthetic */ UsersCareerDto(Integer num, String str, String str2, Integer num2, Integer num3, UserId userId, Integer num4, String str3, Integer num5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : userId, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : num5);
    }
}
