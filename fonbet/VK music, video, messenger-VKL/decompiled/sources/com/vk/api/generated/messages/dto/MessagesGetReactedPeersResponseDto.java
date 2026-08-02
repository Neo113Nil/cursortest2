package com.vk.api.generated.messages.dto;

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

/* compiled from: MessagesGetReactedPeersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetReactedPeersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetReactedPeersResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("count")
    private final int count;

    @pmi0("counters")
    private final List<MessagesReactionCounterResponseItemDto> counters;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reactions")
    private final List<MessagesReactionResponseItemDto> reactions;

    /* compiled from: MessagesGetReactedPeersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetReactedPeersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetReactedPeersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MessagesReactionResponseItemDto.CREATOR, parcel, arrayList3, i, 1);
            }
            int readInt3 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList4 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = en.a(MessagesReactionCounterResponseItemDto.CREATOR, parcel, arrayList4, i3, 1);
            }
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesGetReactedPeersResponseDto.class, parcel, arrayList, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList2 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(MessagesGetReactedPeersResponseDto.class, parcel, arrayList2, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                while (i2 != readInt6) {
                    i2 = bo.b(MessagesGetReactedPeersResponseDto.class, parcel, arrayList5, i2, 1);
                }
            }
            return new MessagesGetReactedPeersResponseDto(readInt, arrayList3, arrayList4, arrayList, arrayList2, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetReactedPeersResponseDto[] newArray(int i) {
            return new MessagesGetReactedPeersResponseDto[i];
        }
    }

    public MessagesGetReactedPeersResponseDto(int i, List<MessagesReactionResponseItemDto> list, List<MessagesReactionCounterResponseItemDto> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4, List<MessagesContactDto> list5) {
        this.count = i;
        this.reactions = list;
        this.counters = list2;
        this.profiles = list3;
        this.groups = list4;
        this.contacts = list5;
    }

    public final List<MessagesReactionCounterResponseItemDto> d() {
        return this.counters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesReactionResponseItemDto> e() {
        return this.reactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetReactedPeersResponseDto)) {
            return false;
        }
        MessagesGetReactedPeersResponseDto messagesGetReactedPeersResponseDto = (MessagesGetReactedPeersResponseDto) obj;
        return this.count == messagesGetReactedPeersResponseDto.count && epx.f(this.reactions, messagesGetReactedPeersResponseDto.reactions) && epx.f(this.counters, messagesGetReactedPeersResponseDto.counters) && epx.f(this.profiles, messagesGetReactedPeersResponseDto.profiles) && epx.f(this.groups, messagesGetReactedPeersResponseDto.groups) && epx.f(this.contacts, messagesGetReactedPeersResponseDto.contacts);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.reactions), 31, this.counters);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetReactedPeersResponseDto(count=");
        sb.append(this.count);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.contacts);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.reactions);
        while (a2.hasNext()) {
            ((MessagesReactionResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.counters);
        while (a3.hasNext()) {
            ((MessagesReactionCounterResponseItemDto) a3.next()).writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
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
        List<MessagesContactDto> list3 = this.contacts;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public /* synthetic */ MessagesGetReactedPeersResponseDto(int i, List list, List list2, List list3, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4, (i2 & 32) != 0 ? null : list5);
    }
}
