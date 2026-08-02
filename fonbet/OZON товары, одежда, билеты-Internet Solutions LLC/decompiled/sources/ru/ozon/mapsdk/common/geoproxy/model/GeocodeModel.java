package ru.ozon.mapsdk.common.geoproxy.model;

import G.g;
import I0.C3173b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import we0.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel;", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Address;", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Address;)V", "getAddress", "()Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Address;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Address", "Geometry", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GeocodeModel {

    @NotNull
    private final Address address;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Address;", "", "components", "Lru/ozon/mapsdk/common/geoproxy/model/Components;", "fullText", "", "geometry", "Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Geometry;", "postalCode", "source", "timezone", "<init>", "(Lru/ozon/mapsdk/common/geoproxy/model/Components;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Geometry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComponents", "()Lru/ozon/mapsdk/common/geoproxy/model/Components;", "getFullText", "()Ljava/lang/String;", "getGeometry", "()Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Geometry;", "getPostalCode", "getSource", "getTimezone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Address {

        @NotNull
        private final Components components;

        @NotNull
        private final String fullText;

        @NotNull
        private final Geometry geometry;

        @NotNull
        private final String postalCode;

        @NotNull
        private final String source;

        @NotNull
        private final String timezone;

        public Address(@NotNull Components components, @NotNull String fullText, @NotNull Geometry geometry, @NotNull String postalCode, @NotNull String source, @NotNull String timezone) {
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(fullText, "fullText");
            Intrinsics.checkNotNullParameter(geometry, "geometry");
            Intrinsics.checkNotNullParameter(postalCode, "postalCode");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            this.components = components;
            this.fullText = fullText;
            this.geometry = geometry;
            this.postalCode = postalCode;
            this.source = source;
            this.timezone = timezone;
        }

        public static /* synthetic */ Address copy$default(Address address, Components components, String str, Geometry geometry, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                components = address.components;
            }
            if ((i11 & 2) != 0) {
                str = address.fullText;
            }
            if ((i11 & 4) != 0) {
                geometry = address.geometry;
            }
            if ((i11 & 8) != 0) {
                str2 = address.postalCode;
            }
            if ((i11 & 16) != 0) {
                str3 = address.source;
            }
            if ((i11 & 32) != 0) {
                str4 = address.timezone;
            }
            String str5 = str3;
            String str6 = str4;
            return address.copy(components, str, geometry, str2, str5, str6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Components getComponents() {
            return this.components;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getFullText() {
            return this.fullText;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Geometry getGeometry() {
            return this.geometry;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        @NotNull
        public final Address copy(@NotNull Components components, @NotNull String fullText, @NotNull Geometry geometry, @NotNull String postalCode, @NotNull String source, @NotNull String timezone) {
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(fullText, "fullText");
            Intrinsics.checkNotNullParameter(geometry, "geometry");
            Intrinsics.checkNotNullParameter(postalCode, "postalCode");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            return new Address(components, fullText, geometry, postalCode, source, timezone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Address)) {
                return false;
            }
            Address address = (Address) other;
            return Intrinsics.d(this.components, address.components) && Intrinsics.d(this.fullText, address.fullText) && Intrinsics.d(this.geometry, address.geometry) && Intrinsics.d(this.postalCode, address.postalCode) && Intrinsics.d(this.source, address.source) && Intrinsics.d(this.timezone, address.timezone);
        }

        @NotNull
        public final Components getComponents() {
            return this.components;
        }

        @NotNull
        public final String getFullText() {
            return this.fullText;
        }

        @NotNull
        public final Geometry getGeometry() {
            return this.geometry;
        }

        @NotNull
        public final String getPostalCode() {
            return this.postalCode;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        @NotNull
        public final String getTimezone() {
            return this.timezone;
        }

        public int hashCode() {
            return this.timezone.hashCode() + g.a(g.a((this.geometry.hashCode() + g.a(this.components.hashCode() * 31, 31, this.fullText)) * 31, 31, this.postalCode), 31, this.source);
        }

        @NotNull
        public String toString() {
            Components components = this.components;
            String str = this.fullText;
            Geometry geometry = this.geometry;
            String str2 = this.postalCode;
            String str3 = this.source;
            String str4 = this.timezone;
            StringBuilder sb2 = new StringBuilder("Address(components=");
            sb2.append(components);
            sb2.append(", fullText=");
            sb2.append(str);
            sb2.append(", geometry=");
            sb2.append(geometry);
            sb2.append(", postalCode=");
            sb2.append(str2);
            sb2.append(", source=");
            return C3173b.c(sb2, str3, ", timezone=", str4, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t¨\u0006\u001c"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Geometry;", "", "Lwe0/m;", "point", "leftLowerCorner", "rightUpperCorner", "<init>", "(Lwe0/m;Lwe0/m;Lwe0/m;)V", "component1", "()Lwe0/m;", "component2", "component3", "copy", "(Lwe0/m;Lwe0/m;Lwe0/m;)Lru/ozon/mapsdk/common/geoproxy/model/GeocodeModel$Geometry;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwe0/m;", "getPoint", "getLeftLowerCorner", "getRightUpperCorner", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Geometry {

        @NotNull
        private final m leftLowerCorner;

        @NotNull
        private final m point;

        @NotNull
        private final m rightUpperCorner;

        public Geometry(@NotNull m point, @NotNull m leftLowerCorner, @NotNull m rightUpperCorner) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(leftLowerCorner, "leftLowerCorner");
            Intrinsics.checkNotNullParameter(rightUpperCorner, "rightUpperCorner");
            this.point = point;
            this.leftLowerCorner = leftLowerCorner;
            this.rightUpperCorner = rightUpperCorner;
        }

        public static /* synthetic */ Geometry copy$default(Geometry geometry, m mVar, m mVar2, m mVar3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mVar = geometry.point;
            }
            if ((i11 & 2) != 0) {
                mVar2 = geometry.leftLowerCorner;
            }
            if ((i11 & 4) != 0) {
                mVar3 = geometry.rightUpperCorner;
            }
            return geometry.copy(mVar, mVar2, mVar3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final m getPoint() {
            return this.point;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final m getLeftLowerCorner() {
            return this.leftLowerCorner;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final m getRightUpperCorner() {
            return this.rightUpperCorner;
        }

        @NotNull
        public final Geometry copy(@NotNull m point, @NotNull m leftLowerCorner, @NotNull m rightUpperCorner) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(leftLowerCorner, "leftLowerCorner");
            Intrinsics.checkNotNullParameter(rightUpperCorner, "rightUpperCorner");
            return new Geometry(point, leftLowerCorner, rightUpperCorner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Geometry)) {
                return false;
            }
            Geometry geometry = (Geometry) other;
            return Intrinsics.d(this.point, geometry.point) && Intrinsics.d(this.leftLowerCorner, geometry.leftLowerCorner) && Intrinsics.d(this.rightUpperCorner, geometry.rightUpperCorner);
        }

        @NotNull
        public final m getLeftLowerCorner() {
            return this.leftLowerCorner;
        }

        @NotNull
        public final m getPoint() {
            return this.point;
        }

        @NotNull
        public final m getRightUpperCorner() {
            return this.rightUpperCorner;
        }

        public int hashCode() {
            return this.rightUpperCorner.hashCode() + ((this.leftLowerCorner.hashCode() + (this.point.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Geometry(point=" + this.point + ", leftLowerCorner=" + this.leftLowerCorner + ", rightUpperCorner=" + this.rightUpperCorner + ")";
        }
    }

    public GeocodeModel(@NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.address = address;
    }

    public static /* synthetic */ GeocodeModel copy$default(GeocodeModel geocodeModel, Address address, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            address = geocodeModel.address;
        }
        return geocodeModel.copy(address);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final GeocodeModel copy(@NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new GeocodeModel(address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GeocodeModel) && Intrinsics.d(this.address, ((GeocodeModel) other).address);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    @NotNull
    public String toString() {
        return "GeocodeModel(address=" + this.address + ")";
    }
}
