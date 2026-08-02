package ru.ozon.app.android.fresh.main.widgets.addressCommunication.data;

import B90.C2619v;
import Cm.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/LocationInfo;", "", "currentLocation", "Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/LocationInfo$Coordinates;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/LocationInfo$Coordinates;)V", "getCurrentLocation", "()Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/LocationInfo$Coordinates;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Coordinates", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LocationInfo {

    @NotNull
    private final Coordinates currentLocation;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/data/LocationInfo$Coordinates;", "", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Coordinates {
        private final double latitude;
        private final double longitude;

        public Coordinates(double d11, double d12) {
            this.latitude = d11;
            this.longitude = d12;
        }

        public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, double d11, double d12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = coordinates.latitude;
            }
            if ((i11 & 2) != 0) {
                d12 = coordinates.longitude;
            }
            return coordinates.copy(d11, d12);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @NotNull
        public final Coordinates copy(double latitude, double longitude) {
            return new Coordinates(latitude, longitude);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coordinates)) {
                return false;
            }
            Coordinates coordinates = (Coordinates) other;
            return Double.compare(this.latitude, coordinates.latitude) == 0 && Double.compare(this.longitude, coordinates.longitude) == 0;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }

        @NotNull
        public String toString() {
            double d11 = this.latitude;
            return C2619v.c(e.e(d11, "Coordinates(latitude=", ", longitude="), this.longitude, ")");
        }
    }

    public LocationInfo(@NotNull Coordinates currentLocation) {
        Intrinsics.checkNotNullParameter(currentLocation, "currentLocation");
        this.currentLocation = currentLocation;
    }

    public static /* synthetic */ LocationInfo copy$default(LocationInfo locationInfo, Coordinates coordinates, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coordinates = locationInfo.currentLocation;
        }
        return locationInfo.copy(coordinates);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Coordinates getCurrentLocation() {
        return this.currentLocation;
    }

    @NotNull
    public final LocationInfo copy(@NotNull Coordinates currentLocation) {
        Intrinsics.checkNotNullParameter(currentLocation, "currentLocation");
        return new LocationInfo(currentLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocationInfo) && Intrinsics.d(this.currentLocation, ((LocationInfo) other).currentLocation);
    }

    @NotNull
    public final Coordinates getCurrentLocation() {
        return this.currentLocation;
    }

    public int hashCode() {
        return this.currentLocation.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocationInfo(currentLocation=" + this.currentLocation + ")";
    }
}
