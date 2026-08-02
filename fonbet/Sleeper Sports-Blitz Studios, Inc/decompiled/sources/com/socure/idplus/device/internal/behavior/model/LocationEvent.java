package com.socure.idplus.device.internal.behavior.model;

import androidx.core.location.LocationCompat;
import com.braze.models.IBrazeLocation;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006/"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/LocationEvent;", "", "clientTime", "", "latitude", "", "longitude", "horizontalAccuracy", "", IBrazeLocation.ALTITUDE, "verticalAccuracy", "bearing", LocationCompat.EXTRA_BEARING_ACCURACY, "speed", LocationCompat.EXTRA_SPEED_ACCURACY, "(JDDFDFFFFF)V", "getAltitude", "()D", "getBearing", "()F", "getBearingAccuracy", "getClientTime", "()J", "getHorizontalAccuracy", "getLatitude", "getLongitude", "getSpeed", "getSpeedAccuracy", "getVerticalAccuracy", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LocationEvent {

    @SerializedName(IBrazeLocation.ALTITUDE)
    private final double altitude;

    @SerializedName("bearing")
    private final float bearing;

    @SerializedName(LocationCompat.EXTRA_BEARING_ACCURACY)
    private final float bearingAccuracy;

    @SerializedName("clientTime")
    private final long clientTime;

    @SerializedName("horizontalAccuracy")
    private final float horizontalAccuracy;

    @SerializedName("latitude")
    private final double latitude;

    @SerializedName("longitude")
    private final double longitude;

    @SerializedName("speed")
    private final float speed;

    @SerializedName(LocationCompat.EXTRA_SPEED_ACCURACY)
    private final float speedAccuracy;

    @SerializedName("verticalAccuracy")
    private final float verticalAccuracy;

    public LocationEvent(long j, double d, double d2, float f, double d3, float f2, float f3, float f4, float f5, float f6) {
        this.clientTime = j;
        this.latitude = d;
        this.longitude = d2;
        this.horizontalAccuracy = f;
        this.altitude = d3;
        this.verticalAccuracy = f2;
        this.bearing = f3;
        this.bearingAccuracy = f4;
        this.speed = f5;
        this.speedAccuracy = f6;
    }

    /* renamed from: component1, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    /* renamed from: component10, reason: from getter */
    public final float getSpeedAccuracy() {
        return this.speedAccuracy;
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
    public final float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* renamed from: component6, reason: from getter */
    public final float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    /* renamed from: component7, reason: from getter */
    public final float getBearing() {
        return this.bearing;
    }

    /* renamed from: component8, reason: from getter */
    public final float getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    /* renamed from: component9, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    public final LocationEvent copy(long clientTime, double latitude, double longitude, float horizontalAccuracy, double altitude, float verticalAccuracy, float bearing, float bearingAccuracy, float speed, float speedAccuracy) {
        return new LocationEvent(clientTime, latitude, longitude, horizontalAccuracy, altitude, verticalAccuracy, bearing, bearingAccuracy, speed, speedAccuracy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationEvent)) {
            return false;
        }
        LocationEvent locationEvent = (LocationEvent) other;
        return this.clientTime == locationEvent.clientTime && Double.compare(this.latitude, locationEvent.latitude) == 0 && Double.compare(this.longitude, locationEvent.longitude) == 0 && Float.compare(this.horizontalAccuracy, locationEvent.horizontalAccuracy) == 0 && Double.compare(this.altitude, locationEvent.altitude) == 0 && Float.compare(this.verticalAccuracy, locationEvent.verticalAccuracy) == 0 && Float.compare(this.bearing, locationEvent.bearing) == 0 && Float.compare(this.bearingAccuracy, locationEvent.bearingAccuracy) == 0 && Float.compare(this.speed, locationEvent.speed) == 0 && Float.compare(this.speedAccuracy, locationEvent.speedAccuracy) == 0;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final float getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public final long getClientTime() {
        return this.clientTime;
    }

    public final float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final float getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public final float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Float.hashCode(this.speedAccuracy) + ((Float.hashCode(this.speed) + ((Float.hashCode(this.bearingAccuracy) + ((Float.hashCode(this.bearing) + ((Float.hashCode(this.verticalAccuracy) + ((Double.hashCode(this.altitude) + ((Float.hashCode(this.horizontalAccuracy) + ((Double.hashCode(this.longitude) + ((Double.hashCode(this.latitude) + (Long.hashCode(this.clientTime) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "LocationEvent(clientTime=" + this.clientTime + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", horizontalAccuracy=" + this.horizontalAccuracy + ", altitude=" + this.altitude + ", verticalAccuracy=" + this.verticalAccuracy + ", bearing=" + this.bearing + ", bearingAccuracy=" + this.bearingAccuracy + ", speed=" + this.speed + ", speedAccuracy=" + this.speedAccuracy + ")";
    }
}
