package d0;

import androidx.annotation.NonNull;

/* renamed from: d0.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5981A implements I.c<S> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f60773a;

    C5981A(J j11) {
        this.f60773a = j11;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        this.f60773a.s(0, "Unable to acquire InputBuffer.", th2);
    }

    @Override // I.c
    public final void onSuccess(S s11) {
        S s12 = s11;
        J j11 = this.f60773a;
        j11.f60810q.getClass();
        s12.c(Z.r.c());
        s12.d();
        s12.a();
        I.k.b(s12.b(), new C6014z(this), j11.f60801h);
    }
}
