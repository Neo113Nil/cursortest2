package com.braze.support;

import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f29479a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final List f29480b = CollectionsKt.listOf((Object[]) new String[]{"$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object"});

    public static final boolean a(final String str, Set blocklistedAttributes) {
        Intrinsics.checkNotNullParameter(blocklistedAttributes, "blocklistedAttributes");
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29479a, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.d1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.c.c();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!blocklistedAttributes.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29479a, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.c.b(str);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String b(String str) {
        return "Custom attribute key cannot be blocklisted attribute: " + str + ".";
    }

    public static final String c() {
        return "Custom attribute key cannot be null.";
    }

    public static final String d() {
        return "Custom attribute value cannot be null.";
    }

    public static final String b() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final boolean c(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f29479a, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.c.d();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String d(Object obj) {
        return "Could not add unsupported custom attribute type with value: " + obj;
    }

    public static final String b(Object obj) {
        return "JSON Object size (" + ((JSONObject) obj).toString().length() + " bytes) exceeds 76800";
    }

    public static final String c(Object obj) {
        return "JSON Array size (" + ((JSONArray) obj).toString().length() + " bytes) exceeds 76800";
    }

    public final JSONObject a(JSONObject jSONObject, int i10) {
        if (i10 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.g1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.c.b();
                }
            }, 7, (Object) null);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            final String next = keys.next();
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            c cVar = f29479a;
            if ((StringsKt.isBlank(ensureBrazeFieldLength) | StringsKt.contains$default((CharSequence) ensureBrazeFieldLength, (CharSequence) "$", false, 2, (Object) null) | StringsKt.contains$default((CharSequence) ensureBrazeFieldLength, (CharSequence) ".", false, 2, (Object) null)) & (!f29480b.contains(ensureBrazeFieldLength))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) cVar, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.h1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.c.a(next);
                    }
                }, 6, (Object) null);
            }
            if (!StringsKt.isBlank(ensureBrazeFieldLength)) {
                if (jSONObject.isNull(next)) {
                    jSONObject2.put(next, JSONObject.NULL);
                } else {
                    Object obj = jSONObject.get(next);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    Object a10 = cVar.a(obj, i10);
                    if (a10 == null) {
                        return null;
                    }
                    jSONObject2.put(ensureBrazeFieldLength, a10);
                }
            }
        }
        return jSONObject2;
    }

    public static final String a(String str) {
        return "Nested Custom Attribute Key '" + str + "' is invalid.";
    }

    public final JSONArray a(JSONArray jSONArray, int i10) {
        if (i10 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.c.a();
                }
            }, 7, (Object) null);
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Object a10 = a(obj, i10);
            if (a10 == null) {
                return null;
            }
            jSONArray2.put(a10);
        }
        return jSONArray2;
    }

    public static final String a() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public final Object a(final Object value, int i10) {
        Intrinsics.checkNotNullParameter(value, "value");
        if ((value instanceof Boolean) || (value instanceof Integer) || (value instanceof Float) || (value instanceof Long) || (value instanceof Double)) {
            return value;
        }
        if (value instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) value);
        }
        if (value instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) value, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.Z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.c.a(value);
                    }
                }, 4, (Object) null);
                return null;
            }
        }
        if (value instanceof JSONObject) {
            if (i10 == 0 && ((JSONObject) value).toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.a1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.c.b(value);
                    }
                }, 6, (Object) null);
                return null;
            }
            return a((JSONObject) value, i10 + 1);
        }
        if (value instanceof JSONArray) {
            if (i10 == 0 && ((JSONArray) value).toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.b1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.c.c(value);
                    }
                }, 6, (Object) null);
                return null;
            }
            return a((JSONArray) value, i10 + 1);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.support.c.d(value);
            }
        }, 6, (Object) null);
        return null;
    }

    public static final String a(Object obj) {
        return "Error parsing date " + obj;
    }
}
