package s7;

import android.os.Handler;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: d, reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.h0 f22837d;

    /* renamed from: a, reason: collision with root package name */
    public final m1 f22838a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.a f22839b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f22840c;

    public k(m1 m1Var) {
        g6.v.h(m1Var);
        this.f22838a = m1Var;
        this.f22839b = new g8.a(29, this, m1Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            m1 m1Var = this.f22838a;
            m1Var.f().getClass();
            this.f22840c = System.currentTimeMillis();
            if (d().postDelayed(this.f22839b, j)) {
                return;
            }
            m1Var.a().f22903f.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f22840c = 0L;
        d().removeCallbacks(this.f22839b);
    }

    public final Handler d() {
        com.google.android.gms.internal.measurement.h0 h0Var;
        if (f22837d != null) {
            return f22837d;
        }
        synchronized (k.class) {
            try {
                if (f22837d == null) {
                    f22837d = new com.google.android.gms.internal.measurement.h0(this.f22838a.e().getMainLooper(), 0);
                }
                h0Var = f22837d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h0Var;
    }
}
