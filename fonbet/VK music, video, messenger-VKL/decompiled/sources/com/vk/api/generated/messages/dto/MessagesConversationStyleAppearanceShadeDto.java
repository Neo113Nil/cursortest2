package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesConversationStyleAppearanceShadeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleAppearanceShadeDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleAppearanceShadeDto> CREATOR = new a();

    @pmi0("accent_color")
    private final String accentColor;

    @pmi0("bubble_gradient")
    private final MessagesConversationStyleGradientDto bubbleGradient;

    @pmi0("forward_line")
    private final String forwardLine;

    @pmi0("header_tint")
    private final String headerTint;

    @pmi0("text_placeholder")
    private final String textPlaceholder;

    @pmi0("text_primary")
    private final String textPrimary;

    @pmi0("write_bar_tint")
    private final String writeBarTint;

    /* compiled from: MessagesConversationStyleAppearanceShadeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleAppearanceShadeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleAppearanceShadeDto createFromParcel(Parcel parcel) {
            return new MessagesConversationStyleAppearanceShadeDto(MessagesConversationStyleGradientDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleAppearanceShadeDto[] newArray(int i) {
            return new MessagesConversationStyleAppearanceShadeDto[i];
        }
    }

    public MessagesConversationStyleAppearanceShadeDto(MessagesConversationStyleGradientDto messagesConversationStyleGradientDto, String str, String str2, String str3, String str4, String str5, String str6) {
        this.bubbleGradient = messagesConversationStyleGradientDto;
        this.accentColor = str;
        this.headerTint = str2;
        this.writeBarTint = str3;
        this.textPrimary = str4;
        this.textPlaceholder = str5;
        this.forwardLine = str6;
    }

    public final String d() {
        return this.accentColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesConversationStyleGradientDto e() {
        return this.bubbleGradient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleAppearanceShadeDto)) {
            return false;
        }
        MessagesConversationStyleAppearanceShadeDto messagesConversationStyleAppearanceShadeDto = (MessagesConversationStyleAppearanceShadeDto) obj;
        return epx.f(this.bubbleGradient, messagesConversationStyleAppearanceShadeDto.bubbleGradient) && epx.f(this.accentColor, messagesConversationStyleAppearanceShadeDto.accentColor) && epx.f(this.headerTint, messagesConversationStyleAppearanceShadeDto.headerTint) && epx.f(this.writeBarTint, messagesConversationStyleAppearanceShadeDto.writeBarTint) && epx.f(this.textPrimary, messagesConversationStyleAppearanceShadeDto.textPrimary) && epx.f(this.textPlaceholder, messagesConversationStyleAppearanceShadeDto.textPlaceholder) && epx.f(this.forwardLine, messagesConversationStyleAppearanceShadeDto.forwardLine);
    }

    public final String f() {
        return this.forwardLine;
    }

    public final String g() {
        return this.headerTint;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.bubbleGradient.hashCode() * 31, 31, this.accentColor), 31, this.headerTint), 31, this.writeBarTint);
        String str = this.textPrimary;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textPlaceholder;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.forwardLine;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.textPlaceholder;
    }

    public final String j() {
        return this.textPrimary;
    }

    public final String k() {
        return this.writeBarTint;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleAppearanceShadeDto(bubbleGradient=");
        sb.append(this.bubbleGradient);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", headerTint=");
        sb.append(this.headerTint);
        sb.append(", writeBarTint=");
        sb.append(this.writeBarTint);
        sb.append(", textPrimary=");
        sb.append(this.textPrimary);
        sb.append(", textPlaceholder=");
        sb.append(this.textPlaceholder);
        sb.append(", forwardLine=");
        return ho8.a(sb, this.forwardLine, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.bubbleGradient.writeToParcel(parcel, i);
        parcel.writeString(this.accentColor);
        parcel.writeString(this.headerTint);
        parcel.writeString(this.writeBarTint);
        parcel.writeString(this.textPrimary);
        parcel.writeString(this.textPlaceholder);
        parcel.writeString(this.forwardLine);
    }

    public /* synthetic */ MessagesConversationStyleAppearanceShadeDto(MessagesConversationStyleGradientDto messagesConversationStyleGradientDto, String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(messagesConversationStyleGradientDto, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
