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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetConversationsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetConversationsResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("count")
    private final int count;

    @pmi0("emails")
    private final List<MessagesEmailDto> emails;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesConversationWithMessageDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("unread_count")
    private final Integer unreadCount;

    /* compiled from: MessagesGetConversationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MessagesConversationWithMessageDto.CREATOR, parcel, arrayList5, i2, 1);
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesGetConversationsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesGetConversationsResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(MessagesGetConversationsResponseDto.class, parcel, arrayList6, i5, 1);
                }
                arrayList3 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = en.a(MessagesEmailDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesGetConversationsResponseDto(readInt, arrayList5, valueOf, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationsResponseDto[] newArray(int i) {
            return new MessagesGetConversationsResponseDto[i];
        }
    }

    public MessagesGetConversationsResponseDto(int i, List<MessagesConversationWithMessageDto> list, Integer num, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4, List<MessagesEmailDto> list5) {
        this.count = i;
        this.items = list;
        this.unreadCount = num;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
        this.emails = list5;
    }

    public final List<MessagesContactDto> d() {
        return this.contacts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationsResponseDto)) {
            return false;
        }
        MessagesGetConversationsResponseDto messagesGetConversationsResponseDto = (MessagesGetConversationsResponseDto) obj;
        return this.count == messagesGetConversationsResponseDto.count && epx.f(this.items, messagesGetConversationsResponseDto.items) && epx.f(this.unreadCount, messagesGetConversationsResponseDto.unreadCount) && epx.f(this.profiles, messagesGetConversationsResponseDto.profiles) && epx.f(this.groups, messagesGetConversationsResponseDto.groups) && epx.f(this.contacts, messagesGetConversationsResponseDto.contacts) && epx.f(this.emails, messagesGetConversationsResponseDto.emails);
    }

    public final List<MessagesConversationWithMessageDto> f() {
        return this.items;
    }

    public final List<UsersUserFullDto> g() {
        return this.profiles;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.unreadCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesEmailDto> list4 = this.emails;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetConversationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", unreadCount=");
        sb.append(this.unreadCount);
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
            ((MessagesConversationWithMessageDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.unreadCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
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

    public /* synthetic */ MessagesGetConversationsResponseDto(int i, List list, Integer num, List list2, List list3, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : list5);
    }
}
