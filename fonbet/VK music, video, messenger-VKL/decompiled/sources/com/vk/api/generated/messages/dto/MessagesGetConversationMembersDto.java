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
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MessagesGetConversationMembersDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationMembersDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetConversationMembersDto> CREATOR = new a();

    @pmi0("chat_restrictions")
    private final MessagesChatRestrictionsDto chatRestrictions;

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("incognito_members")
    private final List<MessagesIncognitoMemberDto> incognitoMembers;

    @pmi0("items")
    private final List<MessagesConversationMemberDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetConversationMembersDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationMembersDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationMembersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MessagesConversationMemberDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList5 = null;
            MessagesChatRestrictionsDto createFromParcel = parcel.readInt() == 0 ? null : MessagesChatRestrictionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesGetConversationMembersDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesGetConversationMembersDto.class, parcel, arrayList6, i4, 1);
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(MessagesGetConversationMembersDto.class, parcel, arrayList7, i5, 1);
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = en.a(MessagesIncognitoMemberDto.CREATOR, parcel, arrayList8, i, 1);
                }
                arrayList5 = arrayList8;
            }
            return new MessagesGetConversationMembersDto(arrayList4, readInt2, createFromParcel, arrayList, arrayList2, arrayList3, arrayList5, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationMembersDto[] newArray(int i) {
            return new MessagesGetConversationMembersDto[i];
        }
    }

    public MessagesGetConversationMembersDto(List<MessagesConversationMemberDto> list, int i, MessagesChatRestrictionsDto messagesChatRestrictionsDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4, List<MessagesIncognitoMemberDto> list5, String str) {
        this.items = list;
        this.count = i;
        this.chatRestrictions = messagesChatRestrictionsDto;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
        this.incognitoMembers = list5;
        this.nextFrom = str;
    }

    public final List<MessagesIncognitoMemberDto> d() {
        return this.incognitoMembers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesConversationMemberDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationMembersDto)) {
            return false;
        }
        MessagesGetConversationMembersDto messagesGetConversationMembersDto = (MessagesGetConversationMembersDto) obj;
        return epx.f(this.items, messagesGetConversationMembersDto.items) && this.count == messagesGetConversationMembersDto.count && epx.f(this.chatRestrictions, messagesGetConversationMembersDto.chatRestrictions) && epx.f(this.profiles, messagesGetConversationMembersDto.profiles) && epx.f(this.groups, messagesGetConversationMembersDto.groups) && epx.f(this.contacts, messagesGetConversationMembersDto.contacts) && epx.f(this.incognitoMembers, messagesGetConversationMembersDto.incognitoMembers) && epx.f(this.nextFrom, messagesGetConversationMembersDto.nextFrom);
    }

    public final String f() {
        return this.nextFrom;
    }

    public final List<UsersUserFullDto> g() {
        return this.profiles;
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        MessagesChatRestrictionsDto messagesChatRestrictionsDto = this.chatRestrictions;
        int hashCode = (a2 + (messagesChatRestrictionsDto == null ? 0 : messagesChatRestrictionsDto.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesIncognitoMemberDto> list4 = this.incognitoMembers;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetConversationMembersDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", chatRestrictions=");
        sb.append(this.chatRestrictions);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", incognitoMembers=");
        sb.append(this.incognitoMembers);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesConversationMemberDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        MessagesChatRestrictionsDto messagesChatRestrictionsDto = this.chatRestrictions;
        if (messagesChatRestrictionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatRestrictionsDto.writeToParcel(parcel, i);
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
        List<MessagesIncognitoMemberDto> list4 = this.incognitoMembers;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MessagesIncognitoMemberDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ MessagesGetConversationMembersDto(List list, int i, MessagesChatRestrictionsDto messagesChatRestrictionsDto, List list2, List list3, List list4, List list5, String str, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : messagesChatRestrictionsDto, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : list5, (i2 & 128) != 0 ? null : str);
    }
}
