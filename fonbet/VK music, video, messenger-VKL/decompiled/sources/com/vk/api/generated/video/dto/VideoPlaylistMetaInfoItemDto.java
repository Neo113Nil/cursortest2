package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoPlaylistMetaInfoItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoPlaylistMetaInfoItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoPlaylistMetaInfoItemDto> CREATOR = new a();

    @pmi0("avg_pixel")
    private final String avgPixel;

    @pmi0("badge")
    private final String badge;

    @pmi0("first_video_id")
    private final String firstVideoId;

    @pmi0("id")
    private final String id;

    @pmi0("linked_to_playlist_videos")
    private final List<String> linkedToPlaylistVideos;

    @pmi0("toggle_track_code")
    private final String toggleTrackCode;

    /* compiled from: VideoPlaylistMetaInfoItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoPlaylistMetaInfoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoPlaylistMetaInfoItemDto createFromParcel(Parcel parcel) {
            return new VideoPlaylistMetaInfoItemDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPlaylistMetaInfoItemDto[] newArray(int i) {
            return new VideoPlaylistMetaInfoItemDto[i];
        }
    }

    public VideoPlaylistMetaInfoItemDto(String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.id = str;
        this.firstVideoId = str2;
        this.avgPixel = str3;
        this.badge = str4;
        this.toggleTrackCode = str5;
        this.linkedToPlaylistVideos = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPlaylistMetaInfoItemDto)) {
            return false;
        }
        VideoPlaylistMetaInfoItemDto videoPlaylistMetaInfoItemDto = (VideoPlaylistMetaInfoItemDto) obj;
        return epx.f(this.id, videoPlaylistMetaInfoItemDto.id) && epx.f(this.firstVideoId, videoPlaylistMetaInfoItemDto.firstVideoId) && epx.f(this.avgPixel, videoPlaylistMetaInfoItemDto.avgPixel) && epx.f(this.badge, videoPlaylistMetaInfoItemDto.badge) && epx.f(this.toggleTrackCode, videoPlaylistMetaInfoItemDto.toggleTrackCode) && epx.f(this.linkedToPlaylistVideos, videoPlaylistMetaInfoItemDto.linkedToPlaylistVideos);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.firstVideoId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avgPixel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badge;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toggleTrackCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.linkedToPlaylistVideos;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlaylistMetaInfoItemDto(id=");
        sb.append(this.id);
        sb.append(", firstVideoId=");
        sb.append(this.firstVideoId);
        sb.append(", avgPixel=");
        sb.append(this.avgPixel);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", toggleTrackCode=");
        sb.append(this.toggleTrackCode);
        sb.append(", linkedToPlaylistVideos=");
        return ms9.a(')', sb, this.linkedToPlaylistVideos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.firstVideoId);
        parcel.writeString(this.avgPixel);
        parcel.writeString(this.badge);
        parcel.writeString(this.toggleTrackCode);
        parcel.writeStringList(this.linkedToPlaylistVideos);
    }

    public /* synthetic */ VideoPlaylistMetaInfoItemDto(String str, String str2, String str3, String str4, String str5, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list);
    }
}
