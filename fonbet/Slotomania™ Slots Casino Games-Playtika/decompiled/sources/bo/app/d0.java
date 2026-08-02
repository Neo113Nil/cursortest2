package bo.app;

import com.braze.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J'\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0007¢\u0006\u0004\b\u0007\u0010\fJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J#\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0007\u0010\u0013¨\u0006\u0016"}, d2 = {"Lbo/app/d0;", "", "", "key", "", "blocklistedAttributes", "", Constants.BRAZE_PUSH_CONTENT_KEY, "value", "b", "", "values", "([Ljava/lang/String;)[Ljava/lang/String;", "Lorg/json/JSONObject;", "json", "", "curDepth", "Lorg/json/JSONArray;", "jsonArray", "(Ljava/lang/Object;I)Ljava/lang/Object;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class d0 {
    public static final d0 a = new d0();
    private static final List<String> b = CollectionsKt.listOf((Object[]) new String[]{"$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object"});

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Error parsing date ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "JSON Object size (" + this.b.toString().length() + " bytes) exceeds 76800";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "JSON Array size (" + this.b.toString().length() + " bytes) exceeds 76800";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not add unsupported custom attribute type with value: ", this.b);
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
            return "JSON Object nested too deep (limit 50). Returning null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "JSON Object nested too deep (limit 50). Returning null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Nested Custom Attribute Key '" + ((Object) this.b) + "' is invalid.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key cannot be blocklisted attribute: " + ((Object) this.b) + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute value cannot be null.";
        }
    }

    private d0() {
    }

    @JvmStatic
    public static final boolean a(String key, Set<String> blocklistedAttributes) {
        Intrinsics.checkNotNullParameter(blocklistedAttributes, "blocklistedAttributes");
        if (key == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, h.b, 2, (Object) null);
            return false;
        }
        if (!blocklistedAttributes.contains(key)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, new i(key), 2, (Object) null);
        return false;
    }

    @JvmStatic
    public static final boolean b(String value) {
        if (value != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, j.b, 2, (Object) null);
        return false;
    }

    private final boolean a(String key) {
        return (!b.contains(key)) & (StringsKt.isBlank(key) | StringsKt.contains$default((CharSequence) key, (CharSequence) "$", false, 2, (Object) null) | StringsKt.contains$default((CharSequence) key, (CharSequence) ".", false, 2, (Object) null));
    }

    private final JSONObject a(JSONObject json, int curDepth) {
        if (curDepth > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.b, 3, (Object) null);
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = json.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            d0 d0Var = a;
            if (d0Var.a(ensureBrazeFieldLength)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, d0Var, BrazeLogger.Priority.W, (Throwable) null, new g(next), 2, (Object) null);
            }
            if (!StringsKt.isBlank(ensureBrazeFieldLength)) {
                if (json.isNull(next)) {
                    jSONObject.put(next, JSONObject.NULL);
                } else {
                    Object obj = json.get(next);
                    Intrinsics.checkNotNullExpressionValue(obj, "json.get(key)");
                    Object a2 = d0Var.a(obj, curDepth);
                    if (a2 == null) {
                        return null;
                    }
                    jSONObject.put(ensureBrazeFieldLength, a2);
                }
            }
        }
        return jSONObject;
    }

    private final JSONArray a(JSONArray jsonArray, int curDepth) {
        if (curDepth > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.b, 3, (Object) null);
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int length = jsonArray.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            Object obj = jsonArray.get(i2);
            Intrinsics.checkNotNullExpressionValue(obj, "jsonArray.get(i)");
            Object a2 = a(obj, curDepth);
            if (a2 == null) {
                return null;
            }
            jSONArray.put(a2);
            i2 = i3;
        }
        return jSONArray;
    }

    public static /* synthetic */ Object a(d0 d0Var, Object obj, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return d0Var.a(obj, i2);
    }

    public final Object a(Object value, int curDepth) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Boolean ? true : value instanceof Integer ? true : value instanceof Float ? true : value instanceof Long ? true : value instanceof Double) {
            return value;
        }
        if (value instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) value);
        }
        if (value instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new a(value));
                return null;
            }
        }
        if (value instanceof JSONObject) {
            if (curDepth == 0 && value.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(value), 2, (Object) null);
                return null;
            }
            return a((JSONObject) value, curDepth + 1);
        }
        if (value instanceof JSONArray) {
            if (curDepth == 0 && value.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new c(value), 2, (Object) null);
                return null;
            }
            return a((JSONArray) value, curDepth + 1);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(value), 2, (Object) null);
        return null;
    }

    @JvmStatic
    public static final String[] a(String[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            String str = values[i2];
            i2++;
            arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
