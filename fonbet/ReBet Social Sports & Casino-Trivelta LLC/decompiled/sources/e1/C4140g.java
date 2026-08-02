package e1;

import android.os.Looper;

/* renamed from: e1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4140g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4152t f45524a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4152t f45525b;

    /* renamed from: c, reason: collision with root package name */
    public final a f45526c;

    /* renamed from: d, reason: collision with root package name */
    public Object f45527d;

    /* renamed from: e, reason: collision with root package name */
    public Object f45528e;

    /* renamed from: f, reason: collision with root package name */
    public int f45529f;

    /* renamed from: e1.g$a */
    public interface a {
        void a(Object obj, Object obj2);
    }

    public C4140g(Object obj, Looper looper, Looper looper2, InterfaceC4143j interfaceC4143j, a aVar) {
        this.f45524a = interfaceC4143j.d(looper, null);
        this.f45525b = interfaceC4143j.d(looper2, null);
        this.f45527d = obj;
        this.f45528e = obj;
        this.f45526c = aVar;
    }

    public static /* synthetic */ void a(final C4140g c4140g, Ra.f fVar) {
        final Object apply = fVar.apply(c4140g.f45528e);
        c4140g.f45528e = apply;
        c4140g.f(new Runnable() { // from class: e1.f
            @Override // java.lang.Runnable
            public final void run() {
                C4140g.c(C4140g.this, apply);
            }
        });
    }

    public static /* synthetic */ void b(C4140g c4140g, Object obj) {
        if (c4140g.f45529f == 0) {
            c4140g.i(obj);
        }
    }

    public static /* synthetic */ void c(C4140g c4140g, Object obj) {
        int i10 = c4140g.f45529f - 1;
        c4140g.f45529f = i10;
        if (i10 == 0) {
            c4140g.i(obj);
        }
    }

    public Object d() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == this.f45525b.h()) {
            return this.f45527d;
        }
        AbstractC4134a.g(myLooper == this.f45524a.h());
        return this.f45528e;
    }

    public void e(Runnable runnable) {
        if (this.f45524a.h().getThread().isAlive()) {
            this.f45524a.j(runnable);
        }
    }

    public final void f(Runnable runnable) {
        if (this.f45525b.h().getThread().isAlive()) {
            this.f45525b.j(runnable);
        }
    }

    public void g(final Object obj) {
        this.f45528e = obj;
        f(new Runnable() { // from class: e1.d
            @Override // java.lang.Runnable
            public final void run() {
                C4140g.b(C4140g.this, obj);
            }
        });
    }

    public void h(Ra.f fVar, final Ra.f fVar2) {
        AbstractC4134a.g(Looper.myLooper() == this.f45525b.h());
        this.f45529f++;
        e(new Runnable() { // from class: e1.e
            @Override // java.lang.Runnable
            public final void run() {
                C4140g.a(C4140g.this, fVar2);
            }
        });
        i(fVar.apply(this.f45527d));
    }

    public final void i(Object obj) {
        Object obj2 = this.f45527d;
        this.f45527d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f45526c.a(obj2, obj);
    }
}
