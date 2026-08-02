package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.A1;
import com.ironsource.Bc;
import com.ironsource.Be;
import com.ironsource.C4023cd;
import com.ironsource.C4157k4;
import com.ironsource.C4270q9;
import com.ironsource.C4355v5;
import com.ironsource.Ce;
import com.ironsource.E1;
import com.ironsource.EnumC4373w5;
import com.ironsource.I6;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4107h7;
import com.ironsource.Jb;
import com.ironsource.K1;
import com.ironsource.Kc;
import com.ironsource.Kd;
import com.ironsource.Nd;
import com.ironsource.T4;
import com.ironsource.T9;
import com.ironsource.Te;
import com.ironsource.Xe;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.xqm;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class q implements Bc {
    private static q z;
    private Xe a;
    private NetworkStateReceiver p;
    private CountDownTimer q;
    private String t;
    private Te u;
    private long w;
    private int b = e.f;
    private InterfaceC4107h7 c = Ib.a0().k();
    private final String d = "appKey";
    private final String e = getClass().getSimpleName();
    private boolean l = false;
    private boolean n = false;
    private List<Kc> r = new ArrayList();
    private String s = "";
    private f y = new a();
    private Handler m = IronSourceThreadManager.INSTANCE.getInitHandler();
    private int f = 1;
    private int g = 0;
    private int h = 62;
    private int i = 12;
    private int j = 5;
    private AtomicBoolean o = new AtomicBoolean(true);
    private boolean k = false;
    private boolean v = false;
    private T9 x = new T9();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends f {
        public a() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x029c, code lost:
        
            if (r0.g == r0.j) goto L58;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            try {
                p g = p.g();
                if (!TextUtils.isEmpty(q.this.s)) {
                    I6.a().a("userId", q.this.s);
                }
                if (!TextUtils.isEmpty(q.this.t)) {
                    I6.a().a("appKey", q.this.t);
                }
                q qVar = q.this;
                qVar.x.i(qVar.s);
                q.this.w = new Date().getTime();
                Kd.c().a();
                q.this.u = g.b(ContextProvider.getInstance().getApplicationContext(), q.this.s, this.c);
                q qVar2 = q.this;
                if (qVar2.u == null) {
                    if (qVar2.g == 3) {
                        qVar2.v = true;
                        Iterator it = qVar2.r.iterator();
                        while (it.hasNext()) {
                            ((Kc) it.next()).a();
                        }
                    }
                    if (this.a) {
                        q qVar3 = q.this;
                        if (qVar3.g < qVar3.h) {
                            qVar3.k = true;
                            qVar3.m.postDelayed(this, qVar3.f * 1000);
                            q qVar4 = q.this;
                            if (qVar4.g < qVar4.i) {
                                qVar4.f *= 2;
                            }
                        }
                    }
                    if (this.a) {
                        q qVar5 = q.this;
                    }
                    q qVar6 = q.this;
                    if (!qVar6.l) {
                        qVar6.l = true;
                        if (TextUtils.isEmpty(this.b)) {
                            this.b = "noServerResponse";
                        }
                        Iterator it2 = q.this.r.iterator();
                        while (it2.hasNext()) {
                            ((Kc) it2.next()).g(this.b);
                        }
                        q.this.b(d.INIT_FAILED);
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    q.this.g++;
                    return;
                }
                qVar2.m.removeCallbacks(this);
                boolean q = q.this.u.q();
                q qVar7 = q.this;
                if (!q) {
                    if (qVar7.l) {
                        return;
                    }
                    qVar7.b(d.INIT_FAILED);
                    q qVar8 = q.this;
                    qVar8.l = true;
                    Iterator it3 = qVar8.r.iterator();
                    while (it3.hasNext()) {
                        ((Kc) it3.next()).g("serverResponseIsNotValid");
                    }
                    return;
                }
                qVar7.b(d.INITIATED);
                new Jb().a(q.this.u.c().b().e().b(), g.u());
                K1 f = q.this.u.c().b().f();
                if (f != null) {
                    T4 t4 = T4.a;
                    t4.c(f.h());
                    t4.a(f.g());
                    t4.a(f.k());
                    IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(f.i());
                    q.this.c.a(f);
                }
                q.this.a(ContextProvider.getInstance().getApplicationContext(), q.this.u);
                long time = new Date().getTime();
                q qVar9 = q.this;
                g.a(time - qVar9.w, qVar9.u.i());
                if (f != null && f.f()) {
                    new Nd(Ib.a0().q(), new xqm(2), Ib.a0(), IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(ContextProvider.getInstance().getApplicationContext());
                }
                q.this.a = new Xe();
                q qVar10 = q.this;
                qVar10.a.a(qVar10.c);
                if (q.this.u.c().b().g() && ContextProvider.getInstance().getApplicationContext() != null) {
                    C4270q9.a.a(ContextProvider.getInstance().getApplicationContext());
                }
                List<IronSource.a> h = q.this.u.h();
                Iterator it4 = q.this.r.iterator();
                while (it4.hasNext()) {
                    ((Kc) it4.next()).a(h, q.this.g(), q.this.u.c());
                }
                C4023cd.P.i();
                E1 d = q.this.u.c().b().d();
                if (d.f()) {
                    C4157k4.d().a(d.b(), d.d(), d.c(), d.e(), IronSourceUtils.d(), d.a(), d.g());
                }
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class a extends CountDownTimer {
            public a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                q qVar = q.this;
                if (qVar.l) {
                    return;
                }
                qVar.l = true;
                Iterator it = qVar.r.iterator();
                while (it.hasNext()) {
                    ((Kc) it.next()).g("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    q qVar = q.this;
                    qVar.v = true;
                    Iterator it = qVar.r.iterator();
                    while (it.hasNext()) {
                        ((Kc) it.next()).a();
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.q = new a(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, 15000L).start();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class e {
        public static int a = 0;
        public static int b = 1;
        public static int c = 2;
        public static int d = 3;
        public static int e = 4;
        public static int f = 5;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public abstract class f implements Runnable {
        String b;
        boolean a = true;
        protected p.c c = new a();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public class a implements p.c {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.p.c
            public void a(String str) {
                f fVar = f.this;
                fVar.a = false;
                fVar.b = str;
            }
        }

        public f() {
        }
    }

    private q() {
    }

    public static synchronized q c() {
        q qVar;
        synchronized (q.class) {
            qVar = z;
            if (qVar == null) {
                qVar = new q();
                z = qVar;
            }
        }
        return qVar;
    }

    public synchronized void a(Context context, String str, String str2, IronSource.a... aVarArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.o;
                if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.e + ": Multiple calls to init are not allowed", 2);
                } else {
                    b(d.INIT_IN_PROGRESS);
                    this.s = str2;
                    this.t = str;
                    if (IronSourceUtils.f(context)) {
                        this.m.post(this.y);
                    } else {
                        this.n = true;
                        NetworkStateReceiver networkStateReceiver = this.p;
                        if (networkStateReceiver == null) {
                            networkStateReceiver = new NetworkStateReceiver(context, this);
                            this.p = networkStateReceiver;
                        }
                        context.registerReceiver(networkStateReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                }
            } catch (Exception e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        Ce.a.a(Be.values()[dVar.ordinal()]);
    }

    public synchronized boolean d() {
        return this.v;
    }

    public void e() {
        b(d.INIT_FAILED);
    }

    public synchronized void f() {
        int a2 = a(a());
        this.b = a2;
        this.x.c(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.k;
    }

    public int b() {
        return this.b;
    }

    public void a(Context context, Te te) {
        this.x.i(te.g().h());
        this.x.c(te.g().d());
        A1 b2 = te.c().b();
        this.x.a(b2.a());
        this.x.d(b2.c().b());
        this.x.b(b2.k().b());
        this.x.a(Boolean.valueOf(IronSourceUtils.c(context)));
        K1 f2 = te.c().b().f();
        this.x.b(f2.b());
        Ib.R().o().a(f2.c());
    }

    private static int a(d dVar) {
        int i = c.a[dVar.ordinal()];
        if (i == 1) {
            return e.d;
        }
        if (i == 2) {
            return e.e;
        }
        if (i != 3) {
            return e.a;
        }
        return e.b;
    }

    @Override // com.ironsource.Bc
    public void a(boolean z2) {
        if (this.n && z2) {
            CountDownTimer countDownTimer = this.q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.n = false;
            this.k = true;
            Ib.a0().q().a(new C4355v5(EnumC4373w5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.b(false)));
            this.m.post(this.y);
        }
    }

    public synchronized d a() {
        return d.values()[Ce.a.a().ordinal()];
    }
}
