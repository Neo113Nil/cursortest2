package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zei extends Exception {
    public final xei a;
    public final boolean b;

    public zei(xei xeiVar) {
        super(xei.c(xeiVar), xeiVar.c);
        this.a = xeiVar;
        this.b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.b ? super.fillInStackTrace() : this;
    }
}
