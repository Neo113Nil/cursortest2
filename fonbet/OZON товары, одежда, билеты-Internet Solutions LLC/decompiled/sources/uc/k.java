package uc;

import Kc.C3493a;
import io.reactivex.w;

/* loaded from: classes.dex */
public class k<T> extends AbstractC10018b<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final w<? super T> f100573a;

    /* renamed from: b, reason: collision with root package name */
    protected T f100574b;

    public k(w<? super T> wVar) {
        this.f100573a = wVar;
    }

    @Override // tc.InterfaceC9804f
    public final int a(int i11) {
        lazySet(8);
        return 2;
    }

    public final void b(T t2) {
        int i11 = get();
        if ((i11 & 54) != 0) {
            return;
        }
        w<? super T> wVar = this.f100573a;
        if (i11 == 8) {
            this.f100574b = t2;
            lazySet(16);
            wVar.onNext(null);
        } else {
            lazySet(2);
            wVar.onNext(t2);
        }
        if (get() != 4) {
            wVar.onComplete();
        }
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
        lazySet(32);
        this.f100574b = null;
    }

    public void dispose() {
        set(4);
        this.f100574b = null;
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onComplete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f100573a.onComplete();
    }

    public void onError(Throwable th2) {
        if ((get() & 54) != 0) {
            C3493a.f(th2);
        } else {
            lazySet(2);
            this.f100573a.onError(th2);
        }
    }

    public void onSuccess(T t2) {
        b(t2);
    }

    @Override // tc.InterfaceC9808j
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t2 = this.f100574b;
        this.f100574b = null;
        lazySet(32);
        return t2;
    }
}
