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
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesPinnedMessageDto.kt */
/* loaded from: classes15.dex */
public final class MessagesPinnedMessageDto implements Parcelable {
    public static final Parcelable.Creator<MessagesPinnedMessageDto> CREATOR = new a();

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
    private final int id;

    @pmi0("important")
    private final Boolean important;

    @pmi0("is_unavailable")
    private final Boolean isUnavailable;

    @pmi0("keyboard")
    private final MessagesKeyboardDto keyboard;

    @pmi0("out")
    private final Boolean out;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("reply_message")
    private final MessagesForeignMessageDto replyMessage;

    @pmi0("text")
    private final String text;

    /* compiled from: MessagesPinnedMessageDto.kt */
    public static final class a implements Parcelable.Creator<MessagesPinnedMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesPinnedMessageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(MessagesPinnedMessageDto.class.getClassLoader());
            UserId userId2 = (UserId) parcel.readParcelable(MessagesPinnedMessageDto.class.getClassLoader());
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                int i = 0;
                while (i != readInt4) {
                    i = en.a(MessagesMessageAttachmentDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList2 = new ArrayList(readInt5);
                int i2 = 0;
                while (i2 != readInt5) {
                    i2 = en.a(MessagesForeignMessageDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            BaseGeoDto createFromParcel = parcel.readInt() == 0 ? null : BaseGeoDto.CREATOR.createFromParcel(parcel);
            MessagesForeignMessageDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesForeignMessageDto.CREATOR.createFromParcel(parcel);
            MessagesMessageFormatDataDto createFromParcel3 = parcel.readInt() == 0 ? null : MessagesMessageFormatDataDto.CREATOR.createFromParcel(parcel);
            MessagesKeyboardDto createFromParcel4 = parcel.readInt() == 0 ? null : MessagesKeyboardDto.CREATOR.createFromParcel(parcel);
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
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesPinnedMessageDto(readInt, readInt2, readInt3, userId, userId2, readString, arrayList, arrayList2, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesPinnedMessageDto[] newArray(int i) {
            return new MessagesPinnedMessageDto[i];
        }
    }

    public MessagesPinnedMessageDto(int i, int i2, int i3, UserId userId, UserId userId2, String str, List<MessagesMessageAttachmentDto> list, List<MessagesForeignMessageDto> list2, BaseGeoDto baseGeoDto, MessagesForeignMessageDto messagesForeignMessageDto, MessagesMessageFormatDataDto messagesMessageFormatDataDto, MessagesKeyboardDto messagesKeyboardDto, Boolean bool, Boolean bool2, Boolean bool3) {
        this.conversationMessageId = i;
        this.id = i2;
        this.date = i3;
        this.fromId = userId;
        this.peerId = userId2;
        this.text = str;
        this.attachments = list;
        this.fwdMessages = list2;
        this.geo = baseGeoDto;
        this.replyMessage = messagesForeignMessageDto;
        this.formatData = messagesMessageFormatDataDto;
        this.keyboard = messagesKeyboardDto;
        this.out = bool;
        this.isUnavailable = bool2;
        this.important = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPinnedMessageDto)) {
            return false;
        }
        MessagesPinnedMessageDto messagesPinnedMessageDto = (MessagesPinnedMessageDto) obj;
        return this.conversationMessageId == messagesPinnedMessageDto.conversationMessageId && this.id == messagesPinnedMessageDto.id && this.date == messagesPinnedMessageDto.date && epx.f(this.fromId, messagesPinnedMessageDto.fromId) && epx.f(this.peerId, messagesPinnedMessageDto.peerId) && epx.f(this.text, messagesPinnedMessageDto.text) && epx.f(this.attachments, messagesPinnedMessageDto.attachments) && epx.f(this.fwdMessages, messagesPinnedMessageDto.fwdMessages) && epx.f(this.geo, messagesPinnedMessageDto.geo) && epx.f(this.replyMessage, messagesPinnedMessageDto.replyMessage) && epx.f(this.formatData, messagesPinnedMessageDto.formatData) && epx.f(this.keyboard, messagesPinnedMessageDto.keyboard) && epx.f(this.out, messagesPinnedMessageDto.out) && epx.f(this.isUnavailable, messagesPinnedMessageDto.isUnavailable) && epx.f(this.important, messagesPinnedMessageDto.important);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(bh10.a(shy.a(this.date, shy.a(this.id, Integer.hashCode(this.conversationMessageId) * 31, 31), 31), 31, this.fromId.b), 31, this.peerId.b), 31, this.text);
        List<MessagesMessageAttachmentDto> list = this.attachments;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode3 = (hashCode2 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        int hashCode4 = (hashCode3 + (messagesForeignMessageDto == null ? 0 : messagesForeignMessageDto.hashCode())) * 31;
        MessagesMessageFormatDataDto messagesMessageFormatDataDto = this.formatData;
        int hashCode5 = (hashCode4 + (messagesMessageFormatDataDto == null ? 0 : messagesMessageFormatDataDto.hashCode())) * 31;
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        int hashCode6 = (hashCode5 + (messagesKeyboardDto == null ? 0 : messagesKeyboardDto.hashCode())) * 31;
        Boolean bool = this.out;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnavailable;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.important;
        return hashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesPinnedMessageDto(conversationMessageId=");
        sb.append(this.conversationMessageId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", fwdMessages=");
        sb.append(this.fwdMessages);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", replyMessage=");
        sb.append(this.replyMessage);
        sb.append(", formatData=");
        sb.append(this.formatData);
        sb.append(", keyboard=");
        sb.append(this.keyboard);
        sb.append(", out=");
        sb.append(this.out);
        sb.append(", isUnavailable=");
        sb.append(this.isUnavailable);
        sb.append(", important=");
        return tn.a(sb, this.important, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.conversationMessageId);
        parcel.writeInt(this.id);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.fromId, i);
        parcel.writeParcelable(this.peerId, i);
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
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        if (messagesKeyboardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesKeyboardDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.out;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isUnavailable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.important;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ MessagesPinnedMessageDto(int i, int i2, int i3, UserId userId, UserId userId2, String str, List list, List list2, BaseGeoDto baseGeoDto, MessagesForeignMessageDto messagesForeignMessageDto, MessagesMessageFormatDataDto messagesMessageFormatDataDto, MessagesKeyboardDto messagesKeyboardDto, Boolean bool, Boolean bool2, Boolean bool3, int i4, zcl zclVar) {
        this(i, i2, i3, userId, userId2, str, (i4 & 64) != 0 ? null : list, (i4 & 128) != 0 ? null : list2, (i4 & 256) != 0 ? null : baseGeoDto, (i4 & 512) != 0 ? null : messagesForeignMessageDto, (i4 & 1024) != 0 ? null : messagesMessageFormatDataDto, (i4 & 2048) != 0 ? null : messagesKeyboardDto, (i4 & 4096) != 0 ? null : bool, (i4 & 8192) != 0 ? null : bool2, (i4 & 16384) != 0 ? null : bool3);
    }
}
