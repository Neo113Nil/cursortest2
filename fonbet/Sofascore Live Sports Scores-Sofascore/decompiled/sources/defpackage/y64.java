package defpackage;

import java.time.LocalTime;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class y64 implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y64(long j, Function1 function1, e1d e1dVar) {
        this.c = j;
        this.b = function1;
        this.d = e1dVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        long j = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj5;
                e1d e1dVar = (e1d) obj4;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                av8 av8Var = (av8) ((of3) obj2);
                boolean g = av8Var.g(function1);
                long j2 = this.c;
                boolean f = av8Var.f(j2) | g;
                Object O = av8Var.O();
                if (f || O == a99Var) {
                    pz1 pz1Var = new pz1(function1, j2, e1dVar, 2);
                    av8Var.n0(pz1Var);
                    O = pz1Var;
                }
                o02.j(j2, (Function1) O, av8Var, 0);
                return Unit.a;
            case 1:
                LocalTime localTime = (LocalTime) obj4;
                Function1 function12 = (Function1) obj5;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                int hour = localTime.getHour();
                int minute = localTime.getMinute();
                av8 av8Var2 = (av8) ((of3) obj2);
                boolean g2 = av8Var2.g(function12) | av8Var2.f(j);
                Object O2 = av8Var2.O();
                if (g2 || O2 == a99Var) {
                    O2 = new v64(j, function12);
                    av8Var2.n0(O2);
                }
                o02.E(hour, minute, (Function2) O2, av8Var2, 0);
                return Unit.a;
            default:
                kx4 kx4Var = (kx4) obj5;
                m1c m1cVar = (m1c) obj;
                g1c g1cVar = (g1c) obj2;
                m1cVar.getClass();
                g1cVar.getClass();
                long f2 = yaa.f(kx4Var.H0(njh.f(j)), kx4Var.H0(njh.d(j)));
                long e = ((op3) obj4).e(f2, yaa.f(an3.h(r14.a), an3.g(r14.a)));
                long j3 = ((an3) obj3).a;
                float f3 = njh.f(f2);
                int i2 = mrg.a;
                qhe J = g1cVar.J(an3.a(j3, 0, wzb.b(Float.intBitsToFloat((int) (e >> 32)) * f3), 0, wzb.b(Float.intBitsToFloat((int) (4294967295L & e)) * njh.d(f2)), 5));
                return m1c.G0(m1cVar, J.a, J.b, new b3(J, 6));
        }
    }

    public /* synthetic */ y64(kx4 kx4Var, op3 op3Var, long j) {
        this.b = kx4Var;
        this.d = op3Var;
        this.c = j;
    }

    public /* synthetic */ y64(LocalTime localTime, Function1 function1, long j) {
        this.d = localTime;
        this.b = function1;
        this.c = j;
    }
}
