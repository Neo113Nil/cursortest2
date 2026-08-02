package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jv3 implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jv3(long j, gv9 gv9Var, e1d e1dVar, e1d e1dVar2) {
        this.c = e1dVar;
        this.e = gv9Var;
        this.b = j;
        this.d = e1dVar2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.a;
        utc utcVar = utc.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                e1d e1dVar = (e1d) obj6;
                gv9 gv9Var = (gv9) obj4;
                e1d e1dVar2 = (e1d) obj5;
                of3 of3Var = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                ImageVector N = s6a.N(R.drawable.ic_close, 6, of3Var);
                xtc l = bkh.l(utcVar, 20.0f);
                av8 av8Var = (av8) of3Var;
                boolean g = av8Var.g(e1dVar) | av8Var.g(gv9Var);
                Object O = av8Var.O();
                if (g || O == nf3.a) {
                    O = new mi(16, gv9Var, e1dVar2, e1dVar);
                    av8Var.n0(O);
                }
                kq9.b(N, null, tol.y(l, false, false, false, 0L, null, (Function0) O, av8Var, 31), this.b, av8Var, 48, 0);
                break;
            default:
                cph cphVar = (cph) obj6;
                String str = (String) obj5;
                ImageVector imageVector = (ImageVector) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    l8g a = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    av8Var2.d0(1271190248);
                    av8Var2.s(false);
                    if (str.length() > 0) {
                        av8Var2.d0(1271260835);
                        z = true;
                        z2 = false;
                        udj.c(str, null, 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, cphVar.getTextStyle(), av8Var2, 0, 24960, 109566);
                        av8Var2 = av8Var2;
                        av8Var2.s(false);
                    } else {
                        z = true;
                        z2 = false;
                        av8Var2.d0(1271529512);
                        av8Var2.s(false);
                    }
                    if (imageVector != null) {
                        av8Var2.d0(1271585901);
                        if (str.length() > 0) {
                            av8Var2.d0(1271620528);
                            nq8.h(av8Var2, bkh.p(utcVar, cphVar.a()));
                            av8Var2.s(z2);
                        } else {
                            av8Var2.d0(1271705096);
                            av8Var2.s(z2);
                        }
                        kq9.b(imageVector, null, bkh.l(utcVar, cphVar.c()), this.b, av8Var2, 48, 0);
                        av8Var2.s(z2);
                    } else {
                        av8Var2.d0(1271980872);
                        av8Var2.s(z2);
                    }
                    av8Var2.s(z);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jv3(cph cphVar, long j, String str, ImageVector imageVector) {
        this.c = cphVar;
        this.b = j;
        this.d = str;
        this.e = imageVector;
    }
}
