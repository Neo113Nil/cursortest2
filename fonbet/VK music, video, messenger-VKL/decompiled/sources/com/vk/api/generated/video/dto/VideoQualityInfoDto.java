package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoQualityInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoQualityInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoQualityInfoDto> CREATOR = new a();

    @pmi0("params")
    private final List<String> params;

    @pmi0("quality")
    private final Integer quality;

    /* compiled from: VideoQualityInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoQualityInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoQualityInfoDto createFromParcel(Parcel parcel) {
            return new VideoQualityInfoDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoQualityInfoDto[] newArray(int i) {
            return new VideoQualityInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoQualityInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<String> d() {
        return this.params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.quality;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoQualityInfoDto)) {
            return false;
        }
        VideoQualityInfoDto videoQualityInfoDto = (VideoQualityInfoDto) obj;
        return epx.f(this.quality, videoQualityInfoDto.quality) && epx.f(this.params, videoQualityInfoDto.params);
    }

    public final int hashCode() {
        Integer num = this.quality;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.params;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoQualityInfoDto(quality=");
        sb.append(this.quality);
        sb.append(", params=");
        return ms9.a(')', sb, this.params);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.quality;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.params);
    }

    public VideoQualityInfoDto(Integer num, List<String> list) {
        this.quality = num;
        this.params = list;
    }

    public /* synthetic */ VideoQualityInfoDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
