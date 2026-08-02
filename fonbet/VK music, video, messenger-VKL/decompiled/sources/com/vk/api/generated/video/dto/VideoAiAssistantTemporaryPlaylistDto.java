package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoAiAssistantTemporaryPlaylistDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantTemporaryPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantTemporaryPlaylistDto> CREATOR = new a();

    @pmi0("uid")
    private final String uid;

    /* compiled from: VideoAiAssistantTemporaryPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantTemporaryPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantTemporaryPlaylistDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantTemporaryPlaylistDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantTemporaryPlaylistDto[] newArray(int i) {
            return new VideoAiAssistantTemporaryPlaylistDto[i];
        }
    }

    public VideoAiAssistantTemporaryPlaylistDto(String str) {
        this.uid = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAiAssistantTemporaryPlaylistDto) && epx.f(this.uid, ((VideoAiAssistantTemporaryPlaylistDto) obj).uid);
    }

    public final int hashCode() {
        return this.uid.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoAiAssistantTemporaryPlaylistDto(uid="), this.uid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
    }
}
