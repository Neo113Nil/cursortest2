package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class U9 {
    S6 a = new S6();

    public class a extends AbstractRunnableC4408ke {
        final /* synthetic */ EnumC4587ue b;

        public a(EnumC4587ue enumC4587ue) {
            this.b = enumC4587ue;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            U9.this.a.a(O6.g0, new JSONArray().put(this.b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(O6.u, (Object) jSONObject);
    }

    public void b() {
        this.a.a(O6.T0);
    }

    public void c(String str) {
        this.a.a(O6.L0, str);
    }

    public void d(String str) {
        this.a.a(O6.N0, str);
    }

    public void e(String str) {
        this.a.a(com.ironsource.mediationsdk.metadata.a.i, str);
    }

    public void f(String str) {
        this.a.a(O6.b1, str);
    }

    public void g(String str) {
        this.a.a(O6.A, str);
    }

    public void h(String str) {
        this.a.a(O6.e1, str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(O6.e0, str);
    }

    public void a(boolean z) {
        this.a.a(O6.S0, Boolean.valueOf(z));
    }

    public void b(JSONObject jSONObject) {
        this.a.a(O6.f1, (Object) jSONObject);
    }

    public void c(int i) {
        this.a.a(O6.f0, Integer.valueOf(i));
    }

    public void a(List<String> list) {
        if (list != null) {
            this.a.a(O6.T0, (Object) new JSONArray((Collection) list));
        }
    }

    public void b(int i) {
        if (i >= 0) {
            this.a.a(O6.V0, Integer.valueOf(i));
        }
    }

    public void a() {
        this.a.a(O6.S0);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(O6.D1, str);
    }

    public void a(Context context) {
        this.a.a(context);
    }

    public void a(Boolean bool) {
        this.a.a(O6.W0, bool);
    }

    public void b(Context context) {
        InterfaceC4652y7 a2 = Kb.Y().a();
        ActivityManager.MemoryInfo o = a2.o(context);
        this.a.a(O6.w, a2.c(o));
        this.a.a(O6.x, a2.b(o));
    }

    public void a(EnumC4587ue enumC4587ue) {
        new Thread(new a(enumC4587ue)).start();
    }

    public void a(Q7 q7) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(O6.E, q7.a());
            hashMap.put(O6.D, q7.b());
            hashMap.put(O6.V, q7.c());
            this.a.a(hashMap);
        } catch (Exception e) {
            C4452n4.d().a(e);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a("abt", str);
    }

    public void a(int i) {
        this.a.a(O6.j0, Integer.valueOf(i));
    }
}
