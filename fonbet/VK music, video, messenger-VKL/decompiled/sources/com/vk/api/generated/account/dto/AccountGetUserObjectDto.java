package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.eok;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountGetUserObjectDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetUserObjectDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetUserObjectDto> CREATOR = new a();

    @pmi0("bdate")
    private final String bdate;

    @pmi0("bdate_visibility")
    private final BdateVisibilityDto bdateVisibility;

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("can_write_private_message")
    private final Boolean canWritePrivateMessage;

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("email")
    private final String email;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("has_photo")
    private final Boolean hasPhoto;

    @pmi0("id")
    private final Long id;

    @pmi0("is_celebrity")
    private final Boolean isCelebrity;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("is_service_account")
    private final Boolean isServiceAccount;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("language")
    private final String language;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("maiden_name")
    private final String maidenName;

    @pmi0("nick_name")
    private final String nickName;

    @pmi0("oauth_linked")
    private final List<String> oauthLinked;

    @pmi0("oauth_verification")
    private final List<String> oauthVerification;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final Boolean online;

    @pmi0("online_info")
    private final UsersOnlineInfoDto onlineInfo;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("photo_id")
    private final String photoId;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final Float timezone;

    @pmi0("verification_profile")
    private final AccountUserSettingsVerificationProfileDto verificationProfile;

    @pmi0("verification_status")
    private final AccountUserSettingsVerificationStatusDto verificationStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountGetUserObjectDto.kt */
    public static final class BdateVisibilityDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BdateVisibilityDto[] $VALUES;
        public static final Parcelable.Creator<BdateVisibilityDto> CREATOR;

        @pmi0("2")
        public static final BdateVisibilityDto DAY_AND_MONTH_ONLY;

        @pmi0("0")
        public static final BdateVisibilityDto IS_HIDDEN;

        @pmi0("1")
        public static final BdateVisibilityDto IS_VISIBLE;
        private final int value;

        /* compiled from: AccountGetUserObjectDto.kt */
        public static final class a implements Parcelable.Creator<BdateVisibilityDto> {
            @Override // android.os.Parcelable.Creator
            public final BdateVisibilityDto createFromParcel(Parcel parcel) {
                return BdateVisibilityDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BdateVisibilityDto[] newArray(int i) {
                return new BdateVisibilityDto[i];
            }
        }

        static {
            BdateVisibilityDto bdateVisibilityDto = new BdateVisibilityDto("IS_HIDDEN", 0, 0);
            IS_HIDDEN = bdateVisibilityDto;
            BdateVisibilityDto bdateVisibilityDto2 = new BdateVisibilityDto("IS_VISIBLE", 1, 1);
            IS_VISIBLE = bdateVisibilityDto2;
            BdateVisibilityDto bdateVisibilityDto3 = new BdateVisibilityDto("DAY_AND_MONTH_ONLY", 2, 2);
            DAY_AND_MONTH_ONLY = bdateVisibilityDto3;
            BdateVisibilityDto[] bdateVisibilityDtoArr = {bdateVisibilityDto, bdateVisibilityDto2, bdateVisibilityDto3};
            $VALUES = bdateVisibilityDtoArr;
            $ENTRIES = new asp(bdateVisibilityDtoArr);
            CREATOR = new a();
        }

        private BdateVisibilityDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static BdateVisibilityDto valueOf(String str) {
            return (BdateVisibilityDto) Enum.valueOf(BdateVisibilityDto.class, str);
        }

        public static BdateVisibilityDto[] values() {
            return (BdateVisibilityDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AccountGetUserObjectDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetUserObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetUserObjectDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            UsersOnlineInfoDto usersOnlineInfoDto;
            AccountUserSettingsVerificationProfileDto createFromParcel;
            Boolean valueOf8;
            AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto;
            AccountUserSettingsVerificationStatusDto createFromParcel2;
            Long valueOf9 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(AccountGetUserObjectDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(AccountGetUserObjectDto.class.getClassLoader());
            Float valueOf10 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Long l = valueOf9;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            BdateVisibilityDto createFromParcel3 = parcel.readInt() == 0 ? null : BdateVisibilityDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Boolean bool = valueOf;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = true;
            String readString5 = parcel.readString();
            Float f = valueOf10;
            String readString6 = parcel.readString();
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(AccountGetUserObjectDto.class.getClassLoader());
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
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
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            UsersOnlineInfoDto usersOnlineInfoDto2 = (UsersOnlineInfoDto) parcel.readParcelable(AccountGetUserObjectDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                usersOnlineInfoDto = usersOnlineInfoDto2;
                createFromParcel = null;
            } else {
                usersOnlineInfoDto = usersOnlineInfoDto2;
                createFromParcel = AccountUserSettingsVerificationProfileDto.CREATOR.createFromParcel(parcel);
            }
            AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf8 = Boolean.valueOf(z);
            }
            UsersOnlineInfoDto usersOnlineInfoDto3 = usersOnlineInfoDto;
            Boolean bool2 = valueOf3;
            Boolean bool3 = valueOf6;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Boolean bool4 = valueOf7;
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                accountUserSettingsVerificationProfileDto = accountUserSettingsVerificationProfileDto2;
                createFromParcel2 = null;
            } else {
                accountUserSettingsVerificationProfileDto = accountUserSettingsVerificationProfileDto2;
                createFromParcel2 = AccountUserSettingsVerificationStatusDto.CREATOR.createFromParcel(parcel);
            }
            return new AccountGetUserObjectDto(l, baseCityDto, baseCountryDto, f, readString, bool, createFromParcel3, readString2, readString3, readString4, readString5, readString6, baseSexDto, readString7, readString8, valueOf2, bool2, readString9, readString10, valueOf4, valueOf5, bool3, bool4, usersOnlineInfoDto3, accountUserSettingsVerificationProfileDto, valueOf8, createStringArrayList, createStringArrayList2, createFromParcel2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetUserObjectDto[] newArray(int i) {
            return new AccountGetUserObjectDto[i];
        }
    }

    public AccountGetUserObjectDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public final BaseCountryDto d() {
        return this.country;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.domain;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetUserObjectDto)) {
            return false;
        }
        AccountGetUserObjectDto accountGetUserObjectDto = (AccountGetUserObjectDto) obj;
        return epx.f(this.id, accountGetUserObjectDto.id) && epx.f(this.city, accountGetUserObjectDto.city) && epx.f(this.country, accountGetUserObjectDto.country) && epx.f(this.timezone, accountGetUserObjectDto.timezone) && epx.f(this.bdate, accountGetUserObjectDto.bdate) && epx.f(this.isServiceAccount, accountGetUserObjectDto.isServiceAccount) && this.bdateVisibility == accountGetUserObjectDto.bdateVisibility && epx.f(this.firstName, accountGetUserObjectDto.firstName) && epx.f(this.lastName, accountGetUserObjectDto.lastName) && epx.f(this.photoBase, accountGetUserObjectDto.photoBase) && epx.f(this.nickName, accountGetUserObjectDto.nickName) && epx.f(this.maidenName, accountGetUserObjectDto.maidenName) && this.sex == accountGetUserObjectDto.sex && epx.f(this.domain, accountGetUserObjectDto.domain) && epx.f(this.screenName, accountGetUserObjectDto.screenName) && epx.f(this.isVerified, accountGetUserObjectDto.isVerified) && epx.f(this.isCelebrity, accountGetUserObjectDto.isCelebrity) && epx.f(this.phone, accountGetUserObjectDto.phone) && epx.f(this.email, accountGetUserObjectDto.email) && epx.f(this.isClosed, accountGetUserObjectDto.isClosed) && epx.f(this.canAccessClosed, accountGetUserObjectDto.canAccessClosed) && epx.f(this.canWritePrivateMessage, accountGetUserObjectDto.canWritePrivateMessage) && epx.f(this.online, accountGetUserObjectDto.online) && epx.f(this.onlineInfo, accountGetUserObjectDto.onlineInfo) && epx.f(this.verificationProfile, accountGetUserObjectDto.verificationProfile) && epx.f(this.hasPhoto, accountGetUserObjectDto.hasPhoto) && epx.f(this.oauthLinked, accountGetUserObjectDto.oauthLinked) && epx.f(this.oauthVerification, accountGetUserObjectDto.oauthVerification) && this.verificationStatus == accountGetUserObjectDto.verificationStatus && epx.f(this.language, accountGetUserObjectDto.language) && epx.f(this.photoId, accountGetUserObjectDto.photoId);
    }

    public final String f() {
        return this.firstName;
    }

    public final Boolean g() {
        return this.hasPhoto;
    }

    public final int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode2 = (hashCode + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode3 = (hashCode2 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        Float f = this.timezone;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.bdate;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isServiceAccount;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        int hashCode7 = (hashCode6 + (bdateVisibilityDto == null ? 0 : bdateVisibilityDto.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBase;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nickName;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maidenName;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode13 = (hashCode12 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str7 = this.domain;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.screenName;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.isVerified;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCelebrity;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str9 = this.phone;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.email;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool4 = this.isClosed;
        int hashCode20 = (hashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canAccessClosed;
        int hashCode21 = (hashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canWritePrivateMessage;
        int hashCode22 = (hashCode21 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.online;
        int hashCode23 = (hashCode22 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode24 = (hashCode23 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto = this.verificationProfile;
        int hashCode25 = (hashCode24 + (accountUserSettingsVerificationProfileDto == null ? 0 : accountUserSettingsVerificationProfileDto.hashCode())) * 31;
        Boolean bool8 = this.hasPhoto;
        int hashCode26 = (hashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        List<String> list = this.oauthLinked;
        int hashCode27 = (hashCode26 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.oauthVerification;
        int hashCode28 = (hashCode27 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto = this.verificationStatus;
        int hashCode29 = (hashCode28 + (accountUserSettingsVerificationStatusDto == null ? 0 : accountUserSettingsVerificationStatusDto.hashCode())) * 31;
        String str11 = this.language;
        int hashCode30 = (hashCode29 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.photoId;
        return hashCode30 + (str12 != null ? str12.hashCode() : 0);
    }

    public final Long i() {
        return this.id;
    }

    public final String j() {
        return this.lastName;
    }

    public final String k() {
        return this.photoBase;
    }

    public final String l() {
        return this.screenName;
    }

    public final BaseSexDto n() {
        return this.sex;
    }

    public final Boolean o() {
        return this.isCelebrity;
    }

    public final Boolean p() {
        return this.isClosed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetUserObjectDto(id=");
        sb.append(this.id);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", timezone=");
        sb.append(this.timezone);
        sb.append(", bdate=");
        sb.append(this.bdate);
        sb.append(", isServiceAccount=");
        sb.append(this.isServiceAccount);
        sb.append(", bdateVisibility=");
        sb.append(this.bdateVisibility);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", maidenName=");
        sb.append(this.maidenName);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", isCelebrity=");
        sb.append(this.isCelebrity);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", canAccessClosed=");
        sb.append(this.canAccessClosed);
        sb.append(", canWritePrivateMessage=");
        sb.append(this.canWritePrivateMessage);
        sb.append(", online=");
        sb.append(this.online);
        sb.append(", onlineInfo=");
        sb.append(this.onlineInfo);
        sb.append(", verificationProfile=");
        sb.append(this.verificationProfile);
        sb.append(", hasPhoto=");
        sb.append(this.hasPhoto);
        sb.append(", oauthLinked=");
        sb.append(this.oauthLinked);
        sb.append(", oauthVerification=");
        sb.append(this.oauthVerification);
        sb.append(", verificationStatus=");
        sb.append(this.verificationStatus);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", photoId=");
        return ho8.a(sb, this.photoId, ')');
    }

    public final Boolean u() {
        return this.isVerified;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        Float f = this.timezone;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.bdate);
        Boolean bool = this.isServiceAccount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        BdateVisibilityDto bdateVisibilityDto = this.bdateVisibility;
        if (bdateVisibilityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bdateVisibilityDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.nickName);
        parcel.writeString(this.maidenName);
        parcel.writeParcelable(this.sex, i);
        parcel.writeString(this.domain);
        parcel.writeString(this.screenName);
        Boolean bool2 = this.isVerified;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCelebrity;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        Boolean bool4 = this.isClosed;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canAccessClosed;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.canWritePrivateMessage;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.online;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeParcelable(this.onlineInfo, i);
        AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto = this.verificationProfile;
        if (accountUserSettingsVerificationProfileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountUserSettingsVerificationProfileDto.writeToParcel(parcel, i);
        }
        Boolean bool8 = this.hasPhoto;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        parcel.writeStringList(this.oauthLinked);
        parcel.writeStringList(this.oauthVerification);
        AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto = this.verificationStatus;
        if (accountUserSettingsVerificationStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountUserSettingsVerificationStatusDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.language);
        parcel.writeString(this.photoId);
    }

    public AccountGetUserObjectDto(Long l, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, String str, Boolean bool, BdateVisibilityDto bdateVisibilityDto, String str2, String str3, String str4, String str5, String str6, BaseSexDto baseSexDto, String str7, String str8, Boolean bool2, Boolean bool3, String str9, String str10, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, UsersOnlineInfoDto usersOnlineInfoDto, AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto, Boolean bool8, List<String> list, List<String> list2, AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto, String str11, String str12) {
        this.id = l;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.timezone = f;
        this.bdate = str;
        this.isServiceAccount = bool;
        this.bdateVisibility = bdateVisibilityDto;
        this.firstName = str2;
        this.lastName = str3;
        this.photoBase = str4;
        this.nickName = str5;
        this.maidenName = str6;
        this.sex = baseSexDto;
        this.domain = str7;
        this.screenName = str8;
        this.isVerified = bool2;
        this.isCelebrity = bool3;
        this.phone = str9;
        this.email = str10;
        this.isClosed = bool4;
        this.canAccessClosed = bool5;
        this.canWritePrivateMessage = bool6;
        this.online = bool7;
        this.onlineInfo = usersOnlineInfoDto;
        this.verificationProfile = accountUserSettingsVerificationProfileDto;
        this.hasPhoto = bool8;
        this.oauthLinked = list;
        this.oauthVerification = list2;
        this.verificationStatus = accountUserSettingsVerificationStatusDto;
        this.language = str11;
        this.photoId = str12;
    }

    public /* synthetic */ AccountGetUserObjectDto(Long l, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, Float f, String str, Boolean bool, BdateVisibilityDto bdateVisibilityDto, String str2, String str3, String str4, String str5, String str6, BaseSexDto baseSexDto, String str7, String str8, Boolean bool2, Boolean bool3, String str9, String str10, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, UsersOnlineInfoDto usersOnlineInfoDto, AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto, Boolean bool8, List list, List list2, AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto, String str11, String str12, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : baseCityDto, (i & 4) != 0 ? null : baseCountryDto, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bdateVisibilityDto, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : baseSexDto, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : str8, (i & 32768) != 0 ? null : bool2, (i & 65536) != 0 ? null : bool3, (i & 131072) != 0 ? null : str9, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str10, (i & 524288) != 0 ? null : bool4, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool5, (i & 2097152) != 0 ? null : bool6, (i & 4194304) != 0 ? null : bool7, (i & 8388608) != 0 ? null : usersOnlineInfoDto, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : accountUserSettingsVerificationProfileDto, (i & 33554432) != 0 ? null : bool8, (i & 67108864) != 0 ? null : list, (i & 134217728) != 0 ? null : list2, (i & 268435456) != 0 ? null : accountUserSettingsVerificationStatusDto, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str11, (i & 1073741824) != 0 ? null : str12);
    }
}
