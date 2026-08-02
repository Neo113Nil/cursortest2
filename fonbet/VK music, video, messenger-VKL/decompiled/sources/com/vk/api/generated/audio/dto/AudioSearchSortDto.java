package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioSearchSortDto.kt */
/* loaded from: classes14.dex */
public final class AudioSearchSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioSearchSortDto[] $VALUES;
    public static final Parcelable.Creator<AudioSearchSortDto> CREATOR;

    @pmi0("0")
    public static final AudioSearchSortDto DATE_ADDED;

    @pmi0("1")
    public static final AudioSearchSortDto DURATION;

    @pmi0("2")
    public static final AudioSearchSortDto POPULARITY;
    private final int value;

    /* compiled from: AudioSearchSortDto.kt */
    public static final class a implements Parcelable.Creator<AudioSearchSortDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSearchSortDto createFromParcel(Parcel parcel) {
            return AudioSearchSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSearchSortDto[] newArray(int i) {
            return new AudioSearchSortDto[i];
        }
    }

    static {
        AudioSearchSortDto audioSearchSortDto = new AudioSearchSortDto("DATE_ADDED", 0, 0);
        DATE_ADDED = audioSearchSortDto;
        AudioSearchSortDto audioSearchSortDto2 = new AudioSearchSortDto("DURATION", 1, 1);
        DURATION = audioSearchSortDto2;
        AudioSearchSortDto audioSearchSortDto3 = new AudioSearchSortDto("POPULARITY", 2, 2);
        POPULARITY = audioSearchSortDto3;
        AudioSearchSortDto[] audioSearchSortDtoArr = {audioSearchSortDto, audioSearchSortDto2, audioSearchSortDto3};
        $VALUES = audioSearchSortDtoArr;
        $ENTRIES = new asp(audioSearchSortDtoArr);
        CREATOR = new a();
    }

    private AudioSearchSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AudioSearchSortDto valueOf(String str) {
        return (AudioSearchSortDto) Enum.valueOf(AudioSearchSortDto.class, str);
    }

    public static AudioSearchSortDto[] values() {
        return (AudioSearchSortDto[]) $VALUES.clone();
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
