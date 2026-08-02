package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseMessageErrorDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesDeleteFullResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesDeleteFullResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesDeleteFullResponseItemDto> CREATOR = new a();

    @pmi0("conversation_message_id")
    private final Integer conversationMessageId;

    @pmi0("error")
    private final BaseMessageErrorDto error;

    @pmi0("message_id")
    private final Integer messageId;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("response")
    private final BaseBoolIntDto response;

    /* compiled from: MessagesDeleteFullResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesDeleteFullResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteFullResponseItemDto createFromParcel(Parcel parcel) {
            return new MessagesDeleteFullResponseItemDto((UserId) parcel.readParcelable(MessagesDeleteFullResponseItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BaseBoolIntDto) parcel.readParcelable(MessagesDeleteFullResponseItemDto.class.getClassLoader()), parcel.readInt() != 0 ? BaseMessageErrorDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteFullResponseItemDto[] newArray(int i) {
            return new MessagesDeleteFullResponseItemDto[i];
        }
    }

    public MessagesDeleteFullResponseItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer d() {
        return this.conversationMessageId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseMessageErrorDto e() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesDeleteFullResponseItemDto)) {
            return false;
        }
        MessagesDeleteFullResponseItemDto messagesDeleteFullResponseItemDto = (MessagesDeleteFullResponseItemDto) obj;
        return epx.f(this.peerId, messagesDeleteFullResponseItemDto.peerId) && epx.f(this.messageId, messagesDeleteFullResponseItemDto.messageId) && epx.f(this.conversationMessageId, messagesDeleteFullResponseItemDto.conversationMessageId) && this.response == messagesDeleteFullResponseItemDto.response && epx.f(this.error, messagesDeleteFullResponseItemDto.error);
    }

    public final BaseBoolIntDto f() {
        return this.response;
    }

    public final int hashCode() {
        UserId userId = this.peerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.messageId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.conversationMessageId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.response;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        return hashCode4 + (baseMessageErrorDto != null ? baseMessageErrorDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesDeleteFullResponseItemDto(peerId=" + this.peerId + ", messageId=" + this.messageId + ", conversationMessageId=" + this.conversationMessageId + ", response=" + this.response + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.peerId, i);
        Integer num = this.messageId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.conversationMessageId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.response, i);
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        if (baseMessageErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseMessageErrorDto.writeToParcel(parcel, i);
        }
    }

    public MessagesDeleteFullResponseItemDto(UserId userId, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto, BaseMessageErrorDto baseMessageErrorDto) {
        this.peerId = userId;
        this.messageId = num;
        this.conversationMessageId = num2;
        this.response = baseBoolIntDto;
        this.error = baseMessageErrorDto;
    }

    public /* synthetic */ MessagesDeleteFullResponseItemDto(UserId userId, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto, BaseMessageErrorDto baseMessageErrorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : baseMessageErrorDto);
    }
}
