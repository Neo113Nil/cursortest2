package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ym8 implements xj3 {
    @Override // defpackage.asb
    public void a(xei xeiVar) {
        e().a(xeiVar);
    }

    @Override // defpackage.e8a
    public final f8a b() {
        return e().b();
    }

    @Override // defpackage.asb
    public final Runnable c(zrb zrbVar) {
        return e().c(zrbVar);
    }

    public abstract xj3 e();

    @Override // defpackage.xj3
    public final sm0 getAttributes() {
        return e().getAttributes();
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(e(), "delegate");
        return I.toString();
    }
}
