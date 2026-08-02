package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface qf0 {
    void A();

    Object g();

    void k(int i, int i2, int i3);

    void p(int i, int i2);

    default void r(Object obj, Function2 function2) {
        function2.invoke(g(), obj);
    }

    void s(int i, Object obj);

    void w(int i, Object obj);

    void x(Object obj);

    default void y() {
        Object g = g();
        qe3 qe3Var = g instanceof qe3 ? (qe3) g : null;
        if (qe3Var != null) {
            qe3Var.e();
        }
    }

    default void t() {
    }
}
