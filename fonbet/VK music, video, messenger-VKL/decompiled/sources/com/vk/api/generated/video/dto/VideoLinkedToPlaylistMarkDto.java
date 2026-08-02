package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLinkedToPlaylistMarkDto.kt */
/* loaded from: classes15.dex */
public final class VideoLinkedToPlaylistMarkDto implements Parcelable {
    public static final Parcelable.Creator<VideoLinkedToPlaylistMarkDto> CREATOR = new a();

    @pmi0("playlist_id")
    private final String playlistId;

    @pmi0("playlist_name")
    private final String playlistName;

    /* compiled from: VideoLinkedToPlaylistMarkDto.kt */
    public static final class a implements Parcelable.Creator<VideoLinkedToPlaylistMarkDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLinkedToPlaylistMarkDto createFromParcel(Parcel parcel) {
            return new VideoLinkedToPlaylistMarkDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLinkedToPlaylistMarkDto[] newArray(int i) {
            return new VideoLinkedToPlaylistMarkDto[i];
        }
    }

    public VideoLinkedToPlaylistMarkDto(String str, String str2) {
        this.playlistId = str;
        this.playlistName = str2;
    }

    public final String d() {
        return this.playlistId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLinkedToPlaylistMarkDto)) {
            return false;
        }
        VideoLinkedToPlaylistMarkDto videoLinkedToPlaylistMarkDto = (VideoLinkedToPlaylistMarkDto) obj;
        return epx.f(this.playlistId, videoLinkedToPlaylistMarkDto.playlistId) && epx.f(this.playlistName, videoLinkedToPlaylistMarkDto.playlistName);
    }

    public final int hashCode() {
        int hashCode = this.playlistId.hashCode() * 31;
        String str = this.playlistName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoLinkedToPlaylistMarkDto(playlistId=");
        sb.append(this.playlistId);
        sb.append(", playlistName=");
        return ho8.a(sb, this.playlistName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.playlistId);
        parcel.writeString(this.playlistName);
    }

    public /* synthetic */ VideoLinkedToPlaylistMarkDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
