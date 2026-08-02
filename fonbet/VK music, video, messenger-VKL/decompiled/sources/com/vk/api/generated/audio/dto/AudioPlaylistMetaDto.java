package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioPlaylistMetaDto.kt */
/* loaded from: classes14.dex */
public final class AudioPlaylistMetaDto implements Parcelable {
    public static final Parcelable.Creator<AudioPlaylistMetaDto> CREATOR = new a();

    @pmi0("promo_style")
    private final AudioPromoStyleEnumTypeDto promoStyle;

    @pmi0("promo_title")
    private final String promoTitle;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final AudioPlaylistViewDto view;

    /* compiled from: AudioPlaylistMetaDto.kt */
    public static final class a implements Parcelable.Creator<AudioPlaylistMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistMetaDto createFromParcel(Parcel parcel) {
            return new AudioPlaylistMetaDto(parcel.readInt() == 0 ? null : AudioPlaylistViewDto.CREATOR.createFromParcel(parcel), parcel.readString(), (AudioPromoStyleEnumTypeDto) parcel.readParcelable(AudioPlaylistMetaDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPlaylistMetaDto[] newArray(int i) {
            return new AudioPlaylistMetaDto[i];
        }
    }

    public AudioPlaylistMetaDto() {
        this(null, null, null, 7, null);
    }

    public final AudioPlaylistViewDto d() {
        return this.view;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistMetaDto)) {
            return false;
        }
        AudioPlaylistMetaDto audioPlaylistMetaDto = (AudioPlaylistMetaDto) obj;
        return this.view == audioPlaylistMetaDto.view && epx.f(this.promoTitle, audioPlaylistMetaDto.promoTitle) && this.promoStyle == audioPlaylistMetaDto.promoStyle;
    }

    public final int hashCode() {
        AudioPlaylistViewDto audioPlaylistViewDto = this.view;
        int hashCode = (audioPlaylistViewDto == null ? 0 : audioPlaylistViewDto.hashCode()) * 31;
        String str = this.promoTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto = this.promoStyle;
        return hashCode2 + (audioPromoStyleEnumTypeDto != null ? audioPromoStyleEnumTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AudioPlaylistMetaDto(view=" + this.view + ", promoTitle=" + this.promoTitle + ", promoStyle=" + this.promoStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioPlaylistViewDto audioPlaylistViewDto = this.view;
        if (audioPlaylistViewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistViewDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.promoTitle);
        parcel.writeParcelable(this.promoStyle, i);
    }

    public AudioPlaylistMetaDto(AudioPlaylistViewDto audioPlaylistViewDto, String str, AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto) {
        this.view = audioPlaylistViewDto;
        this.promoTitle = str;
        this.promoStyle = audioPromoStyleEnumTypeDto;
    }

    public /* synthetic */ AudioPlaylistMetaDto(AudioPlaylistViewDto audioPlaylistViewDto, String str, AudioPromoStyleEnumTypeDto audioPromoStyleEnumTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : audioPlaylistViewDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : audioPromoStyleEnumTypeDto);
    }
}
