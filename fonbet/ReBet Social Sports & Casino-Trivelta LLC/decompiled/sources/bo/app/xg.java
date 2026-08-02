package bo.app;

import android.content.Context;
import bo.app.xg;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xg extends b {

    /* renamed from: b, reason: collision with root package name */
    public final p9 f26290b;

    /* renamed from: c, reason: collision with root package name */
    public final he f26291c;

    /* renamed from: d, reason: collision with root package name */
    public final u4 f26292d;

    /* renamed from: e, reason: collision with root package name */
    public final yg f26293e;

    /* renamed from: f, reason: collision with root package name */
    public String f26294f;

    public xg(Context context, p9 pushRegistrationDataProvider, he sdkEnablementProvider, u4 delayedInitializationProvider, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushRegistrationDataProvider, "pushRegistrationDataProvider");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(delayedInitializationProvider, "delayedInitializationProvider");
        this.f26290b = pushRegistrationDataProvider;
        this.f26291c = sdkEnablementProvider;
        this.f26292d = delayedInitializationProvider;
        this.f26293e = new yg(context, str, str2);
        this.f26294f = str;
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

    @Override // bo.app.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(mb outboundObject, boolean z10) {
        xg xgVar;
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        JSONObject jSONObject = outboundObject.f25755a;
        if (z10) {
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_TOKEN;
            if (jSONObject.has(dataStoreKey.getKey())) {
                yg ygVar = this.f26293e;
                String optString = jSONObject.optString("push_token");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                ygVar.writeData(dataStoreKey, optString);
                return;
            }
            return;
        }
        JSONObject h10 = h();
        JSONObject plus = JsonUtils.plus(jSONObject, h10);
        plus.remove("push_token");
        JSONObject optJSONObject = h10.optJSONObject("custom");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("custom");
        try {
        } catch (JSONException e10) {
            xgVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) xgVar, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Jc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xg.i();
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
                xgVar = this;
                yg ygVar2 = xgVar.f26293e;
                DataStoreKey dataStoreKey2 = DataStoreKey.SERIALIZED_USER_OBJECT;
                String jSONObject2 = plus.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                ygVar2.writeData(dataStoreKey2, jSONObject2);
            }
            plus.put("custom", optJSONObject);
        }
        xgVar = this;
        yg ygVar22 = xgVar.f26293e;
        DataStoreKey dataStoreKey22 = DataStoreKey.SERIALIZED_USER_OBJECT;
        String jSONObject22 = plus.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject22, "toString(...)");
        ygVar22.writeData(dataStoreKey22, jSONObject22);
    }

    public final void b(final JSONObject jSONObject) {
        final String str = "ab_install_attribution";
        Intrinsics.checkNotNullParameter("ab_install_attribution", "key");
        JSONObject h10 = h();
        try {
            if (jSONObject == null) {
                h10.put("ab_install_attribution", JSONObject.NULL);
            } else {
                JSONObject optJSONObject = h10.optJSONObject("ab_install_attribution");
                if (optJSONObject != null) {
                    h10.put("ab_install_attribution", JsonUtils.plus(optJSONObject, jSONObject));
                } else {
                    h10.put("ab_install_attribution", jSONObject);
                }
            }
            c(h10);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Dc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xg.a(str, jSONObject);
                }
            }, 4, (Object) null);
        }
    }

    public final JSONObject g() {
        JSONObject h10 = h();
        if (h10.has("custom")) {
            try {
                JSONObject jSONObject = h10.getJSONObject("custom");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                return jSONObject;
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Gc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return xg.d();
                    }
                }, 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    public final JSONObject h() {
        final String readString = this.f26293e.readString(DataStoreKey.SERIALIZED_USER_OBJECT, null);
        if (readString == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(readString);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Hc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xg.a(readString);
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    public final synchronized void j() {
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.Bc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return xg.k();
                    }
                }, 6, (Object) null);
                this.f26293e.clearData(DataStoreKey.PUSH_TOKEN);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // bo.app.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final mb c() {
        StringUtils.ifNonEmpty(this.f26294f, new Function1() { // from class: c3.Kc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xg.a(xg.this, (String) obj);
            }
        });
        JSONObject h10 = h();
        a(h10);
        this.f26293e.clearData(DataStoreKey.SERIALIZED_USER_OBJECT);
        return new mb(h10);
    }

    public static final String d(String str, Object obj) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + obj + "]";
    }

    public final boolean c(JSONObject jSONObject) {
        if (!this.f26291c.a() && !this.f26292d.c()) {
            yg ygVar = this.f26293e;
            DataStoreKey dataStoreKey = DataStoreKey.SERIALIZED_USER_OBJECT;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            ygVar.writeData(dataStoreKey, jSONObject2);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Ic
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xg.a(xg.this);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String b(String str, Object obj) {
        return "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + "]";
    }

    public final boolean c(final String key, final Object obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject h10 = h();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Ec
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return xg.d(key, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        h10.put(key, obj2);
        return c(h10);
    }

    public static final String a(String str) {
        return "Failed to load user object json from DataStore with json string: " + str;
    }

    public final void a(JSONObject outboundJson) {
        Intrinsics.checkNotNullParameter(outboundJson, "outboundJson");
        try {
            String b10 = ((tc) this.f26290b).b();
            if (b10 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Lc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return xg.e();
                    }
                }, 7, (Object) null);
            } else {
                if (Intrinsics.areEqual(b10, this.f26293e.readString(DataStoreKey.PUSH_TOKEN, null))) {
                    return;
                }
                outboundJson.put("push_token", b10);
            }
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Cc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return xg.f();
                }
            }, 4, (Object) null);
        }
    }

    public static final Unit a(xg xgVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        xgVar.c("user_id", it);
        return Unit.INSTANCE;
    }

    public static final String a(xg xgVar) {
        return "SDK delayed initialization mode: " + xgVar.f26292d.c() + " and GDPR disabled mode: " + xgVar.f26291c.a() + ". Not writing to user cache.";
    }

    public static final String a(String str, JSONObject jSONObject) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + jSONObject + "] ";
    }

    public final boolean a(final String key, final Object obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject g10 = g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Fc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return xg.b(key, obj);
                    }
                }, 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        g10.put(key, obj2);
        return c("custom", g10);
    }
}
