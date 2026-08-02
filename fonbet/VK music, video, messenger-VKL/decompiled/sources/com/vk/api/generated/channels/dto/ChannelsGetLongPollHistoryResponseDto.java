package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: ChannelsGetLongPollHistoryResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetLongPollHistoryResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetLongPollHistoryResponseDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final List<ChannelsChannelWithLastMessageDto> channels;

    @pmi0("credentials")
    private final ChannelsLongpollCredentialsDto credentials;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("has_more")
    private final boolean hasMore;

    @pmi0("history")
    private final List<List<Integer>> history;

    @pmi0("messages")
    private final List<ChannelsMessageDto> messages;

    @pmi0("new_ts")
    private final int newTs;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ChannelsGetLongPollHistoryResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetLongPollHistoryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetLongPollHistoryResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt);
            int i = 0;
            for (int i2 = 0; i2 != readInt; i2++) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = pm0.b(parcel, arrayList5, i3, 1);
                }
                arrayList4.add(arrayList5);
            }
            int readInt3 = parcel.readInt();
            ChannelsLongpollCredentialsDto createFromParcel = ChannelsLongpollCredentialsDto.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList6 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(ChannelsMessageDto.CREATOR, parcel, arrayList7, i4, 1);
                }
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList2 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(ChannelsChannelWithLastMessageDto.CREATOR, parcel, arrayList2, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(ChannelsGetLongPollHistoryResponseDto.class, parcel, arrayList8, i6, 1);
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() != 0) {
                int readInt7 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt7);
                while (i != readInt7) {
                    i = bo.b(ChannelsGetLongPollHistoryResponseDto.class, parcel, arrayList9, i, 1);
                }
                arrayList6 = arrayList9;
            }
            return new ChannelsGetLongPollHistoryResponseDto(arrayList4, readInt3, createFromParcel, z, arrayList, arrayList2, arrayList3, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetLongPollHistoryResponseDto[] newArray(int i) {
            return new ChannelsGetLongPollHistoryResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsGetLongPollHistoryResponseDto(List<? extends List<Integer>> list, int i, ChannelsLongpollCredentialsDto channelsLongpollCredentialsDto, boolean z, List<ChannelsMessageDto> list2, List<ChannelsChannelWithLastMessageDto> list3, List<GroupsGroupFullDto> list4, List<UsersUserFullDto> list5) {
        this.history = list;
        this.newTs = i;
        this.credentials = channelsLongpollCredentialsDto;
        this.hasMore = z;
        this.messages = list2;
        this.channels = list3;
        this.groups = list4;
        this.profiles = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetLongPollHistoryResponseDto)) {
            return false;
        }
        ChannelsGetLongPollHistoryResponseDto channelsGetLongPollHistoryResponseDto = (ChannelsGetLongPollHistoryResponseDto) obj;
        return epx.f(this.history, channelsGetLongPollHistoryResponseDto.history) && this.newTs == channelsGetLongPollHistoryResponseDto.newTs && epx.f(this.credentials, channelsGetLongPollHistoryResponseDto.credentials) && this.hasMore == channelsGetLongPollHistoryResponseDto.hasMore && epx.f(this.messages, channelsGetLongPollHistoryResponseDto.messages) && epx.f(this.channels, channelsGetLongPollHistoryResponseDto.channels) && epx.f(this.groups, channelsGetLongPollHistoryResponseDto.groups) && epx.f(this.profiles, channelsGetLongPollHistoryResponseDto.profiles);
    }

    public final int hashCode() {
        int b = qoy.b((this.credentials.hashCode() + shy.a(this.newTs, this.history.hashCode() * 31, 31)) * 31, 31, this.hasMore);
        List<ChannelsMessageDto> list = this.messages;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<ChannelsChannelWithLastMessageDto> list2 = this.channels;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersUserFullDto> list4 = this.profiles;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetLongPollHistoryResponseDto(history=");
        sb.append(this.history);
        sb.append(", newTs=");
        sb.append(this.newTs);
        sb.append(", credentials=");
        sb.append(this.credentials);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", messages=");
        sb.append(this.messages);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.history);
        while (a2.hasNext()) {
            Iterator a3 = ao.a(parcel, (List) a2.next());
            while (a3.hasNext()) {
                parcel.writeInt(((Number) a3.next()).intValue());
            }
        }
        parcel.writeInt(this.newTs);
        this.credentials.writeToParcel(parcel, i);
        parcel.writeInt(this.hasMore ? 1 : 0);
        List<ChannelsMessageDto> list = this.messages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ChannelsMessageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<ChannelsChannelWithLastMessageDto> list2 = this.channels;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((ChannelsChannelWithLastMessageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<UsersUserFullDto> list4 = this.profiles;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public /* synthetic */ ChannelsGetLongPollHistoryResponseDto(List list, int i, ChannelsLongpollCredentialsDto channelsLongpollCredentialsDto, boolean z, List list2, List list3, List list4, List list5, int i2, zcl zclVar) {
        this(list, i, channelsLongpollCredentialsDto, z, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : list4, (i2 & 128) != 0 ? null : list5);
    }
}
