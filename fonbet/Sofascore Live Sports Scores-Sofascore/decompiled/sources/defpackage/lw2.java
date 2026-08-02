package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lw2 implements ct8 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ lw2(float f, Function0 function0, long j) {
        this.a = f;
        this.b = function0;
        this.c = j;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc xtcVar = (xtc) obj;
        ((Integer) obj3).getClass();
        xtcVar.getClass();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(-2009439670);
        Object O = av8Var.O();
        Object obj4 = nf3.a;
        if (O == obj4) {
            O = e.f(Boolean.FALSE);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        cdi b = a60.b(((Boolean) e1dVar.getValue()).booleanValue() ? this.a : 1.0f, s02.e0(1.0f, 1500.0f, null, 4), null, av8Var, 48, 28);
        Object[] objArr = new Object[0];
        Object O2 = av8Var.O();
        if (O2 == obj4) {
            O2 = new wl2(18);
            av8Var.n0(O2);
        }
        boh bohVar = (boh) o3a.N(objArr, (Function0) O2, av8Var, 48);
        xtc D = f6a.D(xtcVar, ((Number) b.getValue()).floatValue(), ((Number) b.getValue()).floatValue());
        boolean g = av8Var.g(bohVar);
        long j = this.c;
        boolean f = g | av8Var.f(j);
        Function0 function0 = this.b;
        boolean g2 = av8Var.g(function0) | f;
        Object O3 = av8Var.O();
        if (g2 || O3 == obj4) {
            Object pw2Var = new pw2(j, function0, e1dVar, bohVar);
            av8Var.n0(pw2Var);
            O3 = pw2Var;
        }
        xtc a = koi.a(D, function0, (PointerInputEventHandler) O3);
        av8Var.s(false);
        return a;
    }
}
