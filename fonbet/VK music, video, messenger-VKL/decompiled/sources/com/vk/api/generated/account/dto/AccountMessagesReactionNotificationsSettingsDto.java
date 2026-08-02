package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AccountMessagesReactionNotificationsSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountMessagesReactionNotificationsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountMessagesReactionNotificationsSettingsDto> CREATOR = new a();

    @pmi0("max_message_age_sec")
    private final int maxMessageAgeSec;

    @pmi0("max_reactions")
    private final int maxReactions;

    /* compiled from: AccountMessagesReactionNotificationsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountMessagesReactionNotificationsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountMessagesReactionNotificationsSettingsDto createFromParcel(Parcel parcel) {
            return new AccountMessagesReactionNotificationsSettingsDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountMessagesReactionNotificationsSettingsDto[] newArray(int i) {
            return new AccountMessagesReactionNotificationsSettingsDto[i];
        }
    }

    public AccountMessagesReactionNotificationsSettingsDto(int i, int i2) {
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
        if (!(obj instanceof AccountMessagesReactionNotificationsSettingsDto)) {
            return false;
        }
        AccountMessagesReactionNotificationsSettingsDto accountMessagesReactionNotificationsSettingsDto = (AccountMessagesReactionNotificationsSettingsDto) obj;
        return this.maxMessageAgeSec == accountMessagesReactionNotificationsSettingsDto.maxMessageAgeSec && this.maxReactions == accountMessagesReactionNotificationsSettingsDto.maxReactions;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxReactions) + (Integer.hashCode(this.maxMessageAgeSec) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountMessagesReactionNotificationsSettingsDto(maxMessageAgeSec=");
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
