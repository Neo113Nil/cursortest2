package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesGetChatOnlineResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetChatOnlineResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetChatOnlineResponseDto> CREATOR = new a();

    @pmi0("online_count")
    private final int onlineCount;

    /* compiled from: MessagesGetChatOnlineResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetChatOnlineResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetChatOnlineResponseDto createFromParcel(Parcel parcel) {
            return new MessagesGetChatOnlineResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetChatOnlineResponseDto[] newArray(int i) {
            return new MessagesGetChatOnlineResponseDto[i];
        }
    }

    public MessagesGetChatOnlineResponseDto(int i) {
        this.onlineCount = i;
    }

    public final int d() {
        return this.onlineCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetChatOnlineResponseDto) && this.onlineCount == ((MessagesGetChatOnlineResponseDto) obj).onlineCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.onlineCount);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MessagesGetChatOnlineResponseDto(onlineCount="), this.onlineCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.onlineCount);
    }
}
