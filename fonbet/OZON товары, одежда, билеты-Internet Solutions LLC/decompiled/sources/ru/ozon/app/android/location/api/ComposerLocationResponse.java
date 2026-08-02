package ru.ozon.app.android.location.api;

import Ak.C2436a;
import Nh.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/location/api/ComposerLocationResponse;", "", "current", "Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;", "<init>", "(Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;)V", "getCurrent", "()Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Location", "location_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ComposerLocationResponse {
    private final Location current;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;", "", "areaId", "", "fias", "", "countryCode", "uid", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAreaId", "()J", "getFias", "()Ljava/lang/String;", "getCountryCode", "getUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "location_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Location {
        private final long areaId;
        private final String countryCode;
        private final String fias;
        private final String uid;

        public Location(long j11, String str, String str2, @i(name = "UID") String str3) {
            this.areaId = j11;
            this.fias = str;
            this.countryCode = str2;
            this.uid = str3;
        }

        public static /* synthetic */ Location copy$default(Location location, long j11, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = location.areaId;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                str = location.fias;
            }
            String str4 = str;
            if ((i11 & 4) != 0) {
                str2 = location.countryCode;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                str3 = location.uid;
            }
            return location.copy(j12, str4, str5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAreaId() {
            return this.areaId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFias() {
            return this.fias;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final Location copy(long areaId, String fias, String countryCode, @i(name = "UID") String uid) {
            return new Location(areaId, fias, countryCode, uid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return this.areaId == location.areaId && Intrinsics.d(this.fias, location.fias) && Intrinsics.d(this.countryCode, location.countryCode) && Intrinsics.d(this.uid, location.uid);
        }

        public final long getAreaId() {
            return this.areaId;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getFias() {
            return this.fias;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.areaId) * 31;
            String str = this.fias;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.countryCode;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uid;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.areaId;
            String str = this.fias;
            String str2 = this.countryCode;
            String str3 = this.uid;
            StringBuilder c11 = C2436a.c(j11, "Location(areaId=", ", fias=", str);
            a.h(c11, ", countryCode=", str2, ", uid=", str3);
            c11.append(")");
            return c11.toString();
        }
    }

    public ComposerLocationResponse(Location location) {
        this.current = location;
    }

    public static /* synthetic */ ComposerLocationResponse copy$default(ComposerLocationResponse composerLocationResponse, Location location, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            location = composerLocationResponse.current;
        }
        return composerLocationResponse.copy(location);
    }

    /* renamed from: component1, reason: from getter */
    public final Location getCurrent() {
        return this.current;
    }

    @NotNull
    public final ComposerLocationResponse copy(Location current) {
        return new ComposerLocationResponse(current);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComposerLocationResponse) && Intrinsics.d(this.current, ((ComposerLocationResponse) other).current);
    }

    public final Location getCurrent() {
        return this.current;
    }

    public int hashCode() {
        Location location = this.current;
        if (location == null) {
            return 0;
        }
        return location.hashCode();
    }

    @NotNull
    public String toString() {
        return "ComposerLocationResponse(current=" + this.current + ")";
    }
}
