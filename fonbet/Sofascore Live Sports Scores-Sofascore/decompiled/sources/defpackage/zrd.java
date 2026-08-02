package defpackage;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zrd implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ zrd(int i, int i2, Function0 function0) {
        this.a = i2;
        this.b = i;
        this.c = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Function0 function0 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xtc) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    fsd.d(i2, function0, av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xtc) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    fsd.e(i2, function0, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            default:
                xtc xtcVar = (xtc) obj;
                ((Integer) obj3).getClass();
                xtcVar.getClass();
                av8 av8Var3 = (av8) ((of3) obj2);
                av8Var3.d0(558379869);
                u6b u6bVar = (u6b) av8Var3.k(mhb.a);
                kx4 kx4Var = (kx4) av8Var3.k(dh3.h);
                Object obj4 = (View) av8Var3.k(nz.f);
                Object O = av8Var3.O();
                Object obj5 = nf3.a;
                if (O == obj5) {
                    O = e.d(0L);
                    av8Var3.n0(O);
                }
                boh bohVar = (boh) O;
                Object O2 = av8Var3.O();
                if (O2 == obj5) {
                    O2 = e.f(Boolean.FALSE);
                    av8Var3.n0(O2);
                }
                e1d e1dVar = (e1d) O2;
                Object O3 = av8Var3.O();
                if (O3 == obj5) {
                    O3 = e.f(null);
                    av8Var3.n0(O3);
                }
                e1d e1dVar2 = (e1d) O3;
                av8Var3.d0(-267846893);
                int e0 = kx4Var.e0(((Configuration) av8Var3.k(nz.a)).screenHeightDp);
                av8Var3.s(false);
                boolean i3 = av8Var3.i(u6bVar) | av8Var3.g(null);
                int i4 = this.b;
                boolean e = i3 | av8Var3.e(i4) | av8Var3.e(e0);
                Function0 function02 = this.c;
                boolean g = av8Var3.g(function02) | e;
                Object O4 = av8Var3.O();
                if (g || O4 == obj5) {
                    Object jj4Var = new jj4(u6bVar, i4, function02, bohVar, e1dVar2, e0, e1dVar);
                    av8Var3.n0(jj4Var);
                    O4 = jj4Var;
                }
                hz8.d(u6bVar, (Function1) O4, av8Var3);
                boolean i5 = av8Var3.i(obj4);
                Object O5 = av8Var3.O();
                if (i5 || O5 == obj5) {
                    O5 = new ncj(10, obj4, e1dVar, e1dVar2);
                    av8Var3.n0(O5);
                }
                xtc A = un0.A(xtcVar, (Function1) O5);
                av8Var3.s(false);
                return A;
        }
    }
}
