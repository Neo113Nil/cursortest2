package com.blaze.blazesdk.app_configurations.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.app_configurations.models.ads.AdsConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.analytics.AnalyticsLoadBalancerConfigurationDto;
import com.blaze.blazesdk.app_configurations.models.configurations.ConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.experiments.ExperimentDto;
import com.blaze.blazesdk.app_configurations.models.logger.LoggerConfigurationsDTO;
import com.blaze.blazesdk.app_configurations.models.platform.PlatformConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.recommendations.RecommendationsConfigurationsDTO;
import com.blaze.blazesdk.app_configurations.models.universal_links.UniversalLinksConfigurationDto;
import com.ironsource.C4364ve;
import defpackage.b6h;
import defpackage.dmi;
import defpackage.km5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/AppConfigurationsDto;", "", "configurations", "Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;", "platformConfigurations", "Lcom/blaze/blazesdk/app_configurations/models/platform/PlatformConfigurationsDto;", "adsConfigurations", "", "Lcom/blaze/blazesdk/app_configurations/models/ads/AdsConfigurationsDto;", "universalLinksConfiguration", "Lcom/blaze/blazesdk/app_configurations/models/universal_links/UniversalLinksConfigurationDto;", "recommendationsConfigurations", "Lcom/blaze/blazesdk/app_configurations/models/recommendations/RecommendationsConfigurationsDTO;", C4364ve.d, "Lcom/blaze/blazesdk/app_configurations/models/experiments/ExperimentDto;", "loggerConfigurations", "Lcom/blaze/blazesdk/app_configurations/models/logger/LoggerConfigurationsDTO;", "analyticsLoadBalancerConfiguration", "Lcom/blaze/blazesdk/app_configurations/models/analytics/AnalyticsLoadBalancerConfigurationDto;", "<init>", "(Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;Lcom/blaze/blazesdk/app_configurations/models/platform/PlatformConfigurationsDto;Ljava/util/List;Lcom/blaze/blazesdk/app_configurations/models/universal_links/UniversalLinksConfigurationDto;Lcom/blaze/blazesdk/app_configurations/models/recommendations/RecommendationsConfigurationsDTO;Ljava/util/List;Lcom/blaze/blazesdk/app_configurations/models/logger/LoggerConfigurationsDTO;Lcom/blaze/blazesdk/app_configurations/models/analytics/AnalyticsLoadBalancerConfigurationDto;)V", "getConfigurations", "()Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;", "getPlatformConfigurations", "()Lcom/blaze/blazesdk/app_configurations/models/platform/PlatformConfigurationsDto;", "getAdsConfigurations", "()Ljava/util/List;", "getUniversalLinksConfiguration", "()Lcom/blaze/blazesdk/app_configurations/models/universal_links/UniversalLinksConfigurationDto;", "getRecommendationsConfigurations", "()Lcom/blaze/blazesdk/app_configurations/models/recommendations/RecommendationsConfigurationsDTO;", "getExperiments", "getLoggerConfigurations", "()Lcom/blaze/blazesdk/app_configurations/models/logger/LoggerConfigurationsDTO;", "getAnalyticsLoadBalancerConfiguration", "()Lcom/blaze/blazesdk/app_configurations/models/analytics/AnalyticsLoadBalancerConfigurationDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppConfigurationsDto {
    public static final int $stable = 8;

    @b6h("adsConfigurations")
    @NotNull
    private final List<AdsConfigurationsDto> adsConfigurations;

    @b6h("analyticsLoadBalancerConfiguration")
    @Nullable
    private final AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfiguration;

    @b6h("configurations")
    @NotNull
    private final ConfigurationsDto configurations;

    @b6h(C4364ve.d)
    @Nullable
    private final List<ExperimentDto> experiments;

    @b6h("sdkLoggerConfigurations")
    @Nullable
    private final LoggerConfigurationsDTO loggerConfigurations;

    @b6h("platformConfigurations")
    @Nullable
    private final PlatformConfigurationsDto platformConfigurations;

    @b6h("recommendationsConfigurations")
    @Nullable
    private final RecommendationsConfigurationsDTO recommendationsConfigurations;

    @b6h("universalLinksConfiguration")
    @Nullable
    private final UniversalLinksConfigurationDto universalLinksConfiguration;

    public AppConfigurationsDto(ConfigurationsDto configurationsDto, PlatformConfigurationsDto platformConfigurationsDto, List list, UniversalLinksConfigurationDto universalLinksConfigurationDto, RecommendationsConfigurationsDTO recommendationsConfigurationsDTO, List list2, LoggerConfigurationsDTO loggerConfigurationsDTO, AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConfigurationsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null) : configurationsDto, (i & 2) != 0 ? new PlatformConfigurationsDto(null, null, 3, null) : platformConfigurationsDto, (i & 4) != 0 ? km5.a : list, universalLinksConfigurationDto, (i & 16) != 0 ? new RecommendationsConfigurationsDTO(null, null, null, null, null, 31, null) : recommendationsConfigurationsDTO, list2, (i & 64) != 0 ? null : loggerConfigurationsDTO, analyticsLoadBalancerConfigurationDto);
    }

    public static /* synthetic */ AppConfigurationsDto copy$default(AppConfigurationsDto appConfigurationsDto, ConfigurationsDto configurationsDto, PlatformConfigurationsDto platformConfigurationsDto, List list, UniversalLinksConfigurationDto universalLinksConfigurationDto, RecommendationsConfigurationsDTO recommendationsConfigurationsDTO, List list2, LoggerConfigurationsDTO loggerConfigurationsDTO, AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto, int i, Object obj) {
        if ((i & 1) != 0) {
            configurationsDto = appConfigurationsDto.configurations;
        }
        if ((i & 2) != 0) {
            platformConfigurationsDto = appConfigurationsDto.platformConfigurations;
        }
        if ((i & 4) != 0) {
            list = appConfigurationsDto.adsConfigurations;
        }
        if ((i & 8) != 0) {
            universalLinksConfigurationDto = appConfigurationsDto.universalLinksConfiguration;
        }
        if ((i & 16) != 0) {
            recommendationsConfigurationsDTO = appConfigurationsDto.recommendationsConfigurations;
        }
        if ((i & 32) != 0) {
            list2 = appConfigurationsDto.experiments;
        }
        if ((i & 64) != 0) {
            loggerConfigurationsDTO = appConfigurationsDto.loggerConfigurations;
        }
        if ((i & 128) != 0) {
            analyticsLoadBalancerConfigurationDto = appConfigurationsDto.analyticsLoadBalancerConfiguration;
        }
        LoggerConfigurationsDTO loggerConfigurationsDTO2 = loggerConfigurationsDTO;
        AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto2 = analyticsLoadBalancerConfigurationDto;
        RecommendationsConfigurationsDTO recommendationsConfigurationsDTO2 = recommendationsConfigurationsDTO;
        List list3 = list2;
        return appConfigurationsDto.copy(configurationsDto, platformConfigurationsDto, list, universalLinksConfigurationDto, recommendationsConfigurationsDTO2, list3, loggerConfigurationsDTO2, analyticsLoadBalancerConfigurationDto2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ConfigurationsDto getConfigurations() {
        return this.configurations;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final PlatformConfigurationsDto getPlatformConfigurations() {
        return this.platformConfigurations;
    }

    @NotNull
    public final List<AdsConfigurationsDto> component3() {
        return this.adsConfigurations;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final UniversalLinksConfigurationDto getUniversalLinksConfiguration() {
        return this.universalLinksConfiguration;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final RecommendationsConfigurationsDTO getRecommendationsConfigurations() {
        return this.recommendationsConfigurations;
    }

    @Nullable
    public final List<ExperimentDto> component6() {
        return this.experiments;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final LoggerConfigurationsDTO getLoggerConfigurations() {
        return this.loggerConfigurations;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final AnalyticsLoadBalancerConfigurationDto getAnalyticsLoadBalancerConfiguration() {
        return this.analyticsLoadBalancerConfiguration;
    }

    @NotNull
    public final AppConfigurationsDto copy(@NotNull ConfigurationsDto configurations, @Nullable PlatformConfigurationsDto platformConfigurations, @NotNull List<AdsConfigurationsDto> adsConfigurations, @Nullable UniversalLinksConfigurationDto universalLinksConfiguration, @Nullable RecommendationsConfigurationsDTO recommendationsConfigurations, @Nullable List<ExperimentDto> experiments, @Nullable LoggerConfigurationsDTO loggerConfigurations, @Nullable AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfiguration) {
        configurations.getClass();
        adsConfigurations.getClass();
        return new AppConfigurationsDto(configurations, platformConfigurations, adsConfigurations, universalLinksConfiguration, recommendationsConfigurations, experiments, loggerConfigurations, analyticsLoadBalancerConfiguration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfigurationsDto)) {
            return false;
        }
        AppConfigurationsDto appConfigurationsDto = (AppConfigurationsDto) other;
        return Intrinsics.c(this.configurations, appConfigurationsDto.configurations) && Intrinsics.c(this.platformConfigurations, appConfigurationsDto.platformConfigurations) && Intrinsics.c(this.adsConfigurations, appConfigurationsDto.adsConfigurations) && Intrinsics.c(this.universalLinksConfiguration, appConfigurationsDto.universalLinksConfiguration) && Intrinsics.c(this.recommendationsConfigurations, appConfigurationsDto.recommendationsConfigurations) && Intrinsics.c(this.experiments, appConfigurationsDto.experiments) && Intrinsics.c(this.loggerConfigurations, appConfigurationsDto.loggerConfigurations) && Intrinsics.c(this.analyticsLoadBalancerConfiguration, appConfigurationsDto.analyticsLoadBalancerConfiguration);
    }

    @NotNull
    public final List<AdsConfigurationsDto> getAdsConfigurations() {
        return this.adsConfigurations;
    }

    @Nullable
    public final AnalyticsLoadBalancerConfigurationDto getAnalyticsLoadBalancerConfiguration() {
        return this.analyticsLoadBalancerConfiguration;
    }

    @NotNull
    public final ConfigurationsDto getConfigurations() {
        return this.configurations;
    }

    @Nullable
    public final List<ExperimentDto> getExperiments() {
        return this.experiments;
    }

    @Nullable
    public final LoggerConfigurationsDTO getLoggerConfigurations() {
        return this.loggerConfigurations;
    }

    @Nullable
    public final PlatformConfigurationsDto getPlatformConfigurations() {
        return this.platformConfigurations;
    }

    @Nullable
    public final RecommendationsConfigurationsDTO getRecommendationsConfigurations() {
        return this.recommendationsConfigurations;
    }

    @Nullable
    public final UniversalLinksConfigurationDto getUniversalLinksConfiguration() {
        return this.universalLinksConfiguration;
    }

    public int hashCode() {
        int hashCode = this.configurations.hashCode() * 31;
        PlatformConfigurationsDto platformConfigurationsDto = this.platformConfigurations;
        int d = dmi.d((hashCode + (platformConfigurationsDto == null ? 0 : platformConfigurationsDto.hashCode())) * 31, 31, this.adsConfigurations);
        UniversalLinksConfigurationDto universalLinksConfigurationDto = this.universalLinksConfiguration;
        int hashCode2 = (d + (universalLinksConfigurationDto == null ? 0 : universalLinksConfigurationDto.hashCode())) * 31;
        RecommendationsConfigurationsDTO recommendationsConfigurationsDTO = this.recommendationsConfigurations;
        int hashCode3 = (hashCode2 + (recommendationsConfigurationsDTO == null ? 0 : recommendationsConfigurationsDTO.hashCode())) * 31;
        List<ExperimentDto> list = this.experiments;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        LoggerConfigurationsDTO loggerConfigurationsDTO = this.loggerConfigurations;
        int hashCode5 = (hashCode4 + (loggerConfigurationsDTO == null ? 0 : loggerConfigurationsDTO.hashCode())) * 31;
        AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto = this.analyticsLoadBalancerConfiguration;
        return hashCode5 + (analyticsLoadBalancerConfigurationDto != null ? analyticsLoadBalancerConfigurationDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppConfigurationsDto(configurations=" + this.configurations + ", platformConfigurations=" + this.platformConfigurations + ", adsConfigurations=" + this.adsConfigurations + ", universalLinksConfiguration=" + this.universalLinksConfiguration + ", recommendationsConfigurations=" + this.recommendationsConfigurations + ", experiments=" + this.experiments + ", loggerConfigurations=" + this.loggerConfigurations + ", analyticsLoadBalancerConfiguration=" + this.analyticsLoadBalancerConfiguration + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public AppConfigurationsDto(@NotNull ConfigurationsDto configurationsDto, @Nullable PlatformConfigurationsDto platformConfigurationsDto, @NotNull List<AdsConfigurationsDto> list, @Nullable UniversalLinksConfigurationDto universalLinksConfigurationDto, @Nullable RecommendationsConfigurationsDTO recommendationsConfigurationsDTO, @Nullable List<ExperimentDto> list2, @Nullable AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto) {
        this(configurationsDto, platformConfigurationsDto, list, universalLinksConfigurationDto, recommendationsConfigurationsDTO, list2, null, analyticsLoadBalancerConfigurationDto, 64, null);
        configurationsDto.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public AppConfigurationsDto(@NotNull ConfigurationsDto configurationsDto, @Nullable PlatformConfigurationsDto platformConfigurationsDto, @NotNull List<AdsConfigurationsDto> list, @Nullable UniversalLinksConfigurationDto universalLinksConfigurationDto, @Nullable List<ExperimentDto> list2, @Nullable AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto) {
        this(configurationsDto, platformConfigurationsDto, list, universalLinksConfigurationDto, null, list2, null, analyticsLoadBalancerConfigurationDto, 80, null);
        configurationsDto.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public AppConfigurationsDto(@NotNull ConfigurationsDto configurationsDto, @Nullable UniversalLinksConfigurationDto universalLinksConfigurationDto, @Nullable List<ExperimentDto> list, @Nullable AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto) {
        this(configurationsDto, null, null, universalLinksConfigurationDto, null, list, null, analyticsLoadBalancerConfigurationDto, 86, null);
        configurationsDto.getClass();
    }

    @Keep
    public AppConfigurationsDto(@Nullable UniversalLinksConfigurationDto universalLinksConfigurationDto, @Nullable List<ExperimentDto> list, @Nullable AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto) {
        this(null, null, null, universalLinksConfigurationDto, null, list, null, analyticsLoadBalancerConfigurationDto, 87, null);
    }

    @Keep
    public AppConfigurationsDto(@NotNull ConfigurationsDto configurationsDto, @Nullable PlatformConfigurationsDto platformConfigurationsDto, @NotNull List<AdsConfigurationsDto> list, @Nullable UniversalLinksConfigurationDto universalLinksConfigurationDto, @Nullable RecommendationsConfigurationsDTO recommendationsConfigurationsDTO, @Nullable List<ExperimentDto> list2, @Nullable LoggerConfigurationsDTO loggerConfigurationsDTO, @Nullable AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto) {
        configurationsDto.getClass();
        list.getClass();
        this.configurations = configurationsDto;
        this.platformConfigurations = platformConfigurationsDto;
        this.adsConfigurations = list;
        this.universalLinksConfiguration = universalLinksConfigurationDto;
        this.recommendationsConfigurations = recommendationsConfigurationsDTO;
        this.experiments = list2;
        this.loggerConfigurations = loggerConfigurationsDTO;
        this.analyticsLoadBalancerConfiguration = analyticsLoadBalancerConfigurationDto;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public AppConfigurationsDto(@NotNull ConfigurationsDto configurationsDto, @Nullable PlatformConfigurationsDto platformConfigurationsDto, @Nullable UniversalLinksConfigurationDto universalLinksConfigurationDto, @Nullable List<ExperimentDto> list, @Nullable AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfigurationDto) {
        this(configurationsDto, platformConfigurationsDto, null, universalLinksConfigurationDto, null, list, null, analyticsLoadBalancerConfigurationDto, 84, null);
        configurationsDto.getClass();
    }
}
