package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface ehj {
    void D(Integer num);

    Integer E();

    Integer e();

    Integer f();

    Integer j();

    void k(Integer num);

    default void m(pl4 pl4Var) {
        q(pl4Var != null ? Integer.valueOf(pl4Var.a(9)) : null);
    }

    kp n();

    void p(Integer num);

    void q(Integer num);

    Integer s();

    void t(Integer num);

    default pl4 v() {
        Integer e = e();
        if (e != null) {
            return new pl4(e.intValue(), 9);
        }
        return null;
    }

    void y(kp kpVar);
}
