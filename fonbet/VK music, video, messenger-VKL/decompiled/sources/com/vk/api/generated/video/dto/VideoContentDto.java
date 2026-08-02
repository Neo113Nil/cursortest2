package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoContentDto.kt */
/* loaded from: classes15.dex */
public final class VideoContentDto implements Parcelable {
    public static final Parcelable.Creator<VideoContentDto> CREATOR = new a();

    @pmi0("banner")
    private final VideoDiscoverBannerDto banner;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    /* compiled from: VideoContentDto.kt */
    public static final class a implements Parcelable.Creator<VideoContentDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoContentDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(VideoContentDto.class, parcel, arrayList, i, 1);
                }
            }
            return new VideoContentDto(arrayList, parcel.readInt() != 0 ? VideoDiscoverBannerDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoContentDto[] newArray(int i) {
            return new VideoContentDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoContentDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<VideoVideoFullDto> d() {
        return this.videos;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoContentDto)) {
            return false;
        }
        VideoContentDto videoContentDto = (VideoContentDto) obj;
        return epx.f(this.videos, videoContentDto.videos) && epx.f(this.banner, videoContentDto.banner);
    }

    public final int hashCode() {
        List<VideoVideoFullDto> list = this.videos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        VideoDiscoverBannerDto videoDiscoverBannerDto = this.banner;
        return hashCode + (videoDiscoverBannerDto != null ? videoDiscoverBannerDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoContentDto(videos=" + this.videos + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoVideoFullDto> list = this.videos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        VideoDiscoverBannerDto videoDiscoverBannerDto = this.banner;
        if (videoDiscoverBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDiscoverBannerDto.writeToParcel(parcel, i);
        }
    }

    public VideoContentDto(List<VideoVideoFullDto> list, VideoDiscoverBannerDto videoDiscoverBannerDto) {
        this.videos = list;
        this.banner = videoDiscoverBannerDto;
    }

    public /* synthetic */ VideoContentDto(List list, VideoDiscoverBannerDto videoDiscoverBannerDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : videoDiscoverBannerDto);
    }
}
