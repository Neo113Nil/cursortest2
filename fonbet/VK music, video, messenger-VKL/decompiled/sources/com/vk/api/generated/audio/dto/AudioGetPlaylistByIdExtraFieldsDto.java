package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetPlaylistByIdExtraFieldsDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetPlaylistByIdExtraFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetPlaylistByIdExtraFieldsDto[] $VALUES;

    @pmi0("album_parts_first_audios")
    public static final AudioGetPlaylistByIdExtraFieldsDto ALBUM_PARTS_FIRST_AUDIOS;

    @pmi0("audio_ids")
    public static final AudioGetPlaylistByIdExtraFieldsDto AUDIO_IDS;
    public static final Parcelable.Creator<AudioGetPlaylistByIdExtraFieldsDto> CREATOR;

    @pmi0("duration")
    public static final AudioGetPlaylistByIdExtraFieldsDto DURATION;

    @pmi0("extra_recommendations_section_id")
    public static final AudioGetPlaylistByIdExtraFieldsDto EXTRA_RECOMMENDATIONS_SECTION_ID;

    @pmi0("owner")
    public static final AudioGetPlaylistByIdExtraFieldsDto OWNER;
    private final String value;

    /* compiled from: AudioGetPlaylistByIdExtraFieldsDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetPlaylistByIdExtraFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetPlaylistByIdExtraFieldsDto createFromParcel(Parcel parcel) {
            return AudioGetPlaylistByIdExtraFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetPlaylistByIdExtraFieldsDto[] newArray(int i) {
            return new AudioGetPlaylistByIdExtraFieldsDto[i];
        }
    }

    static {
        AudioGetPlaylistByIdExtraFieldsDto audioGetPlaylistByIdExtraFieldsDto = new AudioGetPlaylistByIdExtraFieldsDto("ALBUM_PARTS_FIRST_AUDIOS", 0, "album_parts_first_audios");
        ALBUM_PARTS_FIRST_AUDIOS = audioGetPlaylistByIdExtraFieldsDto;
        AudioGetPlaylistByIdExtraFieldsDto audioGetPlaylistByIdExtraFieldsDto2 = new AudioGetPlaylistByIdExtraFieldsDto("AUDIO_IDS", 1, "audio_ids");
        AUDIO_IDS = audioGetPlaylistByIdExtraFieldsDto2;
        AudioGetPlaylistByIdExtraFieldsDto audioGetPlaylistByIdExtraFieldsDto3 = new AudioGetPlaylistByIdExtraFieldsDto("DURATION", 2, "duration");
        DURATION = audioGetPlaylistByIdExtraFieldsDto3;
        AudioGetPlaylistByIdExtraFieldsDto audioGetPlaylistByIdExtraFieldsDto4 = new AudioGetPlaylistByIdExtraFieldsDto("EXTRA_RECOMMENDATIONS_SECTION_ID", 3, "extra_recommendations_section_id");
        EXTRA_RECOMMENDATIONS_SECTION_ID = audioGetPlaylistByIdExtraFieldsDto4;
        AudioGetPlaylistByIdExtraFieldsDto audioGetPlaylistByIdExtraFieldsDto5 = new AudioGetPlaylistByIdExtraFieldsDto("OWNER", 4, "owner");
        OWNER = audioGetPlaylistByIdExtraFieldsDto5;
        AudioGetPlaylistByIdExtraFieldsDto[] audioGetPlaylistByIdExtraFieldsDtoArr = {audioGetPlaylistByIdExtraFieldsDto, audioGetPlaylistByIdExtraFieldsDto2, audioGetPlaylistByIdExtraFieldsDto3, audioGetPlaylistByIdExtraFieldsDto4, audioGetPlaylistByIdExtraFieldsDto5};
        $VALUES = audioGetPlaylistByIdExtraFieldsDtoArr;
        $ENTRIES = new asp(audioGetPlaylistByIdExtraFieldsDtoArr);
        CREATOR = new a();
    }

    private AudioGetPlaylistByIdExtraFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioGetPlaylistByIdExtraFieldsDto valueOf(String str) {
        return (AudioGetPlaylistByIdExtraFieldsDto) Enum.valueOf(AudioGetPlaylistByIdExtraFieldsDto.class, str);
    }

    public static AudioGetPlaylistByIdExtraFieldsDto[] values() {
        return (AudioGetPlaylistByIdExtraFieldsDto[]) $VALUES.clone();
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
