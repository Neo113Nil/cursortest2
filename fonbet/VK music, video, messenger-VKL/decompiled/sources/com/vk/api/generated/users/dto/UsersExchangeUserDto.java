package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UsersExchangeUserDto.kt */
/* loaded from: classes15.dex */
public final class UsersExchangeUserDto implements Parcelable {
    public static final Parcelable.Creator<UsersExchangeUserDto> CREATOR = new a();

    @pmi0("account_security_level")
    private final Integer accountSecurityLevel;

    @pmi0("age_group")
    private final Integer ageGroup;

    @pmi0("can_activate_until_date")
    private final Integer canActivateUntilDate;

    @pmi0("email")
    private final String email;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_banned")
    private final Boolean isBanned;

    @pmi0("is_banned_forever")
    private final Boolean isBannedForever;

    @pmi0("is_celebrity")
    private final Boolean isCelebrity;

    @pmi0("is_deactivated")
    private final Boolean isDeactivated;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("unban_date")
    private final Integer unbanDate;

    /* compiled from: UsersExchangeUserDto.kt */
    public static final class a implements Parcelable.Creator<UsersExchangeUserDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersExchangeUserDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(UsersExchangeUserDto.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UsersExchangeUserDto(readString, readString2, readString3, userId, readString4, readString5, readString6, valueOf, valueOf2, valueOf6, valueOf3, valueOf7, valueOf4, valueOf5, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersExchangeUserDto[] newArray(int i) {
            return new UsersExchangeUserDto[i];
        }
    }

    public UsersExchangeUserDto(String str, String str2, String str3, UserId userId, String str4, String str5, String str6, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Integer num3, Integer num4) {
        this.firstName = str;
        this.lastName = str2;
        this.screenName = str3;
        this.id = userId;
        this.photo200 = str4;
        this.phone = str5;
        this.email = str6;
        this.isBanned = bool;
        this.isBannedForever = bool2;
        this.unbanDate = num;
        this.isDeactivated = bool3;
        this.canActivateUntilDate = num2;
        this.isCelebrity = bool4;
        this.isVerified = bool5;
        this.accountSecurityLevel = num3;
        this.ageGroup = num4;
    }

    public final String d() {
        return this.email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersExchangeUserDto)) {
            return false;
        }
        UsersExchangeUserDto usersExchangeUserDto = (UsersExchangeUserDto) obj;
        return epx.f(this.firstName, usersExchangeUserDto.firstName) && epx.f(this.lastName, usersExchangeUserDto.lastName) && epx.f(this.screenName, usersExchangeUserDto.screenName) && epx.f(this.id, usersExchangeUserDto.id) && epx.f(this.photo200, usersExchangeUserDto.photo200) && epx.f(this.phone, usersExchangeUserDto.phone) && epx.f(this.email, usersExchangeUserDto.email) && epx.f(this.isBanned, usersExchangeUserDto.isBanned) && epx.f(this.isBannedForever, usersExchangeUserDto.isBannedForever) && epx.f(this.unbanDate, usersExchangeUserDto.unbanDate) && epx.f(this.isDeactivated, usersExchangeUserDto.isDeactivated) && epx.f(this.canActivateUntilDate, usersExchangeUserDto.canActivateUntilDate) && epx.f(this.isCelebrity, usersExchangeUserDto.isCelebrity) && epx.f(this.isVerified, usersExchangeUserDto.isVerified) && epx.f(this.accountSecurityLevel, usersExchangeUserDto.accountSecurityLevel) && epx.f(this.ageGroup, usersExchangeUserDto.ageGroup);
    }

    public final UserId f() {
        return this.id;
    }

    public final String g() {
        return this.lastName;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.screenName);
        UserId userId = this.id;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.photo200;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isBanned;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBannedForever;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.unbanDate;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.isDeactivated;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.canActivateUntilDate;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.isCelebrity;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isVerified;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.accountSecurityLevel;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ageGroup;
        return hashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String i() {
        return this.phone;
    }

    public final String j() {
        return this.photo200;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersExchangeUserDto(firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", isBanned=");
        sb.append(this.isBanned);
        sb.append(", isBannedForever=");
        sb.append(this.isBannedForever);
        sb.append(", unbanDate=");
        sb.append(this.unbanDate);
        sb.append(", isDeactivated=");
        sb.append(this.isDeactivated);
        sb.append(", canActivateUntilDate=");
        sb.append(this.canActivateUntilDate);
        sb.append(", isCelebrity=");
        sb.append(this.isCelebrity);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", accountSecurityLevel=");
        sb.append(this.accountSecurityLevel);
        sb.append(", ageGroup=");
        return uqi.b(sb, this.ageGroup, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.screenName);
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.photo200);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        Boolean bool = this.isBanned;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBannedForever;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.unbanDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool3 = this.isDeactivated;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num2 = this.canActivateUntilDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool4 = this.isCelebrity;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isVerified;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Integer num3 = this.accountSecurityLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.ageGroup;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ UsersExchangeUserDto(String str, String str2, String str3, UserId userId, String str4, String str5, String str6, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Integer num3, Integer num4, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : bool4, (i & 8192) != 0 ? null : bool5, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : num4);
    }
}
