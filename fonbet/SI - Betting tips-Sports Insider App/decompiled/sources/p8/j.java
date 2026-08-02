package p8;

import e5.o;
import g6.v;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f21555f = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f21556a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f21557b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f21558c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f21559d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final g8.a f21560e = new g8.a(this);

    public j(Executor executor) {
        v.h(executor);
        this.f21556a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        v.h(runnable);
        synchronized (this.f21557b) {
            int i5 = this.f21558c;
            if (i5 != 4 && i5 != 3) {
                long j = this.f21559d;
                o oVar = new o(runnable, 1);
                this.f21557b.add(oVar);
                this.f21558c = 2;
                try {
                    this.f21556a.execute(this.f21560e);
                    if (this.f21558c != 2) {
                        return;
                    }
                    synchronized (this.f21557b) {
                        try {
                            if (this.f21559d == j && this.f21558c == 2) {
                                this.f21558c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f21557b) {
                        try {
                            int i10 = this.f21558c;
                            boolean z5 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f21557b.removeLastOccurrence(oVar)) {
                                z5 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z5) {
                                throw e7;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f21557b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f21556a + "}";
    }
}
