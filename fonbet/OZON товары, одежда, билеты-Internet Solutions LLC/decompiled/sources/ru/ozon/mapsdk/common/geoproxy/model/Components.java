package ru.ozon.mapsdk.common.geoproxy.model;

import B0.A0;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0007/012345BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003JY\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components;", "", "country", "Lru/ozon/mapsdk/common/geoproxy/model/Components$Country;", "region", "Lru/ozon/mapsdk/common/geoproxy/model/Components$Region;", "district", "Lru/ozon/mapsdk/common/geoproxy/model/Components$District;", "city", "Lru/ozon/mapsdk/common/geoproxy/model/Components$City;", "settlement", "Lru/ozon/mapsdk/common/geoproxy/model/Components$Settlement;", "street", "Lru/ozon/mapsdk/common/geoproxy/model/Components$Street;", "house", "Lru/ozon/mapsdk/common/geoproxy/model/Components$House;", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/model/Components$Country;Lru/ozon/mapsdk/common/geoproxy/model/Components$Region;Lru/ozon/mapsdk/common/geoproxy/model/Components$District;Lru/ozon/mapsdk/common/geoproxy/model/Components$City;Lru/ozon/mapsdk/common/geoproxy/model/Components$Settlement;Lru/ozon/mapsdk/common/geoproxy/model/Components$Street;Lru/ozon/mapsdk/common/geoproxy/model/Components$House;)V", "getCountry", "()Lru/ozon/mapsdk/common/geoproxy/model/Components$Country;", "getRegion", "()Lru/ozon/mapsdk/common/geoproxy/model/Components$Region;", "getDistrict", "()Lru/ozon/mapsdk/common/geoproxy/model/Components$District;", "getCity", "()Lru/ozon/mapsdk/common/geoproxy/model/Components$City;", "getSettlement", "()Lru/ozon/mapsdk/common/geoproxy/model/Components$Settlement;", "getStreet", "()Lru/ozon/mapsdk/common/geoproxy/model/Components$Street;", "getHouse", "()Lru/ozon/mapsdk/common/geoproxy/model/Components$House;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "City", "Country", "District", "House", "Region", "Settlement", "Street", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Components {
    private final City city;
    private final Country country;
    private final District district;

    @NotNull
    private final House house;
    private final Region region;
    private final Settlement settlement;

    @NotNull
    private final Street street;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components$City;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class City {

        @NotNull
        private final String name;

        @NotNull
        private final String uid;

        public City(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            this.name = name;
            this.uid = uid;
        }

        public static /* synthetic */ City copy$default(City city, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = city.name;
            }
            if ((i11 & 2) != 0) {
                str2 = city.uid;
            }
            return city.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final City copy(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            return new City(name, uid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof City)) {
                return false;
            }
            City city = (City) other;
            return Intrinsics.d(this.name, city.name) && Intrinsics.d(this.uid, city.uid);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            return this.uid.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("City(name=", this.name, ", uid=", this.uid, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components$Country;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Country {

        @NotNull
        private final String name;

        @NotNull
        private final String uid;

        public Country(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            this.name = name;
            this.uid = uid;
        }

        public static /* synthetic */ Country copy$default(Country country, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = country.name;
            }
            if ((i11 & 2) != 0) {
                str2 = country.uid;
            }
            return country.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final Country copy(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            return new Country(name, uid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Country)) {
                return false;
            }
            Country country = (Country) other;
            return Intrinsics.d(this.name, country.name) && Intrinsics.d(this.uid, country.uid);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            return this.uid.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Country(name=", this.name, ", uid=", this.uid, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components$District;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class District {

        @NotNull
        private final String name;

        @NotNull
        private final String uid;

        public District(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            this.name = name;
            this.uid = uid;
        }

        public static /* synthetic */ District copy$default(District district, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = district.name;
            }
            if ((i11 & 2) != 0) {
                str2 = district.uid;
            }
            return district.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final District copy(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            return new District(name, uid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof District)) {
                return false;
            }
            District district = (District) other;
            return Intrinsics.d(this.name, district.name) && Intrinsics.d(this.uid, district.uid);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            return this.uid.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("District(name=", this.name, ", uid=", this.uid, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components$House;", "", "number", "", "<init>", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class House {

        @NotNull
        private final String number;

        public House(@NotNull String number) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
        }

        public static /* synthetic */ House copy$default(House house, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = house.number;
            }
            return house.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        public final House copy(@NotNull String number) {
            Intrinsics.checkNotNullParameter(number, "number");
            return new House(number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof House) && Intrinsics.d(this.number, ((House) other).number);
        }

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        public int hashCode() {
            return this.number.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("House(number=", this.number, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components$Region;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Region {

        @NotNull
        private final String name;

        @NotNull
        private final String uid;

        public Region(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            this.name = name;
            this.uid = uid;
        }

        public static /* synthetic */ Region copy$default(Region region, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = region.name;
            }
            if ((i11 & 2) != 0) {
                str2 = region.uid;
            }
            return region.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final Region copy(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            return new Region(name, uid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Region)) {
                return false;
            }
            Region region = (Region) other;
            return Intrinsics.d(this.name, region.name) && Intrinsics.d(this.uid, region.uid);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            return this.uid.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Region(name=", this.name, ", uid=", this.uid, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components$Settlement;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settlement {

        @NotNull
        private final String name;

        @NotNull
        private final String uid;

        public Settlement(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            this.name = name;
            this.uid = uid;
        }

        public static /* synthetic */ Settlement copy$default(Settlement settlement, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = settlement.name;
            }
            if ((i11 & 2) != 0) {
                str2 = settlement.uid;
            }
            return settlement.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @NotNull
        public final Settlement copy(@NotNull String name, @NotNull String uid) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uid, "uid");
            return new Settlement(name, uid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settlement)) {
                return false;
            }
            Settlement settlement = (Settlement) other;
            return Intrinsics.d(this.name, settlement.name) && Intrinsics.d(this.uid, settlement.uid);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            return this.uid.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Settlement(name=", this.name, ", uid=", this.uid, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/Components$Street;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Street {

        @NotNull
        private final String name;

        public Street(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public static /* synthetic */ Street copy$default(Street street, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = street.name;
            }
            return street.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Street copy(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Street(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Street) && Intrinsics.d(this.name, ((Street) other).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Street(name=", this.name, ")");
        }
    }

    public Components(Country country, Region region, District district, City city, Settlement settlement, @NotNull Street street, @NotNull House house) {
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(house, "house");
        this.country = country;
        this.region = region;
        this.district = district;
        this.city = city;
        this.settlement = settlement;
        this.street = street;
        this.house = house;
    }

    public static /* synthetic */ Components copy$default(Components components, Country country, Region region, District district, City city, Settlement settlement, Street street, House house, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            country = components.country;
        }
        if ((i11 & 2) != 0) {
            region = components.region;
        }
        if ((i11 & 4) != 0) {
            district = components.district;
        }
        if ((i11 & 8) != 0) {
            city = components.city;
        }
        if ((i11 & 16) != 0) {
            settlement = components.settlement;
        }
        if ((i11 & 32) != 0) {
            street = components.street;
        }
        if ((i11 & 64) != 0) {
            house = components.house;
        }
        Street street2 = street;
        House house2 = house;
        Settlement settlement2 = settlement;
        District district2 = district;
        return components.copy(country, region, district2, city, settlement2, street2, house2);
    }

    /* renamed from: component1, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    /* renamed from: component2, reason: from getter */
    public final Region getRegion() {
        return this.region;
    }

    /* renamed from: component3, reason: from getter */
    public final District getDistrict() {
        return this.district;
    }

    /* renamed from: component4, reason: from getter */
    public final City getCity() {
        return this.city;
    }

    /* renamed from: component5, reason: from getter */
    public final Settlement getSettlement() {
        return this.settlement;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Street getStreet() {
        return this.street;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final House getHouse() {
        return this.house;
    }

    @NotNull
    public final Components copy(Country country, Region region, District district, City city, Settlement settlement, @NotNull Street street, @NotNull House house) {
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(house, "house");
        return new Components(country, region, district, city, settlement, street, house);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Components)) {
            return false;
        }
        Components components = (Components) other;
        return Intrinsics.d(this.country, components.country) && Intrinsics.d(this.region, components.region) && Intrinsics.d(this.district, components.district) && Intrinsics.d(this.city, components.city) && Intrinsics.d(this.settlement, components.settlement) && Intrinsics.d(this.street, components.street) && Intrinsics.d(this.house, components.house);
    }

    public final City getCity() {
        return this.city;
    }

    public final Country getCountry() {
        return this.country;
    }

    public final District getDistrict() {
        return this.district;
    }

    @NotNull
    public final House getHouse() {
        return this.house;
    }

    public final Region getRegion() {
        return this.region;
    }

    public final Settlement getSettlement() {
        return this.settlement;
    }

    @NotNull
    public final Street getStreet() {
        return this.street;
    }

    public int hashCode() {
        Country country = this.country;
        int hashCode = (country == null ? 0 : country.hashCode()) * 31;
        Region region = this.region;
        int hashCode2 = (hashCode + (region == null ? 0 : region.hashCode())) * 31;
        District district = this.district;
        int hashCode3 = (hashCode2 + (district == null ? 0 : district.hashCode())) * 31;
        City city = this.city;
        int hashCode4 = (hashCode3 + (city == null ? 0 : city.hashCode())) * 31;
        Settlement settlement = this.settlement;
        return this.house.hashCode() + ((this.street.hashCode() + ((hashCode4 + (settlement != null ? settlement.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Components(country=" + this.country + ", region=" + this.region + ", district=" + this.district + ", city=" + this.city + ", settlement=" + this.settlement + ", street=" + this.street + ", house=" + this.house + ")";
    }
}
