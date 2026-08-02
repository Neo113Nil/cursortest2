package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountSwitcherInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountSwitcherInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountSwitcherInfoDto> CREATOR = new a();

    @pmi0("account_security_level")
    private final Integer accountSecurityLevel;

    @pmi0("age_group")
    private final Integer ageGroup;

    @pmi0("avatar")
    private final String avatar;

    @pmi0("can_activate_until_date")
    private final Integer canActivateUntilDate;

    @pmi0("counter")
    private final int counter;

    @pmi0("email")
    private final String email;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("index")
    private final int index;

    @pmi0("is_banned")
    private final boolean isBanned;

    @pmi0("is_banned_forever")
    private final boolean isBannedForever;

    @pmi0("is_celebrity")
    private final Boolean isCelebrity;

    @pmi0("is_deactivated")
    private final boolean isDeactivated;

    @pmi0("is_esia_verified")
    private final Boolean isEsiaVerified;

    @pmi0("is_gray_account")
    private final Boolean isGrayAccount;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("is_sber_verified")
    private final Boolean isSberVerified;

    @pmi0("is_tinkoff_verified")
    private final Boolean isTinkoffVerified;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("profile_type")
    private final Integer profileType;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("unban_date")
    private final Integer unbanDate;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: AccountSwitcherInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountSwitcherInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherInfoDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(AccountSwitcherInfoDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
                z3 = z;
            } else {
                z2 = true;
                z5 = z;
                z3 = z5;
            }
            String readString4 = parcel.readString();
            boolean z7 = z2;
            int readInt2 = parcel.readInt();
            boolean z8 = z3;
            String readString5 = parcel.readString();
            boolean z9 = z7;
            String readString6 = parcel.readString();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z9 : z8);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z9 : z8);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? z9 : z8);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? z9 : z8);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0 ? z9 : z8);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0 ? z9 : z8);
            }
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z9 = z8;
                }
                valueOf7 = Boolean.valueOf(z9);
            }
            return new AccountSwitcherInfoDto(readInt, userId, readString, readString2, readString3, z6, z4, z5, readString4, readInt2, readString5, readString6, valueOf8, valueOf9, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf10, valueOf11, valueOf7, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherInfoDto[] newArray(int i) {
            return new AccountSwitcherInfoDto[i];
        }
    }

    public AccountSwitcherInfoDto(int i, UserId userId, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, int i2, String str5, String str6, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Boolean bool7, Integer num5) {
        this.index = i;
        this.userId = userId;
        this.firstName = str;
        this.lastName = str2;
        this.avatar = str3;
        this.isBanned = z;
        this.isBannedForever = z2;
        this.isDeactivated = z3;
        this.screenName = str4;
        this.counter = i2;
        this.phone = str5;
        this.email = str6;
        this.unbanDate = num;
        this.canActivateUntilDate = num2;
        this.isCelebrity = bool;
        this.isSberVerified = bool2;
        this.isEsiaVerified = bool3;
        this.isTinkoffVerified = bool4;
        this.isNft = bool5;
        this.isVerified = bool6;
        this.accountSecurityLevel = num3;
        this.profileType = num4;
        this.isGrayAccount = bool7;
        this.ageGroup = num5;
    }

    public final boolean B() {
        return this.isBanned;
    }

    public final boolean C() {
        return this.isBannedForever;
    }

    public final Boolean D() {
        return this.isCelebrity;
    }

    public final boolean F() {
        return this.isDeactivated;
    }

    public final Boolean G() {
        return this.isGrayAccount;
    }

    public final Boolean K() {
        return this.isNft;
    }

    public final Boolean M() {
        return this.isVerified;
    }

    public final Integer d() {
        return this.accountSecurityLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.ageGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitcherInfoDto)) {
            return false;
        }
        AccountSwitcherInfoDto accountSwitcherInfoDto = (AccountSwitcherInfoDto) obj;
        return this.index == accountSwitcherInfoDto.index && epx.f(this.userId, accountSwitcherInfoDto.userId) && epx.f(this.firstName, accountSwitcherInfoDto.firstName) && epx.f(this.lastName, accountSwitcherInfoDto.lastName) && epx.f(this.avatar, accountSwitcherInfoDto.avatar) && this.isBanned == accountSwitcherInfoDto.isBanned && this.isBannedForever == accountSwitcherInfoDto.isBannedForever && this.isDeactivated == accountSwitcherInfoDto.isDeactivated && epx.f(this.screenName, accountSwitcherInfoDto.screenName) && this.counter == accountSwitcherInfoDto.counter && epx.f(this.phone, accountSwitcherInfoDto.phone) && epx.f(this.email, accountSwitcherInfoDto.email) && epx.f(this.unbanDate, accountSwitcherInfoDto.unbanDate) && epx.f(this.canActivateUntilDate, accountSwitcherInfoDto.canActivateUntilDate) && epx.f(this.isCelebrity, accountSwitcherInfoDto.isCelebrity) && epx.f(this.isSberVerified, accountSwitcherInfoDto.isSberVerified) && epx.f(this.isEsiaVerified, accountSwitcherInfoDto.isEsiaVerified) && epx.f(this.isTinkoffVerified, accountSwitcherInfoDto.isTinkoffVerified) && epx.f(this.isNft, accountSwitcherInfoDto.isNft) && epx.f(this.isVerified, accountSwitcherInfoDto.isVerified) && epx.f(this.accountSecurityLevel, accountSwitcherInfoDto.accountSecurityLevel) && epx.f(this.profileType, accountSwitcherInfoDto.profileType) && epx.f(this.isGrayAccount, accountSwitcherInfoDto.isGrayAccount) && epx.f(this.ageGroup, accountSwitcherInfoDto.ageGroup);
    }

    public final String f() {
        return this.avatar;
    }

    public final Integer g() {
        return this.canActivateUntilDate;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int a2 = shy.a(this.counter, urd0.a(qoy.b(qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(bh10.a(Integer.hashCode(this.index) * 31, 31, this.userId.b), 31, this.firstName), 31, this.lastName), 31, this.avatar), 31, this.isBanned), 31, this.isBannedForever), 31, this.isDeactivated), 31, this.screenName), 31);
        String str = this.phone;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.unbanDate;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.canActivateUntilDate;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isCelebrity;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSberVerified;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEsiaVerified;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isTinkoffVerified;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isNft;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isVerified;
        int hashCode10 = (hashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num3 = this.accountSecurityLevel;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.profileType;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool7 = this.isGrayAccount;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num5 = this.ageGroup;
        return hashCode13 + (num5 != null ? num5.hashCode() : 0);
    }

    public final int i() {
        return this.counter;
    }

    public final String j() {
        return this.email;
    }

    public final String k() {
        return this.firstName;
    }

    public final int l() {
        return this.index;
    }

    public final String n() {
        return this.lastName;
    }

    public final String o() {
        return this.phone;
    }

    public final Integer p() {
        return this.profileType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSwitcherInfoDto(index=");
        sb.append(this.index);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", isBanned=");
        sb.append(this.isBanned);
        sb.append(", isBannedForever=");
        sb.append(this.isBannedForever);
        sb.append(", isDeactivated=");
        sb.append(this.isDeactivated);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", counter=");
        sb.append(this.counter);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", unbanDate=");
        sb.append(this.unbanDate);
        sb.append(", canActivateUntilDate=");
        sb.append(this.canActivateUntilDate);
        sb.append(", isCelebrity=");
        sb.append(this.isCelebrity);
        sb.append(", isSberVerified=");
        sb.append(this.isSberVerified);
        sb.append(", isEsiaVerified=");
        sb.append(this.isEsiaVerified);
        sb.append(", isTinkoffVerified=");
        sb.append(this.isTinkoffVerified);
        sb.append(", isNft=");
        sb.append(this.isNft);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", accountSecurityLevel=");
        sb.append(this.accountSecurityLevel);
        sb.append(", profileType=");
        sb.append(this.profileType);
        sb.append(", isGrayAccount=");
        sb.append(this.isGrayAccount);
        sb.append(", ageGroup=");
        return uqi.b(sb, this.ageGroup, ')');
    }

    public final Integer u() {
        return this.unbanDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.isBanned ? 1 : 0);
        parcel.writeInt(this.isBannedForever ? 1 : 0);
        parcel.writeInt(this.isDeactivated ? 1 : 0);
        parcel.writeString(this.screenName);
        parcel.writeInt(this.counter);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        Integer num = this.unbanDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.canActivateUntilDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.isCelebrity;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isSberVerified;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isEsiaVerified;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isTinkoffVerified;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isNft;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isVerified;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Integer num3 = this.accountSecurityLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.profileType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool7 = this.isGrayAccount;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Integer num5 = this.ageGroup;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public /* synthetic */ AccountSwitcherInfoDto(int i, UserId userId, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, int i2, String str5, String str6, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Boolean bool7, Integer num5, int i3, zcl zclVar) {
        this(i, userId, str, str2, str3, z, z2, z3, str4, i2, (i3 & 1024) != 0 ? null : str5, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : num, (i3 & 8192) != 0 ? null : num2, (i3 & 16384) != 0 ? null : bool, (32768 & i3) != 0 ? null : bool2, (65536 & i3) != 0 ? null : bool3, (131072 & i3) != 0 ? null : bool4, (262144 & i3) != 0 ? null : bool5, (524288 & i3) != 0 ? null : bool6, (1048576 & i3) != 0 ? null : num3, (2097152 & i3) != 0 ? null : num4, (4194304 & i3) != 0 ? null : bool7, (i3 & 8388608) != 0 ? null : num5);
    }
}
