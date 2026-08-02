package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoVideoForAlbumDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoForAlbumDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoForAlbumDto> CREATOR = new a();

    @pmi0("playlist_position")
    private final Integer playlistPosition;

    @pmi0("video")
    private final VideoVideoFullDto video;

    /* compiled from: VideoVideoForAlbumDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoForAlbumDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoForAlbumDto createFromParcel(Parcel parcel) {
            return new VideoVideoForAlbumDto((VideoVideoFullDto) parcel.readParcelable(VideoVideoForAlbumDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoForAlbumDto[] newArray(int i) {
            return new VideoVideoForAlbumDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoVideoForAlbumDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final VideoVideoFullDto d() {
        return this.video;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoForAlbumDto)) {
            return false;
        }
        VideoVideoForAlbumDto videoVideoForAlbumDto = (VideoVideoForAlbumDto) obj;
        return epx.f(this.video, videoVideoForAlbumDto.video) && epx.f(this.playlistPosition, videoVideoForAlbumDto.playlistPosition);
    }

    public final int hashCode() {
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode = (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode()) * 31;
        Integer num = this.playlistPosition;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoForAlbumDto(video=");
        sb.append(this.video);
        sb.append(", playlistPosition=");
        return uqi.b(sb, this.playlistPosition, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.video, i);
        Integer num = this.playlistPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoVideoForAlbumDto(VideoVideoFullDto videoVideoFullDto, Integer num) {
        this.video = videoVideoFullDto;
        this.playlistPosition = num;
    }

    public /* synthetic */ VideoVideoForAlbumDto(VideoVideoFullDto videoVideoFullDto, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoVideoFullDto, (i & 2) != 0 ? null : num);
    }
}
