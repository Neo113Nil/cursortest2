package w7;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import g6.v;
import gg.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24998a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final g4 f24999b = new g4(3);

    /* renamed from: c, reason: collision with root package name */
    public boolean f25000c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f25001d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25002e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f25003f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, b bVar) {
        this.f24999b.d(new k(executor, bVar));
        q();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f24999b.d(new k(h.f24980a, onCompleteListener));
        q();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.f24999b.d(new k(executor, onCompleteListener));
        q();
    }

    @Override // com.google.android.gms.tasks.Task
    public final m c(Executor executor, c cVar) {
        this.f24999b.d(new k(executor, cVar));
        q();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final m d(c cVar) {
        c(h.f24980a, cVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final m e(Executor executor, d dVar) {
        this.f24999b.d(new k(executor, dVar));
        q();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final m f(d dVar) {
        e(h.f24980a, dVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, a aVar) {
        m mVar = new m();
        this.f24999b.d(new j(executor, aVar, mVar, 0));
        q();
        return mVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f24998a) {
            exc = this.f25003f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f24998a) {
            try {
                v.j("Task is not yet complete", this.f25000c);
                if (this.f25001d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f25003f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f25002e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(Executor executor, a aVar) {
        m mVar = new m();
        this.f24999b.d(new j(executor, aVar, mVar, 1));
        q();
        return mVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object i(Class cls) {
        Object obj;
        synchronized (this.f24998a) {
            try {
                v.j("Task is not yet complete", this.f25000c);
                if (this.f25001d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (cls.isInstance(this.f25003f)) {
                    throw ((Throwable) cls.cast(this.f25003f));
                }
                Exception exc = this.f25003f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f25002e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z5;
        synchronized (this.f24998a) {
            try {
                z5 = false;
                if (this.f25000c && !this.f25001d && this.f25003f == null) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        return this.f25001d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean k() {
        boolean z5;
        synchronized (this.f24998a) {
            z5 = this.f25000c;
        }
        return z5;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task l(Executor executor, f fVar) {
        m mVar = new m();
        this.f24999b.d(new k(executor, fVar, mVar));
        q();
        return mVar;
    }

    public final void m(Object obj) {
        synchronized (this.f24998a) {
            p();
            this.f25000c = true;
            this.f25002e = obj;
        }
        this.f24999b.f(this);
    }

    public final void n(Exception exc) {
        v.i(exc, "Exception must not be null");
        synchronized (this.f24998a) {
            p();
            this.f25000c = true;
            this.f25003f = exc;
        }
        this.f24999b.f(this);
    }

    public final void o() {
        synchronized (this.f24998a) {
            try {
                if (this.f25000c) {
                    return;
                }
                this.f25000c = true;
                this.f25001d = true;
                this.f24999b.f(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        if (this.f25000c) {
            int i5 = r.f10098a;
            if (!k()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
        }
    }

    public final void q() {
        synchronized (this.f24998a) {
            try {
                if (this.f25000c) {
                    this.f24999b.f(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
