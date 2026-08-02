package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zi4 implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ci4 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public zi4(String str, ci4 ci4Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = ci4Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            xtc j = bkh.j(pj4.e, pj4.c);
            k1c c = e12.c(uxf.g, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, j);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new q73(29);
                av8Var.n0(O);
            }
            AtomicInteger atomicInteger = o3h.a;
            ew2 ew2Var = new ew2((Function1) O);
            ci4 ci4Var = this.b;
            long j2 = ci4Var.o;
            boolean z = this.d;
            boolean z2 = this.e;
            if (z && z2) {
                j2 = ci4Var.p;
            } else if (z && !z2) {
                j2 = ci4Var.q;
            } else if (this.c && z2) {
                j2 = ci4Var.t;
            } else if (z2) {
                j2 = ci4Var.n;
            }
            long j3 = j2;
            av8Var.d0(-969417610);
            cdi a = wih.a(j3, ufa.I(bwc.c, av8Var), null, av8Var, 0, 12);
            av8Var.s(false);
            udj.c(this.a, ew2Var, ((r13) a.getValue()).a, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, null, av8Var, 0, 0, 261112);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
