package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ti implements ct8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ti(Bitmap bitmap, Integer num, skl sklVar, int i) {
        this.c = bitmap;
        this.d = num;
        this.e = sklVar;
        this.b = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.a;
        int i2 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj6;
                ksa ksaVar = (ksa) obj5;
                Context context = (Context) obj4;
                cj cjVar = (cj) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                cjVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(cjVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    p4h p4hVar = ww9.d;
                    kv1 kv1Var = uxf.o;
                    u23 a = t23.a(p4hVar, kv1Var, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(av8Var, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    xtc x = gz8.x(n9e.q(mha.G(d2a.E(utcVar, 2.0f, null, false, 0L, 30), 10.0f), lz.D(R.color.surface_1, av8Var), oyn.e), null, null, 3);
                    u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, x);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    xtc O = kda.O(bkh.d(utcVar, 1.0f), "market_periods", av8Var);
                    gv9 gv9Var = cjVar.c;
                    gv9 gv9Var2 = cjVar.d;
                    String str2 = cjVar.f;
                    boolean g = av8Var.g(function1);
                    Object O2 = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (g || O2 == a99Var) {
                        O2 = new vi(0, function1);
                        av8Var.n0(O2);
                    }
                    trh.a(gv9Var, str2, (Function1) O2, O, ksaVar, null, null, false, true, false, null, null, av8Var, 100663296, 3808);
                    if (gv9Var2.size() > 1) {
                        av8Var.d0(1105848484);
                        xtc O3 = kda.O(bkh.d(gz8.x(utcVar, null, null, 3), 1.0f), "periods_header", av8Var);
                        gv9 gv9Var3 = cjVar.d;
                        String str3 = cjVar.g;
                        boolean g2 = av8Var.g(function1);
                        Object O4 = av8Var.O();
                        if (g2 || O4 == a99Var) {
                            O4 = new vi(1, function1);
                            av8Var.n0(O4);
                        }
                        l4a.a(gv9Var3, str3, (Function1) O4, O3, null, false, av8Var, 0, 48);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1106422759);
                        xtc O5 = kda.O(l98.e0(utcVar, 16.0f, 22.0f, 16.0f, 8.0f), "periods_header", av8Var);
                        s1h s1hVar = (s1h) CollectionsKt.firstOrNull(gv9Var2);
                        if (s1hVar == null || (str = s1hVar.b) == null) {
                            str = "";
                        }
                        String str4 = str;
                        yf8 yf8Var = xth.a;
                        udj.c(str4, O5, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    gv9 gv9Var4 = cjVar.a;
                    Object O6 = av8Var.O();
                    if (O6 == a99Var) {
                        O6 = new ia(5);
                        av8Var.n0(O6);
                    }
                    l98.b(gv9Var4, null, (Function1) O6, null, null, null, yqo.H(1653466848, av8Var, new wi(i2, cjVar, context)), av8Var, 1573248, 58);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                skl sklVar = (skl) obj4;
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((w23) obj).getClass();
                bea.k((Bitmap) obj6, (Integer) obj5, null, of3Var2, 0);
                if (sklVar != null) {
                    av8 av8Var2 = (av8) of3Var2;
                    av8Var2.d0(-679531442);
                    bea.h(sklVar, w23.a(), av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(-679379077);
                    aba.i(w23.a(), av8Var3, 0);
                    av8Var3.s(false);
                }
                bea.i(i2, null, of3Var2, 0);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ti(Function1 function1, ksa ksaVar, int i, Context context) {
        this.c = function1;
        this.d = ksaVar;
        this.b = i;
        this.e = context;
    }
}
