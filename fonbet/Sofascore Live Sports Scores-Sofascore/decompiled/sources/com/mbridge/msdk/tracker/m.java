package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    private static final ConcurrentHashMap<String, m> b = new ConcurrentHashMap<>();
    private final k a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.a.q().b();
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ e a;
        final /* synthetic */ JSONObject b;

        public b(e eVar, JSONObject jSONObject) {
            this.a = eVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.a.h().a(this.a);
                JSONObject jSONObject = this.b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] e = m.this.e();
                    this.b.put("track_time", e[0]);
                    this.b.put("track_count", e[1]);
                    this.a.a(this.b);
                }
                this.a.b(m.this.a.c().f);
                m.this.a.h().b(this.a);
            } catch (Exception unused) {
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                mVarArr[i] = it.next().getValue();
                i++;
            }
        } catch (Exception unused) {
        }
        return mVarArr;
    }

    public JSONObject c() {
        return this.a.p();
    }

    public void d(e eVar) {
        if (this.a.x() || eVar == null || !b(eVar)) {
            return;
        }
        JSONObject i = eVar.i();
        if (i != null && !i.has("ts")) {
            try {
                i.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
        }
        try {
            this.a.i().a(new b(eVar, i));
        } catch (Exception unused2) {
        }
    }

    public long[] e() {
        return this.a.h().a();
    }

    public String f() {
        return this.a.w();
    }

    public boolean g() {
        return !this.a.x();
    }

    public String h() {
        return g() ? d() : this.a.y();
    }

    public void i() {
        this.a.b();
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void a() {
        try {
            this.a.i().a(new a());
        } catch (Exception unused) {
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }

    public static m b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.remove(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.a.a(eVar);
    }

    public String d() {
        return this.a.t();
    }
}
