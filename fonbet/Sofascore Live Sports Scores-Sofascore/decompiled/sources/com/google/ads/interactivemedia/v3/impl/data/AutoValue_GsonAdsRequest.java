package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$AutoPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$ContinuousPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState;
import com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest;
import defpackage.a70;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.mz1;
import defpackage.q3p;
import defpackage.wt3;
import defpackage.z3p;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_GsonAdsRequest extends GsonAdsRequest {

    @Nullable
    private final z3p adTagParameters;

    @Nullable
    private final String adTagUrl;

    @Nullable
    private final String adsResponse;

    @Nullable
    private final String apiKey;

    @Nullable
    private final String assetKey;

    @Nullable
    private final String authToken;

    @Nullable
    private final z3p companionSlots;

    @Nullable
    private final z3p consentSettings;

    @Nullable
    private final Float contentDuration;

    @Nullable
    private final q3p contentKeywords;

    @Nullable
    private final String contentSourceId;

    @Nullable
    private final String contentSourceUrl;

    @Nullable
    private final String contentTitle;

    @Nullable
    private final String contentUrl;

    @Nullable
    private final String customAssetKey;

    @Nullable
    private final CustomUiOptionsData customUiOptions;

    @Nullable
    private final Integer daiIntegration;

    @Nullable
    private final Boolean enableNonce;

    @Nullable
    private final String env;

    @Nullable
    private final String format;

    @Nullable
    private final IdentifierInfo identifierInfo;

    @Nullable
    private final Boolean isAndroidTvAdsFramework;

    @Nullable
    private final Boolean isTv;

    @Nullable
    private final Integer linearAdSlotHeight;

    @Nullable
    private final Integer linearAdSlotWidth;

    @Nullable
    private final String liveStreamEventId;

    @Nullable
    private final Float liveStreamPrefetchSeconds;

    @Nullable
    private final MarketAppInfo marketAppInfo;

    @Nullable
    private final String msParameter;

    @Nullable
    private final String network;

    @Nullable
    private final String networkCode;

    @Nullable
    private final String oAuthToken;

    @Nullable
    private final Boolean omidAdSessionsOnStartedOnly;

    @Nullable
    private final String pauseAdSlot;

    @Nullable
    private final Double pixelDensity;

    @Nullable
    private final z3p platformSignals;

    @Nullable
    private final Integer preferredLinearOrientation;

    @Nullable
    private final String projectNumber;

    @Nullable
    private final String region;
    private final int rubidiumApiVersion;

    @Nullable
    private final q3p secureSignals;

    @Nullable
    private final ImaSdkSettingsData settings;

    @Nullable
    private final String streamActivityMonitorId;

    @Nullable
    private final Boolean supportsExternalNavigation;

    @Nullable
    private final Boolean supportsIconClickFallback;

    @Nullable
    private final Boolean supportsNativeClickSignals;

    @Nullable
    private final Boolean supportsNativeNetworking;

    @Nullable
    private final Boolean supportsNativeViewSignals;

    @Nullable
    private final Boolean supportsOmidJsManagedAppSessions;

    @Nullable
    private final Boolean supportsQuicksilver;

    @Nullable
    private final Boolean supportsResizing;

    @Nullable
    private final Boolean useQAStreamBaseUrl;

    @Nullable
    private final Boolean usesCustomVideoPlayback;

    @Nullable
    private final Float vastLoadTimeout;

    @Nullable
    private final AdsRequestImpl$ContinuousPlayState videoContinuousPlay;

    @Nullable
    private final VideoEnvironmentData videoEnvironment;

    @Nullable
    private final String videoId;

    @Nullable
    private final AdsRequestImpl$AutoPlayState videoPlayActivation;

    @Nullable
    private final AdsRequestImpl$MutePlayState videoPlayMuted;

    @Nullable
    private final z3p videoStitcherSessionOptions;

    @Nullable
    private final String vodConfigId;

    @Nullable
    private final Boolean wrappedCompanionsEnabled;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder implements GsonAdsRequest.Builder {
        private z3p adTagParameters;
        private String adTagUrl;
        private String adsResponse;
        private String apiKey;
        private String assetKey;
        private String authToken;
        private z3p companionSlots;
        private z3p consentSettings;
        private Float contentDuration;
        private q3p contentKeywords;
        private String contentSourceId;
        private String contentSourceUrl;
        private String contentTitle;
        private String contentUrl;
        private String customAssetKey;
        private CustomUiOptionsData customUiOptions;
        private Integer daiIntegration;
        private Boolean enableNonce;
        private String env;
        private String format;
        private IdentifierInfo identifierInfo;
        private Boolean isAndroidTvAdsFramework;
        private Boolean isTv;
        private Integer linearAdSlotHeight;
        private Integer linearAdSlotWidth;
        private String liveStreamEventId;
        private Float liveStreamPrefetchSeconds;
        private MarketAppInfo marketAppInfo;
        private String msParameter;
        private String network;
        private String networkCode;
        private String oAuthToken;
        private Boolean omidAdSessionsOnStartedOnly;
        private String pauseAdSlot;
        private Double pixelDensity;
        private z3p platformSignals;
        private Integer preferredLinearOrientation;
        private String projectNumber;
        private String region;
        private int rubidiumApiVersion;
        private q3p secureSignals;
        private byte set$0;
        private ImaSdkSettingsData settings;
        private String streamActivityMonitorId;
        private Boolean supportsExternalNavigation;
        private Boolean supportsIconClickFallback;
        private Boolean supportsNativeClickSignals;
        private Boolean supportsNativeNetworking;
        private Boolean supportsNativeViewSignals;
        private Boolean supportsOmidJsManagedAppSessions;
        private Boolean supportsQuicksilver;
        private Boolean supportsResizing;
        private Boolean useQAStreamBaseUrl;
        private Boolean usesCustomVideoPlayback;
        private Float vastLoadTimeout;
        private AdsRequestImpl$ContinuousPlayState videoContinuousPlay;
        private VideoEnvironmentData videoEnvironment;
        private String videoId;
        private AdsRequestImpl$AutoPlayState videoPlayActivation;
        private AdsRequestImpl$MutePlayState videoPlayMuted;
        private z3p videoStitcherSessionOptions;
        private String vodConfigId;
        private Boolean wrappedCompanionsEnabled;

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder adTagParameters(Map<String, String> map) {
            this.adTagParameters = map == null ? null : z3p.c(map);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder adTagUrl(String str) {
            this.adTagUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder adsResponse(String str) {
            this.adsResponse = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder apiKey(String str) {
            this.apiKey = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder assetKey(String str) {
            this.assetKey = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder authToken(String str) {
            this.authToken = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest build() {
            if (this.set$0 == 1) {
                return new AutoValue_GsonAdsRequest(this.adTagParameters, this.adTagUrl, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentSourceUrl, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.customAssetKey, this.daiIntegration, this.enableNonce, this.env, this.secureSignals, this.format, this.identifierInfo, this.isTv, this.isAndroidTvAdsFramework, this.pauseAdSlot, this.wrappedCompanionsEnabled, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamEventId, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.videoEnvironment, this.networkCode, this.oAuthToken, this.omidAdSessionsOnStartedOnly, this.pixelDensity, this.platformSignals, this.preferredLinearOrientation, this.projectNumber, this.region, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeClickSignals, this.supportsNativeNetworking, this.supportsNativeViewSignals, this.supportsOmidJsManagedAppSessions, this.streamActivityMonitorId, this.supportsQuicksilver, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted, this.videoStitcherSessionOptions, this.vodConfigId, this.customUiOptions, this.rubidiumApiVersion, null);
            }
            a70.r("Missing required properties: rubidiumApiVersion");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder companionSlots(Map<String, String> map) {
            this.companionSlots = map == null ? null : z3p.c(map);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder consentSettings(Map<String, String> map) {
            this.consentSettings = map == null ? null : z3p.c(map);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentDuration(Float f) {
            this.contentDuration = f;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentKeywords(List<String> list) {
            this.contentKeywords = list == null ? null : q3p.u(list);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentSourceId(String str) {
            this.contentSourceId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentSourceUrl(String str) {
            this.contentSourceUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentTitle(String str) {
            this.contentTitle = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder contentUrl(String str) {
            this.contentUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder customAssetKey(String str) {
            this.customAssetKey = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder customUiOptions(@Nullable CustomUiOptionsData customUiOptionsData) {
            this.customUiOptions = customUiOptionsData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder daiIntegration(Integer num) {
            this.daiIntegration = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder enableNonce(Boolean bool) {
            this.enableNonce = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder env(String str) {
            this.env = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder format(String str) {
            this.format = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder identifierInfo(IdentifierInfo identifierInfo) {
            this.identifierInfo = identifierInfo;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder isAndroidTvAdsFramework(Boolean bool) {
            this.isAndroidTvAdsFramework = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder isTv(Boolean bool) {
            this.isTv = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder linearAdSlotHeight(Integer num) {
            this.linearAdSlotHeight = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder linearAdSlotWidth(Integer num) {
            this.linearAdSlotWidth = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder liveStreamEventId(String str) {
            this.liveStreamEventId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder liveStreamPrefetchSeconds(Float f) {
            this.liveStreamPrefetchSeconds = f;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder marketAppInfo(MarketAppInfo marketAppInfo) {
            this.marketAppInfo = marketAppInfo;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder msParameter(String str) {
            this.msParameter = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder network(String str) {
            this.network = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder networkCode(String str) {
            this.networkCode = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder oAuthToken(String str) {
            this.oAuthToken = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder omidAdSessionsOnStartedOnly(Boolean bool) {
            this.omidAdSessionsOnStartedOnly = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder pauseAdSlot(String str) {
            this.pauseAdSlot = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder pixelDensity(Double d) {
            this.pixelDensity = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder platformSignals(@Nullable Map<String, String> map) {
            this.platformSignals = map == null ? null : z3p.c(map);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder preferredLinearOrientation(Integer num) {
            this.preferredLinearOrientation = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder projectNumber(String str) {
            this.projectNumber = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder region(String str) {
            this.region = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder rubidiumApiVersion(int i) {
            this.rubidiumApiVersion = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder secureSignals(List<SecureSignalsData> list) {
            this.secureSignals = list == null ? null : q3p.u(list);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder settings(ImaSdkSettingsData imaSdkSettingsData) {
            this.settings = imaSdkSettingsData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder streamActivityMonitorId(String str) {
            this.streamActivityMonitorId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsExternalNavigation(Boolean bool) {
            this.supportsExternalNavigation = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsIconClickFallback(Boolean bool) {
            this.supportsIconClickFallback = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsNativeClickSignals(Boolean bool) {
            this.supportsNativeClickSignals = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsNativeNetworking(Boolean bool) {
            this.supportsNativeNetworking = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsNativeViewSignals(Boolean bool) {
            this.supportsNativeViewSignals = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsOmidJsManagedAppSessions(Boolean bool) {
            this.supportsOmidJsManagedAppSessions = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsQuicksilver(Boolean bool) {
            this.supportsQuicksilver = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder supportsResizing(Boolean bool) {
            this.supportsResizing = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder useQAStreamBaseUrl(Boolean bool) {
            this.useQAStreamBaseUrl = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder usesCustomVideoPlayback(Boolean bool) {
            this.usesCustomVideoPlayback = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder vastLoadTimeout(Float f) {
            this.vastLoadTimeout = f;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoContinuousPlay(AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState) {
            this.videoContinuousPlay = adsRequestImpl$ContinuousPlayState;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoEnvironment(VideoEnvironmentData videoEnvironmentData) {
            this.videoEnvironment = videoEnvironmentData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoId(String str) {
            this.videoId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoPlayActivation(AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState) {
            this.videoPlayActivation = adsRequestImpl$AutoPlayState;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoPlayMuted(AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState) {
            this.videoPlayMuted = adsRequestImpl$MutePlayState;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder videoStitcherSessionOptions(@Nullable Map<String, Object> map) {
            this.videoStitcherSessionOptions = map == null ? null : z3p.c(map);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder vodConfigId(String str) {
            this.vodConfigId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest.Builder
        public GsonAdsRequest.Builder wrappedCompanionsEnabled(Boolean bool) {
            this.wrappedCompanionsEnabled = bool;
            return this;
        }
    }

    private AutoValue_GsonAdsRequest(@Nullable z3p z3pVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable z3p z3pVar2, @Nullable Float f, @Nullable q3p q3pVar, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable z3p z3pVar3, @Nullable String str10, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str11, @Nullable q3p q3pVar2, @Nullable String str12, @Nullable IdentifierInfo identifierInfo, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str13, @Nullable Boolean bool4, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str14, @Nullable Float f2, @Nullable MarketAppInfo marketAppInfo, @Nullable String str15, @Nullable String str16, @Nullable VideoEnvironmentData videoEnvironmentData, @Nullable String str17, @Nullable String str18, @Nullable Boolean bool5, @Nullable Double d, @Nullable z3p z3pVar4, @Nullable Integer num4, @Nullable String str19, @Nullable String str20, @Nullable ImaSdkSettingsData imaSdkSettingsData, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Boolean bool10, @Nullable Boolean bool11, @Nullable String str21, @Nullable Boolean bool12, @Nullable Boolean bool13, @Nullable Boolean bool14, @Nullable Boolean bool15, @Nullable Float f3, @Nullable String str22, @Nullable AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState, @Nullable AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState, @Nullable AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState, @Nullable z3p z3pVar5, @Nullable String str23, @Nullable CustomUiOptionsData customUiOptionsData, int i) {
        this.adTagParameters = z3pVar;
        this.adTagUrl = str;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = z3pVar2;
        this.contentDuration = f;
        this.contentKeywords = q3pVar;
        this.contentSourceUrl = str6;
        this.contentTitle = str7;
        this.contentUrl = str8;
        this.contentSourceId = str9;
        this.consentSettings = z3pVar3;
        this.customAssetKey = str10;
        this.daiIntegration = num;
        this.enableNonce = bool;
        this.env = str11;
        this.secureSignals = q3pVar2;
        this.format = str12;
        this.identifierInfo = identifierInfo;
        this.isTv = bool2;
        this.isAndroidTvAdsFramework = bool3;
        this.pauseAdSlot = str13;
        this.wrappedCompanionsEnabled = bool4;
        this.linearAdSlotWidth = num2;
        this.linearAdSlotHeight = num3;
        this.liveStreamEventId = str14;
        this.liveStreamPrefetchSeconds = f2;
        this.marketAppInfo = marketAppInfo;
        this.msParameter = str15;
        this.network = str16;
        this.videoEnvironment = videoEnvironmentData;
        this.networkCode = str17;
        this.oAuthToken = str18;
        this.omidAdSessionsOnStartedOnly = bool5;
        this.pixelDensity = d;
        this.platformSignals = z3pVar4;
        this.preferredLinearOrientation = num4;
        this.projectNumber = str19;
        this.region = str20;
        this.settings = imaSdkSettingsData;
        this.supportsExternalNavigation = bool6;
        this.supportsIconClickFallback = bool7;
        this.supportsNativeClickSignals = bool8;
        this.supportsNativeNetworking = bool9;
        this.supportsNativeViewSignals = bool10;
        this.supportsOmidJsManagedAppSessions = bool11;
        this.streamActivityMonitorId = str21;
        this.supportsQuicksilver = bool12;
        this.supportsResizing = bool13;
        this.useQAStreamBaseUrl = bool14;
        this.usesCustomVideoPlayback = bool15;
        this.vastLoadTimeout = f3;
        this.videoId = str22;
        this.videoPlayActivation = adsRequestImpl$AutoPlayState;
        this.videoContinuousPlay = adsRequestImpl$ContinuousPlayState;
        this.videoPlayMuted = adsRequestImpl$MutePlayState;
        this.videoStitcherSessionOptions = z3pVar5;
        this.vodConfigId = str23;
        this.customUiOptions = customUiOptionsData;
        this.rubidiumApiVersion = i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public z3p adTagParameters() {
        return this.adTagParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String adTagUrl() {
        return this.adTagUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String adsResponse() {
        return this.adsResponse;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String apiKey() {
        return this.apiKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String assetKey() {
        return this.assetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String authToken() {
        return this.authToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public z3p companionSlots() {
        return this.companionSlots;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public z3p consentSettings() {
        return this.consentSettings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Float contentDuration() {
        return this.contentDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public q3p contentKeywords() {
        return this.contentKeywords;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String contentSourceId() {
        return this.contentSourceId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String contentSourceUrl() {
        return this.contentSourceUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String contentTitle() {
        return this.contentTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String contentUrl() {
        return this.contentUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String customAssetKey() {
        return this.customAssetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public CustomUiOptionsData customUiOptions() {
        return this.customUiOptions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Integer daiIntegration() {
        return this.daiIntegration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean enableNonce() {
        return this.enableNonce;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GsonAdsRequest) {
            GsonAdsRequest gsonAdsRequest = (GsonAdsRequest) obj;
            z3p z3pVar = this.adTagParameters;
            if (z3pVar != null ? z3pVar.equals(gsonAdsRequest.adTagParameters()) : gsonAdsRequest.adTagParameters() == null) {
                String str = this.adTagUrl;
                if (str != null ? str.equals(gsonAdsRequest.adTagUrl()) : gsonAdsRequest.adTagUrl() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(gsonAdsRequest.adsResponse()) : gsonAdsRequest.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(gsonAdsRequest.apiKey()) : gsonAdsRequest.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(gsonAdsRequest.assetKey()) : gsonAdsRequest.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(gsonAdsRequest.authToken()) : gsonAdsRequest.authToken() == null) {
                                    z3p z3pVar2 = this.companionSlots;
                                    if (z3pVar2 != null ? z3pVar2.equals(gsonAdsRequest.companionSlots()) : gsonAdsRequest.companionSlots() == null) {
                                        Float f = this.contentDuration;
                                        if (f != null ? f.equals(gsonAdsRequest.contentDuration()) : gsonAdsRequest.contentDuration() == null) {
                                            q3p q3pVar = this.contentKeywords;
                                            if (q3pVar != null ? q3pVar.equals(gsonAdsRequest.contentKeywords()) : gsonAdsRequest.contentKeywords() == null) {
                                                String str6 = this.contentSourceUrl;
                                                if (str6 != null ? str6.equals(gsonAdsRequest.contentSourceUrl()) : gsonAdsRequest.contentSourceUrl() == null) {
                                                    String str7 = this.contentTitle;
                                                    if (str7 != null ? str7.equals(gsonAdsRequest.contentTitle()) : gsonAdsRequest.contentTitle() == null) {
                                                        String str8 = this.contentUrl;
                                                        if (str8 != null ? str8.equals(gsonAdsRequest.contentUrl()) : gsonAdsRequest.contentUrl() == null) {
                                                            String str9 = this.contentSourceId;
                                                            if (str9 != null ? str9.equals(gsonAdsRequest.contentSourceId()) : gsonAdsRequest.contentSourceId() == null) {
                                                                z3p z3pVar3 = this.consentSettings;
                                                                if (z3pVar3 != null ? z3pVar3.equals(gsonAdsRequest.consentSettings()) : gsonAdsRequest.consentSettings() == null) {
                                                                    String str10 = this.customAssetKey;
                                                                    if (str10 != null ? str10.equals(gsonAdsRequest.customAssetKey()) : gsonAdsRequest.customAssetKey() == null) {
                                                                        Integer num = this.daiIntegration;
                                                                        if (num != null ? num.equals(gsonAdsRequest.daiIntegration()) : gsonAdsRequest.daiIntegration() == null) {
                                                                            Boolean bool = this.enableNonce;
                                                                            if (bool != null ? bool.equals(gsonAdsRequest.enableNonce()) : gsonAdsRequest.enableNonce() == null) {
                                                                                String str11 = this.env;
                                                                                if (str11 != null ? str11.equals(gsonAdsRequest.env()) : gsonAdsRequest.env() == null) {
                                                                                    q3p q3pVar2 = this.secureSignals;
                                                                                    if (q3pVar2 != null ? q3pVar2.equals(gsonAdsRequest.secureSignals()) : gsonAdsRequest.secureSignals() == null) {
                                                                                        String str12 = this.format;
                                                                                        if (str12 != null ? str12.equals(gsonAdsRequest.format()) : gsonAdsRequest.format() == null) {
                                                                                            IdentifierInfo identifierInfo = this.identifierInfo;
                                                                                            if (identifierInfo != null ? identifierInfo.equals(gsonAdsRequest.identifierInfo()) : gsonAdsRequest.identifierInfo() == null) {
                                                                                                Boolean bool2 = this.isTv;
                                                                                                if (bool2 != null ? bool2.equals(gsonAdsRequest.isTv()) : gsonAdsRequest.isTv() == null) {
                                                                                                    Boolean bool3 = this.isAndroidTvAdsFramework;
                                                                                                    if (bool3 != null ? bool3.equals(gsonAdsRequest.isAndroidTvAdsFramework()) : gsonAdsRequest.isAndroidTvAdsFramework() == null) {
                                                                                                        String str13 = this.pauseAdSlot;
                                                                                                        if (str13 != null ? str13.equals(gsonAdsRequest.pauseAdSlot()) : gsonAdsRequest.pauseAdSlot() == null) {
                                                                                                            Boolean bool4 = this.wrappedCompanionsEnabled;
                                                                                                            if (bool4 != null ? bool4.equals(gsonAdsRequest.wrappedCompanionsEnabled()) : gsonAdsRequest.wrappedCompanionsEnabled() == null) {
                                                                                                                Integer num2 = this.linearAdSlotWidth;
                                                                                                                if (num2 != null ? num2.equals(gsonAdsRequest.linearAdSlotWidth()) : gsonAdsRequest.linearAdSlotWidth() == null) {
                                                                                                                    Integer num3 = this.linearAdSlotHeight;
                                                                                                                    if (num3 != null ? num3.equals(gsonAdsRequest.linearAdSlotHeight()) : gsonAdsRequest.linearAdSlotHeight() == null) {
                                                                                                                        String str14 = this.liveStreamEventId;
                                                                                                                        if (str14 != null ? str14.equals(gsonAdsRequest.liveStreamEventId()) : gsonAdsRequest.liveStreamEventId() == null) {
                                                                                                                            Float f2 = this.liveStreamPrefetchSeconds;
                                                                                                                            if (f2 != null ? f2.equals(gsonAdsRequest.liveStreamPrefetchSeconds()) : gsonAdsRequest.liveStreamPrefetchSeconds() == null) {
                                                                                                                                MarketAppInfo marketAppInfo = this.marketAppInfo;
                                                                                                                                if (marketAppInfo != null ? marketAppInfo.equals(gsonAdsRequest.marketAppInfo()) : gsonAdsRequest.marketAppInfo() == null) {
                                                                                                                                    String str15 = this.msParameter;
                                                                                                                                    if (str15 != null ? str15.equals(gsonAdsRequest.msParameter()) : gsonAdsRequest.msParameter() == null) {
                                                                                                                                        String str16 = this.network;
                                                                                                                                        if (str16 != null ? str16.equals(gsonAdsRequest.network()) : gsonAdsRequest.network() == null) {
                                                                                                                                            VideoEnvironmentData videoEnvironmentData = this.videoEnvironment;
                                                                                                                                            if (videoEnvironmentData != null ? videoEnvironmentData.equals(gsonAdsRequest.videoEnvironment()) : gsonAdsRequest.videoEnvironment() == null) {
                                                                                                                                                String str17 = this.networkCode;
                                                                                                                                                if (str17 != null ? str17.equals(gsonAdsRequest.networkCode()) : gsonAdsRequest.networkCode() == null) {
                                                                                                                                                    String str18 = this.oAuthToken;
                                                                                                                                                    if (str18 != null ? str18.equals(gsonAdsRequest.oAuthToken()) : gsonAdsRequest.oAuthToken() == null) {
                                                                                                                                                        Boolean bool5 = this.omidAdSessionsOnStartedOnly;
                                                                                                                                                        if (bool5 != null ? bool5.equals(gsonAdsRequest.omidAdSessionsOnStartedOnly()) : gsonAdsRequest.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                                                            Double d = this.pixelDensity;
                                                                                                                                                            if (d != null ? d.equals(gsonAdsRequest.pixelDensity()) : gsonAdsRequest.pixelDensity() == null) {
                                                                                                                                                                z3p z3pVar4 = this.platformSignals;
                                                                                                                                                                if (z3pVar4 != null ? z3pVar4.equals(gsonAdsRequest.platformSignals()) : gsonAdsRequest.platformSignals() == null) {
                                                                                                                                                                    Integer num4 = this.preferredLinearOrientation;
                                                                                                                                                                    if (num4 != null ? num4.equals(gsonAdsRequest.preferredLinearOrientation()) : gsonAdsRequest.preferredLinearOrientation() == null) {
                                                                                                                                                                        String str19 = this.projectNumber;
                                                                                                                                                                        if (str19 != null ? str19.equals(gsonAdsRequest.projectNumber()) : gsonAdsRequest.projectNumber() == null) {
                                                                                                                                                                            String str20 = this.region;
                                                                                                                                                                            if (str20 != null ? str20.equals(gsonAdsRequest.region()) : gsonAdsRequest.region() == null) {
                                                                                                                                                                                ImaSdkSettingsData imaSdkSettingsData = this.settings;
                                                                                                                                                                                if (imaSdkSettingsData != null ? imaSdkSettingsData.equals(gsonAdsRequest.settings()) : gsonAdsRequest.settings() == null) {
                                                                                                                                                                                    Boolean bool6 = this.supportsExternalNavigation;
                                                                                                                                                                                    if (bool6 != null ? bool6.equals(gsonAdsRequest.supportsExternalNavigation()) : gsonAdsRequest.supportsExternalNavigation() == null) {
                                                                                                                                                                                        Boolean bool7 = this.supportsIconClickFallback;
                                                                                                                                                                                        if (bool7 != null ? bool7.equals(gsonAdsRequest.supportsIconClickFallback()) : gsonAdsRequest.supportsIconClickFallback() == null) {
                                                                                                                                                                                            Boolean bool8 = this.supportsNativeClickSignals;
                                                                                                                                                                                            if (bool8 != null ? bool8.equals(gsonAdsRequest.supportsNativeClickSignals()) : gsonAdsRequest.supportsNativeClickSignals() == null) {
                                                                                                                                                                                                Boolean bool9 = this.supportsNativeNetworking;
                                                                                                                                                                                                if (bool9 != null ? bool9.equals(gsonAdsRequest.supportsNativeNetworking()) : gsonAdsRequest.supportsNativeNetworking() == null) {
                                                                                                                                                                                                    Boolean bool10 = this.supportsNativeViewSignals;
                                                                                                                                                                                                    if (bool10 != null ? bool10.equals(gsonAdsRequest.supportsNativeViewSignals()) : gsonAdsRequest.supportsNativeViewSignals() == null) {
                                                                                                                                                                                                        Boolean bool11 = this.supportsOmidJsManagedAppSessions;
                                                                                                                                                                                                        if (bool11 != null ? bool11.equals(gsonAdsRequest.supportsOmidJsManagedAppSessions()) : gsonAdsRequest.supportsOmidJsManagedAppSessions() == null) {
                                                                                                                                                                                                            String str21 = this.streamActivityMonitorId;
                                                                                                                                                                                                            if (str21 != null ? str21.equals(gsonAdsRequest.streamActivityMonitorId()) : gsonAdsRequest.streamActivityMonitorId() == null) {
                                                                                                                                                                                                                Boolean bool12 = this.supportsQuicksilver;
                                                                                                                                                                                                                if (bool12 != null ? bool12.equals(gsonAdsRequest.supportsQuicksilver()) : gsonAdsRequest.supportsQuicksilver() == null) {
                                                                                                                                                                                                                    Boolean bool13 = this.supportsResizing;
                                                                                                                                                                                                                    if (bool13 != null ? bool13.equals(gsonAdsRequest.supportsResizing()) : gsonAdsRequest.supportsResizing() == null) {
                                                                                                                                                                                                                        Boolean bool14 = this.useQAStreamBaseUrl;
                                                                                                                                                                                                                        if (bool14 != null ? bool14.equals(gsonAdsRequest.useQAStreamBaseUrl()) : gsonAdsRequest.useQAStreamBaseUrl() == null) {
                                                                                                                                                                                                                            Boolean bool15 = this.usesCustomVideoPlayback;
                                                                                                                                                                                                                            if (bool15 != null ? bool15.equals(gsonAdsRequest.usesCustomVideoPlayback()) : gsonAdsRequest.usesCustomVideoPlayback() == null) {
                                                                                                                                                                                                                                Float f3 = this.vastLoadTimeout;
                                                                                                                                                                                                                                if (f3 != null ? f3.equals(gsonAdsRequest.vastLoadTimeout()) : gsonAdsRequest.vastLoadTimeout() == null) {
                                                                                                                                                                                                                                    String str22 = this.videoId;
                                                                                                                                                                                                                                    if (str22 != null ? str22.equals(gsonAdsRequest.videoId()) : gsonAdsRequest.videoId() == null) {
                                                                                                                                                                                                                                        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = this.videoPlayActivation;
                                                                                                                                                                                                                                        if (adsRequestImpl$AutoPlayState != null ? adsRequestImpl$AutoPlayState.equals(gsonAdsRequest.videoPlayActivation()) : gsonAdsRequest.videoPlayActivation() == null) {
                                                                                                                                                                                                                                            AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = this.videoContinuousPlay;
                                                                                                                                                                                                                                            if (adsRequestImpl$ContinuousPlayState != null ? adsRequestImpl$ContinuousPlayState.equals(gsonAdsRequest.videoContinuousPlay()) : gsonAdsRequest.videoContinuousPlay() == null) {
                                                                                                                                                                                                                                                AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = this.videoPlayMuted;
                                                                                                                                                                                                                                                if (adsRequestImpl$MutePlayState != null ? adsRequestImpl$MutePlayState.equals(gsonAdsRequest.videoPlayMuted()) : gsonAdsRequest.videoPlayMuted() == null) {
                                                                                                                                                                                                                                                    z3p z3pVar5 = this.videoStitcherSessionOptions;
                                                                                                                                                                                                                                                    if (z3pVar5 != null ? z3pVar5.equals(gsonAdsRequest.videoStitcherSessionOptions()) : gsonAdsRequest.videoStitcherSessionOptions() == null) {
                                                                                                                                                                                                                                                        String str23 = this.vodConfigId;
                                                                                                                                                                                                                                                        if (str23 != null ? str23.equals(gsonAdsRequest.vodConfigId()) : gsonAdsRequest.vodConfigId() == null) {
                                                                                                                                                                                                                                                            CustomUiOptionsData customUiOptionsData = this.customUiOptions;
                                                                                                                                                                                                                                                            if (customUiOptionsData != null ? customUiOptionsData.equals(gsonAdsRequest.customUiOptions()) : gsonAdsRequest.customUiOptions() == null) {
                                                                                                                                                                                                                                                                if (this.rubidiumApiVersion == gsonAdsRequest.rubidiumApiVersion()) {
                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String format() {
        return this.format;
    }

    public int hashCode() {
        z3p z3pVar = this.adTagParameters;
        int hashCode = z3pVar == null ? 0 : z3pVar.hashCode();
        String str = this.adTagUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i = hashCode ^ 1000003;
        String str2 = this.adsResponse;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.apiKey;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.assetKey;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.authToken;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        z3p z3pVar2 = this.companionSlots;
        int hashCode7 = (hashCode6 ^ (z3pVar2 == null ? 0 : z3pVar2.hashCode())) * 1000003;
        Float f = this.contentDuration;
        int hashCode8 = (hashCode7 ^ (f == null ? 0 : f.hashCode())) * 1000003;
        q3p q3pVar = this.contentKeywords;
        int hashCode9 = (hashCode8 ^ (q3pVar == null ? 0 : q3pVar.hashCode())) * 1000003;
        String str6 = this.contentSourceUrl;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.contentTitle;
        int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.contentUrl;
        int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.contentSourceId;
        int hashCode13 = (hashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        z3p z3pVar3 = this.consentSettings;
        int hashCode14 = (hashCode13 ^ (z3pVar3 == null ? 0 : z3pVar3.hashCode())) * 1000003;
        String str10 = this.customAssetKey;
        int hashCode15 = (hashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        Integer num = this.daiIntegration;
        int hashCode16 = (hashCode15 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Boolean bool = this.enableNonce;
        int hashCode17 = (hashCode16 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str11 = this.env;
        int hashCode18 = (hashCode17 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        q3p q3pVar2 = this.secureSignals;
        int hashCode19 = (hashCode18 ^ (q3pVar2 == null ? 0 : q3pVar2.hashCode())) * 1000003;
        String str12 = this.format;
        int hashCode20 = (hashCode19 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        IdentifierInfo identifierInfo = this.identifierInfo;
        int hashCode21 = (hashCode20 ^ (identifierInfo == null ? 0 : identifierInfo.hashCode())) * 1000003;
        Boolean bool2 = this.isTv;
        int hashCode22 = (hashCode21 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        int hashCode23 = (hashCode22 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        String str13 = this.pauseAdSlot;
        int hashCode24 = (hashCode23 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        Boolean bool4 = this.wrappedCompanionsEnabled;
        int hashCode25 = (hashCode24 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Integer num2 = this.linearAdSlotWidth;
        int hashCode26 = (hashCode25 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.linearAdSlotHeight;
        int hashCode27 = (hashCode26 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        String str14 = this.liveStreamEventId;
        int hashCode28 = (hashCode27 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        Float f2 = this.liveStreamPrefetchSeconds;
        int hashCode29 = (hashCode28 ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        MarketAppInfo marketAppInfo = this.marketAppInfo;
        int hashCode30 = (hashCode29 ^ (marketAppInfo == null ? 0 : marketAppInfo.hashCode())) * 1000003;
        String str15 = this.msParameter;
        int hashCode31 = (hashCode30 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.network;
        int hashCode32 = (hashCode31 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        VideoEnvironmentData videoEnvironmentData = this.videoEnvironment;
        int hashCode33 = (hashCode32 ^ (videoEnvironmentData == null ? 0 : videoEnvironmentData.hashCode())) * 1000003;
        String str17 = this.networkCode;
        int hashCode34 = (hashCode33 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        String str18 = this.oAuthToken;
        int hashCode35 = (hashCode34 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        Boolean bool5 = this.omidAdSessionsOnStartedOnly;
        int hashCode36 = (hashCode35 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Double d = this.pixelDensity;
        int hashCode37 = (hashCode36 ^ (d == null ? 0 : d.hashCode())) * 1000003;
        z3p z3pVar4 = this.platformSignals;
        int hashCode38 = (hashCode37 ^ (z3pVar4 == null ? 0 : z3pVar4.hashCode())) * 1000003;
        Integer num4 = this.preferredLinearOrientation;
        int hashCode39 = (hashCode38 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        String str19 = this.projectNumber;
        int hashCode40 = (hashCode39 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        String str20 = this.region;
        int hashCode41 = (hashCode40 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        ImaSdkSettingsData imaSdkSettingsData = this.settings;
        int hashCode42 = (hashCode41 ^ (imaSdkSettingsData == null ? 0 : imaSdkSettingsData.hashCode())) * 1000003;
        Boolean bool6 = this.supportsExternalNavigation;
        int hashCode43 = (hashCode42 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.supportsIconClickFallback;
        int hashCode44 = (hashCode43 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Boolean bool8 = this.supportsNativeClickSignals;
        int hashCode45 = (hashCode44 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.supportsNativeNetworking;
        int hashCode46 = (hashCode45 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Boolean bool10 = this.supportsNativeViewSignals;
        int hashCode47 = (hashCode46 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
        Boolean bool11 = this.supportsOmidJsManagedAppSessions;
        int hashCode48 = (hashCode47 ^ (bool11 == null ? 0 : bool11.hashCode())) * 1000003;
        String str21 = this.streamActivityMonitorId;
        int hashCode49 = (hashCode48 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
        Boolean bool12 = this.supportsQuicksilver;
        int hashCode50 = (hashCode49 ^ (bool12 == null ? 0 : bool12.hashCode())) * 1000003;
        Boolean bool13 = this.supportsResizing;
        int hashCode51 = (hashCode50 ^ (bool13 == null ? 0 : bool13.hashCode())) * 1000003;
        Boolean bool14 = this.useQAStreamBaseUrl;
        int hashCode52 = (hashCode51 ^ (bool14 == null ? 0 : bool14.hashCode())) * 1000003;
        Boolean bool15 = this.usesCustomVideoPlayback;
        int hashCode53 = (hashCode52 ^ (bool15 == null ? 0 : bool15.hashCode())) * 1000003;
        Float f3 = this.vastLoadTimeout;
        int hashCode54 = (hashCode53 ^ (f3 == null ? 0 : f3.hashCode())) * 1000003;
        String str22 = this.videoId;
        int hashCode55 = (hashCode54 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = this.videoPlayActivation;
        int hashCode56 = (hashCode55 ^ (adsRequestImpl$AutoPlayState == null ? 0 : adsRequestImpl$AutoPlayState.hashCode())) * 1000003;
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = this.videoContinuousPlay;
        int hashCode57 = (hashCode56 ^ (adsRequestImpl$ContinuousPlayState == null ? 0 : adsRequestImpl$ContinuousPlayState.hashCode())) * 1000003;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = this.videoPlayMuted;
        int hashCode58 = (hashCode57 ^ (adsRequestImpl$MutePlayState == null ? 0 : adsRequestImpl$MutePlayState.hashCode())) * 1000003;
        z3p z3pVar5 = this.videoStitcherSessionOptions;
        int hashCode59 = (hashCode58 ^ (z3pVar5 == null ? 0 : z3pVar5.hashCode())) * 1000003;
        String str23 = this.vodConfigId;
        int hashCode60 = (hashCode59 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
        CustomUiOptionsData customUiOptionsData = this.customUiOptions;
        return this.rubidiumApiVersion ^ ((hashCode60 ^ (customUiOptionsData != null ? customUiOptionsData.hashCode() : 0)) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public IdentifierInfo identifierInfo() {
        return this.identifierInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean isAndroidTvAdsFramework() {
        return this.isAndroidTvAdsFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean isTv() {
        return this.isTv;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String liveStreamEventId() {
        return this.liveStreamEventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public MarketAppInfo marketAppInfo() {
        return this.marketAppInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String msParameter() {
        return this.msParameter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String network() {
        return this.network;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String networkCode() {
        return this.networkCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String oAuthToken() {
        return this.oAuthToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String pauseAdSlot() {
        return this.pauseAdSlot;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Double pixelDensity() {
        return this.pixelDensity;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public z3p platformSignals() {
        return this.platformSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Integer preferredLinearOrientation() {
        return this.preferredLinearOrientation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String projectNumber() {
        return this.projectNumber;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String region() {
        return this.region;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    public int rubidiumApiVersion() {
        return this.rubidiumApiVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public q3p secureSignals() {
        return this.secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public ImaSdkSettingsData settings() {
        return this.settings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsNativeClickSignals() {
        return this.supportsNativeClickSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsNativeViewSignals() {
        return this.supportsNativeViewSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsOmidJsManagedAppSessions() {
        return this.supportsOmidJsManagedAppSessions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsQuicksilver() {
        return this.supportsQuicksilver;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        CustomUiOptionsData customUiOptionsData = this.customUiOptions;
        z3p z3pVar = this.videoStitcherSessionOptions;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = this.videoPlayMuted;
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = this.videoContinuousPlay;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = this.videoPlayActivation;
        ImaSdkSettingsData imaSdkSettingsData = this.settings;
        z3p z3pVar2 = this.platformSignals;
        VideoEnvironmentData videoEnvironmentData = this.videoEnvironment;
        MarketAppInfo marketAppInfo = this.marketAppInfo;
        IdentifierInfo identifierInfo = this.identifierInfo;
        q3p q3pVar = this.secureSignals;
        q3p q3pVar2 = this.contentKeywords;
        z3p z3pVar3 = this.companionSlots;
        String valueOf = String.valueOf(this.adTagParameters);
        String valueOf2 = String.valueOf(z3pVar3);
        String valueOf3 = String.valueOf(q3pVar2);
        String valueOf4 = String.valueOf(this.consentSettings);
        String valueOf5 = String.valueOf(q3pVar);
        String valueOf6 = String.valueOf(identifierInfo);
        String valueOf7 = String.valueOf(marketAppInfo);
        String valueOf8 = String.valueOf(videoEnvironmentData);
        String valueOf9 = String.valueOf(z3pVar2);
        String valueOf10 = String.valueOf(imaSdkSettingsData);
        String valueOf11 = String.valueOf(adsRequestImpl$AutoPlayState);
        String valueOf12 = String.valueOf(adsRequestImpl$ContinuousPlayState);
        String valueOf13 = String.valueOf(adsRequestImpl$MutePlayState);
        String valueOf14 = String.valueOf(z3pVar);
        String valueOf15 = String.valueOf(customUiOptionsData);
        int length = valueOf.length();
        String str = this.adTagUrl;
        int length2 = String.valueOf(str).length();
        String str2 = this.adsResponse;
        int length3 = String.valueOf(str2).length();
        String str3 = this.apiKey;
        int length4 = String.valueOf(str3).length();
        String str4 = this.assetKey;
        int length5 = String.valueOf(str4).length();
        String str5 = this.authToken;
        int length6 = String.valueOf(str5).length();
        int length7 = valueOf2.length();
        Float f = this.contentDuration;
        String valueOf16 = String.valueOf(f);
        Integer num = this.linearAdSlotWidth;
        String str6 = this.contentTitle;
        String str7 = this.contentSourceUrl;
        String str8 = this.contentUrl;
        String str9 = this.contentSourceId;
        String str10 = this.customAssetKey;
        Integer num2 = this.daiIntegration;
        Boolean bool = this.enableNonce;
        String str11 = this.env;
        String str12 = this.format;
        Boolean bool2 = this.isTv;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        String str13 = this.pauseAdSlot;
        Boolean bool4 = this.wrappedCompanionsEnabled;
        Integer num3 = this.linearAdSlotHeight;
        int length8 = valueOf16.length();
        int length9 = valueOf3.length();
        int length10 = String.valueOf(str7).length();
        int length11 = String.valueOf(str6).length();
        int length12 = String.valueOf(str8).length();
        int length13 = String.valueOf(str9).length();
        int length14 = valueOf4.length();
        int length15 = String.valueOf(str10).length();
        int length16 = String.valueOf(num2).length();
        int length17 = String.valueOf(bool).length();
        int length18 = String.valueOf(str11).length();
        int length19 = valueOf5.length();
        int length20 = String.valueOf(str12).length();
        int length21 = valueOf6.length();
        int length22 = String.valueOf(bool2).length();
        int length23 = String.valueOf(bool3).length();
        int length24 = String.valueOf(str13).length();
        int length25 = String.valueOf(bool4).length();
        int length26 = String.valueOf(num).length();
        Boolean bool5 = this.usesCustomVideoPlayback;
        Boolean bool6 = this.useQAStreamBaseUrl;
        Boolean bool7 = this.supportsResizing;
        Boolean bool8 = this.supportsQuicksilver;
        String str14 = this.streamActivityMonitorId;
        Boolean bool9 = this.supportsOmidJsManagedAppSessions;
        Boolean bool10 = this.supportsNativeViewSignals;
        Boolean bool11 = this.supportsNativeNetworking;
        Boolean bool12 = this.supportsNativeClickSignals;
        Boolean bool13 = this.supportsIconClickFallback;
        Boolean bool14 = this.supportsExternalNavigation;
        String str15 = this.region;
        String str16 = this.projectNumber;
        Integer num4 = this.preferredLinearOrientation;
        Double d = this.pixelDensity;
        Boolean bool15 = this.omidAdSessionsOnStartedOnly;
        String str17 = this.oAuthToken;
        String str18 = this.networkCode;
        String str19 = this.network;
        String str20 = this.msParameter;
        Float f2 = this.liveStreamPrefetchSeconds;
        String str21 = this.liveStreamEventId;
        int d2 = mz1.d(mz1.d(length + 42 + length2 + 14 + length3 + 9 + length4 + 11 + length5 + 12 + length6 + 17 + length7 + 18 + length8 + 18 + length9 + 19 + length10 + 15 + length11 + 13 + length12 + 18 + length13 + 18 + length14 + 17 + length15 + 17 + length16 + 14 + length17 + 6 + length18 + 16 + length19 + 9 + length20 + 17 + length21 + 7 + length22 + 26 + length23 + 14 + length24 + 27 + length25 + 20 + length26 + 21 + String.valueOf(num3).length() + 20 + String.valueOf(str21).length() + 28, 16, String.valueOf(f2)), 14, valueOf7);
        int length27 = String.valueOf(str20).length();
        int length28 = String.valueOf(str15).length() + mz1.d(mz1.d(mz1.d(mz1.d(d2 + length27 + 10, 19, String.valueOf(str19)), 14, valueOf8) + String.valueOf(str18).length() + 13 + String.valueOf(str17).length() + 30 + String.valueOf(bool15).length() + 15, 18, String.valueOf(d)) + valueOf9.length() + 29 + String.valueOf(num4).length() + 16, 9, String.valueOf(str16)) + 11;
        int length29 = valueOf10.length();
        int length30 = String.valueOf(bool14).length();
        int length31 = String.valueOf(bool13).length();
        int length32 = String.valueOf(bool12).length();
        int length33 = String.valueOf(bool11).length();
        int length34 = String.valueOf(bool10).length();
        int length35 = String.valueOf(bool9).length();
        int length36 = String.valueOf(str14).length();
        int length37 = String.valueOf(bool8).length();
        int length38 = String.valueOf(bool7).length();
        int length39 = String.valueOf(bool6).length();
        String valueOf17 = String.valueOf(bool5);
        int i = this.rubidiumApiVersion;
        String str22 = this.vodConfigId;
        String str23 = this.videoId;
        Float f3 = this.vastLoadTimeout;
        StringBuilder sb = new StringBuilder(fn0.a(i, mz1.d(String.valueOf(str22).length() + mz1.d(mz1.d(mz1.d(mz1.d(String.valueOf(str23).length() + String.valueOf(f3).length() + mz1.d(length28 + length29 + 29 + length30 + 28 + length31 + 29 + length32 + 27 + length33 + 28 + length34 + 35 + length35 + 26 + length36 + 22 + length37 + 19 + length38 + 21 + length39 + 26, 18, valueOf17) + 10 + 22, 22, valueOf11), 17, valueOf12), 30, valueOf13), 14, valueOf14) + 18, 21, valueOf15)) + 1);
        bf3.v(sb, "GsonAdsRequest{adTagParameters=", valueOf, ", adTagUrl=", str);
        bf3.v(sb, ", adsResponse=", str2, ", apiKey=", str3);
        bf3.v(sb, ", assetKey=", str4, ", authToken=", str5);
        sb.append(", companionSlots=");
        sb.append(valueOf2);
        sb.append(", contentDuration=");
        sb.append(f);
        bf3.v(sb, ", contentKeywords=", valueOf3, ", contentSourceUrl=", str7);
        bf3.v(sb, ", contentTitle=", str6, ", contentUrl=", str8);
        bf3.v(sb, ", contentSourceId=", str9, ", consentSettings=", valueOf4);
        sb.append(", customAssetKey=");
        sb.append(str10);
        sb.append(", daiIntegration=");
        sb.append(num2);
        sb.append(", enableNonce=");
        sb.append(bool);
        sb.append(", env=");
        sb.append(str11);
        bf3.v(sb, ", secureSignals=", valueOf5, ", format=", str12);
        sb.append(", identifierInfo=");
        sb.append(valueOf6);
        sb.append(", isTv=");
        sb.append(bool2);
        sb.append(", isAndroidTvAdsFramework=");
        sb.append(bool3);
        sb.append(", pauseAdSlot=");
        sb.append(str13);
        sb.append(", wrappedCompanionsEnabled=");
        sb.append(bool4);
        sb.append(", linearAdSlotWidth=");
        sb.append(num);
        fn0.x(num3, ", linearAdSlotHeight=", ", liveStreamEventId=", str21, sb);
        sb.append(", liveStreamPrefetchSeconds=");
        sb.append(f2);
        sb.append(", marketAppInfo=");
        sb.append(valueOf7);
        bf3.v(sb, ", msParameter=", str20, ", network=", str19);
        bf3.v(sb, ", videoEnvironment=", valueOf8, ", networkCode=", str18);
        sb.append(", oAuthToken=");
        sb.append(str17);
        sb.append(", omidAdSessionsOnStartedOnly=");
        sb.append(bool15);
        sb.append(", pixelDensity=");
        sb.append(d);
        sb.append(", platformSignals=");
        sb.append(valueOf9);
        fn0.x(num4, ", preferredLinearOrientation=", ", projectNumber=", str16, sb);
        bf3.v(sb, ", region=", str15, ", settings=", valueOf10);
        sb.append(", supportsExternalNavigation=");
        sb.append(bool14);
        sb.append(", supportsIconClickFallback=");
        sb.append(bool13);
        sb.append(", supportsNativeClickSignals=");
        sb.append(bool12);
        sb.append(", supportsNativeNetworking=");
        sb.append(bool11);
        sb.append(", supportsNativeViewSignals=");
        sb.append(bool10);
        sb.append(", supportsOmidJsManagedAppSessions=");
        sb.append(bool9);
        sb.append(", streamActivityMonitorId=");
        sb.append(str14);
        sb.append(", supportsQuicksilver=");
        sb.append(bool8);
        sb.append(", supportsResizing=");
        sb.append(bool7);
        sb.append(", useQAStreamBaseUrl=");
        sb.append(bool6);
        sb.append(", usesCustomVideoPlayback=");
        sb.append(bool5);
        sb.append(", vastLoadTimeout=");
        sb.append(f3);
        bf3.v(sb, ", videoId=", str23, ", videoPlayActivation=", valueOf11);
        bf3.v(sb, ", videoContinuousPlay=", valueOf12, ", videoPlayMuted=", valueOf13);
        bf3.v(sb, ", videoStitcherSessionOptions=", valueOf14, ", vodConfigId=", str22);
        wt3.t(i, ", customUiOptions=", valueOf15, ", rubidiumApiVersion=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public AdsRequestImpl$ContinuousPlayState videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public VideoEnvironmentData videoEnvironment() {
        return this.videoEnvironment;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String videoId() {
        return this.videoId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public AdsRequestImpl$AutoPlayState videoPlayActivation() {
        return this.videoPlayActivation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public AdsRequestImpl$MutePlayState videoPlayMuted() {
        return this.videoPlayMuted;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public z3p videoStitcherSessionOptions() {
        return this.videoStitcherSessionOptions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public String vodConfigId() {
        return this.vodConfigId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.GsonAdsRequest
    @Nullable
    public Boolean wrappedCompanionsEnabled() {
        return this.wrappedCompanionsEnabled;
    }

    public /* synthetic */ AutoValue_GsonAdsRequest(z3p z3pVar, String str, String str2, String str3, String str4, String str5, z3p z3pVar2, Float f, q3p q3pVar, String str6, String str7, String str8, String str9, z3p z3pVar3, String str10, Integer num, Boolean bool, String str11, q3p q3pVar2, String str12, IdentifierInfo identifierInfo, Boolean bool2, Boolean bool3, String str13, Boolean bool4, Integer num2, Integer num3, String str14, Float f2, MarketAppInfo marketAppInfo, String str15, String str16, VideoEnvironmentData videoEnvironmentData, String str17, String str18, Boolean bool5, Double d, z3p z3pVar4, Integer num4, String str19, String str20, ImaSdkSettingsData imaSdkSettingsData, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str21, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Float f3, String str22, AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState, AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState, AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState, z3p z3pVar5, String str23, CustomUiOptionsData customUiOptionsData, int i, byte[] bArr) {
        this(z3pVar, str, str2, str3, str4, str5, z3pVar2, f, q3pVar, str6, str7, str8, str9, z3pVar3, str10, num, bool, str11, q3pVar2, str12, identifierInfo, bool2, bool3, str13, bool4, num2, num3, str14, f2, marketAppInfo, str15, str16, videoEnvironmentData, str17, str18, bool5, d, z3pVar4, num4, str19, str20, imaSdkSettingsData, bool6, bool7, bool8, bool9, bool10, bool11, str21, bool12, bool13, bool14, bool15, f3, str22, adsRequestImpl$AutoPlayState, adsRequestImpl$ContinuousPlayState, adsRequestImpl$MutePlayState, z3pVar5, str23, customUiOptionsData, i);
    }
}
