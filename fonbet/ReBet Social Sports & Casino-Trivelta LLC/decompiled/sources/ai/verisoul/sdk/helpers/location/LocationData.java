package ai.verisoul.sdk.helpers.location;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0017Jn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\f\u0010\u0017R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u0010¨\u0006,"}, d2 = {"Lai/verisoul/sdk/helpers/location/LocationData;", "", "latitude", "", "longitude", "accuracy", "", "altitude", "speed", "provider", "", "errorMessage", "isMock", "", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAccuracy", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getErrorMessage", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLatitude", "getLongitude", "getProvider", "getSpeed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lai/verisoul/sdk/helpers/location/LocationData;", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LocationData {

    @Gb.c("accuracy")
    @Nullable
    private final Float accuracy;

    @Gb.c("altitude")
    @Nullable
    private final Double altitude;

    @Gb.c("errorMessage")
    @Nullable
    private final String errorMessage;

    @Gb.c("isMock")
    @Nullable
    private final Boolean isMock;

    @Gb.c("latitude")
    @Nullable
    private final Double latitude;

    @Gb.c("longitude")
    @Nullable
    private final Double longitude;

    @Gb.c("provider")
    @Nullable
    private final String provider;

    @Gb.c("speed")
    @Nullable
    private final Float speed;

    public LocationData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ LocationData copy$default(LocationData locationData, Double d10, Double d11, Float f10, Double d12, Float f11, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = locationData.latitude;
        }
        if ((i10 & 2) != 0) {
            d11 = locationData.longitude;
        }
        if ((i10 & 4) != 0) {
            f10 = locationData.accuracy;
        }
        if ((i10 & 8) != 0) {
            d12 = locationData.altitude;
        }
        if ((i10 & 16) != 0) {
            f11 = locationData.speed;
        }
        if ((i10 & 32) != 0) {
            str = locationData.provider;
        }
        if ((i10 & 64) != 0) {
            str2 = locationData.errorMessage;
        }
        if ((i10 & 128) != 0) {
            bool = locationData.isMock;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        Float f12 = f11;
        String str4 = str;
        return locationData.copy(d10, d11, f10, d12, f12, str4, str3, bool2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getSpeed() {
        return this.speed;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsMock() {
        return this.isMock;
    }

    @NotNull
    public final LocationData copy(@Nullable Double latitude, @Nullable Double longitude, @Nullable Float accuracy, @Nullable Double altitude, @Nullable Float speed, @Nullable String provider, @Nullable String errorMessage, @Nullable Boolean isMock) {
        return new LocationData(latitude, longitude, accuracy, altitude, speed, provider, errorMessage, isMock);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) other;
        return Intrinsics.areEqual((Object) this.latitude, (Object) locationData.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) locationData.longitude) && Intrinsics.areEqual((Object) this.accuracy, (Object) locationData.accuracy) && Intrinsics.areEqual((Object) this.altitude, (Object) locationData.altitude) && Intrinsics.areEqual((Object) this.speed, (Object) locationData.speed) && Intrinsics.areEqual(this.provider, locationData.provider) && Intrinsics.areEqual(this.errorMessage, locationData.errorMessage) && Intrinsics.areEqual(this.isMock, locationData.isMock);
    }

    @Nullable
    public final Float getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getProvider() {
        return this.provider;
    }

    @Nullable
    public final Float getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        Double d10 = this.latitude;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.longitude;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Float f10 = this.accuracy;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Double d12 = this.altitude;
        int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Float f11 = this.speed;
        int hashCode5 = (hashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str = this.provider;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isMock;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isMock() {
        return this.isMock;
    }

    @NotNull
    public String toString() {
        return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", speed=" + this.speed + ", provider=" + this.provider + ", errorMessage=" + this.errorMessage + ", isMock=" + this.isMock + ")";
    }

    public LocationData(@Nullable Double d10, @Nullable Double d11, @Nullable Float f10, @Nullable Double d12, @Nullable Float f11, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.latitude = d10;
        this.longitude = d11;
        this.accuracy = f10;
        this.altitude = d12;
        this.speed = f11;
        this.provider = str;
        this.errorMessage = str2;
        this.isMock = bool;
    }

    public /* synthetic */ LocationData(Double d10, Double d11, Float f10, Double d12, Float f11, String str, String str2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : d11, (i10 & 4) != 0 ? null : f10, (i10 & 8) != 0 ? null : d12, (i10 & 16) != 0 ? null : f11, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? null : bool);
    }
}
