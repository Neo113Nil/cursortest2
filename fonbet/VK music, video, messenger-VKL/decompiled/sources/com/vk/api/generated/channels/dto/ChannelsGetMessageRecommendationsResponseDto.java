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
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsGetMessageRecommendationsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetMessageRecommendationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetMessageRecommendationsResponseDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final List<ChannelsChannelDto> channels;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<ChannelsMessageDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ChannelsGetMessageRecommendationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetMessageRecommendationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessageRecommendationsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(ChannelsMessageDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(ChannelsChannelDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(ChannelsGetMessageRecommendationsResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(ChannelsGetMessageRecommendationsResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new ChannelsGetMessageRecommendationsResponseDto(readInt, arrayList3, arrayList, arrayList2, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessageRecommendationsResponseDto[] newArray(int i) {
            return new ChannelsGetMessageRecommendationsResponseDto[i];
        }
    }

    public ChannelsGetMessageRecommendationsResponseDto(int i, List<ChannelsMessageDto> list, List<ChannelsChannelDto> list2, List<GroupsGroupFullDto> list3, List<UsersUserFullDto> list4) {
        this.count = i;
        this.items = list;
        this.channels = list2;
        this.groups = list3;
        this.profiles = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetMessageRecommendationsResponseDto)) {
            return false;
        }
        ChannelsGetMessageRecommendationsResponseDto channelsGetMessageRecommendationsResponseDto = (ChannelsGetMessageRecommendationsResponseDto) obj;
        return this.count == channelsGetMessageRecommendationsResponseDto.count && epx.f(this.items, channelsGetMessageRecommendationsResponseDto.items) && epx.f(this.channels, channelsGetMessageRecommendationsResponseDto.channels) && epx.f(this.groups, channelsGetMessageRecommendationsResponseDto.groups) && epx.f(this.profiles, channelsGetMessageRecommendationsResponseDto.profiles);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<ChannelsChannelDto> list = this.channels;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetMessageRecommendationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsMessageDto) a2.next()).writeToParcel(parcel, i);
        }
        List<ChannelsChannelDto> list = this.channels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ChannelsChannelDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public /* synthetic */ ChannelsGetMessageRecommendationsResponseDto(int i, List list, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4);
    }
}
