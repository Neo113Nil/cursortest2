package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.C4015c5;
import com.ironsource.C4096ge;
import com.ironsource.C4157k4;
import com.ironsource.C4197m8;
import com.ironsource.C4215n8;
import com.ironsource.C4219nc;
import com.ironsource.C4233o8;
import com.ironsource.C4297s1;
import com.ironsource.C4318t4;
import com.ironsource.C4322t8;
import com.ironsource.C4336u4;
import com.ironsource.C4340u8;
import com.ironsource.C4427z5;
import com.ironsource.I3;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4247p4;
import com.ironsource.InterfaceC4265q4;
import com.ironsource.InterfaceC4282r4;
import com.ironsource.Lb;
import com.ironsource.N;
import com.ironsource.Nb;
import com.ironsource.O7;
import com.ironsource.Q4;
import com.ironsource.R4;
import com.ironsource.T5;
import com.ironsource.U3;
import com.ironsource.U5;
import com.ironsource.U6;
import com.ironsource.W6;
import com.ironsource.X3;
import com.ironsource.ch;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import defpackage.arg;
import defpackage.brg;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private CountDownTimer d;
    private final O7 g;
    private final ch h;
    private final C4219nc k;
    private final String a = "e";
    private C4197m8.b c = C4197m8.b.None;
    private final I3 e = new I3("NativeCommandExecutor");
    private final I3 f = new I3("ControllerCommandsExecutor");
    private final Map<String, l.a> i = new HashMap();
    private final Map<String, l.b> j = new HashMap();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4265q4 b;

        public a(JSONObject jSONObject, InterfaceC4265q4 interfaceC4265q4) {
            this.a = jSONObject;
            this.b = interfaceC4265q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ Q4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4265q4 c;

        public b(Q4 q4, Map map, InterfaceC4265q4 interfaceC4265q4) {
            this.a = q4;
            this.b = map;
            this.c = interfaceC4265q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;
        final /* synthetic */ InterfaceC4247p4 d;

        public c(String str, String str2, Q4 q4, InterfaceC4247p4 interfaceC4247p4) {
            this.a = str;
            this.b = str2;
            this.c = q4;
            this.d = interfaceC4247p4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4247p4 b;

        public d(JSONObject jSONObject, InterfaceC4247p4 interfaceC4247p4) {
            this.a = jSONObject;
            this.b = interfaceC4247p4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    public class RunnableC1213e implements Runnable {
        final /* synthetic */ Q4 a;

        public RunnableC1213e(Q4 q4) {
            this.a = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        final /* synthetic */ Q4 a;

        public f(Q4 q4) {
            this.a = q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g implements Runnable {
        final /* synthetic */ Q4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4247p4 c;

        public g(Q4 q4, Map map, InterfaceC4247p4 interfaceC4247p4) {
            this.a = q4;
            this.b = map;
            this.c = interfaceC4247p4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
                C4157k4.d().a(th);
                e.this.d(Log.getStackTraceString(th));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class o implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;
        final /* synthetic */ InterfaceC4282r4 d;

        public o(String str, String str2, Q4 q4, InterfaceC4282r4 interfaceC4282r4) {
            this.a = str;
            this.b = str2;
            this.c = q4;
            this.d = interfaceC4282r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class p implements Runnable {
        final /* synthetic */ JSONObject a;
        final /* synthetic */ InterfaceC4282r4 b;

        public p(JSONObject jSONObject, InterfaceC4282r4 interfaceC4282r4) {
            this.a = jSONObject;
            this.b = interfaceC4282r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class q implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Q4 c;
        final /* synthetic */ InterfaceC4265q4 d;

        public q(String str, String str2, Q4 q4, InterfaceC4265q4 interfaceC4265q4) {
            this.a = str;
            this.b = str2;
            this.c = q4;
            this.d = interfaceC4265q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class r implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ InterfaceC4265q4 b;

        public r(String str, InterfaceC4265q4 interfaceC4265q4) {
            this.a = str;
            this.b = interfaceC4265q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.a(this.a, this.b);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class s implements Runnable {
        final /* synthetic */ Q4 a;
        final /* synthetic */ Map b;
        final /* synthetic */ InterfaceC4265q4 c;

        public s(Q4 q4, Map map, InterfaceC4265q4 interfaceC4265q4) {
            this.a = q4;
            this.b = map;
            this.c = interfaceC4265q4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4322t8.a(C4096ge.j, new C4233o8().a(C4427z5.v, this.a.f()).a(C4427z5.w, C4340u8.a(this.a, C4197m8.e.Interstitial)).a(C4427z5.x, Boolean.valueOf(C4340u8.a(this.a))).a(C4427z5.I, Long.valueOf(N.a.b(this.a.h()))).a());
            com.ironsource.sdk.controller.l lVar = e.this.b;
            if (lVar != null) {
                lVar.b(this.a, this.b, this.c);
            }
        }
    }

    public e(Context context, X3 x3, R4 r4, O7 o7, int i2, JSONObject jSONObject, String str, String str2, C4219nc c4219nc) {
        this.k = c4219nc;
        this.g = o7;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        C4015c5 a2 = C4015c5.a(networkStorageDir, o7, jSONObject);
        this.h = new ch(context, x3, r4, i2, a2, networkStorageDir);
        a(context, x3, r4, i2, a2, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v b(Context context, X3 x3, R4 r4, int i2, C4015c5 c4015c5, String str, String str2, String str3) throws Throwable {
        C4322t8.a(C4096ge.c, new C4233o8().a(C4427z5.y, "thread-" + Thread.currentThread().getName()).a());
        v vVar = new v(context, r4, x3, this, this.g, i2, c4015c5, str, i(), j(), str2, str3);
        U5 u5 = new U5(context, c4015c5, new T5(this.g.a()), new Nb(c4015c5.a()));
        vVar.a(new u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c4015c5.a(), u5));
        vVar.a(new C4297s1());
        vVar.a(new C4336u4(context, new C4318t4()));
        return vVar;
    }

    private l.a i() {
        return new brg(this, 2);
    }

    private l.b j() {
        return new arg(this, 1);
    }

    private void l() {
        Logger.i(this.a, "handleReadyState");
        this.c = C4197m8.b.Ready;
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
        return C4197m8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.ironsource.Y6
    public void a(@NotNull U6 u6) {
        W6 b2 = u6.b();
        if (b2 == W6.SendEvent) {
            C4322t8.a(C4096ge.A, new C4233o8().a(C4427z5.y, u6.a() + " : strategy: " + b2).a());
            return;
        }
        if (b2 == W6.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(u6.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            C4322t8.a(C4096ge.d, new C4233o8().a(C4427z5.A, u6.a() + " : strategy: " + b2).a());
            C4322t8.a(C4096ge.A, new C4233o8().a(C4427z5.y, u6.a() + " : strategy: " + b2).a());
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(String str) {
        Logger.i(this.a, "handleControllerFailed ");
        C4233o8 c4233o8 = new C4233o8();
        c4233o8.a(C4427z5.A, str);
        c4233o8.a(C4427z5.y, String.valueOf(this.h.l()));
        C4322t8.a(C4096ge.o, c4233o8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            Logger.i(this.a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        Logger.i(this.a, "handleControllerReady ");
        this.k.a(h());
        if (C4197m8.c.Web.equals(h())) {
            C4322t8.a(C4096ge.e, new C4233o8().a(C4427z5.y, String.valueOf(this.h.l())).a());
            IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.e();
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
    public C4197m8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : C4197m8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    @Override // com.ironsource.sdk.controller.l
    @Deprecated
    public void f() {
    }

    private void e(String str) {
        IronSourceNetwork.updateInitFailed(new C4215n8(1001, str));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class k extends CountDownTimer {
        public k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Global Controller Timer Finish");
            e.this.d(U3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class n extends CountDownTimer {
        public n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(e.this.a, "Recovered Controller | Global Controller Timer Finish");
            e.this.d(U3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        C4322t8.a(C4096ge.d, new C4233o8().a(C4427z5.A, str).a());
        this.c = C4197m8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        O7 o7 = this.g;
        if (o7 != null) {
            o7.c(new l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, X3 x3, R4 r4, int i2, C4015c5 c4015c5, String str, String str2, String str3) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.d = new k(200000L, 1000L).start();
            v b2 = b(context, x3, r4, i2, c4015c5, str, str2, str3);
            this.b = b2;
            b2.b();
        } catch (Throwable th2) {
            th = th2;
            this = this;
            Throwable th3 = th;
            C4157k4.d().a(th3);
            this.d(Log.getStackTraceString(th3));
        }
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        Logger.i(this.a, "handleControllerLoaded");
        this.c = C4197m8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(f.a aVar) {
        l.a remove = this.i.remove(aVar.c());
        if (remove != null) {
            remove.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Lb lb) {
        l.b bVar = this.j.get(lb.d());
        if (bVar != null) {
            bVar.a(lb);
        }
    }

    private void a(Runnable runnable, long j2) {
        O7 o7 = this.g;
        if (o7 != null) {
            o7.d(runnable, j2);
        } else {
            Logger.e(this.a, "mThreadManager = null");
        }
    }

    private void a(final Context context, final X3 x3, final R4 r4, final int i2, final C4015c5 c4015c5, final String str, final String str2, final String str3) {
        int C = Ib.a0().h().C();
        if (C > 0) {
            C4322t8.a(C4096ge.B, new C4233o8().a(C4427z5.y, String.valueOf(C)).a());
        }
        Runnable runnable = new Runnable() { // from class: v5m
            @Override // java.lang.Runnable
            public final void run() {
                e.this.c(context, x3, r4, i2, c4015c5, str, str2, str3);
            }
        };
        if (Ib.a0().h().t()) {
            this.g.b(runnable, C);
        } else {
            a(runnable, C);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    private void b(Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(String str) {
        C4322t8.a(C4096ge.y, new C4233o8().a(C4427z5.y, str).a());
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    public void a(Runnable runnable) {
        this.e.a(runnable);
    }

    private void a(C4197m8.e eVar, Q4 q4, String str, String str2) {
        Logger.i(this.a, "recoverWebController for product: " + eVar.toString());
        C4233o8 c4233o8 = new C4233o8();
        c4233o8.a(C4427z5.w, eVar.toString());
        c4233o8.a(C4427z5.v, q4.f());
        C4322t8.a(C4096ge.b, c4233o8.a());
        this.h.n();
        a();
        m mVar = new m(str, str2);
        if (Ib.a0().h().t()) {
            this.g.b(mVar);
        } else {
            b(mVar);
        }
        this.d = new n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4) {
        this.f.a(new s(q4, map, interfaceC4265q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Q4 q4) {
        this.f.a(new f(q4));
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

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4282r4 interfaceC4282r4) {
        if (this.h.a(h(), this.c)) {
            a(C4197m8.e.RewardedVideo, q4, str, str2);
        }
        this.f.a(new o(str, str2, q4, interfaceC4282r4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4282r4 interfaceC4282r4) {
        this.f.a(new p(jSONObject, interfaceC4282r4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4265q4 interfaceC4265q4) {
        if (this.h.a(h(), this.c)) {
            a(C4197m8.e.Interstitial, q4, str, str2);
        }
        this.f.a(new q(str, str2, q4, interfaceC4265q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4265q4 interfaceC4265q4) {
        Logger.i(this.a, "load interstitial");
        this.f.a(new r(str, interfaceC4265q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4265q4 interfaceC4265q4) {
        this.f.a(new a(jSONObject, interfaceC4265q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4) {
        this.f.a(new b(q4, map, interfaceC4265q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Q4 q4, InterfaceC4247p4 interfaceC4247p4) {
        if (this.h.a(h(), this.c)) {
            a(C4197m8.e.Banner, q4, str, str2);
        }
        this.f.a(new c(str, str2, q4, interfaceC4247p4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4247p4 interfaceC4247p4) {
        this.f.a(new d(jSONObject, interfaceC4247p4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4) {
        this.f.a(new RunnableC1213e(q4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Q4 q4, Map<String, String> map, InterfaceC4247p4 interfaceC4247p4) {
        this.f.a(new g(q4, map, interfaceC4247p4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
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
        I3 i3 = this.f;
        if (i3 != null) {
            i3.b();
        }
        this.d = null;
        b(new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.b.a(activity);
    }
}
