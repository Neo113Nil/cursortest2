package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesMessageAttachmentWallpostTextliveDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentWallpostTextliveDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageAttachmentWallpostTextliveDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: MessagesMessageAttachmentWallpostTextliveDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentWallpostTextliveDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentWallpostTextliveDto createFromParcel(Parcel parcel) {
            return new MessagesMessageAttachmentWallpostTextliveDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentWallpostTextliveDto[] newArray(int i) {
            return new MessagesMessageAttachmentWallpostTextliveDto[i];
        }
    }

    public MessagesMessageAttachmentWallpostTextliveDto(int i, String str, String str2) {
        this.id = i;
        this.url = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentWallpostTextliveDto)) {
            return false;
        }
        MessagesMessageAttachmentWallpostTextliveDto messagesMessageAttachmentWallpostTextliveDto = (MessagesMessageAttachmentWallpostTextliveDto) obj;
        return this.id == messagesMessageAttachmentWallpostTextliveDto.id && epx.f(this.url, messagesMessageAttachmentWallpostTextliveDto.url) && epx.f(this.title, messagesMessageAttachmentWallpostTextliveDto.title);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.url);
        String str = this.title;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageAttachmentWallpostTextliveDto(id=");
        sb.append(this.id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.title);
    }

    public /* synthetic */ MessagesMessageAttachmentWallpostTextliveDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
