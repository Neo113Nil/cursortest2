package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersPersonalDto;
import com.vk.api.generated.users.dto.UsersUserConnectionsDto;
import com.vk.api.generated.users.dto.UsersUserMinDto;
import com.vk.api.generated.users.dto.UsersUserRelationDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountUserSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountUserSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountUserSettingsDto> CREATOR = new a();

    @pmi0("account_verification_profile")
    private final AccountUserSettingsVerificationProfileDto accountVerificationProfile;

    @pmi0("bdate")
    private final String bdate;

    @pmi0("bdate_visibility")
    private final Integer bdateVisibility;

    @pmi0("botscore")
    private final Float botscore;

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("connections")
    private final UsersUserConnectionsDto connections;

    @pmi0("contacts")
    private final AccountContactInfoDto contacts;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("edu_is_parent")
    private final Boolean eduIsParent;

    @pmi0("edu_parent_link_id")
    private final String eduParentLinkId;

    @pmi0("edu_signup_required")
    private final Boolean eduSignupRequired;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("home")
    private final AccountHomeDto home;

    @pmi0("home_town")
    private final String homeTown;

    @pmi0("id")
    private final UserId id;

    @pmi0("interests")
    private final AccountUserSettingsInterestsDto interests;

    @pmi0("is_cached")
    private final Boolean isCached;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("is_esia_linked")
    private final Boolean isEsiaLinked;

    @pmi0("is_esia_verified")
    private final Boolean isEsiaVerified;

    @pmi0("is_lovina_promotion_enabled")
    private final Boolean isLovinaPromotionEnabled;

    @pmi0("is_sber_verified")
    private final Boolean isSberVerified;

    @pmi0("is_service_account")
    private final Boolean isServiceAccount;

    @pmi0("is_tinkoff_linked")
    private final Boolean isTinkoffLinked;

    @pmi0("is_tinkoff_verified")
    private final Boolean isTinkoffVerified;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("languages")
    private final List<String> languages;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("maiden_name")
    private final String maidenName;

    @pmi0("mail")
    private final String mail;

    @pmi0("name_request")
    private final AccountNameRequestDto nameRequest;

    @pmi0("nick_name")
    private final String nickName;

    @pmi0("oauth_linked")
    private final List<String> oauthLinked;

    @pmi0("oauth_verification")
    private final List<String> oauthVerification;

    @pmi0("personal")
    private final UsersPersonalDto personal;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("primary_profile")
    private final AccountUserSettingsDto primaryProfile;

    @pmi0("promo_verifications")
    private final List<String> promoVerifications;

    @pmi0("relation")
    private final UsersUserRelationDto relation;

    @pmi0("relation_partner")
    private final UsersUserMinDto relationPartner;

    @pmi0("relation_pending")
    private final BaseBoolIntDto relationPending;

    @pmi0("relation_requests")
    private final List<UsersUserMinDto> relationRequests;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("status")
    private final String status;

    @pmi0("status_audio")
    private final AudioAudioDto statusAudio;

    @pmi0("token_payload")
    private final Object tokenPayload;

    @pmi0("user_hash")
    private final String userHash;

    @pmi0("verification_status")
    private final AccountUserSettingsVerificationStatusDto verificationStatus;

    /* compiled from: AccountUserSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountUserSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean bool;
            UsersUserConnectionsDto createFromParcel;
            BaseCountryDto baseCountryDto;
            AccountContactInfoDto createFromParcel2;
            AccountContactInfoDto accountContactInfoDto;
            AccountNameRequestDto createFromParcel3;
            AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto;
            ArrayList arrayList;
            UserId userId;
            UsersUserRelationDto usersUserRelationDto;
            BaseBoolIntDto baseBoolIntDto;
            AudioAudioDto audioAudioDto;
            AccountHomeDto createFromParcel4;
            Boolean valueOf13;
            UserId userId2 = (UserId) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AccountUserSettingsDto createFromParcel5 = parcel.readInt() == 0 ? null : AccountUserSettingsDto.CREATOR.createFromParcel(parcel);
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
            String readString5 = parcel.readString();
            Object readValue = parcel.readValue(AccountUserSettingsDto.class.getClassLoader());
            Boolean bool2 = valueOf2;
            Boolean bool3 = valueOf3;
            String readString6 = parcel.readString();
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
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Boolean bool4 = valueOf4;
            Boolean bool5 = valueOf5;
            Boolean bool6 = valueOf6;
            Boolean bool7 = valueOf7;
            Boolean bool8 = valueOf8;
            Boolean bool9 = valueOf9;
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            AccountUserSettingsVerificationProfileDto createFromParcel6 = parcel.readInt() == 0 ? null : AccountUserSettingsVerificationProfileDto.CREATOR.createFromParcel(parcel);
            AccountUserSettingsVerificationStatusDto createFromParcel7 = parcel.readInt() == 0 ? null : AccountUserSettingsVerificationStatusDto.CREATOR.createFromParcel(parcel);
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            Float valueOf14 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString9 = parcel.readString();
            Float f = valueOf14;
            String readString10 = parcel.readString();
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool = valueOf;
                createFromParcel = null;
            } else {
                bool = valueOf;
                createFromParcel = UsersUserConnectionsDto.CREATOR.createFromParcel(parcel);
            }
            UsersUserConnectionsDto usersUserConnectionsDto = createFromParcel;
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            BaseCountryDto baseCountryDto2 = (BaseCountryDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseCountryDto = baseCountryDto2;
                createFromParcel2 = null;
            } else {
                baseCountryDto = baseCountryDto2;
                createFromParcel2 = AccountContactInfoDto.CREATOR.createFromParcel(parcel);
            }
            AccountContactInfoDto accountContactInfoDto2 = createFromParcel2;
            Integer num = valueOf15;
            Boolean bool10 = valueOf10;
            Boolean bool11 = valueOf11;
            Boolean bool12 = valueOf12;
            BaseCountryDto baseCountryDto3 = baseCountryDto;
            String readString12 = parcel.readString();
            if (parcel.readInt() == 0) {
                accountContactInfoDto = accountContactInfoDto2;
                createFromParcel3 = null;
            } else {
                accountContactInfoDto = accountContactInfoDto2;
                createFromParcel3 = AccountNameRequestDto.CREATOR.createFromParcel(parcel);
            }
            AccountNameRequestDto accountNameRequestDto = createFromParcel3;
            UsersPersonalDto usersPersonalDto = (UsersPersonalDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            String readString13 = parcel.readString();
            UsersUserRelationDto usersUserRelationDto2 = (UsersUserRelationDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            UsersUserMinDto usersUserMinDto = (UsersUserMinDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto2;
                usersUserRelationDto = usersUserRelationDto2;
                accountUserSettingsVerificationProfileDto = createFromParcel6;
                userId = userId2;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                accountUserSettingsVerificationProfileDto = createFromParcel6;
                arrayList = new ArrayList(readInt);
                userId = userId2;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AccountUserSettingsDto.class, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
                usersUserRelationDto = usersUserRelationDto2;
                baseBoolIntDto = baseBoolIntDto2;
            }
            String readString14 = parcel.readString();
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            AudioAudioDto audioAudioDto2 = (AudioAudioDto) parcel.readParcelable(AccountUserSettingsDto.class.getClassLoader());
            AccountUserSettingsInterestsDto createFromParcel8 = parcel.readInt() == 0 ? null : AccountUserSettingsInterestsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto2;
                createFromParcel4 = null;
            } else {
                audioAudioDto = audioAudioDto2;
                createFromParcel4 = AccountHomeDto.CREATOR.createFromParcel(parcel);
            }
            AccountHomeDto accountHomeDto = createFromParcel4;
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountUserSettingsDto(userId, readString, readString2, readString3, readString4, bool, createFromParcel5, bool2, bool3, readString5, readValue, readString6, bool4, bool5, bool6, bool7, readString7, bool8, readString8, bool9, createStringArrayList, createStringArrayList2, accountUserSettingsVerificationProfileDto, createFromParcel7, createStringArrayList3, f, readString9, readString10, num, readString11, bool10, bool11, bool12, usersUserConnectionsDto, valueOf16, baseCityDto, baseCountryDto3, accountContactInfoDto, readString12, accountNameRequestDto, usersPersonalDto, readString13, usersUserRelationDto, usersUserMinDto, baseBoolIntDto, arrayList, readString14, baseSexDto, audioAudioDto, createFromParcel8, accountHomeDto, createStringArrayList4, valueOf13);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsDto[] newArray(int i) {
            return new AccountUserSettingsDto[i];
        }
    }

    public AccountUserSettingsDto(UserId userId, String str, String str2, String str3, String str4, Boolean bool, AccountUserSettingsDto accountUserSettingsDto, Boolean bool2, Boolean bool3, String str5, Object obj, String str6, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str7, Boolean bool8, String str8, Boolean bool9, List<String> list, List<String> list2, AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto, AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto, List<String> list3, Float f, String str9, String str10, Integer num, String str11, Boolean bool10, Boolean bool11, Boolean bool12, UsersUserConnectionsDto usersUserConnectionsDto, Integer num2, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, AccountContactInfoDto accountContactInfoDto, String str12, AccountNameRequestDto accountNameRequestDto, UsersPersonalDto usersPersonalDto, String str13, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, BaseBoolIntDto baseBoolIntDto, List<UsersUserMinDto> list4, String str14, BaseSexDto baseSexDto, AudioAudioDto audioAudioDto, AccountUserSettingsInterestsDto accountUserSettingsInterestsDto, AccountHomeDto accountHomeDto, List<String> list5, Boolean bool13) {
        this.id = userId;
        this.homeTown = str;
        this.status = str2;
        this.nickName = str3;
        this.photo200 = str4;
        this.isServiceAccount = bool;
        this.primaryProfile = accountUserSettingsDto;
        this.eduSignupRequired = bool2;
        this.eduIsParent = bool3;
        this.eduParentLinkId = str5;
        this.tokenPayload = obj;
        this.userHash = str6;
        this.isEsiaVerified = bool4;
        this.isEsiaLinked = bool5;
        this.isTinkoffLinked = bool6;
        this.isTinkoffVerified = bool7;
        this.bdate = str7;
        this.isVerified = bool8;
        this.mail = str8;
        this.isSberVerified = bool9;
        this.oauthLinked = list;
        this.oauthVerification = list2;
        this.accountVerificationProfile = accountUserSettingsVerificationProfileDto;
        this.verificationStatus = accountUserSettingsVerificationStatusDto;
        this.promoVerifications = list3;
        this.botscore = f;
        this.deactivated = str9;
        this.firstName = str10;
        this.hidden = num;
        this.lastName = str11;
        this.canAccessClosed = bool10;
        this.isClosed = bool11;
        this.isCached = bool12;
        this.connections = usersUserConnectionsDto;
        this.bdateVisibility = num2;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.contacts = accountContactInfoDto;
        this.maidenName = str12;
        this.nameRequest = accountNameRequestDto;
        this.personal = usersPersonalDto;
        this.phone = str13;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.relationPending = baseBoolIntDto;
        this.relationRequests = list4;
        this.screenName = str14;
        this.sex = baseSexDto;
        this.statusAudio = audioAudioDto;
        this.interests = accountUserSettingsInterestsDto;
        this.home = accountHomeDto;
        this.languages = list5;
        this.isLovinaPromotionEnabled = bool13;
    }

    public final String d() {
        return this.bdate;
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
        if (!(obj instanceof AccountUserSettingsDto)) {
            return false;
        }
        AccountUserSettingsDto accountUserSettingsDto = (AccountUserSettingsDto) obj;
        return epx.f(this.id, accountUserSettingsDto.id) && epx.f(this.homeTown, accountUserSettingsDto.homeTown) && epx.f(this.status, accountUserSettingsDto.status) && epx.f(this.nickName, accountUserSettingsDto.nickName) && epx.f(this.photo200, accountUserSettingsDto.photo200) && epx.f(this.isServiceAccount, accountUserSettingsDto.isServiceAccount) && epx.f(this.primaryProfile, accountUserSettingsDto.primaryProfile) && epx.f(this.eduSignupRequired, accountUserSettingsDto.eduSignupRequired) && epx.f(this.eduIsParent, accountUserSettingsDto.eduIsParent) && epx.f(this.eduParentLinkId, accountUserSettingsDto.eduParentLinkId) && epx.f(this.tokenPayload, accountUserSettingsDto.tokenPayload) && epx.f(this.userHash, accountUserSettingsDto.userHash) && epx.f(this.isEsiaVerified, accountUserSettingsDto.isEsiaVerified) && epx.f(this.isEsiaLinked, accountUserSettingsDto.isEsiaLinked) && epx.f(this.isTinkoffLinked, accountUserSettingsDto.isTinkoffLinked) && epx.f(this.isTinkoffVerified, accountUserSettingsDto.isTinkoffVerified) && epx.f(this.bdate, accountUserSettingsDto.bdate) && epx.f(this.isVerified, accountUserSettingsDto.isVerified) && epx.f(this.mail, accountUserSettingsDto.mail) && epx.f(this.isSberVerified, accountUserSettingsDto.isSberVerified) && epx.f(this.oauthLinked, accountUserSettingsDto.oauthLinked) && epx.f(this.oauthVerification, accountUserSettingsDto.oauthVerification) && epx.f(this.accountVerificationProfile, accountUserSettingsDto.accountVerificationProfile) && this.verificationStatus == accountUserSettingsDto.verificationStatus && epx.f(this.promoVerifications, accountUserSettingsDto.promoVerifications) && epx.f(this.botscore, accountUserSettingsDto.botscore) && epx.f(this.deactivated, accountUserSettingsDto.deactivated) && epx.f(this.firstName, accountUserSettingsDto.firstName) && epx.f(this.hidden, accountUserSettingsDto.hidden) && epx.f(this.lastName, accountUserSettingsDto.lastName) && epx.f(this.canAccessClosed, accountUserSettingsDto.canAccessClosed) && epx.f(this.isClosed, accountUserSettingsDto.isClosed) && epx.f(this.isCached, accountUserSettingsDto.isCached) && epx.f(this.connections, accountUserSettingsDto.connections) && epx.f(this.bdateVisibility, accountUserSettingsDto.bdateVisibility) && epx.f(this.city, accountUserSettingsDto.city) && epx.f(this.country, accountUserSettingsDto.country) && epx.f(this.contacts, accountUserSettingsDto.contacts) && epx.f(this.maidenName, accountUserSettingsDto.maidenName) && epx.f(this.nameRequest, accountUserSettingsDto.nameRequest) && epx.f(this.personal, accountUserSettingsDto.personal) && epx.f(this.phone, accountUserSettingsDto.phone) && this.relation == accountUserSettingsDto.relation && epx.f(this.relationPartner, accountUserSettingsDto.relationPartner) && this.relationPending == accountUserSettingsDto.relationPending && epx.f(this.relationRequests, accountUserSettingsDto.relationRequests) && epx.f(this.screenName, accountUserSettingsDto.screenName) && this.sex == accountUserSettingsDto.sex && epx.f(this.statusAudio, accountUserSettingsDto.statusAudio) && epx.f(this.interests, accountUserSettingsDto.interests) && epx.f(this.home, accountUserSettingsDto.home) && epx.f(this.languages, accountUserSettingsDto.languages) && epx.f(this.isLovinaPromotionEnabled, accountUserSettingsDto.isLovinaPromotionEnabled);
    }

    public final UserId f() {
        return this.id;
    }

    public final String g() {
        return this.lastName;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.homeTown), 31, this.status);
        String str = this.nickName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo200;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isServiceAccount;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AccountUserSettingsDto accountUserSettingsDto = this.primaryProfile;
        int hashCode4 = (hashCode3 + (accountUserSettingsDto == null ? 0 : accountUserSettingsDto.hashCode())) * 31;
        Boolean bool2 = this.eduSignupRequired;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.eduIsParent;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.eduParentLinkId;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.tokenPayload;
        int hashCode8 = (hashCode7 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.userHash;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool4 = this.isEsiaVerified;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isEsiaLinked;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isTinkoffLinked;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isTinkoffVerified;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str5 = this.bdate;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool8 = this.isVerified;
        int hashCode15 = (hashCode14 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str6 = this.mail;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool9 = this.isSberVerified;
        int hashCode17 = (hashCode16 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        List<String> list = this.oauthLinked;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.oauthVerification;
        int hashCode19 = (hashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto = this.accountVerificationProfile;
        int hashCode20 = (hashCode19 + (accountUserSettingsVerificationProfileDto == null ? 0 : accountUserSettingsVerificationProfileDto.hashCode())) * 31;
        AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto = this.verificationStatus;
        int hashCode21 = (hashCode20 + (accountUserSettingsVerificationStatusDto == null ? 0 : accountUserSettingsVerificationStatusDto.hashCode())) * 31;
        List<String> list3 = this.promoVerifications;
        int hashCode22 = (hashCode21 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Float f = this.botscore;
        int hashCode23 = (hashCode22 + (f == null ? 0 : f.hashCode())) * 31;
        String str7 = this.deactivated;
        int hashCode24 = (hashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstName;
        int hashCode25 = (hashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.hidden;
        int hashCode26 = (hashCode25 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.lastName;
        int hashCode27 = (hashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool10 = this.canAccessClosed;
        int hashCode28 = (hashCode27 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isClosed;
        int hashCode29 = (hashCode28 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.isCached;
        int hashCode30 = (hashCode29 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        UsersUserConnectionsDto usersUserConnectionsDto = this.connections;
        int hashCode31 = (hashCode30 + (usersUserConnectionsDto == null ? 0 : usersUserConnectionsDto.hashCode())) * 31;
        Integer num2 = this.bdateVisibility;
        int hashCode32 = (hashCode31 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode33 = (hashCode32 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode34 = (hashCode33 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        AccountContactInfoDto accountContactInfoDto = this.contacts;
        int hashCode35 = (hashCode34 + (accountContactInfoDto == null ? 0 : accountContactInfoDto.hashCode())) * 31;
        String str10 = this.maidenName;
        int hashCode36 = (hashCode35 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AccountNameRequestDto accountNameRequestDto = this.nameRequest;
        int hashCode37 = (hashCode36 + (accountNameRequestDto == null ? 0 : accountNameRequestDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode38 = (hashCode37 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        String str11 = this.phone;
        int hashCode39 = (hashCode38 + (str11 == null ? 0 : str11.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode40 = (hashCode39 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode41 = (hashCode40 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.relationPending;
        int hashCode42 = (hashCode41 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        List<UsersUserMinDto> list4 = this.relationRequests;
        int hashCode43 = (hashCode42 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str12 = this.screenName;
        int hashCode44 = (hashCode43 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode45 = (hashCode44 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode46 = (hashCode45 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        AccountUserSettingsInterestsDto accountUserSettingsInterestsDto = this.interests;
        int hashCode47 = (hashCode46 + (accountUserSettingsInterestsDto == null ? 0 : accountUserSettingsInterestsDto.hashCode())) * 31;
        AccountHomeDto accountHomeDto = this.home;
        int hashCode48 = (hashCode47 + (accountHomeDto == null ? 0 : accountHomeDto.hashCode())) * 31;
        List<String> list5 = this.languages;
        int hashCode49 = (hashCode48 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool13 = this.isLovinaPromotionEnabled;
        return hashCode49 + (bool13 != null ? bool13.hashCode() : 0);
    }

    public final String i() {
        return this.nickName;
    }

    public final String j() {
        return this.status;
    }

    public final AccountUserSettingsVerificationStatusDto k() {
        return this.verificationStatus;
    }

    public final Boolean l() {
        return this.isServiceAccount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountUserSettingsDto(id=");
        sb.append(this.id);
        sb.append(", homeTown=");
        sb.append(this.homeTown);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", isServiceAccount=");
        sb.append(this.isServiceAccount);
        sb.append(", primaryProfile=");
        sb.append(this.primaryProfile);
        sb.append(", eduSignupRequired=");
        sb.append(this.eduSignupRequired);
        sb.append(", eduIsParent=");
        sb.append(this.eduIsParent);
        sb.append(", eduParentLinkId=");
        sb.append(this.eduParentLinkId);
        sb.append(", tokenPayload=");
        sb.append(this.tokenPayload);
        sb.append(", userHash=");
        sb.append(this.userHash);
        sb.append(", isEsiaVerified=");
        sb.append(this.isEsiaVerified);
        sb.append(", isEsiaLinked=");
        sb.append(this.isEsiaLinked);
        sb.append(", isTinkoffLinked=");
        sb.append(this.isTinkoffLinked);
        sb.append(", isTinkoffVerified=");
        sb.append(this.isTinkoffVerified);
        sb.append(", bdate=");
        sb.append(this.bdate);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", mail=");
        sb.append(this.mail);
        sb.append(", isSberVerified=");
        sb.append(this.isSberVerified);
        sb.append(", oauthLinked=");
        sb.append(this.oauthLinked);
        sb.append(", oauthVerification=");
        sb.append(this.oauthVerification);
        sb.append(", accountVerificationProfile=");
        sb.append(this.accountVerificationProfile);
        sb.append(", verificationStatus=");
        sb.append(this.verificationStatus);
        sb.append(", promoVerifications=");
        sb.append(this.promoVerifications);
        sb.append(", botscore=");
        sb.append(this.botscore);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", canAccessClosed=");
        sb.append(this.canAccessClosed);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", isCached=");
        sb.append(this.isCached);
        sb.append(", connections=");
        sb.append(this.connections);
        sb.append(", bdateVisibility=");
        sb.append(this.bdateVisibility);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", maidenName=");
        sb.append(this.maidenName);
        sb.append(", nameRequest=");
        sb.append(this.nameRequest);
        sb.append(", personal=");
        sb.append(this.personal);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", relation=");
        sb.append(this.relation);
        sb.append(", relationPartner=");
        sb.append(this.relationPartner);
        sb.append(", relationPending=");
        sb.append(this.relationPending);
        sb.append(", relationRequests=");
        sb.append(this.relationRequests);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", statusAudio=");
        sb.append(this.statusAudio);
        sb.append(", interests=");
        sb.append(this.interests);
        sb.append(", home=");
        sb.append(this.home);
        sb.append(", languages=");
        sb.append(this.languages);
        sb.append(", isLovinaPromotionEnabled=");
        return tn.a(sb, this.isLovinaPromotionEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.homeTown);
        parcel.writeString(this.status);
        parcel.writeString(this.nickName);
        parcel.writeString(this.photo200);
        Boolean bool = this.isServiceAccount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        AccountUserSettingsDto accountUserSettingsDto = this.primaryProfile;
        if (accountUserSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountUserSettingsDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.eduSignupRequired;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.eduIsParent;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.eduParentLinkId);
        parcel.writeValue(this.tokenPayload);
        parcel.writeString(this.userHash);
        Boolean bool4 = this.isEsiaVerified;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isEsiaLinked;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.isTinkoffLinked;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.isTinkoffVerified;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        parcel.writeString(this.bdate);
        Boolean bool8 = this.isVerified;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        parcel.writeString(this.mail);
        Boolean bool9 = this.isSberVerified;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        parcel.writeStringList(this.oauthLinked);
        parcel.writeStringList(this.oauthVerification);
        AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto = this.accountVerificationProfile;
        if (accountUserSettingsVerificationProfileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountUserSettingsVerificationProfileDto.writeToParcel(parcel, i);
        }
        AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto = this.verificationStatus;
        if (accountUserSettingsVerificationStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountUserSettingsVerificationStatusDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.promoVerifications);
        Float f = this.botscore;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.deactivated);
        parcel.writeString(this.firstName);
        Integer num = this.hidden;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.lastName);
        Boolean bool10 = this.canAccessClosed;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.isClosed;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Boolean bool12 = this.isCached;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        UsersUserConnectionsDto usersUserConnectionsDto = this.connections;
        if (usersUserConnectionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersUserConnectionsDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.bdateVisibility;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        AccountContactInfoDto accountContactInfoDto = this.contacts;
        if (accountContactInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountContactInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.maidenName);
        AccountNameRequestDto accountNameRequestDto = this.nameRequest;
        if (accountNameRequestDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNameRequestDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.personal, i);
        parcel.writeString(this.phone);
        parcel.writeParcelable(this.relation, i);
        parcel.writeParcelable(this.relationPartner, i);
        parcel.writeParcelable(this.relationPending, i);
        List<UsersUserMinDto> list = this.relationRequests;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.screenName);
        parcel.writeParcelable(this.sex, i);
        parcel.writeParcelable(this.statusAudio, i);
        AccountUserSettingsInterestsDto accountUserSettingsInterestsDto = this.interests;
        if (accountUserSettingsInterestsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountUserSettingsInterestsDto.writeToParcel(parcel, i);
        }
        AccountHomeDto accountHomeDto = this.home;
        if (accountHomeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.languages);
        Boolean bool13 = this.isLovinaPromotionEnabled;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
    }

    public /* synthetic */ AccountUserSettingsDto(UserId userId, String str, String str2, String str3, String str4, Boolean bool, AccountUserSettingsDto accountUserSettingsDto, Boolean bool2, Boolean bool3, String str5, Object obj, String str6, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str7, Boolean bool8, String str8, Boolean bool9, List list, List list2, AccountUserSettingsVerificationProfileDto accountUserSettingsVerificationProfileDto, AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto, List list3, Float f, String str9, String str10, Integer num, String str11, Boolean bool10, Boolean bool11, Boolean bool12, UsersUserConnectionsDto usersUserConnectionsDto, Integer num2, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, AccountContactInfoDto accountContactInfoDto, String str12, AccountNameRequestDto accountNameRequestDto, UsersPersonalDto usersPersonalDto, String str13, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, BaseBoolIntDto baseBoolIntDto, List list4, String str14, BaseSexDto baseSexDto, AudioAudioDto audioAudioDto, AccountUserSettingsInterestsDto accountUserSettingsInterestsDto, AccountHomeDto accountHomeDto, List list5, Boolean bool13, int i, int i2, zcl zclVar) {
        this(userId, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : accountUserSettingsDto, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : obj, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : bool4, (i & 8192) != 0 ? null : bool5, (i & 16384) != 0 ? null : bool6, (i & 32768) != 0 ? null : bool7, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : bool8, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str8, (i & 524288) != 0 ? null : bool9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list, (i & 2097152) != 0 ? null : list2, (i & 4194304) != 0 ? null : accountUserSettingsVerificationProfileDto, (i & 8388608) != 0 ? null : accountUserSettingsVerificationStatusDto, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list3, (i & 33554432) != 0 ? null : f, (i & 67108864) != 0 ? null : str9, (i & 134217728) != 0 ? null : str10, (i & 268435456) != 0 ? null : num, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str11, (i & 1073741824) != 0 ? null : bool10, (i & Integer.MIN_VALUE) != 0 ? null : bool11, (i2 & 1) != 0 ? null : bool12, (i2 & 2) != 0 ? null : usersUserConnectionsDto, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : baseCityDto, (i2 & 16) != 0 ? null : baseCountryDto, (i2 & 32) != 0 ? null : accountContactInfoDto, (i2 & 64) != 0 ? null : str12, (i2 & 128) != 0 ? null : accountNameRequestDto, (i2 & 256) != 0 ? null : usersPersonalDto, (i2 & 512) != 0 ? null : str13, (i2 & 1024) != 0 ? null : usersUserRelationDto, (i2 & 2048) != 0 ? null : usersUserMinDto, (i2 & 4096) != 0 ? null : baseBoolIntDto, (i2 & 8192) != 0 ? null : list4, (i2 & 16384) != 0 ? null : str14, (i2 & 32768) != 0 ? null : baseSexDto, (i2 & 65536) != 0 ? null : audioAudioDto, (i2 & 131072) != 0 ? null : accountUserSettingsInterestsDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : accountHomeDto, (i2 & 524288) != 0 ? null : list5, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool13);
    }
}
