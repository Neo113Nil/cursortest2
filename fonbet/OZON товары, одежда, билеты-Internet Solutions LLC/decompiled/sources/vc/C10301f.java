package vc;

import io.reactivex.AbstractC7094b;

/* renamed from: vc.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10301f extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final Throwable f102774a;

    public C10301f(Throwable th2) {
        this.f102774a = th2;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        dVar.onSubscribe(rc.e.INSTANCE);
        dVar.onError(this.f102774a);
    }
}
