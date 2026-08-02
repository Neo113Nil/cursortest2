package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oe7 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tee b;
    public final /* synthetic */ osa c;
    public final /* synthetic */ mei d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ qug h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ e1d k;

    public oe7(int i, tee teeVar, osa osaVar, mei meiVar, boolean z, Function1 function1, Function1 function12, qug qugVar, boolean z2, boolean z3, e1d e1dVar) {
        this.a = i;
        this.b = teeVar;
        this.c = osaVar;
        this.d = meiVar;
        this.e = z;
        this.f = function1;
        this.g = function12;
        this.h = qugVar;
        this.i = z2;
        this.j = z3;
        this.k = e1dVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xpa xpaVar = (xpa) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        xpaVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            int i = this.a;
            Integer valueOf = Integer.valueOf(i - 1);
            tee teeVar = this.b;
            teeVar.containsKey(valueOf);
            teeVar.containsKey(Integer.valueOf(i));
            av8Var.d0(651972855);
            osa osaVar = this.c;
            q67 q67Var = (q67) osaVar.b(i);
            if (q67Var == null) {
                av8Var.d0(651988229);
                av8Var.s(false);
            } else {
                av8Var.d0(651988230);
                xtc a = xpa.a(xpaVar, utc.a, 7);
                int ordinal = this.d.ordinal();
                e1d e1dVar = this.k;
                boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                boolean z = i == osaVar.c() - 1;
                Integer valueOf2 = Integer.valueOf(ordinal);
                Object O = av8Var.O();
                if (O == nf3.a) {
                    O = new mv3(1, e1dVar);
                    av8Var.n0(O);
                }
                ww9.g(q67Var, this.e, a, valueOf2, this.f, this.g, this.h, booleanValue, (Function1) O, true, this.i, this.j, z, av8Var, 805306416, 6, 0);
                av8Var.s(false);
            }
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
