package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.cgn;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vp;
import xsna.xe9;
import xsna.zcl;

/* compiled from: AdsSkadDto.kt */
/* loaded from: classes5.dex */
public final class AdsSkadDto {

    @pmi0("adNetworkId")
    private final String adNetworkId;

    @pmi0("appStoreId")
    private final int appStoreId;

    @pmi0("campaignId")
    private final int campaignId;

    @pmi0("fidelities")
    private final List<AdsSkadFidelityDto> fidelities;

    @pmi0("nonce")
    private final String nonce;

    @pmi0("sign")
    private final String sign;

    @pmi0("sourceAppStoreId")
    private final int sourceAppStoreId;

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("version")
    private final String version;

    public AdsSkadDto(String str, String str2, int i, int i2, int i3, Integer num, String str3, String str4, List<AdsSkadFidelityDto> list) {
        this.version = str;
        this.adNetworkId = str2;
        this.campaignId = i;
        this.appStoreId = i2;
        this.sourceAppStoreId = i3;
        this.timestamp = num;
        this.nonce = str3;
        this.sign = str4;
        this.fidelities = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsSkadDto)) {
            return false;
        }
        AdsSkadDto adsSkadDto = (AdsSkadDto) obj;
        return epx.f(this.version, adsSkadDto.version) && epx.f(this.adNetworkId, adsSkadDto.adNetworkId) && this.campaignId == adsSkadDto.campaignId && this.appStoreId == adsSkadDto.appStoreId && this.sourceAppStoreId == adsSkadDto.sourceAppStoreId && epx.f(this.timestamp, adsSkadDto.timestamp) && epx.f(this.nonce, adsSkadDto.nonce) && epx.f(this.sign, adsSkadDto.sign) && epx.f(this.fidelities, adsSkadDto.fidelities);
    }

    public final int hashCode() {
        int a = shy.a(this.sourceAppStoreId, shy.a(this.appStoreId, shy.a(this.campaignId, urd0.a(this.version.hashCode() * 31, 31, this.adNetworkId), 31), 31), 31);
        Integer num = this.timestamp;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nonce;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sign;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AdsSkadFidelityDto> list = this.fidelities;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.version;
        String str2 = this.adNetworkId;
        int i = this.campaignId;
        int i2 = this.appStoreId;
        int i3 = this.sourceAppStoreId;
        Integer num = this.timestamp;
        String str3 = this.nonce;
        String str4 = this.sign;
        List<AdsSkadFidelityDto> list = this.fidelities;
        StringBuilder a = xe9.a("AdsSkadDto(version=", str, ", adNetworkId=", str2, ", campaignId=");
        cgn.a(i, i2, ", appStoreId=", ", sourceAppStoreId=", a);
        a.append(i3);
        a.append(", timestamp=");
        a.append(num);
        a.append(", nonce=");
        n6j.b(a, str3, ", sign=", str4, ", fidelities=");
        return vp.b(")", a, list);
    }

    public /* synthetic */ AdsSkadDto(String str, String str2, int i, int i2, int i3, Integer num, String str3, String str4, List list, int i4, zcl zclVar) {
        this(str, str2, i, i2, i3, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : list);
    }
}
