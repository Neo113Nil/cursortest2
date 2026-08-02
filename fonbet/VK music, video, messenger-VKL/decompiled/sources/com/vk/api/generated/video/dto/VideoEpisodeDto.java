package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoEpisodeDto.kt */
/* loaded from: classes15.dex */
public final class VideoEpisodeDto implements Parcelable {
    public static final Parcelable.Creator<VideoEpisodeDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("time")
    private final Integer time;

    /* compiled from: VideoEpisodeDto.kt */
    public static final class a implements Parcelable.Creator<VideoEpisodeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoEpisodeDto createFromParcel(Parcel parcel) {
            return new VideoEpisodeDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoEpisodeDto[] newArray(int i) {
            return new VideoEpisodeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoEpisodeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.time;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEpisodeDto)) {
            return false;
        }
        VideoEpisodeDto videoEpisodeDto = (VideoEpisodeDto) obj;
        return epx.f(this.time, videoEpisodeDto.time) && epx.f(this.text, videoEpisodeDto.text);
    }

    public final int hashCode() {
        Integer num = this.time;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEpisodeDto(time=");
        sb.append(this.time);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.time;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.text);
    }

    public VideoEpisodeDto(Integer num, String str) {
        this.time = num;
        this.text = str;
    }

    public /* synthetic */ VideoEpisodeDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
