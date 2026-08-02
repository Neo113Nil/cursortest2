package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetAudioPreviewUrlPreviewTypeDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetAudioPreviewUrlPreviewTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetAudioPreviewUrlPreviewTypeDto[] $VALUES;
    public static final Parcelable.Creator<AudioGetAudioPreviewUrlPreviewTypeDto> CREATOR;

    @pmi0("longtap")
    public static final AudioGetAudioPreviewUrlPreviewTypeDto LONGTAP;

    @pmi0("snippet")
    public static final AudioGetAudioPreviewUrlPreviewTypeDto SNIPPET;
    private final String value;

    /* compiled from: AudioGetAudioPreviewUrlPreviewTypeDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetAudioPreviewUrlPreviewTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioPreviewUrlPreviewTypeDto createFromParcel(Parcel parcel) {
            return AudioGetAudioPreviewUrlPreviewTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetAudioPreviewUrlPreviewTypeDto[] newArray(int i) {
            return new AudioGetAudioPreviewUrlPreviewTypeDto[i];
        }
    }

    static {
        AudioGetAudioPreviewUrlPreviewTypeDto audioGetAudioPreviewUrlPreviewTypeDto = new AudioGetAudioPreviewUrlPreviewTypeDto("LONGTAP", 0, "longtap");
        LONGTAP = audioGetAudioPreviewUrlPreviewTypeDto;
        AudioGetAudioPreviewUrlPreviewTypeDto audioGetAudioPreviewUrlPreviewTypeDto2 = new AudioGetAudioPreviewUrlPreviewTypeDto("SNIPPET", 1, "snippet");
        SNIPPET = audioGetAudioPreviewUrlPreviewTypeDto2;
        AudioGetAudioPreviewUrlPreviewTypeDto[] audioGetAudioPreviewUrlPreviewTypeDtoArr = {audioGetAudioPreviewUrlPreviewTypeDto, audioGetAudioPreviewUrlPreviewTypeDto2};
        $VALUES = audioGetAudioPreviewUrlPreviewTypeDtoArr;
        $ENTRIES = new asp(audioGetAudioPreviewUrlPreviewTypeDtoArr);
        CREATOR = new a();
    }

    private AudioGetAudioPreviewUrlPreviewTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AudioGetAudioPreviewUrlPreviewTypeDto> i() {
        return $ENTRIES;
    }

    public static AudioGetAudioPreviewUrlPreviewTypeDto valueOf(String str) {
        return (AudioGetAudioPreviewUrlPreviewTypeDto) Enum.valueOf(AudioGetAudioPreviewUrlPreviewTypeDto.class, str);
    }

    public static AudioGetAudioPreviewUrlPreviewTypeDto[] values() {
        return (AudioGetAudioPreviewUrlPreviewTypeDto[]) $VALUES.clone();
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
