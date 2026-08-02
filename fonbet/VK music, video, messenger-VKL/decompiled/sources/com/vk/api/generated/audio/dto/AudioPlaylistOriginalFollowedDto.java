package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioPlaylistOriginalFollowedDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistOriginalFollowedDto implements Parcelable {
    public static final Parcelable.Creator<AudioPlaylistOriginalFollowedDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("playlist_id")
    private final int playlistId;

    /* compiled from: AudioPlaylistOriginalFollowedDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistOriginalFollowedDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistOriginalFollowedDto createFromParcel(Parcel parcel) {
            return new AudioPlaylistOriginalFollowedDto(parcel.readInt(), (UserId) parcel.readParcelable(AudioPlaylistOriginalFollowedDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistOriginalFollowedDto[] newArray(int i) {
            return new AudioPlaylistOriginalFollowedDto[i];
        }
    }

    public AudioPlaylistOriginalFollowedDto(int i, UserId userId, String str) {
        this.playlistId = i;
        this.ownerId = userId;
        this.accessKey = str;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.playlistId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistOriginalFollowedDto)) {
            return false;
        }
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto = (AudioPlaylistOriginalFollowedDto) obj;
        return this.playlistId == audioPlaylistOriginalFollowedDto.playlistId && epx.f(this.ownerId, audioPlaylistOriginalFollowedDto.ownerId) && epx.f(this.accessKey, audioPlaylistOriginalFollowedDto.accessKey);
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.playlistId) * 31, 31, this.ownerId.b);
        String str = this.accessKey;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylistOriginalFollowedDto(playlistId=");
        sb.append(this.playlistId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", accessKey=");
        return ho8.a(sb, this.accessKey, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.playlistId);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.accessKey);
    }

    public /* synthetic */ AudioPlaylistOriginalFollowedDto(int i, UserId userId, String str, int i2, zcl zclVar) {
        this(i, userId, (i2 & 4) != 0 ? null : str);
    }
}
