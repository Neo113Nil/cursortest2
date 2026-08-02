package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MessagesInboundCallChatInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesInboundCallChatInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesInboundCallChatInfoDto> CREATOR = new a();

    @pmi0("chat_id")
    private final int chatId;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesInboundCallChatInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesInboundCallChatInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesInboundCallChatInfoDto createFromParcel(Parcel parcel) {
            return new MessagesInboundCallChatInfoDto(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesInboundCallChatInfoDto[] newArray(int i) {
            return new MessagesInboundCallChatInfoDto[i];
        }
    }

    public MessagesInboundCallChatInfoDto(String str, int i, String str2, String str3) {
        this.title = str;
        this.chatId = i;
        this.photoBase = str2;
        this.photo400 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesInboundCallChatInfoDto)) {
            return false;
        }
        MessagesInboundCallChatInfoDto messagesInboundCallChatInfoDto = (MessagesInboundCallChatInfoDto) obj;
        return epx.f(this.title, messagesInboundCallChatInfoDto.title) && this.chatId == messagesInboundCallChatInfoDto.chatId && epx.f(this.photoBase, messagesInboundCallChatInfoDto.photoBase) && epx.f(this.photo400, messagesInboundCallChatInfoDto.photo400);
    }

    public final int hashCode() {
        int a2 = shy.a(this.chatId, this.title.hashCode() * 31, 31);
        String str = this.photoBase;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo400;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesInboundCallChatInfoDto(title=");
        sb.append(this.title);
        sb.append(", chatId=");
        sb.append(this.chatId);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", photo400=");
        return ho8.a(sb, this.photo400, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.chatId);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.photo400);
    }

    public /* synthetic */ MessagesInboundCallChatInfoDto(String str, int i, String str2, String str3, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
