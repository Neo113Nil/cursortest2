package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q8b implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q8b(ku3 ku3Var, float f, o0h o0hVar, trg trgVar) {
        this.c = ku3Var;
        this.b = f;
        this.d = o0hVar;
        this.e = trgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        q8b q8bVar = this;
        int i = q8bVar.a;
        Object obj3 = q8bVar.e;
        Object obj4 = q8bVar.d;
        Object obj5 = q8bVar.c;
        switch (i) {
            case 0:
                boolean z = true;
                xtc xtcVar = (xtc) obj5;
                List list = (List) obj4;
                ema emaVar = (ema) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z2 = false;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    kg0 kg0Var = ww9.g;
                    lv1 lv1Var = uxf.l;
                    xtc d = bkh.d(xtcVar, 1.0f);
                    int i2 = 54;
                    l8g a = k8g.a(kg0Var, lv1Var, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    av8Var.d0(1710078424);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Player player = (Player) it.next();
                        kv1 kv1Var = uxf.p;
                        kg0 kg0Var2 = ww9.f;
                        float f = q8bVar.b;
                        utc utcVar = utc.a;
                        xtc p = bkh.p(utcVar, 1.5f * f);
                        u23 a2 = t23.a(kg0Var2, kv1Var, av8Var, i2);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, p);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var, a2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var, C2, f50Var3);
                        xtc l = bkh.l(utcVar, f);
                        k1c c = e12.c(uxf.g, z2);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, l);
                        av8Var.h0();
                        Iterator it2 = it;
                        if (av8Var.S) {
                            av8Var.l(zg3Var2);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C3, f50Var3);
                        td4.C(player.getId(), bkh.c, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
                        Team team = player.getTeam();
                        Integer valueOf2 = team != null ? Integer.valueOf(team.getId()) : null;
                        if (valueOf2 == null) {
                            av8Var.d0(919211358);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(919211359);
                            td4.G(valueOf2.intValue(), n12.a.a(bkh.l(utcVar, f * 0.4f), uxf.i), false, 0L, av8Var, 0, 12);
                            Unit unit = Unit.a;
                            av8Var.s(false);
                        }
                        z = true;
                        bf3.t(av8Var, true, utcVar, 4.0f, av8Var);
                        tol.b(dh3.n.a(emaVar), yqo.H(223364659, av8Var, new faa(player, 14)), av8Var, 56);
                        av8Var.s(true);
                        q8bVar = this;
                        it = it2;
                        i2 = 54;
                        z2 = false;
                    }
                    av8Var.s(z2);
                    av8Var.s(z);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                u6h.B((String) obj4, q8bVar.b, (Float) obj3, (xtc) obj5, (of3) obj, aba.K(1));
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                xw3.L((ku3) obj5, null, null, new b7d(floatValue, q8bVar.b, (o0h) obj4, (trg) obj3, null), 3);
                break;
            default:
                ((Integer) obj2).getClass();
                j72.n((ysd) obj5, (qpa) obj4, q8bVar.b, (Function1) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ q8b(xtc xtcVar, List list, float f, ema emaVar) {
        this.c = xtcVar;
        this.d = list;
        this.b = f;
        this.e = emaVar;
    }

    public /* synthetic */ q8b(ysd ysdVar, qpa qpaVar, float f, Function1 function1, int i) {
        this.c = ysdVar;
        this.d = qpaVar;
        this.b = f;
        this.e = function1;
    }

    public /* synthetic */ q8b(String str, float f, Float f2, xtc xtcVar, int i) {
        this.d = str;
        this.b = f;
        this.e = f2;
        this.c = xtcVar;
    }
}
