package com.blaze.blazesdk.ads.models.dto;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.AdInfoType;
import com.blaze.blazesdk.app_configurations.models.ads.AdsConfigurationsDto;
import defpackage.b6h;
import defpackage.lnb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00060"}, d2 = {"Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "", "googleAdManagerId", "", "adUnitId", "formatId", "type", "Lcom/blaze/blazesdk/ads/models/ui/AdInfoType;", "context", "", "tag", "configuration", "Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;", "adProvider", "Lcom/blaze/blazesdk/ads/models/dto/AdProviderDto;", "backofficeCampaignData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/ads/models/ui/AdInfoType;Ljava/util/Map;Ljava/lang/String;Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;Lcom/blaze/blazesdk/ads/models/dto/AdProviderDto;Ljava/lang/String;)V", "getGoogleAdManagerId", "()Ljava/lang/String;", "getAdUnitId", "getFormatId", "getType", "()Lcom/blaze/blazesdk/ads/models/ui/AdInfoType;", "getContext", "()Ljava/util/Map;", "getTag", "getConfiguration", "()Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;", "getAdProvider", "()Lcom/blaze/blazesdk/ads/models/dto/AdProviderDto;", "getBackofficeCampaignData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AdInfoDto {
    public static final int $stable = 8;

    @b6h("adProvider")
    @Nullable
    private final AdProviderDto adProvider;

    @b6h("adUnitId")
    @Nullable
    private final String adUnitId;

    @b6h("backofficeCampaignData")
    @Nullable
    private final String backofficeCampaignData;

    @b6h("configuration")
    @Nullable
    private final AdsConfigurationsDto configuration;

    @b6h("context")
    @Nullable
    private final Map<String, String> context;

    @b6h("formatId")
    @Nullable
    private final String formatId;

    @b6h("googleAdManagerId")
    @Nullable
    private final String googleAdManagerId;

    @b6h("tag")
    @Nullable
    private final String tag;

    @b6h("type")
    @Nullable
    private final AdInfoType type;

    public AdInfoDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable AdInfoType adInfoType, @Nullable Map<String, String> map, @Nullable String str4, @Nullable AdsConfigurationsDto adsConfigurationsDto, @Nullable AdProviderDto adProviderDto, @Nullable String str5) {
        this.googleAdManagerId = str;
        this.adUnitId = str2;
        this.formatId = str3;
        this.type = adInfoType;
        this.context = map;
        this.tag = str4;
        this.configuration = adsConfigurationsDto;
        this.adProvider = adProviderDto;
        this.backofficeCampaignData = str5;
    }

    public static /* synthetic */ AdInfoDto copy$default(AdInfoDto adInfoDto, String str, String str2, String str3, AdInfoType adInfoType, Map map, String str4, AdsConfigurationsDto adsConfigurationsDto, AdProviderDto adProviderDto, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adInfoDto.googleAdManagerId;
        }
        if ((i & 2) != 0) {
            str2 = adInfoDto.adUnitId;
        }
        if ((i & 4) != 0) {
            str3 = adInfoDto.formatId;
        }
        if ((i & 8) != 0) {
            adInfoType = adInfoDto.type;
        }
        if ((i & 16) != 0) {
            map = adInfoDto.context;
        }
        if ((i & 32) != 0) {
            str4 = adInfoDto.tag;
        }
        if ((i & 64) != 0) {
            adsConfigurationsDto = adInfoDto.configuration;
        }
        if ((i & 128) != 0) {
            adProviderDto = adInfoDto.adProvider;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str5 = adInfoDto.backofficeCampaignData;
        }
        AdProviderDto adProviderDto2 = adProviderDto;
        String str6 = str5;
        String str7 = str4;
        AdsConfigurationsDto adsConfigurationsDto2 = adsConfigurationsDto;
        Map map2 = map;
        String str8 = str3;
        return adInfoDto.copy(str, str2, str8, adInfoType, map2, str7, adsConfigurationsDto2, adProviderDto2, str6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getGoogleAdManagerId() {
        return this.googleAdManagerId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFormatId() {
        return this.formatId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final AdInfoType getType() {
        return this.type;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.context;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final AdsConfigurationsDto getConfiguration() {
        return this.configuration;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final AdProviderDto getAdProvider() {
        return this.adProvider;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getBackofficeCampaignData() {
        return this.backofficeCampaignData;
    }

    @NotNull
    public final AdInfoDto copy(@Nullable String googleAdManagerId, @Nullable String adUnitId, @Nullable String formatId, @Nullable AdInfoType type, @Nullable Map<String, String> context, @Nullable String tag, @Nullable AdsConfigurationsDto configuration, @Nullable AdProviderDto adProvider, @Nullable String backofficeCampaignData) {
        return new AdInfoDto(googleAdManagerId, adUnitId, formatId, type, context, tag, configuration, adProvider, backofficeCampaignData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdInfoDto)) {
            return false;
        }
        AdInfoDto adInfoDto = (AdInfoDto) other;
        return Intrinsics.c(this.googleAdManagerId, adInfoDto.googleAdManagerId) && Intrinsics.c(this.adUnitId, adInfoDto.adUnitId) && Intrinsics.c(this.formatId, adInfoDto.formatId) && this.type == adInfoDto.type && Intrinsics.c(this.context, adInfoDto.context) && Intrinsics.c(this.tag, adInfoDto.tag) && Intrinsics.c(this.configuration, adInfoDto.configuration) && this.adProvider == adInfoDto.adProvider && Intrinsics.c(this.backofficeCampaignData, adInfoDto.backofficeCampaignData);
    }

    @Nullable
    public final AdProviderDto getAdProvider() {
        return this.adProvider;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final String getBackofficeCampaignData() {
        return this.backofficeCampaignData;
    }

    @Nullable
    public final AdsConfigurationsDto getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final Map<String, String> getContext() {
        return this.context;
    }

    @Nullable
    public final String getFormatId() {
        return this.formatId;
    }

    @Nullable
    public final String getGoogleAdManagerId() {
        return this.googleAdManagerId;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final AdInfoType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.googleAdManagerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adUnitId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.formatId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AdInfoType adInfoType = this.type;
        int hashCode4 = (hashCode3 + (adInfoType == null ? 0 : adInfoType.hashCode())) * 31;
        Map<String, String> map = this.context;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.tag;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdsConfigurationsDto adsConfigurationsDto = this.configuration;
        int hashCode7 = (hashCode6 + (adsConfigurationsDto == null ? 0 : adsConfigurationsDto.hashCode())) * 31;
        AdProviderDto adProviderDto = this.adProvider;
        int hashCode8 = (hashCode7 + (adProviderDto == null ? 0 : adProviderDto.hashCode())) * 31;
        String str5 = this.backofficeCampaignData;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AdInfoDto(googleAdManagerId=");
        sb.append(this.googleAdManagerId);
        sb.append(", adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", formatId=");
        sb.append(this.formatId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", configuration=");
        sb.append(this.configuration);
        sb.append(", adProvider=");
        sb.append(this.adProvider);
        sb.append(", backofficeCampaignData=");
        return lnb.q(sb, this.backofficeCampaignData, ')');
    }
}
