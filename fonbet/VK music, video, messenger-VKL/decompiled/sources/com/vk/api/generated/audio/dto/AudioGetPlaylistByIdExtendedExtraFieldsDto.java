package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetPlaylistByIdExtendedExtraFieldsDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetPlaylistByIdExtendedExtraFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetPlaylistByIdExtendedExtraFieldsDto[] $VALUES;

    @pmi0("album_parts_first_audios")
    public static final AudioGetPlaylistByIdExtendedExtraFieldsDto ALBUM_PARTS_FIRST_AUDIOS;

    @pmi0("audio_ids")
    public static final AudioGetPlaylistByIdExtendedExtraFieldsDto AUDIO_IDS;
    public static final Parcelable.Creator<AudioGetPlaylistByIdExtendedExtraFieldsDto> CREATOR;

    @pmi0("duration")
    public static final AudioGetPlaylistByIdExtendedExtraFieldsDto DURATION;

    @pmi0("extra_recommendations_section_id")
    public static final AudioGetPlaylistByIdExtendedExtraFieldsDto EXTRA_RECOMMENDATIONS_SECTION_ID;

    @pmi0("owner")
    public static final AudioGetPlaylistByIdExtendedExtraFieldsDto OWNER;
    private final String value;

    /* compiled from: AudioGetPlaylistByIdExtendedExtraFieldsDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetPlaylistByIdExtendedExtraFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetPlaylistByIdExtendedExtraFieldsDto createFromParcel(Parcel parcel) {
            return AudioGetPlaylistByIdExtendedExtraFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetPlaylistByIdExtendedExtraFieldsDto[] newArray(int i) {
            return new AudioGetPlaylistByIdExtendedExtraFieldsDto[i];
        }
    }

    static {
        AudioGetPlaylistByIdExtendedExtraFieldsDto audioGetPlaylistByIdExtendedExtraFieldsDto = new AudioGetPlaylistByIdExtendedExtraFieldsDto("ALBUM_PARTS_FIRST_AUDIOS", 0, "album_parts_first_audios");
        ALBUM_PARTS_FIRST_AUDIOS = audioGetPlaylistByIdExtendedExtraFieldsDto;
        AudioGetPlaylistByIdExtendedExtraFieldsDto audioGetPlaylistByIdExtendedExtraFieldsDto2 = new AudioGetPlaylistByIdExtendedExtraFieldsDto("AUDIO_IDS", 1, "audio_ids");
        AUDIO_IDS = audioGetPlaylistByIdExtendedExtraFieldsDto2;
        AudioGetPlaylistByIdExtendedExtraFieldsDto audioGetPlaylistByIdExtendedExtraFieldsDto3 = new AudioGetPlaylistByIdExtendedExtraFieldsDto("DURATION", 2, "duration");
        DURATION = audioGetPlaylistByIdExtendedExtraFieldsDto3;
        AudioGetPlaylistByIdExtendedExtraFieldsDto audioGetPlaylistByIdExtendedExtraFieldsDto4 = new AudioGetPlaylistByIdExtendedExtraFieldsDto("EXTRA_RECOMMENDATIONS_SECTION_ID", 3, "extra_recommendations_section_id");
        EXTRA_RECOMMENDATIONS_SECTION_ID = audioGetPlaylistByIdExtendedExtraFieldsDto4;
        AudioGetPlaylistByIdExtendedExtraFieldsDto audioGetPlaylistByIdExtendedExtraFieldsDto5 = new AudioGetPlaylistByIdExtendedExtraFieldsDto("OWNER", 4, "owner");
        OWNER = audioGetPlaylistByIdExtendedExtraFieldsDto5;
        AudioGetPlaylistByIdExtendedExtraFieldsDto[] audioGetPlaylistByIdExtendedExtraFieldsDtoArr = {audioGetPlaylistByIdExtendedExtraFieldsDto, audioGetPlaylistByIdExtendedExtraFieldsDto2, audioGetPlaylistByIdExtendedExtraFieldsDto3, audioGetPlaylistByIdExtendedExtraFieldsDto4, audioGetPlaylistByIdExtendedExtraFieldsDto5};
        $VALUES = audioGetPlaylistByIdExtendedExtraFieldsDtoArr;
        $ENTRIES = new asp(audioGetPlaylistByIdExtendedExtraFieldsDtoArr);
        CREATOR = new a();
    }

    private AudioGetPlaylistByIdExtendedExtraFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioGetPlaylistByIdExtendedExtraFieldsDto valueOf(String str) {
        return (AudioGetPlaylistByIdExtendedExtraFieldsDto) Enum.valueOf(AudioGetPlaylistByIdExtendedExtraFieldsDto.class, str);
    }

    public static AudioGetPlaylistByIdExtendedExtraFieldsDto[] values() {
        return (AudioGetPlaylistByIdExtendedExtraFieldsDto[]) $VALUES.clone();
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
