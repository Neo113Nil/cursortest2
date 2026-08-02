package O0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import z.r;

/* loaded from: classes.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f8243j = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public k f8248e;

    /* renamed from: i, reason: collision with root package name */
    public e f8252i;

    /* renamed from: a, reason: collision with root package name */
    public final r f8244a = new r();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8245b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final b f8246c = new b();

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f8247d = new Runnable() { // from class: O0.b
        @Override // java.lang.Runnable
        public final void run() {
            c.this.f8246c.a();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public long f8249f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8250g = false;

    /* renamed from: h, reason: collision with root package name */
    public float f8251h = 1.0f;

    public class b {
        public b() {
        }

        public void a() {
            c.this.f8249f = SystemClock.uptimeMillis();
            c cVar = c.this;
            cVar.f(cVar.f8249f);
            if (c.this.f8245b.size() > 0) {
                c.this.f8248e.a(c.this.f8247d);
            }
        }
    }

    /* renamed from: O0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0170c {
        boolean a(long j10);
    }

    public class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public ValueAnimator.DurationScaleChangeListener f8254a;

        public d() {
        }

        @Override // O0.c.e
        public boolean register() {
            boolean registerDurationScaleChangeListener;
            if (this.f8254a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: O0.f
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f10) {
                    c.this.f8251h = f10;
                }
            };
            this.f8254a = durationScaleChangeListener;
            registerDurationScaleChangeListener = ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
            return registerDurationScaleChangeListener;
        }

        @Override // O0.c.e
        public boolean unregister() {
            boolean unregisterDurationScaleChangeListener;
            unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f8254a);
            this.f8254a = null;
            return unregisterDurationScaleChangeListener;
        }
    }

    public interface e {
        boolean register();

        boolean unregister();
    }

    public static final class f implements k {

        /* renamed from: a, reason: collision with root package name */
        public final Choreographer f8256a = Choreographer.getInstance();

        /* renamed from: b, reason: collision with root package name */
        public final Looper f8257b = Looper.myLooper();

        @Override // O0.k
        public void a(final Runnable runnable) {
            this.f8256a.postFrameCallback(new Choreographer.FrameCallback() { // from class: O0.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }

        @Override // O0.k
        public boolean b() {
            return Thread.currentThread() == this.f8257b.getThread();
        }
    }

    public c(k kVar) {
        this.f8248e = kVar;
    }

    public static c h() {
        ThreadLocal threadLocal = f8243j;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new f()));
        }
        return (c) threadLocal.get();
    }

    public void d(InterfaceC0170c interfaceC0170c, long j10) {
        float durationScale;
        if (this.f8245b.size() == 0) {
            this.f8248e.a(this.f8247d);
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                this.f8251h = durationScale;
                if (this.f8252i == null) {
                    this.f8252i = new d();
                }
                this.f8252i.register();
            }
        }
        if (!this.f8245b.contains(interfaceC0170c)) {
            this.f8245b.add(interfaceC0170c);
        }
        if (j10 > 0) {
            this.f8244a.put(interfaceC0170c, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void e() {
        if (this.f8250g) {
            for (int size = this.f8245b.size() - 1; size >= 0; size--) {
                if (this.f8245b.get(size) == null) {
                    this.f8245b.remove(size);
                }
            }
            if (this.f8245b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f8252i.unregister();
            }
            this.f8250g = false;
        }
    }

    public void f(long j10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f8245b.size(); i10++) {
            InterfaceC0170c interfaceC0170c = (InterfaceC0170c) this.f8245b.get(i10);
            if (interfaceC0170c != null && i(interfaceC0170c, uptimeMillis)) {
                interfaceC0170c.a(j10);
            }
        }
        e();
    }

    public float g() {
        return this.f8251h;
    }

    public final boolean i(InterfaceC0170c interfaceC0170c, long j10) {
        Long l10 = (Long) this.f8244a.get(interfaceC0170c);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f8244a.remove(interfaceC0170c);
        return true;
    }

    public boolean j() {
        return this.f8248e.b();
    }

    public void k(InterfaceC0170c interfaceC0170c) {
        this.f8244a.remove(interfaceC0170c);
        int indexOf = this.f8245b.indexOf(interfaceC0170c);
        if (indexOf >= 0) {
            this.f8245b.set(indexOf, null);
            this.f8250g = true;
        }
    }
}
