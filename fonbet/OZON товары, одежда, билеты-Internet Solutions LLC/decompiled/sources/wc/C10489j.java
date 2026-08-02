package wc;

import hg.InterfaceC6948a;

/* renamed from: wc.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10489j<T, R> extends io.reactivex.h<R> {

    /* renamed from: c, reason: collision with root package name */
    final io.reactivex.h f103953c;

    /* renamed from: d, reason: collision with root package name */
    final qc.o<? super T, ? extends InterfaceC6948a<? extends R>> f103954d;

    /* renamed from: e, reason: collision with root package name */
    final int f103955e = 2;

    /* renamed from: f, reason: collision with root package name */
    final Gc.h f103956f;

    public C10489j(io.reactivex.h hVar, qc.o oVar, Gc.h hVar2) {
        this.f103953c = hVar;
        this.f103954d = oVar;
        this.f103956f = hVar2;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        qc.o<? super T, ? extends InterfaceC6948a<? extends R>> oVar = this.f103954d;
        io.reactivex.h hVar = this.f103953c;
        if (M.b(hVar, jVar, oVar)) {
            return;
        }
        int i11 = C10481b.f103915a[this.f103956f.ordinal()];
        int i12 = this.f103955e;
        hVar.a(i11 != 1 ? i11 != 2 ? new C10484e<>(jVar, oVar, i12) : new C10483d<>(jVar, oVar, i12, true) : new C10483d<>(jVar, oVar, i12, false));
    }
}
