package com.braze.communication;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b f483a;

    public e(b httpConnector) {
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        this.f483a = httpConnector;
    }

    public static final String b() {
        return "Exception while logging result: ";
    }

    public final d a(final com.braze.requests.util.d requestTarget, final HashMap requestHeaders, final JSONObject payload) {
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.braze.communication.e$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(com.braze.requests.util.d.this, requestHeaders, payload);
            }
        });
        a(requestTarget, requestHeaders, lazy, payload);
        long currentTimeMillis = System.currentTimeMillis();
        d a2 = this.f483a.a(requestTarget, requestHeaders, payload);
        a(lazy, requestTarget, a2.b, a2.c, System.currentTimeMillis() - currentTimeMillis);
        return a2;
    }

    public static final String a(com.braze.requests.util.d dVar, Map map, JSONObject jSONObject) {
        Object[] requestArgs = {dVar, map, jSONObject};
        String str = q.f789a;
        Intrinsics.checkNotNullParameter(requestArgs, "requestArgs");
        long j = 1;
        for (int i = 0; i < 3; i++) {
            j *= requestArgs[i].hashCode();
        }
        String hexString = Long.toHexString(j);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public final void a(final com.braze.requests.util.d dVar, final HashMap hashMap, final Lazy lazy, final JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, dVar.d, new Function0() { // from class: com.braze.communication.e$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(Lazy.this, dVar, this, hashMap, jSONObject);
                }
            }, 3, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.communication.e$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Lazy lazy, com.braze.requests.util.d dVar, e eVar, Map map, JSONObject jSONObject) {
        String str;
        Object value = lazy.getValue();
        eVar.getClass();
        String a2 = a(map);
        if (jSONObject == null) {
            str = "";
        } else {
            str = "and JSON :\n" + JsonUtils.getPrettyPrintedString(jSONObject);
        }
        return StringsKt.trimMargin$default("\n                |Making request with id => \"" + value + "\"\n                |to url: " + dVar + "\n                \n                |with headers:\n                " + a2 + "\n                |\n                |" + str + "\n                ", null, 1, null);
    }

    public static final String a() {
        return "Exception while logging request: ";
    }

    public final void a(final Lazy lazy, final com.braze.requests.util.d dVar, final Map map, final JSONObject jSONObject, final long j) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.communication.e$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(Lazy.this, dVar, j, this, map, jSONObject);
                }
            }, 7, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.communication.e$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Lazy lazy, com.braze.requests.util.d dVar, long j, e eVar, Map map, JSONObject jSONObject) {
        Object value = lazy.getValue();
        eVar.getClass();
        return StringsKt.trimMargin$default("\n                |Made request with id => \"" + value + "\"\n                |to url: " + dVar + "\n                |took: " + j + "ms\n                \n                |with response headers:\n                " + a(map) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(jSONObject) + "\n                ", null, 1, null);
    }

    public static String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("|\"" + ((String) entry.getKey()) + "\" => \"" + ((String) entry.getValue()) + "\"");
        }
        return CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
    }
}
