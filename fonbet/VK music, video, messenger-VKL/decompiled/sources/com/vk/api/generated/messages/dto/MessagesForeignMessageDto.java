package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseGeoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesForeignMessageDto.kt */
/* loaded from: classes15.dex */
public final class MessagesForeignMessageDto implements Parcelable {
    public static final Parcelable.Creator<MessagesForeignMessageDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<MessagesMessageAttachmentDto> attachments;

    @pmi0("conversation_message_id")
    private final int conversationMessageId;

    @pmi0("date")
    private final int date;

    @pmi0("format_data")
    private final MessagesMessageFormatDataDto formatData;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("fwd_messages")
    private final List<MessagesForeignMessageDto> fwdMessages;

    @pmi0("geo")
    private final BaseGeoDto geo;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_expired")
    private final Boolean isExpired;

    @pmi0("is_unavailable")
    private final Boolean isUnavailable;

    @pmi0("payload")
    private final String payload;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("reply_message")
    private final MessagesForeignMessageDto replyMessage;

    @pmi0("text")
    private final String text;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("was_listened")
    private final Boolean wasListened;

    @pmi0("was_played")
    private final Boolean wasPlayed;

    /* compiled from: MessagesForeignMessageDto.kt */
    public static final class a implements Parcelable.Creator<MessagesForeignMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesForeignMessageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MessagesForeignMessageDto.class.getClassLoader());
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(MessagesMessageAttachmentDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                int i2 = 0;
                while (i2 != readInt4) {
                    i2 = en.a(MessagesForeignMessageDto.CREATOR, parcel, arrayList3, i2, 1);
                }
                arrayList2 = arrayList3;
            }
            BaseGeoDto createFromParcel = parcel.readInt() == 0 ? null : BaseGeoDto.CREATOR.createFromParcel(parcel);
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId2 = (UserId) parcel.readParcelable(MessagesForeignMessageDto.class.getClassLoader());
            MessagesForeignMessageDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesForeignMessageDto.CREATOR.createFromParcel(parcel);
            MessagesMessageFormatDataDto createFromParcel3 = parcel.readInt() == 0 ? null : MessagesMessageFormatDataDto.CREATOR.createFromParcel(parcel);
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer num = valueOf4;
            Integer num2 = valueOf5;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesForeignMessageDto(readInt, readInt2, userId, readString, arrayList, arrayList2, createFromParcel, num, userId2, createFromParcel2, createFromParcel3, num2, valueOf, valueOf2, readString2, valueOf3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesForeignMessageDto[] newArray(int i) {
            return new MessagesForeignMessageDto[i];
        }
    }

    public MessagesForeignMessageDto(int i, int i2, UserId userId, String str, List<MessagesMessageAttachmentDto> list, List<MessagesForeignMessageDto> list2, BaseGeoDto baseGeoDto, Integer num, UserId userId2, MessagesForeignMessageDto messagesForeignMessageDto, MessagesMessageFormatDataDto messagesMessageFormatDataDto, Integer num2, Boolean bool, Boolean bool2, String str2, Boolean bool3, Boolean bool4) {
        this.conversationMessageId = i;
        this.date = i2;
        this.fromId = userId;
        this.text = str;
        this.attachments = list;
        this.fwdMessages = list2;
        this.geo = baseGeoDto;
        this.id = num;
        this.peerId = userId2;
        this.replyMessage = messagesForeignMessageDto;
        this.formatData = messagesMessageFormatDataDto;
        this.updateTime = num2;
        this.wasListened = bool;
        this.wasPlayed = bool2;
        this.payload = str2;
        this.isExpired = bool3;
        this.isUnavailable = bool4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesForeignMessageDto)) {
            return false;
        }
        MessagesForeignMessageDto messagesForeignMessageDto = (MessagesForeignMessageDto) obj;
        return this.conversationMessageId == messagesForeignMessageDto.conversationMessageId && this.date == messagesForeignMessageDto.date && epx.f(this.fromId, messagesForeignMessageDto.fromId) && epx.f(this.text, messagesForeignMessageDto.text) && epx.f(this.attachments, messagesForeignMessageDto.attachments) && epx.f(this.fwdMessages, messagesForeignMessageDto.fwdMessages) && epx.f(this.geo, messagesForeignMessageDto.geo) && epx.f(this.id, messagesForeignMessageDto.id) && epx.f(this.peerId, messagesForeignMessageDto.peerId) && epx.f(this.replyMessage, messagesForeignMessageDto.replyMessage) && epx.f(this.formatData, messagesForeignMessageDto.formatData) && epx.f(this.updateTime, messagesForeignMessageDto.updateTime) && epx.f(this.wasListened, messagesForeignMessageDto.wasListened) && epx.f(this.wasPlayed, messagesForeignMessageDto.wasPlayed) && epx.f(this.payload, messagesForeignMessageDto.payload) && epx.f(this.isExpired, messagesForeignMessageDto.isExpired) && epx.f(this.isUnavailable, messagesForeignMessageDto.isUnavailable);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(shy.a(this.date, Integer.hashCode(this.conversationMessageId) * 31, 31), 31, this.fromId.b), 31, this.text);
        List<MessagesMessageAttachmentDto> list = this.attachments;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode3 = (hashCode2 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        Integer num = this.id;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.peerId;
        int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        int hashCode6 = (hashCode5 + (messagesForeignMessageDto == null ? 0 : messagesForeignMessageDto.hashCode())) * 31;
        MessagesMessageFormatDataDto messagesMessageFormatDataDto = this.formatData;
        int hashCode7 = (hashCode6 + (messagesMessageFormatDataDto == null ? 0 : messagesMessageFormatDataDto.hashCode())) * 31;
        Integer num2 = this.updateTime;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.wasListened;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.wasPlayed;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.payload;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.isExpired;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isUnavailable;
        return hashCode12 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesForeignMessageDto(conversationMessageId=");
        sb.append(this.conversationMessageId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", fwdMessages=");
        sb.append(this.fwdMessages);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", replyMessage=");
        sb.append(this.replyMessage);
        sb.append(", formatData=");
        sb.append(this.formatData);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", wasListened=");
        sb.append(this.wasListened);
        sb.append(", wasPlayed=");
        sb.append(this.wasPlayed);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", isExpired=");
        sb.append(this.isExpired);
        sb.append(", isUnavailable=");
        return tn.a(sb, this.isUnavailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.conversationMessageId);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.fromId, i);
        parcel.writeString(this.text);
        List<MessagesMessageAttachmentDto> list = this.attachments;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesMessageAttachmentDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MessagesForeignMessageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        BaseGeoDto baseGeoDto = this.geo;
        if (baseGeoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseGeoDto.writeToParcel(parcel, i);
        }
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.peerId, i);
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        if (messagesForeignMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesForeignMessageDto.writeToParcel(parcel, i);
        }
        MessagesMessageFormatDataDto messagesMessageFormatDataDto = this.formatData;
        if (messagesMessageFormatDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageFormatDataDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.updateTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
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
        parcel.writeString(this.payload);
        Boolean bool3 = this.isExpired;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isUnavailable;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public /* synthetic */ MessagesForeignMessageDto(int i, int i2, UserId userId, String str, List list, List list2, BaseGeoDto baseGeoDto, Integer num, UserId userId2, MessagesForeignMessageDto messagesForeignMessageDto, MessagesMessageFormatDataDto messagesMessageFormatDataDto, Integer num2, Boolean bool, Boolean bool2, String str2, Boolean bool3, Boolean bool4, int i3, zcl zclVar) {
        this(i, i2, userId, str, (i3 & 16) != 0 ? null : list, (i3 & 32) != 0 ? null : list2, (i3 & 64) != 0 ? null : baseGeoDto, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : userId2, (i3 & 512) != 0 ? null : messagesForeignMessageDto, (i3 & 1024) != 0 ? null : messagesMessageFormatDataDto, (i3 & 2048) != 0 ? null : num2, (i3 & 4096) != 0 ? null : bool, (i3 & 8192) != 0 ? null : bool2, (i3 & 16384) != 0 ? null : str2, (32768 & i3) != 0 ? null : bool3, (i3 & 65536) != 0 ? null : bool4);
    }
}
