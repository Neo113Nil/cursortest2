package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ma3 {
    public final ab3 a(ya yaVar) {
        return new ab3(this, un0.m, yaVar);
    }

    public final void b() {
        c(new cm5(0));
    }

    public final void c(ya3 ya3Var) {
        try {
            d(ya3Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            td4.w0(th);
            hda.L(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(ya3 ya3Var);

    public final g0c e() {
        return new i0c(this, 1);
    }
}
