package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class uo implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;

    public /* synthetic */ uo(int i, gv9 gv9Var) {
        this.a = i;
        this.b = gv9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        int i3 = 3;
        gv9 gv9Var = this.b;
        switch (i) {
            case 0:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                int i4 = 0;
                esaVar.a(gv9Var.size(), null, new xo(gv9Var, i4), new tc3(802480018, new yo(gv9Var, i4), true));
                return Unit.a;
            case 1:
                k91 k91Var = (k91) obj;
                k91Var.getClass();
                gv9Var.getClass();
                k91Var.b = gv9Var;
                k91Var.invalidate();
                return Unit.a;
            case 2:
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esa.e(esaVar2, gv9Var.size(), new uo(i3, gv9Var), null, new tc3(-58759818, new zj1(i2, gv9Var), true), 4);
                return Unit.a;
            case 3:
                int intValue = ((Integer) obj).intValue();
                return intValue + "-" + duf.a.getOrCreateKotlinClass(gv9Var.get(intValue).getClass()).getSimpleName();
            case 4:
                iua iuaVar = (iua) obj;
                rui ruiVar = iuaVar.d;
                return iua.a(iuaVar, null, null, null, ruiVar != null ? rui.a(ruiVar, null, gv9Var, 3) : null, 7);
            case 5:
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                esaVar3.a(gv9Var.size(), new j87(23, new mpa(i3), gv9Var), new xo(gv9Var, 19), new tc3(2039820996, new yo(gv9Var, i3), true));
                return Unit.a;
            case 6:
                r0e r0eVar = (r0e) obj;
                return r0e.a(r0eVar, null, m28.a(r0eVar.b, null, gv9Var, 27), null, null, 13);
            case 7:
                return Integer.valueOf(((g6i) gv9Var.get(((Integer) obj).intValue())).a);
            case 8:
                d2j d2jVar = (d2j) obj;
                d2jVar.getClass();
                return d2j.a(d2jVar, null, gv9Var, 3);
            case 9:
                Pair pair = (Pair) gv9Var.get(((Integer) obj).intValue());
                h4j h4jVar = (h4j) pair.a;
                Integer valueOf = h4jVar != null ? Integer.valueOf(h4jVar.c) : null;
                h4j h4jVar2 = (h4j) pair.b;
                return ljg.m(valueOf, h4jVar2 != null ? Integer.valueOf(h4jVar2.c) : null, "-");
            case 10:
                return ynj.a((ynj) obj, this.b, null, null, false, null, 62);
            case 11:
                cuj cujVar = (cuj) obj;
                cujVar.getClass();
                return cuj.a(cujVar, null, null, false, false, this.b, null, false, 65023);
            default:
                cuj cujVar2 = (cuj) obj;
                cujVar2.getClass();
                return cuj.a(cujVar2, null, null, false, false, this.b, null, false, 65023);
        }
    }
}
