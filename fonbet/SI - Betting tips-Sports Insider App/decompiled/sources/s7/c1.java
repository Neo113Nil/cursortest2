package s7;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c1 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22669a;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue f22670b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22671c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f22672d;

    public c1(d1 d1Var, String str, BlockingQueue blockingQueue) {
        this.f22672d = d1Var;
        g6.v.h(blockingQueue);
        this.f22669a = new Object();
        this.f22670b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f22669a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        d1 d1Var = this.f22672d;
        synchronized (d1Var.f22684i) {
            try {
                if (!this.f22671c) {
                    d1Var.j.release();
                    d1Var.f22684i.notifyAll();
                    if (this == d1Var.f22678c) {
                        d1Var.f22678c = null;
                    } else if (this == d1Var.f22679d) {
                        d1Var.f22679d = null;
                    } else {
                        n0 n0Var = ((f1) d1Var.f3328a).f22745f;
                        f1.m(n0Var);
                        n0Var.f22903f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f22671c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z5 = false;
        while (!z5) {
            try {
                this.f22672d.j.acquire();
                z5 = true;
            } catch (InterruptedException e7) {
                n0 n0Var = ((f1) this.f22672d.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22906i.b(e7, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f22670b;
                b1 b1Var = (b1) blockingQueue.poll();
                if (b1Var != null) {
                    Process.setThreadPriority(true != b1Var.f22659b ? 10 : threadPriority);
                    b1Var.run();
                } else {
                    Object obj = this.f22669a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f22672d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e9) {
                                n0 n0Var2 = ((f1) this.f22672d.f3328a).f22745f;
                                f1.m(n0Var2);
                                n0Var2.f22906i.b(e9, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f22672d.f22684i) {
                        if (this.f22670b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }
}
