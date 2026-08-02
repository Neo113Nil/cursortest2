package r;

import r.o;

/* loaded from: classes8.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o.b f82323a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9091d f82324b;

    m(C9091d c9091d, o.b bVar) {
        this.f82324b = c9091d;
        this.f82323a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f82324b.f82304b.k0().onAuthenticationSucceeded(this.f82323a);
    }
}
