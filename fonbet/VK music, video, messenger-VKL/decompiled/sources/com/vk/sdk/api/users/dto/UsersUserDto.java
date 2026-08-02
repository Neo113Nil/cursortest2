package com.vk.sdk.api.users.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseSexDto;
import com.vk.sdk.api.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.sdk.api.friends.dto.FriendsRequestsMutualDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.eok;
import xsna.epx;
import xsna.kr;
import xsna.n6j;
import xsna.pmi0;
import xsna.to;
import xsna.uq;
import xsna.xq;
import xsna.zcl;

/* compiled from: UsersUserDto.kt */
/* loaded from: classes5.dex */
public final class UsersUserDto {

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("mutual")
    private final FriendsRequestsMutualDto mutual;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final BaseBoolIntDto online;

    @pmi0("online_app")
    private final Integer onlineApp;

    @pmi0("online_info")
    private final UsersOnlineInfoDto onlineInfo;

    @pmi0("online_mobile")
    private final BaseBoolIntDto onlineMobile;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("trending")
    private final BaseBoolIntDto trending;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    public UsersUserDto(UserId userId, BaseSexDto baseSexDto, String str, String str2, String str3, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str4, String str5, Integer num2, String str6, Boolean bool, Boolean bool2) {
        this.id = userId;
        this.sex = baseSexDto;
        this.screenName = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = baseBoolIntDto;
        this.onlineMobile = baseBoolIntDto2;
        this.onlineApp = num;
        this.verified = baseBoolIntDto3;
        this.trending = baseBoolIntDto4;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.mutual = friendsRequestsMutualDto;
        this.deactivated = str4;
        this.firstName = str5;
        this.hidden = num2;
        this.lastName = str6;
        this.canAccessClosed = bool;
        this.isClosed = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserDto)) {
            return false;
        }
        UsersUserDto usersUserDto = (UsersUserDto) obj;
        return epx.f(this.id, usersUserDto.id) && this.sex == usersUserDto.sex && epx.f(this.screenName, usersUserDto.screenName) && epx.f(this.photo50, usersUserDto.photo50) && epx.f(this.photo100, usersUserDto.photo100) && epx.f(this.onlineInfo, usersUserDto.onlineInfo) && this.online == usersUserDto.online && this.onlineMobile == usersUserDto.onlineMobile && epx.f(this.onlineApp, usersUserDto.onlineApp) && this.verified == usersUserDto.verified && this.trending == usersUserDto.trending && this.friendStatus == usersUserDto.friendStatus && epx.f(this.mutual, usersUserDto.mutual) && epx.f(this.deactivated, usersUserDto.deactivated) && epx.f(this.firstName, usersUserDto.firstName) && epx.f(this.hidden, usersUserDto.hidden) && epx.f(this.lastName, usersUserDto.lastName) && epx.f(this.canAccessClosed, usersUserDto.canAccessClosed) && epx.f(this.isClosed, usersUserDto.isClosed);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode2 = (hashCode + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str = this.screenName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo50;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo100;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode6 = (hashCode5 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.online;
        int hashCode7 = (hashCode6 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.onlineMobile;
        int hashCode8 = (hashCode7 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Integer num = this.onlineApp;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.verified;
        int hashCode10 = (hashCode9 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.trending;
        int hashCode11 = (hashCode10 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode12 = (hashCode11 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode13 = (hashCode12 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        String str4 = this.deactivated;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.hidden;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.lastName;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.canAccessClosed;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        return hashCode18 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        BaseSexDto baseSexDto = this.sex;
        String str = this.screenName;
        String str2 = this.photo50;
        String str3 = this.photo100;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        BaseBoolIntDto baseBoolIntDto = this.online;
        BaseBoolIntDto baseBoolIntDto2 = this.onlineMobile;
        Integer num = this.onlineApp;
        BaseBoolIntDto baseBoolIntDto3 = this.verified;
        BaseBoolIntDto baseBoolIntDto4 = this.trending;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        String str4 = this.deactivated;
        String str5 = this.firstName;
        Integer num2 = this.hidden;
        String str6 = this.lastName;
        Boolean bool = this.canAccessClosed;
        Boolean bool2 = this.isClosed;
        StringBuilder sb = new StringBuilder("UsersUserDto(id=");
        sb.append(userId);
        sb.append(", sex=");
        sb.append(baseSexDto);
        sb.append(", screenName=");
        n6j.b(sb, str, ", photo50=", str2, ", photo100=");
        sb.append(str3);
        sb.append(", onlineInfo=");
        sb.append(usersOnlineInfoDto);
        sb.append(", online=");
        to.b(sb, baseBoolIntDto, ", onlineMobile=", baseBoolIntDto2, ", onlineApp=");
        sb.append(num);
        sb.append(", verified=");
        sb.append(baseBoolIntDto3);
        sb.append(", trending=");
        sb.append(baseBoolIntDto4);
        sb.append(", friendStatus=");
        sb.append(friendsFriendStatusStatusDto);
        sb.append(", mutual=");
        sb.append(friendsRequestsMutualDto);
        sb.append(", deactivated=");
        sb.append(str4);
        sb.append(", firstName=");
        kr.b(num2, str5, ", hidden=", ", lastName=", sb);
        uq.c(bool, str6, ", canAccessClosed=", ", isClosed=", sb);
        return xq.d(sb, bool2, ")");
    }

    public /* synthetic */ UsersUserDto(UserId userId, BaseSexDto baseSexDto, String str, String str2, String str3, UsersOnlineInfoDto usersOnlineInfoDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, FriendsRequestsMutualDto friendsRequestsMutualDto, String str4, String str5, Integer num2, String str6, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : baseSexDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : usersOnlineInfoDto, (i & 64) != 0 ? null : baseBoolIntDto, (i & 128) != 0 ? null : baseBoolIntDto2, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : baseBoolIntDto3, (i & 1024) != 0 ? null : baseBoolIntDto4, (i & 2048) != 0 ? null : friendsFriendStatusStatusDto, (i & 4096) != 0 ? null : friendsRequestsMutualDto, (i & 8192) != 0 ? null : str4, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : str6, (i & 131072) != 0 ? null : bool, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool2);
    }
}
