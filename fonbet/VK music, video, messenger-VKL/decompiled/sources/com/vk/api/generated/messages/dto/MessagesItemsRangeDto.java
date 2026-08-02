package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesItemsRangeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesItemsRangeDto implements Parcelable {
    public static final Parcelable.Creator<MessagesItemsRangeDto> CREATOR = new a();

    @pmi0("first")
    private final MessagesCursorDto first;

    @pmi0("last")
    private final MessagesCursorDto last;

    /* compiled from: MessagesItemsRangeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesItemsRangeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesItemsRangeDto createFromParcel(Parcel parcel) {
            return new MessagesItemsRangeDto(parcel.readInt() == 0 ? null : MessagesCursorDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessagesCursorDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesItemsRangeDto[] newArray(int i) {
            return new MessagesItemsRangeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesItemsRangeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesItemsRangeDto)) {
            return false;
        }
        MessagesItemsRangeDto messagesItemsRangeDto = (MessagesItemsRangeDto) obj;
        return epx.f(this.first, messagesItemsRangeDto.first) && epx.f(this.last, messagesItemsRangeDto.last);
    }

    public final int hashCode() {
        MessagesCursorDto messagesCursorDto = this.first;
        int hashCode = (messagesCursorDto == null ? 0 : messagesCursorDto.hashCode()) * 31;
        MessagesCursorDto messagesCursorDto2 = this.last;
        return hashCode + (messagesCursorDto2 != null ? messagesCursorDto2.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesItemsRangeDto(first=" + this.first + ", last=" + this.last + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesCursorDto messagesCursorDto = this.first;
        if (messagesCursorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCursorDto.writeToParcel(parcel, i);
        }
        MessagesCursorDto messagesCursorDto2 = this.last;
        if (messagesCursorDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCursorDto2.writeToParcel(parcel, i);
        }
    }

    public MessagesItemsRangeDto(MessagesCursorDto messagesCursorDto, MessagesCursorDto messagesCursorDto2) {
        this.first = messagesCursorDto;
        this.last = messagesCursorDto2;
    }

    public /* synthetic */ MessagesItemsRangeDto(MessagesCursorDto messagesCursorDto, MessagesCursorDto messagesCursorDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesCursorDto, (i & 2) != 0 ? null : messagesCursorDto2);
    }
}
