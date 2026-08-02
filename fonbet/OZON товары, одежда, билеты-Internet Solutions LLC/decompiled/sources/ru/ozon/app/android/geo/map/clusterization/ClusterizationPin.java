package ru.ozon.app.android.geo.map.clusterization;

import B0.C2454a;
import B90.C2619v;
import C.o0;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import V.e;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001:\u0004BCDEBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b3\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b:\u0010,R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;", "", "", "id", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$Coordinates;", "coordinates", "", "zPriority", "", "providerId", "", "isClickEnabled", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$AdditionalPinContent;", "additionalContent", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$CustomPinStyle;", "customStyle", "image", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$PinStyleType;", "pinStyleType", "pinsCount", "haveSelectedState", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$Coordinates;FIZLru/ozon/app/android/geo/map/clusterization/ClusterizationPin$AdditionalPinContent;Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$CustomPinStyle;Ljava/lang/String;Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$PinStyleType;Ljava/lang/Integer;Z)V", "", "configureMetaData", "()V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$Coordinates;", "getCoordinates", "()Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$Coordinates;", "F", "getZPriority", "()F", "I", "getProviderId", "Z", "()Z", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$AdditionalPinContent;", "getAdditionalContent", "()Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$AdditionalPinContent;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$CustomPinStyle;", "getCustomStyle", "()Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$CustomPinStyle;", "getImage", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$PinStyleType;", "getPinStyleType", "()Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$PinStyleType;", "Ljava/lang/Integer;", "getPinsCount", "()Ljava/lang/Integer;", "getHaveSelectedState", "Lru/ozon/app/android/geo/map/clusterization/PinMetadata;", "pinMetadata", "Lru/ozon/app/android/geo/map/clusterization/PinMetadata;", "getPinMetadata", "()Lru/ozon/app/android/geo/map/clusterization/PinMetadata;", "setPinMetadata", "(Lru/ozon/app/android/geo/map/clusterization/PinMetadata;)V", "PinStyleType", "Coordinates", "CustomPinStyle", "AdditionalPinContent", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClusterizationPin {
    private final AdditionalPinContent additionalContent;

    @NotNull
    private final Coordinates coordinates;
    private final CustomPinStyle customStyle;
    private final boolean haveSelectedState;

    @NotNull
    private final String id;
    private final String image;
    private final boolean isClickEnabled;

    @NotNull
    private PinMetadata pinMetadata;

    @NotNull
    private final PinStyleType pinStyleType;
    private final Integer pinsCount;
    private final int providerId;
    private final float zPriority;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$AdditionalPinContent;", "", "", "text", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getIcon", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalPinContent {
        private final String icon;
        private final String text;

        public AdditionalPinContent(String str, String str2) {
            this.text = str;
            this.icon = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalPinContent)) {
                return false;
            }
            AdditionalPinContent additionalPinContent = (AdditionalPinContent) other;
            return Intrinsics.d(this.text, additionalPinContent.text) && Intrinsics.d(this.icon, additionalPinContent.icon);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.icon;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("AdditionalPinContent(text=", this.text, ", icon=", this.icon, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$Coordinates;", "", "", "latitude", "longitude", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLatitude", "()D", "getLongitude", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Coordinates {
        private final double latitude;
        private final double longitude;

        public Coordinates(double d11, double d12) {
            this.latitude = d11;
            this.longitude = d12;
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
            return C2619v.c(Cm.e.e(d11, "Coordinates(latitude=", ", longitude="), this.longitude, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$CustomPinStyle;", "", "", "tintColor", "textColor", "iconTintColor", "borderColor", "pinsCountColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTintColor", "getTextColor", "getIconTintColor", "getBorderColor", "getPinsCountColor", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomPinStyle {
        private final String borderColor;
        private final String iconTintColor;
        private final String pinsCountColor;
        private final String textColor;
        private final String tintColor;

        public CustomPinStyle(String str, String str2, String str3, String str4, String str5) {
            this.tintColor = str;
            this.textColor = str2;
            this.iconTintColor = str3;
            this.borderColor = str4;
            this.pinsCountColor = str5;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomPinStyle)) {
                return false;
            }
            CustomPinStyle customPinStyle = (CustomPinStyle) other;
            return Intrinsics.d(this.tintColor, customPinStyle.tintColor) && Intrinsics.d(this.textColor, customPinStyle.textColor) && Intrinsics.d(this.iconTintColor, customPinStyle.iconTintColor) && Intrinsics.d(this.borderColor, customPinStyle.borderColor) && Intrinsics.d(this.pinsCountColor, customPinStyle.pinsCountColor);
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        public final String getPinsCountColor() {
            return this.pinsCountColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            String str = this.tintColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.textColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconTintColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.borderColor;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pinsCountColor;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.tintColor;
            String str2 = this.textColor;
            String str3 = this.iconTintColor;
            String str4 = this.borderColor;
            String str5 = this.pinsCountColor;
            StringBuilder d11 = C3660k.d("CustomPinStyle(tintColor=", str, ", textColor=", str2, ", iconTintColor=");
            a.h(d11, str3, ", borderColor=", str4, ", pinsCountColor=");
            return o0.c(d11, str5, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$PinStyleType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PinStyleType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ PinStyleType[] $VALUES;
        public static final PinStyleType DEFAULT = new PinStyleType("DEFAULT", 0);

        private static final /* synthetic */ PinStyleType[] $values() {
            return new PinStyleType[]{DEFAULT};
        }

        static {
            PinStyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PinStyleType(String str, int i11) {
        }

        public static PinStyleType valueOf(String str) {
            return (PinStyleType) Enum.valueOf(PinStyleType.class, str);
        }

        public static PinStyleType[] values() {
            return (PinStyleType[]) $VALUES.clone();
        }
    }

    public ClusterizationPin(@NotNull String id2, @NotNull Coordinates coordinates, float f7, int i11, boolean z11, AdditionalPinContent additionalPinContent, CustomPinStyle customPinStyle, String str, @NotNull PinStyleType pinStyleType, Integer num, boolean z12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(pinStyleType, "pinStyleType");
        this.id = id2;
        this.coordinates = coordinates;
        this.zPriority = f7;
        this.providerId = i11;
        this.isClickEnabled = z11;
        this.additionalContent = additionalPinContent;
        this.customStyle = customPinStyle;
        this.image = str;
        this.pinStyleType = pinStyleType;
        this.pinsCount = num;
        this.haveSelectedState = z12;
        this.pinMetadata = new PinMetadata(null, 0, 0, null, false, 31, null);
    }

    public final void configureMetaData() {
        this.pinMetadata = new PinMetadata(null, Objects.hash(this.additionalContent, this.customStyle, this.image, this.pinStyleType, this.pinsCount), Objects.hash(this.customStyle, this.image, this.pinStyleType, this.pinsCount, Boolean.valueOf(this.haveSelectedState)), null, this.pinsCount != null, 9, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClusterizationPin)) {
            return false;
        }
        ClusterizationPin clusterizationPin = (ClusterizationPin) other;
        return Intrinsics.d(this.id, clusterizationPin.id) && Intrinsics.d(this.coordinates, clusterizationPin.coordinates) && Float.compare(this.zPriority, clusterizationPin.zPriority) == 0 && this.providerId == clusterizationPin.providerId && this.isClickEnabled == clusterizationPin.isClickEnabled && Intrinsics.d(this.additionalContent, clusterizationPin.additionalContent) && Intrinsics.d(this.customStyle, clusterizationPin.customStyle) && Intrinsics.d(this.image, clusterizationPin.image) && this.pinStyleType == clusterizationPin.pinStyleType && Intrinsics.d(this.pinsCount, clusterizationPin.pinsCount) && this.haveSelectedState == clusterizationPin.haveSelectedState;
    }

    public final AdditionalPinContent getAdditionalContent() {
        return this.additionalContent;
    }

    @NotNull
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    public final CustomPinStyle getCustomStyle() {
        return this.customStyle;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final PinMetadata getPinMetadata() {
        return this.pinMetadata;
    }

    public final Integer getPinsCount() {
        return this.pinsCount;
    }

    public final float getZPriority() {
        return this.zPriority;
    }

    public int hashCode() {
        int a11 = C3532b.a(C2454a.a(this.providerId, Pk0.b.a(this.zPriority, (this.coordinates.hashCode() + (this.id.hashCode() * 31)) * 31, 31), 31), 31, this.isClickEnabled);
        AdditionalPinContent additionalPinContent = this.additionalContent;
        int hashCode = (a11 + (additionalPinContent == null ? 0 : additionalPinContent.hashCode())) * 31;
        CustomPinStyle customPinStyle = this.customStyle;
        int hashCode2 = (hashCode + (customPinStyle == null ? 0 : customPinStyle.hashCode())) * 31;
        String str = this.image;
        int hashCode3 = (this.pinStyleType.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.pinsCount;
        return Boolean.hashCode(this.haveSelectedState) + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Coordinates coordinates = this.coordinates;
        float f7 = this.zPriority;
        int i11 = this.providerId;
        boolean z11 = this.isClickEnabled;
        AdditionalPinContent additionalPinContent = this.additionalContent;
        CustomPinStyle customPinStyle = this.customStyle;
        String str2 = this.image;
        PinStyleType pinStyleType = this.pinStyleType;
        Integer num = this.pinsCount;
        boolean z12 = this.haveSelectedState;
        StringBuilder sb2 = new StringBuilder("ClusterizationPin(id=");
        sb2.append(str);
        sb2.append(", coordinates=");
        sb2.append(coordinates);
        sb2.append(", zPriority=");
        sb2.append(f7);
        sb2.append(", providerId=");
        sb2.append(i11);
        sb2.append(", isClickEnabled=");
        sb2.append(z11);
        sb2.append(", additionalContent=");
        sb2.append(additionalPinContent);
        sb2.append(", customStyle=");
        sb2.append(customPinStyle);
        sb2.append(", image=");
        sb2.append(str2);
        sb2.append(", pinStyleType=");
        sb2.append(pinStyleType);
        sb2.append(", pinsCount=");
        sb2.append(num);
        sb2.append(", haveSelectedState=");
        return Pk0.a.a(")", sb2, z12);
    }

    public /* synthetic */ ClusterizationPin(String str, Coordinates coordinates, float f7, int i11, boolean z11, AdditionalPinContent additionalPinContent, CustomPinStyle customPinStyle, String str2, PinStyleType pinStyleType, Integer num, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, coordinates, f7, i11, z11, additionalPinContent, customPinStyle, str2, pinStyleType, num, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z12);
    }
}
