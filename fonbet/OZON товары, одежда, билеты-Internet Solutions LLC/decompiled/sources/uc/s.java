package uc;

import Bl0.D;
import Cc.C2738a;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicInteger;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public abstract class s<T, U, V> implements w<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicInteger f100595a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    protected final Ic.e f100596b;

    /* renamed from: c, reason: collision with root package name */
    protected final C2738a f100597c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile boolean f100598d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile boolean f100599e;

    /* renamed from: f, reason: collision with root package name */
    protected Throwable f100600f;

    public s(Ic.e eVar, C2738a c2738a) {
        this.f100596b = eVar;
        this.f100597c = c2738a;
    }

    public void a(Ic.e eVar, Object obj) {
    }

    public final boolean b() {
        return this.f100598d;
    }

    public final boolean c() {
        return this.f100599e;
    }

    public final boolean d() {
        return this.f100595a.getAndIncrement() == 0;
    }

    public final Throwable e() {
        return this.f100600f;
    }

    public final boolean f() {
        AtomicInteger atomicInteger = this.f100595a;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    protected final void g(Object obj, InterfaceC8487b interfaceC8487b) {
        AtomicInteger atomicInteger = this.f100595a;
        int i11 = atomicInteger.get();
        Ic.e eVar = this.f100596b;
        C2738a c2738a = this.f100597c;
        if (i11 == 0 && atomicInteger.compareAndSet(0, 1)) {
            a(eVar, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            c2738a.offer(obj);
            if (!d()) {
                return;
            }
        }
        D.b(c2738a, eVar, interfaceC8487b, this);
    }

    protected final void h(Object obj, InterfaceC8487b interfaceC8487b) {
        AtomicInteger atomicInteger = this.f100595a;
        int i11 = atomicInteger.get();
        Ic.e eVar = this.f100596b;
        C2738a c2738a = this.f100597c;
        if (i11 != 0 || !atomicInteger.compareAndSet(0, 1)) {
            c2738a.offer(obj);
            if (!d()) {
                return;
            }
        } else if (c2738a.isEmpty()) {
            a(eVar, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            c2738a.offer(obj);
        }
        D.b(c2738a, eVar, interfaceC8487b, this);
    }

    public final int i(int i11) {
        return this.f100595a.addAndGet(i11);
    }
}
