package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsJoinResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsJoinResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsJoinResponseDto> CREATOR = new a();

    @pmi0("channel")
    private final ChannelsChannelWithLastMessageDto channel;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ChannelsJoinResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsJoinResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsJoinResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ChannelsChannelWithLastMessageDto createFromParcel = ChannelsChannelWithLastMessageDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(ChannelsJoinResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(ChannelsJoinResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new ChannelsJoinResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsJoinResponseDto[] newArray(int i) {
            return new ChannelsJoinResponseDto[i];
        }
    }

    public ChannelsJoinResponseDto(ChannelsChannelWithLastMessageDto channelsChannelWithLastMessageDto, List<GroupsGroupFullDto> list, List<UsersUserFullDto> list2) {
        this.channel = channelsChannelWithLastMessageDto;
        this.groups = list;
        this.profiles = list2;
    }

    public final ChannelsChannelWithLastMessageDto d() {
        return this.channel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsJoinResponseDto)) {
            return false;
        }
        ChannelsJoinResponseDto channelsJoinResponseDto = (ChannelsJoinResponseDto) obj;
        return epx.f(this.channel, channelsJoinResponseDto.channel) && epx.f(this.groups, channelsJoinResponseDto.groups) && epx.f(this.profiles, channelsJoinResponseDto.profiles);
    }

    public final int hashCode() {
        int hashCode = this.channel.hashCode() * 31;
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsJoinResponseDto(channel=");
        sb.append(this.channel);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.channel.writeToParcel(parcel, i);
        List<GroupsGroupFullDto> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UsersUserFullDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ ChannelsJoinResponseDto(ChannelsChannelWithLastMessageDto channelsChannelWithLastMessageDto, List list, List list2, int i, zcl zclVar) {
        this(channelsChannelWithLastMessageDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
