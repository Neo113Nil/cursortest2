package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsGetHistoryResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetHistoryResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetHistoryResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<ChannelsMessageDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ChannelsGetHistoryResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetHistoryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(ChannelsMessageDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ChannelsGetHistoryResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ChannelsGetHistoryResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new ChannelsGetHistoryResponseDto(readInt, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryResponseDto[] newArray(int i) {
            return new ChannelsGetHistoryResponseDto[i];
        }
    }

    public ChannelsGetHistoryResponseDto(int i, List<ChannelsMessageDto> list, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3) {
        this.count = i;
        this.items = list;
        this.groups = list2;
        this.profiles = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetHistoryResponseDto)) {
            return false;
        }
        ChannelsGetHistoryResponseDto channelsGetHistoryResponseDto = (ChannelsGetHistoryResponseDto) obj;
        return this.count == channelsGetHistoryResponseDto.count && epx.f(this.items, channelsGetHistoryResponseDto.items) && epx.f(this.groups, channelsGetHistoryResponseDto.groups) && epx.f(this.profiles, channelsGetHistoryResponseDto.profiles);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetHistoryResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
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

    public /* synthetic */ ChannelsGetHistoryResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
