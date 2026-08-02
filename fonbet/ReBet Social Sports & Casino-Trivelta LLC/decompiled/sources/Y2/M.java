package Y2;

import Q2.AbstractC1508t;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class M {

    /* renamed from: e, reason: collision with root package name */
    public static final String f13936e = AbstractC1508t.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final Q2.F f13937a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13938b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f13939c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f13940d = new Object();

    public interface a {
        void a(X2.h hVar);
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final M f13941a;

        /* renamed from: b, reason: collision with root package name */
        public final X2.h f13942b;

        public b(M m10, X2.h hVar) {
            this.f13941a = m10;
            this.f13942b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f13941a.f13940d) {
                try {
                    if (((b) this.f13941a.f13938b.remove(this.f13942b)) != null) {
                        a aVar = (a) this.f13941a.f13939c.remove(this.f13942b);
                        if (aVar != null) {
                            aVar.a(this.f13942b);
                        }
                    } else {
                        AbstractC1508t.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f13942b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public M(Q2.F f10) {
        this.f13937a = f10;
    }

    public void a(X2.h hVar, long j10, a aVar) {
        synchronized (this.f13940d) {
            AbstractC1508t.e().a(f13936e, "Starting timer for " + hVar);
            b(hVar);
            b bVar = new b(this, hVar);
            this.f13938b.put(hVar, bVar);
            this.f13939c.put(hVar, aVar);
            this.f13937a.b(j10, bVar);
        }
    }

    public void b(X2.h hVar) {
        synchronized (this.f13940d) {
            try {
                if (((b) this.f13938b.remove(hVar)) != null) {
                    AbstractC1508t.e().a(f13936e, "Stopping timer for " + hVar);
                    this.f13939c.remove(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
