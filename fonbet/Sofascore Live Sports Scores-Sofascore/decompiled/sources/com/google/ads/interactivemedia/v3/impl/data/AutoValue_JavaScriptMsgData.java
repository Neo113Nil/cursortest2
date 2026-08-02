package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.mz1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptMsgData extends JavaScriptMsgData {

    @Nullable
    private final Double adBreakDuration;

    @Nullable
    private final String adBreakTime;

    @Nullable
    private final List<Float> adCuePoints;

    @Nullable
    private final AdData adData;

    @Nullable
    private final Double adPeriodDuration;

    @Nullable
    private final AdPodInfoData adPodInfo;

    @Nullable
    private final Integer adPosition;

    @Nullable
    private final Double adsDuration;

    @Nullable
    private final List<Long> adsDurationsMs;

    @Nullable
    private final String attributionSrc;

    @Nullable
    private final String audioMimeType;

    @Nullable
    private final Double bufferedTime;

    @Nullable
    private final String clickString;

    @Nullable
    private final Map<String, CompanionData> companions;

    @Nullable
    private final List<CuePointData> cuepoints;

    @Nullable
    private final Double currentTime;

    @Nullable
    private final Double duration;

    @Nullable
    private final Integer errorCode;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String eventId;

    @Nullable
    private final List<IconClickFallbackImageMsgData> iconClickFallbackImages;

    @Nullable
    private final IconsViewData iconsView;

    @Nullable
    private final String innerError;

    @Nullable
    private final SortedSet<Float> internalCuePoints;

    @Nullable
    private final String ln;

    @Nullable
    private final JavaScriptMsgData.LogData logData;

    @Nullable
    private final String m;

    @Nullable
    private final Boolean monitorAppLifecycle;

    @Nullable
    private final String n;

    @Nullable
    private final NetworkRequestData networkRequest;

    @Nullable
    private final PauseAdData pauseAdData;

    @Nullable
    private final PauseAdHideData pauseAdHideData;

    @Nullable
    private final String queryId;

    @Nullable
    private final ResizeAndPositionVideoMsgData resizeAndPositionVideo;

    @Nullable
    private final Double seekTime;

    @Nullable
    private final SkipViewData skipView;

    @Nullable
    private final Double slateDuration;

    @Nullable
    private final String streamId;

    @Nullable
    private final String streamUrl;

    @Nullable
    private final List<HashMap<String, String>> subtitles;

    @Nullable
    private final Integer totalAds;

    @Nullable
    private final Double totalDuration;

    @Nullable
    private final JavaScriptUiConfigData uiConfig;

    @Nullable
    private final String url;

    @Nullable
    private final String vastEvent;

    @Nullable
    private final String videoMimeType;

    @Nullable
    private final String videoUrl;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends JavaScriptMsgData.Builder {
        private Double adBreakDuration;
        private String adBreakTime;
        private List<Float> adCuePoints;
        private AdData adData;
        private Double adPeriodDuration;
        private AdPodInfoData adPodInfo;
        private Integer adPosition;
        private Double adsDuration;
        private List<Long> adsDurationsMs;
        private String attributionSrc;
        private String audioMimeType;
        private Double bufferedTime;
        private String clickString;
        private Map<String, CompanionData> companions;
        private List<CuePointData> cuepoints;
        private Double currentTime;
        private Double duration;
        private Integer errorCode;
        private String errorMessage;
        private String eventId;
        private List<IconClickFallbackImageMsgData> iconClickFallbackImages;
        private IconsViewData iconsView;
        private String innerError;
        private SortedSet<Float> internalCuePoints;
        private String ln;
        private JavaScriptMsgData.LogData logData;
        private String m;
        private Boolean monitorAppLifecycle;
        private String n;
        private NetworkRequestData networkRequest;
        private PauseAdData pauseAdData;
        private PauseAdHideData pauseAdHideData;
        private String queryId;
        private ResizeAndPositionVideoMsgData resizeAndPositionVideo;
        private Double seekTime;
        private SkipViewData skipView;
        private Double slateDuration;
        private String streamId;
        private String streamUrl;
        private List<HashMap<String, String>> subtitles;
        private Integer totalAds;
        private Double totalDuration;
        private JavaScriptUiConfigData uiConfig;
        private String url;
        private String vastEvent;
        private String videoMimeType;
        private String videoUrl;

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData build() {
            return new AutoValue_JavaScriptMsgData(this.videoUrl, this.audioMimeType, this.videoMimeType, this.streamUrl, this.streamId, this.cuepoints, this.uiConfig, this.adData, this.adPodInfo, this.companions, this.pauseAdData, this.pauseAdHideData, this.resizeAndPositionVideo, this.clickString, this.logData, this.ln, this.n, this.m, this.errorCode, this.errorMessage, this.innerError, this.adCuePoints, this.internalCuePoints, this.bufferedTime, this.currentTime, this.duration, this.queryId, this.eventId, this.vastEvent, this.monitorAppLifecycle, this.adBreakTime, this.subtitles, this.totalAds, this.adPosition, this.adsDurationsMs, this.adBreakDuration, this.adPeriodDuration, this.adsDuration, this.totalDuration, this.slateDuration, this.networkRequest, this.url, this.attributionSrc, this.iconClickFallbackImages, this.iconsView, this.skipView, this.seekTime, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdBreakDuration(@Nullable Double d) {
            this.adBreakDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdBreakTime(@Nullable String str) {
            this.adBreakTime = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdCuePoints(@Nullable List<Float> list) {
            this.adCuePoints = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdData(@Nullable AdData adData) {
            this.adData = adData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdPeriodDuration(@Nullable Double d) {
            this.adPeriodDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdPodInfo(@Nullable AdPodInfoData adPodInfoData) {
            this.adPodInfo = adPodInfoData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdPosition(@Nullable Integer num) {
            this.adPosition = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdsDuration(@Nullable Double d) {
            this.adsDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAdsDurationsMs(@Nullable List<Long> list) {
            this.adsDurationsMs = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAttributionSrc(@Nullable String str) {
            this.attributionSrc = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setAudioMimeType(@Nullable String str) {
            this.audioMimeType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setBufferedTime(@Nullable Double d) {
            this.bufferedTime = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setClickString(@Nullable String str) {
            this.clickString = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setCompanions(@Nullable Map<String, CompanionData> map) {
            this.companions = map;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setCuepoints(@Nullable List<CuePointData> list) {
            this.cuepoints = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setCurrentTime(@Nullable Double d) {
            this.currentTime = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setDuration(@Nullable Double d) {
            this.duration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setErrorCode(@Nullable Integer num) {
            this.errorCode = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setErrorMessage(@Nullable String str) {
            this.errorMessage = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setEventId(@Nullable String str) {
            this.eventId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setIconClickFallbackImages(@Nullable List<IconClickFallbackImageMsgData> list) {
            this.iconClickFallbackImages = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setIconsView(@Nullable IconsViewData iconsViewData) {
            this.iconsView = iconsViewData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setInnerError(@Nullable String str) {
            this.innerError = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setInternalCuePoints(@Nullable SortedSet<Float> sortedSet) {
            this.internalCuePoints = sortedSet;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setLn(@Nullable String str) {
            this.ln = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setLogData(@Nullable JavaScriptMsgData.LogData logData) {
            this.logData = logData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setM(@Nullable String str) {
            this.m = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setMonitorAppLifecycle(@Nullable Boolean bool) {
            this.monitorAppLifecycle = bool;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setN(@Nullable String str) {
            this.n = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setNetworkRequest(@Nullable NetworkRequestData networkRequestData) {
            this.networkRequest = networkRequestData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setPauseAdData(@Nullable PauseAdData pauseAdData) {
            this.pauseAdData = pauseAdData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setPauseAdHideData(@Nullable PauseAdHideData pauseAdHideData) {
            this.pauseAdHideData = pauseAdHideData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setQueryId(@Nullable String str) {
            this.queryId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setResizeAndPositionVideo(@Nullable ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
            this.resizeAndPositionVideo = resizeAndPositionVideoMsgData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSeekTime(@Nullable Double d) {
            this.seekTime = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSkipView(@Nullable SkipViewData skipViewData) {
            this.skipView = skipViewData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSlateDuration(@Nullable Double d) {
            this.slateDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setStreamId(@Nullable String str) {
            this.streamId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setStreamUrl(@Nullable String str) {
            this.streamUrl = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setSubtitles(@Nullable List<HashMap<String, String>> list) {
            this.subtitles = list;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setTotalAds(@Nullable Integer num) {
            this.totalAds = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setTotalDuration(@Nullable Double d) {
            this.totalDuration = d;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setUiConfig(@Nullable JavaScriptUiConfigData javaScriptUiConfigData) {
            this.uiConfig = javaScriptUiConfigData;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setUrl(@Nullable String str) {
            this.url = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setVastEvent(@Nullable String str) {
            this.vastEvent = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setVideoMimeType(@Nullable String str) {
            this.videoMimeType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.Builder
        public JavaScriptMsgData.Builder setVideoUrl(@Nullable String str) {
            this.videoUrl = str;
            return this;
        }
    }

    private AutoValue_JavaScriptMsgData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<CuePointData> list, @Nullable JavaScriptUiConfigData javaScriptUiConfigData, @Nullable AdData adData, @Nullable AdPodInfoData adPodInfoData, @Nullable Map<String, CompanionData> map, @Nullable PauseAdData pauseAdData, @Nullable PauseAdHideData pauseAdHideData, @Nullable ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData, @Nullable String str6, @Nullable JavaScriptMsgData.LogData logData, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable String str10, @Nullable String str11, @Nullable List<Float> list2, @Nullable SortedSet<Float> sortedSet, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Boolean bool, @Nullable String str15, @Nullable List<HashMap<String, String>> list3, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<Long> list4, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable NetworkRequestData networkRequestData, @Nullable String str16, @Nullable String str17, @Nullable List<IconClickFallbackImageMsgData> list5, @Nullable IconsViewData iconsViewData, @Nullable SkipViewData skipViewData, @Nullable Double d9) {
        this.videoUrl = str;
        this.audioMimeType = str2;
        this.videoMimeType = str3;
        this.streamUrl = str4;
        this.streamId = str5;
        this.cuepoints = list;
        this.uiConfig = javaScriptUiConfigData;
        this.adData = adData;
        this.adPodInfo = adPodInfoData;
        this.companions = map;
        this.pauseAdData = pauseAdData;
        this.pauseAdHideData = pauseAdHideData;
        this.resizeAndPositionVideo = resizeAndPositionVideoMsgData;
        this.clickString = str6;
        this.logData = logData;
        this.ln = str7;
        this.n = str8;
        this.m = str9;
        this.errorCode = num;
        this.errorMessage = str10;
        this.innerError = str11;
        this.adCuePoints = list2;
        this.internalCuePoints = sortedSet;
        this.bufferedTime = d;
        this.currentTime = d2;
        this.duration = d3;
        this.queryId = str12;
        this.eventId = str13;
        this.vastEvent = str14;
        this.monitorAppLifecycle = bool;
        this.adBreakTime = str15;
        this.subtitles = list3;
        this.totalAds = num2;
        this.adPosition = num3;
        this.adsDurationsMs = list4;
        this.adBreakDuration = d4;
        this.adPeriodDuration = d5;
        this.adsDuration = d6;
        this.totalDuration = d7;
        this.slateDuration = d8;
        this.networkRequest = networkRequestData;
        this.url = str16;
        this.attributionSrc = str17;
        this.iconClickFallbackImages = list5;
        this.iconsView = iconsViewData;
        this.skipView = skipViewData;
        this.seekTime = d9;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double adBreakDuration() {
        return this.adBreakDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String adBreakTime() {
        return this.adBreakTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public List<Float> adCuePoints() {
        return this.adCuePoints;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public AdData adData() {
        return this.adData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double adPeriodDuration() {
        return this.adPeriodDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public AdPodInfoData adPodInfo() {
        return this.adPodInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Integer adPosition() {
        return this.adPosition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double adsDuration() {
        return this.adsDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public List<Long> adsDurationsMs() {
        return this.adsDurationsMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String attributionSrc() {
        return this.attributionSrc;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String audioMimeType() {
        return this.audioMimeType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double bufferedTime() {
        return this.bufferedTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String clickString() {
        return this.clickString;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Map<String, CompanionData> companions() {
        return this.companions;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public List<CuePointData> cuepoints() {
        return this.cuepoints;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptMsgData) {
            JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) obj;
            String str = this.videoUrl;
            if (str != null ? str.equals(javaScriptMsgData.videoUrl()) : javaScriptMsgData.videoUrl() == null) {
                String str2 = this.audioMimeType;
                if (str2 != null ? str2.equals(javaScriptMsgData.audioMimeType()) : javaScriptMsgData.audioMimeType() == null) {
                    String str3 = this.videoMimeType;
                    if (str3 != null ? str3.equals(javaScriptMsgData.videoMimeType()) : javaScriptMsgData.videoMimeType() == null) {
                        String str4 = this.streamUrl;
                        if (str4 != null ? str4.equals(javaScriptMsgData.streamUrl()) : javaScriptMsgData.streamUrl() == null) {
                            String str5 = this.streamId;
                            if (str5 != null ? str5.equals(javaScriptMsgData.streamId()) : javaScriptMsgData.streamId() == null) {
                                List<CuePointData> list = this.cuepoints;
                                if (list != null ? list.equals(javaScriptMsgData.cuepoints()) : javaScriptMsgData.cuepoints() == null) {
                                    JavaScriptUiConfigData javaScriptUiConfigData = this.uiConfig;
                                    if (javaScriptUiConfigData != null ? javaScriptUiConfigData.equals(javaScriptMsgData.uiConfig()) : javaScriptMsgData.uiConfig() == null) {
                                        AdData adData = this.adData;
                                        if (adData != null ? adData.equals(javaScriptMsgData.adData()) : javaScriptMsgData.adData() == null) {
                                            AdPodInfoData adPodInfoData = this.adPodInfo;
                                            if (adPodInfoData != null ? adPodInfoData.equals(javaScriptMsgData.adPodInfo()) : javaScriptMsgData.adPodInfo() == null) {
                                                Map<String, CompanionData> map = this.companions;
                                                if (map != null ? map.equals(javaScriptMsgData.companions()) : javaScriptMsgData.companions() == null) {
                                                    PauseAdData pauseAdData = this.pauseAdData;
                                                    if (pauseAdData != null ? pauseAdData.equals(javaScriptMsgData.pauseAdData()) : javaScriptMsgData.pauseAdData() == null) {
                                                        PauseAdHideData pauseAdHideData = this.pauseAdHideData;
                                                        if (pauseAdHideData != null ? pauseAdHideData.equals(javaScriptMsgData.pauseAdHideData()) : javaScriptMsgData.pauseAdHideData() == null) {
                                                            ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = this.resizeAndPositionVideo;
                                                            if (resizeAndPositionVideoMsgData != null ? resizeAndPositionVideoMsgData.equals(javaScriptMsgData.resizeAndPositionVideo()) : javaScriptMsgData.resizeAndPositionVideo() == null) {
                                                                String str6 = this.clickString;
                                                                if (str6 != null ? str6.equals(javaScriptMsgData.clickString()) : javaScriptMsgData.clickString() == null) {
                                                                    JavaScriptMsgData.LogData logData = this.logData;
                                                                    if (logData != null ? logData.equals(javaScriptMsgData.logData()) : javaScriptMsgData.logData() == null) {
                                                                        String str7 = this.ln;
                                                                        if (str7 != null ? str7.equals(javaScriptMsgData.ln()) : javaScriptMsgData.ln() == null) {
                                                                            String str8 = this.n;
                                                                            if (str8 != null ? str8.equals(javaScriptMsgData.n()) : javaScriptMsgData.n() == null) {
                                                                                String str9 = this.m;
                                                                                if (str9 != null ? str9.equals(javaScriptMsgData.m()) : javaScriptMsgData.m() == null) {
                                                                                    Integer num = this.errorCode;
                                                                                    if (num != null ? num.equals(javaScriptMsgData.errorCode()) : javaScriptMsgData.errorCode() == null) {
                                                                                        String str10 = this.errorMessage;
                                                                                        if (str10 != null ? str10.equals(javaScriptMsgData.errorMessage()) : javaScriptMsgData.errorMessage() == null) {
                                                                                            String str11 = this.innerError;
                                                                                            if (str11 != null ? str11.equals(javaScriptMsgData.innerError()) : javaScriptMsgData.innerError() == null) {
                                                                                                List<Float> list2 = this.adCuePoints;
                                                                                                if (list2 != null ? list2.equals(javaScriptMsgData.adCuePoints()) : javaScriptMsgData.adCuePoints() == null) {
                                                                                                    SortedSet<Float> sortedSet = this.internalCuePoints;
                                                                                                    if (sortedSet != null ? sortedSet.equals(javaScriptMsgData.internalCuePoints()) : javaScriptMsgData.internalCuePoints() == null) {
                                                                                                        Double d = this.bufferedTime;
                                                                                                        if (d != null ? d.equals(javaScriptMsgData.bufferedTime()) : javaScriptMsgData.bufferedTime() == null) {
                                                                                                            Double d2 = this.currentTime;
                                                                                                            if (d2 != null ? d2.equals(javaScriptMsgData.currentTime()) : javaScriptMsgData.currentTime() == null) {
                                                                                                                Double d3 = this.duration;
                                                                                                                if (d3 != null ? d3.equals(javaScriptMsgData.duration()) : javaScriptMsgData.duration() == null) {
                                                                                                                    String str12 = this.queryId;
                                                                                                                    if (str12 != null ? str12.equals(javaScriptMsgData.queryId()) : javaScriptMsgData.queryId() == null) {
                                                                                                                        String str13 = this.eventId;
                                                                                                                        if (str13 != null ? str13.equals(javaScriptMsgData.eventId()) : javaScriptMsgData.eventId() == null) {
                                                                                                                            String str14 = this.vastEvent;
                                                                                                                            if (str14 != null ? str14.equals(javaScriptMsgData.vastEvent()) : javaScriptMsgData.vastEvent() == null) {
                                                                                                                                Boolean bool = this.monitorAppLifecycle;
                                                                                                                                if (bool != null ? bool.equals(javaScriptMsgData.monitorAppLifecycle()) : javaScriptMsgData.monitorAppLifecycle() == null) {
                                                                                                                                    String str15 = this.adBreakTime;
                                                                                                                                    if (str15 != null ? str15.equals(javaScriptMsgData.adBreakTime()) : javaScriptMsgData.adBreakTime() == null) {
                                                                                                                                        List<HashMap<String, String>> list3 = this.subtitles;
                                                                                                                                        if (list3 != null ? list3.equals(javaScriptMsgData.subtitles()) : javaScriptMsgData.subtitles() == null) {
                                                                                                                                            Integer num2 = this.totalAds;
                                                                                                                                            if (num2 != null ? num2.equals(javaScriptMsgData.totalAds()) : javaScriptMsgData.totalAds() == null) {
                                                                                                                                                Integer num3 = this.adPosition;
                                                                                                                                                if (num3 != null ? num3.equals(javaScriptMsgData.adPosition()) : javaScriptMsgData.adPosition() == null) {
                                                                                                                                                    List<Long> list4 = this.adsDurationsMs;
                                                                                                                                                    if (list4 != null ? list4.equals(javaScriptMsgData.adsDurationsMs()) : javaScriptMsgData.adsDurationsMs() == null) {
                                                                                                                                                        Double d4 = this.adBreakDuration;
                                                                                                                                                        if (d4 != null ? d4.equals(javaScriptMsgData.adBreakDuration()) : javaScriptMsgData.adBreakDuration() == null) {
                                                                                                                                                            Double d5 = this.adPeriodDuration;
                                                                                                                                                            if (d5 != null ? d5.equals(javaScriptMsgData.adPeriodDuration()) : javaScriptMsgData.adPeriodDuration() == null) {
                                                                                                                                                                Double d6 = this.adsDuration;
                                                                                                                                                                if (d6 != null ? d6.equals(javaScriptMsgData.adsDuration()) : javaScriptMsgData.adsDuration() == null) {
                                                                                                                                                                    Double d7 = this.totalDuration;
                                                                                                                                                                    if (d7 != null ? d7.equals(javaScriptMsgData.totalDuration()) : javaScriptMsgData.totalDuration() == null) {
                                                                                                                                                                        Double d8 = this.slateDuration;
                                                                                                                                                                        if (d8 != null ? d8.equals(javaScriptMsgData.slateDuration()) : javaScriptMsgData.slateDuration() == null) {
                                                                                                                                                                            NetworkRequestData networkRequestData = this.networkRequest;
                                                                                                                                                                            if (networkRequestData != null ? networkRequestData.equals(javaScriptMsgData.networkRequest()) : javaScriptMsgData.networkRequest() == null) {
                                                                                                                                                                                String str16 = this.url;
                                                                                                                                                                                if (str16 != null ? str16.equals(javaScriptMsgData.url()) : javaScriptMsgData.url() == null) {
                                                                                                                                                                                    String str17 = this.attributionSrc;
                                                                                                                                                                                    if (str17 != null ? str17.equals(javaScriptMsgData.attributionSrc()) : javaScriptMsgData.attributionSrc() == null) {
                                                                                                                                                                                        List<IconClickFallbackImageMsgData> list5 = this.iconClickFallbackImages;
                                                                                                                                                                                        if (list5 != null ? list5.equals(javaScriptMsgData.iconClickFallbackImages()) : javaScriptMsgData.iconClickFallbackImages() == null) {
                                                                                                                                                                                            IconsViewData iconsViewData = this.iconsView;
                                                                                                                                                                                            if (iconsViewData != null ? iconsViewData.equals(javaScriptMsgData.iconsView()) : javaScriptMsgData.iconsView() == null) {
                                                                                                                                                                                                SkipViewData skipViewData = this.skipView;
                                                                                                                                                                                                if (skipViewData != null ? skipViewData.equals(javaScriptMsgData.skipView()) : javaScriptMsgData.skipView() == null) {
                                                                                                                                                                                                    Double d9 = this.seekTime;
                                                                                                                                                                                                    if (d9 != null ? d9.equals(javaScriptMsgData.seekTime()) : javaScriptMsgData.seekTime() == null) {
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
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Integer errorCode() {
        return this.errorCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String errorMessage() {
        return this.errorMessage;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        String str = this.videoUrl;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.audioMimeType;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.videoMimeType;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.streamUrl;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.streamId;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        List<CuePointData> list = this.cuepoints;
        int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        JavaScriptUiConfigData javaScriptUiConfigData = this.uiConfig;
        int hashCode7 = (hashCode6 ^ (javaScriptUiConfigData == null ? 0 : javaScriptUiConfigData.hashCode())) * 1000003;
        AdData adData = this.adData;
        int hashCode8 = (hashCode7 ^ (adData == null ? 0 : adData.hashCode())) * 1000003;
        AdPodInfoData adPodInfoData = this.adPodInfo;
        int hashCode9 = (hashCode8 ^ (adPodInfoData == null ? 0 : adPodInfoData.hashCode())) * 1000003;
        Map<String, CompanionData> map = this.companions;
        int hashCode10 = (hashCode9 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        PauseAdData pauseAdData = this.pauseAdData;
        int hashCode11 = (hashCode10 ^ (pauseAdData == null ? 0 : pauseAdData.hashCode())) * 1000003;
        PauseAdHideData pauseAdHideData = this.pauseAdHideData;
        int hashCode12 = (hashCode11 ^ (pauseAdHideData == null ? 0 : pauseAdHideData.hashCode())) * 1000003;
        ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = this.resizeAndPositionVideo;
        int hashCode13 = (hashCode12 ^ (resizeAndPositionVideoMsgData == null ? 0 : resizeAndPositionVideoMsgData.hashCode())) * 1000003;
        String str6 = this.clickString;
        int hashCode14 = (hashCode13 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        JavaScriptMsgData.LogData logData = this.logData;
        int hashCode15 = (hashCode14 ^ (logData == null ? 0 : logData.hashCode())) * 1000003;
        String str7 = this.ln;
        int hashCode16 = (hashCode15 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.n;
        int hashCode17 = (hashCode16 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.m;
        int hashCode18 = (hashCode17 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        Integer num = this.errorCode;
        int hashCode19 = (hashCode18 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str10 = this.errorMessage;
        int hashCode20 = (hashCode19 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.innerError;
        int hashCode21 = (hashCode20 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        List<Float> list2 = this.adCuePoints;
        int hashCode22 = (hashCode21 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        SortedSet<Float> sortedSet = this.internalCuePoints;
        int hashCode23 = (hashCode22 ^ (sortedSet == null ? 0 : sortedSet.hashCode())) * 1000003;
        Double d = this.bufferedTime;
        int hashCode24 = (hashCode23 ^ (d == null ? 0 : d.hashCode())) * 1000003;
        Double d2 = this.currentTime;
        int hashCode25 = (hashCode24 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
        Double d3 = this.duration;
        int hashCode26 = (hashCode25 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
        String str12 = this.queryId;
        int hashCode27 = (hashCode26 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        String str13 = this.eventId;
        int hashCode28 = (hashCode27 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        String str14 = this.vastEvent;
        int hashCode29 = (hashCode28 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        Boolean bool = this.monitorAppLifecycle;
        int hashCode30 = (hashCode29 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str15 = this.adBreakTime;
        int hashCode31 = (hashCode30 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        List<HashMap<String, String>> list3 = this.subtitles;
        int hashCode32 = (hashCode31 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        Integer num2 = this.totalAds;
        int hashCode33 = (hashCode32 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.adPosition;
        int hashCode34 = (hashCode33 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        List<Long> list4 = this.adsDurationsMs;
        int hashCode35 = (hashCode34 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        Double d4 = this.adBreakDuration;
        int hashCode36 = (hashCode35 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
        Double d5 = this.adPeriodDuration;
        int hashCode37 = (hashCode36 ^ (d5 == null ? 0 : d5.hashCode())) * 1000003;
        Double d6 = this.adsDuration;
        int hashCode38 = (hashCode37 ^ (d6 == null ? 0 : d6.hashCode())) * 1000003;
        Double d7 = this.totalDuration;
        int hashCode39 = (hashCode38 ^ (d7 == null ? 0 : d7.hashCode())) * 1000003;
        Double d8 = this.slateDuration;
        int hashCode40 = (hashCode39 ^ (d8 == null ? 0 : d8.hashCode())) * 1000003;
        NetworkRequestData networkRequestData = this.networkRequest;
        int hashCode41 = (hashCode40 ^ (networkRequestData == null ? 0 : networkRequestData.hashCode())) * 1000003;
        String str16 = this.url;
        int hashCode42 = (hashCode41 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        String str17 = this.attributionSrc;
        int hashCode43 = (hashCode42 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        List<IconClickFallbackImageMsgData> list5 = this.iconClickFallbackImages;
        int hashCode44 = (hashCode43 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
        IconsViewData iconsViewData = this.iconsView;
        int hashCode45 = (hashCode44 ^ (iconsViewData == null ? 0 : iconsViewData.hashCode())) * 1000003;
        SkipViewData skipViewData = this.skipView;
        int hashCode46 = (hashCode45 ^ (skipViewData == null ? 0 : skipViewData.hashCode())) * 1000003;
        Double d9 = this.seekTime;
        return hashCode46 ^ (d9 != null ? d9.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public List<IconClickFallbackImageMsgData> iconClickFallbackImages() {
        return this.iconClickFallbackImages;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public IconsViewData iconsView() {
        return this.iconsView;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String innerError() {
        return this.innerError;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public SortedSet<Float> internalCuePoints() {
        return this.internalCuePoints;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String ln() {
        return this.ln;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public JavaScriptMsgData.LogData logData() {
        return this.logData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String m() {
        return this.m;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Boolean monitorAppLifecycle() {
        return this.monitorAppLifecycle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String n() {
        return this.n;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public NetworkRequestData networkRequest() {
        return this.networkRequest;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public PauseAdData pauseAdData() {
        return this.pauseAdData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public PauseAdHideData pauseAdHideData() {
        return this.pauseAdHideData;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String queryId() {
        return this.queryId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo() {
        return this.resizeAndPositionVideo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double seekTime() {
        return this.seekTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public SkipViewData skipView() {
        return this.skipView;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double slateDuration() {
        return this.slateDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String streamId() {
        return this.streamId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String streamUrl() {
        return this.streamUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public List<HashMap<String, String>> subtitles() {
        return this.subtitles;
    }

    public String toString() {
        String str = this.videoUrl;
        SkipViewData skipViewData = this.skipView;
        IconsViewData iconsViewData = this.iconsView;
        List<IconClickFallbackImageMsgData> list = this.iconClickFallbackImages;
        NetworkRequestData networkRequestData = this.networkRequest;
        List<Long> list2 = this.adsDurationsMs;
        List<HashMap<String, String>> list3 = this.subtitles;
        List<Float> list4 = this.adCuePoints;
        JavaScriptMsgData.LogData logData = this.logData;
        ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = this.resizeAndPositionVideo;
        PauseAdHideData pauseAdHideData = this.pauseAdHideData;
        PauseAdData pauseAdData = this.pauseAdData;
        Map<String, CompanionData> map = this.companions;
        AdPodInfoData adPodInfoData = this.adPodInfo;
        AdData adData = this.adData;
        JavaScriptUiConfigData javaScriptUiConfigData = this.uiConfig;
        String valueOf = String.valueOf(this.cuepoints);
        String valueOf2 = String.valueOf(javaScriptUiConfigData);
        String valueOf3 = String.valueOf(adData);
        String valueOf4 = String.valueOf(adPodInfoData);
        String valueOf5 = String.valueOf(map);
        String valueOf6 = String.valueOf(pauseAdData);
        String valueOf7 = String.valueOf(pauseAdHideData);
        String valueOf8 = String.valueOf(resizeAndPositionVideoMsgData);
        String valueOf9 = String.valueOf(logData);
        String valueOf10 = String.valueOf(list4);
        String valueOf11 = String.valueOf(this.internalCuePoints);
        String valueOf12 = String.valueOf(list3);
        String valueOf13 = String.valueOf(list2);
        String valueOf14 = String.valueOf(networkRequestData);
        String valueOf15 = String.valueOf(list);
        String valueOf16 = String.valueOf(iconsViewData);
        String valueOf17 = String.valueOf(skipViewData);
        int length = String.valueOf(str).length();
        String str2 = this.audioMimeType;
        int length2 = String.valueOf(str2).length();
        String str3 = this.videoMimeType;
        int length3 = String.valueOf(str3).length();
        String str4 = this.streamUrl;
        int length4 = String.valueOf(str4).length();
        String str5 = this.streamId;
        int length5 = String.valueOf(str5).length();
        int length6 = valueOf.length();
        int length7 = length + 43 + length2 + 16 + length3 + 12 + length4 + 11 + length5 + 12 + length6 + 11 + valueOf2.length() + 9 + valueOf3.length() + 12;
        Integer num = this.errorCode;
        String str6 = this.m;
        String str7 = this.n;
        String str8 = this.ln;
        String str9 = this.clickString;
        Double d = this.bufferedTime;
        Double d2 = this.currentTime;
        Double d3 = this.duration;
        String str10 = this.queryId;
        String str11 = this.eventId;
        String str12 = this.vastEvent;
        Boolean bool = this.monitorAppLifecycle;
        String str13 = this.adBreakTime;
        int length8 = valueOf9.length() + mz1.d(mz1.d(mz1.d(mz1.d(mz1.d(length7, 13, valueOf4), 14, valueOf5), 18, valueOf6), 25, valueOf7) + valueOf8.length() + 14, 10, String.valueOf(str9));
        int length9 = String.valueOf(str8).length() + length8 + 5;
        int d4 = mz1.d(length9 + 4 + String.valueOf(str7).length() + 4, 12, String.valueOf(str6));
        String str14 = this.innerError;
        String str15 = this.errorMessage;
        int length10 = String.valueOf(num).length() + d4;
        int length11 = String.valueOf(str15).length();
        int c = fn0.c(mz1.d(mz1.d(mz1.d(mz1.d(length10 + 15 + length11 + 13, 14, String.valueOf(str14)), 20, valueOf10) + valueOf11.length() + 15 + String.valueOf(d).length() + 14, 11, String.valueOf(d2)) + String.valueOf(d3).length() + 10 + String.valueOf(str10).length() + 10, 12, String.valueOf(str11)), str12) + 22;
        int length12 = String.valueOf(bool).length();
        Double d5 = this.seekTime;
        String str16 = this.attributionSrc;
        String str17 = this.url;
        Double d6 = this.slateDuration;
        Double d7 = this.totalDuration;
        Double d8 = this.adsDuration;
        Double d9 = this.adPeriodDuration;
        Double d10 = this.adBreakDuration;
        Integer num2 = this.adPosition;
        Integer num3 = this.totalAds;
        int length13 = String.valueOf(d6).length() + String.valueOf(d7).length() + String.valueOf(d8).length() + mz1.d(mz1.d(String.valueOf(num2).length() + String.valueOf(num3).length() + mz1.d(mz1.d(c + length12 + 14, 12, String.valueOf(str13)), 11, valueOf12) + 13 + 17, 18, valueOf13) + String.valueOf(d10).length() + 19, 14, String.valueOf(d9)) + 16 + 16 + 17 + valueOf14.length() + 6;
        int length14 = String.valueOf(str17).length();
        StringBuilder sb = new StringBuilder(String.valueOf(d5).length() + mz1.d(mz1.d(mz1.d(mz1.d(length13 + length14 + 17, 26, String.valueOf(str16)), 12, valueOf15), 11, valueOf16), 11, valueOf17) + 1);
        bf3.v(sb, "JavaScriptMsgData{videoUrl=", str, ", audioMimeType=", str2);
        bf3.v(sb, ", videoMimeType=", str3, ", streamUrl=", str4);
        bf3.v(sb, ", streamId=", str5, ", cuepoints=", valueOf);
        bf3.v(sb, ", uiConfig=", valueOf2, ", adData=", valueOf3);
        bf3.v(sb, ", adPodInfo=", valueOf4, ", companions=", valueOf5);
        bf3.v(sb, ", pauseAdData=", valueOf6, ", pauseAdHideData=", valueOf7);
        bf3.v(sb, ", resizeAndPositionVideo=", valueOf8, ", clickString=", str9);
        bf3.v(sb, ", logData=", valueOf9, ", ln=", str8);
        bf3.v(sb, ", n=", str7, ", m=", str6);
        fn0.x(num, ", errorCode=", ", errorMessage=", str15, sb);
        bf3.v(sb, ", innerError=", str14, ", adCuePoints=", valueOf10);
        sb.append(", internalCuePoints=");
        sb.append(valueOf11);
        sb.append(", bufferedTime=");
        sb.append(d);
        sb.append(", currentTime=");
        sb.append(d2);
        sb.append(", duration=");
        sb.append(d3);
        bf3.v(sb, ", queryId=", str10, ", eventId=", str11);
        sb.append(", vastEvent=");
        sb.append(str12);
        sb.append(", monitorAppLifecycle=");
        sb.append(bool);
        bf3.v(sb, ", adBreakTime=", str13, ", subtitles=", valueOf12);
        fn0.w(num3, num2, ", totalAds=", ", adPosition=", sb);
        sb.append(", adsDurationsMs=");
        sb.append(valueOf13);
        sb.append(", adBreakDuration=");
        sb.append(d10);
        sb.append(", adPeriodDuration=");
        sb.append(d9);
        sb.append(", adsDuration=");
        sb.append(d8);
        sb.append(", totalDuration=");
        sb.append(d7);
        sb.append(", slateDuration=");
        sb.append(d6);
        bf3.v(sb, ", networkRequest=", valueOf14, ", url=", str17);
        bf3.v(sb, ", attributionSrc=", str16, ", iconClickFallbackImages=", valueOf15);
        bf3.v(sb, ", iconsView=", valueOf16, ", skipView=", valueOf17);
        sb.append(", seekTime=");
        sb.append(d5);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Integer totalAds() {
        return this.totalAds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public Double totalDuration() {
        return this.totalDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public JavaScriptUiConfigData uiConfig() {
        return this.uiConfig;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String vastEvent() {
        return this.vastEvent;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String videoMimeType() {
        return this.videoMimeType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData
    @Nullable
    public String videoUrl() {
        return this.videoUrl;
    }

    public /* synthetic */ AutoValue_JavaScriptMsgData(String str, String str2, String str3, String str4, String str5, List list, JavaScriptUiConfigData javaScriptUiConfigData, AdData adData, AdPodInfoData adPodInfoData, Map map, PauseAdData pauseAdData, PauseAdHideData pauseAdHideData, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData, String str6, JavaScriptMsgData.LogData logData, String str7, String str8, String str9, Integer num, String str10, String str11, List list2, SortedSet sortedSet, Double d, Double d2, Double d3, String str12, String str13, String str14, Boolean bool, String str15, List list3, Integer num2, Integer num3, List list4, Double d4, Double d5, Double d6, Double d7, Double d8, NetworkRequestData networkRequestData, String str16, String str17, List list5, IconsViewData iconsViewData, SkipViewData skipViewData, Double d9, byte[] bArr) {
        this(str, str2, str3, str4, str5, list, javaScriptUiConfigData, adData, adPodInfoData, map, pauseAdData, pauseAdHideData, resizeAndPositionVideoMsgData, str6, logData, str7, str8, str9, num, str10, str11, list2, sortedSet, d, d2, d3, str12, str13, str14, bool, str15, list3, num2, num3, list4, d4, d5, d6, d7, d8, networkRequestData, str16, str17, list5, iconsViewData, skipViewData, d9);
    }
}
