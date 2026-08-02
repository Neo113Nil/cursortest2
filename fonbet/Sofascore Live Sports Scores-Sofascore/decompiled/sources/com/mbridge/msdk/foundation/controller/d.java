package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    private static volatile d l;
    private int a;
    private Map<String, Object> b;
    private FastKV c;
    private boolean d = false;
    private String e;
    private String f;
    private String g;
    private Context h;
    private String i;
    private com.mbridge.msdk.preload.a j;
    private String k;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.h(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.e);
            new h(d.this.h).a();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    public class C1249d implements a.e {
        public C1249d() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements Runnable {
        final /* synthetic */ String a;

        public e(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e) {
                q0.b("SDKController", e.getMessage());
            }
            new k().b(d.this.h, this.a, d.this.f);
        }
    }

    private d() {
    }

    private void a(Context context) {
        String str;
        try {
            if (e() && this.c == null) {
                try {
                    this.c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.c = null;
                }
            }
            FastKV fastKV = this.c;
            String str2 = "";
            if (fastKV != null) {
                String string = fastKV.getString(k0.a("H+tU+bfPhM=="), "");
                String string2 = this.c.getString(k0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
                    com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(com.mbridge.msdk.foundation.controller.a.q);
                }
                if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
                    com.mbridge.msdk.foundation.same.a.V = string;
                    com.mbridge.msdk.foundation.same.a.g = string2;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(com.mbridge.msdk.foundation.controller.a.q, com.mbridge.msdk.foundation.same.a.g);
                } else {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                        return;
                    }
                    this.c.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    this.c.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                }
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    str2 = sharedPreferences.getString(k0.a("H+tU+bfPhM=="), "");
                    str = sharedPreferences.getString(k0.a("H+tU+Fz8"), "");
                } else {
                    str = "";
                }
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b");
                    com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(com.mbridge.msdk.foundation.controller.a.q);
                }
                if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.same.a.V = str2;
                    com.mbridge.msdk.foundation.same.a.g = str;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(com.mbridge.msdk.foundation.controller.a.q, com.mbridge.msdk.foundation.same.a.g);
                } else {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                        return;
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                        edit.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                        edit.apply();
                    }
                }
            }
            new com.mbridge.msdk.config.component.common.util.d().a();
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage(), th);
        }
    }

    private void c() {
        com.mbridge.msdk.foundation.controller.c.n().b(this.h);
        com.mbridge.msdk.foundation.controller.c.n().e(this.e);
        com.mbridge.msdk.foundation.controller.c.n().f(this.f);
        com.mbridge.msdk.foundation.controller.c.n().d(this.k);
        com.mbridge.msdk.foundation.controller.c.n().b(this.g);
        com.mbridge.msdk.foundation.controller.c.n().c(new C1249d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> g;
        Object newInstance;
        Object newInstance2;
        try {
            g f = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f == null || (g = f.g()) == null || g.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : g) {
                if (aVar.a() == 287) {
                    if (this.h != null && (newInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(newInstance, null);
                    }
                } else if (aVar.a() == 94 && (newInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(newInstance2, null);
                }
            }
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.timer.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), null);
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage(), th);
        }
    }

    public void b(String str) {
        if (this.j == null) {
            this.j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.b;
            if (map == null || map.size() <= 0 || !this.b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int intValue = ((Integer) this.b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (intValue == 0) {
                this.j.a(this.b, this.a);
                return;
            }
            if (1 == intValue) {
                this.j.a(this.b);
            } else if (2 == intValue) {
                this.j.b(this.b);
            } else {
                q0.b("SDKController", "unknow layout type in preload");
            }
        } catch (Exception e2) {
            q0.b("SDKController", e2.getMessage());
        }
    }

    public boolean e() {
        return true;
    }

    public void f() {
    }

    public void b() {
        a(this.h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            j.b();
        } catch (Exception unused) {
            q0.b("SDKController", "get app setting failed");
        }
        this.d = true;
    }

    public static d a() {
        if (l == null) {
            synchronized (d.class) {
                try {
                    if (l == null) {
                        l = new d();
                    }
                } finally {
                }
            }
        }
        return l;
    }

    public void a(Map map, Context context) {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.n().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.n().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.h = context.getApplicationContext();
            c();
            if (this.d) {
                return;
            }
            b();
            m0.l(context);
            long D0 = i.b().d(this.e).D0();
            if (D0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), D0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (i.b() == null) {
            return;
        }
        i b2 = i.b();
        if (b2 != null) {
            g f = b2.f(str);
            if (f != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = f.W();
                MBridgeConstans.OMID_JS_H5_URL = f.V();
                if (!TextUtils.isEmpty(f.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().i = f.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(f.w())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().m = f.w();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.a;
            }
        }
        if (i.b().i(str) && i.b().a(str, 1, (String) null)) {
            int a2 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0);
            com.mbridge.msdk.foundation.same.a.X = a2 == 0 ? 1 : 0;
            com.mbridge.msdk.foundation.same.a.Y = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("first_lau_time").longValue();
            if (a2 == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("first_lau_time", System.currentTimeMillis());
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                        return;
                    } else {
                        new k().b(this.h, str, this.f);
                        return;
                    }
                } catch (Throwable unused) {
                    new k().b(this.h, str, this.f);
                    return;
                }
            }
            new k().b(this.h, str, this.f);
        }
    }

    public void a(Map<String, Object> map, int i) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            q0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.b = map;
        this.a = i;
        String b2 = com.mbridge.msdk.foundation.controller.c.n().b();
        if (map != null) {
            b(b2);
        }
    }
}
