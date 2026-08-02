package com.mbridge.msdk.config.manager;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.c;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.zol;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private static volatile a m = null;
    private static final Object n = new Object();
    public static int o = 5000;
    public static int p = 5000;
    public static int q = 5000;
    public static int r = 3000;
    private volatile com.mbridge.msdk.config.component.pipeline.a b;
    private String i;
    private String j;
    private Map<String, Object> c = null;
    private com.mbridge.msdk.config.manager.callback.a d = null;
    private final String e = "g0.npc";
    protected final AtomicInteger f = new AtomicInteger(-1);
    private final AtomicBoolean g = new AtomicBoolean(false);
    private long h = 0;
    protected final AtomicReference<com.mbridge.msdk.config.component.common.util.a<Integer>> k = new AtomicReference<>(new com.mbridge.msdk.config.component.common.util.a());
    private final c l = new C1240a();
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a a = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.config.manager.a$a, reason: collision with other inner class name */
    public class C1240a extends c {
        public C1240a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v17, types: [java.util.Map] */
        @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
        public void a(String str, Object obj) {
            HashMap hashMap;
            int i = 2;
            if (TextUtils.isEmpty(str) || !str.equals("g0.npc")) {
                return;
            }
            String str2 = "";
            try {
                String valueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(valueOf) || valueOf.equalsIgnoreCase("null")) {
                    str2 = "Pipeline is null";
                    a.this.f.set(0);
                } else {
                    a.this.b.a(new e().a(valueOf));
                    if (!b.a.get()) {
                        if (a.this.c != null) {
                            hashMap = a.this.c;
                        } else {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(MBridgeConstans.APP_ID, a.this.i);
                            hashMap2.put("app_key", a.this.j);
                            hashMap = hashMap2;
                        }
                        b.a(com.mbridge.msdk.foundation.controller.c.n().d(), hashMap, a.this.d);
                    }
                    i = 1;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - a.this.h));
                hashMap3.put("result", Integer.valueOf(i));
                if (!TextUtils.isEmpty(str2)) {
                    hashMap3.put("reason", str2);
                }
                com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_end", hashMap3);
            } catch (Throwable th) {
                try {
                    str2 = th.getMessage();
                    q0.b("ComponentManager", th.getMessage());
                } finally {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - a.this.h));
                    hashMap4.put("result", 2);
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap4.put("reason", str2);
                    }
                    com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_end", hashMap4);
                }
            }
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, String str) {
        try {
            this.i = com.mbridge.msdk.foundation.controller.c.n().b();
            this.j = com.mbridge.msdk.foundation.controller.c.n().c();
            if (TextUtils.isEmpty(this.i)) {
                this.i = com.mbridge.msdk.config.component.common.util.b.a(context).a(MBridgeConstans.APP_ID, "");
            }
            if (TextUtils.isEmpty(this.j)) {
                this.j = com.mbridge.msdk.config.component.common.util.b.a(context).a("app_key", "");
            }
            if (TextUtils.isEmpty(this.i)) {
                this.g.compareAndSet(true, false);
                return;
            }
            Map<String, Object> a = !TextUtils.isEmpty(str) ? new e().a(str) : com.mbridge.msdk.config.component.common.util.c.b(this.i);
            if (a == null || a.isEmpty()) {
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.a(a.get("p_p_c_id")) <= 0) {
                this.f.set(0);
                return;
            }
            String valueOf = String.valueOf(a.get("p_p_c"));
            if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase("null")) {
                a(valueOf, this.i, this.j, a);
                return;
            }
            this.f.set(0);
        } catch (Throwable unused) {
            this.g.set(false);
        }
    }

    public static a c() {
        if (m == null) {
            synchronized (n) {
                try {
                    if (m == null) {
                        m = new a();
                    }
                } finally {
                }
            }
        }
        return m;
    }

    public boolean d() {
        if (this.f.get() == -1) {
            a("");
        }
        return this.f.get() > 0;
    }

    public boolean e() {
        return this.f.get() == 2;
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a b() {
        return this.a;
    }

    public void a(Map<String, Object> map, com.mbridge.msdk.config.manager.callback.a aVar) {
        if (map != null) {
            this.c = map;
        }
        this.d = aVar;
    }

    public void a() {
        this.c = null;
        this.d = null;
    }

    private synchronized void a(String str) {
        try {
            int i = 0;
            if (!TextUtils.isEmpty(str) && this.g.get()) {
                this.g.compareAndSet(true, false);
            }
            if (this.g.compareAndSet(false, true)) {
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                if (d == null) {
                    this.g.compareAndSet(true, false);
                } else {
                    com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new zol(i, this, d, str));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(String str, String str2, String str3, Map<String, Object> map) {
        a(map);
        if (this.f.get() == 1) {
            return;
        }
        this.f.set(1);
        if (this.b == null) {
            this.h = System.currentTimeMillis();
            this.a.a("g0.npc", (com.mbridge.msdk.config.dynamic.binddata.wrapper.b<String>) this.l);
            this.b = new com.mbridge.msdk.config.component.pipeline.a(str, this.a);
            HashMap hashMap = new HashMap();
            hashMap.put(MBridgeConstans.APP_ID, str2);
            hashMap.put("app_key", str3);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("app_setting", map);
            hashMap2.put("device_info", m0.k());
            hashMap.put("info", hashMap2);
            a(com.mbridge.msdk.config.component.common.util.c.a(), "c30", hashMap);
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_start", new HashMap());
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap(map);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("577"), str2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("id", str);
            if (hashMap2.containsKey("sdk_context")) {
                hashMap.put("sdk_context", hashMap2.get("sdk_context"));
                hashMap2.remove("sdk_context");
            }
            hashMap3.put("api_params", hashMap2);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("context_id", str);
            hashMap3.put("metrics", hashMap4);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("51"), hashMap3);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.a("_");
            bVar.b("922001");
            bVar.a(hashMap);
            if (this.b != null) {
                this.b.a(bVar);
            }
        } catch (Exception e) {
            q0.b("ComponentManager", "sendComponentEvent error: " + e.getMessage(), e);
        }
    }

    private void a(Map<String, Object> map) {
        try {
            if (map.containsKey("t_o_bi")) {
                String valueOf = String.valueOf(map.get("t_o_bi"));
                if (!TextUtils.isEmpty(valueOf) && TextUtils.isDigitsOnly(valueOf)) {
                    o = Integer.parseInt(valueOf) * 1000;
                }
            }
            if (map.containsKey("t_o_ar")) {
                String valueOf2 = String.valueOf(map.get("t_o_ar"));
                if (!TextUtils.isEmpty(valueOf2) && TextUtils.isDigitsOnly(valueOf2)) {
                    p = Integer.parseInt(valueOf2) * 1000;
                }
            }
            if (map.containsKey("t_o_al")) {
                String valueOf3 = String.valueOf(map.get("t_o_al"));
                if (!TextUtils.isEmpty(valueOf3) && TextUtils.isDigitsOnly(valueOf3)) {
                    q = Integer.parseInt(valueOf3) * 1000;
                }
            }
            if (map.containsKey("t_o_as")) {
                String valueOf4 = String.valueOf(map.get("t_o_as"));
                if (TextUtils.isEmpty(valueOf4) || !TextUtils.isDigitsOnly(valueOf4)) {
                    return;
                }
                r = Integer.parseInt(valueOf4) * 1000;
            }
        } catch (Throwable th) {
            q0.b("ComponentManager", "refreshTimeout error: " + th.getMessage(), th);
        }
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            a(str2);
            com.mbridge.msdk.config.component.common.util.c.b(str, str2);
        } catch (Throwable th) {
            q0.b("ComponentManager", th.getMessage());
        }
    }

    public boolean a(long j) {
        if (this.f.get() == 2) {
            return true;
        }
        try {
            Integer a = this.k.get().a(j);
            if (a != null) {
                if (a.intValue() == 2) {
                    return true;
                }
            }
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            q0.b("ComponentManager", "awaitComponentReady interrupted: " + e.getMessage(), e);
            return false;
        }
    }
}
