package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ChannelsMessageDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsMessageDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsMessageDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<ChannelsAttachedMessageDto> attachments;

    @pmi0("author_id")
    private final UserId authorId;

    @pmi0("channel_id")
    private final UserId channelId;

    @pmi0("channel_info")
    private final ChannelsChannelInfoDto channelInfo;

    @pmi0("channel_type")
    private final ChannelsChannelTypeDto channelType;

    @pmi0("cm_payload")
    private final ChannelsMessagePayloadDto cmPayload;

    @pmi0("cmid")
    private final int cmid;

    @pmi0("format_data")
    private final ChannelsMessageFormatDataDto formatData;

    @pmi0("guid")
    private final String guid;

    @pmi0("is_pinned")
    private final Boolean isPinned;

    @pmi0("mute_notifications")
    private final Boolean muteNotifications;

    @pmi0("parent_id")
    private final UserId parentId;

    @pmi0("research")
    private final ChannelsMediascopeResearchDto research;

    @pmi0("text")
    private final String text;

    @pmi0("time")
    private final int time;

    @pmi0("update_time")
    private final Integer updateTime;

    /* compiled from: ChannelsMessageDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsMessageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            UserId userId = (UserId) parcel.readParcelable(ChannelsMessageDto.class.getClassLoader());
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(ChannelsMessageDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ChannelsChannelTypeDto channelsChannelTypeDto = (ChannelsChannelTypeDto) parcel.readParcelable(ChannelsMessageDto.class.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(ChannelsMessageDto.class.getClassLoader());
            ChannelsMessagePayloadDto createFromParcel = parcel.readInt() == 0 ? null : ChannelsMessagePayloadDto.CREATOR.createFromParcel(parcel);
            ChannelsChannelInfoDto createFromParcel2 = parcel.readInt() == 0 ? null : ChannelsChannelInfoDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ChannelsMessageFormatDataDto createFromParcel3 = parcel.readInt() == 0 ? null : ChannelsMessageFormatDataDto.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(ChannelsAttachedMessageDto.CREATOR, parcel, arrayList, i, 1);
                    readInt3 = readInt3;
                    userId = userId;
                }
            }
            UserId userId4 = userId;
            ChannelsMediascopeResearchDto createFromParcel4 = parcel.readInt() == 0 ? null : ChannelsMediascopeResearchDto.CREATOR.createFromParcel(parcel);
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
            return new ChannelsMessageDto(userId4, readInt, userId2, readInt2, channelsChannelTypeDto, userId3, createFromParcel, createFromParcel2, readString, readString2, createFromParcel3, valueOf3, arrayList, createFromParcel4, valueOf, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsMessageDto[] newArray(int i) {
            return new ChannelsMessageDto[i];
        }
    }

    public ChannelsMessageDto(UserId userId, int i, UserId userId2, int i2, ChannelsChannelTypeDto channelsChannelTypeDto, UserId userId3, ChannelsMessagePayloadDto channelsMessagePayloadDto, ChannelsChannelInfoDto channelsChannelInfoDto, String str, String str2, ChannelsMessageFormatDataDto channelsMessageFormatDataDto, Integer num, List<ChannelsAttachedMessageDto> list, ChannelsMediascopeResearchDto channelsMediascopeResearchDto, Boolean bool, Boolean bool2) {
        this.channelId = userId;
        this.cmid = i;
        this.authorId = userId2;
        this.time = i2;
        this.channelType = channelsChannelTypeDto;
        this.parentId = userId3;
        this.cmPayload = channelsMessagePayloadDto;
        this.channelInfo = channelsChannelInfoDto;
        this.guid = str;
        this.text = str2;
        this.formatData = channelsMessageFormatDataDto;
        this.updateTime = num;
        this.attachments = list;
        this.research = channelsMediascopeResearchDto;
        this.muteNotifications = bool;
        this.isPinned = bool2;
    }

    public final int d() {
        return this.cmid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsMessageDto)) {
            return false;
        }
        ChannelsMessageDto channelsMessageDto = (ChannelsMessageDto) obj;
        return epx.f(this.channelId, channelsMessageDto.channelId) && this.cmid == channelsMessageDto.cmid && epx.f(this.authorId, channelsMessageDto.authorId) && this.time == channelsMessageDto.time && this.channelType == channelsMessageDto.channelType && epx.f(this.parentId, channelsMessageDto.parentId) && epx.f(this.cmPayload, channelsMessageDto.cmPayload) && epx.f(this.channelInfo, channelsMessageDto.channelInfo) && epx.f(this.guid, channelsMessageDto.guid) && epx.f(this.text, channelsMessageDto.text) && epx.f(this.formatData, channelsMessageDto.formatData) && epx.f(this.updateTime, channelsMessageDto.updateTime) && epx.f(this.attachments, channelsMessageDto.attachments) && epx.f(this.research, channelsMessageDto.research) && epx.f(this.muteNotifications, channelsMessageDto.muteNotifications) && epx.f(this.isPinned, channelsMessageDto.isPinned);
    }

    public final int hashCode() {
        int a2 = shy.a(this.time, bh10.a(shy.a(this.cmid, Long.hashCode(this.channelId.b) * 31, 31), 31, this.authorId.b), 31);
        ChannelsChannelTypeDto channelsChannelTypeDto = this.channelType;
        int hashCode = (a2 + (channelsChannelTypeDto == null ? 0 : channelsChannelTypeDto.hashCode())) * 31;
        UserId userId = this.parentId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        ChannelsMessagePayloadDto channelsMessagePayloadDto = this.cmPayload;
        int hashCode3 = (hashCode2 + (channelsMessagePayloadDto == null ? 0 : channelsMessagePayloadDto.hashCode())) * 31;
        ChannelsChannelInfoDto channelsChannelInfoDto = this.channelInfo;
        int hashCode4 = (hashCode3 + (channelsChannelInfoDto == null ? 0 : channelsChannelInfoDto.hashCode())) * 31;
        String str = this.guid;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChannelsMessageFormatDataDto channelsMessageFormatDataDto = this.formatData;
        int hashCode7 = (hashCode6 + (channelsMessageFormatDataDto == null ? 0 : channelsMessageFormatDataDto.hashCode())) * 31;
        Integer num = this.updateTime;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<ChannelsAttachedMessageDto> list = this.attachments;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        ChannelsMediascopeResearchDto channelsMediascopeResearchDto = this.research;
        int hashCode10 = (hashCode9 + (channelsMediascopeResearchDto == null ? 0 : channelsMediascopeResearchDto.hashCode())) * 31;
        Boolean bool = this.muteNotifications;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPinned;
        return hashCode11 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsMessageDto(channelId=");
        sb.append(this.channelId);
        sb.append(", cmid=");
        sb.append(this.cmid);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", channelType=");
        sb.append(this.channelType);
        sb.append(", parentId=");
        sb.append(this.parentId);
        sb.append(", cmPayload=");
        sb.append(this.cmPayload);
        sb.append(", channelInfo=");
        sb.append(this.channelInfo);
        sb.append(", guid=");
        sb.append(this.guid);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", formatData=");
        sb.append(this.formatData);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", research=");
        sb.append(this.research);
        sb.append(", muteNotifications=");
        sb.append(this.muteNotifications);
        sb.append(", isPinned=");
        return tn.a(sb, this.isPinned, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.channelId, i);
        parcel.writeInt(this.cmid);
        parcel.writeParcelable(this.authorId, i);
        parcel.writeInt(this.time);
        parcel.writeParcelable(this.channelType, i);
        parcel.writeParcelable(this.parentId, i);
        ChannelsMessagePayloadDto channelsMessagePayloadDto = this.cmPayload;
        if (channelsMessagePayloadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessagePayloadDto.writeToParcel(parcel, i);
        }
        ChannelsChannelInfoDto channelsChannelInfoDto = this.channelInfo;
        if (channelsChannelInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsChannelInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.guid);
        parcel.writeString(this.text);
        ChannelsMessageFormatDataDto channelsMessageFormatDataDto = this.formatData;
        if (channelsMessageFormatDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessageFormatDataDto.writeToParcel(parcel, i);
        }
        Integer num = this.updateTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<ChannelsAttachedMessageDto> list = this.attachments;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ChannelsAttachedMessageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        ChannelsMediascopeResearchDto channelsMediascopeResearchDto = this.research;
        if (channelsMediascopeResearchDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMediascopeResearchDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.muteNotifications;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isPinned;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ ChannelsMessageDto(UserId userId, int i, UserId userId2, int i2, ChannelsChannelTypeDto channelsChannelTypeDto, UserId userId3, ChannelsMessagePayloadDto channelsMessagePayloadDto, ChannelsChannelInfoDto channelsChannelInfoDto, String str, String str2, ChannelsMessageFormatDataDto channelsMessageFormatDataDto, Integer num, List list, ChannelsMediascopeResearchDto channelsMediascopeResearchDto, Boolean bool, Boolean bool2, int i3, zcl zclVar) {
        this(userId, i, userId2, i2, (i3 & 16) != 0 ? null : channelsChannelTypeDto, (i3 & 32) != 0 ? null : userId3, (i3 & 64) != 0 ? null : channelsMessagePayloadDto, (i3 & 128) != 0 ? null : channelsChannelInfoDto, (i3 & 256) != 0 ? null : str, (i3 & 512) != 0 ? null : str2, (i3 & 1024) != 0 ? null : channelsMessageFormatDataDto, (i3 & 2048) != 0 ? null : num, (i3 & 4096) != 0 ? null : list, (i3 & 8192) != 0 ? null : channelsMediascopeResearchDto, (i3 & 16384) != 0 ? null : bool, (i3 & 32768) != 0 ? null : bool2);
    }
}
