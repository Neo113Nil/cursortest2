package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesReactionResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesReactionResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesReactionResponseItemDto> CREATOR = new a();

    @pmi0("reaction_id")
    private final int reactionId;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: MessagesReactionResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesReactionResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesReactionResponseItemDto createFromParcel(Parcel parcel) {
            return new MessagesReactionResponseItemDto((UserId) parcel.readParcelable(MessagesReactionResponseItemDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesReactionResponseItemDto[] newArray(int i) {
            return new MessagesReactionResponseItemDto[i];
        }
    }

    public MessagesReactionResponseItemDto(UserId userId, int i) {
        this.userId = userId;
        this.reactionId = i;
    }

    public final int d() {
        return this.reactionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionResponseItemDto)) {
            return false;
        }
        MessagesReactionResponseItemDto messagesReactionResponseItemDto = (MessagesReactionResponseItemDto) obj;
        return epx.f(this.userId, messagesReactionResponseItemDto.userId) && this.reactionId == messagesReactionResponseItemDto.reactionId;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.reactionId) + (Long.hashCode(this.userId.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesReactionResponseItemDto(userId=");
        sb.append(this.userId);
        sb.append(", reactionId=");
        return vu5.b(sb, this.reactionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeInt(this.reactionId);
    }
}
