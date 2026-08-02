package zc;

import sc.C9656b;
import uc.AbstractC10019c;

/* renamed from: zc.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11026c0<T> extends io.reactivex.p<T> {

    /* renamed from: a, reason: collision with root package name */
    final T[] f108163a;

    /* renamed from: zc.c0$a */
    static final class a<T> extends AbstractC10019c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108164a;

        /* renamed from: b, reason: collision with root package name */
        final T[] f108165b;

        /* renamed from: c, reason: collision with root package name */
        int f108166c;

        /* renamed from: d, reason: collision with root package name */
        boolean f108167d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f108168e;

        a(io.reactivex.w<? super T> wVar, T[] tArr) {
            this.f108164a = wVar;
            this.f108165b = tArr;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            this.f108167d = true;
            return 1;
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f108166c = this.f108165b.length;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108168e = true;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108168e;
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f108166c == this.f108165b.length;
        }

        @Override // tc.InterfaceC9808j
        public final T poll() {
            int i11 = this.f108166c;
            T[] tArr = this.f108165b;
            if (i11 == tArr.length) {
                return null;
            }
            this.f108166c = i11 + 1;
            T t2 = tArr[i11];
            C9656b.c(t2, "The array element is null");
            return t2;
        }
    }

    public C11026c0(T[] tArr) {
        this.f108163a = tArr;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        T[] tArr = this.f108163a;
        a aVar = new a(wVar, tArr);
        wVar.onSubscribe(aVar);
        if (aVar.f108167d) {
            return;
        }
        int length = tArr.length;
        for (int i11 = 0; i11 < length && !aVar.f108168e; i11++) {
            T t2 = tArr[i11];
            if (t2 == null) {
                aVar.f108164a.onError(new NullPointerException(T7.E.a(i11, "The element at index ", " is null")));
                return;
            }
            aVar.f108164a.onNext(t2);
        }
        if (aVar.f108168e) {
            return;
        }
        aVar.f108164a.onComplete();
    }
}
