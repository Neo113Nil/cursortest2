package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetNextAudiosSourceDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetNextAudiosSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetNextAudiosSourceDto[] $VALUES;

    @pmi0("album")
    public static final AudioGetNextAudiosSourceDto ALBUM;

    @pmi0("catalog")
    public static final AudioGetNextAudiosSourceDto CATALOG;
    public static final Parcelable.Creator<AudioGetNextAudiosSourceDto> CREATOR;

    @pmi0("feed")
    public static final AudioGetNextAudiosSourceDto FEED;

    @pmi0("im")
    public static final AudioGetNextAudiosSourceDto IM;

    @pmi0("music_offline_library")
    public static final AudioGetNextAudiosSourceDto MUSIC_OFFLINE_LIBRARY;

    @pmi0("playlist")
    public static final AudioGetNextAudiosSourceDto PLAYLIST;

    @pmi0("wall")
    public static final AudioGetNextAudiosSourceDto WALL;
    private final String value;

    /* compiled from: AudioGetNextAudiosSourceDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetNextAudiosSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosSourceDto createFromParcel(Parcel parcel) {
            return AudioGetNextAudiosSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetNextAudiosSourceDto[] newArray(int i) {
            return new AudioGetNextAudiosSourceDto[i];
        }
    }

    static {
        AudioGetNextAudiosSourceDto audioGetNextAudiosSourceDto = new AudioGetNextAudiosSourceDto("ALBUM", 0, "album");
        ALBUM = audioGetNextAudiosSourceDto;
        AudioGetNextAudiosSourceDto audioGetNextAudiosSourceDto2 = new AudioGetNextAudiosSourceDto("CATALOG", 1, "catalog");
        CATALOG = audioGetNextAudiosSourceDto2;
        AudioGetNextAudiosSourceDto audioGetNextAudiosSourceDto3 = new AudioGetNextAudiosSourceDto("FEED", 2, "feed");
        FEED = audioGetNextAudiosSourceDto3;
        AudioGetNextAudiosSourceDto audioGetNextAudiosSourceDto4 = new AudioGetNextAudiosSourceDto("IM", 3, "im");
        IM = audioGetNextAudiosSourceDto4;
        AudioGetNextAudiosSourceDto audioGetNextAudiosSourceDto5 = new AudioGetNextAudiosSourceDto("MUSIC_OFFLINE_LIBRARY", 4, "music_offline_library");
        MUSIC_OFFLINE_LIBRARY = audioGetNextAudiosSourceDto5;
        AudioGetNextAudiosSourceDto audioGetNextAudiosSourceDto6 = new AudioGetNextAudiosSourceDto("PLAYLIST", 5, "playlist");
        PLAYLIST = audioGetNextAudiosSourceDto6;
        AudioGetNextAudiosSourceDto audioGetNextAudiosSourceDto7 = new AudioGetNextAudiosSourceDto("WALL", 6, "wall");
        WALL = audioGetNextAudiosSourceDto7;
        AudioGetNextAudiosSourceDto[] audioGetNextAudiosSourceDtoArr = {audioGetNextAudiosSourceDto, audioGetNextAudiosSourceDto2, audioGetNextAudiosSourceDto3, audioGetNextAudiosSourceDto4, audioGetNextAudiosSourceDto5, audioGetNextAudiosSourceDto6, audioGetNextAudiosSourceDto7};
        $VALUES = audioGetNextAudiosSourceDtoArr;
        $ENTRIES = new asp(audioGetNextAudiosSourceDtoArr);
        CREATOR = new a();
    }

    private AudioGetNextAudiosSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioGetNextAudiosSourceDto valueOf(String str) {
        return (AudioGetNextAudiosSourceDto) Enum.valueOf(AudioGetNextAudiosSourceDto.class, str);
    }

    public static AudioGetNextAudiosSourceDto[] values() {
        return (AudioGetNextAudiosSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
