package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoChannelsGetViewSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsGetViewSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsGetViewSettingsResponseDto> CREATOR = new a();

    @pmi0("is_music_enabled")
    private final boolean isMusicEnabled;

    @pmi0("pinned_non_subscriber_video_raw_id")
    private final String pinnedNonSubscriberVideoRawId;

    @pmi0("pinned_short_video_raw_id")
    private final String pinnedShortVideoRawId;

    @pmi0("pinned_subscriber_video_raw_id")
    private final String pinnedSubscriberVideoRawId;

    @pmi0("playlists")
    private final List<String> playlists;

    /* compiled from: VideoChannelsGetViewSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsGetViewSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetViewSettingsResponseDto createFromParcel(Parcel parcel) {
            return new VideoChannelsGetViewSettingsResponseDto(parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetViewSettingsResponseDto[] newArray(int i) {
            return new VideoChannelsGetViewSettingsResponseDto[i];
        }
    }

    public VideoChannelsGetViewSettingsResponseDto(boolean z, List<String> list, String str, String str2, String str3) {
        this.isMusicEnabled = z;
        this.playlists = list;
        this.pinnedShortVideoRawId = str;
        this.pinnedSubscriberVideoRawId = str2;
        this.pinnedNonSubscriberVideoRawId = str3;
    }

    public final String d() {
        return this.pinnedShortVideoRawId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsGetViewSettingsResponseDto)) {
            return false;
        }
        VideoChannelsGetViewSettingsResponseDto videoChannelsGetViewSettingsResponseDto = (VideoChannelsGetViewSettingsResponseDto) obj;
        return this.isMusicEnabled == videoChannelsGetViewSettingsResponseDto.isMusicEnabled && epx.f(this.playlists, videoChannelsGetViewSettingsResponseDto.playlists) && epx.f(this.pinnedShortVideoRawId, videoChannelsGetViewSettingsResponseDto.pinnedShortVideoRawId) && epx.f(this.pinnedSubscriberVideoRawId, videoChannelsGetViewSettingsResponseDto.pinnedSubscriberVideoRawId) && epx.f(this.pinnedNonSubscriberVideoRawId, videoChannelsGetViewSettingsResponseDto.pinnedNonSubscriberVideoRawId);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isMusicEnabled) * 31;
        List<String> list = this.playlists;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.pinnedShortVideoRawId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pinnedSubscriberVideoRawId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pinnedNonSubscriberVideoRawId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsGetViewSettingsResponseDto(isMusicEnabled=");
        sb.append(this.isMusicEnabled);
        sb.append(", playlists=");
        sb.append(this.playlists);
        sb.append(", pinnedShortVideoRawId=");
        sb.append(this.pinnedShortVideoRawId);
        sb.append(", pinnedSubscriberVideoRawId=");
        sb.append(this.pinnedSubscriberVideoRawId);
        sb.append(", pinnedNonSubscriberVideoRawId=");
        return ho8.a(sb, this.pinnedNonSubscriberVideoRawId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isMusicEnabled ? 1 : 0);
        parcel.writeStringList(this.playlists);
        parcel.writeString(this.pinnedShortVideoRawId);
        parcel.writeString(this.pinnedSubscriberVideoRawId);
        parcel.writeString(this.pinnedNonSubscriberVideoRawId);
    }

    public /* synthetic */ VideoChannelsGetViewSettingsResponseDto(boolean z, List list, String str, String str2, String str3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
