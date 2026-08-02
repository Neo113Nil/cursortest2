package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4452n4;
import com.ironsource.C4492p8;
import com.ironsource.InterfaceC4541s4;
import com.ironsource.InterfaceC4559t4;
import com.ironsource.InterfaceC4577u4;
import com.ironsource.R7;
import com.ironsource.T4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class n implements l {
    private final R7 a;
    private final String b;

    public class a implements Runnable {
        final /* synthetic */ l.a a;
        final /* synthetic */ f.c b;

        public a(l.a aVar, f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.b);
                this.a.a(new f.a(this.b.f(), jSONObject));
            } catch (JSONException e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ InterfaceC4577u4 a;
        final /* synthetic */ T4 b;

        public b(InterfaceC4577u4 interfaceC4577u4, T4 t4) {
            this.a = interfaceC4577u4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C4492p8.e.RewardedVideo, this.b.h(), n.this.b);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ InterfaceC4577u4 a;
        final /* synthetic */ JSONObject b;

        public c(InterfaceC4577u4 interfaceC4577u4, JSONObject jSONObject) {
            this.a = interfaceC4577u4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    public class d implements Runnable {
        final /* synthetic */ InterfaceC4559t4 a;
        final /* synthetic */ T4 b;

        public d(InterfaceC4559t4 interfaceC4559t4, T4 t4) {
            this.a = interfaceC4559t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C4492p8.e.Interstitial, this.b.h(), n.this.b);
        }
    }

    public class e implements Runnable {
        final /* synthetic */ InterfaceC4559t4 a;
        final /* synthetic */ String b;

        public e(InterfaceC4559t4 interfaceC4559t4, String str) {
            this.a = interfaceC4559t4;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, n.this.b);
        }
    }

    public class f implements Runnable {
        final /* synthetic */ InterfaceC4559t4 a;
        final /* synthetic */ T4 b;

        public f(InterfaceC4559t4 interfaceC4559t4, T4 t4) {
            this.a = interfaceC4559t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b.h(), n.this.b);
        }
    }

    public class g implements Runnable {
        final /* synthetic */ InterfaceC4559t4 a;
        final /* synthetic */ JSONObject b;

        public g(InterfaceC4559t4 interfaceC4559t4, JSONObject jSONObject) {
            this.a = interfaceC4559t4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    public class h implements Runnable {
        final /* synthetic */ InterfaceC4559t4 a;
        final /* synthetic */ T4 b;

        public h(InterfaceC4559t4 interfaceC4559t4, T4 t4) {
            this.a = interfaceC4559t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.h(), n.this.b);
        }
    }

    public class i implements Runnable {
        final /* synthetic */ InterfaceC4541s4 a;
        final /* synthetic */ Map b;

        public i(InterfaceC4541s4 interfaceC4541s4, Map map) {
            this.a = interfaceC4541s4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c((String) this.b.get("demandSourceName"), n.this.b);
        }
    }

    public class j implements Runnable {
        final /* synthetic */ InterfaceC4541s4 a;
        final /* synthetic */ JSONObject b;

        public j(InterfaceC4541s4 interfaceC4541s4, JSONObject jSONObject) {
            this.a = interfaceC4541s4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    public n(String str, R7 r7) {
        this.a = r7;
        this.b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C4492p8.c h() {
        return C4492p8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4) {
        if (interfaceC4559t4 != null) {
            a(new f(interfaceC4559t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4577u4 interfaceC4577u4) {
        if (interfaceC4577u4 != null) {
            a(new b(interfaceC4577u4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4577u4 interfaceC4577u4) {
        if (interfaceC4577u4 != null) {
            a(new c(interfaceC4577u4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4559t4 interfaceC4559t4) {
        if (interfaceC4559t4 != null) {
            a(new d(interfaceC4559t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4559t4 interfaceC4559t4) {
        if (interfaceC4559t4 != null) {
            a(new e(interfaceC4559t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4559t4 interfaceC4559t4) {
        if (interfaceC4559t4 != null) {
            a(new g(interfaceC4559t4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4) {
        if (interfaceC4559t4 != null) {
            a(new h(interfaceC4559t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4541s4 interfaceC4541s4) {
        if (interfaceC4541s4 != null) {
            interfaceC4541s4.a(C4492p8.e.Banner, t4.h(), this.b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4541s4 interfaceC4541s4) {
        if (interfaceC4541s4 != null) {
            a(new i(interfaceC4541s4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4541s4 interfaceC4541s4) {
        if (interfaceC4541s4 != null) {
            a(new j(interfaceC4541s4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    public void a(Runnable runnable) {
        R7 r7 = this.a;
        if (r7 != null) {
            r7.c(runnable);
        }
    }
}
