package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationDiffDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationDiffDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationDiffDto> CREATOR = new a();

    @pmi0("in_read_cmid")
    private final Integer inReadCmid;

    @pmi0("is_archived")
    private final Boolean isArchived;

    @pmi0("new_msgs")
    private final MessagesNewMessagesDto newMsgs;

    @pmi0("out_read_cmid")
    private final Integer outReadCmid;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("sort_major_id")
    private final Integer sortMajorId;

    @pmi0("sort_minor_id")
    private final Integer sortMinorId;

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("unread_count")
    private final Integer unreadCount;

    @pmi0("version")
    private final Long version;

    /* compiled from: MessagesConversationDiffDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationDiffDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationDiffDto createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(MessagesConversationDiffDto.class.getClassLoader());
            Boolean bool = null;
            MessagesNewMessagesDto createFromParcel = parcel.readInt() == 0 ? null : MessagesNewMessagesDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationDiffDto(userId, createFromParcel, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationDiffDto[] newArray(int i) {
            return new MessagesConversationDiffDto[i];
        }
    }

    public MessagesConversationDiffDto(UserId userId, MessagesNewMessagesDto messagesNewMessagesDto, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Boolean bool) {
        this.peerId = userId;
        this.newMsgs = messagesNewMessagesDto;
        this.inReadCmid = num;
        this.outReadCmid = num2;
        this.unreadCount = num3;
        this.sortMajorId = num4;
        this.sortMinorId = num5;
        this.timestamp = num6;
        this.version = l;
        this.isArchived = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationDiffDto)) {
            return false;
        }
        MessagesConversationDiffDto messagesConversationDiffDto = (MessagesConversationDiffDto) obj;
        return epx.f(this.peerId, messagesConversationDiffDto.peerId) && epx.f(this.newMsgs, messagesConversationDiffDto.newMsgs) && epx.f(this.inReadCmid, messagesConversationDiffDto.inReadCmid) && epx.f(this.outReadCmid, messagesConversationDiffDto.outReadCmid) && epx.f(this.unreadCount, messagesConversationDiffDto.unreadCount) && epx.f(this.sortMajorId, messagesConversationDiffDto.sortMajorId) && epx.f(this.sortMinorId, messagesConversationDiffDto.sortMinorId) && epx.f(this.timestamp, messagesConversationDiffDto.timestamp) && epx.f(this.version, messagesConversationDiffDto.version) && epx.f(this.isArchived, messagesConversationDiffDto.isArchived);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.peerId.b) * 31;
        MessagesNewMessagesDto messagesNewMessagesDto = this.newMsgs;
        int hashCode2 = (hashCode + (messagesNewMessagesDto == null ? 0 : messagesNewMessagesDto.hashCode())) * 31;
        Integer num = this.inReadCmid;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.outReadCmid;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.unreadCount;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sortMajorId;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.sortMinorId;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.timestamp;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.version;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isArchived;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationDiffDto(peerId=");
        sb.append(this.peerId);
        sb.append(", newMsgs=");
        sb.append(this.newMsgs);
        sb.append(", inReadCmid=");
        sb.append(this.inReadCmid);
        sb.append(", outReadCmid=");
        sb.append(this.outReadCmid);
        sb.append(", unreadCount=");
        sb.append(this.unreadCount);
        sb.append(", sortMajorId=");
        sb.append(this.sortMajorId);
        sb.append(", sortMinorId=");
        sb.append(this.sortMinorId);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", isArchived=");
        return tn.a(sb, this.isArchived, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.peerId, i);
        MessagesNewMessagesDto messagesNewMessagesDto = this.newMsgs;
        if (messagesNewMessagesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesNewMessagesDto.writeToParcel(parcel, i);
        }
        Integer num = this.inReadCmid;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.outReadCmid;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.unreadCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.sortMajorId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.sortMinorId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.timestamp;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Long l = this.version;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Boolean bool = this.isArchived;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesConversationDiffDto(UserId userId, MessagesNewMessagesDto messagesNewMessagesDto, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Boolean bool, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : messagesNewMessagesDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : num5, (i & 128) != 0 ? null : num6, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : bool);
    }
}
