package defpackage;

import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ma2 implements na2 {
    public final lj2 b;
    public final Throwable c;

    public ma2(lj2 lj2Var) {
        this.b = lj2Var;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        String num = Integer.toString(lj2Var.hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        Throwable th = new Throwable("ReadTask 0x".concat(num));
        de6.b(th);
        this.c = th;
    }

    @Override // defpackage.na2
    public final void a(Throwable th) {
        Object obj;
        rq3 d = d();
        if (th != null) {
            p2g p2gVar = w2g.b;
            obj = new u2g(th);
        } else {
            pa2.a.getClass();
            obj = ka2.c;
        }
        ((lj2) d).resumeWith(obj);
    }

    @Override // defpackage.na2
    public final void b() {
        rq3 d = d();
        pa2.a.getClass();
        ((lj2) d).resumeWith(ka2.c);
    }

    @Override // defpackage.na2
    public final Throwable c() {
        return this.c;
    }

    public final rq3 d() {
        return this.b;
    }
}
