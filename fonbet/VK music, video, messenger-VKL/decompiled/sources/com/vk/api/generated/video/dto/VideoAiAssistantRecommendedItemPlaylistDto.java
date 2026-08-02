package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VideoAiAssistantRecommendedItemPlaylistDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantRecommendedItemPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantRecommendedItemPlaylistDto> CREATOR = new a();

    @pmi0("album")
    private final VideoVideoAlbumFullDto album;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    /* compiled from: VideoAiAssistantRecommendedItemPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantRecommendedItemPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantRecommendedItemPlaylistDto createFromParcel(Parcel parcel) {
            VideoVideoAlbumFullDto videoVideoAlbumFullDto = (VideoVideoAlbumFullDto) parcel.readParcelable(VideoAiAssistantRecommendedItemPlaylistDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(VideoAiAssistantRecommendedItemPlaylistDto.class, parcel, arrayList, i, 1);
            }
            return new VideoAiAssistantRecommendedItemPlaylistDto(videoVideoAlbumFullDto, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantRecommendedItemPlaylistDto[] newArray(int i) {
            return new VideoAiAssistantRecommendedItemPlaylistDto[i];
        }
    }

    public VideoAiAssistantRecommendedItemPlaylistDto(VideoVideoAlbumFullDto videoVideoAlbumFullDto, List<VideoVideoFullDto> list) {
        this.album = videoVideoAlbumFullDto;
        this.videos = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantRecommendedItemPlaylistDto)) {
            return false;
        }
        VideoAiAssistantRecommendedItemPlaylistDto videoAiAssistantRecommendedItemPlaylistDto = (VideoAiAssistantRecommendedItemPlaylistDto) obj;
        return epx.f(this.album, videoAiAssistantRecommendedItemPlaylistDto.album) && epx.f(this.videos, videoAiAssistantRecommendedItemPlaylistDto.videos);
    }

    public final int hashCode() {
        return this.videos.hashCode() + (this.album.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAiAssistantRecommendedItemPlaylistDto(album=");
        sb.append(this.album);
        sb.append(", videos=");
        return ms9.a(')', sb, this.videos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.album, i);
        Iterator a2 = ao.a(parcel, this.videos);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
