package x0;

import S0.V0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10596a implements f0, V0, Runnable, Choreographer.FrameCallback {

    /* renamed from: g, reason: collision with root package name */
    private static long f104710g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f104711a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f104713c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f104715e;

    /* renamed from: f, reason: collision with root package name */
    private long f104716f;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U0.b<e0> f104712b = new U0.b<>(new e0[16]);

    /* renamed from: d, reason: collision with root package name */
    private final Choreographer f104714d = Choreographer.getInstance();

    /* renamed from: x0.a$a, reason: collision with other inner class name */
    public static final class C2268a {

        /* renamed from: a, reason: collision with root package name */
        private final long f104717a;

        public C2268a(long j11) {
            this.f104717a = j11;
        }

        public final long a() {
            return Math.max(0L, this.f104717a - System.nanoTime());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC10596a(@NotNull View view) {
        float f7;
        this.f104711a = view;
        if (f104710g == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f7 = display.getRefreshRate();
            }
            f7 = 60.0f;
            f104710g = (long) (1000000000 / f7);
        }
    }

    @Override // x0.f0
    public final void a(@NotNull e0 e0Var) {
        this.f104712b.b(e0Var);
        if (this.f104713c) {
            return;
        }
        this.f104713c = true;
        this.f104711a.post(this);
    }

    @Override // S0.V0
    public final void b() {
        this.f104715e = true;
    }

    @Override // S0.V0
    public final void d() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        if (this.f104715e) {
            this.f104716f = j11;
            this.f104711a.post(this);
        }
    }

    @Override // S0.V0
    public final void e() {
        this.f104715e = false;
        this.f104711a.removeCallbacks(this);
        this.f104714d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        U0.b<e0> bVar = this.f104712b;
        if (bVar.o() || !this.f104713c || !this.f104715e || this.f104711a.getWindowVisibility() != 0) {
            this.f104713c = false;
            return;
        }
        C2268a c2268a = new C2268a(this.f104716f + f104710g);
        boolean z11 = false;
        while (bVar.p() && !z11) {
            if (c2268a.a() <= 0 || bVar.l()[0].b(c2268a)) {
                z11 = true;
            } else {
                bVar.u(0);
            }
        }
        if (z11) {
            this.f104714d.postFrameCallback(this);
        } else {
            this.f104713c = false;
        }
    }
}
