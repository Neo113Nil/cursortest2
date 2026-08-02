package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MessagesConversationBusinessNotifyDataDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBusinessNotifyDataDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBusinessNotifyDataDto> CREATOR = new a();

    @pmi0("last_cmid")
    private final int lastCmid;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("service_url")
    private final String serviceUrl;

    @pmi0("unread_count")
    private final Integer unreadCount;

    /* compiled from: MessagesConversationBusinessNotifyDataDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBusinessNotifyDataDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBusinessNotifyDataDto createFromParcel(Parcel parcel) {
            return new MessagesConversationBusinessNotifyDataDto((UserId) parcel.readParcelable(MessagesConversationBusinessNotifyDataDto.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBusinessNotifyDataDto[] newArray(int i) {
            return new MessagesConversationBusinessNotifyDataDto[i];
        }
    }

    public MessagesConversationBusinessNotifyDataDto(UserId userId, int i, Integer num, String str) {
        this.peerId = userId;
        this.lastCmid = i;
        this.unreadCount = num;
        this.serviceUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationBusinessNotifyDataDto)) {
            return false;
        }
        MessagesConversationBusinessNotifyDataDto messagesConversationBusinessNotifyDataDto = (MessagesConversationBusinessNotifyDataDto) obj;
        return epx.f(this.peerId, messagesConversationBusinessNotifyDataDto.peerId) && this.lastCmid == messagesConversationBusinessNotifyDataDto.lastCmid && epx.f(this.unreadCount, messagesConversationBusinessNotifyDataDto.unreadCount) && epx.f(this.serviceUrl, messagesConversationBusinessNotifyDataDto.serviceUrl);
    }

    public final int hashCode() {
        int a2 = shy.a(this.lastCmid, Long.hashCode(this.peerId.b) * 31, 31);
        Integer num = this.unreadCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.serviceUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationBusinessNotifyDataDto(peerId=");
        sb.append(this.peerId);
        sb.append(", lastCmid=");
        sb.append(this.lastCmid);
        sb.append(", unreadCount=");
        sb.append(this.unreadCount);
        sb.append(", serviceUrl=");
        return ho8.a(sb, this.serviceUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.peerId, i);
        parcel.writeInt(this.lastCmid);
        Integer num = this.unreadCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.serviceUrl);
    }

    public /* synthetic */ MessagesConversationBusinessNotifyDataDto(UserId userId, int i, Integer num, String str, int i2, zcl zclVar) {
        this(userId, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str);
    }
}
