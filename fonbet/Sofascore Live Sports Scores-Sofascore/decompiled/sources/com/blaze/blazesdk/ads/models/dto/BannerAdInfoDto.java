package com.blaze.blazesdk.ads.models.dto;

import androidx.annotation.Keep;
import com.blaze.blazesdk.app_configurations.models.ads.AdsConfigurationsDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/ads/models/dto/BannerAdInfoDto;", "", "adUnitId", "", "size", "type", "context", "", "configuration", "Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;)V", "getAdUnitId", "()Ljava/lang/String;", "getSize", "getType", "getContext", "()Ljava/util/Map;", "getConfiguration", "()Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BannerAdInfoDto {
    public static final int $stable = 8;

    @Nullable
    private final String adUnitId;

    @Nullable
    private final AdsConfigurationsDto configuration;

    @Nullable
    private final Map<String, String> context;

    @Nullable
    private final String size;

    @Nullable
    private final String type;

    public BannerAdInfoDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable AdsConfigurationsDto adsConfigurationsDto) {
        this.adUnitId = str;
        this.size = str2;
        this.type = str3;
        this.context = map;
        this.configuration = adsConfigurationsDto;
    }

    public static /* synthetic */ BannerAdInfoDto copy$default(BannerAdInfoDto bannerAdInfoDto, String str, String str2, String str3, Map map, AdsConfigurationsDto adsConfigurationsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfoDto.adUnitId;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfoDto.size;
        }
        if ((i & 4) != 0) {
            str3 = bannerAdInfoDto.type;
        }
        if ((i & 8) != 0) {
            map = bannerAdInfoDto.context;
        }
        if ((i & 16) != 0) {
            adsConfigurationsDto = bannerAdInfoDto.configuration;
        }
        AdsConfigurationsDto adsConfigurationsDto2 = adsConfigurationsDto;
        String str4 = str3;
        return bannerAdInfoDto.copy(str, str2, str4, map, adsConfigurationsDto2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.context;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AdsConfigurationsDto getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final BannerAdInfoDto copy(@Nullable String adUnitId, @Nullable String size, @Nullable String type, @Nullable Map<String, String> context, @Nullable AdsConfigurationsDto configuration) {
        return new BannerAdInfoDto(adUnitId, size, type, context, configuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerAdInfoDto)) {
            return false;
        }
        BannerAdInfoDto bannerAdInfoDto = (BannerAdInfoDto) other;
        return Intrinsics.c(this.adUnitId, bannerAdInfoDto.adUnitId) && Intrinsics.c(this.size, bannerAdInfoDto.size) && Intrinsics.c(this.type, bannerAdInfoDto.type) && Intrinsics.c(this.context, bannerAdInfoDto.context) && Intrinsics.c(this.configuration, bannerAdInfoDto.configuration);
    }

    @Nullable
    public final String getAdUnitId() {
        return this.adUnitId;
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
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.adUnitId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.size;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.context;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        AdsConfigurationsDto adsConfigurationsDto = this.configuration;
        return hashCode4 + (adsConfigurationsDto != null ? adsConfigurationsDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BannerAdInfoDto(adUnitId=" + this.adUnitId + ", size=" + this.size + ", type=" + this.type + ", context=" + this.context + ", configuration=" + this.configuration + ')';
    }
}
