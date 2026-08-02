package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import ru.ok.android.sdk.SharedKt;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesHistoryAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class MessagesHistoryAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<MessagesHistoryAttachmentDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final MessagesHistoryMessageAttachmentDto attachment;

    @pmi0("cmid")
    private final int cmid;

    @pmi0("date")
    private final long date;

    @pmi0("forward_level")
    private final Integer forwardLevel;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("linked_cmid")
    private final Integer linkedCmid;

    @pmi0("linked_text")
    private final String linkedText;

    @pmi0("message_expire_ttl")
    private final Integer messageExpireTtl;

    @pmi0("message_id")
    private final int messageId;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("was_listened")
    private final Boolean wasListened;

    @pmi0("was_played")
    private final Boolean wasPlayed;

    /* compiled from: MessagesHistoryAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<MessagesHistoryAttachmentDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MessagesHistoryAttachmentDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            Object obj;
            Object obj2;
            Boolean bool;
            Integer valueOf2;
            MessagesHistoryMessageAttachmentDto createFromParcel = MessagesHistoryMessageAttachmentDto.CREATOR.createFromParcel(parcel);
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MessagesHistoryAttachmentDto.class.getClassLoader());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String readString = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                obj = num;
            } else {
                obj = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                obj2 = num;
            } else {
                obj2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                Object obj3 = obj;
                valueOf2 = num;
                bool = obj3;
            } else {
                bool = obj;
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new MessagesHistoryAttachmentDto(createFromParcel, readLong, readInt, readInt2, userId, valueOf3, valueOf, readString, valueOf4, bool, obj2, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesHistoryAttachmentDto[] newArray(int i) {
            return new MessagesHistoryAttachmentDto[i];
        }
    }

    public MessagesHistoryAttachmentDto(MessagesHistoryMessageAttachmentDto messagesHistoryMessageAttachmentDto, long j, int i, int i2, UserId userId, Integer num, Integer num2, String str, Integer num3, Boolean bool, Boolean bool2, Integer num4) {
        this.attachment = messagesHistoryMessageAttachmentDto;
        this.date = j;
        this.messageId = i;
        this.cmid = i2;
        this.fromId = userId;
        this.messageExpireTtl = num;
        this.linkedCmid = num2;
        this.linkedText = str;
        this.forwardLevel = num3;
        this.wasListened = bool;
        this.wasPlayed = bool2;
        this.position = num4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesHistoryAttachmentDto)) {
            return false;
        }
        MessagesHistoryAttachmentDto messagesHistoryAttachmentDto = (MessagesHistoryAttachmentDto) obj;
        return epx.f(this.attachment, messagesHistoryAttachmentDto.attachment) && this.date == messagesHistoryAttachmentDto.date && this.messageId == messagesHistoryAttachmentDto.messageId && this.cmid == messagesHistoryAttachmentDto.cmid && epx.f(this.fromId, messagesHistoryAttachmentDto.fromId) && epx.f(this.messageExpireTtl, messagesHistoryAttachmentDto.messageExpireTtl) && epx.f(this.linkedCmid, messagesHistoryAttachmentDto.linkedCmid) && epx.f(this.linkedText, messagesHistoryAttachmentDto.linkedText) && epx.f(this.forwardLevel, messagesHistoryAttachmentDto.forwardLevel) && epx.f(this.wasListened, messagesHistoryAttachmentDto.wasListened) && epx.f(this.wasPlayed, messagesHistoryAttachmentDto.wasPlayed) && epx.f(this.position, messagesHistoryAttachmentDto.position);
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.cmid, shy.a(this.messageId, bh10.a(this.attachment.hashCode() * 31, 31, this.date), 31), 31), 31, this.fromId.b);
        Integer num = this.messageExpireTtl;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.linkedCmid;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.linkedText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.forwardLevel;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.wasListened;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.wasPlayed;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.position;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesHistoryAttachmentDto(attachment=");
        sb.append(this.attachment);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", messageId=");
        sb.append(this.messageId);
        sb.append(", cmid=");
        sb.append(this.cmid);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", messageExpireTtl=");
        sb.append(this.messageExpireTtl);
        sb.append(", linkedCmid=");
        sb.append(this.linkedCmid);
        sb.append(", linkedText=");
        sb.append(this.linkedText);
        sb.append(", forwardLevel=");
        sb.append(this.forwardLevel);
        sb.append(", wasListened=");
        sb.append(this.wasListened);
        sb.append(", wasPlayed=");
        sb.append(this.wasPlayed);
        sb.append(", position=");
        return uqi.b(sb, this.position, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.attachment.writeToParcel(parcel, i);
        parcel.writeLong(this.date);
        parcel.writeInt(this.messageId);
        parcel.writeInt(this.cmid);
        parcel.writeParcelable(this.fromId, i);
        Integer num = this.messageExpireTtl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.linkedCmid;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.linkedText);
        Integer num3 = this.forwardLevel;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool = this.wasListened;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.wasPlayed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num4 = this.position;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ MessagesHistoryAttachmentDto(MessagesHistoryMessageAttachmentDto messagesHistoryMessageAttachmentDto, long j, int i, int i2, UserId userId, Integer num, Integer num2, String str, Integer num3, Boolean bool, Boolean bool2, Integer num4, int i3, zcl zclVar) {
        this(messagesHistoryMessageAttachmentDto, j, i, i2, userId, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : num2, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? null : num3, (i3 & 512) != 0 ? null : bool, (i3 & 1024) != 0 ? null : bool2, (i3 & 2048) != 0 ? null : num4);
    }
}
