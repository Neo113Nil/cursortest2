package lg;

import eg.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f20070c;

    public j(Runnable runnable, long j, boolean z5) {
        super(z5, j);
        this.f20070c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20070c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f20070c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(c0.n(runnable));
        sb2.append(", ");
        sb2.append(this.f20068a);
        sb2.append(", ");
        return d9.e.k(sb2, this.f20069b ? "Blocking" : "Non-blocking", ']');
    }
}
