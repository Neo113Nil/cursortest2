package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetMessageReadPeersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetMessageReadPeersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetMessageReadPeersResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<UserId> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("total_count")
    private final Integer totalCount;

    /* compiled from: MessagesGetMessageReadPeersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetMessageReadPeersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetMessageReadPeersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4 = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MessagesGetMessageReadPeersResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetMessageReadPeersResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(MessagesGetMessageReadPeersResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MessagesGetMessageReadPeersResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesGetMessageReadPeersResponseDto(valueOf, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetMessageReadPeersResponseDto[] newArray(int i) {
            return new MessagesGetMessageReadPeersResponseDto[i];
        }
    }

    public MessagesGetMessageReadPeersResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final List<UserId> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.totalCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetMessageReadPeersResponseDto)) {
            return false;
        }
        MessagesGetMessageReadPeersResponseDto messagesGetMessageReadPeersResponseDto = (MessagesGetMessageReadPeersResponseDto) obj;
        return epx.f(this.totalCount, messagesGetMessageReadPeersResponseDto.totalCount) && epx.f(this.items, messagesGetMessageReadPeersResponseDto.items) && epx.f(this.profiles, messagesGetMessageReadPeersResponseDto.profiles) && epx.f(this.groups, messagesGetMessageReadPeersResponseDto.groups) && epx.f(this.contacts, messagesGetMessageReadPeersResponseDto.contacts);
    }

    public final int hashCode() {
        Integer num = this.totalCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UserId> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesContactDto> list4 = this.contacts;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetMessageReadPeersResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.contacts);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UserId> list = this.items;
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
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<MessagesContactDto> list4 = this.contacts;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public MessagesGetMessageReadPeersResponseDto(Integer num, List<UserId> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4) {
        this.totalCount = num;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
    }

    public /* synthetic */ MessagesGetMessageReadPeersResponseDto(Integer num, List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
