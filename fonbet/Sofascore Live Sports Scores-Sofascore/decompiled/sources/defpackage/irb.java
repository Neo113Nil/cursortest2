package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class irb implements Executor {
    public final /* synthetic */ int a;
    public Executor b;
    public final Object c;

    public irb(e3c e3cVar) {
        this.a = 0;
        z1a.y(e3cVar, "executorPool");
        this.c = e3cVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        switch (this.a) {
            case 0:
                synchronized (this) {
                    executor = this.b;
                    if (executor == null) {
                        executor = (Executor) neh.a((meh) ((e3c) this.c).b);
                        z1a.x(executor, this.b, "%s.getObject()");
                        this.b = executor;
                    }
                }
                executor.execute(runnable);
                return;
            case 1:
                try {
                    this.b.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    ((gd8) this.c).m(e);
                    return;
                }
            case 2:
                this.b.execute(runnable);
                return;
            case 3:
                Executor executor2 = this.b;
                tlo tloVar = (tlo) this.c;
                try {
                    executor2.execute(runnable);
                    return;
                } catch (RejectedExecutionException e2) {
                    tloVar.e(e2);
                    return;
                }
            default:
                Executor executor3 = this.b;
                r7p r7pVar = (r7p) this.c;
                try {
                    executor3.execute(runnable);
                    return;
                } catch (RejectedExecutionException e3) {
                    r7pVar.e(e3);
                    return;
                }
        }
    }

    public /* synthetic */ irb(Executor executor, Object obj, int i) {
        this.a = i;
        this.b = executor;
        this.c = obj;
    }
}
