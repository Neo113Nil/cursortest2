package Uh;

import Ph.U;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f12289c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f12289c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12289c.run();
    }

    public String toString() {
        String c10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Task[");
        sb2.append(U.a(this.f12289c));
        sb2.append('@');
        sb2.append(U.b(this.f12289c));
        sb2.append(", ");
        sb2.append(this.f12287a);
        sb2.append(", ");
        c10 = j.c(this.f12288b);
        sb2.append(c10);
        sb2.append(']');
        return sb2.toString();
    }
}
