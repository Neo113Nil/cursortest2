package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesReactionNotificationsSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesReactionNotificationsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesReactionNotificationsSettingsDto> CREATOR = new a();

    @pmi0("max_message_age_sec")
    private final int maxMessageAgeSec;

    @pmi0("max_reactions")
    private final int maxReactions;

    /* compiled from: MessagesReactionNotificationsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesReactionNotificationsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesReactionNotificationsSettingsDto createFromParcel(Parcel parcel) {
            return new MessagesReactionNotificationsSettingsDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesReactionNotificationsSettingsDto[] newArray(int i) {
            return new MessagesReactionNotificationsSettingsDto[i];
        }
    }

    public MessagesReactionNotificationsSettingsDto(int i, int i2) {
        this.maxMessageAgeSec = i;
        this.maxReactions = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionNotificationsSettingsDto)) {
            return false;
        }
        MessagesReactionNotificationsSettingsDto messagesReactionNotificationsSettingsDto = (MessagesReactionNotificationsSettingsDto) obj;
        return this.maxMessageAgeSec == messagesReactionNotificationsSettingsDto.maxMessageAgeSec && this.maxReactions == messagesReactionNotificationsSettingsDto.maxReactions;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxReactions) + (Integer.hashCode(this.maxMessageAgeSec) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesReactionNotificationsSettingsDto(maxMessageAgeSec=");
        sb.append(this.maxMessageAgeSec);
        sb.append(", maxReactions=");
        return vu5.b(sb, this.maxReactions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxMessageAgeSec);
        parcel.writeInt(this.maxReactions);
    }
}
