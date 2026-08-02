package ba;

import io.sentry.hints.j;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final j f3121d = new j(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f3122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3123b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3124c;

    public c() {
        this.f3124c = f3121d;
        this.f3122a = 1;
        this.f3123b = f.d(1);
    }

    @Override // ba.a
    public final void a(CharSequence charSequence) {
        if (b(2)) {
            this.f3124c.a(c(charSequence));
        }
    }

    public final boolean b(int i5) {
        return this.f3122a != 1 && f.d(i5) >= this.f3123b;
    }

    public abstract CharSequence c(CharSequence charSequence);

    @Override // ba.a
    public final void d(CharSequence charSequence) {
        if (b(6)) {
            this.f3124c.d(c(charSequence));
        }
    }

    @Override // ba.a
    public final void e(CharSequence charSequence, Throwable th2) {
        if (b(6)) {
            this.f3124c.e(c(charSequence), th2);
        }
    }

    @Override // ba.a
    public final void f(CharSequence charSequence, Throwable th2) {
        if (b(5)) {
            this.f3124c.f(c(charSequence), th2);
        }
    }

    @Override // ba.a
    public final void g(CharSequence charSequence, Throwable th2) {
        if (b(3)) {
            this.f3124c.g(c(charSequence), th2);
        }
    }

    @Override // ba.a
    public final void h(CharSequence charSequence) {
        if (b(4)) {
            this.f3124c.h(c(charSequence));
        }
    }

    public void i(androidx.recyclerview.widget.j jVar) {
        long currentTimeMillis = System.currentTimeMillis() - jVar.f2438b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.f2439c);
        sb2.append(" finish (");
        StringBuilder sb3 = new StringBuilder(sb2.toString());
        sb3.append(currentTimeMillis);
        sb3.append("ms)");
        a(sb3);
    }

    @Override // ba.a
    public final void j(CharSequence charSequence) {
        if (b(5)) {
            this.f3124c.j(c(charSequence));
        }
    }

    public void k(androidx.recyclerview.widget.j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.f2439c);
        sb2.append(" start");
        a(sb2.toString());
    }

    @Override // ba.a
    public final void o(CharSequence charSequence) {
        if (b(3)) {
            this.f3124c.o(c(charSequence));
        }
    }

    @Override // ba.a
    public final void p(CharSequence charSequence, Throwable th2) {
        if (b(2)) {
            this.f3124c.p(c(charSequence), th2);
        }
    }

    public c(d dVar) {
        this.f3124c = dVar;
        this.f3122a = dVar.f3122a;
        this.f3123b = dVar.f3123b;
    }
}
