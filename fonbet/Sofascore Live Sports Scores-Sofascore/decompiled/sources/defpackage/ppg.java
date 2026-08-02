package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ppg implements mpg {
    public static final y3g e = new y3g(9, new npg(0), new gfg(8));
    public final Map a;
    public final x0d b;
    public spg c;
    public final qfg d;

    public ppg(Map map) {
        this.a = map;
        long[] jArr = qrg.a;
        this.b = new x0d();
        this.d = new qfg(this, 3);
    }

    @Override // defpackage.mpg
    public final void b(Object obj, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(533563200);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.g0(obj);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                qfg qfgVar = this.d;
                if (!((Boolean) qfgVar.invoke(obj)).booleanValue()) {
                    ogj.h(lnb.m(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map map = (Map) this.a.get(obj);
                ff5 ff5Var = upg.a;
                vpg vpgVar = new vpg(new tpg(map, qfgVar));
                av8Var.n0(vpgVar);
                O = vpgVar;
            }
            vpg vpgVar2 = (vpg) O;
            tol.c(new gb0[]{upg.a.a(vpgVar2), shb.a.a(vpgVar2)}, tc3Var, av8Var, (i2 & 112) | 8);
            Unit unit = Unit.a;
            boolean i3 = av8Var.i(this) | av8Var.i(obj) | av8Var.i(vpgVar2);
            Object O2 = av8Var.O();
            if (i3 || O2 == a99Var) {
                O2 = new vsc(13, this, obj, vpgVar2);
                av8Var.n0(O2);
            }
            hz8.d(unit, (Function1) O2, av8Var);
            if (av8Var.y && av8Var.G.i == av8Var.z) {
                av8Var.z = -1;
                av8Var.y = false;
            }
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(this, obj, tc3Var, i, 0);
        }
    }

    @Override // defpackage.mpg
    public final void c(Object obj) {
        if (this.b.k(obj) == null) {
            this.a.remove(obj);
        }
    }
}
