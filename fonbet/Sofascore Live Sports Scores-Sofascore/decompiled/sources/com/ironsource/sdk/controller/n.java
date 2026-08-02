package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4157k4;
import com.ironsource.C4197m8;
import com.ironsource.InterfaceC4247p4;
import com.ironsource.InterfaceC4265q4;
import com.ironsource.InterfaceC4282r4;
import com.ironsource.O7;
import com.ironsource.Q4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class n implements l {
    private final O7 a;
    private final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ InterfaceC4282r4 a;
        final /* synthetic */ Q4 b;

        public b(InterfaceC4282r4 interfaceC4282r4, Q4 q4) {
            this.a = interfaceC4282r4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C4197m8.e.RewardedVideo, this.b.h(), n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ InterfaceC4282r4 a;
        final /* synthetic */ JSONObject b;

        public c(InterfaceC4282r4 interfaceC4282r4, JSONObject jSONObject) {
            this.a = interfaceC4282r4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        final /* synthetic */ InterfaceC4265q4 a;
        final /* synthetic */ Q4 b;

        public d(InterfaceC4265q4 interfaceC4265q4, Q4 q4) {
            this.a = interfaceC4265q4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(C4197m8.e.Interstitial, this.b.h(), n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements Runnable {
        final /* synthetic */ InterfaceC4265q4 a;
        final /* synthetic */ String b;

        public e(InterfaceC4265q4 interfaceC4265q4, String str) {
            this.a = interfaceC4265q4;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        final /* synthetic */ InterfaceC4265q4 a;
        final /* synthetic */ Q4 b;

        public f(InterfaceC4265q4 interfaceC4265q4, Q4 q4) {
            this.a = interfaceC4265q4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b.h(), n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g implements Runnable {
        final /* synthetic */ InterfaceC4265q4 a;
        final /* synthetic */ JSONObject b;

        public g(InterfaceC4265q4 interfaceC4265q4, JSONObject jSONObject) {
            this.a = interfaceC4265q4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class h implements Runnable {
        final /* synthetic */ InterfaceC4265q4 a;
        final /* synthetic */ Q4 b;

        public h(InterfaceC4265q4 interfaceC4265q4, Q4 q4) {
            this.a = interfaceC4265q4;
            this.b = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d(this.b.h(), n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class i implements Runnable {
        final /* synthetic */ InterfaceC4247p4 a;
        final /* synthetic */ Map b;

        public i(InterfaceC4247p4 interfaceC4247p4, Map map) {
            this.a = interfaceC4247p4;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c((String) this.b.get("demandSourceName"), n.this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class j implements Runnable {
        final /* synthetic */ InterfaceC4247p4 a;
        final /* synthetic */ JSONObject b;

        public j(InterfaceC4247p4 interfaceC4247p4, JSONObject jSONObject) {
            this.a = interfaceC4247p4;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c(this.b.optString("demandSourceName"), n.this.b);
        }
    }

    public n(String str, O7 o7) {
        this.a = o7;
        this.b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4247p4 interfaceC4247p4) {
        if (interfaceC4247p4 != null) {
            interfaceC4247p4.a(C4197m8.e.Banner, q4.h(), this.b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4) {
        if (interfaceC4265q4 != null) {
            a(new f(interfaceC4265q4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public C4197m8.c h() {
        return C4197m8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
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
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4282r4 interfaceC4282r4) {
        if (interfaceC4282r4 != null) {
            a(new b(interfaceC4282r4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4282r4 interfaceC4282r4) {
        if (interfaceC4282r4 != null) {
            a(new c(interfaceC4282r4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4265q4 interfaceC4265q4) {
        if (interfaceC4265q4 != null) {
            a(new d(interfaceC4265q4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4265q4 interfaceC4265q4) {
        if (interfaceC4265q4 != null) {
            a(new e(interfaceC4265q4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4265q4 interfaceC4265q4) {
        if (interfaceC4265q4 != null) {
            a(new g(interfaceC4265q4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4) {
        if (interfaceC4265q4 != null) {
            a(new h(interfaceC4265q4, q4));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4247p4 interfaceC4247p4) {
        if (interfaceC4247p4 != null) {
            a(new i(interfaceC4247p4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4247p4 interfaceC4247p4) {
        if (interfaceC4247p4 != null) {
            a(new j(interfaceC4247p4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
        a(new a(aVar, cVar));
    }

    public void a(Runnable runnable) {
        O7 o7 = this.a;
        if (o7 != null) {
            o7.c(runnable);
        }
    }
}
