package io.radar.sdk.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarMeta.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lio/radar/sdk/model/RadarMeta;", "", "remoteTrackingOptions", "Lio/radar/sdk/RadarTrackingOptions;", RadarMeta.SDK_CONFIGURATION, "Lio/radar/sdk/model/RadarSdkConfiguration;", "(Lio/radar/sdk/RadarTrackingOptions;Lio/radar/sdk/model/RadarSdkConfiguration;)V", "getRemoteTrackingOptions", "()Lio/radar/sdk/RadarTrackingOptions;", "getSdkConfiguration", "()Lio/radar/sdk/model/RadarSdkConfiguration;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarMeta {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SDK_CONFIGURATION = "sdkConfiguration";
    private static final String TRACKING_OPTIONS = "trackingOptions";
    private final RadarTrackingOptions remoteTrackingOptions;
    private final RadarSdkConfiguration sdkConfiguration;

    public static /* synthetic */ RadarMeta copy$default(RadarMeta radarMeta, RadarTrackingOptions radarTrackingOptions, RadarSdkConfiguration radarSdkConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            radarTrackingOptions = radarMeta.remoteTrackingOptions;
        }
        if ((i & 2) != 0) {
            radarSdkConfiguration = radarMeta.sdkConfiguration;
        }
        return radarMeta.copy(radarTrackingOptions, radarSdkConfiguration);
    }

    /* renamed from: component1, reason: from getter */
    public final RadarTrackingOptions getRemoteTrackingOptions() {
        return this.remoteTrackingOptions;
    }

    /* renamed from: component2, reason: from getter */
    public final RadarSdkConfiguration getSdkConfiguration() {
        return this.sdkConfiguration;
    }

    public final RadarMeta copy(RadarTrackingOptions remoteTrackingOptions, RadarSdkConfiguration sdkConfiguration) {
        return new RadarMeta(remoteTrackingOptions, sdkConfiguration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarMeta)) {
            return false;
        }
        RadarMeta radarMeta = (RadarMeta) other;
        return Intrinsics.areEqual(this.remoteTrackingOptions, radarMeta.remoteTrackingOptions) && Intrinsics.areEqual(this.sdkConfiguration, radarMeta.sdkConfiguration);
    }

    public int hashCode() {
        RadarTrackingOptions radarTrackingOptions = this.remoteTrackingOptions;
        int hashCode = (radarTrackingOptions == null ? 0 : radarTrackingOptions.hashCode()) * 31;
        RadarSdkConfiguration radarSdkConfiguration = this.sdkConfiguration;
        return hashCode + (radarSdkConfiguration != null ? radarSdkConfiguration.hashCode() : 0);
    }

    public String toString() {
        return "RadarMeta(remoteTrackingOptions=" + this.remoteTrackingOptions + ", sdkConfiguration=" + this.sdkConfiguration + ')';
    }

    public RadarMeta(RadarTrackingOptions radarTrackingOptions, RadarSdkConfiguration radarSdkConfiguration) {
        this.remoteTrackingOptions = radarTrackingOptions;
        this.sdkConfiguration = radarSdkConfiguration;
    }

    public final RadarTrackingOptions getRemoteTrackingOptions() {
        return this.remoteTrackingOptions;
    }

    public final RadarSdkConfiguration getSdkConfiguration() {
        return this.sdkConfiguration;
    }

    /* compiled from: RadarMeta.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/radar/sdk/model/RadarMeta$Companion;", "", "()V", "SDK_CONFIGURATION", "", "TRACKING_OPTIONS", "fromJson", "Lio/radar/sdk/model/RadarMeta;", "meta", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RadarMeta fromJson(JSONObject meta) {
            JSONObject optJSONObject = meta != null ? meta.optJSONObject(RadarMeta.TRACKING_OPTIONS) : null;
            return new RadarMeta(optJSONObject != null ? RadarTrackingOptions.INSTANCE.fromJson(optJSONObject) : null, RadarSdkConfiguration.INSTANCE.fromJson(meta != null ? meta.optJSONObject(RadarMeta.SDK_CONFIGURATION) : null));
        }
    }
}
