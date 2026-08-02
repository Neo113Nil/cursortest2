package nb;

import f0.AbstractC4220a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class p extends AbstractC4220a implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f57219h;

    public class a implements b {
        public a() {
        }

        @Override // nb.p.b
        public void a(Throwable th2) {
            p.this.p(th2);
        }

        @Override // nb.p.b
        public void set(Object obj) {
            p.this.o(obj);
        }
    }

    public interface b {
        void a(Throwable th2);

        void set(Object obj);
    }

    public interface c {
        ScheduledFuture a(b bVar);
    }

    public p(c cVar) {
        this.f57219h = cVar.a(new a());
    }

    @Override // f0.AbstractC4220a
    public void b() {
        this.f57219h.cancel(r());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f57219h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f57219h.compareTo(delayed);
    }
}
