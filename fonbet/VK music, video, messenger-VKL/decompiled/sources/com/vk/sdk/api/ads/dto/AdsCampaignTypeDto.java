package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsCampaignTypeDto.kt */
/* loaded from: classes5.dex */
public final class AdsCampaignTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsCampaignTypeDto[] $VALUES;

    @pmi0("adaptive_ads")
    public static final AdsCampaignTypeDto ADAPTIVE_ADS;

    @pmi0("mobile_apps")
    public static final AdsCampaignTypeDto MOBILE_APPS;

    @pmi0("normal")
    public static final AdsCampaignTypeDto NORMAL;

    @pmi0("promoted_posts")
    public static final AdsCampaignTypeDto PROMOTED_POSTS;

    @pmi0("stories")
    public static final AdsCampaignTypeDto STORIES;

    @pmi0("vk_apps_managed")
    public static final AdsCampaignTypeDto VK_APPS_MANAGED;
    private final String value;

    static {
        AdsCampaignTypeDto adsCampaignTypeDto = new AdsCampaignTypeDto("NORMAL", 0, "normal");
        NORMAL = adsCampaignTypeDto;
        AdsCampaignTypeDto adsCampaignTypeDto2 = new AdsCampaignTypeDto("VK_APPS_MANAGED", 1, "vk_apps_managed");
        VK_APPS_MANAGED = adsCampaignTypeDto2;
        AdsCampaignTypeDto adsCampaignTypeDto3 = new AdsCampaignTypeDto("MOBILE_APPS", 2, "mobile_apps");
        MOBILE_APPS = adsCampaignTypeDto3;
        AdsCampaignTypeDto adsCampaignTypeDto4 = new AdsCampaignTypeDto("PROMOTED_POSTS", 3, "promoted_posts");
        PROMOTED_POSTS = adsCampaignTypeDto4;
        AdsCampaignTypeDto adsCampaignTypeDto5 = new AdsCampaignTypeDto("ADAPTIVE_ADS", 4, "adaptive_ads");
        ADAPTIVE_ADS = adsCampaignTypeDto5;
        AdsCampaignTypeDto adsCampaignTypeDto6 = new AdsCampaignTypeDto("STORIES", 5, "stories");
        STORIES = adsCampaignTypeDto6;
        AdsCampaignTypeDto[] adsCampaignTypeDtoArr = {adsCampaignTypeDto, adsCampaignTypeDto2, adsCampaignTypeDto3, adsCampaignTypeDto4, adsCampaignTypeDto5, adsCampaignTypeDto6};
        $VALUES = adsCampaignTypeDtoArr;
        $ENTRIES = new asp(adsCampaignTypeDtoArr);
    }

    private AdsCampaignTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsCampaignTypeDto valueOf(String str) {
        return (AdsCampaignTypeDto) Enum.valueOf(AdsCampaignTypeDto.class, str);
    }

    public static AdsCampaignTypeDto[] values() {
        return (AdsCampaignTypeDto[]) $VALUES.clone();
    }
}
