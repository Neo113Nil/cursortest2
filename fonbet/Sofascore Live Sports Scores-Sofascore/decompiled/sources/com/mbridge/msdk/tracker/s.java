package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.unity3d.services.UnityAdsConstants;
import defpackage.lnb;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class s {
    private final c a;
    private final int b;
    private final int c;
    private final int d;
    private final k e;
    private Handler i;
    private HandlerThread j;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger g = new AtomicInteger(0);
    private final Object h = new Object();
    private boolean k = true;
    private long l = 0;
    private volatile boolean m = false;
    private volatile boolean n = false;

    public s(k kVar) {
        this.a = kVar.e();
        this.b = kVar.j();
        this.c = kVar.m();
        this.d = kVar.k();
        this.e = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z = !iVar.l() && iVar.h() >= this.d;
                boolean z2 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (z || z2) {
                    iVar.b(-1);
                } else {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i++;
                }
            }
        }
        this.a.a(list);
        this.g.addAndGet(i);
    }

    private List<i> c() {
        return this.a.a(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> c = c();
        if (y.b((List<?>) c)) {
            if (com.mbridge.msdk.tracker.a.a) {
                this.e.w();
                return;
            }
            return;
        }
        a(c);
        this.g.addAndGet(-c.size());
        boolean z = false;
        if (com.mbridge.msdk.tracker.a.a) {
            this.e.w();
            this.g.addAndGet(0);
            this.a.b();
        }
        try {
            z = this.e.a();
        } catch (IllegalStateException unused) {
            if (com.mbridge.msdk.tracker.a.a) {
                this.e.w();
            }
        }
        if (!z) {
            if (com.mbridge.msdk.tracker.a.a) {
                this.e.w();
                return;
            }
            return;
        }
        o n = this.e.n();
        n.a(new a(this.i, this));
        Map<String, String> hashMap = new HashMap<>();
        try {
            hashMap = this.e.g().a(this.e.v(), c, this.e.p());
        } catch (Exception unused2) {
            if (com.mbridge.msdk.tracker.a.a) {
                this.e.w();
            }
        }
        n.b(new t(c), hashMap, y.a(c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f.set(0);
    }

    private void m() {
        this.a.c();
    }

    public void b() {
        this.i.removeMessages(1);
        Handler handler = this.i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.g.incrementAndGet();
    }

    public boolean f() {
        return this.g.addAndGet(0) >= this.b;
    }

    public void j() {
        this.k = true;
        this.i.removeMessages(1);
        this.i.removeMessages(5);
        this.j.quitSafely();
    }

    public void k() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        this.j = handlerThread;
        handlerThread.start();
        b bVar = new b(this.j.getLooper(), this);
        this.i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.c);
        this.k = false;
    }

    public void l() {
        synchronized (this.h) {
            try {
                if (!this.m) {
                    this.m = true;
                    m();
                }
                if (!this.n) {
                    this.n = true;
                    this.g.addAndGet(this.a.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.a.c(list);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends Handler {
        private final s a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.a = sVar;
        }

        private void a(String str) {
            this.a.e.w();
            this.a.g.addAndGet(0);
            this.a.a.b();
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception unused) {
                if (com.mbridge.msdk.tracker.a.a) {
                    this.a.e.w();
                }
            }
            if (this.a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.a.f.get(), this.a.l, this.a.c));
            } catch (Exception unused2) {
                if (com.mbridge.msdk.tracker.a.a) {
                    this.a.e.w();
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i = message.what;
            if (i == 2 || i == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i == 5) {
                if (com.mbridge.msdk.tracker.a.a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i != 6) {
                if (i != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.a.l();
                b();
                if (com.mbridge.msdk.tracker.a.a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.a && !y.b(eVar)) {
                a(lnb.o("收到 Event( ", eVar.g(), " )，当前 Event 数量："));
            }
            if (y.a(eVar) || this.a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.a.h();
            } catch (Exception unused) {
                if (com.mbridge.msdk.tracker.a.a) {
                    this.a.e.w();
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements r {
        private final Handler a;
        private final s b;

        public a(Handler handler, s sVar) {
            this.a = handler;
            this.b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i, String str) {
            this.b.a(tVar.a(), str);
            this.b.l = System.currentTimeMillis();
            int d = this.b.d();
            if (d <= 10) {
                this.a.removeMessages(3);
                Handler handler = this.a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), d * 1000);
            }
            if (com.mbridge.msdk.tracker.a.a) {
                this.b.e.w();
                tVar.a().size();
                this.b.g.addAndGet(0);
                this.b.a.b();
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.b.b(tVar.a());
            this.b.i();
            this.b.l = 0L;
            if (this.b.f()) {
                Handler handler = this.a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.a) {
                this.b.e.w();
                tVar.a().size();
                this.b.g.addAndGet(0);
                this.b.a.b();
            }
        }
    }

    public void a(e eVar) {
        if (this.i.hasMessages(6)) {
            return;
        }
        long a2 = y.a(this.f.get(), this.l, this.c);
        long j = this.c;
        Handler handler = this.i;
        if (a2 > j) {
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (a2 * 0.1f));
        } else {
            handler.sendMessage(Message.obtain(handler, 6, eVar));
        }
    }

    private void a(List<i> list) {
        this.a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.a) {
            return;
        }
        this.a.a();
        if (com.mbridge.msdk.tracker.a.a) {
            this.e.w();
            this.g.addAndGet(0);
            this.a.b();
        }
    }
}
