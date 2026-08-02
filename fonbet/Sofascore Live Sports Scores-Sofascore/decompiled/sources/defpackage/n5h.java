package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n5h implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ArrayDeque c;
    public Runnable d;
    public final Object e;

    public n5h(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
            default:
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.e) {
                    try {
                        Object poll = this.c.poll();
                        Runnable runnable2 = (Runnable) poll;
                        this.d = runnable2;
                        if (poll != null) {
                            this.b.execute(runnable2);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.e) {
                    try {
                        Runnable runnable3 = (Runnable) this.c.poll();
                        this.d = runnable3;
                        if (runnable3 != null) {
                            ((g35) this.b).execute(runnable3);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.e) {
                    try {
                        this.c.add(new vlo(22, this, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.e) {
                    try {
                        this.c.offer(new ecg(11, runnable, this));
                        if (this.d == null) {
                            a();
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.e) {
                    try {
                        this.c.add(new r0(9, this, runnable));
                        if (this.d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public n5h(g35 g35Var) {
        this.a = 2;
        this.e = new Object();
        this.c = new ArrayDeque();
        this.b = g35Var;
    }
}
