package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesConversationSortIdDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationSortIdDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationSortIdDto> CREATOR = new a();

    @pmi0("major_id")
    private final int majorId;

    @pmi0("minor_id")
    private final int minorId;

    /* compiled from: MessagesConversationSortIdDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationSortIdDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationSortIdDto createFromParcel(Parcel parcel) {
            return new MessagesConversationSortIdDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationSortIdDto[] newArray(int i) {
            return new MessagesConversationSortIdDto[i];
        }
    }

    public MessagesConversationSortIdDto(int i, int i2) {
        this.majorId = i;
        this.minorId = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationSortIdDto)) {
            return false;
        }
        MessagesConversationSortIdDto messagesConversationSortIdDto = (MessagesConversationSortIdDto) obj;
        return this.majorId == messagesConversationSortIdDto.majorId && this.minorId == messagesConversationSortIdDto.minorId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minorId) + (Integer.hashCode(this.majorId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationSortIdDto(majorId=");
        sb.append(this.majorId);
        sb.append(", minorId=");
        return vu5.b(sb, this.minorId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.majorId);
        parcel.writeInt(this.minorId);
    }
}
