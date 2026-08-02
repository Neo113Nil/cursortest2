package com.vk.sdk.api.account.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.audio.dto.AudioAudioDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseCityDto;
import com.vk.sdk.api.base.dto.BaseCountryDto;
import com.vk.sdk.api.base.dto.BaseSexDto;
import com.vk.sdk.api.users.dto.UsersPersonalDto;
import com.vk.sdk.api.users.dto.UsersUserConnectionsDto;
import com.vk.sdk.api.users.dto.UsersUserMinDto;
import com.vk.sdk.api.users.dto.UsersUserRelationDto;
import java.util.List;
import xsna.epx;
import xsna.kr;
import xsna.l4;
import xsna.n6j;
import xsna.pmi0;
import xsna.uq;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: AccountUserSettingsDto.kt */
/* loaded from: classes5.dex */
public final class AccountUserSettingsDto {

    @pmi0("bdate")
    private final String bdate;

    @pmi0("bdate_visibility")
    private final Integer bdateVisibility;

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("connections")
    private final UsersUserConnectionsDto connections;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("home_town")
    private final String homeTown;

    @pmi0("id")
    private final UserId id;

    @pmi0("interests")
    private final AccountUserSettingsInterestsDto interests;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("is_service_account")
    private final Boolean isServiceAccount;

    @pmi0("languages")
    private final List<String> languages;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("maiden_name")
    private final String maidenName;

    @pmi0("name_request")
    private final AccountNameRequestDto nameRequest;

    @pmi0("personal")
    private final UsersPersonalDto personal;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_200")
    private final String photo200;

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

    public AccountUserSettingsDto(UserId userId, String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, String str6, Boolean bool2, Boolean bool3, UsersUserConnectionsDto usersUserConnectionsDto, String str7, Integer num2, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, String str8, AccountNameRequestDto accountNameRequestDto, UsersPersonalDto usersPersonalDto, String str9, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, BaseBoolIntDto baseBoolIntDto, List<UsersUserMinDto> list, String str10, BaseSexDto baseSexDto, AudioAudioDto audioAudioDto, AccountUserSettingsInterestsDto accountUserSettingsInterestsDto, List<String> list2) {
        this.id = userId;
        this.homeTown = str;
        this.status = str2;
        this.photo200 = str3;
        this.isServiceAccount = bool;
        this.deactivated = str4;
        this.firstName = str5;
        this.hidden = num;
        this.lastName = str6;
        this.canAccessClosed = bool2;
        this.isClosed = bool3;
        this.connections = usersUserConnectionsDto;
        this.bdate = str7;
        this.bdateVisibility = num2;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.maidenName = str8;
        this.nameRequest = accountNameRequestDto;
        this.personal = usersPersonalDto;
        this.phone = str9;
        this.relation = usersUserRelationDto;
        this.relationPartner = usersUserMinDto;
        this.relationPending = baseBoolIntDto;
        this.relationRequests = list;
        this.screenName = str10;
        this.sex = baseSexDto;
        this.statusAudio = audioAudioDto;
        this.interests = accountUserSettingsInterestsDto;
        this.languages = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettingsDto)) {
            return false;
        }
        AccountUserSettingsDto accountUserSettingsDto = (AccountUserSettingsDto) obj;
        return epx.f(this.id, accountUserSettingsDto.id) && epx.f(this.homeTown, accountUserSettingsDto.homeTown) && epx.f(this.status, accountUserSettingsDto.status) && epx.f(this.photo200, accountUserSettingsDto.photo200) && epx.f(this.isServiceAccount, accountUserSettingsDto.isServiceAccount) && epx.f(this.deactivated, accountUserSettingsDto.deactivated) && epx.f(this.firstName, accountUserSettingsDto.firstName) && epx.f(this.hidden, accountUserSettingsDto.hidden) && epx.f(this.lastName, accountUserSettingsDto.lastName) && epx.f(this.canAccessClosed, accountUserSettingsDto.canAccessClosed) && epx.f(this.isClosed, accountUserSettingsDto.isClosed) && epx.f(this.connections, accountUserSettingsDto.connections) && epx.f(this.bdate, accountUserSettingsDto.bdate) && epx.f(this.bdateVisibility, accountUserSettingsDto.bdateVisibility) && epx.f(this.city, accountUserSettingsDto.city) && epx.f(this.country, accountUserSettingsDto.country) && epx.f(this.maidenName, accountUserSettingsDto.maidenName) && epx.f(this.nameRequest, accountUserSettingsDto.nameRequest) && epx.f(this.personal, accountUserSettingsDto.personal) && epx.f(this.phone, accountUserSettingsDto.phone) && this.relation == accountUserSettingsDto.relation && epx.f(this.relationPartner, accountUserSettingsDto.relationPartner) && this.relationPending == accountUserSettingsDto.relationPending && epx.f(this.relationRequests, accountUserSettingsDto.relationRequests) && epx.f(this.screenName, accountUserSettingsDto.screenName) && this.sex == accountUserSettingsDto.sex && epx.f(this.statusAudio, accountUserSettingsDto.statusAudio) && epx.f(this.interests, accountUserSettingsDto.interests) && epx.f(this.languages, accountUserSettingsDto.languages);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.homeTown), 31, this.status);
        String str = this.photo200;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isServiceAccount;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.deactivated;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.hidden;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.lastName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.canAccessClosed;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isClosed;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        UsersUserConnectionsDto usersUserConnectionsDto = this.connections;
        int hashCode9 = (hashCode8 + (usersUserConnectionsDto == null ? 0 : usersUserConnectionsDto.hashCode())) * 31;
        String str5 = this.bdate;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.bdateVisibility;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode12 = (hashCode11 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode13 = (hashCode12 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        String str6 = this.maidenName;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AccountNameRequestDto accountNameRequestDto = this.nameRequest;
        int hashCode15 = (hashCode14 + (accountNameRequestDto == null ? 0 : accountNameRequestDto.hashCode())) * 31;
        UsersPersonalDto usersPersonalDto = this.personal;
        int hashCode16 = (hashCode15 + (usersPersonalDto == null ? 0 : usersPersonalDto.hashCode())) * 31;
        String str7 = this.phone;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        int hashCode18 = (hashCode17 + (usersUserRelationDto == null ? 0 : usersUserRelationDto.hashCode())) * 31;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        int hashCode19 = (hashCode18 + (usersUserMinDto == null ? 0 : usersUserMinDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.relationPending;
        int hashCode20 = (hashCode19 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        List<UsersUserMinDto> list = this.relationRequests;
        int hashCode21 = (hashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.screenName;
        int hashCode22 = (hashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode23 = (hashCode22 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.statusAudio;
        int hashCode24 = (hashCode23 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        AccountUserSettingsInterestsDto accountUserSettingsInterestsDto = this.interests;
        int hashCode25 = (hashCode24 + (accountUserSettingsInterestsDto == null ? 0 : accountUserSettingsInterestsDto.hashCode())) * 31;
        List<String> list2 = this.languages;
        return hashCode25 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        String str = this.homeTown;
        String str2 = this.status;
        String str3 = this.photo200;
        Boolean bool = this.isServiceAccount;
        String str4 = this.deactivated;
        String str5 = this.firstName;
        Integer num = this.hidden;
        String str6 = this.lastName;
        Boolean bool2 = this.canAccessClosed;
        Boolean bool3 = this.isClosed;
        UsersUserConnectionsDto usersUserConnectionsDto = this.connections;
        String str7 = this.bdate;
        Integer num2 = this.bdateVisibility;
        BaseCityDto baseCityDto = this.city;
        BaseCountryDto baseCountryDto = this.country;
        String str8 = this.maidenName;
        AccountNameRequestDto accountNameRequestDto = this.nameRequest;
        UsersPersonalDto usersPersonalDto = this.personal;
        String str9 = this.phone;
        UsersUserRelationDto usersUserRelationDto = this.relation;
        UsersUserMinDto usersUserMinDto = this.relationPartner;
        BaseBoolIntDto baseBoolIntDto = this.relationPending;
        List<UsersUserMinDto> list = this.relationRequests;
        String str10 = this.screenName;
        BaseSexDto baseSexDto = this.sex;
        AudioAudioDto audioAudioDto = this.statusAudio;
        AccountUserSettingsInterestsDto accountUserSettingsInterestsDto = this.interests;
        List<String> list2 = this.languages;
        StringBuilder sb = new StringBuilder("AccountUserSettingsDto(id=");
        sb.append(userId);
        sb.append(", homeTown=");
        sb.append(str);
        sb.append(", status=");
        n6j.b(sb, str2, ", photo200=", str3, ", isServiceAccount=");
        l4.i(bool, ", deactivated=", str4, ", firstName=", sb);
        kr.b(num, str5, ", hidden=", ", lastName=", sb);
        uq.c(bool2, str6, ", canAccessClosed=", ", isClosed=", sb);
        sb.append(bool3);
        sb.append(", connections=");
        sb.append(usersUserConnectionsDto);
        sb.append(", bdate=");
        kr.b(num2, str7, ", bdateVisibility=", ", city=", sb);
        sb.append(baseCityDto);
        sb.append(", country=");
        sb.append(baseCountryDto);
        sb.append(", maidenName=");
        sb.append(str8);
        sb.append(", nameRequest=");
        sb.append(accountNameRequestDto);
        sb.append(", personal=");
        sb.append(usersPersonalDto);
        sb.append(", phone=");
        sb.append(str9);
        sb.append(", relation=");
        sb.append(usersUserRelationDto);
        sb.append(", relationPartner=");
        sb.append(usersUserMinDto);
        sb.append(", relationPending=");
        sb.append(baseBoolIntDto);
        sb.append(", relationRequests=");
        sb.append(list);
        sb.append(", screenName=");
        sb.append(str10);
        sb.append(", sex=");
        sb.append(baseSexDto);
        sb.append(", statusAudio=");
        sb.append(audioAudioDto);
        sb.append(", interests=");
        sb.append(accountUserSettingsInterestsDto);
        sb.append(", languages=");
        return vp.b(")", sb, list2);
    }

    public /* synthetic */ AccountUserSettingsDto(UserId userId, String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, String str6, Boolean bool2, Boolean bool3, UsersUserConnectionsDto usersUserConnectionsDto, String str7, Integer num2, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, String str8, AccountNameRequestDto accountNameRequestDto, UsersPersonalDto usersPersonalDto, String str9, UsersUserRelationDto usersUserRelationDto, UsersUserMinDto usersUserMinDto, BaseBoolIntDto baseBoolIntDto, List list, String str10, BaseSexDto baseSexDto, AudioAudioDto audioAudioDto, AccountUserSettingsInterestsDto accountUserSettingsInterestsDto, List list2, int i, zcl zclVar) {
        this(userId, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : usersUserConnectionsDto, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : baseCityDto, (32768 & i) != 0 ? null : baseCountryDto, (65536 & i) != 0 ? null : str8, (131072 & i) != 0 ? null : accountNameRequestDto, (262144 & i) != 0 ? null : usersPersonalDto, (524288 & i) != 0 ? null : str9, (1048576 & i) != 0 ? null : usersUserRelationDto, (2097152 & i) != 0 ? null : usersUserMinDto, (4194304 & i) != 0 ? null : baseBoolIntDto, (8388608 & i) != 0 ? null : list, (16777216 & i) != 0 ? null : str10, (33554432 & i) != 0 ? null : baseSexDto, (67108864 & i) != 0 ? null : audioAudioDto, (134217728 & i) != 0 ? null : accountUserSettingsInterestsDto, (i & 268435456) != 0 ? null : list2);
    }
}
