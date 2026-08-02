package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ysc implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ dfh c;
    public final /* synthetic */ dtc d;
    public final /* synthetic */ q50 e;
    public final /* synthetic */ ku3 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ xtc h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ uah k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ tc3 p;

    public ysc(long j, Function0 function0, dfh dfhVar, dtc dtcVar, q50 q50Var, ku3 ku3Var, Function1 function1, xtc xtcVar, float f, boolean z, uah uahVar, long j2, long j3, Function2 function2, Function2 function22, tc3 tc3Var) {
        this.a = j;
        this.b = function0;
        this.c = dfhVar;
        this.d = dtcVar;
        this.e = q50Var;
        this.f = ku3Var;
        this.g = function1;
        this.h = xtcVar;
        this.i = f;
        this.j = z;
        this.k = uahVar;
        this.l = j2;
        this.m = j3;
        this.n = function2;
        this.o = function22;
        this.p = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            xtc Y = ml4.Y(bkh.c);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new clc(8);
                av8Var.n0(O);
            }
            xtc a = o3h.a(Y, false, (Function1) O);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a);
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
            dfh dfhVar = this.c;
            boolean z = ((efh) ((ay4) dfhVar.d.e).getValue()) != efh.a;
            this.d.getClass();
            long j = this.a;
            Function0 function0 = this.b;
            ctc.d(j, function0, z, av8Var, 0);
            ctc.c(this.e, this.f, function0, this.g, this.h, dfhVar, this.i, this.j, this.k, this.l, this.m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.n, this.o, this.p, av8Var, 70);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
