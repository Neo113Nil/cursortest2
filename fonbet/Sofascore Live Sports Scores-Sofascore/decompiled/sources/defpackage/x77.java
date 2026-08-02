package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class x77 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x77(int i, int i2, long j, xtc xtcVar, Function1 function1, boolean z) {
        this.d = i;
        this.b = j;
        this.c = z;
        this.e = function1;
        this.f = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Function1 function1 = (Function1) this.e;
                xtc xtcVar = (xtc) this.f;
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                n9e.g(this.d, K, this.b, (of3) obj, xtcVar, function1, this.c);
                break;
            default:
                ((Integer) obj2).intValue();
                q5a.t((agl) this.e, (gv9) this.f, this.b, this.c, (of3) obj, aba.K(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x77(agl aglVar, gv9 gv9Var, long j, boolean z, int i) {
        this.e = aglVar;
        this.f = gv9Var;
        this.b = j;
        this.c = z;
        this.d = i;
    }
}
