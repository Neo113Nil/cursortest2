package io.radar.sdk.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarAddress.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b(\u0018\u0000 H2\u00020\u0001:\u0002HIB½\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"¢\u0006\u0002\u0010#J\u0006\u0010G\u001a\u00020\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001b\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010%¨\u0006J"}, d2 = {"Lio/radar/sdk/model/RadarAddress;", "", "coordinate", "Lio/radar/sdk/model/RadarCoordinate;", RadarAddress.FIELD_FORMATTED_ADDRESS, "", "country", "countryCode", RadarAddress.FIELD_COUNTRY_FLAG, "dma", RadarAddress.FIELD_DMA_CODE, "state", RadarAddress.FIELD_STATE_CODE, "postalCode", "city", RadarAddress.FIELD_BOROUGH, RadarAddress.FIELD_COUNTY, RadarAddress.FIELD_NEIGHBORHOOD, RadarAddress.FIELD_STREET, "number", RadarAddress.FIELD_ADDRESS_LABEL, RadarAddress.FIELD_PLACE_LABEL, "unit", RadarAddress.FIELD_PLUS4, RadarAddress.FIELD_DISTANCE, "", RadarAddress.FIELD_LAYER, "metadata", "Lorg/json/JSONObject;", RadarAddress.FIELD_CONFIDENCE, "Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", "timeZone", "Lio/radar/sdk/model/RadarTimeZone;", RadarAddress.FIELD_CATEGORIES, "", "(Lio/radar/sdk/model/RadarCoordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;Lio/radar/sdk/model/RadarTimeZone;[Ljava/lang/String;)V", "getAddressLabel", "()Ljava/lang/String;", "getBorough", "getCategories", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getCity", "getConfidence", "()Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", "getCoordinate", "()Lio/radar/sdk/model/RadarCoordinate;", "getCountry", "getCountryCode", "getCountryFlag", "getCounty", "getDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDma", "getDmaCode", "getFormattedAddress", "getLayer", "getMetadata", "()Lorg/json/JSONObject;", "getNeighborhood", "getNumber", "getPlaceLabel", "getPlus4", "getPostalCode", "getState", "getStateCode", "getStreet", "getTimeZone", "()Lio/radar/sdk/model/RadarTimeZone;", "getUnit", "toJson", "Companion", "RadarAddressConfidence", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarAddress {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_ADDRESS_LABEL = "addressLabel";
    private static final String FIELD_BOROUGH = "borough";
    private static final String FIELD_CATEGORIES = "categories";
    private static final String FIELD_CITY = "city";
    private static final String FIELD_CONFIDENCE = "confidence";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_COUNTRY_CODE = "countryCode";
    private static final String FIELD_COUNTRY_FLAG = "countryFlag";
    private static final String FIELD_COUNTY = "county";
    private static final String FIELD_DISTANCE = "distance";
    private static final String FIELD_DMA = "dma";
    private static final String FIELD_DMA_CODE = "dmaCode";
    private static final String FIELD_FORMATTED_ADDRESS = "formattedAddress";
    private static final String FIELD_LATITUDE = "latitude";
    private static final String FIELD_LAYER = "layer";
    private static final String FIELD_LONGITUDE = "longitude";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_NEIGHBORHOOD = "neighborhood";
    private static final String FIELD_NUMBER = "number";
    private static final String FIELD_PLACE_LABEL = "placeLabel";
    private static final String FIELD_PLUS4 = "plus4";
    private static final String FIELD_POSTAL_CODE = "postalCode";
    private static final String FIELD_STATE = "state";
    private static final String FIELD_STATE_CODE = "stateCode";
    private static final String FIELD_STREET = "street";
    private static final String FIELD_TIME_ZONE = "timeZone";
    private static final String FIELD_UNIT = "unit";
    private final String addressLabel;
    private final String borough;
    private final String[] categories;
    private final String city;
    private final RadarAddressConfidence confidence;
    private final RadarCoordinate coordinate;
    private final String country;
    private final String countryCode;
    private final String countryFlag;
    private final String county;
    private final Integer distance;
    private final String dma;
    private final String dmaCode;
    private final String formattedAddress;
    private final String layer;
    private final JSONObject metadata;
    private final String neighborhood;
    private final String number;
    private final String placeLabel;
    private final String plus4;
    private final String postalCode;
    private final String state;
    private final String stateCode;
    private final String street;
    private final RadarTimeZone timeZone;
    private final String unit;

    @JvmStatic
    public static final RadarAddress fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarAddress[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    @JvmStatic
    public static final String stringForConfidence(RadarAddressConfidence radarAddressConfidence) {
        return INSTANCE.stringForConfidence(radarAddressConfidence);
    }

    @JvmStatic
    public static final JSONArray toJson(RadarAddress[] radarAddressArr) {
        return INSTANCE.toJson(radarAddressArr);
    }

    public RadarAddress(RadarCoordinate coordinate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, JSONObject jSONObject, RadarAddressConfidence confidence, RadarTimeZone radarTimeZone, String[] strArr) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        Intrinsics.checkNotNullParameter(confidence, "confidence");
        this.coordinate = coordinate;
        this.formattedAddress = str;
        this.country = str2;
        this.countryCode = str3;
        this.countryFlag = str4;
        this.dma = str5;
        this.dmaCode = str6;
        this.state = str7;
        this.stateCode = str8;
        this.postalCode = str9;
        this.city = str10;
        this.borough = str11;
        this.county = str12;
        this.neighborhood = str13;
        this.street = str14;
        this.number = str15;
        this.addressLabel = str16;
        this.placeLabel = str17;
        this.unit = str18;
        this.plus4 = str19;
        this.distance = num;
        this.layer = str20;
        this.metadata = jSONObject;
        this.confidence = confidence;
        this.timeZone = radarTimeZone;
        this.categories = strArr;
    }

    public final RadarCoordinate getCoordinate() {
        return this.coordinate;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryFlag() {
        return this.countryFlag;
    }

    public final String getDma() {
        return this.dma;
    }

    public final String getDmaCode() {
        return this.dmaCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getBorough() {
        return this.borough;
    }

    public final String getCounty() {
        return this.county;
    }

    public final String getNeighborhood() {
        return this.neighborhood;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getAddressLabel() {
        return this.addressLabel;
    }

    public final String getPlaceLabel() {
        return this.placeLabel;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final String getPlus4() {
        return this.plus4;
    }

    public final Integer getDistance() {
        return this.distance;
    }

    public final String getLayer() {
        return this.layer;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public /* synthetic */ RadarAddress(RadarCoordinate radarCoordinate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, JSONObject jSONObject, RadarAddressConfidence radarAddressConfidence, RadarTimeZone radarTimeZone, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(radarCoordinate, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : num, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : jSONObject, (i & 8388608) != 0 ? RadarAddressConfidence.NONE : radarAddressConfidence, (i & 16777216) != 0 ? null : radarTimeZone, (i & 33554432) != 0 ? null : strArr);
    }

    public final RadarAddressConfidence getConfidence() {
        return this.confidence;
    }

    public final RadarTimeZone getTimeZone() {
        return this.timeZone;
    }

    public final String[] getCategories() {
        return this.categories;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarAddress.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", "", "(Ljava/lang/String;I)V", "EXACT", "INTERPOLATED", "FALLBACK", "NONE", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarAddressConfidence {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarAddressConfidence[] $VALUES;
        public static final RadarAddressConfidence EXACT = new RadarAddressConfidence("EXACT", 0);
        public static final RadarAddressConfidence INTERPOLATED = new RadarAddressConfidence("INTERPOLATED", 1);
        public static final RadarAddressConfidence FALLBACK = new RadarAddressConfidence("FALLBACK", 2);
        public static final RadarAddressConfidence NONE = new RadarAddressConfidence("NONE", 3);

        private static final /* synthetic */ RadarAddressConfidence[] $values() {
            return new RadarAddressConfidence[]{EXACT, INTERPOLATED, FALLBACK, NONE};
        }

        public static EnumEntries<RadarAddressConfidence> getEntries() {
            return $ENTRIES;
        }

        public static RadarAddressConfidence valueOf(String str) {
            return (RadarAddressConfidence) Enum.valueOf(RadarAddressConfidence.class, str);
        }

        public static RadarAddressConfidence[] values() {
            return (RadarAddressConfidence[]) $VALUES.clone();
        }

        private RadarAddressConfidence(String str, int i) {
        }

        static {
            RadarAddressConfidence[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: RadarAddress.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0002\u0010$J\u0014\u0010\u001f\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0007J\u001f\u0010*\u001a\u0004\u0018\u00010#2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0007¢\u0006\u0002\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lio/radar/sdk/model/RadarAddress$Companion;", "", "()V", "FIELD_ADDRESS_LABEL", "", "FIELD_BOROUGH", "FIELD_CATEGORIES", "FIELD_CITY", "FIELD_CONFIDENCE", "FIELD_COUNTRY", "FIELD_COUNTRY_CODE", "FIELD_COUNTRY_FLAG", "FIELD_COUNTY", "FIELD_DISTANCE", "FIELD_DMA", "FIELD_DMA_CODE", "FIELD_FORMATTED_ADDRESS", "FIELD_LATITUDE", "FIELD_LAYER", "FIELD_LONGITUDE", "FIELD_METADATA", "FIELD_NEIGHBORHOOD", "FIELD_NUMBER", "FIELD_PLACE_LABEL", "FIELD_PLUS4", "FIELD_POSTAL_CODE", "FIELD_STATE", "FIELD_STATE_CODE", "FIELD_STREET", "FIELD_TIME_ZONE", "FIELD_UNIT", "fromJson", "", "Lio/radar/sdk/model/RadarAddress;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarAddress;", "obj", "Lorg/json/JSONObject;", "stringForConfidence", RadarAddress.FIELD_CONFIDENCE, "Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", "toJson", "addresses", "([Lio/radar/sdk/model/RadarAddress;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: RadarAddress.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarAddressConfidence.values().length];
                try {
                    iArr[RadarAddressConfidence.EXACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarAddressConfidence.INTERPOLATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarAddressConfidence.FALLBACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01b4  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarAddress fromJson(JSONObject obj) {
            RadarCoordinate radarCoordinate;
            RadarAddressConfidence radarAddressConfidence;
            JSONArray optJSONArray;
            RadarAddressConfidence radarAddressConfidence2;
            RadarTimeZone radarTimeZone;
            String[] strArr;
            if (obj == null) {
                return null;
            }
            RadarCoordinate radarCoordinate2 = new RadarCoordinate(obj.optDouble("latitude"), obj.optDouble("longitude"));
            String optString = obj.optString(RadarAddress.FIELD_FORMATTED_ADDRESS);
            String str = optString == null ? null : optString;
            String optString2 = obj.optString("country");
            String str2 = optString2 == null ? null : optString2;
            String optString3 = obj.optString("countryCode");
            String str3 = optString3 == null ? null : optString3;
            String optString4 = obj.optString(RadarAddress.FIELD_COUNTRY_FLAG);
            String str4 = optString4 == null ? null : optString4;
            String optString5 = obj.optString("dma");
            String str5 = optString5 == null ? null : optString5;
            String optString6 = obj.optString(RadarAddress.FIELD_DMA_CODE);
            String str6 = optString6 == null ? null : optString6;
            String optString7 = obj.optString("state");
            String str7 = optString7 == null ? null : optString7;
            String optString8 = obj.optString(RadarAddress.FIELD_STATE_CODE);
            String str8 = optString8 == null ? null : optString8;
            String optString9 = obj.optString("postalCode");
            String str9 = optString9 == null ? null : optString9;
            String optString10 = obj.optString("city");
            String str10 = optString10 == null ? null : optString10;
            String optString11 = obj.optString(RadarAddress.FIELD_BOROUGH);
            String str11 = optString11 == null ? null : optString11;
            String optString12 = obj.optString(RadarAddress.FIELD_COUNTY);
            String str12 = optString12 == null ? null : optString12;
            String optString13 = obj.optString(RadarAddress.FIELD_NEIGHBORHOOD);
            String str13 = optString13 == null ? null : optString13;
            String optString14 = obj.optString(RadarAddress.FIELD_STREET);
            String str14 = optString14 == null ? null : optString14;
            String optString15 = obj.optString("number");
            String str15 = optString15 == null ? null : optString15;
            String optString16 = obj.optString(RadarAddress.FIELD_ADDRESS_LABEL);
            String str16 = optString16 == null ? null : optString16;
            String optString17 = obj.optString(RadarAddress.FIELD_PLACE_LABEL);
            String str17 = optString17 == null ? null : optString17;
            String optString18 = obj.optString("unit");
            String str18 = optString18 == null ? null : optString18;
            String optString19 = obj.optString(RadarAddress.FIELD_PLUS4);
            String str19 = optString19 == null ? null : optString19;
            int optInt = obj.optInt(RadarAddress.FIELD_DISTANCE);
            String optString20 = obj.optString(RadarAddress.FIELD_LAYER);
            String str20 = optString20 == null ? null : optString20;
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            JSONObject jSONObject = optJSONObject == null ? null : optJSONObject;
            String optString21 = obj.optString(RadarAddress.FIELD_CONFIDENCE);
            if (optString21 != null) {
                int hashCode = optString21.hashCode();
                radarCoordinate = radarCoordinate2;
                if (hashCode != 96946943) {
                    if (hashCode != 761243362) {
                        if (hashCode == 2096252803 && optString21.equals("interpolated")) {
                            radarAddressConfidence = RadarAddressConfidence.INTERPOLATED;
                        }
                    } else if (optString21.equals("fallback")) {
                        radarAddressConfidence = RadarAddressConfidence.FALLBACK;
                    }
                } else if (optString21.equals("exact")) {
                    radarAddressConfidence = RadarAddressConfidence.EXACT;
                }
                RadarTimeZone fromJson = RadarTimeZone.INSTANCE.fromJson(obj.optJSONObject("timeZone"));
                optJSONArray = obj.optJSONArray(RadarAddress.FIELD_CATEGORIES);
                if (optJSONArray == null) {
                    ArrayList arrayList = new ArrayList();
                    radarAddressConfidence2 = radarAddressConfidence;
                    int length = optJSONArray.length();
                    radarTimeZone = fromJson;
                    int i = 0;
                    while (i < length) {
                        int i2 = length;
                        String optString22 = optJSONArray.optString(i);
                        String str21 = optString22;
                        if (str21 != null && str21.length() != 0) {
                            Intrinsics.checkNotNull(optString22);
                            arrayList.add(optString22);
                        }
                        i++;
                        length = i2;
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                } else {
                    radarAddressConfidence2 = radarAddressConfidence;
                    radarTimeZone = fromJson;
                    strArr = null;
                }
                return new RadarAddress(radarCoordinate, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(optInt), str20, jSONObject, radarAddressConfidence2, radarTimeZone, strArr);
            }
            radarCoordinate = radarCoordinate2;
            radarAddressConfidence = RadarAddressConfidence.NONE;
            RadarTimeZone fromJson2 = RadarTimeZone.INSTANCE.fromJson(obj.optJSONObject("timeZone"));
            optJSONArray = obj.optJSONArray(RadarAddress.FIELD_CATEGORIES);
            if (optJSONArray == null) {
            }
            return new RadarAddress(radarCoordinate, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(optInt), str20, jSONObject, radarAddressConfidence2, radarTimeZone, strArr);
        }

        @JvmStatic
        public final RadarAddress[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarAddress[] radarAddressArr = new RadarAddress[length];
            for (int i = 0; i < length; i++) {
                radarAddressArr[i] = RadarAddress.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarAddress[]) ArraysKt.filterNotNull(radarAddressArr).toArray(new RadarAddress[0]);
        }

        @JvmStatic
        public final JSONArray toJson(RadarAddress[] addresses) {
            if (addresses == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarAddress radarAddress : addresses) {
                jSONArray.put(radarAddress.toJson());
            }
            return jSONArray;
        }

        @JvmStatic
        public final String stringForConfidence(RadarAddressConfidence confidence) {
            Intrinsics.checkNotNullParameter(confidence, "confidence");
            int i = WhenMappings.$EnumSwitchMapping$0[confidence.ordinal()];
            if (i == 1) {
                return "exact";
            }
            if (i == 2) {
                return "interpolated";
            }
            if (i == 3) {
                return "fallback";
            }
            return "none";
        }
    }

    public final JSONObject toJson() {
        double latitude = this.coordinate.getLatitude();
        double longitude = this.coordinate.getLongitude();
        if (Double.isNaN(latitude) || Double.isNaN(longitude)) {
            latitude = 0.0d;
            longitude = 0.0d;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("latitude", Double.valueOf(latitude));
        jSONObject.putOpt("longitude", Double.valueOf(longitude));
        jSONObject.putOpt(FIELD_FORMATTED_ADDRESS, this.formattedAddress);
        jSONObject.putOpt("country", this.country);
        jSONObject.putOpt("countryCode", this.countryCode);
        jSONObject.putOpt(FIELD_COUNTRY_FLAG, this.countryFlag);
        jSONObject.putOpt("dma", this.dma);
        jSONObject.putOpt(FIELD_DMA_CODE, this.dmaCode);
        jSONObject.putOpt("state", this.state);
        jSONObject.putOpt(FIELD_STATE_CODE, this.stateCode);
        jSONObject.putOpt("postalCode", this.postalCode);
        jSONObject.putOpt("city", this.city);
        jSONObject.putOpt(FIELD_BOROUGH, this.borough);
        jSONObject.putOpt(FIELD_COUNTY, this.county);
        jSONObject.putOpt(FIELD_NEIGHBORHOOD, this.neighborhood);
        jSONObject.putOpt(FIELD_STREET, this.street);
        jSONObject.putOpt("number", this.number);
        jSONObject.putOpt(FIELD_ADDRESS_LABEL, this.addressLabel);
        jSONObject.putOpt(FIELD_PLACE_LABEL, this.placeLabel);
        jSONObject.putOpt("unit", this.unit);
        jSONObject.putOpt(FIELD_PLUS4, this.plus4);
        jSONObject.putOpt(FIELD_DISTANCE, this.distance);
        jSONObject.putOpt(FIELD_LAYER, this.layer);
        jSONObject.putOpt("metadata", this.metadata);
        jSONObject.putOpt(FIELD_CONFIDENCE, INSTANCE.stringForConfidence(this.confidence));
        RadarTimeZone radarTimeZone = this.timeZone;
        JSONArray jSONArray = null;
        jSONObject.putOpt("timeZone", radarTimeZone != null ? radarTimeZone.toJson() : null);
        String[] strArr = this.categories;
        if (strArr != null) {
            jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
        }
        jSONObject.putOpt(FIELD_CATEGORIES, jSONArray);
        return jSONObject;
    }
}
