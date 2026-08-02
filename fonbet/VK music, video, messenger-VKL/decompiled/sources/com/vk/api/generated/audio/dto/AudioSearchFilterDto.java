package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioSearchFilterDto.kt */
/* loaded from: classes14.dex */
public final class AudioSearchFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioSearchFilterDto[] $VALUES;

    @pmi0("all")
    public static final AudioSearchFilterDto ALL;
    public static final Parcelable.Creator<AudioSearchFilterDto> CREATOR;

    @pmi0("global")
    public static final AudioSearchFilterDto GLOBAL;

    @pmi0("owned")
    public static final AudioSearchFilterDto OWNED;
    private final String value;

    /* compiled from: AudioSearchFilterDto.kt */
    public static final class a implements Parcelable.Creator<AudioSearchFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSearchFilterDto createFromParcel(Parcel parcel) {
            return AudioSearchFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSearchFilterDto[] newArray(int i) {
            return new AudioSearchFilterDto[i];
        }
    }

    static {
        AudioSearchFilterDto audioSearchFilterDto = new AudioSearchFilterDto("ALL", 0, "all");
        ALL = audioSearchFilterDto;
        AudioSearchFilterDto audioSearchFilterDto2 = new AudioSearchFilterDto("GLOBAL", 1, "global");
        GLOBAL = audioSearchFilterDto2;
        AudioSearchFilterDto audioSearchFilterDto3 = new AudioSearchFilterDto("OWNED", 2, "owned");
        OWNED = audioSearchFilterDto3;
        AudioSearchFilterDto[] audioSearchFilterDtoArr = {audioSearchFilterDto, audioSearchFilterDto2, audioSearchFilterDto3};
        $VALUES = audioSearchFilterDtoArr;
        $ENTRIES = new asp(audioSearchFilterDtoArr);
        CREATOR = new a();
    }

    private AudioSearchFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioSearchFilterDto valueOf(String str) {
        return (AudioSearchFilterDto) Enum.valueOf(AudioSearchFilterDto.class, str);
    }

    public static AudioSearchFilterDto[] values() {
        return (AudioSearchFilterDto[]) $VALUES.clone();
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
