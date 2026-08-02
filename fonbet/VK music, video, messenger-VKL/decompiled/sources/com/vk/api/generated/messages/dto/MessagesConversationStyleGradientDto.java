package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesConversationStyleGradientDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleGradientDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleGradientDto> CREATOR = new a();

    @pmi0("angle")
    private final int angle;

    @pmi0("colors")
    private final List<String> colors;

    /* compiled from: MessagesConversationStyleGradientDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleGradientDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleGradientDto createFromParcel(Parcel parcel) {
            return new MessagesConversationStyleGradientDto(parcel.createStringArrayList(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleGradientDto[] newArray(int i) {
            return new MessagesConversationStyleGradientDto[i];
        }
    }

    public MessagesConversationStyleGradientDto(List<String> list, int i) {
        this.colors = list;
        this.angle = i;
    }

    public final int d() {
        return this.angle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.colors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleGradientDto)) {
            return false;
        }
        MessagesConversationStyleGradientDto messagesConversationStyleGradientDto = (MessagesConversationStyleGradientDto) obj;
        return epx.f(this.colors, messagesConversationStyleGradientDto.colors) && this.angle == messagesConversationStyleGradientDto.angle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.angle) + (this.colors.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleGradientDto(colors=");
        sb.append(this.colors);
        sb.append(", angle=");
        return vu5.b(sb, this.angle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.colors);
        parcel.writeInt(this.angle);
    }
}
