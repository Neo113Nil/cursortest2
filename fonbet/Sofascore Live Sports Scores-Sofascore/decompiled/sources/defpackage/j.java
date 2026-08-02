package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class j {
    public static final ds4 a;

    static {
        hs4 hs4Var = z45.a;
        r69 r69Var = rob.a.f;
        hq4 hq4Var = hq4.c;
        a = new ds4(r69Var, hq4Var, hq4Var, hq4Var, rwj.a, 3, l.b, 1, 1, 1);
    }

    public static final boolean a(ot9 ot9Var) {
        int i = ot9Var.y;
        sti stiVar = ot9Var.c;
        hkh hkhVar = ot9Var.q;
        int C = wt3.C(i);
        if (C != 0) {
            if (C != 1) {
                if (C != 2) {
                    zzl.b();
                    return false;
                }
                if ((ot9Var.w.a != null || !(hkhVar instanceof i55)) && (!(stiVar instanceof ku9) || !(hkhVar instanceof ppf) || ((ku9) stiVar).b != ((ppf) hkhVar).a)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final Drawable b(ot9 ot9Var, Drawable drawable, Integer num) {
        if (drawable == null) {
            drawable = null;
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                Context context = ot9Var.a;
                int intValue = num.intValue();
                Drawable d0 = td4.d0(intValue, context);
                if (d0 != null) {
                    return d0;
                }
                hc5.f(ljg.j(intValue, "Invalid resource ID: "));
            }
        }
        return drawable;
    }
}
