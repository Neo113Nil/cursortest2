package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseMessageErrorDto;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesSendPostponedResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSendPostponedResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesSendPostponedResponseItemDto> CREATOR = new a();

    @pmi0("error")
    private final BaseMessageErrorDto error;

    @pmi0("new_cmid")
    private final Long newCmid;

    @pmi0("postponed_cmid")
    private final long postponedCmid;

    /* compiled from: MessagesSendPostponedResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSendPostponedResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSendPostponedResponseItemDto createFromParcel(Parcel parcel) {
            return new MessagesSendPostponedResponseItemDto(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? BaseMessageErrorDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSendPostponedResponseItemDto[] newArray(int i) {
            return new MessagesSendPostponedResponseItemDto[i];
        }
    }

    public MessagesSendPostponedResponseItemDto(long j, Long l, BaseMessageErrorDto baseMessageErrorDto) {
        this.postponedCmid = j;
        this.newCmid = l;
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
        if (!(obj instanceof MessagesSendPostponedResponseItemDto)) {
            return false;
        }
        MessagesSendPostponedResponseItemDto messagesSendPostponedResponseItemDto = (MessagesSendPostponedResponseItemDto) obj;
        return this.postponedCmid == messagesSendPostponedResponseItemDto.postponedCmid && epx.f(this.newCmid, messagesSendPostponedResponseItemDto.newCmid) && epx.f(this.error, messagesSendPostponedResponseItemDto.error);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.postponedCmid) * 31;
        Long l = this.newCmid;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        return hashCode2 + (baseMessageErrorDto != null ? baseMessageErrorDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesSendPostponedResponseItemDto(postponedCmid=" + this.postponedCmid + ", newCmid=" + this.newCmid + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.postponedCmid);
        Long l = this.newCmid;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        BaseMessageErrorDto baseMessageErrorDto = this.error;
        if (baseMessageErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseMessageErrorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesSendPostponedResponseItemDto(long j, Long l, BaseMessageErrorDto baseMessageErrorDto, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : baseMessageErrorDto);
    }
}
