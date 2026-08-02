package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkChatDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSuggestionDto> CREATOR = new a();

    @pmi0("chat")
    private final BaseLinkChatDto chat;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: MessagesChatSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSuggestionDto createFromParcel(Parcel parcel) {
            return new MessagesChatSuggestionDto((BaseLinkChatDto) parcel.readParcelable(MessagesChatSuggestionDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSuggestionDto[] newArray(int i) {
            return new MessagesChatSuggestionDto[i];
        }
    }

    public MessagesChatSuggestionDto(BaseLinkChatDto baseLinkChatDto, String str) {
        this.chat = baseLinkChatDto;
        this.trackCode = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSuggestionDto)) {
            return false;
        }
        MessagesChatSuggestionDto messagesChatSuggestionDto = (MessagesChatSuggestionDto) obj;
        return epx.f(this.chat, messagesChatSuggestionDto.chat) && epx.f(this.trackCode, messagesChatSuggestionDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.chat.hashCode() * 31;
        String str = this.trackCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSuggestionDto(chat=");
        sb.append(this.chat);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.chat, i);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ MessagesChatSuggestionDto(BaseLinkChatDto baseLinkChatDto, String str, int i, zcl zclVar) {
        this(baseLinkChatDto, (i & 2) != 0 ? null : str);
    }
}
