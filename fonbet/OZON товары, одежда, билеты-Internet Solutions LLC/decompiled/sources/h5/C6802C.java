package h5;

import androidx.annotation.NonNull;
import androidx.work.impl.C5475c;
import g5.C6643p;
import java.util.HashMap;

/* renamed from: h5.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6802C {

    /* renamed from: e, reason: collision with root package name */
    private static final String f64960e = androidx.work.o.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    final C5475c f64961a;

    /* renamed from: b, reason: collision with root package name */
    final HashMap f64962b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final HashMap f64963c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Object f64964d = new Object();

    /* renamed from: h5.C$a */
    public interface a {
        void a(@NonNull C6643p c6643p);
    }

    /* renamed from: h5.C$b */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C6802C f64965a;

        /* renamed from: b, reason: collision with root package name */
        private final C6643p f64966b;

        b(@NonNull C6802C c6802c, @NonNull C6643p c6643p) {
            this.f64965a = c6802c;
            this.f64966b = c6643p;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f64965a.f64964d) {
                try {
                    if (((b) this.f64965a.f64962b.remove(this.f64966b)) != null) {
                        a aVar = (a) this.f64965a.f64963c.remove(this.f64966b);
                        if (aVar != null) {
                            aVar.a(this.f64966b);
                        }
                    } else {
                        androidx.work.o.e().a("WrkTimerRunnable", "Timer with " + this.f64966b + " is already marked as complete.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C6802C(@NonNull C5475c c5475c) {
        this.f64961a = c5475c;
    }

    public final void a(@NonNull C6643p c6643p, @NonNull androidx.work.impl.background.systemalarm.e eVar) {
        synchronized (this.f64964d) {
            androidx.work.o.e().a(f64960e, "Starting timer for " + c6643p);
            b(c6643p);
            b bVar = new b(this, c6643p);
            this.f64962b.put(c6643p, bVar);
            this.f64963c.put(c6643p, eVar);
            this.f64961a.b(bVar, 600000L);
        }
    }

    public final void b(@NonNull C6643p c6643p) {
        synchronized (this.f64964d) {
            try {
                if (((b) this.f64962b.remove(c6643p)) != null) {
                    androidx.work.o.e().a(f64960e, "Stopping timer for " + c6643p);
                    this.f64963c.remove(c6643p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
