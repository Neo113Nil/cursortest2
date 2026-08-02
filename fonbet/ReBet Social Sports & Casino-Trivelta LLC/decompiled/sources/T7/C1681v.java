package T7;

import T7.C1681v;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.GraphRequest;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: T7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1681v {

    /* renamed from: a, reason: collision with root package name */
    public static final C1681v f11207a = new C1681v();

    /* renamed from: b, reason: collision with root package name */
    public static final String f11208b = Reflection.getOrCreateKotlinClass(C1681v.class).getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f11209c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f11210d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public static final Map f11211e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static Long f11212f;

    /* renamed from: g, reason: collision with root package name */
    public static U7.b f11213g;

    /* renamed from: T7.v$a */
    public interface a {
        void a();
    }

    public static final boolean d(String name, String str, boolean z10) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        Map e10 = f11207a.e(str);
        return (e10.containsKey(name) && (bool = (Boolean) e10.get(name)) != null) ? bool.booleanValue() : z10;
    }

    public static final synchronized void h(a aVar) {
        synchronized (C1681v.class) {
            if (aVar != null) {
                try {
                    f11210d.add(aVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final String m10 = C4331C.m();
            C1681v c1681v = f11207a;
            if (c1681v.f(f11212f) && f11211e.containsKey(m10)) {
                c1681v.k();
                return;
            }
            final Context l10 = C4331C.l();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m10}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            if (l10 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!Y.d0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    Y.j0("FacebookSDK", e10);
                }
                if (jSONObject != null) {
                    j(m10, jSONObject);
                }
            }
            Executor t10 = C4331C.t();
            if (t10 == null) {
                return;
            }
            if (f11209c.compareAndSet(false, true)) {
                t10.execute(new Runnable() { // from class: T7.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1681v.i(m10, l10, format);
                    }
                });
            }
        }
    }

    public static final void i(String applicationId, Context context, String gateKeepersKey) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        C1681v c1681v = f11207a;
        JSONObject c10 = c1681v.c(applicationId);
        if (c10.length() != 0) {
            j(applicationId, c10);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, c10.toString()).apply();
            f11212f = Long.valueOf(System.currentTimeMillis());
        }
        c1681v.k();
        f11209c.set(false);
    }

    public static final synchronized JSONObject j(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (C1681v.class) {
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                jSONObject2 = (JSONObject) f11211e.get(applicationId);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                int i10 = 0;
                JSONObject jSONObject3 = null;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(EventKeys.DATA)) != null) {
                    jSONObject3 = optJSONArray.optJSONObject(0);
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        try {
                            JSONObject jSONObject4 = optJSONArray2.getJSONObject(i10);
                            jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean(EventKeys.VALUE_KEY));
                        } catch (JSONException e10) {
                            Y.j0("FacebookSDK", e10);
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                f11211e.put(applicationId, jSONObject2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONObject2;
    }

    public static final void l(a aVar) {
        aVar.a();
    }

    public static final JSONObject m(String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            Map map = f11211e;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = (JSONObject) map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject c10 = f11207a.c(applicationId);
        Context l10 = C4331C.l();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c10.toString()).apply();
        return j(applicationId, c10);
    }

    public final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(EventKeys.PLATFORM, Constants.PLATFORM_ANDROID);
        bundle.putString(EventKeys.SDK_VERSION_KEY, C4331C.B());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.c cVar = GraphRequest.f30314n;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        GraphRequest x10 = cVar.x(null, format, null);
        x10.J(bundle);
        JSONObject d10 = x10.k().d();
        return d10 == null ? new JSONObject() : d10;
    }

    public final Map e(String str) {
        g();
        if (str != null) {
            Map map = f11211e;
            if (map.containsKey(str)) {
                U7.b bVar = f11213g;
                List<U7.a> a10 = bVar == null ? null : bVar.a(str);
                if (a10 != null) {
                    HashMap hashMap = new HashMap();
                    for (U7.a aVar : a10) {
                        hashMap.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                U7.b bVar2 = f11213g;
                if (bVar2 == null) {
                    bVar2 = new U7.b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new U7.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                f11213g = bVar2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final boolean f(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000;
    }

    public final void g() {
        h(null);
    }

    public final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f11210d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVar = (a) concurrentLinkedQueue.poll();
            if (aVar != null) {
                handler.post(new Runnable() { // from class: T7.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1681v.l(C1681v.a.this);
                    }
                });
            }
        }
    }
}
