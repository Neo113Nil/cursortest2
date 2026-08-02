package com.vk.sdk.api.ads.dto;

import com.ironsource.D1;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdBannerBaseLinkDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdBannerBaseLinkDto {

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("link_url_target")
    private final LinkUrlTargetDto linkUrlTarget;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdBannerBaseLinkDto.kt */
    public static final class LinkUrlTargetDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkUrlTargetDto[] $VALUES;

        @pmi0(D1.e)
        public static final LinkUrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final LinkUrlTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final LinkUrlTargetDto INTERNAL_HIDDEN;
        private final String value;

        static {
            LinkUrlTargetDto linkUrlTargetDto = new LinkUrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = linkUrlTargetDto;
            LinkUrlTargetDto linkUrlTargetDto2 = new LinkUrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = linkUrlTargetDto2;
            LinkUrlTargetDto linkUrlTargetDto3 = new LinkUrlTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = linkUrlTargetDto3;
            LinkUrlTargetDto[] linkUrlTargetDtoArr = {linkUrlTargetDto, linkUrlTargetDto2, linkUrlTargetDto3};
            $VALUES = linkUrlTargetDtoArr;
            $ENTRIES = new asp(linkUrlTargetDtoArr);
        }

        private LinkUrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkUrlTargetDto valueOf(String str) {
            return (LinkUrlTargetDto) Enum.valueOf(LinkUrlTargetDto.class, str);
        }

        public static LinkUrlTargetDto[] values() {
            return (LinkUrlTargetDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsItemBlockAdBannerBaseLinkDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdBannerBaseLinkDto)) {
            return false;
        }
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto = (AdsItemBlockAdBannerBaseLinkDto) obj;
        return epx.f(this.linkUrl, adsItemBlockAdBannerBaseLinkDto.linkUrl) && this.linkUrlTarget == adsItemBlockAdBannerBaseLinkDto.linkUrlTarget;
    }

    public final int hashCode() {
        String str = this.linkUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        return hashCode + (linkUrlTargetDto != null ? linkUrlTargetDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsItemBlockAdBannerBaseLinkDto(linkUrl=" + this.linkUrl + ", linkUrlTarget=" + this.linkUrlTarget + ")";
    }

    public AdsItemBlockAdBannerBaseLinkDto(String str, LinkUrlTargetDto linkUrlTargetDto) {
        this.linkUrl = str;
        this.linkUrlTarget = linkUrlTargetDto;
    }

    public /* synthetic */ AdsItemBlockAdBannerBaseLinkDto(String str, LinkUrlTargetDto linkUrlTargetDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : linkUrlTargetDto);
    }
}
