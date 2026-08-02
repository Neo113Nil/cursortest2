package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ov6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ov6(js8 js8Var, long j, long j2, xtc xtcVar, int i) {
        this.e = js8Var;
        this.c = j;
        this.d = j2;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                o1j.c((js8) this.e, this.c, this.d, this.b, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(71);
                bhf.b((ghf) this.e, this.b, this.c, this.d, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ov6(ghf ghfVar, xtc xtcVar, long j, long j2, int i) {
        this.e = ghfVar;
        this.b = xtcVar;
        this.c = j;
        this.d = j2;
    }
}
