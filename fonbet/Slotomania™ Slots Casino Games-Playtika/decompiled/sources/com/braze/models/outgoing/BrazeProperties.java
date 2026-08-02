package com.braze.models.outgoing;

import bo.app.r;
import com.braze.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\t\b\u0016¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001fB\u001b\b\u0016\u0012\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030 ¢\u0006\u0004\b\u001d\u0010\"J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0087\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/braze/models/outgoing/BrazeProperties;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "jsonObject", "", "doKeyValidation", "clean", "", "key", "", "value", "addProperty", "clone", "containsProperty", "removeProperty", "get", "forJsonPut", "propertiesJSONObject", "Lorg/json/JSONObject;", "", "getSize", "()I", "size", "isInvalid", "()Z", "", "getByteSize", "()J", "byteSize", "<init>", "()V", "(Lorg/json/JSONObject;)V", "", "map", "(Ljava/util/Map;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class BrazeProperties implements IPutIntoJson<JSONObject> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private JSONObject propertiesJSONObject;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/models/outgoing/BrazeProperties$a;", "", "", "key", "", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.braze.models.outgoing.BrazeProperties$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.braze.models.outgoing.BrazeProperties$a$a, reason: collision with other inner class name */
        static final class C0118a extends Lambda implements Function0<String> {
            public static final C0118a b = new C0118a();

            C0118a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.braze.models.outgoing.BrazeProperties$a$b */
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "The leading character in the key string may not be '$'. Not adding property.";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (StringsKt.isBlank(key)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, C0118a.b, 2, (Object) null);
                return false;
            }
            if (!StringsKt.startsWith$default(key, "$", false, 2, (Object) null)) {
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return false;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Value type is not supported. Cannot add property " + this.b + '.';
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
            return "Caught json exception trying to add property.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to clone BrazeProperties";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught json exception trying to get property.";
        }
    }

    public BrazeProperties() {
        this.propertiesJSONObject = new JSONObject();
    }

    private final JSONObject clean(JSONObject jsonObject, boolean doKeyValidation) {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNullExpressionValue(next, "jsonObjectIterator.next()");
            arrayList.add(next);
        }
        for (String str : arrayList) {
            if (!doKeyValidation || INSTANCE.a(str)) {
                Object obj = jsonObject.get(str);
                if (obj instanceof Date) {
                    jsonObject.put(str, DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
                }
                if (obj instanceof JSONArray) {
                    jsonObject.put(str, r.a((JSONArray) obj));
                }
                if (obj instanceof JSONObject) {
                    jsonObject.put(str, clean((JSONObject) obj, false));
                }
            } else {
                jsonObject.remove(str);
            }
        }
        return jsonObject;
    }

    static /* synthetic */ JSONObject clean$default(BrazeProperties brazeProperties, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return brazeProperties.clean(jSONObject, z);
    }

    @JvmStatic
    public static final boolean isValidKey(String str) {
        return INSTANCE.a(str);
    }

    public final BrazeProperties addProperty(String key, Object value) {
        BrazeProperties brazeProperties;
        JSONException jSONException;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!INSTANCE.a(key)) {
            return this;
        }
        try {
            try {
                if (value instanceof Long) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).longValue());
                    return this;
                }
                if (value instanceof Integer) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).intValue());
                    return this;
                }
                if (value instanceof Double) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) value).doubleValue());
                    return this;
                }
                if (value instanceof Boolean) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Boolean) value).booleanValue());
                    return this;
                }
                if (value instanceof Date) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null));
                    return this;
                }
                if (value instanceof String) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength((String) value));
                    return this;
                }
                if (value instanceof JSONArray) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), r.a((JSONArray) value));
                    return this;
                }
                if (value instanceof JSONObject) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, (JSONObject) value, false, 2, null));
                    return this;
                }
                if (value instanceof Map) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, new JSONObject(r.a((Map<?, ?>) value)), false, 2, null));
                    return this;
                }
                if (value == null) {
                    this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
                    return this;
                }
                brazeProperties = this;
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeProperties, BrazeLogger.Priority.W, (Throwable) null, new b(key), 2, (Object) null);
                    return brazeProperties;
                } catch (JSONException e2) {
                    e = e2;
                    jSONException = e;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, jSONException, c.b);
                    return brazeProperties;
                }
            } catch (JSONException e3) {
                jSONException = e3;
                brazeProperties = this;
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, jSONException, c.b);
                return brazeProperties;
            }
        } catch (JSONException e4) {
            e = e4;
            brazeProperties = this;
        }
    }

    public final BrazeProperties clone() {
        try {
            return new BrazeProperties(new JSONObject(getPropertiesJSONObject().toString()));
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, d.b);
            return null;
        }
    }

    public final boolean containsProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.propertiesJSONObject.has(key);
    }

    public final Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.propertiesJSONObject.get(key);
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
            return null;
        }
    }

    public final long getByteSize() {
        String jSONObject = this.propertiesJSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "propertiesJSONObject.toString()");
        return StringUtils.getByteSize(jSONObject);
    }

    public final int getSize() {
        return this.propertiesJSONObject.length();
    }

    public final boolean isInvalid() {
        return getByteSize() > Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES;
    }

    public final Object removeProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.propertiesJSONObject.remove(key);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public JSONObject getPropertiesJSONObject() {
        return this.propertiesJSONObject;
    }

    public BrazeProperties(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, jsonObject, false, 2, null);
    }

    public BrazeProperties(Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, new JSONObject(r.a(map)), false, 2, null);
    }
}
