package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class n3 extends b {
    public final com.braze.managers.q0 b;
    public final v2 c;
    public final t0 d;
    public final o3 e;
    public String f;

    public n3(Context context, com.braze.managers.q0 pushRegistrationDataProvider, v2 sdkEnablementProvider, t0 delayedInitializationProvider, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushRegistrationDataProvider, "pushRegistrationDataProvider");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(delayedInitializationProvider, "delayedInitializationProvider");
        this.b = pushRegistrationDataProvider;
        this.c = sdkEnablementProvider;
        this.d = delayedInitializationProvider;
        this.e = new o3(context, str, str2);
        this.f = str;
    }

    public static final String d() {
        return "Could not create custom attributes json object from DataStore.";
    }

    public static final String e() {
        return "No push token available to add to attributes object.";
    }

    public static final String f() {
        return "Couldn't add push token to outbound json";
    }

    public static final String i() {
        return "Failed to add merged custom attributes back to user object.";
    }

    public static final String k() {
        return "Push token cache cleared via sendPushTokenOnNextExport.";
    }

    @Override // com.braze.storage.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.l outboundObject, boolean z) {
        n3 n3Var;
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        JSONObject jSONObject = outboundObject.f646a;
        if (z) {
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_TOKEN;
            if (jSONObject.has(dataStoreKey.getKey())) {
                o3 o3Var = this.e;
                String optString = jSONObject.optString("push_token");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                o3Var.writeData(dataStoreKey, optString);
                return;
            }
            return;
        }
        JSONObject h = h();
        JSONObject plus = JsonUtils.plus(jSONObject, h);
        plus.remove("push_token");
        JSONObject optJSONObject = h.optJSONObject("custom");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("custom");
        try {
        } catch (JSONException e) {
            n3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n3Var, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n3.i();
                }
            }, 4, (Object) null);
        }
        if (optJSONObject != null && optJSONObject2 != null) {
            plus.put("custom", JsonUtils.plus(optJSONObject2, optJSONObject));
        } else {
            if (optJSONObject == null) {
                if (optJSONObject2 != null) {
                    plus.put("custom", optJSONObject2);
                }
                n3Var = this;
                o3 o3Var2 = n3Var.e;
                DataStoreKey dataStoreKey2 = DataStoreKey.SERIALIZED_USER_OBJECT;
                String jSONObject2 = plus.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                o3Var2.writeData(dataStoreKey2, jSONObject2);
            }
            plus.put("custom", optJSONObject);
        }
        n3Var = this;
        o3 o3Var22 = n3Var.e;
        DataStoreKey dataStoreKey22 = DataStoreKey.SERIALIZED_USER_OBJECT;
        String jSONObject22 = plus.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject22, "toString(...)");
        o3Var22.writeData(dataStoreKey22, jSONObject22);
    }

    public final void b(final JSONObject jSONObject) {
        final String str = "ab_install_attribution";
        Intrinsics.checkNotNullParameter("ab_install_attribution", SDKConstants.PARAM_KEY);
        JSONObject h = h();
        try {
            if (jSONObject == null) {
                h.put("ab_install_attribution", JSONObject.NULL);
            } else {
                JSONObject optJSONObject = h.optJSONObject("ab_install_attribution");
                if (optJSONObject != null) {
                    h.put("ab_install_attribution", JsonUtils.plus(optJSONObject, jSONObject));
                } else {
                    h.put("ab_install_attribution", jSONObject);
                }
            }
            c(h);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n3.a(str, jSONObject);
                }
            }, 4, (Object) null);
        }
    }

    public final JSONObject g() {
        JSONObject h = h();
        if (h.has("custom")) {
            try {
                JSONObject jSONObject = h.getJSONObject("custom");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                return jSONObject;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n3.d();
                    }
                }, 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    public final JSONObject h() {
        final String readString = this.e.readString(DataStoreKey.SERIALIZED_USER_OBJECT, null);
        if (readString == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(readString);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n3.a(readString);
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    public final synchronized void j() {
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n3.k();
                    }
                }, 6, (Object) null);
                this.e.clearData(DataStoreKey.PUSH_TOKEN);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.braze.storage.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.l c() {
        StringUtils.ifNonEmpty(this.f, new Function1() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.a(n3.this, (String) obj);
            }
        });
        JSONObject h = h();
        a(h);
        this.e.clearData(DataStoreKey.SERIALIZED_USER_OBJECT);
        return new com.braze.models.outgoing.l(h);
    }

    public static final String d(String str, Object obj) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + obj + "]";
    }

    public final boolean c(JSONObject jSONObject) {
        if (!this.c.a() && !this.d.c()) {
            o3 o3Var = this.e;
            DataStoreKey dataStoreKey = DataStoreKey.SERIALIZED_USER_OBJECT;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            o3Var.writeData(dataStoreKey, jSONObject2);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n3.a(n3.this);
            }
        }, 6, (Object) null);
        return false;
    }

    public final boolean c(final String key, final Object obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject h = h();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n3.d(key, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        h.put(key, obj2);
        return c(h);
    }

    public static final String b(String str, Object obj) {
        return "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + "]";
    }

    public static final String a(String str) {
        return "Failed to load user object json from DataStore with json string: " + str;
    }

    public final void a(JSONObject outboundJson) {
        Intrinsics.checkNotNullParameter(outboundJson, "outboundJson");
        try {
            String b = ((com.braze.managers.z0) this.b).b();
            if (b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n3.e();
                    }
                }, 7, (Object) null);
            } else {
                if (Intrinsics.areEqual(b, this.e.readString(DataStoreKey.PUSH_TOKEN, null))) {
                    return;
                }
                outboundJson.put("push_token", b);
            }
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n3.f();
                }
            }, 4, (Object) null);
        }
    }

    public static final Unit a(n3 n3Var, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        n3Var.c("user_id", it);
        return Unit.INSTANCE;
    }

    public static final String a(n3 n3Var) {
        return "SDK delayed initialization mode: " + n3Var.d.c() + " and GDPR disabled mode: " + n3Var.c.a() + ". Not writing to user cache.";
    }

    public static final String a(String str, JSONObject jSONObject) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + jSONObject + "] ";
    }

    public final boolean a(final String key, final Object obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject g = g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.n3$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n3.b(key, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        g.put(key, obj2);
        return c("custom", g);
    }
}
