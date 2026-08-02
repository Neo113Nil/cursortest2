package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class y1h {
    public final Function2 a;
    public final Function2 b;
    public final Function2 c;
    public final Function2 d;
    public final Function2 e;

    public y1h(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25) {
        this.a = function2;
        this.b = function22;
        this.c = function23;
        this.d = function24;
        this.e = function25;
    }

    public final long a(boolean z, boolean z2, of3 of3Var) {
        if (z) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(135736137);
            long j = ((r13) this.d.invoke(av8Var, 0)).a;
            av8Var.s(false);
            return j;
        }
        if (z2) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(135738945);
            long j2 = ((r13) this.c.invoke(av8Var2, 0)).a;
            av8Var2.s(false);
            return j2;
        }
        av8 av8Var3 = (av8) of3Var;
        av8Var3.d0(135737641);
        long j3 = ((r13) this.e.invoke(av8Var3, 0)).a;
        av8Var3.s(false);
        return j3;
    }
}
