package uc;

import hg.InterfaceC6950c;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class u<T> implements io.reactivex.d, InterfaceC6950c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.j f100603a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC8487b f100604b;

    public u(io.reactivex.j jVar) {
        this.f100603a = jVar;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        this.f100604b.dispose();
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
    }

    @Override // io.reactivex.d
    public final void onComplete() {
        this.f100603a.onComplete();
    }

    @Override // io.reactivex.d
    public final void onError(Throwable th2) {
        this.f100603a.onError(th2);
    }

    @Override // io.reactivex.d
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (rc.d.g(this.f100604b, interfaceC8487b)) {
            this.f100604b = interfaceC8487b;
            this.f100603a.d(this);
        }
    }
}
