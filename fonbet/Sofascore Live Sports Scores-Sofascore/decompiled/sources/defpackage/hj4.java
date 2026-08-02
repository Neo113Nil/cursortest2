package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hj4 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public hj4(String str, ci4 ci4Var, boolean z, boolean z2) {
        this.d = str;
        this.e = ci4Var;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        utc utcVar = utc.a;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    Function0 function0 = (Function0) obj4;
                    Function0 function02 = (Function0) obj3;
                    l8g a = k8g.a(ww9.b, uxf.l, av8Var, 0);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, utcVar);
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
                    f50 f50Var = hf3.j;
                    if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var);
                    }
                    waa.K(av8Var, C, hf3.d);
                    ImageVector imageVector = v9g.m;
                    if (imageVector == null) {
                        fu9 fu9Var = new fu9("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        km5 km5Var = jmk.a;
                        pvh pvhVar = new pvh(r13.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new ibe(15.41f, 16.59f));
                        arrayList.add(new hbe(10.83f, 12.0f));
                        arrayList.add(new pbe(4.58f, -4.59f));
                        arrayList.add(new hbe(14.0f, 6.0f));
                        arrayList.add(new pbe(-6.0f, 6.0f));
                        arrayList.add(new pbe(6.0f, 6.0f));
                        arrayList.add(new pbe(1.41f, -1.41f));
                        arrayList.add(ebe.c);
                        fu9.a(fu9Var, arrayList, pvhVar);
                        imageVector = fu9Var.b();
                        v9g.m = imageVector;
                    }
                    oj4.h(0, 8, av8Var, null, imageVector, cga.B(R.string.m3c_date_picker_switch_to_previous_month, av8Var), function0, this.b);
                    ImageVector imageVector2 = v9g.n;
                    if (imageVector2 == null) {
                        fu9 fu9Var2 = new fu9("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        km5 km5Var2 = jmk.a;
                        pvh pvhVar2 = new pvh(r13.b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new ibe(8.59f, 16.59f));
                        arrayList2.add(new hbe(13.17f, 12.0f));
                        arrayList2.add(new hbe(8.59f, 7.41f));
                        arrayList2.add(new hbe(10.0f, 6.0f));
                        arrayList2.add(new pbe(6.0f, 6.0f));
                        arrayList2.add(new pbe(-6.0f, 6.0f));
                        arrayList2.add(new pbe(-1.41f, -1.41f));
                        arrayList2.add(ebe.c);
                        fu9.a(fu9Var2, arrayList2, pvhVar2);
                        imageVector2 = fu9Var2.b();
                        v9g.n = imageVector2;
                    }
                    oj4.h(0, 8, av8Var, null, imageVector2, cga.B(R.string.m3c_date_picker_switch_to_next_month, av8Var), function02, this.c);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc d = bkh.d(utcVar, 1.0f);
                    String str = (String) obj4;
                    ci4 ci4Var = (ci4) obj3;
                    k1c c = e12.c(uxf.g, false);
                    int G2 = z8e.G(av8Var2);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, d);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    f50 f50Var2 = hf3.j;
                    if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G2))) {
                        mz1.t(G2, av8Var2, G2, f50Var2);
                    }
                    waa.K(av8Var2, C2, hf3.d);
                    Object O = av8Var2.O();
                    if (O == nf3.a) {
                        O = new bj4(i2);
                        av8Var2.n0(O);
                    }
                    AtomicInteger atomicInteger = o3h.a;
                    udj.c(str, new ew2((Function1) O), ((r13) wih.a(this.c ? ci4Var.j : this.b ? ci4Var.i : ci4Var.g, ufa.I(bwc.c, av8Var2), null, av8Var2, 0, 12).getValue()).a, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, null, av8Var2, 0, 0, 261112);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public hj4(Function0 function0, boolean z, Function0 function02, boolean z2) {
        this.d = function0;
        this.b = z;
        this.e = function02;
        this.c = z2;
    }
}
