package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetAdsDataResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAdsDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAdsDataResponseDto> CREATOR = new a();

    @pmi0("overlay")
    private final List<VideoVideoAdsDataOverlayDto> overlay;

    @pmi0("pause")
    private final List<VideoVideoAdsDataPauseDto> pause;

    /* compiled from: VideoGetAdsDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAdsDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAdsDataResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(VideoVideoAdsDataOverlayDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(VideoVideoAdsDataPauseDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new VideoGetAdsDataResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAdsDataResponseDto[] newArray(int i) {
            return new VideoGetAdsDataResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoGetAdsDataResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<VideoVideoAdsDataOverlayDto> d() {
        return this.overlay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetAdsDataResponseDto)) {
            return false;
        }
        VideoGetAdsDataResponseDto videoGetAdsDataResponseDto = (VideoGetAdsDataResponseDto) obj;
        return epx.f(this.overlay, videoGetAdsDataResponseDto.overlay) && epx.f(this.pause, videoGetAdsDataResponseDto.pause);
    }

    public final int hashCode() {
        List<VideoVideoAdsDataOverlayDto> list = this.overlay;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<VideoVideoAdsDataPauseDto> list2 = this.pause;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetAdsDataResponseDto(overlay=");
        sb.append(this.overlay);
        sb.append(", pause=");
        return ms9.a(')', sb, this.pause);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoVideoAdsDataOverlayDto> list = this.overlay;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((VideoVideoAdsDataOverlayDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVideoAdsDataPauseDto> list2 = this.pause;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((VideoVideoAdsDataPauseDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public VideoGetAdsDataResponseDto(List<VideoVideoAdsDataOverlayDto> list, List<VideoVideoAdsDataPauseDto> list2) {
        this.overlay = list;
        this.pause = list2;
    }

    public /* synthetic */ VideoGetAdsDataResponseDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
