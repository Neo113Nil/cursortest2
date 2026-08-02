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

/* compiled from: MessagesGetSharedConversationsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetSharedConversationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetSharedConversationsResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("count")
    private final int count;

    @pmi0("emails")
    private final List<MessagesEmailDto> emails;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesConversationDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetSharedConversationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetSharedConversationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetSharedConversationsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MessagesConversationDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesGetSharedConversationsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesGetSharedConversationsResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(MessagesGetSharedConversationsResponseDto.class, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = en.a(MessagesEmailDto.CREATOR, parcel, arrayList5, i, 1);
                }
            }
            return new MessagesGetSharedConversationsResponseDto(readInt, arrayList4, arrayList, arrayList2, arrayList3, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetSharedConversationsResponseDto[] newArray(int i) {
            return new MessagesGetSharedConversationsResponseDto[i];
        }
    }

    public MessagesGetSharedConversationsResponseDto(int i, List<MessagesConversationDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4, List<MessagesEmailDto> list5) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
        this.emails = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetSharedConversationsResponseDto)) {
            return false;
        }
        MessagesGetSharedConversationsResponseDto messagesGetSharedConversationsResponseDto = (MessagesGetSharedConversationsResponseDto) obj;
        return this.count == messagesGetSharedConversationsResponseDto.count && epx.f(this.items, messagesGetSharedConversationsResponseDto.items) && epx.f(this.profiles, messagesGetSharedConversationsResponseDto.profiles) && epx.f(this.groups, messagesGetSharedConversationsResponseDto.groups) && epx.f(this.contacts, messagesGetSharedConversationsResponseDto.contacts) && epx.f(this.emails, messagesGetSharedConversationsResponseDto.emails);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesEmailDto> list4 = this.emails;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetSharedConversationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", emails=");
        return ms9.a(')', sb, this.emails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesConversationDto) a2.next()).writeToParcel(parcel, i);
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
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<MessagesEmailDto> list4 = this.emails;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            ((MessagesEmailDto) f4.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesGetSharedConversationsResponseDto(int i, List list, List list2, List list3, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4, (i2 & 32) != 0 ? null : list5);
    }
}
