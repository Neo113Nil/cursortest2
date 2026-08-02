package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioPromoStyleEnumTypeDto.kt */
/* loaded from: classes14.dex */
public final class AudioPromoStyleEnumTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioPromoStyleEnumTypeDto[] $VALUES;
    public static final Parcelable.Creator<AudioPromoStyleEnumTypeDto> CREATOR;

    @pmi0("presave")
    public static final AudioPromoStyleEnumTypeDto PRESAVE;
    private final String value;

    /* compiled from: AudioPromoStyleEnumTypeDto.kt */
    public static final class a implements Parcelable.Creator<AudioPromoStyleEnumTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPromoStyleEnumTypeDto createFromParcel(Parcel parcel) {
            return AudioPromoStyleEnumTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPromoStyleEnumTypeDto[] newArray(int i) {
            return new AudioPromoStyleEnumTypeDto[i];
        }
    }

    static {
        AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto = new AudioPromoStyleEnumTypeDto("PRESAVE", 0, "presave");
        PRESAVE = audioPromoStyleEnumTypeDto;
        AudioPromoStyleEnumTypeDto[] audioPromoStyleEnumTypeDtoArr = {audioPromoStyleEnumTypeDto};
        $VALUES = audioPromoStyleEnumTypeDtoArr;
        $ENTRIES = new asp(audioPromoStyleEnumTypeDtoArr);
        CREATOR = new a();
    }

    private AudioPromoStyleEnumTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioPromoStyleEnumTypeDto valueOf(String str) {
        return (AudioPromoStyleEnumTypeDto) Enum.valueOf(AudioPromoStyleEnumTypeDto.class, str);
    }

    public static AudioPromoStyleEnumTypeDto[] values() {
        return (AudioPromoStyleEnumTypeDto[]) $VALUES.clone();
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
