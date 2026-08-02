package com.mbridge.msdk.setting;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import com.vk.core.preference.Preference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.fp;
import xsna.h0;
import xsna.pzl;

/* compiled from: SettingManager.java */
/* loaded from: classes14.dex */
public class i {
    public static final String a = "i";
    private static volatile i b;
    private static volatile g c;
    private static volatile String d;
    private static HashMap<String, m> e = new HashMap<>();
    private static AtomicBoolean f = new AtomicBoolean(false);

    private i() {
    }

    public static i b() {
        if (b == null) {
            synchronized (i.class) {
                try {
                    if (b == null) {
                        b = new i();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public g c() {
        return c != null ? c : a();
    }

    public g d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g f2 = f(str);
            return f2 == null ? a() : f2;
        } catch (Exception unused) {
            return a();
        }
    }

    public String e(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public g f(String str) {
        if (c == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    b(str);
                }
            } catch (Exception e2) {
                q0.b(a, e2.getMessage());
            }
        }
        return c;
    }

    public boolean g(String str, String str2) {
        g f2 = f(str2);
        if (i(str2) && a(str2, 1, str)) {
            new k().b(com.mbridge.msdk.foundation.controller.c.n().d(), str2, com.mbridge.msdk.foundation.controller.c.n().c());
        }
        m e2 = e(str2, str);
        if (f2 != null && e2 != null) {
            long w0 = f2.w0() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long o = e2.o() + w0;
            if (o > currentTimeMillis) {
                String str3 = a;
                StringBuilder b2 = fp.b(o, "unit setting  nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                b2.append(currentTimeMillis);
                b2.append(X3.j.e);
                q0.c(str3, b2.toString());
                return false;
            }
        }
        q0.c(a, "unit setting timeout or not exists");
        return true;
    }

    public String h(String str) {
        g f2 = f(str);
        if (f2 == null) {
            return "0";
        }
        int f0 = f2.f0();
        String e0 = f2.e0();
        return (f0 <= 0 || !(!TextUtils.isEmpty(e0) && !e0.equalsIgnoreCase("null"))) ? "0" : "1";
    }

    public boolean i(String str) {
        g f2 = f(str);
        if (f2 != null) {
            long C = f2.C() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long x = f2.x() + C;
            if (x > currentTimeMillis) {
                String str2 = a;
                StringBuilder b2 = fp.b(x, "app setting nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                b2.append(currentTimeMillis);
                b2.append(X3.j.e);
                q0.c(str2, b2.toString());
                return false;
            }
        }
        q0.c(a, "app setting timeout or not exists");
        return true;
    }

    public void j(String str, String str2) {
        try {
            String a2 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + BundleUtil.UNDERLINE_TAG + str2);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a2);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    public void k(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public void l(String str) {
        try {
            String g = g(str);
            if (TextUtils.isEmpty(g)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(g);
            jSONObject.put("current_time", System.currentTimeMillis());
            h(str, jSONObject.toString());
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, String str) {
        FastKV build;
        Map<String, Object> map = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                build = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
            }
            if (build != null) {
                try {
                    Map<String, ?> all = Preference.h(context, 0, "mbridge").getAll();
                    for (String str2 : all.keySet()) {
                        if (str2.startsWith(str + BundleUtil.UNDERLINE_TAG)) {
                            e.put(str2, m.l((String) all.get(str2)));
                        }
                    }
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            try {
                map = build.getAll();
            } catch (Exception unused2) {
            }
            if (map != null) {
                try {
                    for (String str3 : map.keySet()) {
                        if (str3.startsWith(str + BundleUtil.UNDERLINE_TAG)) {
                            e.put(str3, m.l((String) map.get(str3)));
                        }
                    }
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            return;
        }
        build = null;
        if (build != null) {
        }
    }

    public m e(String str, String str2) {
        m b2 = b(str, str2);
        if (b2 != null && b2.L() == 0) {
            b2.d(1);
        }
        return b2;
    }

    public m c(String str, String str2) {
        m a2 = a(str, str2);
        return a2 == null ? m.N() : a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void j(String str) {
        try {
            String a2 = com.mbridge.msdk.config.component.common.util.c.a(str);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a2);
            if (jSONObject.has("b")) {
                jSONObject.remove("b");
            }
            if (jSONObject.has("c")) {
                jSONObject.remove("c");
            }
            h.a(jSONObject);
            d = jSONObject.toString();
            c = g.F(d);
            if (c != null) {
                c.Q0();
            }
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    public m d(String str, String str2) {
        m e2 = e(str, str2);
        return e2 == null ? m.N() : e2;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(pzl.b(str, BundleUtil.UNDERLINE_TAG, str2));
    }

    public void h(String str, String str2) {
        String a2 = h.a(str2);
        d = a2;
        c = g.F(a2);
        if (c != null) {
            c.Q0();
        }
        com.mbridge.msdk.config.manager.a.c().a(str, a2);
        j.a(c);
        g0.a().a(c.S());
    }

    private m b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
        }
        String b2 = pzl.b(str, BundleUtil.UNDERLINE_TAG, str2);
        if (e.containsKey(b2)) {
            return e.get(b2);
        }
        m mVar = null;
        try {
            mVar = m.l(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(b2));
            e.put(b2, mVar);
            return mVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return mVar;
        }
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public String g(String str) {
        if (str == null) {
            return "";
        }
        try {
            return TextUtils.isEmpty(d) ? "" : d;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return "";
        }
    }

    public void a(String str) {
        j.a(str, this);
    }

    public g a() {
        return j.a();
    }

    public m a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i, String str2) {
        try {
            Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
            String str3 = str + BundleUtil.UNDERLINE_TAG + i + BundleUtil.UNDERLINE_TAG + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long longValue = ((Long) y0.a(d2, str3, 0L)).longValue();
            g f2 = f(str);
            if (f2 == null) {
                f2 = b().a();
            } else {
                j = longValue;
            }
            if ((f2.r0() * 1000) + j > currentTimeMillis) {
                return false;
            }
            y0.b(d2, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void b(String str) {
        if (f.get()) {
            return;
        }
        try {
            f.compareAndSet(false, true);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new h0(6, this, str));
            } else {
                j(str);
            }
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String b2 = pzl.b(str, BundleUtil.UNDERLINE_TAG, str2);
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(b2, str3);
        e.put(b2, m.l(str3));
    }
}
