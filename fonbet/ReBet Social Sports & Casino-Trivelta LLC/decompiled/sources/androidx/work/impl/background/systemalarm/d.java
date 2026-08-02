package androidx.work.impl.background.systemalarm;

import Q2.AbstractC1508t;
import R2.A;
import R2.C1543t;
import R2.InterfaceC1530f;
import R2.U;
import R2.W;
import R2.Y;
import X2.h;
import Y2.F;
import Y2.M;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements InterfaceC1530f {

    /* renamed from: l, reason: collision with root package name */
    public static final String f23823l = AbstractC1508t.i("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f23824a;

    /* renamed from: b, reason: collision with root package name */
    public final Z2.b f23825b;

    /* renamed from: c, reason: collision with root package name */
    public final M f23826c;

    /* renamed from: d, reason: collision with root package name */
    public final C1543t f23827d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f23828e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f23829f;

    /* renamed from: g, reason: collision with root package name */
    public final List f23830g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f23831h;

    /* renamed from: i, reason: collision with root package name */
    public c f23832i;

    /* renamed from: j, reason: collision with root package name */
    public A f23833j;

    /* renamed from: k, reason: collision with root package name */
    public final U f23834k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor a10;
            RunnableC0419d runnableC0419d;
            synchronized (d.this.f23830g) {
                d dVar = d.this;
                dVar.f23831h = (Intent) dVar.f23830g.get(0);
            }
            Intent intent = d.this.f23831h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f23831h.getIntExtra("KEY_START_ID", 0);
                AbstractC1508t e10 = AbstractC1508t.e();
                String str = d.f23823l;
                e10.a(str, "Processing command " + d.this.f23831h + ", " + intExtra);
                PowerManager.WakeLock b10 = F.b(d.this.f23824a, action + " (" + intExtra + ")");
                try {
                    AbstractC1508t.e().a(str, "Acquiring operation wake lock (" + action + ") " + b10);
                    b10.acquire();
                    d dVar2 = d.this;
                    dVar2.f23829f.o(dVar2.f23831h, intExtra, dVar2);
                    AbstractC1508t.e().a(str, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    a10 = d.this.f23825b.a();
                    runnableC0419d = new RunnableC0419d(d.this);
                } catch (Throwable th2) {
                    try {
                        AbstractC1508t e11 = AbstractC1508t.e();
                        String str2 = d.f23823l;
                        e11.d(str2, "Unexpected error in onHandleIntent", th2);
                        AbstractC1508t.e().a(str2, "Releasing operation wake lock (" + action + ") " + b10);
                        b10.release();
                        a10 = d.this.f23825b.a();
                        runnableC0419d = new RunnableC0419d(d.this);
                    } catch (Throwable th3) {
                        AbstractC1508t.e().a(d.f23823l, "Releasing operation wake lock (" + action + ") " + b10);
                        b10.release();
                        d.this.f23825b.a().execute(new RunnableC0419d(d.this));
                        throw th3;
                    }
                }
                a10.execute(runnableC0419d);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f23836a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f23837b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23838c;

        public b(d dVar, Intent intent, int i10) {
            this.f23836a = dVar;
            this.f23837b = intent;
            this.f23838c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23836a.a(this.f23837b, this.f23838c);
        }
    }

    public interface c {
        void b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0419d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f23839a;

        public RunnableC0419d(d dVar) {
            this.f23839a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23839a.d();
        }
    }

    public d(Context context) {
        this(context, null, null, null);
    }

    public boolean a(Intent intent, int i10) {
        AbstractC1508t e10 = AbstractC1508t.e();
        String str = f23823l;
        e10.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC1508t.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f23830g) {
            try {
                boolean isEmpty = this.f23830g.isEmpty();
                this.f23830g.add(intent);
                if (isEmpty) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public final void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // R2.InterfaceC1530f
    public void c(h hVar, boolean z10) {
        this.f23825b.a().execute(new b(this, androidx.work.impl.background.systemalarm.a.d(this.f23824a, hVar, z10), 0));
    }

    public void d() {
        AbstractC1508t e10 = AbstractC1508t.e();
        String str = f23823l;
        e10.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f23830g) {
            try {
                if (this.f23831h != null) {
                    AbstractC1508t.e().a(str, "Removing command " + this.f23831h);
                    if (!((Intent) this.f23830g.remove(0)).equals(this.f23831h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f23831h = null;
                }
                Z2.a c10 = this.f23825b.c();
                if (!this.f23829f.n() && this.f23830g.isEmpty() && !c10.n1()) {
                    AbstractC1508t.e().a(str, "No more commands & intents.");
                    c cVar = this.f23832i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f23830g.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C1543t e() {
        return this.f23827d;
    }

    public Z2.b f() {
        return this.f23825b;
    }

    public Y g() {
        return this.f23828e;
    }

    public M h() {
        return this.f23826c;
    }

    public U i() {
        return this.f23834k;
    }

    public final boolean j(String str) {
        b();
        synchronized (this.f23830g) {
            try {
                Iterator it = this.f23830g.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k() {
        AbstractC1508t.e().a(f23823l, "Destroying SystemAlarmDispatcher");
        this.f23827d.m(this);
        this.f23832i = null;
    }

    public final void l() {
        b();
        PowerManager.WakeLock b10 = F.b(this.f23824a, "ProcessCommand");
        try {
            b10.acquire();
            this.f23828e.t().d(new a());
        } finally {
            b10.release();
        }
    }

    public void m(c cVar) {
        if (this.f23832i != null) {
            AbstractC1508t.e().c(f23823l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f23832i = cVar;
        }
    }

    public d(Context context, C1543t c1543t, Y y10, U u10) {
        Context applicationContext = context.getApplicationContext();
        this.f23824a = applicationContext;
        this.f23833j = A.create();
        y10 = y10 == null ? Y.n(context) : y10;
        this.f23828e = y10;
        this.f23829f = new androidx.work.impl.background.systemalarm.a(applicationContext, y10.f().a(), this.f23833j);
        this.f23826c = new M(y10.f().k());
        c1543t = c1543t == null ? y10.p() : c1543t;
        this.f23827d = c1543t;
        Z2.b t10 = y10.t();
        this.f23825b = t10;
        this.f23834k = u10 == null ? new W(c1543t, t10) : u10;
        c1543t.e(this);
        this.f23830g = new ArrayList();
        this.f23831h = null;
    }
}
