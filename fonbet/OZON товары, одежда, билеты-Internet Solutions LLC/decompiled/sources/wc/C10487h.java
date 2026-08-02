package wc;

import hg.InterfaceC6949b;
import hg.InterfaceC6950c;

/* renamed from: wc.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10487h<T> implements InterfaceC6950c {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6949b<? super T> f103934a;

    /* renamed from: b, reason: collision with root package name */
    final T f103935b;

    /* renamed from: c, reason: collision with root package name */
    boolean f103936c;

    C10487h(T t2, InterfaceC6949b<? super T> interfaceC6949b) {
        this.f103935b = t2;
        this.f103934a = interfaceC6949b;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        if (j11 <= 0 || this.f103936c) {
            return;
        }
        this.f103936c = true;
        T t2 = this.f103935b;
        InterfaceC6949b<? super T> interfaceC6949b = this.f103934a;
        interfaceC6949b.onNext(t2);
        interfaceC6949b.onComplete();
    }
}
