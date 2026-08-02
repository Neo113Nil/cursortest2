package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetAudiosByArtistTypeDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetAudiosByArtistTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetAudiosByArtistTypeDto[] $VALUES;
    public static final Parcelable.Creator<AudioGetAudiosByArtistTypeDto> CREATOR;

    @pmi0("featured")
    public static final AudioGetAudiosByArtistTypeDto FEATURED;

    @pmi0(X3.i.Z)
    public static final AudioGetAudiosByArtistTypeDto MAIN;

    @pmi0("snippet")
    public static final AudioGetAudiosByArtistTypeDto SNIPPET;

    @pmi0("top")
    public static final AudioGetAudiosByArtistTypeDto TOP;
    private final String value;

    /* compiled from: AudioGetAudiosByArtistTypeDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetAudiosByArtistTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetAudiosByArtistTypeDto createFromParcel(Parcel parcel) {
            return AudioGetAudiosByArtistTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetAudiosByArtistTypeDto[] newArray(int i) {
            return new AudioGetAudiosByArtistTypeDto[i];
        }
    }

    static {
        AudioGetAudiosByArtistTypeDto audioGetAudiosByArtistTypeDto = new AudioGetAudiosByArtistTypeDto("FEATURED", 0, "featured");
        FEATURED = audioGetAudiosByArtistTypeDto;
        AudioGetAudiosByArtistTypeDto audioGetAudiosByArtistTypeDto2 = new AudioGetAudiosByArtistTypeDto("MAIN", 1, X3.i.Z);
        MAIN = audioGetAudiosByArtistTypeDto2;
        AudioGetAudiosByArtistTypeDto audioGetAudiosByArtistTypeDto3 = new AudioGetAudiosByArtistTypeDto("SNIPPET", 2, "snippet");
        SNIPPET = audioGetAudiosByArtistTypeDto3;
        AudioGetAudiosByArtistTypeDto audioGetAudiosByArtistTypeDto4 = new AudioGetAudiosByArtistTypeDto("TOP", 3, "top");
        TOP = audioGetAudiosByArtistTypeDto4;
        AudioGetAudiosByArtistTypeDto[] audioGetAudiosByArtistTypeDtoArr = {audioGetAudiosByArtistTypeDto, audioGetAudiosByArtistTypeDto2, audioGetAudiosByArtistTypeDto3, audioGetAudiosByArtistTypeDto4};
        $VALUES = audioGetAudiosByArtistTypeDtoArr;
        $ENTRIES = new asp(audioGetAudiosByArtistTypeDtoArr);
        CREATOR = new a();
    }

    private AudioGetAudiosByArtistTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioGetAudiosByArtistTypeDto valueOf(String str) {
        return (AudioGetAudiosByArtistTypeDto) Enum.valueOf(AudioGetAudiosByArtistTypeDto.class, str);
    }

    public static AudioGetAudiosByArtistTypeDto[] values() {
        return (AudioGetAudiosByArtistTypeDto[]) $VALUES.clone();
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
