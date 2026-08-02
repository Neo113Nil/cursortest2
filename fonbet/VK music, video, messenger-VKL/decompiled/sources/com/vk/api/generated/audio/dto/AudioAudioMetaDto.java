package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioAudioMetaDto.kt */
/* loaded from: classes14.dex */
public final class AudioAudioMetaDto implements Parcelable {
    public static final Parcelable.Creator<AudioAudioMetaDto> CREATOR = new a();

    @pmi0("promo_style")
    private final AudioPromoStyleEnumTypeDto promoStyle;

    @pmi0("promo_title")
    private final String promoTitle;

    /* compiled from: AudioAudioMetaDto.kt */
    public static final class a implements Parcelable.Creator<AudioAudioMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAudioMetaDto createFromParcel(Parcel parcel) {
            return new AudioAudioMetaDto(parcel.readString(), parcel.readInt() == 0 ? null : AudioPromoStyleEnumTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAudioMetaDto[] newArray(int i) {
            return new AudioAudioMetaDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioAudioMetaDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAudioMetaDto)) {
            return false;
        }
        AudioAudioMetaDto audioAudioMetaDto = (AudioAudioMetaDto) obj;
        return epx.f(this.promoTitle, audioAudioMetaDto.promoTitle) && this.promoStyle == audioAudioMetaDto.promoStyle;
    }

    public final int hashCode() {
        String str = this.promoTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto = this.promoStyle;
        return hashCode + (audioPromoStyleEnumTypeDto != null ? audioPromoStyleEnumTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AudioAudioMetaDto(promoTitle=" + this.promoTitle + ", promoStyle=" + this.promoStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promoTitle);
        AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto = this.promoStyle;
        if (audioPromoStyleEnumTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPromoStyleEnumTypeDto.writeToParcel(parcel, i);
        }
    }

    public AudioAudioMetaDto(String str, AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto) {
        this.promoTitle = str;
        this.promoStyle = audioPromoStyleEnumTypeDto;
    }

    public /* synthetic */ AudioAudioMetaDto(String str, AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : audioPromoStyleEnumTypeDto);
    }
}
