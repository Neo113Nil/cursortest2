package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VideoVideoAdsPauseIntervalDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsPauseIntervalDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsPauseIntervalDto> CREATOR = new a();

    @pmi0(TtmlNode.END)
    private final int end;

    @pmi0("start")
    private final int start;

    /* compiled from: VideoVideoAdsPauseIntervalDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsPauseIntervalDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsPauseIntervalDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsPauseIntervalDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsPauseIntervalDto[] newArray(int i) {
            return new VideoVideoAdsPauseIntervalDto[i];
        }
    }

    public VideoVideoAdsPauseIntervalDto(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsPauseIntervalDto)) {
            return false;
        }
        VideoVideoAdsPauseIntervalDto videoVideoAdsPauseIntervalDto = (VideoVideoAdsPauseIntervalDto) obj;
        return this.start == videoVideoAdsPauseIntervalDto.start && this.end == videoVideoAdsPauseIntervalDto.end;
    }

    public final int hashCode() {
        return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsPauseIntervalDto(start=");
        sb.append(this.start);
        sb.append(", end=");
        return vu5.b(sb, this.end, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }
}
