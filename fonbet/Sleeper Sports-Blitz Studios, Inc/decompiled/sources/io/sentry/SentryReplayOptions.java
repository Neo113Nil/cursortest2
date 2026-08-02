package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.SampleRateUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class SentryReplayOptions {
    public static final String ANDROIDX_MEDIA_VIEW_CLASS_NAME = "androidx.media3.ui.PlayerView";
    public static final String CAMERAX_PREVIEW_VIEW_CLASS_NAME = "androidx.camera.view.PreviewView";
    private static final String CUSTOM_MASKING_INTEGRATION_NAME = "ReplayCustomMasking";
    private static final List<String> DEFAULT_HEADERS = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public static final String EXOPLAYER_CLASS_NAME = "com.google.android.exoplayer2.ui.PlayerView";
    public static final String EXOPLAYER_STYLED_CLASS_NAME = "com.google.android.exoplayer2.ui.StyledPlayerView";
    public static final String IMAGE_VIEW_CLASS_NAME = "android.widget.ImageView";
    public static final int MAX_NETWORK_BODY_SIZE = 153600;
    public static final String TEXT_VIEW_CLASS_NAME = "android.widget.TextView";
    public static final String VIDEO_VIEW_CLASS_NAME = "android.widget.VideoView";
    public static final String WEB_VIEW_CLASS_NAME = "android.webkit.WebView";
    private volatile boolean customMaskingTracked;
    private boolean debug;
    private long errorReplayDuration;
    private int frameRate;
    private Set<String> maskViewClasses;
    private String maskViewContainerClass;
    private boolean networkCaptureBodies;
    private List<String> networkDetailAllowUrls;
    private List<String> networkDetailDenyUrls;
    private List<String> networkRequestHeaders;
    private List<String> networkResponseHeaders;
    private Double onErrorSampleRate;
    private SentryReplayQuality quality;
    private ScreenshotStrategyType screenshotStrategy;
    private SdkVersion sdkVersion;
    private long sessionDuration;
    private Double sessionSampleRate;
    private long sessionSegmentDuration;
    private boolean trackConfiguration;
    private Set<String> unmaskViewClasses;
    private String unmaskViewContainerClass;

    public enum SentryReplayQuality {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        SentryReplayQuality(float f, int i, int i2) {
            this.sizeScale = f;
            this.bitRate = i;
            this.screenshotQuality = i2;
        }

        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public static List<String> getNetworkDetailsDefaultHeaders() {
        return DEFAULT_HEADERS;
    }

    public SentryReplayOptions(boolean z, SdkVersion sdkVersion) {
        this.customMaskingTracked = false;
        this.maskViewClasses = new CopyOnWriteArraySet();
        this.unmaskViewClasses = new CopyOnWriteArraySet();
        this.maskViewContainerClass = null;
        this.unmaskViewContainerClass = null;
        this.quality = SentryReplayQuality.MEDIUM;
        this.frameRate = 1;
        this.errorReplayDuration = 30000L;
        this.sessionSegmentDuration = 5000L;
        this.sessionDuration = org.apache.commons.lang3.time.DateUtils.MILLIS_PER_HOUR;
        this.trackConfiguration = true;
        this.debug = false;
        this.screenshotStrategy = ScreenshotStrategyType.PIXEL_COPY;
        this.networkDetailAllowUrls = Collections.EMPTY_LIST;
        this.networkDetailDenyUrls = Collections.EMPTY_LIST;
        this.networkCaptureBodies = true;
        List<String> list = DEFAULT_HEADERS;
        this.networkRequestHeaders = list;
        this.networkResponseHeaders = list;
        if (z) {
            return;
        }
        this.maskViewClasses.add("android.widget.TextView");
        this.maskViewClasses.add(IMAGE_VIEW_CLASS_NAME);
        this.maskViewClasses.add(WEB_VIEW_CLASS_NAME);
        this.maskViewClasses.add(VIDEO_VIEW_CLASS_NAME);
        this.maskViewClasses.add(CAMERAX_PREVIEW_VIEW_CLASS_NAME);
        this.maskViewClasses.add(ANDROIDX_MEDIA_VIEW_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_STYLED_CLASS_NAME);
        this.sdkVersion = sdkVersion;
    }

    public SentryReplayOptions(Double d, Double d2, SdkVersion sdkVersion) {
        this(false, sdkVersion);
        this.sessionSampleRate = d;
        this.onErrorSampleRate = d2;
        this.sdkVersion = sdkVersion;
    }

    public Double getOnErrorSampleRate() {
        return this.onErrorSampleRate;
    }

    public boolean isSessionReplayEnabled() {
        return getSessionSampleRate() != null && getSessionSampleRate().doubleValue() > 0.0d;
    }

    public void setOnErrorSampleRate(Double d) {
        if (!SampleRateUtils.isValidSampleRate(d)) {
            throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
        this.onErrorSampleRate = d;
    }

    public Double getSessionSampleRate() {
        return this.sessionSampleRate;
    }

    public boolean isSessionReplayForErrorsEnabled() {
        return getOnErrorSampleRate() != null && getOnErrorSampleRate().doubleValue() > 0.0d;
    }

    public void setSessionSampleRate(Double d) {
        if (!SampleRateUtils.isValidSampleRate(d)) {
            throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
        this.sessionSampleRate = d;
    }

    public void setMaskAllText(boolean z) {
        if (z) {
            this.maskViewClasses.add("android.widget.TextView");
            this.unmaskViewClasses.remove("android.widget.TextView");
        } else {
            trackCustomMasking();
            this.unmaskViewClasses.add("android.widget.TextView");
            this.maskViewClasses.remove("android.widget.TextView");
        }
    }

    public void setMaskAllImages(boolean z) {
        if (z) {
            this.maskViewClasses.add(IMAGE_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        } else {
            trackCustomMasking();
            this.unmaskViewClasses.add(IMAGE_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        }
    }

    public Set<String> getMaskViewClasses() {
        return this.maskViewClasses;
    }

    public void addMaskViewClass(String str) {
        trackCustomMasking();
        this.maskViewClasses.add(str);
    }

    public Set<String> getUnmaskViewClasses() {
        return this.unmaskViewClasses;
    }

    public void addUnmaskViewClass(String str) {
        trackCustomMasking();
        this.unmaskViewClasses.add(str);
    }

    public SentryReplayQuality getQuality() {
        return this.quality;
    }

    public void setQuality(SentryReplayQuality sentryReplayQuality) {
        this.quality = sentryReplayQuality;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public long getErrorReplayDuration() {
        return this.errorReplayDuration;
    }

    public long getSessionSegmentDuration() {
        return this.sessionSegmentDuration;
    }

    public long getSessionDuration() {
        return this.sessionDuration;
    }

    public void setMaskViewContainerClass(String str) {
        this.maskViewClasses.add(str);
        this.maskViewContainerClass = str;
    }

    public void setUnmaskViewContainerClass(String str) {
        this.unmaskViewContainerClass = str;
    }

    public String getMaskViewContainerClass() {
        return this.maskViewContainerClass;
    }

    public String getUnmaskViewContainerClass() {
        return this.unmaskViewContainerClass;
    }

    public void trackCustomMasking() {
        if (this.customMaskingTracked) {
            return;
        }
        this.customMaskingTracked = true;
        IntegrationUtils.addIntegrationToSdkVersion(CUSTOM_MASKING_INTEGRATION_NAME);
    }

    public boolean isTrackConfiguration() {
        return this.trackConfiguration;
    }

    public void setTrackConfiguration(boolean z) {
        this.trackConfiguration = z;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public void setSdkVersion(SdkVersion sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public ScreenshotStrategyType getScreenshotStrategy() {
        return this.screenshotStrategy;
    }

    public void setScreenshotStrategy(ScreenshotStrategyType screenshotStrategyType) {
        this.screenshotStrategy = screenshotStrategyType;
    }

    public List<String> getNetworkDetailAllowUrls() {
        return this.networkDetailAllowUrls;
    }

    public void setNetworkDetailAllowUrls(List<String> list) {
        this.networkDetailAllowUrls = Collections.unmodifiableList(new ArrayList(list));
    }

    public List<String> getNetworkDetailDenyUrls() {
        return this.networkDetailDenyUrls;
    }

    public void setNetworkDetailDenyUrls(List<String> list) {
        this.networkDetailDenyUrls = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean isNetworkCaptureBodies() {
        return this.networkCaptureBodies;
    }

    public void setNetworkCaptureBodies(boolean z) {
        this.networkCaptureBodies = z;
    }

    public List<String> getNetworkRequestHeaders() {
        return this.networkRequestHeaders;
    }

    public void setNetworkRequestHeaders(List<String> list) {
        this.networkRequestHeaders = mergeHeaders(DEFAULT_HEADERS, list);
    }

    public List<String> getNetworkResponseHeaders() {
        return this.networkResponseHeaders;
    }

    public void setNetworkResponseHeaders(List<String> list) {
        this.networkResponseHeaders = mergeHeaders(DEFAULT_HEADERS, list);
    }

    private static List<String> mergeHeaders(List<String> list, List<String> list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }
}
