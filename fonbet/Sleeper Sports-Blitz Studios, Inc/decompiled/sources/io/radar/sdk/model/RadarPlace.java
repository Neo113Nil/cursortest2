package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarPlace.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u0006'"}, d2 = {"Lio/radar/sdk/model/RadarPlace;", "", "_id", "", "name", RadarPlace.FIELD_CATEGORIES, "", RadarPlace.FIELD_CHAIN, "Lio/radar/sdk/model/RadarChain;", "location", "Lio/radar/sdk/model/RadarCoordinate;", "group", "metadata", "Lorg/json/JSONObject;", "address", "Lio/radar/sdk/model/RadarAddress;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lio/radar/sdk/model/RadarChain;Lio/radar/sdk/model/RadarCoordinate;Ljava/lang/String;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarAddress;)V", "get_id", "()Ljava/lang/String;", "getAddress", "()Lio/radar/sdk/model/RadarAddress;", "getCategories", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getChain", "()Lio/radar/sdk/model/RadarChain;", "getGroup", "getLocation", "()Lio/radar/sdk/model/RadarCoordinate;", "getMetadata", "()Lorg/json/JSONObject;", "getName", "hasCategory", "", "category", "isChain", "slug", "toJson", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarPlace {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_ADDRESS = "address";
    private static final String FIELD_CATEGORIES = "categories";
    private static final String FIELD_CHAIN = "chain";
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_GROUP = "group";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_LOCATION = "location";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_NAME = "name";
    private final String _id;
    private final RadarAddress address;
    private final String[] categories;
    private final RadarChain chain;
    private final String group;
    private final RadarCoordinate location;
    private final JSONObject metadata;
    private final String name;

    @JvmStatic
    public static final RadarPlace fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarPlace[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    @JvmStatic
    public static final JSONArray toJson(RadarPlace[] radarPlaceArr) {
        return INSTANCE.toJson(radarPlaceArr);
    }

    public RadarPlace(String _id, String name, String[] categories, RadarChain radarChain, RadarCoordinate location, String str, JSONObject jSONObject, RadarAddress radarAddress) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(location, "location");
        this._id = _id;
        this.name = name;
        this.categories = categories;
        this.chain = radarChain;
        this.location = location;
        this.group = str;
        this.metadata = jSONObject;
        this.address = radarAddress;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final String[] getCategories() {
        return this.categories;
    }

    public final RadarChain getChain() {
        return this.chain;
    }

    public final RadarCoordinate getLocation() {
        return this.location;
    }

    public final String getGroup() {
        return this.group;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final RadarAddress getAddress() {
        return this.address;
    }

    /* compiled from: RadarPlace.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/radar/sdk/model/RadarPlace$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_CATEGORIES", "FIELD_CHAIN", "FIELD_COORDINATES", "FIELD_GROUP", "FIELD_ID", "FIELD_LOCATION", "FIELD_METADATA", "FIELD_NAME", "fromJson", "", "Lio/radar/sdk/model/RadarPlace;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarPlace;", "obj", "Lorg/json/JSONObject;", "toJson", "places", "([Lio/radar/sdk/model/RadarPlace;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarPlace fromJson(JSONObject obj) {
            String[] strArr;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString("_id");
            String str = optString == null ? "" : optString;
            String optString2 = obj.optString("name");
            String str2 = optString2 == null ? "" : optString2;
            JSONArray optJSONArray = obj.optJSONArray(RadarPlace.FIELD_CATEGORIES);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    String optString3 = optJSONArray.optString(i);
                    Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                    strArr[i] = optString3;
                }
            } else {
                strArr = new String[0];
            }
            RadarChain fromJson = RadarChain.INSTANCE.fromJson(obj.optJSONObject(RadarPlace.FIELD_CHAIN));
            JSONObject optJSONObject = obj.optJSONObject("location");
            JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray(RadarPlace.FIELD_COORDINATES) : null;
            RadarCoordinate radarCoordinate = new RadarCoordinate(optJSONArray2 != null ? optJSONArray2.optDouble(1) : 0.0d, optJSONArray2 != null ? optJSONArray2.optDouble(0) : 0.0d);
            String optString4 = obj.optString("group");
            String str3 = optString4 == null ? null : optString4;
            JSONObject optJSONObject2 = obj.optJSONObject("metadata");
            JSONObject jSONObject = optJSONObject2 == null ? null : optJSONObject2;
            obj.optJSONObject("address");
            JSONObject optJSONObject3 = obj.optJSONObject("address");
            return new RadarPlace(str, str2, strArr, fromJson, radarCoordinate, str3, jSONObject, optJSONObject3 != null ? RadarAddress.INSTANCE.fromJson(optJSONObject3) : null);
        }

        @JvmStatic
        public final RadarPlace[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarPlace[] radarPlaceArr = new RadarPlace[length];
            for (int i = 0; i < length; i++) {
                radarPlaceArr[i] = RadarPlace.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarPlace[]) ArraysKt.filterNotNull(radarPlaceArr).toArray(new RadarPlace[0]);
        }

        @JvmStatic
        public final JSONArray toJson(RadarPlace[] places) {
            if (places == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarPlace radarPlace : places) {
                jSONArray.put(radarPlace.toJson());
            }
            return jSONArray;
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this._id);
        jSONObject.putOpt("name", this.name);
        JSONArray jSONArray = new JSONArray();
        for (String str : this.categories) {
            jSONArray.put(str);
        }
        jSONObject.putOpt(FIELD_CATEGORIES, jSONArray);
        RadarChain radarChain = this.chain;
        jSONObject.putOpt(FIELD_CHAIN, radarChain != null ? radarChain.toJson() : null);
        jSONObject.putOpt("group", this.group);
        jSONObject.putOpt("metadata", this.metadata);
        jSONObject.putOpt("location", this.location.toJson());
        RadarAddress radarAddress = this.address;
        jSONObject.putOpt("address", radarAddress != null ? radarAddress.toJson() : null);
        return jSONObject;
    }

    public final boolean isChain(String slug) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        RadarChain radarChain = this.chain;
        return Intrinsics.areEqual(radarChain != null ? radarChain.getSlug() : null, slug);
    }

    public final boolean hasCategory(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return ArraysKt.contains(this.categories, category);
    }
}
