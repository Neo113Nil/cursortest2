package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesConversationCanWriteDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationCanWriteDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationCanWriteDto> CREATOR = new a();

    @pmi0("allowed")
    private final boolean allowed;

    @pmi0("reason")
    private final Integer reason;

    @pmi0("until")
    private final Integer until;

    /* compiled from: MessagesConversationCanWriteDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationCanWriteDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCanWriteDto createFromParcel(Parcel parcel) {
            return new MessagesConversationCanWriteDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationCanWriteDto[] newArray(int i) {
            return new MessagesConversationCanWriteDto[i];
        }
    }

    public MessagesConversationCanWriteDto(boolean z, Integer num, Integer num2) {
        this.allowed = z;
        this.reason = num;
        this.until = num2;
    }

    public final boolean d() {
        return this.allowed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationCanWriteDto)) {
            return false;
        }
        MessagesConversationCanWriteDto messagesConversationCanWriteDto = (MessagesConversationCanWriteDto) obj;
        return this.allowed == messagesConversationCanWriteDto.allowed && epx.f(this.reason, messagesConversationCanWriteDto.reason) && epx.f(this.until, messagesConversationCanWriteDto.until);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.allowed) * 31;
        Integer num = this.reason;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.until;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationCanWriteDto(allowed=");
        sb.append(this.allowed);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", until=");
        return uqi.b(sb, this.until, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.allowed ? 1 : 0);
        Integer num = this.reason;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.until;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ MessagesConversationCanWriteDto(boolean z, Integer num, Integer num2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
