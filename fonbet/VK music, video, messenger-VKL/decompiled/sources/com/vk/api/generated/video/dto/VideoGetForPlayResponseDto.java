package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: VideoGetForPlayResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetForPlayResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetForPlayResponseDto> CREATOR = new a();

    @pmi0("button_timer")
    private final Integer buttonTimer;

    @pmi0("is_serial")
    private final Boolean isSerial;

    @pmi0("skippable_parts")
    private final List<VideoSkippablePartDto> skippableParts;

    @pmi0("tv_feed")
    private final VideoTvFeedDto tvFeed;

    /* compiled from: VideoGetForPlayResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetForPlayResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetForPlayResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoSkippablePartDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoGetForPlayResponseDto(arrayList, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? VideoTvFeedDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetForPlayResponseDto[] newArray(int i) {
            return new VideoGetForPlayResponseDto[i];
        }
    }

    public VideoGetForPlayResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<VideoSkippablePartDto> d() {
        return this.skippableParts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isSerial;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetForPlayResponseDto)) {
            return false;
        }
        VideoGetForPlayResponseDto videoGetForPlayResponseDto = (VideoGetForPlayResponseDto) obj;
        return epx.f(this.skippableParts, videoGetForPlayResponseDto.skippableParts) && epx.f(this.isSerial, videoGetForPlayResponseDto.isSerial) && epx.f(this.buttonTimer, videoGetForPlayResponseDto.buttonTimer) && epx.f(this.tvFeed, videoGetForPlayResponseDto.tvFeed);
    }

    public final int hashCode() {
        List<VideoSkippablePartDto> list = this.skippableParts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isSerial;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.buttonTimer;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        VideoTvFeedDto videoTvFeedDto = this.tvFeed;
        return hashCode3 + (videoTvFeedDto != null ? videoTvFeedDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoGetForPlayResponseDto(skippableParts=" + this.skippableParts + ", isSerial=" + this.isSerial + ", buttonTimer=" + this.buttonTimer + ", tvFeed=" + this.tvFeed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoSkippablePartDto> list = this.skippableParts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoSkippablePartDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isSerial;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.buttonTimer;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        VideoTvFeedDto videoTvFeedDto = this.tvFeed;
        if (videoTvFeedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvFeedDto.writeToParcel(parcel, i);
        }
    }

    public VideoGetForPlayResponseDto(List<VideoSkippablePartDto> list, Boolean bool, Integer num, VideoTvFeedDto videoTvFeedDto) {
        this.skippableParts = list;
        this.isSerial = bool;
        this.buttonTimer = num;
        this.tvFeed = videoTvFeedDto;
    }

    public /* synthetic */ VideoGetForPlayResponseDto(List list, Boolean bool, Integer num, VideoTvFeedDto videoTvFeedDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : videoTvFeedDto);
    }
}
