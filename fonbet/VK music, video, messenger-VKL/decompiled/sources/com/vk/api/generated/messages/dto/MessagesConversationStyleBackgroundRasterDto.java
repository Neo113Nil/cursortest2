package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MessagesConversationStyleBackgroundRasterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleBackgroundRasterDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleBackgroundRasterDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: MessagesConversationStyleBackgroundRasterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundRasterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundRasterDto createFromParcel(Parcel parcel) {
            return new MessagesConversationStyleBackgroundRasterDto(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundRasterDto[] newArray(int i) {
            return new MessagesConversationStyleBackgroundRasterDto[i];
        }
    }

    public MessagesConversationStyleBackgroundRasterDto(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleBackgroundRasterDto)) {
            return false;
        }
        MessagesConversationStyleBackgroundRasterDto messagesConversationStyleBackgroundRasterDto = (MessagesConversationStyleBackgroundRasterDto) obj;
        return epx.f(this.url, messagesConversationStyleBackgroundRasterDto.url) && this.width == messagesConversationStyleBackgroundRasterDto.width && this.height == messagesConversationStyleBackgroundRasterDto.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + shy.a(this.width, this.url.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleBackgroundRasterDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return vu5.b(sb, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
