package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesGraffitiDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGraffitiDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGraffitiDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("height")
    private final int height;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: MessagesGraffitiDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGraffitiDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGraffitiDto createFromParcel(Parcel parcel) {
            return new MessagesGraffitiDto(parcel.readInt(), (UserId) parcel.readParcelable(MessagesGraffitiDto.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGraffitiDto[] newArray(int i) {
            return new MessagesGraffitiDto[i];
        }
    }

    public MessagesGraffitiDto(int i, UserId userId, String str, int i2, int i3, String str2) {
        this.id = i;
        this.ownerId = userId;
        this.url = str;
        this.width = i2;
        this.height = i3;
        this.accessKey = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGraffitiDto)) {
            return false;
        }
        MessagesGraffitiDto messagesGraffitiDto = (MessagesGraffitiDto) obj;
        return this.id == messagesGraffitiDto.id && epx.f(this.ownerId, messagesGraffitiDto.ownerId) && epx.f(this.url, messagesGraffitiDto.url) && this.width == messagesGraffitiDto.width && this.height == messagesGraffitiDto.height && epx.f(this.accessKey, messagesGraffitiDto.accessKey);
    }

    public final int hashCode() {
        int a2 = shy.a(this.height, shy.a(this.width, urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.url), 31), 31);
        String str = this.accessKey;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGraffitiDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", accessKey=");
        return ho8.a(sb, this.accessKey, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.accessKey);
    }

    public /* synthetic */ MessagesGraffitiDto(int i, UserId userId, String str, int i2, int i3, String str2, int i4, zcl zclVar) {
        this(i, userId, str, i2, i3, (i4 & 32) != 0 ? null : str2);
    }
}
