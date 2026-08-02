package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesActionOneOfDto.kt */
/* loaded from: classes15.dex */
public final class MessagesActionOneOfDto implements Parcelable {
    public static final Parcelable.Creator<MessagesActionOneOfDto> CREATOR = new a();

    @pmi0("conversation_message_id")
    private final Integer conversationMessageId;

    @pmi0("email")
    private final String email;

    @pmi0("member_id")
    private final UserId memberId;

    @pmi0("message")
    private final String message;

    @pmi0("old_text")
    private final String oldText;

    @pmi0("photo")
    private final MessagesMessageActionPhotoDto photo;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final MessagesMessageActionStatusDto type;

    /* compiled from: MessagesActionOneOfDto.kt */
    public static final class a implements Parcelable.Creator<MessagesActionOneOfDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesActionOneOfDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            MessagesMessageActionPhotoDto messagesMessageActionPhotoDto;
            MessagesMessageActionStatusDto createFromParcel = MessagesMessageActionStatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
                messagesMessageActionPhotoDto = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                messagesMessageActionPhotoDto = null;
            }
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(MessagesActionOneOfDto.class.getClassLoader());
            MessagesMessageActionPhotoDto messagesMessageActionPhotoDto2 = messagesMessageActionPhotoDto;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                messagesMessageActionPhotoDto2 = MessagesMessageActionPhotoDto.CREATOR.createFromParcel(parcel);
            }
            return new MessagesActionOneOfDto(createFromParcel, valueOf, readString, userId, readString2, messagesMessageActionPhotoDto2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesActionOneOfDto[] newArray(int i) {
            return new MessagesActionOneOfDto[i];
        }
    }

    public MessagesActionOneOfDto(MessagesMessageActionStatusDto messagesMessageActionStatusDto, Integer num, String str, UserId userId, String str2, MessagesMessageActionPhotoDto messagesMessageActionPhotoDto, String str3, String str4, String str5) {
        this.type = messagesMessageActionStatusDto;
        this.conversationMessageId = num;
        this.email = str;
        this.memberId = userId;
        this.message = str2;
        this.photo = messagesMessageActionPhotoDto;
        this.style = str3;
        this.text = str4;
        this.oldText = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesActionOneOfDto)) {
            return false;
        }
        MessagesActionOneOfDto messagesActionOneOfDto = (MessagesActionOneOfDto) obj;
        return this.type == messagesActionOneOfDto.type && epx.f(this.conversationMessageId, messagesActionOneOfDto.conversationMessageId) && epx.f(this.email, messagesActionOneOfDto.email) && epx.f(this.memberId, messagesActionOneOfDto.memberId) && epx.f(this.message, messagesActionOneOfDto.message) && epx.f(this.photo, messagesActionOneOfDto.photo) && epx.f(this.style, messagesActionOneOfDto.style) && epx.f(this.text, messagesActionOneOfDto.text) && epx.f(this.oldText, messagesActionOneOfDto.oldText);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.conversationMessageId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.email;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.memberId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str2 = this.message;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessagesMessageActionPhotoDto messagesMessageActionPhotoDto = this.photo;
        int hashCode6 = (hashCode5 + (messagesMessageActionPhotoDto == null ? 0 : messagesMessageActionPhotoDto.hashCode())) * 31;
        String str3 = this.style;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.oldText;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesActionOneOfDto(type=");
        sb.append(this.type);
        sb.append(", conversationMessageId=");
        sb.append(this.conversationMessageId);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", memberId=");
        sb.append(this.memberId);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", oldText=");
        return ho8.a(sb, this.oldText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Integer num = this.conversationMessageId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.email);
        parcel.writeParcelable(this.memberId, i);
        parcel.writeString(this.message);
        MessagesMessageActionPhotoDto messagesMessageActionPhotoDto = this.photo;
        if (messagesMessageActionPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageActionPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.style);
        parcel.writeString(this.text);
        parcel.writeString(this.oldText);
    }

    public /* synthetic */ MessagesActionOneOfDto(MessagesMessageActionStatusDto messagesMessageActionStatusDto, Integer num, String str, UserId userId, String str2, MessagesMessageActionPhotoDto messagesMessageActionPhotoDto, String str3, String str4, String str5, int i, zcl zclVar) {
        this(messagesMessageActionStatusDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : messagesMessageActionPhotoDto, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5);
    }
}
