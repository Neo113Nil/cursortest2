package com.braze.models;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 .2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001/B!\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0002HÆ\u0003J'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "forJsonPut", "", "key", "getStringProperty", "", "getNumberProperty", "", "getBooleanProperty", "(Ljava/lang/String;)Ljava/lang/Boolean;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "expectedPropertyType", "", "getValue$android_sdk_base_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getValue", "doesKeyExist$android_sdk_base_release", "(Ljava/lang/String;)Z", "doesKeyExist", "component1", "component2", "component3", "id", "enabled", FeatureFlag.PROPERTIES, "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "getEnabled", "()Z", "Lorg/json/JSONObject;", "getProperties", "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;ZLorg/json/JSONObject;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class FeatureFlag implements IPutIntoJson<JSONObject> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ENABLED = "enabled";
    public static final String ID = "id";
    public static final String PROPERTIES = "properties";
    public static final String PROPERTIES_TYPE = "type";
    public static final String PROPERTIES_TYPE_BOOLEAN = "boolean";
    public static final String PROPERTIES_TYPE_NUMBER = "number";
    public static final String PROPERTIES_TYPE_STRING = "string";
    public static final String PROPERTIES_VALUE = "value";
    private final boolean enabled;
    private final String id;
    private final JSONObject properties;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/braze/models/FeatureFlag$a;", "", "", "id", "Lcom/braze/models/FeatureFlag;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "ENABLED", "Ljava/lang/String;", "ID", "PROPERTIES", "PROPERTIES_TYPE", "PROPERTIES_TYPE_BOOLEAN", "PROPERTIES_TYPE_NUMBER", "PROPERTIES_TYPE_STRING", "PROPERTIES_VALUE", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.braze.models.FeatureFlag$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FeatureFlag a(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new FeatureFlag(id, false, new JSONObject());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ FeatureFlag c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, FeatureFlag featureFlag) {
            super(0);
            this.b = str;
            this.c = featureFlag;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Key " + this.b + " does not exist in properties " + this.c.getProperties() + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating FeatureFlag Json.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Property is not of type " + this.b + ". It is " + this.c + '.';
        }
    }

    public FeatureFlag(String id, boolean z, JSONObject properties) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.id = id;
        this.enabled = z;
        this.properties = properties;
    }

    public static /* synthetic */ FeatureFlag copy$default(FeatureFlag featureFlag, String str, boolean z, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featureFlag.id;
        }
        if ((i & 2) != 0) {
            z = featureFlag.enabled;
        }
        if ((i & 4) != 0) {
            jSONObject = featureFlag.properties;
        }
        return featureFlag.copy(str, z, jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final JSONObject getProperties() {
        return this.properties;
    }

    public final FeatureFlag copy(String id, boolean enabled, JSONObject properties) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new FeatureFlag(id, enabled, properties);
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(this.properties));
    }

    public final boolean doesKeyExist$android_sdk_base_release(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.properties.has(key)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(key, this), 2, (Object) null);
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) other;
        return Intrinsics.areEqual(this.id, featureFlag.id) && this.enabled == featureFlag.enabled && Intrinsics.areEqual(this.properties, featureFlag.properties);
    }

    public final Boolean getBooleanProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, "boolean");
        if (value$android_sdk_base_release instanceof Boolean) {
            return (Boolean) value$android_sdk_base_release;
        }
        return null;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    public final Number getNumberProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, "number");
        if (value$android_sdk_base_release instanceof Number) {
            return (Number) value$android_sdk_base_release;
        }
        return null;
    }

    public final JSONObject getProperties() {
        return this.properties;
    }

    public final String getStringProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, "string");
        if (value$android_sdk_base_release instanceof String) {
            return (String) value$android_sdk_base_release;
        }
        return null;
    }

    public final Object getValue$android_sdk_base_release(String key, String expectedPropertyType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expectedPropertyType, "expectedPropertyType");
        if (!doesKeyExist$android_sdk_base_release(key)) {
            return null;
        }
        Object obj = this.properties.get(key);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        JSONObject jSONObject = (JSONObject) obj;
        Object obj2 = jSONObject.get("type");
        if (Intrinsics.areEqual(obj2, expectedPropertyType)) {
            return jSONObject.get("value");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(expectedPropertyType, obj2), 2, (Object) null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.properties.hashCode();
    }

    public String toString() {
        return "FeatureFlag(id=" + this.id + ", enabled=" + this.enabled + ", properties=" + this.properties + ')';
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("enabled", this.enabled);
            jSONObject.put(PROPERTIES, this.properties);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
            return jSONObject;
        }
    }
}
