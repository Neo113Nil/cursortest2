package u0;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f65912a;

    /* renamed from: b, reason: collision with root package name */
    public a f65913b;

    /* renamed from: c, reason: collision with root package name */
    public Object f65914c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65915d;

    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f65912a) {
                    return;
                }
                this.f65912a = true;
                this.f65915d = true;
                a aVar = this.f65913b;
                Object obj = this.f65914c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f65915d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f65915d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f65914c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f65914c = cancellationSignal;
                    if (this.f65912a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f65914c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f65913b == aVar) {
                    return;
                }
                this.f65913b = aVar;
                if (this.f65912a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public final void d() {
        while (this.f65915d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
