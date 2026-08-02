package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.video.dto.VideoLiveInfoDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGroupDto {

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("est_date")
    private final String estDate;

    @pmi0("finish_date")
    private final Integer finishDate;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_admin")
    private final BaseBoolIntDto isAdmin;

    @pmi0("is_advertiser")
    private final BaseBoolIntDto isAdvertiser;

    @pmi0("is_closed")
    private final GroupsGroupIsClosedDto isClosed;

    @pmi0("is_member")
    private final BaseBoolIntDto isMember;

    @pmi0("is_video_live_notifications_blocked")
    private final BaseBoolIntDto isVideoLiveNotificationsBlocked;

    @pmi0("name")
    private final String name;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_200_orig")
    private final String photo200Orig;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_400_orig")
    private final String photo400Orig;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_max")
    private final String photoMax;

    @pmi0("photo_max_orig")
    private final String photoMaxOrig;

    @pmi0("photo_max_size")
    private final GroupsPhotoSizeDto photoMaxSize;

    @pmi0("public_date_label")
    private final String publicDateLabel;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("start_date")
    private final Integer startDate;

    @pmi0("type")
    private final GroupsGroupTypeDto type;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    @pmi0("video_live")
    private final VideoLiveInfoDto videoLive;

    public GroupsGroupDto(UserId userId, String str, String str2, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, GroupsPhotoSizeDto groupsPhotoSizeDto, BaseBoolIntDto baseBoolIntDto5, VideoLiveInfoDto videoLiveInfoDto) {
        this.id = userId;
        this.name = str;
        this.screenName = str2;
        this.isClosed = groupsGroupIsClosedDto;
        this.type = groupsGroupTypeDto;
        this.isAdmin = baseBoolIntDto;
        this.adminLevel = groupsGroupAdminLevelDto;
        this.isMember = baseBoolIntDto2;
        this.isAdvertiser = baseBoolIntDto3;
        this.startDate = num;
        this.finishDate = num2;
        this.verified = baseBoolIntDto4;
        this.deactivated = str3;
        this.photo50 = str4;
        this.photo100 = str5;
        this.photo200 = str6;
        this.photo200Orig = str7;
        this.photo400 = str8;
        this.photo400Orig = str9;
        this.photoMax = str10;
        this.photoMaxOrig = str11;
        this.estDate = str12;
        this.publicDateLabel = str13;
        this.photoMaxSize = groupsPhotoSizeDto;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto5;
        this.videoLive = videoLiveInfoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDto)) {
            return false;
        }
        GroupsGroupDto groupsGroupDto = (GroupsGroupDto) obj;
        return epx.f(this.id, groupsGroupDto.id) && epx.f(this.name, groupsGroupDto.name) && epx.f(this.screenName, groupsGroupDto.screenName) && this.isClosed == groupsGroupDto.isClosed && this.type == groupsGroupDto.type && this.isAdmin == groupsGroupDto.isAdmin && this.adminLevel == groupsGroupDto.adminLevel && this.isMember == groupsGroupDto.isMember && this.isAdvertiser == groupsGroupDto.isAdvertiser && epx.f(this.startDate, groupsGroupDto.startDate) && epx.f(this.finishDate, groupsGroupDto.finishDate) && this.verified == groupsGroupDto.verified && epx.f(this.deactivated, groupsGroupDto.deactivated) && epx.f(this.photo50, groupsGroupDto.photo50) && epx.f(this.photo100, groupsGroupDto.photo100) && epx.f(this.photo200, groupsGroupDto.photo200) && epx.f(this.photo200Orig, groupsGroupDto.photo200Orig) && epx.f(this.photo400, groupsGroupDto.photo400) && epx.f(this.photo400Orig, groupsGroupDto.photo400Orig) && epx.f(this.photoMax, groupsGroupDto.photoMax) && epx.f(this.photoMaxOrig, groupsGroupDto.photoMaxOrig) && epx.f(this.estDate, groupsGroupDto.estDate) && epx.f(this.publicDateLabel, groupsGroupDto.publicDateLabel) && epx.f(this.photoMaxSize, groupsGroupDto.photoMaxSize) && this.isVideoLiveNotificationsBlocked == groupsGroupDto.isVideoLiveNotificationsBlocked && epx.f(this.videoLive, groupsGroupDto.videoLive);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        int hashCode4 = (hashCode3 + (groupsGroupIsClosedDto == null ? 0 : groupsGroupIsClosedDto.hashCode())) * 31;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        int hashCode5 = (hashCode4 + (groupsGroupTypeDto == null ? 0 : groupsGroupTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isAdmin;
        int hashCode6 = (hashCode5 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        int hashCode7 = (hashCode6 + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isMember;
        int hashCode8 = (hashCode7 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isAdvertiser;
        int hashCode9 = (hashCode8 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Integer num = this.startDate;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.finishDate;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.verified;
        int hashCode12 = (hashCode11 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        String str3 = this.deactivated;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo50;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo100;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo200;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo200Orig;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photo400;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.photo400Orig;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.photoMax;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.photoMaxOrig;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.estDate;
        int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.publicDateLabel;
        int hashCode23 = (hashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        int hashCode24 = (hashCode23 + (groupsPhotoSizeDto == null ? 0 : groupsPhotoSizeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.isVideoLiveNotificationsBlocked;
        int hashCode25 = (hashCode24 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        return hashCode25 + (videoLiveInfoDto != null ? videoLiveInfoDto.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        String str = this.name;
        String str2 = this.screenName;
        GroupsGroupIsClosedDto groupsGroupIsClosedDto = this.isClosed;
        GroupsGroupTypeDto groupsGroupTypeDto = this.type;
        BaseBoolIntDto baseBoolIntDto = this.isAdmin;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        BaseBoolIntDto baseBoolIntDto2 = this.isMember;
        BaseBoolIntDto baseBoolIntDto3 = this.isAdvertiser;
        Integer num = this.startDate;
        Integer num2 = this.finishDate;
        BaseBoolIntDto baseBoolIntDto4 = this.verified;
        String str3 = this.deactivated;
        String str4 = this.photo50;
        String str5 = this.photo100;
        String str6 = this.photo200;
        String str7 = this.photo200Orig;
        String str8 = this.photo400;
        String str9 = this.photo400Orig;
        String str10 = this.photoMax;
        String str11 = this.photoMaxOrig;
        String str12 = this.estDate;
        String str13 = this.publicDateLabel;
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        BaseBoolIntDto baseBoolIntDto5 = this.isVideoLiveNotificationsBlocked;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        StringBuilder sb = new StringBuilder("GroupsGroupDto(id=");
        sb.append(userId);
        sb.append(", name=");
        sb.append(str);
        sb.append(", screenName=");
        sb.append(str2);
        sb.append(", isClosed=");
        sb.append(groupsGroupIsClosedDto);
        sb.append(", type=");
        sb.append(groupsGroupTypeDto);
        sb.append(", isAdmin=");
        sb.append(baseBoolIntDto);
        sb.append(", adminLevel=");
        sb.append(groupsGroupAdminLevelDto);
        sb.append(", isMember=");
        sb.append(baseBoolIntDto2);
        sb.append(", isAdvertiser=");
        sb.append(baseBoolIntDto3);
        sb.append(", startDate=");
        sb.append(num);
        sb.append(", finishDate=");
        sb.append(num2);
        sb.append(", verified=");
        sb.append(baseBoolIntDto4);
        sb.append(", deactivated=");
        n6j.b(sb, str3, ", photo50=", str4, ", photo100=");
        n6j.b(sb, str5, ", photo200=", str6, ", photo200Orig=");
        n6j.b(sb, str7, ", photo400=", str8, ", photo400Orig=");
        n6j.b(sb, str9, ", photoMax=", str10, ", photoMaxOrig=");
        n6j.b(sb, str11, ", estDate=", str12, ", publicDateLabel=");
        sb.append(str13);
        sb.append(", photoMaxSize=");
        sb.append(groupsPhotoSizeDto);
        sb.append(", isVideoLiveNotificationsBlocked=");
        sb.append(baseBoolIntDto5);
        sb.append(", videoLive=");
        sb.append(videoLiveInfoDto);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ GroupsGroupDto(UserId userId, String str, String str2, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, GroupsPhotoSizeDto groupsPhotoSizeDto, BaseBoolIntDto baseBoolIntDto5, VideoLiveInfoDto videoLiveInfoDto, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : groupsGroupIsClosedDto, (i & 16) != 0 ? null : groupsGroupTypeDto, (i & 32) != 0 ? null : baseBoolIntDto, (i & 64) != 0 ? null : groupsGroupAdminLevelDto, (i & 128) != 0 ? null : baseBoolIntDto2, (i & 256) != 0 ? null : baseBoolIntDto3, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : baseBoolIntDto4, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : str4, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : str6, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : str8, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str9, (i & 524288) != 0 ? null : str10, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str11, (i & 2097152) != 0 ? null : str12, (i & 4194304) != 0 ? null : str13, (i & 8388608) != 0 ? null : groupsPhotoSizeDto, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto5, (i & 33554432) != 0 ? null : videoLiveInfoDto);
    }
}
