package uc;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.w;
import nc.InterfaceC8487b;
import tc.InterfaceC9803e;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10017a<T, R> implements w<T>, InterfaceC9803e<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final w<? super R> f100554a;

    /* renamed from: b, reason: collision with root package name */
    protected InterfaceC8487b f100555b;

    /* renamed from: c, reason: collision with root package name */
    protected InterfaceC9803e<T> f100556c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f100557d;

    /* renamed from: e, reason: collision with root package name */
    protected int f100558e;

    public AbstractC10017a(w<? super R> wVar) {
        this.f100554a = wVar;
    }

    @Override // tc.InterfaceC9804f
    public int a(int i11) {
        InterfaceC9803e<T> interfaceC9803e = this.f100556c;
        if (interfaceC9803e == null || (i11 & 4) != 0) {
            return 0;
        }
        int a11 = interfaceC9803e.a(i11);
        if (a11 == 0) {
            return a11;
        }
        this.f100558e = a11;
        return a11;
    }

    protected final void b(Throwable th2) {
        C2645f.c(th2);
        this.f100555b.dispose();
        onError(th2);
    }

    @Override // tc.InterfaceC9808j
    public void clear() {
        this.f100556c.clear();
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        this.f100555b.dispose();
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f100555b.isDisposed();
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return this.f100556c.isEmpty();
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.w
    public void onComplete() {
        if (this.f100557d) {
            return;
        }
        this.f100557d = true;
        this.f100554a.onComplete();
    }

    @Override // io.reactivex.w
    public void onError(Throwable th2) {
        if (this.f100557d) {
            C3493a.f(th2);
        } else {
            this.f100557d = true;
            this.f100554a.onError(th2);
        }
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        if (rc.d.g(this.f100555b, interfaceC8487b)) {
            this.f100555b = interfaceC8487b;
            if (interfaceC8487b instanceof InterfaceC9803e) {
                this.f100556c = (InterfaceC9803e) interfaceC8487b;
            }
            this.f100554a.onSubscribe(this);
        }
    }
}
