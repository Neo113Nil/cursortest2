package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesInboundCallDto.kt */
/* loaded from: classes15.dex */
public final class MessagesInboundCallDto implements Parcelable {
    public static final Parcelable.Creator<MessagesInboundCallDto> CREATOR = new a();

    @pmi0("call_id")
    private final String callId;

    @pmi0("caller_info")
    private final MessagesInboundCallCallerInfoDto callerInfo;

    @pmi0("chat_info")
    private final MessagesInboundCallChatInfoDto chatInfo;

    @pmi0("conversation_params")
    private final String conversationParams;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("p2p_allowed")
    private final boolean p2pAllowed;

    @pmi0("payload")
    private final String payload;

    /* compiled from: MessagesInboundCallDto.kt */
    public static final class a implements Parcelable.Creator<MessagesInboundCallDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesInboundCallDto createFromParcel(Parcel parcel) {
            return new MessagesInboundCallDto((UserId) parcel.readParcelable(MessagesInboundCallDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, MessagesInboundCallCallerInfoDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : MessagesInboundCallChatInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesInboundCallDto[] newArray(int i) {
            return new MessagesInboundCallDto[i];
        }
    }

    public MessagesInboundCallDto(UserId userId, String str, String str2, boolean z, MessagesInboundCallCallerInfoDto messagesInboundCallCallerInfoDto, String str3, MessagesInboundCallChatInfoDto messagesInboundCallChatInfoDto) {
        this.fromId = userId;
        this.callId = str;
        this.conversationParams = str2;
        this.p2pAllowed = z;
        this.callerInfo = messagesInboundCallCallerInfoDto;
        this.payload = str3;
        this.chatInfo = messagesInboundCallChatInfoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesInboundCallDto)) {
            return false;
        }
        MessagesInboundCallDto messagesInboundCallDto = (MessagesInboundCallDto) obj;
        return epx.f(this.fromId, messagesInboundCallDto.fromId) && epx.f(this.callId, messagesInboundCallDto.callId) && epx.f(this.conversationParams, messagesInboundCallDto.conversationParams) && this.p2pAllowed == messagesInboundCallDto.p2pAllowed && epx.f(this.callerInfo, messagesInboundCallDto.callerInfo) && epx.f(this.payload, messagesInboundCallDto.payload) && epx.f(this.chatInfo, messagesInboundCallDto.chatInfo);
    }

    public final int hashCode() {
        int hashCode = (this.callerInfo.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.fromId.b) * 31, 31, this.callId), 31, this.conversationParams), 31, this.p2pAllowed)) * 31;
        String str = this.payload;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MessagesInboundCallChatInfoDto messagesInboundCallChatInfoDto = this.chatInfo;
        return hashCode2 + (messagesInboundCallChatInfoDto != null ? messagesInboundCallChatInfoDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesInboundCallDto(fromId=" + this.fromId + ", callId=" + this.callId + ", conversationParams=" + this.conversationParams + ", p2pAllowed=" + this.p2pAllowed + ", callerInfo=" + this.callerInfo + ", payload=" + this.payload + ", chatInfo=" + this.chatInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.fromId, i);
        parcel.writeString(this.callId);
        parcel.writeString(this.conversationParams);
        parcel.writeInt(this.p2pAllowed ? 1 : 0);
        this.callerInfo.writeToParcel(parcel, i);
        parcel.writeString(this.payload);
        MessagesInboundCallChatInfoDto messagesInboundCallChatInfoDto = this.chatInfo;
        if (messagesInboundCallChatInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesInboundCallChatInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesInboundCallDto(UserId userId, String str, String str2, boolean z, MessagesInboundCallCallerInfoDto messagesInboundCallCallerInfoDto, String str3, MessagesInboundCallChatInfoDto messagesInboundCallChatInfoDto, int i, zcl zclVar) {
        this(userId, str, str2, z, messagesInboundCallCallerInfoDto, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : messagesInboundCallChatInfoDto);
    }
}
