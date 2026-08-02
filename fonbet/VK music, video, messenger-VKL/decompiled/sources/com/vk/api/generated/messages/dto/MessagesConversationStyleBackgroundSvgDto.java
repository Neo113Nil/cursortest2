package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationStyleBackgroundSvgDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleBackgroundSvgDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleBackgroundSvgDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("is_overlay")
    private final Boolean isOverlay;

    @pmi0("opacity")
    private final float opacity;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: MessagesConversationStyleBackgroundSvgDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundSvgDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundSvgDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            float readFloat = parcel.readFloat();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationStyleBackgroundSvgDto(readString, readInt, readInt2, readFloat, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundSvgDto[] newArray(int i) {
            return new MessagesConversationStyleBackgroundSvgDto[i];
        }
    }

    public MessagesConversationStyleBackgroundSvgDto(String str, int i, int i2, float f, Boolean bool) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.opacity = f;
        this.isOverlay = bool;
    }

    public final float d() {
        return this.opacity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isOverlay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleBackgroundSvgDto)) {
            return false;
        }
        MessagesConversationStyleBackgroundSvgDto messagesConversationStyleBackgroundSvgDto = (MessagesConversationStyleBackgroundSvgDto) obj;
        return epx.f(this.url, messagesConversationStyleBackgroundSvgDto.url) && this.width == messagesConversationStyleBackgroundSvgDto.width && this.height == messagesConversationStyleBackgroundSvgDto.height && Float.compare(this.opacity, messagesConversationStyleBackgroundSvgDto.opacity) == 0 && epx.f(this.isOverlay, messagesConversationStyleBackgroundSvgDto.isOverlay);
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
        int a2 = b.a(this.opacity, shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31), 31);
        Boolean bool = this.isOverlay;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleBackgroundSvgDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", opacity=");
        sb.append(this.opacity);
        sb.append(", isOverlay=");
        return tn.a(sb, this.isOverlay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.opacity);
        Boolean bool = this.isOverlay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesConversationStyleBackgroundSvgDto(String str, int i, int i2, float f, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, f, (i3 & 16) != 0 ? null : bool);
    }
}
