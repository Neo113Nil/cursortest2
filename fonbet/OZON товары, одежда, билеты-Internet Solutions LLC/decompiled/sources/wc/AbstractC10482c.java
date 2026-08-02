package wc;

import hg.InterfaceC6948a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import tc.InterfaceC9805g;
import tc.InterfaceC9808j;

/* renamed from: wc.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC10482c<T, R> extends AtomicInteger implements io.reactivex.j<T>, InterfaceC10486g<R>, InterfaceC6950c {

    /* renamed from: b, reason: collision with root package name */
    final qc.o<? super T, ? extends InterfaceC6948a<? extends R>> f103917b;

    /* renamed from: c, reason: collision with root package name */
    final int f103918c;

    /* renamed from: d, reason: collision with root package name */
    final int f103919d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC6950c f103920e;

    /* renamed from: f, reason: collision with root package name */
    int f103921f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC9808j<T> f103922g;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f103923h;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f103924i;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f103926k;

    /* renamed from: l, reason: collision with root package name */
    int f103927l;

    /* renamed from: a, reason: collision with root package name */
    final C10485f<R> f103916a = new C10485f<>(this);

    /* renamed from: j, reason: collision with root package name */
    final Gc.c f103925j = new Gc.c();

    AbstractC10482c(qc.o<? super T, ? extends InterfaceC6948a<? extends R>> oVar, int i11) {
        this.f103917b = oVar;
        this.f103918c = i11;
        this.f103919d = i11;
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (Fc.g.g(this.f103920e, interfaceC6950c)) {
            this.f103920e = interfaceC6950c;
            if (interfaceC6950c instanceof InterfaceC9805g) {
                InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                int a11 = interfaceC9805g.a(7);
                if (a11 == 1) {
                    this.f103927l = a11;
                    this.f103922g = interfaceC9805g;
                    this.f103923h = true;
                    f();
                    e();
                    return;
                }
                if (a11 == 2) {
                    this.f103927l = a11;
                    this.f103922g = interfaceC9805g;
                    f();
                    interfaceC6950c.n(this.f103918c);
                    return;
                }
            }
            this.f103922g = new Cc.b(this.f103918c);
            f();
            interfaceC6950c.n(this.f103918c);
        }
    }

    abstract void e();

    abstract void f();

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        this.f103923h = true;
        e();
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        if (this.f103927l == 2 || this.f103922g.offer(t2)) {
            e();
        } else {
            this.f103920e.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }
}
