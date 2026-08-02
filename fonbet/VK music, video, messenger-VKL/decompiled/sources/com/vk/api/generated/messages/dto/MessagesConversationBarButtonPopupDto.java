package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MessagesConversationBarButtonPopupDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarButtonPopupDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarButtonPopupDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesConversationBarButtonPopupDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarButtonPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarButtonPopupDto createFromParcel(Parcel parcel) {
            return new MessagesConversationBarButtonPopupDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarButtonPopupDto[] newArray(int i) {
            return new MessagesConversationBarButtonPopupDto[i];
        }
    }

    public MessagesConversationBarButtonPopupDto(String str, String str2, String str3, String str4) {
        this.style = str;
        this.title = str2;
        this.text = str3;
        this.buttonText = str4;
    }

    public final String d() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationBarButtonPopupDto)) {
            return false;
        }
        MessagesConversationBarButtonPopupDto messagesConversationBarButtonPopupDto = (MessagesConversationBarButtonPopupDto) obj;
        return epx.f(this.style, messagesConversationBarButtonPopupDto.style) && epx.f(this.title, messagesConversationBarButtonPopupDto.title) && epx.f(this.text, messagesConversationBarButtonPopupDto.text) && epx.f(this.buttonText, messagesConversationBarButtonPopupDto.buttonText);
    }

    public final String f() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(urd0.a(this.style.hashCode() * 31, 31, this.title), 31, this.text);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationBarButtonPopupDto(style=");
        sb.append(this.style);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.style);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.buttonText);
    }
}
