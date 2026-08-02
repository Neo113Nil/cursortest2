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
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsUnarchiveResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsUnarchiveResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsUnarchiveResponseDto> CREATOR = new a();

    @pmi0("failed")
    private final List<ChannelsFailedChannelIdItemDto> failed;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0(RTCStatsConstants.VALUE_SUCCEEDED)
    private final List<ChannelsChannelWithLastMessageDto> succeeded;

    /* compiled from: ChannelsUnarchiveResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsUnarchiveResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsUnarchiveResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ChannelsFailedChannelIdItemDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(ChannelsChannelWithLastMessageDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(ChannelsUnarchiveResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ChannelsUnarchiveResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new ChannelsUnarchiveResponseDto(arrayList3, arrayList, arrayList2, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsUnarchiveResponseDto[] newArray(int i) {
            return new ChannelsUnarchiveResponseDto[i];
        }
    }

    public ChannelsUnarchiveResponseDto(List<ChannelsFailedChannelIdItemDto> list, List<ChannelsChannelWithLastMessageDto> list2, List<GroupsGroupFullDto> list3, List<UsersUserFullDto> list4) {
        this.failed = list;
        this.succeeded = list2;
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
        if (!(obj instanceof ChannelsUnarchiveResponseDto)) {
            return false;
        }
        ChannelsUnarchiveResponseDto channelsUnarchiveResponseDto = (ChannelsUnarchiveResponseDto) obj;
        return epx.f(this.failed, channelsUnarchiveResponseDto.failed) && epx.f(this.succeeded, channelsUnarchiveResponseDto.succeeded) && epx.f(this.groups, channelsUnarchiveResponseDto.groups) && epx.f(this.profiles, channelsUnarchiveResponseDto.profiles);
    }

    public final int hashCode() {
        int hashCode = this.failed.hashCode() * 31;
        List<ChannelsChannelWithLastMessageDto> list = this.succeeded;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsUnarchiveResponseDto(failed=");
        sb.append(this.failed);
        sb.append(", succeeded=");
        sb.append(this.succeeded);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.failed);
        while (a2.hasNext()) {
            ((ChannelsFailedChannelIdItemDto) a2.next()).writeToParcel(parcel, i);
        }
        List<ChannelsChannelWithLastMessageDto> list = this.succeeded;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ChannelsChannelWithLastMessageDto) f.next()).writeToParcel(parcel, i);
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

    public /* synthetic */ ChannelsUnarchiveResponseDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
