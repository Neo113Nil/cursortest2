package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: VideoVideoBookmakerQueueInfoDataDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoBookmakerQueueInfoDataDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoBookmakerQueueInfoDataDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final long offset;

    @pmi0("queue_id")
    private final String queueId;

    @pmi0("ttl")
    private final int ttl;

    /* compiled from: VideoVideoBookmakerQueueInfoDataDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoBookmakerQueueInfoDataDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerQueueInfoDataDto createFromParcel(Parcel parcel) {
            return new VideoVideoBookmakerQueueInfoDataDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerQueueInfoDataDto[] newArray(int i) {
            return new VideoVideoBookmakerQueueInfoDataDto[i];
        }
    }

    public VideoVideoBookmakerQueueInfoDataDto(String str, String str2, int i, long j) {
        this.queueId = str;
        this.key = str2;
        this.ttl = i;
        this.offset = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoBookmakerQueueInfoDataDto)) {
            return false;
        }
        VideoVideoBookmakerQueueInfoDataDto videoVideoBookmakerQueueInfoDataDto = (VideoVideoBookmakerQueueInfoDataDto) obj;
        return epx.f(this.queueId, videoVideoBookmakerQueueInfoDataDto.queueId) && epx.f(this.key, videoVideoBookmakerQueueInfoDataDto.key) && this.ttl == videoVideoBookmakerQueueInfoDataDto.ttl && this.offset == videoVideoBookmakerQueueInfoDataDto.offset;
    }

    public final int hashCode() {
        return Long.hashCode(this.offset) + shy.a(this.ttl, urd0.a(this.queueId.hashCode() * 31, 31, this.key), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoBookmakerQueueInfoDataDto(queueId=");
        sb.append(this.queueId);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append(", offset=");
        return vu5.a(')', this.offset, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.queueId);
        parcel.writeString(this.key);
        parcel.writeInt(this.ttl);
        parcel.writeLong(this.offset);
    }
}
