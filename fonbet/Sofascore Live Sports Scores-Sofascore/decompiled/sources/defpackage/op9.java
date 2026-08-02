package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class op9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ op9(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        a99 a99Var = nf3.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fz8.t((pp9) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ww9.m((ysi) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                td4.l((g5i) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 3:
                h0a h0aVar = (h0a) obj4;
                String str = (String) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, h0aVar.l ? ljg.f(av8Var, 1672161023, R.color.live, av8Var, false) : ljg.f(av8Var, 1672161503, R.color.n_lv_1, av8Var, false), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
                } else {
                    av8Var.W();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                fcp.U((f9b) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                yaa.b((InvitedUser) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                gz8.k((InvitedUser) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                i9a.a((bfc) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 8:
                tqa tqaVar = (tqa) obj4;
                sqa sqaVar = (sqa) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    uqa uqaVar = (uqa) tqaVar.b.invoke();
                    int i2 = sqaVar.c;
                    Object obj5 = sqaVar.a;
                    if ((i2 >= uqaVar.getItemCount() || !uqaVar.d(i2).equals(obj5)) && (i2 = uqaVar.c(obj5)) != -1) {
                        sqaVar.c = i2;
                    }
                    int i3 = i2;
                    if (i3 != -1) {
                        av8Var2.d0(-1664741271);
                        aba.h(uqaVar, tqaVar.a, i3, sqaVar.a, av8Var2, 0);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-1664505826);
                        av8Var2.s(false);
                    }
                    boolean i4 = av8Var2.i(sqaVar);
                    Object O = av8Var2.O();
                    if (i4 || O == a99Var) {
                        O = new ida(sqaVar, 6);
                        av8Var2.n0(O);
                    }
                    hz8.d(obj5, (Function1) O, av8Var2);
                } else {
                    av8Var2.W();
                }
                break;
            case 9:
                break;
            case 10:
                tc3 tc3Var = (tc3) obj4;
                ssa ssaVar = (ssa) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    tc3Var.invoke(ssaVar, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            case 11:
                tc3 tc3Var2 = (tc3) obj4;
                vw0 vw0Var = (vw0) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    tc3Var2.invoke(vw0Var, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                s6a.c((lxe) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                i9a.e((lya) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 14:
                b7k b7kVar = (b7k) obj4;
                tc3 tc3Var3 = (tc3) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    vdj.a(b7kVar.i, yqo.H(905505767, av8Var5, new b25(tc3Var3, 5)), av8Var5, 48);
                } else {
                    av8Var5.W();
                }
                break;
            case 15:
                m4c m4cVar = (m4c) obj4;
                n4c n4cVar = (n4c) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    jaa.e(m4cVar, n4cVar.l, av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                jaa.e((m4c) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                jaa.f((l4c) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                x2a.i((mpg) obj4, (tc3) obj3, (of3) obj, aba.K(1));
                break;
            case 19:
                Function0 function0 = (Function0) obj4;
                e1d e1dVar = (e1d) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc b0 = l98.b0(n9e.q(wnn.A(l98.b0(utcVar, 16.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var7), oyn.e), 16.0f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var7, 0);
                    int hashCode = Long.hashCode(av8Var7.T);
                    aee m = av8Var7.m();
                    xtc C = fqj.C(av8Var7, b0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var);
                    } else {
                        av8Var7.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var7, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var7, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var7, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var7, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var7, C, f50Var3);
                    xtc d = bkh.d(utcVar, 1.0f);
                    String v = oea.v(R.string.are_you_sure, av8Var7);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v, d, lz.D(R.color.n_lv_1, av8Var7), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.i(), av8Var7, 48, 24576, 114680);
                    udj.c(bf3.g(8.0f, R.string.reset_notification_settings_body, av8Var7, av8Var7, utcVar), null, lz.D(R.color.n_lv_1, av8Var7), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var7, 0, 0, 131066);
                    xtc f = vxd.f(utcVar, 24.0f, av8Var7, utcVar, 1.0f);
                    l8g a2 = k8g.a(ww9.c, uxf.m, av8Var7, 54);
                    int hashCode2 = Long.hashCode(av8Var7.T);
                    aee m2 = av8Var7.m();
                    xtc C2 = fqj.C(av8Var7, f);
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, a2, f50Var);
                    waa.K(av8Var7, m2, ff3Var);
                    bf3.s(hashCode2, av8Var7, f50Var2, av8Var7, ryVar);
                    waa.K(av8Var7, C2, f50Var3);
                    String v2 = oea.v(R.string.cancel, av8Var7);
                    Object O2 = av8Var7.O();
                    if (O2 == a99Var) {
                        O2 = new tra(8, e1dVar);
                        av8Var7.n0(O2);
                    }
                    mha.h(v2, (Function0) O2, null, gqh.a, null, false, false, false, 0L, 0, 0, av8Var7, 3120, 0, 2036);
                    String f2 = fc6.f(16.0f, R.string.yes_reset_button, av8Var7, av8Var7, utcVar);
                    boolean g = av8Var7.g(function0);
                    Object O3 = av8Var7.O();
                    if (g || O3 == a99Var) {
                        O3 = new u54(2, e1dVar, function0);
                        av8Var7.n0(O3);
                    }
                    mha.h(f2, (Function0) O3, null, null, null, false, false, false, 0L, 0, 0, av8Var7, 0, 0, 2044);
                    av8Var7.s(true);
                    av8Var7.s(true);
                } else {
                    av8Var7.W();
                }
                break;
            case 20:
                xw3.L((ku3) obj4, null, null, new cu6((bfk) obj3, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), null, 2), 3);
                break;
            case 21:
                PlayerData playerData = (PlayerData) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                playerData.getClass();
                int id = playerData.getPlayer().getId();
                Set set = d9b.a;
                break;
            case 22:
                ((Integer) obj2).getClass();
                mha.c((zzd) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                xw3.i((m1e) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                u0a.e((d2e) obj4, (k2f) obj3, (of3) obj, aba.K(391));
                break;
            case 25:
                ((Integer) obj2).getClass();
                td4.E((d2e) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                d2a.d((n2e) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 27:
                csf csfVar = (csf) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                csfVar.a += ((fsa) obj3).b.a(floatValue - csfVar.a);
                break;
            case 28:
                ((Integer) obj2).getClass();
                pea.i((xce) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                qea.g((Team) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ op9(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
