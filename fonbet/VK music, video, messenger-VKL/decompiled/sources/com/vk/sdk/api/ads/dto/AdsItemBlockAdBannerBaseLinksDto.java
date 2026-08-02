package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsItemBlockAdBannerBaseLinksDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdBannerBaseLinksDto {

    @pmi0("button")
    private final AdsItemBlockAdBannerBaseLinkDto button;

    @pmi0("footer")
    private final AdsItemBlockAdBannerBaseLinkDto footer;

    @pmi0("header")
    private final AdsItemBlockAdBannerBaseLinkDto header;

    @pmi0("image")
    private final AdsItemBlockAdBannerBaseLinkDto image;

    @pmi0("text")
    private final AdsItemBlockAdBannerBaseLinkDto text;

    public AdsItemBlockAdBannerBaseLinksDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdBannerBaseLinksDto)) {
            return false;
        }
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = (AdsItemBlockAdBannerBaseLinksDto) obj;
        return epx.f(this.header, adsItemBlockAdBannerBaseLinksDto.header) && epx.f(this.text, adsItemBlockAdBannerBaseLinksDto.text) && epx.f(this.image, adsItemBlockAdBannerBaseLinksDto.image) && epx.f(this.footer, adsItemBlockAdBannerBaseLinksDto.footer) && epx.f(this.button, adsItemBlockAdBannerBaseLinksDto.button);
    }

    public final int hashCode() {
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto = this.header;
        int hashCode = (adsItemBlockAdBannerBaseLinkDto == null ? 0 : adsItemBlockAdBannerBaseLinkDto.hashCode()) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto2 = this.text;
        int hashCode2 = (hashCode + (adsItemBlockAdBannerBaseLinkDto2 == null ? 0 : adsItemBlockAdBannerBaseLinkDto2.hashCode())) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto3 = this.image;
        int hashCode3 = (hashCode2 + (adsItemBlockAdBannerBaseLinkDto3 == null ? 0 : adsItemBlockAdBannerBaseLinkDto3.hashCode())) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto4 = this.footer;
        int hashCode4 = (hashCode3 + (adsItemBlockAdBannerBaseLinkDto4 == null ? 0 : adsItemBlockAdBannerBaseLinkDto4.hashCode())) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto5 = this.button;
        return hashCode4 + (adsItemBlockAdBannerBaseLinkDto5 != null ? adsItemBlockAdBannerBaseLinkDto5.hashCode() : 0);
    }

    public final String toString() {
        return "AdsItemBlockAdBannerBaseLinksDto(header=" + this.header + ", text=" + this.text + ", image=" + this.image + ", footer=" + this.footer + ", button=" + this.button + ")";
    }

    public AdsItemBlockAdBannerBaseLinksDto(AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto2, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto3, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto4, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto5) {
        this.header = adsItemBlockAdBannerBaseLinkDto;
        this.text = adsItemBlockAdBannerBaseLinkDto2;
        this.image = adsItemBlockAdBannerBaseLinkDto3;
        this.footer = adsItemBlockAdBannerBaseLinkDto4;
        this.button = adsItemBlockAdBannerBaseLinkDto5;
    }

    public /* synthetic */ AdsItemBlockAdBannerBaseLinksDto(AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto2, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto3, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto4, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : adsItemBlockAdBannerBaseLinkDto, (i & 2) != 0 ? null : adsItemBlockAdBannerBaseLinkDto2, (i & 4) != 0 ? null : adsItemBlockAdBannerBaseLinkDto3, (i & 8) != 0 ? null : adsItemBlockAdBannerBaseLinkDto4, (i & 16) != 0 ? null : adsItemBlockAdBannerBaseLinkDto5);
    }
}
