package com.mbridge.msdk.config.manager;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.config.component.common.metrics.b;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.c;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.dez0;

/* compiled from: ComponentManager.java */
/* loaded from: classes13.dex */
public class a {
    private static volatile a h = null;
    private static final Object i = new Object();
    public static int j = 5000;
    public static int k = 5000;
    private volatile com.mbridge.msdk.config.component.pipeline.a b;
    private Map<String, Object> c = null;
    private final String d = "g0.npc";
    private final AtomicInteger e = new AtomicInteger(-1);
    private long f = 0;
    private final c g = new C0258a();
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a a = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();

    /* compiled from: ComponentManager.java */
    /* renamed from: com.mbridge.msdk.config.manager.a$a, reason: collision with other inner class name */
    public class C0258a extends c {
        public C0258a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
        public void a(String str, Object obj) {
            if (TextUtils.isEmpty(str) || !str.equals("g0.npc")) {
                return;
            }
            try {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase("null")) {
                    a.this.b.a(new e().a(valueOf));
                    if (!com.mbridge.msdk.system.a.componentSDKInitFinish.get() && a.this.c != null) {
                        a.this.b(com.mbridge.msdk.config.component.common.util.c.a(), "c0", a.this.c);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - a.this.f));
                hashMap.put("result", Integer.valueOf(!TextUtils.isEmpty(valueOf) ? 1 : 2));
                b.a("m_pipe_init_end", hashMap);
            } catch (Throwable th) {
                q0.b("ComponentManager", th.getMessage());
            }
        }
    }

    private a() {
    }

    public boolean d() {
        if (this.e.get() == -1) {
            a("");
        }
        return this.e.get() == 1 && com.mbridge.msdk.system.a.componentSDKInitFinish.get();
    }

    public static a c() {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = new a();
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a b() {
        return this.a;
    }

    public void a(Map<String, Object> map) {
        if (map == null || d()) {
            return;
        }
        this.c = map;
    }

    public void b(String str, String str2, Map<String, Object> map) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("577"), str2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("id", str);
            if (map.containsKey("sdk_context")) {
                hashMap.put("sdk_context", map.get("sdk_context"));
                map.remove("sdk_context");
            }
            hashMap2.put("api_params", map);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("context_id", str);
            hashMap2.put("metrics", hashMap3);
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("51"), hashMap2);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.a(BundleUtil.UNDERLINE_TAG);
            bVar.b("922001");
            bVar.a(hashMap);
            if (this.b != null) {
                this.b.a(bVar);
            }
        } catch (Exception e) {
            q0.b("ComponentManager", "sendComponentEvent error: " + e.getMessage(), e);
        }
    }

    public void a() {
        this.c = null;
    }

    private synchronized void a(final String str) {
        final Context d = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d == null) {
            return;
        }
        final String b = com.mbridge.msdk.foundation.controller.c.n().b();
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: xsna.h8y0
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.manager.a.this.a(b, d, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Context context, String str2) {
        Map<String, Object> b;
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.config.component.common.util.b.a(context).a("app_id", "");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            b = new e().a(str2);
        } else {
            b = com.mbridge.msdk.config.component.common.util.c.b(str);
        }
        if (b == null || b.isEmpty()) {
            return;
        }
        if (com.mbridge.msdk.config.component.common.util.c.a(b.get("p_p_c_id")) <= 0) {
            this.e.set(0);
            return;
        }
        String valueOf = String.valueOf(b.get("p_p_c"));
        if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase("null")) {
            a(valueOf, str, b);
        } else {
            this.e.set(0);
        }
    }

    private void a(String str, String str2, Map<String, Object> map) {
        b(map);
        if (this.e.get() == 1) {
            return;
        }
        this.e.set(1);
        if (this.b == null) {
            this.f = System.currentTimeMillis();
            b.a("m_pipe_init_start", new HashMap());
            this.a.a("g0.npc", (com.mbridge.msdk.config.dynamic.binddata.wrapper.b<String>) this.g);
            this.b = new com.mbridge.msdk.config.component.pipeline.a(str, this.a);
            HashMap a = dez0.a("app_id", str2);
            HashMap hashMap = new HashMap();
            hashMap.put("app_setting", map);
            hashMap.put("device_info", m0.k());
            a.put("info", hashMap);
            b(com.mbridge.msdk.config.component.common.util.c.a(), "c30", a);
        }
    }

    private void b(Map<String, Object> map) {
        try {
            if (map.containsKey("t_o_bi")) {
                String valueOf = String.valueOf(map.get("t_o_bi"));
                if (!TextUtils.isEmpty(valueOf) && TextUtils.isDigitsOnly(valueOf)) {
                    j = Integer.parseInt(valueOf) * 1000;
                }
            }
            if (map.containsKey("t_o_ar")) {
                String valueOf2 = String.valueOf(map.get("t_o_ar"));
                if (TextUtils.isEmpty(valueOf2) || !TextUtils.isDigitsOnly(valueOf2)) {
                    return;
                }
                k = Integer.parseInt(valueOf2) * 1000;
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
}
