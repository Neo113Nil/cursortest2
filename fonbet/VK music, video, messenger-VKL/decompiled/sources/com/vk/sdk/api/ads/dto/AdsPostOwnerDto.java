package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsPostOwnerDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostOwnerDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final String photo;

    @pmi0("url")
    private final String url;

    public AdsPostOwnerDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPostOwnerDto)) {
            return false;
        }
        AdsPostOwnerDto adsPostOwnerDto = (AdsPostOwnerDto) obj;
        return epx.f(this.id, adsPostOwnerDto.id) && epx.f(this.name, adsPostOwnerDto.name) && epx.f(this.photo, adsPostOwnerDto.photo) && epx.f(this.url, adsPostOwnerDto.url);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        String str = this.name;
        String str2 = this.photo;
        String str3 = this.url;
        StringBuilder sb = new StringBuilder("AdsPostOwnerDto(id=");
        sb.append(num);
        sb.append(", name=");
        sb.append(str);
        sb.append(", photo=");
        return h5s.d(sb, str2, ", url=", str3, ")");
    }

    public AdsPostOwnerDto(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.name = str;
        this.photo = str2;
        this.url = str3;
    }

    public /* synthetic */ AdsPostOwnerDto(Integer num, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
