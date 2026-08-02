package k2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18625a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f18626b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f18627c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f18628d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18629e;

    public a0(Executor executor, int i5) {
        this.f18625a = i5;
        switch (i5) {
            case 1:
                this.f18627c = executor;
                this.f18626b = new ArrayDeque();
                this.f18629e = new Object();
                break;
            default:
                Intrinsics.checkNotNullParameter(executor, "executor");
                this.f18627c = executor;
                this.f18626b = new ArrayDeque();
                this.f18629e = new Object();
                break;
        }
    }

    private final void a(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f18629e) {
            try {
                this.f18626b.offer(new io.sentry.android.replay.util.c(8, command, this));
                if (this.f18628d == null) {
                    c();
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b(Runnable runnable) {
        synchronized (this.f18629e) {
            try {
                this.f18626b.add(new g8.a(26, this, runnable));
                if (this.f18628d == null) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        synchronized (this.f18629e) {
            try {
                Object poll = this.f18626b.poll();
                Runnable runnable = (Runnable) poll;
                this.f18628d = runnable;
                if (poll != null) {
                    this.f18627c.execute(runnable);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        switch (this.f18625a) {
            case 0:
                d();
                return;
            case 1:
                Runnable runnable = (Runnable) this.f18626b.poll();
                this.f18628d = runnable;
                if (runnable != null) {
                    this.f18627c.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f18629e) {
                    try {
                        Runnable runnable2 = (Runnable) this.f18626b.poll();
                        this.f18628d = runnable2;
                        if (runnable2 != null) {
                            ((androidx.appcompat.app.u) this.f18627c).execute(runnable2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f18625a) {
            case 0:
                a(runnable);
                return;
            case 1:
                b(runnable);
                return;
            default:
                synchronized (this.f18629e) {
                    try {
                        this.f18626b.add(new androidx.appcompat.app.t(0, this, runnable));
                        if (this.f18628d == null) {
                            c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public a0(androidx.appcompat.app.u uVar) {
        this.f18625a = 2;
        this.f18629e = new Object();
        this.f18626b = new ArrayDeque();
        this.f18627c = uVar;
    }
}
