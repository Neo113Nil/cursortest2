package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetInviteLinkResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetInviteLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetInviteLinkResponseDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    /* compiled from: MessagesGetInviteLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetInviteLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetInviteLinkResponseDto createFromParcel(Parcel parcel) {
            return new MessagesGetInviteLinkResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetInviteLinkResponseDto[] newArray(int i) {
            return new MessagesGetInviteLinkResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesGetInviteLinkResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetInviteLinkResponseDto) && epx.f(this.link, ((MessagesGetInviteLinkResponseDto) obj).link);
    }

    public final int hashCode() {
        String str = this.link;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MessagesGetInviteLinkResponseDto(link="), this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
    }

    public MessagesGetInviteLinkResponseDto(String str) {
        this.link = str;
    }

    public /* synthetic */ MessagesGetInviteLinkResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
