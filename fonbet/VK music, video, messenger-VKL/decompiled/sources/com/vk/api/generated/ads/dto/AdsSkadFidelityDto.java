package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AdsSkadFidelityDto.kt */
/* loaded from: classes14.dex */
public final class AdsSkadFidelityDto implements Parcelable {
    public static final Parcelable.Creator<AdsSkadFidelityDto> CREATOR = new a();

    @pmi0("fidelity")
    private final int fidelity;

    @pmi0("nonce")
    private final String nonce;

    @pmi0(InAppPurchaseMetaData.KEY_SIGNATURE)
    private final String signature;

    @pmi0("timestamp")
    private final String timestamp;

    /* compiled from: AdsSkadFidelityDto.kt */
    public static final class a implements Parcelable.Creator<AdsSkadFidelityDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsSkadFidelityDto createFromParcel(Parcel parcel) {
            return new AdsSkadFidelityDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsSkadFidelityDto[] newArray(int i) {
            return new AdsSkadFidelityDto[i];
        }
    }

    public AdsSkadFidelityDto(int i, String str, String str2, String str3) {
        this.fidelity = i;
        this.nonce = str;
        this.timestamp = str2;
        this.signature = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsSkadFidelityDto)) {
            return false;
        }
        AdsSkadFidelityDto adsSkadFidelityDto = (AdsSkadFidelityDto) obj;
        return this.fidelity == adsSkadFidelityDto.fidelity && epx.f(this.nonce, adsSkadFidelityDto.nonce) && epx.f(this.timestamp, adsSkadFidelityDto.timestamp) && epx.f(this.signature, adsSkadFidelityDto.signature);
    }

    public final int hashCode() {
        return this.signature.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.fidelity) * 31, 31, this.nonce), 31, this.timestamp);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsSkadFidelityDto(fidelity=");
        sb.append(this.fidelity);
        sb.append(", nonce=");
        sb.append(this.nonce);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", signature=");
        return ho8.a(sb, this.signature, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.fidelity);
        parcel.writeString(this.nonce);
        parcel.writeString(this.timestamp);
        parcel.writeString(this.signature);
    }
}
