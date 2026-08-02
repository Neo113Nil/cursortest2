package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountNavigationInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountNavigationInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountNavigationInfoDto> CREATOR = new a();

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("is_business")
    private final Boolean isBusiness;

    @pmi0("is_celebrity")
    private final Boolean isCelebrity;

    @pmi0("is_group_admin")
    private final Boolean isGroupAdmin;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("phone_to_actualize")
    private final String phoneToActualize;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("user_hash")
    private final String userHash;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: AccountNavigationInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountNavigationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            UserId userId = (UserId) parcel.readParcelable(AccountNavigationInfoDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Boolean bool = null;
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
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountNavigationInfoDto(userId, readString, readString2, readString3, readString4, readString5, valueOf, valueOf2, valueOf3, valueOf4, bool, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNavigationInfoDto[] newArray(int i) {
            return new AccountNavigationInfoDto[i];
        }
    }

    public AccountNavigationInfoDto(UserId userId, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str6, String str7) {
        this.userId = userId;
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.photo200 = str4;
        this.domain = str5;
        this.isCelebrity = bool;
        this.isVerified = bool2;
        this.isNft = bool3;
        this.isBusiness = bool4;
        this.isGroupAdmin = bool5;
        this.phoneToActualize = str6;
        this.userHash = str7;
    }

    public final String d() {
        return this.firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.lastName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNavigationInfoDto)) {
            return false;
        }
        AccountNavigationInfoDto accountNavigationInfoDto = (AccountNavigationInfoDto) obj;
        return epx.f(this.userId, accountNavigationInfoDto.userId) && epx.f(this.firstName, accountNavigationInfoDto.firstName) && epx.f(this.lastName, accountNavigationInfoDto.lastName) && epx.f(this.phone, accountNavigationInfoDto.phone) && epx.f(this.photo200, accountNavigationInfoDto.photo200) && epx.f(this.domain, accountNavigationInfoDto.domain) && epx.f(this.isCelebrity, accountNavigationInfoDto.isCelebrity) && epx.f(this.isVerified, accountNavigationInfoDto.isVerified) && epx.f(this.isNft, accountNavigationInfoDto.isNft) && epx.f(this.isBusiness, accountNavigationInfoDto.isBusiness) && epx.f(this.isGroupAdmin, accountNavigationInfoDto.isGroupAdmin) && epx.f(this.phoneToActualize, accountNavigationInfoDto.phoneToActualize) && epx.f(this.userHash, accountNavigationInfoDto.userHash);
    }

    public final String f() {
        return this.phone;
    }

    public final String g() {
        return this.photo200;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.userId.b) * 31, 31, this.firstName), 31, this.lastName), 31, this.phone), 31, this.photo200);
        String str = this.domain;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isCelebrity;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isVerified;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isNft;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBusiness;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isGroupAdmin;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.phoneToActualize;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userHash;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountNavigationInfoDto(userId=");
        sb.append(this.userId);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", isCelebrity=");
        sb.append(this.isCelebrity);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", isNft=");
        sb.append(this.isNft);
        sb.append(", isBusiness=");
        sb.append(this.isBusiness);
        sb.append(", isGroupAdmin=");
        sb.append(this.isGroupAdmin);
        sb.append(", phoneToActualize=");
        sb.append(this.phoneToActualize);
        sb.append(", userHash=");
        return ho8.a(sb, this.userHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.phone);
        parcel.writeString(this.photo200);
        parcel.writeString(this.domain);
        Boolean bool = this.isCelebrity;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isVerified;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isNft;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isBusiness;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isGroupAdmin;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeString(this.phoneToActualize);
        parcel.writeString(this.userHash);
    }

    public /* synthetic */ AccountNavigationInfoDto(UserId userId, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str6, String str7, int i, zcl zclVar) {
        this(userId, str, str2, str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, (i & 1024) != 0 ? null : bool5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7);
    }
}
