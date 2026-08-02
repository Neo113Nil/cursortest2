package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoTvSplashLoopTimingDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvSplashLoopTimingDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvSplashLoopTimingDto> CREATOR = new a();

    @pmi0(TtmlNode.END)
    private final Integer end;

    @pmi0("start")
    private final Integer start;

    /* compiled from: VideoTvSplashLoopTimingDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvSplashLoopTimingDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopTimingDto createFromParcel(Parcel parcel) {
            return new VideoTvSplashLoopTimingDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopTimingDto[] newArray(int i) {
            return new VideoTvSplashLoopTimingDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoTvSplashLoopTimingDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvSplashLoopTimingDto)) {
            return false;
        }
        VideoTvSplashLoopTimingDto videoTvSplashLoopTimingDto = (VideoTvSplashLoopTimingDto) obj;
        return epx.f(this.start, videoTvSplashLoopTimingDto.start) && epx.f(this.end, videoTvSplashLoopTimingDto.end);
    }

    public final int hashCode() {
        Integer num = this.start;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.end;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTvSplashLoopTimingDto(start=");
        sb.append(this.start);
        sb.append(", end=");
        return uqi.b(sb, this.end, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.start;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.end;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public VideoTvSplashLoopTimingDto(Integer num, Integer num2) {
        this.start = num;
        this.end = num2;
    }

    public /* synthetic */ VideoTvSplashLoopTimingDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
