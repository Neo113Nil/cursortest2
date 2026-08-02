package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ur8 extends RuntimeException {
    public final vr8 a;
    public final Throwable b;

    public ur8(vr8 vr8Var, Throwable th) {
        super(th);
        this.a = vr8Var;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
