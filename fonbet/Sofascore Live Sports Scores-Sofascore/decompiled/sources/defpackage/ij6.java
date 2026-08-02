package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ij6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ij6(boolean z, dfh dfhVar, String str, String str2, String str3, Function0 function0, ku3 ku3Var) {
        this.a = 2;
        this.b = z;
        this.f = dfhVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.g = function0;
        this.h = ku3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        int i2 = 0;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj7;
                b93 b93Var = (b93) obj3;
                mvh mvhVar = (mvh) obj2;
                b4h b4hVar = (b4h) obj;
                if (str.equals("SecondaryEditable")) {
                    y3h.j(b4hVar, 0);
                    if (!z) {
                        str2 = str3;
                    }
                    a4h a4hVar = w3h.b;
                    KProperty kProperty = y3h.a[0];
                    b4hVar.a(a4hVar, str2);
                    y3h.e(b4hVar, str4);
                } else {
                    y3h.j(b4hVar, 6);
                }
                b4hVar.a(k3h.b, new m9(null, new mi(24, b93Var, str, mvhVar)));
                break;
            case 1:
                bza bzaVar = (bza) obj6;
                Function1 function1 = (Function1) obj4;
                xtc xtcVar = (xtc) obj7;
                ku3 ku3Var = (ku3) obj3;
                ksa ksaVar = (ksa) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                int i3 = 1;
                esa.d(esaVar, "spinner", null, new tc3(-929340075, new a93(3, function1, (gv9) obj5, bzaVar, this.b), true), 2);
                boolean z2 = bzaVar.i;
                if (z2) {
                    esa.d(esaVar, "info_spacer", null, kik.h, 2);
                } else {
                    esa.d(esaVar, "info_banner", null, new tc3(-1241352230, new yya(i2, function1, xtcVar), true), 2);
                }
                esa.d(esaVar, "header", null, new tc3(-850200706, new yya(i3, bzaVar, xtcVar), true), 2);
                gv9 gv9Var = bzaVar.h;
                esaVar.a(gv9Var.size(), new j87(25, new mpa(4), gv9Var), new xo(gv9Var, 21), new tc3(2039820996, new hs3(gv9Var, bzaVar, xtcVar, function1, 5), true));
                if (z2) {
                    esa.d(esaVar, "expandable_info", null, new tc3(-46170941, new zya(i2, ku3Var, ksaVar, xtcVar), true), 2);
                }
                break;
            default:
                dfh dfhVar = (dfh) obj7;
                dx dxVar = dfhVar.d;
                String str5 = (String) obj6;
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                Function0 function0 = (Function0) obj3;
                ku3 ku3Var2 = (ku3) obj2;
                b4h b4hVar2 = (b4h) obj;
                if (z) {
                    ve7 ve7Var = new ve7(23, function0);
                    KProperty[] kPropertyArr = y3h.a;
                    b4hVar2.a(k3h.v, new m9(str5, ve7Var));
                    efh efhVar = (efh) ((eoh) ((e1d) dxVar.c)).getValue();
                    efh efhVar2 = efh.c;
                    int i4 = 15;
                    if (efhVar == efhVar2) {
                        b4hVar2.a(k3h.t, new m9(str6, new l97(15, dfhVar, ku3Var2, dfhVar)));
                    } else if (dxVar.g().a.containsKey(efhVar2)) {
                        b4hVar2.a(k3h.u, new m9(str7, new ixa(i4, dfhVar, ku3Var2)));
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ij6(Object obj, boolean z, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }
}
