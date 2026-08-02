package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: MessagesCurrentCallItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCurrentCallItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCurrentCallItemDto> CREATOR = new a();

    @pmi0("call_id")
    private final String callId;

    @pmi0("caller_id")
    private final UserId callerId;

    @pmi0("chat")
    private final MessagesCallChatDto chat;

    @pmi0("current_participant_id_in_call")
    private final String currentParticipantIdInCall;

    @pmi0("from_community")
    private final UserId fromCommunity;

    @pmi0("is_current_user_in_call")
    private final Boolean isCurrentUserInCall;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0("name")
    private final String name;

    @pmi0("participant_ids")
    private final List<String> participantIds;

    @pmi0("pmi_link")
    private final String pmiLink;

    @pmi0("schedule")
    private final MessagesCallScheduleDto schedule;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    @pmi0("users_count")
    private final int usersCount;

    @pmi0("vk_join_link")
    private final String vkJoinLink;

    /* compiled from: MessagesCurrentCallItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCurrentCallItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCurrentCallItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MessagesCurrentCallItemDto.class, parcel, arrayList, i, 1);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            boolean z = false;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(MessagesCurrentCallItemDto.class.getClassLoader());
            String readString5 = parcel.readString();
            Boolean bool = null;
            MessagesCallChatDto createFromParcel = parcel.readInt() == 0 ? null : MessagesCallChatDto.CREATOR.createFromParcel(parcel);
            MessagesCallScheduleDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesCallScheduleDto.CREATOR.createFromParcel(parcel);
            UserId userId2 = (UserId) parcel.readParcelable(MessagesCurrentCallItemDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return new MessagesCurrentCallItemDto(readString, arrayList, createStringArrayList, readInt2, readString2, readString3, readString4, userId, readString5, createFromParcel, createFromParcel2, userId2, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCurrentCallItemDto[] newArray(int i) {
            return new MessagesCurrentCallItemDto[i];
        }
    }

    public MessagesCurrentCallItemDto(String str, List<UserId> list, List<String> list2, int i, String str2, String str3, String str4, UserId userId, String str5, MessagesCallChatDto messagesCallChatDto, MessagesCallScheduleDto messagesCallScheduleDto, UserId userId2, Boolean bool, String str6) {
        this.callId = str;
        this.userIds = list;
        this.participantIds = list2;
        this.usersCount = i;
        this.joinLink = str2;
        this.pmiLink = str3;
        this.vkJoinLink = str4;
        this.fromCommunity = userId;
        this.name = str5;
        this.chat = messagesCallChatDto;
        this.schedule = messagesCallScheduleDto;
        this.callerId = userId2;
        this.isCurrentUserInCall = bool;
        this.currentParticipantIdInCall = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCurrentCallItemDto)) {
            return false;
        }
        MessagesCurrentCallItemDto messagesCurrentCallItemDto = (MessagesCurrentCallItemDto) obj;
        return epx.f(this.callId, messagesCurrentCallItemDto.callId) && epx.f(this.userIds, messagesCurrentCallItemDto.userIds) && epx.f(this.participantIds, messagesCurrentCallItemDto.participantIds) && this.usersCount == messagesCurrentCallItemDto.usersCount && epx.f(this.joinLink, messagesCurrentCallItemDto.joinLink) && epx.f(this.pmiLink, messagesCurrentCallItemDto.pmiLink) && epx.f(this.vkJoinLink, messagesCurrentCallItemDto.vkJoinLink) && epx.f(this.fromCommunity, messagesCurrentCallItemDto.fromCommunity) && epx.f(this.name, messagesCurrentCallItemDto.name) && epx.f(this.chat, messagesCurrentCallItemDto.chat) && epx.f(this.schedule, messagesCurrentCallItemDto.schedule) && epx.f(this.callerId, messagesCurrentCallItemDto.callerId) && epx.f(this.isCurrentUserInCall, messagesCurrentCallItemDto.isCurrentUserInCall) && epx.f(this.currentParticipantIdInCall, messagesCurrentCallItemDto.currentParticipantIdInCall);
    }

    public final int hashCode() {
        int a2 = shy.a(this.usersCount, fw3.a(fw3.a(this.callId.hashCode() * 31, 31, this.userIds), 31, this.participantIds), 31);
        String str = this.joinLink;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pmiLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vkJoinLink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.fromCommunity;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str4 = this.name;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MessagesCallChatDto messagesCallChatDto = this.chat;
        int hashCode6 = (hashCode5 + (messagesCallChatDto == null ? 0 : messagesCallChatDto.hashCode())) * 31;
        MessagesCallScheduleDto messagesCallScheduleDto = this.schedule;
        int hashCode7 = (hashCode6 + (messagesCallScheduleDto == null ? 0 : messagesCallScheduleDto.hashCode())) * 31;
        UserId userId2 = this.callerId;
        int hashCode8 = (hashCode7 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Boolean bool = this.isCurrentUserInCall;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.currentParticipantIdInCall;
        return hashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCurrentCallItemDto(callId=");
        sb.append(this.callId);
        sb.append(", userIds=");
        sb.append(this.userIds);
        sb.append(", participantIds=");
        sb.append(this.participantIds);
        sb.append(", usersCount=");
        sb.append(this.usersCount);
        sb.append(", joinLink=");
        sb.append(this.joinLink);
        sb.append(", pmiLink=");
        sb.append(this.pmiLink);
        sb.append(", vkJoinLink=");
        sb.append(this.vkJoinLink);
        sb.append(", fromCommunity=");
        sb.append(this.fromCommunity);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", chat=");
        sb.append(this.chat);
        sb.append(", schedule=");
        sb.append(this.schedule);
        sb.append(", callerId=");
        sb.append(this.callerId);
        sb.append(", isCurrentUserInCall=");
        sb.append(this.isCurrentUserInCall);
        sb.append(", currentParticipantIdInCall=");
        return ho8.a(sb, this.currentParticipantIdInCall, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callId);
        Iterator a2 = ao.a(parcel, this.userIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeStringList(this.participantIds);
        parcel.writeInt(this.usersCount);
        parcel.writeString(this.joinLink);
        parcel.writeString(this.pmiLink);
        parcel.writeString(this.vkJoinLink);
        parcel.writeParcelable(this.fromCommunity, i);
        parcel.writeString(this.name);
        MessagesCallChatDto messagesCallChatDto = this.chat;
        if (messagesCallChatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallChatDto.writeToParcel(parcel, i);
        }
        MessagesCallScheduleDto messagesCallScheduleDto = this.schedule;
        if (messagesCallScheduleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallScheduleDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.callerId, i);
        Boolean bool = this.isCurrentUserInCall;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.currentParticipantIdInCall);
    }

    public /* synthetic */ MessagesCurrentCallItemDto(String str, List list, List list2, int i, String str2, String str3, String str4, UserId userId, String str5, MessagesCallChatDto messagesCallChatDto, MessagesCallScheduleDto messagesCallScheduleDto, UserId userId2, Boolean bool, String str6, int i2, zcl zclVar) {
        this(str, list, list2, i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : userId, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : messagesCallChatDto, (i2 & 1024) != 0 ? null : messagesCallScheduleDto, (i2 & 2048) != 0 ? null : userId2, (i2 & 4096) != 0 ? null : bool, (i2 & 8192) != 0 ? null : str6);
    }
}
