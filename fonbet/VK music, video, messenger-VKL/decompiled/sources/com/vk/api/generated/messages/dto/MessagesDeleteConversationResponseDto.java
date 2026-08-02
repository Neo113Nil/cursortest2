package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesDeleteConversationResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesDeleteConversationResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesDeleteConversationResponseDto> CREATOR = new a();

    @pmi0("last_deleted_cmid")
    private final int lastDeletedCmid;

    @pmi0("last_deleted_id")
    private final int lastDeletedId;

    /* compiled from: MessagesDeleteConversationResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesDeleteConversationResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteConversationResponseDto createFromParcel(Parcel parcel) {
            return new MessagesDeleteConversationResponseDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesDeleteConversationResponseDto[] newArray(int i) {
            return new MessagesDeleteConversationResponseDto[i];
        }
    }

    public MessagesDeleteConversationResponseDto(int i, int i2) {
        this.lastDeletedId = i;
        this.lastDeletedCmid = i2;
    }

    public final int d() {
        return this.lastDeletedCmid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesDeleteConversationResponseDto)) {
            return false;
        }
        MessagesDeleteConversationResponseDto messagesDeleteConversationResponseDto = (MessagesDeleteConversationResponseDto) obj;
        return this.lastDeletedId == messagesDeleteConversationResponseDto.lastDeletedId && this.lastDeletedCmid == messagesDeleteConversationResponseDto.lastDeletedCmid;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lastDeletedCmid) + (Integer.hashCode(this.lastDeletedId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesDeleteConversationResponseDto(lastDeletedId=");
        sb.append(this.lastDeletedId);
        sb.append(", lastDeletedCmid=");
        return vu5.b(sb, this.lastDeletedCmid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.lastDeletedId);
        parcel.writeInt(this.lastDeletedCmid);
    }
}
