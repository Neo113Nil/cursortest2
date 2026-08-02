package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ChannelsChannelDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsChannelDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsChannelDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final Boolean active;

    @pmi0("ban_info")
    private final ChannelsBanInfoDto banInfo;

    @pmi0("can_comment")
    private final Boolean canComment;

    @pmi0("channel_id")
    private final UserId channelId;

    @pmi0("channel_type")
    private final ChannelsChannelTypeDto channelType;

    @pmi0("donut_settings")
    private final ChannelsDonutSettingsDto donutSettings;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_owner")
    private final ChannelsIsOwnerDto isOwner;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("parent_id")
    private final UserId parentId;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("postponed_count")
    private final Integer postponedCount;

    @pmi0("sort_id")
    private final ChannelsSortIdDto sortId;

    @pmi0("space_id")
    private final Long spaceId;

    @pmi0("title")
    private final String title;

    @pmi0("user_data")
    private final ChannelsUserDataDto userData;

    @pmi0("version")
    private final Long version;

    /* compiled from: ChannelsChannelDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsChannelDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            UserId userId;
            ChannelsDonutSettingsDto createFromParcel;
            UserId userId2 = (UserId) parcel.readParcelable(ChannelsChannelDto.class.getClassLoader());
            ChannelsSortIdDto createFromParcel2 = ChannelsSortIdDto.CREATOR.createFromParcel(parcel);
            ChannelsUserDataDto createFromParcel3 = ChannelsUserDataDto.CREATOR.createFromParcel(parcel);
            Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            ChannelsChannelTypeDto channelsChannelTypeDto = (ChannelsChannelTypeDto) parcel.readParcelable(ChannelsChannelDto.class.getClassLoader());
            ChannelsBanInfoDto createFromParcel4 = parcel.readInt() == 0 ? null : ChannelsBanInfoDto.CREATOR.createFromParcel(parcel);
            ChannelsIsOwnerDto createFromParcel5 = parcel.readInt() == 0 ? null : ChannelsIsOwnerDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId3 = (UserId) parcel.readParcelable(ChannelsChannelDto.class.getClassLoader());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            Long valueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean bool = valueOf;
            Integer num = valueOf6;
            String readString = parcel.readString();
            Integer num2 = valueOf5;
            Long l = valueOf7;
            Boolean bool2 = valueOf2;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
                userId = userId2;
            } else {
                userId = userId2;
                createFromParcel = ChannelsDonutSettingsDto.CREATOR.createFromParcel(parcel);
            }
            return new ChannelsChannelDto(userId, createFromParcel2, createFromParcel3, valueOf4, channelsChannelTypeDto, createFromParcel4, createFromParcel5, bool, userId3, num2, num, bool2, valueOf3, l, readString, readString2, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelDto[] newArray(int i) {
            return new ChannelsChannelDto[i];
        }
    }

    public ChannelsChannelDto(UserId userId, ChannelsSortIdDto channelsSortIdDto, ChannelsUserDataDto channelsUserDataDto, Long l, ChannelsChannelTypeDto channelsChannelTypeDto, ChannelsBanInfoDto channelsBanInfoDto, ChannelsIsOwnerDto channelsIsOwnerDto, Boolean bool, UserId userId2, Integer num, Integer num2, Boolean bool2, Boolean bool3, Long l2, String str, String str2, ChannelsDonutSettingsDto channelsDonutSettingsDto) {
        this.channelId = userId;
        this.sortId = channelsSortIdDto;
        this.userData = channelsUserDataDto;
        this.spaceId = l;
        this.channelType = channelsChannelTypeDto;
        this.banInfo = channelsBanInfoDto;
        this.isOwner = channelsIsOwnerDto;
        this.isAdult = bool;
        this.parentId = userId2;
        this.postponedCount = num;
        this.membersCount = num2;
        this.canComment = bool2;
        this.active = bool3;
        this.version = l2;
        this.photoBase = str;
        this.title = str2;
        this.donutSettings = channelsDonutSettingsDto;
    }

    public final UserId d() {
        return this.channelId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ChannelsChannelTypeDto e() {
        return this.channelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsChannelDto)) {
            return false;
        }
        ChannelsChannelDto channelsChannelDto = (ChannelsChannelDto) obj;
        return epx.f(this.channelId, channelsChannelDto.channelId) && epx.f(this.sortId, channelsChannelDto.sortId) && epx.f(this.userData, channelsChannelDto.userData) && epx.f(this.spaceId, channelsChannelDto.spaceId) && this.channelType == channelsChannelDto.channelType && epx.f(this.banInfo, channelsChannelDto.banInfo) && this.isOwner == channelsChannelDto.isOwner && epx.f(this.isAdult, channelsChannelDto.isAdult) && epx.f(this.parentId, channelsChannelDto.parentId) && epx.f(this.postponedCount, channelsChannelDto.postponedCount) && epx.f(this.membersCount, channelsChannelDto.membersCount) && epx.f(this.canComment, channelsChannelDto.canComment) && epx.f(this.active, channelsChannelDto.active) && epx.f(this.version, channelsChannelDto.version) && epx.f(this.photoBase, channelsChannelDto.photoBase) && epx.f(this.title, channelsChannelDto.title) && epx.f(this.donutSettings, channelsChannelDto.donutSettings);
    }

    public final UserId f() {
        return this.parentId;
    }

    public final String g() {
        return this.photoBase;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.userData.hashCode() + ((this.sortId.hashCode() + (Long.hashCode(this.channelId.b) * 31)) * 31)) * 31;
        Long l = this.spaceId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        ChannelsChannelTypeDto channelsChannelTypeDto = this.channelType;
        int hashCode3 = (hashCode2 + (channelsChannelTypeDto == null ? 0 : channelsChannelTypeDto.hashCode())) * 31;
        ChannelsBanInfoDto channelsBanInfoDto = this.banInfo;
        int hashCode4 = (hashCode3 + (channelsBanInfoDto == null ? 0 : channelsBanInfoDto.hashCode())) * 31;
        ChannelsIsOwnerDto channelsIsOwnerDto = this.isOwner;
        int hashCode5 = (hashCode4 + (channelsIsOwnerDto == null ? 0 : channelsIsOwnerDto.hashCode())) * 31;
        Boolean bool = this.isAdult;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId = this.parentId;
        int hashCode7 = (hashCode6 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.postponedCount;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.membersCount;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.canComment;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.active;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l2 = this.version;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.photoBase;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChannelsDonutSettingsDto channelsDonutSettingsDto = this.donutSettings;
        return hashCode14 + (channelsDonutSettingsDto != null ? channelsDonutSettingsDto.hashCode() : 0);
    }

    public final ChannelsUserDataDto i() {
        return this.userData;
    }

    public final String toString() {
        return "ChannelsChannelDto(channelId=" + this.channelId + ", sortId=" + this.sortId + ", userData=" + this.userData + ", spaceId=" + this.spaceId + ", channelType=" + this.channelType + ", banInfo=" + this.banInfo + ", isOwner=" + this.isOwner + ", isAdult=" + this.isAdult + ", parentId=" + this.parentId + ", postponedCount=" + this.postponedCount + ", membersCount=" + this.membersCount + ", canComment=" + this.canComment + ", active=" + this.active + ", version=" + this.version + ", photoBase=" + this.photoBase + ", title=" + this.title + ", donutSettings=" + this.donutSettings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.channelId, i);
        this.sortId.writeToParcel(parcel, i);
        this.userData.writeToParcel(parcel, i);
        Long l = this.spaceId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeParcelable(this.channelType, i);
        ChannelsBanInfoDto channelsBanInfoDto = this.banInfo;
        if (channelsBanInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsBanInfoDto.writeToParcel(parcel, i);
        }
        ChannelsIsOwnerDto channelsIsOwnerDto = this.isOwner;
        if (channelsIsOwnerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsIsOwnerDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isAdult;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.parentId, i);
        Integer num = this.postponedCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.membersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool2 = this.canComment;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.active;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Long l2 = this.version;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        parcel.writeString(this.photoBase);
        parcel.writeString(this.title);
        ChannelsDonutSettingsDto channelsDonutSettingsDto = this.donutSettings;
        if (channelsDonutSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsDonutSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ChannelsChannelDto(UserId userId, ChannelsSortIdDto channelsSortIdDto, ChannelsUserDataDto channelsUserDataDto, Long l, ChannelsChannelTypeDto channelsChannelTypeDto, ChannelsBanInfoDto channelsBanInfoDto, ChannelsIsOwnerDto channelsIsOwnerDto, Boolean bool, UserId userId2, Integer num, Integer num2, Boolean bool2, Boolean bool3, Long l2, String str, String str2, ChannelsDonutSettingsDto channelsDonutSettingsDto, int i, zcl zclVar) {
        this(userId, channelsSortIdDto, channelsUserDataDto, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : channelsChannelTypeDto, (i & 32) != 0 ? null : channelsBanInfoDto, (i & 64) != 0 ? null : channelsIsOwnerDto, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : userId2, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : l2, (i & 16384) != 0 ? null : str, (32768 & i) != 0 ? null : str2, (i & 65536) != 0 ? null : channelsDonutSettingsDto);
    }
}
