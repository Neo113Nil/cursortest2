package w7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import s7.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements l, d, c, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24994a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f24995b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24996c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24997d;

    public k(Executor executor, OnCompleteListener onCompleteListener) {
        this.f24994a = 1;
        this.f24996c = new Object();
        this.f24995b = executor;
        this.f24997d = onCompleteListener;
    }

    private final void d(Task task) {
        synchronized (this.f24996c) {
            try {
                if (((OnCompleteListener) this.f24997d) == null) {
                    return;
                }
                this.f24995b.execute(new w0(16, this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e(Task task) {
        if (task.isSuccessful() || task.j()) {
            return;
        }
        synchronized (this.f24996c) {
            try {
                if (((c) this.f24997d) == null) {
                    return;
                }
                this.f24995b.execute(new w0(17, this, task));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f24996c) {
                try {
                    if (((d) this.f24997d) == null) {
                        return;
                    }
                    this.f24995b.execute(new w0(18, this, task));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // w7.l
    public final void a(Task task) {
        switch (this.f24994a) {
            case 0:
                if (task.j()) {
                    synchronized (this.f24996c) {
                        try {
                            if (((b) this.f24997d) != null) {
                                this.f24995b.execute(new androidx.core.widget.b(28, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                d(task);
                return;
            case 2:
                e(task);
                return;
            case 3:
                f(task);
                return;
            default:
                this.f24995b.execute(new w0(19, this, task));
                return;
        }
    }

    @Override // w7.b
    public void b() {
        ((m) this.f24997d).o();
    }

    @Override // w7.c
    public void c(Exception exc) {
        ((m) this.f24997d).n(exc);
    }

    @Override // w7.d
    public void onSuccess(Object obj) {
        ((m) this.f24997d).m(obj);
    }

    public k(Executor executor, b bVar) {
        this.f24994a = 0;
        this.f24996c = new Object();
        this.f24995b = executor;
        this.f24997d = bVar;
    }

    public k(Executor executor, c cVar) {
        this.f24994a = 2;
        this.f24996c = new Object();
        this.f24995b = executor;
        this.f24997d = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f24994a = 3;
        this.f24996c = new Object();
        this.f24995b = executor;
        this.f24997d = dVar;
    }

    public k(Executor executor, f fVar, m mVar) {
        this.f24994a = 4;
        this.f24995b = executor;
        this.f24996c = fVar;
        this.f24997d = mVar;
    }
}
