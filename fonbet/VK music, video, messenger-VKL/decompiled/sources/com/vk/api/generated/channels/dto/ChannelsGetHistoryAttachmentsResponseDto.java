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
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsGetHistoryAttachmentsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetHistoryAttachmentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetHistoryAttachmentsResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<ChannelsHistoryAttachmentItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ChannelsGetHistoryAttachmentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetHistoryAttachmentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryAttachmentsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ChannelsHistoryAttachmentItemDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(ChannelsGetHistoryAttachmentsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(ChannelsGetHistoryAttachmentsResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new ChannelsGetHistoryAttachmentsResponseDto(arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetHistoryAttachmentsResponseDto[] newArray(int i) {
            return new ChannelsGetHistoryAttachmentsResponseDto[i];
        }
    }

    public ChannelsGetHistoryAttachmentsResponseDto(List<ChannelsHistoryAttachmentItemDto> list, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3) {
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
        if (!(obj instanceof ChannelsGetHistoryAttachmentsResponseDto)) {
            return false;
        }
        ChannelsGetHistoryAttachmentsResponseDto channelsGetHistoryAttachmentsResponseDto = (ChannelsGetHistoryAttachmentsResponseDto) obj;
        return epx.f(this.items, channelsGetHistoryAttachmentsResponseDto.items) && epx.f(this.groups, channelsGetHistoryAttachmentsResponseDto.groups) && epx.f(this.profiles, channelsGetHistoryAttachmentsResponseDto.profiles);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetHistoryAttachmentsResponseDto(items=");
        sb.append(this.items);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsHistoryAttachmentItemDto) a2.next()).writeToParcel(parcel, i);
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

    public /* synthetic */ ChannelsGetHistoryAttachmentsResponseDto(List list, List list2, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
