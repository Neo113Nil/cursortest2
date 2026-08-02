package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.xe9;

/* compiled from: AdsClientDto.kt */
/* loaded from: classes5.dex */
public final class AdsClientDto {

    @pmi0("all_limit")
    private final String allLimit;

    @pmi0("day_limit")
    private final String dayLimit;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public AdsClientDto(String str, String str2, int i, String str3) {
        this.allLimit = str;
        this.dayLimit = str2;
        this.id = i;
        this.name = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsClientDto)) {
            return false;
        }
        AdsClientDto adsClientDto = (AdsClientDto) obj;
        return epx.f(this.allLimit, adsClientDto.allLimit) && epx.f(this.dayLimit, adsClientDto.dayLimit) && this.id == adsClientDto.id && epx.f(this.name, adsClientDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + shy.a(this.id, urd0.a(this.allLimit.hashCode() * 31, 31, this.dayLimit), 31);
    }

    public final String toString() {
        String str = this.allLimit;
        String str2 = this.dayLimit;
        int i = this.id;
        String str3 = this.name;
        StringBuilder a = xe9.a("AdsClientDto(allLimit=", str, ", dayLimit=", str2, ", id=");
        a.append(i);
        a.append(", name=");
        a.append(str3);
        a.append(")");
        return a.toString();
    }
}
