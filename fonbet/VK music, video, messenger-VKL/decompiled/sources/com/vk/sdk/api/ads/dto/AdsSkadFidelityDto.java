package com.vk.sdk.api.ads.dto;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import xsna.epx;
import xsna.h5s;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AdsSkadFidelityDto.kt */
/* loaded from: classes5.dex */
public final class AdsSkadFidelityDto {

    @pmi0("fidelity")
    private final int fidelity;

    @pmi0("nonce")
    private final String nonce;

    @pmi0(InAppPurchaseMetaData.KEY_SIGNATURE)
    private final String signature;

    @pmi0("timestamp")
    private final String timestamp;

    public AdsSkadFidelityDto(int i, String str, String str2, String str3) {
        this.fidelity = i;
        this.nonce = str;
        this.timestamp = str2;
        this.signature = str3;
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
        int i = this.fidelity;
        String str = this.nonce;
        return h5s.d(kh10.a(i, "AdsSkadFidelityDto(fidelity=", ", nonce=", str, ", timestamp="), this.timestamp, ", signature=", this.signature, ")");
    }
}
