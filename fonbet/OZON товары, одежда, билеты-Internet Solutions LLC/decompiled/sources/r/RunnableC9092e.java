package r;

/* renamed from: r.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class RunnableC9092e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9091d f82315a;

    RunnableC9092e(C9091d c9091d) {
        this.f82315a = c9091d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f82315a.f82304b.k0().onAuthenticationFailed();
    }
}
