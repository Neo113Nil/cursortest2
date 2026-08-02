package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class T9 {
    Q6 a = new Q6();

    class a extends AbstractRunnableC2512ke {
        final /* synthetic */ EnumC2691ue b;

        a(EnumC2691ue enumC2691ue) {
            this.b = enumC2691ue;
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            T9.this.a.a(M6.g0, new JSONArray().put(this.b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(M6.u, (Object) jSONObject);
    }

    public void b() {
        this.a.a(M6.T0);
    }

    public void c(String str) {
        this.a.a(M6.L0, str);
    }

    public void d(String str) {
        this.a.a(M6.N0, str);
    }

    public void e(String str) {
        this.a.a(com.ironsource.mediationsdk.metadata.a.i, str);
    }

    public void f(String str) {
        this.a.a(M6.c1, str);
    }

    public void g(String str) {
        this.a.a(M6.A, str);
    }

    public void h(String str) {
        this.a.a("sid", str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(M6.e0, str);
    }

    public void a(boolean z) {
        this.a.a(M6.S0, Boolean.valueOf(z));
    }

    public void b(JSONObject jSONObject) {
        this.a.a(M6.h1, (Object) jSONObject);
    }

    public void c(int i) {
        this.a.a(M6.f0, Integer.valueOf(i));
    }

    public void a(List<String> list) {
        if (list != null) {
            this.a.a(M6.T0, (Object) new JSONArray((Collection) list));
        }
    }

    public void b(boolean z) {
        this.a.a("gpi", Boolean.valueOf(z));
    }

    public void a() {
        this.a.a(M6.S0);
    }

    public void b(int i) {
        if (i >= 0) {
            this.a.a(M6.V0, Integer.valueOf(i));
        }
    }

    public void a(Context context) {
        this.a.a(context);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(M6.F1, str);
    }

    public void a(Boolean bool) {
        this.a.a(M6.W0, bool);
    }

    public void a(EnumC2691ue enumC2691ue) {
        new Thread(new a(enumC2691ue)).start();
    }

    public void b(Context context) {
        InterfaceC2738x7 a2 = Jb.Y().a();
        ActivityManager.MemoryInfo o = a2.o(context);
        this.a.a(M6.w, a2.c(o));
        this.a.a(M6.x, a2.b(o));
    }

    public void a(P7 p7) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(M6.E, p7.a());
            hashMap.put(M6.D, p7.b());
            hashMap.put(M6.V, p7.c());
            this.a.a(hashMap);
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a("abt", str);
    }

    public void a(int i) {
        this.a.a(M6.j0, Integer.valueOf(i));
    }
}
