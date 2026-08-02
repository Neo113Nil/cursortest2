package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetAudioIdsBySourceSourceDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetAudioIdsBySourceSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetAudioIdsBySourceSourceDto[] $VALUES;

    @pmi0("artist")
    public static final AudioGetAudioIdsBySourceSourceDto ARTIST;

    @pmi0("catalog")
    public static final AudioGetAudioIdsBySourceSourceDto CATALOG;
    public static final Parcelable.Creator<AudioGetAudioIdsBySourceSourceDto> CREATOR;

    @pmi0("curator")
    public static final AudioGetAudioIdsBySourceSourceDto CURATOR;

    @pmi0("feed")
    public static final AudioGetAudioIdsBySourceSourceDto FEED;

    @pmi0("im")
    public static final AudioGetAudioIdsBySourceSourceDto IM;

    @pmi0("playlist")
    public static final AudioGetAudioIdsBySourceSourceDto PLAYLIST;

    @pmi0("similar_track")
    public static final AudioGetAudioIdsBySourceSourceDto SIMILAR_TRACK;

    @pmi0("wall")
    public static final AudioGetAudioIdsBySourceSourceDto WALL;
    private final String value;

    /* compiled from: AudioGetAudioIdsBySourceSourceDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetAudioIdsBySourceSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioIdsBySourceSourceDto createFromParcel(Parcel parcel) {
            return AudioGetAudioIdsBySourceSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioIdsBySourceSourceDto[] newArray(int i) {
            return new AudioGetAudioIdsBySourceSourceDto[i];
        }
    }

    static {
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto = new AudioGetAudioIdsBySourceSourceDto("ARTIST", 0, "artist");
        ARTIST = audioGetAudioIdsBySourceSourceDto;
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto2 = new AudioGetAudioIdsBySourceSourceDto("CATALOG", 1, "catalog");
        CATALOG = audioGetAudioIdsBySourceSourceDto2;
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto3 = new AudioGetAudioIdsBySourceSourceDto("CURATOR", 2, "curator");
        CURATOR = audioGetAudioIdsBySourceSourceDto3;
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto4 = new AudioGetAudioIdsBySourceSourceDto("FEED", 3, "feed");
        FEED = audioGetAudioIdsBySourceSourceDto4;
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto5 = new AudioGetAudioIdsBySourceSourceDto("IM", 4, "im");
        IM = audioGetAudioIdsBySourceSourceDto5;
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto6 = new AudioGetAudioIdsBySourceSourceDto("PLAYLIST", 5, "playlist");
        PLAYLIST = audioGetAudioIdsBySourceSourceDto6;
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto7 = new AudioGetAudioIdsBySourceSourceDto("SIMILAR_TRACK", 6, "similar_track");
        SIMILAR_TRACK = audioGetAudioIdsBySourceSourceDto7;
        AudioGetAudioIdsBySourceSourceDto audioGetAudioIdsBySourceSourceDto8 = new AudioGetAudioIdsBySourceSourceDto("WALL", 7, "wall");
        WALL = audioGetAudioIdsBySourceSourceDto8;
        AudioGetAudioIdsBySourceSourceDto[] audioGetAudioIdsBySourceSourceDtoArr = {audioGetAudioIdsBySourceSourceDto, audioGetAudioIdsBySourceSourceDto2, audioGetAudioIdsBySourceSourceDto3, audioGetAudioIdsBySourceSourceDto4, audioGetAudioIdsBySourceSourceDto5, audioGetAudioIdsBySourceSourceDto6, audioGetAudioIdsBySourceSourceDto7, audioGetAudioIdsBySourceSourceDto8};
        $VALUES = audioGetAudioIdsBySourceSourceDtoArr;
        $ENTRIES = new asp(audioGetAudioIdsBySourceSourceDtoArr);
        CREATOR = new a();
    }

    private AudioGetAudioIdsBySourceSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioGetAudioIdsBySourceSourceDto valueOf(String str) {
        return (AudioGetAudioIdsBySourceSourceDto) Enum.valueOf(AudioGetAudioIdsBySourceSourceDto.class, str);
    }

    public static AudioGetAudioIdsBySourceSourceDto[] values() {
        return (AudioGetAudioIdsBySourceSourceDto[]) $VALUES.clone();
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
