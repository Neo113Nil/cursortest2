package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ft3 implements Function2 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ft3(gv9 gv9Var, int i, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z, boolean z2, xtc xtcVar, int i2) {
        this.f = gv9Var;
        this.b = i;
        this.g = function0;
        this.h = function02;
        this.i = function03;
        this.c = function1;
        this.d = z;
        this.e = z2;
        this.j = xtcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x012a, code lost:
    
        if (r5 != false) goto L29;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        boolean z = true;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                tbj tbjVar = (tbj) obj7;
                q5b q5bVar = (q5b) obj6;
                wcj wcjVar = (wcj) obj5;
                nnd nndVar = (nnd) obj4;
                kx4 kx4Var = (kx4) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    lt3 lt3Var = new lt3(q5bVar, this.c, wcjVar, nndVar, kx4Var, this.b);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, utc.a);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, lt3Var, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    av8Var.s(true);
                    p69 a = q5bVar.a();
                    p69 p69Var = p69.a;
                    boolean z2 = this.d;
                    if (a != p69Var && q5bVar.c() != null) {
                        dma c = q5bVar.c();
                        c.getClass();
                        if (c.f()) {
                        }
                    }
                    z = false;
                    l98.E(tbjVar, z, av8Var, 0);
                    if (q5bVar.a() == p69.c && !this.e && z2) {
                        av8Var.d0(-714666198);
                        l98.I(tbjVar, av8Var, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-714589318);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ok3.b((gv9) obj7, this.b, (Function0) obj6, (Function0) obj5, (Function0) obj4, this.c, this.d, this.e, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                v9g.n((gv9) obj7, (gv9) obj6, (r8b) obj5, (bnf) obj4, this.d, (xtc) obj3, this.e, this.c, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                s.m((u) obj7, this.d, (Function0) obj6, (Function0) obj5, this.c, (os8) obj4, this.e, (z88) obj3, (of3) obj, i2 | 1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ft3(gv9 gv9Var, gv9 gv9Var2, r8b r8bVar, bnf bnfVar, boolean z, xtc xtcVar, boolean z2, Function1 function1, int i) {
        this.f = gv9Var;
        this.g = gv9Var2;
        this.h = r8bVar;
        this.i = bnfVar;
        this.d = z;
        this.j = xtcVar;
        this.e = z2;
        this.c = function1;
        this.b = i;
    }

    public /* synthetic */ ft3(tbj tbjVar, q5b q5bVar, boolean z, boolean z2, Function1 function1, wcj wcjVar, nnd nndVar, kx4 kx4Var, int i) {
        this.f = tbjVar;
        this.g = q5bVar;
        this.d = z;
        this.e = z2;
        this.c = function1;
        this.h = wcjVar;
        this.i = nndVar;
        this.j = kx4Var;
        this.b = i;
    }

    public /* synthetic */ ft3(u uVar, boolean z, Function0 function0, Function0 function02, Function1 function1, os8 os8Var, boolean z2, z88 z88Var, int i) {
        this.f = uVar;
        this.d = z;
        this.g = function0;
        this.h = function02;
        this.c = function1;
        this.i = os8Var;
        this.e = z2;
        this.j = z88Var;
        this.b = i;
    }
}
