package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesConversationPeerDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationPeerDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationPeerDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("local_id")
    private final Integer localId;

    @pmi0("type")
    private final MessagesConversationPeerTypeDto type;

    /* compiled from: MessagesConversationPeerDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationPeerDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationPeerDto createFromParcel(Parcel parcel) {
            return new MessagesConversationPeerDto((UserId) parcel.readParcelable(MessagesConversationPeerDto.class.getClassLoader()), MessagesConversationPeerTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationPeerDto[] newArray(int i) {
            return new MessagesConversationPeerDto[i];
        }
    }

    public MessagesConversationPeerDto(UserId userId, MessagesConversationPeerTypeDto messagesConversationPeerTypeDto, Integer num) {
        this.id = userId;
        this.type = messagesConversationPeerTypeDto;
        this.localId = num;
    }

    public final UserId d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.localId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationPeerDto)) {
            return false;
        }
        MessagesConversationPeerDto messagesConversationPeerDto = (MessagesConversationPeerDto) obj;
        return epx.f(this.id, messagesConversationPeerDto.id) && this.type == messagesConversationPeerDto.type && epx.f(this.localId, messagesConversationPeerDto.localId);
    }

    public final MessagesConversationPeerTypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (Long.hashCode(this.id.b) * 31)) * 31;
        Integer num = this.localId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationPeerDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", localId=");
        return uqi.b(sb, this.localId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        this.type.writeToParcel(parcel, i);
        Integer num = this.localId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MessagesConversationPeerDto(UserId userId, MessagesConversationPeerTypeDto messagesConversationPeerTypeDto, Integer num, int i, zcl zclVar) {
        this(userId, messagesConversationPeerTypeDto, (i & 4) != 0 ? null : num);
    }
}
