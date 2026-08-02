package s6;

import T7.A;
import T7.C1682w;
import T7.Y;
import android.util.Log;
import g6.C4331C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6340a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f64791b;

    /* renamed from: a, reason: collision with root package name */
    public static final C6340a f64790a = new C6340a();

    /* renamed from: c, reason: collision with root package name */
    public static final String f64792c = C6340a.class.getCanonicalName();

    /* renamed from: d, reason: collision with root package name */
    public static final List f64793d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final Set f64794e = new CopyOnWriteArraySet();

    /* renamed from: s6.a$a, reason: collision with other inner class name */
    public static final class C0898a {

        /* renamed from: a, reason: collision with root package name */
        public String f64795a;

        /* renamed from: b, reason: collision with root package name */
        public Map f64796b;

        public C0898a(String eventName, Map restrictiveParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.f64795a = eventName;
            this.f64796b = restrictiveParams;
        }

        public final String a() {
            return this.f64795a;
        }

        public final Map b() {
            return this.f64796b;
        }

        public final void c(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f64796b = map;
        }
    }

    public static final void a() {
        if (Y7.a.d(C6340a.class)) {
            return;
        }
        try {
            f64791b = true;
            f64790a.c();
        } catch (Throwable th2) {
            Y7.a.b(th2, C6340a.class);
        }
    }

    public static final String e(String eventName) {
        if (Y7.a.d(C6340a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f64791b) {
                if (f64790a.d(eventName)) {
                    return "_removed_";
                }
            }
            return eventName;
        } catch (Throwable th2) {
            Y7.a.b(th2, C6340a.class);
            return null;
        }
    }

    public static final void f(Map parameters, String eventName) {
        if (Y7.a.d(C6340a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f64791b) {
                HashMap hashMap = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String b10 = f64790a.b(eventName, str);
                    if (b10 != null) {
                        hashMap.put(str, b10);
                        parameters.remove(str);
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C6340a.class);
        }
    }

    public final String b(String str, String str2) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            try {
                for (C0898a c0898a : new ArrayList(f64793d)) {
                    if (c0898a != null && Intrinsics.areEqual(str, c0898a.a())) {
                        for (String str3 : c0898a.b().keySet()) {
                            if (Intrinsics.areEqual(str2, str3)) {
                                return (String) c0898a.b().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(f64792c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void c() {
        String l10;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            A a10 = A.f10965a;
            C1682w q10 = A.q(C4331C.m(), false);
            if (q10 == null || (l10 = q10.l()) == null || l10.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(l10);
            f64793d.clear();
            f64794e.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    C0898a c0898a = new C0898a(key, new HashMap());
                    if (optJSONObject != null) {
                        c0898a.c(Y.o(optJSONObject));
                        f64793d.add(c0898a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f64794e.add(c0898a.a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final boolean d(String str) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return f64794e.contains(str);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
