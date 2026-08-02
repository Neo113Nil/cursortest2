package xc;

import io.reactivex.w;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class p<T> extends io.reactivex.p<T> {

    static final class a<T> extends uc.k<T> implements io.reactivex.m<T> {

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f105320c;

        @Override // uc.k, nc.InterfaceC8487b
        public final void dispose() {
            super.dispose();
            this.f105320c.dispose();
        }

        @Override // io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f105320c, interfaceC8487b)) {
                this.f105320c = interfaceC8487b;
                this.f100573a.onSubscribe(this);
            }
        }
    }

    public static <T> io.reactivex.m<T> c(w<? super T> wVar) {
        return new a(wVar);
    }
}
