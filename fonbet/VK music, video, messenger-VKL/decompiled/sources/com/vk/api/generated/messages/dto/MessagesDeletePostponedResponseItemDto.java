package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseMessageErrorDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: MessagesDeletePostponedResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesDeletePostponedResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesDeletePostponedResponseItemDto> CREATOR = new a();

    @pmi0("conversation_message_id")
    private final int conversationMessageId;

    @pmi0("error")
    private final BaseMessageErrorDto error;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("response")
    private final boolean response;

    /* compiled from: MessagesDeletePostponedResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesDeletePostponedResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesDeletePostponedResponseItemDto createFromParcel(Parcel parcel) {
            return new MessagesDeletePostponedResponseItemDto((UserId) parcel.readParcelable(MessagesDeletePostponedResponseItemDto.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BaseMessageErrorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesDeletePostponedResponseItemDto[] newArray(int i) {
            return new MessagesDeletePostponedResponseItemDto[i];
        }
    }

    public MessagesDeletePostponedResponseItemDto(UserId userId, int i, boolean z, BaseMessageErrorDto baseMessageErrorDto) {
        this.peerId = userId;
        this.conversationMessageId = i;
        this.response = z;
        this.error = baseMessageErrorDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesDeletePostponedResponseItemDto)) {
            return false;
        }
        MessagesDeletePostponedResponseItemDto messagesDeletePostponedResponseItemDto = (MessagesDeletePostponedResponseItemDto) obj;
        return epx.f(this.peerId, messagesDeletePostponedResponseItemDto.peerId) && this.conversationMessageId == messagesDeletePostponedResponseItemDto.conversationMessageId && this.response == messagesDeletePostponedResponseItemDto.response && epx.f(this.error, messagesDeletePostponedResponseItemDto.error);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.conversationMessageId, Long.hashCode(this.peerId.b) * 31, 31), 31, this.response);
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        return b + (baseMessageErrorDto == null ? 0 : baseMessageErrorDto.hashCode());
    }

    public final String toString() {
        return "MessagesDeletePostponedResponseItemDto(peerId=" + this.peerId + ", conversationMessageId=" + this.conversationMessageId + ", response=" + this.response + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.peerId, i);
        parcel.writeInt(this.conversationMessageId);
        parcel.writeInt(this.response ? 1 : 0);
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        if (baseMessageErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseMessageErrorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesDeletePostponedResponseItemDto(UserId userId, int i, boolean z, BaseMessageErrorDto baseMessageErrorDto, int i2, zcl zclVar) {
        this(userId, i, z, (i2 & 8) != 0 ? null : baseMessageErrorDto);
    }
}
