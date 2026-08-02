package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class aui extends yti {
    public final Runnable c;

    public aui(long j, Runnable runnable, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ml4.X(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return lnb.q(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
