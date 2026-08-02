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

/* compiled from: ChannelsSearchResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSearchResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsSearchResponseDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final List<ChannelsChannelWithLastMessageDto> channels;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("track_codes")
    private final List<String> trackCodes;

    /* compiled from: ChannelsSearchResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSearchResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSearchResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(ChannelsChannelWithLastMessageDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ChannelsSearchResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ChannelsSearchResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new ChannelsSearchResponseDto(readInt, arrayList2, arrayList, arrayList3, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSearchResponseDto[] newArray(int i) {
            return new ChannelsSearchResponseDto[i];
        }
    }

    public ChannelsSearchResponseDto(int i, List<ChannelsChannelWithLastMessageDto> list, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3, List<String> list4) {
        this.count = i;
        this.channels = list;
        this.groups = list2;
        this.profiles = list3;
        this.trackCodes = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsSearchResponseDto)) {
            return false;
        }
        ChannelsSearchResponseDto channelsSearchResponseDto = (ChannelsSearchResponseDto) obj;
        return this.count == channelsSearchResponseDto.count && epx.f(this.channels, channelsSearchResponseDto.channels) && epx.f(this.groups, channelsSearchResponseDto.groups) && epx.f(this.profiles, channelsSearchResponseDto.profiles) && epx.f(this.trackCodes, channelsSearchResponseDto.trackCodes);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.channels);
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.trackCodes;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsSearchResponseDto(count=");
        sb.append(this.count);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", trackCodes=");
        return ms9.a(')', sb, this.trackCodes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.channels);
        while (a2.hasNext()) {
            ((ChannelsChannelWithLastMessageDto) a2.next()).writeToParcel(parcel, i);
        }
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
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeStringList(this.trackCodes);
    }

    public /* synthetic */ ChannelsSearchResponseDto(int i, List list, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4);
    }
}
