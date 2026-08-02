package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class iyh {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final ol4 a(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        boolean d = av8Var.d(kx4Var.j());
        Object O = av8Var.O();
        if (d || O == nf3.a) {
            O = new ol4(new cqa(kx4Var));
            av8Var.n0(O);
        }
        return (ol4) O;
    }
}
