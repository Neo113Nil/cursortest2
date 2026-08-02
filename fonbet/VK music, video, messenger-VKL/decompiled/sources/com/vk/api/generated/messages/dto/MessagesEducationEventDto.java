package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesEducationEventDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEducationEventDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEducationEventDto> CREATOR = new a();

    @pmi0("subcode")
    private final Integer subcode;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: MessagesEducationEventDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEducationEventDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEducationEventDto createFromParcel(Parcel parcel) {
            return new MessagesEducationEventDto((UserId) parcel.readParcelable(MessagesEducationEventDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEducationEventDto[] newArray(int i) {
            return new MessagesEducationEventDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesEducationEventDto() {
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
        if (!(obj instanceof MessagesEducationEventDto)) {
            return false;
        }
        MessagesEducationEventDto messagesEducationEventDto = (MessagesEducationEventDto) obj;
        return epx.f(this.userId, messagesEducationEventDto.userId) && epx.f(this.subcode, messagesEducationEventDto.subcode);
    }

    public final int hashCode() {
        UserId userId = this.userId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.subcode;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEducationEventDto(userId=");
        sb.append(this.userId);
        sb.append(", subcode=");
        return uqi.b(sb, this.subcode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        Integer num = this.subcode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MessagesEducationEventDto(UserId userId, Integer num) {
        this.userId = userId;
        this.subcode = num;
    }

    public /* synthetic */ MessagesEducationEventDto(UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num);
    }
}
