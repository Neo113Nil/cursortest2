package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesMessageRequestDataDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageRequestDataDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageRequestDataDto> CREATOR = new a();

    @pmi0("inviter_id")
    private final UserId inviterId;

    @pmi0("request_date")
    private final Integer requestDate;

    @pmi0("status")
    private final String status;

    /* compiled from: MessagesMessageRequestDataDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageRequestDataDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageRequestDataDto createFromParcel(Parcel parcel) {
            return new MessagesMessageRequestDataDto(parcel.readString(), (UserId) parcel.readParcelable(MessagesMessageRequestDataDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageRequestDataDto[] newArray(int i) {
            return new MessagesMessageRequestDataDto[i];
        }
    }

    public MessagesMessageRequestDataDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageRequestDataDto)) {
            return false;
        }
        MessagesMessageRequestDataDto messagesMessageRequestDataDto = (MessagesMessageRequestDataDto) obj;
        return epx.f(this.status, messagesMessageRequestDataDto.status) && epx.f(this.inviterId, messagesMessageRequestDataDto.inviterId) && epx.f(this.requestDate, messagesMessageRequestDataDto.requestDate);
    }

    public final int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.inviterId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.requestDate;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageRequestDataDto(status=");
        sb.append(this.status);
        sb.append(", inviterId=");
        sb.append(this.inviterId);
        sb.append(", requestDate=");
        return uqi.b(sb, this.requestDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
        parcel.writeParcelable(this.inviterId, i);
        Integer num = this.requestDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MessagesMessageRequestDataDto(String str, UserId userId, Integer num) {
        this.status = str;
        this.inviterId = userId;
        this.requestDate = num;
    }

    public /* synthetic */ MessagesMessageRequestDataDto(String str, UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num);
    }
}
