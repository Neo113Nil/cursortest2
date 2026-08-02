package ei;

import ai.AbstractC2028a;
import di.U;
import fi.C4308y;
import fi.X;
import fi.a0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final bi.f f46123a = U.a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC2028a.H(StringCompanionObject.INSTANCE));

    public static final JsonPrimitive a(Boolean bool) {
        if (bool == null) {
            return JsonNull.INSTANCE;
        }
        return new w(bool, false, null, 4, null);
    }

    public static final JsonPrimitive b(Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new w(number, false, null, 4, null);
    }

    public static final JsonPrimitive c(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new w(str, true, null, 4, null);
    }

    public static final Void d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final boolean e(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        Boolean d10 = a0.d(jsonPrimitive.a());
        if (d10 != null) {
            return d10.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final Boolean f(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return a0.d(jsonPrimitive.a());
    }

    public static final String g(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.a();
    }

    public static final double h(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.a());
    }

    public static final Double i(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.toDoubleOrNull(jsonPrimitive.a());
    }

    public static final float j(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.a());
    }

    public static final Integer k(JsonPrimitive jsonPrimitive) {
        Long l10;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            l10 = Long.valueOf(q(jsonPrimitive));
        } catch (C4308y unused) {
            l10 = null;
        }
        if (l10 != null) {
            long longValue = l10.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final JsonObject l(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final JsonPrimitive m(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final bi.f n() {
        return f46123a;
    }

    public static final long o(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return q(jsonPrimitive);
        } catch (C4308y e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final Long p(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(q(jsonPrimitive));
        } catch (C4308y unused) {
            return null;
        }
    }

    public static final long q(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return new X(jsonPrimitive.a()).p();
    }
}
