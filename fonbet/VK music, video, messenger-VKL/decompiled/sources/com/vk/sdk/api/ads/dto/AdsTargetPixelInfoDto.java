package com.vk.sdk.api.ads.dto;

import com.ironsource.X3;
import xsna.epx;
import xsna.kh10;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: AdsTargetPixelInfoDto.kt */
/* loaded from: classes5.dex */
public final class AdsTargetPixelInfoDto {

    @pmi0("category_id")
    private final int categoryId;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("last_updated")
    private final int lastUpdated;

    @pmi0("name")
    private final String name;

    @pmi0("pixel")
    private final String pixel;

    @pmi0("target_pixel_id")
    private final int targetPixelId;

    public AdsTargetPixelInfoDto(int i, String str, String str2, int i2, int i3, String str3) {
        this.targetPixelId = i;
        this.name = str;
        this.domain = str2;
        this.categoryId = i2;
        this.lastUpdated = i3;
        this.pixel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargetPixelInfoDto)) {
            return false;
        }
        AdsTargetPixelInfoDto adsTargetPixelInfoDto = (AdsTargetPixelInfoDto) obj;
        return this.targetPixelId == adsTargetPixelInfoDto.targetPixelId && epx.f(this.name, adsTargetPixelInfoDto.name) && epx.f(this.domain, adsTargetPixelInfoDto.domain) && this.categoryId == adsTargetPixelInfoDto.categoryId && this.lastUpdated == adsTargetPixelInfoDto.lastUpdated && epx.f(this.pixel, adsTargetPixelInfoDto.pixel);
    }

    public final int hashCode() {
        return this.pixel.hashCode() + shy.a(this.lastUpdated, shy.a(this.categoryId, urd0.a(urd0.a(Integer.hashCode(this.targetPixelId) * 31, 31, this.name), 31, this.domain), 31), 31);
    }

    public final String toString() {
        int i = this.targetPixelId;
        String str = this.name;
        String str2 = this.domain;
        int i2 = this.categoryId;
        int i3 = this.lastUpdated;
        String str3 = this.pixel;
        StringBuilder a = kh10.a(i, "AdsTargetPixelInfoDto(targetPixelId=", ", name=", str, ", domain=");
        nyh0.a(i2, str2, ", categoryId=", ", lastUpdated=", a);
        a.append(i3);
        a.append(", pixel=");
        a.append(str3);
        a.append(")");
        return a.toString();
    }
}
