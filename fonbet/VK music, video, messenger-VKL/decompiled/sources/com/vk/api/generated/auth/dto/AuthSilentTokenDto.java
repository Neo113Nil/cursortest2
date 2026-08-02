package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthSilentTokenDto.kt */
/* loaded from: classes14.dex */
public final class AuthSilentTokenDto implements Parcelable {
    public static final Parcelable.Creator<AuthSilentTokenDto> CREATOR = new a();

    @pmi0("app_photo")
    private final String appPhoto;

    @pmi0("app_service_id")
    private final Integer appServiceId;

    @pmi0("bdate")
    private final String bdate;

    @pmi0("edu_birthday")
    private final String eduBirthday;

    @pmi0("edu_first_name")
    private final String eduFirstName;

    @pmi0("edu_last_name")
    private final String eduLastName;

    @pmi0("edu_middle_name")
    private final String eduMiddleName;

    @pmi0("edu_photo_200")
    private final String eduPhoto200;

    @pmi0("edu_photo_base")
    private final String eduPhotoBase;

    @pmi0("edu_sex")
    private final Integer eduSex;

    @pmi0("email")
    private final String email;

    @pmi0("expires")
    private final Integer expires;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("is_partial")
    private final Boolean isPartial;

    @pmi0("is_service")
    private final Boolean isService;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("phone")
    private final String phone;

    @pmi0("phone_to_actualize")
    private final String phoneToActualize;

    @pmi0("phone_validated")
    private final Integer phoneValidated;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("provider_universal_link")
    private final String providerUniversalLink;

    @pmi0("provider_vk_link")
    private final String providerVkLink;

    @pmi0("service_info")
    private final List<AuthServiceUserValueDto> serviceInfo;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("source_universal_link")
    private final String sourceUniversalLink;

    @pmi0("source_vk_link")
    private final String sourceVkLink;

    @pmi0("token")
    private final String token;

    @pmi0("ttl")
    private final Integer ttl;

    @pmi0("universal_link")
    private final String universalLink;

    @pmi0("user_hash")
    private final String userHash;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("uuid")
    private final String uuid;

    @pmi0("weight")
    private final Integer weight;

    /* compiled from: AuthSilentTokenDto.kt */
    public static final class a implements Parcelable.Creator<AuthSilentTokenDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            String str;
            ArrayList arrayList;
            BaseSexDto baseSexDto;
            String str2;
            Boolean valueOf3;
            String readString = parcel.readString();
            BaseSexDto baseSexDto2 = (BaseSexDto) parcel.readParcelable(AuthSilentTokenDto.class.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(AuthSilentTokenDto.class.getClassLoader());
            String readString4 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            Integer num = valueOf5;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                str = readString;
                arrayList = new ArrayList(readInt);
                baseSexDto = baseSexDto2;
                int i = 0;
                while (true) {
                    str2 = readString2;
                    if (i == readInt) {
                        break;
                    }
                    i = en.a(AuthServiceUserValueDto.CREATOR, parcel, arrayList, i, 1);
                    readString2 = str2;
                    readString3 = readString3;
                }
            } else {
                str = readString;
                baseSexDto = baseSexDto2;
                arrayList = null;
                str2 = readString2;
            }
            String str3 = readString3;
            String readString10 = parcel.readString();
            Integer num2 = valueOf6;
            Boolean bool = valueOf;
            Boolean bool2 = valueOf2;
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            ArrayList arrayList2 = arrayList;
            String str4 = str;
            String readString13 = parcel.readString();
            BaseSexDto baseSexDto3 = baseSexDto;
            String readString14 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = true;
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf3 = Boolean.valueOf(z);
            }
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            Integer num3 = null;
            String readString23 = parcel.readString();
            if (parcel.readInt() != 0) {
                num3 = Integer.valueOf(parcel.readInt());
            }
            return new AuthSilentTokenDto(str4, baseSexDto3, str2, str3, userId, readString4, valueOf4, num, readString5, readString6, readString7, readString8, readString9, num2, bool, bool2, arrayList2, readString10, readString11, readString12, readString13, readString14, valueOf7, readString15, readString16, valueOf8, readString17, readString18, valueOf3, readString19, readString20, readString21, readString22, readString23, num3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenDto[] newArray(int i) {
            return new AuthSilentTokenDto[i];
        }
    }

    public AuthSilentTokenDto(String str, BaseSexDto baseSexDto, String str2, String str3, UserId userId, String str4, Integer num, Integer num2, String str5, String str6, String str7, String str8, String str9, Integer num3, Boolean bool, Boolean bool2, List<AuthServiceUserValueDto> list, String str10, String str11, String str12, String str13, String str14, Integer num4, String str15, String str16, Integer num5, String str17, String str18, Boolean bool3, String str19, String str20, String str21, String str22, String str23, Integer num6, String str24, String str25) {
        this.token = str;
        this.sex = baseSexDto;
        this.firstName = str2;
        this.lastName = str3;
        this.userId = userId;
        this.uuid = str4;
        this.ttl = num;
        this.expires = num2;
        this.photo50 = str5;
        this.photo100 = str6;
        this.photo200 = str7;
        this.photoBase = str8;
        this.phone = str9;
        this.phoneValidated = num3;
        this.isPartial = bool;
        this.isService = bool2;
        this.serviceInfo = list;
        this.universalLink = str10;
        this.providerUniversalLink = str11;
        this.providerVkLink = str12;
        this.sourceUniversalLink = str13;
        this.sourceVkLink = str14;
        this.weight = num4;
        this.userHash = str15;
        this.appPhoto = str16;
        this.appServiceId = num5;
        this.email = str17;
        this.bdate = str18;
        this.isVerified = bool3;
        this.eduFirstName = str19;
        this.eduMiddleName = str20;
        this.eduLastName = str21;
        this.eduPhoto200 = str22;
        this.eduPhotoBase = str23;
        this.eduSex = num6;
        this.eduBirthday = str24;
        this.phoneToActualize = str25;
    }

    public final String B() {
        return this.token;
    }

    public final Integer C() {
        return this.ttl;
    }

    public final String D() {
        return this.userHash;
    }

    public final String F() {
        return this.uuid;
    }

    public final Integer G() {
        return this.weight;
    }

    public final Integer d() {
        return this.appServiceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.email;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSilentTokenDto)) {
            return false;
        }
        AuthSilentTokenDto authSilentTokenDto = (AuthSilentTokenDto) obj;
        return epx.f(this.token, authSilentTokenDto.token) && this.sex == authSilentTokenDto.sex && epx.f(this.firstName, authSilentTokenDto.firstName) && epx.f(this.lastName, authSilentTokenDto.lastName) && epx.f(this.userId, authSilentTokenDto.userId) && epx.f(this.uuid, authSilentTokenDto.uuid) && epx.f(this.ttl, authSilentTokenDto.ttl) && epx.f(this.expires, authSilentTokenDto.expires) && epx.f(this.photo50, authSilentTokenDto.photo50) && epx.f(this.photo100, authSilentTokenDto.photo100) && epx.f(this.photo200, authSilentTokenDto.photo200) && epx.f(this.photoBase, authSilentTokenDto.photoBase) && epx.f(this.phone, authSilentTokenDto.phone) && epx.f(this.phoneValidated, authSilentTokenDto.phoneValidated) && epx.f(this.isPartial, authSilentTokenDto.isPartial) && epx.f(this.isService, authSilentTokenDto.isService) && epx.f(this.serviceInfo, authSilentTokenDto.serviceInfo) && epx.f(this.universalLink, authSilentTokenDto.universalLink) && epx.f(this.providerUniversalLink, authSilentTokenDto.providerUniversalLink) && epx.f(this.providerVkLink, authSilentTokenDto.providerVkLink) && epx.f(this.sourceUniversalLink, authSilentTokenDto.sourceUniversalLink) && epx.f(this.sourceVkLink, authSilentTokenDto.sourceVkLink) && epx.f(this.weight, authSilentTokenDto.weight) && epx.f(this.userHash, authSilentTokenDto.userHash) && epx.f(this.appPhoto, authSilentTokenDto.appPhoto) && epx.f(this.appServiceId, authSilentTokenDto.appServiceId) && epx.f(this.email, authSilentTokenDto.email) && epx.f(this.bdate, authSilentTokenDto.bdate) && epx.f(this.isVerified, authSilentTokenDto.isVerified) && epx.f(this.eduFirstName, authSilentTokenDto.eduFirstName) && epx.f(this.eduMiddleName, authSilentTokenDto.eduMiddleName) && epx.f(this.eduLastName, authSilentTokenDto.eduLastName) && epx.f(this.eduPhoto200, authSilentTokenDto.eduPhoto200) && epx.f(this.eduPhotoBase, authSilentTokenDto.eduPhotoBase) && epx.f(this.eduSex, authSilentTokenDto.eduSex) && epx.f(this.eduBirthday, authSilentTokenDto.eduBirthday) && epx.f(this.phoneToActualize, authSilentTokenDto.phoneToActualize);
    }

    public final Integer f() {
        return this.expires;
    }

    public final String g() {
        return this.firstName;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.sex.hashCode() + (this.token.hashCode() * 31)) * 31, 31, this.firstName), 31, this.lastName);
        UserId userId = this.userId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.uuid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.ttl;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expires;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.photo50;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo100;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo200;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photoBase;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.phoneValidated;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isPartial;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isService;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<AuthServiceUserValueDto> list = this.serviceInfo;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.universalLink;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.providerUniversalLink;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.providerVkLink;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sourceUniversalLink;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sourceVkLink;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num4 = this.weight;
        int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str12 = this.userHash;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.appPhoto;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num5 = this.appServiceId;
        int hashCode22 = (hashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str14 = this.email;
        int hashCode23 = (hashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.bdate;
        int hashCode24 = (hashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool3 = this.isVerified;
        int hashCode25 = (hashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str16 = this.eduFirstName;
        int hashCode26 = (hashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.eduMiddleName;
        int hashCode27 = (hashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.eduLastName;
        int hashCode28 = (hashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.eduPhoto200;
        int hashCode29 = (hashCode28 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.eduPhotoBase;
        int hashCode30 = (hashCode29 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num6 = this.eduSex;
        int hashCode31 = (hashCode30 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str21 = this.eduBirthday;
        int hashCode32 = (hashCode31 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.phoneToActualize;
        return hashCode32 + (str22 != null ? str22.hashCode() : 0);
    }

    public final String i() {
        return this.lastName;
    }

    public final String j() {
        return this.phone;
    }

    public final String k() {
        return this.phoneToActualize;
    }

    public final String l() {
        return this.photo100;
    }

    public final String n() {
        return this.photo200;
    }

    public final String o() {
        return this.photo50;
    }

    public final String p() {
        return this.photoBase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSilentTokenDto(token=");
        sb.append(this.token);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append(", expires=");
        sb.append(this.expires);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", phoneValidated=");
        sb.append(this.phoneValidated);
        sb.append(", isPartial=");
        sb.append(this.isPartial);
        sb.append(", isService=");
        sb.append(this.isService);
        sb.append(", serviceInfo=");
        sb.append(this.serviceInfo);
        sb.append(", universalLink=");
        sb.append(this.universalLink);
        sb.append(", providerUniversalLink=");
        sb.append(this.providerUniversalLink);
        sb.append(", providerVkLink=");
        sb.append(this.providerVkLink);
        sb.append(", sourceUniversalLink=");
        sb.append(this.sourceUniversalLink);
        sb.append(", sourceVkLink=");
        sb.append(this.sourceVkLink);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", userHash=");
        sb.append(this.userHash);
        sb.append(", appPhoto=");
        sb.append(this.appPhoto);
        sb.append(", appServiceId=");
        sb.append(this.appServiceId);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", bdate=");
        sb.append(this.bdate);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", eduFirstName=");
        sb.append(this.eduFirstName);
        sb.append(", eduMiddleName=");
        sb.append(this.eduMiddleName);
        sb.append(", eduLastName=");
        sb.append(this.eduLastName);
        sb.append(", eduPhoto200=");
        sb.append(this.eduPhoto200);
        sb.append(", eduPhotoBase=");
        sb.append(this.eduPhotoBase);
        sb.append(", eduSex=");
        sb.append(this.eduSex);
        sb.append(", eduBirthday=");
        sb.append(this.eduBirthday);
        sb.append(", phoneToActualize=");
        return ho8.a(sb, this.phoneToActualize, ')');
    }

    public final List<AuthServiceUserValueDto> u() {
        return this.serviceInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeParcelable(this.sex, i);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.uuid);
        Integer num = this.ttl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.expires;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.phone);
        Integer num3 = this.phoneValidated;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool = this.isPartial;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isService;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<AuthServiceUserValueDto> list = this.serviceInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AuthServiceUserValueDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.universalLink);
        parcel.writeString(this.providerUniversalLink);
        parcel.writeString(this.providerVkLink);
        parcel.writeString(this.sourceUniversalLink);
        parcel.writeString(this.sourceVkLink);
        Integer num4 = this.weight;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.userHash);
        parcel.writeString(this.appPhoto);
        Integer num5 = this.appServiceId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeString(this.email);
        parcel.writeString(this.bdate);
        Boolean bool3 = this.isVerified;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.eduFirstName);
        parcel.writeString(this.eduMiddleName);
        parcel.writeString(this.eduLastName);
        parcel.writeString(this.eduPhoto200);
        parcel.writeString(this.eduPhotoBase);
        Integer num6 = this.eduSex;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeString(this.eduBirthday);
        parcel.writeString(this.phoneToActualize);
    }

    public /* synthetic */ AuthSilentTokenDto(String str, BaseSexDto baseSexDto, String str2, String str3, UserId userId, String str4, Integer num, Integer num2, String str5, String str6, String str7, String str8, String str9, Integer num3, Boolean bool, Boolean bool2, List list, String str10, String str11, String str12, String str13, String str14, Integer num4, String str15, String str16, Integer num5, String str17, String str18, Boolean bool3, String str19, String str20, String str21, String str22, String str23, Integer num6, String str24, String str25, int i, int i2, zcl zclVar) {
        this(str, baseSexDto, str2, str3, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : bool, (32768 & i) != 0 ? null : bool2, (65536 & i) != 0 ? null : list, (131072 & i) != 0 ? null : str10, (262144 & i) != 0 ? null : str11, (524288 & i) != 0 ? null : str12, (1048576 & i) != 0 ? null : str13, (2097152 & i) != 0 ? null : str14, (4194304 & i) != 0 ? null : num4, (8388608 & i) != 0 ? null : str15, (16777216 & i) != 0 ? null : str16, (33554432 & i) != 0 ? null : num5, (67108864 & i) != 0 ? null : str17, (134217728 & i) != 0 ? null : str18, (268435456 & i) != 0 ? null : bool3, (536870912 & i) != 0 ? null : str19, (1073741824 & i) != 0 ? null : str20, (i & Integer.MIN_VALUE) != 0 ? null : str21, (i2 & 1) != 0 ? null : str22, (i2 & 2) != 0 ? null : str23, (i2 & 4) != 0 ? null : num6, (i2 & 8) != 0 ? null : str24, (i2 & 16) != 0 ? null : str25);
    }
}
