package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetItemsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetItemsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetItemsResponseDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final MessagesChannelItemsWithErrorDto channels;

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("conversations")
    private final MessagesConversationItemsWithErrorDto conversations;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetItemsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetItemsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetItemsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3 = null;
            MessagesConversationItemsWithErrorDto createFromParcel = parcel.readInt() == 0 ? null : MessagesConversationItemsWithErrorDto.CREATOR.createFromParcel(parcel);
            MessagesChannelItemsWithErrorDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesChannelItemsWithErrorDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MessagesGetItemsResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetItemsResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(MessagesGetItemsResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new MessagesGetItemsResponseDto(createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetItemsResponseDto[] newArray(int i) {
            return new MessagesGetItemsResponseDto[i];
        }
    }

    public MessagesGetItemsResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetItemsResponseDto)) {
            return false;
        }
        MessagesGetItemsResponseDto messagesGetItemsResponseDto = (MessagesGetItemsResponseDto) obj;
        return epx.f(this.conversations, messagesGetItemsResponseDto.conversations) && epx.f(this.channels, messagesGetItemsResponseDto.channels) && epx.f(this.groups, messagesGetItemsResponseDto.groups) && epx.f(this.profiles, messagesGetItemsResponseDto.profiles) && epx.f(this.contacts, messagesGetItemsResponseDto.contacts);
    }

    public final int hashCode() {
        MessagesConversationItemsWithErrorDto messagesConversationItemsWithErrorDto = this.conversations;
        int hashCode = (messagesConversationItemsWithErrorDto == null ? 0 : messagesConversationItemsWithErrorDto.hashCode()) * 31;
        MessagesChannelItemsWithErrorDto messagesChannelItemsWithErrorDto = this.channels;
        int hashCode2 = (hashCode + (messagesChannelItemsWithErrorDto == null ? 0 : messagesChannelItemsWithErrorDto.hashCode())) * 31;
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetItemsResponseDto(conversations=");
        sb.append(this.conversations);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.contacts);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesConversationItemsWithErrorDto messagesConversationItemsWithErrorDto = this.conversations;
        if (messagesConversationItemsWithErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationItemsWithErrorDto.writeToParcel(parcel, i);
        }
        MessagesChannelItemsWithErrorDto messagesChannelItemsWithErrorDto = this.channels;
        if (messagesChannelItemsWithErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChannelItemsWithErrorDto.writeToParcel(parcel, i);
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

    public MessagesGetItemsResponseDto(MessagesConversationItemsWithErrorDto messagesConversationItemsWithErrorDto, MessagesChannelItemsWithErrorDto messagesChannelItemsWithErrorDto, List<GroupsGroupFullDto> list, List<UsersUserFullDto> list2, List<MessagesContactDto> list3) {
        this.conversations = messagesConversationItemsWithErrorDto;
        this.channels = messagesChannelItemsWithErrorDto;
        this.groups = list;
        this.profiles = list2;
        this.contacts = list3;
    }

    public /* synthetic */ MessagesGetItemsResponseDto(MessagesConversationItemsWithErrorDto messagesConversationItemsWithErrorDto, MessagesChannelItemsWithErrorDto messagesChannelItemsWithErrorDto, List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesConversationItemsWithErrorDto, (i & 2) != 0 ? null : messagesChannelItemsWithErrorDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3);
    }
}
