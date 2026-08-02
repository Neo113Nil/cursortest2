package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoModerLogCategoryDto.kt */
/* loaded from: classes15.dex */
public final class VideoModerLogCategoryDto implements Parcelable {
    public static final Parcelable.Creator<VideoModerLogCategoryDto> CREATOR = new a();

    @pmi0("auto_type")
    private final Integer autoType;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoModerLogCategoryDto.kt */
    public static final class a implements Parcelable.Creator<VideoModerLogCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoModerLogCategoryDto createFromParcel(Parcel parcel) {
            return new VideoModerLogCategoryDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoModerLogCategoryDto[] newArray(int i) {
            return new VideoModerLogCategoryDto[i];
        }
    }

    public VideoModerLogCategoryDto(String str, Integer num) {
        this.title = str;
        this.autoType = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoModerLogCategoryDto)) {
            return false;
        }
        VideoModerLogCategoryDto videoModerLogCategoryDto = (VideoModerLogCategoryDto) obj;
        return epx.f(this.title, videoModerLogCategoryDto.title) && epx.f(this.autoType, videoModerLogCategoryDto.autoType);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Integer num = this.autoType;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoModerLogCategoryDto(title=");
        sb.append(this.title);
        sb.append(", autoType=");
        return uqi.b(sb, this.autoType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Integer num = this.autoType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoModerLogCategoryDto(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
