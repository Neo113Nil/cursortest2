package t2;

import e1.AbstractC4134a;
import e1.C4155w;
import e1.InterfaceC4152t;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import t2.V0;
import t2.a1;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final C6407m f64971a;

    /* renamed from: b, reason: collision with root package name */
    public final C4155w f64972b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4152t f64973c;

    /* renamed from: d, reason: collision with root package name */
    public final V0 f64974d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f64975e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public V0 f64976f;

    public A0(C6407m c6407m, C4155w c4155w, InterfaceC4152t interfaceC4152t, V0 v02) {
        this.f64971a = c6407m;
        this.f64972b = c4155w;
        this.f64973c = interfaceC4152t;
        this.f64974d = v02;
        this.f64976f = v02;
    }

    public synchronized void c(V0 v02) {
        try {
            AbstractC4134a.g(this.f64975e.getAndDecrement() > 0);
            V0.b a10 = this.f64976f.a();
            if (!Objects.equals(v02.f65179b, this.f64974d.f65179b)) {
                a10.b(v02.f65179b);
            }
            if (!Objects.equals(v02.f65180c, this.f64974d.f65180c)) {
                a10.e(v02.f65180c);
            }
            int i10 = v02.f65178a;
            if (i10 != this.f64974d.f65178a) {
                a10.d(i10);
            }
            int i11 = v02.f65181d;
            if (i11 != this.f64974d.f65181d) {
                a10.c(i11);
            }
            final V0 a11 = a10.a();
            this.f64976f = a11;
            if (this.f64975e.get() == 0 && !this.f64974d.equals(this.f64976f)) {
                this.f64973c.j(new Runnable() { // from class: t2.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.f64972b.k(-1, new C4155w.a() { // from class: t2.z0
                            @Override // e1.C4155w.a
                            public final void invoke(Object obj) {
                                a1.e eVar = (a1.e) obj;
                                eVar.a(r0.f64971a, A0.this.f64974d, r2);
                            }
                        });
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void d(int i10) {
        this.f64975e.set(i10);
    }
}
