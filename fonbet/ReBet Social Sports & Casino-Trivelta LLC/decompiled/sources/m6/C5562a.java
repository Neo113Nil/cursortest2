package m6;

import T7.A;
import T7.C1682w;
import T7.Y;
import g6.C4331C;
import h6.C4478e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5562a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f56378b;

    /* renamed from: a, reason: collision with root package name */
    public static final C5562a f56377a = new C5562a();

    /* renamed from: c, reason: collision with root package name */
    public static final List f56379c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final Set f56380d = new HashSet();

    /* renamed from: m6.a$a, reason: collision with other inner class name */
    public static final class C0814a {

        /* renamed from: a, reason: collision with root package name */
        public String f56381a;

        /* renamed from: b, reason: collision with root package name */
        public List f56382b;

        public C0814a(String eventName, List deprecateParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.f56381a = eventName;
            this.f56382b = deprecateParams;
        }

        public final List a() {
            return this.f56382b;
        }

        public final String b() {
            return this.f56381a;
        }

        public final void c(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f56382b = list;
        }
    }

    public static final void a() {
        if (Y7.a.d(C5562a.class)) {
            return;
        }
        try {
            f56378b = true;
            f56377a.b();
        } catch (Throwable th2) {
            Y7.a.b(th2, C5562a.class);
        }
    }

    public static final void c(Map parameters, String eventName) {
        if (Y7.a.d(C5562a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f56378b) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (C0814a c0814a : new ArrayList(f56379c)) {
                    if (Intrinsics.areEqual(c0814a.b(), eventName)) {
                        for (String str : arrayList) {
                            if (c0814a.a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C5562a.class);
        }
    }

    public static final void d(List events) {
        if (Y7.a.d(C5562a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (f56378b) {
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    if (f56380d.contains(((C4478e) it.next()).f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C5562a.class);
        }
    }

    public final synchronized void b() {
        C1682w q10;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            A a10 = A.f10965a;
            q10 = A.q(C4331C.m(), false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return;
        }
        if (q10 == null) {
            return;
        }
        String l10 = q10.l();
        if (l10 != null && l10.length() > 0) {
            JSONObject jSONObject = new JSONObject(l10);
            f56379c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        Set set = f56380d;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        set.add(key);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        C0814a c0814a = new C0814a(key, new ArrayList());
                        if (optJSONArray != null) {
                            c0814a.c(Y.m(optJSONArray));
                        }
                        f56379c.add(c0814a);
                    }
                }
            }
        }
    }
}
