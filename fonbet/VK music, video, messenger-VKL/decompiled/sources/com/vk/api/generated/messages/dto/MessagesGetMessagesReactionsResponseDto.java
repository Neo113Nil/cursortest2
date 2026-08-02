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
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetMessagesReactionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetMessagesReactionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetMessagesReactionsResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesReactionCountersResponseItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetMessagesReactionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetMessagesReactionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetMessagesReactionsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MessagesReactionCountersResponseItemDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetMessagesReactionsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(MessagesGetMessagesReactionsResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MessagesGetMessagesReactionsResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesGetMessagesReactionsResponseDto(arrayList3, arrayList, arrayList2, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetMessagesReactionsResponseDto[] newArray(int i) {
            return new MessagesGetMessagesReactionsResponseDto[i];
        }
    }

    public MessagesGetMessagesReactionsResponseDto(List<MessagesReactionCountersResponseItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
    }

    public final List<MessagesReactionCountersResponseItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetMessagesReactionsResponseDto)) {
            return false;
        }
        MessagesGetMessagesReactionsResponseDto messagesGetMessagesReactionsResponseDto = (MessagesGetMessagesReactionsResponseDto) obj;
        return epx.f(this.items, messagesGetMessagesReactionsResponseDto.items) && epx.f(this.profiles, messagesGetMessagesReactionsResponseDto.profiles) && epx.f(this.groups, messagesGetMessagesReactionsResponseDto.groups) && epx.f(this.contacts, messagesGetMessagesReactionsResponseDto.contacts);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetMessagesReactionsResponseDto(items=");
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
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesReactionCountersResponseItemDto) a2.next()).writeToParcel(parcel, i);
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

    public /* synthetic */ MessagesGetMessagesReactionsResponseDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
