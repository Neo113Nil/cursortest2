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
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsGetMessagesByIdResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetMessagesByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetMessagesByIdResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<ChannelsMessageDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ChannelsGetMessagesByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetMessagesByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessagesByIdResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(ChannelsMessageDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(ChannelsGetMessagesByIdResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(ChannelsGetMessagesByIdResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new ChannelsGetMessagesByIdResponseDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessagesByIdResponseDto[] newArray(int i) {
            return new ChannelsGetMessagesByIdResponseDto[i];
        }
    }

    public ChannelsGetMessagesByIdResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetMessagesByIdResponseDto)) {
            return false;
        }
        ChannelsGetMessagesByIdResponseDto channelsGetMessagesByIdResponseDto = (ChannelsGetMessagesByIdResponseDto) obj;
        return epx.f(this.items, channelsGetMessagesByIdResponseDto.items) && epx.f(this.groups, channelsGetMessagesByIdResponseDto.groups) && epx.f(this.profiles, channelsGetMessagesByIdResponseDto.profiles);
    }

    public final int hashCode() {
        List<ChannelsMessageDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetMessagesByIdResponseDto(items=");
        sb.append(this.items);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ChannelsMessageDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ChannelsMessageDto) f.next()).writeToParcel(parcel, i);
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

    public ChannelsGetMessagesByIdResponseDto(List<ChannelsMessageDto> list, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3) {
        this.items = list;
        this.groups = list2;
        this.profiles = list3;
    }

    public /* synthetic */ ChannelsGetMessagesByIdResponseDto(List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
