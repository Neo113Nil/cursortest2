package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.h5s;
import xsna.zr;

/* compiled from: ReportManager.java */
/* loaded from: classes14.dex */
class s {
    private final c a;
    private final int b;
    private final int c;
    private final int d;
    private final k e;
    private Handler i;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger g = new AtomicInteger(0);
    private final Object h = new Object();
    private boolean j = true;
    private long k = 0;
    private volatile boolean l = false;
    private volatile boolean m = false;

    /* compiled from: ReportManager.java */
    public static final class b extends Handler {
        private final s a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.a = sVar;
        }

        private void a(String str) {
            this.a.e.v();
            this.a.g.addAndGet(0);
            this.a.a.b();
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", this.a.e.v() + " removeMessages failed ", e);
                }
            }
            if (this.a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.a.f.get(), this.a.k, this.a.c));
            } catch (Exception e2) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", this.a.e.v() + " sendMessageDelayed failed ", e2);
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
                this.a.k();
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
                a(zr.a("收到 Event( ", eVar.g(), " )，当前 Event 数量："));
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
            } catch (Exception e) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", this.a.e.v() + " report failed ", e);
                }
            }
        }
    }

    public s(k kVar) {
        this.a = kVar.d();
        this.b = kVar.i();
        this.c = kVar.l();
        this.d = kVar.j();
        this.e = kVar;
    }

    private void l() {
        this.a.c();
    }

    public void k() {
        synchronized (this.h) {
            try {
                if (!this.l) {
                    this.l = true;
                    l();
                }
                if (!this.m) {
                    this.m = true;
                    this.g.addAndGet(this.a.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
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
                this.e.v();
                return;
            }
            return;
        }
        a(c);
        this.g.addAndGet(-c.size());
        boolean z = false;
        if (com.mbridge.msdk.tracker.a.a) {
            this.e.v();
            this.g.addAndGet(0);
            this.a.b();
        }
        try {
            z = this.e.a();
        } catch (IllegalStateException e) {
            if (com.mbridge.msdk.tracker.a.a) {
                Log.e("TrackManager", this.e.v() + " report environment check failed ", e);
            }
        }
        if (!z) {
            if (com.mbridge.msdk.tracker.a.a) {
                Log.e("TrackManager", this.e.v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o m = this.e.m();
        m.a(new a(this.i, this));
        Map<String, String> hashMap = new HashMap<>();
        try {
            hashMap = this.e.f().a(this.e.u(), c, this.e.o());
        } catch (Exception e2) {
            if (com.mbridge.msdk.tracker.a.a) {
                Log.e("TrackManager", this.e.v() + " report decorate request params failed ", e2);
            }
        }
        m.b(new t(c), hashMap, y.a(c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f.set(0);
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

    public boolean g() {
        return this.j;
    }

    public void j() {
        b bVar = new b(h5s.a("report_timer").getLooper(), this);
        this.i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.c);
        this.j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.a.c(list);
    }

    public void a(e eVar) {
        if (this.i.hasMessages(6)) {
            return;
        }
        long a2 = y.a(this.f.get(), this.k, this.c);
        if (a2 > this.c) {
            Handler handler = this.i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (a2 * 0.1f));
        } else {
            Handler handler2 = this.i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    /* compiled from: ReportManager.java */
    public static final class a implements r {
        private final Handler a;
        private final s b;

        public a(Handler handler, s sVar) {
            this.a = handler;
            this.b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.b.b(tVar.a());
            this.b.i();
            this.b.k = 0L;
            if (this.b.f()) {
                Handler handler = this.a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.a) {
                this.b.e.v();
                tVar.a().size();
                this.b.g.addAndGet(0);
                this.b.a.b();
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i, String str) {
            this.b.a(tVar.a(), str);
            this.b.k = System.currentTimeMillis();
            int d = this.b.d();
            if (d <= 10) {
                this.a.removeMessages(3);
                Handler handler = this.a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), d * 1000);
            }
            if (com.mbridge.msdk.tracker.a.a) {
                this.b.e.v();
                tVar.a().size();
                this.b.g.addAndGet(0);
                this.b.a.b();
            }
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
            this.e.v();
            this.g.addAndGet(0);
            this.a.b();
        }
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
                if (!z && !z2) {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.a.a(list);
        this.g.addAndGet(i);
    }
}
