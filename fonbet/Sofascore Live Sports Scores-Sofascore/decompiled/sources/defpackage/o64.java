package defpackage;

import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.results.R;
import com.sofascore.results.crowdsourcing.CrowdsourcingStatusDescriptionModal;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class o64 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l64 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CrowdsourcingStatusDescriptionModal d;

    public /* synthetic */ o64(l64 l64Var, boolean z, CrowdsourcingStatusDescriptionModal crowdsourcingStatusDescriptionModal, int i) {
        this.a = i;
        this.b = l64Var;
        this.c = z;
        this.d = crowdsourcingStatusDescriptionModal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        CrowdsourcingStatusDescriptionModal crowdsourcingStatusDescriptionModal = this.d;
        l64 l64Var = this.b;
        switch (i) {
            case 0:
                boolean z = false;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                int i2 = 1;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, z)) {
                    haa.f(yqo.H(-862231241, av8Var, new o64(l64Var, this.c, crowdsourcingStatusDescriptionModal, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    p4h p4hVar = ww9.d;
                    kv1 kv1Var = uxf.o;
                    u23 a = t23.a(p4hVar, kv1Var, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(av8Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    nq8.h(av8Var2, n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 1.0f), lz.D(R.color.n_lv_4, av8Var2), oyn.e));
                    xtc b0 = l98.b0(utcVar, 16.0f);
                    u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    av8Var2.d0(-526584158);
                    boolean z2 = this.c;
                    Iterator it = j34.d(l64Var, z2).iterator();
                    while (it.hasNext()) {
                        un0.e((SuggestStatus) it.next(), l64Var == l64.b, z2, true, av8Var2, 3072);
                        nq8.h(av8Var2, bkh.e(utcVar, 24.0f));
                    }
                    av8Var2.s(false);
                    xtc q = n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 36.0f), lz.D(R.color.crowdsourcing, av8Var2), o7g.a(4.0f));
                    boolean i3 = av8Var2.i(crowdsourcingStatusDescriptionModal);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        O = new h63(crowdsourcingStatusDescriptionModal, 10);
                        av8Var2.n0(O);
                    }
                    xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var2, 31);
                    k1c c = e12.c(uxf.g, false);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, y);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m3, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C3, hf3.d);
                    String upperCase = oea.v(R.string.button_text_got_it, av8Var2).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    yf8 yf8Var = xth.a;
                    udj.c(upperCase, null, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.a(), av8Var2, 0, 0, 131066);
                    ljg.t(av8Var2, true, true, true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
