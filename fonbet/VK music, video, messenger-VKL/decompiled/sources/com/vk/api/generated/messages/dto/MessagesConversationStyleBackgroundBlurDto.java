package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesConversationStyleBackgroundBlurDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleBackgroundBlurDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleBackgroundBlurDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("opacity")
    private final float opacity;

    @pmi0("radius")
    private final int radius;

    /* compiled from: MessagesConversationStyleBackgroundBlurDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundBlurDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundBlurDto createFromParcel(Parcel parcel) {
            return new MessagesConversationStyleBackgroundBlurDto(parcel.readString(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundBlurDto[] newArray(int i) {
            return new MessagesConversationStyleBackgroundBlurDto[i];
        }
    }

    public MessagesConversationStyleBackgroundBlurDto(String str, float f, int i) {
        this.color = str;
        this.opacity = f;
        this.radius = i;
    }

    public final String d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.opacity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleBackgroundBlurDto)) {
            return false;
        }
        MessagesConversationStyleBackgroundBlurDto messagesConversationStyleBackgroundBlurDto = (MessagesConversationStyleBackgroundBlurDto) obj;
        return epx.f(this.color, messagesConversationStyleBackgroundBlurDto.color) && Float.compare(this.opacity, messagesConversationStyleBackgroundBlurDto.opacity) == 0 && this.radius == messagesConversationStyleBackgroundBlurDto.radius;
    }

    public final int f() {
        return this.radius;
    }

    public final int hashCode() {
        return Integer.hashCode(this.radius) + b.a(this.opacity, this.color.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleBackgroundBlurDto(color=");
        sb.append(this.color);
        sb.append(", opacity=");
        sb.append(this.opacity);
        sb.append(", radius=");
        return vu5.b(sb, this.radius, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        parcel.writeFloat(this.opacity);
        parcel.writeInt(this.radius);
    }
}
