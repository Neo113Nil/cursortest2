package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesSendResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSendResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesSendResponseDto> CREATOR = new a();

    @pmi0("cmid")
    private final int cmid;

    @pmi0("message_id")
    private final Integer messageId;

    /* compiled from: MessagesSendResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSendResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSendResponseDto createFromParcel(Parcel parcel) {
            return new MessagesSendResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSendResponseDto[] newArray(int i) {
            return new MessagesSendResponseDto[i];
        }
    }

    public MessagesSendResponseDto(int i, Integer num) {
        this.cmid = i;
        this.messageId = num;
    }

    public final int d() {
        return this.cmid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSendResponseDto)) {
            return false;
        }
        MessagesSendResponseDto messagesSendResponseDto = (MessagesSendResponseDto) obj;
        return this.cmid == messagesSendResponseDto.cmid && epx.f(this.messageId, messagesSendResponseDto.messageId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.cmid) * 31;
        Integer num = this.messageId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesSendResponseDto(cmid=");
        sb.append(this.cmid);
        sb.append(", messageId=");
        return uqi.b(sb, this.messageId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cmid);
        Integer num = this.messageId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MessagesSendResponseDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
