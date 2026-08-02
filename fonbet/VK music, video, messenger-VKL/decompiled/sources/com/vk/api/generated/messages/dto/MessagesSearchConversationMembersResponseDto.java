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
import xsna.shy;
import xsna.zcl;

/* compiled from: MessagesSearchConversationMembersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSearchConversationMembersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesSearchConversationMembersResponseDto> CREATOR = new a();

    @pmi0("chat_restrictions")
    private final MessagesChatRestrictionsDto chatRestrictions;

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesConversationMemberDto> items;

    @pmi0("items_range")
    private final MessagesItemsRangeDto itemsRange;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesSearchConversationMembersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSearchConversationMembersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSearchConversationMembersResponseDto createFromParcel(Parcel parcel) {
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
            MessagesItemsRangeDto createFromParcel = parcel.readInt() == 0 ? null : MessagesItemsRangeDto.CREATOR.createFromParcel(parcel);
            MessagesChatRestrictionsDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesChatRestrictionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesSearchConversationMembersResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesSearchConversationMembersResponseDto.class, parcel, arrayList5, i4, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(MessagesSearchConversationMembersResponseDto.class, parcel, arrayList6, i, 1);
                }
                arrayList3 = arrayList6;
            }
            return new MessagesSearchConversationMembersResponseDto(arrayList4, readInt2, createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSearchConversationMembersResponseDto[] newArray(int i) {
            return new MessagesSearchConversationMembersResponseDto[i];
        }
    }

    public MessagesSearchConversationMembersResponseDto(List<MessagesConversationMemberDto> list, int i, MessagesItemsRangeDto messagesItemsRangeDto, MessagesChatRestrictionsDto messagesChatRestrictionsDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4) {
        this.items = list;
        this.count = i;
        this.itemsRange = messagesItemsRangeDto;
        this.chatRestrictions = messagesChatRestrictionsDto;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
    }

    public final List<MessagesConversationMemberDto> d() {
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
        if (!(obj instanceof MessagesSearchConversationMembersResponseDto)) {
            return false;
        }
        MessagesSearchConversationMembersResponseDto messagesSearchConversationMembersResponseDto = (MessagesSearchConversationMembersResponseDto) obj;
        return epx.f(this.items, messagesSearchConversationMembersResponseDto.items) && this.count == messagesSearchConversationMembersResponseDto.count && epx.f(this.itemsRange, messagesSearchConversationMembersResponseDto.itemsRange) && epx.f(this.chatRestrictions, messagesSearchConversationMembersResponseDto.chatRestrictions) && epx.f(this.profiles, messagesSearchConversationMembersResponseDto.profiles) && epx.f(this.groups, messagesSearchConversationMembersResponseDto.groups) && epx.f(this.contacts, messagesSearchConversationMembersResponseDto.contacts);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        MessagesItemsRangeDto messagesItemsRangeDto = this.itemsRange;
        int hashCode = (a2 + (messagesItemsRangeDto == null ? 0 : messagesItemsRangeDto.hashCode())) * 31;
        MessagesChatRestrictionsDto messagesChatRestrictionsDto = this.chatRestrictions;
        int hashCode2 = (hashCode + (messagesChatRestrictionsDto == null ? 0 : messagesChatRestrictionsDto.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesSearchConversationMembersResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", itemsRange=");
        sb.append(this.itemsRange);
        sb.append(", chatRestrictions=");
        sb.append(this.chatRestrictions);
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
            ((MessagesConversationMemberDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        MessagesItemsRangeDto messagesItemsRangeDto = this.itemsRange;
        if (messagesItemsRangeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesItemsRangeDto.writeToParcel(parcel, i);
        }
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
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public /* synthetic */ MessagesSearchConversationMembersResponseDto(List list, int i, MessagesItemsRangeDto messagesItemsRangeDto, MessagesChatRestrictionsDto messagesChatRestrictionsDto, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : messagesItemsRangeDto, (i2 & 8) != 0 ? null : messagesChatRestrictionsDto, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : list4);
    }
}
