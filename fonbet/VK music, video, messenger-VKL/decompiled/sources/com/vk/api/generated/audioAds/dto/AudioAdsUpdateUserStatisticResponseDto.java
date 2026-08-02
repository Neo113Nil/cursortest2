package com.vk.api.generated.audioAds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioAdsUpdateUserStatisticResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioAdsUpdateUserStatisticResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioAdsUpdateUserStatisticResponseDto> CREATOR = new a();

    @pmi0(X3.i.L)
    private final String position;

    @pmi0("show_ad")
    private final boolean showAd;

    /* compiled from: AudioAdsUpdateUserStatisticResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioAdsUpdateUserStatisticResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAdsUpdateUserStatisticResponseDto createFromParcel(Parcel parcel) {
            return new AudioAdsUpdateUserStatisticResponseDto(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAdsUpdateUserStatisticResponseDto[] newArray(int i) {
            return new AudioAdsUpdateUserStatisticResponseDto[i];
        }
    }

    public AudioAdsUpdateUserStatisticResponseDto(boolean z, String str) {
        this.showAd = z;
        this.position = str;
    }

    public final String d() {
        return this.position;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.showAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAdsUpdateUserStatisticResponseDto)) {
            return false;
        }
        AudioAdsUpdateUserStatisticResponseDto audioAdsUpdateUserStatisticResponseDto = (AudioAdsUpdateUserStatisticResponseDto) obj;
        return this.showAd == audioAdsUpdateUserStatisticResponseDto.showAd && epx.f(this.position, audioAdsUpdateUserStatisticResponseDto.position);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.showAd) * 31;
        String str = this.position;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAdsUpdateUserStatisticResponseDto(showAd=");
        sb.append(this.showAd);
        sb.append(", position=");
        return ho8.a(sb, this.position, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showAd ? 1 : 0);
        parcel.writeString(this.position);
    }

    public /* synthetic */ AudioAdsUpdateUserStatisticResponseDto(boolean z, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
