package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.I8;
import com.inmobi.media.P0;
import com.inmobi.media.Xg;
import com.inmobi.media.Yg;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R*\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u00168\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001bR(\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001bR\u001a\u0010+\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001bR\u001a\u0010-\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001bR\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010?\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b?\u0010\u0019\u001a\u0004\b@\u0010\u001bR\u0019\u0010B\u001a\u0004\u0018\u00010A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010G\u001a\u0004\u0018\u00010F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010P\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010\u0019\u001a\u0004\bQ\u0010\u001bR\"\u0010R\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0019\u001a\u0004\bS\u0010\u001b\"\u0004\bT\u0010UR \u0010W\u001a\b\u0012\u0004\u0012\u00020V0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u00102\u001a\u0004\bX\u00104R \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u00102\u001a\u0004\b[\u00104R\u0014\u0010\\\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u0016\u0010]\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0013\u0010`\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/Ad;", "", "<init>", "()V", "Lcom/inmobi/media/Xg;", "getPubContent", "()Lcom/inmobi/media/Xg;", "Lcom/inmobi/media/P0;", "_features", "Lcom/inmobi/media/P0;", "_pubContent", "Lcom/inmobi/media/Xg;", "", "insertionTimestampInMillis", "J", "getInsertionTimestampInMillis", "()J", "setInsertionTimestampInMillis", "(J)V", "expiryTimestampInMillis", "getExpiryTimestampInMillis", "setExpiryTimestampInMillis", "", U3.i.X, "markupType", "Ljava/lang/String;", "getMarkupType", "()Ljava/lang/String;", "getMarkupType$annotations", "tracking", "getTracking", "getTracking$annotations", "expiry", "Ljava/lang/Long;", "getExpiry", "()Ljava/lang/Long;", "", "allowAutoRedirection", "Z", "getAllowAutoRedirection", "()Z", "creativeId", "getCreativeId", "impressionId", "getImpressionId", "telemetryMetadataBlob", "getTelemetryMetadataBlob", "", "Lcom/inmobi/media/ads/network/common/model/Viewability;", "viewability", "Ljava/util/List;", "getViewability", "()Ljava/util/List;", "Lorg/json/JSONObject;", "transaction", "Lorg/json/JSONObject;", "getTransaction", "()Lorg/json/JSONObject;", "", "rewards", "Ljava/util/Map;", "getRewards", "()Ljava/util/Map;", "baseEventUrl", "getBaseEventUrl", "Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "metaInfo", "Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "getMetaInfo", "()Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "Lcom/inmobi/media/ads/network/common/model/ContextData;", "contextData", "Lcom/inmobi/media/ads/network/common/model/ContextData;", "getContextData", "()Lcom/inmobi/media/ads/network/common/model/ContextData;", "Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "adQualityControl", "Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "getAdQualityControl", "()Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "bidBundle", "getBidBundle", "webVast", "getWebVast", "setWebVast", "(Ljava/lang/String;)V", "Lcom/inmobi/media/ads/network/common/model/Trackers;", "trackers", "getTrackers$media_release", "Lcom/inmobi/media/ads/network/common/model/TrackingInfo;", "trackingInfo", "getTrackingInfo$media_release", "pubContent", "sf", "getFeatures", "()Lcom/inmobi/media/P0;", U3.a.v, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Ad {

    @I8
    @Nullable
    private P0 _features;

    @I8
    @Nullable
    private Xg _pubContent;

    @Nullable
    private final AdQualityControl adQualityControl;
    private final boolean allowAutoRedirection;

    @Nullable
    private final String baseEventUrl;

    @Nullable
    private final String bidBundle;

    @Nullable
    private final ContextData contextData;

    @I8
    private long expiryTimestampInMillis;

    @Nullable
    private final MetaInfo metaInfo;

    @Nullable
    private final String sf;

    @I8
    private long insertionTimestampInMillis = System.currentTimeMillis();

    @NotNull
    private String markupType = "unknown";

    @NotNull
    private final String tracking = "unknown";

    @Nullable
    private Long expiry = -1L;

    @NotNull
    private final String creativeId = "";

    @NotNull
    private final String impressionId = "";

    @NotNull
    private final String telemetryMetadataBlob = "";

    @NotNull
    private final List<Viewability> viewability = new ArrayList();

    @NotNull
    private final JSONObject transaction = new JSONObject();

    @NotNull
    private final Map<String, String> rewards = new HashMap();

    @NotNull
    private String webVast = "";

    @NotNull
    private final List<Trackers> trackers = new ArrayList();

    @NotNull
    private final List<TrackingInfo> trackingInfo = new ArrayList();

    @NotNull
    private final String pubContent = "";

    @Nullable
    public final AdQualityControl getAdQualityControl() {
        return this.adQualityControl;
    }

    public final boolean getAllowAutoRedirection() {
        return this.allowAutoRedirection;
    }

    @Nullable
    public final String getBaseEventUrl() {
        return this.baseEventUrl;
    }

    @Nullable
    public final String getBidBundle() {
        return this.bidBundle;
    }

    @Nullable
    public final ContextData getContextData() {
        return this.contextData;
    }

    @NotNull
    public final String getCreativeId() {
        return this.creativeId;
    }

    @Nullable
    public final Long getExpiry() {
        return this.expiry;
    }

    public final long getExpiryTimestampInMillis() {
        return this.expiryTimestampInMillis;
    }

    @Nullable
    public final P0 getFeatures() {
        P0 p0 = this._features;
        if (p0 != null) {
            return p0;
        }
        String str = this.sf;
        if (str == null) {
            return null;
        }
        P0 p02 = new P0(str);
        this._features = p02;
        return p02;
    }

    @NotNull
    public final String getImpressionId() {
        return this.impressionId;
    }

    public final long getInsertionTimestampInMillis() {
        return this.insertionTimestampInMillis;
    }

    @NotNull
    public final String getMarkupType() {
        return this.markupType;
    }

    @Nullable
    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    @NotNull
    public final Xg getPubContent() throws IllegalStateException {
        Xg xg = this._pubContent;
        if (xg != null) {
            return xg;
        }
        Xg a = Yg.a(this.pubContent, this.markupType);
        this._pubContent = a;
        return a;
    }

    @NotNull
    public final Map<String, String> getRewards() {
        return this.rewards;
    }

    @NotNull
    public final String getTelemetryMetadataBlob() {
        return this.telemetryMetadataBlob;
    }

    @NotNull
    public final List<Trackers> getTrackers$media_release() {
        return this.trackers;
    }

    @NotNull
    public final String getTracking() {
        return this.tracking;
    }

    @NotNull
    public final List<TrackingInfo> getTrackingInfo$media_release() {
        return this.trackingInfo;
    }

    @NotNull
    public final JSONObject getTransaction() {
        return this.transaction;
    }

    @NotNull
    public final List<Viewability> getViewability() {
        return this.viewability;
    }

    @NotNull
    public final String getWebVast() {
        return this.webVast;
    }

    public final void setExpiryTimestampInMillis(long j) {
        this.expiryTimestampInMillis = j;
    }

    public final void setInsertionTimestampInMillis(long j) {
        this.insertionTimestampInMillis = j;
    }

    public final void setWebVast(@NotNull String str) {
        str.getClass();
        this.webVast = str;
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getTracking$annotations() {
    }
}
