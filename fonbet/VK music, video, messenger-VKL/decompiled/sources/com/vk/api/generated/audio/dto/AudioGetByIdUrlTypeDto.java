package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioGetByIdUrlTypeDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetByIdUrlTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioGetByIdUrlTypeDto[] $VALUES;
    public static final Parcelable.Creator<AudioGetByIdUrlTypeDto> CREATOR;

    @pmi0("snippet")
    public static final AudioGetByIdUrlTypeDto SNIPPET;
    private final String value;

    /* compiled from: AudioGetByIdUrlTypeDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetByIdUrlTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetByIdUrlTypeDto createFromParcel(Parcel parcel) {
            return AudioGetByIdUrlTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetByIdUrlTypeDto[] newArray(int i) {
            return new AudioGetByIdUrlTypeDto[i];
        }
    }

    static {
        AudioGetByIdUrlTypeDto audioGetByIdUrlTypeDto = new AudioGetByIdUrlTypeDto("SNIPPET", 0, "snippet");
        SNIPPET = audioGetByIdUrlTypeDto;
        AudioGetByIdUrlTypeDto[] audioGetByIdUrlTypeDtoArr = {audioGetByIdUrlTypeDto};
        $VALUES = audioGetByIdUrlTypeDtoArr;
        $ENTRIES = new asp(audioGetByIdUrlTypeDtoArr);
        CREATOR = new a();
    }

    private AudioGetByIdUrlTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioGetByIdUrlTypeDto valueOf(String str) {
        return (AudioGetByIdUrlTypeDto) Enum.valueOf(AudioGetByIdUrlTypeDto.class, str);
    }

    public static AudioGetByIdUrlTypeDto[] values() {
        return (AudioGetByIdUrlTypeDto[]) $VALUES.clone();
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
