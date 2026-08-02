package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioPlaylistViewDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistViewDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioPlaylistViewDto[] $VALUES;

    @pmi0("compact")
    public static final AudioPlaylistViewDto COMPACT;
    public static final Parcelable.Creator<AudioPlaylistViewDto> CREATOR;
    private final String value;

    /* compiled from: AudioPlaylistViewDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistViewDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistViewDto createFromParcel(Parcel parcel) {
            return AudioPlaylistViewDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistViewDto[] newArray(int i) {
            return new AudioPlaylistViewDto[i];
        }
    }

    static {
        AudioPlaylistViewDto audioPlaylistViewDto = new AudioPlaylistViewDto("COMPACT", 0, "compact");
        COMPACT = audioPlaylistViewDto;
        AudioPlaylistViewDto[] audioPlaylistViewDtoArr = {audioPlaylistViewDto};
        $VALUES = audioPlaylistViewDtoArr;
        $ENTRIES = new asp(audioPlaylistViewDtoArr);
        CREATOR = new a();
    }

    private AudioPlaylistViewDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioPlaylistViewDto valueOf(String str) {
        return (AudioPlaylistViewDto) Enum.valueOf(AudioPlaylistViewDto.class, str);
    }

    public static AudioPlaylistViewDto[] values() {
        return (AudioPlaylistViewDto[]) $VALUES.clone();
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
