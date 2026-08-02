package com.brentvatne.common.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.brentvatne.common.toolbox.ReactBridgeUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdsProps.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020,J\u0013\u00100\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00102\u001a\u000203H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\t¨\u00065"}, d2 = {"Lcom/brentvatne/common/api/AdsProps;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", AdsProps.PROP_STREAM_TYPE, "getStreamType", "setStreamType", AdsProps.PROP_AD_TAG_URL, "Landroid/net/Uri;", "getAdTagUrl", "()Landroid/net/Uri;", "setAdTagUrl", "(Landroid/net/Uri;)V", AdsProps.PROP_AD_LANGUAGE, "getAdLanguage", "setAdLanguage", AdsProps.PROP_CONTENT_SOURCE_ID, "getContentSourceId", "setContentSourceId", AdsProps.PROP_VIDEO_ID, "getVideoId", "setVideoId", AdsProps.PROP_ASSET_KEY, "getAssetKey", "setAssetKey", AdsProps.PROP_FORMAT, "getFormat", "setFormat", AdsProps.PROP_AD_TAG_PARAMETERS, "", "getAdTagParameters", "()Ljava/util/Map;", "setAdTagParameters", "(Ljava/util/Map;)V", AdsProps.PROP_FALLBACK_URI, "getFallbackUri", "setFallbackUri", "isCSAI", "", "isDAI", "isDAIVod", "isDAILive", "equals", "other", "hashCode", "", "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdsProps {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PROP_AD_LANGUAGE = "adLanguage";
    private static final String PROP_AD_TAG_PARAMETERS = "adTagParameters";
    private static final String PROP_AD_TAG_URL = "adTagUrl";
    private static final String PROP_ASSET_KEY = "assetKey";
    private static final String PROP_CONTENT_SOURCE_ID = "contentSourceId";
    private static final String PROP_FALLBACK_URI = "fallbackUri";
    private static final String PROP_FORMAT = "format";
    private static final String PROP_STREAM_TYPE = "streamType";
    private static final String PROP_TYPE = "type";
    private static final String PROP_VIDEO_ID = "videoId";
    private String adLanguage;
    private Map<String, String> adTagParameters;
    private Uri adTagUrl;
    private String assetKey;
    private String contentSourceId;
    private String fallbackUri;
    private String format;
    private String streamType;
    private String type;
    private String videoId;

    @JvmStatic
    public static final AdsProps parse(ReadableMap readableMap) {
        return INSTANCE.parse(readableMap);
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String getStreamType() {
        return this.streamType;
    }

    public final void setStreamType(String str) {
        this.streamType = str;
    }

    public final Uri getAdTagUrl() {
        return this.adTagUrl;
    }

    public final void setAdTagUrl(Uri uri) {
        this.adTagUrl = uri;
    }

    public final String getAdLanguage() {
        return this.adLanguage;
    }

    public final void setAdLanguage(String str) {
        this.adLanguage = str;
    }

    public final String getContentSourceId() {
        return this.contentSourceId;
    }

    public final void setContentSourceId(String str) {
        this.contentSourceId = str;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final String getAssetKey() {
        return this.assetKey;
    }

    public final void setAssetKey(String str) {
        this.assetKey = str;
    }

    public final String getFormat() {
        return this.format;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final Map<String, String> getAdTagParameters() {
        return this.adTagParameters;
    }

    public final void setAdTagParameters(Map<String, String> map) {
        this.adTagParameters = map;
    }

    public final String getFallbackUri() {
        return this.fallbackUri;
    }

    public final void setFallbackUri(String str) {
        this.fallbackUri = str;
    }

    public final boolean isCSAI() {
        return Intrinsics.areEqual(this.type, "csai") && this.adTagUrl != null;
    }

    public final boolean isDAI() {
        return Intrinsics.areEqual(this.type, C.SSAI_SCHEME);
    }

    public final boolean isDAIVod() {
        return Intrinsics.areEqual(this.type, C.SSAI_SCHEME) && Intrinsics.areEqual(this.streamType, "vod");
    }

    public final boolean isDAILive() {
        return Intrinsics.areEqual(this.type, C.SSAI_SCHEME) && Intrinsics.areEqual(this.streamType, "live");
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof AdsProps)) {
            AdsProps adsProps = (AdsProps) other;
            if (Intrinsics.areEqual(this.type, adsProps.type) && Intrinsics.areEqual(this.streamType, adsProps.streamType) && Intrinsics.areEqual(this.adTagUrl, adsProps.adTagUrl) && Intrinsics.areEqual(this.adLanguage, adsProps.adLanguage) && Intrinsics.areEqual(this.contentSourceId, adsProps.contentSourceId) && Intrinsics.areEqual(this.videoId, adsProps.videoId) && Intrinsics.areEqual(this.assetKey, adsProps.assetKey) && Intrinsics.areEqual(this.format, adsProps.format) && Intrinsics.areEqual(this.adTagParameters, adsProps.adTagParameters) && Intrinsics.areEqual(this.fallbackUri, adsProps.fallbackUri)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.streamType, this.adTagUrl, this.adLanguage, this.contentSourceId, this.videoId, this.assetKey, this.format, this.adTagParameters, this.fallbackUri);
    }

    /* compiled from: AdsProps.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/brentvatne/common/api/AdsProps$Companion;", "", "<init>", "()V", "PROP_TYPE", "", "PROP_STREAM_TYPE", "PROP_AD_TAG_URL", "PROP_AD_LANGUAGE", "PROP_CONTENT_SOURCE_ID", "PROP_VIDEO_ID", "PROP_ASSET_KEY", "PROP_FORMAT", "PROP_AD_TAG_PARAMETERS", "PROP_FALLBACK_URI", "parse", "Lcom/brentvatne/common/api/AdsProps;", "src", "Lcom/facebook/react/bridge/ReadableMap;", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdsProps parse(ReadableMap src) {
            ReadableMap map;
            AdsProps adsProps = new AdsProps();
            if (src != null) {
                adsProps.setType(ReactBridgeUtils.safeGetString(src, "type"));
                adsProps.setStreamType(ReactBridgeUtils.safeGetString(src, AdsProps.PROP_STREAM_TYPE));
                String safeGetString = ReactBridgeUtils.safeGetString(src, AdsProps.PROP_AD_TAG_URL);
                if (!TextUtils.isEmpty(safeGetString)) {
                    adsProps.setAdTagUrl(Uri.parse(safeGetString));
                }
                String safeGetString2 = ReactBridgeUtils.safeGetString(src, AdsProps.PROP_AD_LANGUAGE);
                if (!TextUtils.isEmpty(safeGetString2)) {
                    adsProps.setAdLanguage(safeGetString2);
                }
                adsProps.setContentSourceId(ReactBridgeUtils.safeGetString(src, AdsProps.PROP_CONTENT_SOURCE_ID));
                adsProps.setVideoId(ReactBridgeUtils.safeGetString(src, AdsProps.PROP_VIDEO_ID));
                adsProps.setAssetKey(ReactBridgeUtils.safeGetString(src, AdsProps.PROP_ASSET_KEY));
                adsProps.setFormat(ReactBridgeUtils.safeGetString(src, AdsProps.PROP_FORMAT));
                adsProps.setFallbackUri(ReactBridgeUtils.safeGetString(src, AdsProps.PROP_FALLBACK_URI));
                if (src.hasKey(AdsProps.PROP_AD_TAG_PARAMETERS) && (map = src.getMap(AdsProps.PROP_AD_TAG_PARAMETERS)) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        String string = map.getString(nextKey);
                        if (string != null) {
                            linkedHashMap.put(nextKey, string);
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        adsProps.setAdTagParameters(linkedHashMap);
                    }
                }
            }
            return adsProps;
        }
    }
}
