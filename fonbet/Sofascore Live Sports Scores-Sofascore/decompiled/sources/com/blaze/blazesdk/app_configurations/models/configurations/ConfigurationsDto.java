package com.blaze.blazesdk.app_configurations.models.configurations;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJÚ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u001a\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001f¨\u0006C"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;", "", "analyticsBatchIntervalInSeconds", "", "analyticsMaxAllowedBatchSize", "analyticsMinAllowedBatchSize", "activityFetchTimeIntervalInSeconds", "activitySyncMinAllowedBatchSize", "activitySyncTimeIntervalInSeconds", "allowActivitySync", "", "disableAppActivityEvents", "analyticsAddEntitiesInfo", "closedCaptionsParserURL", "remoteWidgetConfigEnabled", "momentsLikesThreshold", "storiesLikesThreshold", "videosLikesThreshold", "configRefetchIntervalInMinutes", "enableHLSPrefetch", "enableClientPlaybackModification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAnalyticsBatchIntervalInSeconds", "()Ljava/lang/String;", "getAnalyticsMaxAllowedBatchSize", "getAnalyticsMinAllowedBatchSize", "getActivityFetchTimeIntervalInSeconds", "getActivitySyncMinAllowedBatchSize", "getActivitySyncTimeIntervalInSeconds", "getAllowActivitySync", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisableAppActivityEvents", "getAnalyticsAddEntitiesInfo", "getClosedCaptionsParserURL", "getRemoteWidgetConfigEnabled", "getMomentsLikesThreshold", "getStoriesLikesThreshold", "getVideosLikesThreshold", "getConfigRefetchIntervalInMinutes", "getEnableHLSPrefetch", "getEnableClientPlaybackModification", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/blaze/blazesdk/app_configurations/models/configurations/ConfigurationsDto;", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ConfigurationsDto {
    public static final int $stable = 0;

    @b6h("activityFetchTimeIntervalInSeconds")
    @Nullable
    private final String activityFetchTimeIntervalInSeconds;

    @b6h("activitySyncMinAllowedBatchSize")
    @Nullable
    private final String activitySyncMinAllowedBatchSize;

    @b6h("activitySyncTimeIntervalInSeconds")
    @Nullable
    private final String activitySyncTimeIntervalInSeconds;

    @b6h("allowActivitySync")
    @Nullable
    private final Boolean allowActivitySync;

    @b6h("analyticsAddEntitiesInfo")
    @Nullable
    private final Boolean analyticsAddEntitiesInfo;

    @b6h("analyticsBatchIntervalInSeconds")
    @Nullable
    private final String analyticsBatchIntervalInSeconds;

    @b6h("analyticsMaxAllowedBatchSize")
    @Nullable
    private final String analyticsMaxAllowedBatchSize;

    @b6h("analyticsMinAllowedBatchSize")
    @Nullable
    private final String analyticsMinAllowedBatchSize;

    @b6h("closedCaptionsParserURL")
    @Nullable
    private final String closedCaptionsParserURL;

    @b6h("configRefetchIntervalInMinutes")
    @Nullable
    private final String configRefetchIntervalInMinutes;

    @b6h("disableAppActivityEvents")
    @Nullable
    private final Boolean disableAppActivityEvents;

    @b6h("enableClientPlaybackModification")
    @Nullable
    private final Boolean enableClientPlaybackModification;

    @b6h("enableHLSPrefetch")
    @Nullable
    private final Boolean enableHLSPrefetch;

    @b6h("momentsLikesThreshold")
    @Nullable
    private final String momentsLikesThreshold;

    @b6h("remoteWidgetConfigEnabled")
    @Nullable
    private final Boolean remoteWidgetConfigEnabled;

    @b6h("storiesLikesThreshold")
    @Nullable
    private final String storiesLikesThreshold;

    @b6h("videosLikesThreshold")
    @Nullable
    private final String videosLikesThreshold;

    public /* synthetic */ ConfigurationsDto(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, String str7, Boolean bool4, String str8, String str9, String str10, String str11, Boolean bool5, Boolean bool6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : bool3, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : bool4, (i & a.o) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : bool5, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : bool6);
    }

    public static /* synthetic */ ConfigurationsDto copy$default(ConfigurationsDto configurationsDto, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, String str7, Boolean bool4, String str8, String str9, String str10, String str11, Boolean bool5, Boolean bool6, int i, Object obj) {
        Boolean bool7;
        Boolean bool8;
        String str12;
        ConfigurationsDto configurationsDto2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        String str19;
        Boolean bool12;
        String str20;
        String str21;
        String str22;
        String str23 = (i & 1) != 0 ? configurationsDto.analyticsBatchIntervalInSeconds : str;
        String str24 = (i & 2) != 0 ? configurationsDto.analyticsMaxAllowedBatchSize : str2;
        String str25 = (i & 4) != 0 ? configurationsDto.analyticsMinAllowedBatchSize : str3;
        String str26 = (i & 8) != 0 ? configurationsDto.activityFetchTimeIntervalInSeconds : str4;
        String str27 = (i & 16) != 0 ? configurationsDto.activitySyncMinAllowedBatchSize : str5;
        String str28 = (i & 32) != 0 ? configurationsDto.activitySyncTimeIntervalInSeconds : str6;
        Boolean bool13 = (i & 64) != 0 ? configurationsDto.allowActivitySync : bool;
        Boolean bool14 = (i & 128) != 0 ? configurationsDto.disableAppActivityEvents : bool2;
        Boolean bool15 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? configurationsDto.analyticsAddEntitiesInfo : bool3;
        String str29 = (i & 512) != 0 ? configurationsDto.closedCaptionsParserURL : str7;
        Boolean bool16 = (i & 1024) != 0 ? configurationsDto.remoteWidgetConfigEnabled : bool4;
        String str30 = (i & a.o) != 0 ? configurationsDto.momentsLikesThreshold : str8;
        String str31 = (i & 4096) != 0 ? configurationsDto.storiesLikesThreshold : str9;
        String str32 = (i & 8192) != 0 ? configurationsDto.videosLikesThreshold : str10;
        String str33 = str23;
        String str34 = (i & 16384) != 0 ? configurationsDto.configRefetchIntervalInMinutes : str11;
        Boolean bool17 = (i & 32768) != 0 ? configurationsDto.enableHLSPrefetch : bool5;
        if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            bool8 = bool17;
            bool7 = configurationsDto.enableClientPlaybackModification;
            str13 = str34;
            str14 = str24;
            str15 = str25;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            bool9 = bool13;
            bool10 = bool14;
            bool11 = bool15;
            str19 = str29;
            bool12 = bool16;
            str20 = str30;
            str21 = str31;
            str22 = str32;
            str12 = str33;
            configurationsDto2 = configurationsDto;
        } else {
            bool7 = bool6;
            bool8 = bool17;
            str12 = str33;
            configurationsDto2 = configurationsDto;
            str13 = str34;
            str14 = str24;
            str15 = str25;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            bool9 = bool13;
            bool10 = bool14;
            bool11 = bool15;
            str19 = str29;
            bool12 = bool16;
            str20 = str30;
            str21 = str31;
            str22 = str32;
        }
        return configurationsDto2.copy(str12, str14, str15, str16, str17, str18, bool9, bool10, bool11, str19, bool12, str20, str21, str22, str13, bool8, bool7);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAnalyticsBatchIntervalInSeconds() {
        return this.analyticsBatchIntervalInSeconds;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getClosedCaptionsParserURL() {
        return this.closedCaptionsParserURL;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getRemoteWidgetConfigEnabled() {
        return this.remoteWidgetConfigEnabled;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getMomentsLikesThreshold() {
        return this.momentsLikesThreshold;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getStoriesLikesThreshold() {
        return this.storiesLikesThreshold;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getVideosLikesThreshold() {
        return this.videosLikesThreshold;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getConfigRefetchIntervalInMinutes() {
        return this.configRefetchIntervalInMinutes;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getEnableHLSPrefetch() {
        return this.enableHLSPrefetch;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Boolean getEnableClientPlaybackModification() {
        return this.enableClientPlaybackModification;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAnalyticsMaxAllowedBatchSize() {
        return this.analyticsMaxAllowedBatchSize;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAnalyticsMinAllowedBatchSize() {
        return this.analyticsMinAllowedBatchSize;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getActivityFetchTimeIntervalInSeconds() {
        return this.activityFetchTimeIntervalInSeconds;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getActivitySyncMinAllowedBatchSize() {
        return this.activitySyncMinAllowedBatchSize;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getActivitySyncTimeIntervalInSeconds() {
        return this.activitySyncTimeIntervalInSeconds;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getAllowActivitySync() {
        return this.allowActivitySync;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getDisableAppActivityEvents() {
        return this.disableAppActivityEvents;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getAnalyticsAddEntitiesInfo() {
        return this.analyticsAddEntitiesInfo;
    }

    @NotNull
    public final ConfigurationsDto copy(@Nullable String analyticsBatchIntervalInSeconds, @Nullable String analyticsMaxAllowedBatchSize, @Nullable String analyticsMinAllowedBatchSize, @Nullable String activityFetchTimeIntervalInSeconds, @Nullable String activitySyncMinAllowedBatchSize, @Nullable String activitySyncTimeIntervalInSeconds, @Nullable Boolean allowActivitySync, @Nullable Boolean disableAppActivityEvents, @Nullable Boolean analyticsAddEntitiesInfo, @Nullable String closedCaptionsParserURL, @Nullable Boolean remoteWidgetConfigEnabled, @Nullable String momentsLikesThreshold, @Nullable String storiesLikesThreshold, @Nullable String videosLikesThreshold, @Nullable String configRefetchIntervalInMinutes, @Nullable Boolean enableHLSPrefetch, @Nullable Boolean enableClientPlaybackModification) {
        return new ConfigurationsDto(analyticsBatchIntervalInSeconds, analyticsMaxAllowedBatchSize, analyticsMinAllowedBatchSize, activityFetchTimeIntervalInSeconds, activitySyncMinAllowedBatchSize, activitySyncTimeIntervalInSeconds, allowActivitySync, disableAppActivityEvents, analyticsAddEntitiesInfo, closedCaptionsParserURL, remoteWidgetConfigEnabled, momentsLikesThreshold, storiesLikesThreshold, videosLikesThreshold, configRefetchIntervalInMinutes, enableHLSPrefetch, enableClientPlaybackModification);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigurationsDto)) {
            return false;
        }
        ConfigurationsDto configurationsDto = (ConfigurationsDto) other;
        return Intrinsics.c(this.analyticsBatchIntervalInSeconds, configurationsDto.analyticsBatchIntervalInSeconds) && Intrinsics.c(this.analyticsMaxAllowedBatchSize, configurationsDto.analyticsMaxAllowedBatchSize) && Intrinsics.c(this.analyticsMinAllowedBatchSize, configurationsDto.analyticsMinAllowedBatchSize) && Intrinsics.c(this.activityFetchTimeIntervalInSeconds, configurationsDto.activityFetchTimeIntervalInSeconds) && Intrinsics.c(this.activitySyncMinAllowedBatchSize, configurationsDto.activitySyncMinAllowedBatchSize) && Intrinsics.c(this.activitySyncTimeIntervalInSeconds, configurationsDto.activitySyncTimeIntervalInSeconds) && Intrinsics.c(this.allowActivitySync, configurationsDto.allowActivitySync) && Intrinsics.c(this.disableAppActivityEvents, configurationsDto.disableAppActivityEvents) && Intrinsics.c(this.analyticsAddEntitiesInfo, configurationsDto.analyticsAddEntitiesInfo) && Intrinsics.c(this.closedCaptionsParserURL, configurationsDto.closedCaptionsParserURL) && Intrinsics.c(this.remoteWidgetConfigEnabled, configurationsDto.remoteWidgetConfigEnabled) && Intrinsics.c(this.momentsLikesThreshold, configurationsDto.momentsLikesThreshold) && Intrinsics.c(this.storiesLikesThreshold, configurationsDto.storiesLikesThreshold) && Intrinsics.c(this.videosLikesThreshold, configurationsDto.videosLikesThreshold) && Intrinsics.c(this.configRefetchIntervalInMinutes, configurationsDto.configRefetchIntervalInMinutes) && Intrinsics.c(this.enableHLSPrefetch, configurationsDto.enableHLSPrefetch) && Intrinsics.c(this.enableClientPlaybackModification, configurationsDto.enableClientPlaybackModification);
    }

    @Nullable
    public final String getActivityFetchTimeIntervalInSeconds() {
        return this.activityFetchTimeIntervalInSeconds;
    }

    @Nullable
    public final String getActivitySyncMinAllowedBatchSize() {
        return this.activitySyncMinAllowedBatchSize;
    }

    @Nullable
    public final String getActivitySyncTimeIntervalInSeconds() {
        return this.activitySyncTimeIntervalInSeconds;
    }

    @Nullable
    public final Boolean getAllowActivitySync() {
        return this.allowActivitySync;
    }

    @Nullable
    public final Boolean getAnalyticsAddEntitiesInfo() {
        return this.analyticsAddEntitiesInfo;
    }

    @Nullable
    public final String getAnalyticsBatchIntervalInSeconds() {
        return this.analyticsBatchIntervalInSeconds;
    }

    @Nullable
    public final String getAnalyticsMaxAllowedBatchSize() {
        return this.analyticsMaxAllowedBatchSize;
    }

    @Nullable
    public final String getAnalyticsMinAllowedBatchSize() {
        return this.analyticsMinAllowedBatchSize;
    }

    @Nullable
    public final String getClosedCaptionsParserURL() {
        return this.closedCaptionsParserURL;
    }

    @Nullable
    public final String getConfigRefetchIntervalInMinutes() {
        return this.configRefetchIntervalInMinutes;
    }

    @Nullable
    public final Boolean getDisableAppActivityEvents() {
        return this.disableAppActivityEvents;
    }

    @Nullable
    public final Boolean getEnableClientPlaybackModification() {
        return this.enableClientPlaybackModification;
    }

    @Nullable
    public final Boolean getEnableHLSPrefetch() {
        return this.enableHLSPrefetch;
    }

    @Nullable
    public final String getMomentsLikesThreshold() {
        return this.momentsLikesThreshold;
    }

    @Nullable
    public final Boolean getRemoteWidgetConfigEnabled() {
        return this.remoteWidgetConfigEnabled;
    }

    @Nullable
    public final String getStoriesLikesThreshold() {
        return this.storiesLikesThreshold;
    }

    @Nullable
    public final String getVideosLikesThreshold() {
        return this.videosLikesThreshold;
    }

    public int hashCode() {
        String str = this.analyticsBatchIntervalInSeconds;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.analyticsMaxAllowedBatchSize;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.analyticsMinAllowedBatchSize;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.activityFetchTimeIntervalInSeconds;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activitySyncMinAllowedBatchSize;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.activitySyncTimeIntervalInSeconds;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.allowActivitySync;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disableAppActivityEvents;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.analyticsAddEntitiesInfo;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str7 = this.closedCaptionsParserURL;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool4 = this.remoteWidgetConfigEnabled;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str8 = this.momentsLikesThreshold;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.storiesLikesThreshold;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.videosLikesThreshold;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.configRefetchIntervalInMinutes;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool5 = this.enableHLSPrefetch;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableClientPlaybackModification;
        return hashCode16 + (bool6 != null ? bool6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConfigurationsDto(analyticsBatchIntervalInSeconds=" + this.analyticsBatchIntervalInSeconds + ", analyticsMaxAllowedBatchSize=" + this.analyticsMaxAllowedBatchSize + ", analyticsMinAllowedBatchSize=" + this.analyticsMinAllowedBatchSize + ", activityFetchTimeIntervalInSeconds=" + this.activityFetchTimeIntervalInSeconds + ", activitySyncMinAllowedBatchSize=" + this.activitySyncMinAllowedBatchSize + ", activitySyncTimeIntervalInSeconds=" + this.activitySyncTimeIntervalInSeconds + ", allowActivitySync=" + this.allowActivitySync + ", disableAppActivityEvents=" + this.disableAppActivityEvents + ", analyticsAddEntitiesInfo=" + this.analyticsAddEntitiesInfo + ", closedCaptionsParserURL=" + this.closedCaptionsParserURL + ", remoteWidgetConfigEnabled=" + this.remoteWidgetConfigEnabled + ", momentsLikesThreshold=" + this.momentsLikesThreshold + ", storiesLikesThreshold=" + this.storiesLikesThreshold + ", videosLikesThreshold=" + this.videosLikesThreshold + ", configRefetchIntervalInMinutes=" + this.configRefetchIntervalInMinutes + ", enableHLSPrefetch=" + this.enableHLSPrefetch + ", enableClientPlaybackModification=" + this.enableClientPlaybackModification + ')';
    }

    @Keep
    public ConfigurationsDto(@Nullable String str) {
        this(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131068, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this(str, str2, str3, str4, null, null, null, null, null, null, null, null, null, null, null, null, null, 131056, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this(str, str2, str3, str4, str5, null, null, null, null, null, null, null, null, null, null, null, null, 131040, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, null, null, null, null, null, null, null, null, null, 131008, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
        this(str, str2, str3, str4, str5, str6, bool, null, null, null, null, null, null, null, null, null, null, 130944, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, null, null, null, null, null, null, null, null, null, 130816, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, null, null, null, null, null, null, null, null, 130560, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, str7, null, null, null, null, null, null, null, 130048, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable Boolean bool4) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, str7, bool4, null, null, null, null, null, null, 129024, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable Boolean bool4, @Nullable String str8) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, str7, bool4, str8, null, null, null, null, null, 126976, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable Boolean bool4, @Nullable String str8, @Nullable String str9) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, str7, bool4, str8, str9, null, null, null, null, 122880, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable Boolean bool4, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, str7, bool4, str8, str9, str10, null, null, null, 114688, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable Boolean bool4, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, str7, bool4, str8, str9, str10, str11, null, null, 98304, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable Boolean bool4, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool5) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, bool3, str7, bool4, str8, str9, str10, str11, bool5, null, C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
    }

    @Keep
    public ConfigurationsDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable Boolean bool4, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Boolean bool5, @Nullable Boolean bool6) {
        this.analyticsBatchIntervalInSeconds = str;
        this.analyticsMaxAllowedBatchSize = str2;
        this.analyticsMinAllowedBatchSize = str3;
        this.activityFetchTimeIntervalInSeconds = str4;
        this.activitySyncMinAllowedBatchSize = str5;
        this.activitySyncTimeIntervalInSeconds = str6;
        this.allowActivitySync = bool;
        this.disableAppActivityEvents = bool2;
        this.analyticsAddEntitiesInfo = bool3;
        this.closedCaptionsParserURL = str7;
        this.remoteWidgetConfigEnabled = bool4;
        this.momentsLikesThreshold = str8;
        this.storiesLikesThreshold = str9;
        this.videosLikesThreshold = str10;
        this.configRefetchIntervalInMinutes = str11;
        this.enableHLSPrefetch = bool5;
        this.enableClientPlaybackModification = bool6;
    }

    @Keep
    public ConfigurationsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
