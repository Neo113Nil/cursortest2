package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MessagesCallBroadcastDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCallBroadcastDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCallBroadcastDto> CREATOR = new a();

    @pmi0("video_id")
    private final String videoId;

    /* compiled from: MessagesCallBroadcastDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCallBroadcastDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCallBroadcastDto createFromParcel(Parcel parcel) {
            return new MessagesCallBroadcastDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCallBroadcastDto[] newArray(int i) {
            return new MessagesCallBroadcastDto[i];
        }
    }

    public MessagesCallBroadcastDto(String str) {
        this.videoId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesCallBroadcastDto) && epx.f(this.videoId, ((MessagesCallBroadcastDto) obj).videoId);
    }

    public final int hashCode() {
        return this.videoId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MessagesCallBroadcastDto(videoId="), this.videoId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoId);
    }
}
