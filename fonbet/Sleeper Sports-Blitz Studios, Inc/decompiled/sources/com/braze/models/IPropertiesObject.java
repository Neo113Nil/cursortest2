package com.braze.models;

import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\bg\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/braze/models/IPropertiesObject;", "", "properties", "Lorg/json/JSONObject;", "getProperties", "()Lorg/json/JSONObject;", "getStringProperty", "", SDKConstants.PARAM_KEY, "getNumberProperty", "", "getBooleanProperty", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getJSONProperty", "getImageProperty", "getTimestampProperty", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getValue", "expectedPropertyType", "doesKeyExist", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IPropertiesObject {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String PROPERTIES = "properties";
    public static final String PROPERTIES_TYPE = "type";
    public static final String PROPERTIES_TYPE_BOOLEAN = "boolean";
    public static final String PROPERTIES_TYPE_DATETIME = "datetime";
    public static final String PROPERTIES_TYPE_IMAGE = "image";
    public static final String PROPERTIES_TYPE_JSON = "jsonobject";
    public static final String PROPERTIES_TYPE_NUMBER = "number";
    public static final String PROPERTIES_TYPE_STRING = "string";
    public static final String PROPERTIES_VALUE = "value";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/braze/models/IPropertiesObject$Companion;", "", "<init>", "()V", "PROPERTIES", "", "PROPERTIES_TYPE", "PROPERTIES_VALUE", "PROPERTIES_TYPE_STRING", "PROPERTIES_TYPE_NUMBER", "PROPERTIES_TYPE_BOOLEAN", "PROPERTIES_TYPE_IMAGE", "PROPERTIES_TYPE_JSON", "PROPERTIES_TYPE_DATETIME", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PROPERTIES = "properties";
        public static final String PROPERTIES_TYPE = "type";
        public static final String PROPERTIES_TYPE_BOOLEAN = "boolean";
        public static final String PROPERTIES_TYPE_DATETIME = "datetime";
        public static final String PROPERTIES_TYPE_IMAGE = "image";
        public static final String PROPERTIES_TYPE_JSON = "jsonobject";
        public static final String PROPERTIES_TYPE_NUMBER = "number";
        public static final String PROPERTIES_TYPE_STRING = "string";
        public static final String PROPERTIES_VALUE = "value";

        private Companion() {
        }
    }

    private default boolean doesKeyExist(final String key) {
        if (getProperties().has(key)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.models.IPropertiesObject$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String doesKeyExist$lambda$1;
                doesKeyExist$lambda$1 = IPropertiesObject.doesKeyExist$lambda$1(key, this);
                return doesKeyExist$lambda$1;
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String doesKeyExist$lambda$1(String str, IPropertiesObject iPropertiesObject) {
        return "Key " + str + " does not exist in properties " + iPropertiesObject.getProperties() + ".";
    }

    private default Object getValue(String key, final String expectedPropertyType) {
        if (!doesKeyExist(key)) {
            return null;
        }
        Object obj = getProperties().get(key);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) obj;
        final Object obj2 = jSONObject.get("type");
        if (Intrinsics.areEqual(obj2, expectedPropertyType)) {
            return jSONObject.get("value");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.models.IPropertiesObject$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String value$lambda$0;
                value$lambda$0 = IPropertiesObject.getValue$lambda$0(expectedPropertyType, obj2);
                return value$lambda$0;
            }
        }, 6, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String getValue$lambda$0(String str, Object obj) {
        return "Property is not of type " + str + ". It is " + obj + ".";
    }

    default Boolean getBooleanProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value = getValue(key, "boolean");
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        return null;
    }

    default String getImageProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value = getValue(key, "image");
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    default JSONObject getJSONProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value = getValue(key, "jsonobject");
        if (value instanceof JSONObject) {
            return (JSONObject) value;
        }
        return null;
    }

    default Number getNumberProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value = getValue(key, "number");
        if (value instanceof Number) {
            return (Number) value;
        }
        return null;
    }

    JSONObject getProperties();

    default String getStringProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value = getValue(key, "string");
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    default Long getTimestampProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value = getValue(key, "datetime");
        if (value instanceof Long) {
            return (Long) value;
        }
        return null;
    }
}
