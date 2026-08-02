package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.B5;
import com.ironsource.C4219a4;
import com.ironsource.C4292e5;
import com.ironsource.C4355he;
import com.ironsource.C4452n4;
import com.ironsource.C4478oc;
import com.ironsource.C4492p8;
import com.ironsource.C4510q8;
import com.ironsource.C4527r8;
import com.ironsource.C4574u1;
import com.ironsource.C4613w4;
import com.ironsource.C4617w8;
import com.ironsource.C4631x4;
import com.ironsource.C4635x8;
import com.ironsource.EnumC4222a7;
import com.ironsource.InterfaceC4541s4;
import com.ironsource.InterfaceC4559t4;
import com.ironsource.InterfaceC4577u4;
import com.ironsource.Kb;
import com.ironsource.L3;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.Ob;
import com.ironsource.R7;
import com.ironsource.T4;
import com.ironsource.U4;
import com.ironsource.W5;
import com.ironsource.X3;
import com.ironsource.X5;
import com.ironsource.Y6;
import com.ironsource.fh;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* loaded from: classes13.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private CountDownTimer d;
    private final R7 g;
    private final fh h;
    private final C4478oc k;
    private final String a = Logger.METHOD_E;
    private C4492p8.b c = C4492p8.b.None;
    private final L3 e = new L3("NativeCommandExecutor");
    private final L3 f = new L3("ControllerCommandsExecutor");
    private final Map<String, l.a> i = new HashMap();
    private final Map<String, l.b> j = new HashMap();

    public class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4559t4 b;

        public a(JSONObject jSONObject, InterfaceC4559t4 interfaceC4559t4) {
            this.a = jSONObject;
            this.b = interfaceC4559t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4559t4 c;

        public b(T4 t4, Map map, InterfaceC4559t4 interfaceC4559t4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC4559t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC4541s4 d;

        public c(String str, String str2, T4 t4, InterfaceC4541s4 interfaceC4541s4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC4541s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4541s4 b;

        public d(JSONObject jSONObject, InterfaceC4541s4 interfaceC4541s4) {
            this.a = jSONObject;
            this.b = interfaceC4541s4;
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
    public class RunnableC0231e implements Runnable {
        final /* synthetic */ T4 a;

        public RunnableC0231e(T4 t4) {
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

    public class f implements Runnable {
        final /* synthetic */ T4 a;

        public f(T4 t4) {
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

    public class g implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4541s4 c;

        public g(T4 t4, Map map, InterfaceC4541s4 interfaceC4541s4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC4541s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    public class h implements Runnable {
        final /* synthetic */ l.a a;
        final /* synthetic */ f.c b;

        public h(l.a aVar, f.c cVar) {
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

    public class i implements Runnable {
        final /* synthetic */ JSONObject a;

        public i(JSONObject jSONObject) {
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

    public class j implements Runnable {
        public j() {
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

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    public class m implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public m(String str, String str2) {
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
                C4452n4.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    public class o implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC4577u4 d;

        public o(String str, String str2, T4 t4, InterfaceC4577u4 interfaceC4577u4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC4577u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    public class p implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4577u4 b;

        public p(JSONObject jSONObject, InterfaceC4577u4 interfaceC4577u4) {
            this.a = jSONObject;
            this.b = interfaceC4577u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    public class q implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ T4 c;
        final /* synthetic */ InterfaceC4559t4 d;

        public q(String str, String str2, T4 t4, InterfaceC4559t4 interfaceC4559t4) {
            this.a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC4559t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    public class r implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC4559t4 b;

        public r(String str, InterfaceC4559t4 interfaceC4559t4) {
            this.a = str;
            this.b = interfaceC4559t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    public class s implements Runnable {
        final /* synthetic */ T4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4559t4 c;

        public s(T4 t4, Map map, InterfaceC4559t4 interfaceC4559t4) {
            this.a = t4;
            this.b = map;
            this.c = interfaceC4559t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4617w8.a(C4355he.j, new C4527r8().a(B5.v, this.a.f()).a(B5.w, C4635x8.a(this.a, C4492p8.e.Interstitial)).a(B5.x, Boolean.valueOf(C4635x8.a(this.a))).a(B5.I, Long.valueOf(N.a.b(this.a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a, this.b, this.c);
            }
        }
    }

    public e(Context context, C4219a4 c4219a4, U4 u4, R7 r7, int i2, JSONObject jSONObject, String str, String str2, C4478oc c4478oc) {
        this.k = c4478oc;
        this.g = r7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C4292e5 a2 = C4292e5.a(networkStorageDir, r7, jSONObject);
        this.h = new fh(context, c4219a4, u4, i2, a2, networkStorageDir);
        a(context, c4219a4, u4, i2, a2, networkStorageDir, str, str2);
    }

    private void l() {
        com.ironsource.sdk.utils.Logger.i(this.a, "handleReadyState");
        this.c = C4492p8.b.Ready;
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
        return C4492p8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, C4219a4 c4219a4, U4 u4, int i2, C4292e5 c4292e5, String str, String str2, String str3) {
        try {
            v b2 = b(context, c4219a4, u4, i2, c4292e5, str, str2, str3);
            try {
                this.b = b2;
                b2.b();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                C4452n4.d().a(th2);
                d(Log.getStackTraceString(th2));
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C4617w8.a(C4355he.d, new C4527r8().a(B5.A, str).a());
        this.c = C4492p8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        R7 r7 = this.g;
        if (r7 != null) {
            r7.c(new l());
        }
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C4510q8(1001, str));
    }

    private l.a i() {
        return new l.a() { // from class: xsna.hsy0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                com.ironsource.sdk.controller.e.this.a(aVar);
            }
        };
    }

    private l.b j() {
        return new l.b() { // from class: xsna.jsy0
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb) {
                com.ironsource.sdk.controller.e.this.a(nb);
            }
        };
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
    public C4492p8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : C4492p8.c.None;
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
    public v b(Context context, C4219a4 c4219a4, U4 u4, int i2, C4292e5 c4292e5, String str, String str2, String str3) throws Throwable {
        C4617w8.a(C4355he.c, new C4527r8().a(B5.y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, u4, c4219a4, this, this.g, i2, c4292e5, str, i(), j(), str2, str3);
        X5 x5 = new X5(context, c4292e5, new W5(this.g.a()), new Ob(c4292e5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c4292e5.a(), x5));
        vVar.a(new C4574u1());
        vVar.a(new C4631x4(context, new C4613w4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Nb nb) {
        l.b bVar = this.j.get(nb.d());
        if (bVar != null) {
            bVar.a(nb);
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        com.ironsource.sdk.utils.Logger.i(this.a, "handleControllerLoaded");
        this.c = C4492p8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    private void a(Runnable runnable, long j2) {
        R7 r7 = this.g;
        if (r7 != null) {
            r7.d(runnable, j2);
        } else {
            com.ironsource.sdk.utils.Logger.e(this.a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final C4219a4 c4219a4, final U4 u4, final int i2, final C4292e5 c4292e5, final String str, final String str2, final String str3) {
        int C = Kb.Y().h().C();
        if (C > 0) {
            C4617w8.a(C4355he.B, new C4527r8().a(B5.y, String.valueOf(C)).a());
        }
        Runnable runnable = new Runnable() { // from class: xsna.esy0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.sdk.controller.e.this.c(context, c4219a4, u4, i2, c4292e5, str, str2, str3);
            }
        };
        if (Kb.Y().h().s()) {
            this.g.b(runnable, C);
        } else {
            a(runnable, C);
        }
        this.d = new k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        com.ironsource.sdk.utils.Logger.i(this.a, "handleControllerFailed ");
        C4527r8 c4527r8 = new C4527r8();
        c4527r8.a(B5.A, str);
        c4527r8.a(B5.y, String.valueOf(this.h.l()));
        C4617w8.a(C4355he.o, c4527r8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            com.ironsource.sdk.utils.Logger.i(this.a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        com.ironsource.sdk.utils.Logger.i(this.a, "handleControllerReady ");
        this.k.a(h());
        if (C4492p8.c.Web.equals(h())) {
            C4617w8.a(C4355he.e, new C4527r8().a(B5.y, String.valueOf(this.h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.ironsource.InterfaceC4258c7
    public void a(Y6 y6) {
        EnumC4222a7 b2 = y6.b();
        if (b2 == EnumC4222a7.SendEvent) {
            C4617w8.a(C4355he.A, new C4527r8().a(B5.y, y6.a() + " : strategy: " + b2).a());
            return;
        }
        if (b2 == EnumC4222a7.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(y6.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            C4617w8.a(C4355he.d, new C4527r8().a(B5.A, y6.a() + " : strategy: " + b2).a());
            C4617w8.a(C4355he.A, new C4527r8().a(B5.y, y6.a() + " : strategy: " + b2).a());
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C4617w8.a(C4355he.y, new C4527r8().a(B5.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    public class k extends CountDownTimer {
        public k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.ironsource.sdk.utils.Logger.i(e.this.a, "Global Controller Timer Finish");
            e.this.d(X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    public class n extends CountDownTimer {
        public n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.ironsource.sdk.utils.Logger.i(e.this.a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4) {
        this.f.a(new s(t4, map, interfaceC4559t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(T4 t4) {
        this.f.a(new f(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        this.f.a(new i(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    private void a(C4492p8.e eVar, T4 t4, String str, String str2) {
        com.ironsource.sdk.utils.Logger.i(this.a, "recoverWebController for product: " + eVar.toString());
        C4527r8 c4527r8 = new C4527r8();
        c4527r8.a(B5.w, eVar.toString());
        c4527r8.a(B5.v, t4.f());
        C4617w8.a(C4355he.b, c4527r8.a());
        this.h.n();
        a();
        m mVar = new m(str, str2);
        if (Kb.Y().h().s()) {
            this.g.b(mVar);
        } else {
            b(mVar);
        }
        this.d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4577u4 interfaceC4577u4) {
        if (this.h.a(h(), this.c)) {
            a(C4492p8.e.RewardedVideo, t4, str, str2);
        }
        this.f.a(new o(str, str2, t4, interfaceC4577u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4577u4 interfaceC4577u4) {
        this.f.a(new p(jSONObject, interfaceC4577u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4559t4 interfaceC4559t4) {
        if (this.h.a(h(), this.c)) {
            a(C4492p8.e.Interstitial, t4, str, str2);
        }
        this.f.a(new q(str, str2, t4, interfaceC4559t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4559t4 interfaceC4559t4) {
        com.ironsource.sdk.utils.Logger.i(this.a, "load interstitial");
        this.f.a(new r(str, interfaceC4559t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4559t4 interfaceC4559t4) {
        this.f.a(new a(jSONObject, interfaceC4559t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4) {
        this.f.a(new b(t4, map, interfaceC4559t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, T4 t4, InterfaceC4541s4 interfaceC4541s4) {
        if (this.h.a(h(), this.c)) {
            a(C4492p8.e.Banner, t4, str, str2);
        }
        this.f.a(new c(str, str2, t4, interfaceC4541s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4541s4 interfaceC4541s4) {
        this.f.a(new d(jSONObject, interfaceC4541s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4) {
        this.f.a(new RunnableC0231e(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(T4 t4, Map<String, String> map, InterfaceC4541s4 interfaceC4541s4) {
        this.f.a(new g(t4, map, interfaceC4541s4));
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
        com.ironsource.sdk.utils.Logger.i(this.a, "destroy controller");
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
