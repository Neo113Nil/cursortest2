package defpackage;

import com.blaze.blazesdk.app_configurations.models.AppConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.ads.c;
import com.blaze.blazesdk.app_configurations.models.ads.k;
import com.blaze.blazesdk.app_configurations.models.analytics.AnalyticsLoadBalancerConfigurationDto;
import com.blaze.blazesdk.app_configurations.models.configurations.ConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.experiments.ExperimentDto;
import com.blaze.blazesdk.app_configurations.models.logger.IgnoredLogDTO;
import com.blaze.blazesdk.app_configurations.models.logger.LogLevelDTO;
import com.blaze.blazesdk.app_configurations.models.logger.LoggerConfigurationsDTO;
import com.blaze.blazesdk.app_configurations.models.platform.PlatformConfigurationsDto;
import com.blaze.blazesdk.app_configurations.models.recommendations.RecommendationsConfigurations;
import com.blaze.blazesdk.app_configurations.models.recommendations.RecommendationsConfigurationsDTO;
import com.blaze.blazesdk.app_configurations.models.universal_links.SharingCopyDto;
import com.blaze.blazesdk.app_configurations.models.universal_links.SharingPathDto;
import com.blaze.blazesdk.app_configurations.models.universal_links.UniversalLinksConfigurationDto;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b2m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0178  */
    /* JADX WARN: Type inference failed for: r2v12, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [km5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tul a(AppConfigurationsDto appConfigurationsDto) {
        int parseInt;
        String storiesLikesThreshold;
        int parseInt2;
        String videosLikesThreshold;
        int parseInt3;
        Boolean enableClientPlaybackModification;
        String str;
        String str2;
        boolean z;
        UniversalLinksConfigurationDto universalLinksConfiguration;
        q5m q5mVar;
        RecommendationsConfigurationsDTO recommendationsConfigurations;
        RecommendationsConfigurations recommendationsConfigurations2;
        List<ExperimentDto> experiments;
        ArrayList arrayList;
        LoggerConfigurationsDTO loggerConfigurations;
        dql dqlVar;
        e8m e8mVar;
        List<String> hosts;
        vul vulVar;
        vul vulVar2;
        List list;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        oql oqlVar;
        wul wulVar;
        List list2;
        Long k0;
        appConfigurationsDto.getClass();
        ConfigurationsDto configurations = appConfigurationsDto.getConfigurations();
        configurations.getClass();
        String analyticsBatchIntervalInSeconds = configurations.getAnalyticsBatchIntervalInSeconds();
        if (analyticsBatchIntervalInSeconds == null) {
            analyticsBatchIntervalInSeconds = "1";
        }
        String analyticsMaxAllowedBatchSize = configurations.getAnalyticsMaxAllowedBatchSize();
        if (analyticsMaxAllowedBatchSize == null) {
            analyticsMaxAllowedBatchSize = "80";
        }
        String analyticsMinAllowedBatchSize = configurations.getAnalyticsMinAllowedBatchSize();
        String str3 = analyticsMinAllowedBatchSize != null ? analyticsMinAllowedBatchSize : "1";
        String activityFetchTimeIntervalInSeconds = configurations.getActivityFetchTimeIntervalInSeconds();
        if (activityFetchTimeIntervalInSeconds == null) {
            activityFetchTimeIntervalInSeconds = "300";
        }
        String activitySyncMinAllowedBatchSize = configurations.getActivitySyncMinAllowedBatchSize();
        if (activitySyncMinAllowedBatchSize == null) {
            activitySyncMinAllowedBatchSize = "10";
        }
        String activitySyncTimeIntervalInSeconds = configurations.getActivitySyncTimeIntervalInSeconds();
        if (activitySyncTimeIntervalInSeconds == null) {
            activitySyncTimeIntervalInSeconds = "20";
        }
        Boolean allowActivitySync = configurations.getAllowActivitySync();
        boolean booleanValue = allowActivitySync != null ? allowActivitySync.booleanValue() : false;
        Boolean disableAppActivityEvents = configurations.getDisableAppActivityEvents();
        boolean booleanValue2 = disableAppActivityEvents != null ? disableAppActivityEvents.booleanValue() : false;
        Boolean analyticsAddEntitiesInfo = configurations.getAnalyticsAddEntitiesInfo();
        boolean booleanValue3 = analyticsAddEntitiesInfo != null ? analyticsAddEntitiesInfo.booleanValue() : false;
        String closedCaptionsParserURL = configurations.getClosedCaptionsParserURL();
        Boolean remoteWidgetConfigEnabled = configurations.getRemoteWidgetConfigEnabled();
        boolean booleanValue4 = remoteWidgetConfigEnabled != null ? remoteWidgetConfigEnabled.booleanValue() : false;
        String momentsLikesThreshold = configurations.getMomentsLikesThreshold();
        if (momentsLikesThreshold != null) {
            try {
                parseInt = Integer.parseInt(momentsLikesThreshold);
            } catch (NumberFormatException unused) {
            }
            storiesLikesThreshold = configurations.getStoriesLikesThreshold();
            if (storiesLikesThreshold != null) {
                try {
                    parseInt2 = Integer.parseInt(storiesLikesThreshold);
                } catch (NumberFormatException unused2) {
                }
                videosLikesThreshold = configurations.getVideosLikesThreshold();
                if (videosLikesThreshold != null) {
                    try {
                        parseInt3 = Integer.parseInt(videosLikesThreshold);
                    } catch (NumberFormatException unused3) {
                    }
                    String configRefetchIntervalInMinutes = configurations.getConfigRefetchIntervalInMinutes();
                    Long valueOf = Long.valueOf(((configRefetchIntervalInMinutes != null || (k0 = StringsKt.k0(configRefetchIntervalInMinutes)) == null) ? 60L : k0.longValue()) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                    Boolean enableHLSPrefetch = configurations.getEnableHLSPrefetch();
                    enableClientPlaybackModification = configurations.getEnableClientPlaybackModification();
                    if (enableClientPlaybackModification == null) {
                        String str4 = analyticsMaxAllowedBatchSize;
                        str = str3;
                        str2 = str4;
                        z = enableClientPlaybackModification.booleanValue();
                    } else {
                        String str5 = analyticsMaxAllowedBatchSize;
                        str = str3;
                        str2 = str5;
                        z = false;
                    }
                    uul uulVar = new uul(analyticsBatchIntervalInSeconds, str2, str, activityFetchTimeIntervalInSeconds, activitySyncMinAllowedBatchSize, activitySyncTimeIntervalInSeconds, booleanValue, booleanValue2, booleanValue3, closedCaptionsParserURL, booleanValue4, parseInt, parseInt2, parseInt3, valueOf, enableHLSPrefetch, z);
                    PlatformConfigurationsDto platformConfigurations = appConfigurationsDto.getPlatformConfigurations();
                    c b = k.b(appConfigurationsDto.getAdsConfigurations());
                    universalLinksConfiguration = appConfigurationsDto.getUniversalLinksConfiguration();
                    if (universalLinksConfiguration == null) {
                        SharingCopyDto sharingCopy = universalLinksConfiguration.getSharingCopy();
                        if (sharingCopy != null) {
                            String story = sharingCopy.getStory();
                            if (story == null) {
                                story = "";
                            }
                            String moment = sharingCopy.getMoment();
                            if (moment == null) {
                                moment = "";
                            }
                            String video = sharingCopy.getVideo();
                            if (video == null) {
                                video = "";
                            }
                            oqlVar = new oql(story, moment, video);
                        } else {
                            oqlVar = null;
                        }
                        SharingPathDto sharingPath = universalLinksConfiguration.getSharingPath();
                        if (sharingPath != null) {
                            String str6 = sharingPath.a;
                            if (str6 == null) {
                                str6 = "stories";
                            }
                            String str7 = sharingPath.b;
                            if (str7 == null) {
                                str7 = "moments";
                            }
                            String str8 = sharingPath.c;
                            if (str8 == null) {
                                str8 = "videos";
                            }
                            wulVar = new wul(str6, str7, str8);
                        } else {
                            wulVar = null;
                        }
                        String shareDomain = universalLinksConfiguration.getShareDomain();
                        String str9 = shareDomain == null ? "" : shareDomain;
                        String shareProtocol = universalLinksConfiguration.getShareProtocol();
                        String str10 = shareProtocol == null ? "" : shareProtocol;
                        List<String> validProtocols = universalLinksConfiguration.getValidProtocols();
                        if (validProtocols != null) {
                            list2 = new ArrayList();
                            for (String str11 : validProtocols) {
                                if (str11 != null) {
                                    list2.add(str11);
                                }
                            }
                        } else {
                            list2 = km5.a;
                        }
                        q5mVar = new q5m(oqlVar, wulVar, str9, str10, list2);
                    } else {
                        q5mVar = null;
                    }
                    recommendationsConfigurations = appConfigurationsDto.getRecommendationsConfigurations();
                    if (recommendationsConfigurations == null) {
                        Boolean supportForYou = recommendationsConfigurations.getSupportForYou();
                        boolean booleanValue5 = supportForYou != null ? supportForYou.booleanValue() : false;
                        Boolean supportTrending = recommendationsConfigurations.getSupportTrending();
                        boolean booleanValue6 = supportTrending != null ? supportTrending.booleanValue() : false;
                        Boolean supportMoreLike = recommendationsConfigurations.getSupportMoreLike();
                        boolean booleanValue7 = supportMoreLike != null ? supportMoreLike.booleanValue() : false;
                        Boolean enableForYouContentPreparation = recommendationsConfigurations.getEnableForYouContentPreparation();
                        boolean booleanValue8 = enableForYouContentPreparation != null ? enableForYouContentPreparation.booleanValue() : false;
                        Boolean enableTrendingContentPreparation = recommendationsConfigurations.getEnableTrendingContentPreparation();
                        recommendationsConfigurations2 = new RecommendationsConfigurations(booleanValue5, booleanValue6, booleanValue7, booleanValue8, enableTrendingContentPreparation != null ? enableTrendingContentPreparation.booleanValue() : true);
                    } else {
                        RecommendationsConfigurations.INSTANCE.getClass();
                        recommendationsConfigurations2 = new RecommendationsConfigurations(false, false, false, false, true);
                    }
                    experiments = appConfigurationsDto.getExperiments();
                    if (experiments == null) {
                        arrayList = new ArrayList(k13.r(experiments, 10));
                        for (ExperimentDto experimentDto : experiments) {
                            experimentDto.getClass();
                            arrayList.add(new mql(experimentDto.getId(), experimentDto.getType(), experimentDto.getVariants()));
                        }
                    } else {
                        arrayList = null;
                    }
                    loggerConfigurations = appConfigurationsDto.getLoggerConfigurations();
                    if (loggerConfigurations == null) {
                        Boolean isEnabled = loggerConfigurations.isEnabled();
                        boolean booleanValue9 = isEnabled != null ? isEnabled.booleanValue() : false;
                        String loggerBatchIntervalInSeconds = loggerConfigurations.getLoggerBatchIntervalInSeconds();
                        int intValue = (loggerBatchIntervalInSeconds == null || (intOrNull3 = StringsKt.toIntOrNull(loggerBatchIntervalInSeconds)) == null) ? 30 : intOrNull3.intValue();
                        String loggerMaxAllowedBatchSize = loggerConfigurations.getLoggerMaxAllowedBatchSize();
                        int intValue2 = (loggerMaxAllowedBatchSize == null || (intOrNull2 = StringsKt.toIntOrNull(loggerMaxAllowedBatchSize)) == null) ? 80 : intOrNull2.intValue();
                        String loggerMinAllowedBatchSize = loggerConfigurations.getLoggerMinAllowedBatchSize();
                        int intValue3 = (loggerMinAllowedBatchSize == null || (intOrNull = StringsKt.toIntOrNull(loggerMinAllowedBatchSize)) == null) ? 1 : intOrNull.intValue();
                        LogLevelDTO logLevel = loggerConfigurations.getLogLevel();
                        dqlVar = null;
                        if (logLevel != null) {
                            int i = h5m.a[logLevel.ordinal()];
                            if (i == 1) {
                                vulVar = vul.DEBUG;
                            } else if (i == 2) {
                                vulVar = vul.INFO;
                            } else if (i == 3) {
                                vulVar = vul.WARN;
                            } else if (i == 4) {
                                vulVar = vul.ERROR;
                            } else {
                                if (i != 5) {
                                    zzl.b();
                                    return null;
                                }
                                vulVar = vul.CRITICAL;
                            }
                        } else {
                            vul.a.getClass();
                            vulVar = vul.b;
                        }
                        LogLevelDTO immediateLogLevel = loggerConfigurations.getImmediateLogLevel();
                        if (immediateLogLevel != null) {
                            int i2 = h5m.a[immediateLogLevel.ordinal()];
                            if (i2 == 1) {
                                vulVar2 = vul.DEBUG;
                            } else if (i2 == 2) {
                                vulVar2 = vul.INFO;
                            } else if (i2 == 3) {
                                vulVar2 = vul.WARN;
                            } else if (i2 == 4) {
                                vulVar2 = vul.ERROR;
                            } else {
                                if (i2 != 5) {
                                    zzl.b();
                                    return null;
                                }
                                vulVar2 = vul.CRITICAL;
                            }
                        } else {
                            vul.a.getClass();
                            vulVar2 = vul.c;
                        }
                        vul vulVar3 = vulVar2;
                        List<IgnoredLogDTO> ignoredLogs = loggerConfigurations.getIgnoredLogs();
                        if (ignoredLogs != null) {
                            list = new ArrayList();
                            for (IgnoredLogDTO ignoredLogDTO : ignoredLogs) {
                                ignoredLogDTO.getClass();
                                c2m c2mVar = (ignoredLogDTO.getLogIdentifier() == null || ignoredLogDTO.getSdkType() == null) ? null : new c2m(ignoredLogDTO.getLogIdentifier(), ignoredLogDTO.getSdkType(), ignoredLogDTO.getApplyFromVersion(), ignoredLogDTO.getApplyBelowVersion(), ignoredLogDTO.getApplySpecificVersions());
                                if (c2mVar != null) {
                                    list.add(c2mVar);
                                }
                            }
                        } else {
                            c2m.f.getClass();
                            list = c2m.g;
                        }
                        e8mVar = new e8m(booleanValue9, intValue, intValue2, intValue3, vulVar, vulVar3, list);
                    } else {
                        dqlVar = null;
                        e8mVar = null;
                    }
                    AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfiguration = appConfigurationsDto.getAnalyticsLoadBalancerConfiguration();
                    return new tul(uulVar, platformConfigurations, b, q5mVar, recommendationsConfigurations2, arrayList, e8mVar, (analyticsLoadBalancerConfiguration != null || (hosts = analyticsLoadBalancerConfiguration.getHosts()) == null || hosts.isEmpty()) ? dqlVar : new dql(analyticsLoadBalancerConfiguration.getHosts()));
                }
                parseInt3 = 0;
                String configRefetchIntervalInMinutes2 = configurations.getConfigRefetchIntervalInMinutes();
                Long valueOf2 = Long.valueOf(((configRefetchIntervalInMinutes2 != null || (k0 = StringsKt.k0(configRefetchIntervalInMinutes2)) == null) ? 60L : k0.longValue()) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Boolean enableHLSPrefetch2 = configurations.getEnableHLSPrefetch();
                enableClientPlaybackModification = configurations.getEnableClientPlaybackModification();
                if (enableClientPlaybackModification == null) {
                }
                uul uulVar2 = new uul(analyticsBatchIntervalInSeconds, str2, str, activityFetchTimeIntervalInSeconds, activitySyncMinAllowedBatchSize, activitySyncTimeIntervalInSeconds, booleanValue, booleanValue2, booleanValue3, closedCaptionsParserURL, booleanValue4, parseInt, parseInt2, parseInt3, valueOf2, enableHLSPrefetch2, z);
                PlatformConfigurationsDto platformConfigurations2 = appConfigurationsDto.getPlatformConfigurations();
                c b2 = k.b(appConfigurationsDto.getAdsConfigurations());
                universalLinksConfiguration = appConfigurationsDto.getUniversalLinksConfiguration();
                if (universalLinksConfiguration == null) {
                }
                recommendationsConfigurations = appConfigurationsDto.getRecommendationsConfigurations();
                if (recommendationsConfigurations == null) {
                }
                experiments = appConfigurationsDto.getExperiments();
                if (experiments == null) {
                }
                loggerConfigurations = appConfigurationsDto.getLoggerConfigurations();
                if (loggerConfigurations == null) {
                }
                AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfiguration2 = appConfigurationsDto.getAnalyticsLoadBalancerConfiguration();
                return new tul(uulVar2, platformConfigurations2, b2, q5mVar, recommendationsConfigurations2, arrayList, e8mVar, (analyticsLoadBalancerConfiguration2 != null || (hosts = analyticsLoadBalancerConfiguration2.getHosts()) == null || hosts.isEmpty()) ? dqlVar : new dql(analyticsLoadBalancerConfiguration2.getHosts()));
            }
            parseInt2 = 0;
            videosLikesThreshold = configurations.getVideosLikesThreshold();
            if (videosLikesThreshold != null) {
            }
            parseInt3 = 0;
            String configRefetchIntervalInMinutes22 = configurations.getConfigRefetchIntervalInMinutes();
            Long valueOf22 = Long.valueOf(((configRefetchIntervalInMinutes22 != null || (k0 = StringsKt.k0(configRefetchIntervalInMinutes22)) == null) ? 60L : k0.longValue()) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            Boolean enableHLSPrefetch22 = configurations.getEnableHLSPrefetch();
            enableClientPlaybackModification = configurations.getEnableClientPlaybackModification();
            if (enableClientPlaybackModification == null) {
            }
            uul uulVar22 = new uul(analyticsBatchIntervalInSeconds, str2, str, activityFetchTimeIntervalInSeconds, activitySyncMinAllowedBatchSize, activitySyncTimeIntervalInSeconds, booleanValue, booleanValue2, booleanValue3, closedCaptionsParserURL, booleanValue4, parseInt, parseInt2, parseInt3, valueOf22, enableHLSPrefetch22, z);
            PlatformConfigurationsDto platformConfigurations22 = appConfigurationsDto.getPlatformConfigurations();
            c b22 = k.b(appConfigurationsDto.getAdsConfigurations());
            universalLinksConfiguration = appConfigurationsDto.getUniversalLinksConfiguration();
            if (universalLinksConfiguration == null) {
            }
            recommendationsConfigurations = appConfigurationsDto.getRecommendationsConfigurations();
            if (recommendationsConfigurations == null) {
            }
            experiments = appConfigurationsDto.getExperiments();
            if (experiments == null) {
            }
            loggerConfigurations = appConfigurationsDto.getLoggerConfigurations();
            if (loggerConfigurations == null) {
            }
            AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfiguration22 = appConfigurationsDto.getAnalyticsLoadBalancerConfiguration();
            return new tul(uulVar22, platformConfigurations22, b22, q5mVar, recommendationsConfigurations2, arrayList, e8mVar, (analyticsLoadBalancerConfiguration22 != null || (hosts = analyticsLoadBalancerConfiguration22.getHosts()) == null || hosts.isEmpty()) ? dqlVar : new dql(analyticsLoadBalancerConfiguration22.getHosts()));
        }
        parseInt = 0;
        storiesLikesThreshold = configurations.getStoriesLikesThreshold();
        if (storiesLikesThreshold != null) {
        }
        parseInt2 = 0;
        videosLikesThreshold = configurations.getVideosLikesThreshold();
        if (videosLikesThreshold != null) {
        }
        parseInt3 = 0;
        String configRefetchIntervalInMinutes222 = configurations.getConfigRefetchIntervalInMinutes();
        Long valueOf222 = Long.valueOf(((configRefetchIntervalInMinutes222 != null || (k0 = StringsKt.k0(configRefetchIntervalInMinutes222)) == null) ? 60L : k0.longValue()) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        Boolean enableHLSPrefetch222 = configurations.getEnableHLSPrefetch();
        enableClientPlaybackModification = configurations.getEnableClientPlaybackModification();
        if (enableClientPlaybackModification == null) {
        }
        uul uulVar222 = new uul(analyticsBatchIntervalInSeconds, str2, str, activityFetchTimeIntervalInSeconds, activitySyncMinAllowedBatchSize, activitySyncTimeIntervalInSeconds, booleanValue, booleanValue2, booleanValue3, closedCaptionsParserURL, booleanValue4, parseInt, parseInt2, parseInt3, valueOf222, enableHLSPrefetch222, z);
        PlatformConfigurationsDto platformConfigurations222 = appConfigurationsDto.getPlatformConfigurations();
        c b222 = k.b(appConfigurationsDto.getAdsConfigurations());
        universalLinksConfiguration = appConfigurationsDto.getUniversalLinksConfiguration();
        if (universalLinksConfiguration == null) {
        }
        recommendationsConfigurations = appConfigurationsDto.getRecommendationsConfigurations();
        if (recommendationsConfigurations == null) {
        }
        experiments = appConfigurationsDto.getExperiments();
        if (experiments == null) {
        }
        loggerConfigurations = appConfigurationsDto.getLoggerConfigurations();
        if (loggerConfigurations == null) {
        }
        AnalyticsLoadBalancerConfigurationDto analyticsLoadBalancerConfiguration222 = appConfigurationsDto.getAnalyticsLoadBalancerConfiguration();
        return new tul(uulVar222, platformConfigurations222, b222, q5mVar, recommendationsConfigurations2, arrayList, e8mVar, (analyticsLoadBalancerConfiguration222 != null || (hosts = analyticsLoadBalancerConfiguration222.getHosts()) == null || hosts.isEmpty()) ? dqlVar : new dql(analyticsLoadBalancerConfiguration222.getHosts()));
    }
}
