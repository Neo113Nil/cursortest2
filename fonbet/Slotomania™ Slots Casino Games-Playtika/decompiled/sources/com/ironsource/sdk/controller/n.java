package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C2556n4;
import com.ironsource.C2578o8;
import com.ironsource.InterfaceC2645s4;
import com.ironsource.InterfaceC2663t4;
import com.ironsource.InterfaceC2681u4;
import com.ironsource.Q7;
import com.ironsource.T4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class n implements l {
    private final Q7 a;
    private final String b;

    class a implements Runnable {
        final /* synthetic */ l.a a;
        final /* synthetic */ f.c b;

        a(l.a aVar, f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.a == null) {
                    return;
                }
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put("success", false);
                jsonObjectInit.put("reason", n.this.b);
                this.a.a(new f.a(this.b.f(), jsonObjectInit));
            } catch (JSONException e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ InterfaceC2681u4 a;
        final /* synthetic */ T4 b;

        b(InterfaceC2681u4 interfaceC2681u4, T4 t4) {
            this.a = interfaceC2681u4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C2578o8.e.RewardedVideo, this.b.h(), n.this.b);
        }
    }

    class c implements Runnable {
        final /* synthetic */ InterfaceC2681u4 a;
        final /* synthetic */ JSONObject b;

        c(InterfaceC2681u4 interfaceC2681u4, JSONObject jSONObject) {
            this.a = interfaceC2681u4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class d implements Runnable {
        final /* synthetic */ InterfaceC2663t4 a;
        final /* synthetic */ T4 b;

        d(InterfaceC2663t4 interfaceC2663t4, T4 t4) {
            this.a = interfaceC2663t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C2578o8.e.Interstitial, this.b.h(), n.this.b);
        }
    }

    class e implements Runnable {
        final /* synthetic */ InterfaceC2663t4 a;
        final /* synthetic */ String b;

        e(InterfaceC2663t4 interfaceC2663t4, String str) {
            this.a = interfaceC2663t4;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, n.this.b);
        }
    }

    class f implements Runnable {
        final /* synthetic */ InterfaceC2663t4 a;
        final /* synthetic */ T4 b;

        f(InterfaceC2663t4 interfaceC2663t4, T4 t4) {
            this.a = interfaceC2663t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b.h(), n.this.b);
        }
    }

    class g implements Runnable {
        final /* synthetic */ InterfaceC2663t4 a;
        final /* synthetic */ JSONObject b;

        g(InterfaceC2663t4 interfaceC2663t4, JSONObject jSONObject) {
            this.a = interfaceC2663t4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    class h implements Runnable {
        final /* synthetic */ InterfaceC2663t4 a;
        final /* synthetic */ T4 b;

        h(InterfaceC2663t4 interfaceC2663t4, T4 t4) {
            this.a = interfaceC2663t4;
            this.b = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.h(), n.this.b);
        }
    }

    class i implements Runnable {
        final /* synthetic */ InterfaceC2645s4 a;
        final /* synthetic */ Map b;

        i(InterfaceC2645s4 interfaceC2645s4, Map map) {
            this.a = interfaceC2645s4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c((String) this.b.get("demandSourceName"), n.this.b);
        }
    }

    class j implements Runnable {
        final /* synthetic */ InterfaceC2645s4 a;
        final /* synthetic */ JSONObject b;

        j(InterfaceC2645s4 interfaceC2645s4, JSONObject jSONObject) {
            this.a = interfaceC2645s4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    n(String str, Q7 q7) {
        this.a = q7;
        this.b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
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

    @Override // com.ironsource.sdk.controller.l
    public C2578o8.c h() {
        return C2578o8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4) {
        if (interfaceC2663t4 != null) {
            a(new f(interfaceC2663t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2681u4 interfaceC2681u4) {
        if (interfaceC2681u4 != null) {
            a(new b(interfaceC2681u4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2681u4 interfaceC2681u4) {
        if (interfaceC2681u4 != null) {
            a(new c(interfaceC2681u4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2663t4 interfaceC2663t4) {
        if (interfaceC2663t4 != null) {
            a(new d(interfaceC2663t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC2663t4 interfaceC2663t4) {
        if (interfaceC2663t4 != null) {
            a(new e(interfaceC2663t4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2663t4 interfaceC2663t4) {
        if (interfaceC2663t4 != null) {
            a(new g(interfaceC2663t4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4) {
        if (interfaceC2663t4 != null) {
            a(new h(interfaceC2663t4, t4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2645s4 interfaceC2645s4) {
        if (interfaceC2645s4 != null) {
            interfaceC2645s4.a(C2578o8.e.Banner, t4.h(), this.b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC2645s4 interfaceC2645s4) {
        if (interfaceC2645s4 != null) {
            a(new i(interfaceC2645s4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2645s4 interfaceC2645s4) {
        if (interfaceC2645s4 != null) {
            a(new j(interfaceC2645s4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    void a(Runnable runnable) {
        Q7 q7 = this.a;
        if (q7 != null) {
            q7.c(runnable);
        }
    }
}
