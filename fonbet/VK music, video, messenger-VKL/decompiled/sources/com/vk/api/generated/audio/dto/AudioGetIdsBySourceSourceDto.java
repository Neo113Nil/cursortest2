package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetIdsBySourceSourceDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetIdsBySourceSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetIdsBySourceSourceDto[] $VALUES;

    @pmi0("artist")
    public static final AudioGetIdsBySourceSourceDto ARTIST;

    @pmi0("catalog")
    public static final AudioGetIdsBySourceSourceDto CATALOG;
    public static final Parcelable.Creator<AudioGetIdsBySourceSourceDto> CREATOR;

    @pmi0("curator")
    public static final AudioGetIdsBySourceSourceDto CURATOR;

    @pmi0("feed")
    public static final AudioGetIdsBySourceSourceDto FEED;

    @pmi0("im")
    public static final AudioGetIdsBySourceSourceDto IM;

    @pmi0("playlist")
    public static final AudioGetIdsBySourceSourceDto PLAYLIST;

    @pmi0("podcasts_popular")
    public static final AudioGetIdsBySourceSourceDto PODCASTS_POPULAR;

    @pmi0("podcasts_recent")
    public static final AudioGetIdsBySourceSourceDto PODCASTS_RECENT;

    @pmi0("similar_track")
    public static final AudioGetIdsBySourceSourceDto SIMILAR_TRACK;

    @pmi0("wall")
    public static final AudioGetIdsBySourceSourceDto WALL;
    private final String value;

    /* compiled from: AudioGetIdsBySourceSourceDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetIdsBySourceSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetIdsBySourceSourceDto createFromParcel(Parcel parcel) {
            return AudioGetIdsBySourceSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetIdsBySourceSourceDto[] newArray(int i) {
            return new AudioGetIdsBySourceSourceDto[i];
        }
    }

    static {
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto = new AudioGetIdsBySourceSourceDto("ARTIST", 0, "artist");
        ARTIST = audioGetIdsBySourceSourceDto;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto2 = new AudioGetIdsBySourceSourceDto("CATALOG", 1, "catalog");
        CATALOG = audioGetIdsBySourceSourceDto2;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto3 = new AudioGetIdsBySourceSourceDto("CURATOR", 2, "curator");
        CURATOR = audioGetIdsBySourceSourceDto3;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto4 = new AudioGetIdsBySourceSourceDto("FEED", 3, "feed");
        FEED = audioGetIdsBySourceSourceDto4;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto5 = new AudioGetIdsBySourceSourceDto("IM", 4, "im");
        IM = audioGetIdsBySourceSourceDto5;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto6 = new AudioGetIdsBySourceSourceDto("PLAYLIST", 5, "playlist");
        PLAYLIST = audioGetIdsBySourceSourceDto6;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto7 = new AudioGetIdsBySourceSourceDto("SIMILAR_TRACK", 6, "similar_track");
        SIMILAR_TRACK = audioGetIdsBySourceSourceDto7;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto8 = new AudioGetIdsBySourceSourceDto("WALL", 7, "wall");
        WALL = audioGetIdsBySourceSourceDto8;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto9 = new AudioGetIdsBySourceSourceDto("PODCASTS_RECENT", 8, "podcasts_recent");
        PODCASTS_RECENT = audioGetIdsBySourceSourceDto9;
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto10 = new AudioGetIdsBySourceSourceDto("PODCASTS_POPULAR", 9, "podcasts_popular");
        PODCASTS_POPULAR = audioGetIdsBySourceSourceDto10;
        AudioGetIdsBySourceSourceDto[] audioGetIdsBySourceSourceDtoArr = {audioGetIdsBySourceSourceDto, audioGetIdsBySourceSourceDto2, audioGetIdsBySourceSourceDto3, audioGetIdsBySourceSourceDto4, audioGetIdsBySourceSourceDto5, audioGetIdsBySourceSourceDto6, audioGetIdsBySourceSourceDto7, audioGetIdsBySourceSourceDto8, audioGetIdsBySourceSourceDto9, audioGetIdsBySourceSourceDto10};
        $VALUES = audioGetIdsBySourceSourceDtoArr;
        $ENTRIES = new asp(audioGetIdsBySourceSourceDtoArr);
        CREATOR = new a();
    }

    private AudioGetIdsBySourceSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AudioGetIdsBySourceSourceDto> i() {
        return $ENTRIES;
    }

    public static AudioGetIdsBySourceSourceDto valueOf(String str) {
        return (AudioGetIdsBySourceSourceDto) Enum.valueOf(AudioGetIdsBySourceSourceDto.class, str);
    }

    public static AudioGetIdsBySourceSourceDto[] values() {
        return (AudioGetIdsBySourceSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
