package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonDto;
import com.vk.api.generated.channels.dto.ChannelsChannelTypeDto;
import com.vk.api.generated.video.dto.VideoLiveInfoDto;
import com.vk.dto.common.id.UserId;
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
import xsna.zcl;

/* compiled from: GroupsGroupDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupDto> CREATOR = new a();

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("app_button")
    private final GroupsAppButtonDto appButton;

    @pmi0("app_buttons")
    private final List<GroupsAppButtonDto> appButtons;

    @pmi0("audio_artist_id")
    private final String audioArtistId;

    @pmi0("audio_curator_id")
    private final Integer audioCuratorId;

    @pmi0("buttons")
    private final List<BaseOwnerButtonDto> buttons;

    @pmi0("channel_type")
    private final ChannelsChannelTypeDto channelType;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("est_date")
    private final String estDate;

    @pmi0("finish_date")
    private final Integer finishDate;

    @pmi0("had_torch")
    private final Boolean hadTorch;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_admin")
    private final BaseBoolIntDto isAdmin;

    @pmi0("is_advertiser")
    private final BaseBoolIntDto isAdvertiser;

    @pmi0("is_cached")
    private final Boolean isCached;

    @pmi0("is_closed")
    private final GroupsGroupIsClosedDto isClosed;

    @pmi0("is_member")
    private final BaseBoolIntDto isMember;

    @pmi0("is_nft_photo")
    private final Boolean isNftPhoto;

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

    @pmi0("photo_base")
    private final String photoBase;

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

    /* compiled from: GroupsGroupDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId;
            Boolean valueOf;
            BaseBoolIntDto baseBoolIntDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            VideoLiveInfoDto videoLiveInfoDto;
            Boolean valueOf2;
            Boolean valueOf3;
            UserId userId2 = (UserId) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            GroupsGroupIsClosedDto groupsGroupIsClosedDto = (GroupsGroupIsClosedDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            GroupsGroupTypeDto groupsGroupTypeDto = (GroupsGroupTypeDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            ChannelsChannelTypeDto channelsChannelTypeDto = (ChannelsChannelTypeDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = (GroupsGroupAdminLevelDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            GroupsPhotoSizeDto groupsPhotoSizeDto = (GroupsPhotoSizeDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            GroupsAppButtonDto groupsAppButtonDto = (GroupsAppButtonDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                userId = userId2;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                userId = userId2;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(GroupsGroupDto.class, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            VideoLiveInfoDto videoLiveInfoDto2 = (VideoLiveInfoDto) parcel.readParcelable(GroupsGroupDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString15 = parcel.readString();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto6;
                arrayList2 = arrayList;
                videoLiveInfoDto = videoLiveInfoDto2;
                arrayList3 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto6;
                int readInt2 = parcel.readInt();
                arrayList2 = arrayList;
                arrayList3 = new ArrayList(readInt2);
                videoLiveInfoDto = videoLiveInfoDto2;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(GroupsGroupDto.class, parcel, arrayList3, i2, 1);
                    readInt2 = readInt2;
                }
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
            return new GroupsGroupDto(userId, readString, readString2, groupsGroupIsClosedDto, groupsGroupTypeDto, channelsChannelTypeDto, baseBoolIntDto2, groupsGroupAdminLevelDto, baseBoolIntDto3, baseBoolIntDto4, valueOf4, valueOf5, baseBoolIntDto5, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, groupsPhotoSizeDto, groupsAppButtonDto, arrayList2, baseBoolIntDto, videoLiveInfoDto, valueOf, readString15, valueOf6, arrayList3, valueOf2, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupDto[] newArray(int i) {
            return new GroupsGroupDto[i];
        }
    }

    public GroupsGroupDto(UserId userId, String str, String str2, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List<GroupsAppButtonDto> list, BaseBoolIntDto baseBoolIntDto5, VideoLiveInfoDto videoLiveInfoDto, Boolean bool, String str15, Integer num3, List<BaseOwnerButtonDto> list2, Boolean bool2, Boolean bool3) {
        this.id = userId;
        this.name = str;
        this.screenName = str2;
        this.isClosed = groupsGroupIsClosedDto;
        this.type = groupsGroupTypeDto;
        this.channelType = channelsChannelTypeDto;
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
        this.photoBase = str12;
        this.estDate = str13;
        this.publicDateLabel = str14;
        this.photoMaxSize = groupsPhotoSizeDto;
        this.appButton = groupsAppButtonDto;
        this.appButtons = list;
        this.isVideoLiveNotificationsBlocked = baseBoolIntDto5;
        this.videoLive = videoLiveInfoDto;
        this.hadTorch = bool;
        this.audioArtistId = str15;
        this.audioCuratorId = num3;
        this.buttons = list2;
        this.isNftPhoto = bool2;
        this.isCached = bool3;
    }

    public final GroupsGroupTypeDto B() {
        return this.type;
    }

    public final BaseBoolIntDto C() {
        return this.verified;
    }

    public final BaseBoolIntDto D() {
        return this.isAdmin;
    }

    public final GroupsGroupIsClosedDto F() {
        return this.isClosed;
    }

    public final BaseBoolIntDto G() {
        return this.isMember;
    }

    public final Boolean K() {
        return this.isNftPhoto;
    }

    public final BaseBoolIntDto M() {
        return this.isVideoLiveNotificationsBlocked;
    }

    public final GroupsGroupAdminLevelDto d() {
        return this.adminLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.deactivated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupDto)) {
            return false;
        }
        GroupsGroupDto groupsGroupDto = (GroupsGroupDto) obj;
        return epx.f(this.id, groupsGroupDto.id) && epx.f(this.name, groupsGroupDto.name) && epx.f(this.screenName, groupsGroupDto.screenName) && this.isClosed == groupsGroupDto.isClosed && this.type == groupsGroupDto.type && this.channelType == groupsGroupDto.channelType && this.isAdmin == groupsGroupDto.isAdmin && this.adminLevel == groupsGroupDto.adminLevel && this.isMember == groupsGroupDto.isMember && this.isAdvertiser == groupsGroupDto.isAdvertiser && epx.f(this.startDate, groupsGroupDto.startDate) && epx.f(this.finishDate, groupsGroupDto.finishDate) && this.verified == groupsGroupDto.verified && epx.f(this.deactivated, groupsGroupDto.deactivated) && epx.f(this.photo50, groupsGroupDto.photo50) && epx.f(this.photo100, groupsGroupDto.photo100) && epx.f(this.photo200, groupsGroupDto.photo200) && epx.f(this.photo200Orig, groupsGroupDto.photo200Orig) && epx.f(this.photo400, groupsGroupDto.photo400) && epx.f(this.photo400Orig, groupsGroupDto.photo400Orig) && epx.f(this.photoMax, groupsGroupDto.photoMax) && epx.f(this.photoMaxOrig, groupsGroupDto.photoMaxOrig) && epx.f(this.photoBase, groupsGroupDto.photoBase) && epx.f(this.estDate, groupsGroupDto.estDate) && epx.f(this.publicDateLabel, groupsGroupDto.publicDateLabel) && epx.f(this.photoMaxSize, groupsGroupDto.photoMaxSize) && epx.f(this.appButton, groupsGroupDto.appButton) && epx.f(this.appButtons, groupsGroupDto.appButtons) && this.isVideoLiveNotificationsBlocked == groupsGroupDto.isVideoLiveNotificationsBlocked && epx.f(this.videoLive, groupsGroupDto.videoLive) && epx.f(this.hadTorch, groupsGroupDto.hadTorch) && epx.f(this.audioArtistId, groupsGroupDto.audioArtistId) && epx.f(this.audioCuratorId, groupsGroupDto.audioCuratorId) && epx.f(this.buttons, groupsGroupDto.buttons) && epx.f(this.isNftPhoto, groupsGroupDto.isNftPhoto) && epx.f(this.isCached, groupsGroupDto.isCached);
    }

    public final Integer f() {
        return this.finishDate;
    }

    public final UserId g() {
        return this.id;
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
        ChannelsChannelTypeDto channelsChannelTypeDto = this.channelType;
        int hashCode6 = (hashCode5 + (channelsChannelTypeDto == null ? 0 : channelsChannelTypeDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isAdmin;
        int hashCode7 = (hashCode6 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        int hashCode8 = (hashCode7 + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isMember;
        int hashCode9 = (hashCode8 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isAdvertiser;
        int hashCode10 = (hashCode9 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Integer num = this.startDate;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.finishDate;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.verified;
        int hashCode13 = (hashCode12 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        String str3 = this.deactivated;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo50;
        int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo100;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo200;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo200Orig;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photo400;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.photo400Orig;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.photoMax;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.photoMaxOrig;
        int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.photoBase;
        int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.estDate;
        int hashCode24 = (hashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.publicDateLabel;
        int hashCode25 = (hashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        GroupsPhotoSizeDto groupsPhotoSizeDto = this.photoMaxSize;
        int hashCode26 = (hashCode25 + (groupsPhotoSizeDto == null ? 0 : groupsPhotoSizeDto.hashCode())) * 31;
        GroupsAppButtonDto groupsAppButtonDto = this.appButton;
        int hashCode27 = (hashCode26 + (groupsAppButtonDto == null ? 0 : groupsAppButtonDto.hashCode())) * 31;
        List<GroupsAppButtonDto> list = this.appButtons;
        int hashCode28 = (hashCode27 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.isVideoLiveNotificationsBlocked;
        int hashCode29 = (hashCode28 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        VideoLiveInfoDto videoLiveInfoDto = this.videoLive;
        int hashCode30 = (hashCode29 + (videoLiveInfoDto == null ? 0 : videoLiveInfoDto.hashCode())) * 31;
        Boolean bool = this.hadTorch;
        int hashCode31 = (hashCode30 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str15 = this.audioArtistId;
        int hashCode32 = (hashCode31 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num3 = this.audioCuratorId;
        int hashCode33 = (hashCode32 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<BaseOwnerButtonDto> list2 = this.buttons;
        int hashCode34 = (hashCode33 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isNftPhoto;
        int hashCode35 = (hashCode34 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCached;
        return hashCode35 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String i() {
        return this.name;
    }

    public final String j() {
        return this.photo100;
    }

    public final String k() {
        return this.photo200;
    }

    public final String l() {
        return this.photo400;
    }

    public final String n() {
        return this.photo50;
    }

    public final String o() {
        return this.photoBase;
    }

    public final String p() {
        return this.screenName;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", channelType=");
        sb.append(this.channelType);
        sb.append(", isAdmin=");
        sb.append(this.isAdmin);
        sb.append(", adminLevel=");
        sb.append(this.adminLevel);
        sb.append(", isMember=");
        sb.append(this.isMember);
        sb.append(", isAdvertiser=");
        sb.append(this.isAdvertiser);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", finishDate=");
        sb.append(this.finishDate);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo200Orig=");
        sb.append(this.photo200Orig);
        sb.append(", photo400=");
        sb.append(this.photo400);
        sb.append(", photo400Orig=");
        sb.append(this.photo400Orig);
        sb.append(", photoMax=");
        sb.append(this.photoMax);
        sb.append(", photoMaxOrig=");
        sb.append(this.photoMaxOrig);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", estDate=");
        sb.append(this.estDate);
        sb.append(", publicDateLabel=");
        sb.append(this.publicDateLabel);
        sb.append(", photoMaxSize=");
        sb.append(this.photoMaxSize);
        sb.append(", appButton=");
        sb.append(this.appButton);
        sb.append(", appButtons=");
        sb.append(this.appButtons);
        sb.append(", isVideoLiveNotificationsBlocked=");
        sb.append(this.isVideoLiveNotificationsBlocked);
        sb.append(", videoLive=");
        sb.append(this.videoLive);
        sb.append(", hadTorch=");
        sb.append(this.hadTorch);
        sb.append(", audioArtistId=");
        sb.append(this.audioArtistId);
        sb.append(", audioCuratorId=");
        sb.append(this.audioCuratorId);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", isNftPhoto=");
        sb.append(this.isNftPhoto);
        sb.append(", isCached=");
        return tn.a(sb, this.isCached, ')');
    }

    public final Integer u() {
        return this.startDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.screenName);
        parcel.writeParcelable(this.isClosed, i);
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.channelType, i);
        parcel.writeParcelable(this.isAdmin, i);
        parcel.writeParcelable(this.adminLevel, i);
        parcel.writeParcelable(this.isMember, i);
        parcel.writeParcelable(this.isAdvertiser, i);
        Integer num = this.startDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.finishDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.verified, i);
        parcel.writeString(this.deactivated);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo200Orig);
        parcel.writeString(this.photo400);
        parcel.writeString(this.photo400Orig);
        parcel.writeString(this.photoMax);
        parcel.writeString(this.photoMaxOrig);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.estDate);
        parcel.writeString(this.publicDateLabel);
        parcel.writeParcelable(this.photoMaxSize, i);
        parcel.writeParcelable(this.appButton, i);
        List<GroupsAppButtonDto> list = this.appButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.isVideoLiveNotificationsBlocked, i);
        parcel.writeParcelable(this.videoLive, i);
        Boolean bool = this.hadTorch;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.audioArtistId);
        Integer num3 = this.audioCuratorId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        List<BaseOwnerButtonDto> list2 = this.buttons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Boolean bool2 = this.isNftPhoto;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCached;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ GroupsGroupDto(UserId userId, String str, String str2, GroupsGroupIsClosedDto groupsGroupIsClosedDto, GroupsGroupTypeDto groupsGroupTypeDto, ChannelsChannelTypeDto channelsChannelTypeDto, BaseBoolIntDto baseBoolIntDto, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, GroupsPhotoSizeDto groupsPhotoSizeDto, GroupsAppButtonDto groupsAppButtonDto, List list, BaseBoolIntDto baseBoolIntDto5, VideoLiveInfoDto videoLiveInfoDto, Boolean bool, String str15, Integer num3, List list2, Boolean bool2, Boolean bool3, int i, int i2, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : groupsGroupIsClosedDto, (i & 16) != 0 ? null : groupsGroupTypeDto, (i & 32) != 0 ? null : channelsChannelTypeDto, (i & 64) != 0 ? null : baseBoolIntDto, (i & 128) != 0 ? null : groupsGroupAdminLevelDto, (i & 256) != 0 ? null : baseBoolIntDto2, (i & 512) != 0 ? null : baseBoolIntDto3, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : baseBoolIntDto4, (i & 8192) != 0 ? null : str3, (i & 16384) != 0 ? null : str4, (i & 32768) != 0 ? null : str5, (i & 65536) != 0 ? null : str6, (i & 131072) != 0 ? null : str7, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str8, (i & 524288) != 0 ? null : str9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str10, (i & 2097152) != 0 ? null : str11, (i & 4194304) != 0 ? null : str12, (i & 8388608) != 0 ? null : str13, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str14, (i & 33554432) != 0 ? null : groupsPhotoSizeDto, (i & 67108864) != 0 ? null : groupsAppButtonDto, (i & 134217728) != 0 ? null : list, (i & 268435456) != 0 ? null : baseBoolIntDto5, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : videoLiveInfoDto, (i & 1073741824) != 0 ? null : bool, (i & Integer.MIN_VALUE) != 0 ? null : str15, (i2 & 1) != 0 ? null : num3, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : bool3);
    }
}
