package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_JavaScriptMsgData_LogData;
import com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.fc6;
import defpackage.q1p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_JavaScriptMsgData.class)
/* loaded from: classes2.dex */
public abstract class JavaScriptMsgData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract JavaScriptMsgData build();

        @NonNull
        public abstract Builder setAdBreakDuration(@Nullable Double d);

        @NonNull
        public abstract Builder setAdBreakTime(@Nullable String str);

        @NonNull
        public abstract Builder setAdCuePoints(@Nullable List<Float> list);

        @NonNull
        public abstract Builder setAdData(@Nullable AdData adData);

        @NonNull
        public abstract Builder setAdPeriodDuration(@Nullable Double d);

        @NonNull
        public abstract Builder setAdPodInfo(@Nullable AdPodInfoData adPodInfoData);

        @NonNull
        public abstract Builder setAdPosition(@Nullable Integer num);

        @NonNull
        public abstract Builder setAdsDuration(@Nullable Double d);

        @NonNull
        public abstract Builder setAdsDurationsMs(@Nullable List<Long> list);

        @NonNull
        public abstract Builder setAttributionSrc(@Nullable String str);

        @NonNull
        public abstract Builder setAudioMimeType(@Nullable String str);

        @NonNull
        public abstract Builder setBufferedTime(@Nullable Double d);

        @NonNull
        public abstract Builder setClickString(@Nullable String str);

        @NonNull
        public abstract Builder setCompanions(@Nullable Map<String, CompanionData> map);

        @NonNull
        public abstract Builder setCuepoints(@Nullable List<CuePointData> list);

        @NonNull
        public abstract Builder setCurrentTime(@Nullable Double d);

        @NonNull
        public abstract Builder setDuration(@Nullable Double d);

        @NonNull
        public abstract Builder setErrorCode(@Nullable Integer num);

        @NonNull
        public abstract Builder setErrorMessage(@Nullable String str);

        @NonNull
        public abstract Builder setEventId(@Nullable String str);

        @NonNull
        public abstract Builder setIconClickFallbackImages(@Nullable List<IconClickFallbackImageMsgData> list);

        @NonNull
        public abstract Builder setIconsView(@Nullable IconsViewData iconsViewData);

        @NonNull
        public abstract Builder setInnerError(@Nullable String str);

        @NonNull
        public abstract Builder setInternalCuePoints(@Nullable SortedSet<Float> sortedSet);

        @NonNull
        public abstract Builder setLn(@Nullable String str);

        @NonNull
        public abstract Builder setLogData(@Nullable LogData logData);

        @NonNull
        public abstract Builder setM(@Nullable String str);

        @NonNull
        public abstract Builder setMonitorAppLifecycle(@Nullable Boolean bool);

        @NonNull
        public abstract Builder setN(@Nullable String str);

        @NonNull
        public abstract Builder setNetworkRequest(@Nullable NetworkRequestData networkRequestData);

        @NonNull
        public abstract Builder setPauseAdData(@Nullable PauseAdData pauseAdData);

        @NonNull
        public abstract Builder setPauseAdHideData(@Nullable PauseAdHideData pauseAdHideData);

        @NonNull
        public abstract Builder setQueryId(@Nullable String str);

        @NonNull
        public abstract Builder setResizeAndPositionVideo(@Nullable ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData);

        @NonNull
        public abstract Builder setSeekTime(@Nullable Double d);

        @NonNull
        public abstract Builder setSkipView(@Nullable SkipViewData skipViewData);

        @NonNull
        public abstract Builder setSlateDuration(@Nullable Double d);

        @NonNull
        public abstract Builder setStreamId(@Nullable String str);

        @NonNull
        public abstract Builder setStreamUrl(@Nullable String str);

        @NonNull
        public abstract Builder setSubtitles(@Nullable List<HashMap<String, String>> list);

        @NonNull
        public abstract Builder setTotalAds(@Nullable Integer num);

        @NonNull
        public abstract Builder setTotalDuration(@Nullable Double d);

        @NonNull
        public abstract Builder setUiConfig(@Nullable JavaScriptUiConfigData javaScriptUiConfigData);

        @NonNull
        public abstract Builder setUrl(@Nullable String str);

        @NonNull
        public abstract Builder setVastEvent(@Nullable String str);

        @NonNull
        public abstract Builder setVideoMimeType(@Nullable String str);

        @NonNull
        public abstract Builder setVideoUrl(@Nullable String str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q1p(zza = AutoValue_JavaScriptMsgData_LogData.class)
    public static abstract class LogData {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static abstract class Builder {
            @NonNull
            public abstract LogData build();

            @NonNull
            public abstract Builder setErrorCode(@Nullable Integer num);

            @NonNull
            public abstract Builder setErrorMessage(@Nullable String str);

            @NonNull
            public abstract Builder setInnerError(@Nullable String str);

            @NonNull
            public abstract Builder setType(@Nullable String str);
        }

        @NonNull
        public static Builder builder() {
            return new AutoValue_JavaScriptMsgData_LogData.Builder();
        }

        @NonNull
        public Map<String, String> constructMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("type", type());
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(errorCode()));
            hashMap.put("errorMessage", errorMessage());
            if (innerError() != null) {
                hashMap.put("innerError", innerError());
            }
            return hashMap;
        }

        @Nullable
        public abstract Integer errorCode();

        @Nullable
        public abstract String errorMessage();

        @Nullable
        public abstract String innerError();

        @NonNull
        public final String toString() {
            String type = type();
            Integer errorCode = errorCode();
            String errorMessage = errorMessage();
            String innerError = innerError();
            StringBuilder sb = new StringBuilder("Log[type=");
            sb.append(type);
            sb.append(", errorCode=");
            sb.append(errorCode);
            sb.append(", errorMessage=");
            return fc6.o(sb, errorMessage, ", innerError=", innerError, U3.j.e);
        }

        @Nullable
        public abstract String type();
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_JavaScriptMsgData.Builder();
    }

    @Nullable
    public abstract Double adBreakDuration();

    @Nullable
    public abstract String adBreakTime();

    @Nullable
    public abstract List<Float> adCuePoints();

    @Nullable
    public abstract AdData adData();

    @Nullable
    public abstract Double adPeriodDuration();

    @Nullable
    public abstract AdPodInfoData adPodInfo();

    @Nullable
    public abstract Integer adPosition();

    @Nullable
    public abstract Double adsDuration();

    @Nullable
    public abstract List<Long> adsDurationsMs();

    @Nullable
    public abstract String attributionSrc();

    @Nullable
    public abstract String audioMimeType();

    @Nullable
    public abstract Double bufferedTime();

    @Nullable
    public abstract String clickString();

    @Nullable
    public abstract Map<String, CompanionData> companions();

    @Nullable
    public abstract List<CuePointData> cuepoints();

    @Nullable
    public abstract Double currentTime();

    @Nullable
    public abstract Double duration();

    @Nullable
    public abstract Integer errorCode();

    @Nullable
    public abstract String errorMessage();

    @Nullable
    public abstract String eventId();

    @Nullable
    public abstract List<IconClickFallbackImageMsgData> iconClickFallbackImages();

    @Nullable
    public abstract IconsViewData iconsView();

    @Nullable
    public abstract String innerError();

    @Nullable
    public abstract SortedSet<Float> internalCuePoints();

    @Nullable
    public abstract String ln();

    @Nullable
    public abstract LogData logData();

    @Nullable
    public abstract String m();

    @Nullable
    public abstract Boolean monitorAppLifecycle();

    @Nullable
    public abstract String n();

    @Nullable
    public abstract NetworkRequestData networkRequest();

    @Nullable
    public abstract PauseAdData pauseAdData();

    @Nullable
    public abstract PauseAdHideData pauseAdHideData();

    @Nullable
    public abstract String queryId();

    @Nullable
    public abstract ResizeAndPositionVideoMsgData resizeAndPositionVideo();

    @Nullable
    public abstract Double seekTime();

    @Nullable
    public abstract SkipViewData skipView();

    @Nullable
    public abstract Double slateDuration();

    @Nullable
    public abstract String streamId();

    @Nullable
    public abstract String streamUrl();

    @Nullable
    public abstract List<HashMap<String, String>> subtitles();

    @Nullable
    public abstract Integer totalAds();

    @Nullable
    public abstract Double totalDuration();

    @Nullable
    public abstract JavaScriptUiConfigData uiConfig();

    @Nullable
    public abstract String url();

    @Nullable
    public abstract String vastEvent();

    @Nullable
    public abstract String videoMimeType();

    @Nullable
    public abstract String videoUrl();
}
