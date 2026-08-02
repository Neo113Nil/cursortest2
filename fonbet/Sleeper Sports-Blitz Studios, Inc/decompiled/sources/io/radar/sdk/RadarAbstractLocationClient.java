package io.radar.sdk;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import com.braze.models.BrazeGeofence;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarAbstractLocationClient.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0002%&B\u0005¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\rH&¢\u0006\u0002\u0010\u0012J5\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\rH&J-\u0010\u0018\u001a\u00020\u00042#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\rH&J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH&J5\u0010\u001f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH&J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010!\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006'"}, d2 = {"Lio/radar/sdk/RadarAbstractLocationClient;", "", "()V", "addGeofences", "", "abstractGeofences", "", "Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofence;", "abstractGeofenceRequest", "Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofenceRequest;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "([Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofence;Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofenceRequest;Landroid/app/PendingIntent;Lkotlin/jvm/functions/Function1;)V", "getCurrentLocation", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "getLastLocation", "getLocationFromGeofenceIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getLocationFromLocationIntent", "getSourceFromGeofenceIntent", "Lio/radar/sdk/Radar$RadarLocationSource;", "removeGeofences", "removeLocationUpdates", "requestLocationUpdates", "interval", "", "fastestInterval", "RadarAbstractGeofence", "RadarAbstractGeofenceRequest", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class RadarAbstractLocationClient {
    public abstract void addGeofences(RadarAbstractGeofence[] abstractGeofences, RadarAbstractGeofenceRequest abstractGeofenceRequest, PendingIntent pendingIntent, Function1<? super Boolean, Unit> block);

    public abstract void getCurrentLocation(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, Function1<? super Location, Unit> block);

    public abstract void getLastLocation(Function1<? super Location, Unit> block);

    public abstract Location getLocationFromGeofenceIntent(Intent intent);

    public abstract Location getLocationFromLocationIntent(Intent intent);

    public abstract Radar.RadarLocationSource getSourceFromGeofenceIntent(Intent intent);

    public abstract void removeGeofences(PendingIntent pendingIntent, Function1<? super Boolean, Unit> block);

    public abstract void removeLocationUpdates(PendingIntent pendingIntent);

    public abstract void requestLocationUpdates(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, int interval, int fastestInterval, PendingIntent pendingIntent);

    /* compiled from: RadarAbstractLocationClient.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000eHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u0006*"}, d2 = {"Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofence;", "", "requestId", "", "latitude", "", "longitude", BrazeGeofence.RADIUS_METERS, "", "transitionEnter", "", "transitionExit", "transitionDwell", "dwellDuration", "", "(Ljava/lang/String;DDFZZZI)V", "getDwellDuration", "()I", "getLatitude", "()D", "getLongitude", "getRadius", "()F", "getRequestId", "()Ljava/lang/String;", "getTransitionDwell", "()Z", "getTransitionEnter", "getTransitionExit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RadarAbstractGeofence {
        private final int dwellDuration;
        private final double latitude;
        private final double longitude;
        private final float radius;
        private final String requestId;
        private final boolean transitionDwell;
        private final boolean transitionEnter;
        private final boolean transitionExit;

        public static /* synthetic */ RadarAbstractGeofence copy$default(RadarAbstractGeofence radarAbstractGeofence, String str, double d, double d2, float f, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = radarAbstractGeofence.requestId;
            }
            if ((i2 & 2) != 0) {
                d = radarAbstractGeofence.latitude;
            }
            if ((i2 & 4) != 0) {
                d2 = radarAbstractGeofence.longitude;
            }
            if ((i2 & 8) != 0) {
                f = radarAbstractGeofence.radius;
            }
            if ((i2 & 16) != 0) {
                z = radarAbstractGeofence.transitionEnter;
            }
            if ((i2 & 32) != 0) {
                z2 = radarAbstractGeofence.transitionExit;
            }
            if ((i2 & 64) != 0) {
                z3 = radarAbstractGeofence.transitionDwell;
            }
            if ((i2 & 128) != 0) {
                i = radarAbstractGeofence.dwellDuration;
            }
            int i3 = i;
            boolean z4 = z2;
            float f2 = f;
            double d3 = d2;
            return radarAbstractGeofence.copy(str, d, d3, f2, z, z4, z3, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component3, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component4, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getTransitionEnter() {
            return this.transitionEnter;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getTransitionExit() {
            return this.transitionExit;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getTransitionDwell() {
            return this.transitionDwell;
        }

        /* renamed from: component8, reason: from getter */
        public final int getDwellDuration() {
            return this.dwellDuration;
        }

        public final RadarAbstractGeofence copy(String requestId, double latitude, double longitude, float radius, boolean transitionEnter, boolean transitionExit, boolean transitionDwell, int dwellDuration) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            return new RadarAbstractGeofence(requestId, latitude, longitude, radius, transitionEnter, transitionExit, transitionDwell, dwellDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadarAbstractGeofence)) {
                return false;
            }
            RadarAbstractGeofence radarAbstractGeofence = (RadarAbstractGeofence) other;
            return Intrinsics.areEqual(this.requestId, radarAbstractGeofence.requestId) && Double.compare(this.latitude, radarAbstractGeofence.latitude) == 0 && Double.compare(this.longitude, radarAbstractGeofence.longitude) == 0 && Float.compare(this.radius, radarAbstractGeofence.radius) == 0 && this.transitionEnter == radarAbstractGeofence.transitionEnter && this.transitionExit == radarAbstractGeofence.transitionExit && this.transitionDwell == radarAbstractGeofence.transitionDwell && this.dwellDuration == radarAbstractGeofence.dwellDuration;
        }

        public int hashCode() {
            return (((((((((((((this.requestId.hashCode() * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + Float.hashCode(this.radius)) * 31) + Boolean.hashCode(this.transitionEnter)) * 31) + Boolean.hashCode(this.transitionExit)) * 31) + Boolean.hashCode(this.transitionDwell)) * 31) + Integer.hashCode(this.dwellDuration);
        }

        public String toString() {
            return "RadarAbstractGeofence(requestId=" + this.requestId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", radius=" + this.radius + ", transitionEnter=" + this.transitionEnter + ", transitionExit=" + this.transitionExit + ", transitionDwell=" + this.transitionDwell + ", dwellDuration=" + this.dwellDuration + ')';
        }

        public RadarAbstractGeofence(String requestId, double d, double d2, float f, boolean z, boolean z2, boolean z3, int i) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.requestId = requestId;
            this.latitude = d;
            this.longitude = d2;
            this.radius = f;
            this.transitionEnter = z;
            this.transitionExit = z2;
            this.transitionDwell = z3;
            this.dwellDuration = i;
        }

        public /* synthetic */ RadarAbstractGeofence(String str, double d, double d2, float f, boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, d, d2, f, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? 0 : i);
        }

        public final String getRequestId() {
            return this.requestId;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final boolean getTransitionEnter() {
            return this.transitionEnter;
        }

        public final boolean getTransitionExit() {
            return this.transitionExit;
        }

        public final boolean getTransitionDwell() {
            return this.transitionDwell;
        }

        public final int getDwellDuration() {
            return this.dwellDuration;
        }
    }

    /* compiled from: RadarAbstractLocationClient.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofenceRequest;", "", "initialTriggerEnter", "", "initialTriggerExit", "initialTriggerDwell", "(ZZZ)V", "getInitialTriggerDwell", "()Z", "getInitialTriggerEnter", "getInitialTriggerExit", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RadarAbstractGeofenceRequest {
        private final boolean initialTriggerDwell;
        private final boolean initialTriggerEnter;
        private final boolean initialTriggerExit;

        public RadarAbstractGeofenceRequest() {
            this(false, false, false, 7, null);
        }

        public static /* synthetic */ RadarAbstractGeofenceRequest copy$default(RadarAbstractGeofenceRequest radarAbstractGeofenceRequest, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = radarAbstractGeofenceRequest.initialTriggerEnter;
            }
            if ((i & 2) != 0) {
                z2 = radarAbstractGeofenceRequest.initialTriggerExit;
            }
            if ((i & 4) != 0) {
                z3 = radarAbstractGeofenceRequest.initialTriggerDwell;
            }
            return radarAbstractGeofenceRequest.copy(z, z2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInitialTriggerEnter() {
            return this.initialTriggerEnter;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInitialTriggerExit() {
            return this.initialTriggerExit;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getInitialTriggerDwell() {
            return this.initialTriggerDwell;
        }

        public final RadarAbstractGeofenceRequest copy(boolean initialTriggerEnter, boolean initialTriggerExit, boolean initialTriggerDwell) {
            return new RadarAbstractGeofenceRequest(initialTriggerEnter, initialTriggerExit, initialTriggerDwell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadarAbstractGeofenceRequest)) {
                return false;
            }
            RadarAbstractGeofenceRequest radarAbstractGeofenceRequest = (RadarAbstractGeofenceRequest) other;
            return this.initialTriggerEnter == radarAbstractGeofenceRequest.initialTriggerEnter && this.initialTriggerExit == radarAbstractGeofenceRequest.initialTriggerExit && this.initialTriggerDwell == radarAbstractGeofenceRequest.initialTriggerDwell;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.initialTriggerEnter) * 31) + Boolean.hashCode(this.initialTriggerExit)) * 31) + Boolean.hashCode(this.initialTriggerDwell);
        }

        public String toString() {
            return "RadarAbstractGeofenceRequest(initialTriggerEnter=" + this.initialTriggerEnter + ", initialTriggerExit=" + this.initialTriggerExit + ", initialTriggerDwell=" + this.initialTriggerDwell + ')';
        }

        public RadarAbstractGeofenceRequest(boolean z, boolean z2, boolean z3) {
            this.initialTriggerEnter = z;
            this.initialTriggerExit = z2;
            this.initialTriggerDwell = z3;
        }

        public /* synthetic */ RadarAbstractGeofenceRequest(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }

        public final boolean getInitialTriggerEnter() {
            return this.initialTriggerEnter;
        }

        public final boolean getInitialTriggerExit() {
            return this.initialTriggerExit;
        }

        public final boolean getInitialTriggerDwell() {
            return this.initialTriggerDwell;
        }
    }
}
