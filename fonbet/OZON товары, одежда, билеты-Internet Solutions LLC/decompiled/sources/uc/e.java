package uc;

/* loaded from: classes9.dex */
public final class e<T> extends d<T> {
    public e() {
        super(1);
    }

    @Override // io.reactivex.w
    public final void onError(Throwable th2) {
        if (this.f100559a == null) {
            this.f100560b = th2;
        }
        countDown();
    }

    @Override // io.reactivex.w
    public final void onNext(T t2) {
        if (this.f100559a == null) {
            this.f100559a = t2;
            this.f100561c.dispose();
            countDown();
        }
    }
}
