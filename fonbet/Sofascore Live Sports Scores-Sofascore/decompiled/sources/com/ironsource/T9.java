package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class T9 {
    P6 a = new P6();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends com.ironsource.environment.thread.a {
        final /* synthetic */ EnumC4310se b;

        public a(EnumC4310se enumC4310se) {
            this.b = enumC4310se;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            T9.this.a.a(L6.g0, new JSONArray().put(this.b.b()));
        }
    }

    public void a(@NotNull N7 n7) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(L6.E, n7.a());
            hashMap.put(L6.D, n7.b());
            hashMap.put(L6.V, n7.c());
            this.a.a(hashMap);
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }

    public void b(Context context) {
        InterfaceC4339u7 a2 = Ib.a0().a();
        ActivityManager.MemoryInfo o = a2.o(context);
        this.a.a(L6.w, a2.c(o));
        this.a.a(L6.x, a2.b(o));
    }

    public void c(int i) {
        this.a.a(L6.f0, Integer.valueOf(i));
    }

    public void d(String str) {
        this.a.a(L6.N0, str);
    }

    public void e(String str) {
        this.a.a(com.ironsource.mediationsdk.metadata.a.j, str);
    }

    public void f(String str) {
        this.a.a(L6.b1, str);
    }

    public void g(String str) {
        this.a.a(L6.A, str);
    }

    public void h(String str) {
        this.a.a(L6.e1, str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(L6.e0, str);
    }

    public void c(String str) {
        this.a.a(L6.L0, str);
    }

    public void b(JSONObject jSONObject) {
        this.a.a(L6.f1, (Object) jSONObject);
    }

    public void b(int i) {
        if (i >= 0) {
            this.a.a(L6.V0, Integer.valueOf(i));
        }
    }

    public void b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(L6.D1, str);
    }

    public void b() {
        this.a.a(L6.T0);
    }

    public void a(boolean z) {
        this.a.a(L6.S0, Boolean.valueOf(z));
    }

    public void a(List<String> list) {
        if (list != null) {
            this.a.a(L6.T0, (Object) new JSONArray((Collection) list));
        }
    }

    public void a() {
        this.a.a(L6.S0);
    }

    public void a(Context context) {
        this.a.a(context);
    }

    public void a(Boolean bool) {
        this.a.a(L6.W0, bool);
    }

    public void a(EnumC4310se enumC4310se) {
        new Thread(new a(enumC4310se)).start();
    }

    public void a(JSONObject jSONObject) {
        this.a.a(L6.u, (Object) jSONObject);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a("abt", str);
    }

    public void a(int i) {
        this.a.a(L6.j0, Integer.valueOf(i));
    }
}
