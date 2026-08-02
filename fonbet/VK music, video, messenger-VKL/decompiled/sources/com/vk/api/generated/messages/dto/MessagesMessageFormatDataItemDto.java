package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesMessageFormatDataItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageFormatDataItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageFormatDataItemDto> CREATOR = new a();

    @pmi0("length")
    private final int length;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final int offset;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: MessagesMessageFormatDataItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageFormatDataItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageFormatDataItemDto createFromParcel(Parcel parcel) {
            return new MessagesMessageFormatDataItemDto(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageFormatDataItemDto[] newArray(int i) {
            return new MessagesMessageFormatDataItemDto[i];
        }
    }

    public MessagesMessageFormatDataItemDto(int i, int i2, String str, String str2) {
        this.offset = i;
        this.length = i2;
        this.type = str;
        this.url = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageFormatDataItemDto)) {
            return false;
        }
        MessagesMessageFormatDataItemDto messagesMessageFormatDataItemDto = (MessagesMessageFormatDataItemDto) obj;
        return this.offset == messagesMessageFormatDataItemDto.offset && this.length == messagesMessageFormatDataItemDto.length && epx.f(this.type, messagesMessageFormatDataItemDto.type) && epx.f(this.url, messagesMessageFormatDataItemDto.url);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.length, Integer.hashCode(this.offset) * 31, 31), 31, this.type);
        String str = this.url;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageFormatDataItemDto(offset=");
        sb.append(this.offset);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.offset);
        parcel.writeInt(this.length);
        parcel.writeString(this.type);
        parcel.writeString(this.url);
    }

    public /* synthetic */ MessagesMessageFormatDataItemDto(int i, int i2, String str, String str2, int i3, zcl zclVar) {
        this(i, i2, str, (i3 & 8) != 0 ? null : str2);
    }
}
