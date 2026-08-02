package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesJoinChatByInviteLinkResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesJoinChatByInviteLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesJoinChatByInviteLinkResponseDto> CREATOR = new a();

    @pmi0("chat_id")
    private final Integer chatId;

    /* compiled from: MessagesJoinChatByInviteLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesJoinChatByInviteLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesJoinChatByInviteLinkResponseDto createFromParcel(Parcel parcel) {
            return new MessagesJoinChatByInviteLinkResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesJoinChatByInviteLinkResponseDto[] newArray(int i) {
            return new MessagesJoinChatByInviteLinkResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesJoinChatByInviteLinkResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.chatId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesJoinChatByInviteLinkResponseDto) && epx.f(this.chatId, ((MessagesJoinChatByInviteLinkResponseDto) obj).chatId);
    }

    public final int hashCode() {
        Integer num = this.chatId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("MessagesJoinChatByInviteLinkResponseDto(chatId="), this.chatId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.chatId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MessagesJoinChatByInviteLinkResponseDto(Integer num) {
        this.chatId = num;
    }

    public /* synthetic */ MessagesJoinChatByInviteLinkResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
