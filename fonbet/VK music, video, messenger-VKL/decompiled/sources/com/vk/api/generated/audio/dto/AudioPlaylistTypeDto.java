package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioPlaylistTypeDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioPlaylistTypeDto[] $VALUES;

    @pmi0("album")
    public static final AudioPlaylistTypeDto ALBUM;

    @pmi0("chat")
    public static final AudioPlaylistTypeDto CHAT;
    public static final Parcelable.Creator<AudioPlaylistTypeDto> CREATOR;

    @pmi0("generated")
    public static final AudioPlaylistTypeDto GENERATED;

    @pmi0("ugc")
    public static final AudioPlaylistTypeDto UGC;
    private final String value;

    /* compiled from: AudioPlaylistTypeDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistTypeDto createFromParcel(Parcel parcel) {
            return AudioPlaylistTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistTypeDto[] newArray(int i) {
            return new AudioPlaylistTypeDto[i];
        }
    }

    static {
        AudioPlaylistTypeDto audioPlaylistTypeDto = new AudioPlaylistTypeDto("GENERATED", 0, "generated");
        GENERATED = audioPlaylistTypeDto;
        AudioPlaylistTypeDto audioPlaylistTypeDto2 = new AudioPlaylistTypeDto("CHAT", 1, "chat");
        CHAT = audioPlaylistTypeDto2;
        AudioPlaylistTypeDto audioPlaylistTypeDto3 = new AudioPlaylistTypeDto("UGC", 2, "ugc");
        UGC = audioPlaylistTypeDto3;
        AudioPlaylistTypeDto audioPlaylistTypeDto4 = new AudioPlaylistTypeDto("ALBUM", 3, "album");
        ALBUM = audioPlaylistTypeDto4;
        AudioPlaylistTypeDto[] audioPlaylistTypeDtoArr = {audioPlaylistTypeDto, audioPlaylistTypeDto2, audioPlaylistTypeDto3, audioPlaylistTypeDto4};
        $VALUES = audioPlaylistTypeDtoArr;
        $ENTRIES = new asp(audioPlaylistTypeDtoArr);
        CREATOR = new a();
    }

    private AudioPlaylistTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioPlaylistTypeDto valueOf(String str) {
        return (AudioPlaylistTypeDto) Enum.valueOf(AudioPlaylistTypeDto.class, str);
    }

    public static AudioPlaylistTypeDto[] values() {
        return (AudioPlaylistTypeDto[]) $VALUES.clone();
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
