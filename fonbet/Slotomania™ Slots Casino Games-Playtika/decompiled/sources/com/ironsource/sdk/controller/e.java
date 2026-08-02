package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.B5;
import com.ironsource.C2323a4;
import com.ironsource.C2396e5;
import com.ironsource.C2459he;
import com.ironsource.C2556n4;
import com.ironsource.C2564nc;
import com.ironsource.C2578o8;
import com.ironsource.C2596p8;
import com.ironsource.C2614q8;
import com.ironsource.C2678u1;
import com.ironsource.C2703v8;
import com.ironsource.C2717w4;
import com.ironsource.C2721w8;
import com.ironsource.C2735x4;
import com.ironsource.InterfaceC2645s4;
import com.ironsource.InterfaceC2663t4;
import com.ironsource.InterfaceC2681u4;
import com.ironsource.Jb;
import com.ironsource.L3;
import com.ironsource.Mb;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.Q7;
import com.ironsource.T4;
import com.ironsource.U4;
import com.ironsource.U5;
import com.ironsource.V5;
import com.ironsource.X3;
import com.ironsource.X6;
import com.ironsource.Z6;
import com.ironsource.Zg;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private CountDownTimer d;
    private final Q7 g;
    private final Zg h;
    private final C2564nc k;
    private final String a = "e";
    private C2578o8.b c = C2578o8.b.None;
    private final L3 e = new L3("NativeCommandExecutor");
    private final L3 f = new L3("ControllerCommandsExecutor");
    private final Map<String, l.a> i = new HashMap();
    private final Map<String, l.b> j = new HashMap();

    class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC2663t4 b;

        a(JSONObject jSONObject, InterfaceC2663t4 interfaceC2663t4) {
            this.a = jSONObject;
            this.b = interfaceC2663t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC2663t4 c;

        b(T4 t4, Map map, InterfaceC2663t4 interfaceC2663t4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC2663t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC2645s4 d;

        c(String str, String str2, T4 t4, InterfaceC2645s4 interfaceC2645s4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC2645s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC2645s4 b;

        d(JSONObject jSONObject, InterfaceC2645s4 interfaceC2645s4) {
            this.a = jSONObject;
            this.b = interfaceC2645s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC0220e implements Runnable {
        final /* synthetic */ T4 a;

        RunnableC0220e(T4 t4) {
            this.a = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ T4 a;

        f(T4 t4) {
            this.a = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC2645s4 c;

        g(T4 t4, Map map, InterfaceC2645s4 interfaceC2645s4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC2645s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    class h implements Runnable {
        final /* synthetic */ l.a a;
        final /* synthetic */ f.c b;

        h(l.a aVar, f.c cVar) {
            this.a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if (eVar.b != null) {
                if (this.a != null) {
                    eVar.i.put(this.b.f(), this.a);
                }
                e.this.b.a(this.b, this.a);
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ JSONObject a;

        i(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a();
                e.this.b = null;
            }
        }
    }

    class k extends CountDownTimer {
        k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Global Controller Timer Finish");
            e.this.d(X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    class m implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        m(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                eVar.b = eVar.b(eVar.h.b(), e.this.h.d(), e.this.h.f(), e.this.h.e(), e.this.h.g(), e.this.h.c(), this.a, this.b);
                e.this.b.b();
            } catch (Throwable th) {
                C2556n4.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    class n extends CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class o implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC2681u4 d;

        o(String str, String str2, T4 t4, InterfaceC2681u4 interfaceC2681u4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC2681u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class p implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC2681u4 b;

        p(JSONObject jSONObject, InterfaceC2681u4 interfaceC2681u4) {
            this.a = jSONObject;
            this.b = interfaceC2681u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class q implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC2663t4 d;

        q(String str, String str2, T4 t4, InterfaceC2663t4 interfaceC2663t4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC2663t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    class r implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC2663t4 b;

        r(String str, InterfaceC2663t4 interfaceC2663t4) {
            this.a = str;
            this.b = interfaceC2663t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    class s implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC2663t4 c;

        s(T4 t4, Map map, InterfaceC2663t4 interfaceC2663t4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC2663t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2703v8.a(C2459he.j, new C2614q8().a(B5.v, this.a.f()).a("producttype", C2721w8.a(this.a, C2578o8.e.Interstitial)).a(B5.x, Boolean.valueOf(C2721w8.a(this.a))).a(B5.I, Long.valueOf(N.a.b(this.a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a, this.b, this.c);
            }
        }
    }

    public e(Context context, C2323a4 c2323a4, U4 u4, Q7 q7, int i2, JSONObject jSONObject, String str, String str2, C2564nc c2564nc) {
        this.k = c2564nc;
        this.g = q7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C2396e5 a2 = C2396e5.a(networkStorageDir, q7, jSONObject);
        this.h = new Zg(context, c2323a4, u4, i2, a2, networkStorageDir);
        a(context, c2323a4, u4, i2, a2, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C2323a4 c2323a4, U4 u4, int i2, C2396e5 c2396e5, String str, String str2, String str3) {
        try {
            v b2 = b(context, c2323a4, u4, i2, c2396e5, str, str2, str3);
            try {
                this.b = b2;
                b2.b();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                C2556n4.d().a(th2);
                d(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C2703v8.a(C2459he.d, new C2614q8().a(B5.A, str).a());
        this.c = C2578o8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        Q7 q7 = this.g;
        if (q7 != null) {
            q7.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C2596p8(1001, str));
    }

    private l.a i() {
        return new l.a() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                e.this.a(aVar);
            }
        };
    }

    private l.b j() {
        return new l.b() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Mb mb) {
                e.this.a(mb);
            }
        };
    }

    private void l() {
        Logger.i(this.a, "handleReadyState");
        this.c = C2578o8.b.Ready;
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f.c();
        this.f.a();
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return C2578o8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public C2578o8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : C2578o8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a remove = this.i.remove(aVar.c());
        if (remove != null) {
            remove.a(aVar);
        }
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, C2323a4 c2323a4, U4 u4, int i2, C2396e5 c2396e5, String str, String str2, String str3) throws Throwable {
        C2703v8.a(C2459he.c, new C2614q8().a(B5.y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, u4, c2323a4, this, this.g, i2, c2396e5, str, i(), j(), str2, str3);
        V5 v5 = new V5(context, c2396e5, new U5(this.g.a()), new Nb(c2396e5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c2396e5.a(), v5));
        vVar.a(new C2678u1());
        vVar.a(new C2735x4(context, new C2717w4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Mb mb) {
        l.b bVar = this.j.get(mb.d());
        if (bVar != null) {
            bVar.a(mb);
        }
    }

    private void a(Runnable runnable, long j2) {
        Q7 q7 = this.g;
        if (q7 != null) {
            q7.d(runnable, j2);
        } else {
            Logger.e(this.a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C2323a4 c2323a4, final U4 u4, final int i2, final C2396e5 c2396e5, final String str, final String str2, final String str3) {
        int A = Jb.Y().h().A();
        if (A > 0) {
            C2703v8.a(C2459he.B, new C2614q8().a(B5.y, String.valueOf(A)).a());
        }
        Runnable runnable = new Runnable() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                e.this.c(context, c2323a4, u4, i2, c2396e5, str, str2, str3);
            }
        };
        if (Jb.Y().h().s()) {
            this.g.b(runnable, A);
        } else {
            a(runnable, A);
        }
        this.d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.a, "handleControllerLoaded");
        this.c = C2578o8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.a, "handleControllerReady ");
        this.k.a(h());
        if (C2578o8.c.Web.equals(h())) {
            C2703v8.a(C2459he.e, new C2614q8().a(B5.y, String.valueOf(this.h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.a, "handleControllerFailed ");
        C2614q8 c2614q8 = new C2614q8();
        c2614q8.a(B5.A, str);
        c2614q8.a(B5.y, String.valueOf(this.h.l()));
        C2703v8.a(C2459he.o, c2614q8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C2703v8.a(C2459he.y, new C2614q8().a(B5.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4) {
        this.f.a(new s(t4, map, interfaceC2663t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
        this.f.a(new f(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f.a(new i(jSONObject));
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.InterfaceC2344b7
    public void a(X6 x6) {
        Z6 b2 = x6.b();
        if (b2 == Z6.SendEvent) {
            C2703v8.a(C2459he.A, new C2614q8().a(B5.y, x6.a() + " : strategy: " + b2).a());
            return;
        }
        if (b2 == Z6.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(x6.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            C2703v8.a(C2459he.d, new C2614q8().a(B5.A, x6.a() + " : strategy: " + b2).a());
            C2703v8.a(C2459he.A, new C2614q8().a(B5.y, x6.a() + " : strategy: " + b2).a());
        }
    }

    private void a(C2578o8.e eVar, T4 t4, String str, String str2) {
        Logger.i(this.a, "recoverWebController for product: " + eVar.toString());
        C2614q8 c2614q8 = new C2614q8();
        c2614q8.a("producttype", eVar.toString());
        c2614q8.a(B5.v, t4.f());
        C2703v8.a(C2459he.b, c2614q8.a());
        this.h.n();
        a();
        m mVar = new m(str, str2);
        if (Jb.Y().h().s()) {
            this.g.b(mVar);
        } else {
            b(mVar);
        }
        this.d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2681u4 interfaceC2681u4) {
        if (this.h.a(h(), this.c)) {
            a(C2578o8.e.RewardedVideo, t4, str, str2);
        }
        this.f.a(new o(str, str2, t4, interfaceC2681u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2681u4 interfaceC2681u4) {
        this.f.a(new p(jSONObject, interfaceC2681u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2663t4 interfaceC2663t4) {
        if (this.h.a(h(), this.c)) {
            a(C2578o8.e.Interstitial, t4, str, str2);
        }
        this.f.a(new q(str, str2, t4, interfaceC2663t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC2663t4 interfaceC2663t4) {
        Logger.i(this.a, "load interstitial");
        this.f.a(new r(str, interfaceC2663t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2663t4 interfaceC2663t4) {
        this.f.a(new a(jSONObject, interfaceC2663t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4) {
        this.f.a(new b(t4, map, interfaceC2663t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC2645s4 interfaceC2645s4) {
        if (this.h.a(h(), this.c)) {
            a(C2578o8.e.Banner, t4, str, str2);
        }
        this.f.a(new c(str, str2, t4, interfaceC2645s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC2645s4 interfaceC2645s4) {
        this.f.a(new d(jSONObject, interfaceC2645s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4) {
        this.f.a(new RunnableC0220e(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC2645s4 interfaceC2645s4) {
        this.f.a(new g(t4, map, interfaceC2645s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        this.f.a(new h(aVar, cVar));
    }

    public void a(String str, l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        Logger.i(this.a, "destroy controller");
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        L3 l3 = this.f;
        if (l3 != null) {
            l3.b();
        }
        this.d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.b.a(activity);
    }
}
