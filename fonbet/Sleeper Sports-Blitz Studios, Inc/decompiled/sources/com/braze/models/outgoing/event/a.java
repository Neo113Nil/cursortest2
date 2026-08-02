package com.braze.models.outgoing.event;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.braze.enums.c;
import com.braze.enums.d;
import com.braze.enums.g;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.q;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.codepush.react.CodePushConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
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

/* loaded from: classes6.dex */
public final class a {
    public static final k b(String str, BrazeProperties brazeProperties) {
        JSONObject put = new JSONObject().put("n", str);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            put.put("p", brazeProperties.getJsonKey());
        }
        d dVar = d.e;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k d(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.l, jSONObject, 0.0d, 12);
    }

    public static final k f(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.n, jSONObject, 0.0d, 12);
    }

    public static final k h(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.o, jSONObject, 0.0d, 12);
    }

    public static final k j(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.m, jSONObject, 0.0d, 12);
    }

    public static final k l(String str, String str2) {
        return new b(d.u, b.g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final k n(String str, String str2) {
        return new b(d.t, b.g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final k p(String str, String str2) {
        JSONObject put = new JSONObject().put("cid", str).put("a", str2);
        d dVar = d.g;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k r(String str, String str2) {
        JSONObject put = new JSONObject().put(SDKConstants.PARAM_KEY, str).put("value", str2);
        d dVar = d.r;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k t(String str, String str2) {
        JSONObject put = new JSONObject().put("a", str).put(CmcdData.STREAM_TYPE_LIVE, str2);
        d dVar = d.x;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public final k a(final String eventName, final BrazeProperties brazeProperties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(eventName, brazeProperties);
            }
        });
    }

    public final k c(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.d(cardId);
            }
        });
    }

    public final k e(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.f(cardId);
            }
        });
    }

    public final k g(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.h(cardId);
            }
        });
    }

    public final k i(final String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.j(cardId);
            }
        });
    }

    public final k k(final String triggerId, final String str) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.l(triggerId, str);
            }
        });
    }

    public final k m(final String triggerId, final String str) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.n(triggerId, str);
            }
        });
    }

    public final k o(final String campaignId, final String pageId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.p(campaignId, pageId);
            }
        });
    }

    public final k q(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.r(key, value);
            }
        });
    }

    public final k s(final String alias, final String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.t(alias, label);
            }
        });
    }

    public static final k l(String str) {
        return new b(d.v, b.g.a(str, (String) null, (String) null), 0.0d, 12);
    }

    public static final k n(String str) {
        JSONObject put = new JSONObject().put(SDKConstants.PARAM_KEY, str);
        d dVar = d.B;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public final k a(final String productId, final String currencyCode, final BigDecimal price, final int i, final BrazeProperties brazeProperties) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(price, "price");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a(BrazeProperties.this, productId, currencyCode, price, i);
            }
        });
    }

    public final k c(final String trackingId, final String str) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.d(trackingId, str);
            }
        });
    }

    public final k e(final String serializedEvent, final String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.f(serializedEvent, uniqueIdentifier);
            }
        });
    }

    public final k g(final String id, final String eventType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.h(id, eventType);
            }
        });
    }

    public final k i(final String triggerId, final String buttonId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.j(triggerId, buttonId);
            }
        });
    }

    public final k k(final String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.l(triggerId);
            }
        });
    }

    public final k m(final String str) {
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.n(str);
            }
        });
    }

    public static final k a(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        jSONObject.put("p", scale.doubleValue());
        jSONObject.put(JWKParameterNames.RSA_SECOND_PRIME_FACTOR, i);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put(CmcdConfiguration.KEY_PLAYBACK_RATE, brazeProperties.getJsonKey());
        }
        return new b(d.f, jSONObject, 0.0d, 12);
    }

    public static final k d(String str, String str2) {
        JSONObject put = new JSONObject().put("id", str);
        if (str2 != null && str2.length() > 0) {
            put.put("bid", str2);
        }
        d dVar = d.G;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k f(String str, String uniqueIdentifier) {
        q qVar;
        JSONObject jSONObject = new JSONObject(str);
        String value = jSONObject.getString("name");
        c cVar = d.b;
        Intrinsics.checkNotNull(value);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Object obj = d.c.get(value);
        if (obj == null) {
            obj = d.I;
        }
        d eventType = (d) obj;
        JSONObject eventData = jSONObject.getJSONObject("data");
        double d = jSONObject.getDouble(CodePushConstants.LATEST_ROLLBACK_TIME_KEY);
        String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
        String sessionId = JsonUtils.getOptionalString(jSONObject, "session_id");
        Intrinsics.checkNotNull(eventData);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        b bVar = new b(eventType, eventData, d, uniqueIdentifier);
        bVar.e.setValue(bVar, b.h[0], optionalString);
        if (sessionId != null) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            UUID fromString = UUID.fromString(sessionId);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            qVar = new q(fromString);
        } else {
            qVar = null;
        }
        bVar.a(qVar);
        return bVar;
    }

    public static final k h(String str, String str2) {
        JSONObject put = new JSONObject().put("geo_id", str).put("event_type", str2);
        d dVar = d.k;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k j(String str, String str2) {
        return new b(d.w, b.g.a(str, str2, (String) null), 0.0d, 12);
    }

    public static final k b(IBrazeLocation iBrazeLocation) {
        return new b(d.d, iBrazeLocation.getJsonKey(), 0.0d, 12);
    }

    public static final k b(Throwable throwable, q qVar, boolean z) {
        String str;
        String name = throwable.getClass().getName();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (qVar != null) {
            str = "session_id: " + qVar;
        } else {
            str = null;
        }
        b.g.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        JSONObject put = new JSONObject().put(JWKParameterNames.RSA_EXPONENT, StringsKt.trimIndent("\n                original_sdk_version: 41.0.0\n                exception_class: " + name + "\n                available_cpus: " + availableProcessors + "\n                " + str + "\n                " + StringsKt.take(stringWriter2, 5000) + "\n            "));
        if (!z) {
            put.put("nop", true);
        }
        d dVar = d.j;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public final k a(final IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(IBrazeLocation.this);
            }
        });
    }

    public final k a(final Throwable throwable, final q qVar, final boolean z) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(throwable, qVar, z);
            }
        });
    }

    public final k a(final FeatureFlag ff) {
        Intrinsics.checkNotNullParameter(ff, "ff");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(FeatureFlag.this);
            }
        });
    }

    public final k a(final String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(trackingId);
            }
        });
    }

    public final k a(final String customUserAttributeKey, final int i) {
        Intrinsics.checkNotNullParameter(customUserAttributeKey, "customUserAttributeKey");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(customUserAttributeKey, i);
            }
        });
    }

    public final k a(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(key, value);
            }
        });
    }

    public final k a(final String key, final String[] strArr) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(key, strArr);
            }
        });
    }

    public final k a(final q sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(q.this);
            }
        });
    }

    public final k a(final long j) {
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(j);
            }
        });
    }

    public final k a(final String key, final double d, final double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(key, d, d2);
            }
        });
    }

    public final k a(final String key, final JSONObject json) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(json, "json");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(key, json);
            }
        });
    }

    public final k a(final String subscriptionGroupId, final g subscriptionGroupStatus) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        Intrinsics.checkNotNullParameter(subscriptionGroupStatus, "subscriptionGroupStatus");
        return a(new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b(subscriptionGroupId, subscriptionGroupStatus);
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
            jSONObject.put(InAppMessageBase.MESSAGE_EXTRAS, str3);
            return jSONObject;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a();
            }
        }, 6, (Object) null);
        return jSONObject;
    }

    public static final String a() {
        return "Message extras are null, not adding to event";
    }

    public final k a(Function0 function0) {
        try {
            return (k) function0.invoke();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.outgoing.event.a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.b();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final k b(FeatureFlag featureFlag) {
        JSONObject put = new JSONObject().put("fid", featureFlag.getId()).put(FeatureFlag.TRACKING_STRING, featureFlag.getTrackingString$android_sdk_base_release());
        d dVar = d.E;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k b(String str) {
        JSONObject put = new JSONObject().put("ids", JsonUtils.constructJsonArray(new String[]{str}));
        d dVar = d.F;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k b(String str, int i) {
        JSONObject put = new JSONObject().put(SDKConstants.PARAM_KEY, str).put("value", i);
        d dVar = d.p;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k b(String str, String str2) {
        JSONObject put = new JSONObject().put(SDKConstants.PARAM_KEY, str).put("value", str2);
        d dVar = d.q;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k b(String str, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SDKConstants.PARAM_KEY, str);
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
        }
        return new b(d.s, jSONObject, 0.0d, 12);
    }

    public static final k b(q qVar) {
        b bVar = new b(d.y, (JSONObject) null, 0.0d, 14);
        bVar.a(qVar);
        return bVar;
    }

    public static final k b(long j) {
        JSONObject put = new JSONObject().put("d", j);
        d dVar = d.z;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k b(String str, double d, double d2) {
        JSONObject put = new JSONObject().put(SDKConstants.PARAM_KEY, str).put("latitude", d).put("longitude", d2);
        d dVar = d.A;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k b(String str, JSONObject jSONObject) {
        JSONObject put = new JSONObject().put(SDKConstants.PARAM_KEY, str).put("value", jSONObject);
        d dVar = d.C;
        Intrinsics.checkNotNull(put);
        return new b(dVar, put, 0.0d, 12);
    }

    public static final k b(String str, g gVar) {
        String str2;
        JSONObject put = new JSONObject().put(FirebaseAnalytics.Param.GROUP_ID, str);
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            str2 = "subscribed";
        } else if (ordinal == 1) {
            str2 = "unsubscribed";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        JSONObject put2 = put.put("status", str2);
        d dVar = d.D;
        Intrinsics.checkNotNull(put2);
        return new b(dVar, put2, 0.0d, 12);
    }

    public static final String b() {
        return "Failed to create event";
    }
}
