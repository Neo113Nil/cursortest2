package bo.app;

import bo.app.ye;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j1 {
    public static final y8 b(String str, BrazeProperties brazeProperties) {
        JSONObject put = new JSONObject().put("n", str);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            put.put("p", brazeProperties.getKey());
        }
        w7 w7Var = w7.f26172e;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 d(String str) {
        JSONObject put = new JSONObject().put("ids", JsonUtils.constructJsonArray(new String[]{str}));
        w7 w7Var = w7.f26163F;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 f(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.f26179l, jSONObject, 0.0d, 12);
    }

    public static final y8 h(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.f26181n, jSONObject, 0.0d, 12);
    }

    public static final y8 j(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.f26182o, jSONObject, 0.0d, 12);
    }

    public static final y8 l(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.f26180m, jSONObject, 0.0d, 12);
    }

    public static final y8 n(String str, String str2) {
        return new k1(w7.f26187t, k1.f25630g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final y8 p(String str, String str2) {
        JSONObject put = new JSONObject().put("cid", str).put("a", str2);
        w7 w7Var = w7.f26174g;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 r(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put(EventKeys.VALUE_KEY, str2);
        w7 w7Var = w7.f26185r;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 t(String str, String str2) {
        JSONObject put = new JSONObject().put("a", str).put("l", str2);
        w7 w7Var = w7.f26191x;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public final y8 a(final String eventName, final BrazeProperties brazeProperties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return a(new Function0() { // from class: c3.E3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(eventName, brazeProperties);
            }
        });
    }

    public final y8 c(final String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        return a(new Function0() { // from class: c3.c4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.d(trackingId);
            }
        });
    }

    public final y8 e(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: c3.Q3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.f(cardId);
            }
        });
    }

    public final y8 g(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: c3.S3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.h(cardId);
            }
        });
    }

    public final y8 i(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: c3.U3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.j(cardId);
            }
        });
    }

    public final y8 k(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: c3.T3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.l(cardId);
            }
        });
    }

    public final y8 m(final String triggerId, final String str) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: c3.K3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.n(triggerId, str);
            }
        });
    }

    public final y8 o(final String campaignId, final String pageId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        return a(new Function0() { // from class: c3.M3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.p(campaignId, pageId);
            }
        });
    }

    public final y8 q(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return a(new Function0() { // from class: c3.i4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.r(key, value);
            }
        });
    }

    public final y8 s(final String alias, final String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        return a(new Function0() { // from class: c3.g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.t(alias, label);
            }
        });
    }

    public static final y8 n(String str) {
        return new k1(w7.f26189v, k1.f25630g.a(str, (String) null, (String) null), 0.0d, 12);
    }

    public final y8 a(final String productId, final String currencyCode, final BigDecimal price, final int i10, final BrazeProperties brazeProperties) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(price, "price");
        return a(new Function0() { // from class: c3.P3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.a(BrazeProperties.this, productId, currencyCode, price, i10);
            }
        });
    }

    public final y8 c(final String trackingId, final String str) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        return a(new Function0() { // from class: c3.G3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.d(trackingId, str);
            }
        });
    }

    public final y8 e(final String serializedEvent, final String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        return a(new Function0() { // from class: c3.Y3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.f(serializedEvent, uniqueIdentifier);
            }
        });
    }

    public final y8 g(final String id2, final String eventType) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return a(new Function0() { // from class: c3.V3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.h(id2, eventType);
            }
        });
    }

    public final y8 i(final String triggerId, final String buttonId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        return a(new Function0() { // from class: c3.O3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.j(triggerId, buttonId);
            }
        });
    }

    public final y8 k(final String triggerId, final String str) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: c3.L3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.l(triggerId, str);
            }
        });
    }

    public final y8 m(final String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: c3.W3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.n(triggerId);
            }
        });
    }

    public static final y8 a(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i10) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        jSONObject.put("p", scale.doubleValue());
        jSONObject.put("q", i10);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put("pr", brazeProperties.getKey());
        }
        return new k1(w7.f26173f, jSONObject, 0.0d, 12);
    }

    public static final y8 d(String str, String str2) {
        JSONObject put = new JSONObject().put(StackTraceHelper.ID_KEY, str);
        if (str2 != null && str2.length() > 0) {
            put.put("bid", str2);
        }
        w7 w7Var = w7.f26164G;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(IBrazeLocation iBrazeLocation) {
        return new k1(w7.f26171d, iBrazeLocation.getKey(), 0.0d, 12);
    }

    public static final y8 f(String str, String uniqueIdentifier) {
        ye yeVar;
        JSONObject jSONObject = new JSONObject(str);
        String value = jSONObject.getString("name");
        v7 v7Var = w7.f26169b;
        Intrinsics.checkNotNull(value);
        v7Var.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Object obj = w7.f26170c.get(value);
        if (obj == null) {
            obj = w7.f26167J;
        }
        w7 eventType = (w7) obj;
        JSONObject eventData = jSONObject.getJSONObject(EventKeys.DATA);
        double d10 = jSONObject.getDouble("time");
        String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
        String sessionId = JsonUtils.getOptionalString(jSONObject, "session_id");
        Intrinsics.checkNotNull(eventData);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        k1 k1Var = new k1(eventType, eventData, d10, uniqueIdentifier);
        k1Var.f25636e.setValue(k1Var, k1.f25631h[0], optionalString);
        if (sessionId != null) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            UUID fromString = UUID.fromString(sessionId);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            yeVar = new ye(fromString);
        } else {
            yeVar = null;
        }
        k1Var.a(yeVar);
        return k1Var;
    }

    public static final y8 h(String str, String str2) {
        JSONObject put = new JSONObject().put("geo_id", str).put(EventKeys.CALL_MESSAGE_EVENT_TYPE, str2);
        w7 w7Var = w7.f26178k;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 j(String str, String str2) {
        return new k1(w7.f26190w, k1.f25630g.a(str, str2, (String) null), 0.0d, 12);
    }

    public static final y8 l(String str, String str2) {
        return new k1(w7.f26188u, k1.f25630g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final y8 b(Throwable throwable, ye yeVar, boolean z10) {
        String str;
        String name = throwable.getClass().getName();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (yeVar != null) {
            str = "session_id: " + yeVar;
        } else {
            str = null;
        }
        k1.f25630g.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        JSONObject put = new JSONObject().put(com.bumptech.glide.gifdecoder.e.f29601m, StringsKt.trimIndent("\n                original_sdk_version: 42.2.0\n                exception_class: " + name + "\n                available_cpus: " + availableProcessors + "\n                " + str + "\n                " + StringsKt.take(stringWriter2, 5000) + "\n            "));
        if (!z10) {
            put.put("nop", true);
        }
        w7 w7Var = w7.f26177j;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public final y8 a(final IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return a(new Function0() { // from class: c3.N3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(IBrazeLocation.this);
            }
        });
    }

    public final y8 a(final Throwable throwable, final ye yeVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return a(new Function0() { // from class: c3.Z3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(throwable, yeVar, z10);
            }
        });
    }

    public final y8 a(final FeatureFlag ff2) {
        Intrinsics.checkNotNullParameter(ff2, "ff");
        return a(new Function0() { // from class: c3.f4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(FeatureFlag.this);
            }
        });
    }

    public final y8 a(final String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        return a(new Function0() { // from class: c3.b4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(trackingId);
            }
        });
    }

    public final y8 a(final String customUserAttributeKey, final int i10) {
        Intrinsics.checkNotNullParameter(customUserAttributeKey, "customUserAttributeKey");
        return a(new Function0() { // from class: c3.e4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(customUserAttributeKey, i10);
            }
        });
    }

    public final y8 a(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return a(new Function0() { // from class: c3.H3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(key, value);
            }
        });
    }

    public final y8 a(final String key, final String[] strArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a(new Function0() { // from class: c3.a4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(key, strArr);
            }
        });
    }

    public final y8 a(final ye sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return a(new Function0() { // from class: c3.X3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(ye.this);
            }
        });
    }

    public final y8 a(final long j10) {
        return a(new Function0() { // from class: c3.J3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(j10);
            }
        });
    }

    public static final y8 b(FeatureFlag featureFlag) {
        JSONObject put = new JSONObject().put("fid", featureFlag.getId()).put("fts", featureFlag.getTrackingString());
        w7 w7Var = w7.f26162E;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public final y8 a(final String key, final double d10, final double d11) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a(new Function0() { // from class: c3.F3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(key, d10, d11);
            }
        });
    }

    public final y8 a(final String key, final JSONObject json) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(json, "json");
        return a(new Function0() { // from class: c3.h4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(key, json);
            }
        });
    }

    public final y8 a(final String subscriptionGroupId, final mf subscriptionGroupStatus) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        Intrinsics.checkNotNullParameter(subscriptionGroupStatus, "subscriptionGroupStatus");
        return a(new Function0() { // from class: c3.d4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.b(subscriptionGroupId, subscriptionGroupStatus);
            }
        });
    }

    public final JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put("message_extras", str3);
            return jSONObject;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.R3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.j1.a();
            }
        }, 6, (Object) null);
        return jSONObject;
    }

    public static final y8 b(String str) {
        JSONObject put = new JSONObject().put(StackTraceHelper.ID_KEY, str);
        w7 w7Var = w7.f26165H;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, int i10) {
        JSONObject put = new JSONObject().put("key", str).put(EventKeys.VALUE_KEY, i10);
        w7 w7Var = w7.f26183p;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put(EventKeys.VALUE_KEY, str2);
        w7 w7Var = w7.f26184q;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final String a() {
        return "Message extras are null, not adding to event";
    }

    public final y8 a(Function0 function0) {
        try {
            return (y8) function0.invoke();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.I3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.j1.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final y8 b(String str, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        if (strArr == null) {
            jSONObject.put(EventKeys.VALUE_KEY, JSONObject.NULL);
        } else {
            jSONObject.put(EventKeys.VALUE_KEY, JsonUtils.constructJsonArray(strArr));
        }
        return new k1(w7.f26186s, jSONObject, 0.0d, 12);
    }

    public static final y8 b(ye yeVar) {
        k1 k1Var = new k1(w7.f26192y, (JSONObject) null, 0.0d, 14);
        k1Var.a(yeVar);
        return k1Var;
    }

    public static final y8 b(long j10) {
        JSONObject put = new JSONObject().put(W9.d.f13160a, j10);
        w7 w7Var = w7.f26193z;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, double d10, double d11) {
        JSONObject put = new JSONObject().put("key", str).put("latitude", d10).put("longitude", d11);
        w7 w7Var = w7.f26158A;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, JSONObject jSONObject) {
        JSONObject put = new JSONObject().put("key", str).put(EventKeys.VALUE_KEY, jSONObject);
        w7 w7Var = w7.f26160C;
        Intrinsics.checkNotNull(put);
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, mf mfVar) {
        String str2;
        JSONObject put = new JSONObject().put("group_id", str);
        int ordinal = mfVar.ordinal();
        if (ordinal == 0) {
            str2 = "subscribed";
        } else if (ordinal == 1) {
            str2 = "unsubscribed";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        JSONObject put2 = put.put("status", str2);
        w7 w7Var = w7.f26161D;
        Intrinsics.checkNotNull(put2);
        return new k1(w7Var, put2, 0.0d, 12);
    }

    public static final String b() {
        return "Failed to create event";
    }
}
