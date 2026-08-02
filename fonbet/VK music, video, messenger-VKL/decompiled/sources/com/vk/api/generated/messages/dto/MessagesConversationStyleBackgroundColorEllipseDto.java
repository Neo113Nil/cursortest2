package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.xq;

/* compiled from: MessagesConversationStyleBackgroundColorEllipseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleBackgroundColorEllipseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleBackgroundColorEllipseDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("radius_x")
    private final float radiusX;

    @pmi0("radius_y")
    private final float radiusY;

    @pmi0("x")
    private final float x;

    @pmi0("y")
    private final float y;

    /* compiled from: MessagesConversationStyleBackgroundColorEllipseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundColorEllipseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundColorEllipseDto createFromParcel(Parcel parcel) {
            return new MessagesConversationStyleBackgroundColorEllipseDto(parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundColorEllipseDto[] newArray(int i) {
            return new MessagesConversationStyleBackgroundColorEllipseDto[i];
        }
    }

    public MessagesConversationStyleBackgroundColorEllipseDto(float f, float f2, String str, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.color = str;
        this.radiusX = f3;
        this.radiusY = f4;
    }

    public final String d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.radiusX;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleBackgroundColorEllipseDto)) {
            return false;
        }
        MessagesConversationStyleBackgroundColorEllipseDto messagesConversationStyleBackgroundColorEllipseDto = (MessagesConversationStyleBackgroundColorEllipseDto) obj;
        return Float.compare(this.x, messagesConversationStyleBackgroundColorEllipseDto.x) == 0 && Float.compare(this.y, messagesConversationStyleBackgroundColorEllipseDto.y) == 0 && epx.f(this.color, messagesConversationStyleBackgroundColorEllipseDto.color) && Float.compare(this.radiusX, messagesConversationStyleBackgroundColorEllipseDto.radiusX) == 0 && Float.compare(this.radiusY, messagesConversationStyleBackgroundColorEllipseDto.radiusY) == 0;
    }

    public final float f() {
        return this.radiusY;
    }

    public final float g() {
        return this.x;
    }

    public final int hashCode() {
        return Float.hashCode(this.radiusY) + b.a(this.radiusX, urd0.a(b.a(this.y, Float.hashCode(this.x) * 31, 31), 31, this.color), 31);
    }

    public final float i() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleBackgroundColorEllipseDto(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", radiusX=");
        sb.append(this.radiusX);
        sb.append(", radiusY=");
        return xq.c(')', this.radiusY, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeString(this.color);
        parcel.writeFloat(this.radiusX);
        parcel.writeFloat(this.radiusY);
    }
}
