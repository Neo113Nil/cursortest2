package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioPreviewSnippetTypeDto.kt */
/* loaded from: classes14.dex */
public final class AudioPreviewSnippetTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioPreviewSnippetTypeDto[] $VALUES;

    @pmi0("album")
    public static final AudioPreviewSnippetTypeDto ALBUM;

    @pmi0("album_mix")
    public static final AudioPreviewSnippetTypeDto ALBUM_MIX;

    @pmi0("artist")
    public static final AudioPreviewSnippetTypeDto ARTIST;

    @pmi0("artist_mix")
    public static final AudioPreviewSnippetTypeDto ARTIST_MIX;
    public static final Parcelable.Creator<AudioPreviewSnippetTypeDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final AudioPreviewSnippetTypeDto DEFAULT;

    @pmi0("exclusive_album")
    public static final AudioPreviewSnippetTypeDto EXCLUSIVE_ALBUM;

    @pmi0("playlist")
    public static final AudioPreviewSnippetTypeDto PLAYLIST;

    @pmi0("playlist_mix")
    public static final AudioPreviewSnippetTypeDto PLAYLIST_MIX;

    @pmi0("track_mix")
    public static final AudioPreviewSnippetTypeDto TRACK_MIX;
    private final String value;

    /* compiled from: AudioPreviewSnippetTypeDto.kt */
    public static final class a implements Parcelable.Creator<AudioPreviewSnippetTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPreviewSnippetTypeDto createFromParcel(Parcel parcel) {
            return AudioPreviewSnippetTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPreviewSnippetTypeDto[] newArray(int i) {
            return new AudioPreviewSnippetTypeDto[i];
        }
    }

    static {
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto = new AudioPreviewSnippetTypeDto("ALBUM", 0, "album");
        ALBUM = audioPreviewSnippetTypeDto;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto2 = new AudioPreviewSnippetTypeDto("PLAYLIST", 1, "playlist");
        PLAYLIST = audioPreviewSnippetTypeDto2;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto3 = new AudioPreviewSnippetTypeDto("ARTIST", 2, "artist");
        ARTIST = audioPreviewSnippetTypeDto3;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto4 = new AudioPreviewSnippetTypeDto("PLAYLIST_MIX", 3, "playlist_mix");
        PLAYLIST_MIX = audioPreviewSnippetTypeDto4;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto5 = new AudioPreviewSnippetTypeDto("TRACK_MIX", 4, "track_mix");
        TRACK_MIX = audioPreviewSnippetTypeDto5;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto6 = new AudioPreviewSnippetTypeDto("ALBUM_MIX", 5, "album_mix");
        ALBUM_MIX = audioPreviewSnippetTypeDto6;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto7 = new AudioPreviewSnippetTypeDto("ARTIST_MIX", 6, "artist_mix");
        ARTIST_MIX = audioPreviewSnippetTypeDto7;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto8 = new AudioPreviewSnippetTypeDto("EXCLUSIVE_ALBUM", 7, "exclusive_album");
        EXCLUSIVE_ALBUM = audioPreviewSnippetTypeDto8;
        AudioPreviewSnippetTypeDto audioPreviewSnippetTypeDto9 = new AudioPreviewSnippetTypeDto("DEFAULT", 8, BuildConfig.FLAVOR);
        DEFAULT = audioPreviewSnippetTypeDto9;
        AudioPreviewSnippetTypeDto[] audioPreviewSnippetTypeDtoArr = {audioPreviewSnippetTypeDto, audioPreviewSnippetTypeDto2, audioPreviewSnippetTypeDto3, audioPreviewSnippetTypeDto4, audioPreviewSnippetTypeDto5, audioPreviewSnippetTypeDto6, audioPreviewSnippetTypeDto7, audioPreviewSnippetTypeDto8, audioPreviewSnippetTypeDto9};
        $VALUES = audioPreviewSnippetTypeDtoArr;
        $ENTRIES = new asp(audioPreviewSnippetTypeDtoArr);
        CREATOR = new a();
    }

    private AudioPreviewSnippetTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioPreviewSnippetTypeDto valueOf(String str) {
        return (AudioPreviewSnippetTypeDto) Enum.valueOf(AudioPreviewSnippetTypeDto.class, str);
    }

    public static AudioPreviewSnippetTypeDto[] values() {
        return (AudioPreviewSnippetTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
